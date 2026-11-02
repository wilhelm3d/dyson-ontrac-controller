package com.dyson.mobile.android.home;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$checkAppVersionNumber$1", f = "HomeViewModel.kt", l = {275}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class j extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, l12.d<? super j> dVar) {
        super(2, dVar);
        this.e = iVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new j(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((j) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (((java.lang.Boolean) r7.f64111c.getValue(r7, ph.e.e[3])).booleanValue() != false) goto L13;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r7.d
            r2 = 1
            com.dyson.mobile.android.home.i r3 = r7.e
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            h12.r.b(r8)     // Catch: java.lang.Exception -> L70
            goto L4d
        Lf:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r7)
            r7 = 0
            return r7
        L16:
            h12.r.b(r8)
            d91.b r8 = r3.f14187l     // Catch: java.lang.Exception -> L70
            tr0.a r1 = r8.f23099a     // Catch: java.lang.Exception -> L70
            dz1.x r1 = r1.a()     // Catch: java.lang.Exception -> L70
            d91.f r4 = d91.f.d     // Catch: java.lang.Exception -> L70
            d91.a r5 = new d91.a     // Catch: java.lang.Exception -> L70
            r6 = 0
            r5.<init>(r4, r6)     // Catch: java.lang.Exception -> L70
            r1.getClass()     // Catch: java.lang.Exception -> L70
            kz1.b$a r4 = kz1.b.f50218a     // Catch: java.lang.Exception -> L70
            sz1.t r4 = new sz1.t     // Catch: java.lang.Exception -> L70
            r4.<init>(r1, r5)     // Catch: java.lang.Exception -> L70
            d91.e r1 = new d91.e     // Catch: java.lang.Exception -> L70
            r1.<init>(r8)     // Catch: java.lang.Exception -> L70
            cl0.h r8 = new cl0.h     // Catch: java.lang.Exception -> L70
            r5 = 17
            r8.<init>(r1, r5)     // Catch: java.lang.Exception -> L70
            sz1.t r1 = new sz1.t     // Catch: java.lang.Exception -> L70
            r1.<init>(r4, r8)     // Catch: java.lang.Exception -> L70
            r7.d = r2     // Catch: java.lang.Exception -> L70
            java.lang.Object r8 = g42.b.b(r1, r7)     // Catch: java.lang.Exception -> L70
            if (r8 != r0) goto L4d
            return r0
        L4d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Exception -> L70
            boolean r7 = r8.booleanValue()     // Catch: java.lang.Exception -> L70
            if (r7 == 0) goto L6a
            ph.e r7 = r3.f14185j     // Catch: java.lang.Exception -> L70
            y70.d r8 = r7.f64111c     // Catch: java.lang.Exception -> L70
            e22.m<java.lang.Object>[] r0 = ph.e.e     // Catch: java.lang.Exception -> L70
            r1 = 3
            r0 = r0[r1]     // Catch: java.lang.Exception -> L70
            java.lang.Object r7 = r8.getValue(r7, r0)     // Catch: java.lang.Exception -> L70
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L70
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L70
            if (r7 == 0) goto L76
        L6a:
            com.dyson.mobile.android.home.i$a$b r7 = com.dyson.mobile.android.home.i.a.b.f14203a     // Catch: java.lang.Exception -> L70
            r3.T(r7)     // Catch: java.lang.Exception -> L70
            goto L76
        L70:
            r7 = move-exception
            java.lang.String r8 = "Check support version failed"
            com.dyson.mobile.android.logging.Logger.b(r8, r7)
        L76:
            h12.f0 r7 = h12.f0.f36844a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
