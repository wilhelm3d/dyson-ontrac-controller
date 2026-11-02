package com.dyson.mobile.android.light.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.location.LightLocationActivity;
import com.dyson.mobile.android.light.location.d;
import fm1.o0;
import je0.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import le0.n1;
import q8.g;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/location/c;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends Fragment implements f.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14908i = new a(null);
    public qe0.d d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public String f14909f;

    /* renamed from: g  reason: collision with root package name */
    public yd0.c f14910g;

    /* renamed from: h  reason: collision with root package name */
    public final b f14911h = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/location/c$b", "Lqe0/c;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements qe0.c {
        public b() {
        }

        @Override // qe0.c
        public final void a() {
            c cVar = c.this;
            String str = cVar.f14909f;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            om0.b s13 = om0.b.s(str);
            e requireActivity = cVar.requireActivity();
            requireActivity.getClass();
            f fVar = (f) requireActivity;
            pf0.c cVar2 = cVar.e;
            if (cVar2 != null) {
                fVar.d1(s13, cVar2.d(rf0.f.T0), null, null);
            } else {
                r.i("localisationManager");
                throw null;
            }
        }

        @Override // qe0.c
        public final void b() {
            c cVar = c.this;
            yd0.c cVar2 = cVar.f14910g;
            if (cVar2 == null) {
                r.i("coordinator");
                throw null;
            }
            e requireActivity = cVar.requireActivity();
            requireActivity.getClass();
            cVar2.o(requireActivity);
        }

        @Override // qe0.c
        public final void c() {
            d.a aVar = d.f14913i;
            c cVar = c.this;
            String str = cVar.f14909f;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar.getClass();
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            dVar.setArguments(bundle);
            dVar.show(cVar.requireActivity().getSupportFragmentManager(), "LightSetLocationDialog");
        }
    }

    @Override // bt0.f.a
    public final void f(Bundle bundle) {
        bundle.getClass();
        if ("EXTRA_RESULT_CODE".equals(bundle.getString("RESULT_CODE"))) {
            String y13 = o0.y("EXTRA_MACHINE_LOCATION", bundle);
            yd0.c cVar = this.f14910g;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            e requireActivity = requireActivity();
            requireActivity.getClass();
            LightLocationActivity.a aVar = LightLocationActivity.f14885v;
            String str = cVar.f89777h;
            aVar.getClass();
            requireActivity.startActivity(LightLocationActivity.a.a(requireActivity, false, str, y13));
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
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        this.f14909f = y13;
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.f14910g = a13;
        ke0.d dVar = a13.f89779j;
        n1 n1Var = dVar.f47425c;
        og0.a c13 = dVar.c();
        n1Var.getClass();
        this.d = new qe0.d(c13);
        this.e = j0.a(dVar.f47424b);
        t0 t0Var = (t0) g.c(layoutInflater, R.layout.fragment_light_location_start, viewGroup, false, null);
        qe0.d dVar2 = this.d;
        if (dVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        t0Var.l(dVar2);
        qe0.d dVar3 = this.d;
        if (dVar3 != null) {
            dVar3.e.setValue(dVar3, qe0.d.f66691f[0], this.f14911h);
            return t0Var.getRoot();
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/location/c$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
