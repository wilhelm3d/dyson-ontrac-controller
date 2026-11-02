package com.dyson.mobile.android.account.legacy.loginsignup;

import a01.k;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import f.j;
import f.x;
import fa.c;
import i12.q;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qh.i0;
import qh.j0;
import v32.y;
import we1.a;
import x12.p0;
import x12.q0;
import x12.t;
import y9.c0;
import y9.n0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/loginsignup/LoginSignUpActivity;", "Lbt0/g;", "<init>", "()V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginSignUpActivity extends g {

    /* renamed from: n  reason: collision with root package name */
    public static final a f12141n = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public zf1.b f12142k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f12143l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f12144m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12145f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.g gVar) {
            super(0);
            this.f12145f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12145f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12146f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12147g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, f.g gVar) {
            super(0);
            this.f12146f = aVar;
            this.f12147g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12146f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12147g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12148f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f12148f = gVar;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return this.f12148f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12149f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(f.g gVar) {
            super(0);
            this.f12149f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12149f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12150f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12151g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, f.g gVar) {
            super(0);
            this.f12150f = aVar;
            this.f12151g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12150f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12151g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public LoginSignUpActivity() {
        k kVar = new k(this, 19);
        q0 q0Var = p0.f86717a;
        this.f12143l = new d0(q0Var.b(bi.b.class), new b(this), kVar, new c(null, this));
        this.f12144m = new d0(q0Var.b(qh.b.class), new e(this), new d(this), new f(null, this));
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f12142k = j0.c(this).d.a();
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        a13.a("EXTRA_USER_ENTRY_TYPE");
        d0 d0Var = this.f12144m;
        qh.b bVar = (qh.b) d0Var.getValue();
        Intent intent2 = getIntent();
        intent2.getClass();
        f12141n.getClass();
        String stringExtra = intent2.getStringExtra("EXTRA_USER_ENTRY_TYPE");
        if (stringExtra == null) {
            pa.c.p("Required value was null.");
            return;
        }
        bVar.U(i0.valueOf(stringExtra));
        rh.a aVar = (rh.a) q8.g.d(this, R.layout.activity_login_signup);
        d0 d0Var2 = this.f12143l;
        aVar.l((bi.b) d0Var2.getValue());
        DysonActionBar dysonActionBar = aVar.f73046f;
        setSupportActionBar(dysonActionBar);
        fa.c cVar = new fa.c(new c.a(q.e0(new Integer[]{Integer.valueOf((int) R.id.accountCreatedFragment), Integer.valueOf((int) R.id.otpAccountCreatedFragment)})).f30403a, null, new an0.e(this, 25), null);
        Fragment D = getSupportFragmentManager().D(R.id.nav_host_fragment);
        c0 a14 = D != null ? androidx.navigation.fragment.a.a(D) : null;
        if (a14 == null) {
            pa.c.w("Unable to find NavController");
            return;
        }
        n0 b13 = a14.d().b(R.navigation.nav_graph_main);
        b13.w(((bi.b) d0Var2.getValue()).d.e(Locale.CHINA.getCountry()) ? R.id.mobile_authentication : (((qh.b) d0Var.getValue()).T() != i0.EXISTING_USER || y.A(((qh.b) d0Var.getValue()).S())) ? R.id.email_password_capture : R.id.user_registration);
        a14.f89416b.v(b13, null);
        dysonActionBar.getClass();
        int i13 = fa.d.f30404a;
        a14.a(new fa.f(dysonActionBar, cVar));
        dysonActionBar.setNavigationOnClickListener(new bu1.d(2, a14, cVar));
        a14.a(new bi.a(0, cVar, this));
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return super.onSupportNavigateUp();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/loginsignup/LoginSignUpActivity$a;", "", "<init>", "()V", "", "EXTRA_USER_ENTRY_TYPE", "Ljava/lang/String;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
