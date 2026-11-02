package com.dyson.mobile.android.home;

import a90.y;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import y9.q0;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.home.HomeScreenKt$HomeScreen$1$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public final /* synthetic */ String d;
    public final /* synthetic */ q0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f14180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, q0 q0Var, String str2, l12.d<? super d> dVar) {
        super(2, dVar);
        this.d = str;
        this.e = q0Var;
        this.f14180f = str2;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new d(this.d, this.e, this.f14180f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        String str = this.d;
        if (str != null) {
            y.a(this.e, str, this.f14180f, 12);
        }
        return f0.f36844a;
    }
}
