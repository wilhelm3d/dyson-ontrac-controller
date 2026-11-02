package com.dyson.mobile.android.robot.mapping.confirmmap;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bx1.z;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.mapping.confirmmap.a;
import f5.g;
import f5.i0;
import g4.c;
import g4.e;
import h12.f0;
import h12.r;
import j11.d0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l12.d;
import n12.e;
import n12.i;
import n4.a0;
import nl0.h;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p2.n;
import r3.af;
import r3.bf;
import r3.e0;
import r3.k9;
import r3.nd;
import rf0.j;
import rf0.k;
import rs0.g;
import u3.k1;
import u3.m0;
import u3.o3;
import u3.p1;
import u3.w1;
import z32.c0;
/* loaded from: classes3.dex */
public final class b {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.robot.mapping.confirmmap.RobotConfirmMapViewKt$RobotConfirmMapView$3$1", f = "RobotConfirmMapView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class a extends i implements Function2<c0, d<? super f0>, Object> {
        public final /* synthetic */ pw0.b d;
        public final /* synthetic */ Function1<com.dyson.mobile.android.robot.mapping.confirmmap.a, f0> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(pw0.b bVar, Function1<? super com.dyson.mobile.android.robot.mapping.confirmmap.a, f0> function1, d<? super a> dVar) {
            super(2, dVar);
            this.d = bVar;
            this.e = function1;
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new a(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (this.d.f64845a instanceof h.c) {
                this.e.invoke(a.d.f16075a);
            }
            return f0.f36844a;
        }
    }

    public static final void a(LocalisationKey localisationKey, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        androidx.compose.runtime.a k13 = composer.k(1554289418);
        int i14 = i13 | ((i13 & 8) == 0 ? k13.Q(localisationKey) : k13.D(localisationKey) ? 4 : 2);
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar2 = Modifier.f3231b;
            Modifier d = w.d(aVar2, 1.0f);
            g.f73622a.getClass();
            Modifier u8 = androidx.compose.foundation.layout.d.u(d, g.b(k13).d, 0.0f, g.b(k13).d, g.b(k13).d, 2);
            c.f2839a.getClass();
            c.k kVar = c.d;
            g4.c.f33023a.getClass();
            androidx.compose.foundation.layout.g a13 = f.a(kVar, c.a.f33035n, k13, 0);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, u8);
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
            if (k13.T || !x12.r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            p2.r rVar = p2.r.f62721a;
            e.a aVar4 = c.a.f33036o;
            Modifier b13 = rVar.b(aVar2, aVar4);
            String c14 = pf0.f.c(k.f72119x);
            b6.h.f7062b.getClass();
            int i15 = b6.h.e;
            nd.c(c14, b13, rs0.g.a(k13).f73606k, 0L, null, null, null, 0L, null, b6.h.a(i15), 0L, 0, false, 0, 0, null, rs0.g.d(k13).d, k13, 0, 0, 130040);
            nd.c(pf0.f.c(localisationKey), rVar.b(androidx.compose.foundation.layout.d.u(aVar2, 0.0f, rs0.g.b(k13).f73618c, 0.0f, 0.0f, 13), aVar4), a0.b(c7.a.c((Context) k13.A(AndroidCompositionLocals_androidKt.f3655b), R.color.robot_light_grey)), 0L, null, null, null, 0L, null, b6.h.a(i15), 0L, 0, false, 0, 0, null, rs0.g.d(k13).f73627g, k13, 0, 0, 130040);
            aVar = k13;
            aVar.a0(true);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new e30.i(localisationKey, i13, 2);
        }
    }

