package com.dyson.mobile.android.connectionjourney.ownership;

import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.animation.x;
import androidx.compose.animation.y;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c40.o;
import c40.p;
import com.dyson.mobile.android.connectionjourney.ownership.i;
import f.x;
import go1.o2;
import go1.q;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import nx1.u;
import p30.z;
import x12.p0;
import x12.t;
import y30.a;
import y30.b;
import y9.k0;
import y9.q0;
import z32.c0;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/OwnershipActivity;", "Ll/b;", "<init>", "()V", "Lb40/i;", "productInfoViewState", "Lcom/dyson/mobile/android/connectionjourney/ownership/k;", "viewState", "Lx30/j;", "machineNameViewState", "Lc40/q;", "purchaseDateViewState", "Lc40/c;", "datePickerViewState", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f13774l = 0;

    /* renamed from: j  reason: collision with root package name */
    public ef1.h f13775j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f13776k = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.ownership.j.class), new k(this), new p30.d(this, 0), new l(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly30/a;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Ly30/a;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipActivity$onCreate$1$1$1", f = "OwnershipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<y30.a, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ z f13777f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ OwnershipActivity f13778g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, z zVar, OwnershipActivity ownershipActivity, l12.d<? super a> dVar) {
            super(2, dVar);
            this.e = q0Var;
            this.f13777f = zVar;
            this.f13778g = ownershipActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            a aVar = new a(this.e, this.f13777f, this.f13778g, dVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(y30.a aVar, l12.d<? super f0> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            y30.a aVar = (y30.a) this.d;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = aVar instanceof a.d;
            q0 q0Var = this.e;
            if (z13) {
                k0 i13 = q0Var.f89416b.i();
                q0Var.g(((a.d) aVar).f89106a, new ot0.a(aVar, i13 != null ? i13.e.f23151f : null, 9));
            } else if (x12.r.c(aVar, a.C2692a.f89103a)) {
                q0Var.l();
            } else {
                boolean c13 = x12.r.c(aVar, a.c.f89105a);
                OwnershipActivity ownershipActivity = this.f13778g;
                z zVar = this.f13777f;
                if (c13) {
                    zVar.c(ownershipActivity);
                } else if (!x12.r.c(aVar, a.b.f89104a)) {
                    ma.e.o();
                    return null;
                } else {
                    zVar.f(ownershipActivity);
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipActivity$onCreate$1$2$1$1$1$1$2$1", f = "OwnershipActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public b(l12.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i13 = OwnershipActivity.f13774l;
            OwnershipActivity.this.c1().V(new i.p(b.e.INSTANCE));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Function1<androidx.compose.animation.i<y9.z>, x> {
        public static final c d = new c();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
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
    /* loaded from: classes2.dex */
    public static final class d implements Function1<androidx.compose.animation.i<y9.z>, y> {
        public static final d d = new d();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
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
    /* loaded from: classes2.dex */
    public static final class e implements Function1<androidx.compose.animation.i<y9.z>, x> {
        public static final e d = new e();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements Function1<androidx.compose.animation.i<y9.z>, y> {
        public static final f d = new f();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements Function1<androidx.compose.animation.i<y9.z>, x> {
        public static final g d = new g();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
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
    /* loaded from: classes2.dex */
    public static final class h implements Function1<androidx.compose.animation.i<y9.z>, y> {
        public static final h d = new h();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
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
    /* loaded from: classes2.dex */
    public static final class i implements Function1<androidx.compose.animation.i<y9.z>, x> {
        public static final i d = new i();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class j implements Function1<androidx.compose.animation.i<y9.z>, y> {
        public static final j d = new j();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class k extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f13779f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f.g gVar) {
            super(0);
            this.f13779f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13779f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class l extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13780f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f13781g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w12.a aVar, f.g gVar) {
            super(0);
            this.f13780f = aVar;
            this.f13781g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13780f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13781g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.connectionjourney.ownership.j c1() {
        return (com.dyson.mobile.android.connectionjourney.ownership.j) this.f13776k.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f.x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        z d13 = z.d(this);
        t30.b bVar = d13.f62827c;
        bVar.getClass();
        p30.d0 d0Var = bVar.f78113o;
        x30.i iVar = bVar.f78115q;
        p pVar = bVar.f78116r;
        q.a(com.dyson.mobile.android.connectionjourney.ownership.j.class, d0Var);
        q.a(x30.h.class, iVar);
        q.a(o.class, pVar);
        this.f13775j = new ef1.h(o2.j(3, new Object[]{com.dyson.mobile.android.connectionjourney.ownership.j.class, d0Var, x30.h.class, iVar, o.class, pVar}, null));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        g.f.a(this, new c4.c(242777120, true, new u(13, this, d13)));
    }
}
