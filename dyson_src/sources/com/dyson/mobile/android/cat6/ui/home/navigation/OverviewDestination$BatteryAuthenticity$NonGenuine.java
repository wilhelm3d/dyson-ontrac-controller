package com.dyson.mobile.android.cat6.ui.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import pr.e;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryAuthenticity$NonGenuine", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination;", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryAuthenticity$NonGenuine;", "serializer", "()Lt42/b;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public final class OverviewDestination$BatteryAuthenticity$NonGenuine extends OverviewDestination {
    public static final OverviewDestination$BatteryAuthenticity$NonGenuine INSTANCE = new OverviewDestination$BatteryAuthenticity$NonGenuine();
    public static final Parcelable.Creator<OverviewDestination$BatteryAuthenticity$NonGenuine> CREATOR = new a();
    public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new e(7));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<OverviewDestination$BatteryAuthenticity$NonGenuine> {
        @Override // android.os.Parcelable.Creator
        public final OverviewDestination$BatteryAuthenticity$NonGenuine createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return OverviewDestination$BatteryAuthenticity$NonGenuine.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final OverviewDestination$BatteryAuthenticity$NonGenuine[] newArray(int i13) {
            return new OverviewDestination$BatteryAuthenticity$NonGenuine[i13];
        }
    }

    private OverviewDestination$BatteryAuthenticity$NonGenuine() {
        super(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OverviewDestination$BatteryAuthenticity$NonGenuine);
    }

    public final int hashCode() {
        return -1866166789;
    }

    public final b<OverviewDestination$BatteryAuthenticity$NonGenuine> serializer() {
        return d.getValue();
    }

    public final String toString() {
        return "NonGenuine";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
