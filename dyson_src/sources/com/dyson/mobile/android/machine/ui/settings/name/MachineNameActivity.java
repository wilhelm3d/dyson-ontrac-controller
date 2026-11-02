package com.dyson.mobile.android.machine.ui.settings.name;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import we1.a;
/* loaded from: classes3.dex */
public class MachineNameActivity extends bt0.f<bt0.c> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15416w = 0;

    /* renamed from: p  reason: collision with root package name */
    public pf0.c f15417p;

    /* renamed from: q  reason: collision with root package name */
    public String f15418q;

    /* renamed from: r  reason: collision with root package name */
    public String f15419r;

    /* renamed from: s  reason: collision with root package name */
    public String f15420s;

    /* renamed from: t  reason: collision with root package name */
    public String f15421t;

    /* renamed from: u  reason: collision with root package name */
    public String f15422u;

    /* renamed from: v  reason: collision with root package name */
    public MachineCategory f15423v;

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b();
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        this.f15417p = uf0.g.a(this).f81922a.c();
        Intent intent = getIntent();
        we1.a.f85708c.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "MachineNameActivity requires EXTRA_TITLE_KEY, EXTRA_MACHINE_SERIAL, EXTRA_MACHINE_TYPE, EXTRA_MACHINE_CATEGORY and EXTRA_APP_MACHINE_VARIANT (please use the newInstance method)";
        a13.a("TITLE_KEY", "EXTRA_MACHINE_TYPE_STRING", "EXTRA_MACHINE_CATEGORY", "MACHINE_SERIAL", "APP_MACHINE_VARIANT");
        if (!intent.hasExtra("TITLE_KEY") || !intent.hasExtra("EXTRA_MACHINE_TYPE_STRING") || !intent.hasExtra("EXTRA_MACHINE_CATEGORY") || !intent.hasExtra("MACHINE_SERIAL") || !intent.hasExtra("APP_MACHINE_VARIANT")) {
            pa.c.w("MachineNameActivity cannot be initialised without a title, serial, machine type name, machine category or app machine variant");
            return;
        }
        this.f15418q = this.f15417p.d((LocalisationKey) c7.c.a(intent, "TITLE_KEY", LocalisationKey.class));
        if (intent.hasExtra("extraTheme")) {
            setTheme(intent.getIntExtra("extraTheme", 2132083504));
        }
        this.f15419r = intent.getStringExtra("MACHINE_NAME");
        this.f15422u = intent.getStringExtra("EXTRA_MACHINE_TYPE_STRING");
        this.f15423v = MachineCategory.fromMachineCategory(intent.getStringExtra("EXTRA_MACHINE_CATEGORY"));
        this.f15420s = intent.getStringExtra("MACHINE_SERIAL");
        this.f15421t = intent.getStringExtra("APP_MACHINE_VARIANT");
        e1();
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        Fragment bVar;
        super.onPostCreate(bundle);
        if (bundle == null) {
            NamingConfig namingConfig = new NamingConfig(this.f15419r, new MachineNamingExtras.ReturnName(this.f15422u, this.f15420s, this.f15421t, this.f15423v));
            if (this.f15423v == MachineCategory.ROBOT) {
                a.f15435f.getClass();
                bVar = new a();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("CONFIG", namingConfig);
                bVar.setArguments(bundle2);
            } else {
                b.f15436k.getClass();
                bVar = new b();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("CONFIG", namingConfig);
                bVar.setArguments(bundle3);
            }
            o1(bVar, this.f15418q, null, null);
        }
    }
}
