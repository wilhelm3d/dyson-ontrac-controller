package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import f20.v4;
import gm1.am;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m9.w;
import nj.g3;
import nj.h3;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/purchasedate/NonConnectedOwnershipPurchaseDateFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lj30/b;", "safeArgs", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NonConnectedOwnershipPurchaseDateFragment extends Fragment {
    public a.c d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final a f13678f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/nonconnected/ownership/purchasedate/NonConnectedOwnershipPurchaseDateFragment$a", "Lj30/c;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements j30.c {
        public a() {
        }

        @Override // j30.c
        public final void a(c40.e eVar, Calendar calendar, Calendar calendar2, Calendar calendar3) {
            calendar.getClass();
            calendar2.getClass();
            calendar3.getClass();
            DatePickerDialog datePickerDialog = new DatePickerDialog(NonConnectedOwnershipPurchaseDateFragment.this.requireContext(), R.style.DatePickerDialogStyle, eVar, calendar.get(1), calendar.get(2), calendar.get(5));
            int i13 = h3.f57509a;
            new ij.b("connection_journey.ownership.machine_purchase_date_calendar", null, 2, null).b();
            DatePicker datePicker = datePickerDialog.getDatePicker();
            datePicker.getClass();
            datePicker.setMaxDate(calendar3.getTimeInMillis());
            datePicker.setMinDate(calendar2.getTimeInMillis());
            datePickerDialog.show();
        }

        @Override // j30.c
        public final void k() {
            NonConnectedOwnershipPurchaseDateFragment nonConnectedOwnershipPurchaseDateFragment = NonConnectedOwnershipPurchaseDateFragment.this;
            w00.i c13 = w00.i.c(nonConnectedOwnershipPurchaseDateFragment.requireContext());
            androidx.fragment.app.e requireActivity = nonConnectedOwnershipPurchaseDateFragment.requireActivity();
            he0.e eVar = new he0.e(nonConnectedOwnershipPurchaseDateFragment, 7);
            c13.getClass();
            ConnectivityIssueActivity.f1(requireActivity, eVar, null);
        }

        @Override // j30.c
        public final void l(String str) {
            str.getClass();
            NonConnectedOwnershipPurchaseDateFragment nonConnectedOwnershipPurchaseDateFragment = NonConnectedOwnershipPurchaseDateFragment.this;
            if (nonConnectedOwnershipPurchaseDateFragment.isAdded()) {
                w00.i.c(nonConnectedOwnershipPurchaseDateFragment.requireContext()).h(nonConnectedOwnershipPurchaseDateFragment.requireActivity());
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public b(Fragment fragment) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
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
    /* loaded from: classes2.dex */
    public static final class d implements w12.a<Bundle> {
        public static final d d = new d();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ w12.a e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13680f;

        public e(w12.a aVar, w12.a aVar2, Function1 function1) {
            this.d = aVar;
            this.e = aVar2;
            this.f13680f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Fragment fragment = (Fragment) this.d.invoke();
            Bundle bundle = (Bundle) this.e.invoke();
            if (bundle == null) {
                bundle = fragment.getArguments();
            }
            return ef1.d.a(fragment, bundle, this.f13680f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13681f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f13681f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13681f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13682f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar) {
            super(0);
            this.f13682f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13682f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13683f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(l lVar) {
            super(0);
            this.f13683f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13683f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class i extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13684f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13685g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w12.a aVar, l lVar) {
            super(0);
            this.f13684f = aVar;
            this.f13685g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13684f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13685g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public NonConnectedOwnershipPurchaseDateFragment() {
        e eVar = new e(new c(this), d.d, new id0.d(this, 27));
        l a13 = m.a(n.NONE, new g(new f(this)));
        this.e = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a.class), new h(a13), eVar, new i(null, a13));
        this.f13678f = new a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        w00.i.c(requireContext()).e.b(this);
        int i13 = v4.f29399m;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        v4 v4Var = (v4) q8.t.inflateInternal(layoutInflater, R.layout.fragment_non_connected_ownership_purchase_date, viewGroup, false, null);
        com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a aVar = (com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a) this.e.getValue();
        am.B(this, aVar.f13694m);
        aVar.f13697p.setValue(aVar, com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a.f13686x[0], this.f13678f);
        v4Var.l(aVar);
        v4Var.f29400f.setContent(new c4.c(881675858, true, new j30.a(this, 0)));
        View root = v4Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i13 = g3.f57492a;
        y9.w.t("connection_journey.ownership.machine_purchase_date", null, 2, null);
    }
}
