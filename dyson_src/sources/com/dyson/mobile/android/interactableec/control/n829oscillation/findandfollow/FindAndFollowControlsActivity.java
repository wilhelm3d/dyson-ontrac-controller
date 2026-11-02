package com.dyson.mobile.android.interactableec.control.n829oscillation.findandfollow;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.machine.onboarding.OnboardingActivity;
import com.dyson.mobile.android.machine.onboarding.navigation.OnboardingDestination;
import fm1.o0;
import h12.f0;
import ha0.h;
import ha0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj0.q;
import w90.g;
import w90.j;
import we1.a;
import x12.p;
import x12.p0;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/n829oscillation/findandfollow/FindAndFollowControlsActivity;", "Lf/g;", "<init>", "()V", "a", "Lha0/c;", "controlViewState", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FindAndFollowControlsActivity extends f.g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f14324o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14325j;

    /* renamed from: k  reason: collision with root package name */
    public hj.e f14326k;

    /* renamed from: l  reason: collision with root package name */
    public w90.g f14327l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f14328m = new d0(p0.f86717a.b(t.class), new f(this), new ha0.g(this, 0), new g(null, this));

    /* renamed from: n  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f14329n = registerForActivityResult(new j.a(), new gw0.b(this, 17));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, FindAndFollowControlsActivity.class, "handleHowToFixClicked", "handleHowToFixClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            FindAndFollowControlsActivity findAndFollowControlsActivity = (FindAndFollowControlsActivity) this.receiver;
            w90.g gVar = findAndFollowControlsActivity.f14327l;
            if (gVar != null) {
                gVar.A(findAndFollowControlsActivity, ((t) findAndFollowControlsActivity.f14328m.getValue()).d.r());
                return f0.f36844a;
            }
            r.i("coordinator");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, FindAndFollowControlsActivity.class, "handleErrorCtaClicked", "handleErrorCtaClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            FindAndFollowControlsActivity findAndFollowControlsActivity = (FindAndFollowControlsActivity) this.receiver;
            w90.g gVar = findAndFollowControlsActivity.f14327l;
            if (gVar != null) {
                gVar.C(findAndFollowControlsActivity, ((t) findAndFollowControlsActivity.f14328m.getValue()).f37916i.f15569q);
                return f0.f36844a;
            }
            r.i("coordinator");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d extends p implements w12.a<f0> {
        public d(Object obj) {
            super(0, obj, FindAndFollowControlsActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((FindAndFollowControlsActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e extends p implements w12.a<f0> {
        public e(Object obj) {
            super(0, obj, FindAndFollowControlsActivity.class, "handleInfoIconClicked", "handleInfoIconClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            FindAndFollowControlsActivity findAndFollowControlsActivity = (FindAndFollowControlsActivity) this.receiver;
            w90.g gVar = findAndFollowControlsActivity.f14327l;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            ActivityResultLauncher<Intent> activityResultLauncher = findAndFollowControlsActivity.f14329n;
            activityResultLauncher.getClass();
            OnboardingActivity.a aVar = OnboardingActivity.f15298k;
            String str = gVar.f85509i;
            OnboardingDestination.SingleChapterOnboardingScreen singleChapterOnboardingScreen = new OnboardingDestination.SingleChapterOnboardingScreen("feature_find_and_follow");
            aVar.getClass();
            activityResultLauncher.a(OnboardingActivity.a.a(findAndFollowControlsActivity, str, singleChapterOnboardingScreen));
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14330f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.g gVar) {
            super(0);
            this.f14330f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14330f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14331f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14332g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, f.g gVar) {
            super(0);
            this.f14331f = aVar;
            this.f14332g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14331f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14332g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method to create FindAndFollowActivity";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14327l = a14;
        oa0.b bVar = a14.f85510j;
        this.f14325j = bVar.a();
        this.f14326k = bVar.e.get();
        g.f.a(this, new c4.c(-495535133, true, new h(this, 0)));
        t tVar = (t) this.f14328m.getValue();
        j jVar = tVar.f37917j;
        if (jVar.f85532n.getValue(jVar, j.f85519o[9]).booleanValue() && (tVar.f37918k.f52254c.getValue() instanceof q.c)) {
            w90.g gVar = this.f14327l;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            ActivityResultLauncher<Intent> activityResultLauncher = this.f14329n;
            activityResultLauncher.getClass();
            OnboardingActivity.a aVar = OnboardingActivity.f15298k;
            String str = gVar.f85509i;
            OnboardingDestination.SingleChapterOnboardingScreen singleChapterOnboardingScreen = new OnboardingDestination.SingleChapterOnboardingScreen("feature_find_and_follow");
            aVar.getClass();
            activityResultLauncher.a(OnboardingActivity.a.a(this, str, singleChapterOnboardingScreen));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/n829oscillation/findandfollow/FindAndFollowControlsActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
