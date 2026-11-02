package com.dyson.mobile.android.audio.home.interruptions.help;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import c90.x;
import f90.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p91.a;
import p91.f;
import r3.nd;
import u3.p1;
/* loaded from: classes2.dex */
public final class b {
    public static final void a(int i13, Composer composer, String str, w12.a aVar) {
        androidx.compose.runtime.a k13 = composer.k(373670216);
        int i14 = (k13.Q(str) ? 4 : 2) | i13 | (k13.D(aVar) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            f.a(j.a(Modifier.f3231b, "HOW_TO_SECONDARY_BUTTON"), false, false, 0L, aVar, a.b.f63103a, null, c4.d.c(-636812134, new ay0.c(str, 26), k13), k13, ((i14 << 9) & 57344) | 12582918, 78);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new k(i13, str, 6, aVar);
        }
    }

    public static final void b(pl.f fVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1272952072);
        int i14 = (k13.Q(fVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.a.a(null, null, null, null, null, null, c4.d.c(1547800024, new pl.c(fVar, 1), k13), k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new n71.a(fVar, i13, 16);
        }
    }

    public static final void c(final pl.f fVar, w12.a aVar, final Function1 function1, Composer composer, int i13) {
        fVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(-259297073);
        int i14 = i13 | (k13.Q(fVar) ? 4 : 2) | (k13.D(aVar) ? 32 : 16) | (k13.D(function1) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            cm.d.a(fVar.f64424a, "HOW_TO_VIEW", aVar, 0.0f, c4.d.c(1919555561, new Function2() { // from class: pl.b
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
                    if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
                    if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L31;
                 */
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        int r0 = r3
                        androidx.compose.runtime.Composer$a r1 = androidx.compose.runtime.Composer.f3140a
                        r2 = 2
                        kotlin.jvm.functions.Function1 r3 = r2
                        pl.f r6 = r1
                        r4 = 1
                        r5 = 0
                        androidx.compose.runtime.Composer r7 = (androidx.compose.runtime.Composer) r7
                        java.lang.Integer r8 = (java.lang.Integer) r8
                        int r8 = r8.intValue()
                        switch(r0) {
                            case 0: goto L4d;
                            default: goto L16;
                        }
                    L16:
                        r0 = r8 & 3
                        if (r0 == r2) goto L1c
                        r0 = r4
                        goto L1d
                    L1c:
                        r0 = r5
                    L1d:
                        r8 = r8 & r4
                        boolean r8 = r7.t(r8, r0)
                        if (r8 == 0) goto L47
                        u3.p1 r8 = androidx.compose.runtime.b.f3172a
                        java.lang.String r6 = r6.f64427f
                        boolean r8 = r7.Q(r3)
                        java.lang.Object r0 = r7.B()
                        if (r8 != 0) goto L39
                        r1.getClass()
                        androidx.compose.runtime.Composer$a$a r8 = androidx.compose.runtime.Composer.a.f3142b
                        if (r0 != r8) goto L41
                    L39:
                        pl.d r0 = new pl.d
                        r0.<init>(r3, r5)
                        r7.u(r0)
                    L41:
                        w12.a r0 = (w12.a) r0
                        com.dyson.mobile.android.audio.home.interruptions.help.b.a(r5, r7, r6, r0)
                        goto L4a
                    L47:
                        r7.J()
                    L4a:
                        h12.f0 r6 = h12.f0.f36844a
                        return r6
                    L4d:
                        r0 = r8 & 3
                        if (r0 == r2) goto L53
                        r0 = r4
                        goto L54
                    L53:
                        r0 = r5
                    L54:
                        r8 = r8 & r4
                        boolean r8 = r7.t(r8, r0)
                        if (r8 == 0) goto L7e
                        u3.p1 r8 = androidx.compose.runtime.b.f3172a
                        java.lang.String r6 = r6.e
                        boolean r8 = r7.Q(r3)
                        java.lang.Object r0 = r7.B()
                        if (r8 != 0) goto L70
                        r1.getClass()
                        androidx.compose.runtime.Composer$a$a r8 = androidx.compose.runtime.Composer.a.f3142b
                        if (r0 != r8) goto L78
                    L70:
                        pl.d r0 = new pl.d
                        r0.<init>(r3, r4)
                        r7.u(r0)
                    L78:
                        w12.a r0 = (w12.a) r0
                        com.dyson.mobile.android.audio.home.interruptions.help.b.e(r5, r7, r6, r0)
                        goto L81
                    L7e:
                        r7.J()
                    L81:
                        h12.f0 r6 = h12.f0.f36844a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pl.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, k13), c4.d.c(650885482, new Function2() { // from class: pl.b
                @Override // kotlin.jvm.functions.Function2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        int r0 = r3
                        androidx.compose.runtime.Composer$a r1 = androidx.compose.runtime.Composer.f3140a
                        r2 = 2
                        kotlin.jvm.functions.Function1 r3 = r2
                        pl.f r6 = r1
                        r4 = 1
                        r5 = 0
                        androidx.compose.runtime.Composer r7 = (androidx.compose.runtime.Composer) r7
                        java.lang.Integer r8 = (java.lang.Integer) r8
                        int r8 = r8.intValue()
                        switch(r0) {
                            case 0: goto L4d;
                            default: goto L16;
                        }
                    L16:
                        r0 = r8 & 3
                        if (r0 == r2) goto L1c
                        r0 = r4
                        goto L1d
                    L1c:
                        r0 = r5
                    L1d:
                        r8 = r8 & r4
                        boolean r8 = r7.t(r8, r0)
                        if (r8 == 0) goto L47
                        u3.p1 r8 = androidx.compose.runtime.b.f3172a
                        java.lang.String r6 = r6.f64427f
                        boolean r8 = r7.Q(r3)
                        java.lang.Object r0 = r7.B()
                        if (r8 != 0) goto L39
                        r1.getClass()
                        androidx.compose.runtime.Composer$a$a r8 = androidx.compose.runtime.Composer.a.f3142b
                        if (r0 != r8) goto L41
                    L39:
                        pl.d r0 = new pl.d
                        r0.<init>(r3, r5)
                        r7.u(r0)
                    L41:
                        w12.a r0 = (w12.a) r0
                        com.dyson.mobile.android.audio.home.interruptions.help.b.a(r5, r7, r6, r0)
                        goto L4a
                    L47:
                        r7.J()
                    L4a:
                        h12.f0 r6 = h12.f0.f36844a
                        return r6
                    L4d:
                        r0 = r8 & 3
                        if (r0 == r2) goto L53
                        r0 = r4
                        goto L54
                    L53:
                        r0 = r5
                    L54:
                        r8 = r8 & r4
                        boolean r8 = r7.t(r8, r0)
                        if (r8 == 0) goto L7e
                        u3.p1 r8 = androidx.compose.runtime.b.f3172a
                        java.lang.String r6 = r6.e
                        boolean r8 = r7.Q(r3)
                        java.lang.Object r0 = r7.B()
                        if (r8 != 0) goto L70
                        r1.getClass()
                        androidx.compose.runtime.Composer$a$a r8 = androidx.compose.runtime.Composer.a.f3142b
                        if (r0 != r8) goto L78
                    L70:
                        pl.d r0 = new pl.d
                        r0.<init>(r3, r4)
                        r7.u(r0)
                    L78:
                        w12.a r0 = (w12.a) r0
                        com.dyson.mobile.android.audio.home.interruptions.help.b.e(r5, r7, r6, r0)
                        goto L81
                    L7e:
                        r7.J()
                    L81:
                        h12.f0 r6 = h12.f0.f36844a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pl.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, k13), c4.d.c(-1645538693, new pl.c(fVar, 0), k13), k13, ((i14 << 3) & 896) | 1794096, 8);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new lx1.a(fVar, aVar, function1, i13, 24);
        }
    }

    public static final void d(String str, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        androidx.compose.runtime.a k13 = composer.k(-314058373);
        int i14 = i13 | (k13.Q(str) ? 4 : 2);
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            md1.b.f53765a.getClass();
            aVar = k13;
            nd.c(str, j.a(Modifier.f3231b, "HOW_TO_DESCRIPTION"), md1.b.a(k13).f41049c.e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, md1.b.c(k13).f53779j, aVar, (i14 & 14) | 48, 0, 131064);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new x(str, i13, 12);
        }
    }

    public static final void e(int i13, Composer composer, String str, w12.a aVar) {
        androidx.compose.runtime.a k13 = composer.k(1881279834);
        int i14 = (k13.Q(str) ? 4 : 2) | i13 | (k13.D(aVar) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            f.a(j.a(Modifier.f3231b, "HOW_TO_PRIMARY_BUTTON"), false, false, 0L, aVar, a.C1915a.f63102a, null, c4.d.c(-1264011732, new ay0.c(str, 25), k13), k13, ((i14 << 9) & 57344) | 12582918, 78);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new k(i13, str, 5, aVar);
        }
    }

    public static final void f(String str, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        androidx.compose.runtime.a k13 = composer.k(-874807977);
        int i14 = i13 | (k13.Q(str) ? 4 : 2);
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            md1.b.f53765a.getClass();
            aVar = k13;
            nd.c(str, j.a(Modifier.f3231b, "HOW_TO_TITLE"), md1.b.a(k13).f41049c.f41082a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, md1.b.c(k13).f53773b, aVar, (i14 & 14) | 48, 0, 131064);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new x(str, i13, 13);
        }
    }
}
