package com.dyson.mobile.android.light.control;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.control.LightModeAnimationActivity;
import fm1.o0;
import hj.e;
import je0.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.h0;
import le0.i1;
import le0.j0;
import le0.n1;
import nj.e7;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/control/c;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends Fragment implements f.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f14807k = new a(null);
    public d d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public og0.a f14808f;

    /* renamed from: g  reason: collision with root package name */
    public int f14809g;

    /* renamed from: h  reason: collision with root package name */
    public int f14810h;

    /* renamed from: i  reason: collision with root package name */
    public yd0.c f14811i;

    /* renamed from: j  reason: collision with root package name */
    public final b f14812j = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/control/c$b", "Lie0/i;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ie0.i {
        public b() {
        }

        @Override // ie0.i
        public final void a() {
            c cVar = c.this;
            pf0.c cVar2 = cVar.e;
            if (cVar2 == null) {
                r.i("localisationManager");
                throw null;
            }
            og0.a aVar = cVar.f14808f;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            String d = cVar2.d(aVar.b(og0.d.light_addedToModes));
            yd0.c cVar3 = cVar.f14811i;
            if (cVar3 == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e activity = cVar.getActivity();
            activity.getClass();
            id0.d dVar = new id0.d(cVar, 2);
            gz1.b bVar = cVar3.f89783n;
            uf1.d a13 = uf1.d.a(activity);
            LightModeAnimationActivity.a aVar2 = LightModeAnimationActivity.f14781l;
            String str = cVar3.f89777h;
            aVar2.getClass();
            bVar.a(a13.b(LightModeAnimationActivity.a.a(activity, str, d, R.drawable.animated_circle_tick)).p(new yc0.d(dVar, 5), new yc0.d(new y90.d(8), 13)));
            hj.e eVar = cVar3.f89780k;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            int i13 = e7.f57464a;
            ij.b bVar2 = new ij.b("light.modes.mode_created", null, 2, null);
            e.a aVar3 = hj.e.f38312g;
            eVar.h(bVar2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i13;
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("COORDINATOR_ID", "EXTRA_COLOUR_TEMPERATURE_VALUE", "EXTRA_BRIGHTNESS_VALUE");
        this.f14809g = a13.getInt("EXTRA_COLOUR_TEMPERATURE_VALUE");
        this.f14810h = a13.getInt("EXTRA_BRIGHTNESS_VALUE");
        if (!(getActivity() instanceof bt0.f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        String y13 = o0.y("COORDINATOR_ID", a13);
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.f14811i = a14;
        ke0.d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        mf0.a a15 = dVar.a();
        le0.a aVar = dVar.f47424b;
        yd0.d a16 = h0.a(aVar);
        og0.a c13 = dVar.c();
        hj.e eVar = dVar.d.get();
        in0.g a17 = i1.a(dVar.f47423a);
        n1Var.getClass();
        eVar.getClass();
        this.d = new d(n1Var.f51675b.f89772b, a15, a16, c13, eVar, a17);
        this.e = j0.a(aVar);
        this.f14808f = dVar.c();
        e0 e0Var = (e0) q8.g.c(layoutInflater, R.layout.fragment_custom_modes_description, viewGroup, false, null);
        e0Var.l(s());
        d s13 = s();
        s13.f14828s.setValue(s13, d.f14814u[0], this.f14812j);
        d s14 = s();
        int i14 = this.f14809g;
        int i15 = this.f14810h;
        ObservableInt observableInt = s14.f14823n;
        s14.f14817h = i14;
        mf0.a aVar2 = s14.e;
        aVar2.i(i14);
        s14.f14818i = i15;
        aVar2.h(i15);
        if (s14.f14829t) {
            if (s14.f14815f.a(s14.d)) {
                ie0.f.f41557a.getClass();
                i13 = ie0.f.f41562h;
            } else {
                ie0.f.f41557a.getClass();
                i13 = ie0.f.f41561g;
            }
            s14.f14822m = i13;
            observableInt.l(0);
            s14.f14824o = PorterDuff.Mode.ADD;
        } else {
            nf0.c.f57219a.getClass();
            observableInt.l(nf0.c.g(i14));
        }
        return e0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getLifecycle().c(s());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getLifecycle().a(s());
    }

    public final d s() {
        d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/control/c$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
