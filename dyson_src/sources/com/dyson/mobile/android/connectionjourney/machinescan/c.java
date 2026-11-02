package com.dyson.mobile.android.connectionjourney.machinescan;

import b42.m;
import cg0.j;
import cg0.p;
import cg0.r;
import com.dyson.mobile.android.connectionjourney.machinescan.MachineScanRoute;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.connectivity.MachineScanRecord;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import dz1.w;
import h12.f0;
import h12.y;
import hj.e;
import i12.e0;
import i12.x;
import im1.zb;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import m9.u;
import m9.v;
import mj.q;
import qv1.s;
import rf0.i0;
import rz1.o;
import rz1.q0;
import s2.m0;
import sz1.i;
import t20.t;
import tk0.g;
import u3.k1;
import u3.k3;
import u3.y2;
import u50.k;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\"#$%&B\u0085\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c;", "Lm9/u;", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "dataStore", "Lu50/k;", "machineScanRecordFactory", "Lv20/b;", "webRegisteredMachinesProvider", "Lt20/f;", "machineScanFilterer", "Ly60/b;", "machinePrefixMetadataProvider", "Lx50/c;", "bluetoothManager", "Ltk0/g;", "machineSupport", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Lb70/g;", "networkConnectivityObserver", "Lcg0/p;", "machineImagePreloader", "", "_accessToken", "Lcg0/j;", "machineAssetStateProvider", "Lz32/c0;", "coroutineScope", "Lcom/dyson/mobile/android/connectionjourney/machinescan/a;", "filterCriteria", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lu50/k;Lv20/b;Lt20/f;Ly60/b;Lx50/c;Ltk0/g;Lhj/e;Lpf0/c;Lb70/g;Lcg0/p;Ljava/lang/String;Lcg0/j;Lz32/c0;Lcom/dyson/mobile/android/connectionjourney/machinescan/a;)V", "b", "c", "e", "d", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends u {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f13553y = 0;
    public final ConnectionJourneyDataStore d;
    public final k e;

    /* renamed from: f  reason: collision with root package name */
    public final v20.b f13554f;

    /* renamed from: g  reason: collision with root package name */
    public final t20.f f13555g;

    /* renamed from: h  reason: collision with root package name */
    public final y60.b f13556h;

    /* renamed from: i  reason: collision with root package name */
    public final x50.c f13557i;

    /* renamed from: j  reason: collision with root package name */
    public final g f13558j;

    /* renamed from: k  reason: collision with root package name */
    public final hj.e f13559k;

    /* renamed from: l  reason: collision with root package name */
    public final pf0.c f13560l;

    /* renamed from: m  reason: collision with root package name */
    public final b70.g f13561m;

    /* renamed from: n  reason: collision with root package name */
    public final p f13562n;

    /* renamed from: o  reason: collision with root package name */
    public final j f13563o;

    /* renamed from: p  reason: collision with root package name */
    public final c0 f13564p;

    /* renamed from: q  reason: collision with root package name */
    public final com.dyson.mobile.android.connectionjourney.machinescan.a f13565q;

    /* renamed from: r  reason: collision with root package name */
    public final gz1.b f13566r;

    /* renamed from: s  reason: collision with root package name */
    public final xf1.a<AbstractC0427c> f13567s;

    /* renamed from: t  reason: collision with root package name */
    public final k1<e> f13568t;

    /* renamed from: u  reason: collision with root package name */
    public final k3<e> f13569u;

    /* renamed from: v  reason: collision with root package name */
    public final String f13570v;

    /* renamed from: w  reason: collision with root package name */
    public final b42.c f13571w;

    /* renamed from: x  reason: collision with root package name */
    public final c42.e f13572x;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface b {
        c a(com.dyson.mobile.android.connectionjourney.machinescan.a aVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$d;", "", "Lcom/dyson/mobile/android/connectivity/MachineScanRecord;", "machineScanRecord", "Lcg0/r;", "machineImage", "", "accessibilityDescription", "productName", "<init>", "(Lcom/dyson/mobile/android/connectivity/MachineScanRecord;Lcg0/r;Ljava/lang/String;Ljava/lang/String;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final MachineScanRecord f13579a;

        /* renamed from: b  reason: collision with root package name */
        public final r f13580b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13581c;
        public final String d;

        public d(MachineScanRecord machineScanRecord, r rVar, String str, String str2) {
            machineScanRecord.getClass();
            rVar.getClass();
            str.getClass();
            str2.getClass();
            this.f13579a = machineScanRecord;
            this.f13580b = rVar;
            this.f13581c = str;
            this.d = str2;
        }

        public static d a(d dVar, r rVar) {
            MachineScanRecord machineScanRecord = dVar.f13579a;
            String str = dVar.f13581c;
            String str2 = dVar.d;
            dVar.getClass();
            rVar.getClass();
            return new d(machineScanRecord, rVar, str, str2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f13579a.equals(dVar.f13579a) && this.f13580b.equals(dVar.f13580b) && this.f13581c.equals(dVar.f13581c) && this.d.equals(dVar.d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + y.c((this.f13580b.hashCode() + (this.f13579a.hashCode() * 31)) * 31, 31, this.f13581c);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MachineScanItemData(machineScanRecord=");
            sb2.append(this.f13579a);
            sb2.append(", machineImage=");
            sb2.append(this.f13580b);
            sb2.append(", accessibilityDescription=");
            return jy1.a.f(sb2, this.f13581c, ", productName=", this.d, ")");
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class f extends x12.p implements Function1<List<MachineScanRecord>, f0> {
        public f(Object obj) {
            super(1, obj, c.class, "handleLocalMachineScanRecords", "handleLocalMachineScanRecords(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(List<MachineScanRecord> list) {
            List<MachineScanRecord> list2 = list;
            list2.getClass();
            c cVar = (c) this.receiver;
            k1<e> k1Var = cVar.f13568t;
            pf0.c cVar2 = cVar.f13560l;
            if (!list2.isEmpty()) {
                x.r(list2, new dg0.p(new m0(26), 9));
                g0.r(cVar.f13564p, null, null, new t(list2, cVar, null), 3);
                y2 y2Var = (y2) k1Var;
                e eVar = (e) y2Var.getValue();
                List<d> list3 = ((e) y2Var.getValue()).d;
                ArrayList arrayList = new ArrayList(i12.u.o(list2, 10));
                for (MachineScanRecord machineScanRecord : list2) {
                    String productName = machineScanRecord.i().getProductName();
                    if (productName.length() == 0) {
                        com.dyson.mobile.android.machinetype.b b13 = cVar.f13556h.b(new MachineSerial(machineScanRecord.j()));
                        productName = b13 != null ? b13.f15578m : null;
                        if (productName == null) {
                            productName = "";
                        }
                    }
                    arrayList.add(new d(machineScanRecord, r.c.f11149a, if1.g.a(cVar2.d(i0.Q2), productName), productName));
                }
                ArrayList h03 = i12.c0.h0(arrayList, list3);
                int size = ((e) ((y2) cVar.f13569u).getValue()).d.size();
                y2Var.setValue(e.a(eVar, false, false, h03, null, if1.g.a(cVar2.b(size, i0.P2), pf0.f.c(i0.M2), Integer.valueOf(size)), null, 215));
                cVar.Z(q.a.NEARBY, String.valueOf(list2.size()));
                g0.r(v.a(cVar), null, null, new t20.r(list2, cVar, null), 3);
            }
            return f0.f36844a;
        }
    }

    static {
        new a(null);
    }

    public c(ConnectionJourneyDataStore connectionJourneyDataStore, k kVar, v20.b bVar, t20.f fVar, y60.b bVar2, x50.c cVar, g gVar, hj.e eVar, pf0.c cVar2, b70.g gVar2, p pVar, String str, j jVar, c0 c0Var, com.dyson.mobile.android.connectionjourney.machinescan.a aVar) {
        connectionJourneyDataStore.getClass();
        kVar.getClass();
        bVar.getClass();
        fVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        gVar.getClass();
        eVar.getClass();
        cVar2.getClass();
        gVar2.getClass();
        pVar.getClass();
        str.getClass();
        jVar.getClass();
        c0Var.getClass();
        aVar.getClass();
        this.d = connectionJourneyDataStore;
        this.e = kVar;
        this.f13554f = bVar;
        this.f13555g = fVar;
        this.f13556h = bVar2;
        this.f13557i = cVar;
        this.f13558j = gVar;
        this.f13559k = eVar;
        this.f13560l = cVar2;
        this.f13561m = gVar2;
        this.f13562n = pVar;
        this.f13563o = jVar;
        this.f13564p = c0Var;
        this.f13565q = aVar;
        gz1.b bVar3 = new gz1.b();
        this.f13566r = bVar3;
        this.f13567s = new xf1.a<>();
        k1<e> j8 = androidx.compose.runtime.d.j(new e(false, false, false, null, null, null, null, false, 255, null));
        this.f13568t = j8;
        this.f13569u = j8;
        this.f13570v = str;
        b42.c b13 = m.b(0, null, null, 7);
        this.f13571w = b13;
        this.f13572x = c42.r.B(b13);
        if (!gVar2.c()) {
            ((y2) j8).setValue(new e(false, false, false, null, null, null, null, false, 127, null));
            return;
        }
        U();
        bVar3.e();
        bVar3.a(bVar2.a().z(c02.a.f10004c).r(fz1.a.a()).o(new so0.e(new t20.p(this, 0), 11)).m(new so0.e(new sb0.e(17), 12)).s().w(new t20.q(this, 2)));
    }

    public final void S() {
        y2 y2Var = (y2) this.f13569u;
        boolean z13 = ((e) y2Var.getValue()).d.isEmpty() && !((e) y2Var.getValue()).f13583b;
        if (z13) {
            y2 y2Var2 = (y2) this.f13568t;
            e eVar = (e) y2Var2.getValue();
            LocalisationKey localisationKey = i0.M2;
            pf0.c cVar = this.f13560l;
            y2Var2.setValue(e.a(eVar, false, false, null, null, s.i(cVar.d(localisationKey), ", ", cVar.d(i0.N2)), null, 222));
        }
        if (z13 && ((e) y2Var.getValue()).e.isEmpty() && !((e) y2Var.getValue()).f13584c) {
            q0 D = dz1.r.D(f0.f36844a);
            w wVar = c02.a.f10003b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kz1.b.a(timeUnit, "unit is null");
            kz1.b.a(wVar, "scheduler is null");
            zb.z(this.f13566r, new o(D, 3000L, timeUnit, wVar, false).S(c02.a.f10004c).H(fz1.a.a()).O(new so0.e(new t20.p(this, 2), 10)));
        }
    }

    public final void T() {
        sz1.v j8 = this.f13554f.b().r(c02.a.f10004c).j(fz1.a.a());
        so0.e eVar = new so0.e(new t20.p(this, 1), 8);
        b.a aVar = kz1.b.f50218a;
        zb.z(this.f13566r, new sz1.g(new i(new sz1.k(j8, eVar), new so0.e(new sb0.e(16), 9)), new t20.q(this, 1)).n());
    }

    public final void U() {
        e eVar = new e(false, false, false, null, null, null, null, false, 255, null);
        y2 y2Var = (y2) this.f13568t;
        y2Var.setValue(eVar);
        if (this.f13565q.f13552f.isEmpty()) {
            y2Var.setValue(e.a((e) y2Var.getValue(), false, true, null, null, null, null, 251));
        } else {
            y2Var.setValue(e.a((e) y2Var.getValue(), false, false, null, null, null, null, 251));
        }
    }

    public final void V() {
        if (!this.f13561m.c()) {
            ((y2) this.f13568t).setValue(new e(false, false, false, null, null, null, null, false, 127, null));
        } else if (!this.f13557i.b()) {
            af1.g.a(this.f13571w, v.a(this), MachineScanRoute.EnableBluetooth.INSTANCE);
        } else {
            U();
            this.f13566r.e();
            if (this.f13565q.f13552f.isEmpty()) {
                T();
            }
            W();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W() {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.machinescan.c.W():void");
    }

    public final void X(MachineScanRecord machineScanRecord, String str, c50.c cVar) {
        MachineDescriptor f13;
        cVar.b(str);
        ConnectionJourneyDataStore connectionJourneyDataStore = this.d;
        connectionJourneyDataStore.s(cVar);
        com.dyson.mobile.android.machinetype.b b13 = this.f13556h.b(new MachineSerial(machineScanRecord.j()));
        connectionJourneyDataStore.f13891c.putString("CONNECTION_JOURNEY_MACHINE_MQTT_ROOT_TOPIC_LEVEL", b13 != null ? b13.c() : null);
        if (b13 == null || (f13 = b13.f()) == null) {
            return;
        }
        connectionJourneyDataStore.t(f13);
    }

    public final void Z(q.a aVar, String str) {
        q qVar = new q(aVar, str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(i12.q0.f(new h12.p("scan_type", qVar.f54229a.getValue()), new h12.p("quantity", qVar.f54230b)));
        ij.f fVar = new ij.f("machines_found", linkedHashMap);
        e.a aVar2 = hj.e.f38312g;
        this.f13559k.g(fVar, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$a;", "", "<init>", "()V", "", "DEFAULT_SCAN_TIMEOUT_SECS", "J", "DEFAULT_BUFFER_TIME_SPAN_MS", "NO_MACHINE_FOUND_DELAY_MS", "", "SCREEN_STATE_ERROR", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "", "<init>", "()V", "e", "c", "b", "a", "d", "f", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$a;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$b;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$c;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$d;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$e;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$f;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0427c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$a;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC0427c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13573a = new a();

            private a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$b;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0427c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f13574a = new b();

            private b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$c;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "Lcom/dyson/mobile/android/connectivity/MachineScanRecord;", "machineScanRecord", "<init>", "(Lcom/dyson/mobile/android/connectivity/MachineScanRecord;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0428c extends AbstractC0427c {

            /* renamed from: a  reason: collision with root package name */
            public final MachineScanRecord f13575a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0428c(MachineScanRecord machineScanRecord) {
                super(null);
                machineScanRecord.getClass();
                this.f13575a = machineScanRecord;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$d;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c$d */
        /* loaded from: classes2.dex */
        public static final class d extends AbstractC0427c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f13576a = new d();

            private d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$e;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c$e */
        /* loaded from: classes2.dex */
        public static final class e extends AbstractC0427c {

            /* renamed from: a  reason: collision with root package name */
            public static final e f13577a = new e();

            private e() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c$f;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$c;", "", "isInternetConnected", "<init>", "(Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.c$c$f */
        /* loaded from: classes2.dex */
        public static final class f extends AbstractC0427c {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f13578a;

            public f(boolean z13) {
                super(null);
                this.f13578a = z13;
            }
        }

        public /* synthetic */ AbstractC0427c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0427c() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/c$e;", "", "", "nearbyMachinesNotFound", "localMachineScanningInProgress", "webRegisteredMachineFetchingInProgress", "", "Lcom/dyson/mobile/android/connectionjourney/machinescan/c$d;", "localMachines", "webRegisteredMachines", "", "localMachinesHeaderAccessibilityDescription", "webRegisteredMachinesHeaderAccessibilityDescription", "isInternetConnected", "<init>", "(ZZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13582a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13583b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13584c;
        public final List<d> d;
        public final List<d> e;

        /* renamed from: f  reason: collision with root package name */
        public final String f13585f;

        /* renamed from: g  reason: collision with root package name */
        public final String f13586g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f13587h;

        public e(boolean z13, boolean z14, boolean z15, List list, List list2, String str, String str2, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14, (i13 & 4) != 0 ? false : z15, (i13 & 8) != 0 ? e0.d : list, (i13 & 16) != 0 ? e0.d : list2, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? "" : str2, (i13 & 128) != 0 ? true : z16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List<com.dyson.mobile.android.connectionjourney.machinescan.c$d>] */
        /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List<com.dyson.mobile.android.connectionjourney.machinescan.c$d>] */
        public static e a(e eVar, boolean z13, boolean z14, ArrayList arrayList, ArrayList arrayList2, String str, String str2, int i13) {
            boolean z15 = (i13 & 1) != 0 ? eVar.f13582a : true;
            if ((i13 & 2) != 0) {
                z13 = eVar.f13583b;
            }
            boolean z16 = z13;
            if ((i13 & 4) != 0) {
                z14 = eVar.f13584c;
            }
            boolean z17 = z14;
            ArrayList arrayList3 = arrayList;
            if ((i13 & 8) != 0) {
                arrayList3 = eVar.d;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = arrayList2;
            if ((i13 & 16) != 0) {
                arrayList5 = eVar.e;
            }
            ArrayList arrayList6 = arrayList5;
            if ((i13 & 32) != 0) {
                str = eVar.f13585f;
            }
            String str3 = str;
            String str4 = (i13 & 64) != 0 ? eVar.f13586g : str2;
            boolean z18 = eVar.f13587h;
            eVar.getClass();
            arrayList4.getClass();
            arrayList6.getClass();
            str3.getClass();
            str4.getClass();
            return new e(z15, z16, z17, arrayList4, arrayList6, str3, str4, z18);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f13582a == eVar.f13582a && this.f13583b == eVar.f13583b && this.f13584c == eVar.f13584c && x12.r.c(this.d, eVar.d) && x12.r.c(this.e, eVar.e) && x12.r.c(this.f13585f, eVar.f13585f) && x12.r.c(this.f13586g, eVar.f13586g) && this.f13587h == eVar.f13587h;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13587h) + y.c(y.c(tq1.a.h(tq1.a.h(y9.w.c(y9.w.c(Boolean.hashCode(this.f13582a) * 31, 31, this.f13583b), 31, this.f13584c), 31, this.d), 31, this.e), 31, this.f13585f), 31, this.f13586g);
        }

        public final String toString() {
            StringBuilder i13 = x1.i.i("MachineScanUIState(nearbyMachinesNotFound=", ", localMachineScanningInProgress=", ", webRegisteredMachineFetchingInProgress=", this.f13582a, this.f13583b);
            i13.append(this.f13584c);
            i13.append(", localMachines=");
            i13.append(this.d);
            i13.append(", webRegisteredMachines=");
            i13.append(this.e);
            i13.append(", localMachinesHeaderAccessibilityDescription=");
            i13.append(this.f13585f);
            i13.append(", webRegisteredMachinesHeaderAccessibilityDescription=");
            return v80.c.d(i13, this.f13586g, ", isInternetConnected=", this.f13587h, ")");
        }

        public e() {
            this(false, false, false, null, null, null, null, false, 255, null);
        }

        public e(boolean z13, boolean z14, boolean z15, List<d> list, List<d> list2, String str, String str2, boolean z16) {
            list.getClass();
            list2.getClass();
            str.getClass();
            str2.getClass();
            this.f13582a = z13;
            this.f13583b = z14;
            this.f13584c = z15;
            this.d = list;
            this.e = list2;
            this.f13585f = str;
            this.f13586g = str2;
            this.f13587h = z16;
        }
    }
}
