package com.dyson.mobile.android.connectionjourney.bluetoothpermission;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.enablebluetooth.a;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import f.j;
import f.x;
import f20.e;
import kotlin.Metadata;
import l.b;
import q8.g;
import q8.t;
import w00.i;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bluetoothpermission/BluetoothPermissionActivity;", "Ll/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BluetoothPermissionActivity extends b {
    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.getClass();
        t d = g.d(this, R.layout.activity_bluetooth_permission);
        d.getClass();
        DysonActionBar dysonActionBar = ((e) d).d;
        if (dysonActionBar != null) {
            dysonActionBar.x(this);
        }
        s10.b bVar = new s10.b();
        a.f13457i.getClass();
        String str = a.f13459k;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.i(R.id.fragment_container, bVar, str);
        aVar.n(true, true);
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
