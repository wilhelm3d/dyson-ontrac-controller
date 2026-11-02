package com.dyson.mobile.android.interactableec.settings.filter.filtermanagement;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a;
import com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c;
import com.dyson.mobile.android.localisation.LocalisationKey;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import mz1.j;
import pa0.t0;
import t2.e1;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/b;", "Landroidx/fragment/app/d;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14695i = new a(null);
    public zf1.b d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public a.b.C0488b f14696f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14697g;

    /* renamed from: h  reason: collision with root package name */
    public final C0489b f14698h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/filter/filtermanagement/b$b", "Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/c$b;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0489b implements c.b {
        public C0489b() {
        }

        @Override // com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c.b
        public final void dismiss() {
            b.this.dismissAllowingStateLoss();
        }

        @Override // com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c.b
        public final void m() {
            a.b.C0488b c0488b = b.this.f14696f;
            if (c0488b != null) {
                c0488b.f14689a.invoke();
            } else {
                r.i("callbackListener");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14700f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f14700f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14700f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14701f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f14701f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14701f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f14702f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f14702f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14702f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14703f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f14704g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f14703f = aVar;
            this.f14704g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14703f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14704g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public b() {
        s41.a aVar = new s41.a(this, 18);
        l a13 = m.a(n.NONE, new d(new c(this)));
        this.e = new d0(p0.f86717a.b(com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c.class), new e(a13), aVar, new f(null, a13));
        this.f14698h = new C0489b();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create ECFilterResetStatusFragment";
        Bundle a13 = b13.a("COORDINATOR_ID", "EXTRA_IS_STATUS_SUCCESSFUL");
        String y13 = o0.y("COORDINATOR_ID", a13);
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        oa0.b bVar = a14.f85510j;
        t0.b(bVar.f59825a);
        this.d = bVar.a();
        this.f14697g = a13.getBoolean("EXTRA_IS_STATUS_SUCCESSFUL");
        setStyle(0, R.style.TransparentDialogStyle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = na0.w.f56745m;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        na0.w wVar = (na0.w) q8.t.inflateInternal(layoutInflater, R.layout.fragment_ec_filter_reset_status, viewGroup, false, null);
        wVar.getClass();
        com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c cVar = (com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c) this.e.getValue();
        cVar.d.setValue(cVar, com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.c.f14705i[0], this.f14698h);
        boolean z13 = this.f14697g;
        q8.n<LocalisationKey> nVar = cVar.f14708h;
        ObservableInt observableInt = cVar.f14707g;
        ObservableInt observableInt2 = cVar.f14706f;
        if (z13) {
            observableInt2.l(4);
            observableInt.l(R.drawable.ic_circle_tick_purple);
            nVar.m(rf0.f.H1);
            cVar.e = (j) dz1.r.X(2L, TimeUnit.SECONDS).O(new tc0.b(new e1(cVar, 8), 8));
        } else {
            observableInt2.l(0);
            observableInt.l(R.drawable.ic_warning_white_circle);
            nVar.m(rf0.f.I1);
        }
        wVar.l(cVar);
        return wVar.getRoot();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/b$a;", "", "<init>", "()V", "", "EXTRA_IS_STATUS_SUCCESSFUL", "Ljava/lang/String;", "TAG_RESETTING_STATUS", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
