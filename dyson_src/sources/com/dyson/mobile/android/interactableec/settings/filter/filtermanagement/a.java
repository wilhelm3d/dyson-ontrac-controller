package com.dyson.mobile.android.interactableec.settings.filter.filtermanagement;

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
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.b;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.support.deeplink.DeepLinkAction;
import e71.n;
import fm1.o0;
import h12.f0;
import h12.l;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import mj.m;
import na0.k0;
import ot0.b;
import rf0.i0;
import ss0.k;
import t2.e1;
import tc0.j;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/a;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment implements f.a {

    /* renamed from: i  reason: collision with root package name */
    public static final C0486a f14683i = new C0486a(null);
    public zf1.b d;
    public com.dyson.mobile.android.support.deeplink.c e;

    /* renamed from: f  reason: collision with root package name */
    public g f14684f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f14685g;

    /* renamed from: h  reason: collision with root package name */
    public final b f14686h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/filter/filtermanagement/a$b", "Ltc0/g;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements tc0.g {

        /* renamed from: com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class C0487a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14688a;

            static {
                int[] iArr = new int[ot0.c.values().length];
                try {
                    iArr[ot0.c.NEGATIVE_BUTTON_CLICK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ot0.c.POSITIVE_BUTTON_CLICK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ot0.c.LINKED_TEXT_CLICK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14688a = iArr;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/filter/filtermanagement/a$b$b", "", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0488b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ w12.a<f0> f14689a;

            public C0488b(w12.a<f0> aVar) {
                this.f14689a = aVar;
            }
        }

        public b() {
        }

        @Override // tc0.g
        public final void a() {
            Fragment E = a.this.getChildFragmentManager().E("a");
            E.getClass();
            ((ut0.a) E).dismissAllowingStateLoss();
        }

        @Override // tc0.g
        public final void b(String str) {
            str.getClass();
            a aVar = a.this;
            g gVar = aVar.f14684f;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            requireActivity.getClass();
            gVar.x(requireActivity, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_FILTER_MANAGEMENT, new ExternalLinkTracking(str, m.a.FILTER_MANAGEMENT, null, null, 12, null));
        }

        @Override // tc0.g
        public final void c(DeepLinkAction.OpenResolveContentUrl openResolveContentUrl) {
            pa.c.s("Navigating to resolve content: ", openResolveContentUrl.d);
            com.dyson.mobile.android.support.deeplink.c cVar = a.this.e;
            if (cVar != null) {
                cVar.a(openResolveContentUrl);
            } else {
                r.i("supportDeeplinkNavigator");
                throw null;
            }
        }

        @Override // tc0.g
        public final void d(String str) {
            a aVar = a.this;
            g gVar = aVar.f14684f;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            requireActivity.getClass();
            gVar.w(requireActivity, str, new e1(aVar, 7));
        }

        @Override // tc0.g
        public final void e(String str) {
            str.getClass();
            ut0.a s13 = ut0.a.s(3, str);
            s13.setCancelable(false);
            s13.show(a.this.getChildFragmentManager(), "a");
        }

        @Override // tc0.g
        public final void f(tc0.e eVar, tc0.f fVar) {
            a aVar = a.this;
            aVar.getChildFragmentManager().j0("ECFilterManagementFragment", aVar, new k(1, eVar, fVar));
            b.a aVar2 = ot0.b.d;
            LocalisationKey localisationKey = rf0.f.f71262l1;
            LocalisationKey localisationKey2 = rf0.f.D1;
            LocalisationKey localisationKey3 = i0.E8;
            LocalisationKey localisationKey4 = i0.M8;
            LocalisationKey localisationKey5 = rf0.f.E1;
            aVar2.getClass();
            b.a.a("ECFilterManagementFragment", R.drawable.ic_reset_filter, localisationKey, localisationKey2, localisationKey3, localisationKey4, null, localisationKey5).show(aVar.getChildFragmentManager(), "AlertDialogFragment");
        }

        @Override // tc0.g
        public final void g(boolean z13, w12.a<f0> aVar) {
            b.a aVar2 = com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.b.f14695i;
            a aVar3 = a.this;
            g gVar = aVar3.f14684f;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            aVar2.getClass();
            str.getClass();
            com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.b bVar = new com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.b();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putBoolean("EXTRA_IS_STATUS_SUCCESSFUL", z13);
            bVar.setArguments(bundle);
            bVar.f14696f = new C0488b(aVar);
            bVar.show(aVar3.getChildFragmentManager(), "TAG_RESETTING_STATUS");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14690f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f14690f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14690f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14691f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f14691f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14691f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f14692f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f14692f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14692f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14693f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f14694g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f14693f = aVar;
            this.f14694g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14693f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14694g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        s41.a aVar = new s41.a(this, 17);
        l a13 = h12.m.a(n.NONE, new d(new c(this)));
        this.f14685g = new d0(p0.f86717a.b(j.class), new e(a13), aVar, new f(null, a13));
        this.f14686h = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create ECFilterManagementFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a13 = g.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14684f = a13;
        oa0.b bVar = a13.f85510j;
        this.d = bVar.a();
        bVar.f59830b.getClass();
        e71.n.f26183r.getClass();
        com.dyson.mobile.android.support.deeplink.c cVar = n.a.a().f26196m;
        if (cVar != null) {
            this.e = cVar;
        } else {
            r.i("supportDeeplinkNavigator");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = k0.f56386l;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        k0 k0Var = (k0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_interactable_ec_filter_management, viewGroup, false, null);
        j jVar = (j) this.f14685g.getValue();
        tc0.d dVar = jVar.d;
        tf1.a aVar = dVar.f79191f;
        e22.m<?>[] mVarArr = tc0.d.f79186u;
        e22.m<?> mVar = mVarArr[0];
        b bVar = this.f14686h;
        aVar.setValue(dVar, mVar, bVar);
        tc0.d dVar2 = jVar.e;
        dVar2.f79191f.setValue(dVar2, mVarArr[0], bVar);
        k0Var.l(jVar);
        return k0Var.getRoot();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0486a {
        public /* synthetic */ C0486a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0486a() {
        }
    }
}
