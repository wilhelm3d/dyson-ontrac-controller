package com.dyson.mobile.android.machine.machinecontent.expertcontent.detail;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import com.brightcove.player.C;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c;
import h12.f0;
import k30.n;
import kotlin.jvm.functions.Function1;
import nx1.u;
import r3.k9;
import u3.p1;
/* loaded from: classes3.dex */
public final class b {
    public static final void a(d dVar, w12.a aVar, Modifier modifier, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(753269498);
        int i14 = (k13.D(dVar) ? 4 : 2) | i13 | (k13.D(aVar) ? 32 : 16) | (k13.Q(modifier) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            vd1.a.b(c4.d.c(1653166959, new u(7, aVar, dVar), k13), modifier, null, c4.d.c(547091669, new oi0.c(dVar, 0), k13), k13, ((i14 >> 3) & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | 3078, 4);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new lx1.a(dVar, aVar, modifier, i13, 16);
        }
    }

    public static final void b(c.d dVar, c.g gVar, Function1<? super c.f, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        dVar.getClass();
        gVar.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(729845751);
        int i14 = i13 | (k13.Q(dVar) ? 4 : 2) | (k13.Q(gVar) ? 32 : 16) | (k13.D(function1) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier a13 = j.a(Modifier.f3231b, "ExpertContentDetailScreen");
            c4.c c13 = c4.d.c(-654036557, new u(5, dVar, function1), k13);
            md1.b.f53765a.getClass();
            aVar = k13;
            k9.a(a13, c13, null, null, null, 0, md1.b.a(k13).f41047a.f41064a, 0L, null, c4.d.c(856200904, new n(6, (Object) dVar, (Object) gVar, (Function1) function1), k13), aVar, 805306422, 444);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new lx1.a(i13, 17, dVar, gVar, function1);
        }
    }

    public static final void c(e eVar, c.g gVar, Function1 function1, w12.a aVar, w12.a aVar2, Modifier modifier, Composer composer, int i13) {
        androidx.compose.runtime.a aVar3;
        c4.c c13;
        androidx.compose.runtime.a k13 = composer.k(-1247495430);
        int i14 = i13 | (k13.Q(eVar) ? 4 : 2) | (k13.Q(gVar) ? 32 : 16) | (k13.D(function1) ? 256 : 128) | (k13.D(aVar) ? 2048 : 1024) | (k13.D(aVar2) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG) | (k13.Q(modifier) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG);
        if (k13.t(i14 & 1, (74899 & i14) != 74898)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            c.b bVar = eVar.d;
            if (bVar == null) {
                k13.R(216078604);
                k13.a0(false);
                c13 = null;
            } else {
                k13.R(216078605);
                c13 = c4.d.c(-1886979540, new u(6, aVar2, bVar), k13);
                k13.a0(false);
            }
            aVar3 = k13;
            vd1.a.b(c13, modifier, null, c4.d.c(314869973, new oi0.d(aVar, eVar, gVar, function1, 0), k13), aVar3, ((i14 >> 12) & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | 3072, 4);
        } else {
            aVar3 = k13;
            aVar3.J();
        }
        androidx.compose.runtime.f c03 = aVar3.c0();
        if (c03 != null) {
            c03.d = new a90.f0(i13, 19, eVar, gVar, function1, modifier, aVar, aVar2);
        }
    }
}
