package com.dyson.mobile.android.robot.history;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import bt0.d;
import bv0.a2;
import bv0.g3;
import bv0.s0;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.robot.cloud.model.CleanHistory;
import com.dyson.mobile.android.robot.history.a;
import com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist.RestrictionListActivity;
import cw0.e;
import dw0.t;
import e71.n;
import h12.p;
import iu0.b0;
import iu0.c0;
import iu0.d0;
import iu0.z;
import j90.h;
import j90.k;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pw.f;
import vk0.n;
import we1.a;
import x12.p0;
import x12.r;
import xu0.g;
import xv0.b;
import xv0.c;
import xv0.e;
import yv0.a;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/history/CleanHistoryActivity;", "Lbt0/d;", "Lxv0/c;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanHistoryActivity extends d implements c {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16052n = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public e f16053l;

    /* renamed from: m  reason: collision with root package name */
    public z f16054m;

    @Override // xv0.c
    public final void O0() {
        z zVar = this.f16054m;
        if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        } else if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        } else {
            String str = zVar.f42726i;
            str.getClass();
            zv0.a.f93140j.getClass();
            zv0.a aVar = new zv0.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            aVar.show(getSupportFragmentManager(), "MapKey");
        }
    }

    @Override // xv0.c
    public final void X(CleanHistory cleanHistory, TimeZone timeZone) {
        cleanHistory.getClass();
        new ViewModelProvider(this, new zf1.a(new x00.a(7, cleanHistory, timeZone))).a(p0.f86717a.b(a.C0551a.class));
        e.a aVar = cw0.e.f22286i;
        z zVar = this.f16054m;
        if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        }
        String str = zVar.f42726i;
        aVar.getClass();
        str.getClass();
        cw0.e eVar = new cw0.e();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        eVar.setArguments(bundle);
        e1(eVar);
    }

    @Override // bt0.d
    public final bt0.a d1() {
        xv0.e eVar = this.f16053l;
        if (eVar != null) {
            return eVar;
        }
        r.i("cleanHistoryViewModel");
        throw null;
    }

    @Override // xv0.c
    public final void f(String str) {
        str.getClass();
        z zVar = this.f16054m;
        if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        }
        String str2 = zVar.f42726i;
        b bVar = new b(this, 0);
        str2.getClass();
        RestrictionListActivity.f16131j.getClass();
        Intent putExtra = new Intent(this, RestrictionListActivity.class).putExtra("COORDINATOR_ID", str2).putExtra("MAP_ID", str);
        putExtra.getClass();
        z.w(this, putExtra, bVar);
    }

    @Override // xv0.c
    public final void k() {
        if (this.f16054m == null) {
            r.i("robotCoordinator");
            throw null;
        }
        z.w(this, new Intent(this, ConnectivityIssueActivity.class), new b(this, 1));
    }

    @Override // xv0.c
    public final void k0() {
        a.C2753a c2753a = yv0.a.e;
        z zVar = this.f16054m;
        if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        }
        String str = zVar.f42726i;
        c2753a.getClass();
        str.getClass();
        yv0.a aVar = new yv0.a();
        aVar.setArguments(k7.c.a(new p("COORDINATOR_ID", str)));
        e1(aVar);
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID");
        z.a aVar = z.f42723r;
        String string = a14.getString("COORDINATOR_ID");
        aVar.getClass();
        z a15 = z.a.a(string);
        if (a15 == null) {
            pa.c.p("Required value was null.");
            return;
        }
        this.f16054m = a15;
        d0 d0Var = a15.f42732o;
        d0Var.getClass();
        getLifecycle().a(new c0(new b0(d0Var, 0)));
        av0.b bVar = new av0.b(d0Var.f42663a.e);
        av0.c cVar = new av0.c(bVar.f5496a, new bv0.a());
        d0Var.f42665c = cVar;
        av0.d dVar = cVar.f5498b;
        MachineSerial b13 = g3.b(dVar.f5510b);
        s0 s0Var = dVar.f5510b;
        Context context = s0Var.f9015a;
        iu0.p pVar = s0Var.f9016b;
        k kVar = new h(context).f44096a;
        kVar.getClass();
        Object a16 = new f(s0Var.f9015a).f64837a.a(g.class, "machine", "robotEndpointsConfig.json");
        a16.getClass();
        xu0.a aVar2 = dVar.f5608v.get();
        aVar2.getClass();
        g41.k kVar2 = new g41.k(pVar.f42685b, kVar, (g) a16, aVar2);
        n b14 = a2.b(s0Var);
        pf0.c b15 = dVar.b();
        iu0.r rVar = new iu0.r(pVar.f42684a);
        e71.n.f26183r.getClass();
        this.f16053l = bv0.f.a(cVar.f5497a, b13, context, kVar2, b14, b15, rVar, n.a.a().a(), dVar.f(), new af1.h());
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f16053l != null) {
            Lifecycle lifecycle = getLifecycle();
            xv0.e eVar = this.f16053l;
            if (eVar != null) {
                lifecycle.c(eVar);
            } else {
                r.i("cleanHistoryViewModel");
                throw null;
            }
        }
    }

    @Override // bt0.d, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            aw0.a.d.getClass();
            e1(new aw0.a());
        }
        xv0.e eVar = this.f16053l;
        if (eVar == null) {
            r.i("cleanHistoryViewModel");
            throw null;
        }
        getLifecycle().a(eVar);
        eVar.f88039l.setValue(eVar, xv0.e.f88032n[0], this);
        eVar.q();
    }

    @Override // xv0.c
    public final void u0(List<com.dyson.mobile.android.robot.cloud.model.a> list, TimeZone timeZone) {
        list.getClass();
        new ViewModelProvider(this, new zf1.a(new x00.a(6, list, timeZone))).a(p0.f86717a.b(a.b.class));
        t.a aVar = t.f25177h;
        z zVar = this.f16054m;
        if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        }
        String str = zVar.f42726i;
        aVar.getClass();
        str.getClass();
        t tVar = new t();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        tVar.setArguments(bundle);
        e1(tVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/history/CleanHistoryActivity$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(androidx.fragment.app.e eVar, String str) {
            str.getClass();
            Intent putExtra = new Intent(eVar, CleanHistoryActivity.class).putExtra("extraTheme", 2132083506).putExtra("COORDINATOR_ID", str);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
