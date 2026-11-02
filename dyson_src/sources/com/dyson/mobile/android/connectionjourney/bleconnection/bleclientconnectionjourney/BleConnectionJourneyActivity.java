package com.dyson.mobile.android.connectionjourney.bleconnection.bleclientconnectionjourney;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.logging.Logger;
import f.j;
import f.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o10.e;
import p60.d;
import r40.b;
import rf0.i0;
import w00.i;
import we1.a;
import x12.r;
import yi0.h;
import zs0.c;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/bleclientconnectionjourney/BleConnectionJourneyActivity;", "Lbt0/g;", "Lr40/a;", "Lr40/b;", "Lo10/e;", "Lp10/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BleConnectionJourneyActivity extends g implements r40.a, b, e, p10.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f13339m = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public ConnectionJourneyDataStore f13340k;

    /* renamed from: l  reason: collision with root package name */
    public d f13341l;

    public static void d1(BleConnectionJourneyActivity bleConnectionJourneyActivity, Fragment fragment, String str) {
        FragmentManager supportFragmentManager = bleConnectionJourneyActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.i(R.id.fragment_container, fragment, str);
        aVar.n(true, true);
    }

    @Override // r40.a
    public final void A0() {
    }

    @Override // o10.e
    public final void D() {
        i c13 = i.c(getApplicationContext());
        ConnectionJourneyDataStore connectionJourneyDataStore = this.f13340k;
        if (connectionJourneyDataStore == null) {
            r.i("connectionJourneyDataStore");
            throw null;
        }
        String str = connectionJourneyDataStore.i().f10408a;
        b.e eVar = c13.f85127f;
        eVar.getClass();
        str.getClass();
        com.dyson.mobile.android.b bVar = com.dyson.mobile.android.b.this;
        b.a aVar = com.dyson.mobile.android.b.A;
        bVar.getClass();
        in0.e a13 = new h(getApplicationContext()).f90159a.a(str);
        if (a13 == null) {
            Logger.b("Machine was null on starting machine specific steps", null);
            i.c(getApplicationContext()).g(this);
        } else {
            in0.a f13 = a13.f(this);
            f13.j(bVar.f12820v);
            f13.k(this, str);
        }
        finish();
    }

    @Override // r40.b
    public final void E() {
        i.c(getApplicationContext()).o(this);
    }

    @Override // r40.a
    public final void J() {
    }

    @Override // r40.a
    public final void M0() {
    }

    @Override // o10.e
    public final void R() {
        d1(this, new u40.a(), "BleUnableToProximityPairFragment");
    }

    @Override // androidx.fragment.app.e, f.g, android.app.Activity
    @h12.e
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        Logger.a("onActivityResult(requestCode: " + i13 + " resultCode: " + i14 + ")");
        if (i13 == 69) {
            if (i14 == -1) {
                z0();
            } else if (i14 != 0) {
            } else {
                Logger.a("CDP dialog: RESULT_CANCELED");
            }
        }
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        i c13 = i.c(getApplicationContext());
        n10.a aVar = new n10.a(c13, this);
        c13.getClass();
        c13.f(this, i0.V1, i0.W1, aVar);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        a13.a("extraTheme");
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        c.f93105a.getClass();
        c.a(this);
        i.c(getApplicationContext()).e.z(this);
        ((f20.c) q8.g.d(this, R.layout.activity_ble_connection_journey)).d.x(this);
        ConnectionJourneyDataStore connectionJourneyDataStore = this.f13340k;
        if (connectionJourneyDataStore == null) {
            r.i("connectionJourneyDataStore");
            throw null;
        }
        String r13 = connectionJourneyDataStore.d().r();
        d dVar = this.f13341l;
        if (dVar == null) {
            r.i("companionDeviceUtils");
            throw null;
        } else if (!dVar.f()) {
            Logger.e("CDP is not supported on this device", null);
            z0();
        } else {
            d dVar2 = this.f13341l;
            if (dVar2 == null) {
                r.i("companionDeviceUtils");
                throw null;
            } else if (dVar2.c(r13)) {
                Logger.a("There is already a CDP association with machine ".concat(r13));
                z0();
            } else {
                p10.a.f62572h.getClass();
                d1(this, new p10.a(), "CompanionDeviceFragment");
            }
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i c13 = i.c(getApplicationContext());
        n10.a aVar = new n10.a(this, c13);
        c13.getClass();
        c13.f(this, i0.V1, i0.W1, aVar);
        return true;
    }

    @Override // p10.b
    public final void z0() {
        o10.d.f59391h.getClass();
        d1(this, new o10.d(), "BleConnectionJourneyFragment");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/bleclientconnectionjourney/BleConnectionJourneyActivity$a;", "", "<init>", "()V", "", "CDP_DIALOG_REQUEST_CODE", "I", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
