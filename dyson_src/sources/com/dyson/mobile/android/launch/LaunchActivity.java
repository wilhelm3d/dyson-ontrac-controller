package com.dyson.mobile.android.launch;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import bh1.f;
import com.dyson.mobile.android.DysonApplication;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.applink.AppLinkIntent;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.http.HttpRequestError;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.termsandprivacy.TermsOfUseAndPrivacyActivity;
import dz1.x;
import f80.t1;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import m7.d;
import nz1.g;
import nz1.o;
import org.bouncycastle.asn1.BERTags;
import pf0.c;
import q5.d0;
import qh.j;
import sz1.i;
import sz1.k;
import sz1.z;
import uj.h;
import v32.w;
import x12.r;
import xd0.d;
import xd0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/launch/LaunchActivity;", "Ll/b;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LaunchActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14721m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public e f14722j;

    /* renamed from: k  reason: collision with root package name */
    public c f14723k;

    /* renamed from: l  reason: collision with root package name */
    public final b f14724l = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/launch/LaunchActivity$b", "Lxd0/d;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements d {
        public b() {
        }

        @Override // xd0.d
        public final void a(Intent intent) {
            com.dyson.mobile.android.b.A.getClass();
            b.a.a();
            LaunchActivity launchActivity = LaunchActivity.this;
            launchActivity.getClass();
            h.f82161a.getClass();
            AtomicReference<AppLinkIntent> atomicReference = h.f82162b;
            atomicReference.set(null);
            AppLinkIntent appLinkIntent = intent != null ? (AppLinkIntent) c7.c.b(intent, "DEEP_LINK_INTENT", AppLinkIntent.class) : null;
            if (appLinkIntent != null) {
                atomicReference.set(appLinkIntent);
            }
            TermsOfUseAndPrivacyActivity.f16930n.getClass();
            Intent intent2 = new Intent(launchActivity, TermsOfUseAndPrivacyActivity.class);
            intent2.addFlags(268468224);
            launchActivity.startActivity(intent2);
        }

        @Override // xd0.d
        public final void b(Intent intent) {
            dz1.b bVar;
            com.dyson.mobile.android.b.A.getClass();
            com.dyson.mobile.android.b a13 = b.a.a();
            LaunchActivity launchActivity = LaunchActivity.this;
            launchActivity.getClass();
            vy1.a<ph.h> aVar = a13.f12807i;
            if (aVar == null) {
                r.i("migrateAuthTokenManager");
                throw null;
            }
            j jVar = aVar.get().f64113a;
            String a14 = jVar.f66856c.a();
            if (a14 == null || !w.q(a14, "Basic", false)) {
                bVar = nz1.j.d;
                bVar.getClass();
            } else {
                Object value = jVar.f66863l.getValue();
                value.getClass();
                x<si.c> a15 = ((vh.b) value).a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                z s13 = a15.s(30L, timeUnit);
                qh.h hVar = new qh.h(new po.c(jVar, 17), 5);
                b.a aVar2 = kz1.b.f50218a;
                i iVar = new i(new k(s13, hVar), new qh.h(new d0(17), 6));
                f.b a16 = f.a(HttpRequestError.class, TimeoutException.class);
                a16.c(2);
                a16.b(30L, timeUnit);
                bVar = new o(iVar.m(a16.a())).g(new g(new ap1.w(jVar, 16)));
            }
            bVar.z(c02.a.f10004c).v();
            a13.c().get().a();
            a13.e().get().getClass();
            ph.f.b(launchActivity, 268468224, true, intent, intent != null ? intent.getAction() : null, null, BERTags.FLAGS);
        }

        @Override // xd0.d
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void c(LocalisationKey localisationKey, LocalisationKey localisationKey2) {
            localisationKey.getClass();
            localisationKey2.getClass();
            LaunchActivity launchActivity = LaunchActivity.this;
            zs0.e eVar = new zs0.e(launchActivity);
            c cVar = launchActivity.f14723k;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            String d = cVar.d(localisationKey);
            c cVar2 = launchActivity.f14723k;
            if (cVar2 != null) {
                eVar.c(d, cVar2.d(localisationKey2), false, new vx0.f(launchActivity, 3));
            } else {
                r.i("localisationManager");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e80.b bVar = (e80.b) pa.c.d(com.dyson.mobile.android.b.A);
        t1 t1Var = bVar.f26212b;
        DysonApplication dysonApplication = bVar.e.get();
        bVar.f26210a.getClass();
        te1.a aVar = te1.a.f79277a;
        xy1.h.b(aVar);
        t1Var.getClass();
        xd0.a aVar2 = new xd0.a(dysonApplication.getResources(), dysonApplication.getPackageName(), dysonApplication.getPackageManager());
        this.f14722j = new e(new xd0.b(dysonApplication), bVar.f26243t.get(), aVar2, aVar);
        this.f14723k = bVar.e();
        bVar.N.get();
        m7.d.f53195b.getClass();
        d.b bVar2 = new m7.d(this, null).f53196a;
        bVar2.a();
        super.onCreate(bundle);
        bVar2.b(new x1.i(13));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        e eVar = this.f14722j;
        if (eVar == null) {
            r.i("launchViewModel");
            throw null;
        }
        eVar.f87402f.setValue(eVar, e.f87401j[0], this.f14724l);
        e eVar2 = this.f14722j;
        if (eVar2 == null) {
            r.i("launchViewModel");
            throw null;
        }
        eVar2.f87403g = getIntent();
        Lifecycle lifecycle = getLifecycle();
        e eVar3 = this.f14722j;
        if (eVar3 != null) {
            lifecycle.a(eVar3);
        } else {
            r.i("launchViewModel");
            throw null;
        }
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle lifecycle = getLifecycle();
        e eVar = this.f14722j;
        if (eVar != null) {
            lifecycle.c(eVar);
        } else {
            r.i("launchViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/launch/LaunchActivity$a;", "", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
