package com.dyson.mobile.android.interactableec.home.n829.settingstab.location;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a;
import com.dyson.mobile.android.interactableec.settings.ECSettingsActivity;
import com.dyson.mobile.android.interactableec.settings.SettingsDestination;
import e71.n;
import f60.w;
import fm1.o0;
import h12.f0;
import hj.e;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import mj.f;
import mj.m;
import pa0.t0;
import uf0.l;
import w90.g;
import we1.a;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import z32.g0;
import z32.z;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/N829ECSettingsLocationActivity;", "Landroidx/fragment/app/e;", "<init>", "()V", "a", "", "location", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "descriptionKey", "", "isFetchLocationInProgress", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class N829ECSettingsLocationActivity extends androidx.fragment.app.e {

    /* renamed from: r  reason: collision with root package name */
    public static final a f14541r = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public a.c f14542j;

    /* renamed from: k  reason: collision with root package name */
    public rf1.e f14543k;

    /* renamed from: l  reason: collision with root package name */
    public v60.b f14544l;

    /* renamed from: m  reason: collision with root package name */
    public hj.e f14545m;

    /* renamed from: n  reason: collision with root package name */
    public String f14546n;

    /* renamed from: o  reason: collision with root package name */
    public w90.g f14547o;

    /* renamed from: p  reason: collision with root package name */
    public final d0 f14548p = new d0(p0.f86717a.b(com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.class), new h(this), new g(f.d, this, new em0.c(this, 15)), new i(null, this));

    /* renamed from: q  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f14549q = registerForActivityResult(new j.a(), new w(this, 23));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends x12.a implements Function2<a.b, l12.d<? super f0>, Object> {
        public b(Object obj) {
            super(2, obj, N829ECSettingsLocationActivity.class, "onNavigationEvent", "onNavigationEvent(Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/N829ECSettingsLocationViewModel$Event;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a.b bVar, l12.d<? super f0> dVar) {
            a.b bVar2 = bVar;
            N829ECSettingsLocationActivity n829ECSettingsLocationActivity = (N829ECSettingsLocationActivity) this.d;
            a aVar = N829ECSettingsLocationActivity.f14541r;
            n829ECSettingsLocationActivity.getClass();
            if (r.c(bVar2, a.b.C0476a.f14573a)) {
                v60.b bVar3 = n829ECSettingsLocationActivity.f14544l;
                if (bVar3 == null) {
                    r.i("locationServicesHelper");
                    throw null;
                }
                bVar3.c(n829ECSettingsLocationActivity);
            } else if (r.c(bVar2, a.b.C0477b.f14574a)) {
                w90.g gVar = n829ECSettingsLocationActivity.f14547o;
                if (gVar == null) {
                    r.i("coordinator");
                    throw null;
                }
                n.f26183r.getClass();
                URL a13 = n.a.a().c().a();
                gVar.r(n829ECSettingsLocationActivity, (a13 == null || (r9 = a13.toString()) == null) ? "" : "", new ExternalLinkTracking("privacy_policy", m.a.MACHINE_HOME, null, null, 12, null));
            } else if (!(bVar2 instanceof a.b.c)) {
                ma.e.o();
                return null;
            } else {
                ActivityResultLauncher<Intent> activityResultLauncher = n829ECSettingsLocationActivity.f14549q;
                ECSettingsActivity.a aVar2 = ECSettingsActivity.f14623x;
                String str = n829ECSettingsLocationActivity.f14546n;
                if (str == null) {
                    r.i("coordinatorId");
                    throw null;
                }
                String str2 = n829ECSettingsLocationActivity.f14546n;
                if (str2 == null) {
                    r.i("coordinatorId");
                    throw null;
                }
                SettingsDestination.SetManualLocationScreen setManualLocationScreen = new SettingsDestination.SetManualLocationScreen(str2);
                aVar2.getClass();
                activityResultLauncher.a(ECSettingsActivity.a.a(n829ECSettingsLocationActivity, str, setManualLocationScreen, true));
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.class, "onAutofillLocationClicked", "onAutofillLocationClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a aVar = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a) this.receiver;
            hj.e eVar = aVar.f14559j;
            ij.f a13 = new mj.f(f.c.LOCATION_AUTO_FILL_CTA, f.a.BUTTON_CLICK, null, 4, null).a();
            e.a aVar2 = hj.e.f38312g;
            eVar.g(a13, null);
            g0.r(v.a(aVar), new fc0.g(z.Z0, aVar), null, new fc0.i(aVar, null), 2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d extends p implements w12.a<f0> {
        public d(Object obj) {
            super(0, obj, com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.class, "onSelectManuallyClicked", "onSelectManuallyClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a aVar = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a) this.receiver;
            hj.e eVar = aVar.f14559j;
            ij.f a13 = new mj.f(f.c.LOCATION_SELECT_MANUAL_CTA, f.a.BUTTON_CLICK, null, 4, null).a();
            e.a aVar2 = hj.e.f38312g;
            eVar.g(a13, null);
            aVar.U(new a.b.c(aVar.d));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e extends p implements w12.a<f0> {
        public e(Object obj) {
            super(0, obj, com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.class, "onHowWeUseYourLocationClicked", "onHowWeUseYourLocationClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a aVar = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a) this.receiver;
            aVar.getClass();
            aVar.U(a.b.C0477b.f14574a);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements w12.a<Bundle> {
        public static final f d = new f();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f14550f;

        public g(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f14550f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f14550f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14551f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f.g gVar) {
            super(0);
            this.f14551f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14551f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class i extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14552f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14553g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, f.g gVar) {
            super(0);
            this.f14552f = aVar;
            this.f14553g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14552f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14553g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a c1() {
        return (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a) this.f14548p.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method to create N829ECSettingsLocationActivity";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f14546n = y13;
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14547o = a14;
        oa0.b bVar = a14.f85510j;
        pa0.a aVar = bVar.f59825a;
        pa0.a aVar2 = bVar.f59825a;
        t0.b(aVar);
        this.f14542j = (a.c) bVar.S3.f88315a;
        aVar2.getClass();
        this.f14543k = new rf1.e(new se1.e());
        l lVar = bVar.f59875k1.get();
        aVar2.getClass();
        lVar.getClass();
        vy1.a<v60.b> aVar3 = lVar.f81973t;
        if (aVar3 == null) {
            r.i("lazyLocationServiceHelper");
            throw null;
        }
        v60.b bVar2 = aVar3.get();
        bVar2.getClass();
        this.f14544l = bVar2;
        this.f14545m = bVar.e.get();
        com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a c13 = c1();
        rf1.e eVar = this.f14543k;
        if (eVar == null) {
            r.i("dysonPermissionManager");
            throw null;
        }
        eVar.f73038a = new ty1.l(this);
        eVar.f73039b = this;
        c13.f14561l.setValue(c13, com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.f14554x[0], eVar);
        g.f.a(this, new c4.c(1607454384, true, new fc0.b(this, 0)));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        rf1.e eVar = this.f14543k;
        if (eVar == null) {
            r.i("dysonPermissionManager");
            throw null;
        }
        eVar.f73038a = null;
        eVar.f73039b = null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/N829ECSettingsLocationActivity$a;", "", "<init>", "()V", "", "INITIAL_LOCATION", "Ljava/lang/String;", "IS_MANUALLY_SET", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
