package com.dyson.mobile.android.connectionjourney.applink;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import kotlin.Metadata;
import ma.e;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/applink/DevicePairingParameters;", "Landroid/os/Parcelable;", "", "serial", "authCode", "randomNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DevicePairingParameters implements Parcelable {
    public static final Parcelable.Creator<DevicePairingParameters> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13272f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DevicePairingParameters> {
        @Override // android.os.Parcelable.Creator
        public final DevicePairingParameters createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DevicePairingParameters(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DevicePairingParameters[] newArray(int i13) {
            return new DevicePairingParameters[i13];
        }
    }

    public DevicePairingParameters(String str, String str2, String str3) {
        d72.a.v(str, str2, str3);
        this.d = str;
        this.e = str2;
        this.f13272f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DevicePairingParameters) {
            DevicePairingParameters devicePairingParameters = (DevicePairingParameters) obj;
            return this.d.equals(devicePairingParameters.d) && this.e.equals(devicePairingParameters.e) && this.f13272f.equals(devicePairingParameters.f13272f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13272f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return ie.a.h(e.m("DevicePairingParameters(serial=", this.d, ", authCode=", this.e, ", randomNumber="), this.f13272f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f13272f);
    }
}
