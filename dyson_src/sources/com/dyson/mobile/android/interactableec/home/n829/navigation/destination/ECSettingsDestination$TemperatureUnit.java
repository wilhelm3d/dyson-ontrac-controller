package com.dyson.mobile.android.interactableec.home.n829.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/dyson/mobile/android/interactableec/home/n829/navigation/destination/ECSettingsDestination$TemperatureUnit", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/interactableec/home/n829/navigation/destination/ECSettingsDestination$TemperatureUnit;", "serializer", "()Lt42/b;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public final class ECSettingsDestination$TemperatureUnit implements ECDestination {
    public static final ECSettingsDestination$TemperatureUnit INSTANCE = new ECSettingsDestination$TemperatureUnit();
    public static final Parcelable.Creator<ECSettingsDestination$TemperatureUnit> CREATOR = new a();
    public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new x30.a(14));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ECSettingsDestination$TemperatureUnit> {
        @Override // android.os.Parcelable.Creator
        public final ECSettingsDestination$TemperatureUnit createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return ECSettingsDestination$TemperatureUnit.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final ECSettingsDestination$TemperatureUnit[] newArray(int i13) {
            return new ECSettingsDestination$TemperatureUnit[i13];
        }
    }

    private ECSettingsDestination$TemperatureUnit() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ECSettingsDestination$TemperatureUnit);
    }

    public final int hashCode() {
        return 2059544990;
    }

    public final b<ECSettingsDestination$TemperatureUnit> serializer() {
        return d.getValue();
    }

    public final String toString() {
        return "TemperatureUnit";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
