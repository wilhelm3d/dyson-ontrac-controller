package com.dyson.mobile.android.home;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.y;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.brightcove.player.C;
import com.dyson.mobile.android.home.HomeActivity;
import com.dyson.mobile.android.home.i;
import h12.f0;
import h12.r;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import r3.k9;
import rf0.i0;
import u3.p1;
import z32.c0;
/* loaded from: classes2.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeScreenKt$DeviceAddedBanner$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ l91.g d;
        public final /* synthetic */ String e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l91.k f14177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l91.g gVar, String str, l91.k kVar, l12.d<? super a> dVar) {
            super(2, dVar);
            this.d = gVar;
            this.e = str;
            this.f14177f = kVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(this.d, this.e, this.f14177f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l91.g.b(this.d, this.e, this.f14177f, 4);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeScreenKt$HairProfileConfirmationBanner$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ qe1.a d;
        public final /* synthetic */ l91.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l91.k f14178f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qe1.a aVar, l91.g gVar, l91.k kVar, l12.d<? super b> dVar) {
            super(2, dVar);
            this.d = aVar;
            this.e = gVar;
            this.f14178f = kVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.d, this.e, this.f14178f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            qe1.a aVar2 = qe1.a.EMPTY;
            qe1.a aVar3 = this.d;
            if (aVar3 == aVar2) {
                return f0.f36844a;
            }
            l91.g.b(this.e, pf0.f.c(aVar3.getTitle()), this.f14178f, 4);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeScreenKt$RemoveProductBanner$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.home.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0460c extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ l91.g d;
        public final /* synthetic */ l91.k e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0460c(l91.g gVar, l91.k kVar, l12.d<? super C0460c> dVar) {
            super(2, dVar);
            this.d = gVar;
            this.e = kVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0460c(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0460c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l91.g.b(this.d, pf0.f.c(i0.f71917x8), this.e, 4);
            return f0.f36844a;
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14179a;

        static {
            int[] iArr = new int[qe1.a.values().length];
            try {
                iArr[qe1.a.HAIR_PROFILE_QUESTIONNAIRE_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qe1.a.HAIR_PROFILE_QUESTIONNAIRE_ABANDONED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14179a = iArr;
        }
    }

    public static final void a(List list, i.c cVar, Function1 function1, Function1 function12, HomeActivity.i iVar, c4.c cVar2, boolean z13, boolean z14, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        Object obj;
        androidx.compose.runtime.a k13 = composer.k(-446235589);
        int i14 = (k13.D(list) ? 4 : 2) | i13 | (k13.Q(cVar) ? 32 : 16) | (k13.D(function1) ? 256 : 128) | (k13.D(function12) ? 2048 : 1024);
        if ((i13 & 24576) == 0) {
            i14 |= k13.D(iVar) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if ((1572864 & i13) == 0) {
            i14 |= k13.c(z13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= k13.c(z14) ? 8388608 : 4194304;
        }
        if (k13.t(i14 & 1, (4793491 & i14) != 4793490)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((Boolean) function1.invoke((w80.f) obj)).booleanValue()) {
                    break;
                }
            }
            w80.f fVar = (w80.f) obj;
            wc1.a bottomNavigationBarItem = fVar != null ? fVar.getBottomNavigationBarItem() : null;
            int i15 = WindowInsets.f2832a;
            p1 p1Var2 = androidx.compose.runtime.b.f3172a;
            y.f2909v.getClass();
            p2.d dVar = y.a.c(k13).e;
            md1.b.f53765a.getClass();
            aVar = k13;
            k9.a(androidx.compose.ui.platform.j.a(Modifier.f3231b, "HomeScreen"), null, c4.d.c(-218791232, new q80.c(25, list, bottomNavigationBarItem, function12), k13), null, null, 0, md1.b.a(k13).f41047a.f41064a, 0L, dVar, c4.d.c(729467658, new w80.k(cVar2, cVar, iVar, z13, z14, 0), k13), aVar, 805306758, 186);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new fc0.d(list, cVar, function1, function12, iVar, cVar2, z13, z14, i13);
        }
    }

    public static final void b(ArrayList arrayList, wc1.a aVar, Function1 function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(479562217);
        int i14 = (k13.D(arrayList) ? 4 : 2) | i13 | (k13.Q(aVar) ? 32 : 16) | (k13.D(function1) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            wc1.e.a(arrayList, aVar, function1, Modifier.f3231b, 0L, null, k13, (i14 & 14) | 3072 | (i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) | (i14 & 896));
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new q80.c(i13, 26, (Object) arrayList, (Object) aVar, (Object) function1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.runtime.Composer r8, int r9) {
        /*
            r0 = -1425257055(0xffffffffab0c4da1, float:-4.9845723E-13)
            androidx.compose.runtime.a r8 = r8.k(r0)
            r0 = 0
            if (r9 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = r0
        Ld:
            r2 = r9 & 1
            boolean r1 = r8.t(r2, r1)
            if (r1 == 0) goto L6c
            u3.p1 r1 = androidx.compose.runtime.b.f3172a
            u3.k0 r1 = l91.e.f51001a
            java.lang.Object r1 = r8.A(r1)
            l91.g r1 = (l91.g) r1
            l91.k r2 = new l91.k
            hc1.r$d r3 = new hc1.r$d
            r4 = 3
            r5 = 0
            r3.<init>(r5, r5, r4, r5)
            md1.b r4 = md1.b.f53765a
            r4.getClass()
            i91.a r4 = md1.b.a(r8)
            i91.a$o r4 = r4.e
            long r6 = r4.f41127c
            r2.<init>(r3, r6, r5)
            r3 = 2132018647(0x7f1405d7, float:1.9675607E38)
            java.lang.String r0 = hx.v.T(r3, r0, r8)
            h12.f0 r3 = h12.f0.f36844a
            boolean r4 = r8.D(r1)
            boolean r6 = r8.Q(r0)
            r4 = r4 | r6
            boolean r6 = r8.D(r2)
            r4 = r4 | r6
            java.lang.Object r6 = r8.B()
            if (r4 != 0) goto L5e
            androidx.compose.runtime.Composer$a r4 = androidx.compose.runtime.Composer.f3140a
            r4.getClass()
            androidx.compose.runtime.Composer$a$a r4 = androidx.compose.runtime.Composer.a.f3142b
            if (r6 != r4) goto L66
        L5e:
            com.dyson.mobile.android.home.c$a r6 = new com.dyson.mobile.android.home.c$a
            r6.<init>(r1, r0, r2, r5)
            r8.u(r6)
        L66:
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            u3.m0.d(r8, r3, r6)
            goto L6f
        L6c:
            r8.J()
        L6f:
            androidx.compose.runtime.f r8 = r8.c0()
            if (r8 == 0) goto L7e
            vd0.g r0 = new vd0.g
            r1 = 26
            r0.<init>(r9, r1)
            r8.d = r0
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.c.c(androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(qe1.a r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r0 = -915917717(0xffffffffc968346b, float:-951110.7)
            androidx.compose.runtime.a r12 = r12.k(r0)
            int r0 = r11.ordinal()
            boolean r0 = r12.f(r0)
            r1 = 4
            r2 = 2
            if (r0 == 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            r0 = r0 | r13
            r3 = r0 & 3
            r4 = 0
            r5 = 1
            if (r3 == r2) goto L1f
            r3 = r5
            goto L20
        L1f:
            r3 = r4
        L20:
            r6 = r0 & 1
            boolean r3 = r12.t(r6, r3)
            if (r3 == 0) goto Lb8
            u3.p1 r3 = androidx.compose.runtime.b.f3172a
            u3.k0 r3 = l91.e.f51001a
            java.lang.Object r3 = r12.A(r3)
            l91.g r3 = (l91.g) r3
            int[] r6 = com.dyson.mobile.android.home.c.d.f14179a
            int r7 = r11.ordinal()
            r6 = r6[r7]
            r7 = 3
            r8 = 0
            if (r6 == r5) goto L6c
            if (r6 == r2) goto L4b
            r2 = -176861486(0xfffffffff5754ed2, float:-3.109647E32)
            r12.R(r2)
            r12.a0(r4)
            r2 = r8
            goto L8c
        L4b:
            r2 = 271385186(0x102d0262, float:3.412007E-29)
            r12.R(r2)
            l91.k r2 = new l91.k
            hc1.r$g r6 = new hc1.r$g
            r6.<init>(r8, r8, r7, r8)
            md1.b r7 = md1.b.f53765a
            r7.getClass()
            i91.a r7 = md1.b.a(r12)
            i91.a$o r7 = r7.e
            long r9 = r7.d
            r2.<init>(r6, r9, r8)
            r12.a0(r4)
            goto L8c
        L6c:
            r2 = 271378915(0x102ce9e3, float:3.41012E-29)
            r12.R(r2)
            l91.k r2 = new l91.k
            hc1.r$d r6 = new hc1.r$d
            r6.<init>(r8, r8, r7, r8)
            md1.b r7 = md1.b.f53765a
            r7.getClass()
            i91.a r7 = md1.b.a(r12)
            i91.a$o r7 = r7.e
            long r9 = r7.f41127c
            r2.<init>(r6, r9, r8)
            r12.a0(r4)
        L8c:
            r0 = r0 & 14
            if (r0 != r1) goto L91
            r4 = r5
        L91:
            boolean r0 = r12.D(r3)
            r0 = r0 | r4
            boolean r1 = r12.D(r2)
            r0 = r0 | r1
            java.lang.Object r1 = r12.B()
            if (r0 != 0) goto Laa
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.f3140a
            r0.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r1 != r0) goto Lb2
        Laa:
            com.dyson.mobile.android.home.c$b r1 = new com.dyson.mobile.android.home.c$b
            r1.<init>(r11, r3, r2, r8)
            r12.u(r1)
        Lb2:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            u3.m0.d(r12, r11, r1)
            goto Lbb
        Lb8:
            r12.J()
        Lbb:
            androidx.compose.runtime.f r12 = r12.c0()
            if (r12 == 0) goto Lca
            sa0.p r0 = new sa0.p
            r1 = 26
            r0.<init>(r11, r13, r1)
            r12.d = r0
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.c.d(qe1.a, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0132, code lost:
        if (r7 == androidx.compose.runtime.Composer.a.f3142b) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0151, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01ea, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final w80.d r26, final com.dyson.mobile.android.home.i.c r27, final y9.q0 r28, final com.dyson.mobile.android.home.HomeActivity.f r29, final com.dyson.mobile.android.home.HomeActivity.g r30, final com.dyson.mobile.android.home.HomeActivity.h r31, final com.dyson.mobile.android.home.HomeActivity.i r32, final com.dyson.mobile.android.home.HomeActivity.j r33, final com.dyson.mobile.android.home.HomeActivity.k r34, final com.dyson.mobile.android.home.HomeActivity.l r35, final kotlin.jvm.functions.Function2 r36, final jx1.a r37, final boolean r38, final java.lang.String r39, java.lang.String r40, final boolean r41, final boolean r42, androidx.compose.runtime.Composer r43, final int r44) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.c.e(w80.d, com.dyson.mobile.android.home.i$c, y9.q0, com.dyson.mobile.android.home.HomeActivity$f, com.dyson.mobile.android.home.HomeActivity$g, com.dyson.mobile.android.home.HomeActivity$h, com.dyson.mobile.android.home.HomeActivity$i, com.dyson.mobile.android.home.HomeActivity$j, com.dyson.mobile.android.home.HomeActivity$k, com.dyson.mobile.android.home.HomeActivity$l, kotlin.jvm.functions.Function2, jx1.a, boolean, java.lang.String, java.lang.String, boolean, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r12 == androidx.compose.runtime.Composer.a.f3142b) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01af, code lost:
        if (r11 == androidx.compose.runtime.Composer.a.f3142b) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01f0, code lost:
        if (r11 == androidx.compose.runtime.Composer.a.f3142b) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(z80.b r17, final com.dyson.mobile.android.home.HomeActivity.i r18, androidx.compose.runtime.Composer r19, int r20) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.c.f(z80.b, com.dyson.mobile.android.home.HomeActivity$i, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(androidx.compose.runtime.Composer r7, int r8) {
        /*
            r0 = 493411008(0x1d68dac0, float:3.0818035E-21)
            androidx.compose.runtime.a r7 = r7.k(r0)
            if (r8 == 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = r8 & 1
            boolean r0 = r7.t(r1, r0)
            if (r0 == 0) goto L5f
            u3.p1 r0 = androidx.compose.runtime.b.f3172a
            u3.k0 r0 = l91.e.f51001a
            java.lang.Object r0 = r7.A(r0)
            l91.g r0 = (l91.g) r0
            l91.k r1 = new l91.k
            hc1.r$d r2 = new hc1.r$d
            r3 = 3
            r4 = 0
            r2.<init>(r4, r4, r3, r4)
            md1.b r3 = md1.b.f53765a
            r3.getClass()
            i91.a r3 = md1.b.a(r7)
            i91.a$o r3 = r3.e
            long r5 = r3.f41127c
            r1.<init>(r2, r5, r4)
            h12.f0 r2 = h12.f0.f36844a
            boolean r3 = r7.D(r0)
            boolean r5 = r7.D(r1)
            r3 = r3 | r5
            java.lang.Object r5 = r7.B()
            if (r3 != 0) goto L51
            androidx.compose.runtime.Composer$a r3 = androidx.compose.runtime.Composer.f3140a
            r3.getClass()
            androidx.compose.runtime.Composer$a$a r3 = androidx.compose.runtime.Composer.a.f3142b
            if (r5 != r3) goto L59
        L51:
            com.dyson.mobile.android.home.c$c r5 = new com.dyson.mobile.android.home.c$c
            r5.<init>(r0, r1, r4)
            r7.u(r5)
        L59:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            u3.m0.d(r7, r2, r5)
            goto L62
        L5f:
            r7.J()
        L62:
            androidx.compose.runtime.f r7 = r7.c0()
            if (r7 == 0) goto L71
            vd0.g r0 = new vd0.g
            r1 = 25
            r0.<init>(r8, r1)
            r7.d = r0
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.c.g(androidx.compose.runtime.Composer, int):void");
    }
}
