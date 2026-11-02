package com.dyson.mobile.android.connectionjourney.headsup.wifistate;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.support.ui.contact.networkcompatible.NetworkCompatibleActivity;
import f.x;
import f20.a0;
import l.b;
import nj.c2;
import q8.g;
import u50.j;
import w00.i;
/* loaded from: classes2.dex */
public class HeadsUpWifiStateActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public p20.b f13506j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13507k = new a();

    /* loaded from: classes2.dex */
    public class a implements p20.a {
        public a() {
        }

        @Override // p20.a
        public final void a() {
            HeadsUpWifiStateActivity headsUpWifiStateActivity = HeadsUpWifiStateActivity.this;
            i.w(headsUpWifiStateActivity, com.dyson.mobile.android.connectionjourney.machinescan.a.a(j.b(i.c(headsUpWifiStateActivity).f85124a.j())));
        }

        @Override // p20.a
        public final void l() {
            HeadsUpWifiStateActivity headsUpWifiStateActivity = HeadsUpWifiStateActivity.this;
            i.c(headsUpWifiStateActivity).getClass();
            headsUpWifiStateActivity.startActivity(new Intent(headsUpWifiStateActivity, NetworkCompatibleActivity.class));
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.R(this);
        p20.b bVar = this.f13506j;
        bVar.f62760h.setValue(bVar, p20.b.f62755q[0], this.f13507k);
        getLifecycle().a(this.f13506j);
        a0 a0Var = (a0) g.d(this, R.layout.activity_headsup_wifi_state_screen);
        a0Var.l(this.f13506j);
        a0Var.f28919k.x(this);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f13506j != null) {
            getLifecycle().c(this.f13506j);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = c2.f57427a;
        new ij.b("connection_journey.get_started.wifi_network_status", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
