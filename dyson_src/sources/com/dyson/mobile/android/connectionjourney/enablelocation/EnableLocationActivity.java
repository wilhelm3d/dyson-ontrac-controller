package com.dyson.mobile.android.connectionjourney.enablelocation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.machineprefixcheck.MachinePrefixCheckActivity;
import e22.m;
import ef1.h;
import f.g;
import f.j;
import f.x;
import f20.k;
import h12.f0;
import k20.c;
import kotlin.Metadata;
import nj.l3;
import q8.n;
import rf1.e;
import ty1.l;
import w00.i;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablelocation/EnableLocationActivity;", "Ll/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnableLocationActivity extends l.b {

    /* renamed from: j  reason: collision with root package name */
    public v60.a f13486j;

    /* renamed from: k  reason: collision with root package name */
    public h f13487k;

    /* renamed from: l  reason: collision with root package name */
    public e f13488l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f13489m = new d0(p0.f86717a.b(k20.c.class), new b(this), new ia0.a(this, 27), new c(null, this));

    /* renamed from: n  reason: collision with root package name */
    public final a f13490n = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/enablelocation/EnableLocationActivity$a", "Lk20/a;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements k20.a {
        public a() {
        }

        @Override // k20.a
        public final void a() {
            EnableLocationActivity enableLocationActivity = EnableLocationActivity.this;
            enableLocationActivity.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", enableLocationActivity.getPackageName(), null)));
        }

        @Override // k20.a
        public final void b() {
            EnableLocationActivity enableLocationActivity = EnableLocationActivity.this;
            v60.a aVar = enableLocationActivity.f13486j;
            if (aVar != null) {
                aVar.c(enableLocationActivity);
            } else {
                r.i("locationServicesHelper");
                throw null;
            }
        }

        @Override // k20.a
        public final void c(String str, String str2, w12.a<f0> aVar) {
            new zs0.e(EnableLocationActivity.this).c(str, str2, true, new fi.a(aVar, 1));
        }

        @Override // k20.a
        public final void d() {
            EnableLocationActivity enableLocationActivity = EnableLocationActivity.this;
            if (i.c(enableLocationActivity.getApplicationContext()).f85124a.f() != null) {
                enableLocationActivity.startActivity(new Intent(enableLocationActivity, MachinePrefixCheckActivity.class));
                enableLocationActivity.finish();
                return;
            }
            i.w(enableLocationActivity, null);
            enableLocationActivity.finish();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f13492f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.f13492f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13492f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13493f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f13494g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, g gVar) {
            super(0);
            this.f13493f = aVar;
            this.f13494g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13493f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13494g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        i.c(this).e(this);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.g(this);
        k kVar = (k) q8.g.d(this, R.layout.activity_enable_location);
        kVar.getClass();
        d0 d0Var = this.f13489m;
        kVar.l((k20.c) d0Var.getValue());
        kVar.f29138k.x(this);
        k20.c cVar = (k20.c) d0Var.getValue();
        tf1.a aVar = cVar.f46295q;
        tf1.a aVar2 = cVar.f46294p;
        m<?>[] mVarArr = k20.c.f46276r;
        aVar2.setValue(cVar, mVarArr[0], this.f13490n);
        e eVar = this.f13488l;
        if (eVar == null) {
            r.i("dysonPermissionManager");
            throw null;
        }
        eVar.f73038a = new l(this);
        eVar.f73039b = this;
        aVar.setValue(cVar, mVarArr[1], eVar);
        cVar.f46293o.m(cVar.f46284f);
        cVar.S(false);
        e eVar2 = (e) aVar.getValue(cVar, mVarArr[1]);
        if (eVar2 != null && eVar2.b()) {
            if (cVar.e.a()) {
                return;
            }
            cVar.V();
            return;
        }
        n<String> nVar = cVar.f46286h;
        pf0.c cVar2 = cVar.d;
        nVar.m(cVar2.d(k20.c.f46280v));
        cVar.f46287i.m(cVar2.d(k20.c.f46282x));
        cVar.f46288j.m(cVar2.d(k20.c.f46283y));
        cVar.f46285g = c.b.LOCATION_PERMISSION_ENABLE;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((k20.c) this.f13489m.getValue()).S(true);
        int i13 = l3.f57575a;
        new ij.b("connection_journey.prerequisites.location_services", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
