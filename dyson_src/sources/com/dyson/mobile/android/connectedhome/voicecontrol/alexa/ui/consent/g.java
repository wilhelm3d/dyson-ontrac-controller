package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.AlexaInitiatedAppLinkConsentViewModel$onDenyCtaClicked$1", f = "AlexaInitiatedAppLinkConsentViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class g extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, l12.d<? super g> dVar) {
        super(2, dVar);
        this.e = eVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new g(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((g) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        e eVar = this.e;
        if (i13 == 0) {
            r.b(obj);
            e.T(eVar, b.a.C0383a.a(eVar.f13034i, 1), b.a.C0383a.a(eVar.f13034i, 2));
            this.d = 1;
            if (e.S(eVar, false, this) == aVar) {
                return aVar;
            }
        } else if (i13 != 1) {
            pa.c.w("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            r.b(obj);
        }
        b.a.C0383a c0383a = eVar.f13034i;
        e.T(eVar, c0383a, c0383a);
        return f0.f36844a;
    }
}
