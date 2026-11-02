package com.dyson.mobile.android.interactableec.home.help.historical;

import a01.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import bb0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import na0.e0;
import na0.i4;
import nj.c4;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import za0.f;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends Fragment {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14474i = new a(null);
    public zf1.b d;
    public f e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f14475f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f14476g;

    /* renamed from: h  reason: collision with root package name */
    public wa0.c f14477h;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14478f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f14478f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14478f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14479f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar) {
            super(0);
            this.f14479f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14479f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* renamed from: com.dyson.mobile.android.interactableec.home.help.historical.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0472d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f14480f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0472d(l lVar) {
            super(0);
            this.f14480f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14480f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14481f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f14482g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, l lVar) {
            super(0);
            this.f14481f = aVar;
            this.f14482g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14481f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14482g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public d() {
        k kVar = new k(this, 17);
        l a13 = m.a(n.NONE, new c(new b(this)));
        this.f14476g = new d0(p0.f86717a.b(bb0.f.class), new C0472d(a13), kVar, new e(null, a13));
        this.f14477h = wa0.c.PM25;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create HistoricalPollutantHelpFragment";
        Bundle a13 = b13.a("COORDINATOR_ID");
        String y13 = o0.y("COORDINATOR_ID", a13);
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        oa0.b bVar = a14.f85510j;
        this.d = bVar.a();
        this.e = bVar.f59912r3.get();
        this.f14475f = bVar.e.get();
        String string = a13.getString("EXTRA_GRAPH_TYPE");
        if (string != null) {
            this.f14477h = wa0.c.valueOf(string);
        } else {
            pa.c.p("Required value was null.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = e0.f56248j;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        e0 e0Var = (e0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_historical_pollutant_help, viewGroup, false, null);
        bb0.f fVar = (bb0.f) this.f14476g.getValue();
        wa0.c cVar = this.f14477h;
        cVar.getClass();
        q8.n<String> nVar = fVar.e;
        LocalisationKey localisationKey = rf0.f.E2;
        pf0.c cVar2 = fVar.d;
        nVar.m(if1.g.a(cVar2.d(localisationKey), cVar2.d(cVar.getLocalisationKey())));
        q8.n<String> nVar2 = fVar.f7478f;
        int i14 = f.a.f7480a[cVar.ordinal()];
        nVar2.m(cVar2.d(i14 != 1 ? i14 != 2 ? i14 != 3 ? i14 != 4 ? i14 != 5 ? cVar.getLocalisationKey() : rf0.f.f71380y2 : rf0.f.f71389z2 : rf0.f.f71371x2 : rf0.f.B2 : rf0.f.A2));
        fVar.f7479g.m(new za0.g(cVar, cVar2));
        e0Var.l(fVar);
        i4 i4Var = e0Var.f56251h;
        wa0.c cVar3 = this.f14477h;
        za0.f fVar2 = this.e;
        if (fVar2 == null) {
            r.i("resourceProvider");
            throw null;
        }
        i4Var.l(new za0.d(cVar3, fVar2));
        View root = e0Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String analyticsKey = this.f14477h.getAnalyticsKey();
        if (analyticsKey != null) {
            hj.e eVar = this.f14475f;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            ij.b a13 = c4.a(analyticsKey);
            e.a aVar = hj.e.f38312g;
            eVar.h(a13, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/d$a;", "", "<init>", "()V", "", "EXTRA_GRAPH_TYPE", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
