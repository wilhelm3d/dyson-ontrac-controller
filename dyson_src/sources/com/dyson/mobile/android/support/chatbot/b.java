package com.dyson.mobile.android.support.chatbot;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import com.brightcove.player.C;
import com.dyson.mobile.android.support.chatbot.a;
import f5.g;
import f5.i0;
import g4.c;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n4.z;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import r3.nd;
import rs0.g;
import u3.h;
import u3.o3;
import u3.p1;
import u3.w1;
import x1.i;
import x12.r;
/* loaded from: classes3.dex */
public final class b {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r18, androidx.compose.runtime.Composer r19, androidx.compose.ui.Modifier r20, java.util.List r21, kotlin.jvm.functions.Function1 r22) {
        /*
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = -134455703(0xfffffffff7fc5e69, float:-1.02372943E34)
            r4 = r19
            androidx.compose.runtime.a r14 = r4.k(r3)
            boolean r3 = r14.D(r1)
            if (r3 == 0) goto L17
            r3 = 4
            goto L18
        L17:
            r3 = 2
        L18:
            r3 = r3 | r0
            boolean r4 = r14.D(r2)
            r5 = 32
            if (r4 == 0) goto L23
            r4 = r5
            goto L25
        L23:
            r4 = 16
        L25:
            r3 = r3 | r4
            r3 = r3 | 384(0x180, float:5.38E-43)
            r4 = r3 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 1
            r8 = 0
            if (r4 == r6) goto L32
            r4 = r7
            goto L33
        L32:
            r4 = r8
        L33:
            r6 = r3 & 1
            boolean r4 = r14.t(r6, r4)
            if (r4 == 0) goto L95
            androidx.compose.ui.Modifier$a r17 = androidx.compose.ui.Modifier.f3231b
            u3.p1 r4 = androidx.compose.runtime.b.f3172a
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.d.m(r17)
            r6 = 3
            r2.f0 r6 = r2.j0.a(r8, r6, r14)
            rs0.g r9 = rs0.g.f73622a
            r9.getClass()
            rs0.e r9 = rs0.g.b(r14)
            float r9 = r9.d
            rs0.e r10 = rs0.g.b(r14)
            float r10 = r10.d
            r11 = 5
            r12 = 0
            p2.g1 r9 = androidx.compose.foundation.layout.d.e(r12, r9, r12, r10, r11)
            boolean r10 = r14.D(r1)
            r3 = r3 & 112(0x70, float:1.57E-43)
            if (r3 != r5) goto L68
            r8 = r7
        L68:
            r3 = r10 | r8
            java.lang.Object r5 = r14.B()
            if (r3 != 0) goto L79
            androidx.compose.runtime.Composer$a r3 = androidx.compose.runtime.Composer.f3140a
            r3.getClass()
            androidx.compose.runtime.Composer$a$a r3 = androidx.compose.runtime.Composer.a.f3142b
            if (r5 != r3) goto L81
        L79:
            dr0.d r5 = new dr0.d
            r5.<init>(r1, r2, r7)
            r14.u(r5)
        L81:
            r13 = r5
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r15 = 0
            r16 = 504(0x1f8, float:7.06E-43)
            r7 = 0
            r8 = 0
            r5 = r6
            r6 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2.b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r17
            goto L9a
        L95:
            r14.J()
            r3 = r20
        L9a:
            androidx.compose.runtime.f r4 = r14.c0()
            if (r4 == 0) goto La7
            h71.a r5 = new h71.a
            r5.<init>(r1, r2, r3, r0)
            r4.d = r5
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.chatbot.b.a(int, androidx.compose.runtime.Composer, androidx.compose.ui.Modifier, java.util.List, kotlin.jvm.functions.Function1):void");
    }

    public static final void b(a.b bVar, Modifier modifier, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        Modifier.a aVar2;
        androidx.compose.runtime.a k13 = composer.k(-92727907);
        int i14 = (k13.Q(bVar) ? 4 : 2) | i13 | 48;
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            Modifier.a aVar3 = Modifier.f3231b;
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier d = w.d(aVar3, 1.0f);
            g.f73622a.getClass();
            Modifier u8 = androidx.compose.foundation.layout.d.u(d, g.b(k13).d, 0.0f, g.b(k13).d, g.b(k13).f73618c, 2);
            androidx.compose.foundation.layout.c.f2839a.getClass();
            c.k kVar = androidx.compose.foundation.layout.c.d;
            g4.c.f33023a.getClass();
            androidx.compose.foundation.layout.g a13 = f.a(kVar, c.a.f33035n, k13, 0);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, u8);
            f5.g.f29643z0.getClass();
            i0.a aVar4 = g.a.f29645b;
            if (k13.f3143b == null) {
                h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar4);
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
            p2.r rVar = p2.r.f62721a;
            nd.c(bVar.f16787a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, rs0.g.d(k13).f73626f, k13, 0, 0, 131070);
            nd.c(bVar.f16788b, androidx.compose.foundation.layout.d.u(aVar3, 0.0f, rs0.g.b(k13).f73617b, 0.0f, 0.0f, 13), rs0.g.a(k13).e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, rs0.g.d(k13).f73627g, k13, 0, 0, 131064);
            aVar = k13;
            aVar.a0(true);
            aVar2 = aVar3;
        } else {
            aVar = k13;
            aVar.J();
            aVar2 = modifier;
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new gv.r(bVar, aVar2, i13, 5);
        }
    }

    public static final void c(androidx.compose.material.d dVar, List list, Function1 function1, Function2 function2, Modifier modifier, Composer composer, int i13) {
        int i14;
        dVar.getClass();
        list.getClass();
        androidx.compose.runtime.a k13 = composer.k(871520576);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? k13.Q(dVar) : k13.D(dVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.D(list) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= k13.D(function2) ? 2048 : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= k13.Q(modifier) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if (k13.t(i14 & 1, (i14 & 9363) != 9362)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier a13 = j.a(modifier, "bottom_sheet_layout");
            z.f55660b.getClass();
            androidx.compose.material.c.a(c4.d.c(1278396270, new dr0.g(list, function1, 1), k13), a13, dVar, false, null, 0.0f, z.f55662f, 0L, 0L, c4.d.c(-1148350489, new a11.e(2, function2), k13), k13, (androidx.compose.material.d.e << 6) | 806879238 | ((i14 << 6) & 896));
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new c4.b(dVar, list, function1, function2, modifier, i13, 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.dyson.mobile.android.support.chatbot.a.AbstractC0602a r16, w12.a r17, androidx.compose.ui.Modifier r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.chatbot.b.d(com.dyson.mobile.android.support.chatbot.a$a, w12.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
