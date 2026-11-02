package com.dyson.mobile.android.connectionjourney.ownership;

import com.dyson.mobile.android.connectionjourney.ownership.i;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import y30.b;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipActivity$machineNameScreen$1$2$1", f = "OwnershipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public final /* synthetic */ OwnershipActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OwnershipActivity ownershipActivity, l12.d<? super d> dVar) {
        super(2, dVar);
        this.d = ownershipActivity;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new d(this.d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        int i13 = OwnershipActivity.f13774l;
        this.d.c1().V(new i.p(b.d.INSTANCE));
        return f0.f36844a;
    }
}
