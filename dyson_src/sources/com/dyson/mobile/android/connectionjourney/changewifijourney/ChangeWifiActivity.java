package com.dyson.mobile.android.connectionjourney.changewifijourney;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.changewifijourney.a;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import com.dyson.mobile.android.support.ui.contact.ContactDysonActivity;
import e10.b;
import f.j;
import f.x;
import f20.g;
import i12.c0;
import i20.t3;
import i20.x1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.d2;
import nj.e2;
import nj.f2;
import nj.v1;
import rf0.i0;
import se1.q0;
import v10.o;
import v10.x0;
import x12.r;
import y9.w;
import zs0.e;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiActivity;", "Ll/b;", "Le10/c;", "La20/c;", "Lm40/b;", "Lw10/c;", "Lg10/b;", "Ly10/b;", "Lj20/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChangeWifiActivity extends l.b implements e10.c, a20.c, m40.b, w10.c, g10.b, y10.b, j20.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f13383m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public g f13384j;

    /* renamed from: k  reason: collision with root package name */
    public pf0.c f13385k;

    /* renamed from: l  reason: collision with root package name */
    public x0 f13386l;

    @Override // w10.c
    public final void H() {
        d1().f82965a.e().v();
        finish();
    }

    @Override // a20.c
    public final void I() {
        b.a aVar = e10.b.e;
        h20.b bVar = h20.b.CHANGE_WIFI;
        aVar.getClass();
        e1(b.a.a(bVar), "HomeApListFragment", false);
    }

    @Override // w10.c
    public final void I0() {
        e1(m40.a.v(true, h20.b.CHANGE_WIFI), "BleHomePasswordFragment", false);
    }

    @Override // j20.b
    public final void K() {
        if (!d1().f82967c) {
            e0();
            return;
        }
        y10.a.f88603f.getClass();
        e1(new y10.a(), "PrepareToChangeWifiFragment", false);
    }

    @Override // e10.c
    public final void K0(String str) {
        str.getClass();
        int i13 = e2.f57459a;
        w.t("connection_journey.home_wifi.enter_password", null, 2, null);
        e1(m40.a.v(false, h20.b.CHANGE_WIFI), "BleHomePasswordFragment", true);
    }

    @Override // e10.c
    public final void P() {
        int i13 = f2.f57474a;
        w.t("connection_journey.home_wifi.help", null, 2, null);
        LocalisationKey localisationKey = i0.R3;
        Bundle bundle = new Bundle();
        bundle.putParcelable("description-localisation-key", localisationKey);
        g10.a aVar = new g10.a();
        aVar.setArguments(bundle);
        e1(aVar, "HomeApCantSeeFragment", true);
    }

    @Override // g10.b
    public final void V() {
        d2.a().b();
        d1().f82965a.m().n();
        getSupportFragmentManager().V();
    }

    public final pf0.c c1() {
        pf0.c cVar = this.f13385k;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final x0 d1() {
        x0 x0Var = this.f13386l;
        if (x0Var != null) {
            return x0Var;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // y10.b
    public final void e0() {
        a20.b.f227g.getClass();
        e1(new a20.b(), "RemainCloseToMachineFragment", false);
        int i13 = v1.f57742a;
        new ij.b("connection_journey.ble_authentication.steps", null, 2, null).b();
        getWindow().addFlags(128);
    }

    public final void e1(Fragment fragment, String str, boolean z13) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.i(R.id.fragment_container, fragment, str);
        if (z13) {
            aVar.e(str);
        }
        aVar.n(true, true);
    }

    public final void f1() {
        e.a a13 = new zs0.e(this).a();
        a13.f93107a = c1().d(i0.V1);
        a13.f93108b = c1().d(i0.W1);
        a13.f93110f = true;
        a13.c(c1().d(i0.P8), new a20.a(this, 26));
        a13.b(c1().d(i0.Q8), null);
        a13.a().show();
    }

    @Override // a20.c
    public final void l0() {
        com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
        a.C0413a.a().d(this, c1().d(d1().f82966b), null);
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        if (d1().f82965a.j()) {
            return;
        }
        if (getSupportFragmentManager().I() > 0) {
            List<Fragment> f13 = getSupportFragmentManager().f4299c.f();
            f13.getClass();
            if (!(c0.Y(f13) instanceof w10.b)) {
                super.onBackPressed();
                return;
            }
        }
        f1();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DysonActionBar dysonActionBar;
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
        h20.e eVar = a.C0413a.a().f13402a;
        if (eVar == null) {
            pa.c.p("Change wifi coordinator doesn't have component");
            return;
        }
        this.f13385k = x1.b(eVar.f37171a);
        t3 t3Var = eVar.f37173b;
        ng0.b bVar = eVar.Z.get();
        o oVar = eVar.W.get();
        t3Var.getClass();
        bVar.getClass();
        oVar.getClass();
        this.f13386l = new x0(bVar.d(oVar.b(), oVar.f()), oVar);
        g gVar = (g) q8.g.d(this, R.layout.activity_change_wifi);
        this.f13384j = gVar;
        if (gVar != null && (dysonActionBar = gVar.d) != null) {
            dysonActionBar.x(this);
        }
        g gVar2 = this.f13384j;
        if (gVar2 != null) {
            gVar2.l(d1());
        }
        com.dyson.mobile.android.connectionjourney.enablebluetooth.a.f13457i.getClass();
        e1(new com.dyson.mobile.android.connectionjourney.enablebluetooth.a(), com.dyson.mobile.android.connectionjourney.enablebluetooth.a.f13459k, false);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        if (d1().f82965a.j()) {
            finish();
            return false;
        }
        f1();
        return false;
    }

    @Override // m40.b
    public final void r() {
        cd.b.B(this);
        w10.b.f85146f.getClass();
        e1(new w10.b(), "ConnectingToNewWifiFragment", false);
    }

    @Override // w10.c
    public final void w0() {
        d1().f82965a.e().v();
        finish();
        com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
        a.C0413a.a();
        uf1.d.a(this).b(ContactDysonActivity.f1(this, 2132083510, false, i0.f71592c4, i0.I5, false));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiActivity$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
