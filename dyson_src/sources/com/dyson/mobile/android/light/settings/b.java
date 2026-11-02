package com.dyson.mobile.android.light.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.Lifecycle;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.settings.a;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import fm1.o0;
import hf0.a;
import je0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import le0.n1;
import le0.q0;
import le0.u1;
import og0.d;
import qh.l0;
import qh.w;
import rf0.i0;
import uf0.g;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/settings/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: l  reason: collision with root package name */
    public static final a f15052l = new a(null);
    public gf0.a d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public og0.a f15053f;

    /* renamed from: g  reason: collision with root package name */
    public String f15054g;

    /* renamed from: h  reason: collision with root package name */
    public yd0.c f15055h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15056i;

    /* renamed from: j  reason: collision with root package name */
    public final c f15057j = new c();

    /* renamed from: k  reason: collision with root package name */
    public final C0505b f15058k = new C0505b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/settings/b$b", "Lan0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.settings.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0505b implements an0.a {
        public C0505b() {
        }

        @Override // an0.a
        public final void a() {
            d(true);
        }

        @Override // an0.a
        public final void b(String str, String str2, String str3, String str4, a20.a aVar) {
            b bVar = b.this;
            g a13 = g.a(bVar.getActivity());
            Context context = bVar.getContext();
            a13.getClass();
            g.c(context, str, str2, str3, str4, aVar);
        }

        @Override // an0.a
        public final void c() {
            d(false);
        }

        public final void d(boolean z13) {
            b bVar = b.this;
            pf0.c cVar = bVar.e;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            og0.a aVar = bVar.f15053f;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            String d = cVar.d(aVar.b(d.light_removeTitle));
            e activity = bVar.getActivity();
            activity.getClass();
            pl0.c cVar2 = (pl0.c) activity;
            a.C1200a c1200a = hf0.a.f38186i;
            String str = bVar.f15054g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c1200a.getClass();
            hf0.a aVar2 = new hf0.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putBoolean("EXTRA_USER_IS_OWNER", z13);
            aVar2.setArguments(bundle);
            cVar2.q1(aVar2, d);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/settings/b$c", "Lxm0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements xm0.a {
        public c() {
        }

        @Override // xm0.a
        public final void a(in0.e eVar) {
            NamingConfig namingConfig = new NamingConfig(null, null, new MachineNamingExtras.PersistName(eVar.e(), eVar.a().f15564l, eVar.a().i(), eVar.g(), eVar.b()), 3, null);
            a.C0504a c0504a = com.dyson.mobile.android.light.settings.a.f15049k;
            b bVar = b.this;
            String str = bVar.f15054g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0504a.getClass();
            com.dyson.mobile.android.light.settings.a aVar = new com.dyson.mobile.android.light.settings.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("CONFIG", namingConfig);
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            e activity = bVar.getActivity();
            activity.getClass();
            pl0.c cVar = (pl0.c) activity;
            pf0.c cVar2 = bVar.e;
            if (cVar2 != null) {
                cVar.q1(aVar, cVar2.d(i0.A4));
            } else {
                r.i("localisationManager");
                throw null;
            }
        }
    }

    @Override // bt0.f.a
    public final void b() {
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(4);
        }
    }

    @Override // bt0.f.a
    public final void f(Bundle bundle) {
        bundle.getClass();
        Logger.a("Result: " + bundle);
        String string = bundle.getString("RESULT_CODE");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (r.c(string, "MACHINE_NAME")) {
            String string2 = bundle.getString("NEW_NAME");
            if (string2 != null && string2.length() != 0) {
                gf0.a aVar = this.d;
                if (aVar == null) {
                    r.i("viewModel");
                    throw null;
                }
                aVar.f34666l.b(string2);
                yd0.c cVar = this.f15055h;
                if (cVar == null) {
                    r.i("coordinator");
                    throw null;
                }
                in0.f g13 = cVar.g();
                if (g13 != null) {
                    g13.b(cVar.f89776g.f89772b, string2);
                }
            }
        } else {
            Logger.e("Unknown result code", null);
        }
        e activity = getActivity();
        if (activity != null) {
            yd0.c cVar2 = this.f15055h;
            if (cVar2 != null) {
                cVar2.h(activity);
            } else {
                r.i("coordinator");
                throw null;
            }
        }
    }

    @Override // bt0.f.a
    public final void i() {
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(1);
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
        Bundle a13 = b13.a("COORDINATOR_ID", "EXTRAS_IS_CONNECTED");
        String y13 = o0.y("COORDINATOR_ID", a13);
        this.f15054g = y13;
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.f15055h = a14;
        ke0.d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        le0.a aVar = dVar.f47424b;
        w a15 = new l0(aVar.f51576a).a();
        a15.getClass();
        this.d = u1.a(n1Var, q0.a(aVar), j0.a(aVar), dVar.T.get(), dVar.U.get(), dVar.V.get(), dVar.W.get(), dVar.Q.get(), a15, dVar.c());
        this.e = j0.a(aVar);
        this.f15053f = dVar.c();
        this.f15056i = a13.getBoolean("EXTRAS_IS_CONNECTED");
        z0 z0Var = (z0) q8.g.c(layoutInflater, R.layout.fragment_light_settings, viewGroup, false, null);
        gf0.a aVar2 = this.d;
        if (aVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        an0.f fVar = aVar2.f34668n;
        xm0.b bVar = aVar2.f34666l;
        bVar.f87788f.setValue(bVar, xm0.b.f87784h[0], this.f15057j);
        fVar.f1606g.setValue(fVar, an0.f.f1601k[0], this.f15058k);
        boolean z13 = this.f15056i;
        bVar.a();
        if0.a aVar3 = aVar2.f34667m;
        aVar3.e();
        aVar3.f41620v = z13;
        if (z13) {
            aVar3.f8184q.a(aVar3.f41619u.Y().p(new ie0.b(new id0.d(aVar3, 4), 8), kz1.a.e));
        }
        fVar.c();
        getLifecycle().a(aVar2);
        z0Var.l(aVar2);
        return z0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle lifecycle = getLifecycle();
        gf0.a aVar = this.d;
        if (aVar != null) {
            lifecycle.c(aVar);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/settings/b$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
