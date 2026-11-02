package com.dyson.mobile.shared;

import android.content.Context;
import bg1.a;
import h12.f0;
import hb.b;
import i12.e0;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/shared/ContextProviderInitializer;", "Lhb/b;", "Lh12/f0;", "<init>", "()V", "shared_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContextProviderInitializer implements b<f0> {
    @Override // hb.b
    public final List<Class<? extends b<?>>> a() {
        return e0.d;
    }

    @Override // hb.b
    public final f0 create(Context context) {
        context.getClass();
        a aVar = a.f7715a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        aVar.getClass();
        a.f7716b = applicationContext;
        return f0.f36844a;
    }
}
