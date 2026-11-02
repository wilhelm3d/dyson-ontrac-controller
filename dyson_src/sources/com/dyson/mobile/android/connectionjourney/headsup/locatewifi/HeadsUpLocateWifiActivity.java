package com.dyson.mobile.android.connectionjourney.headsup.locatewifi;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.headsup.wifistate.HeadsUpWifiStateActivity;
import f.j;
import f.x;
import f20.q;
import java.lang.ref.WeakReference;
import l.b;
import nj.a2;
import q8.g;
import w00.i;
/* loaded from: classes2.dex */
public class HeadsUpLocateWifiActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public n20.b f13498j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13499k = new a();

    /* loaded from: classes2.dex */
    public class a implements n20.a {
        public a() {
        }

        @Override // n20.a
        public final void a() {
            HeadsUpLocateWifiActivity headsUpLocateWifiActivity = HeadsUpLocateWifiActivity.this;
            i.c(headsUpLocateWifiActivity).getClass();
            headsUpLocateWifiActivity.startActivity(new Intent(headsUpLocateWifiActivity, HeadsUpWifiStateActivity.class));
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.M(this);
        n20.b bVar = this.f13498j;
        bVar.getClass();
        bVar.d = new WeakReference<>(this.f13499k);
        q qVar = (q) g.d(this, R.layout.activity_headsup_locate_wifi_screen);
        qVar.l(this.f13498j);
        qVar.f29262h.x(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = a2.f57395a;
        new ij.b("connection_journey.get_started.obtain_wifi_password", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
