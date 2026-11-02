package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import ac0.m;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import com.brightcove.player.C;
import com.dyson.mobile.android.R;
import f5.g;
import f5.i0;
import g4.c;
import gm1.am;
import h12.f0;
import h12.p;
import hx.v;
import i12.a1;
import i12.s;
import i12.t;
import i12.u;
import j11.b0;
import j11.c0;
import j11.r;
import java.util.ArrayList;
import java.util.List;
import k3.e1;
import kotlin.jvm.functions.Function1;
import nl0.h;
import u3.k1;
import u3.o3;
import u3.p1;
import u3.w1;
import y01.k;
/* loaded from: classes3.dex */
public final class d {

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16466a;

        static {
            int[] iArr = new int[g01.a.values().length];
            try {
                iArr[g01.a.CANT_DELETE_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g01.a.CREATE_MAPS_LIMIT_REACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g01.a.CREATE_NEW_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g01.a.DELETE_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g01.a.CHANGE_CURRENT_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16466a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r23, m11.c r24, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.robot.newsystem.mapmanagement.c, h12.f0> r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapmanagement.d.a(androidx.compose.ui.Modifier, m11.c, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(Modifier modifier, nl0.h<m11.d> hVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1895706924);
        int i14 = i13 | (k13.Q(modifier) ? 4 : 2) | (k13.Q(hVar) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            if (hVar instanceof h.c) {
                k13.R(480158641);
                k kVar = ((m11.d) ((h.c) hVar).f57898a).f52905b;
                c0 c0Var = c0.ALWAYS_SHOW;
                r.a(kVar, modifier, null, null, null, null, null, new b0(c0Var, c0Var, c0Var), null, k11.f.c(null, k13, 1), a1.M(k13, 1), null, null, k13, (i14 << 3) & com.salesforce.marketingcloud.analytics.stats.b.f20728p, 0, 6524);
                k13.a0(false);
            } else {
                k13.R(708242614);
                nl0.f.c(i14 & 14, 2, k13, modifier, null);
                k13.a0(false);
            }
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new ks.e(modifier, hVar, i13, 11);
        }
    }

    public static final void c(m11.c cVar, Function1<? super c, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-860020215);
        int i14 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? k13.Q(cVar) : k13.D(cVar) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= k13.D(function1) ? 32 : 16;
        }
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            nl0.h<m11.d> hVar = cVar.f52901a;
            p pVar = hVar instanceof h.c ? new p(((m11.d) ((h.c) hVar).f57898a).f52904a, Integer.valueOf(cVar.f52903c)) : new p(s.c(new m11.b("- -", "- -")), 0);
            List<m11.b> list = (List) pVar.d;
            int intValue = ((Number) pVar.e).intValue();
            Object B = k13.B();
            Composer.f3140a.getClass();
            if (B == Composer.a.f3142b) {
                B = androidx.compose.runtime.d.j(Boolean.FALSE);
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            String id2 = m11.a.RENAME_MAP.getId();
            String T = v.T(R.string.machine804a_renameMap_title, 0, k13);
            md1.b.f53765a.getClass();
            List h13 = t.h(new fz0.i(id2, T, md1.b.a(k13).f41049c.f41082a, true, R.drawable.ic_edit, null), new fz0.i(m11.a.CREATE_NEW_MAP.getId(), v.T(R.string.machine276_mapList_createNewMap, 0, k13), md1.b.a(k13).f41049c.f41082a, true, R.drawable.ic_plus, null), new fz0.i(m11.a.DELETE_MAP.getId(), v.T(R.string.machine804a_manageMaps_delete, 0, k13), md1.b.a(k13).e.f41125a, true, R.drawable.ic_delete, null));
            Modifier u8 = androidx.compose.foundation.layout.d.u(j.a(Modifier.f3231b, "RobotMapManagement.MapDropdown"), md1.b.f53766b.e.f41189c, 0.0f, 0.0f, 0.0f, 14);
            ArrayList arrayList = new ArrayList(u.o(list, 10));
            for (m11.b bVar : list) {
                arrayList.add(bVar.f52900b);
            }
            boolean z13 = cVar.f52901a instanceof h.c;
            boolean booleanValue = ((Boolean) k1Var.getValue()).booleanValue();
            int i15 = i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p;
            boolean z14 = i15 == 32;
            Object B2 = k13.B();
            if (z14 || B2 == Composer.a.f3142b) {
                B2 = new e1(function1, 14);
                k13.u(B2);
            }
            Function1 function12 = (Function1) B2;
            Object B3 = k13.B();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B3 == c0094a) {
                B3 = new l11.f(k1Var, 4);
                k13.u(B3);
            }
            Function1 function13 = (Function1) B3;
            boolean z15 = i15 == 32;
            Object B4 = k13.B();
            if (z15 || B4 == c0094a) {
                B4 = new e1(function1, 15);
                k13.u(B4);
            }
            fz0.h.a(u8, arrayList, intValue, z13, booleanValue, h13, function12, function13, (Function1) B4, k13, 12582912, 0);
            p1 p1Var2 = androidx.compose.runtime.b.f3172a;
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new m(cVar, function1, i13, 21);
        }
    }

