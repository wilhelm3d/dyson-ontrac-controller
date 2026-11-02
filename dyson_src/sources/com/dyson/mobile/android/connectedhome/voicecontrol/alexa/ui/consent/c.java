package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import androidx.compose.runtime.Composer;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b;
import h12.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import se1.v;
import u3.p1;
/* loaded from: classes2.dex */
public final class c {
    public static final void a(final b.a aVar, final Function1<? super d, f0> function1, w12.a<f0> aVar2, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-2093389113);
        int i14 = (k13.Q(aVar) ? 4 : 2) | i13 | (k13.D(function1) ? 32 : 16) | (k13.D(aVar2) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            v.b(aVar2, null, k13, (i14 >> 6) & 14);
            vd1.a.b(c4.d.c(-1461340942, new Function2() { // from class: d00.d
                /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
                    if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
                    if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L30;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
                    /*
                        r19 = this;
                        r0 = r19
                        int r1 = r3
                        androidx.compose.runtime.Composer$a r2 = androidx.compose.runtime.Composer.f3140a
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        kotlin.jvm.functions.Function1 r6 = r2
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a r0 = r1
                        switch(r1) {
                            case 0: goto L75;
                            default: goto L10;
                        }
                    L10:
                        r1 = r20
                        androidx.compose.runtime.Composer r1 = (androidx.compose.runtime.Composer) r1
                        r7 = r21
                        java.lang.Integer r7 = (java.lang.Integer) r7
                        int r7 = r7.intValue()
                        r8 = r7 & 3
                        if (r8 == r4) goto L21
                        r3 = r5
                    L21:
                        r4 = r7 & 1
                        boolean r3 = r1.t(r4, r3)
                        if (r3 == 0) goto L6d
                        u3.p1 r3 = androidx.compose.runtime.b.f3172a
                        androidx.compose.ui.Modifier$a r3 = androidx.compose.ui.Modifier.f3231b
                        java.lang.String r4 = "AlexaConsentDenyButton"
                        androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.j.a(r3, r4)
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a$a r0 = r0.f13020c
                        boolean r9 = r0.f13022b
                        boolean r8 = r0.f13021a
                        p91.a$b r13 = p91.a.b.f63103a
                        boolean r0 = r1.Q(r6)
                        java.lang.Object r3 = r1.B()
                        if (r0 != 0) goto L4c
                        r2.getClass()
                        androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
                        if (r3 != r0) goto L55
                    L4c:
                        cc0.j0 r3 = new cc0.j0
                        r0 = 4
                        r3.<init>(r6, r0)
                        r1.u(r3)
                    L55:
                        r12 = r3
                        w12.a r12 = (w12.a) r12
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j r0 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13043a
                        r0.getClass()
                        c4.c r15 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13045c
                        r17 = 12582918(0xc00006, float:1.7632424E-38)
                        r18 = 72
                        r10 = 0
                        r14 = 0
                        r16 = r1
                        p91.f.a(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
                        goto L72
                    L6d:
                        r16 = r1
                        r16.J()
                    L72:
                        h12.f0 r0 = h12.f0.f36844a
                        return r0
                    L75:
                        r10 = r20
                        androidx.compose.runtime.Composer r10 = (androidx.compose.runtime.Composer) r10
                        r1 = r21
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        int r1 = r1.intValue()
                        r7 = r1 & 3
                        if (r7 == r4) goto L86
                        r3 = r5
                    L86:
                        r1 = r1 & r5
                        boolean r1 = r10.t(r1, r3)
                        if (r1 == 0) goto Ld0
                        u3.p1 r1 = androidx.compose.runtime.b.f3172a
                        androidx.compose.ui.Modifier$a r1 = androidx.compose.ui.Modifier.f3231b
                        java.lang.String r3 = "AlexaConsentAuthoriseButton"
                        androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.j.a(r1, r3)
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a$a r0 = r0.f13019b
                        boolean r3 = r0.f13022b
                        boolean r0 = r0.f13021a
                        p91.a$a r7 = p91.a.C1915a.f63102a
                        boolean r4 = r10.Q(r6)
                        java.lang.Object r5 = r10.B()
                        if (r4 != 0) goto Lb0
                        r2.getClass()
                        androidx.compose.runtime.Composer$a$a r2 = androidx.compose.runtime.Composer.a.f3142b
                        if (r5 != r2) goto Lb9
                    Lb0:
                        cc0.j0 r5 = new cc0.j0
                        r2 = 6
                        r5.<init>(r6, r2)
                        r10.u(r5)
                    Lb9:
                        r6 = r5
                        w12.a r6 = (w12.a) r6
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j r2 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13043a
                        r2.getClass()
                        c4.c r9 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13044b
                        r11 = 12582918(0xc00006, float:1.7632424E-38)
                        r12 = 72
                        r4 = 0
                        r8 = 0
                        r2 = r0
                        p91.f.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
                        goto Ld3
                    Ld0:
                        r10.J()
                    Ld3:
                        h12.f0 r0 = h12.f0.f36844a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: d00.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, k13), null, c4.d.c(-1688561932, new Function2() { // from class: d00.d
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r20, java.lang.Object r21) {
                    /*
                        r19 = this;
                        r0 = r19
                        int r1 = r3
                        androidx.compose.runtime.Composer$a r2 = androidx.compose.runtime.Composer.f3140a
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        kotlin.jvm.functions.Function1 r6 = r2
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a r0 = r1
                        switch(r1) {
                            case 0: goto L75;
                            default: goto L10;
                        }
                    L10:
                        r1 = r20
                        androidx.compose.runtime.Composer r1 = (androidx.compose.runtime.Composer) r1
                        r7 = r21
                        java.lang.Integer r7 = (java.lang.Integer) r7
                        int r7 = r7.intValue()
                        r8 = r7 & 3
                        if (r8 == r4) goto L21
                        r3 = r5
                    L21:
                        r4 = r7 & 1
                        boolean r3 = r1.t(r4, r3)
                        if (r3 == 0) goto L6d
                        u3.p1 r3 = androidx.compose.runtime.b.f3172a
                        androidx.compose.ui.Modifier$a r3 = androidx.compose.ui.Modifier.f3231b
                        java.lang.String r4 = "AlexaConsentDenyButton"
                        androidx.compose.ui.Modifier r7 = androidx.compose.ui.platform.j.a(r3, r4)
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a$a r0 = r0.f13020c
                        boolean r9 = r0.f13022b
                        boolean r8 = r0.f13021a
                        p91.a$b r13 = p91.a.b.f63103a
                        boolean r0 = r1.Q(r6)
                        java.lang.Object r3 = r1.B()
                        if (r0 != 0) goto L4c
                        r2.getClass()
                        androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
                        if (r3 != r0) goto L55
                    L4c:
                        cc0.j0 r3 = new cc0.j0
                        r0 = 4
                        r3.<init>(r6, r0)
                        r1.u(r3)
                    L55:
                        r12 = r3
                        w12.a r12 = (w12.a) r12
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j r0 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13043a
                        r0.getClass()
                        c4.c r15 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13045c
                        r17 = 12582918(0xc00006, float:1.7632424E-38)
                        r18 = 72
                        r10 = 0
                        r14 = 0
                        r16 = r1
                        p91.f.a(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
                        goto L72
                    L6d:
                        r16 = r1
                        r16.J()
                    L72:
                        h12.f0 r0 = h12.f0.f36844a
                        return r0
                    L75:
                        r10 = r20
                        androidx.compose.runtime.Composer r10 = (androidx.compose.runtime.Composer) r10
                        r1 = r21
                        java.lang.Integer r1 = (java.lang.Integer) r1
                        int r1 = r1.intValue()
                        r7 = r1 & 3
                        if (r7 == r4) goto L86
                        r3 = r5
                    L86:
                        r1 = r1 & r5
                        boolean r1 = r10.t(r1, r3)
                        if (r1 == 0) goto Ld0
                        u3.p1 r1 = androidx.compose.runtime.b.f3172a
                        androidx.compose.ui.Modifier$a r1 = androidx.compose.ui.Modifier.f3231b
                        java.lang.String r3 = "AlexaConsentAuthoriseButton"
                        androidx.compose.ui.Modifier r1 = androidx.compose.ui.platform.j.a(r1, r3)
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a$a r0 = r0.f13019b
                        boolean r3 = r0.f13022b
                        boolean r0 = r0.f13021a
                        p91.a$a r7 = p91.a.C1915a.f63102a
                        boolean r4 = r10.Q(r6)
                        java.lang.Object r5 = r10.B()
                        if (r4 != 0) goto Lb0
                        r2.getClass()
                        androidx.compose.runtime.Composer$a$a r2 = androidx.compose.runtime.Composer.a.f3142b
                        if (r5 != r2) goto Lb9
                    Lb0:
                        cc0.j0 r5 = new cc0.j0
                        r2 = 6
                        r5.<init>(r6, r2)
                        r10.u(r5)
                    Lb9:
                        r6 = r5
                        w12.a r6 = (w12.a) r6
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j r2 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13043a
                        r2.getClass()
                        c4.c r9 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.j.f13044b
                        r11 = 12582918(0xc00006, float:1.7632424E-38)
                        r12 = 72
                        r4 = 0
                        r8 = 0
                        r2 = r0
                        p91.f.a(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
                        goto Ld3
                    Ld0:
                        r10.J()
                    Ld3:
                        h12.f0 r0 = h12.f0.f36844a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: d00.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, k13), c4.d.c(-904701876, new d00.c(aVar, function1, 2), k13), k13, 3462, 2);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new a10.h(i13, 22, (Object) aVar, (Object) aVar2, (Function1) function1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r2 = r19
            r6 = r23
            r18.getClass()
            r2.getClass()
            r20.getClass()
            r0 = -331867575(0xffffffffec381a49, float:-8.902659E26)
            r1 = r22
            androidx.compose.runtime.a r15 = r1.k(r0)
            r1 = r18
            boolean r0 = r15.Q(r1)
            if (r0 == 0) goto L20
            r0 = 4
            goto L21
        L20:
            r0 = 2
        L21:
            r0 = r0 | r6
            r3 = r6 & 48
            r4 = 32
            if (r3 != 0) goto L33
            boolean r3 = r15.D(r2)
            if (r3 == 0) goto L30
            r3 = r4
            goto L32
        L30:
            r3 = 16
        L32:
            r0 = r0 | r3
        L33:
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L46
            r3 = r20
            boolean r5 = r15.D(r3)
            if (r5 == 0) goto L42
            r5 = 256(0x100, float:3.59E-43)
            goto L44
        L42:
            r5 = 128(0x80, float:1.8E-43)
        L44:
            r0 = r0 | r5
            goto L48
        L46:
            r3 = r20
        L48:
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            r5 = r0 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r8 = 0
            r9 = 1
            if (r5 == r7) goto L54
            r5 = r9
            goto L55
        L54:
            r5 = r8
        L55:
            r7 = r0 & 1
            boolean r5 = r15.t(r7, r5)
            if (r5 == 0) goto La6
            androidx.compose.ui.Modifier$a r5 = androidx.compose.ui.Modifier.f3231b
            u3.p1 r7 = androidx.compose.runtime.b.f3172a
            r7 = 2132024909(0x7f141e4d, float:1.9688307E38)
            java.lang.String r7 = hx.v.T(r7, r8, r15)
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r4) goto L6d
            r8 = r9
        L6d:
            java.lang.Object r0 = r15.B()
            if (r8 != 0) goto L7c
            androidx.compose.runtime.Composer$a r4 = androidx.compose.runtime.Composer.f3140a
            r4.getClass()
            androidx.compose.runtime.Composer$a$a r4 = androidx.compose.runtime.Composer.a.f3142b
            if (r0 != r4) goto L85
        L7c:
            cc0.j0 r0 = new cc0.j0
            r4 = 3
            r0.<init>(r2, r4)
            r15.u(r0)
        L85:
            r12 = r0
            w12.a r12 = (w12.a) r12
            a10.i r0 = new a10.i
            r4 = r5
            r5 = 10
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = -1909172101(0xffffffff8e34587b, float:-2.2229315E-30)
            c4.c r14 = c4.d.c(r1, r0, r15)
            r16 = 12583344(0xc001b0, float:1.763302E-38)
            r17 = 88
            java.lang.String r8 = "AlexaConsentScreen"
            r10 = 0
            r11 = 0
            r13 = 0
            r9 = r4
            qs0.c.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lab
        La6:
            r15.J()
            r4 = r21
        Lab:
            androidx.compose.runtime.f r7 = r15.c0()
            if (r7 == 0) goto Lc1
            aq0.g r0 = new aq0.g
            r6 = 5
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.d = r0
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.c.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):void");
    }
}