    public static final void b(Function1<? super com.dyson.mobile.android.robot.mapping.confirmmap.a, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1671280926);
        int i14 = (k13.D(function1) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = androidx.compose.runtime.d.j(Boolean.FALSE);
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            String c13 = pf0.f.c(k.B);
            Object B2 = k13.B();
            if (B2 == c0094a) {
                B2 = new d0(k1Var, 29);
                k13.u(B2);
            }
            ps0.e.a(3072, k13, null, c13, (w12.a) B2, false);
            if (((Boolean) k1Var.getValue()).booleanValue()) {
                k13.R(1869517723);
                LocalisationKey localisationKey = k.f72121z;
                LocalisationKey localisationKey2 = k.A;
                boolean z13 = true;
                LocalisationKey localisationKey3 = rf0.i0.M8;
                if ((i14 & 14) != 4) {
                    z13 = false;
                }
                Object B3 = k13.B();
                if (z13 || B3 == c0094a) {
                    B3 = new z(function1, k1Var, 8);
                    k13.u(B3);
                }
                w12.a aVar = (w12.a) B3;
                LocalisationKey localisationKey4 = rf0.i0.E8;
                Object B4 = k13.B();
                if (B4 == c0094a) {
                    B4 = new pw0.g(k1Var, 0);
                    k13.u(B4);
                }
                int i15 = LocalisationKey.f15078g;
                c(localisationKey, localisationKey2, localisationKey3, aVar, localisationKey4, (w12.a) B4, k13, 196608 | i15 | (i15 << 3) | (i15 << 6) | (i15 << 12), 0);
                k13 = k13;
                k13.a0(false);
            } else {
                k13.R(1870049156);
                k13.a0(false);
            }
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new az0.e(function1, i13, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(com.dyson.mobile.android.localisation.LocalisationKey r12, com.dyson.mobile.android.localisation.LocalisationKey r13, com.dyson.mobile.android.localisation.LocalisationKey r14, w12.a<h12.f0> r15, com.dyson.mobile.android.localisation.LocalisationKey r16, w12.a<h12.f0> r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.mapping.confirmmap.b.c(com.dyson.mobile.android.localisation.LocalisationKey, com.dyson.mobile.android.localisation.LocalisationKey, com.dyson.mobile.android.localisation.LocalisationKey, w12.a, com.dyson.mobile.android.localisation.LocalisationKey, w12.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(Modifier modifier, pw0.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        androidx.compose.runtime.a k13 = composer.k(-1456362100);
        if ((i13 & 6) == 0) {
            i14 = (k13.Q(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? k13.Q(bVar) : k13.D(bVar) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(function1) ? 256 : 128;
        }
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.f3231b.getClass();
            Modifier d = w.d(modifier, 1.0f);
            rs0.g.f73622a.getClass();
            n.a(androidx.compose.foundation.layout.d.s(d, rs0.g.b(k13).d, 0.0f, 2), null, false, c4.d.c(934240354, new j42.b(24, function1, bVar), k13), k13, 3072, 6);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new oz0.a(i13, 5, modifier, (Object) bVar, (Object) function1);
        }
    }

    public static final void e(Modifier modifier, pw0.b bVar, Function1<? super com.dyson.mobile.android.robot.mapping.confirmmap.a, f0> function1, Composer composer, int i13, int i14) {
        Modifier.a aVar;
        int i15;
        Modifier modifier2;
        h<pw0.d> hVar;
        boolean z13;
        h<pw0.d> hVar2 = bVar.f64846b;
        h<f0> hVar3 = bVar.f64845a;
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(304222511);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            aVar = modifier;
        } else if ((i13 & 6) == 0) {
            aVar = modifier;
            i15 = (k13.Q(aVar) ? 4 : 2) | i13;
        } else {
            aVar = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? k13.Q(bVar) : k13.D(bVar) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= k13.D(function1) ? 256 : 128;
        }
        if (k13.t(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                aVar = Modifier.f3231b;
            }
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = androidx.compose.runtime.d.j(new pw0.c(0, 0));
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            c4.c c13 = c4.d.c(1358388715, new az0.e(function1, 19), k13);
            rs0.g.f73622a.getClass();
            int i17 = i15;
            k9.a(aVar, c13, null, null, null, 0, rs0.g.a(k13).f73598a, 0L, null, c4.d.c(1634254144, new k30.n(10, (Object) bVar, (Object) k1Var, (Function1) function1), k13), k13, (i15 & 14) | 805306416, 444);
            Modifier modifier3 = aVar;
            k13 = k13;
            int i18 = i17 & 896;
            boolean z14 = (i18 == 256) | ((i17 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) == 32 || ((i17 & 64) != 0 && k13.D(bVar)));
            Object B2 = k13.B();
            if (z14 || B2 == c0094a) {
                B2 = new a(bVar, function1, null);
                k13.u(B2);
            }
            m0.d(k13, hVar3, (Function2) B2);
            if (hVar3 instanceof h.a) {
                k13.R(713854695);
                LocalisationKey localisationKey = j.f72051u0;
                LocalisationKey localisationKey2 = j.f72056v0;
                LocalisationKey localisationKey3 = rf0.i0.H8;
                boolean z15 = i18 == 256;
                Object B3 = k13.B();
                if (z15 || B3 == c0094a) {
                    B3 = new pl.d(function1, 5);
                    k13.u(B3);
                }
                w12.a aVar2 = (w12.a) B3;
                LocalisationKey localisationKey4 = rf0.i0.E8;
                int i19 = LocalisationKey.f15078g;
                c(localisationKey, localisationKey2, localisationKey3, aVar2, localisationKey4, null, k13, (i19 << 12) | (i19 << 3) | i19 | (i19 << 6), 32);
                k13.a0(false);
                hVar = hVar2;
            } else if (hVar2 instanceof h.a) {
                k13.R(714348339);
                LocalisationKey localisationKey5 = j.f72021o0;
                LocalisationKey localisationKey6 = j.f72026p0;
                LocalisationKey localisationKey7 = rf0.i0.H8;
                boolean z16 = i18 == 256;
                Object B4 = k13.B();
                if (z16 || B4 == c0094a) {
                    B4 = new z(function1, k1Var, 9);
                    k13.u(B4);
                }
                w12.a aVar3 = (w12.a) B4;
                LocalisationKey localisationKey8 = rf0.i0.E8;
                boolean z17 = i18 == 256;
                Object B5 = k13.B();
                if (z17 || B5 == c0094a) {
                    B5 = new pl.d(function1, 6);
                    k13.u(B5);
                }
                int i23 = LocalisationKey.f15078g;
                hVar = hVar2;
                c(localisationKey5, localisationKey6, localisationKey7, aVar3, localisationKey8, (w12.a) B5, k13, (i23 << 12) | (i23 << 3) | i23 | (i23 << 6), 0);
                k13.a0(false);
            } else {
                hVar = hVar2;
                k13.R(714932627);
                k13.a0(false);
            }
            k13.R(300157362);
            h.b bVar2 = h.b.f57897a;
            if (hVar.equals(bVar2) || hVar3.equals(bVar2)) {
                z13 = false;
                k13.R(-1346880290);
                ps0.k.a(0, k13, null, false);
                k13.a0(false);
            } else {
                k13.R(-1346840889);
                z13 = false;
                k13.a0(false);
            }
            k13.a0(z13);
            boolean z18 = i18 == 256;
            Object B6 = k13.B();
            if (z18 || B6 == c0094a) {
                B6 = new pl.d(function1, 7);
                k13.u(B6);
            }
            g.d.a(false, (w12.a) B6, k13, 0, 1);
            modifier2 = modifier3;
        } else {
            k13.J();
            modifier2 = aVar;
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new af1.a(modifier2, bVar, function1, i13, i14, 12);
        }
    }

    public static final void f(Function1<? super com.dyson.mobile.android.robot.mapping.confirmmap.a, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-515575474);
        int i14 = (k13.D(function1) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            bf bfVar = bf.f68665a;
            n4.z.f55660b.getClass();
            long j8 = n4.z.f55666j;
            bfVar.getClass();
            af a13 = bf.a(j8, k13);
            pw0.a.f64842a.getClass();
            e0.a(pw0.a.f64843b, null, c4.d.c(-1614327161, new az0.e(function1, 21), k13), c4.d.c(-779619522, new d41.g(function1, 9), k13), 0.0f, null, a13, null, k13, 3462, 178);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new az0.e(function1, i13, 22);
        }
    }
}
