package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.AlexaLandingScreenFragment;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b;
import ew0.k;
import gm1.am;
import h12.f0;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kz.a;
import m9.p;
import m9.w;
import x1.i;
import x12.p0;
import x12.q0;
import x12.t;
import y9.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/landingscreen/AlexaLandingScreenFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlexaLandingScreenFragment extends Fragment {
    public b.C0388b d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f13061f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class a extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13062f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f13062f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f13062f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13063f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f13064g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w12.a aVar, Fragment fragment) {
            super(0);
            this.f13063f = aVar;
            this.f13064g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13063f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f13064g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13065f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f13065f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f13065f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13066f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f13066f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13066f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar) {
            super(0);
            this.f13067f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13067f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.f13068f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13068f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13069f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13070g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, l lVar) {
            super(0);
            this.f13069f = aVar;
            this.f13070g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13069f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13070g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public AlexaLandingScreenFragment() {
        k kVar = new k(this, 4);
        l a13 = m.a(n.NONE, new e(new d(this)));
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b.class), new f(a13), kVar, new g(null, a13));
        this.f13061f = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.a.class), new a(this), new c(this), new b(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        kz.a.f50192c.getClass();
        this.d = a.C1547a.a(context).f50194b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f13061f.getValue()).S(true);
        am.B(this, s().f13083h);
        xf1.a<Uri> aVar = s().f13086k;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar.observe(viewLifecycleOwner, new p(this) { // from class: f00.a
            public final /* synthetic */ AlexaLandingScreenFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLandingScreenFragment alexaLandingScreenFragment = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        uri.getClass();
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a13.i(new a.b(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        uri2.getClass();
                        alexaLandingScreenFragment.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    case 2:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a14.i(new a.C0387a(alexaError, false));
                        return;
                    case 3:
                        ((f0) obj).getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.d(true));
                        return;
                    default:
                        AlexaError alexaError2 = (AlexaError) obj;
                        alexaError2.getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.c(alexaError2, true));
                        return;
                }
            }
        });
        xf1.a<Uri> aVar2 = s().f13087l;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        aVar2.observe(viewLifecycleOwner2, new p(this) { // from class: f00.a
            public final /* synthetic */ AlexaLandingScreenFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLandingScreenFragment alexaLandingScreenFragment = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        uri.getClass();
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a13.i(new a.b(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        uri2.getClass();
                        alexaLandingScreenFragment.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    case 2:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a14.i(new a.C0387a(alexaError, false));
                        return;
                    case 3:
                        ((f0) obj).getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.d(true));
                        return;
                    default:
                        AlexaError alexaError2 = (AlexaError) obj;
                        alexaError2.getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.c(alexaError2, true));
                        return;
                }
            }
        });
        xf1.a<AlexaError> aVar3 = s().f13088m;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        aVar3.observe(viewLifecycleOwner3, new p(this) { // from class: f00.a
            public final /* synthetic */ AlexaLandingScreenFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLandingScreenFragment alexaLandingScreenFragment = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        uri.getClass();
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a13.i(new a.b(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        uri2.getClass();
                        alexaLandingScreenFragment.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    case 2:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a14.i(new a.C0387a(alexaError, false));
                        return;
                    case 3:
                        ((f0) obj).getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.d(true));
                        return;
                    default:
                        AlexaError alexaError2 = (AlexaError) obj;
                        alexaError2.getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.c(alexaError2, true));
                        return;
                }
            }
        });
        xf1.a<f0> aVar4 = s().f13096u;
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        aVar4.observe(viewLifecycleOwner4, new p(this) { // from class: f00.a
            public final /* synthetic */ AlexaLandingScreenFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLandingScreenFragment alexaLandingScreenFragment = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        uri.getClass();
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a13.i(new a.b(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        uri2.getClass();
                        alexaLandingScreenFragment.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    case 2:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a14.i(new a.C0387a(alexaError, false));
                        return;
                    case 3:
                        ((f0) obj).getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.d(true));
                        return;
                    default:
                        AlexaError alexaError2 = (AlexaError) obj;
                        alexaError2.getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.c(alexaError2, true));
                        return;
                }
            }
        });
        xf1.a<AlexaError> aVar5 = s().f13097v;
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        aVar5.observe(viewLifecycleOwner5, new p(this) { // from class: f00.a
            public final /* synthetic */ AlexaLandingScreenFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLandingScreenFragment alexaLandingScreenFragment = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        uri.getClass();
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a13.i(new a.b(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        uri2.getClass();
                        alexaLandingScreenFragment.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    case 2:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLandingScreenFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        a14.i(new a.C0387a(alexaError, false));
                        return;
                    case 3:
                        ((f0) obj).getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.d(true));
                        return;
                    default:
                        AlexaError alexaError2 = (AlexaError) obj;
                        alexaError2.getClass();
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.a.f13071a.getClass();
                        androidx.navigation.fragment.a.a(alexaLandingScreenFragment).i(new a.c(alexaError2, true));
                        return;
                }
            }
        });
        int i13 = nh.e.f57244m;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        nh.e eVar = (nh.e) q8.t.inflateInternal(layoutInflater, R.layout.fragment_alexa_landing_screen, viewGroup, false, null);
        eVar.l(s());
        View root = eVar.getRoot();
        root.getClass();
        return root;
    }

    public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b s() {
        return (com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b) this.e.getValue();
    }
}
