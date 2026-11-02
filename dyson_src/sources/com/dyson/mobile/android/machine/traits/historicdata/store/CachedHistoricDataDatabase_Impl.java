package com.dyson.mobile.android.machine.traits.historicdata.store;

import androidx.room.c;
import e22.d;
import ew0.k;
import fl0.f;
import h12.m;
import h12.t;
import i12.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import qa.d0;
import x12.p0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/store/CachedHistoricDataDatabase_Impl;", "Lcom/dyson/mobile/android/machine/traits/historicdata/store/CachedHistoricDataDatabase;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CachedHistoricDataDatabase_Impl extends CachedHistoricDataDatabase {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f15327p = 0;

    /* renamed from: o  reason: collision with root package name */
    public final t f15328o = m.b(new k(this, 11));

    @Override // qa.w
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // qa.w
    public final c e() {
        return new c(this, new LinkedHashMap(), new LinkedHashMap(), "historic_data_to_upload", "last_uploaded_historic_data_record_for_log");
    }

    @Override // qa.w
    public final d0 f() {
        return new fl0.c(this);
    }

    @Override // qa.w
    public final Set<d<Object>> n() {
        return new LinkedHashSet();
    }

    @Override // qa.w
    public final LinkedHashMap p() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d b13 = p0.f86717a.b(f.class);
        a.d.getClass();
        linkedHashMap.put(b13, e0.d);
        return linkedHashMap;
    }

    @Override // com.dyson.mobile.android.machine.traits.historicdata.store.CachedHistoricDataDatabase
    public final f y() {
        return (f) this.f15328o.getValue();
    }
}
