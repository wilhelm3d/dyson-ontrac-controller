package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.map;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bv0.b2;
import bv0.e8;
import bv0.l8;
import bv0.n0;
import bv0.p9;
import bv0.r1;
import bv0.s0;
import bv0.t2;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import com.dyson.mobile.android.robot.mapping.zones.view.MapLayerView;
import com.dyson.mobile.android.robot.menu.mappingandzoning.zones.definition.RobotZoneDefinitionActivity;
import f.j;
import f.x;
import fm1.o0;
import hj.e;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import nj.za;
import se1.i0;
import se1.y;
import tw0.f0;
import tw0.m;
import tw0.u;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import xw0.k;
import yu0.g;
import yx0.f;
import zx0.h;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/map/RobotMapReadyActivity;", "Ll/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotMapReadyActivity extends l.b {

    /* renamed from: s  reason: collision with root package name */
    public static final a f16168s = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public f f16169j;

    /* renamed from: k  reason: collision with root package name */
    public m f16170k;

    /* renamed from: l  reason: collision with root package name */
    public hj.e f16171l;

    /* renamed from: m  reason: collision with root package name */
    public zf1.b f16172m;

    /* renamed from: o  reason: collision with root package name */
    public z f16174o;

    /* renamed from: p  reason: collision with root package name */
    public g f16175p;

    /* renamed from: q  reason: collision with root package name */
    public String f16176q;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f16173n = new d0(p0.f86717a.b(h.class), new d(this), new wr.a(this, 28), new e(null, this));

    /* renamed from: r  reason: collision with root package name */
    public final b f16177r = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/zones/map/RobotMapReadyActivity$b", "Lyx0/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements yx0.b {
        public b() {
        }

        @Override // yx0.b
        public final void a(boolean z13) {
            cd.b.u(RobotMapReadyActivity.this, z13);
        }

        @Override // yx0.b
        public final void b(dj0.c<?> cVar) {
            RobotMapReadyActivity robotMapReadyActivity = RobotMapReadyActivity.this;
            z zVar = robotMapReadyActivity.f16174o;
            if (zVar != null) {
                zVar.r(robotMapReadyActivity, cVar);
            } else {
                r.i("robotCoordinator");
                throw null;
            }
        }

        @Override // yx0.b
        public final void c() {
            RobotMapReadyActivity robotMapReadyActivity = RobotMapReadyActivity.this;
            z zVar = robotMapReadyActivity.f16174o;
            if (zVar == null) {
                r.i("robotCoordinator");
                throw null;
            }
            String str = robotMapReadyActivity.f16176q;
            if (str == null) {
                r.i("mapId");
                throw null;
            }
            ym0.e eVar = new ym0.e(robotMapReadyActivity, 10);
            RobotZoneDefinitionActivity.a aVar = RobotZoneDefinitionActivity.f16146p;
            String str2 = zVar.f42726i;
            aVar.getClass();
            str2.getClass();
            Intent intent = new Intent(robotMapReadyActivity, RobotZoneDefinitionActivity.class);
            intent.putExtra("COORDINATOR_ID", str2);
            intent.putExtra("EXTRA_MAP_ID", str);
            z.w(robotMapReadyActivity, intent, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements p, x12.m {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof x12.m)) {
                return r.c(d(), ((x12.m) obj).d());
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16179f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f16179f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16179f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16180f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16181g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f16180f = aVar;
            this.f16181g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16180f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16181g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final f c1() {
        f fVar = this.f16169j;
        if (fVar != null) {
            return fVar;
        }
        r.i("robotMapReadyViewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RobotMapReadyActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID", "EXTRA_MAP_ID", "EXTRA_IS_FROM_ZONING_ONBOARDING");
        Intent intent2 = getIntent();
        intent2.getClass();
        this.f16176q = o0.y("EXTRA_MAP_ID", cd.b.I(intent2));
        String stringExtra = getIntent().getStringExtra("COORDINATOR_ID");
        z.f42723r.getClass();
        z a14 = z.a.a(stringExtra);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16174o = a14;
        av0.d dVar = a14.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        og0.b b13 = r1.b(s0Var);
        MachineType b14 = b2.b(s0Var);
        ow0.d d13 = dVar.d();
        ow0.b b15 = l8.b(dVar.f5515c);
        f0 f0Var = dVar.D3.get();
        y yVar = new y(s0Var.f9015a);
        xw0.t tVar = new xw0.t(t2.b(s0Var), new xw0.m());
        n0 n0Var = dVar.f5505a;
        hj.e eVar = dVar.V.get();
        n0Var.getClass();
        eVar.getClass();
        gy0.f fVar = new gy0.f(eVar);
        hj.e eVar2 = dVar.V.get();
        eVar2.getClass();
        gy0.d dVar2 = new gy0.d(fVar, new gy0.c(eVar2));
        u uVar = new u();
        tw0.t h13 = dVar.h();
        tw0.f fVar2 = new tw0.f();
        s0Var.getClass();
        this.f16169j = p9.a(e8Var, b13, b14, d13, b15, f0Var, yVar, tVar, dVar2, uVar, h13, fVar2, new k(new jf1.a(), new y(s0Var.f9015a), new i0()), dVar.b(), dVar.f());
        this.f16170k = new m();
        this.f16171l = dVar.V.get();
        this.f16172m = dVar.a();
        f c13 = c1();
        c13.G.setValue(c13, f.L[0], this.f16177r);
        q8.t d14 = q8.g.d(this, R.layout.activity_robot_map_ready);
        d14.getClass();
        g gVar = (g) d14;
        this.f16175p = gVar;
        gVar.l(c1());
        g gVar2 = this.f16175p;
        if (gVar2 == null) {
            r.i("binding");
            throw null;
        }
        d0 d0Var = this.f16173n;
        gVar2.m((h) d0Var.getValue());
        g gVar3 = this.f16175p;
        if (gVar3 == null) {
            r.i("binding");
            throw null;
        }
        DysonActionBar dysonActionBar = gVar3.f90688l;
        dysonActionBar.setUpIndicator(Integer.valueOf(getIntent().getBooleanExtra("EXTRA_IS_FROM_ZONING_ONBOARDING", false) ? R.drawable.ic_chevron_left_legacy : 0));
        dysonActionBar.x(this);
        m mVar = this.f16170k;
        if (mVar == null) {
            r.i("mapRenderer");
            throw null;
        }
        g gVar4 = this.f16175p;
        if (gVar4 == null) {
            r.i("binding");
            throw null;
        }
        MapLayerView mapLayerView = gVar4.f90684h;
        mapLayerView.getClass();
        mVar.f80321a = mapLayerView;
        g gVar5 = this.f16175p;
        if (gVar5 == null) {
            r.i("binding");
            throw null;
        }
        mVar.f80322b = gVar5.d;
        f c14 = c1();
        m mVar2 = this.f16170k;
        if (mVar2 == null) {
            r.i("mapRenderer");
            throw null;
        }
        c14.f80263k = mVar2;
        g gVar6 = this.f16175p;
        if (gVar6 == null) {
            r.i("binding");
            throw null;
        }
        gVar6.f90684h.setListener(new yx0.a(this));
        getLifecycle().a(c1());
        ((h) d0Var.getValue()).d.observe(this, new c(new yj0.f(this, 6)));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(c1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f16171l;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = za.f57815a;
        ij.b bVar = new ij.b("robot.zoning.ready_to_zone", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/map/RobotMapReadyActivity$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
