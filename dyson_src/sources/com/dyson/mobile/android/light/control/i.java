package com.dyson.mobile.android.light.control;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import ie0.p;
import ie0.q;
import ie0.r;
import je0.b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.i1;
import le0.j0;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/control/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i extends Fragment {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14871i = new a(null);
    public q d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public og0.a f14872f;

    /* renamed from: g  reason: collision with root package name */
    public in0.g f14873g;

    /* renamed from: h  reason: collision with root package name */
    public final b f14874h = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/control/i$b", "Lie0/r;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements r {
        public b() {
        }

        @Override // ie0.r
        public final void a() {
            androidx.fragment.app.e activity = i.this.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("COORDINATOR_ID") : null;
        string.getClass();
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(string);
        a13.getClass();
        ke0.d dVar = a13.f89779j;
        dVar.f47425c.getClass();
        this.d = new q();
        this.e = j0.a(dVar.f47424b);
        this.f14872f = dVar.c();
        this.f14873g = i1.a(dVar.f47423a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        b1 b1Var = (b1) q8.g.c(layoutInflater, R.layout.fragment_light_values_info_dialog, viewGroup, false, null);
        q qVar = this.d;
        if (qVar == null) {
            x12.r.i("viewModel");
            throw null;
        }
        b1Var.l(qVar);
        q qVar2 = this.d;
        if (qVar2 == null) {
            x12.r.i("viewModel");
            throw null;
        }
        qVar2.f41593a.setValue(qVar2, q.f41592b[0], this.f14874h);
        DysonActionBar dysonActionBar = b1Var.f44528i;
        androidx.fragment.app.e activity = getActivity();
        activity.getClass();
        dysonActionBar.x((l.b) activity);
        ViewPager viewPager = b1Var.f44529j;
        pf0.c cVar = this.e;
        if (cVar == null) {
            x12.r.i("localisationManager");
            throw null;
        }
        og0.a aVar = this.f14872f;
        if (aVar == null) {
            x12.r.i("machineDataObject");
            throw null;
        }
        in0.g gVar = this.f14873g;
        if (gVar == null) {
            x12.r.i("machineInfo");
            throw null;
        }
        viewPager.setAdapter(new p(cVar, aVar, gVar.f42336b));
        b1Var.f44526g.setupWithViewPager(viewPager);
        View root = b1Var.getRoot();
        root.getClass();
        return root;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/control/i$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
