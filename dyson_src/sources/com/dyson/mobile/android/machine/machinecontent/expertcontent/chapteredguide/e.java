package com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g;
import com.dyson.mobile.android.resources.brightcove.DysonBrightcoveVideoPlayerView;
import g21.l;
import i91.c;
import kotlin.jvm.functions.Function1;
import n5.t;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u3.k1;
import u3.p1;
/* loaded from: classes3.dex */
public final class e {
    public static final void a(DysonBrightcoveVideoPlayerView dysonBrightcoveVideoPlayerView, g.a aVar, Modifier modifier, Function1 function1, Composer composer, int i13) {
        int i14;
        Modifier.a aVar2;
        Object obj = aVar;
        obj.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(1887714092);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? k13.Q(dysonBrightcoveVideoPlayerView) : k13.D(dysonBrightcoveVideoPlayerView) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.D(obj) ? 32 : 16;
        }
        int i15 = i14 | MLKEMEngine.KyberPolyBytes;
        if ((i13 & 3072) == 0) {
            i15 |= k13.D(function1) ? 2048 : 1024;
        }
        if (k13.t(i15 & 1, (i15 & 1171) != 1170)) {
            Modifier.a aVar3 = Modifier.f3231b;
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = androidx.compose.runtime.d.j("");
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            FillElement fillElement = w.f2903c;
            aVar3.u(fillElement);
            md1.b.f53765a.getClass();
            i91.c cVar = md1.b.f53766b;
            cVar.f41169a.getClass();
            float f13 = c.b.f41181g;
            cVar.f41169a.getClass();
            Modifier a13 = j.a(androidx.compose.foundation.layout.d.r(fillElement, f13, c.b.f41182h), "ExpertContentChapteredGuideBrightcovePlayerTestTag");
            Object B2 = k13.B();
            if (B2 == c0094a) {
                B2 = new a01.e(k1Var, 26);
                k13.u(B2);
            }
            Modifier b13 = t.b(a13, false, (Function1) B2);
            boolean D = ((i15 & 14) == 4 || ((i15 & 8) != 0 && k13.D(dysonBrightcoveVideoPlayerView))) | ((i15 & 7168) == 2048) | k13.D(obj);
            Object B3 = k13.B();
            if (D || B3 == c0094a) {
                l lVar = new l(dysonBrightcoveVideoPlayerView, function1, obj, false, 16);
                obj = obj;
                k13.u(lVar);
                B3 = lVar;
            }
            Function1 function12 = (Function1) B3;
            boolean D2 = k13.D(obj);
            Object B4 = k13.B();
            if (D2 || B4 == c0094a) {
                B4 = new i81.d(21, obj, k1Var);
                k13.u(B4);
            }
            androidx.compose.ui.viewinterop.a.a(function12, b13, (Function1) B4, k13, 0, 0);
            aVar2 = aVar3;
        } else {
            k13.J();
            aVar2 = modifier;
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new aq0.g((Object) dysonBrightcoveVideoPlayerView, obj, aVar2, function1, i13, 28);
        }
    }
}
