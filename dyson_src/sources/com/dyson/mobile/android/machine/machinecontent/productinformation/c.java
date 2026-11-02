package com.dyson.mobile.android.machine.machinecontent.productinformation;

import a90.a0;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import cg0.s;
import com.dyson.mobile.android.machine.machinecontent.productinformation.g;
import d5.c0;
import f5.g;
import f5.i0;
import g4.c;
import h12.f0;
import kotlin.jvm.functions.Function1;
import mw.j;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p2.i;
import s2.m0;
import u3.h;
import u3.o3;
import u3.p1;
import u3.w1;
import x12.r;
/* loaded from: classes3.dex */
public final class c {
    public static final void a(w12.a<f0> aVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-1684879024);
        int i14 = (k13.D(aVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.a.a(null, null, null, null, null, null, c4.d.c(-438203872, new a0(aVar, 25), k13), k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new j(i13, 18, aVar);
        }
    }

    public static final void b(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-839730317);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.u(fillElement);
            g4.c.f33023a.getClass();
            c0 d = i.d(c.a.f33027f, false);
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
            c03.d = new m0(i13, 19);
        }
    }

    public static final void c(g gVar, Function1<? super k80.b, f0> function1, w12.a<f0> aVar, w12.a<f0> aVar2, Composer composer, int i13, int i14) {
        Object obj;
        int i15;
        Object obj2;
        int i16;
        Object obj3;
        w12.a<f0> aVar3;
        w12.a<f0> aVar4;
        gVar.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(1039453679);
        int i17 = i13 | (k13.Q(gVar) ? 4 : 2);
        if ((i13 & 48) == 0) {
            i17 |= k13.D(function1) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 != 0) {
            i15 = i17 | MLKEMEngine.KyberPolyBytes;
            obj = aVar;
        } else {
            obj = aVar;
            i15 = i17 | (k13.D(obj) ? 256 : 128);
        }
        int i19 = i14 & 8;
        if (i19 != 0) {
            i16 = i15 | 3072;
            obj2 = aVar2;
        } else {
            obj2 = aVar2;
            i16 = i15 | (k13.D(obj2) ? 2048 : 1024);
        }
        if (k13.t(i16 & 1, (i16 & 1171) != 1170)) {
            Composer.a aVar5 = Composer.f3140a;
            if (i18 != 0) {
                Object B = k13.B();
                aVar5.getClass();
                if (B == Composer.a.f3142b) {
                    B = new si0.d(0);
                    k13.u(B);
                }
                aVar3 = (w12.a) B;
            } else {
                aVar3 = obj;
            }
            if (i19 != 0) {
                Object B2 = k13.B();
                aVar5.getClass();
                if (B2 == Composer.a.f3142b) {
                    B2 = new si0.d(1);
                    k13.u(B2);
                }
                aVar4 = (w12.a) B2;
            } else {
                aVar4 = obj2;
            }
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            qs0.c.a((!(gVar instanceof g.a) || (r3 = ((g.a) gVar).f15274a.f76212b) == null) ? "" : "", "ProductInformationView", null, xc1.j.SURFACE, aVar4, null, null, c4.d.c(1828612349, new q80.c(gVar, function1, aVar3, 9), k13), k13, ((i16 << 3) & 57344) | 12586032, 100);
            obj = aVar3;
            obj3 = aVar4;
        } else {
            k13.J();
            obj3 = obj2;
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new s(gVar, function1, obj, obj3, i13, i14, 16);
        }
    }
}
