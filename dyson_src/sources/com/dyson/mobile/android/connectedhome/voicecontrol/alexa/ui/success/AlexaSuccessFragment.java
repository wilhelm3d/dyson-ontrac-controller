package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a;
import com.dyson.mobile.android.resources.view.DysonTextView;
import gm1.am;
import h12.f0;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import hj.e;
import kotlin.Metadata;
import kz.a;
import m9.w;
import nh.k;
import nj.jc;
import nj.nc;
import x1.i;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y9.u;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/success/AlexaSuccessFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlexaSuccessFragment extends Fragment {
    public a.C0397a d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f13165f;

    /* renamed from: g  reason: collision with root package name */
    public final u f13166g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f13167h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class a extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13168f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f13168f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f13168f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13169f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f13170g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w12.a aVar, Fragment fragment) {
            super(0);
            this.f13169f = aVar;
            this.f13170g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13169f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f13170g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13171f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f13171f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f13171f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public d(Fragment fragment) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13172f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f13172f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13172f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13173f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar) {
            super(0);
            this.f13173f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13173f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13174f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar) {
            super(0);
            this.f13174f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13174f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13175f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13176g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, l lVar) {
            super(0);
            this.f13175f = aVar;
            this.f13176g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13175f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13176g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public AlexaSuccessFragment() {
        ia0.a aVar = new ia0.a(this, 14);
        l a13 = m.a(n.NONE, new f(new e(this)));
        q0 q0Var = p0.f86717a;
        this.f13165f = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a.class), new g(a13), aVar, new h(null, a13));
        this.f13166g = new u(q0Var.b(j00.a.class), new d(this));
        this.f13167h = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.a.class), new a(this), new c(this), new b(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        kz.a.f50192c.getClass();
        mz.d dVar = a.C1547a.a(context).f50194b;
        dVar.f55379a.getClass();
        hj.e.f38312g.getClass();
        hj.e a13 = e.a.a();
        pf0.c cVar = dVar.f55380b.get();
        cVar.getClass();
        this.d = new a.C0397a(a13, cVar);
        this.e = dVar.f55380b.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z13 = ((j00.a) this.f13166g.getValue()).f43225a;
        hj.e eVar = ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a) this.f13165f.getValue()).d;
        if (z13) {
            int i13 = nc.f57618a;
            ij.b bVar = new ij.b("voice_control.alexa.unlink_success", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar, null);
            return;
        }
        int i14 = jc.f57550a;
        ij.b bVar2 = new ij.b("voice_control.alexa.link_success", null, 2, null);
        e.a aVar2 = hj.e.f38312g;
        eVar.h(bVar2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f13167h.getValue()).S(false);
        d0 d0Var = this.f13165f;
        am.B(this, ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a) d0Var.getValue()).f13177f);
        xf1.a<f0> aVar = ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a) d0Var.getValue()).e;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar.observe(viewLifecycleOwner, new bu1.c(this, 6));
        int i13 = k.f57263i;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        k kVar = (k) q8.t.inflateInternal(layoutInflater, R.layout.fragment_alexa_success, viewGroup, false, null);
        kVar.l((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a) d0Var.getValue());
        kVar.executePendingBindings();
        if (((j00.a) this.f13166g.getValue()).f43225a) {
            DysonTextView dysonTextView = kVar.f57265g;
            pf0.c cVar = this.e;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            dysonTextView.setText(cVar.c(R.string.voiceControl_alexa_unlinkSuccess));
            kVar.f57264f.setText("");
        }
        View root = kVar.getRoot();
        root.getClass();
        return root;
    }
}
