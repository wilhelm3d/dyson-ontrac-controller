package com.dyson.mobile.android.audio.settings.filtermanagement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.settings.filtermanagement.b;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machine.ui.guide.MachineGuideActivity;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import dk.y;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import hj.e;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.x0;
import ny.a0;
import ot0.b;
import rf0.i0;
import uo.a;
import va0.w;
import vj.f;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/filtermanagement/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: k  reason: collision with root package name */
    public static final C0360a f12781k = new C0360a(null);
    public fk.d d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f12782f;

    /* renamed from: g  reason: collision with root package name */
    public String f12783g;

    /* renamed from: h  reason: collision with root package name */
    public vj.f f12784h;

    /* renamed from: i  reason: collision with root package name */
    public final d0 f12785i;

    /* renamed from: j  reason: collision with root package name */
    public final c f12786j;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12787a;

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
            f12787a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/filtermanagement/a$c", "Lpo/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements po.a {

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/filtermanagement/a$c$a", "", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.audio.settings.filtermanagement.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0361a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ a f12789a;

            public C0361a(a aVar) {
                this.f12789a = aVar;
            }
        }

        public c() {
        }

        @Override // po.a
        public final void b() {
            a aVar = a.this;
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            ActionBar supportActionBar = ((l.b) activity).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.f();
            }
            b.a aVar2 = com.dyson.mobile.android.audio.settings.filtermanagement.b.f12795h;
            String str = aVar.f12783g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar2.getClass();
            com.dyson.mobile.android.audio.settings.filtermanagement.b bVar = new com.dyson.mobile.android.audio.settings.filtermanagement.b();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bVar.setArguments(bundle);
            bVar.e = new C0361a(aVar);
            bVar.setCancelable(false);
            bVar.show(aVar.getParentFragmentManager(), "IN_PROGRESS");
        }

        @Override // po.a
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void c() {
            a.C2408a c2408a = uo.a.f82329h;
            a aVar = a.this;
            String str = aVar.f12783g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c2408a.getClass();
            uo.a aVar2 = new uo.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar2.setArguments(bundle);
            pf0.c cVar = aVar.e;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            String d = cVar.d(rf0.f.f71307q1);
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            ((pl0.c) activity).q1(aVar2, d);
        }

        @Override // po.a
        public final void d(kj.b bVar) {
            a aVar = a.this;
            vj.f fVar = aVar.f12784h;
            if (fVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            requireActivity.getClass();
            fVar.o(requireActivity, bVar.f47574a, bVar.f47575b);
        }

        @Override // po.a
        public final void e() {
            C0360a c0360a = a.f12781k;
            a aVar = a.this;
            aVar.getParentFragmentManager().j0("AudioFilterManagementFragment", aVar, new ph.b(aVar, 8));
            b.a aVar2 = ot0.b.d;
            LocalisationKey localisationKey = rf0.f.f71262l1;
            LocalisationKey localisationKey2 = rf0.f.D1;
            LocalisationKey localisationKey3 = i0.E8;
            LocalisationKey localisationKey4 = i0.M8;
            LocalisationKey localisationKey5 = rf0.f.F1;
            LocalisationKey localisationKey6 = rf0.f.E1;
            aVar2.getClass();
            b.a.a("AudioFilterManagementFragment", 2131231175, localisationKey, localisationKey2, localisationKey3, localisationKey4, localisationKey5, localisationKey6).show(aVar.getParentFragmentManager(), "AlertDialogFragment");
        }

        @Override // po.a
        public final void f() {
            a aVar = a.this;
            vj.f fVar = aVar.f12784h;
            if (fVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            requireActivity.getClass();
            oc0.c cVar = new oc0.c(aVar, 29);
            uf1.d a13 = uf1.d.a(requireActivity);
            MachineGuideActivity.a aVar2 = MachineGuideActivity.f15355y;
            MachineDefinition machineDefinition = fVar.f84307g;
            LocalisationKey localisationKey = i0.f71564a8;
            aVar2.getClass();
            a13.b(MachineGuideActivity.a.a(requireActivity, machineDefinition, localisationKey, "how-to-change-the-filters")).p(new w(cVar, 11), new w(new vc1.d(15), 12));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12790f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12790f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12790f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12791f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar) {
            super(0);
            this.f12791f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f12791f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12792f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.f12792f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f12792f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12793f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12794g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, l lVar) {
            super(0);
            this.f12793f = aVar;
            this.f12794g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12793f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f12794g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        a0 a0Var = new a0(this, 22);
        l a13 = m.a(n.NONE, new e(new d(this)));
        this.f12785i = new d0(p0.f86717a.b(AudioFilterManagementViewModel.class), new f(a13), a0Var, new g(null, a13));
        this.f12786j = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        this.f12783g = y13;
        vj.f.f84306m.getClass();
        vj.f a13 = f.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12784h = a13;
        gk.a aVar = a13.f84312l;
        this.d = aVar.d();
        this.e = aVar.f();
        this.f12782f = aVar.f35005u0.get();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = y.f24267s;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        y yVar = (y) q8.t.inflateInternal(layoutInflater, R.layout.fragment_audio_filter_management, viewGroup, false, null);
        yVar.getClass();
        d0 d0Var = this.f12785i;
        AudioFilterManagementViewModel audioFilterManagementViewModel = (AudioFilterManagementViewModel) d0Var.getValue();
        audioFilterManagementViewModel.f12768i.setValue(audioFilterManagementViewModel, AudioFilterManagementViewModel.f12764v[0], this.f12786j);
        AudioFilterManagementViewModel audioFilterManagementViewModel2 = (AudioFilterManagementViewModel) d0Var.getValue();
        ObservableInt observableInt = audioFilterManagementViewModel2.f12771l;
        audioFilterManagementViewModel2.f12770k.l(8);
        observableInt.l(0);
        gz1.b bVar = audioFilterManagementViewModel2.f12769j;
        dz1.r<o60.a> a13 = audioFilterManagementViewModel2.d.a();
        dz1.w wVar = c02.a.f10004c;
        zb.z(bVar, a13.S(wVar).H(fz1.a.a()).O(new ph.b(new po.d(audioFilterManagementViewModel2), 11)));
        bVar.a(audioFilterManagementViewModel2.f12765f.f64552a.S(wVar).H(fz1.a.a()).O(new ph.b(new po.b(audioFilterManagementViewModel2, 1), 12)));
        yVar.l((AudioFilterManagementViewModel) d0Var.getValue());
        View root = yVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f12782f;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = x0.f57775a;
        ij.b bVar = new ij.b("common.settings.filter_management", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/filtermanagement/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TAG_PROGRESS_SPINNER", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.settings.filtermanagement.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0360a {
        public /* synthetic */ C0360a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0360a() {
        }
    }
}
