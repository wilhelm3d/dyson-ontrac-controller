package com.dyson.mobile.android.audio.home.settings.removeproduct;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.animation.x;
import androidx.compose.animation.y;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.audio.home.settings.removeproduct.RemoveProductActivity;
import com.dyson.mobile.android.audio.home.settings.removeproduct.b;
import com.dyson.mobile.android.audio.home.settings.removeproduct.c;
import com.dyson.mobile.android.audio.home.settings.removeproduct.g;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import f.x;
import fm1.o0;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vj.f;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
import y9.c0;
import y9.q0;
import y9.z;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/RemoveProductActivity;", "Ll/b;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/d;", "alertState", "", "isLoadingState", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RemoveProductActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12557m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public fk.d f12558j;

    /* renamed from: k  reason: collision with root package name */
    public vj.f f12559k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f12560l = new d0(p0.f86717a.b(com.dyson.mobile.android.audio.home.settings.removeproduct.i.class), new n(this), new xl.c(this, 0), new o(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/g;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/audio/home/settings/removeproduct/g;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.settings.removeproduct.RemoveProductActivity$onCreate$2$1$1", f = "RemoveProductActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<com.dyson.mobile.android.audio.home.settings.removeproduct.g, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q0 f12561f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, l12.d<? super b> dVar) {
            super(2, dVar);
            this.f12561f = q0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(this.f12561f, dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.audio.home.settings.removeproduct.g gVar, l12.d<? super f0> dVar) {
            return ((b) create(gVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.audio.home.settings.removeproduct.g gVar = (com.dyson.mobile.android.audio.home.settings.removeproduct.g) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean c13 = x12.r.c(gVar, g.a.f12585a);
            final RemoveProductActivity removeProductActivity = RemoveProductActivity.this;
            if (c13) {
                vj.f fVar = removeProductActivity.f12559k;
                if (fVar == null) {
                    x12.r.i("coordinator");
                    throw null;
                }
                in0.f g13 = fVar.g();
                if (g13 != null) {
                    g13.d(removeProductActivity, fVar.f84307g.d.d);
                }
                fVar.e();
            } else if (x12.r.c(gVar, g.c.f12587a)) {
                a aVar2 = RemoveProductActivity.f12557m;
                removeProductActivity.getClass();
                uf0.g a13 = uf0.g.a(removeProductActivity);
                iz1.a aVar3 = new iz1.a() { // from class: xl.f
                    @Override // iz1.a
                    public final void run() {
                        int i13 = r2;
                        RemoveProductActivity removeProductActivity2 = removeProductActivity;
                        switch (i13) {
                            case 0:
                                RemoveProductActivity.a aVar4 = RemoveProductActivity.f12557m;
                                removeProductActivity2.c1().S(b.g.f12571a);
                                return;
                            default:
                                RemoveProductActivity.a aVar5 = RemoveProductActivity.f12557m;
                                removeProductActivity2.c1().S(b.a.f12565a);
                                return;
                        }
                    }
                };
                iz1.a aVar4 = new iz1.a() { // from class: xl.f
                    @Override // iz1.a
                    public final void run() {
                        int i13 = r2;
                        RemoveProductActivity removeProductActivity2 = removeProductActivity;
                        switch (i13) {
                            case 0:
                                RemoveProductActivity.a aVar42 = RemoveProductActivity.f12557m;
                                removeProductActivity2.c1().S(b.g.f12571a);
                                return;
                            default:
                                RemoveProductActivity.a aVar5 = RemoveProductActivity.f12557m;
                                removeProductActivity2.c1().S(b.a.f12565a);
                                return;
                        }
                    }
                };
                a13.getClass();
                ConnectivityIssueActivity.f1(removeProductActivity, aVar3, aVar4);
            } else if (!x12.r.c(gVar, g.b.f12586a)) {
                ma.e.o();
                return null;
            } else {
                c0.j(this.f12561f, c.a.INSTANCE, null, 6);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.settings.removeproduct.RemoveProductActivity$onCreate$2$2$1$1$1$1$1", f = "RemoveProductActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<z32.c0, l12.d<? super f0>, Object> {
        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = RemoveProductActivity.f12557m;
            RemoveProductActivity.this.c1().S(new b.h(c.b.INSTANCE));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d extends p implements Function1<com.dyson.mobile.android.audio.home.settings.removeproduct.b, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.audio.home.settings.removeproduct.i.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/audio/home/settings/removeproduct/RemoveProductEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.audio.home.settings.removeproduct.b bVar) {
            com.dyson.mobile.android.audio.home.settings.removeproduct.b bVar2 = bVar;
            bVar2.getClass();
            ((com.dyson.mobile.android.audio.home.settings.removeproduct.i) this.receiver).S(bVar2);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.settings.removeproduct.RemoveProductActivity$onCreate$2$2$1$1$2$1$1", f = "RemoveProductActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends n12.i implements Function2<z32.c0, l12.d<? super f0>, Object> {
        public e(l12.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = RemoveProductActivity.f12557m;
            RemoveProductActivity.this.c1().S(new b.h(c.a.INSTANCE));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements Function1<androidx.compose.animation.i<z>, x> {
        public static final f d = new f();

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
    /* loaded from: classes2.dex */
    public static final class g implements Function1<androidx.compose.animation.i<z>, y> {
        public static final g d = new g();

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
    /* loaded from: classes2.dex */
    public static final class h implements Function1<androidx.compose.animation.i<z>, x> {
        public static final h d = new h();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements Function1<androidx.compose.animation.i<z>, y> {
        public static final i d = new i();

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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class j implements Function1<androidx.compose.animation.i<z>, x> {
        public static final j d = new j();

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
    /* loaded from: classes2.dex */
    public static final class k implements Function1<androidx.compose.animation.i<z>, y> {
        public static final k d = new k();

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
    /* loaded from: classes2.dex */
    public static final class l implements Function1<androidx.compose.animation.i<z>, x> {
        public static final l d = new l();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class m implements Function1<androidx.compose.animation.i<z>, y> {
        public static final m d = new m();

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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class n extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12562f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(f.g gVar) {
            super(0);
            this.f12562f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12562f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class o extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12563f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12564g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(w12.a aVar, f.g gVar) {
            super(0);
            this.f12563f = aVar;
            this.f12564g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12563f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12564g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.audio.home.settings.removeproduct.i c1() {
        return (com.dyson.mobile.android.audio.home.settings.removeproduct.i) this.f12560l.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f.x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        vj.f.f84306m.getClass();
        vj.f a14 = f.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12559k = a14;
        gk.a aVar = a14.f84312l;
        this.f12558j = aVar.d();
        aVar.f();
        g.f.a(this, new c4.c(-1622389124, true, new xl.e(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/RemoveProductActivity$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
