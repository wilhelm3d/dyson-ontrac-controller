package com.dyson.mobile.android.support.wifi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.f2;
import cl1.r;
import com.dyson.mobile.android.support.wifi.b;
import com.dyson.mobile.android.support.wifi.d;
import com.dyson.mobile.android.support.wifi.g;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import dm1.w;
import dm1.x;
import e71.n;
import h12.f0;
import h12.r;
import i3.n;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import n12.i;
import r71.l;
import sm1.k0;
import x12.p;
import x12.p0;
import x12.t;
import z32.g0;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/WifiCompatibilityCheckActivity;", "Ll/b;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/support/wifi/g;", "viewState", "", "permissionsGranted", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifiCompatibilityCheckActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f16897m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public d.b f16898j;

    /* renamed from: k  reason: collision with root package name */
    public nf1.b f16899k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f16900l = new d0(p0.f86717a.b(com.dyson.mobile.android.support.wifi.d.class), new g(this), new f(e.d, this, new c91.c(this, 0)), new h(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/b;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/support/wifi/b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.wifi.WifiCompatibilityCheckActivity$onCreate$1$1$2$1", f = "WifiCompatibilityCheckActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class b extends i implements Function2<com.dyson.mobile.android.support.wifi.b, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ os0.f<String[], Map<String, Boolean>> e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ WifiCompatibilityCheckActivity f16901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(os0.f<String[], Map<String, Boolean>> fVar, WifiCompatibilityCheckActivity wifiCompatibilityCheckActivity, l12.d<? super b> dVar) {
            super(2, dVar);
            this.e = fVar;
            this.f16901f = wifiCompatibilityCheckActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(this.e, this.f16901f, dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.support.wifi.b bVar, l12.d<? super f0> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.support.wifi.b bVar = (com.dyson.mobile.android.support.wifi.b) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (x12.r.c(bVar, b.a.f16910a)) {
                this.e.a();
            } else if (!x12.r.c(bVar, b.C0615b.f16911a)) {
                ma.e.o();
                return null;
            } else {
                WifiCompatibilityCheckActivity wifiCompatibilityCheckActivity = this.f16901f;
                nf1.b bVar2 = wifiCompatibilityCheckActivity.f16899k;
                if (bVar2 == null) {
                    x12.r.i("locationServicesHelper");
                    throw null;
                } else if (bVar2.f57228c.a()) {
                    LocationRequest.a aVar2 = new LocationRequest.a((long) NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION);
                    n.H(104);
                    aVar2.f19374a = 104;
                    aVar2.f19376c = 5000L;
                    LocationRequest a13 = aVar2.a();
                    ArrayList arrayList = new LocationSettingsRequest.a().f19387a;
                    arrayList.add(a13);
                    LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, false, false);
                    int i13 = lm1.e.f52386a;
                    w wVar = new w((Activity) wifiCompatibilityCheckActivity);
                    r.a a14 = cl1.r.a();
                    a14.f11679a = new x(locationSettingsRequest);
                    a14.d = 2426;
                    k0 h13 = wVar.h(0, a14.a());
                    h13.getClass();
                    h13.e(new nf1.a(wifiCompatibilityCheckActivity, 0));
                } else {
                    Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addFlags(268435456);
                    wifiCompatibilityCheckActivity.startActivity(intent);
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, com.dyson.mobile.android.support.wifi.d.class, "dismissAlert", "dismissAlert()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            Object value;
            f2 f2Var = ((com.dyson.mobile.android.support.wifi.d) this.receiver).f16916j;
            do {
                value = f2Var.getValue();
                com.dyson.mobile.android.support.wifi.g gVar = (com.dyson.mobile.android.support.wifi.g) value;
            } while (!f2Var.f(value, new g.b(false, false, 2, null)));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends p implements Function1<Boolean, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.support.wifi.d.class, "startCheck", "startCheck(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            com.dyson.mobile.android.support.wifi.d dVar = (com.dyson.mobile.android.support.wifi.d) this.receiver;
            dVar.getClass();
            g0.r(v.a(dVar), null, null, new com.dyson.mobile.android.support.wifi.e(dVar, booleanValue, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements w12.a<Bundle> {
        public static final e d = new e();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f16902f;

        public f(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f16902f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f16902f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16903f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f.g gVar) {
            super(0);
            this.f16903f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16903f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16904f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16905g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, f.g gVar) {
            super(0);
            this.f16904f = aVar;
            this.f16905g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16904f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16905g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.support.wifi.d c1() {
        return (com.dyson.mobile.android.support.wifi.d) this.f16900l.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e71.n.f26183r.getClass();
        q71.b bVar = (q71.b) n.a.b();
        this.f16898j = (d.b) bVar.K.f88315a;
        l lVar = bVar.f66200a;
        Context context = bVar.d.get();
        Context context2 = bVar.d.get();
        lVar.getClass();
        context2.getClass();
        Object systemService = context2.getSystemService("location");
        systemService.getClass();
        Context context3 = bVar.d.get();
        context3.getClass();
        se1.w wVar = new se1.w(context3);
        context.getClass();
        this.f16899k = new nf1.b(context, (LocationManager) systemService, wVar);
        super.onCreate(bundle);
        g.f.a(this, new c4.c(424068495, true, new c91.d(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/WifiCompatibilityCheckActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL_EXTRA", "Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
