package com.dyson.mobile.android.getconnected;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.applink.AppLinkIntent;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.getconnected.d;
import f.g;
import f.j;
import f.x;
import h12.f0;
import h12.r;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import n12.i;
import nj.fb;
import qh.h0;
import x12.p;
import x12.p0;
import x12.t;
import z32.g0;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/getconnected/WelcomeActivity;", "Ll/b;", "<init>", "()V", "a", "Lb71/e;", "loadingSocialProvider", "Lcom/dyson/mobile/android/getconnected/b;", "alertState", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WelcomeActivity extends l.b {

    /* renamed from: p  reason: collision with root package name */
    public static final a f14097p = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public tj.a f14098j;

    /* renamed from: k  reason: collision with root package name */
    public u71.b f14099k;

    /* renamed from: l  reason: collision with root package name */
    public zf1.b f14100l;

    /* renamed from: m  reason: collision with root package name */
    public h0 f14101m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f14102n = new d0(p0.f86717a.b(f.class), new d(this), new u80.a(this, 0), new e(null, this));

    /* renamed from: o  reason: collision with root package name */
    public com.dyson.mobile.android.b f14103o;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/getconnected/d;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/getconnected/d;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.getconnected.WelcomeActivity$onCreate$1$1$1", f = "WelcomeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends i implements Function2<com.dyson.mobile.android.getconnected.d, l12.d<? super f0>, Object> {
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
        public final Object invoke(com.dyson.mobile.android.getconnected.d dVar, l12.d<? super f0> dVar2) {
            return ((b) create(dVar, dVar2)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.getconnected.d dVar = (com.dyson.mobile.android.getconnected.d) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean c13 = x12.r.c(dVar, d.a.f14114a);
            WelcomeActivity welcomeActivity = WelcomeActivity.this;
            if (c13) {
                if (welcomeActivity.f14103o == null) {
                    x12.r.i("coordinator");
                    throw null;
                }
                com.dyson.mobile.android.b.s(welcomeActivity, false);
            } else if (x12.r.c(dVar, d.b.f14115a)) {
                com.dyson.mobile.android.b bVar = welcomeActivity.f14103o;
                if (bVar == null) {
                    x12.r.i("coordinator");
                    throw null;
                }
                bVar.w(welcomeActivity);
            } else if (x12.r.c(dVar, d.c.f14116a)) {
                com.dyson.mobile.android.b bVar2 = welcomeActivity.f14103o;
                if (bVar2 == null) {
                    x12.r.i("coordinator");
                    throw null;
                }
                bVar2.x(welcomeActivity);
            } else if (!x12.r.c(dVar, d.C0455d.f14117a)) {
                ma.e.o();
                return null;
            } else {
                com.dyson.mobile.android.b bVar3 = welcomeActivity.f14103o;
                if (bVar3 == null) {
                    x12.r.i("coordinator");
                    throw null;
                }
                bVar3.A();
                bVar3.c().get().a();
                Intent a13 = com.dyson.mobile.android.b.a();
                bVar3.e().get().getClass();
                ph.f.b(welcomeActivity, 268468224, true, a13, null, null, 240);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, f.class, "trackWelcomeActivity", "trackWelcomeActivity()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            hj.e eVar = ((f) this.receiver).d;
            int i13 = fb.f57483a;
            ij.b bVar = new ij.b("user_management.common.get_connected", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar, null);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f14104f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f14104f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14104f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14105f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f14106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, g gVar) {
            super(0);
            this.f14105f = aVar;
            this.f14106g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14105f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14106g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final f c1() {
        return (f) this.f14102n.getValue();
    }

    public final void d1() {
        Uri uri;
        AppLinkIntent appLinkIntent = (AppLinkIntent) c7.c.a(getIntent(), "DEEP_LINK_INTENT", AppLinkIntent.class);
        if (appLinkIntent == null || (uri = appLinkIntent.d) == null) {
            return;
        }
        f c13 = c1();
        g0.r(v.a(c13), null, null, new u80.d(c13, uri, null), 3);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.dyson.mobile.android.b.A.getClass();
        com.dyson.mobile.android.b a13 = b.a.a();
        this.f14103o = a13;
        e80.b bVar = (e80.b) a13.f();
        this.f14098j = bVar.f26242s.get();
        this.f14099k = (u71.b) bVar.B.get();
        xy1.f b13 = xy1.f.b(3);
        b13.c(f.class, bVar.Y);
        b13.c(x61.a.class, bVar.f26215c0);
        b13.c(t61.a.class, bVar.f26216d0);
        this.f14100l = new zf1.b(b13.a());
        bVar.f26210a.getClass();
        this.f14101m = new h0(new y70.f(bVar.e.get().getApplicationContext(), "social_sign_on"));
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        d1();
        g.f.a(this, new c4.c(969310476, true, new sa0.p(this, 14)));
    }

    @Override // f.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        d1();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/getconnected/WelcomeActivity$a;", "", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
