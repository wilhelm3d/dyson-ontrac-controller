package com.dyson.mobile.android.interactableec.home.help.historical;

import a01.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.interactableec.settings.airQualityTarget.ECAirQualityTargetActivity;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import na0.s1;
import na0.y;
import nj.c4;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: j  reason: collision with root package name */
    public static final C0470a f14454j = new C0470a(null);
    public zf1.b d;
    public za0.b e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f14455f;

    /* renamed from: g  reason: collision with root package name */
    public g f14456g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f14457h;

    /* renamed from: i  reason: collision with root package name */
    public final b f14458i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/home/help/historical/a$b", "Lbb0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements bb0.a {
        public b() {
        }

        @Override // bb0.a
        public final void a() {
            a aVar = a.this;
            g gVar = aVar.f14456g;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            requireActivity.getClass();
            ECAirQualityTargetActivity.a aVar2 = ECAirQualityTargetActivity.f14632k;
            String str = gVar.f85509i;
            aVar2.getClass();
            str.getClass();
            Intent intent = new Intent(requireActivity, ECAirQualityTargetActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("theme", 2132083505);
            requireActivity.startActivity(intent);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14460f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f14460f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14460f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14461f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f14461f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14461f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f14462f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f14462f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14462f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14463f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f14464g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f14463f = aVar;
            this.f14464g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14463f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14464g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        k kVar = new k(this, 14);
        l a13 = m.a(n.NONE, new d(new c(this)));
        this.f14457h = new d0(p0.f86717a.b(bb0.b.class), new e(a13), kVar, new f(null, a13));
        this.f14458i = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create HistoricalAirQualityHelpFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a13 = g.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14456g = a13;
        oa0.b bVar = a13.f85510j;
        this.d = bVar.a();
        pa0.a aVar = bVar.f59825a;
        za0.a aVar2 = bVar.f59919t0.get();
        aVar.getClass();
        aVar2.getClass();
        this.e = new za0.b(aVar2);
        this.f14455f = bVar.e.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = y.f56791o;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        y yVar = (y) q8.t.inflateInternal(layoutInflater, R.layout.fragment_historical_air_quality_help, viewGroup, false, null);
        bb0.b bVar = (bb0.b) this.f14457h.getValue();
        bVar.e.setValue(bVar, bb0.b.f7469k[0], this.f14458i);
        yVar.l(bVar);
        s1 s1Var = yVar.f56798l;
        za0.b bVar2 = this.e;
        if (bVar2 == null) {
            r.i("airQualityScaleAdapter");
            throw null;
        }
        s1Var.l(bVar2);
        View root = yVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String analyticsKey = wa0.c.AQI.getAnalyticsKey();
        if (analyticsKey != null) {
            hj.e eVar = this.f14455f;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            ij.b a13 = c4.a(analyticsKey);
            e.a aVar = hj.e.f38312g;
            eVar.h(a13, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/a$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.home.help.historical.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0470a {
        public /* synthetic */ C0470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0470a() {
        }
    }
}
