package com.dyson.mobile.android.audio.home.customisation;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.audio.home.customisation.f;
import com.dyson.mobile.android.audio.home.customisation.g;
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
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/CustomisationActivity;", "Ll/b;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/audio/home/customisation/m;", "modelSchema", "Lcom/dyson/mobile/android/audio/home/customisation/k;", "viewState", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomisationActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12446m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public g.a f12447j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f12448k = new d0(p0.f86717a.b(g.class), new e(this), new d(c.d, this, new gl.d(this, 0)), new f(null, this));

    /* renamed from: l  reason: collision with root package name */
    public boolean f12449l;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/f;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/audio/home/customisation/f;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationActivity$onCreate$2$1$1", f = "CustomisationActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<com.dyson.mobile.android.audio.home.customisation.f, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public b(l12.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.audio.home.customisation.f fVar, l12.d<? super f0> dVar) {
            return ((b) create(fVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.audio.home.customisation.f fVar = (com.dyson.mobile.android.audio.home.customisation.f) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean c13 = x12.r.c(fVar, f.a.f12483a);
            CustomisationActivity customisationActivity = CustomisationActivity.this;
            if (c13) {
                customisationActivity.finish();
            } else if (!(fVar instanceof f.b)) {
                ma.e.o();
                return null;
            } else {
                kj.b bVar = ((f.b) fVar).f12484a;
                a aVar2 = CustomisationActivity.f12446m;
                customisationActivity.getClass();
                uf0.g a13 = uf0.g.a(customisationActivity);
                String str = bVar.f47574a;
                ExternalLinkTracking externalLinkTracking = bVar.f47575b;
                a13.getClass();
                new e71.j().e(customisationActivity, str, externalLinkTracking);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements w12.a<Bundle> {
        public static final c d = new c();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f12450f;

        public d(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f12450f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f12450f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12451f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f.g gVar) {
            super(0);
            this.f12451f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12451f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12452f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12453g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, f.g gVar) {
            super(0);
            this.f12452f = aVar;
            this.f12453g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12452f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12453g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
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
        Bundle a14 = a13.a("COORDINATOR_ID");
        String y13 = o0.y("COORDINATOR_ID", a14);
        vj.f.f84306m.getClass();
        vj.f a15 = f.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12447j = (g.a) a15.f84312l.V3.f88315a;
        this.f12449l = a14.getBoolean("OPENED_FROM_ONBOARDING", false);
        g.f.a(this, new c4.c(388274972, true, new gl.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/CustomisationActivity$a;", "", "<init>", "()V", "", "EXTRA_OPENED_FROM_ONBOARDING", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
