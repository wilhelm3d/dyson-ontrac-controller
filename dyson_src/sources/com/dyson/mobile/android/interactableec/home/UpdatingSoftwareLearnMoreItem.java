package com.dyson.mobile.android.interactableec.home;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem;
import com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItemDetail;
import i12.t;
import kotlin.Metadata;
import rf0.b0;
import rf0.e0;
import rf0.f;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/UpdatingSoftwareLearnMoreItem;", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItem;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatingSoftwareLearnMoreItem extends OfflineTroubleshootingItem {

    /* renamed from: h  reason: collision with root package name */
    public static final UpdatingSoftwareLearnMoreItem f14431h = new UpdatingSoftwareLearnMoreItem();

    private UpdatingSoftwareLearnMoreItem() {
        super(f.f71357v6, new OfflineTroubleshootingItemDetail(e0.f71150a, b0.Y0, t.h(Integer.valueOf((int) R.drawable.ic_ec_offline_updating_white), Integer.valueOf((int) R.drawable.ic_ec_offline_updating_gray))), false, "software_update", 4, null);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UpdatingSoftwareLearnMoreItem);
    }

    public final int hashCode() {
        return 193168419;
    }

    public final String toString() {
        return "UpdatingSoftwareLearnMoreItem";
    }
}
