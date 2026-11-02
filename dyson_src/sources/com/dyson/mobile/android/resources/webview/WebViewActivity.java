package com.dyson.mobile.android.resources.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.webview.WebViewActivity;
import d41.e;
import f.g;
import f.j;
import f.x;
import fm1.o0;
import hu0.h;
import i3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ss0.f;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import z32.g0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/resources/webview/WebViewActivity;", "Ll/b;", "<init>", "()V", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebViewActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f15911o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public f f15912j;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15914l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15915m;

    /* renamed from: k  reason: collision with root package name */
    public final hu0.d f15913k = new hu0.d();

    /* renamed from: n  reason: collision with root package name */
    public final d0 f15916n = new d0(p0.f86717a.b(h.class), new c(this), new b(this), new d(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class b extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f15917f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.f15917f = gVar;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return this.f15917f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f15918f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f15918f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f15918f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15919f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f15920g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f15919f = aVar;
            this.f15920g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15919f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f15920g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // f.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f15914l) {
            f fVar = this.f15912j;
            if (fVar == null) {
                r.i("binding");
                throw null;
            } else if (fVar.f76860h.canGoBack()) {
                this.f15913k.e();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        q8.t d13 = q8.g.d(this, R.layout.activity_web_view);
        d13.getClass();
        f fVar = (f) d13;
        this.f15912j = fVar;
        fVar.e.setOnClickListener(new View.OnClickListener(this) { // from class: hu0.f
            public final /* synthetic */ WebViewActivity e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = r2;
                WebViewActivity webViewActivity = this.e;
                switch (i13) {
                    case 0:
                        WebViewActivity.a aVar = WebViewActivity.f15911o;
                        webViewActivity.finish();
                        return;
                    default:
                        WebViewActivity.a aVar2 = WebViewActivity.f15911o;
                        webViewActivity.onBackPressed();
                        return;
                }
            }
        });
        f fVar2 = this.f15912j;
        if (fVar2 == null) {
            r.i("binding");
            throw null;
        }
        fVar2.d.setOnClickListener(new View.OnClickListener(this) { // from class: hu0.f
            public final /* synthetic */ WebViewActivity e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = r2;
                WebViewActivity webViewActivity = this.e;
                switch (i13) {
                    case 0:
                        WebViewActivity.a aVar = WebViewActivity.f15911o;
                        webViewActivity.finish();
                        return;
                    default:
                        WebViewActivity.a aVar2 = WebViewActivity.f15911o;
                        webViewActivity.onBackPressed();
                        return;
                }
            }
        });
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("KEY_URL", "KEY_OVERRIDE_URL_LOADING", "KEY_ADD_NAVIGATION_BUTTONS");
        this.f15914l = a14.getBoolean("KEY_ADD_NAVIGATION_BUTTONS");
        this.f15915m = a14.getBoolean("KEY_IS_DOWNLOAD_SUPPORTED", false);
        String y13 = o0.y("KEY_URL", a14);
        boolean z13 = a14.getBoolean("KEY_OVERRIDE_URL_LOADING");
        boolean z14 = this.f15914l;
        f fVar3 = this.f15912j;
        if (fVar3 == null) {
            r.i("binding");
            throw null;
        }
        WebSettings settings = fVar3.f76860h.getSettings();
        settings.setAllowContentAccess(true);
        settings.setDomStorageEnabled(true);
        f fVar4 = this.f15912j;
        if (fVar4 == null) {
            r.i("binding");
            throw null;
        }
        WebView webView = fVar4.f76860h;
        webView.getClass();
        f fVar5 = this.f15912j;
        if (fVar5 == null) {
            r.i("binding");
            throw null;
        }
        ProgressBar progressBar = fVar5.f76859g;
        ImageView imageView = fVar5.d;
        Boolean valueOf = Boolean.valueOf(z14);
        e eVar = new e(z13, 3);
        gl.b bVar = new gl.b(21);
        h2.o0 o0Var = new h2.o0(this, 5);
        hu0.d dVar = this.f15913k;
        hu0.e.b(dVar, webView, progressBar, imageView, valueOf, eVar, bVar, o0Var, null, null, null, 896);
        Uri parse = Uri.parse(y13);
        parse.getClass();
        dVar.c(parse);
        f fVar6 = this.f15912j;
        if (fVar6 == null) {
            r.i("binding");
            throw null;
        }
        fVar6.f76858f.setVisibility(this.f15914l ? 0 : 8);
        if (this.f15915m) {
            g0.r(n.o(this), null, null, new hu0.g(this, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/resources/webview/WebViewActivity$a;", "", "<init>", "()V", "", "KEY_URL", "Ljava/lang/String;", "KEY_OVERRIDE_URL_LOADING", "KEY_ADD_NAVIGATION_BUTTONS", "KEY_IS_DOWNLOAD_SUPPORTED", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(a aVar, Context context, String str, int i13) {
            boolean z13 = (i13 & 8) == 0;
            boolean z14 = (i13 & 16) == 0;
            aVar.getClass();
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, WebViewActivity.class);
            intent.putExtra("KEY_URL", str);
            intent.putExtra("KEY_OVERRIDE_URL_LOADING", false);
            intent.putExtra("KEY_ADD_NAVIGATION_BUTTONS", z13);
            intent.putExtra("KEY_IS_DOWNLOAD_SUPPORTED", z14);
            return intent;
        }

        private a() {
        }
    }
}
