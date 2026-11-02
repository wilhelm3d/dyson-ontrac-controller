package com.dyson.mobile.android.cat6.traits.language;

import com.dyson.mobile.android.cat6.traits.language.ProductUILanguage;
import com.dyson.mobile.android.logging.Logger;
import ds.g;
import h12.f0;
import h12.q;
import h12.r;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l12.d;
import n12.e;
import n12.i;
import ys.e;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.dyson.mobile.android.cat6.traits.language.MqttLanguageSelectionController$setLanguageWithStatus$1", f = "MqttLanguageSelectionController.kt", l = {129}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class c extends i implements Function2<c0, d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ProductUILanguage f12862f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Function1<ys.e, f0> f12863g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(b bVar, ProductUILanguage productUILanguage, Function1<? super ys.e, f0> function1, d<? super c> dVar) {
        super(2, dVar);
        this.e = bVar;
        this.f12862f = productUILanguage;
        this.f12863g = function1;
    }

    @Override // n12.a
    public final d<f0> create(Object obj, d<?> dVar) {
        return new c(this.e, this.f12862f, this.f12863g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, d<? super f0> dVar) {
        return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        b bVar2 = this.e;
        try {
            if (i13 == 0) {
                r.b(obj);
                ProductUILanguage productUILanguage = this.f12862f;
                int i14 = q.e;
                productUILanguage.getClass();
                int i15 = b.f12851l;
                dz1.b b13 = bVar2.f12852a.b(new g(bVar2.f12853b, bVar2.f12854c, ((ProductUILanguage.Mqtt) productUILanguage).d));
                this.d = 1;
                if (g42.b.a(b13, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            bVar = f0.f36844a;
            int i16 = q.e;
        } catch (Throwable th2) {
            int i17 = q.e;
            bVar = new q.b(th2);
        }
        Throwable b14 = q.b(bVar);
        if (b14 == null || !(b14 instanceof CancellationException)) {
            Throwable b15 = q.b(bVar);
            Function1<ys.e, f0> function1 = this.f12863g;
            if (b15 != null) {
                String str = bVar2.f12854c;
                Logger.b("Error getting list of languages via REQUEST-INFO [serial=" + str + "]", b15);
                function1.invoke(e.a.f90422a);
            }
            if (!(bVar instanceof q.b)) {
                f0 f0Var = (f0) bVar;
                function1.invoke(e.b.f90423a);
            }
            return f0.f36844a;
        }
        throw b14;
    }
}
