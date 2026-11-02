package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking;

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
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.AlexaLinkingFragment;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.a;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b;
import gm1.am;
import h12.f0;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz.a;
import m9.p;
import m9.w;
import x12.p0;
import x12.q0;
import x12.t;
import y9.c0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/linking/AlexaLinkingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lg00/b;", "args", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlexaLinkingFragment extends Fragment {
    public b.InterfaceC0390b d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f13103f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class a extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13104f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f13104f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return x1.i.b(this.f13104f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13105f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f13106g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w12.a aVar, Fragment fragment) {
            super(0);
            this.f13105f = aVar;
            this.f13106g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13105f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? x1.i.c(this.f13106g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13107f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f13107f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return x1.i.a(this.f13107f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements w12.a<Fragment> {
        public final /* synthetic */ Fragment d;

        public d(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements w12.a<Bundle> {
        public static final e d = new e();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ w12.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13108f;

        public f(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f13108f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f13108f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13109f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f13109f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13109f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13110f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar) {
            super(0);
            this.f13110f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13110f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class i extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13111f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(l lVar) {
            super(0);
            this.f13111f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13111f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class j extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13112f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13113g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w12.a aVar, l lVar) {
            super(0);
            this.f13112f = aVar;
            this.f13113g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13112f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13113g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class k implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public k(Fragment fragment) {
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

    public AlexaLinkingFragment() {
        f fVar = new f(new d(this), e.d, new em0.c(this, 21));
        l a13 = m.a(n.NONE, new h(new g(this)));
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b.class), new i(a13), fVar, new j(null, a13));
        this.f13103f = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.a.class), new a(this), new c(this), new b(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        kz.a.f50192c.getClass();
        this.d = (b.InterfaceC0390b) a.C1547a.a(context).f50194b.f55385i.f88315a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f13103f.getValue()).S(false);
        d0 d0Var = this.e;
        am.B(this, ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b) d0Var.getValue()).f13121g);
        xf1.a<f0> aVar = ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b) d0Var.getValue()).e;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar.observe(viewLifecycleOwner, new p(this) { // from class: g00.a
            public final /* synthetic */ AlexaLinkingFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLinkingFragment alexaLinkingFragment = this.e;
                switch (i13) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLinkingFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.a.f13114a.getClass();
                        a13.i(new a.b(false));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLinkingFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.a.f13114a.getClass();
                        a14.i(new a.C0389a(alexaError, false));
                        return;
                }
            }
        });
        xf1.a<AlexaError> aVar2 = ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b) d0Var.getValue()).f13120f;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        aVar2.observe(viewLifecycleOwner2, new p(this) { // from class: g00.a
            public final /* synthetic */ AlexaLinkingFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLinkingFragment alexaLinkingFragment = this.e;
                switch (i13) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLinkingFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.a.f13114a.getClass();
                        a13.i(new a.b(false));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLinkingFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.a.f13114a.getClass();
                        a14.i(new a.C0389a(alexaError, false));
                        return;
                }
            }
        });
        int i13 = nh.g.f57257f;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        View root = ((nh.g) q8.t.inflateInternal(layoutInflater, R.layout.fragment_alexa_linking, viewGroup, false, null)).getRoot();
        root.getClass();
        return root;
    }
}
