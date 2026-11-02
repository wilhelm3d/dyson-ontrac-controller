package com.dyson.mobile.android.connectionjourney.bleconnection;

import a20.h;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.bleconnection.e;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import com.dyson.mobile.android.resources.view.DysonViewPager;
import d20.a;
import e10.b;
import f.j;
import f.q;
import f.x;
import f20.o;
import hj.e;
import ie0.l;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf0.m0;
import m10.n;
import m10.s1;
import m10.u1;
import nj.y1;
import rf0.i0;
import w00.i;
import we1.a;
import x12.r;
import zs0.e;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionActivity;", "Lbt0/g;", "Lm10/n;", "Ld20/b;", "Lg10/b;", "Lr40/a;", "Lr40/b;", "Le10/c;", "Lm40/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GattConnectionActivity extends g implements n, d20.b, g10.b, r40.a, r40.b, e10.c, m40.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f13273o = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public e f13274k;

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f13275l;

    /* renamed from: m  reason: collision with root package name */
    public Fragment f13276m;

    /* renamed from: n  reason: collision with root package name */
    public o f13277n;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13278a;

        static {
            int[] iArr = new int[MachineCategory.values().length];
            try {
                iArr[MachineCategory.EC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MachineCategory.ROBOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MachineCategory.LIGHTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13278a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionActivity$c", "Lf/q;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends q {
        public c() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            GattConnectionActivity gattConnectionActivity = GattConnectionActivity.this;
            Fragment fragment = gattConnectionActivity.f13276m;
            if (fragment instanceof s40.a) {
                gattConnectionActivity.h1();
            } else if ((fragment instanceof t40.d) || (fragment instanceof t40.a)) {
                GattConnectionActivity.e1(gattConnectionActivity, new u40.a(), "BleUnableToProximityPairFragment", 12);
            } else if (fragment instanceof g10.a) {
                b.a aVar = e10.b.e;
                h20.b bVar = h20.b.STANDARD;
                aVar.getClass();
                GattConnectionActivity.e1(gattConnectionActivity, b.a.a(bVar), "HomeApListFragment", 12);
            } else if (fragment instanceof m40.a) {
                b.a aVar2 = e10.b.e;
                h20.b bVar2 = h20.b.STANDARD;
                aVar2.getClass();
                GattConnectionActivity.e1(gattConnectionActivity, b.a.a(bVar2), "HomeApListFragment", 12);
            } else {
                i c13 = i.c(gattConnectionActivity);
                m10.c cVar = new m10.c(gattConnectionActivity, 1);
                c13.getClass();
                c13.f(gattConnectionActivity, i0.V1, i0.W1, cVar);
            }
        }
    }

    public static void e1(GattConnectionActivity gattConnectionActivity, Fragment fragment, String str, int i13) {
        boolean z13 = (i13 & 4) == 0;
        boolean z14 = (i13 & 8) == 0;
        FragmentManager supportFragmentManager = gattConnectionActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.i(R.id.fragment_container, fragment, str);
        if (z13) {
            aVar.e(str);
        }
        aVar.n(true, true);
        if (z14) {
            FragmentManager supportFragmentManager2 = gattConnectionActivity.getSupportFragmentManager();
            supportFragmentManager2.z(true);
            supportFragmentManager2.G();
        }
        gattConnectionActivity.f13276m = fragment;
    }

    @Override // m10.n
    public final void A() {
        g1(true);
        i.c(this).l(this);
    }

    @Override // r40.a
    public final void A0() {
        i.c(this).k(this);
    }

    @Override // m10.n
    public final void B() {
        f1().s().f22600o.l(1);
        Logger.c("Started cloud provisioning step");
    }

    @Override // r40.b
    public final void E() {
        if (d1().d.h() != MachineCategory.ORALCARE) {
            h1();
            return;
        }
        e d13 = d1();
        Logger.a("Cancelling connection journey");
        d13.n("cancel-connection-journey-action");
        i.c(this).o(this);
    }

    @Override // m10.n
    public final void F0() {
        e1(this, m40.a.v(true, h20.b.STANDARD), "BleHomePasswordFragment", 12);
    }

    @Override // m10.n
    public final void H0() {
        f1().s().f22600o.l(2);
        Logger.c("Started cloud polling step");
    }

    @Override // r40.a
    public final void J() {
        d1().n("start-manual-steps-action");
        s1 i13 = i1();
        DysonViewPager dysonViewPager = i13.f52871f;
        if (dysonViewPager != null) {
            dysonViewPager.setCurrentItem(1);
        } else {
            i13.f52873h = 1;
        }
        u1 u1Var = i13.f52874i;
        if (u1Var != null) {
            u1Var.f52879i.l(8);
        }
    }

    @Override // e10.c
    public final void K0(String str) {
        str.getClass();
        e1(this, m40.a.v(false, h20.b.STANDARD), "BleHomePasswordFragment", 12);
    }

    @Override // r40.a
    public final void M0() {
        s40.a.f75308g.getClass();
        e1(this, new s40.a(), "BleManualCodeFragment", 8);
    }

    @Override // m10.n
    public final void N() {
        if (d1().d.o()) {
            i1().t();
            return;
        }
        d20.d s13 = f1().s();
        s13.f22594i = true;
        s13.f22598m.l(0);
        s13.f22600o.l(s13.f22599n.d);
        s13.l();
        s13.f22596k.m(true);
        s13.f22593h = dz1.b.B(1500L, TimeUnit.MILLISECONDS).w(new h(s13, 11));
        hj.e eVar = s13.f22592g;
        ij.b b13 = y1.b();
        e.a aVar = hj.e.f38312g;
        eVar.h(b13, null);
    }

    @Override // m10.n
    public final void O() {
        Fragment fragment = this.f13276m;
        if (fragment instanceof s1) {
            i1().t();
        } else if (fragment instanceof e10.b) {
        } else {
            b.a aVar = e10.b.e;
            h20.b bVar = h20.b.STANDARD;
            aVar.getClass();
            e1(this, b.a.a(bVar), "HomeApListFragment", 12);
        }
    }

    @Override // e10.c
    public final void P() {
        LocalisationKey localisationKey = i0.R3;
        Bundle bundle = new Bundle();
        bundle.putParcelable("description-localisation-key", localisationKey);
        g10.a aVar = new g10.a();
        aVar.setArguments(bundle);
        e1(this, aVar, "HomeApCantSeeFragment", 12);
    }

    @Override // m10.n
    public final void P0() {
        s1 i13 = i1();
        DysonViewPager dysonViewPager = i13.f52871f;
        if (dysonViewPager != null) {
            dysonViewPager.setCurrentItem(1);
        } else {
            i13.f52873h = 1;
        }
        u1 u1Var = i13.f52874i;
        if (u1Var != null) {
            u1Var.f52879i.l(8);
        }
    }

    @Override // m10.n
    public final void Q() {
        if (d1().d.o()) {
            return;
        }
        f1().s().f22600o.l(3);
        Logger.c("Started Ownership step");
    }

    @Override // m10.n
    public final void Q0() {
        e1(this, new u40.a(), "BleUnableToProximityPairFragment", 12);
    }

    @Override // m10.n
    public final void T() {
        f1().s().f22600o.l(3);
        Logger.c("Started Manifest step");
    }

    @Override // m10.n
    public final void U() {
        b.a aVar = e10.b.e;
        h20.b bVar = h20.b.STANDARD;
        aVar.getClass();
        e1(this, b.a.a(bVar), "HomeApListFragment", 12);
    }

    @Override // g10.b
    public final void V() {
        e d13 = d1();
        ConnectionJourneyDataStore connectionJourneyDataStore = d13.d;
        connectionJourneyDataStore.f13891c.remove("CONNECTION_JOURNEY_WIFI-key");
        connectionJourneyDataStore.q("ON_WIFI_LIST_REFRESHING");
        d13.n("re-scan-wifi-action");
        b.a aVar = e10.b.e;
        h20.b bVar = h20.b.STANDARD;
        aVar.getClass();
        e1(this, b.a.a(bVar), "HomeApListFragment", 12);
    }

    @Override // m10.n
    public final void W() {
        g1(false);
    }

    @Override // m10.n
    public final void c0() {
        i1().t();
    }

    public final e d1() {
        e eVar = this.f13274k;
        if (eVar != null) {
            return eVar;
        }
        r.i("gattConnectionViewModel");
        throw null;
    }

    public final d20.a f1() {
        Fragment fragment = this.f13276m;
        if (fragment instanceof d20.a) {
            return (d20.a) fragment;
        }
        a.C0771a c0771a = d20.a.f22584j;
        int i13 = d1().d.p() ? 3 : 4;
        c0771a.getClass();
        d20.a aVar = new d20.a();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_NUMBER_OF_STEPS", i13);
        aVar.setArguments(bundle);
        e1(this, aVar, "ConnectionCarouselFragment", 4);
        return aVar;
    }

    @Override // m10.n
    public final void g0() {
        ng0.a d;
        e d13 = d1();
        d = d13.e.d(d13.d.j().getMachineType(), in0.i.NO_VARIANT.getValue());
        i.c(this).n(this, d, new m10.c(this, 5));
    }

    public final void g1(boolean z13) {
        Fragment fragment = this.f13276m;
        d20.a aVar = fragment instanceof d20.a ? (d20.a) fragment : null;
        if (aVar != null) {
            d20.d s13 = aVar.s();
            s13.f22594i = false;
            s13.f22598m.l(4);
            s13.f22601p.m(true);
            s13.l();
            if (z13) {
                return;
            }
            s13.f22597l.m(true);
            s13.f22602q.l(0);
            s13.f22604s.m(i0.f71870u5);
        }
    }

    public final void h1() {
        MachineCategory h13 = d1().d.h();
        int i13 = h13 == null ? -1 : b.f13278a[h13.ordinal()];
        if (i13 == 1) {
            e1(this, new t40.d(), "LocateECCodeFragment", 8);
        } else if (i13 == 2 || i13 == 3) {
            t40.a.f78184h.getClass();
            e1(this, new t40.a(), t40.a.f78185i, 8);
        }
    }

    @Override // d20.b
    public final void i() {
        w81.c.f85438h.getClass();
        new w81.c().showNow(getSupportFragmentManager(), "ContactDysonDialog");
    }

    public final s1 i1() {
        Fragment fragment = this.f13276m;
        if (fragment instanceof s1) {
            return (s1) fragment;
        }
        s1 s1Var = new s1();
        e1(this, s1Var, "GattPairFragment", 12);
        return s1Var;
    }

    @Override // d20.b
    public final void j() {
        i.c(this).g(this);
    }

    @Override // d20.b
    public final void j0(LocalisationKey localisationKey) {
        DysonActionBar dysonActionBar;
        localisationKey.getClass();
        o oVar = this.f13277n;
        if (oVar == null || (dysonActionBar = oVar.e) == null) {
            return;
        }
        pf0.c cVar = this.f13275l;
        if (cVar != null) {
            dysonActionBar.setTitle(cVar.d(localisationKey));
        } else {
            r.i("localisationManager");
            throw null;
        }
    }

    public final void j1(boolean z13) {
        e.b bVar = (e.b) d1().f13373n.getValue();
        if (r.c(bVar, e.b.a.f13374a)) {
            k1(null, null, z13);
        } else if (!(bVar instanceof e.b.C0410b)) {
            ma.e.o();
        } else {
            e.b.C0410b c0410b = (e.b.C0410b) bVar;
            k1(c0410b.f13375a, c0410b.f13376b, z13);
        }
    }

    public final void k1(String str, String str2, boolean z13) {
        Logger.a("Starting GattConnectionJourneyService, authCode " + str + ", randomNumber " + str2);
        int i13 = GattConnectionJourneyService.e;
        Intent intent = new Intent(this, GattConnectionJourneyService.class);
        intent.putExtra("stopServiceOnProximityTimeout", z13);
        intent.putExtra("AUTHCODE", str);
        intent.putExtra("RANDOMNUMBER", str2);
        startService(intent);
        i1();
    }

    @Override // m10.n
    public final void o0() {
        cd.b.B(this);
        f1();
        d1().n("continue-subsequent-journey-action");
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DysonActionBar dysonActionBar;
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        a13.a("shouldStartService");
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        i.c(this).e.c(this);
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        zs0.c.f93105a.getClass();
        zs0.c.a(this);
        o oVar = (o) q8.g.d(this, R.layout.activity_gatt_connection);
        this.f13277n = oVar;
        if (oVar != null && (dysonActionBar = oVar.e) != null) {
            dysonActionBar.x(this);
        }
        getWindow().addFlags(128);
        e d13 = d1();
        d13.f13369j.setValue(d13, e.f13364o[0], this);
        getLifecycle().a(d13);
        getOnBackPressedDispatcher().a(this, new c());
        j1(true);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Logger.a("Stopping GattConnectionJourneyService");
        stopService(new Intent(this, GattConnectionJourneyService.class));
        if (this.f13274k != null) {
            getLifecycle().c(d1());
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        Fragment fragment = this.f13276m;
        d20.a aVar = fragment instanceof d20.a ? (d20.a) fragment : null;
        if (aVar != null && aVar.s().f22594i) {
            i c13 = i.c(this);
            c13.getClass();
            c13.f(this, i0.N9, i0.O9, new l(2, c13, this));
            return true;
        }
        i c14 = i.c(this);
        m10.c cVar = new m10.c(this, 0);
        c14.getClass();
        c14.f(this, i0.V1, i0.W1, cVar);
        return true;
    }

    @Override // m10.n
    public final void q0() {
        i.c(this).g(this);
    }

    @Override // m10.n, m40.b
    public final void r() {
        cd.b.B(this);
        f1();
        e d13 = d1();
        d13.d.q("HOME_WIFI_PASSWORD_STORED");
        d13.n("home-wifi-stored");
    }

    @Override // m10.n
    public final void r0() {
        i1();
    }

    @Override // m10.n
    public final void s(String str, MachineDescriptor machineDescriptor) {
        i.c(this).getClass();
        i.m(this, str, 1, machineDescriptor);
    }

    @Override // m10.n
    public final void s0() {
        s1 i13 = i1();
        u1 u1Var = i13.f52874i;
        if (u1Var == null || i13.e == null) {
            return;
        }
        u1Var.f52878h.l(8);
        u1Var.f52879i.l(0);
        q8.n<LocalisationKey> nVar = u1Var.f52890t;
        ng0.a aVar = u1Var.f52877g;
        nVar.m(aVar.b(ng0.d.gattPairing_pairingTitle, i0.X2));
        u1Var.f52891u.m(aVar.b(ng0.d.gattPairing_pairingDescription, i0.Y2));
        s1.s(i13.e.f28963j);
        i13.e.f28962i.setVisibility(8);
    }

    @Override // m10.n
    public final void t0(boolean z13) {
        i.c(this).i(this, new m10.c(this, 4), new m0(this, 11), z13);
    }

    @Override // m10.n
    public final void z() {
        e.a a13 = new zs0.e(this).a();
        a13.f93107a = d1().f13368i.d(i0.f71560a4);
        a13.f93108b = d1().f13368i.d(i0.f71576b4);
        a13.f93110f = false;
        a13.b(d1().f13368i.d(i0.E8), new m10.c(this, 2));
        a13.c(d1().f13368i.d(i0.H8), new m10.c(this, 3));
        a13.a().show();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionActivity$a;", "", "<init>", "()V", "", "EXTRA_START_SERVICE", "Ljava/lang/String;", "", "MACHINE_PROVISIONING_STEP", "I", "CLOUD_POLLING_STEP", "MANIFEST_STEP", "OWNERSHIP_STEP", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
