package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.AlexaLoginWithAmazonFragment;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.a;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b;
import f.q;
import gm1.am;
import h12.f0;
import h12.y;
import i00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kz.a;
import m9.w;
import x12.p;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y9.c0;
import y9.u;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/AlexaLoginWithAmazonFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AlexaLoginWithAmazonFragment extends Fragment {
    public b.c d;
    public hu0.d e;

    /* renamed from: f  reason: collision with root package name */
    public final u f13129f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f13130g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f13131h;

    /* renamed from: i  reason: collision with root package name */
    public final a f13132i;

    /* renamed from: j  reason: collision with root package name */
    public final d f13133j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/AlexaLoginWithAmazonFragment$a", "Lf/q;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends q {
        public a() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            AlexaLoginWithAmazonFragment alexaLoginWithAmazonFragment = AlexaLoginWithAmazonFragment.this;
            hu0.d dVar = alexaLoginWithAmazonFragment.e;
            if (dVar == null) {
                r.i("embeddedWebViewProvider");
                throw null;
            } else if (dVar.e()) {
            } else {
                f(false);
                alexaLoginWithAmazonFragment.requireActivity().onBackPressed();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements Function1<Uri, Boolean> {
        public b(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b.class, "onUrlChanged", "onUrlChanged(Landroid/net/Uri;)Z", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Uri uri) {
            Uri uri2 = uri;
            uri2.getClass();
            return Boolean.valueOf(((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b) this.receiver).T(uri2));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements Function3<Integer, String, Uri, f0> {
        public c(Object obj) {
            super(3, obj, com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b.class, "onErrorReceived", "onErrorReceived(Ljava/lang/Integer;Ljava/lang/String;Landroid/net/Uri;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public final f0 invoke(Integer num, String str, Uri uri) {
            ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b) this.receiver).S(num, str);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/AlexaLoginWithAmazonFragment$d", "Li00/a$a;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements a.InterfaceC1247a {
        public d() {
        }

        @Override // i00.a.InterfaceC1247a
        public final boolean a() {
            hu0.d dVar = AlexaLoginWithAmazonFragment.this.e;
            if (dVar != null) {
                return dVar.e();
            }
            r.i("embeddedWebViewProvider");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13135f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f13135f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return x1.i.b(this.f13135f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13136f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f13137g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, Fragment fragment) {
            super(0);
            this.f13136f = aVar;
            this.f13137g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13136f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? x1.i.c(this.f13137g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13138f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f13138f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return x1.i.a(this.f13138f);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements w12.a<Fragment> {
        public final /* synthetic */ Fragment d;

        public h(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements w12.a<Bundle> {
        public static final i d = new i();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class j implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ w12.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13139f;

        public j(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f13139f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f13139f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class k extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13140f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f13140f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13140f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class l extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13141f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(w12.a aVar) {
            super(0);
            this.f13141f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13141f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class m extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f13142f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(h12.l lVar) {
            super(0);
            this.f13142f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13142f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class n extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13143f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f13144g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(w12.a aVar, h12.l lVar) {
            super(0);
            this.f13143f = aVar;
            this.f13144g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13143f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13144g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class o implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public o(Fragment fragment) {
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

    public AlexaLoginWithAmazonFragment() {
        q0 q0Var = p0.f86717a;
        this.f13129f = new u(q0Var.b(h00.b.class), new o(this));
        j jVar = new j(new h(this), i.d, new gl.k(this, 7));
        h12.l a13 = h12.m.a(h12.n.NONE, new l(new k(this)));
        this.f13130g = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b.class), new m(a13), jVar, new n(null, a13));
        this.f13131h = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.a.class), new e(this), new g(this), new f(null, this));
        this.f13132i = new a();
        this.f13133j = new d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        kz.a.f50192c.getClass();
        mz.d dVar = a.C1547a.a(context).f50194b;
        this.d = (b.c) dVar.f55383g.f88315a;
        dVar.f55379a.getClass();
        this.e = new hu0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f13131h.getValue()).S(true);
        am.B(this, s().f13152h);
        xf1.a<AlexaAuthResult.AlexaAuthArgs> aVar = s().f13150f;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar.observe(viewLifecycleOwner, new m9.p(this) { // from class: h00.a
            public final /* synthetic */ AlexaLoginWithAmazonFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLoginWithAmazonFragment alexaLoginWithAmazonFragment = this.e;
                switch (i13) {
                    case 0:
                        AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = (AlexaAuthResult.AlexaAuthArgs) obj;
                        alexaAuthArgs.getClass();
                        e requireActivity = alexaLoginWithAmazonFragment.requireActivity();
                        requireActivity.getClass();
                        cd.b.B(requireActivity);
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLoginWithAmazonFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.a.f13145a.getClass();
                        a13.i(new a.C0392a(alexaAuthArgs));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        e requireActivity2 = alexaLoginWithAmazonFragment.requireActivity();
                        requireActivity2.getClass();
                        cd.b.B(requireActivity2);
                        if (r.c(alexaError.getError(), "access_denied")) {
                            androidx.navigation.fragment.a.a(alexaLoginWithAmazonFragment).m();
                            return;
                        }
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLoginWithAmazonFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.a.f13145a.getClass();
                        a14.i(new a.b(alexaError, false));
                        return;
                }
            }
        });
        xf1.a<AlexaError> aVar2 = s().f13151g;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        aVar2.observe(viewLifecycleOwner2, new m9.p(this) { // from class: h00.a
            public final /* synthetic */ AlexaLoginWithAmazonFragment e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                AlexaLoginWithAmazonFragment alexaLoginWithAmazonFragment = this.e;
                switch (i13) {
                    case 0:
                        AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = (AlexaAuthResult.AlexaAuthArgs) obj;
                        alexaAuthArgs.getClass();
                        e requireActivity = alexaLoginWithAmazonFragment.requireActivity();
                        requireActivity.getClass();
                        cd.b.B(requireActivity);
                        c0 a13 = androidx.navigation.fragment.a.a(alexaLoginWithAmazonFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.a.f13145a.getClass();
                        a13.i(new a.C0392a(alexaAuthArgs));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        alexaError.getClass();
                        e requireActivity2 = alexaLoginWithAmazonFragment.requireActivity();
                        requireActivity2.getClass();
                        cd.b.B(requireActivity2);
                        if (r.c(alexaError.getError(), "access_denied")) {
                            androidx.navigation.fragment.a.a(alexaLoginWithAmazonFragment).m();
                            return;
                        }
                        c0 a14 = androidx.navigation.fragment.a.a(alexaLoginWithAmazonFragment);
                        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.a.f13145a.getClass();
                        a14.i(new a.b(alexaError, false));
                        return;
                }
            }
        });
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        onBackPressedDispatcher.a(viewLifecycleOwner3, this.f13132i);
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        i00.b bVar = requireActivity instanceof i00.b ? (i00.b) requireActivity : null;
        if (bVar == null) {
            pa.c.p("This Activity is not an OnNavigateUpDispatcherProvider.");
            return null;
        }
        i00.a B0 = bVar.B0();
        B0.getClass();
        d dVar = this.f13133j;
        dVar.getClass();
        B0.f39870b.add(dVar);
        int i13 = nh.i.f57260f;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        nh.i iVar = (nh.i) q8.t.inflateInternal(layoutInflater, R.layout.fragment_alexa_login_with_amazon, viewGroup, false, null);
        s();
        iVar.getClass();
        hu0.d dVar2 = this.e;
        if (dVar2 == null) {
            r.i("embeddedWebViewProvider");
            throw null;
        }
        WebView webView = iVar.e;
        webView.getClass();
        hu0.e.b(dVar2, webView, iVar.d, null, null, new b(s()), new c(s()), null, null, null, null, 960);
        dVar2.c(s().e);
        View root = iVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        i00.b bVar = requireActivity instanceof i00.b ? (i00.b) requireActivity : null;
        if (bVar == null) {
            pa.c.p("This Activity is not an OnNavigateUpDispatcherProvider.");
            return;
        }
        i00.a B0 = bVar.B0();
        B0.getClass();
        d dVar = this.f13133j;
        dVar.getClass();
        B0.f39870b.remove(dVar);
    }

    public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b s() {
        return (com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b) this.f13130g.getValue();
    }
}
