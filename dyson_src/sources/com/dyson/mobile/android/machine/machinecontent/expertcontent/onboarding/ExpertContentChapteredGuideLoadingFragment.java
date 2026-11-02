package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c;
import com.dyson.mobile.android.resources.brightcove.DysonBrightcoveVideoPlayerView;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import f.q;
import h12.f0;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m9.v;
import m9.w;
import pi0.f;
import x12.p;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y9.u;
import z32.g0;
import z32.z;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/ExpertContentChapteredGuideLoadingFragment;", "Lms0/h;", "<init>", "()V", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/i;", PayPalNewShippingAddressReviewViewKt.STATE, "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentChapteredGuideLoadingFragment extends ms0.h {
    public c.a e;

    /* renamed from: f  reason: collision with root package name */
    public uf0.g f15226f;

    /* renamed from: g  reason: collision with root package name */
    public final u f15227g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f15228h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/ExpertContentChapteredGuideLoadingFragment$a", "Lf/q;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends q {
        public a() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            ExpertContentChapteredGuideLoadingFragment.s(ExpertContentChapteredGuideLoadingFragment.this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<pi0.f, f0> {
        public b(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c.class, "onUiEvent", "onUiEvent(Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/UiEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(pi0.f fVar) {
            pi0.f fVar2 = fVar;
            fVar2.getClass();
            com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c cVar = (com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c) this.receiver;
            cVar.getClass();
            if (fVar2 instanceof f.a) {
                g0.r(v.a(cVar), null, null, new com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.e(cVar, null), 3);
            } else if (!(fVar2 instanceof f.b)) {
                ma.e.o();
                return null;
            } else {
                g0.r(v.a(cVar), new pi0.d(z.Z0, cVar), null, new com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.d(cVar, null), 2);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements w12.a<Fragment> {
        public final /* synthetic */ Fragment d;

        public c(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements w12.a<Bundle> {
        public static final d d = new d();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ w12.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f15229f;

        public e(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f15229f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f15229f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f15230f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f15230f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f15230f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15231f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar) {
            super(0);
            this.f15231f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f15231f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f15232f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l lVar) {
            super(0);
            this.f15232f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f15232f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class i extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15233f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f15234g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, l lVar) {
            super(0);
            this.f15233f = aVar;
            this.f15234g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15233f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f15234g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public j(Fragment fragment) {
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

    public ExpertContentChapteredGuideLoadingFragment() {
        q0 q0Var = p0.f86717a;
        this.f15227g = new u(q0Var.b(pi0.a.class), new j(this));
        e eVar = new e(new c(this), d.d, new oc0.c(this, 23));
        l a13 = m.a(n.NONE, new g(new f(this)));
        this.f15228h = new d0(q0Var.b(com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c.class), new h(a13), eVar, new i(null, a13));
    }

    public static final void s(ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment) {
        if (!expertContentChapteredGuideLoadingFragment.t().d) {
            expertContentChapteredGuideLoadingFragment.requireActivity().finish();
            return;
        }
        uf0.g gVar = expertContentChapteredGuideLoadingFragment.f15226f;
        if (gVar == null) {
            r.i("machineCoordinator");
            throw null;
        }
        androidx.fragment.app.e requireActivity = expertContentChapteredGuideLoadingFragment.requireActivity();
        String str = expertContentChapteredGuideLoadingFragment.t().f64171a;
        in0.f fVar = gVar.f81923b.get();
        if (fVar != null) {
            fVar.d(requireActivity, str);
        }
    }

    @Override // ms0.h, com.brightcove.player.appcompat.BrightcovePlayerFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        uf0.g a13 = uf0.g.a(getContext());
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.f15226f = a13;
        this.e = (c.a) a13.f81922a.E0.f88315a;
        getLifecycle().a((com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c) this.f15228h.getValue());
        Context requireContext = requireContext();
        requireContext.getClass();
        this.d = new DysonBrightcoveVideoPlayerView(requireContext, null, 0, 6, null);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        g0.r(i3.n.o(viewLifecycleOwner), null, null, new com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.a(this, null), 3);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        onBackPressedDispatcher.a(requireActivity, new a());
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        ComposeView composeView = new ComposeView(requireContext2, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(715698880, true, new n71.a(this, 14)));
        return composeView;
    }

    @Override // ms0.h, com.brightcove.player.appcompat.BrightcovePlayerFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c((com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.c) this.f15228h.getValue());
    }

    public final pi0.a t() {
        return (pi0.a) this.f15227g.getValue();
    }
}
