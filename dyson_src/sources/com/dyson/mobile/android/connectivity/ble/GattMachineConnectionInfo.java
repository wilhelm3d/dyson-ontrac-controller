package com.dyson.mobile.android.connectivity.ble;

import android.os.Parcel;
import android.os.Parcelable;
import u50.i;
/* loaded from: classes2.dex */
public class GattMachineConnectionInfo implements i, Parcelable {
    public static final Parcelable.Creator<GattMachineConnectionInfo> CREATOR = new a();
    public String d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f13964f;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<GattMachineConnectionInfo> {
        @Override // android.os.Parcelable.Creator
        public final GattMachineConnectionInfo createFromParcel(Parcel parcel) {
            return new GattMachineConnectionInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GattMachineConnectionInfo[] newArray(int i13) {
            return new GattMachineConnectionInfo[i13];
        }
    }

    public GattMachineConnectionInfo(Parcel parcel) {
        this.f13964f = false;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f13964f = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // u50.i
    public final boolean i() {
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GattConnectionInfo{mMachineId='");
        sb2.append(this.d);
        sb2.append("', mMacAddress=");
        sb2.append(this.e);
        sb2.append(", mAutoConnect=");
        return pa.c.h(sb2, this.f13964f, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f13964f ? (byte) 1 : (byte) 0);
    }

    public GattMachineConnectionInfo() {
        this.f13964f = false;
    }
}
