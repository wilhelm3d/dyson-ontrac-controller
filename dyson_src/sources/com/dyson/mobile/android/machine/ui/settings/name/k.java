package com.dyson.mobile.android.machine.ui.settings.name;

import androidx.compose.animation.i;
import androidx.compose.animation.x;
import androidx.compose.animation.y;
import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machine.ui.settings.name.l;
import com.dyson.mobile.android.machinetype.MachineCategory;
import h12.f0;
import h12.r;
import i12.e0;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m9.u;
import vl0.o;
import x12.p0;
import y9.o0;
import y9.q0;
import y9.z;
import z32.c0;
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final MachineNamingExtras.ReturnName f15483a = new MachineNamingExtras.ReturnName(null, "", null, MachineCategory.EC, 5, null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Function1<androidx.compose.animation.i<z>, x> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.a(iVar2, i.a.f2671f, null, 6);
            }
            x.f2747a.getClass();
            return x.f2748b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Function1<androidx.compose.animation.i<z>, y> {
        public static final b d = new b();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2671f, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements Function1<androidx.compose.animation.i<z>, x> {
        public static final c d = new c();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements Function1<androidx.compose.animation.i<z>, y> {
        public static final d d = new d();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.name.NameSelectionNavigationGraphKt$nameSelectionScreen$5$1$1", f = "NameSelectionNavigationGraph.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class e extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ Function1<o, f0> d;
        public final /* synthetic */ o e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super o, f0> function1, o oVar, l12.d<? super e> dVar) {
            super(2, dVar);
            this.d = function1;
            this.e = oVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.d.invoke(this.e);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/ui/settings/name/k$f", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vl0.l f15484a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ sg0.c f15485b;

        public f(vl0.l lVar, sg0.c cVar) {
            this.f15484a = lVar;
            this.f15485b = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.dyson.mobile.android.machine.ui.settings.name.l$a, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (l.a.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                aVar.f26823a = (l.a) ((sg0.b) this.f15485b).L0.f88315a;
                try {
                    l.a aVar2 = (l.a) aVar.a();
                    vl0.l lVar = this.f15484a;
                    return aVar2.a(lVar.f84583a, lVar.f84584b);
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new ef1.g();
        }
    }

    public static final void a(o0 o0Var, q0 q0Var, Function2<? super String, ? super Boolean, f0> function2, w12.a<f0> aVar, MachineNamingExtras machineNamingExtras, w12.a<f0> aVar2, Function1<? super o, f0> function1) {
        o0Var.getClass();
        q0Var.getClass();
        machineNamingExtras.getClass();
        c4.c cVar = new c4.c(1381121968, true, new pm0.l(function1, aVar2, machineNamingExtras, q0Var, function2, aVar));
        e0 e0Var = e0.d;
        a aVar3 = a.d;
        b bVar = b.d;
        c cVar2 = c.d;
        d dVar = d.d;
        i12.f0 f0Var = i12.f0.d;
        f0Var.getClass();
        aa.o.a(o0Var, p0.f86717a.b(vl0.l.class), f0Var, e0Var, aVar3, bVar, cVar2, dVar, cVar);
    }
}
