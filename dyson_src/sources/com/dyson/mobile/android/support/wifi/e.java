package com.dyson.mobile.android.support.wifi;

import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.support.wifi.WifiCompatibilityCheckViewModel$startCheck$1", f = "WifiCompatibilityCheckViewModel.kt", l = {BR.machineType, BR.scaleTitle, BR.screenTitle, BR.shouldAutoUpdate, BR.toolbarViewModel, BR.topImage}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public Object d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f16921f;

    /* renamed from: g  reason: collision with root package name */
    public int f16922g;

    /* renamed from: h  reason: collision with root package name */
    public int f16923h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f16924i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f16925j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, boolean z13, l12.d<? super e> dVar2) {
        super(2, dVar2);
        this.f16924i = dVar;
        this.f16925j = z13;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new e(this.f16924i, this.f16925j, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (h12.f0.f36844a == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x017e, code lost:
        if (h12.f0.f36844a == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0197, code lost:
        if (h12.f0.f36844a == r1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0024, B:51:0x013a, B:14:0x0031, B:46:0x010d, B:17:0x0040, B:41:0x00ed, B:43:0x00f3, B:48:0x0110, B:37:0x00cb), top: B:72:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110 A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:9:0x0024, B:51:0x013a, B:14:0x0031, B:46:0x010d, B:17:0x0040, B:41:0x00ed, B:43:0x00f3, B:48:0x0110, B:37:0x00cb), top: B:72:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0187  */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.wifi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
