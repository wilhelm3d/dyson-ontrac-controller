package com.dyson.mobile.android.interactableec.home.n829.settingstab.location;

import com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.e;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.dyson.mobile.android.interactableec.home.n829.settingstab.location.N829ECSettingsLocationViewModel$setLocation$1", f = "N829ECSettingsLocationViewModel.kt", l = {137, 142}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class b extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public a.d d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f14581f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f14582g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f14583h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, boolean z13, l12.d<? super b> dVar) {
        super(2, dVar);
        this.f14581f = aVar;
        this.f14582g = str;
        this.f14583h = z13;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new b(this.f14581f, this.f14582g, this.f14583h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (h12.f0.f36844a == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r10.a(r9) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r9.e
            r2 = 0
            java.lang.String r3 = r9.f14582g
            r4 = 2
            r5 = 1
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a r6 = r9.f14581f
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L15
            h12.r.b(r10)
            goto L57
        L15:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r9)
            return r2
        L1b:
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d r1 = r9.d
            h12.r.b(r10)
            goto L42
        L21:
            h12.r.b(r10)
            c42.f2 r10 = r6.f14564o
            java.lang.Object r10 = r10.getValue()
            r1 = r10
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d r1 = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.d) r1
            c42.f2 r10 = r6.f14564o
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d r7 = new com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d
            boolean r8 = r9.f14583h
            r7.<init>(r3, r8)
            r9.d = r1
            r9.e = r5
            r10.l(r2, r7)
            h12.f0 r10 = h12.f0.f36844a
            if (r10 != r0) goto L42
            goto L56
        L42:
            java.lang.String r10 = r1.f14576a
            boolean r10 = x12.r.c(r3, r10)
            if (r10 != 0) goto L57
            pj0.n r10 = r6.f14558i
            r9.d = r2
            r9.e = r4
            java.lang.Object r9 = r10.a(r9)
            if (r9 != r0) goto L57
        L56:
            return r0
        L57:
            h12.f0 r9 = h12.f0.f36844a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
