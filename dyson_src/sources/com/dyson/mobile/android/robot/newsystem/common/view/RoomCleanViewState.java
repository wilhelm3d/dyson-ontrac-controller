package com.dyson.mobile.android.robot.newsystem.common.view;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/view/RoomCleanViewState;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/robot/newsystem/common/view/Map;", "map", "", "Lcom/dyson/mobile/android/robot/newsystem/common/view/Zone;", "zones", "<init>", "(Lcom/dyson/mobile/android/robot/newsystem/common/view/Map;Ljava/util/List;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoomCleanViewState implements Parcelable {
    public static final Parcelable.Creator<RoomCleanViewState> CREATOR = new a();
    public final Map d;
    public final List<Zone> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RoomCleanViewState> {
        @Override // android.os.Parcelable.Creator
        public final RoomCleanViewState createFromParcel(Parcel parcel) {
            parcel.getClass();
            Map createFromParcel = Map.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(Zone.CREATOR, parcel, arrayList, i13, 1);
            }
            return new RoomCleanViewState(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RoomCleanViewState[] newArray(int i13) {
            return new RoomCleanViewState[i13];
        }
    }

    public RoomCleanViewState(Map map, List<Zone> list) {
        map.getClass();
        list.getClass();
        this.d = map;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoomCleanViewState) {
            RoomCleanViewState roomCleanViewState = (RoomCleanViewState) obj;
            return this.d.equals(roomCleanViewState.d) && this.e.equals(roomCleanViewState.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "RoomCleanViewState(map=" + this.d + ", zones=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        this.d.writeToParcel(parcel, i13);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            ((Zone) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
