package com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.u;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import b6.p;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import e6.f;
import f5.g;
import f5.i0;
import g4.c;
import g4.e;
import i91.c;
import k30.o;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p2.n1;
import q5.t0;
import r3.n5;
import r3.nd;
import u3.o3;
import u3.p1;
import u3.w1;
import x1.i;
import x12.r;
/* loaded from: classes3.dex */
public final class d {
    public static final void a(g.a aVar, Modifier modifier, Function1 function1, Composer composer, int i13) {
        int i14;
        Modifier.a aVar2;
        boolean z13;
        Function1 function12 = function1;
        aVar.getClass();
        ExpertContentVideoPlaylist expertContentVideoPlaylist = aVar.f15146f;
        function12.getClass();
        androidx.compose.runtime.a k13 = composer.k(-377782673);
        if ((i13 & 6) == 0) {
            i14 = (k13.D(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i15 = i14 | 48;
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= k13.D(function12) ? 256 : 128;
        }
        if (k13.t(i15 & 1, (i15 & 147) != 146)) {
            Modifier.a aVar3 = Modifier.f3231b;
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier d = w.d(aVar3, 1.0f);
            f.a aVar4 = e6.f.e;
            Modifier e = w.e(d, 56.0f);
            md1.b.f53765a.getClass();
            i91.c cVar = md1.b.f53766b;
            c.C1280c c1280c = cVar.e;
            c.C1280c c1280c2 = cVar.e;
            Modifier u8 = androidx.compose.foundation.layout.d.u(e, c1280c.e, 0.0f, c1280c.d, 0.0f, 10);
            g4.c.f33023a.getClass();
            e.b bVar = c.a.f33033l;
            androidx.compose.foundation.layout.c.f2839a.getClass();
            u a13 = t.a(androidx.compose.foundation.layout.c.f2840b, bVar, k13, 48);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, u8);
            f5.g.f29643z0.getClass();
            i0.a aVar5 = g.a.f29645b;
            if (k13.f3143b == null) {
                u3.h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar5);
            } else {
                k13.s();
            }
            o3.a(k13, a13, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !r.c(k13.B(), Integer.valueOf(hashCode))) {
                i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            Modifier a14 = j.a(androidx.compose.foundation.layout.d.u(n1.f62706a.a(aVar3, 1.0f, true), 0.0f, 0.0f, c1280c2.f41188b, 0.0f, 11), "ExpertContentChapteredGuideActionBarTextTestTag");
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = new o(7);
                k13.u(B);
            }
            Modifier b13 = n5.t.b(a14, false, (Function1) B);
            String title = expertContentVideoPlaylist != null ? expertContentVideoPlaylist.getTitle() : null;
            if (title == null) {
                title = "";
            }
            t0 t0Var = md1.b.c(k13).f53777h;
            long j8 = md1.b.a(k13).f41049c.f41082a;
            b6.h.f7062b.getClass();
            int i16 = b6.h.e;
            p.f7093b.getClass();
            aVar2 = aVar3;
            nd.c(title, b13, j8, 0L, null, null, null, 0L, null, b6.h.a(i16), 0L, p.d, false, 1, 0, null, t0Var, k13, 0, 24960, 109560);
            k13 = k13;
            Modifier a15 = j.a(w.n(aVar2, c1280c2.e), "ExpertContentChapteredGuideActionBarCloseButtonTestTag");
            boolean z14 = (i15 & 896) == 256;
            Object B2 = k13.B();
            if (z14 || B2 == c0094a) {
                function12 = function1;
                z13 = true;
                B2 = new k30.p(function12, 1);
                k13.u(B2);
            } else {
                function12 = function1;
                z13 = true;
            }
            a.f15124a.getClass();
            n5.a((w12.a) B2, a15, false, null, null, a.f15125b, k13, 1572864, 60);
            k13.a0(z13);
            if (expertContentVideoPlaylist != null) {
                k13.R(-1707652666);
                dd1.g.a(new dd1.d(expertContentVideoPlaylist.getVideos().size(), aVar.f15143a + 1, aVar.f15147g, md1.b.a(k13).f41049c.f41082a, false, null), androidx.compose.foundation.layout.d.u(androidx.compose.foundation.layout.d.s(aVar2, c1280c2.e, 0.0f, 2), 0.0f, c1280c2.d, 0.0f, 0.0f, 13), false, "ExpertContentChapteredGuideProgressBarTestTag", k13, 3072, 4);
                k13 = k13;
                k13.a0(false);
            } else {
                k13.R(-1707055885);
                k13.a0(false);
            }
        } else {
            k13.J();
            aVar2 = modifier;
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new ki0.d(aVar, aVar2, function12, i13, 0);
        }
    }
}
