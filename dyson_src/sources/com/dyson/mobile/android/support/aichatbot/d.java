package com.dyson.mobile.android.support.aichatbot;

import b42.m;
import c42.f2;
import c42.g2;
import c42.r1;
import com.dyson.mobile.android.support.aichatbot.g;
import com.paypal.android.platform.authsdk.BR;
import f71.h;
import h12.f0;
import h12.r;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.i;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.m1;
import z32.z;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011BM\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/d;", "Lm9/u;", "", "machineSerial", "faultCode", "compatibility", "Lf71/c;", "aiChatBotRepository", "Lhj/e;", "trackingManager", "Lh80/c;", "dynamicContentDeeplinkParser", "Lf71/h;", "aiChatBotInAppEventProvider", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf71/c;Lhj/e;Lh80/c;Lf71/h;)V", "a", "b", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f16759p = 0;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16760f;

    /* renamed from: g  reason: collision with root package name */
    public final f71.c f16761g;

    /* renamed from: h  reason: collision with root package name */
    public final hj.e f16762h;

    /* renamed from: i  reason: collision with root package name */
    public final h80.c f16763i;

    /* renamed from: j  reason: collision with root package name */
    public final h f16764j;

    /* renamed from: k  reason: collision with root package name */
    public final f2 f16765k;

    /* renamed from: l  reason: collision with root package name */
    public final r1 f16766l;

    /* renamed from: m  reason: collision with root package name */
    public final b42.c f16767m;

    /* renamed from: n  reason: collision with root package name */
    public final c42.e f16768n;

    /* renamed from: o  reason: collision with root package name */
    public d2 f16769o;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        d a(String str, String str2, String str3);
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/support/aichatbot/d$c", "Ll12/a;", "Lz32/z;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends l12.a implements z {
        public final /* synthetic */ d e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z.a aVar, d dVar) {
            super(aVar);
            this.e = dVar;
        }

        @Override // z32.z
        public final void i(Throwable th2, l12.f fVar) {
            Object value;
            v80.c.i("Failed to fetch AI chatbot url : ", th2, null);
            d dVar = this.e;
            f2 f2Var = dVar.f16765k;
            do {
                value = f2Var.getValue();
                g gVar = (g) value;
            } while (!f2Var.f(value, g.a.f16772a));
            hj.e eVar = dVar.f16762h;
            int i13 = nj.b.f57408a;
            ij.b bVar = new ij.b("common.ai_assistant.error", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.aichatbot.AiChatBotViewModel$getAiChatBotRedirectUrl$3", f = "AiChatBotViewModel.kt", l = {BR.range}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.support.aichatbot.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0601d extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public C0601d(l12.d<? super C0601d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0601d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0601d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            d dVar = d.this;
            if (i13 == 0) {
                r.b(obj);
                f71.c cVar = dVar.f16761g;
                String str = dVar.d;
                String str2 = dVar.e;
                String str3 = dVar.f16760f;
                this.d = 1;
                obj = g0.v(cVar.f30084c.c(), new f71.d(cVar, str, str2, str3, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            String str4 = (String) obj;
            f2 f2Var = dVar.f16765k;
            do {
                value = f2Var.getValue();
                g gVar = (g) value;
            } while (!f2Var.f(value, new g.c(str4)));
            hj.e eVar = dVar.f16762h;
            int i14 = nj.a.f57392a;
            ij.b bVar = new ij.b("common.ai_assistant.chatbot", null, 2, null);
            e.a aVar2 = hj.e.f38312g;
            eVar.h(bVar, null);
            return f0.f36844a;
        }
    }

    static {
        new b(null);
    }

    public d(String str, String str2, String str3, f71.c cVar, hj.e eVar, h80.c cVar2, h hVar) {
        cVar.getClass();
        eVar.getClass();
        cVar2.getClass();
        hVar.getClass();
        this.d = str;
        this.e = str2;
        this.f16760f = str3;
        this.f16761g = cVar;
        this.f16762h = eVar;
        this.f16763i = cVar2;
        this.f16764j = hVar;
        f2 a13 = g2.a(g.b.f16773a);
        this.f16765k = a13;
        this.f16766l = c42.r.d(a13);
        b42.c b13 = m.b(0, null, null, 7);
        this.f16767m = b13;
        this.f16768n = c42.r.B(b13);
        S();
    }

    public final void S() {
        f2 f2Var;
        Object value;
        d2 d2Var = this.f16769o;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        do {
            f2Var = this.f16765k;
            value = f2Var.getValue();
            g gVar = (g) value;
        } while (!f2Var.f(value, g.b.f16773a));
        this.f16769o = g0.r(v.a(this), new c(z.Z0, this), null, new C0601d(null), 2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/d$b;", "", "<init>", "()V", "", "MY_PRODUCTS_IN_APP_LINK", "Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
