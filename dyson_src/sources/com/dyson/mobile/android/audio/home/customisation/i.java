package com.dyson.mobile.android.audio.home.customisation;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$saveCustomisation$1", f = "CustomisationViewModel.kt", l = {219, 221}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class i extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, l12.d<? super i> dVar) {
        super(2, dVar);
        this.e = gVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new i(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((i) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r13.f(r12) == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r13 == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
