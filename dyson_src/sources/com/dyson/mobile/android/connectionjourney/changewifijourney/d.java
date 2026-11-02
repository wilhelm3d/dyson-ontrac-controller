package com.dyson.mobile.android.connectionjourney.changewifijourney;

import com.salesforce.marketingcloud.push.g;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import x12.p0;
import y9.k0;
import y9.q0;
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity$setUiContent$1$1$1", f = "ChangeWifiNdsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class d extends i implements Function2<ChangeWifiRoute, l12.d<? super f0>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ q0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q0 q0Var, l12.d<? super d> dVar) {
        super(2, dVar);
        this.e = q0Var;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        d dVar2 = new d(this.e, dVar);
        dVar2.d = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChangeWifiRoute changeWifiRoute, l12.d<? super f0> dVar) {
        return ((d) create(changeWifiRoute, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        ChangeWifiRoute changeWifiRoute = (ChangeWifiRoute) this.d;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        q0 q0Var = this.e;
        k0 i13 = q0Var.f89416b.i();
        String str = i13 != null ? i13.e.f23151f : null;
        if (str != null) {
            if (!str.equals(p0.f86717a.b(changeWifiRoute.getClass()).o())) {
                q0Var.g(changeWifiRoute, new ur.g(6));
            }
        }
        return f0.f36844a;
    }
}
