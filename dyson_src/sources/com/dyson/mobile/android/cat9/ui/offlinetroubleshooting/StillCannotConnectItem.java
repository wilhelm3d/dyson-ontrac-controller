package com.dyson.mobile.android.cat9.ui.offlinetroubleshooting;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem;
import kotlin.Metadata;
import rf0.b0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat9/ui/offlinetroubleshooting/StillCannotConnectItem;", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItem;", "<init>", "()V", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StillCannotConnectItem extends OfflineTroubleshootingItem {

    /* renamed from: h  reason: collision with root package name */
    public static final StillCannotConnectItem f12930h = new StillCannotConnectItem();
    public static final Parcelable.Creator<StillCannotConnectItem> CREATOR = new a();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<StillCannotConnectItem> {
        @Override // android.os.Parcelable.Creator
        public final StillCannotConnectItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return StillCannotConnectItem.f12930h;
        }

        @Override // android.os.Parcelable.Creator
        public final StillCannotConnectItem[] newArray(int i13) {
            return new StillCannotConnectItem[i13];
        }
    }

    private StillCannotConnectItem() {
        super(b0.f71031y0, null, true, null, 10, null);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StillCannotConnectItem);
    }

    public final int hashCode() {
        return -767524051;
    }

    public final String toString() {
        return "StillCannotConnectItem";
    }

    @Override // com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
