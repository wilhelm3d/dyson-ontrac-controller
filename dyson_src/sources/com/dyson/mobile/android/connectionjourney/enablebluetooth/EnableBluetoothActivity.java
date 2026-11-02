package com.dyson.mobile.android.connectionjourney.enablebluetooth;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.enablelocation.EnableLocationActivity;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import f.j;
import f.x;
import kotlin.Metadata;
import q8.g;
import q8.t;
import w00.i;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/EnableBluetoothActivity;", "Ll/b;", "Lj20/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnableBluetoothActivity extends l.b implements j20.b {
    @Override // j20.b
    public final void K() {
        i.c(this).getClass();
        startActivity(new Intent(this, EnableLocationActivity.class));
        finish();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.getClass();
        t d = g.d(this, R.layout.activity_enable_bluetooth);
        ((f20.i) d).d.x(this);
        d.getClass();
        DysonActionBar dysonActionBar = ((f20.i) d).d;
        if (dysonActionBar != null) {
            dysonActionBar.x(this);
        }
        a.f13457i.getClass();
        a aVar = new a();
        String str = a.f13459k;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.i(R.id.fragment_container, aVar, str);
        aVar2.n(true, true);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
