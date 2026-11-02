package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/DoNotDisturbDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "DoNotDisturb", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/DoNotDisturbDestination$DoNotDisturb;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DoNotDisturbDestination implements RobotDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/DoNotDisturbDestination$DoNotDisturb;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/DoNotDisturbDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class DoNotDisturb extends DoNotDisturbDestination {
        public static final DoNotDisturb INSTANCE = new DoNotDisturb();
        public static final Parcelable.Creator<DoNotDisturb> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(9));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<DoNotDisturb> {
            @Override // android.os.Parcelable.Creator
            public final DoNotDisturb createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return DoNotDisturb.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final DoNotDisturb[] newArray(int i13) {
                return new DoNotDisturb[i13];
            }
        }

        private DoNotDisturb() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoNotDisturb);
        }

        public final int hashCode() {
            return -831174408;
        }

        public final b<DoNotDisturb> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "DoNotDisturb";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ DoNotDisturbDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DoNotDisturbDestination() {
    }
}
