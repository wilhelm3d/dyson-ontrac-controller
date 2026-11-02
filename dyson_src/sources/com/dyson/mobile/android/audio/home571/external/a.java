package com.dyson.mobile.android.audio.home571.external;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.audio.home571.external.a;
import com.dyson.mobile.android.machine.ui.settings.location.MachineLocationActivity;
import dk.s0;
import e71.n;
import ew0.k;
import fm1.o0;
import gf1.j;
import h12.f0;
import h12.h;
import h12.l;
import h12.n;
import hk.e1;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import m9.w;
import rf0.i0;
import vj.f;
import we1.a;
import x12.m;
import x12.p0;
import x12.r;
import x12.t;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/external/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: i  reason: collision with root package name */
    public static final C0352a f12601i = new C0352a(null);
    public fk.d d;
    public rf1.e e;

    /* renamed from: f  reason: collision with root package name */
    public v60.a f12602f;

    /* renamed from: g  reason: collision with root package name */
    public vj.f f12603g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f12604h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements p, m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof m)) {
                return r.c(d(), ((m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12605f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f12605f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12605f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12606f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f12606f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f12606f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12607f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f12607f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f12607f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12608f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12609g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f12608f = aVar;
            this.f12609g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12608f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f12609g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        k kVar = new k(this, 24);
        l a13 = h12.m.a(n.NONE, new d(new c(this)));
        this.f12604h = new d0(p0.f86717a.b(gm.h.class), new e(a13), kVar, new f(null, a13));
        registerForActivityResult(new j.a(), new j(this, 21));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        vj.f.f84306m.getClass();
        vj.f a13 = f.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12603g = a13;
        gk.a aVar = a13.f84312l;
        this.d = aVar.d();
        this.e = e1.a(aVar.f34911b);
        this.f12602f = aVar.g();
        getLifecycle().a(s());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = s0.f24183k;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        s0 s0Var = (s0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_auto_update_external_location_prerequisite, viewGroup, false, null);
        s0Var.getClass();
        s0Var.l(s());
        gm.h s13 = s();
        rf1.e eVar = this.e;
        if (eVar == null) {
            r.i("dysonPermissionManager");
            throw null;
        }
        ty1.l lVar = new ty1.l(this);
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        eVar.f73038a = lVar;
        eVar.f73039b = requireActivity;
        s13.f35209f.setValue(s13, gm.h.f35208o[0], eVar);
        xf1.a<f0> aVar = s().f35211h;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar.observe(viewLifecycleOwner, new b(new Function1(this) { // from class: gm.g
            public final /* synthetic */ com.dyson.mobile.android.audio.home571.external.a e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i14 = r2;
                com.dyson.mobile.android.audio.home571.external.a aVar2 = this.e;
                switch (i14) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        a.C0352a c0352a = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar2.requireActivity().finish();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        a.C0352a c0352a2 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        e.a a13 = new zs0.e(aVar2.getContext()).a();
                        a13.f93107a = pf0.f.c(i0.f71737lb);
                        a13.f93108b = pf0.f.c(i0.f71753mb);
                        a13.c(pf0.f.c(i0.f71695j), new a20.a(aVar2, 10));
                        a13.b(pf0.f.c(i0.E8), null);
                        a13.a().show();
                        return f0.f36844a;
                    case 2:
                        f0 f0Var3 = (f0) obj;
                        a.C0352a c0352a3 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar2.requireActivity().finish();
                        vj.f fVar = aVar2.f12603g;
                        if (fVar == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity2 = aVar2.requireActivity();
                        requireActivity2.getClass();
                        MachineLocationActivity.a aVar3 = MachineLocationActivity.f15413r;
                        String str = fVar.f84308h;
                        aVar3.getClass();
                        str.getClass();
                        Intent putExtra = new Intent(requireActivity2, MachineLocationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("extraTheme", 2132083504);
                        putExtra.getClass();
                        requireActivity2.startActivity(putExtra);
                        return f0.f36844a;
                    case 3:
                        f0 f0Var4 = (f0) obj;
                        v60.a aVar4 = aVar2.f12602f;
                        if (aVar4 == null) {
                            r.i("locationServicesHelper");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity3 = aVar2.requireActivity();
                        requireActivity3.getClass();
                        aVar4.c(requireActivity3);
                        return f0.f36844a;
                    default:
                        ExternalLinkTracking externalLinkTracking = (ExternalLinkTracking) obj;
                        a.C0352a c0352a4 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        externalLinkTracking.getClass();
                        vj.f fVar2 = aVar2.f12603g;
                        if (fVar2 == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity4 = aVar2.requireActivity();
                        requireActivity4.getClass();
                        e71.n.f26183r.getClass();
                        URL a14 = n.a.a().c().a();
                        u71.a aVar5 = fVar2.f84309i;
                        if (aVar5 != null) {
                            aVar5.b(requireActivity4, String.valueOf(a14), externalLinkTracking);
                            return f0.f36844a;
                        }
                        r.i("externalLinkOpener");
                        throw null;
                }
            }
        }));
        xf1.a<f0> aVar2 = s().f35212i;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        aVar2.observe(viewLifecycleOwner2, new b(new Function1(this) { // from class: gm.g
            public final /* synthetic */ com.dyson.mobile.android.audio.home571.external.a e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i14 = r2;
                com.dyson.mobile.android.audio.home571.external.a aVar22 = this.e;
                switch (i14) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        a.C0352a c0352a = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        a.C0352a c0352a2 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        e.a a13 = new zs0.e(aVar22.getContext()).a();
                        a13.f93107a = pf0.f.c(i0.f71737lb);
                        a13.f93108b = pf0.f.c(i0.f71753mb);
                        a13.c(pf0.f.c(i0.f71695j), new a20.a(aVar22, 10));
                        a13.b(pf0.f.c(i0.E8), null);
                        a13.a().show();
                        return f0.f36844a;
                    case 2:
                        f0 f0Var3 = (f0) obj;
                        a.C0352a c0352a3 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        vj.f fVar = aVar22.f12603g;
                        if (fVar == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity2 = aVar22.requireActivity();
                        requireActivity2.getClass();
                        MachineLocationActivity.a aVar3 = MachineLocationActivity.f15413r;
                        String str = fVar.f84308h;
                        aVar3.getClass();
                        str.getClass();
                        Intent putExtra = new Intent(requireActivity2, MachineLocationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("extraTheme", 2132083504);
                        putExtra.getClass();
                        requireActivity2.startActivity(putExtra);
                        return f0.f36844a;
                    case 3:
                        f0 f0Var4 = (f0) obj;
                        v60.a aVar4 = aVar22.f12602f;
                        if (aVar4 == null) {
                            r.i("locationServicesHelper");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity3 = aVar22.requireActivity();
                        requireActivity3.getClass();
                        aVar4.c(requireActivity3);
                        return f0.f36844a;
                    default:
                        ExternalLinkTracking externalLinkTracking = (ExternalLinkTracking) obj;
                        a.C0352a c0352a4 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        externalLinkTracking.getClass();
                        vj.f fVar2 = aVar22.f12603g;
                        if (fVar2 == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity4 = aVar22.requireActivity();
                        requireActivity4.getClass();
                        e71.n.f26183r.getClass();
                        URL a14 = n.a.a().c().a();
                        u71.a aVar5 = fVar2.f84309i;
                        if (aVar5 != null) {
                            aVar5.b(requireActivity4, String.valueOf(a14), externalLinkTracking);
                            return f0.f36844a;
                        }
                        r.i("externalLinkOpener");
                        throw null;
                }
            }
        }));
        xf1.a<f0> aVar3 = s().f35210g;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        aVar3.observe(viewLifecycleOwner3, new b(new Function1(this) { // from class: gm.g
            public final /* synthetic */ com.dyson.mobile.android.audio.home571.external.a e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i14 = r2;
                com.dyson.mobile.android.audio.home571.external.a aVar22 = this.e;
                switch (i14) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        a.C0352a c0352a = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        a.C0352a c0352a2 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        e.a a13 = new zs0.e(aVar22.getContext()).a();
                        a13.f93107a = pf0.f.c(i0.f71737lb);
                        a13.f93108b = pf0.f.c(i0.f71753mb);
                        a13.c(pf0.f.c(i0.f71695j), new a20.a(aVar22, 10));
                        a13.b(pf0.f.c(i0.E8), null);
                        a13.a().show();
                        return f0.f36844a;
                    case 2:
                        f0 f0Var3 = (f0) obj;
                        a.C0352a c0352a3 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        vj.f fVar = aVar22.f12603g;
                        if (fVar == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity2 = aVar22.requireActivity();
                        requireActivity2.getClass();
                        MachineLocationActivity.a aVar32 = MachineLocationActivity.f15413r;
                        String str = fVar.f84308h;
                        aVar32.getClass();
                        str.getClass();
                        Intent putExtra = new Intent(requireActivity2, MachineLocationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("extraTheme", 2132083504);
                        putExtra.getClass();
                        requireActivity2.startActivity(putExtra);
                        return f0.f36844a;
                    case 3:
                        f0 f0Var4 = (f0) obj;
                        v60.a aVar4 = aVar22.f12602f;
                        if (aVar4 == null) {
                            r.i("locationServicesHelper");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity3 = aVar22.requireActivity();
                        requireActivity3.getClass();
                        aVar4.c(requireActivity3);
                        return f0.f36844a;
                    default:
                        ExternalLinkTracking externalLinkTracking = (ExternalLinkTracking) obj;
                        a.C0352a c0352a4 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        externalLinkTracking.getClass();
                        vj.f fVar2 = aVar22.f12603g;
                        if (fVar2 == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity4 = aVar22.requireActivity();
                        requireActivity4.getClass();
                        e71.n.f26183r.getClass();
                        URL a14 = n.a.a().c().a();
                        u71.a aVar5 = fVar2.f84309i;
                        if (aVar5 != null) {
                            aVar5.b(requireActivity4, String.valueOf(a14), externalLinkTracking);
                            return f0.f36844a;
                        }
                        r.i("externalLinkOpener");
                        throw null;
                }
            }
        }));
        xf1.a<f0> aVar4 = s().f35213j;
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        aVar4.observe(viewLifecycleOwner4, new b(new Function1(this) { // from class: gm.g
            public final /* synthetic */ com.dyson.mobile.android.audio.home571.external.a e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i14 = r2;
                com.dyson.mobile.android.audio.home571.external.a aVar22 = this.e;
                switch (i14) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        a.C0352a c0352a = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        a.C0352a c0352a2 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        e.a a13 = new zs0.e(aVar22.getContext()).a();
                        a13.f93107a = pf0.f.c(i0.f71737lb);
                        a13.f93108b = pf0.f.c(i0.f71753mb);
                        a13.c(pf0.f.c(i0.f71695j), new a20.a(aVar22, 10));
                        a13.b(pf0.f.c(i0.E8), null);
                        a13.a().show();
                        return f0.f36844a;
                    case 2:
                        f0 f0Var3 = (f0) obj;
                        a.C0352a c0352a3 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        vj.f fVar = aVar22.f12603g;
                        if (fVar == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity2 = aVar22.requireActivity();
                        requireActivity2.getClass();
                        MachineLocationActivity.a aVar32 = MachineLocationActivity.f15413r;
                        String str = fVar.f84308h;
                        aVar32.getClass();
                        str.getClass();
                        Intent putExtra = new Intent(requireActivity2, MachineLocationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("extraTheme", 2132083504);
                        putExtra.getClass();
                        requireActivity2.startActivity(putExtra);
                        return f0.f36844a;
                    case 3:
                        f0 f0Var4 = (f0) obj;
                        v60.a aVar42 = aVar22.f12602f;
                        if (aVar42 == null) {
                            r.i("locationServicesHelper");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity3 = aVar22.requireActivity();
                        requireActivity3.getClass();
                        aVar42.c(requireActivity3);
                        return f0.f36844a;
                    default:
                        ExternalLinkTracking externalLinkTracking = (ExternalLinkTracking) obj;
                        a.C0352a c0352a4 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        externalLinkTracking.getClass();
                        vj.f fVar2 = aVar22.f12603g;
                        if (fVar2 == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity4 = aVar22.requireActivity();
                        requireActivity4.getClass();
                        e71.n.f26183r.getClass();
                        URL a14 = n.a.a().c().a();
                        u71.a aVar5 = fVar2.f84309i;
                        if (aVar5 != null) {
                            aVar5.b(requireActivity4, String.valueOf(a14), externalLinkTracking);
                            return f0.f36844a;
                        }
                        r.i("externalLinkOpener");
                        throw null;
                }
            }
        }));
        xf1.a<ExternalLinkTracking> aVar5 = s().f35214k;
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        aVar5.observe(viewLifecycleOwner5, new b(new Function1(this) { // from class: gm.g
            public final /* synthetic */ com.dyson.mobile.android.audio.home571.external.a e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i14 = r2;
                com.dyson.mobile.android.audio.home571.external.a aVar22 = this.e;
                switch (i14) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        a.C0352a c0352a = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        a.C0352a c0352a2 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        e.a a13 = new zs0.e(aVar22.getContext()).a();
                        a13.f93107a = pf0.f.c(i0.f71737lb);
                        a13.f93108b = pf0.f.c(i0.f71753mb);
                        a13.c(pf0.f.c(i0.f71695j), new a20.a(aVar22, 10));
                        a13.b(pf0.f.c(i0.E8), null);
                        a13.a().show();
                        return f0.f36844a;
                    case 2:
                        f0 f0Var3 = (f0) obj;
                        a.C0352a c0352a3 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        aVar22.requireActivity().finish();
                        vj.f fVar = aVar22.f12603g;
                        if (fVar == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity2 = aVar22.requireActivity();
                        requireActivity2.getClass();
                        MachineLocationActivity.a aVar32 = MachineLocationActivity.f15413r;
                        String str = fVar.f84308h;
                        aVar32.getClass();
                        str.getClass();
                        Intent putExtra = new Intent(requireActivity2, MachineLocationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("extraTheme", 2132083504);
                        putExtra.getClass();
                        requireActivity2.startActivity(putExtra);
                        return f0.f36844a;
                    case 3:
                        f0 f0Var4 = (f0) obj;
                        v60.a aVar42 = aVar22.f12602f;
                        if (aVar42 == null) {
                            r.i("locationServicesHelper");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity3 = aVar22.requireActivity();
                        requireActivity3.getClass();
                        aVar42.c(requireActivity3);
                        return f0.f36844a;
                    default:
                        ExternalLinkTracking externalLinkTracking = (ExternalLinkTracking) obj;
                        a.C0352a c0352a4 = com.dyson.mobile.android.audio.home571.external.a.f12601i;
                        externalLinkTracking.getClass();
                        vj.f fVar2 = aVar22.f12603g;
                        if (fVar2 == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        androidx.fragment.app.e requireActivity4 = aVar22.requireActivity();
                        requireActivity4.getClass();
                        e71.n.f26183r.getClass();
                        URL a14 = n.a.a().c().a();
                        u71.a aVar52 = fVar2.f84309i;
                        if (aVar52 != null) {
                            aVar52.b(requireActivity4, String.valueOf(a14), externalLinkTracking);
                            return f0.f36844a;
                        }
                        r.i("externalLinkOpener");
                        throw null;
                }
            }
        }));
        View root = s0Var.getRoot();
        root.getClass();
        return root;
    }

    public final gm.h s() {
        return (gm.h) this.f12604h.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/external/a$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home571.external.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0352a {
        public /* synthetic */ C0352a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0352a() {
        }
    }
}
