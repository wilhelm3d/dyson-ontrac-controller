package com.dyson.mobile.android.usermanagement.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;", "Landroid/os/Parcelable;", "", "questionId", "", "choiceIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuizAnswers implements Parcelable {
    public static final Parcelable.Creator<QuizAnswers> CREATOR = new a();
    public final String d;
    public final List<String> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<QuizAnswers> {
        @Override // android.os.Parcelable.Creator
        public final QuizAnswers createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new QuizAnswers(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final QuizAnswers[] newArray(int i13) {
            return new QuizAnswers[i13];
        }
    }

    public QuizAnswers(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? e0.d : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuizAnswers) {
            QuizAnswers quizAnswers = (QuizAnswers) obj;
            return r.c(this.d, quizAnswers.d) && r.c(this.e, quizAnswers.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return y1.k("QuizAnswers(questionId=", this.d, ", choiceIds=", ")", this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
    }

    public QuizAnswers(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.d = str;
        this.e = list;
    }

    public QuizAnswers() {
        this(null, null, 3, null);
    }
}
