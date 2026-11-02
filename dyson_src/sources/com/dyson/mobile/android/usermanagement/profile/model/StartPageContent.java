package com.dyson.mobile.android.usermanagement.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import qv1.s;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/model/StartPageContent;", "Landroid/os/Parcelable;", "", "pageTitle", "header", "description", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StartPageContent implements Parcelable {
    public static final Parcelable.Creator<StartPageContent> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17001f;

    /* renamed from: g  reason: collision with root package name */
    public final String f17002g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<StartPageContent> {
        @Override // android.os.Parcelable.Creator
        public final StartPageContent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StartPageContent(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StartPageContent[] newArray(int i13) {
            return new StartPageContent[i13];
        }
    }

    public StartPageContent(String str, String str2, String str3, String str4) {
        s.p(str, str2, str3, str4);
        this.d = str;
        this.e = str2;
        this.f17001f = str3;
        this.f17002g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartPageContent) {
            StartPageContent startPageContent = (StartPageContent) obj;
            return r.c(this.d, startPageContent.d) && r.c(this.e, startPageContent.e) && r.c(this.f17001f, startPageContent.f17001f) && r.c(this.f17002g, startPageContent.f17002g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17002g.hashCode() + y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f17001f);
    }

    public final String toString() {
        return jy1.a.f(e.m("StartPageContent(pageTitle=", this.d, ", header=", this.e, ", description="), this.f17001f, ", button=", this.f17002g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f17001f);
        parcel.writeString(this.f17002g);
    }

    public /* synthetic */ StartPageContent(String str, String str2, String str3, String str4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, str2, str3, str4);
    }
}
