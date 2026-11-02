package com.dyson.mobile.android.robot.newsystem.mapengine;

import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import n12.e;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderViewModel$rotateMap$1", f = "MapLoaderViewModel.kt", l = {70, BR.removeButtonVisible, BR.shouldAutoUpdate}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class b extends i implements Function2<c0, d<? super f0>, Object> {
    public Object d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a f16451f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f16451f = aVar;
    }

    @Override // n12.a
    public final d<f0> create(Object obj, d<?> dVar) {
        return new b(this.f16451f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, d<? super f0> dVar) {
        return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (h12.f0.f36844a == r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (h12.f0.f36844a == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            m12.a r2 = m12.a.COROUTINE_SUSPENDED
            int r0 = r1.e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            com.dyson.mobile.android.robot.newsystem.mapengine.a r7 = r1.f16451f
            if (r0 == 0) goto L2d
            if (r0 == r6) goto L29
            if (r0 == r5) goto L1f
            if (r0 != r4) goto L19
            h12.r.b(r18)
            goto Lac
        L19:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r0)
            return r3
        L1f:
            java.lang.Object r0 = r1.d
            h41.d r0 = (h41.d) r0
            h12.r.b(r18)     // Catch: java.lang.Throwable -> L27
            goto L73
        L27:
            r0 = move-exception
            goto L78
        L29:
            h12.r.b(r18)
            goto L3e
        L2d:
            h12.r.b(r18)
            c42.f2 r0 = r7.f16444h
            nl0.h$b r8 = nl0.h.b.f57897a
            r1.e = r6
            r0.setValue(r8)
            h12.f0 r0 = h12.f0.f36844a
            if (r0 != r2) goto L3e
            goto Lab
        L3e:
            h41.d r0 = r7.e
            int r6 = h12.q.e     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r7.f16443g     // Catch: java.lang.Throwable -> L27
            com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree r8 = r7.f16446j     // Catch: java.lang.Throwable -> L27
            com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree r8 = r8.rotateClockwise()     // Catch: java.lang.Throwable -> L27
            int r8 = r8.getValue()     // Catch: java.lang.Throwable -> L27
            r1.d = r3     // Catch: java.lang.Throwable -> L27
            r1.e = r5     // Catch: java.lang.Throwable -> L27
            r0.getClass()     // Catch: java.lang.Throwable -> L27
            ou0.e r9 = new ou0.e     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r12 = new java.lang.Integer     // Catch: java.lang.Throwable -> L27
            r12.<init>(r8)     // Catch: java.lang.Throwable -> L27
            r15 = 27
            r16 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.d(r6, r9, r1)     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6e
            goto L70
        L6e:
            h12.f0 r0 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L27
        L70:
            if (r0 != r2) goto L73
            goto Lab
        L73:
            h12.f0 r0 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L27
            int r5 = h12.q.e     // Catch: java.lang.Throwable -> L27
            goto L80
        L78:
            int r5 = h12.q.e
            h12.q$b r5 = new h12.q$b
            r5.<init>(r0)
            r0 = r5
        L80:
            boolean r5 = r0 instanceof h12.q.b
            if (r5 != 0) goto L8a
            r5 = r0
            h12.f0 r5 = (h12.f0) r5
            r7.S()
        L8a:
            java.lang.Throwable r5 = h12.q.b(r0)
            if (r5 == 0) goto Lac
            java.lang.String r6 = r7.f16443g
            java.lang.String r8 = "Failed to rotateMap for mapId "
            q62.n.n(r8, r6, r5)
            c42.f2 r5 = r7.f16444h
            nl0.h$a r6 = new nl0.h$a
            com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderApiError$RotateMapApiError r7 = com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderApiError.RotateMapApiError.d
            r6.<init>(r7)
            r1.d = r0
            r1.e = r4
            r5.l(r3, r6)
            h12.f0 r0 = h12.f0.f36844a
            if (r0 != r2) goto Lac
        Lab:
            return r2
        Lac:
            h12.f0 r0 = h12.f0.f36844a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapengine.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
