package com.dyson.mobile.android.interactableec.settings.waterhardness;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import na0.u0;
import pa0.o2;
import pa0.p2;
import pa0.t0;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import x42.m1;
import xc0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/waterhardness/a;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment implements f.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0490a f14712h = new C0490a(null);
    public vd0.b<xc0.c> d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public g f14713f;

    /* renamed from: g  reason: collision with root package name */
    public final b f14714g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/waterhardness/a$b", "Lxc0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements xc0.a {
        public b() {
        }

        @Override // xc0.a
        public final void a() {
            a aVar = a.this;
            g gVar = aVar.f14713f;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            requireActivity.getClass();
            gVar.w(requireActivity, "Water hardness", new m1(aVar, 9));
        }

        @Override // xc0.a
        public final void b() {
            androidx.fragment.app.e activity = a.this.getActivity();
            activity.getClass();
            ((bt0.f) activity).j1(null);
        }

        @Override // xc0.a
        public final void c(c.b bVar) {
            a aVar = a.this;
            uf0.g a13 = uf0.g.a(aVar.getActivity());
            androidx.fragment.app.e activity = aVar.getActivity();
            s70.b bVar2 = new s70.b(bVar, 15);
            a13.getClass();
            ConnectivityIssueActivity.f1(activity, bVar2, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14716f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f14716f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14716f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14717f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f14717f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14717f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f14718f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f14718f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14718f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14719f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f14720g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f14719f = aVar;
            this.f14720g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14719f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14720g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        wr.a aVar = new wr.a(this, 9);
        l a13 = m.a(n.NONE, new d(new c(this)));
        this.e = new d0(p0.f86717a.b(xc0.c.class), new e(a13), aVar, new f(null, a13));
        this.f14714g = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create ECWaterHardnessFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a13 = g.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14713f = a13;
        oa0.b bVar = a13.f85510j;
        p2 p2Var = bVar.f59835c;
        eh0.f<zc0.w> fVar = bVar.F.get();
        pf0.c b14 = t0.b(bVar.f59825a);
        p2Var.getClass();
        fVar.getClass();
        this.d = new vd0.b<>(new o2(fVar, b14, 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = u0.f56709n;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        u0 u0Var = (u0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_water_hardness, viewGroup, false, null);
        xc0.c cVar = (xc0.c) this.e.getValue();
        cVar.f87354k.setValue(cVar, xc0.c.f87348m[0], this.f14714g);
        u0Var.l(cVar);
        return u0Var.getRoot();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/waterhardness/a$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.settings.waterhardness.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0490a {
        public /* synthetic */ C0490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0490a() {
        }
    }
}
