package com.dyson.mobile.android.light.location;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.location.a;
import com.dyson.mobile.android.light.summary.LightProfileSummaryActivity;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import fm1.o0;
import h12.p;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import je0.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.d1;
import le0.h0;
import le0.j0;
import le0.n1;
import q8.n;
import qe0.e;
import re0.g;
import se1.k0;
import we1.a;
import x12.r;
import x12.u0;
import yd0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/location/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14900l = new a(null);
    public e d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public og0.a f14901f;

    /* renamed from: g  reason: collision with root package name */
    public String f14902g;

    /* renamed from: h  reason: collision with root package name */
    public yd0.c f14903h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f14904i;

    /* renamed from: j  reason: collision with root package name */
    public String f14905j = "";

    /* renamed from: k  reason: collision with root package name */
    public final C0496b f14906k = new C0496b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/location/b$b", "Lqe0/b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.location.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0496b implements qe0.b {
        public C0496b() {
        }

        @Override // qe0.b
        public final void a() {
            b bVar = b.this;
            yd0.c cVar = bVar.f14903h;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            LightProfileSummaryActivity.a aVar = LightProfileSummaryActivity.f15061m;
            String str = cVar.f89777h;
            aVar.getClass();
            str.getClass();
            Intent putExtra = new Intent(activity, LightProfileSummaryActivity.class).putExtra("COORDINATOR_ID", str);
            putExtra.getClass();
            activity.startActivity(putExtra);
        }

        @Override // qe0.b
        public final void b() {
            String d;
            b bVar = b.this;
            String str = bVar.f14902g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            om0.b s13 = om0.b.s(str);
            boolean z13 = bVar.f14904i;
            pf0.c cVar = bVar.e;
            if (z13) {
                if (cVar == null) {
                    r.i("localisationManager");
                    throw null;
                }
                og0.a aVar = bVar.f14901f;
                if (aVar == null) {
                    r.i("machineDataObject");
                    throw null;
                }
                d = cVar.d(aVar.b(og0.d.light_configurationSelectLocation));
            } else if (cVar == null) {
                r.i("localisationManager");
                throw null;
            } else {
                d = cVar.d(rf0.f.T0);
            }
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            ((f) activity).d1(s13, d, null, null);
        }

        @Override // qe0.b
        public final void c() {
            a.C0495a c0495a = com.dyson.mobile.android.light.location.a.f14897j;
            b bVar = b.this;
            String str = bVar.f14902g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0495a.getClass();
            com.dyson.mobile.android.light.location.a aVar = new com.dyson.mobile.android.light.location.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            aVar.show(activity.getSupportFragmentManager(), "DaylightHoursDialog");
        }
    }

    @Override // bt0.f.a
    public final void f(Bundle bundle) {
        bundle.getClass();
        if ("EXTRA_RESULT_CODE".equals(bundle.getString("RESULT_CODE"))) {
            if (this.f14904i) {
                androidx.fragment.app.e activity = getActivity();
                activity.getClass();
                ((LightLocationActivity) activity).f14891u = true;
            }
            t(o0.y("EXTRA_MACHINE_LOCATION", bundle));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (!(getActivity() instanceof f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("COORDINATOR_ID", "EXTRA_LOCATION", "EXTRA_FROM_SETTINGS");
        String y13 = o0.y("COORDINATOR_ID", a13);
        this.f14902g = y13;
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.f14903h = a14;
        ke0.d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        d1 d1Var = dVar.f47423a;
        re0.a b14 = dVar.b();
        d1Var.getClass();
        MachineDefinition machineDefinition = d1Var.f51598b;
        g a15 = b14.a(machineDefinition.d, machineDefinition.f15569q, machineDefinition.k());
        le0.a aVar = dVar.f47424b;
        yd0.d a16 = h0.a(aVar);
        hj.e eVar = dVar.d.get();
        og0.a c13 = dVar.c();
        pf0.c a17 = j0.a(aVar);
        n1Var.getClass();
        eVar.getClass();
        this.d = new e(a15.p(), a16, eVar, c13, a17);
        this.e = j0.a(aVar);
        this.f14901f = dVar.c();
        this.f14904i = a13.getBoolean("EXTRA_FROM_SETTINGS");
        this.f14905j = o0.y("EXTRA_LOCATION", a13);
        r0 r0Var = (r0) q8.g.c(layoutInflater, R.layout.fragment_light_location, viewGroup, false, null);
        r0Var.l(s());
        e s13 = s();
        s13.f66710t.setValue(s13, e.f66695u[0], this.f14906k);
        t(this.f14905j);
        getLifecycle().a(s());
        return r0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(s());
    }

    public final e s() {
        e eVar = this.d;
        if (eVar != null) {
            return eVar;
        }
        r.i("viewModel");
        throw null;
    }

    public final void t(String str) {
        double doubleValue;
        float f13;
        e s13 = s();
        boolean z13 = this.f14904i;
        str.getClass();
        s13.f66702l.m(str);
        s13.f66707q.m(!z13);
        yd0.d dVar = s13.e;
        String str2 = s13.d.d;
        y70.f fVar = dVar.f89784a;
        u0 u0Var = u0.f86723a;
        String format = String.format("%s_LATITUDE", Arrays.copyOf(new Object[]{str2}, 1));
        fVar.getClass();
        SharedPreferences sharedPreferences = fVar.f89351a;
        String string = sharedPreferences.getString(format, null);
        Double valueOf = string != null ? Double.valueOf(Double.parseDouble(string)) : null;
        String string2 = sharedPreferences.getString(String.format("%s_LONGITUDE", Arrays.copyOf(new Object[]{str2}, 1)), null);
        Double valueOf2 = string2 != null ? Double.valueOf(Double.parseDouble(string2)) : null;
        p pVar = (valueOf == null || valueOf2 == null) ? null : new p(valueOf, valueOf2);
        if (pVar == null) {
            Logger.b("No Location stored!", null);
            return;
        }
        double doubleValue2 = ((Number) pVar.d).doubleValue();
        Logger.c("onLocationReceived, latitude: " + doubleValue2 + ", longitude: " + ((Number) pVar.e).doubleValue());
        new k0();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        float rawOffset = ((float) (timeZone.getRawOffset() + Calendar.getInstance(timeZone).get(16))) / 3600000.0f;
        double d = ((((s13.f66708r + 2415018.5d) + 0.5d) - (rawOffset / 24.0f)) - 2451545.0d) / 36525.0d;
        double d13 = ((((3.032E-4d * d) + 36000.76983d) * d) + 280.46646d) % 360.0d;
        double d14 = ((35999.05029d - (1.537E-4d * d)) * d) + 357.52911d;
        double d15 = 0.016708634d - (((1.267E-7d * d) + 4.2037E-5d) * d);
        nf0.b.f57217a.getClass();
        double sin = ((1.914602d - (((1.4E-5d * d) + 0.004817d) * d)) * Math.sin(nf0.b.a(d14))) + ((0.019993d - (1.01E-4d * d)) * Math.sin(nf0.b.a(d14) * 2.0d)) + (Math.sin(nf0.b.a(d14) * 3.0d) * 2.89E-4d);
        Math.cos(nf0.b.a(d14 + sin));
        double d16 = 125.04d - (1934.136d * d);
        double sin2 = ((d13 + sin) - 0.00569d) - (Math.sin(nf0.b.a(d16)) * 0.00478d);
        double cos = (Math.cos(nf0.b.a(d16)) * 0.00256d) + ((((21.448d - ((((5.9E-4d - (0.001813d * d)) * d) + 46.815d) * d)) / 60.0d) + 26.0d) / 60.0d) + 23.0d;
        Math.atan2(Math.sin(nf0.b.a(sin2)) * Math.cos(nf0.b.a(cos)), Math.cos(nf0.b.a(sin2)));
        double asin = (Math.asin(Math.sin(nf0.b.a(sin2)) * Math.sin(nf0.b.a(cos))) * 180.0d) / 3.141592653589793d;
        double d17 = cos / 2.0d;
        double tan = Math.tan(nf0.b.a(d17)) * Math.tan(nf0.b.a(d17));
        double d18 = 2.0d * d13;
        double sin3 = Math.sin(nf0.b.a(d14));
        double sin4 = Math.sin(nf0.b.a(d14));
        double d19 = (float) doubleValue2;
        double sin5 = (((720.0f - (4.0f * ((float) doubleValue))) - ((((((((Math.sin(nf0.b.a(d18)) * tan) - (sin3 * (2.0d * d15))) + (Math.cos(nf0.b.a(d18)) * (sin4 * ((4.0d * d15) * tan)))) - (Math.sin(nf0.b.a(d13 * 4.0d)) * ((tan * 0.5d) * tan))) - (Math.sin(nf0.b.a(2.0d * d14)) * ((1.25d * d15) * d15))) * 180.0d) / 3.141592653589793d) * 4.0d)) + (rawOffset * 60.0f)) / 1440.0d;
        double acos = (((Math.acos((Math.cos(nf0.b.a(90.833d)) / (Math.cos(nf0.b.a(asin)) * Math.cos(nf0.b.a(d19)))) - (Math.tan(nf0.b.a(asin)) * Math.tan(nf0.b.a(d19)))) * 180.0d) / 3.141592653589793d) * 4.0d) / 1440.0d;
        nf0.b.f57218b = ((float) (sin5 + acos)) * 24.0f;
        float[] copyOf = Arrays.copyOf(new float[0], 1);
        copyOf[0] = ((float) (sin5 - acos)) * 24.0f;
        float f14 = nf0.b.f57218b;
        int length = copyOf.length;
        float[] copyOf2 = Arrays.copyOf(copyOf, length + 1);
        copyOf2[length] = f14;
        float f15 = copyOf2[0] * 60.0f;
        float f16 = copyOf2[1];
        n<String> nVar = s13.f66704n;
        new if1.c();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        nVar.m(if1.c.a(f15, timeUnit, "HH:mm"));
        n<String> nVar2 = s13.f66705o;
        new if1.c();
        nVar2.m(if1.c.a(f16 * 60.0f, timeUnit, "HH:mm"));
        n<String> nVar3 = s13.f66703m;
        new if1.c();
        nVar3.m(if1.c.a((f16 - f13) * 60.0f, timeUnit, s13.f66709s));
        s13.f66706p.m(s13.f66700j);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/light/location/b$a;", "", "<init>", "()V", "", "EXTRA_LOCATION", "Ljava/lang/String;", "EXTRA_FROM_SETTINGS", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
