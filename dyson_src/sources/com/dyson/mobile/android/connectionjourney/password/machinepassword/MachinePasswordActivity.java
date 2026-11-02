package com.dyson.mobile.android.connectionjourney.password.machinepassword;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import b50.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.password.homepassword.gen1.Gen1HomePasswordActivity;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.logging.Logger;
import f.j;
import f.x;
import f20.g0;
import java.lang.ref.WeakReference;
import l.b;
import nj.o3;
import q8.g;
import w00.i;
/* loaded from: classes2.dex */
public class MachinePasswordActivity extends b {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f13849o = 0;

    /* renamed from: j  reason: collision with root package name */
    public o40.b f13850j;

    /* renamed from: k  reason: collision with root package name */
    public ConnectionJourneyDataStore f13851k;

    /* renamed from: l  reason: collision with root package name */
    public f.b f13852l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f13853m = false;

    /* renamed from: n  reason: collision with root package name */
    public final a f13854n = new a();

    /* loaded from: classes2.dex */
    public class a implements o40.a {
        public a() {
        }

        @Override // o40.a
        public final void a() {
            MachinePasswordActivity machinePasswordActivity = MachinePasswordActivity.this;
            cd.b.B(machinePasswordActivity);
            boolean isEmpty = TextUtils.isEmpty(machinePasswordActivity.f13851k.m().f10409b);
            i c13 = i.c(machinePasswordActivity);
            f.b bVar = machinePasswordActivity.f13852l;
            boolean z13 = machinePasswordActivity.f13853m;
            c13.getClass();
            if (z13) {
                Logger.a("Restart Connection Journey " + bVar);
                i.u(machinePasswordActivity, bVar);
            } else if (bVar != f.b.INITIAL || !isEmpty) {
                i.u(machinePasswordActivity, bVar);
            } else {
                int i13 = Gen1HomePasswordActivity.f13848j;
                Intent intent = new Intent(machinePasswordActivity, Gen1HomePasswordActivity.class);
                intent.putExtra("isRetry", false);
                intent.putExtra("flow", 1);
                machinePasswordActivity.startActivity(intent);
            }
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.V(this);
        o40.b bVar = this.f13850j;
        bVar.getClass();
        bVar.f59536h = new WeakReference<>(this.f13854n);
        this.f13853m = getIntent().getBooleanExtra("isRetry", false);
        g0 g0Var = (g0) g.d(this, R.layout.activity_machine_password);
        g0Var.l(this.f13850j);
        g0Var.f29056k.x(this);
        f.b valueOf = f.b.valueOf(getIntent().getStringExtra("connection-type"));
        this.f13852l = valueOf;
        o40.b bVar2 = this.f13850j;
        bVar2.f59538j = this.f13853m;
        bVar2.f59539k = valueOf;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = o3.f57625a;
        new ij.b("connection_journey.product_wifi.enter_password", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
