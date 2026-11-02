package com.dyson.mobile.android.connectionjourney.changewifijourney;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsViewModel$finish$1", f = "ChangeWifiNdsViewModel.kt", l = {151, 152}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, l12.d<? super e> dVar) {
        super(2, dVar);
        this.e = fVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new e(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (g42.b.a(r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r6.b(r1, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r5.d
            com.dyson.mobile.android.connectionjourney.changewifijourney.f r2 = r5.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            h12.r.b(r6)
            goto L3c
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            r5 = 0
            return r5
        L19:
            h12.r.b(r6)
            goto L2f
        L1d:
            h12.r.b(r6)
            v10.o r6 = r2.e
            nz1.l r6 = r6.e()
            r5.d = r4
            java.lang.Object r6 = g42.b.a(r6, r5)
            if (r6 != r0) goto L2f
            goto L3b
        L2f:
            b42.c r6 = r2.f13421j
            com.dyson.mobile.android.connectionjourney.changewifijourney.c$b r1 = com.dyson.mobile.android.connectionjourney.changewifijourney.c.b.f13415a
            r5.d = r3
            java.lang.Object r5 = r6.b(r1, r5)
            if (r5 != r0) goto L3c
        L3b:
            return r0
        L3c:
            h12.f0 r5 = h12.f0.f36844a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.changewifijourney.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
