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
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryAuthenticity$Genuine", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination;", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat6/ui/home/navigation/OverviewDestination$BatteryAuthenticity$Genuine;", "serializer", "()Lt42/b;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public final class OverviewDestination$BatteryAuthenticity$Genuine extends OverviewDestination {
    public static final OverviewDestination$BatteryAuthenticity$Genuine INSTANCE = new OverviewDestination$BatteryAuthenticity$Genuine();
    public static final Parcelable.Creator<OverviewDestination$BatteryAuthenticity$Genuine> CREATOR = new a();
    public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new e(6));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<OverviewDestination$BatteryAuthenticity$Genuine> {
        @Override // android.os.Parcelable.Creator
        public final OverviewDestination$BatteryAuthenticity$Genuine createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return OverviewDestination$BatteryAuthenticity$Genuine.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final OverviewDestination$BatteryAuthenticity$Genuine[] newArray(int i13) {
            return new OverviewDestination$BatteryAuthenticity$Genuine[i13];
        }
    }

    private OverviewDestination$BatteryAuthenticity$Genuine() {
        super(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OverviewDestination$BatteryAuthenticity$Genuine);
    }

    public final int hashCode() {
        return 1710234318;
    }

    public final b<OverviewDestination$BatteryAuthenticity$Genuine> serializer() {
        return d.getValue();
    }

    public final String toString() {
        return "Genuine";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
