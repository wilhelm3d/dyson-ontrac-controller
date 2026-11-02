package com.dyson.mobile.android.machine.ui.permissions;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.q1;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.machine.ui.permissions.a;
import com.dyson.mobile.android.machine.ui.permissions.c;
import com.paypal.android.platform.authsdk.BR;
import e71.j;
import e71.n;
import f.x;
import h12.f0;
import h12.r;
import hj.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj.m;
import n12.i;
import nj.y0;
import x12.p;
import x12.p0;
import x12.t;
import z32.c0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/DysonPermissionExperienceActivity;", "Landroidx/fragment/app/e;", "<init>", "()V", "a", "", "permissionGranted", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonPermissionExperienceActivity extends androidx.fragment.app.e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f15375n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public a.b f15376j;

    /* renamed from: k  reason: collision with root package name */
    public v60.b f15377k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f15378l = new d0(p0.f86717a.b(com.dyson.mobile.android.machine.ui.permissions.a.class), new f(this), new e(d.d, this, new em0.c(this, 0)), new g(null, this));

    /* renamed from: m  reason: collision with root package name */
    public uf0.g f15379m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.permissions.DysonPermissionExperienceActivity$onCreate$1$1$1$1$1", f = "DysonPermissionExperienceActivity.kt", l = {BR.timeRangeTooltip}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class b extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ os0.f<String[], Map<String, Boolean>> f15380f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/c;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/machine/ui/permissions/c;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.machine.ui.permissions.DysonPermissionExperienceActivity$onCreate$1$1$1$1$1$1", f = "DysonPermissionExperienceActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        /* loaded from: classes3.dex */
        public static final class a extends i implements Function2<com.dyson.mobile.android.machine.ui.permissions.c, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ os0.f<String[], Map<String, Boolean>> e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ DysonPermissionExperienceActivity f15381f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(os0.f<String[], Map<String, Boolean>> fVar, DysonPermissionExperienceActivity dysonPermissionExperienceActivity, l12.d<? super a> dVar) {
                super(2, dVar);
                this.e = fVar;
                this.f15381f = dysonPermissionExperienceActivity;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                a aVar = new a(this.e, this.f15381f, dVar);
                aVar.d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(com.dyson.mobile.android.machine.ui.permissions.c cVar, l12.d<? super f0> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                com.dyson.mobile.android.machine.ui.permissions.c cVar = (com.dyson.mobile.android.machine.ui.permissions.c) this.d;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                if (x12.r.c(cVar, c.d.f15400a)) {
                    this.e.a();
                } else {
                    boolean c13 = x12.r.c(cVar, c.C0524c.f15399a);
                    DysonPermissionExperienceActivity dysonPermissionExperienceActivity = this.f15381f;
                    if (c13) {
                        v60.b bVar = dysonPermissionExperienceActivity.f15377k;
                        if (bVar == null) {
                            x12.r.i("locationServicesHelper");
                            throw null;
                        }
                        bVar.c(dysonPermissionExperienceActivity);
                    } else if (x12.r.c(cVar, c.a.f15397a)) {
                        dysonPermissionExperienceActivity.finish();
                    } else if (!(cVar instanceof c.b)) {
                        ma.e.o();
                        return null;
                    } else if (dysonPermissionExperienceActivity.f15379m == null) {
                        x12.r.i("machineCoordinator");
                        throw null;
                    } else {
                        n.f26183r.getClass();
                        new j().e(dysonPermissionExperienceActivity, String.valueOf(n.a.a().c().a()), ((c.b) cVar).f15398a);
                    }
                }
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(os0.f<String[], Map<String, Boolean>> fVar, l12.d<? super b> dVar) {
            super(2, dVar);
            this.f15380f = fVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.f15380f, dVar);
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
                r.b(obj);
                a aVar2 = DysonPermissionExperienceActivity.f15375n;
                DysonPermissionExperienceActivity dysonPermissionExperienceActivity = DysonPermissionExperienceActivity.this;
                q1 q1Var = dysonPermissionExperienceActivity.c1().f15390j;
                a aVar3 = new a(this.f15380f, dysonPermissionExperienceActivity, null);
                this.d = 1;
                if (c42.r.i(q1Var, aVar3, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.permissions.a.class, "onPrivacyPolicyClick", "onPrivacyPolicyClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.machine.ui.permissions.a aVar = (com.dyson.mobile.android.machine.ui.permissions.a) this.receiver;
            aVar.getClass();
            aVar.S(new c.b(new ExternalLinkTracking("privacy_policy", m.a.LOCATION_SERVICES, null, null, 12, null)));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements w12.a<Bundle> {
        public static final d d = new d();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f15382f;

        public e(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f15382f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f15382f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f15383f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.g gVar) {
            super(0);
            this.f15383f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f15383f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15384f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f15385g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, f.g gVar) {
            super(0);
            this.f15384f = aVar;
            this.f15385g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15384f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f15385g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.machine.ui.permissions.a c1() {
        return (com.dyson.mobile.android.machine.ui.permissions.a) this.f15378l.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        uf0.g a13 = uf0.g.a(this);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f15379m = a13;
        sg0.b bVar = a13.f81922a;
        this.f15376j = (a.b) bVar.f76131x0.f88315a;
        this.f15377k = (v60.b) bVar.W.get();
        bVar.f76129w0.get();
        getLifecycle().a(c1());
        g.f.a(this, new c4.c(-1201469750, true, new aa.g(this, 20)));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = c1().f15387g;
        int i13 = y0.f57791a;
        ij.b bVar = new ij.b("common.settings.location_permission", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/DysonPermissionExperienceActivity$a;", "", "<init>", "()V", "", "COORDINATOR_ID", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(androidx.fragment.app.e eVar, String str) {
            str.getClass();
            Intent intent = new Intent(eVar, DysonPermissionExperienceActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            return intent;
        }

        private a() {
        }
    }
}
