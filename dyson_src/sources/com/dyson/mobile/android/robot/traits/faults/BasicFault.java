package com.dyson.mobile.android.robot.traits.faults;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import u41.e;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/traits/faults/BasicFault;", "Lcom/dyson/mobile/android/robot/traits/faults/RobotFault;", "Lcom/dyson/mobile/android/robot/traits/faults/FaultCode;", "faultCode", "Lu41/e;", "faultCategory", "<init>", "(Lcom/dyson/mobile/android/robot/traits/faults/FaultCode;Lu41/e;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasicFault implements RobotFault {
    public static final Parcelable.Creator<BasicFault> CREATOR = new a();
    public final FaultCode d;
    public final e e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<BasicFault> {
        @Override // android.os.Parcelable.Creator
        public final BasicFault createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BasicFault(FaultCode.CREATOR.createFromParcel(parcel), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BasicFault[] newArray(int i13) {
            return new BasicFault[i13];
        }
    }

    public BasicFault(FaultCode faultCode, e eVar) {
        faultCode.getClass();
        eVar.getClass();
        this.d = faultCode;
        this.e = eVar;
    }

    @Override // com.dyson.mobile.android.robot.traits.faults.RobotFault
    public final FaultCode N() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BasicFault) {
            BasicFault basicFault = (BasicFault) obj;
            return this.d.equals(basicFault.d) && this.e == basicFault.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.d.hashCode() * 31);
    }

    public final String toString() {
        return "BasicFault(faultCode=" + this.d + ", faultCategory=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d.d);
        parcel.writeString(this.e.name());
    }
}
