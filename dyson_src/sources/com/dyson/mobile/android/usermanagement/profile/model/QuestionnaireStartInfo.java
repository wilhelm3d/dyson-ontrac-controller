package com.dyson.mobile.android.usermanagement.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireStartInfo;", "Landroid/os/Parcelable;", "", "category", "Lcom/dyson/mobile/android/usermanagement/profile/model/StartPageContent;", "startPageContent", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/usermanagement/profile/model/StartPageContent;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionnaireStartInfo implements Parcelable {
    public static final Parcelable.Creator<QuestionnaireStartInfo> CREATOR = new a();
    public final String d;
    public final StartPageContent e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<QuestionnaireStartInfo> {
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireStartInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new QuestionnaireStartInfo(parcel.readString(), parcel.readInt() == 0 ? null : StartPageContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final QuestionnaireStartInfo[] newArray(int i13) {
            return new QuestionnaireStartInfo[i13];
        }
    }

    public /* synthetic */ QuestionnaireStartInfo(String str, StartPageContent startPageContent, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "UNKNOWN_CATEGORY" : str, (i13 & 2) != 0 ? null : startPageContent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuestionnaireStartInfo) {
            QuestionnaireStartInfo questionnaireStartInfo = (QuestionnaireStartInfo) obj;
            return r.c(this.d, questionnaireStartInfo.d) && r.c(this.e, questionnaireStartInfo.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        StartPageContent startPageContent = this.e;
        return hashCode + (startPageContent == null ? 0 : startPageContent.hashCode());
    }

    public final String toString() {
        return "QuestionnaireStartInfo(category=" + this.d + ", startPageContent=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        StartPageContent startPageContent = this.e;
        if (startPageContent == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        startPageContent.writeToParcel(parcel, i13);
    }

    public QuestionnaireStartInfo(String str, StartPageContent startPageContent) {
        str.getClass();
        this.d = str;
        this.e = startPageContent;
    }

    public QuestionnaireStartInfo() {
        this(null, null, 3, null);
    }
}
