package com.dyson.mobile.android.interactableec.control.oscillation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import ia0.g;
import ia0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import na0.s;
import w90.g;
import we1.a;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    public static final C0469a f14378g = new C0469a(null);
    public zf1.b d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final b f14379f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/oscillation/a$b", "Lia0/g;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements g {
        public b() {
        }

        @Override // ia0.g
        public final void a() {
            FragmentManager supportFragmentManager;
            a aVar = a.this;
            androidx.fragment.app.e activity = aVar.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.h(aVar);
            aVar2.f();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14381f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f14381f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14381f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14382f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f14382f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14382f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f14383f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f14383f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14383f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14384f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f14385g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f14384f = aVar;
            this.f14385g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14384f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14385g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        ia0.a aVar = new ia0.a(this, 2);
        l a13 = m.a(n.NONE, new d(new c(this)));
        this.e = new d0(p0.f86717a.b(h.class), new e(a13), aVar, new f(null, a13));
        this.f14379f = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("COORDINATOR_ID", "OSC_IDLE_STATE");
        String y13 = o0.y("COORDINATOR_ID", a13);
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.d = a14.f85510j.a();
        int i13 = a13.getInt("OSC_IDLE_STATE");
        s sVar = (s) q8.g.c(layoutInflater, R.layout.fragment_advanced_oscillation_idle, viewGroup, false, null);
        h hVar = (h) this.e.getValue();
        hVar.d.setValue(hVar, h.f41283g[0], this.f14379f);
        q8.n<LocalisationKey> nVar = hVar.f41284f;
        q8.n<LocalisationKey> nVar2 = hVar.e;
        if (i13 == 0) {
            nVar2.m(rf0.f.N6);
            nVar.m(rf0.f.O6);
        } else if (i13 == 1) {
            nVar2.m(rf0.f.P6);
            nVar.m(rf0.f.Q6);
        } else if (i13 == 2) {
            nVar2.m(rf0.f.R6);
            nVar.m(rf0.f.S6);
        }
        sVar.l(hVar);
        return sVar.getRoot();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/a$a;", "", "<init>", "()V", "", "EXTRA_OSC_IDLE_STATE", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.control.oscillation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0469a {
        public /* synthetic */ C0469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0469a() {
        }
    }
}
