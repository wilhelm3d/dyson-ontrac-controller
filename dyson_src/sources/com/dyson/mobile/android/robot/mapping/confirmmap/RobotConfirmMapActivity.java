package com.dyson.mobile.android.robot.mapping.confirmmap;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.f2;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.robot.mapping.confirmmap.RobotConfirmMapActivity;
import com.dyson.mobile.android.robot.mapping.confirmmap.a;
import com.dyson.mobile.android.robot.menu.mappingandzoning.maps.MapManagementActivity;
import com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c;
import dz1.x;
import f.j;
import f.x;
import fm1.o0;
import h12.f0;
import hj.e;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import nj.fa;
import nl0.h;
import ny.a0;
import nz1.o;
import pw0.k;
import tw0.e0;
import we1.a;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import yy0.f;
import yy0.g;
import z32.g0;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/confirmmap/RobotConfirmMapActivity;", "Ll/b;", "<init>", "()V", "a", "Lnl0/h;", "Lh12/f0;", "removeMapState", "Lpw0/d;", "downloadMapState", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotConfirmMapActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f16063o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f16064j;

    /* renamed from: k  reason: collision with root package name */
    public e f16065k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f16066l = new d0(p0.f86717a.b(k.class), new c(this), new a0(this, 27), new d(null, this));

    /* renamed from: m  reason: collision with root package name */
    public z f16067m;

    /* renamed from: n  reason: collision with root package name */
    public String f16068n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<com.dyson.mobile.android.robot.mapping.confirmmap.a, f0> {
        public b(Object obj) {
            super(1, obj, RobotConfirmMapActivity.class, "confirmMapEventAction", "confirmMapEventAction(Lcom/dyson/mobile/android/robot/mapping/confirmmap/ConfirmMapEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.robot.mapping.confirmmap.a aVar) {
            com.dyson.mobile.android.robot.mapping.confirmmap.a aVar2 = aVar;
            aVar2.getClass();
            final RobotConfirmMapActivity robotConfirmMapActivity = (RobotConfirmMapActivity) this.receiver;
            a aVar3 = RobotConfirmMapActivity.f16063o;
            robotConfirmMapActivity.getClass();
            if (aVar2.equals(a.C0552a.f16072a)) {
                robotConfirmMapActivity.finish();
                robotConfirmMapActivity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            } else if (aVar2.equals(a.b.f16073a)) {
                cd.b.u(robotConfirmMapActivity, false);
            } else if (aVar2.equals(a.c.f16074a)) {
                final k c13 = robotConfirmMapActivity.c1();
                final String str = robotConfirmMapActivity.f16068n;
                if (str == null) {
                    r.i("mapId");
                    throw null;
                }
                o a13 = c13.e.a(str);
                s9.a a14 = v.a(c13);
                h42.b c14 = c13.f64854f.c();
                w12.a aVar4 = new w12.a() { // from class: pw0.i
                    @Override // w12.a
                    public final Object invoke() {
                        int i13 = r2;
                        k kVar = c13;
                        switch (i13) {
                            case 0:
                                kVar.f64858j.setValue(h.b.f57897a);
                                return f0.f36844a;
                            default:
                                f2 f2Var = kVar.f64858j;
                                f0 f0Var = f0.f36844a;
                                f2Var.l(null, new h.c(f0Var));
                                return f0Var;
                        }
                    }
                };
                Function1 function1 = new Function1() { // from class: pw0.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i13 = r3;
                        k kVar = c13;
                        String str2 = str;
                        Throwable th2 = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                th2.getClass();
                                Logger.b("Failed to delete map with id " + str2, th2);
                                kVar.f64858j.l(null, new h.a(th2));
                                return f0.f36844a;
                            default:
                                th2.getClass();
                                Logger.b("Failed to download map with id " + str2, th2);
                                kVar.f64860l.l(null, new h.a(th2));
                                return f0.f36844a;
                        }
                    }
                };
                w12.a aVar5 = new w12.a() { // from class: pw0.i
                    @Override // w12.a
                    public final Object invoke() {
                        int i13 = r2;
                        k kVar = c13;
                        switch (i13) {
                            case 0:
                                kVar.f64858j.setValue(h.b.f57897a);
                                return f0.f36844a;
                            default:
                                f2 f2Var = kVar.f64858j;
                                f0 f0Var = f0.f36844a;
                                f2Var.l(null, new h.c(f0Var));
                                return f0Var;
                        }
                    }
                };
                c14.getClass();
                g0.r(a14, new f(z32.z.Z0, function1), null, new g(aVar4, c14, aVar5, a13, null), 2);
            } else if (aVar2.equals(a.f.f16078a)) {
                z zVar = robotConfirmMapActivity.f16067m;
                if (zVar == null) {
                    r.i("robotCoordinator");
                    throw null;
                }
                String str2 = robotConfirmMapActivity.f16068n;
                if (str2 == null) {
                    r.i("mapId");
                    throw null;
                }
                zVar.t(robotConfirmMapActivity, str2, c.b.OOB_ZONING, new uf1.b() { // from class: pw0.f
                    @Override // uf1.b
                    public final void h(uf1.a aVar6) {
                        int i13 = r2;
                        RobotConfirmMapActivity robotConfirmMapActivity2 = robotConfirmMapActivity;
                        switch (i13) {
                            case 0:
                                RobotConfirmMapActivity.a aVar7 = RobotConfirmMapActivity.f16063o;
                                aVar6.getClass();
                                cd.b.A(robotConfirmMapActivity2, aVar6);
                                return;
                            default:
                                RobotConfirmMapActivity.a aVar8 = RobotConfirmMapActivity.f16063o;
                                cd.b.u(robotConfirmMapActivity2, false);
                                return;
                        }
                    }
                });
            } else if (aVar2.equals(a.d.f16075a)) {
                z zVar2 = robotConfirmMapActivity.f16067m;
                if (zVar2 == null) {
                    r.i("robotCoordinator");
                    throw null;
                }
                uf1.b bVar = new uf1.b() { // from class: pw0.f
                    @Override // uf1.b
                    public final void h(uf1.a aVar6) {
                        int i13 = r2;
                        RobotConfirmMapActivity robotConfirmMapActivity2 = robotConfirmMapActivity;
                        switch (i13) {
                            case 0:
                                RobotConfirmMapActivity.a aVar7 = RobotConfirmMapActivity.f16063o;
                                aVar6.getClass();
                                cd.b.A(robotConfirmMapActivity2, aVar6);
                                return;
                            default:
                                RobotConfirmMapActivity.a aVar8 = RobotConfirmMapActivity.f16063o;
                                cd.b.u(robotConfirmMapActivity2, false);
                                return;
                        }
                    }
                };
                MapManagementActivity.a aVar6 = MapManagementActivity.f16109w;
                String str3 = zVar2.f42726i;
                aVar6.getClass();
                z.w(robotConfirmMapActivity, MapManagementActivity.a.a(robotConfirmMapActivity, str3, true), bVar);
            } else if (!(aVar2 instanceof a.e)) {
                ma.e.o();
                return null;
            } else {
                final k c15 = robotConfirmMapActivity.c1();
                final String str4 = robotConfirmMapActivity.f16068n;
                if (str4 == null) {
                    r.i("mapId");
                    throw null;
                }
                a.e eVar = (a.e) aVar2;
                pw0.c cVar = eVar.f16076a;
                boolean z13 = eVar.f16077b;
                cVar.getClass();
                c15.f64860l.setValue(h.b.f57897a);
                x<e0> a15 = c15.f64855g.a(str4, z13);
                s9.a a16 = v.a(c15);
                h42.b c16 = c15.f64854f.c();
                Function1 function12 = new Function1() { // from class: pw0.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i13 = r3;
                        k kVar = c15;
                        String str22 = str4;
                        Throwable th2 = (Throwable) obj;
                        switch (i13) {
                            case 0:
                                th2.getClass();
                                Logger.b("Failed to delete map with id " + str22, th2);
                                kVar.f64858j.l(null, new h.a(th2));
                                return f0.f36844a;
                            default:
                                th2.getClass();
                                Logger.b("Failed to download map with id " + str22, th2);
                                kVar.f64860l.l(null, new h.a(th2));
                                return f0.f36844a;
                        }
                    }
                };
                ot0.a aVar7 = new ot0.a(20, c15, cVar);
                c16.getClass();
                g0.r(a16, null, null, new yy0.b(c16, function12, a15, a16, aVar7, null), 3);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16069f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f16069f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16069f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16070f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16071g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f16070f = aVar;
            this.f16071g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16070f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16071g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final k c1() {
        return (k) this.f16066l.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f.x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RobotConfirmMapActivity cannot be initialised without a coordinator";
        Bundle a14 = a13.a("COORDINATOR_ID", "MAP_ID");
        String y13 = o0.y("COORDINATOR_ID", a14);
        z.f42723r.getClass();
        z a15 = z.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16067m = a15;
        av0.d dVar = a15.f42732o.f42663a;
        this.f16064j = dVar.a();
        this.f16065k = dVar.V.get();
        this.f16068n = o0.y("MAP_ID", a14);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        g.f.a(this, new c4.c(1196606041, true, new n71.a(this, 17)));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        e eVar = this.f16065k;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = fa.f57482a;
        ij.b bVar = new ij.b("robot.mapping.confirm_mapping", null, 2, null);
        e.a aVar = e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/confirmmap/RobotConfirmMapActivity$a;", "", "<init>", "()V", "", "CONFIRM_MAP_TEST_TAG", "Ljava/lang/String;", "MAP_ID", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
