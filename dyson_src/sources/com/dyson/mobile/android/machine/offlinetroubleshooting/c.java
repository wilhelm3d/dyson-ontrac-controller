package com.dyson.mobile.android.machine.offlinetroubleshooting;

import a10.l;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import e6.f;
import h12.f0;
import kotlin.jvm.functions.Function1;
import n91.g;
import p91.f;
import u3.p1;
/* loaded from: classes3.dex */
public final class c {
    public static final void a(w12.a<f0> aVar, Composer composer, int i13) {
        w12.a<f0> aVar2;
        androidx.compose.runtime.a k13 = composer.k(1619616268);
        int i14 = (k13.D(aVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier a13 = j.a(Modifier.f3231b, "OfflineTroubleshootingRetryButton");
            ej0.b.f26958a.getClass();
            aVar2 = aVar;
            f.a(a13, false, false, 0L, aVar2, null, null, ej0.b.d, k13, ((i14 << 12) & 57344) | 12582918, com.salesforce.marketingcloud.analytics.stats.b.f20726n);
        } else {
            aVar2 = aVar;
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new l(i13, 16, aVar2);
        }
    }

    public static final void b(b bVar, Function1<? super OfflineTroubleshootingItem, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(271014968);
        int i14 = (k13.D(bVar) ? 4 : 2) | i13 | (k13.D(function1) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            for (OfflineTroubleshootingSection offlineTroubleshootingSection : bVar.f15292a.d) {
                xd1.a.a(null, pf0.f.c(offlineTroubleshootingSection.d), null, null, null, null, c4.d.c(250321393, new a11.c(17, offlineTroubleshootingSection, function1), k13), k13, 12582912, 125);
            }
            p1 p1Var2 = androidx.compose.runtime.b.f3172a;
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new cr0.a(bVar, function1, i13, 12);
        }
    }

    public static final void c(OfflineTroubleshootingItemDetail offlineTroubleshootingItemDetail, w12.a<f0> aVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1025380706);
        int i14 = (k13.D(offlineTroubleshootingItemDetail) ? 4 : 2) | i13 | (k13.D(aVar) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar2 = Modifier.f3231b;
            f.a aVar3 = e6.f.e;
            g.b(pf0.f.c(offlineTroubleshootingItemDetail.d), aVar, j.a(w.g(aVar2, ((Configuration) k13.A(AndroidCompositionLocals_androidKt.f3654a)).screenHeightDp / 2.0f, 0.0f, 2), "OfflineTroubleshootingBottomSheet"), null, 0L, null, null, null, c4.d.c(374157856, new ej0.j(offlineTroubleshootingItemDetail, 3), k13), k13, (i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | 100663296, 248);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new cr0.a(offlineTroubleshootingItemDetail, aVar, i13, 13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
        if (r7 == androidx.compose.runtime.Composer.a.f3142b) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.dyson.mobile.android.machine.offlinetroubleshooting.b r24, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.machine.offlinetroubleshooting.OfflineTroubleshootingItem, h12.f0> r25, w12.a<h12.f0> r26, w12.a<h12.f0> r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.offlinetroubleshooting.c.d(com.dyson.mobile.android.machine.offlinetroubleshooting.b, kotlin.jvm.functions.Function1, w12.a, w12.a, androidx.compose.runtime.Composer, int):void");
    }
}
