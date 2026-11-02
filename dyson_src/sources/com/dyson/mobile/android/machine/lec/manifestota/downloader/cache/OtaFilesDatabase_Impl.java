package com.dyson.mobile.android.machine.lec.manifestota.downloader.cache;

import androidx.room.c;
import h12.m;
import h12.t;
import i12.e0;
import ih0.b;
import ih0.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import qa.d0;
import x12.p0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/lec/manifestota/downloader/cache/OtaFilesDatabase_Impl;", "Lcom/dyson/mobile/android/machine/lec/manifestota/downloader/cache/OtaFilesDatabase;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtaFilesDatabase_Impl extends OtaFilesDatabase {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f15101p = 0;

    /* renamed from: o  reason: collision with root package name */
    public final t f15102o = m.b(new ia0.a(this, 5));

    @Override // qa.w
    public final List d(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // qa.w
    public final c e() {
        return new c(this, new LinkedHashMap(), new LinkedHashMap(), "ota_file_cache");
    }

    @Override // qa.w
    public final d0 f() {
        return new d(this);
    }

    @Override // qa.w
    public final Set<e22.d<Object>> n() {
        return new LinkedHashSet();
    }

    @Override // qa.w
    public final LinkedHashMap p() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e22.d b13 = p0.f86717a.b(b.class);
        a.d.getClass();
        linkedHashMap.put(b13, e0.d);
        return linkedHashMap;
    }

    @Override // com.dyson.mobile.android.machine.lec.manifestota.downloader.cache.OtaFilesDatabase
    public final b y() {
        return (b) this.f15102o.getValue();
    }
}
