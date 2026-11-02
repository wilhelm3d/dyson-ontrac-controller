package com.dyson.mobile.android.interactableec.home.help.historical;

import a01.k;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import fm1.o0;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.n;
import rf0.f;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/HistoricalHelpActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HistoricalHelpActivity extends l.b {

    /* renamed from: n  reason: collision with root package name */
    public static final a f14444n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14445j;

    /* renamed from: l  reason: collision with root package name */
    public g f14447l;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f14446k = new d0(p0.f86717a.b(bb0.e.class), new d(this), new k(this, 16), new e(null, this));

    /* renamed from: m  reason: collision with root package name */
    public final c f14448m = new c();

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14449a;

        static {
            int[] iArr = new int[wa0.c.values().length];
            try {
                iArr[wa0.c.AQI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wa0.c.TEMPERATURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wa0.c.HUMIDITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wa0.c.CO2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14449a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/home/help/historical/HistoricalHelpActivity$c", "Lbb0/d;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements bb0.d {
        public c() {
        }

        @Override // bb0.d
        public final void a() {
            HistoricalHelpActivity historicalHelpActivity = HistoricalHelpActivity.this;
            if (historicalHelpActivity.f14447l == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            historicalHelpActivity.onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14451f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f14451f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14451f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14452f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14453g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f14452f = aVar;
            this.f14453g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14452f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14453g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment aVar;
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to create a HistoricalHelpActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID", "EXTRA_GRAPH_TYPE"));
        g.f85506o.getClass();
        g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14447l = a14;
        this.f14445j = a14.f85510j.a();
        String stringExtra = getIntent().getStringExtra("EXTRA_GRAPH_TYPE");
        if (stringExtra == null) {
            pa.c.p("Required value was null.");
            return;
        }
        wa0.c valueOf = wa0.c.valueOf(stringExtra);
        bb0.e eVar = (bb0.e) this.f14446k.getValue();
        eVar.e.setValue(eVar, bb0.e.f7475h[0], this.f14448m);
        valueOf.getClass();
        n<String> nVar = eVar.f7476f;
        pf0.c cVar = eVar.d;
        LocalisationKey localisationKey = f.C2;
        nVar.m(if1.g.a(cVar.d(localisationKey), cVar.d(valueOf.getLocalisationKey())));
        eVar.f7477g.m(if1.g.a(cVar.d(localisationKey), cVar.d(valueOf.getAccessibilityLocalisationKey())));
        ((na0.k) q8.g.d(this, R.layout.activity_historical_help)).l(eVar);
        g gVar = this.f14447l;
        if (gVar == null) {
            r.i("coordinator");
            throw null;
        }
        String str = gVar.f85509i;
        if (str == null) {
            pa.c.p("Required value was null.");
            return;
        }
        int i13 = b.f14449a[valueOf.ordinal()];
        if (i13 == 1) {
            com.dyson.mobile.android.interactableec.home.help.historical.a.f14454j.getClass();
            aVar = new com.dyson.mobile.android.interactableec.home.help.historical.a();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle2);
        } else if (i13 == 2) {
            com.dyson.mobile.android.interactableec.home.help.historical.e.e.getClass();
            aVar = new com.dyson.mobile.android.interactableec.home.help.historical.e();
            Bundle bundle3 = new Bundle();
            bundle3.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle3);
        } else if (i13 == 3) {
            com.dyson.mobile.android.interactableec.home.help.historical.c.e.getClass();
            aVar = new com.dyson.mobile.android.interactableec.home.help.historical.c();
            Bundle bundle4 = new Bundle();
            bundle4.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle4);
        } else if (i13 != 4) {
            com.dyson.mobile.android.interactableec.home.help.historical.d.f14474i.getClass();
            aVar = new com.dyson.mobile.android.interactableec.home.help.historical.d();
            Bundle bundle5 = new Bundle();
            bundle5.putString("COORDINATOR_ID", str);
            bundle5.putString("EXTRA_GRAPH_TYPE", valueOf.name());
            aVar.setArguments(bundle5);
        } else {
            com.dyson.mobile.android.interactableec.home.help.historical.b.f14465i.getClass();
            aVar = new com.dyson.mobile.android.interactableec.home.help.historical.b();
            Bundle bundle6 = new Bundle();
            bundle6.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle6);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        f13.g(R.id.fragment_container, aVar, null, 1);
        f13.f();
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/HistoricalHelpActivity$a;", "", "<init>", "()V", "", "EXTRA_GRAPH_TYPE", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
