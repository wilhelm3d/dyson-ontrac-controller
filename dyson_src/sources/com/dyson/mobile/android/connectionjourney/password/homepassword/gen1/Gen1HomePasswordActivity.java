package com.dyson.mobile.android.connectionjourney.password.homepassword.gen1;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import f20.c0;
import h12.y;
import l.b;
import nj.e2;
import pa.c;
import q8.g;
import w00.i;
/* loaded from: classes2.dex */
public class Gen1HomePasswordActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f13848j = 0;

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.getClass();
        ((c0) g.d(this, R.layout.activity_home_password)).d.x(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("isRetry")) {
            c.w("Use the newInstance method");
            return;
        }
        boolean z13 = extras.getBoolean("isRetry");
        int i13 = extras.getInt("flow");
        if (getSupportFragmentManager().E("HomePasswordFragment") == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            a f13 = y.f(supportFragmentManager, supportFragmentManager);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("isRetry", z13);
            bundle2.putInt("flow", i13);
            l40.a aVar = new l40.a();
            aVar.setArguments(bundle2);
            f13.i(R.id.fragment_container, aVar, "HomePasswordFragment");
            f13.f();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = e2.f57459a;
        new ij.b("connection_journey.home_wifi.enter_password", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
