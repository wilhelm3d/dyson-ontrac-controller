package com.dyson.mobile.android.connectionjourney.ownership.machinename;

import android.content.Intent;
import android.os.Bundle;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNameActivity;
import com.dyson.mobile.android.machinetype.MachineCategory;
import f.j;
import f.x;
import f20.u0;
import i20.m;
import i20.x1;
import nj.f3;
import p30.z;
import rf0.f;
import rf0.g0;
import uf1.d;
import wm.b;
import x1.i;
import x30.k;
import x30.l;
/* loaded from: classes2.dex */
public class OwnershipMachineNameActivity extends g {

    /* renamed from: k  reason: collision with root package name */
    public l f13835k;

    /* renamed from: l  reason: collision with root package name */
    public final a f13836l = new a();

    /* loaded from: classes2.dex */
    public class a implements k {
        public a() {
        }

        @Override // x30.k
        public final void a(String str, String str2, String str3, MachineCategory machineCategory, String str4) {
            int i13 = MachineNameActivity.f15416w;
            OwnershipMachineNameActivity ownershipMachineNameActivity = OwnershipMachineNameActivity.this;
            Intent intent = new Intent(ownershipMachineNameActivity, MachineNameActivity.class);
            if (machineCategory == MachineCategory.ROBOT) {
                intent.putExtra("TITLE_KEY", g0.f71492p2);
            } else {
                intent.putExtra("TITLE_KEY", f.B6);
            }
            intent.putExtra("extraTheme", 2132083505);
            intent.putExtra("MACHINE_NAME", str);
            intent.putExtra("EXTRA_MACHINE_TYPE_STRING", str2);
            intent.putExtra("EXTRA_MACHINE_CATEGORY", machineCategory.getShortName());
            intent.putExtra("MACHINE_SERIAL", str3);
            intent.putExtra("APP_MACHINE_VARIANT", str4);
            d.a(ownershipMachineNameActivity).b(intent).p(new b(this, 22), new i(1));
        }

        @Override // x30.k
        public final void b() {
            OwnershipMachineNameActivity ownershipMachineNameActivity = OwnershipMachineNameActivity.this;
            z.d(ownershipMachineNameActivity).getClass();
            z.g(ownershipMachineNameActivity);
        }
    }

    @Override // f.g, android.app.Activity
    public final void onBackPressed() {
        z.d(this).e(this);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        t30.b bVar = z.d(this).f62827c;
        m mVar = bVar.f78102b;
        x1.b(mVar);
        bVar.f78103c.getClass();
        l lVar = new l(bVar.a(), x1.b(mVar), bVar.f78117s.get());
        this.f13835k = lVar;
        lVar.f86780k.setValue(lVar, l.f86778p[0], this.f13836l);
        u0 u0Var = (u0) q8.g.d(this, R.layout.activity_ownership_machine_name_screen);
        u0Var.l(this.f13835k);
        u0Var.f29366i.x(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = f3.f57475a;
        new ij.b("connection_journey.ownership.machine_name", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        z.d(this).e(this);
        return true;
    }
}
