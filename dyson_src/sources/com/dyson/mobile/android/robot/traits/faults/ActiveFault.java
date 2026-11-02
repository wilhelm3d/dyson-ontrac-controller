package com.dyson.mobile.android.robot.traits.faults;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import u41.j;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/traits/faults/ActiveFault;", "Lcom/dyson/mobile/android/robot/traits/faults/RobotFault;", "Lcom/dyson/mobile/android/robot/traits/faults/FaultCode;", "faultCode", "Lu41/j;", "nextActionRequired", "<init>", "(Lcom/dyson/mobile/android/robot/traits/faults/FaultCode;Lu41/j;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActiveFault implements RobotFault {
    public static final Parcelable.Creator<ActiveFault> CREATOR = new a();
    public final FaultCode d;
    public final j e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ActiveFault> {
        @Override // android.os.Parcelable.Creator
        public final ActiveFault createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ActiveFault(FaultCode.CREATOR.createFromParcel(parcel), j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActiveFault[] newArray(int i13) {
            return new ActiveFault[i13];
        }
    }

    public ActiveFault(FaultCode faultCode, j jVar) {
        faultCode.getClass();
        jVar.getClass();
        this.d = faultCode;
        this.e = jVar;
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
        if (obj instanceof ActiveFault) {
            ActiveFault activeFault = (ActiveFault) obj;
            return this.d.equals(activeFault.d) && this.e == activeFault.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.d.hashCode() * 31);
    }

    public final String toString() {
        return "ActiveFault(faultCode=" + this.d + ", nextActionRequired=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d.d);
        parcel.writeString(this.e.name());
    }
}