    public static final void d(m11.c cVar, List list, Function1 function1, Function1 function12, w12.a aVar, w12.a aVar2, Composer composer, int i13) {
        cVar.getClass();
        list.getClass();
        function1.getClass();
        function12.getClass();
        aVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(-1234832070);
        int i14 = i13 | (k13.Q(cVar) ? 4 : 2) | (k13.D(list) ? 32 : 16) | (k13.D(function1) ? 256 : 128) | (k13.D(function12) ? 2048 : 1024) | (k13.D(aVar) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG) | (k13.D(aVar2) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG);
        if (k13.t(i14 & 1, (74899 & i14) != 74898)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            s21.b.a(null, null, aVar2, null, null, k13, (i14 >> 9) & 896, 27);
            qs0.c.a(v.T(R.string.machine804a_editMap_bottomSheet_content_title, 0, k13), "RobotMapManagement", null, null, null, aVar, null, c4.d.c(-308872248, new m11.f(cVar, function1, list, function12), k13), k13, ((i14 << 3) & 458752) | 12582960, 92);
            k13 = k13;
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new a90.f0(cVar, list, function1, function12, aVar, aVar2, i13, 16);
        }
    }

    public static final void e(m11.c cVar, List<oz0.c> list, Function1<? super c, f0> function1, Function1<? super com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a, f0> function12, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-269129687);
        int i14 = i13 | (k13.Q(cVar) ? 4 : 2) | (k13.D(list) ? 32 : 16) | (k13.D(function1) ? 256 : 128) | (k13.D(function12) ? 2048 : 1024);
        if (k13.t(i14 & 1, (i14 & 1171) != 1170)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.getClass();
            androidx.compose.foundation.layout.c.f2839a.getClass();
            c.k kVar = androidx.compose.foundation.layout.c.d;
            g4.c.f33023a.getClass();
            androidx.compose.foundation.layout.g a13 = androidx.compose.foundation.layout.f.a(kVar, c.a.f33035n, k13, 0);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, fillElement);
            f5.g.f29643z0.getClass();
            i0.a aVar2 = g.a.f29645b;
            if (k13.f3143b == null) {
                u3.h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar2);
            } else {
                k13.s();
            }
            o3.a(k13, a13, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !x12.r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            p2.r rVar = p2.r.f62721a;
            a(am.M(w.d(aVar, 1.0f), 1.0f), cVar, function1, k13, ((i14 << 3) & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | 6 | (i14 & 896));
            Modifier a14 = rVar.a(w.d(aVar, 1.0f), 1.0f, true);
            nl0.h<m11.d> hVar = cVar.f52901a;
            g01.a aVar3 = cVar.d;
            b(a14, hVar, k13, 0);
            Modifier a15 = j.a(aVar, "RobotMapManagement.ButtonTile");
            md1.b.f53765a.getClass();
            float f13 = md1.b.f53766b.e.d;
            nd1.e.a(am.M(androidx.compose.foundation.layout.d.u(a15, f13, 0.0f, f13, f13, 2), 1.0f), c4.d.c(-1503986169, new hc0.h(list, function1, 8), k13), k13, 48, 0);
            k13.a0(true);
            if (aVar3 != null) {
                k13.R(1062733443);
                f(aVar3, function12, k13, (i14 >> 6) & com.salesforce.marketingcloud.analytics.stats.b.f20728p);
                k13.a0(false);
            } else {
                k13.R(1062846841);
                k13.a0(false);
            }
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new m11.f(cVar, list, function1, function12, i13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(g01.a r17, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a, h12.f0> r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapmanagement.d.f(g01.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
