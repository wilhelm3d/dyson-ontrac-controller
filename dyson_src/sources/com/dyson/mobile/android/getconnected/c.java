package com.dyson.mobile.android.getconnected;

import a90.b0;
import androidx.compose.runtime.Composer;
import com.brightcove.player.C;
import com.dyson.mobile.android.R;
import ga1.j;
import h12.f0;
import i12.a1;
import kotlin.jvm.functions.Function1;
import ld.a0;
import ld.o;
import ld.p;
import my.s;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import se1.v;
import software.amazon.awssdk.crt.http.Http2StreamManagerOptions;
import u3.p1;
/* loaded from: classes2.dex */
public final class c {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r8 == androidx.compose.runtime.Composer.a.f3142b) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(w12.a<h12.f0> r25, w12.a<h12.f0> r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.getconnected.c.a(w12.a, w12.a, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(b71.e eVar, boolean z13, Function1<? super e, f0> function1, w12.a<f0> aVar, b bVar, Composer composer, int i13, int i14) {
        int i15;
        function1.getClass();
        aVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(2038994301);
        if ((i13 & 6) == 0) {
            i15 = (k13.f(eVar == null ? -1 : eVar.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= k13.c(z13) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= k13.D(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= k13.D(aVar) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i15 |= k13.Q(bVar) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if (k13.t(i15 & 1, (i15 & 9363) != 9362)) {
            if (i16 != 0) {
                z13 = false;
            }
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            v.b(aVar, null, k13, (i15 >> 9) & 14);
            md1.d.a(true, c4.d.c(-1488631741, new c91.f(bVar, function1, eVar, z13), k13), k13, 54, 0);
        } else {
            k13.J();
        }
        boolean z14 = z13;
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new j(eVar, z14, function1, aVar, bVar, i13, i14, 10);
        }
    }

    public static final void c(b71.e eVar, boolean z13, Function1<? super e, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        androidx.compose.runtime.a k13 = composer.k(-1336583997);
        int i14 = (k13.f(eVar == null ? -1 : eVar.ordinal()) ? 4 : 2) | i13 | (k13.c(z13) ? 32 : 16) | (k13.D(function1) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            o c13 = a0.c(p.e.a(R.raw.app_intro_anim), k13, 0);
            ld.b h13 = a1.h(c13.getValue(), false, false, false, null, 0.0f, Http2StreamManagerOptions.DEFAULT_MAX, k13, 958);
            md1.b.f53765a.getClass();
            i91.c cVar = md1.b.f53766b;
            cVar.f41169a.getClass();
            cVar.f41169a.getClass();
            xd1.j.a(null, 0.0f, 0.0f, false, null, c4.d.c(-759296701, new s(h13, c13, z13, eVar, function1), k13), k13, 196608, 25);
            aVar = k13;
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new b0(eVar, z13, function1, i13, 13);
        }
    }
}
