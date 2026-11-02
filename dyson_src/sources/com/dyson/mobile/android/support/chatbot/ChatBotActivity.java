package com.dyson.mobile.android.support.chatbot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.support.chatbot.ChatBotActivity;
import com.dyson.mobile.android.support.chatbot.e;
import e71.n;
import ef1.h;
import f.g;
import f.j;
import f.x;
import g.f;
import gl.k;
import go1.o2;
import go1.q;
import h12.m;
import h12.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import rf0.i0;
import x12.p0;
import x12.r;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/ChatBotActivity;", "Lf/g;", "<init>", "()V", "b", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChatBotActivity extends g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f16775o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public h f16776j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f16777k = new d0(p0.f86717a.b(com.dyson.mobile.android.support.chatbot.e.class), new d(this), new w12.a(this) { // from class: h71.f
        public final /* synthetic */ ChatBotActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            ChatBotActivity chatBotActivity = this.e;
            switch (i13) {
                case 0:
                    ef1.h hVar = chatBotActivity.f16776j;
                    if (hVar != null) {
                        return hVar;
                    }
                    r.i("viewModelFactory");
                    throw null;
                case 1:
                    ChatBotActivity.a aVar = ChatBotActivity.f16775o;
                    return chatBotActivity.Y0(e.EnumC0606e.ERROR);
                default:
                    ChatBotActivity.a aVar2 = ChatBotActivity.f16775o;
                    return chatBotActivity.Y0(e.EnumC0606e.END_SESSION);
            }
        }
    }, new e(null, this));

    /* renamed from: l  reason: collision with root package name */
    public final t f16778l = m.b(new w12.a(this) { // from class: h71.f
        public final /* synthetic */ ChatBotActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            ChatBotActivity chatBotActivity = this.e;
            switch (i13) {
                case 0:
                    ef1.h hVar = chatBotActivity.f16776j;
                    if (hVar != null) {
                        return hVar;
                    }
                    r.i("viewModelFactory");
                    throw null;
                case 1:
                    ChatBotActivity.a aVar = ChatBotActivity.f16775o;
                    return chatBotActivity.Y0(e.EnumC0606e.ERROR);
                default:
                    ChatBotActivity.a aVar2 = ChatBotActivity.f16775o;
                    return chatBotActivity.Y0(e.EnumC0606e.END_SESSION);
            }
        }
    });

    /* renamed from: m  reason: collision with root package name */
    public final t f16779m = m.b(new w12.a(this) { // from class: h71.f
        public final /* synthetic */ ChatBotActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            ChatBotActivity chatBotActivity = this.e;
            switch (i13) {
                case 0:
                    ef1.h hVar = chatBotActivity.f16776j;
                    if (hVar != null) {
                        return hVar;
                    }
                    r.i("viewModelFactory");
                    throw null;
                case 1:
                    ChatBotActivity.a aVar = ChatBotActivity.f16775o;
                    return chatBotActivity.Y0(e.EnumC0606e.ERROR);
                default:
                    ChatBotActivity.a aVar2 = ChatBotActivity.f16775o;
                    return chatBotActivity.Y0(e.EnumC0606e.END_SESSION);
            }
        }
    });

    /* renamed from: n  reason: collision with root package name */
    public final ActivityResultLauncher<String> f16780n = registerForActivityResult(new b(), new gw0.b(this, 15));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/ChatBotActivity$b;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/content/Intent;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends ActivityResultContract<String, Intent> {

        /* renamed from: a  reason: collision with root package name */
        public String f16781a = "";

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, String str) {
            String str2 = str;
            context.getClass();
            str2.getClass();
            this.f16781a = str2;
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("text/html");
            intent.putExtra("android.intent.extra.TITLE", "transcript.html");
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent c(int i13, Intent intent) {
            if (i13 == -1 && intent != null) {
                return intent.putExtra("transcriptUrl", this.f16781a);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements p, x12.m {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof x12.m)) {
                return r.c(d(), ((x12.m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f16782f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f16782f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16782f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16783f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f16784g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, g gVar) {
            super(0);
            this.f16783f = aVar;
            this.f16784g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16783f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16784g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final androidx.appcompat.app.d Y0(e.EnumC0606e enumC0606e) {
        e.d dVar;
        com.dyson.mobile.android.support.chatbot.e eVar = (com.dyson.mobile.android.support.chatbot.e) this.f16777k.getValue();
        pf0.c cVar = eVar.e;
        enumC0606e.getClass();
        int i13 = e.f.f16809b[enumC0606e.ordinal()];
        if (i13 == 1) {
            dVar = new e.d(cVar.d(i0.Ra), cVar.d(i0.Sa), new String(), cVar.d(i0.f71719k9), new h71.m(eVar, 1));
        } else if (i13 != 2) {
            ma.e.o();
            return null;
        } else {
            dVar = new e.d(cVar.d(i0.Xa), cVar.d(i0.Ta), cVar.d(i0.Q8), cVar.d(i0.P8), new h71.m(eVar, 2));
        }
        e.a a13 = new zs0.e(this).a();
        a13.f93107a = dVar.f16805a;
        a13.f93108b = dVar.f16806b;
        a13.b(dVar.f16807c, null);
        a13.c(dVar.d, new a20.a(dVar, 12));
        a13.f93110f = false;
        androidx.appcompat.app.d a14 = a13.a();
        a14.getClass();
        return a14;
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(-16777216));
        super.onCreate(bundle);
        n.f26183r.getClass();
        h71.n nVar = ((q71.b) n.a.b()).L;
        q.a(com.dyson.mobile.android.support.chatbot.e.class, nVar);
        this.f16776j = new h(o2.j(1, new Object[]{com.dyson.mobile.android.support.chatbot.e.class, nVar}, null));
        f.a(this, new c4.c(-557781491, true, new h71.g(this, 0)));
        ((com.dyson.mobile.android.support.chatbot.e) this.f16777k.getValue()).f16796i.observe(this, new c(new k(this, 10)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/ChatBotActivity$a;", "", "<init>", "()V", "", "SCREEN_IDENTIFIER", "Ljava/lang/String;", "TRANSCRIPT_URL", "TRANSCRIPT_FILE_NAME", "TEXT_HTML", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
