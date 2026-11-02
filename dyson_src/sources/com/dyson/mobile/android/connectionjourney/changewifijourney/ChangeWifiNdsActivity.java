package com.dyson.mobile.android.connectionjourney.changewifijourney;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.u;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.j;
import com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity;
import com.dyson.mobile.android.connectionjourney.changewifijourney.a;
import com.dyson.mobile.android.connectionjourney.changewifijourney.b;
import com.dyson.mobile.android.connectionjourney.changewifijourney.c;
import com.paypal.android.platform.authsdk.BR;
import ef1.h;
import f.g;
import f.q;
import h12.f0;
import i20.x1;
import i3.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.i0;
import sa0.p;
import x12.p0;
import x12.r;
import x12.t;
import y20.i;
import z20.m;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiNdsActivity;", "Ll/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangeWifiNdsActivity extends l.b {

    /* renamed from: r  reason: collision with root package name */
    public static final a f13387r = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public h f13388j;

    /* renamed from: k  reason: collision with root package name */
    public i.b f13389k;

    /* renamed from: l  reason: collision with root package name */
    public m.c f13390l;

    /* renamed from: m  reason: collision with root package name */
    public pf0.c f13391m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f13392n = new d0(p0.f86717a.b(f.class), new d(this), new v10.a(this, 0), new e(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f13393o = registerForActivityResult(new j.a(), new tq1.a(22));

    /* renamed from: p  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f13394p = registerForActivityResult(new j.a(), new ActivityResultCallback(this) { // from class: v10.b
        public final /* synthetic */ ChangeWifiNdsActivity e;

        {
            this.e = this;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void e(Object obj) {
            int i13 = r2;
            ChangeWifiNdsActivity changeWifiNdsActivity = this.e;
            ActivityResult activityResult = (ActivityResult) obj;
            switch (i13) {
                case 0:
                    ChangeWifiNdsActivity.a aVar = ChangeWifiNdsActivity.f13387r;
                    activityResult.getClass();
                    boolean z13 = activityResult.d == -1;
                    com.dyson.mobile.android.connectionjourney.changewifijourney.f c13 = changeWifiNdsActivity.c1();
                    z32.g0.r(m9.v.a(c13), null, null, new m(c13, z13, null), 3);
                    return;
                default:
                    ChangeWifiNdsActivity.a aVar2 = ChangeWifiNdsActivity.f13387r;
                    activityResult.getClass();
                    changeWifiNdsActivity.c1().T(b.g.f13410a);
                    return;
            }
        }
    });

    /* renamed from: q  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f13395q = registerForActivityResult(new j.a(), new ActivityResultCallback(this) { // from class: v10.b
        public final /* synthetic */ ChangeWifiNdsActivity e;

        {
            this.e = this;
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void e(Object obj) {
            int i13 = r2;
            ChangeWifiNdsActivity changeWifiNdsActivity = this.e;
            ActivityResult activityResult = (ActivityResult) obj;
            switch (i13) {
                case 0:
                    ChangeWifiNdsActivity.a aVar = ChangeWifiNdsActivity.f13387r;
                    activityResult.getClass();
                    boolean z13 = activityResult.d == -1;
                    com.dyson.mobile.android.connectionjourney.changewifijourney.f c13 = changeWifiNdsActivity.c1();
                    z32.g0.r(m9.v.a(c13), null, null, new m(c13, z13, null), 3);
                    return;
                default:
                    ChangeWifiNdsActivity.a aVar2 = ChangeWifiNdsActivity.f13387r;
                    activityResult.getClass();
                    changeWifiNdsActivity.c1().T(b.g.f13410a);
                    return;
            }
        }
    });

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiNdsActivity$b", "Lf/q;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends q {
        public b() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            a aVar = ChangeWifiNdsActivity.f13387r;
            ChangeWifiNdsActivity.this.c1().T(b.a.f13404a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity$onCreate$2", f = "ChangeWifiNdsActivity.kt", l = {BR.scaleTitle}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity$onCreate$2$1", f = "ChangeWifiNdsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        /* loaded from: classes2.dex */
        public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ ChangeWifiNdsActivity e;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
            @n12.e(c = "com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity$onCreate$2$1$1", f = "ChangeWifiNdsActivity.kt", l = {BR.screenTitle}, m = "invokeSuspend", v = 2)
            /* renamed from: com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0411a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
                public int d;
                public final /* synthetic */ ChangeWifiNdsActivity e;

                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                /* renamed from: com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiNdsActivity$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final /* synthetic */ class C0412a implements j, x12.m {
                    public final /* synthetic */ ChangeWifiNdsActivity d;

                    public C0412a(ChangeWifiNdsActivity changeWifiNdsActivity) {
                        this.d = changeWifiNdsActivity;
                    }

                    @Override // x12.m
                    public final h12.h<?> d() {
                        return new x12.a(2, this.d, ChangeWifiNdsActivity.class, "onNavigationEvent", "onNavigationEvent(Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiNavigationEvent;)V", 4);
                    }

                    @Override // c42.j
                    public final Object emit(Object obj, l12.d dVar) {
                        com.dyson.mobile.android.connectionjourney.changewifijourney.c cVar = (com.dyson.mobile.android.connectionjourney.changewifijourney.c) obj;
                        a aVar = ChangeWifiNdsActivity.f13387r;
                        ChangeWifiNdsActivity changeWifiNdsActivity = this.d;
                        changeWifiNdsActivity.getClass();
                        if (r.c(cVar, c.b.f13415a)) {
                            changeWifiNdsActivity.finish();
                        } else if (r.c(cVar, c.C0415c.f13416a)) {
                            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
                            com.dyson.mobile.android.connectionjourney.changewifijourney.a a13 = a.C0413a.a();
                            pf0.c cVar2 = changeWifiNdsActivity.f13391m;
                            if (cVar2 == null) {
                                r.i("localisationManager");
                                throw null;
                            }
                            a13.d(changeWifiNdsActivity, cVar2.d(i0.f71949zb), changeWifiNdsActivity.f13394p);
                        } else if (!r.c(cVar, c.a.f13414a)) {
                            ma.e.o();
                            return null;
                        } else {
                            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
                            a.C0413a.a();
                            com.dyson.mobile.android.connectionjourney.changewifijourney.a.f(changeWifiNdsActivity, changeWifiNdsActivity.getIntent().getStringExtra("machineSerial"), changeWifiNdsActivity.f13395q);
                        }
                        f0 f0Var = f0.f36844a;
                        m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
                        return f0Var;
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof j) && (obj instanceof x12.m)) {
                            return r.c(d(), ((x12.m) obj).d());
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return d().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0411a(ChangeWifiNdsActivity changeWifiNdsActivity, l12.d<? super C0411a> dVar) {
                    super(2, dVar);
                    this.e = changeWifiNdsActivity;
                }

                @Override // n12.a
                public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                    return new C0411a(this.e, dVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
                    return ((C0411a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                    int i13 = this.d;
                    if (i13 == 0) {
                        h12.r.b(obj);
                        a aVar2 = ChangeWifiNdsActivity.f13387r;
                        ChangeWifiNdsActivity changeWifiNdsActivity = this.e;
                        c42.e eVar = changeWifiNdsActivity.c1().f13422k;
                        C0412a c0412a = new C0412a(changeWifiNdsActivity);
                        this.d = 1;
                        if (eVar.collect(c0412a, this) == aVar) {
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
            public a(ChangeWifiNdsActivity changeWifiNdsActivity, l12.d<? super a> dVar) {
                super(2, dVar);
                this.e = changeWifiNdsActivity;
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
                g0.r((c0) this.d, null, null, new C0411a(this.e, null), 3);
                return f0.f36844a;
            }
        }

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                Lifecycle.State state = Lifecycle.State.STARTED;
                ChangeWifiNdsActivity changeWifiNdsActivity = ChangeWifiNdsActivity.this;
                a aVar2 = new a(changeWifiNdsActivity, null);
                this.d = 1;
                if (u.b(changeWifiNdsActivity, state, aVar2, this) == aVar) {
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
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f13396f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f13396f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13396f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13397f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f13398g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, g gVar) {
            super(0);
            this.f13397f = aVar;
            this.f13398g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13397f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13398g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final f c1() {
        return (f) this.f13392n.getValue();
    }

    public final ViewModelProvider.Factory d1() {
        h hVar = this.f13388j;
        if (hVar != null) {
            return hVar;
        }
        r.i("viewModelFactory");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
        h20.e eVar = a.C0413a.a().f13402a;
        if (eVar == null) {
            pa.c.p("Change wifi coordinator doesn't have component");
            return;
        }
        this.f13388j = eVar.Y();
        this.f13389k = (i.b) eVar.V0.f88315a;
        this.f13390l = (m.c) eVar.X0.f88315a;
        this.f13391m = x1.b(eVar.f37171a);
        super.onCreate(bundle);
        g.f.a(this, new c4.c(1845539344, true, new p(this, 16)));
        getOnBackPressedDispatcher().a(this, new b());
        g0.r(n.o(this), null, null, new c(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiNdsActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL_EXTRA", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
