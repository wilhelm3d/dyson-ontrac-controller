package com.dyson.mobile.android.support.forsta.survey;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.f;
import androidx.compose.ui.Modifier;
import c90.v;
import com.brightcove.player.C;
import com.dyson.mobile.android.support.forsta.survey.d;
import f5.g;
import f5.i0;
import g4.c;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n12.i;
import n4.c1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u3.h;
import u3.k1;
import u3.o3;
import u3.p1;
import u3.w1;
import xd1.j;
import z32.c0;
/* loaded from: classes3.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.forsta.survey.ForstaSurveyContentKt$ForstaSurveyContent$4$1$1", f = "ForstaSurveyContent.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ Function1<d.c, f0> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super d.c, f0> function1, l12.d<? super a> dVar) {
            super(2, dVar);
            this.d = function1;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(this.d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.d.invoke(d.c.C0608c.f16843a);
            return f0.f36844a;
        }
    }

    public static final void a(int i13, Composer composer, Modifier modifier, w12.a aVar) {
        Modifier modifier2;
        androidx.compose.runtime.a k13 = composer.k(-1361606227);
        int i14 = (k13.D(aVar) ? 4 : 2) | i13 | (k13.Q(modifier) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            modifier2 = modifier;
            j.a(modifier2, 0.0f, 0.0f, false, null, c4.d.c(-422402771, new z71.a(aVar, 2), k13), k13, ((i14 >> 3) & 14) | 199680, 22);
        } else {
            modifier2 = modifier;
            k13.J();
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new v(aVar, modifier2, i13, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012e, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014c, code lost:
        if (r11 == androidx.compose.runtime.Composer.a.f3142b) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0184, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.dyson.mobile.android.support.forsta.survey.d.InterfaceC0610d r16, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.support.forsta.survey.d.c, h12.f0> r17, hu0.e r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.forsta.survey.c.b(com.dyson.mobile.android.support.forsta.survey.d$d, kotlin.jvm.functions.Function1, hu0.e, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(String str, hu0.e eVar, Function1 function1, w12.a aVar, Modifier modifier, Composer composer, int i13) {
        int i14;
        boolean z13;
        androidx.compose.runtime.a k13 = composer.k(2048007344);
        if ((i13 & 6) == 0) {
            i14 = (k13.Q(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.D(eVar) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= k13.D(aVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= k13.Q(modifier) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if (k13.t(i14 & 1, (i14 & 9363) != 9362)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = androidx.compose.runtime.d.j(Boolean.FALSE);
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            g4.c.f33023a.getClass();
            d5.c0 d = p2.i.d(c.a.f33027f, false);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, modifier);
            g.f29643z0.getClass();
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
            if (k13.T || !x12.r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            androidx.compose.foundation.layout.e eVar2 = androidx.compose.foundation.layout.e.f2852a;
            Modifier.a aVar3 = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar3.getClass();
            Modifier a13 = androidx.compose.ui.platform.j.a(fillElement, "ForstaSurveyContent.WebView");
            boolean D = k13.D(eVar) | ((i14 & 7168) == 2048) | ((i14 & 896) == 256);
            Object B2 = k13.B();
            if (D || B2 == c0094a) {
                B2 = new os0.c(eVar, function1, aVar, k1Var);
                k13.u(B2);
            }
            Function1 function12 = (Function1) B2;
            boolean D2 = ((i14 & 14) == 4) | k13.D(eVar);
            Object B3 = k13.B();
            if (D2 || B3 == c0094a) {
                B3 = new yp.a(6, eVar, str);
                k13.u(B3);
            }
            androidx.compose.ui.viewinterop.a.a(function12, a13, (Function1) B3, k13, 48, 0);
            if (((Boolean) k1Var.getValue()).booleanValue()) {
                z13 = true;
                k13.R(-1608316660);
                k13.a0(false);
            } else {
                k13.R(-1608355100);
                z13 = true;
                d(null, k13, 0, 1);
                k13.a0(false);
            }
            k13.a0(z13);
        } else {
            k13.J();
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new wc1.d(str, eVar, function1, aVar, modifier, i13);
        }
    }

    public static final void d(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        androidx.compose.runtime.a k13 = composer.k(-637821011);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else {
            i15 = (k13.Q(modifier) ? 4 : 2) | i13;
        }
        if (k13.t(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = Modifier.f3231b;
            }
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier u8 = modifier.u(w.f2903c);
            md1.b.f53765a.getClass();
            Modifier b13 = androidx.compose.foundation.a.b(u8, md1.b.a(k13).f41047a.f41064a, c1.f55579a);
            g4.c.f33023a.getClass();
            d5.c0 d = p2.i.d(c.a.f33027f, false);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, b13);
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
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2852a;
            sc1.a.a(sc1.b.Large, null, k13, 6, 2);
            k13.a0(true);
        } else {
            k13.J();
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new j11.v(modifier, i13, i14, 7);
        }
    }
}
