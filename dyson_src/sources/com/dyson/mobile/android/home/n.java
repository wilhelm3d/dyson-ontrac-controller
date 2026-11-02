package com.dyson.mobile.android.home;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$showAppReviewIfRequired$1", f = "HomeViewModel.kt", l = {356, 357, 358}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class n extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, l12.d<? super n> dVar) {
        super(2, dVar);
        this.e = iVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new n(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((n) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r9.d(r8) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r8.d
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 2
            com.dyson.mobile.android.home.i r6 = r8.e
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r3) goto L16
            h12.r.b(r9)
            goto L64
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r8)
            return r2
        L1c:
            h12.r.b(r9)
            goto L59
        L20:
            h12.r.b(r9)
            goto L46
        L24:
            h12.r.b(r9)
            ph.e r9 = r6.f14185j
            y70.d r1 = r9.f64110b
            e22.m<java.lang.Object>[] r7 = ph.e.e
            r7 = r7[r5]
            java.lang.Object r9 = r1.getValue(r9, r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L4e
            g71.a r9 = r6.f14186k
            r8.d = r4
            java.lang.Object r9 = r9.b(r8)
            if (r9 != r0) goto L46
            goto L63
        L46:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8f
        L4e:
            g71.a r9 = r6.f14186k
            r8.d = r5
            java.lang.Object r9 = r9.d(r8)
            if (r9 != r0) goto L59
            goto L63
        L59:
            g71.a r9 = r6.f14186k
            r8.d = r3
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto L64
        L63:
            return r0
        L64:
            eg1.b r9 = (eg1.b) r9
            if (r9 == 0) goto L8a
            hj.e r8 = r6.d
            java.lang.String r9 = r9.getStorageKey()
            int r0 = nj.l.f57571a
            r9.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            lj.a$j r1 = lj.a.j.f52159a
            r1.getClass()
            ij.d r1 = lj.a.j.f52160b
            java.lang.String r3 = "common.messaging.app_review"
            ij.b r9 = ma.e.e(r0, r1, r9, r3, r0)
            hj.e$a r0 = hj.e.f38312g
            r8.h(r9, r2)
        L8a:
            com.dyson.mobile.android.home.i$a$c r8 = com.dyson.mobile.android.home.i.a.c.f14204a
            r6.T(r8)
        L8f:
            h12.f0 r8 = h12.f0.f36844a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
