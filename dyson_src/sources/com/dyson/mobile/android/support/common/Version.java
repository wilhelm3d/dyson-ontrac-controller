package com.dyson.mobile.android.support.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import h12.y;
import kotlin.Metadata;
import ma.e;
import qv1.s;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/support/common/Version;", "Landroid/os/Parcelable;", "", "itemId", "menuHeading", "name", "range", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "getItemId", "()Ljava/lang/String;", "e", "getMenuHeading", "f", "getName", "g", "getRange", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Version implements Parcelable {
    public static final Parcelable.Creator<Version> CREATOR = new a();
    @SerializedName("itemId")
    private final String d;
    @SerializedName("menuHeading")
    private final String e;
    @SerializedName("name")

    /* renamed from: f  reason: collision with root package name */
    private final String f16812f;
    @SerializedName("range")

    /* renamed from: g  reason: collision with root package name */
    private final String f16813g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Version> {
        @Override // android.os.Parcelable.Creator
        public final Version createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Version(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Version[] newArray(int i13) {
            return new Version[i13];
        }
    }

    public Version(String str, String str2, String str3, String str4) {
        s.p(str, str2, str3, str4);
        this.d = str;
        this.e = str2;
        this.f16812f = str3;
        this.f16813g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Version) {
            Version version = (Version) obj;
            return r.c(this.d, version.d) && r.c(this.e, version.e) && r.c(this.f16812f, version.f16812f) && r.c(this.f16813g, version.f16813g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16813g.hashCode() + y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f16812f);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        return jy1.a.f(e.m("Version(itemId=", str, ", menuHeading=", str2, ", name="), this.f16812f, ", range=", this.f16813g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16812f);
        parcel.writeString(this.f16813g);
    }
}
