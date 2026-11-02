package com.dyson.mobile.android.machine.response.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import h12.y;
import kotlin.Metadata;
import ma.e;
import v80.c;
import x12.r;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/dyson/mobile/android/machine/response/settings/Permission;", "Landroid/os/Parcelable;", "", "id", "title", "description", "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "d", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "e", "l", "f", "i", "g", "Z", "j", "()Z", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Permission implements Parcelable {
    public static final Parcelable.Creator<Permission> CREATOR = new a();
    @SerializedName("id")
    private final String d;
    @SerializedName("title")
    private final String e;
    @SerializedName("description")

    /* renamed from: f  reason: collision with root package name */
    private final String f15313f;
    @SerializedName("enabled")

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15314g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Permission> {
        @Override // android.os.Parcelable.Creator
        public final Permission createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Permission(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Permission[] newArray(int i13) {
            return new Permission[i13];
        }
    }

    public Permission(String str, String str2, String str3, boolean z13) {
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = str2;
        this.f15313f = str3;
        this.f15314g = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Permission) {
            Permission permission = (Permission) obj;
            return r.c(this.d, permission.d) && r.c(this.e, permission.e) && r.c(this.f15313f, permission.f15313f) && this.f15314g == permission.f15314g;
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f15313f;
        return Boolean.hashCode(this.f15314g) + ((c13 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String i() {
        return this.f15313f;
    }

    public final boolean j() {
        return this.f15314g;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.e;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        return c.d(e.m("Permission(id=", str, ", title=", str2, ", description="), this.f15313f, ", enabled=", this.f15314g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f15313f);
        parcel.writeInt(this.f15314g ? 1 : 0);
    }
}
