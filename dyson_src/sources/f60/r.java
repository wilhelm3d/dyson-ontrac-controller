package f60;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.v;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.robot.cloud.newsystem.common.Point;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ActivityHistoryDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ConfirmMapDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.DoNotDisturbDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.DockCommissioningDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.EditFurnitureDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.MachineSettingsDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRoomsDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRulesDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.MapManagementDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ProductHubDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.RenameMapDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.RenameRoomDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.RobotRemoveMachineDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ScheduleCleanDestination$Graph;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ScheduleCleanDestination$ScheduleForm;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.StartCleanDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.VoiceSettingsDestination;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ZoomMapViewDestination;
import com.google.gson.Gson;
import h12.f0;
import hu.j2;
import i12.c0;
import i12.e0;
import j3.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks.d0;
import kz1.b;
import lb.s;
import m9.w;
import mc1.k;
import u3.h1;
import u3.i1;
import u3.k1;
import u3.p1;
import vs.k;
import x12.m0;
import x12.n0;
import xz0.l;
import y9.a0;
import y9.o0;
import y9.q0;
import y9.z;
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f29991f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f29992g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Object f29993h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f29994i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f29995j;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i13) {
        this.d = i13;
        this.e = obj;
        this.f29991f = obj2;
        this.f29992g = obj3;
        this.f29993h = obj4;
        this.f29994i = obj5;
        this.f29995j = obj6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mc1.k dVar;
        int i13 = this.d;
        int i14 = 0;
        Object obj2 = this.f29995j;
        Object obj3 = this.f29994i;
        Object obj4 = this.f29993h;
        Object obj5 = this.f29992g;
        Object obj6 = this.f29991f;
        Object obj7 = this.e;
        Float f13 = null;
        int i15 = 1;
        switch (i13) {
            case 0:
                n0 n0Var = (n0) obj7;
                s sVar = (s) obj6;
                com.dyson.mobile.android.connectivity.ble.b bVar = (com.dyson.mobile.android.connectivity.ble.b) obj5;
                h0 h0Var = (h0) obj4;
                MachineSerial machineSerial = (MachineSerial) obj3;
                byte[] bArr = (byte[]) obj2;
                m60.j jVar = (m60.j) obj;
                int i16 = s.f29996f;
                jVar.getClass();
                boolean z13 = jVar instanceof m60.o;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (z13) {
                    long j8 = n0Var.d;
                    int i17 = se1.n0.f76055a;
                    Logger.a("Received Payload B response in " + (System.currentTimeMillis() - j8) + " ms");
                    n0 n0Var2 = new n0();
                    m60.k a13 = ((m60.o) jVar).a(h0Var);
                    byte[] bArr2 = h0Var.f29949b;
                    byte[] bArr3 = a13.f53158b;
                    bArr3.getClass();
                    sz1.z s13 = bVar.v(new m60.l(c60.b.b(bArr2, bArr3, null)), sVar.f29999c).s(7000L, timeUnit);
                    h hVar = new h(new q(n0Var2, 3), 15);
                    b.a aVar = kz1.b.f50218a;
                    return new sz1.x(new sz1.k(new sz1.j(s13, hVar), new h(new q(n0Var2, 0), 6)), new h(new e(18), 7));
                } else if (!(jVar instanceof m60.h)) {
                    pa.c.w("Neither Payload B nor Payload 2 received");
                    return null;
                } else {
                    long j13 = n0Var.d;
                    int i18 = se1.n0.f76055a;
                    Logger.a("Received Payload 2 response in " + (System.currentTimeMillis() - j13) + " ms");
                    n0 n0Var3 = new n0();
                    j60.d dVar2 = sVar.f29997a;
                    dz1.x<m60.m> c13 = dVar2.f44008a.c(machineSerial.d, (m60.h) jVar);
                    iw0.l lVar = new iw0.l(new p0(5), 14);
                    c13.getClass();
                    b.a aVar2 = kz1.b.f50218a;
                    return new sz1.m(new sz1.x(new sz1.j(new sz1.j(c13, lVar).s(7000L, timeUnit), new h(new q(n0Var3, 1), 8)), new h(new e(19), 9)), new h(new c90.b0(n0Var3, sVar, machineSerial, bVar, bArr, 4), 10));
                }
            case 1:
                h1 h1Var = (h1) obj6;
                h1 h1Var2 = (h1) obj5;
                float[] fArr = (float[]) obj4;
                k1 k1Var = (k1) obj3;
                d22.f fVar = (d22.f) obj2;
                float floatValue = ((Float) obj).floatValue();
                float max = Math.max(((i1) obj7).F(), 0.0f);
                float min = Math.min(0.0f, max);
                h1Var.s(h1Var2.k() + h1Var.k() + floatValue);
                h1Var2.s(0.0f);
                ja1.j jVar2 = ja1.j.f44153a;
                float k13 = h1Var.k();
                jVar2.getClass();
                if (fArr.length != 0) {
                    float f14 = fArr[0];
                    int length = fArr.length - 1;
                    if (length == 0) {
                        f13 = Float.valueOf(f14);
                    } else {
                        float abs = Math.abs(se1.h0.e(min, max, f14) - k13);
                        if (1 <= length) {
                            while (true) {
                                float f15 = fArr[i15];
                                float abs2 = Math.abs(se1.h0.e(min, max, f15) - k13);
                                if (Float.compare(abs, abs2) > 0) {
                                    f14 = f15;
                                    abs = abs2;
                                }
                                if (i15 != length) {
                                    i15++;
                                }
                            }
                        }
                        f13 = Float.valueOf(f14);
                    }
                }
                if (f13 != null) {
                    k13 = se1.h0.e(min, max, f13.floatValue());
                }
                ((Function1) k1Var.getValue()).invoke(Float.valueOf(se1.h0.e(((Number) fVar.j()).floatValue(), ((Number) fVar.n()).floatValue(), se1.h0.b(min, max, k13))));
                return h12.f0.f36844a;
            case 2:
                vs.j jVar3 = (vs.j) obj7;
                String str = (String) obj6;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                d0.g gVar = (d0.g) obj3;
                k1 k1Var2 = (k1) obj2;
                nc1.f fVar2 = (nc1.f) obj;
                fVar2.getClass();
                Boolean bool = jVar3.f84851b;
                if (bool != null) {
                    nc1.f.f(fVar2, str2, new k.f(bool.booleanValue(), new oc0.c(gVar, 5)), null, null, str3, false, "TEST_TAG_FLOORCARE_TASK_DETECT_SETTING", 44);
                }
                vs.k kVar = jVar3.f84850a;
                if (kVar instanceof k.a) {
                    dVar = new k.b(((k.a) kVar).f84854b, new j11.d0(k1Var2, 24));
                } else if (!x12.r.c(kVar, k.b.f84856a)) {
                    ma.e.o();
                    return null;
                } else {
                    dVar = new k.d("...", null, 2, null);
                }
                nc1.f.f(fVar2, str, dVar, null, null, null, false, null, 124);
                return h12.f0.f36844a;
            case 3:
                androidx.compose.ui.layout.v[] vVarArr = (androidx.compose.ui.layout.v[]) obj7;
                List list = (List) obj6;
                androidx.compose.ui.layout.s sVar2 = (androidx.compose.ui.layout.s) obj5;
                m0 m0Var = (m0) obj4;
                m0 m0Var2 = (m0) obj3;
                p2.k kVar2 = (p2.k) obj2;
                v.a aVar3 = (v.a) obj;
                int length2 = vVarArr.length;
                int i19 = 0;
                while (i14 < length2) {
                    androidx.compose.ui.layout.v vVar = vVarArr[i14];
                    vVar.getClass();
                    p2.i.b(aVar3, vVar, (d5.b0) list.get(i19), sVar2.getLayoutDirection(), m0Var.d, m0Var2.d, kVar2.f62686a);
                    i14++;
                    i19++;
                }
                return h12.f0.f36844a;
            default:
                final q0 q0Var = (q0) obj7;
                ViewModelProvider.Factory factory = (ViewModelProvider.Factory) obj6;
                final w12.a aVar4 = (w12.a) obj5;
                final Function1 function1 = (Function1) obj4;
                w12.a aVar5 = (w12.a) obj3;
                Function1 function12 = (Function1) obj2;
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                q0Var.getClass();
                aVar4.getClass();
                c4.c cVar = new c4.c(1010855399, true, new c21.g(factory, q0Var, aVar4, 7));
                i12.e0 e0Var = i12.e0.d;
                p21.b bVar2 = p21.b.d;
                p21.c cVar2 = p21.c.d;
                p21.d dVar3 = p21.d.d;
                p21.e eVar = p21.e.d;
                i12.f0 f0Var = i12.f0.d;
                f0Var.getClass();
                x12.q0 q0Var2 = x12.p0.f86717a;
                aa.o.a(o0Var, q0Var2.b(StartCleanDestination.EditCleanSettings.class), f0Var, e0Var, bVar2, cVar2, dVar3, eVar, cVar);
                aa.o.a(o0Var, q0Var2.b(StartCleanDestination.EditZoneCleanSettings.class), f0Var, e0Var, p21.g.d, p21.h.d, p21.i.d, p21.j.d, new c4.c(-2047297699, true, new j2(q0Var, aVar4, 1)));
                u12.a.j(o0Var, q0Var2.b(MapManagementDestination.Graph.class), MapManagementDestination.MapManagement.INSTANCE, f0Var, new m01.b(factory, aVar4, q0Var));
                aa.o.a(o0Var, q0Var2.b(ZoomMapViewDestination.Graph.class), f0Var, e0Var, x31.a.d, x31.b.d, x31.c.d, x31.d.d, new c4.c(629228855, true, new j2(aVar4, q0Var, 6)));
                function1.getClass();
                u12.a.j(o0Var, q0Var2.b(ScheduleCleanDestination$Graph.class), new ScheduleCleanDestination$ScheduleForm("", (Integer) null, 2, (DefaultConstructorMarker) null), f0Var, new b31.j(factory, q0Var, aVar4, function1, 2));
                u12.a.j(o0Var, q0Var2.b(ManageRoomsDestination.Graph.class), new ManageRoomsDestination.ManageRooms(""), f0Var, new rm0.f(22, q0Var, aVar4));
                aa.o.a(o0Var, q0Var2.b(ManageRulesDestination.Graph.class), f0Var, e0Var, w01.b.d, w01.c.d, w01.d.d, w01.e.d, new c4.c(948019938, true, new w12.o() { // from class: w01.a
                    @Override // w12.o
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        k1 k1Var3;
                        int i23 = r4;
                        Composer.a aVar6 = Composer.f3140a;
                        switch (i23) {
                            case 0:
                                z zVar = (z) obj9;
                                Composer composer = (Composer) obj10;
                                s.m((Integer) obj11, (g2.d) obj8, zVar);
                                p1 p1Var = androidx.compose.runtime.b.f3172a;
                                iu0.z zVar2 = (iu0.z) composer.A(s21.b.f74871b);
                                x12.q0 q0Var3 = x12.p0.f86717a;
                                ManageRulesDestination.Graph graph = (ManageRulesDestination.Graph) a0.a(zVar, q0Var3.b(ManageRulesDestination.Graph.class));
                                ManageRulesDestination.a aVar7 = ManageRulesDestination.f16502l0;
                                String str4 = graph.f16504f;
                                aVar7.getClass();
                                Point point = str4 != null ? (Point) new Gson().fromJson(str4, new r11.a().getType()) : null;
                                av0.d dVar4 = zVar2.f42732o.f42663a;
                                r9.a.f70754a.getClass();
                                w a14 = r9.a.a(composer);
                                if (a14 == null) {
                                    pa.c.w("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                com.dyson.mobile.android.robot.newsystem.managerules.f fVar3 = (com.dyson.mobile.android.robot.newsystem.managerules.f) r9.b.a(q0Var3.b(com.dyson.mobile.android.robot.newsystem.managerules.f.class), a14, new j(graph, point, dVar4), a14 instanceof androidx.lifecycle.g ? ((androidx.lifecycle.g) a14).getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c, composer);
                                k1 c14 = n9.b.c(fVar3.f16419r, composer);
                                k1 a15 = n9.b.a(fVar3.f16422u, e0.d, composer);
                                k1 c15 = n9.b.c(fVar3.f16417p, composer);
                                k1 c16 = n9.b.c(fVar3.A, composer);
                                k1 c17 = n9.b.c(fVar3.f16426y, composer);
                                k1 c18 = n9.b.c(fVar3.B, composer);
                                Object B = composer.B();
                                aVar6.getClass();
                                Object obj12 = Composer.a.f3142b;
                                if (B == obj12) {
                                    B = androidx.compose.runtime.d.j(Boolean.valueOf(point == null));
                                    composer.u(B);
                                }
                                k1 k1Var4 = (k1) B;
                                if (((Boolean) k1Var4.getValue()).booleanValue()) {
                                    composer.R(-1241449512);
                                    boolean D = composer.D(fVar3);
                                    Object B2 = composer.B();
                                    if (D || B2 == obj12) {
                                        B2 = new f(fVar3);
                                        composer.u(B2);
                                    }
                                    e22.g gVar2 = (e22.g) B2;
                                    List A0 = c0.A0(((com.dyson.mobile.android.robot.newsystem.managerules.b) c15.getValue()).f16386a.f40769b);
                                    boolean D2 = composer.D(fVar3);
                                    Object B3 = composer.B();
                                    if (D2 || B3 == obj12) {
                                        B3 = new vk.i(7, fVar3, k1Var4);
                                        composer.u(B3);
                                    }
                                    Function1 function13 = (Function1) B3;
                                    w12.a aVar8 = (w12.a) gVar2;
                                    Object B4 = composer.B();
                                    if (B4 == obj12) {
                                        B4 = new pw0.g(k1Var4, 19);
                                        composer.u(B4);
                                    }
                                    v01.a.a(A0, function13, aVar8, (w12.a) B4, composer, 3072);
                                    composer.K();
                                } else {
                                    composer.R(-1240970624);
                                    composer.K();
                                }
                                c42.e eVar2 = fVar3.f16415n;
                                q0 q0Var4 = q0Var;
                                boolean D3 = composer.D(q0Var4);
                                w12.a aVar9 = aVar4;
                                Function1 function14 = function1;
                                boolean Q = D3 | composer.Q(aVar9) | composer.Q(function14);
                                Object B5 = composer.B();
                                if (Q || B5 == obj12) {
                                    B5 = new g(q0Var4, aVar9, function14, k1Var4, null);
                                    composer.u(B5);
                                }
                                af1.b.a(eVar2, null, (Function2) B5, composer, 0, 2);
                                String str5 = (String) c18.getValue();
                                com.dyson.mobile.android.robot.newsystem.managerules.b bVar3 = (com.dyson.mobile.android.robot.newsystem.managerules.b) c15.getValue();
                                boolean booleanValue = ((Boolean) c16.getValue()).booleanValue();
                                nl0.h hVar2 = (nl0.h) c14.getValue();
                                List list2 = (List) a15.getValue();
                                m4.c cVar3 = (m4.c) c17.getValue();
                                boolean D4 = composer.D(fVar3);
                                Object B6 = composer.B();
                                if (D4 || B6 == obj12) {
                                    B6 = new h(fVar3);
                                    composer.u(B6);
                                }
                                e22.g gVar3 = (e22.g) B6;
                                boolean D5 = composer.D(fVar3);
                                Object B7 = composer.B();
                                if (D5 || B7 == obj12) {
                                    B7 = new i(fVar3);
                                    composer.u(B7);
                                }
                                com.dyson.mobile.android.robot.newsystem.managerules.e.e(hVar2, list2, bVar3, str5, booleanValue, (Function1) gVar3, cVar3, (w12.a) ((e22.g) B7), composer, 0);
                                return f0.f36844a;
                            default:
                                z zVar3 = (z) obj9;
                                Composer composer2 = (Composer) obj10;
                                s.m((Integer) obj11, (g2.d) obj8, zVar3);
                                p1 p1Var2 = androidx.compose.runtime.b.f3172a;
                                x12.q0 q0Var5 = x12.p0.f86717a;
                                EditFurnitureDestination.Graph graph2 = (EditFurnitureDestination.Graph) a0.a(zVar3, q0Var5.b(EditFurnitureDestination.Graph.class));
                                av0.d dVar5 = ((iu0.z) composer2.A(s21.b.f74871b)).f42732o.f42663a;
                                r9.a.f70754a.getClass();
                                w a16 = r9.a.a(composer2);
                                if (a16 == null) {
                                    pa.c.w("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                l lVar2 = (l) r9.b.a(q0Var5.b(l.class), a16, new yz0.h(graph2, dVar5), a16 instanceof androidx.lifecycle.g ? ((androidx.lifecycle.g) a16).getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c, composer2);
                                k1 c19 = n9.b.c(lVar2.f88372q, composer2);
                                k1 c23 = n9.b.c(lVar2.f88370o, composer2);
                                k1 c24 = n9.b.c(lVar2.f88374s, composer2);
                                k1 c25 = n9.b.c(lVar2.f88376u, composer2);
                                k1 c26 = n9.b.c(lVar2.f88378w, composer2);
                                k1 b13 = androidx.compose.runtime.d.b(lVar2.f88380y, composer2);
                                k1 c27 = n9.b.c(lVar2.A, composer2);
                                Object B8 = composer2.B();
                                aVar6.getClass();
                                Object obj13 = Composer.a.f3142b;
                                if (B8 == obj13) {
                                    B8 = androidx.compose.runtime.d.j(Boolean.TRUE);
                                    composer2.u(B8);
                                }
                                k1 k1Var5 = (k1) B8;
                                if (((Boolean) k1Var5.getValue()).booleanValue()) {
                                    composer2.R(-1355628036);
                                    ArrayList arrayList = lVar2.D;
                                    List<l11.j> list3 = lVar2.E;
                                    l11.c cVar4 = (l11.c) b13.getValue();
                                    boolean D6 = composer2.D(lVar2);
                                    Object B9 = composer2.B();
                                    if (D6 || B9 == obj13) {
                                        B9 = new yj0.f(lVar2, 8);
                                        composer2.u(B9);
                                    }
                                    Function1 function15 = (Function1) B9;
                                    boolean D7 = composer2.D(lVar2);
                                    Object B10 = composer2.B();
                                    if (D7 || B10 == obj13) {
                                        B10 = new yp.a(1, lVar2, k1Var5);
                                        composer2.u(B10);
                                    }
                                    Function1 function16 = (Function1) B10;
                                    Object B11 = composer2.B();
                                    if (B11 == obj13) {
                                        B11 = new xv.a(k1Var5, 4);
                                        composer2.u(B11);
                                    }
                                    k1Var3 = k1Var5;
                                    xz0.b.a(arrayList, list3, cVar4, function15, function16, (w12.a) B11, composer2, 196608);
                                    composer2.K();
                                } else {
                                    k1Var3 = k1Var5;
                                    composer2.R(-1354878146);
                                    composer2.K();
                                }
                                c42.e eVar3 = lVar2.f88367l;
                                q0 q0Var6 = q0Var;
                                boolean D8 = composer2.D(q0Var6);
                                w12.a aVar10 = aVar4;
                                Function1 function17 = function1;
                                boolean Q2 = D8 | composer2.Q(aVar10) | composer2.Q(function17);
                                Object B12 = composer2.B();
                                if (Q2 || B12 == obj13) {
                                    B12 = new yz0.e(q0Var6, aVar10, function17, k1Var3, null);
                                    composer2.u(B12);
                                }
                                af1.b.a(eVar3, null, (Function2) B12, composer2, 0, 2);
                                nl0.h hVar3 = (nl0.h) c19.getValue();
                                List list4 = (List) c23.getValue();
                                l.b bVar4 = (l.b) c24.getValue();
                                l.b bVar5 = (l.b) c25.getValue();
                                Throwable th2 = (Throwable) c26.getValue();
                                boolean booleanValue2 = ((Boolean) c27.getValue()).booleanValue();
                                boolean D9 = composer2.D(lVar2);
                                Object B13 = composer2.B();
                                if (D9 || B13 == obj13) {
                                    B13 = new yz0.f(lVar2);
                                    composer2.u(B13);
                                }
                                Function1 function18 = (Function1) ((e22.g) B13);
                                boolean D10 = composer2.D(lVar2);
                                Object B14 = composer2.B();
                                if (D10 || B14 == obj13) {
                                    B14 = new yz0.g(lVar2);
                                    composer2.u(B14);
                                }
                                xz0.k.d(hVar3, list4, null, bVar4, bVar5, th2, booleanValue2, function18, (w12.a) ((e22.g) B14), composer2, 0);
                                return f0.f36844a;
                        }
                    }
                }));
                aa.o.a(o0Var, q0Var2.b(EditFurnitureDestination.Graph.class), f0Var, e0Var, yz0.a.d, yz0.b.d, yz0.c.d, yz0.d.d, new c4.c(1187338244, true, new w12.o() { // from class: w01.a
                    @Override // w12.o
                    public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                        k1 k1Var3;
                        int i23 = r4;
                        Composer.a aVar6 = Composer.f3140a;
                        switch (i23) {
                            case 0:
                                z zVar = (z) obj9;
                                Composer composer = (Composer) obj10;
                                s.m((Integer) obj11, (g2.d) obj8, zVar);
                                p1 p1Var = androidx.compose.runtime.b.f3172a;
                                iu0.z zVar2 = (iu0.z) composer.A(s21.b.f74871b);
                                x12.q0 q0Var3 = x12.p0.f86717a;
                                ManageRulesDestination.Graph graph = (ManageRulesDestination.Graph) a0.a(zVar, q0Var3.b(ManageRulesDestination.Graph.class));
                                ManageRulesDestination.a aVar7 = ManageRulesDestination.f16502l0;
                                String str4 = graph.f16504f;
                                aVar7.getClass();
                                Point point = str4 != null ? (Point) new Gson().fromJson(str4, new r11.a().getType()) : null;
                                av0.d dVar4 = zVar2.f42732o.f42663a;
                                r9.a.f70754a.getClass();
                                w a14 = r9.a.a(composer);
                                if (a14 == null) {
                                    pa.c.w("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                com.dyson.mobile.android.robot.newsystem.managerules.f fVar3 = (com.dyson.mobile.android.robot.newsystem.managerules.f) r9.b.a(q0Var3.b(com.dyson.mobile.android.robot.newsystem.managerules.f.class), a14, new j(graph, point, dVar4), a14 instanceof androidx.lifecycle.g ? ((androidx.lifecycle.g) a14).getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c, composer);
                                k1 c14 = n9.b.c(fVar3.f16419r, composer);
                                k1 a15 = n9.b.a(fVar3.f16422u, e0.d, composer);
                                k1 c15 = n9.b.c(fVar3.f16417p, composer);
                                k1 c16 = n9.b.c(fVar3.A, composer);
                                k1 c17 = n9.b.c(fVar3.f16426y, composer);
                                k1 c18 = n9.b.c(fVar3.B, composer);
                                Object B = composer.B();
                                aVar6.getClass();
                                Object obj12 = Composer.a.f3142b;
                                if (B == obj12) {
                                    B = androidx.compose.runtime.d.j(Boolean.valueOf(point == null));
                                    composer.u(B);
                                }
                                k1 k1Var4 = (k1) B;
                                if (((Boolean) k1Var4.getValue()).booleanValue()) {
                                    composer.R(-1241449512);
                                    boolean D = composer.D(fVar3);
                                    Object B2 = composer.B();
                                    if (D || B2 == obj12) {
                                        B2 = new f(fVar3);
                                        composer.u(B2);
                                    }
                                    e22.g gVar2 = (e22.g) B2;
                                    List A0 = c0.A0(((com.dyson.mobile.android.robot.newsystem.managerules.b) c15.getValue()).f16386a.f40769b);
                                    boolean D2 = composer.D(fVar3);
                                    Object B3 = composer.B();
                                    if (D2 || B3 == obj12) {
                                        B3 = new vk.i(7, fVar3, k1Var4);
                                        composer.u(B3);
                                    }
                                    Function1 function13 = (Function1) B3;
                                    w12.a aVar8 = (w12.a) gVar2;
                                    Object B4 = composer.B();
                                    if (B4 == obj12) {
                                        B4 = new pw0.g(k1Var4, 19);
                                        composer.u(B4);
                                    }
                                    v01.a.a(A0, function13, aVar8, (w12.a) B4, composer, 3072);
                                    composer.K();
                                } else {
                                    composer.R(-1240970624);
                                    composer.K();
                                }
                                c42.e eVar2 = fVar3.f16415n;
                                q0 q0Var4 = q0Var;
                                boolean D3 = composer.D(q0Var4);
                                w12.a aVar9 = aVar4;
                                Function1 function14 = function1;
                                boolean Q = D3 | composer.Q(aVar9) | composer.Q(function14);
                                Object B5 = composer.B();
                                if (Q || B5 == obj12) {
                                    B5 = new g(q0Var4, aVar9, function14, k1Var4, null);
                                    composer.u(B5);
                                }
                                af1.b.a(eVar2, null, (Function2) B5, composer, 0, 2);
                                String str5 = (String) c18.getValue();
                                com.dyson.mobile.android.robot.newsystem.managerules.b bVar3 = (com.dyson.mobile.android.robot.newsystem.managerules.b) c15.getValue();
                                boolean booleanValue = ((Boolean) c16.getValue()).booleanValue();
                                nl0.h hVar2 = (nl0.h) c14.getValue();
                                List list2 = (List) a15.getValue();
                                m4.c cVar3 = (m4.c) c17.getValue();
                                boolean D4 = composer.D(fVar3);
                                Object B6 = composer.B();
                                if (D4 || B6 == obj12) {
                                    B6 = new h(fVar3);
                                    composer.u(B6);
                                }
                                e22.g gVar3 = (e22.g) B6;
                                boolean D5 = composer.D(fVar3);
                                Object B7 = composer.B();
                                if (D5 || B7 == obj12) {
                                    B7 = new i(fVar3);
                                    composer.u(B7);
                                }
                                com.dyson.mobile.android.robot.newsystem.managerules.e.e(hVar2, list2, bVar3, str5, booleanValue, (Function1) gVar3, cVar3, (w12.a) ((e22.g) B7), composer, 0);
                                return f0.f36844a;
                            default:
                                z zVar3 = (z) obj9;
                                Composer composer2 = (Composer) obj10;
                                s.m((Integer) obj11, (g2.d) obj8, zVar3);
                                p1 p1Var2 = androidx.compose.runtime.b.f3172a;
                                x12.q0 q0Var5 = x12.p0.f86717a;
                                EditFurnitureDestination.Graph graph2 = (EditFurnitureDestination.Graph) a0.a(zVar3, q0Var5.b(EditFurnitureDestination.Graph.class));
                                av0.d dVar5 = ((iu0.z) composer2.A(s21.b.f74871b)).f42732o.f42663a;
                                r9.a.f70754a.getClass();
                                w a16 = r9.a.a(composer2);
                                if (a16 == null) {
                                    pa.c.w("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                    return null;
                                }
                                l lVar2 = (l) r9.b.a(q0Var5.b(l.class), a16, new yz0.h(graph2, dVar5), a16 instanceof androidx.lifecycle.g ? ((androidx.lifecycle.g) a16).getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c, composer2);
                                k1 c19 = n9.b.c(lVar2.f88372q, composer2);
                                k1 c23 = n9.b.c(lVar2.f88370o, composer2);
                                k1 c24 = n9.b.c(lVar2.f88374s, composer2);
                                k1 c25 = n9.b.c(lVar2.f88376u, composer2);
                                k1 c26 = n9.b.c(lVar2.f88378w, composer2);
                                k1 b13 = androidx.compose.runtime.d.b(lVar2.f88380y, composer2);
                                k1 c27 = n9.b.c(lVar2.A, composer2);
                                Object B8 = composer2.B();
                                aVar6.getClass();
                                Object obj13 = Composer.a.f3142b;
                                if (B8 == obj13) {
                                    B8 = androidx.compose.runtime.d.j(Boolean.TRUE);
                                    composer2.u(B8);
                                }
                                k1 k1Var5 = (k1) B8;
                                if (((Boolean) k1Var5.getValue()).booleanValue()) {
                                    composer2.R(-1355628036);
                                    ArrayList arrayList = lVar2.D;
                                    List<l11.j> list3 = lVar2.E;
                                    l11.c cVar4 = (l11.c) b13.getValue();
                                    boolean D6 = composer2.D(lVar2);
                                    Object B9 = composer2.B();
                                    if (D6 || B9 == obj13) {
                                        B9 = new yj0.f(lVar2, 8);
                                        composer2.u(B9);
                                    }
                                    Function1 function15 = (Function1) B9;
                                    boolean D7 = composer2.D(lVar2);
                                    Object B10 = composer2.B();
                                    if (D7 || B10 == obj13) {
                                        B10 = new yp.a(1, lVar2, k1Var5);
                                        composer2.u(B10);
                                    }
                                    Function1 function16 = (Function1) B10;
                                    Object B11 = composer2.B();
                                    if (B11 == obj13) {
                                        B11 = new xv.a(k1Var5, 4);
                                        composer2.u(B11);
                                    }
                                    k1Var3 = k1Var5;
                                    xz0.b.a(arrayList, list3, cVar4, function15, function16, (w12.a) B11, composer2, 196608);
                                    composer2.K();
                                } else {
                                    k1Var3 = k1Var5;
                                    composer2.R(-1354878146);
                                    composer2.K();
                                }
                                c42.e eVar3 = lVar2.f88367l;
                                q0 q0Var6 = q0Var;
                                boolean D8 = composer2.D(q0Var6);
                                w12.a aVar10 = aVar4;
                                Function1 function17 = function1;
                                boolean Q2 = D8 | composer2.Q(aVar10) | composer2.Q(function17);
                                Object B12 = composer2.B();
                                if (Q2 || B12 == obj13) {
                                    B12 = new yz0.e(q0Var6, aVar10, function17, k1Var3, null);
                                    composer2.u(B12);
                                }
                                af1.b.a(eVar3, null, (Function2) B12, composer2, 0, 2);
                                nl0.h hVar3 = (nl0.h) c19.getValue();
                                List list4 = (List) c23.getValue();
                                l.b bVar4 = (l.b) c24.getValue();
                                l.b bVar5 = (l.b) c25.getValue();
                                Throwable th2 = (Throwable) c26.getValue();
                                boolean booleanValue2 = ((Boolean) c27.getValue()).booleanValue();
                                boolean D9 = composer2.D(lVar2);
                                Object B13 = composer2.B();
                                if (D9 || B13 == obj13) {
                                    B13 = new yz0.f(lVar2);
                                    composer2.u(B13);
                                }
                                Function1 function18 = (Function1) ((e22.g) B13);
                                boolean D10 = composer2.D(lVar2);
                                Object B14 = composer2.B();
                                if (D10 || B14 == obj13) {
                                    B14 = new yz0.g(lVar2);
                                    composer2.u(B14);
                                }
                                xz0.k.d(hVar3, list4, null, bVar4, bVar5, th2, booleanValue2, function18, (w12.a) ((e22.g) B14), composer2, 0);
                                return f0.f36844a;
                        }
                    }
                }));
                aa.o.a(o0Var, q0Var2.b(ConfirmMapDestination.Root.class), f0Var, e0Var, t01.b.d, t01.c.d, t01.d.d, t01.e.d, new c4.c(-1523607776, true, new j2(aVar4, q0Var, 2)));
                u12.a.j(o0Var, q0Var2.b(RenameRoomDestination.Graph.class), new RenameRoomDestination.RoomNameSelection((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null), f0Var, new a90.h(q0Var, 8));
                u12.a.j(o0Var, q0Var2.b(RenameMapDestination.Graph.class), new RenameMapDestination.MapNameSelection((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null), f0Var, new tv1.f(27, aVar4, function1));
                aa.o.a(o0Var, q0Var2.b(MachineSettingsDestination.MopSettings.class), f0Var, e0Var, j21.a.d, j21.b.d, j21.c.d, j21.d.d, new c4.c(987512830, true, new c21.g(factory, q0Var, aVar4, 3)));
                aa.o.a(o0Var, q0Var2.b(MachineSettingsDestination.DockSettings.class), f0Var, e0Var, j21.e.d, j21.f.d, j21.g.d, j21.h.d, new c4.c(276903093, true, new c21.g(factory, aVar4, q0Var, 4)));
                aa.o.a(o0Var, q0Var2.b(DockCommissioningDestination.DockCommissioningIntro.class), f0Var, e0Var, g21.b.d, g21.c.d, g21.d.d, g21.e.d, new c4.c(2050280380, true, new c21.g(factory, q0Var, aVar4, 2)));
                aVar5.getClass();
                u12.a.j(o0Var, q0Var2.b(VoiceSettingsDestination.Graph.class), new VoiceSettingsDestination.VoiceSettings(false), f0Var, new b31.j(factory, q0Var, aVar4, aVar5, 21));
                function12.getClass();
                aa.o.a(o0Var, q0Var2.b(RobotRemoveMachineDestination.class), f0Var, e0Var, n21.b.d, n21.c.d, n21.d.d, n21.e.d, new c4.c(511504186, true, new hu.f(factory, aVar4, function12)));
                aa.o.a(o0Var, q0Var2.b(DoNotDisturbDestination.DoNotDisturb.class), f0Var, e0Var, e21.e.d, e21.f.d, e21.g.d, e21.h.d, new c4.c(969893319, true, new c21.g(factory, aVar4, q0Var, 1)));
                aa.o.a(o0Var, q0Var2.b(ActivityHistoryDestination.Graph.class), f0Var, e0Var, vy0.a.d, vy0.b.d, vy0.c.d, vy0.d.d, new c4.c(-517442644, true, new c21.g(factory, aVar4, q0Var, 8)));
                u12.a.j(o0Var, q0Var2.b(ProductHubDestination.Graph.class), ProductHubDestination.ProductHub.INSTANCE, f0Var, new m01.b(factory, q0Var, aVar4));
                return h12.f0.f36844a;
        }
    }
}
