package com.dyson.mobile.android.audio.home.customisation;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$onShopClicked$1", f = "CustomisationViewModel.kt", l = {235, 233}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class h extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public b42.c d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f12508f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, l12.d<? super h> dVar) {
        super(2, dVar);
        this.f12508f = gVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new h(this.f12508f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((h) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r6 == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r1.b(r4, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
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
            int r1 = r5.e
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            h12.r.b(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            return r2
        L17:
            b42.c r1 = r5.d
            h12.r.b(r6)
            goto L2f
        L1d:
            h12.r.b(r6)
            com.dyson.mobile.android.audio.home.customisation.g r6 = r5.f12508f
            b42.c r1 = r6.f12495p
            r5.d = r1
            r5.e = r4
            java.lang.Object r6 = com.dyson.mobile.android.audio.home.customisation.g.S(r6, r5)
            if (r6 != r0) goto L2f
            goto L40
        L2f:
            kj.b r6 = (kj.b) r6
            com.dyson.mobile.android.audio.home.customisation.f$b r4 = new com.dyson.mobile.android.audio.home.customisation.f$b
            r4.<init>(r6)
            r5.d = r2
            r5.e = r3
            java.lang.Object r5 = r1.b(r4, r5)
            if (r5 != r0) goto L41
        L40:
            return r0
        L41:
            h12.f0 r5 = h12.f0.f36844a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
