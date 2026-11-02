package com.dyson.mobile.android.light.control;

import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.control.LightCustomModeActivity;
import com.dyson.mobile.android.light.control.e;
import f.j;
import f.x;
import fm1.o0;
import ie0.l;
import ie0.m;
import ie0.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.h0;
import le0.i1;
import le0.j0;
import le0.t1;
import q8.t;
import rf0.i0;
import v32.w;
import we1.a;
import x12.r;
import yd0.c;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightModesDialogActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightModesDialogActivity extends l.b {

    /* renamed from: u  reason: collision with root package name */
    public static final a f14784u = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public g f14785j;

    /* renamed from: k  reason: collision with root package name */
    public pf0.c f14786k;

    /* renamed from: l  reason: collision with root package name */
    public og0.a f14787l;

    /* renamed from: m  reason: collision with root package name */
    public yd0.c f14788m;

    /* renamed from: n  reason: collision with root package name */
    public int f14789n;

    /* renamed from: o  reason: collision with root package name */
    public int f14790o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14792q;

    /* renamed from: r  reason: collision with root package name */
    public String f14793r;

    /* renamed from: s  reason: collision with root package name */
    public je0.e f14794s;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14791p = true;

    /* renamed from: t  reason: collision with root package name */
    public final b f14795t = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/control/LightModesDialogActivity$b", "Lcom/dyson/mobile/android/light/control/h;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements h {
        public b() {
        }

        @Override // com.dyson.mobile.android.light.control.h
        public final void a() {
            LightModesDialogActivity lightModesDialogActivity = LightModesDialogActivity.this;
            lightModesDialogActivity.onBackPressed();
            lightModesDialogActivity.e1().f14864v.l(8);
        }

        @Override // com.dyson.mobile.android.light.control.h
        public final void b(int i13, int i14, boolean z13) {
            LightModesDialogActivity lightModesDialogActivity = LightModesDialogActivity.this;
            yd0.c cVar = lightModesDialogActivity.f14788m;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            m mVar = new m(lightModesDialogActivity, i13, i14, z13);
            gz1.b bVar = cVar.f89783n;
            uf1.d a13 = uf1.d.a(lightModesDialogActivity);
            LightCustomModeActivity.a aVar = LightCustomModeActivity.f14775u;
            String str = cVar.f89777h;
            aVar.getClass();
            str.getClass();
            Intent intent = new Intent(lightModesDialogActivity, LightCustomModeActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("EXTRA_COLOUR_TEMPERATURE_VALUE", i13);
            intent.putExtra("EXTRA_BRIGHTNESS_VALUE", i14);
            bVar.a(a13.b(intent).p(new yc0.d(mVar, 14), new yc0.d(new y90.d(9), 15)));
        }

        @Override // com.dyson.mobile.android.light.control.h
        public final void c(e.c cVar) {
            LightModesDialogActivity lightModesDialogActivity = LightModesDialogActivity.this;
            String d = lightModesDialogActivity.c1().d(lightModesDialogActivity.d1().b(og0.d.light_deleteCustomModes_alertTitle));
            String d13 = lightModesDialogActivity.c1().d(lightModesDialogActivity.d1().b(og0.d.light_deleteCustomModes_alertMessage));
            e.a a13 = new zs0.e(lightModesDialogActivity).a();
            a13.f93107a = d;
            a13.f93108b = d13;
            a13.f93110f = true;
            a13.c(lightModesDialogActivity.c1().d(i0.f71915x6), new l(0, lightModesDialogActivity, cVar));
            a13.b(lightModesDialogActivity.c1().d(i0.E8), new a20.a(lightModesDialogActivity, 14));
            a13.a().show();
        }

        @Override // com.dyson.mobile.android.light.control.h
        public final void d() {
            LightModesDialogActivity lightModesDialogActivity = LightModesDialogActivity.this;
            String d = lightModesDialogActivity.c1().d(lightModesDialogActivity.d1().b(og0.d.light_limitReached_alertTitle));
            String d13 = lightModesDialogActivity.c1().d(lightModesDialogActivity.d1().b(og0.d.light_limitReached_alertMessage));
            e.a a13 = new zs0.e(lightModesDialogActivity).a();
            a13.f93107a = d;
            a13.f93108b = d13;
            a13.f93110f = false;
            a13.c(lightModesDialogActivity.c1().d(i0.L8), null);
            a13.a().show();
        }
    }

    public final pf0.c c1() {
        pf0.c cVar = this.f14786k;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final og0.a d1() {
        og0.a aVar = this.f14787l;
        if (aVar != null) {
            return aVar;
        }
        r.i("machineDataObject");
        throw null;
    }

    public final g e1() {
        g gVar = this.f14785j;
        if (gVar != null) {
            return gVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e.d dVar;
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRA_COLOR_TEMPERATURE", "EXTRA_BRIGHTNESS", "EXTRA_IS_PRODUCT_OFF", "EXTRA_IS_DAYLIGHT_ON", "EXTRA_LIGHT_MODE");
        String y13 = o0.y("COORDINATOR_ID", a14);
        yd0.c.f89775o.getClass();
        yd0.c a15 = c.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14788m = a15;
        ke0.d dVar2 = a15.f89779j;
        mf0.a a16 = dVar2.a();
        le0.a aVar = dVar2.f47424b;
        this.f14785j = t1.a(dVar2.f47425c, dVar2.Q.get(), a16, h0.a(aVar), j0.a(aVar), dVar2.c(), dVar2.d.get(), i1.a(dVar2.f47423a));
        this.f14786k = j0.a(aVar);
        this.f14787l = dVar2.c();
        this.f14789n = a14.getInt("EXTRA_COLOR_TEMPERATURE");
        this.f14790o = a14.getInt("EXTRA_BRIGHTNESS");
        this.f14791p = a14.getBoolean("EXTRA_IS_PRODUCT_OFF");
        this.f14792q = a14.getBoolean("EXTRA_IS_DAYLIGHT_ON");
        this.f14793r = a14.getString("EXTRA_LIGHT_MODE");
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        t d = q8.g.d(this, R.layout.activity_light_modes_dialog);
        d.getClass();
        je0.e eVar = (je0.e) d;
        this.f14794s = eVar;
        eVar.l(e1());
        g e13 = e1();
        e13.D.setValue(e13, g.H[0], this.f14795t);
        e1().f14864v.l(0);
        je0.e eVar2 = this.f14794s;
        if (eVar2 == null) {
            r.i("binding");
            throw null;
        }
        eVar2.f44566i.getViewTreeObserver().addOnPreDrawListener(new n(this));
        if (this.f14792q) {
            e.b.f14831a.getClass();
            dVar = e.b.f14832b;
        } else if (w.j(this.f14793r, "STUDY", false)) {
            e.b.f14831a.getClass();
            dVar = e.b.f14833c;
        } else if (w.j(this.f14793r, "RELAX", false)) {
            e.b.f14831a.getClass();
            dVar = e.b.d;
        } else if (w.j(this.f14793r, "PRECISION", false)) {
            e.b.f14831a.getClass();
            dVar = e.b.e;
        } else {
            dVar = null;
        }
        g e14 = e1();
        mf0.a aVar2 = e14.f14848f;
        boolean z13 = this.f14791p;
        int i13 = this.f14789n;
        int i14 = this.f14790o;
        e14.d(i14);
        e14.f14866x = i13;
        aVar2.i(i13);
        e14.f14865w = z13;
        ObservableInt observableInt = e14.f14862t;
        nf0.c.f57219a.getClass();
        Integer valueOf = Integer.valueOf(nf0.c.f57223g);
        if (i13 != 0) {
            valueOf = null;
        }
        observableInt.l(valueOf != null ? valueOf.intValue() : nf0.c.g(i13));
        if (z13) {
            observableInt.l(-16777216);
            e14.f14860r.m(e14.f14856n);
            e14.f14866x = 0;
            aVar2.i(0);
            e14.d(0);
            e14.f14859q.l(4);
        } else if (dVar != null) {
            e14.f(dVar);
        } else {
            e14.e(i13, i14);
        }
        je0.e eVar3 = this.f14794s;
        if (eVar3 != null) {
            eVar3.f44564g.setAdapter(e1().C);
        } else {
            r.i("binding");
            throw null;
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getLifecycle().c(e1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getLifecycle().a(e1());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightModesDialogActivity$a;", "", "<init>", "()V", "", "EXTRA_COLOR_TEMPERATURE", "Ljava/lang/String;", "EXTRA_BRIGHTNESS", "EXTRA_IS_PRODUCT_OFF", "EXTRA_IS_DAYLIGHT_ON", "EXTRA_LIGHT_MODE", "EXTRA_WRITE_PREVIOUS_MODES", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
