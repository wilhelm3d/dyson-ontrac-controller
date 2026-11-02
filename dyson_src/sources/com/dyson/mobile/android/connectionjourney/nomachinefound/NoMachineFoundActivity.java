package com.dyson.mobile.android.connectionjourney.nomachinefound;

import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.ap.ApUserGuidanceStepsActivity;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f.j;
import f.x;
import f20.k0;
import java.lang.ref.WeakReference;
import l.b;
import nj.g1;
import q8.g;
import w00.i;
/* loaded from: classes2.dex */
public class NoMachineFoundActivity extends b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f13598l = 0;

    /* renamed from: j  reason: collision with root package name */
    public a30.b f13599j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13600k = new a();

    /* loaded from: classes2.dex */
    public class a implements a30.a {
        public a() {
        }

        @Override // a30.a
        public final void a() {
            NoMachineFoundActivity noMachineFoundActivity = NoMachineFoundActivity.this;
            i c13 = i.c(noMachineFoundActivity);
            c13.getClass();
            UserGuidanceView.c cVar = UserGuidanceView.c.SECOND;
            MachineDescriptor j8 = c13.f85124a.j();
            ApUserGuidanceStepsActivity.f13909p.getClass();
            noMachineFoundActivity.startActivity(ApUserGuidanceStepsActivity.a.a(noMachineFoundActivity, j8, cVar));
            noMachineFoundActivity.finish();
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i.c(this).e.K(this);
        a30.b bVar = this.f13599j;
        bVar.getClass();
        bVar.d = new WeakReference<>(this.f13600k);
        k0 k0Var = (k0) g.d(this, R.layout.activity_no_machine_found);
        k0Var.f29142h.x(this);
        k0Var.l(this.f13599j);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = g1.f57490a;
        new ij.b("connection_journey.activate_setup_mode.product_wifi_no_results", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
