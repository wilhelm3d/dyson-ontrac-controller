package com.dyson.mobile.android.audio.home.audiosource;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import bm.y;
import com.brightcove.player.C;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.home.audiosource.j;
import com.dyson.mobile.android.localisation.LocalisationKey;
import d5.c0;
import f5.g;
import f5.i0;
import g4.c;
import h12.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import r3.td;
import rf0.p;
import tl.c;
import u3.o3;
import u3.p1;
import u3.w1;
import wk.d;
import x12.r;
/* loaded from: classes2.dex */
public final class f {
    public static final void a(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-954407301);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            LocalisationKey localisationKey = p.T0;
            LocalisationKey localisationKey2 = p.U0;
            int i14 = LocalisationKey.f15078g;
            h(R.drawable.remove_cable_571h, localisationKey, localisationKey2, null, k13, (i14 << 3) | (i14 << 6), 8);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new vd0.g(i13, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.dyson.mobile.android.audio.home.audiosource.j.e r16, boolean r17, kotlin.jvm.functions.Function1 r18, kotlin.jvm.functions.Function1 r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r0 = 988882192(0x3af12510, float:0.0018397886)
            r6 = r20
            androidx.compose.runtime.a r10 = r6.k(r0)
            boolean r0 = r10.Q(r1)
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r0 | r5
            r6 = r5 & 48
            if (r6 != 0) goto L2d
            boolean r6 = r10.c(r2)
            if (r6 == 0) goto L2a
            r6 = 32
            goto L2c
        L2a:
            r6 = 16
        L2c:
            r0 = r0 | r6
        L2d:
            r6 = r5 & 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L3e
            boolean r6 = r10.D(r3)
            if (r6 == 0) goto L3b
            r6 = r13
            goto L3d
        L3b:
            r6 = 128(0x80, float:1.8E-43)
        L3d:
            r0 = r0 | r6
        L3e:
            r6 = r5 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L4e
            boolean r6 = r10.D(r4)
            if (r6 == 0) goto L4b
            r6 = 2048(0x800, float:2.87E-42)
            goto L4d
        L4b:
            r6 = 1024(0x400, float:1.435E-42)
        L4d:
            r0 = r0 | r6
        L4e:
            r6 = r0 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r14 = 0
            r15 = 1
            if (r6 == r7) goto L58
            r6 = r15
            goto L59
        L58:
            r6 = r14
        L59:
            r7 = r0 & 1
            boolean r6 = r10.t(r7, r6)
            if (r6 == 0) goto Lc1
            u3.p1 r6 = androidx.compose.runtime.b.f3172a
            vk.f r6 = new vk.f
            r6.<init>(r3, r15)
            r7 = 591685755(0x2344687b, float:1.0647306E-17)
            c4.c r6 = c4.d.c(r7, r6, r10)
            vk.g r7 = new vk.g
            r7.<init>(r1, r3, r14)
            r8 = -1398117035(0xffffffffacaa6d55, float:-4.843829E-12)
            c4.c r9 = c4.d.c(r8, r7, r10)
            r11 = 3078(0xc06, float:4.313E-42)
            r12 = 6
            r7 = 0
            r8 = 0
            vd1.a.b(r6, r7, r8, r9, r10, r11, r12)
            if (r2 == 0) goto Lb7
            r6 = 611392045(0x24711a2d, float:5.2280716E-17)
            r10.R(r6)
            r6 = r0 & 896(0x380, float:1.256E-42)
            if (r6 != r13) goto L90
            goto L91
        L90:
            r15 = r14
        L91:
            java.lang.Object r6 = r10.B()
            if (r15 != 0) goto La0
            androidx.compose.runtime.Composer$a r7 = androidx.compose.runtime.Composer.f3140a
            r7.getClass()
            androidx.compose.runtime.Composer$a$a r7 = androidx.compose.runtime.Composer.a.f3142b
            if (r6 != r7) goto Laa
        La0:
            u01.f r6 = new u01.f
            r7 = 29
            r6.<init>(r3, r7)
            r10.u(r6)
        Laa:
            w12.a r6 = (w12.a) r6
            int r0 = r0 >> 9
            r0 = r0 & 14
            xk.a.a(r0, r10, r4, r6)
            r10.a0(r14)
            goto Lc4
        Lb7:
            r0 = 611581362(0x2473fdb2, float:5.2907114E-17)
            r10.R(r0)
            r10.a0(r14)
            goto Lc4
        Lc1:
            r10.J()
        Lc4:
            androidx.compose.runtime.f r7 = r10.c0()
            if (r7 == 0) goto Ld2
            ba1.b r0 = new ba1.b
            r6 = 5
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.audiosource.f.b(com.dyson.mobile.android.audio.home.audiosource.j$e, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(243631710);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.u(fillElement);
            g4.c.f33023a.getClass();
            c0 d = p2.i.d(c.a.f33027f, false);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, fillElement);
            f5.g.f29643z0.getClass();
            i0.a aVar2 = g.a.f29645b;
            if (k13.f3143b == null) {
                u3.h.s();
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
            sc1.a.a(sc1.b.Large, androidx.compose.ui.platform.j.a(aVar, "TAG_AUSS_SPINNER"), k13, 54, 0);
            k13.a0(true);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new vd0.g(i13, 6);
        }
    }

