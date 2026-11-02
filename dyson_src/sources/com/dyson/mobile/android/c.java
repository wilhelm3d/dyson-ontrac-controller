package com.dyson.mobile.android;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.n;
import com.brightcove.player.analytics.Analytics;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.logging.Logger;
import cq.d;
import e71.n;
import f80.j1;
import f80.o;
import f80.y;
import gj.h;
import hj.e;
import hn0.g;
import hn0.i;
import hn0.m;
import hn0.p;
import j90.k;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import pw.f;
import qh.j;
import qh.l0;
import uf0.l;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/c;", "Lm9/c;", "Lcom/dyson/mobile/android/DysonApplication;", Analytics.Fields.APPLICATION_ID, "Lhj/e;", "trackingManager", "Lbq/b;", "automationTestSupport", "Lq51/a;", "salesforceMarketingCloudSupportChecker", "<init>", "(Lcom/dyson/mobile/android/DysonApplication;Lhj/e;Lbq/b;Lq51/a;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements m9.c {
    public final DysonApplication d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final q51.a f12837f;

    /* renamed from: g  reason: collision with root package name */
    public final gz1.b f12838g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/c$a", "Lj90/e;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements j90.e {
        public a() {
        }

        @Override // j90.e
        public final String a() {
            return new l0(c.this.d).f66894b.a();
        }
    }

    public c(DysonApplication dysonApplication, e eVar, bq.b bVar, q51.a aVar) {
        dysonApplication.getClass();
        eVar.getClass();
        bVar.getClass();
        aVar.getClass();
        this.d = dysonApplication;
        this.e = eVar;
        this.f12837f = aVar;
        this.f12838g = new gz1.b();
    }

    public static void e() {
        b.A.getClass();
        b.a.a().b();
        b a13 = b.a.a();
        j1 j1Var = a13.f12813o;
        if (j1Var == null) {
            r.i("userPropertyManagerProvider");
            throw null;
        }
        h hVar = (h) j1Var.get();
        a13.f12816r = hVar;
        j jVar = hVar.d;
        int i13 = j.f66853q;
        WeakReference<qh.e> weakReference = new WeakReference<>(hVar);
        synchronized (jVar.f66864m) {
            try {
                if (jVar.g().isEmpty()) {
                    qh.a aVar = jVar.f66856c;
                    j.k kVar = (j.k) jVar.f66867p.getValue();
                    kVar.getClass();
                    aVar.f66828a.f7313a.d(kVar);
                }
                jVar.g().add(weakReference);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.a(jVar.f66856c.b());
    }

    public final void a() {
        DysonApplication dysonApplication = this.d;
        j90.h hVar = new j90.h(dysonApplication);
        pw.d dVar = new f(dysonApplication).f64837a;
        dVar.getClass();
        gs0.a.f36249b = "6.4.26420";
        gs0.a.f36250c = hVar;
        gs0.a.d = (hs0.a) dVar.a(hs0.a.class, "reporting", "cloudReportingConfig.json");
    }

    public final void b() {
        DysonApplication dysonApplication = this.d;
        oj.d dVar = new oj.d(dysonApplication);
        tj.a a13 = dVar.a();
        sj.b bVar = dVar.f60349b;
        if (bVar == null) {
            r.i("environmentManager");
            throw null;
        }
        f fVar = new f(dysonApplication);
        String value = bVar.a().getValue();
        String c13 = a13.c();
        pw.d dVar2 = fVar.f64837a;
        dVar2.f64833b = value;
        dVar2.f64834c = c13;
    }

    public final void c() {
        this.f12838g.a(new yi0.h(this.d).f90159a.f90155b.h().S(c02.a.f10004c).H(fz1.a.a()).P(new ph.b(new pe0.h(19), 2), new ph.b(new pe0.h(20), 3)));
    }

    @SuppressLint({"CheckResult"})
    public final void d() {
        u50.d.D.getClass();
        s60.b bVar = u50.d.E;
        DysonApplication dysonApplication = this.d;
        if (bVar == null) {
            new s60.a(0);
            u50.d.E = new s60.b(new t60.a(dysonApplication));
        }
        d dVar = new d(dysonApplication);
        a aVar = new a();
        j90.h hVar = new j90.h(dysonApplication);
        k kVar = hVar.f44096a;
        kVar.f(dVar);
        kVar.c(aVar);
        o90.e eVar = hVar.f44097b;
        eVar.b(dVar, aVar);
        kVar.a("X-Platform", "android");
        eVar.a("X-Platform", "android");
        kVar.a("X-App-Version", "6.4.26420");
        eVar.a("X-App-Version", "6.4.26420");
    }

    public final void f() {
        Logger.a("registerMachineListChangeTasks");
        uf0.d dVar = uf0.d.f81913a;
        dVar.getClass();
        LinkedHashSet linkedHashSet = uf0.d.f81914b;
        linkedHashSet.clear();
        gn0.a aVar = new gn0.a();
        e80.b bVar = (e80.b) pa.c.d(b.A);
        f80.f fVar = bVar.f26210a;
        fVar.getClass();
        aVar.f35854a = new kz.c(bVar.e.get()).a();
        aVar.f35855b = bVar.g();
        androidx.lifecycle.r.f4543k.getClass();
        n nVar = androidx.lifecycle.r.f4544l.f4548i;
        xy1.h.b(nVar);
        aVar.f35856c = nVar;
        yi0.b bVar2 = new yi0.h(bVar.e.get()).f90161c;
        xy1.h.b(bVar2);
        aVar.d = bVar2;
        vy1.a<uf0.h> aVar2 = new l(bVar.e.get()).f81960g;
        if (aVar2 == null) {
            r.i("lazyMachineCoordinatorManager");
            throw null;
        }
        uf0.h hVar = aVar2.get();
        hVar.getClass();
        aVar.e = hVar;
        aVar.f35857f = new u50.d().b();
        xy1.h.b(dVar);
        aVar.f35858g = dVar;
        e71.n.f26183r.getClass();
        k71.c cVar = n.a.a().f26187b;
        xy1.h.b(cVar);
        aVar.f35859h = cVar;
        fVar.getClass();
        aVar.f35860i = new p60.d(bVar.f26232m.get().getApplicationContext(), new se1.e(), p60.b.f63043a);
        aVar.f35861j = o.a(fVar);
        aVar.f35862k = y.a(fVar);
        aVar.f35863l = bVar.f26245v.get();
        aVar.f35864m = new af1.h();
        DysonApplication dysonApplication = this.d;
        Context applicationContext = dysonApplication.getApplicationContext();
        applicationContext.getClass();
        if (aVar.f35858g == null) {
            r.i("dysonMachineListChangeManager");
            throw null;
        }
        cq.d.f22090a.getClass();
        d.b bVar3 = cq.d.f22092c;
        bVar3.getClass();
        linkedHashSet.add(bVar3);
        linkedHashSet.add(new hn0.a(new hn0.b(new r60.a(applicationContext, true))));
        u50.c cVar2 = aVar.f35857f;
        if (cVar2 == null) {
            r.i("connectionManager");
            throw null;
        }
        p60.d dVar2 = aVar.f35860i;
        if (dVar2 == null) {
            r.i("companionDeviceUtils");
            throw null;
        }
        r60.a aVar3 = aVar.f35861j;
        if (aVar3 == null) {
            r.i("connectivityDataStore");
            throw null;
        }
        linkedHashSet.add(new hn0.e(new hn0.f(cVar2, dVar2, aVar3)));
        y61.c cVar3 = aVar.f35855b;
        if (cVar3 == null) {
            r.i("machineShortcutManager");
            throw null;
        }
        linkedHashSet.add(new m(new hn0.n(cVar3)));
        kz.b bVar4 = aVar.f35854a;
        if (bVar4 == null) {
            r.i("connectedHomeManager");
            throw null;
        }
        linkedHashSet.add(new hn0.c(new hn0.d(bVar4)));
        yi0.b bVar5 = aVar.d;
        if (bVar5 == null) {
            r.i("machineConnector");
            throw null;
        }
        Lifecycle lifecycle = aVar.f35856c;
        if (lifecycle == null) {
            r.i("lifecycle");
            throw null;
        }
        linkedHashSet.add(new i(new hn0.j(bVar5, lifecycle)));
        uf0.h hVar2 = aVar.e;
        if (hVar2 == null) {
            r.i("machineCoordinatorManager");
            throw null;
        }
        linkedHashSet.add(new hn0.k(new hn0.l(hVar2)));
        k71.c cVar4 = aVar.f35859h;
        if (cVar4 == null) {
            r.i("supportContactManager");
            throw null;
        }
        linkedHashSet.add(new hn0.o(new p(cVar4)));
        w71.a aVar4 = aVar.f35862k;
        if (aVar4 == null) {
            r.i("featureSupportRepository");
            throw null;
        }
        j jVar = aVar.f35863l;
        if (jVar == null) {
            r.i("dysonAccountManager");
            throw null;
        }
        af1.h hVar3 = aVar.f35864m;
        if (hVar3 == null) {
            r.i("dispatcherProvider");
            throw null;
        }
        linkedHashSet.add(new g(new hn0.h(aVar4, jVar, hVar3)));
        Context applicationContext2 = dysonApplication.getApplicationContext();
        applicationContext2.getClass();
        linkedHashSet.add(new vj.m(new vj.b(new y70.f(applicationContext2, "all-wearable-ec")), new vj.i(applicationContext2), new ck.a(applicationContext2, lg0.a.f51814b)));
        Context applicationContext3 = dysonApplication.getApplicationContext();
        applicationContext3.getClass();
        linkedHashSet.add(new w90.o(new y70.f(applicationContext3, "interactable_ec")));
        Context applicationContext4 = dysonApplication.getApplicationContext();
        applicationContext4.getClass();
        yd0.d dVar3 = new yd0.d(applicationContext4);
        re0.h hVar4 = re0.h.f70889a;
        hVar4.getClass();
        linkedHashSet.add(new yd0.i(dVar3, hVar4));
        Context applicationContext5 = dysonApplication.getApplicationContext();
        applicationContext5.getClass();
        linkedHashSet.add(new sw.d(new yw.d(applicationContext5), new yw.b(applicationContext5)));
    }

    @Override // m9.c
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f12838g.e();
        b.A.getClass();
        b.a.a().b();
    }
}
