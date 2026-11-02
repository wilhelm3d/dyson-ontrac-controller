package com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.f2;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.b;
import com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c;
import com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e;
import f.j;
import f.x;
import fm1.o0;
import h12.f0;
import i12.t;
import i3.n;
import iu0.a0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uf0.k;
import we1.a;
import x12.p;
import x12.p0;
import x12.r;
import z32.g0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/ConfirmMapAndZoningOnboardingActivity;", "Ll/b;", "<init>", "()V", "a", "Ld41/d;", "uiState", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfirmMapAndZoningOnboardingActivity extends l.b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f16621q = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public e.a f16622j;

    /* renamed from: k  reason: collision with root package name */
    public k f16623k;

    /* renamed from: l  reason: collision with root package name */
    public z f16624l;

    /* renamed from: m  reason: collision with root package name */
    public c.b f16625m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f16626n = new d0(p0.f86717a.b(com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e.class), new f(this), new e(d.d, this, new c91.c(this, 11)), new g(null, this));

    /* renamed from: o  reason: collision with root package name */
    public String f16627o;

    /* renamed from: p  reason: collision with root package name */
    public String f16628p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.b, f0> {
        public b(Object obj) {
            super(1, obj, ConfirmMapAndZoningOnboardingActivity.class, "handleClickEvents", "handleClickEvents(Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/ConfirmMapAndZoningOnboardingEvents;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.b bVar) {
            Object value;
            Object value2;
            com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.b bVar2 = bVar;
            bVar2.getClass();
            ConfirmMapAndZoningOnboardingActivity confirmMapAndZoningOnboardingActivity = (ConfirmMapAndZoningOnboardingActivity) this.receiver;
            a aVar = ConfirmMapAndZoningOnboardingActivity.f16621q;
            confirmMapAndZoningOnboardingActivity.getClass();
            if (bVar2.equals(b.a.f16635a)) {
                com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e c13 = confirmMapAndZoningOnboardingActivity.c1();
                a0 a0Var = c13.e;
                if (c13.f16647i == 0) {
                    c13.f16650l.b(Boolean.valueOf(a0Var.a()));
                    a0Var.f42654a.remove("IS_ZONE_CREATED_".concat(a0Var.f42655b.d));
                } else {
                    f2 f2Var = c13.f16648j;
                    do {
                        value2 = f2Var.getValue();
                    } while (!f2Var.f(value2, d41.d.a((d41.d) value2, null, false, 1)));
                    c13.S(c13.f16647i - 1);
                }
            } else if (bVar2.equals(b.c.f16637a)) {
                com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e c14 = confirmMapAndZoningOnboardingActivity.c1();
                if (c14.f16647i == t.g(c14.f16646h)) {
                    c14.f16652n.b(f0.f36844a);
                } else {
                    f2 f2Var2 = c14.f16648j;
                    do {
                        value = f2Var2.getValue();
                    } while (!f2Var2.f(value, d41.d.a((d41.d) value, null, true, 1)));
                    c14.S(c14.f16647i + 1);
                }
            } else if (!bVar2.equals(b.C0596b.f16636a)) {
                ma.e.o();
                return null;
            } else {
                cd.b.u(confirmMapAndZoningOnboardingActivity, false);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e.class, "trackScreen", "trackScreen()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e) this.receiver).T();
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
        public final /* synthetic */ Function1 f16629f;

        public e(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f16629f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f16629f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16630f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.g gVar) {
            super(0);
            this.f16630f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16630f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16631f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16632g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, f.g gVar) {
            super(0);
            this.f16631f = aVar;
            this.f16632g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16631f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16632g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e c1() {
        return (com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.e) this.f16626n.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "ConfirmMapAndZoningOnboardingActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID", "EXTRA_MAP_ID_KEY");
        Intent intent2 = getIntent();
        intent2.getClass();
        Bundle I = cd.b.I(intent2);
        this.f16627o = o0.y("COORDINATOR_ID", I);
        this.f16628p = o0.y("EXTRA_MAP_ID_KEY", I);
        z.a aVar = z.f42723r;
        String str = this.f16627o;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        z a14 = z.a.a(str);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16624l = a14;
        av0.d dVar = a14.f42732o.f42663a;
        this.f16622j = (e.a) dVar.O3.f88315a;
        this.f16623k = dVar.B.get();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        g.f.a(this, new c4.c(-796725113, true, new aa.g(this, 12)));
        g0.r(n.o(this), null, null, new com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.a(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/ConfirmMapAndZoningOnboardingActivity$a;", "", "<init>", "()V", "", "EXTRA_MAP_ID_KEY", "Ljava/lang/String;", "EXTRA_ONBOARDING_TYPE", "TAG_CONFIRM_MAP_AND_ZONING_ONBOARDING", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
