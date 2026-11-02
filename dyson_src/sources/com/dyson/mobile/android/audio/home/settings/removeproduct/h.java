package com.dyson.mobile.android.audio.home.settings.removeproduct;

import c42.f2;
import com.dyson.mobile.android.audio.home.settings.removeproduct.g;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import m9.v;
import mj.c;
import xl.j;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.home.settings.removeproduct.RemoveProductViewModel$onRemoveConfirmed$1", f = "RemoveProductViewModel.kt", l = {BR.isDustMapLayerVisible}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class h extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, l12.d<? super h> dVar) {
        super(2, dVar);
        this.e = iVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new h(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((h) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object obj2 = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        i iVar = this.e;
        try {
            if (i13 == 0) {
                r.b(obj);
                f2 f2Var = iVar.f12594l;
                do {
                    value = f2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!f2Var.f(value, Boolean.TRUE));
                xl.i iVar2 = iVar.d;
                this.d = 1;
                Object v13 = g0.v(iVar2.f87766c.c(), new j(iVar2, null), this);
                if (v13 != obj2) {
                    v13 = f0.f36844a;
                }
                if (v13 == obj2) {
                    return obj2;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            hj.e eVar = iVar.e;
            ij.f a13 = new mj.c(c.a.PRODUCT_REMOVED).a();
            e.a aVar = hj.e.f38312g;
            eVar.g(a13, null);
            f2 f2Var2 = iVar.f12590h;
            do {
                value2 = f2Var2.getValue();
                d dVar = (d) value2;
            } while (!f2Var2.f(value2, iVar.f12588f.f12584b));
        } catch (Exception unused) {
            aq.f.b(iVar.f12592j, v.a(iVar), g.c.f12587a);
        }
        return f0.f36844a;
    }
}
