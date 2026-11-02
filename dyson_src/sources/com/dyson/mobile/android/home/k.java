package com.dyson.mobile.android.home;

import c42.f2;
import com.dyson.mobile.android.home.i;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$collectHasUnreadMessages$1", f = "HomeViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class k extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ i e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "hasUnreadMessages", "Lh12/f0;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$collectHasUnreadMessages$1$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<Boolean, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ i e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, l12.d<? super a> dVar) {
            super(2, dVar);
            this.e = iVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            a aVar = new a(this.e, dVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, l12.d<? super f0> dVar) {
            return ((a) create(bool, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z13;
            Boolean bool = (Boolean) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            i iVar = this.e;
            f2 f2Var = iVar.f14194s;
            do {
                value = f2Var.getValue();
                z13 = iVar.f14183h.f60582a;
                bool.getClass();
            } while (!f2Var.f(value, i.c.a((i.c) value, null, new v90.i(z13, bool.booleanValue()), null, null, null, 29)));
            return f0.f36844a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, l12.d<? super k> dVar) {
        super(2, dVar);
        this.e = iVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new k(this.e, dVar);
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
            i iVar = this.e;
            c42.i<Boolean> iVar2 = iVar.f14183h.f60583b;
            a aVar2 = new a(iVar, null);
            this.d = 1;
            if (c42.r.i(iVar2, aVar2, this) == aVar) {
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
