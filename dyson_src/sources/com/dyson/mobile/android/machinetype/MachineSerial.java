package com.dyson.mobile.android.machinetype;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineSerial;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineSerial implements Parcelable {
    public static final Parcelable.Creator<MachineSerial> CREATOR = new a();
    public final String d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MachineSerial> {
        @Override // android.os.Parcelable.Creator
        public final MachineSerial createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MachineSerial(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MachineSerial[] newArray(int i13) {
            return new MachineSerial[i13];
        }
    }

    public MachineSerial(String str) {
        str.getClass();
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MachineSerial) && this.d.equals(((MachineSerial) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return f.e("MachineSerial(value=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
    }
}
