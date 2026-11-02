package com.dyson.mobile.android.machine.machinecontent.productinformation;

import com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink;
import com.dyson.mobile.android.machine.machinecontent.productinformation.b;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationViewModel$onDynamicContentDeeplinkEvent$1", f = "ProductInformationViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ d e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ DynamicContentDeepLink f15272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, DynamicContentDeepLink dynamicContentDeepLink, l12.d<? super e> dVar2) {
        super(2, dVar2);
        this.e = dVar;
        this.f15272f = dynamicContentDeepLink;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new e(this.e, this.f15272f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        if (i13 == 0) {
            r.b(obj);
            b42.c cVar = this.e.f15267i;
            DynamicContentDeepLink.e0 e0Var = (DynamicContentDeepLink.e0) this.f15272f;
            b.a aVar2 = new b.a(e0Var.f14030a, e0Var.f14031b);
            this.d = 1;
            if (cVar.b(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i13 != 1) {
            pa.c.w("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            r.b(obj);
        }
        return f0.f36844a;
    }
}
