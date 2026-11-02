package com.dyson.mobile.android.audio.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.settings.a;
import com.dyson.mobile.android.audio.settings.accessories.earcushions.AudioEarCushionActivity;
import com.dyson.mobile.android.audio.settings.filtermanagement.a;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import hj.e;
import hk.e1;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import nj.z0;
import rf0.q;
import se1.e0;
import to.a;
import uo.a;
import v32.y;
import vj.f;
import vo.a;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import ym0.f;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: t  reason: collision with root package name */
    public static final a f12736t = new a(null);
    public fk.d d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f12737f;

    /* renamed from: g  reason: collision with root package name */
    public rf1.e f12738g;

    /* renamed from: h  reason: collision with root package name */
    public String f12739h;

    /* renamed from: i  reason: collision with root package name */
    public vj.f f12740i;

    /* renamed from: j  reason: collision with root package name */
    public final d0 f12741j;

    /* renamed from: k  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f12742k;

    /* renamed from: l  reason: collision with root package name */
    public final C0359b f12743l;

    /* renamed from: m  reason: collision with root package name */
    public final by0.a f12744m;

    /* renamed from: n  reason: collision with root package name */
    public final f f12745n;

    /* renamed from: o  reason: collision with root package name */
    public final c f12746o;
    @SuppressLint({"FunctionCallWithoutNamedArguments"})

    /* renamed from: p  reason: collision with root package name */
    public final by0.b f12747p;

    /* renamed from: q  reason: collision with root package name */
    public final d f12748q;

    /* renamed from: r  reason: collision with root package name */
    public final g f12749r;

    /* renamed from: s  reason: collision with root package name */
    public final e f12750s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/b$b", "Lko/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.settings.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0359b implements ko.a {
        public C0359b() {
        }

        @Override // ko.a
        public final void a() {
            b bVar = b.this;
            ActivityResultLauncher<Intent> activityResultLauncher = bVar.f12742k;
            AudioEarCushionActivity.a aVar = AudioEarCushionActivity.f12710q;
            Context requireContext = bVar.requireContext();
            requireContext.getClass();
            String str = bVar.f12739h;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            AudioEarCushionActivity.a.b bVar2 = AudioEarCushionActivity.a.b.HORIZONTAL;
            AudioEarCushionActivity.a.EnumC0357a enumC0357a = AudioEarCushionActivity.a.EnumC0357a.EAR_CUSHIONS;
            aVar.getClass();
            activityResultLauncher.a(AudioEarCushionActivity.a.a(requireContext, str, bVar2, enumC0357a));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/b$c", "Lwo/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements wo.a {
        public c() {
        }

        @Override // wo.a
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void a() {
            b bVar = b.this;
            String d = bVar.s().d(rf0.f.f71307q1);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            pl0.c cVar = (pl0.c) activity;
            a.C0360a c0360a = com.dyson.mobile.android.audio.settings.filtermanagement.a.f12781k;
            String str = bVar.f12739h;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0360a.getClass();
            com.dyson.mobile.android.audio.settings.filtermanagement.a aVar = new com.dyson.mobile.android.audio.settings.filtermanagement.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            cVar.q1(aVar, d);
        }

        @Override // wo.a
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void c() {
            a.C2408a c2408a = uo.a.f82329h;
            b bVar = b.this;
            String str = bVar.f12739h;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c2408a.getClass();
            uo.a aVar = new uo.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            String d = bVar.s().d(rf0.f.f71307q1);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            ((pl0.c) activity).q1(aVar, d);
        }

        @Override // wo.a
        public final void d(kj.b bVar) {
            b bVar2 = b.this;
            vj.f fVar = bVar2.f12740i;
            if (fVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = bVar2.requireActivity();
            requireActivity.getClass();
            fVar.o(requireActivity, bVar.f47574a, bVar.f47575b);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/b$d", "Lxm0/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements xm0.a {
        public d() {
        }

        @Override // xm0.a
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void a(in0.e eVar) {
            NamingConfig namingConfig = new NamingConfig(null, null, new MachineNamingExtras.PersistName(eVar.e(), eVar.a().f15564l, eVar.a().i(), eVar.g(), eVar.b()), 3, null);
            a.C0356a c0356a = com.dyson.mobile.android.audio.settings.a.f12709f;
            b bVar = b.this;
            String str = bVar.f12739h;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0356a.getClass();
            com.dyson.mobile.android.audio.settings.a aVar = new com.dyson.mobile.android.audio.settings.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("CONFIG", namingConfig);
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            ((pl0.c) activity).q1(aVar, bVar.s().d(q.C0));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/b$e", "Lym0/b;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements ym0.b {
        public e() {
        }

        @Override // ym0.b
        public final void a() {
            b bVar = b.this;
            vj.f fVar = bVar.f12740i;
            if (fVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = bVar.requireActivity();
            requireActivity.getClass();
            fVar.s(requireActivity);
        }

        @Override // ym0.b
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void b(String str) {
            str.getClass();
            om0.b s13 = om0.b.s(str);
            b bVar = b.this;
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            ((pl0.c) activity).q1(s13, bVar.s().d(rf0.f.T0));
        }

        @Override // ym0.b
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void d(wm0.a aVar) {
            a aVar2 = b.f12736t;
            b bVar = b.this;
            uf0.g.a(bVar.getActivity()).getClass();
            ConnectivityIssueActivity.f1(bVar.getActivity(), aVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/b$f", "Lan0/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements an0.a {
        public f() {
        }

        @Override // an0.a
        public final void a() {
            d();
        }

        @Override // an0.a
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void b(String str, String str2, String str3, String str4, a20.a aVar) {
            b bVar = b.this;
            uf0.g a13 = uf0.g.a(bVar.getActivity());
            Context context = bVar.getContext();
            a13.getClass();
            uf0.g.c(context, str, str2, str3, str4, aVar);
        }

        @Override // an0.a
        public final void c() {
            d();
        }

        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void d() {
            b bVar = b.this;
            String d = bVar.s().d(q.D0);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            pl0.c cVar = (pl0.c) activity;
            a.C2325a c2325a = to.a.f79996j;
            String str = bVar.f12739h;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c2325a.getClass();
            to.a aVar = new to.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            cVar.q1(aVar, d);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/b$g", "Lcn0/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements cn0.a {
        public g() {
        }

        @Override // cn0.a
        public final void a() {
        }

        @Override // cn0.a
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void b() {
            a.C2505a c2505a = vo.a.f84721f;
            b bVar = b.this;
            String str = bVar.f12739h;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c2505a.getClass();
            vo.a aVar = new vo.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            ((pl0.c) activity).q1(aVar, bVar.s().d(rf0.f.P0));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12757f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Fragment fragment) {
            super(0);
            this.f12757f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12757f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class i extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12758f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar) {
            super(0);
            this.f12758f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f12758f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class j extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12759f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(l lVar) {
            super(0);
            this.f12759f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f12759f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class k extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12760f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12761g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(w12.a aVar, l lVar) {
            super(0);
            this.f12760f = aVar;
            this.f12761g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12760f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f12761g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public b() {
        ia0.a aVar = new ia0.a(this, 24);
        l a13 = m.a(n.NONE, new i(new h(this)));
        this.f12741j = new d0(p0.f86717a.b(jo.d.class), new j(a13), aVar, new k(null, a13));
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new j.a(), new ji1.k(this, 7));
        registerForActivityResult.getClass();
        this.f12742k = registerForActivityResult;
        this.f12743l = new C0359b();
        this.f12744m = new by0.a(this, 1);
        this.f12745n = new f();
        this.f12746o = new c();
        this.f12747p = new by0.b(this, 1);
        this.f12748q = new d();
        this.f12749r = new g();
        this.f12750s = new e();
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
        ym0.f fVar;
        bundle.getClass();
        Logger.a("Result: " + bundle);
        String string = bundle.getString("RESULT_CODE");
        if (string == null || y.A(string)) {
            return;
        }
        boolean equals = string.equals("EXTRA_RESULT_CODE");
        d0 d0Var = this.f12741j;
        if (equals) {
            String string2 = bundle.getString("EXTRA_MACHINE_LOCATION");
            if (string2 != null && !y.A(string2) && (fVar = ((jo.d) d0Var.getValue()).f45496l) != null) {
                e22.m<Object>[] mVarArr = ym0.f.f90261y;
                fVar.f90270n.onNext(new f.a.c(string2, false));
            }
        } else if (string.equals("CUSTOM_NAME")) {
            String string3 = bundle.getString("NEW_NAME");
            if (string3 != null && !y.A(string3)) {
                ((jo.d) d0Var.getValue()).e.b(string3);
                vj.f fVar2 = this.f12740i;
                if (fVar2 == null) {
                    r.i("coordinator");
                    throw null;
                }
                fVar2.q(string3);
            }
        } else {
            Logger.e("Unknown result code", null);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            vj.f fVar3 = this.f12740i;
            if (fVar3 != null) {
                fVar3.h(activity);
            } else {
                r.i("coordinator");
                throw null;
            }
        }
    }

    @Override // bt0.f.a
    public final void i() {
        int i13 = z0.f57806a;
        ij.b bVar = new ij.b("common.settings.machine", null, 2, null);
        hj.e eVar = this.f12737f;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        this.f12739h = y13;
        vj.f.f84306m.getClass();
        vj.f a13 = f.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12740i = a13;
        gk.a aVar = a13.f84312l;
        this.d = aVar.d();
        this.e = aVar.f();
        this.f12737f = aVar.f35005u0.get();
        this.f12738g = e1.a(aVar.f34911b);
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (!(getActivity() instanceof bt0.f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        int i13 = dk.o0.f24096p;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        dk.o0 o0Var = (dk.o0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_audio_settings, viewGroup, false, null);
        o0Var.getClass();
        jo.d dVar = (jo.d) this.f12741j.getValue();
        an0.f fVar = dVar.d;
        xm0.b bVar = dVar.e;
        bn0.d dVar2 = dVar.f45490f;
        wo.b bVar2 = dVar.f45491g;
        ym0.f fVar2 = dVar.f45496l;
        fVar.f1606g.setValue(fVar, an0.f.f1601k[0], this.f12745n);
        if (bVar2 != null) {
            bVar2.f86276o.setValue(bVar2, wo.b.f86263q[0], this.f12746o);
        }
        dVar2.f8182o.setValue(dVar2, bn0.d.f8169s[0], this.f12747p);
        ko.b bVar3 = dVar.f45492h;
        bVar3.f47774c.setValue(bVar3, ko.b.d[0], this.f12743l);
        zm0.b bVar4 = dVar.f45493i;
        if (bVar4 != null) {
            bVar4.f92880c.setValue(bVar4, zm0.b.d[0], this.f12744m);
        }
        cn0.c cVar = dVar.f45495k;
        if (cVar != null) {
            cVar.f11826c.setValue(cVar, cn0.c.f11823f[0], this.f12749r);
        }
        if (fVar2 != null) {
            fVar2.f90280x.setValue(fVar2, ym0.f.f90261y[0], this.f12750s);
        }
        if (fVar2 != null) {
            rf1.e eVar = this.f12738g;
            if (eVar == null) {
                r.i("dysonPermissionManager");
                throw null;
            }
            ty1.l lVar = new ty1.l(this);
            androidx.fragment.app.e requireActivity = requireActivity();
            requireActivity.getClass();
            eVar.f73038a = lVar;
            eVar.f73039b = requireActivity;
            ym0.a aVar = fVar2.f90265i;
            if (aVar != null) {
                aVar.c(eVar);
            }
        }
        bVar.f87788f.setValue(bVar, xm0.b.f87784h[0], this.f12748q);
        if (fVar2 != null) {
            getLifecycle().a(fVar2);
        }
        fVar.c();
        bVar.a();
        dVar2.e();
        if (bVar2 != null) {
            gz1.b bVar5 = bVar2.e;
            zb.z(bVar5, bVar2.f86264a.a().O(new wm.b(new wo.c(bVar2), 17)));
            bVar5.a(bVar2.f86265b.f64552a.O(new wm.b(new wo.d(bVar2), 18)));
        }
        if (fVar2 != null) {
            fVar2.e(false);
            fVar2.d(false);
        }
        jo.b bVar6 = dVar.f45497m;
        eh0.e<xo.a> eVar2 = bVar6.f45476f;
        boolean c13 = eVar2.d().f87825z.c();
        bVar6.f45483m.l(c13 ? 0 : 8);
        if (c13) {
            gz1.b bVar7 = bVar6.f45481k;
            e0 e0Var = e0.f76037a;
            dz1.r<o60.a> a13 = eVar2.a();
            rz1.r a14 = bVar6.f45477g.a();
            rz1.r rVar = bVar6.f45478h.f42357i;
            dz1.r<fp.b> a15 = eVar2.d().f87817r.a();
            rz1.l p13 = cd.b.p(eVar2.d().f87825z.b());
            cn.i iVar = new cn.i(bVar6, 3);
            e0Var.getClass();
            zb.z(bVar7, e0.b(a13, a14, rVar, a15, p13, iVar).S(c02.a.f10004c).H(fz1.a.a()).N());
        }
        o0Var.l(dVar);
        int i14 = z0.f57806a;
        ij.b bVar8 = new ij.b("common.settings.machine", null, 2, null);
        hj.e eVar3 = this.f12737f;
        if (eVar3 == null) {
            r.i("trackingManager");
            throw null;
        }
        e.a aVar2 = hj.e.f38312g;
        eVar3.h(bVar8, null);
        View root = o0Var.getRoot();
        root.getClass();
        return root;
    }

    public final pf0.c s() {
        pf0.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/b$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
