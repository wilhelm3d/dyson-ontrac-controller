package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.ExpertContentChapteredGuideLoadingViewModel$getExpertContentChapteredVideo$2", f = "ExpertContentChapteredGuideLoadingViewModel.kt", l = {BR.isHelpClickable, BR.scaleTitle}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f15243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, l12.d<? super d> dVar) {
        super(2, dVar);
        this.f15243f = cVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        d dVar2 = new d(this.f15243f, dVar);
        dVar2.e = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (r0.emit(r2, r9) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
        return r1;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.e
            z32.c0 r0 = (z32.c0) r0
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r9.d
            r3 = 2
            r4 = 1
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c r5 = r9.f15243f
            r6 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L18
            h12.r.b(r10)
            goto Lc3
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r9)
            return r6
        L1e:
            h12.r.b(r10)
            goto L4a
        L22:
            h12.r.b(r10)
            c42.f2 r10 = r5.f15239g
        L27:
            java.lang.Object r2 = r10.getValue()
            r7 = r2
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.i r7 = (com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.i) r7
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.g$b r8 = com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.g.b.f15246a
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.i r7 = com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.i.a(r7, r8)
            boolean r2 = r10.f(r2, r7)
            if (r2 == 0) goto L27
            vi0.i r10 = r5.d
            java.lang.String r2 = r5.e
            r9.e = r0
            r9.d = r4
            java.lang.Object r10 = r10.a(r2, r9)
            if (r10 != r1) goto L4a
            goto Lb8
        L4a:
            com.dyson.mobile.android.machine.response.expertcontent.ExpertContent r10 = (com.dyson.mobile.android.machine.response.expertcontent.ExpertContent) r10
            java.util.List r10 = r10.getContent()
            java.util.Iterator r10 = r10.iterator()
        L54:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r10.next()
            r2 = r0
            com.dyson.mobile.android.machine.response.expertcontent.ExpertContentCollection r2 = (com.dyson.mobile.android.machine.response.expertcontent.ExpertContentCollection) r2
            java.lang.String r2 = r2.getTopic()
            java.lang.String r4 = r5.f15238f
            boolean r2 = x12.r.c(r2, r4)
            if (r2 == 0) goto L54
            goto L6f
        L6e:
            r0 = r6
        L6f:
            com.dyson.mobile.android.machine.response.expertcontent.ExpertContentCollection r0 = (com.dyson.mobile.android.machine.response.expertcontent.ExpertContentCollection) r0
            if (r0 != 0) goto L86
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r5.f15238f
            java.lang.String r0 = "No collection found for topic: "
            java.lang.String r10 = oi1.s.c(r0, r10)
            r9.<init>(r10)
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c.S(r5, r9)
            h12.f0 r9 = h12.f0.f36844a
            return r9
        L86:
            java.util.List r10 = r0.getItems()
            java.lang.Object r10 = i12.c0.P(r10)
            com.dyson.mobile.android.machine.response.expertcontent.ExpertContentItem r10 = (com.dyson.mobile.android.machine.response.expertcontent.ExpertContentItem) r10
            if (r10 == 0) goto Lc6
            com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist r10 = r10.getPlaylist()
            if (r10 != 0) goto L99
            goto Lc6
        L99:
            java.util.List r0 = r10.getVideos()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            goto La5
        La4:
            r10 = r6
        La5:
            if (r10 == 0) goto Lb9
            c42.u1 r0 = r5.f15241i
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.h$b r2 = new com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.h$b
            r2.<init>(r10)
            r9.e = r6
            r9.d = r3
            java.lang.Object r9 = r0.emit(r2, r9)
            if (r9 != r1) goto Lc3
        Lb8:
            return r1
        Lb9:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "No videos found in the first playlist"
            r9.<init>(r10)
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c.S(r5, r9)
        Lc3:
            h12.f0 r9 = h12.f0.f36844a
            return r9
        Lc6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "No playlist found in the collection"
            r9.<init>(r10)
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c.S(r5, r9)
            h12.f0 r9 = h12.f0.f36844a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
