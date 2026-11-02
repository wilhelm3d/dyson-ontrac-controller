package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$changeCurrentMap$1", f = "RobotManageMapsViewModel.kt", l = {332}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public String d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f16376f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d f16377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, l12.d<? super e> dVar2) {
        super(2, dVar2);
        this.f16377g = dVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        e eVar = new e(this.f16377g, dVar);
        eVar.f16376f = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f16376f
            z32.c0 r0 = (z32.c0) r0
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r10.e
            r2 = 6
            r3 = 0
            r4 = 1
            r5 = 0
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d r6 = r10.f16377g
            if (r1 == 0) goto L20
            if (r1 != r4) goto L1a
            java.lang.String r10 = r10.d
            h12.r.b(r11)     // Catch: java.lang.Throwable -> L18
            goto L56
        L18:
            r11 = move-exception
            goto L5f
        L1a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r10)
            return r5
        L20:
            h12.r.b(r11)
            c42.f2 r11 = r6.f16359m
        L25:
            java.lang.Object r1 = r11.getValue()
            r7 = r1
            g01.d r7 = (g01.d) r7
            nl0.h$b r8 = nl0.h.b.f57897a
            g01.d r7 = g01.d.a(r7, r8, r3, r5, r2)
            boolean r1 = r11.f(r1, r7)
            if (r1 == 0) goto L25
            java.util.List<g01.b> r11 = r6.f16358l
            int r1 = r6.f16362p
            java.lang.Object r11 = r11.get(r1)
            g01.b r11 = (g01.b) r11
            java.lang.String r11 = r11.f32613a
            int r1 = h12.q.e     // Catch: java.lang.Throwable -> L5b
            h41.d r1 = r6.f16353g     // Catch: java.lang.Throwable -> L5b
            r10.f16376f = r5     // Catch: java.lang.Throwable -> L5b
            r10.d = r11     // Catch: java.lang.Throwable -> L5b
            r10.e = r4     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r10 = h41.d.c(r1, r11, r10)     // Catch: java.lang.Throwable -> L5b
            if (r10 != r0) goto L55
            return r0
        L55:
            r10 = r11
        L56:
            h12.f0 r11 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L18
            int r0 = h12.q.e     // Catch: java.lang.Throwable -> L18
            goto L67
        L5b:
            r10 = move-exception
            r9 = r11
            r11 = r10
            r10 = r9
        L5f:
            int r0 = h12.q.e
            h12.q$b r0 = new h12.q$b
            r0.<init>(r11)
            r11 = r0
        L67:
            boolean r0 = r11 instanceof h12.q.b
            if (r0 != 0) goto L73
            r0 = r11
            h12.f0 r0 = (h12.f0) r0
            com.dyson.mobile.android.robot.CacheLoadPolicy r0 = com.dyson.mobile.android.robot.CacheLoadPolicy.REMOTE_ONLY
            r6.T(r0)
        L73:
            java.lang.Throwable r11 = h12.q.b(r11)
            if (r11 == 0) goto Lac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to set current map to mapId: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = " "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            com.dyson.mobile.android.logging.Logger.b(r10, r5)
            c42.f2 r10 = r6.f16359m
        L94:
            java.lang.Object r11 = r10.getValue()
            r0 = r11
            g01.d r0 = (g01.d) r0
            nl0.h$a r1 = new nl0.h$a
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.ManageMapsTabApiError$SetAsCurrentMapApiError r4 = com.dyson.mobile.android.robot.newsystem.home.tabs.maps.ManageMapsTabApiError.SetAsCurrentMapApiError.d
            r1.<init>(r4)
            g01.d r0 = g01.d.a(r0, r1, r3, r5, r2)
            boolean r11 = r10.f(r11, r0)
            if (r11 == 0) goto L94
        Lac:
            h12.f0 r10 = h12.f0.f36844a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
