package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.a;
import com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f20.t4;
import gl.k;
import gm1.am;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m9.w;
import nj.j3;
import x12.p0;
import x12.q0;
import x12.t;
import y9.c0;
import y9.u;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/NonConnectedOwnershipConfirmationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NonConnectedOwnershipConfirmationFragment extends Fragment {
    public b.InterfaceC0436b d;
    public final u e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f13656f;

    /* renamed from: g  reason: collision with root package name */
    public final a f13657g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/NonConnectedOwnershipConfirmationFragment$a", "Li30/c;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements i30.c {
        public a() {
        }

        @Override // i30.c
        public final void a() {
            NonConnectedOwnershipConfirmationFragment nonConnectedOwnershipConfirmationFragment = NonConnectedOwnershipConfirmationFragment.this;
            c0 a13 = androidx.navigation.fragment.a.a(nonConnectedOwnershipConfirmationFragment);
            a.c cVar = com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.a.f13665a;
            String str = nonConnectedOwnershipConfirmationFragment.s().f40623a;
            MachineDescriptor machineDescriptor = nonConnectedOwnershipConfirmationFragment.s().f40624b;
            cVar.getClass();
            a13.i(new a.b(str, machineDescriptor));
        }

        @Override // i30.c
        public final void b() {
            NonConnectedOwnershipConfirmationFragment nonConnectedOwnershipConfirmationFragment = NonConnectedOwnershipConfirmationFragment.this;
            c0 a13 = androidx.navigation.fragment.a.a(nonConnectedOwnershipConfirmationFragment);
            a.c cVar = com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.a.f13665a;
            String str = nonConnectedOwnershipConfirmationFragment.s().f40623a;
            MachineDescriptor machineDescriptor = nonConnectedOwnershipConfirmationFragment.s().f40624b;
            cVar.getClass();
            a13.i(new a.C0435a(str, machineDescriptor));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements w12.a<Fragment> {
        public final /* synthetic */ Fragment d;

        public b(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements w12.a<Bundle> {
        public static final c d = new c();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ w12.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13659f;

        public d(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f13659f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f13659f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13660f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f13660f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13660f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13661f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar) {
            super(0);
            this.f13661f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13661f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13662f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar) {
            super(0);
            this.f13662f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13662f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13663f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13664g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, l lVar) {
            super(0);
            this.f13663f = aVar;
            this.f13664g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13663f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13664g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public i(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Bundle invoke() {
            Fragment fragment = this.d;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            pa.c.w(y.i("Fragment ", fragment, " has null arguments"));
            return null;
        }
    }

    public NonConnectedOwnershipConfirmationFragment() {
        q0 q0Var = p0.f86717a;
        this.e = new u(q0Var.b(i30.b.class), new i(this));
        d dVar = new d(new b(this), c.d, new k(this, 24));
        l a13 = m.a(n.NONE, new f(new e(this)));
        this.f13656f = new d0(q0Var.b(com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b.class), new g(a13), dVar, new h(null, a13));
        this.f13657g = new a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        w00.i.c(requireContext()).e.G(this);
        int i13 = t4.f29351l;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        t4 t4Var = (t4) q8.t.inflateInternal(layoutInflater, R.layout.fragment_non_connected_ownership_confirmation, viewGroup, false, null);
        com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b bVar = (com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b) this.f13656f.getValue();
        am.B(this, bVar.f13673h);
        bVar.f13676k.setValue(bVar, com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b.f13670l[0], this.f13657g);
        t4Var.l(bVar);
        t4Var.e.setContent(new c4.c(98791666, true, new i30.a(this, 0)));
        View root = t4Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i13 = j3.f57541a;
        y9.w.t("connection_journey.ownership.ownership_question", null, 2, null);
    }

    public final i30.b s() {
        return (i30.b) this.e.getValue();
    }
}
