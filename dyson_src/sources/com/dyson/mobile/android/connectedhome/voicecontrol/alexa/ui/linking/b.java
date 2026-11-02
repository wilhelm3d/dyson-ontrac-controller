package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking;

import c00.a;
import c42.f2;
import c42.g2;
import c42.r1;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.http.HttpRequestError;
import h12.f0;
import h12.q;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l12.d;
import m9.u;
import m9.v;
import n12.e;
import n12.i;
import nj.kc;
import x12.p0;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b;", "Lm9/u;", "Lc00/d;", "voiceControlTaskFactory", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "alexaAuthArgs", "<init>", "(Lc00/d;Lhj/e;Lpf0/c;Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;)V", "b", "c", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final AlexaAuthResult.AlexaAuthArgs d;
    public final xf1.a<f0> e;

    /* renamed from: f  reason: collision with root package name */
    public final xf1.a<AlexaError> f13120f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13121g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13122h;

    /* renamed from: i  reason: collision with root package name */
    public final f2 f13123i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f13124j;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.AlexaLinkingViewModel$1", f = "AlexaLinkingViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends i implements Function2<c0, d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ c00.d e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f13125f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c00.d dVar, b bVar, d<? super a> dVar2) {
            super(2, dVar2);
            this.e = dVar;
            this.f13125f = bVar;
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new a(this.e, this.f13125f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            AlexaError.LinkError linkError;
            Object a13;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            b bVar2 = this.f13125f;
            try {
                if (i13 == 0) {
                    r.b(obj);
                    c00.d dVar = this.e;
                    int i14 = q.e;
                    AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = bVar2.d;
                    String state = alexaAuthArgs.getState();
                    String code = alexaAuthArgs.getCode();
                    String redirectUri = alexaAuthArgs.getRedirectUri();
                    this.d = 1;
                    a13 = dVar.a(state, code, redirectUri, this);
                    if (a13 == aVar) {
                        return aVar;
                    }
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    r.b(obj);
                    a13 = ((q) obj).d;
                }
                bVar = q.a(a13);
            } catch (Throwable th2) {
                int i15 = q.e;
                bVar = new q.b(th2);
            }
            Throwable b13 = q.b(bVar);
            if (b13 != null) {
                bVar2.getClass();
                if (b13 instanceof a.C0256a) {
                    String str = ((a.C0256a) b13).d;
                    String message = b13.getMessage();
                    linkError = new AlexaError.LinkError(str, message != null ? message : "");
                } else if (b13 instanceof HttpRequestError) {
                    String valueOf = String.valueOf(((HttpRequestError) b13).d);
                    String message2 = b13.getMessage();
                    linkError = new AlexaError.LinkError(valueOf, message2 != null ? message2 : "");
                } else {
                    String k13 = p0.f86717a.b(b13.getClass()).k();
                    if (k13 == null) {
                        k13 = "";
                    }
                    String message3 = b13.getMessage();
                    linkError = new AlexaError.LinkError(k13, message3 != null ? message3 : "");
                }
                bVar2.f13123i.l(null, new c.a(linkError));
                bVar2.f13120f.setValue(linkError);
            }
            if (!(bVar instanceof q.b)) {
                q qVar = (q) bVar;
                bVar2.f13123i.setValue(c.C0391b.f13127a);
                bVar2.e.setValue(null);
            }
            return f0.f36844a;
        }
    }

    @wy1.a
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0390b {
        b a(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs);
    }

    public b(c00.d dVar, hj.e eVar, pf0.c cVar, AlexaAuthResult.AlexaAuthArgs alexaAuthArgs) {
        dVar.getClass();
        eVar.getClass();
        cVar.getClass();
        alexaAuthArgs.getClass();
        this.d = alexaAuthArgs;
        this.e = new xf1.a<>();
        this.f13120f = new xf1.a<>();
        this.f13121g = cVar.c(R.string.voiceControl_alexa_title);
        this.f13122h = cVar.c(R.string.voiceControl_alexa_linkingTitle);
        f2 a13 = g2.a(null);
        this.f13123i = a13;
        this.f13124j = c42.r.d(a13);
        int i13 = kc.f57567a;
        eVar.h(new ij.b("voice_control.alexa.linking", null, 2, null), null);
        g0.r(v.a(this), null, null, new a(dVar, this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c;", "", "<init>", "()V", "b", "a", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c$b;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "error", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public final AlexaError f13126a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AlexaError alexaError) {
                super(null);
                alexaError.getClass();
                this.f13126a = alexaError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && x12.r.c(this.f13126a, ((a) obj).f13126a);
            }

            public final int hashCode() {
                return this.f13126a.hashCode();
            }

            public final String toString() {
                return "Failure(error=" + this.f13126a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/b$c;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0391b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0391b f13127a = new C0391b();

            private C0391b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0391b);
            }

            public final int hashCode() {
                return 772835742;
            }

            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
