package com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning;

import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c90.x;
import com.brightcove.player.C;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingStep;
import g2.r;
import h12.f0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import r3.bf;
import r3.e0;
import r3.k9;
import se1.v;
import u3.p1;
/* loaded from: classes3.dex */
public final class d {
    public static final void a(String str, Function1<? super b, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-1394777529);
        int i14 = (k13.Q(str) ? 4 : 2) | i13 | (k13.D(function1) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            bf bfVar = bf.f68665a;
            rs0.g.f73622a.getClass();
            long j8 = rs0.g.a(k13).f73598a;
            bfVar.getClass();
            e0.a(c4.d.c(-1513752766, new x(str, 2), k13), null, c4.d.c(-907977984, new az0.e(function1, 2), k13), c4.d.c(214576183, new d41.g(function1, 0), k13), 0.0f, null, bf.a(j8, k13), null, k13, 3462, 178);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new bj.e(i13, 2, str, function1);
        }
    }

    public static final void b(Modifier modifier, String str, d41.d dVar, Function1 function1, w12.a aVar, Composer composer, int i13) {
        int i14;
        androidx.compose.runtime.a aVar2;
        dVar.getClass();
        function1.getClass();
        aVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(1312737694);
        if ((i13 & 6) == 0) {
            i14 = (k13.Q(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.Q(str) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= (i13 & 512) == 0 ? k13.Q(dVar) : k13.D(dVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= k13.D(function1) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= k13.D(aVar) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if (k13.t(i14 & 1, (i14 & 9363) != 9362)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            OnboardingStep onboardingStep = dVar.f22772a;
            v.b(aVar, null, k13, (i14 >> 12) & 14);
            Modifier u8 = modifier.u(w.f2903c);
            c4.c c13 = c4.d.c(299166818, new bj.e(1, str, function1), k13);
            rs0.g.f73622a.getClass();
            aVar2 = k13;
            k9.a(u8, c13, null, null, null, 0, rs0.g.a(k13).f73598a, 0L, null, c4.d.c(818784685, new b42.b(6, function1, onboardingStep, dVar), k13), aVar2, 805306416, 444);
        } else {
            aVar2 = k13;
            aVar2.J();
        }
        androidx.compose.runtime.f c03 = aVar2.c0();
        if (c03 != null) {
            c03.d = new c4.b(modifier, str, dVar, function1, aVar, i13, 1);
        }
    }

    public static final void c(String str, Composer composer, int i13) {
        String str2;
        androidx.compose.runtime.a k13 = composer.k(-1050756913);
        int i14 = (k13.Q(str) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            d41.a.f22769a.getClass();
            str2 = str;
            r.b(str2, null, null, "ZoningOnboardingAnimation", d41.a.e, k13, (i14 & 14) | 27648, 6);
        } else {
            str2 = str;
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new x(str2, i13, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L36;
     */
    @android.annotation.SuppressLint({"ContentName"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(w12.a<h12.f0> r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.d.d(w12.a, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r14 == androidx.compose.runtime.Composer.a.f3142b) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.String r16, java.lang.String r17, boolean r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.d.e(java.lang.String, java.lang.String, boolean, androidx.compose.runtime.Composer, int):void");
    }
}
