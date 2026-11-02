package com.dyson.mobile.android.connectionjourney.ownership.purchasedate;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import bt0.g;
import c40.e;
import c40.f;
import c40.j;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.ownership.autoupdate.OwnershipAutoUpdateActivity;
import com.dyson.mobile.android.connectionjourney.ownership.otarequired.OwnershipOtaRequiredActivity;
import com.dyson.mobile.android.machinetype.MachineCategory;
import f.x;
import f20.y0;
import i20.x1;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import nj.g3;
import nj.h3;
import p30.z;
import pf0.c;
import t30.b;
import xy1.h;
import y9.w;
/* loaded from: classes2.dex */
public class OwnershipPurchaseDateActivity extends g {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f13839n = 0;

    /* renamed from: k  reason: collision with root package name */
    public j f13840k;

    /* renamed from: l  reason: collision with root package name */
    public final e f13841l = new e(this, 0);

    /* renamed from: m  reason: collision with root package name */
    public final a f13842m = new a();

    /* loaded from: classes2.dex */
    public class a implements f {
        public a() {
        }

        @Override // c40.f
        public final void a(Calendar calendar, Calendar calendar2, Calendar calendar3) {
            int i13 = OwnershipPurchaseDateActivity.f13839n;
            OwnershipPurchaseDateActivity ownershipPurchaseDateActivity = OwnershipPurchaseDateActivity.this;
            DatePickerDialog datePickerDialog = new DatePickerDialog(ownershipPurchaseDateActivity, ownershipPurchaseDateActivity.f8416j == 2132083505 ? 2132083045 : R.style.DatePickerDialogStyle, ownershipPurchaseDateActivity.f13841l, calendar.get(1), calendar.get(2), calendar.get(5));
            DatePicker datePicker = datePickerDialog.getDatePicker();
            datePicker.setMaxDate(calendar3.getTimeInMillis());
            datePicker.setMinDate(calendar2.getTimeInMillis());
            datePickerDialog.show();
            int i14 = h3.f57509a;
            w.t("connection_journey.ownership.machine_purchase_date_calendar", null, 2, null);
        }

        @Override // c40.f
        public final void b() {
            OwnershipPurchaseDateActivity.super.onBackPressed();
        }

        @Override // c40.f
        public final void c() {
            OwnershipPurchaseDateActivity ownershipPurchaseDateActivity = OwnershipPurchaseDateActivity.this;
            z d = z.d(ownershipPurchaseDateActivity);
            MachineCategory machineCategory = d.f62825a.f().a().getMachineCategory();
            if (machineCategory == MachineCategory.WEARABLE_EC || machineCategory == MachineCategory.FLOORCARE || machineCategory == MachineCategory.HAIRCARE || machineCategory == MachineCategory.ORALCARE) {
                d.f(ownershipPurchaseDateActivity);
            } else if (d.f62825a.i() && machineCategory == MachineCategory.LIGHTING) {
                ownershipPurchaseDateActivity.startActivity(new Intent(ownershipPurchaseDateActivity, OwnershipOtaRequiredActivity.class));
            } else {
                ownershipPurchaseDateActivity.startActivity(new Intent(ownershipPurchaseDateActivity, OwnershipAutoUpdateActivity.class));
            }
        }

        @Override // c40.f
        public final void d() {
            OwnershipPurchaseDateActivity.this.onSupportNavigateUp();
        }
    }

    @Override // f.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f13840k.m() == null) {
            super.onBackPressed();
            return;
        }
        j jVar = this.f13840k;
        if (jVar.f62806h.getMachineCategory() == MachineCategory.WEARABLE_EC) {
            f m13 = jVar.m();
            if (m13 != null) {
                m13.d();
                return;
            }
            return;
        }
        f m14 = jVar.m();
        if (m14 != null) {
            m14.b();
        }
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        b bVar = z.d(this).f62827c;
        u30.j jVar = bVar.f78103c;
        h40.a a13 = bVar.a();
        c b13 = x1.b(bVar.f78102b);
        ng0.b bVar2 = bVar.f78117s.get();
        bVar.f78103c.getClass();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        h.b(calendar);
        p30.c b14 = bVar.b();
        jVar.getClass();
        j jVar2 = new j(a13, b13, bVar2, calendar, b14);
        this.f13840k = jVar2;
        jVar2.f10189s.setValue(jVar2, j.f10179w[0], this.f13842m);
        y0 y0Var = (y0) q8.g.d(this, R.layout.activity_ownership_purchase_date_screen);
        y0Var.l(this.f13840k);
        y0Var.f29473l.x(this);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.f13840k.f10188r.e();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = g3.f57492a;
        new ij.b("connection_journey.ownership.machine_purchase_date", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        z.d(this).e(this);
        return true;
    }
}
