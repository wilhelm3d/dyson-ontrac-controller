package com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ObservableBoolean;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b;
import com.dyson.mobile.android.resources.view.edittext.DysonPinEditText;
import ef1.h;
import f20.p4;
import fm1.o0;
import h12.l;
import h12.n;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m10.j0;
import m9.p;
import m9.w;
import w00.i;
import x12.m;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y9.u;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/MachineSerialCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MachineSerialCaptureFragment extends Fragment {
    public h d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public i f13738f;

    /* renamed from: g  reason: collision with root package name */
    public p4 f13739g;

    /* renamed from: h  reason: collision with root package name */
    public final u f13740h;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13741a;

        static {
            int[] iArr = new int[in0.h.values().length];
            try {
                iArr[in0.h.MQTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[in0.h.GATT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[in0.h.GATT_MQTT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13741a = iArr;
        }
    }

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
        public final /* synthetic */ Fragment f13742f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f13742f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13742f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13743f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar) {
            super(0);
            this.f13743f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13743f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13744f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.f13744f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13744f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13745f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13746g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, l lVar) {
            super(0);
            this.f13745f = aVar;
            this.f13746g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13745f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13746g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public MachineSerialCaptureFragment() {
        j0 j0Var = new j0(this, 3);
        l a13 = h12.m.a(n.NONE, new e(new d(this)));
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b.class), new f(a13), j0Var, new g(null, a13));
        this.f13740h = new u(q0Var.b(m30.a.class), new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        i c13 = i.c(requireContext());
        c13.getClass();
        this.f13738f = c13;
        c13.e.J(this);
        int i13 = p4.f29252m;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        p4 p4Var = (p4) q8.t.inflateInternal(layoutInflater, R.layout.fragment_machine_serial_capture, viewGroup, false, null);
        p4Var.getClass();
        this.f13739g = p4Var;
        d0 d0Var = this.e;
        p4Var.l((com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b) d0Var.getValue());
        com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b bVar = (com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b) d0Var.getValue();
        LaunchState launchState = ((m30.a) this.f13740h.getValue()).f52971a;
        ObservableBoolean observableBoolean = bVar.f13757l;
        q8.n<String> nVar = bVar.f13755j;
        bVar.f13766u = launchState;
        int i14 = b.c.f13772a[launchState.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                nVar.m(pf0.f.c(rf0.d0.f71128n));
                bVar.f13756k.m(pf0.f.c(rf0.d0.f71129o));
                observableBoolean.m(true);
            } else if (i14 != 3) {
                ma.e.o();
                return null;
            } else {
                nVar.m(pf0.f.c(rf0.d0.f71126l));
                observableBoolean.m(true);
                bVar.f13758m.m(true);
            }
        }
        ((com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b) d0Var.getValue()).f13764s.observe(getViewLifecycleOwner(), new b(new lw0.e(this, 1)));
        getLifecycle().a((com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b) d0Var.getValue());
        p4 p4Var2 = this.f13739g;
        if (p4Var2 == null) {
            r.i("binding");
            throw null;
        }
        View root = p4Var2.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getLifecycle().c((com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b) this.e.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        cd.b.B(requireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        p4 p4Var = this.f13739g;
        if (p4Var == null) {
            r.i("binding");
            throw null;
        }
        DysonPinEditText dysonPinEditText = p4Var.f29253f;
        dysonPinEditText.getClass();
        o0.x(dysonPinEditText);
    }
}
