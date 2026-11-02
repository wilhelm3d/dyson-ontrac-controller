package com.dyson.mobile.android.connectionjourney.ownership;

import c40.l;
import com.dyson.mobile.android.connectionjourney.ownership.i;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc40/l;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lc40/l;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipActivity$purchaseDateScreen$1$3$1", f = "OwnershipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class f extends n12.i implements Function2<l, l12.d<? super f0>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ OwnershipActivity e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OwnershipActivity ownershipActivity, l12.d<? super f> dVar) {
        super(2, dVar);
        this.e = ownershipActivity;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        f fVar = new f(this.e, dVar);
        fVar.d = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l lVar, l12.d<? super f0> dVar) {
        return ((f) create(lVar, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (!x12.r.c((l) this.d, l.a.f10198a)) {
            ma.e.o();
            return null;
        }
        int i13 = OwnershipActivity.f13774l;
        this.e.c1().V(i.k.f13807a);
        return f0.f36844a;
    }
}
