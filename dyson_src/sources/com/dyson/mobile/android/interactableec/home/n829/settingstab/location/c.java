package com.dyson.mobile.android.interactableec.home.n829.settingstab.location;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.e;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.dyson.mobile.android.interactableec.home.n829.settingstab.location.N829ECSettingsLocationViewModel$updateCurrentLocationIfLocationServiceEnabled$2", f = "N829ECSettingsLocationViewModel.kt", l = {188, 190}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, l12.d<? super c> dVar) {
        super(2, dVar);
        this.e = aVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new c(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.T(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r5.V(r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r4.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r4)
            r4 = 0
            return r4
        L14:
            h12.r.b(r5)
            goto L3c
        L18:
            h12.r.b(r5)
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a r5 = r4.e
            v60.b r1 = r5.f14555f
            boolean r1 = r1.a()
            if (r1 != 0) goto L33
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$b$a r1 = com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.b.C0476a.f14573a
            r5.U(r1)
            r4.d = r3
            java.lang.Object r4 = com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.T(r5, r4)
            if (r4 != r0) goto L3c
            goto L3b
        L33:
            r4.d = r2
            java.lang.Object r4 = r5.V(r4)
            if (r4 != r0) goto L3c
        L3b:
            return r0
        L3c:
            h12.f0 r4 = h12.f0.f36844a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
