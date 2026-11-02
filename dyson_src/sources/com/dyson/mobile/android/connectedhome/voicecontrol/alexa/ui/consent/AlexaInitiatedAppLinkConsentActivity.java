package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e;
import f.x;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz.a;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/AlexaInitiatedAppLinkConsentActivity;", "Lf/g;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b;", "viewState", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlexaInitiatedAppLinkConsentActivity extends f.g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f13008l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public e.a f13009j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f13010k = new d0(p0.f86717a.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e.class), new f(this), new e(d.d, this, new d00.b(this, 0)), new g(null, this));

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13011a;

        static {
            int[] iArr = new int[d00.j.values().length];
            try {
                iArr[d00.j.AUTHORIZATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d00.j.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13011a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/a;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/a;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.AlexaInitiatedAppLinkConsentActivity$onCreate$1$1$1$1", f = "AlexaInitiatedAppLinkConsentActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a aVar, l12.d<? super f0> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a aVar = (com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a) this.d;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = aVar instanceof a.C0382a;
            AlexaInitiatedAppLinkConsentActivity alexaInitiatedAppLinkConsentActivity = AlexaInitiatedAppLinkConsentActivity.this;
            if (z13) {
                String str = ((a.C0382a) aVar).f13016a;
                a aVar3 = AlexaInitiatedAppLinkConsentActivity.f13008l;
                alexaInitiatedAppLinkConsentActivity.getClass();
                alexaInitiatedAppLinkConsentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                alexaInitiatedAppLinkConsentActivity.finish();
            } else if (!(aVar instanceof a.b)) {
                ma.e.o();
                return null;
            } else {
                cd.b.E(Uri.parse(((a.b) aVar).f13017a), alexaInitiatedAppLinkConsentActivity);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements w12.a<Bundle> {
        public static final d d = new d();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13012f;

        public e(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f13012f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f13012f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f13013f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.g gVar) {
            super(0);
            this.f13013f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13013f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13014f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f13015g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, f.g gVar) {
            super(0);
            this.f13014f = aVar;
            this.f13015g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13014f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13015g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e Y0() {
        return (com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e) this.f13010k.getValue();
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kz.a.f50192c.getClass();
        this.f13009j = (e.a) a.C1547a.a(this).f50194b.f55392p.f88315a;
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(-1259500633, true, new d00.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/AlexaInitiatedAppLinkConsentActivity$a;", "", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
