package com.dyson.mobile.android.connectionjourney.aplist.machineaplist;

import android.content.Intent;
import android.os.Bundle;
import b50.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nomachinefound.NoMachineFoundActivity;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.ap.ApUserGuidanceStepsActivity;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f.j;
import f.x;
import h10.d;
import l.b;
import nj.h1;
import q8.g;
import se1.q0;
import w00.i;
/* loaded from: classes2.dex */
public class ApListActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public f20.a f13267j;

    /* renamed from: k  reason: collision with root package name */
    public d f13268k;

    /* renamed from: l  reason: collision with root package name */
    public MachineCategory f13269l;

    /* renamed from: m  reason: collision with root package name */
    public final a f13270m = new a();

    /* loaded from: classes2.dex */
    public class a implements h10.b {
        public a() {
        }

        @Override // h10.b
        public final void a() {
            ApListActivity apListActivity = ApListActivity.this;
            i.c(apListActivity).getClass();
            int i13 = NoMachineFoundActivity.f13598l;
            apListActivity.startActivity(new Intent(apListActivity, NoMachineFoundActivity.class));
            apListActivity.finish();
        }

        @Override // h10.b
        public final void b() {
            ApListActivity apListActivity = ApListActivity.this;
            i c13 = i.c(apListActivity);
            c13.getClass();
            UserGuidanceView.c cVar = UserGuidanceView.c.SECOND;
            MachineDescriptor j8 = c13.f85124a.j();
            ApUserGuidanceStepsActivity.f13909p.getClass();
            apListActivity.startActivity(ApUserGuidanceStepsActivity.a.a(apListActivity, j8, cVar));
        }

        @Override // h10.b
        public final void c() {
            ApListActivity apListActivity = ApListActivity.this;
            i.c(apListActivity).getClass();
            i.v(apListActivity, f.b.INITIAL, false);
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(q0.f76062b));
        super.onCreate(bundle);
        i.c(this).e.I(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("apFilterMachineCategory") && (string = extras.getString("apFilterMachineCategory")) != null) {
            this.f13269l = MachineCategory.valueOf(string);
        }
        d dVar = this.f13268k;
        dVar.f36816h.setValue(dVar, d.f36813r[0], this.f13270m);
        d dVar2 = this.f13268k;
        MachineCategory machineCategory = this.f13269l;
        dVar2.getClass();
        machineCategory.getClass();
        dVar2.f36819k = machineCategory;
        getLifecycle().a(this.f13268k);
        f20.a aVar = (f20.a) g.d(this, R.layout.activity_ap_list);
        this.f13267j = aVar;
        aVar.l(this.f13268k);
        this.f13267j.f28912h.x(this);
        this.f13267j.d.setHasFixedSize(true);
        d dVar3 = this.f13268k;
        h10.a aVar2 = dVar3.f36820l;
        aVar2.f36812c = dVar3;
        this.f13267j.d.setAdapter(aVar2);
        q0.a(1, findViewById(R.id.content_main));
        q0.a(2, findViewById(R.id.ap_list));
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f13268k != null) {
            getLifecycle().c(this.f13268k);
            d dVar = this.f13268k;
            dVar.f36821m.m(false);
            dVar.n();
            mz1.f fVar = dVar.f36817i;
            if (fVar == null || fVar.b()) {
                return;
            }
            jz1.d.dispose(fVar);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = h1.f57507a;
        new ij.b("connection_journey.activate_setup_mode.product_wifi_scan", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
