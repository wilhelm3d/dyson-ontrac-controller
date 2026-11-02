package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.definition;

import android.content.Intent;
import android.os.Bundle;
import av0.d;
import bv0.e8;
import bv0.s0;
import bv0.t2;
import bv0.u9;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.mapping.zones.view.MapLayerView;
import com.dyson.mobile.android.robot.menu.mappingandzoning.zones.labelling.RobotMapLabellingActivity;
import f.x;
import fm1.o0;
import hj.e;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.wa;
import pa.c;
import r3.l4;
import se1.i0;
import se1.y;
import tw0.a0;
import tw0.f0;
import tw0.m;
import tw0.t;
import va0.w;
import vx0.f;
import vx0.g;
import vx0.h;
import vx0.j;
import vx0.q;
import vx0.s;
import we1.a;
import x12.r;
import xw0.k;
import yu0.i;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/definition/RobotZoneDefinitionActivity;", "Ll/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotZoneDefinitionActivity extends l.b {

    /* renamed from: p  reason: collision with root package name */
    public static final a f16146p = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public j f16147j;

    /* renamed from: k  reason: collision with root package name */
    public m f16148k;

    /* renamed from: l  reason: collision with root package name */
    public e f16149l;

    /* renamed from: m  reason: collision with root package name */
    public z f16150m;

    /* renamed from: n  reason: collision with root package name */
    public i f16151n;

    /* renamed from: o  reason: collision with root package name */
    public final b f16152o = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/zones/definition/RobotZoneDefinitionActivity$b", "Lvx0/g;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g {
        public b() {
        }

        @Override // vx0.g
        public final void a(boolean z13) {
            RobotZoneDefinitionActivity robotZoneDefinitionActivity = RobotZoneDefinitionActivity.this;
            f0 f0Var = robotZoneDefinitionActivity.c1().e;
            f0Var.f80312b = f0Var.f80311a;
            cd.b.u(robotZoneDefinitionActivity, z13);
        }

        @Override // vx0.g
        public final void b() {
            RobotZoneDefinitionActivity robotZoneDefinitionActivity = RobotZoneDefinitionActivity.this;
            f0 f0Var = robotZoneDefinitionActivity.c1().e;
            f0Var.f80312b = f0Var.f80311a;
            robotZoneDefinitionActivity.setResult(-4);
            robotZoneDefinitionActivity.finish();
            robotZoneDefinitionActivity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        }

        @Override // vx0.g
        public final void c(String str, String str2, String str3, String str4, l4 l4Var) {
            e.a a13 = new zs0.e(RobotZoneDefinitionActivity.this).a();
            a13.f93107a = str;
            a13.f93108b = str2;
            a13.c(str3, new f(l4Var, 0));
            a13.b(str4, null);
            a13.d();
        }

        @Override // vx0.g
        public final void d() {
            RobotZoneDefinitionActivity robotZoneDefinitionActivity = RobotZoneDefinitionActivity.this;
            z zVar = robotZoneDefinitionActivity.f16150m;
            if (zVar == null) {
                r.i("robotCoordinator");
                throw null;
            }
            Intent intent = robotZoneDefinitionActivity.getIntent();
            intent.getClass();
            String y13 = o0.y("EXTRA_MAP_ID", cd.b.I(intent));
            w wVar = new w(robotZoneDefinitionActivity, 24);
            RobotMapLabellingActivity.a aVar = RobotMapLabellingActivity.f16154u;
            String str = zVar.f42726i;
            aVar.getClass();
            str.getClass();
            Intent intent2 = new Intent(robotZoneDefinitionActivity, RobotMapLabellingActivity.class);
            intent2.putExtra("COORDINATOR_ID", str);
            intent2.putExtra("EXTRA_MAP_ID", y13);
            z.w(robotZoneDefinitionActivity, intent2, wVar);
        }
    }

    public final j c1() {
        j jVar = this.f16147j;
        if (jVar != null) {
            return jVar;
        }
        r.i("viewModel");
        throw null;
    }

    public final void d1() {
        s sVar = c1().f84987y;
        if (sVar == null) {
            r.i("thresholdMap");
            throw null;
        } else if (sVar.f84995a.isEmpty()) {
            super.onBackPressed();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        } else {
            j c13 = c1();
            c13.s(new h(c13, 0));
        }
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        d1();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RobotZoneDefinitionActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID", "EXTRA_MAP_ID");
        String stringExtra = getIntent().getStringExtra("COORDINATOR_ID");
        z.f42723r.getClass();
        z a14 = z.a.a(stringExtra);
        if (a14 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        this.f16150m = a14;
        d dVar = a14.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        e8 e8Var2 = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        pf0.c b13 = dVar.b();
        f0 f0Var = dVar.D3.get();
        y b14 = t2.b(s0Var);
        y b15 = t2.b(s0Var);
        e8Var2.getClass();
        q qVar = new q(new vx0.b(b15));
        y b16 = t2.b(s0Var);
        e8Var2.getClass();
        q qVar2 = new q(new vx0.b(b16));
        e8Var2.getClass();
        vx0.d dVar2 = new vx0.d(qVar2, new vx0.c());
        y b17 = t2.b(s0Var);
        e8Var2.getClass();
        vx0.b bVar = new vx0.b(b17);
        vx0.c cVar = new vx0.c();
        ow0.b bVar2 = new ow0.b();
        t h13 = dVar.h();
        y b18 = t2.b(s0Var);
        e8Var2.getClass();
        vx0.t tVar = new vx0.t(bVar2, h13, new vx0.b(b18), new xw0.t(t2.b(s0Var), new xw0.m()));
        a0 a0Var = new a0();
        xw0.t tVar2 = new xw0.t(t2.b(s0Var), new xw0.m());
        s0Var.getClass();
        this.f16147j = u9.a(e8Var, b13, f0Var, b14, qVar, dVar2, bVar, cVar, tVar, a0Var, tVar2, new k(new jf1.a(), new y(s0Var.f9015a), new i0()), dVar.f());
        this.f16148k = new m();
        this.f16149l = dVar.V.get();
        q8.t d = q8.g.d(this, R.layout.activity_robot_map_zone_definition);
        d.getClass();
        i iVar = (i) d;
        this.f16151n = iVar;
        iVar.f90749p.x(this);
        j c13 = c1();
        m mVar = this.f16148k;
        if (mVar == null) {
            r.i("mapRenderer");
            throw null;
        }
        i iVar2 = this.f16151n;
        if (iVar2 == null) {
            r.i("binding");
            throw null;
        }
        MapLayerView mapLayerView = iVar2.f90744k;
        mapLayerView.getClass();
        mVar.f80321a = mapLayerView;
        i iVar3 = this.f16151n;
        if (iVar3 == null) {
            r.i("binding");
            throw null;
        }
        mVar.f80323c = iVar3.f90742i;
        mVar.f80322b = iVar3.d;
        c13.f84977o = mVar;
        c13.f84976n.setValue(c13, j.F[0], this.f16152o);
        i iVar4 = this.f16151n;
        if (iVar4 == null) {
            r.i("binding");
            throw null;
        }
        iVar4.l(c1());
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        getLifecycle().a(c1());
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(c1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f16149l;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = wa.f57768a;
        ij.b bVar = new ij.b("robot.zoning.define_your_zones", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        d1();
        return false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/definition/RobotZoneDefinitionActivity$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
