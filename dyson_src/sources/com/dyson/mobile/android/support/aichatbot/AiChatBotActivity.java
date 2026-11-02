package com.dyson.mobile.android.support.aichatbot;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.support.aichatbot.a;
import com.dyson.mobile.android.support.aichatbot.d;
import e71.j;
import e71.n;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import n12.i;
import x12.p;
import x12.p0;
import x12.t;
import z32.g0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/AiChatBotActivity;", "Lf/g;", "<init>", "()V", "b", "Lcom/dyson/mobile/android/support/aichatbot/g;", "viewState", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AiChatBotActivity extends f.g {

    /* renamed from: l  reason: collision with root package name */
    public static final b f16749l = new b(null);

    /* renamed from: j  reason: collision with root package name */
    public d.a f16750j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f16751k = new d0(p0.f86717a.b(com.dyson.mobile.android.support.aichatbot.d.class), new g(this), new f(e.d, this, new em0.c(this, 7)), new h(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/a;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/support/aichatbot/a;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.aichatbot.AiChatBotActivity$CollectEvents$1$1", f = "AiChatBotActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class a extends i implements Function2<com.dyson.mobile.android.support.aichatbot.a, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public a(l12.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.support.aichatbot.a aVar, l12.d<? super f0> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.support.aichatbot.a aVar = (com.dyson.mobile.android.support.aichatbot.a) this.d;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = aVar instanceof a.C0600a;
            AiChatBotActivity aiChatBotActivity = AiChatBotActivity.this;
            if (z13) {
                j jVar = new j();
                kj.b bVar = ((a.C0600a) aVar).f16756a;
                jVar.e(aiChatBotActivity, bVar.f47574a, bVar.f47575b);
            } else if (!(aVar instanceof a.b)) {
                ma.e.o();
                return null;
            } else {
                aiChatBotActivity.finish();
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, com.dyson.mobile.android.support.aichatbot.d.class, "getAiChatBotRedirectUrl", "getAiChatBotRedirectUrl()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.support.aichatbot.d) this.receiver).S();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends p implements Function1<Uri, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.support.aichatbot.d.class, "onLoadRedirectUrl", "onLoadRedirectUrl(Landroid/net/Uri;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Uri uri) {
            Uri uri2 = uri;
            uri2.getClass();
            com.dyson.mobile.android.support.aichatbot.d dVar = (com.dyson.mobile.android.support.aichatbot.d) this.receiver;
            dVar.getClass();
            g0.r(v.a(dVar), null, null, new com.dyson.mobile.android.support.aichatbot.e(dVar, uri2, null), 3);
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
        public final /* synthetic */ Function1 f16752f;

        public f(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f16752f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f16752f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16753f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f.g gVar) {
            super(0);
            this.f16753f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16753f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16754f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16755g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, f.g gVar) {
            super(0);
            this.f16754f = aVar;
            this.f16755g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16754f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16755g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0(androidx.compose.runtime.Composer r8, int r9) {
        /*
            r7 = this;
            r0 = -143670142(0xfffffffff76fc482, float:-4.863065E33)
            androidx.compose.runtime.a r4 = r8.k(r0)
            boolean r8 = r4.D(r7)
            r0 = 2
            if (r8 == 0) goto L10
            r8 = 4
            goto L11
        L10:
            r8 = r0
        L11:
            r8 = r8 | r9
            r1 = r8 & 3
            r2 = 1
            if (r1 == r0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = 0
        L1a:
            r8 = r8 & r2
            boolean r8 = r4.t(r8, r0)
            if (r8 == 0) goto L55
            u3.p1 r8 = androidx.compose.runtime.b.f3172a
            androidx.lifecycle.d0 r8 = r7.f16751k
            java.lang.Object r8 = r8.getValue()
            com.dyson.mobile.android.support.aichatbot.d r8 = (com.dyson.mobile.android.support.aichatbot.d) r8
            c42.e r1 = r8.f16768n
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r8 = r4.D(r7)
            java.lang.Object r0 = r4.B()
            if (r8 != 0) goto L42
            androidx.compose.runtime.Composer$a r8 = androidx.compose.runtime.Composer.f3140a
            r8.getClass()
            androidx.compose.runtime.Composer$a$a r8 = androidx.compose.runtime.Composer.a.f3142b
            if (r0 != r8) goto L4b
        L42:
            com.dyson.mobile.android.support.aichatbot.AiChatBotActivity$a r0 = new com.dyson.mobile.android.support.aichatbot.AiChatBotActivity$a
            r8 = 0
            r0.<init>(r8)
            r4.u(r0)
        L4b:
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r5 = 48
            r6 = 0
            af1.b.a(r1, r2, r3, r4, r5, r6)
            goto L58
        L55:
            r4.J()
        L58:
            androidx.compose.runtime.f r8 = r4.c0()
            if (r8 == 0) goto L65
            f71.a r0 = new f71.a
            r0.<init>(r7, r9)
            r8.d = r0
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.aichatbot.AiChatBotActivity.Y0(androidx.compose.runtime.Composer, int):void");
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, R.anim.slide_in_right, R.anim.slide_out_left);
        } else {
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }
        n.f26183r.getClass();
        this.f16750j = (d.a) ((q71.b) n.a.b()).P.f88315a;
        g.f.a(this, new c4.c(-2026104715, true, new f71.a(this, 0, (byte) 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/AiChatBotActivity$b;", "", "<init>", "()V", "", "MACHINE_SERIAL_EXTRA", "Ljava/lang/String;", "FAULT_CODE_EXTRA", "COMPATIBILITY_EXTRA", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, String str2, String str3) {
            context.getClass();
            Intent intent = new Intent(context, AiChatBotActivity.class);
            intent.putExtra("machineSerial", str);
            intent.putExtra("faultCode", str2);
            intent.putExtra("compatibility", str3);
            return intent;
        }

        private b() {
        }
    }
}
