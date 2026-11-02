package com.dyson.mobile.android.support.aichatbot;

import a10.i;
import a10.l;
import a90.a0;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import d5.c0;
import f5.g;
import f5.i0;
import g4.c;
import h12.f0;
import kotlin.jvm.functions.Function1;
import rf0.i0;
import u3.h;
import u3.o3;
import u3.p1;
import u3.w1;
import x12.r;
/* loaded from: classes3.dex */
public final class c {
    public static final void a(w12.a<f0> aVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(2122256022);
        int i14 = (k13.D(aVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.a.a(null, null, null, null, null, null, c4.d.c(-1829087386, new a0(aVar, 9), k13), k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new l(i13, 21, aVar);
        }
    }

    public static final void b(g gVar, w12.a<f0> aVar, w12.a<f0> aVar2, Function1<? super Uri, f0> function1, Composer composer, int i13) {
        gVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(-265633025);
        int i14 = i13 | (k13.Q(gVar) ? 4 : 2) | (k13.D(aVar) ? 32 : 16) | (k13.D(aVar2) ? 256 : 128) | (k13.D(function1) ? 2048 : 1024);
        if (k13.t(i14 & 1, (i14 & 1171) != 1170)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            if (B == Composer.a.f3142b) {
                B = new hu0.d();
                k13.u(B);
            }
            qs0.c.a(pf0.f.c(i0.Wd), "AiChatBotView", null, null, null, aVar2, null, c4.d.c(-2010341711, new i(gVar, aVar, (hu0.d) B, function1, 21), k13), k13, ((i14 << 9) & 458752) | 12582960, 92);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new i(gVar, aVar, aVar2, function1, i13, 22);
        }
    }

    public static final void c(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-956399549);
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
                h.s();
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
            c03.d = new en.a(i13);
        }
    }
}
