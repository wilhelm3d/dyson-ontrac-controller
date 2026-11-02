package com.dyson.mobile.android.robot.onboarding;

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
import com.dyson.mobile.android.robot.onboarding.b;
import com.dyson.mobile.android.robot.onboarding.d;
import fm1.o0;
import h12.f0;
import h12.l;
import h12.n;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import m9.w;
import x12.m;
import x12.p0;
import x12.r;
import x12.t;
import yu0.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    public static final C0587a f16553g = new C0587a(null);
    public d.a d;
    public b.a e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f16554f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements p, m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
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
        public final /* synthetic */ Function1 f16555f;

        public e(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f16555f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f16555f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16556f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f16556f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16556f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16557f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar) {
            super(0);
            this.f16557f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f16557f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f16558f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l lVar) {
            super(0);
            this.f16558f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f16558f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class i extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16559f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f16560g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, l lVar) {
            super(0);
            this.f16559f = aVar;
            this.f16560g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16559f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f16560g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        e eVar = new e(new c(this), d.d, new y31.d(this, 0));
        l a13 = h12.m.a(n.NONE, new g(new f(this)));
        this.f16554f = new d0(p0.f86717a.b(com.dyson.mobile.android.robot.onboarding.d.class), new h(a13), eVar, new i(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        z.a aVar = z.f42723r;
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        String y13 = o0.y("COORDINATOR_ID", requireArguments);
        aVar.getClass();
        z a13 = z.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        av0.d dVar = a13.f42732o.f42663a;
        this.d = (d.a) dVar.L3.f88315a;
        this.e = (b.a) dVar.M3.f88315a;
        int i13 = m0.f90806h;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        m0 m0Var = (m0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_onboarding, viewGroup, false, null);
        m0Var.getClass();
        d0 d0Var = this.f16554f;
        xf1.a<f0> aVar2 = ((com.dyson.mobile.android.robot.onboarding.d) d0Var.getValue()).f16569j;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar2.observe(viewLifecycleOwner, new b(new y31.d(this, 1)));
        m0Var.l((com.dyson.mobile.android.robot.onboarding.d) d0Var.getValue());
        View root = m0Var.getRoot();
        root.getClass();
        return root;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/a$a;", "", "<init>", "()V", "", "ONBOARDING_TYPE_KEY", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.onboarding.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0587a {
        public /* synthetic */ C0587a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0587a() {
        }
    }
}
