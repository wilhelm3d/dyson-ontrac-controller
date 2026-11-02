package com.dyson.mobile.android.connectionjourney.enablebluetooth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.enablebluetooth.b;
import e22.m;
import f20.z3;
import h12.l;
import h12.n;
import im1.zb;
import j20.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import m9.w;
import nj.k3;
import w00.i;
import x12.p0;
import x12.r;
import x12.t;
import x12.y;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {
    public k d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final tf1.a f13460f;

    /* renamed from: g  reason: collision with root package name */
    public final c f13461g;

    /* renamed from: h  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f13462h;

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f13458j = {p0.f86717a.f(new y(a.class, "fragmentNavigator", "getFragmentNavigator()Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/EnableBluetoothFragmentNavigator;", 0))};

    /* renamed from: i  reason: collision with root package name */
    public static final C0422a f13457i = new C0422a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final String f13459k = "EnableBluetoothFragment";

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13463a;

        static {
            int[] iArr = new int[b.EnumC0423b.values().length];
            try {
                iArr[b.EnumC0423b.NAVIGATE_TO_NEXT_SCREEN_IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0423b.NAVIGATE_TO_NEXT_SCREEN_WITH_ANIMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC0423b.ON_TURN_ON_BLUETOOTH_CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13463a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/enablebluetooth/a$c", "Landroid/view/animation/Animation$AnimationListener;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Animation.AnimationListener {
        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            animation.getClass();
            C0422a c0422a = a.f13457i;
            a aVar = a.this;
            j20.b bVar = (j20.b) aVar.f13460f.getValue(aVar, a.f13458j[0]);
            if (bVar != null) {
                bVar.K();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            animation.getClass();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            animation.getClass();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements p, x12.m {
        public final /* synthetic */ Function1 d;

        public d(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof x12.m)) {
                return r.c(d(), ((x12.m) obj).d());
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
    public static final class e extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13465f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f13465f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13465f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13466f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar) {
            super(0);
            this.f13466f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13466f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13467f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar) {
            super(0);
            this.f13467f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13467f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13468f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, l lVar) {
            super(0);
            this.f13468f = aVar;
            this.f13469g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13468f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13469g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        ia0.a aVar = new ia0.a(this, 17);
        l a13 = h12.m.a(n.NONE, new f(new e(this)));
        this.e = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.enablebluetooth.b.class), new g(a13), aVar, new h(null, a13));
        this.f13460f = new tf1.a(null, 1, null);
        this.f13461g = new c();
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new j.a(), new ie.a(18));
        registerForActivityResult.getClass();
        this.f13462h = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        i.c(requireContext()).e.a(this);
        if (!(context instanceof j20.b)) {
            pa.c.w("Activity must implement EnableBluetoothFragmentNavigator");
            return;
        }
        m<?> mVar = f13458j[0];
        this.f13460f.setValue(this, mVar, (j20.b) context);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        z3 z3Var = (z3) q8.g.c(layoutInflater, R.layout.fragment_enable_bluetooth, viewGroup, false, null);
        d0 d0Var = this.e;
        z3Var.l(((com.dyson.mobile.android.connectionjourney.enablebluetooth.b) d0Var.getValue()).f13478j);
        z3Var.m(((com.dyson.mobile.android.connectionjourney.enablebluetooth.b) d0Var.getValue()).f13477i);
        ((com.dyson.mobile.android.connectionjourney.enablebluetooth.b) d0Var.getValue()).f13476h.observe(requireActivity(), new d(new i81.d(15, this, z3Var)));
        com.dyson.mobile.android.connectionjourney.enablebluetooth.b bVar = (com.dyson.mobile.android.connectionjourney.enablebluetooth.b) d0Var.getValue();
        if (bVar.d.b()) {
            bVar.f13475g.setValue(b.EnumC0423b.NAVIGATE_TO_NEXT_SCREEN_IMMEDIATE);
        } else {
            zb.z(bVar.f13479k, bVar.f13474f.a().H(fz1.a.a()).t(new iw0.l(new id0.d(bVar, 26), 9)).N());
        }
        View root = z3Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i13 = k3.f57558a;
        y9.w.t("connection_journey.prerequisites.bluetooth", null, 2, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablebluetooth/a$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.enablebluetooth.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0422a {
        public /* synthetic */ C0422a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0422a() {
        }
    }
}
