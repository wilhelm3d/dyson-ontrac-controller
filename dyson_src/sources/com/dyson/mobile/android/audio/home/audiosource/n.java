package com.dyson.mobile.android.audio.home.audiosource;

import com.dyson.mobile.android.audio.home.audiosource.g;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import w12.o;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lep/m;", "kotlin.jvm.PlatformType", "lineInStatus", "", "isAudioSourceEnabled", "Lh12/f0;", "<unused var>", "Lcom/dyson/mobile/android/audio/home/audiosource/g;", "<anonymous>", "(Lcom/dyson/mobile/android/audio/traits/audiostatus/LineInStatus;ZV)Lcom/dyson/mobile/android/audio/home/audiosource/AudioSourcesState;"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.ObserveAudioSourcesUseCase$invoke$1$2", f = "ObserveAudioSourcesUseCase.kt", l = {BR.hasInfiniteLife}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class n extends n12.i implements o<ep.m, Boolean, f0, l12.d<? super g>, Object> {
    public int d;
    public /* synthetic */ ep.m e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ boolean f12444f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ m f12445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, l12.d<? super n> dVar) {
        super(4, dVar);
        this.f12445g = mVar;
    }

    @Override // w12.o
    public final Object invoke(ep.m mVar, Boolean bool, f0 f0Var, l12.d<? super g> dVar) {
        boolean booleanValue = bool.booleanValue();
        n nVar = new n(this.f12445g, dVar);
        nVar.e = mVar;
        nVar.f12444f = booleanValue;
        return nVar.invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        ep.m mVar = this.e;
        boolean z13 = this.f12444f;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        if (i13 == 0) {
            r.b(obj);
            if (mVar == ep.m.PLUGGED_IN) {
                return g.a.f12403a;
            }
            if (!z13) {
                return g.b.f12404a;
            }
            this.e = null;
            this.f12444f = z13;
            this.d = 1;
            obj = m.a(this.f12445g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i13 != 1) {
            pa.c.w("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            r.b(obj);
        }
        return (g) obj;
    }
}
