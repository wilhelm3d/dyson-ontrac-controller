package bk;

import com.dyson.mobile.android.logging.Logger;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.customisation.SingleThreadedFilamentContext$init$2$1", f = "SingleThreadedFilamentContext.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class x extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public x(l12.d<? super x> dVar) {
        super(2, dVar);
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new x(dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return new x(dVar).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        h12.r.b(obj);
        try {
            Logger.c("Initialize Filament");
            nk1.h.f57872a.getClass();
            int i13 = lk1.c.f52302a;
            System.loadLibrary("filament-utils-jni");
            y.f7931c = true;
        } catch (Throwable th2) {
            Logger.b("Filament initialization failed", th2);
        }
        return f0.f36844a;
    }
}
