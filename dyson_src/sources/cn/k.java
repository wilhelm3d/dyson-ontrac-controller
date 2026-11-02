package cn;

import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.home571.soundcontrol.EqualizerViewModel$setEqualizationMode$1", f = "EqualizerViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class k extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ j e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ lp.j f11821f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, lp.j jVar2, l12.d<? super k> dVar) {
        super(2, dVar);
        this.e = jVar;
        this.f11821f = jVar2;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new k(this.e, this.f11821f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((k) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        if (i13 == 0) {
            r.b(obj);
            lp.l lVar = this.e.e;
            this.d = 1;
            if (lVar.b(this.f11821f, this) == aVar) {
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
