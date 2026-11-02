package com.dyson.mobile.android.machine.machinecontent.expertcontent.detail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import b42.n;
import c42.f2;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.a;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import h12.f0;
import h12.l;
import h12.r;
import h12.y;
import hj.e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lj.a;
import m9.w;
import mj.m;
import nj.k7;
import x12.p;
import x12.p0;
import x12.q0;
import x12.t;
import y9.u;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/ExpertContentDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$d;", "expertContentDetailsUiState", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g;", "videoState", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentDetailFragment extends Fragment {
    public c.InterfaceC0511c d;
    public uf0.g e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f15170f;

    /* renamed from: g  reason: collision with root package name */
    public final u f15171g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f15172h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e;", "navigationEvent", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.ExpertContentDetailFragment$onCreateView$1$1$1$1$1$1", f = "ExpertContentDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class a extends n12.i implements Function2<c.e, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public a(l12.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c.e eVar, l12.d<? super f0> dVar) {
            return ((a) create(eVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            c.e eVar = (c.e) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = eVar instanceof c.e.a;
            ExpertContentDetailFragment expertContentDetailFragment = ExpertContentDetailFragment.this;
            if (z13) {
                a.b bVar = com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.a.f15179a;
                ExpertContentVideoPlaylist expertContentVideoPlaylist = ((c.e.a) eVar).f15201a;
                String str = expertContentDetailFragment.s().f60261c;
                bVar.getClass();
                androidx.navigation.fragment.a.a(expertContentDetailFragment).i(new a.C0510a(expertContentVideoPlaylist, str));
            } else if (x12.r.c(eVar, c.e.b.f15202a)) {
                expertContentDetailFragment.requireActivity().getOnBackPressedDispatcher().d();
            } else if (!(eVar instanceof c.e.C0512c)) {
                ma.e.o();
                return null;
            } else if (expertContentDetailFragment.e == null) {
                x12.r.i("machineCoordinator");
                throw null;
            } else {
                androidx.fragment.app.e requireActivity = expertContentDetailFragment.requireActivity();
                kj.b bVar2 = ((c.e.C0512c) eVar).f15203a;
                new e71.j().e(requireActivity, bVar2.f47574a, bVar2.f47575b);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<c.f, f0> {
        public b(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c.class, "onUiEvent", "onUiEvent(Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/ExpertContentDetailViewModel$UiEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(c.f fVar) {
            c.f fVar2 = fVar;
            fVar2.getClass();
            com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c cVar = (com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c) this.receiver;
            f2 f2Var = cVar.f15188k;
            b42.c cVar2 = cVar.f15192o;
            if (fVar2.equals(c.f.a.f15204a)) {
                n.a(cVar2.h(c.e.b.f15202a));
            } else if (fVar2.equals(c.f.C0513c.f15206a)) {
                c.d dVar = (c.d) f2Var.getValue();
                if (dVar instanceof com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.d) {
                    int i13 = com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c.f15182t;
                    cVar2.h(new c.e.a(((com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.d) dVar).e));
                    f0 f0Var = f0.f36844a;
                }
            } else if (fVar2.equals(c.f.d.f15207a)) {
                cVar.S();
            } else if (fVar2 instanceof c.f.C0514f) {
                l2.b bVar = new l2.b(23, cVar, fVar2);
                c.g gVar = (c.g) cVar.f15190m.getValue();
                if (gVar instanceof c.g.C0515c) {
                    bVar.invoke(gVar);
                }
            } else if (fVar2.equals(c.f.e.f15208a)) {
                c.d dVar2 = (c.d) f2Var.getValue();
                if (dVar2 instanceof com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.e) {
                    cVar.T(((com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.e) dVar2).e);
                    f0 f0Var2 = f0.f36844a;
                }
            } else if (!fVar2.equals(c.f.b.f15205a)) {
                ma.e.o();
                return null;
            } else {
                c.d dVar3 = (c.d) cVar.f15188k.getValue();
                if (dVar3 instanceof com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.e) {
                    int i14 = com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c.f15182t;
                    c.b bVar2 = ((com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.e) dVar3).d;
                    if (bVar2 != null) {
                        String str = bVar2.f15197a;
                        m.a aVar = m.a.EXPERT_CONTENT;
                        a.h.f52154a.getClass();
                        cVar2.h(new c.e.C0512c(new kj.b(str, new ExternalLinkTracking("video_cta", aVar, null, s72.a.i(a.h.f52155b.f41702a, cVar.f15187j), 4, null))));
                    }
                    f0 f0Var3 = f0.f36844a;
                }
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
        public final /* synthetic */ Function1 f15173f;

        public e(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f15173f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f15173f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f15174f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f15174f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f15174f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15175f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar) {
            super(0);
            this.f15175f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f15175f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f15176f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l lVar) {
            super(0);
            this.f15176f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f15176f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class i extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15177f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f15178g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, l lVar) {
            super(0);
            this.f15177f = aVar;
            this.f15178g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15177f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f15178g.getValue();
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

    public ExpertContentDetailFragment() {
        q0 q0Var = p0.f86717a;
        this.f15171g = new u(q0Var.b(oi0.b.class), new j(this));
        e eVar = new e(new c(this), d.d, new oc0.c(this, 3));
        l a13 = h12.m.a(h12.n.NONE, new g(new f(this)));
        this.f15172h = new d0(q0Var.b(com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c.class), new h(a13), eVar, new i(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        uf0.g a13 = uf0.g.a(getContext());
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.e = a13;
        sg0.b bVar = a13.f81922a;
        this.d = (c.InterfaceC0511c) bVar.C0.f88315a;
        tg0.j jVar = bVar.f76088b;
        bk0.f fVar = bVar.C.get();
        jVar.getClass();
        fVar.getClass();
        this.f15170f = new vf0.a(fVar).a(s().f60261c);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(-1177109154, true, new oi0.a(this, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f15170f;
        if (eVar == null) {
            x12.r.i("trackingManager");
            throw null;
        }
        String str = s().f60260b;
        int i13 = k7.f57562a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a.h.f52154a.getClass();
        ij.b e13 = ma.e.e(linkedHashMap, a.h.f52155b, str, "machine.expert_content.item", linkedHashMap);
        e.a aVar = hj.e.f38312g;
        eVar.h(e13, null);
    }

    public final oi0.b s() {
        return (oi0.b) this.f15171g.getValue();
    }
}
