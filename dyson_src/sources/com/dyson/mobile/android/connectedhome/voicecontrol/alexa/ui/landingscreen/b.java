package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen;

import android.net.Uri;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.ViewModelProvider;
import c00.d;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.logging.Logger;
import com.paypal.android.platform.authsdk.BR;
import f00.e;
import h12.f0;
import h12.r;
import hj.e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.i;
import nj.hc;
import nj.mc;
import nj.oc;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0013\u0014B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/b;", "Lm9/u;", "Lm9/c;", "Lc00/d;", "voiceControlTaskFactory", "Lqf1/b;", "installedAppChecker", "Lf00/e;", "alexaRedirectUriProvider", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Lxz/a;", "alexaMarkets", "Ltj/a;", "marketManager", "<init>", "(Lc00/d;Lqf1/b;Lf00/e;Lhj/e;Lpf0/c;Lxz/a;Ltj/a;)V", "b", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u implements m9.c {
    public final d d;
    public final qf1.b e;

    /* renamed from: f  reason: collision with root package name */
    public final e f13081f;

    /* renamed from: g  reason: collision with root package name */
    public final hj.e f13082g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13083h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13084i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableBoolean f13085j;

    /* renamed from: k  reason: collision with root package name */
    public final xf1.a<Uri> f13086k;

    /* renamed from: l  reason: collision with root package name */
    public final xf1.a<Uri> f13087l;

    /* renamed from: m  reason: collision with root package name */
    public final xf1.a<AlexaError> f13088m;

    /* renamed from: n  reason: collision with root package name */
    public final ObservableBoolean f13089n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableBoolean f13090o;

    /* renamed from: p  reason: collision with root package name */
    public final ObservableInt f13091p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableInt f13092q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableInt f13093r;

    /* renamed from: s  reason: collision with root package name */
    public final ObservableInt f13094s;

    /* renamed from: t  reason: collision with root package name */
    public final ObservableBoolean f13095t;

    /* renamed from: u  reason: collision with root package name */
    public final xf1.a<f0> f13096u;

    /* renamed from: v  reason: collision with root package name */
    public final xf1.a<AlexaError> f13097v;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/b$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lc00/d;", "voiceControlTaskFactory", "Lqf1/b;", "installedAppChecker", "Lf00/e;", "alexaRedirectUriProvider", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Lxz/a;", "alexaMarkets", "Ltj/a;", "marketManager", "<init>", "(Lc00/d;Lqf1/b;Lf00/e;Lhj/e;Lpf0/c;Lxz/a;Ltj/a;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0388b implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final d f13098a;

        /* renamed from: b  reason: collision with root package name */
        public final qf1.b f13099b;

        /* renamed from: c  reason: collision with root package name */
        public final e f13100c;
        public final hj.e d;
        public final pf0.c e;

        /* renamed from: f  reason: collision with root package name */
        public final xz.a f13101f;

        /* renamed from: g  reason: collision with root package name */
        public final tj.a f13102g;

        public C0388b(d dVar, qf1.b bVar, e eVar, hj.e eVar2, pf0.c cVar, xz.a aVar, tj.a aVar2) {
            dVar.getClass();
            bVar.getClass();
            eVar.getClass();
            eVar2.getClass();
            cVar.getClass();
            aVar.getClass();
            aVar2.getClass();
            this.f13098a = dVar;
            this.f13099b = bVar;
            this.f13100c = eVar;
            this.d = eVar2;
            this.e = cVar;
            this.f13101f = aVar;
            this.f13102g = aVar2;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new b(this.f13098a, this.f13099b, this.f13100c, this.d, this.e, this.f13101f, this.f13102g);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.AlexaLandingScreenViewModel$checkAlexaLinkStatus$1", f = "AlexaLandingScreenViewModel.kt", l = {BR.scaleTitle}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

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
            b bVar = b.this;
            try {
                if (i13 == 0) {
                    r.b(obj);
                    d dVar = bVar.d;
                    this.d = 1;
                    obj = dVar.f10001a.c(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    r.b(obj);
                }
                bVar.f13090o.m(((a00.c) obj).a());
                bVar.f13089n.m(false);
                b.S(bVar);
            } catch (CancellationException e) {
                bVar.f13089n.m(false);
                bVar.f13095t.m(true);
                throw e;
            } catch (Exception e13) {
                bVar.f13089n.m(false);
                bVar.f13095t.m(true);
                Logger.b("Failed to get Alexa link status", e13);
            }
            return f0.f36844a;
        }
    }

    static {
        new a(null);
    }

    public b(d dVar, qf1.b bVar, e eVar, hj.e eVar2, pf0.c cVar, xz.a aVar, tj.a aVar2) {
        dVar.getClass();
        bVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        cVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.d = dVar;
        this.e = bVar;
        this.f13081f = eVar;
        this.f13082g = eVar2;
        this.f13083h = cVar.c(R.string.voiceControl_alexa_title);
        boolean contains = aVar.f88327a.contains(aVar2.c());
        this.f13084i = contains;
        this.f13085j = new ObservableBoolean(false);
        this.f13086k = new xf1.a<>();
        this.f13087l = new xf1.a<>();
        this.f13088m = new xf1.a<>();
        ObservableBoolean observableBoolean = new ObservableBoolean(false);
        this.f13089n = observableBoolean;
        this.f13090o = new ObservableBoolean(false);
        ObservableInt observableInt = new ObservableInt();
        this.f13091p = observableInt;
        ObservableInt observableInt2 = new ObservableInt();
        this.f13092q = observableInt2;
        ObservableInt observableInt3 = new ObservableInt();
        this.f13093r = observableInt3;
        ObservableInt observableInt4 = new ObservableInt();
        this.f13094s = observableInt4;
        this.f13095t = new ObservableBoolean(false);
        this.f13096u = new xf1.a<>();
        this.f13097v = new xf1.a<>();
        observableInt3.l(R.string.networkConnectionError_problem);
        observableInt4.l(R.string.button_retry);
        if (contains) {
            observableBoolean.m(true);
            observableInt.l(R.string.voiceControl_alexa_linkDescription);
            T();
        } else {
            int i13 = oc.f57634a;
            eVar2.h(new ij.b("voice_control.alexa.unsupported", null, 2, null), null);
            observableInt.l(R.string.voiceControl_alexa_skillNotAvailable);
        }
        observableInt2.l(R.string.voiceControl_alexa_linkButton);
    }

    public static final void S(b bVar) {
        ObservableInt observableInt = bVar.f13092q;
        ObservableInt observableInt2 = bVar.f13091p;
        boolean z13 = bVar.f13090o.d;
        hj.e eVar = bVar.f13082g;
        if (z13) {
            int i13 = mc.f57601a;
            ij.b bVar2 = new ij.b("voice_control.alexa.unlink", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar2, null);
            observableInt2.l(R.string.voiceControl_alexa_unlinkDescription);
            observableInt.l(R.string.voiceControl_alexa_unlinkButton);
            return;
        }
        int i14 = hc.f57517a;
        ij.b bVar3 = new ij.b("voice_control.alexa.landing", null, 2, null);
        e.a aVar2 = hj.e.f38312g;
        eVar.h(bVar3, null);
        observableInt2.l(R.string.voiceControl_alexa_linkDescription);
        observableInt.l(R.string.voiceControl_alexa_linkButton);
    }

    public final void T() {
        this.f13089n.m(true);
        this.f13095t.m(false);
        g0.r(v.a(this), null, null, new c(null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/b$a;", "", "<init>", "()V", "", "ALEXA_PACKAGE_NAME", "Ljava/lang/String;", "", "ALEXA_REQUIRED_MINIMUM_VERSION_CODE", "J", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
