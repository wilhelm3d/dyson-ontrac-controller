package com.dyson.mobile.android.home;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.dyson.mobile.android.home.b;
import f5.g;
import f5.i0;
import g4.c;
import g4.e;
import u3.o3;
import u3.p1;
import u3.w1;
import x12.r;
import y9.c0;
/* loaded from: classes2.dex */
public final class h {
    public static final void a(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(975170245);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.u(fillElement);
            g4.c.f33023a.getClass();
            e.a aVar2 = c.a.f33036o;
            androidx.compose.foundation.layout.c.f2839a.getClass();
            androidx.compose.foundation.layout.g a13 = androidx.compose.foundation.layout.f.a(androidx.compose.foundation.layout.c.f2842f, aVar2, k13, 54);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, fillElement);
            f5.g.f29643z0.getClass();
            i0.a aVar3 = g.a.f29645b;
            if (k13.f3143b == null) {
                u3.h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar3);
            } else {
                k13.s();
            }
            o3.a(k13, a13, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            p2.r rVar = p2.r.f62721a;
            sc1.a.a(sc1.b.Large, null, k13, 6, 2);
            k13.a0(true);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new vd0.g(i13, 27);
        }
    }

    public static void b(c0 c0Var, String str, String str2, int i13) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        c0Var.getClass();
        c0Var.g(new b.C0458b(str, str2, true), new vk0.e(21));
    }
}
