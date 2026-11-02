package com.dyson.mobile.android.connectionjourney.bleconnection;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.u;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.g;
import com.dyson.mobile.android.connectionjourney.bleconnection.b;
import com.dyson.mobile.android.connectionjourney.bleconnection.c;
import com.dyson.mobile.android.connectionjourney.changewifijourney.a;
import com.dyson.mobile.android.logging.Logger;
import ef1.h;
import f.x;
import h12.f0;
import i3.n;
import k30.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m10.l;
import rf0.i0;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import y20.i;
import z20.m;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionNdsActivity;", "Lbt0/g;", "Lr40/a;", "<init>", "()V", "a", "Lb10/a;", "alertViewState", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GattConnectionNdsActivity extends g implements r40.a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f13303r = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public l f13304k;

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f13305l;

    /* renamed from: m  reason: collision with root package name */
    public h f13306m;

    /* renamed from: n  reason: collision with root package name */
    public i.b f13307n;

    /* renamed from: o  reason: collision with root package name */
    public m.c f13308o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f13309p = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.bleconnection.d.class), new c(this), new j(this, 27), new d(null, this));

    /* renamed from: q  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f13310q = registerForActivityResult(new j.a(), new m10.f(this, 28));

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionNdsActivity$onCreate$2", f = "GattConnectionNdsActivity.kt", l = {108}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionNdsActivity$onCreate$2$1", f = "GattConnectionNdsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        /* loaded from: classes2.dex */
        public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ GattConnectionNdsActivity e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
            @n12.e(c = "com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionNdsActivity$onCreate$2$1$1", f = "GattConnectionNdsActivity.kt", l = {com.salesforce.marketingcloud.analytics.stats.b.f20726n}, m = "invokeSuspend", v = 2)
            /* renamed from: com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionNdsActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0406a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
                public int d;
                public final /* synthetic */ GattConnectionNdsActivity e;

                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionNdsActivity$b$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final /* synthetic */ class C0407a implements c42.j, x12.m {
                    public final /* synthetic */ GattConnectionNdsActivity d;

                    public C0407a(GattConnectionNdsActivity gattConnectionNdsActivity) {
                        this.d = gattConnectionNdsActivity;
                    }

                    @Override // x12.m
                    public final h12.h<?> d() {
                        return new x12.a(2, this.d, GattConnectionNdsActivity.class, "onNavigationEvent", "onNavigationEvent(Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionNavigationEvent;)V", 4);
                    }

                    @Override // c42.j
                    public final Object emit(Object obj, l12.d dVar) {
                        a aVar = GattConnectionNdsActivity.f13303r;
                        this.d.f1((com.dyson.mobile.android.connectionjourney.bleconnection.c) obj);
                        f0 f0Var = f0.f36844a;
                        m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
                        return f0Var;
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof c42.j) && (obj instanceof x12.m)) {
                            return r.c(d(), ((x12.m) obj).d());
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return d().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0406a(GattConnectionNdsActivity gattConnectionNdsActivity, l12.d<? super C0406a> dVar) {
                    super(2, dVar);
                    this.e = gattConnectionNdsActivity;
                }

                @Override // n12.a
                public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                    return new C0406a(this.e, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
                    return ((C0406a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                    int i13 = this.d;
                    if (i13 == 0) {
                        h12.r.b(obj);
                        a aVar2 = GattConnectionNdsActivity.f13303r;
                        GattConnectionNdsActivity gattConnectionNdsActivity = this.e;
                        c42.e eVar = gattConnectionNdsActivity.d1().f13357l;
                        C0407a c0407a = new C0407a(gattConnectionNdsActivity);
                        this.d = 1;
                        if (eVar.collect(c0407a, this) == aVar) {
                            return aVar;
                        }
                    } else if (i13 != 1) {
                        pa.c.w("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    } else {
                        h12.r.b(obj);
                    }
                    return f0.f36844a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GattConnectionNdsActivity gattConnectionNdsActivity, l12.d<? super a> dVar) {
                super(2, dVar);
                this.e = gattConnectionNdsActivity;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                a aVar = new a(this.e, dVar);
                aVar.d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
                return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                h12.r.b(obj);
                g0.r((c0) this.d, null, null, new C0406a(this.e, null), 3);
                return f0.f36844a;
            }
        }

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
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                Lifecycle.State state = Lifecycle.State.STARTED;
                GattConnectionNdsActivity gattConnectionNdsActivity = GattConnectionNdsActivity.this;
                a aVar2 = new a(gattConnectionNdsActivity, null);
                this.d = 1;
                if (u.b(gattConnectionNdsActivity, state, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f13311f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f13311f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13311f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13312f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f13313g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f13312f = aVar;
            this.f13313g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13312f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13313g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // r40.a
    public final void A0() {
        w00.i.c(this).k(this);
    }

    @Override // r40.a
    public final void J() {
        d1().S(b.f.f13335a);
    }

    @Override // r40.a
    public final void M0() {
        d1().S(b.d.f13333a);
    }

    public final com.dyson.mobile.android.connectionjourney.bleconnection.d d1() {
        return (com.dyson.mobile.android.connectionjourney.bleconnection.d) this.f13309p.getValue();
    }

    public final ViewModelProvider.Factory e1() {
        h hVar = this.f13306m;
        if (hVar != null) {
            return hVar;
        }
        r.i("viewModelFactory");
        throw null;
    }

    public final void f1(com.dyson.mobile.android.connectionjourney.bleconnection.c cVar) {
        if (r.c(cVar, c.f.f13347a)) {
            w00.i.c(this).l(this);
        } else if (r.c(cVar, c.e.f13346a)) {
            w00.i.c(this).g(this);
        } else if (r.c(cVar, c.a.f13342a)) {
            l lVar = this.f13304k;
            if (lVar == null) {
                r.i("gattConnectionManager");
                throw null;
            }
            Logger.a("Cancelling connection journey");
            lVar.m("cancel-connection-journey-action");
            w00.i.c(this).j(this);
        } else if (r.c(cVar, c.b.f13343a)) {
            l lVar2 = this.f13304k;
            if (lVar2 == null) {
                r.i("gattConnectionManager");
                throw null;
            }
            Logger.a("Cancelling connection journey");
            lVar2.m("cancel-connection-journey-action");
            w00.i.c(this).o(this);
        } else if (cVar instanceof c.g) {
            c.g gVar = (c.g) cVar;
            w00.i.m(this, gVar.f13348a, gVar.f13349b, w00.i.c(this).f85124a.j());
        } else if (r.c(cVar, c.C0409c.f13344a)) {
            String j8 = d1().e.d().j();
            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
            a.C0413a.a();
            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f(this, j8, null);
        } else if (r.c(cVar, c.d.f13345a)) {
            String j13 = d1().e.d().j();
            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
            a.C0413a.a();
            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f(this, j13, this.f13310q);
        } else if (!r.c(cVar, c.h.f13350a)) {
            ma.e.o();
        } else {
            Logger.a("Starting GattConnectionJourneyService");
            int i13 = GattConnectionJourneyService.e;
            Intent intent = new Intent(this, GattConnectionJourneyService.class);
            intent.putExtra("stopServiceOnProximityTimeout", false);
            intent.putExtra("AUTHCODE", (String) null);
            intent.putExtra("RANDOMNUMBER", (String) null);
            startService(intent);
        }
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        a.C2547a.a(intent).f85710b = "Please use the newInstance method";
        w00.i.c(this).e.e(this);
        super.onCreate(bundle);
        zs0.c.f93105a.getClass();
        zs0.c.a(this);
        pf0.c cVar = this.f13305l;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        g.f.a(this, new c4.c(-1684422764, true, new ks.e(10, this, cVar.d(i0.P1))));
        getWindow().addFlags(128);
        l lVar = this.f13304k;
        if (lVar == null) {
            r.i("gattConnectionManager");
            throw null;
        }
        getLifecycle().a(lVar);
        Logger.a("Starting GattConnectionJourneyService");
        int i13 = GattConnectionJourneyService.e;
        Intent intent2 = new Intent(this, GattConnectionJourneyService.class);
        intent2.putExtra("stopServiceOnProximityTimeout", false);
        intent2.putExtra("AUTHCODE", (String) null);
        intent2.putExtra("RANDOMNUMBER", (String) null);
        startService(intent2);
        g0.r(n.o(this), null, null, new b(null), 3);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Logger.a("Stopping GattConnectionJourneyService");
        stopService(new Intent(this, GattConnectionJourneyService.class));
        if (this.f13304k != null) {
            Lifecycle lifecycle = getLifecycle();
            l lVar = this.f13304k;
            if (lVar != null) {
                lifecycle.c(lVar);
            } else {
                r.i("gattConnectionManager");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionNdsActivity$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
