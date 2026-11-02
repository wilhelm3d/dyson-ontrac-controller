package com.dyson.mobile.android.audio.home.settings.removeproduct;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d5.c0;
import e21.l;
import f5.g;
import f5.i0;
import g4.c;
import gl.m;
import h12.f0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import rf0.q;
import u3.o3;
import u3.p1;
import u3.w1;
import x12.r;
/* loaded from: classes2.dex */
public final class f {
    public static final void a(boolean z13, Function1<? super b, f0> function1, w12.a<f0> aVar, Composer composer, int i13) {
        int i14;
        function1.getClass();
        aVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(-1171644719);
        if ((i13 & 6) == 0) {
            i14 = (k13.c(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.D(function1) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(aVar) ? 256 : 128;
        }
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            qs0.c.a(pf0.f.c(q.f72401j1), "TAG_REMOVE_PRODUCT_SCREEN", null, null, aVar, null, null, c4.d.c(721229535, new l(z13, function1, 8), k13), k13, ((i14 << 6) & 57344) | 12582960, 108);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new m(i13, function1, aVar, z13);
        }
    }

    public static final void b(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-88641665);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.getClass();
            g4.c.f33023a.getClass();
            c0 d = p2.i.d(c.a.f33027f, false);
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
            o3.a(k13, d, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2852a;
            sc1.a.a(sc1.b.Large, null, k13, 6, 2);
            k13.a0(true);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new xc1.e(i13);
        }
    }

    public static final void c(Function1<? super b, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-679840897);
        int i14 = (k13.D(function1) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            vd1.a.b(c4.d.c(-835771148, new vk.f(function1, 6), k13), null, null, c4.d.c(1796973658, new d41.g(function1, 16), k13), k13, 3078, 6);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new vk.f(function1, i13, 7);
        }
    }
}
