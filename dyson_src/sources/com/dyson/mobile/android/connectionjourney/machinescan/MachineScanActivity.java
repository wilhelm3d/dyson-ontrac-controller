package com.dyson.mobile.android.connectionjourney.machinescan;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectionjourney.machinescan.MachineScanRoute;
import com.dyson.mobile.android.connectionjourney.machinescan.c;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.connectivity.MachineScanRecord;
import com.dyson.mobile.android.connectivity.ble.BleScanningRecord;
import com.dyson.mobile.android.connectivity.wifi.mdnsscanner.MdnsScanningRecord;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f.q;
import f.x;
import h12.f0;
import h12.m;
import h12.r;
import h12.t;
import hj.e;
import j20.c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import mj.f;
import nj.w1;
import nx1.v;
import u3.y2;
import w00.j;
import x12.p;
import x12.p0;
import y9.k0;
import y9.q0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanActivity;", "Lbt0/g;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MachineScanActivity extends bt0.g {

    /* renamed from: q  reason: collision with root package name */
    public static final a f13536q = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public ef1.h f13537k;

    /* renamed from: l  reason: collision with root package name */
    public c.b f13538l;

    /* renamed from: m  reason: collision with root package name */
    public j f13539m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f13540n = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.machinescan.c.class), new h(this), new g(f.d, this, new t20.a(this, 0)), new i(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final t f13541o = m.b(new t20.b(this, 0));

    /* renamed from: p  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f13542p = registerForActivityResult(new j.a(), new s72.a(20));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/machinescan/MachineScanActivity$b", "Lf/q;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends q {
        public b() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            a aVar = MachineScanActivity.f13536q;
            MachineScanActivity machineScanActivity = MachineScanActivity.this;
            machineScanActivity.d1().e(machineScanActivity);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanRoute;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanRoute;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.machinescan.MachineScanActivity$onCreate$3$1$1", f = "MachineScanActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<MachineScanRoute, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q0 q0Var, l12.d<? super c> dVar) {
            super(2, dVar);
            this.e = q0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            c cVar = new c(this.e, dVar);
            cVar.d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MachineScanRoute machineScanRoute, l12.d<? super f0> dVar) {
            return ((c) create(machineScanRoute, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            MachineScanRoute machineScanRoute = (MachineScanRoute) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            q0 q0Var = this.e;
            k0 i13 = q0Var.f89416b.i();
            String str = i13 != null ? i13.e.f23151f : null;
            if (str != null) {
                if (!str.equals(p0.f86717a.b(machineScanRoute.getClass()).o())) {
                    q0Var.g(machineScanRoute, new v(str, 29));
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d extends p implements Function1<j20.c, f0> {
        public d(Object obj) {
            super(1, obj, MachineScanActivity.class, "handleBluetoothNavigationEvent", "handleBluetoothNavigationEvent(Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/EnableBluetoothNavigationEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(j20.c cVar) {
            j20.c cVar2 = cVar;
            cVar2.getClass();
            MachineScanActivity machineScanActivity = (MachineScanActivity) this.receiver;
            a aVar = MachineScanActivity.f13536q;
            machineScanActivity.getClass();
            if (cVar2.equals(c.a.f43661a)) {
                com.dyson.mobile.android.connectionjourney.machinescan.c e13 = machineScanActivity.e1();
                e13.V();
                af1.g.a(e13.f13571w, m9.v.a(e13), MachineScanRoute.Scan.INSTANCE);
            } else if (!cVar2.equals(c.b.f43662a)) {
                ma.e.o();
                return null;
            } else {
                machineScanActivity.f13542p.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements m9.p, x12.m {
        public final /* synthetic */ Function1 d;

        public e(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof m9.p) && (obj instanceof x12.m)) {
                return x12.r.c(d(), ((x12.m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements w12.a<Bundle> {
        public static final f d = new f();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13543f;

        public g(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f13543f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f13543f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f13544f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f.g gVar) {
            super(0);
            this.f13544f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13544f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class i extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13545f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f13546g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, f.g gVar) {
            super(0);
            this.f13545f = aVar;
            this.f13546g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13545f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13546g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final w00.i d1() {
        return (w00.i) this.f13541o.getValue();
    }

    public final com.dyson.mobile.android.connectionjourney.machinescan.c e1() {
        return (com.dyson.mobile.android.connectionjourney.machinescan.c) this.f13540n.getValue();
    }

    public final void f1(c.AbstractC0427c abstractC0427c) {
        ij.b a13;
        if (abstractC0427c instanceof c.AbstractC0427c.e) {
            d1().s(this, true);
            return;
        }
        String str = null;
        if (!(abstractC0427c instanceof c.AbstractC0427c.C0428c)) {
            if (abstractC0427c instanceof c.AbstractC0427c.b) {
                d1().s(this, false);
                return;
            } else if (abstractC0427c instanceof c.AbstractC0427c.a) {
                d1().e(this);
                return;
            } else if (abstractC0427c instanceof c.AbstractC0427c.d) {
                com.dyson.mobile.android.connectionjourney.machinescan.c e13 = e1();
                hj.e eVar = e13.f13559k;
                ij.f a14 = new mj.f(f.c.CONTENT_REFRESH, f.a.BUTTON_CLICK, null, 4, null).a();
                e.a aVar = hj.e.f38312g;
                eVar.g(a14, null);
                e13.V();
                return;
            } else if (!(abstractC0427c instanceof c.AbstractC0427c.f)) {
                ma.e.o();
                return;
            } else {
                com.dyson.mobile.android.connectionjourney.machinescan.c e14 = e1();
                if (((c.AbstractC0427c.f) abstractC0427c).f13578a) {
                    int i13 = w1.f57759a;
                    a13 = new ij.b("connection_journey.choose_product.machine_scan", null, 2, null);
                } else {
                    int i14 = w1.f57759a;
                    ij.b bVar = new ij.b("connection_journey.choose_product.machine_scan", null, 2, null);
                    LinkedHashMap m13 = i12.q0.m(bVar.f41701b);
                    a.s.f52191a.getClass();
                    m13.put(a.s.f52192b, "error");
                    a13 = ij.b.a(bVar, m13);
                }
                hj.e eVar2 = e14.f13559k;
                e.a aVar2 = hj.e.f38312g;
                eVar2.h(a13, null);
                return;
            }
        }
        com.dyson.mobile.android.connectionjourney.machinescan.c e15 = e1();
        MachineScanRecord machineScanRecord = ((c.AbstractC0427c.C0428c) abstractC0427c).f13575a;
        ConnectionJourneyDataStore connectionJourneyDataStore = e15.d;
        machineScanRecord.getClass();
        int n13 = machineScanRecord.n();
        if (n13 == 0) {
            WebRegisteredMachineRecord webRegisteredMachineRecord = (WebRegisteredMachineRecord) machineScanRecord;
            connectionJourneyDataStore.f13891c.putString("CONNECTION_JOURNEY_WEB_REGISTERED_MACHINE_SCAN_CODE-key", connectionJourneyDataStore.f13890b.toJson(webRegisteredMachineRecord, WebRegisteredMachineRecord.class));
            e15.X(webRegisteredMachineRecord, webRegisteredMachineRecord.j(), new c50.c());
        } else if (n13 == 1) {
            BleScanningRecord bleScanningRecord = (BleScanningRecord) machineScanRecord;
            connectionJourneyDataStore.f13891c.putString("CONNECTION_JOURNEY_BLE_SCAN_RECORD-key", connectionJourneyDataStore.f13890b.toJson(bleScanningRecord, BleScanningRecord.class));
            e15.X(bleScanningRecord, bleScanningRecord.j(), new c50.c());
        } else if (n13 != 2) {
            throw new IllegalStateException(("Unsupported Machine record type: " + n13).toString());
        } else {
            MdnsScanningRecord mdnsScanningRecord = (MdnsScanningRecord) machineScanRecord;
            String s13 = mdnsScanningRecord.s();
            if (s13 == null) {
                Logger.b("MDNS Machine Identifier cannot be null", null);
            } else if (s70.g.b(s13)) {
                str = (String) new LinkedList(Arrays.asList(s13.split("_"))).getLast();
            } else if (s13.startsWith("360EYE-")) {
                str = s13.replace("360EYE-", "");
            } else {
                Logger.b("MDNS Machine Identifier must be a Robot or EC. MachineIdentifier: ".concat(s13), null);
            }
            connectionJourneyDataStore.f13891c.putString("CONNECTION_JOURNEY_MDNS_SCAN_RECORD", connectionJourneyDataStore.f13890b.toJson(mdnsScanningRecord, MdnsScanningRecord.class));
            str.getClass();
            e15.X(mdnsScanningRecord, str, connectionJourneyDataStore.i());
        }
        w00.i d13 = d1();
        String j8 = machineScanRecord.j();
        int n14 = machineScanRecord.n();
        MachineDescriptor i15 = machineScanRecord.i();
        d13.getClass();
        w00.i.m(this, j8, n14, i15);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        d1().e.X(this);
        getOnBackPressedDispatcher().a(this, new b());
        e1().f13567s.observe(this, new e(new t20.a(this, 1)));
        g.f.a(this, new c4.c(-1932241333, true, new sa0.p(this, 5)));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        com.dyson.mobile.android.connectionjourney.machinescan.c e13 = e1();
        e13.f13566r.e();
        y2 y2Var = (y2) e13.f13568t;
        y2Var.setValue(c.e.a((c.e) y2Var.getValue(), false, false, null, null, null, null, 249));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        d1().e(this);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanActivity$a;", "", "<init>", "()V", "", "EXTRA_FILTER_CRITERIA", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
