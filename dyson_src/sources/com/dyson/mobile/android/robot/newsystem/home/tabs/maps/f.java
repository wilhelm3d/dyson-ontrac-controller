package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$deleteMap$1", f = "RobotManageMapsViewModel.kt", l = {276}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class f extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f16378f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f16379g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g01.d f16380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, String str, g01.d dVar2, l12.d<? super f> dVar3) {
        super(2, dVar3);
        this.f16378f = dVar;
        this.f16379g = str;
        this.f16380h = dVar2;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        f fVar = new f(this.f16378f, this.f16379g, this.f16380h, dVar);
        fVar.e = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((f) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.e
            z32.c0 r0 = (z32.c0) r0
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r10.d
            r2 = 0
            java.lang.String r3 = r10.f16379g
            r4 = 1
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d r5 = r10.f16378f
            if (r1 == 0) goto L1e
            if (r1 != r4) goto L18
            h12.r.b(r11)     // Catch: java.lang.Throwable -> L16
            goto L47
        L16:
            r11 = move-exception
            goto L4c
        L18:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r10)
            return r2
        L1e:
            h12.r.b(r11)
            c42.f2 r11 = r5.f16359m
        L23:
            java.lang.Object r1 = r11.getValue()
            r6 = r1
            g01.d r6 = (g01.d) r6
            nl0.h$b r7 = nl0.h.b.f57897a
            r8 = 0
            r9 = 6
            g01.d r6 = g01.d.a(r6, r7, r8, r2, r9)
            boolean r1 = r11.f(r1, r6)
            if (r1 == 0) goto L23
            int r11 = h12.q.e     // Catch: java.lang.Throwable -> L16
            h41.d r11 = r5.f16353g     // Catch: java.lang.Throwable -> L16
            r10.e = r2     // Catch: java.lang.Throwable -> L16
            r10.d = r4     // Catch: java.lang.Throwable -> L16
            java.lang.Object r11 = r11.a(r3, r10)     // Catch: java.lang.Throwable -> L16
            if (r11 != r0) goto L47
            return r0
        L47:
            h12.f0 r11 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L16
            int r0 = h12.q.e     // Catch: java.lang.Throwable -> L16
            goto L54
        L4c:
            int r0 = h12.q.e
            h12.q$b r0 = new h12.q$b
            r0.<init>(r11)
            r11 = r0
        L54:
            java.lang.Throwable r0 = h12.q.b(r11)
            if (r0 == 0) goto L84
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to delete map "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.dyson.mobile.android.logging.Logger.a(r0)
            c42.f2 r0 = r5.f16359m
        L75:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            g01.d r2 = (g01.d) r2
            g01.d r2 = r10.f16380h
            boolean r1 = r0.f(r1, r2)
            if (r1 == 0) goto L75
        L84:
            boolean r10 = r11 instanceof h12.q.b
            if (r10 != 0) goto L94
            h12.f0 r11 = (h12.f0) r11
            com.dyson.mobile.android.robot.CacheLoadPolicy r10 = com.dyson.mobile.android.robot.CacheLoadPolicy.REMOTE_ONLY
            r5.T(r10)
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d$c r10 = com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.c.DELETE_MAP
            r5.V(r10)
        L94:
            h12.f0 r10 = h12.f0.f36844a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
