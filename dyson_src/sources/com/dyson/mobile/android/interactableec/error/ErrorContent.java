package com.dyson.mobile.android.interactableec.error;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/error/ErrorContent;", "Landroid/os/Parcelable;", "", "title", "subtitle", "ctaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorContent implements Parcelable {
    public static final Parcelable.Creator<ErrorContent> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14428f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ErrorContent> {
        @Override // android.os.Parcelable.Creator
        public final ErrorContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ErrorContent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ErrorContent[] newArray(int i13) {
            return new ErrorContent[i13];
        }
    }

    public ErrorContent(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = str2;
        this.f14428f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorContent) {
            ErrorContent errorContent = (ErrorContent) obj;
            return this.d.equals(errorContent.d) && this.e.equals(errorContent.e) && r.c(this.f14428f, errorContent.f14428f);
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f14428f;
        return c13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ie.a.h(e.m("ErrorContent(title=", this.d, ", subtitle=", this.e, ", ctaLabel="), this.f14428f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f14428f);
    }
}
