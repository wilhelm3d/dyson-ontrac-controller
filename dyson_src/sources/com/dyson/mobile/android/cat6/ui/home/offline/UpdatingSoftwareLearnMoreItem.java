package com.dyson.mobile.android.cat6.ui.home.offline;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/offline/UpdatingSoftwareLearnMoreItem;", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItem;", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatingSoftwareLearnMoreItem extends OfflineTroubleshootingItem {

    /* renamed from: h  reason: collision with root package name */
    public static final UpdatingSoftwareLearnMoreItem f12872h = new UpdatingSoftwareLearnMoreItem();
    public static final Parcelable.Creator<UpdatingSoftwareLearnMoreItem> CREATOR = new a();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<UpdatingSoftwareLearnMoreItem> {
        @Override // android.os.Parcelable.Creator
        public final UpdatingSoftwareLearnMoreItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return UpdatingSoftwareLearnMoreItem.f12872h;
        }

        @Override // android.os.Parcelable.Creator
        public final UpdatingSoftwareLearnMoreItem[] newArray(int i13) {
            return new UpdatingSoftwareLearnMoreItem[i13];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private UpdatingSoftwareLearnMoreItem() {
        /*
            r7 = this;
            com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.i0.f71772ne
            com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItemDetail r2 = new com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItemDetail
            com.dyson.mobile.android.localisation.LocalisationKey r0 = rf0.i0.f71694ie
            i12.e0 r3 = i12.e0.d
            r2.<init>(r1, r0, r3)
            r5 = 4
            r6 = 0
            r3 = 0
            java.lang.String r4 = "software_update"
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.cat6.ui.home.offline.UpdatingSoftwareLearnMoreItem.<init>():void");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UpdatingSoftwareLearnMoreItem);
    }

    public final int hashCode() {
        return -882244770;
    }

    public final String toString() {
        return "UpdatingSoftwareLearnMoreItem";
    }

    @Override // com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
