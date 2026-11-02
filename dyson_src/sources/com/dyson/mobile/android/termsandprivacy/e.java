package com.dyson.mobile.android.termsandprivacy;

import com.dyson.mobile.android.termsandprivacy.a;
import com.dyson.mobile.android.termsandprivacy.c;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.q;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.termsandprivacy.TermsOfUseAndPrivacyViewModel$updateMarket$1", f = "TermsOfUseAndPrivacyViewModel.kt", l = {BR.passwordErrorVisibility}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f16961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, l12.d<? super e> dVar) {
        super(2, dVar);
        this.f16961f = cVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        e eVar = new e(this.f16961f, dVar);
        eVar.e = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        c0 c0Var = (c0) this.e;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        c cVar = this.f16961f;
        try {
            if (i13 == 0) {
                r.b(obj);
                int i14 = q.e;
                tj.a aVar2 = cVar.d;
                Object value = cVar.f16950g.getValue();
                value.getClass();
                aVar2.f(((a.c) value).f16946a.f26361b.f26359b);
                n81.b bVar2 = cVar.f16949f;
                this.e = null;
                this.d = 1;
                if (bVar2.a(this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            bVar = f0.f36844a;
            int i15 = q.e;
        } catch (Throwable th2) {
            int i16 = q.e;
            bVar = new q.b(th2);
        }
        if (!(bVar instanceof q.b)) {
            f0 f0Var = (f0) bVar;
            cVar.f16951h.h(c.InterfaceC0617c.C0618c.f16959a);
        }
        Throwable b13 = q.b(bVar);
        if (b13 != null) {
            cVar.f16950g.l(null, new a.C0616a(b13));
        }
        return f0.f36844a;
    }
}
