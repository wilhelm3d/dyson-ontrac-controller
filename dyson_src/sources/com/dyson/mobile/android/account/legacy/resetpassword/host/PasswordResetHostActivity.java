package com.dyson.mobile.android.account.legacy.resetpassword.host;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.g;
import com.dyson.mobile.android.R;
import f.x;
import h12.m;
import h12.t;
import k30.j;
import kotlin.Metadata;
import ma.e;
import x12.p0;
import y9.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/host/PasswordResetHostActivity;", "Lbt0/g;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordResetHostActivity extends g {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f12255m = 0;

    /* renamed from: k  reason: collision with root package name */
    public final t f12256k = m.b(new j(this, 3));

    /* renamed from: l  reason: collision with root package name */
    public final d0 f12257l = new d0(p0.f86717a.b(ki.a.class), new c(this), new b(this), new d(null, this));

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12258a;

        static {
            int[] iArr = new int[PasswordResetType.values().length];
            try {
                iArr[PasswordResetType.FORGOTTEN_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasswordResetType.ACTIVATE_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12258a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12259f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.g gVar) {
            super(0);
            this.f12259f = gVar;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return this.f12259f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f12260f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12260f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12261f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12262g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f12261f = aVar;
            this.f12262g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12261f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12262g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        y9.b.e.getClass();
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
        int intExtra2 = intent.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
        if (intExtra == -1 && intExtra2 == -1) {
            return;
        }
        if (intExtra == -1) {
            intExtra = 0;
        }
        if (intExtra2 == -1) {
            intExtra2 = 0;
        }
        overridePendingTransition(intExtra, intExtra2);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        rh.c cVar = (rh.c) q8.g.d(this, R.layout.activity_password_reset_host);
        cVar.l((ki.a) this.f12257l.getValue());
        setSupportActionBar(cVar.e);
        Fragment D = getSupportFragmentManager().D(R.id.nav_host_fragment);
        c0 a13 = D != null ? androidx.navigation.fragment.a.a(D) : null;
        if (a13 == null) {
            pa.c.w("Unable to find NavController");
            return;
        }
        t tVar = this.f12256k;
        int i13 = a.f12258a[((com.dyson.mobile.android.account.legacy.resetpassword.host.a) tVar.getValue()).f12265b.ordinal()];
        if (i13 == 1) {
            com.dyson.mobile.android.account.legacy.resetpassword.forgottenpassword.b bVar = new com.dyson.mobile.android.account.legacy.resetpassword.forgottenpassword.b(((com.dyson.mobile.android.account.legacy.resetpassword.host.a) tVar.getValue()).f12264a);
            Bundle bundle2 = new Bundle();
            bundle2.putString("email", bVar.f12252a);
            a13.p(R.navigation.nav_graph_forgotten_password, bundle2);
        } else if (i13 != 2) {
            e.o();
            return;
        } else {
            com.dyson.mobile.android.account.legacy.resetpassword.activateaccount.a aVar = new com.dyson.mobile.android.account.legacy.resetpassword.activateaccount.a(((com.dyson.mobile.android.account.legacy.resetpassword.host.a) tVar.getValue()).f12264a);
            Bundle bundle3 = new Bundle();
            bundle3.putString("email", aVar.f12230a);
            a13.p(R.navigation.nav_graph_activate_account, bundle3);
        }
        a13.a(new jx1.a(this, 2));
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
