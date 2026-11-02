package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotRemoveMachineDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes3.dex */
public final class RobotRemoveMachineDestination implements RobotDestination {
    public static final RobotRemoveMachineDestination INSTANCE = new RobotRemoveMachineDestination();
    public static final Parcelable.Creator<RobotRemoveMachineDestination> CREATOR = new a();
    public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(26));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RobotRemoveMachineDestination> {
        @Override // android.os.Parcelable.Creator
        public final RobotRemoveMachineDestination createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return RobotRemoveMachineDestination.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final RobotRemoveMachineDestination[] newArray(int i13) {
            return new RobotRemoveMachineDestination[i13];
        }
    }

    private RobotRemoveMachineDestination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RobotRemoveMachineDestination);
    }

    public final int hashCode() {
        return -1066253813;
    }

    public final b<RobotRemoveMachineDestination> serializer() {
        return d.getValue();
    }

    public final String toString() {
        return "RobotRemoveMachineDestination";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
