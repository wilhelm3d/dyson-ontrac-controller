package com.dyson.mobile.android.usermanagement.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireActivityPayload;", "Landroid/os/Parcelable;", "", "machineSerial", "Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireStartInfo;", "questionnaireStartInfo", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireStartInfo;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionnaireActivityPayload implements Parcelable {
    public static final Parcelable.Creator<QuestionnaireActivityPayload> CREATOR = new a();
    public final String d;
    public final QuestionnaireStartInfo e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<QuestionnaireActivityPayload> {
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireActivityPayload createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new QuestionnaireActivityPayload(parcel.readString(), QuestionnaireStartInfo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionnaireActivityPayload[] newArray(int i13) {
            return new QuestionnaireActivityPayload[i13];
        }
    }

    public QuestionnaireActivityPayload(String str, QuestionnaireStartInfo questionnaireStartInfo) {
        questionnaireStartInfo.getClass();
        this.d = str;
        this.e = questionnaireStartInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuestionnaireActivityPayload) {
            QuestionnaireActivityPayload questionnaireActivityPayload = (QuestionnaireActivityPayload) obj;
            return r.c(this.d, questionnaireActivityPayload.d) && r.c(this.e, questionnaireActivityPayload.e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return this.e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "QuestionnaireActivityPayload(machineSerial=" + this.d + ", questionnaireStartInfo=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        this.e.writeToParcel(parcel, i13);
    }

    public /* synthetic */ QuestionnaireActivityPayload(String str, QuestionnaireStartInfo questionnaireStartInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, questionnaireStartInfo);
    }
}
