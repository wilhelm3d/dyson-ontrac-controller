package com.dyson.mobile.android.termsandprivacy;

import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import c90.b0;
import com.brightcove.player.C;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e91.l;
import e91.m;
import e91.n;
import f5.g;
import f5.i0;
import g4.c;
import h12.f0;
import i12.c0;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p2.i;
import pf0.f;
import q5.t0;
import r3.k9;
import se1.q;
import se1.r;
import u3.h;
import u3.o3;
import u3.p1;
import u3.w1;
import y2.v;
/* loaded from: classes3.dex */
public final class b {
    public static final void a(LocalisationKey localisationKey, w12.a<f0> aVar, w12.a<f0> aVar2, w12.a<f0> aVar3, w12.a<f0> aVar4, Composer composer, int i13) {
        q5.b bVar;
        androidx.compose.runtime.a k13 = composer.k(183689547);
        int i14 = i13 | ((i13 & 8) == 0 ? k13.Q(localisationKey) : k13.D(localisationKey) ? 4 : 2) | (k13.D(aVar) ? 32 : 16) | (k13.D(aVar2) ? 256 : 128) | (k13.D(aVar3) ? 2048 : 1024) | (k13.D(aVar4) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG);
        if (k13.t(i14 & 1, (i14 & 9363) != 9362)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            String c13 = f.c(localisationKey);
            new r();
            md1.b.f53765a.getClass();
            long j8 = md1.b.a(k13).f41049c.f41082a;
            c.f16947k.getClass();
            Map<String, String> map = c.f16948l;
            c13.getClass();
            map.getClass();
            q5.b a13 = r.a(c13, c0.A0(map.keySet()), new q(j8, map, 1));
            Modifier a14 = j.a(Modifier.f3231b, "TERMS_OF_USE_AND_PRIVACY_ANNOTATED_TEXT_TEST_TAG");
            t0 a15 = t0.a(md1.b.c(k13).f53779j, md1.b.a(k13).f41049c.e, 0L, null, null, 0L, 0L, null, 0, 0L, null, null, 16777214);
            boolean Q = ((i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) == 32) | k13.Q(a13) | ((i14 & 896) == 256) | ((57344 & i14) == 16384) | ((i14 & 7168) == 2048);
            Object B = k13.B();
            if (!Q) {
                Composer.f3140a.getClass();
                if (B != Composer.a.f3142b) {
                    bVar = a13;
                    v.a(bVar, a14, a15, false, 0, 0, null, (Function1) B, k13, 48, 120);
                }
            }
            bVar = a13;
            b0 b0Var = new b0(bVar, aVar, aVar2, aVar4, aVar3, 3);
            k13.u(b0Var);
            B = b0Var;
            v.a(bVar, a14, a15, false, 0, 0, null, (Function1) B, k13, 48, 120);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new c4.b(localisationKey, aVar, aVar2, aVar3, aVar4, i13, 4);
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1550876507);
        int i14 = (k13.Q(modifier) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier u8 = j.a(modifier, "TERMS_OF_USE_AND_PRIVACY_LOADING_TEST_TAG").u(w.f2903c);
            g4.c.f33023a.getClass();
            d5.c0 d = i.d(c.a.f33025b, false);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, u8);
            g.f29643z0.getClass();
            i0.a aVar = g.a.f29645b;
            if (k13.f3143b == null) {
                h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar);
            } else {
                k13.s();
            }
            o3.a(k13, d, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !x12.r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            sc1.a.a(sc1.b.Large, androidx.compose.foundation.layout.e.f2852a.h(Modifier.f3231b, c.a.f33027f), k13, 6, 0);
            k13.a0(true);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new cg0.b(modifier, i13, 1);
        }
    }

    public static final void c(e91.f fVar, Function1 function1, Function1 function12, Function1 function13, w12.a aVar, w12.a aVar2, w12.a aVar3, w12.a aVar4, w12.a aVar5, w12.a aVar6, w12.a aVar7, Modifier modifier, Composer composer, int i13) {
        androidx.compose.runtime.a aVar8;
        c4.c cVar;
        androidx.compose.runtime.a k13 = composer.k(1997736812);
        int i14 = i13 | (k13.D(fVar) ? 4 : 2) | (k13.D(function1) ? 32 : 16) | (k13.D(function12) ? 256 : 128) | (k13.D(function13) ? 2048 : 1024) | (k13.D(aVar) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG) | (k13.D(aVar2) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG) | (k13.D(aVar3) ? 1048576 : 524288) | (k13.D(aVar4) ? 8388608 : 4194304) | (k13.D(aVar5) ? 67108864 : 33554432) | (k13.D(aVar6) ? 536870912 : 268435456);
        if (k13.t(i14 & 1, ((306783379 & i14) == 306783378 && (((k13.D(aVar7) ? (char) 4 : (char) 2) | (k13.Q(modifier) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier a13 = j.a(modifier, "TERMS_OF_USE_AND_PRIVACY_SCREEN");
            if (fVar.f26371n != null) {
                k13.R(-783739363);
                cVar = c4.d.c(-40895904, new l(aVar2, fVar), k13);
                k13.a0(false);
            } else {
                k13.R(-783339494);
                k13.a0(false);
                cVar = null;
            }
            aVar8 = k13;
            vd1.a.b(c4.d.c(-418557919, new l(fVar, aVar), k13), a13, cVar, c4.d.c(-1094411001, new m(fVar, aVar7, aVar3, aVar4, aVar5, aVar6, function1, function12, function13, 0), k13), aVar8, 3078, 0);
        } else {
            aVar8 = k13;
            aVar8.J();
        }
        androidx.compose.runtime.f c03 = aVar8.c0();
        if (c03 != null) {
            c03.d = new n(fVar, function1, function12, function13, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, modifier, i13, 0);
        }
    }

    public static final void d(a aVar, Function1 function1, Function1 function12, Function1 function13, w12.a aVar2, w12.a aVar3, w12.a aVar4, w12.a aVar5, w12.a aVar6, w12.a aVar7, w12.a aVar8, w12.a aVar9, Composer composer, int i13) {
        androidx.compose.runtime.a aVar10;
        aVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        androidx.compose.runtime.a a13 = z62.a.a(aVar8, aVar9, composer, -1501261350);
        int i14 = i13 | (a13.Q(aVar) ? 4 : 2) | (a13.D(function1) ? 32 : 16) | (a13.D(function12) ? 256 : 128) | (a13.D(function13) ? 2048 : 1024) | (a13.D(aVar2) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG) | (a13.D(aVar3) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG) | (a13.D(aVar4) ? 1048576 : 524288) | (a13.D(aVar5) ? 8388608 : 4194304) | (a13.D(aVar6) ? 67108864 : 33554432) | (a13.D(aVar7) ? 536870912 : 268435456);
        if (a13.t(i14 & 1, ((306783379 & i14) == 306783378 && (((a13.D(aVar8) ? (char) 4 : (char) 2) | (a13.D(aVar9) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            md1.b.f53765a.getClass();
            aVar10 = a13;
            k9.a(null, null, null, null, null, 0, md1.b.a(a13).f41047a.f41064a, 0L, null, c4.d.c(-1675759189, new e91.r(aVar, function1, function12, function13, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, 0), a13), aVar10, 805306368, 447);
        } else {
            aVar10 = a13;
            aVar10.J();
        }
        androidx.compose.runtime.f c03 = aVar10.c0();
        if (c03 != null) {
            c03.d = new n(aVar, function1, function12, function13, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, i13, 1);
        }
    }
}
