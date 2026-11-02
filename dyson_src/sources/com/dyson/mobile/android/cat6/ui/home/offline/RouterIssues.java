package com.dyson.mobile.android.cat6.ui.home.offline;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/offline/RouterIssues;", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItem;", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RouterIssues extends OfflineTroubleshootingItem {

    /* renamed from: h  reason: collision with root package name */
    public static final RouterIssues f12870h = new RouterIssues();
    public static final Parcelable.Creator<RouterIssues> CREATOR = new a();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<RouterIssues> {
        @Override // android.os.Parcelable.Creator
        public final RouterIssues createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return RouterIssues.f12870h;
        }

        @Override // android.os.Parcelable.Creator
        public final RouterIssues[] newArray(int i13) {
            return new RouterIssues[i13];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private RouterIssues() {
        /*
            r7 = this;
            com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.i0.f71678he
            com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItemDetail r0 = new com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItemDetail
            com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.i0.f71740le
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = 4
            r6 = 0
            r3 = 0
            java.lang.String r4 = "router_issues"
            r2 = r0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.cat6.ui.home.offline.RouterIssues.<init>():void");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RouterIssues);
    }

    public final int hashCode() {
        return 317631108;
    }

    public final String toString() {
        return "RouterIssues";
    }

    @Override // com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
