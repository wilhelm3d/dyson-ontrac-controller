package com.dyson.mobile.android.support.wifi;

import a10.l;
import a90.a0;
import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import com.brightcove.player.C;
import com.dyson.mobile.android.R;
import h12.f0;
import hx.v;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u3.p1;
import xd1.j;
/* loaded from: classes3.dex */
public final class c {
    public static final void a(w12.a<f0> aVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-1207080637);
        int i14 = (k13.D(aVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            j.a(null, 0.0f, 0.0f, false, null, c4.d.c(1692550339, new a0(aVar, 5), k13), k13, 196608, 31);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new l(i13, 9, aVar);
        }
    }

    public static final void b(int i13, Composer composer, w12.a aVar, boolean z13) {
        androidx.compose.runtime.a k13 = composer.k(-1448816287);
        int i14 = (k13.c(z13) ? 4 : 2) | i13 | (k13.D(aVar) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            c4.c c13 = c4.d.c(1421041548, new bv.b(z13, aVar, 1), k13);
            a.f16906a.getClass();
            vd1.a.b(c13, null, null, a.e, k13, 3078, 6);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new bv.b(z13, aVar, i13, 2);
        }
    }

    @SuppressLint({"ComposePreview"})
    public static final void c(g gVar, boolean z13, w12.a<f0> aVar, w12.a<f0> aVar2, Function1<? super Boolean, f0> function1, Composer composer, int i13) {
        gVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(701830141);
        int i14 = (k13.Q(gVar) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= k13.c(z13) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(aVar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= k13.D(aVar2) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= k13.D(function1) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if (k13.t(i14 & 1, (i14 & 9363) != 9362)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            qs0.c.a(v.T(R.string.wifi_compatibility_check_screen_title, 0, k13), "support.wifiCompatibilityCheck", null, null, aVar, null, null, c4.d.c(-1848364753, new c91.f(gVar, function1, z13, aVar2), k13), k13, ((i14 << 6) & 57344) | 12582960, 108);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new c91.g(gVar, z13, aVar, aVar2, function1, i13);
        }
    }
}
