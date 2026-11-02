package com.dyson.mobile.android.cat6.ui.onboarding.language;

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
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.cat6.traits.language.ProductUILanguage;
import com.dyson.mobile.android.resources.view.lists.DividerRecyclerView;
import ef1.h;
import h12.l;
import h12.n;
import h12.y;
import hj.e;
import i12.c0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq.d;
import m9.p;
import m9.w;
import nj.d3;
import x12.m;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y9.u;
import ys.k;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/OwnershipLanguageSelectionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipLanguageSelectionFragment extends Fragment {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f12896j = 0;
    public h d;
    public hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12897f;

    /* renamed from: g  reason: collision with root package name */
    public ys.a f12898g;

    /* renamed from: h  reason: collision with root package name */
    public final u f12899h;

    /* renamed from: i  reason: collision with root package name */
    public final k f12900i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
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
    /* loaded from: classes2.dex */
    public static final class c implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public c(Fragment fragment) {
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
    public static final class d extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12901f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12901f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12901f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12902f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar) {
            super(0);
            this.f12902f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f12902f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12903f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.f12903f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f12903f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12904f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12905g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, l lVar) {
            super(0);
            this.f12904f = aVar;
            this.f12905g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12904f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f12905g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    static {
        new a(null);
    }

    public OwnershipLanguageSelectionFragment() {
        wr.a aVar = new wr.a(this, 27);
        l a13 = h12.m.a(n.NONE, new e(new d(this)));
        q0 q0Var = p0.f86717a;
        this.f12897f = new d0(q0Var.b(ys.m.class), new f(a13), aVar, new g(null, a13));
        this.f12899h = new u(q0Var.b(ys.l.class), new c(this));
        this.f12900i = new k(this, 0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        d.a aVar = lq.d.f52535n;
        String str = ((ys.l) this.f12899h.getValue()).f90449b;
        aVar.getClass();
        lq.d a13 = d.a.a(str);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        pq.b bVar = a13.f52538i;
        this.d = bVar.a();
        this.e = bVar.f64582c.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = mq.e.f54499h;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        mq.e eVar = (mq.e) q8.t.inflateInternal(layoutInflater, R.layout.fragment_ownership_language_selection, viewGroup, false, null);
        eVar.getClass();
        d0 d0Var = this.f12897f;
        eVar.l((ys.m) d0Var.getValue());
        ys.m mVar = (ys.m) d0Var.getValue();
        mVar.f90451g = ((ys.l) this.f12899h.getValue()).f90448a;
        mVar.e.setValue(mVar.d.getValue());
        ys.a aVar = new ys.a(this.f12900i);
        this.f12898g = aVar;
        ProductUILanguage productUILanguage = mVar.f90451g;
        if (productUILanguage == null) {
            r.i("currentSelectedLanguage");
            throw null;
        }
        ArrayList arrayList = aVar.f90415b;
        if (c0.F(arrayList, productUILanguage)) {
            aVar.notifyItemChanged(arrayList.indexOf(productUILanguage));
        }
        aVar.f90416c = productUILanguage;
        mVar.f90450f.observe(getViewLifecycleOwner(), new b(new k(this, 1)));
        DividerRecyclerView dividerRecyclerView = eVar.d;
        dividerRecyclerView.setHasFixedSize(true);
        ys.a aVar2 = this.f12898g;
        if (aVar2 == null) {
            r.i("adapter");
            throw null;
        }
        dividerRecyclerView.setAdapter(aVar2);
        View root = eVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.e;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = d3.f57443a;
        ij.b bVar = new ij.b("connection_journey.ownership.language_selection", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/OwnershipLanguageSelectionFragment$a;", "", "<init>", "()V", "", "LANGUAGE_KEY", "Ljava/lang/String;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