    public static final void d(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1710920908);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            l.f12437a.getClass();
            xd1.a.a(null, null, null, null, null, null, l.f12438b, k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new vd0.g(i13, 5);
        }
    }

    public static final void e(Function1 function1, Composer composer, int i13) {
        int i14;
        androidx.compose.runtime.a k13 = composer.k(-608726496);
        if ((i13 & 6) == 0) {
            i14 = (k13.D(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            LocalisationKey localisationKey = p.P0;
            LocalisationKey localisationKey2 = p.Q0;
            c4.c c13 = c4.d.c(671744901, new vk.f(function1, 0), k13);
            int i15 = LocalisationKey.f15078g;
            h(R.drawable.device_connection_571h, localisationKey, localisationKey2, c13, k13, (i15 << 3) | 3072 | (i15 << 6), 0);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new y(function1, i13, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.dyson.mobile.android.audio.home.audiosource.j r23, wk.d r24, boolean r25, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.audio.home.audiosource.e, h12.f0> r26, kotlin.jvm.functions.Function1<? super wk.a, h12.f0> r27, kotlin.jvm.functions.Function1<? super tl.b, h12.f0> r28, kotlin.jvm.functions.Function1<? super bl.j, h12.f0> r29, w12.a<h12.f0> r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.audiosource.f.f(com.dyson.mobile.android.audio.home.audiosource.j, wk.d, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, w12.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void g(j jVar, wk.d dVar, boolean z13, Function1<? super e, f0> function1, Function1<? super wk.a, f0> function12, Function1<? super tl.b, f0> function13, Function1<? super bl.j, f0> function14, Composer composer, int i13) {
        Function1<? super e, f0> function15 = function1;
        androidx.compose.runtime.a k13 = composer.k(2003317714);
        int i14 = i13 | (k13.Q(jVar) ? 4 : 2) | (k13.Q(dVar) ? 32 : 16) | (k13.c(z13) ? 256 : 128) | (k13.D(function15) ? 2048 : 1024) | (k13.D(function12) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG) | (k13.D(function13) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG) | (k13.D(function14) ? 1048576 : 524288);
        if (k13.t(i14 & 1, (599187 & i14) != 599186)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            if (jVar instanceof j.e) {
                k13.R(1042989702);
                int i15 = i14 >> 3;
                b((j.e) jVar, z13, function15, function14, k13, ((i14 >> 9) & 7168) | (i14 & 14) | (i15 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | (i15 & 896));
                function15 = function15;
                k13.a0(false);
            } else if (jVar instanceof j.b) {
                k13.R(1042994862);
                c(k13, 0);
                k13.a0(false);
            } else if (jVar instanceof j.c) {
                k13.R(1042997367);
                d(k13, 0);
                k13.a0(false);
            } else if (jVar instanceof j.a) {
                k13.R(1043000208);
                a(k13, 0);
                k13.a0(false);
            } else if (jVar instanceof j.d) {
                k13.R(1043002548);
                e(function15, k13, (i14 >> 9) & 14);
                k13.a0(false);
            } else if (!(jVar instanceof j.f)) {
                throw v80.c.f(k13, 1042988304, false);
            } else {
                k13.R(1043005441);
                int i16 = i14 >> 9;
                i(dVar, function12, function13, k13, ((i14 >> 3) & 14) | (i16 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | (i16 & 896));
                k13.a0(false);
            }
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new vk.e(jVar, dVar, z13, function15, function12, function13, function14, i13);
        }
    }

    public static final void h(int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, Function2<? super Composer, ? super Integer, f0> function2, Composer composer, int i14, int i15) {
        int i16;
        Function2<? super Composer, ? super Integer, f0> function22;
        androidx.compose.runtime.a k13 = composer.k(1112656564);
        if ((i14 & 6) == 0) {
            i16 = (k13.f(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? k13.Q(localisationKey) : k13.D(localisationKey) ? 32 : 16;
        }
        if ((i14 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i14 & 512) == 0 ? k13.Q(localisationKey2) : k13.D(localisationKey2) ? 256 : 128;
        }
        int i17 = i15 & 8;
        if (i17 != 0) {
            i16 |= 3072;
        } else if ((i14 & 3072) == 0) {
            i16 |= k13.D(function2) ? 2048 : 1024;
        }
        if (k13.t(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                function2 = null;
            }
            Function2<? super Composer, ? super Integer, f0> function23 = function2;
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            vd1.a.b(function23, null, null, c4.d.c(-1513922247, new vk.d(i13, localisationKey, localisationKey2, 2), k13), k13, ((i16 >> 9) & 14) | 3072, 6);
            function22 = function23;
        } else {
            k13.J();
            function22 = function2;
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new td(i13, localisationKey, localisationKey2, function22, i14, i15);
        }
    }

    public static final void i(wk.d dVar, Function1<? super wk.a, f0> function1, Function1<? super tl.b, f0> function12, Composer composer, int i13) {
        int i14;
        c4.c cVar;
        androidx.compose.runtime.a k13 = composer.k(1510643290);
        if ((i13 & 6) == 0) {
            i14 = (k13.Q(dVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.D(function1) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(function12) ? 256 : 128;
        }
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            int q13 = dVar.q();
            LocalisationKey title = dVar.getTitle();
            LocalisationKey description = dVar.getDescription();
            if (dVar.equals(d.c.f85971a)) {
                k13.R(907789059);
                k13.a0(false);
                cVar = null;
            } else {
                k13.R(907579252);
                cVar = c4.d.c(-1747145468, new uz.b(11, dVar, function1), k13);
                k13.a0(false);
            }
            c4.c cVar2 = cVar;
            int i15 = LocalisationKey.f15078g;
            h(q13, title, description, cVar2, k13, (i15 << 3) | (i15 << 6), 0);
            if (dVar instanceof d.b) {
                tl.c cVar3 = ((d.b) dVar).f85968a;
                if (cVar3 instanceof c.d) {
                    k13.R(907958103);
                    c.d dVar2 = (c.d) cVar3;
                    Object B = k13.B();
                    Composer.f3140a.getClass();
                    if (B == Composer.a.f3142b) {
                        B = new vc1.d(23);
                        k13.u(B);
                    }
                    tl.a.a(dVar2, function12, (Function1) B, k13, ((i14 >> 3) & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | MLKEMEngine.KyberPolyBytes);
                    k13.a0(false);
                }
            }
            k13.R(908128200);
            k13.a0(false);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new oz0.a(i13, 25, dVar, function1, function12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(boolean r15, kotlin.jvm.functions.Function1 r16, androidx.compose.runtime.Composer r17, int r18) {
        /*
            r12 = r16
            r13 = r18
            r0 = -525836932(0xffffffffe0a85d7c, float:-9.7055914E19)
            r1 = r17
            androidx.compose.runtime.a r9 = r1.k(r0)
            boolean r0 = r9.c(r15)
            if (r0 == 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = 2
        L16:
            r0 = r0 | r13
            boolean r1 = r9.D(r12)
            r3 = 32
            if (r1 == 0) goto L21
            r1 = r3
            goto L23
        L21:
            r1 = 16
        L23:
            r0 = r0 | r1
            r1 = r0 & 19
            r4 = 18
            r5 = 0
            r6 = 1
            if (r1 == r4) goto L2e
            r1 = r6
            goto L2f
        L2e:
            r1 = r5
        L2f:
            r4 = r0 & 1
            boolean r1 = r9.t(r4, r1)
            r14 = 6
            if (r1 == 0) goto L7e
            u3.p1 r1 = androidx.compose.runtime.b.f3172a
            androidx.compose.ui.Modifier$a r1 = androidx.compose.ui.Modifier.f3231b
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.w.d(r1, r4)
            r4 = r0 & 112(0x70, float:1.57E-43)
            if (r4 != r3) goto L47
            goto L48
        L47:
            r6 = r5
        L48:
            java.lang.Object r3 = r9.B()
            if (r6 != 0) goto L57
            androidx.compose.runtime.Composer$a r4 = androidx.compose.runtime.Composer.f3140a
            r4.getClass()
            androidx.compose.runtime.Composer$a$a r4 = androidx.compose.runtime.Composer.a.f3142b
            if (r3 != r4) goto L5f
        L57:
            vk.h r3 = new vk.h
            r3.<init>(r12, r5)
            r9.u(r3)
        L5f:
            r5 = r3
            w12.a r5 = (w12.a) r5
            com.dyson.mobile.android.audio.home.audiosource.l r3 = com.dyson.mobile.android.audio.home.audiosource.l.f12437a
            r3.getClass()
            c4.c r8 = com.dyson.mobile.android.audio.home.audiosource.l.d
            int r0 = r0 << r14
            r0 = r0 & 896(0x380, float:1.256E-42)
            r3 = 12582918(0xc00006, float:1.7632424E-38)
            r10 = r0 | r3
            r11 = 106(0x6a, float:1.49E-43)
            r0 = r1
            r1 = 0
            r3 = 0
            r6 = 0
            r7 = 0
            r2 = r15
            p91.f.a(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            goto L81
        L7e:
            r9.J()
        L81:
            androidx.compose.runtime.f r0 = r9.c0()
            if (r0 == 0) goto L8e
            e21.l r1 = new e21.l
            r1.<init>(r15, r12, r13, r14)
            r0.d = r1
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.audiosource.f.j(boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r14 == androidx.compose.runtime.Composer.a.f3142b) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(kotlin.jvm.functions.Function1 r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r0 = -1202478659(0xffffffffb853a1bd, float:-5.045695E-5)
            androidx.compose.runtime.a r10 = r14.k(r0)
            boolean r14 = r10.D(r13)
            r0 = 2
            r1 = 4
            if (r14 == 0) goto L11
            r14 = r1
            goto L12
        L11:
            r14 = r0
        L12:
            r14 = r14 | r15
            r2 = r14 & 3
            r3 = 0
            r4 = 1
            if (r2 == r0) goto L1b
            r2 = r4
            goto L1c
        L1b:
            r2 = r3
        L1c:
            r5 = r14 & 1
            boolean r2 = r10.t(r5, r2)
            if (r2 == 0) goto L5b
            u3.p1 r2 = androidx.compose.runtime.b.f3172a
            r14 = r14 & 14
            if (r14 != r1) goto L2b
            r3 = r4
        L2b:
            java.lang.Object r14 = r10.B()
            if (r3 != 0) goto L3a
            androidx.compose.runtime.Composer$a r1 = androidx.compose.runtime.Composer.f3140a
            r1.getClass()
            androidx.compose.runtime.Composer$a$a r1 = androidx.compose.runtime.Composer.a.f3142b
            if (r14 != r1) goto L42
        L3a:
            vk.h r14 = new vk.h
            r14.<init>(r13, r4)
            r10.u(r14)
        L42:
            r6 = r14
            w12.a r6 = (w12.a) r6
            com.dyson.mobile.android.audio.home.audiosource.l r14 = com.dyson.mobile.android.audio.home.audiosource.l.f12437a
            r14.getClass()
            c4.c r9 = com.dyson.mobile.android.audio.home.audiosource.l.f12439c
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = 111(0x6f, float:1.56E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            p91.f.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            goto L5e
        L5b:
            r10.J()
        L5e:
            androidx.compose.runtime.f r14 = r10.c0()
            if (r14 == 0) goto L6b
            vk.f r1 = new vk.f
            r1.<init>(r13, r15, r0)
            r14.d = r1
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.audiosource.f.k(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
