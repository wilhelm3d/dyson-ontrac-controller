package com.dyson.mobile.android.home;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$showAppFeedbackSurveyIfRequired$1", f = "HomeViewModel.kt", l = {367, 376}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class m extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, l12.d<? super m> dVar) {
        super(2, dVar);
        this.e = iVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new m(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((m) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r13 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r13.g(r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r12.d
            r2 = 2
            r3 = 1
            com.dyson.mobile.android.home.i r4 = r12.e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L13
            h12.r.b(r13)
            goto L88
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r12)
            r12 = 0
            return r12
        L1a:
            h12.r.b(r13)
            goto L2c
        L1e:
            h12.r.b(r13)
            g71.a r13 = r4.f14186k
            r12.d = r3
            java.lang.Object r13 = r13.e(r12)
            if (r13 != r0) goto L2c
            goto L87
        L2c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L88
            c42.f2 r13 = r4.f14194s
        L36:
            java.lang.Object r1 = r13.getValue()
            r5 = r1
            com.dyson.mobile.android.home.i$c r5 = (com.dyson.mobile.android.home.i.c) r5
            yi0.f r3 = r4.f14189n
            bk0.f r3 = r3.f90155b
            java.util.List r3 = r3.j()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = i12.u.o(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L66
            java.lang.Object r7 = r3.next()
            com.dyson.mobile.android.machinetype.MachineDefinition r7 = (com.dyson.mobile.android.machinetype.MachineDefinition) r7
            java.lang.String r7 = r7.f15558f
            r6.add(r7)
            goto L54
        L66:
            com.dyson.mobile.android.support.forsta.ForstaSurveyConfig r3 = com.dyson.mobile.android.support.forsta.ForstaSurveyConfig.GENERAL_APP_EXPERIENCE_FEEDBACK
            com.dyson.mobile.android.home.i$c$a$b r10 = new com.dyson.mobile.android.home.i$c$a$b
            r10.<init>(r6, r3)
            r11 = 15
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.dyson.mobile.android.home.i$c r3 = com.dyson.mobile.android.home.i.c.a(r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = r13.f(r1, r3)
            if (r1 == 0) goto L36
            g71.a r13 = r4.f14186k
            r12.d = r2
            java.lang.Object r12 = r13.g(r12)
            if (r12 != r0) goto L88
        L87:
            return r0
        L88:
            h12.f0 r12 = h12.f0.f36844a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
