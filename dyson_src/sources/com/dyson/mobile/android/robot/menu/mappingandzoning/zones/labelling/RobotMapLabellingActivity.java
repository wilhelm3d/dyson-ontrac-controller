package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.labelling;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentManager;
import bv0.b2;
import bv0.e8;
import bv0.l8;
import bv0.r1;
import bv0.s0;
import bv0.t2;
import bv0.z9;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import com.dyson.mobile.android.robot.mapping.zones.view.MapLayerView;
import com.dyson.mobile.android.robot.menu.mappingandzoning.maps.maplist.mapitem.mapname.MapNameChoiceExtras;
import f.x;
import fm1.o0;
import h12.t;
import hj.e;
import iu0.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.ab;
import nj.xa;
import q8.g;
import rf0.j;
import se1.y;
import tw0.e0;
import tw0.m;
import we1.a;
import wx0.d;
import x12.r;
import xx0.f;
import z32.d2;
import z32.m1;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/labelling/RobotMapLabellingActivity;", "Ll/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotMapLabellingActivity extends l.b {

    /* renamed from: u  reason: collision with root package name */
    public static final a f16154u = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public f f16155j;

    /* renamed from: k  reason: collision with root package name */
    public pf0.c f16156k;

    /* renamed from: l  reason: collision with root package name */
    public m f16157l;

    /* renamed from: m  reason: collision with root package name */
    public e f16158m;

    /* renamed from: n  reason: collision with root package name */
    public z f16159n;

    /* renamed from: o  reason: collision with root package name */
    public yu0.e f16160o;

    /* renamed from: p  reason: collision with root package name */
    public d f16161p;

    /* renamed from: q  reason: collision with root package name */
    public d2 f16162q;

    /* renamed from: r  reason: collision with root package name */
    public final t f16163r = h12.m.b(new wr.a(this, 13));

    /* renamed from: s  reason: collision with root package name */
    public final b f16164s = new b();

    /* renamed from: t  reason: collision with root package name */
    public final c f16165t = new c();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/zones/labelling/RobotMapLabellingActivity$b", "Lwx0/d$b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements d.b {
        public b() {
        }

        @Override // wx0.d.b
        public final void a() {
            f d13 = RobotMapLabellingActivity.this.d1();
            e0 e0Var = d13.f80260h.f80312b;
            if (e0Var != null) {
                List<tw0.z> list = e0Var.f80302f;
                tw0.a.f(d13, list);
                d13.f80273u.m(xw0.c.a(d13.h(), list));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/zones/labelling/RobotMapLabellingActivity$c", "Lxx0/d;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements xx0.d {
        public c() {
        }

        @Override // xx0.d
        public final void a(boolean z13) {
            RobotMapLabellingActivity robotMapLabellingActivity = RobotMapLabellingActivity.this;
            ey0.b bVar = new ey0.b(robotMapLabellingActivity, z13, 1);
            a aVar = RobotMapLabellingActivity.f16154u;
            robotMapLabellingActivity.getClass();
            e.a a13 = new zs0.e(robotMapLabellingActivity).a();
            a13.f93107a = robotMapLabellingActivity.c1().d(j.f72037r1);
            a13.f93108b = robotMapLabellingActivity.c1().d(j.f72042s1);
            a13.c(robotMapLabellingActivity.c1().d(j.f72052u1), bVar);
            a13.b(robotMapLabellingActivity.c1().d(j.f72047t1), null);
            a13.a().show();
        }

        @Override // xx0.d
        public final void b(int i13) {
            RobotMapLabellingActivity robotMapLabellingActivity = RobotMapLabellingActivity.this;
            d dVar = robotMapLabellingActivity.f16161p;
            if (dVar == null) {
                r.i("robotMapRoomsDrawer");
                throw null;
            } else if (dVar.isAdded()) {
            } else {
                d dVar2 = robotMapLabellingActivity.f16161p;
                if (dVar2 == null) {
                    r.i("robotMapRoomsDrawer");
                    throw null;
                }
                FragmentManager supportFragmentManager = robotMapLabellingActivity.getSupportFragmentManager();
                d dVar3 = robotMapLabellingActivity.f16161p;
                if (dVar3 == null) {
                    r.i("robotMapRoomsDrawer");
                    throw null;
                }
                dVar2.show(supportFragmentManager, dVar3.getTag());
                d dVar4 = robotMapLabellingActivity.f16161p;
                if (dVar4 != null) {
                    dVar4.f86493j = Integer.valueOf(i13);
                } else {
                    r.i("robotMapRoomsDrawer");
                    throw null;
                }
            }
        }

        @Override // xx0.d
        public final void c(vx0.f fVar) {
            RobotMapLabellingActivity robotMapLabellingActivity = RobotMapLabellingActivity.this;
            e.a a13 = new zs0.e(robotMapLabellingActivity).a();
            a13.f93107a = robotMapLabellingActivity.c1().d(j.f72007l1);
            a13.f93108b = robotMapLabellingActivity.c1().d(j.f72012m1);
            a13.c(robotMapLabellingActivity.c1().d(j.f72022o1), fVar);
            a13.b(robotMapLabellingActivity.c1().d(j.f72017n1), null);
            a13.a().show();
        }

        @Override // xx0.d
        public final void d(NamingConfig<MapNameChoiceExtras> namingConfig) {
            namingConfig.getClass();
            RobotMapLabellingActivity robotMapLabellingActivity = RobotMapLabellingActivity.this;
            x00.a aVar = new x00.a(8, robotMapLabellingActivity, namingConfig);
            a aVar2 = RobotMapLabellingActivity.f16154u;
            hj.e eVar = robotMapLabellingActivity.f16158m;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            int i13 = ab.f57403a;
            ij.b bVar = new ij.b("robot.zoning.zoning_completed", null, 2, null);
            e.a aVar3 = hj.e.f38312g;
            eVar.h(bVar, null);
            String d = robotMapLabellingActivity.c1().d(robotMapLabellingActivity.d1().E.d);
            ow0.a aVar4 = (ow0.a) robotMapLabellingActivity.f16163r.getValue();
            ((PopupWindow) aVar4.f61679a.getValue()).showAtLocation(aVar4.a(), 17, 0, 0);
            ((DysonTextView) aVar4.a().findViewById(R.id.text_view_title)).setText(d);
            ViewPropertyAnimator animate = aVar4.a().animate();
            animate.setInterpolator(new LinearInterpolator());
            animate.setDuration(500L);
            animate.alpha(1.0f);
            animate.withEndAction(new xx0.b(robotMapLabellingActivity, aVar)).start();
        }
    }

    public final pf0.c c1() {
        pf0.c cVar = this.f16156k;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final f d1() {
        f fVar = this.f16155j;
        if (fVar != null) {
            return fVar;
        }
        r.i("robotMapLabellingViewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
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
        a13.f85710b = "RobotMapLabellingActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID", "EXTRA_MAP_ID");
        Intent intent2 = getIntent();
        intent2.getClass();
        String y13 = o0.y("EXTRA_MAP_ID", cd.b.I(intent2));
        Intent intent3 = getIntent();
        intent3.getClass();
        String y14 = o0.y("COORDINATOR_ID", cd.b.I(intent3));
        z.f42723r.getClass();
        z a14 = z.a.a(y14);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16159n = a14;
        av0.d dVar = a14.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        this.f16155j = z9.a(e8Var, r1.b(s0Var), b2.b(s0Var), dVar.d(), dVar.e(), l8.b(dVar.f5515c), new y(s0Var.f9015a), new xw0.t(t2.b(s0Var), new xw0.m()), dVar.D3.get(), dVar.h(), dVar.f(), dVar.V.get());
        this.f16156k = dVar.b();
        this.f16157l = new m();
        this.f16158m = dVar.V.get();
        f d13 = d1();
        d13.D.setValue(d13, f.H[0], this.f16165t);
        d13.G = new MapNameChoiceExtras(y14, y13);
        q8.t d = g.d(this, R.layout.activity_robot_map_labelling);
        d.getClass();
        yu0.e eVar = (yu0.e) d;
        this.f16160o = eVar;
        eVar.l(d1());
        yu0.e eVar2 = this.f16160o;
        if (eVar2 == null) {
            r.i("binding");
            throw null;
        }
        eVar2.f90649m.x(this);
        m mVar = this.f16157l;
        if (mVar == null) {
            r.i("mapRenderer");
            throw null;
        }
        yu0.e eVar3 = this.f16160o;
        if (eVar3 == null) {
            r.i("binding");
            throw null;
        }
        MapLayerView mapLayerView = eVar3.f90645i;
        mapLayerView.getClass();
        mVar.f80321a = mapLayerView;
        yu0.e eVar4 = this.f16160o;
        if (eVar4 == null) {
            r.i("binding");
            throw null;
        }
        mVar.f80322b = eVar4.d;
        mVar.f80323c = eVar4.f90643g;
        f d14 = d1();
        m mVar2 = this.f16157l;
        if (mVar2 == null) {
            r.i("mapRenderer");
            throw null;
        }
        d14.f80263k = mVar2;
        yu0.e eVar5 = this.f16160o;
        if (eVar5 == null) {
            r.i("binding");
            throw null;
        }
        eVar5.f90645i.setListener(new xx0.a(this));
        getLifecycle().a(d1());
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        d.f86489m.getClass();
        d dVar2 = new d();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", y14);
        dVar2.setArguments(bundle2);
        this.f16161p = dVar2;
        dVar2.f86494k.setValue(dVar2, d.f86490n[0], this.f16164s);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        d2 d2Var = this.f16162q;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        getLifecycle().c(d1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f16158m;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = xa.f57785a;
        ij.b bVar = new ij.b("robot.zoning.label_your_zones", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
        return false;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/labelling/RobotMapLabellingActivity$a;", "", "<init>", "()V", "", "COMPLETION_VIEW_DURATION_MILLIS", "J", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
