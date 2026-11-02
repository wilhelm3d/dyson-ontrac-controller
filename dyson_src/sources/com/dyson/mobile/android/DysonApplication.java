package com.dyson.mobile.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import bd.e;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.logging.Logger;
import e71.n;
import eo0.k;
import gd.u;
import gh0.o;
import gh0.p;
import i12.t;
import i12.y;
import ic.c;
import ic.j;
import ic.n;
import ic.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kx.c;
import m9.i;
import pe0.h;
import ph.g;
import qv1.s;
import uf0.q;
import v32.w;
import x12.r;
import y70.f;
import z32.c0;
import z32.g0;
import z32.t0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/DysonApplication;", "Landroid/app/Application;", "Lm9/i;", "Lic/v$a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DysonApplication extends Application implements i, v.a {
    public static final /* synthetic */ int e = 0;
    public c d;

    @Override // ic.v.a
    public final n a(Context context) {
        context.getClass();
        j.a aVar = new j.a(this);
        c.a aVar2 = new c.a();
        aVar2.e.add(new u(new e.b(false, false, false, 7, null), 2));
        aVar.f41396g = aVar2.c();
        return aVar.a();
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        a02.a.f42a = new ph.b(new h(18), 1);
        b.A.getClass();
        b bVar = new b(this, null);
        b.B = bVar;
        e80.b bVar2 = (e80.b) bVar.f();
        this.d = bVar2.f26243t.get();
        ph.e d = bVar2.d();
        g gVar = g.f64112a;
        ((Boolean) d.f64109a.getValue(d, ph.e.e[1])).getClass();
        gVar.getClass();
        c cVar = this.d;
        if (cVar == null) {
            r.i("applicationInitialiser");
            throw null;
        }
        Logger.a("initApplicationModules");
        n.a aVar = e71.n.f26183r;
        DysonApplication dysonApplication = cVar.d;
        aVar.getClass();
        n.a.c(dysonApplication);
        c cVar2 = this.d;
        if (cVar2 == null) {
            r.i("applicationInitialiser");
            throw null;
        }
        Logger.a("initApplication");
        Logger.a("doPostUpdateMigration");
        DysonApplication dysonApplication2 = cVar2.d;
        try {
            new hy0.a(dysonApplication2).f39707a.deleteSharedPreferences("power-modes-dialog");
        } catch (Exception e13) {
            Logger.e("Unable to delete the shared preferences file: power-modes-dialog", e13);
        }
        f fVar = new a80.a(dysonApplication2).f435a;
        fVar.getClass();
        SharedPreferences sharedPreferences = fVar.f89351a;
        if (sharedPreferences.contains("marketing_consent")) {
            String string = sharedPreferences.getString("marketing_consent", null);
            if (string != null) {
                fVar.putBoolean("marketing_consent_key", Boolean.parseBoolean(string));
            }
            fVar.remove("marketing_consent");
        }
        kx.b bVar3 = new kx.b(dysonApplication2);
        f fVar2 = bVar3.f50164a;
        f fVar3 = new kx.d(fVar2).f50172a;
        boolean z13 = false;
        for (kx.c cVar3 : t.h(new c.a(fVar3, fVar3, "IS_ID_CURL_SETUP_COMPLETE", "IS_ID_CURL_SETUP_COMPLETE_308F"), new c.a(fVar3, fVar3, "IS_ID_CURL_TUTORIAL_COMPLETE", "IS_ID_CURL_TUTORIAL_COMPLETE_308F"), new c.b(fVar3, fVar3, "RECOMMENDED_TIMINGS_MATRIX", "RECOMMENDED_TIMINGS_MATRIX_308F"))) {
            cVar3.a();
        }
        kx.e eVar = new kx.e(fVar2, bVar3.f50165b);
        f fVar4 = eVar.f50174b;
        List<String> h13 = t.h("308F", "590");
        List<String> h14 = t.h("IS_HAIR_PROFILE_SETUP_COMPLETE", "IS_ID_CURL_SETUP_COMPLETE", "IS_ID_CURL_TUTORIAL_COMPLETE", "IS_ID_CURL_PRACTISE_COMPLETE", "RECOMMENDED_TIMINGS_MATRIX");
        ArrayList arrayList = new ArrayList();
        for (String str : h13) {
            ArrayList arrayList2 = new ArrayList(i12.u.o(h14, 10));
            for (String str2 : h14) {
                String i13 = s.i(str2, "_", str);
                boolean q13 = w.q(i13, "IS_", z13);
                f fVar5 = eVar.f50173a;
                arrayList2.add(q13 ? new c.a(fVar5, fVar4, i13, i13) : new c.b(fVar5, fVar4, i13, i13));
                z13 = false;
            }
            y.s(arrayList2, arrayList);
            z13 = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kx.c) it.next()).a();
        }
        cVar2.b();
        ue1.a.f81859a.getClass();
        cVar2.e.f38316c.add(new q());
        pf0.f fVar6 = pf0.f.f64086a;
        pf0.f.f64087b = new WeakReference<>(dysonApplication2);
        ph.d dVar = new ph.d(new pf0.e(dysonApplication2).f64085a);
        if1.g.f41629a = dVar;
        if1.a.f41622g = dVar;
        cVar2.d();
        c.e();
        cVar2.f();
        b.a aVar2 = b.A;
        aVar2.getClass();
        b.a.a().t();
        cVar2.c();
        cVar2.a();
        androidx.lifecycle.r.f4543k.getClass();
        androidx.lifecycle.r rVar = androidx.lifecycle.r.f4544l;
        androidx.lifecycle.n nVar = rVar.f4548i;
        cq.b bVar4 = new cq.b();
        Context applicationContext = dysonApplication2.getApplicationContext();
        applicationContext.getClass();
        nVar.a(new cq.e(applicationContext, bVar4));
        new eq.b();
        aVar2.getClass();
        ((e80.b) b.a.a().f()).b().a().v();
        if (cVar2.f12837f.a()) {
            no0.h hVar = new k(dysonApplication2).f28209c;
            if (hVar == null) {
                r.i("salesforceMarketingCloudProvider");
                throw null;
            }
            cVar2.f12838g.a(hVar.a().z(c02.a.f10004c).r(fz1.a.a()).v());
        }
        Context applicationContext2 = dysonApplication2.getApplicationContext();
        applicationContext2.getClass();
        p pVar = new uf0.b(applicationContext2).f81909a;
        if (pVar == null) {
            r.i("otaFileCleanUpTask");
            throw null;
        }
        c0 c0Var = pVar.f34749a;
        h42.c cVar4 = t0.f91519a;
        g0.r(c0Var, h42.b.f37596f, null, new o(pVar, null), 2);
        lz.a aVar3 = lz.a.f52817a;
        o11.a aVar4 = new o11.a(11);
        aVar3.getClass();
        lz.a.f52818b = aVar4;
        androidx.lifecycle.n nVar2 = rVar.f4548i;
        c cVar5 = this.d;
        if (cVar5 == null) {
            r.i("applicationInitialiser");
            throw null;
        }
        nVar2.a(cVar5);
    }
}
