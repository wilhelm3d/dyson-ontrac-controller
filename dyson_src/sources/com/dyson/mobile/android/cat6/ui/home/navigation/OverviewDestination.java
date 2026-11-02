package com.dyson.mobile.android.cat6.ui.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pr.e;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/ConnectedFloorcareDestination;", "<init>", "()V", "BatteryManagement", "BatteryCareLearnMore", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryAuthenticity$Genuine;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryAuthenticity$NonGenuine;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryCareLearnMore;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryManagement;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OverviewDestination implements ConnectedFloorcareDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryCareLearnMore;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BatteryCareLearnMore extends OverviewDestination {
        public static final BatteryCareLearnMore INSTANCE = new BatteryCareLearnMore();
        public static final Parcelable.Creator<BatteryCareLearnMore> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new e(8));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BatteryCareLearnMore> {
            @Override // android.os.Parcelable.Creator
            public final BatteryCareLearnMore createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BatteryCareLearnMore.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BatteryCareLearnMore[] newArray(int i13) {
                return new BatteryCareLearnMore[i13];
            }
        }

        private BatteryCareLearnMore() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BatteryCareLearnMore);
        }

        public final int hashCode() {
            return 1307966808;
        }

        public final b<BatteryCareLearnMore> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BatteryCareLearnMore";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryManagement;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BatteryManagement extends OverviewDestination {
        public static final BatteryManagement INSTANCE = new BatteryManagement();
        public static final Parcelable.Creator<BatteryManagement> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new e(9));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BatteryManagement> {
            @Override // android.os.Parcelable.Creator
            public final BatteryManagement createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BatteryManagement.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BatteryManagement[] newArray(int i13) {
                return new BatteryManagement[i13];
            }
        }

        private BatteryManagement() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BatteryManagement);
        }

        public final int hashCode() {
            return 1644043411;
        }

        public final b<BatteryManagement> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BatteryManagement";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ OverviewDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OverviewDestination() {
    }
}
