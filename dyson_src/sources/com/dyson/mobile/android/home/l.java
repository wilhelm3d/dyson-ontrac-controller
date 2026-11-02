package com.dyson.mobile.android.home;

import c42.p1;
import com.dyson.mobile.android.home.i;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$initAiAssistant$2", f = "HomeViewModel.kt", l = {251}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class l extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public p1 d;
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public Object f14236f;

    /* renamed from: g  reason: collision with root package name */
    public i.c f14237g;

    /* renamed from: h  reason: collision with root package name */
    public int f14238h;

    /* renamed from: i  reason: collision with root package name */
    public int f14239i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f14240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, l12.d<? super l> dVar) {
        super(2, dVar);
        this.f14240j = iVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new l(this.f14240j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((l) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Type inference failed for: r7v5, types: [c42.p1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0050 -> B:6:0x0017). Please submit an issue!!! */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r14.f14239i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 != r3) goto L1b
            int r1 = r14.f14238h
            com.dyson.mobile.android.home.i$c r4 = r14.f14237g
            java.lang.Object r5 = r14.f14236f
            com.dyson.mobile.android.home.i r6 = r14.e
            c42.p1 r7 = r14.d
            h12.r.b(r15)
        L17:
            r11 = r5
            r12 = r6
            r13 = r7
            goto L53
        L1b:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r14)
            return r2
        L21:
            h12.r.b(r15)
            com.dyson.mobile.android.home.i r15 = r14.f14240j
            c42.f2 r1 = r15.f14194s
            r4 = 0
            r6 = r15
            r7 = r1
            r1 = r4
        L2c:
            java.lang.Object r5 = r7.getValue()
            r4 = r5
            com.dyson.mobile.android.home.i$c r4 = (com.dyson.mobile.android.home.i.c) r4
            w71.a r15 = r6.f14192q
            r14.d = r7
            r14.e = r6
            r14.f14236f = r5
            r14.f14237g = r4
            r14.f14238h = r1
            r14.f14239i = r3
            af1.i r8 = r15.f85344c
            h42.b r8 = r8.c()
            w71.d r9 = new w71.d
            r9.<init>(r15, r2)
            java.lang.Object r15 = z32.g0.v(r8, r9, r14)
            if (r15 != r0) goto L17
            return r0
        L53:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            dj.b r7 = new dj.b
            r7.<init>(r15)
            r9 = 0
            r10 = 27
            r5 = 0
            r6 = 0
            r8 = 0
            com.dyson.mobile.android.home.i$c r15 = com.dyson.mobile.android.home.i.c.a(r4, r5, r6, r7, r8, r9, r10)
            boolean r15 = r13.f(r11, r15)
            if (r15 == 0) goto L71
            h12.f0 r14 = h12.f0.f36844a
            return r14
        L71:
            r6 = r12
            r7 = r13
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
