package com.dyson.mobile.android.connectionjourney.nonconnected.scanserial;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a;
import ef1.h;
import h12.f0;
import h12.n;
import java.util.concurrent.Executor;
import k30.j;
import k30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m9.w;
import nj.z2;
import s0.u;
import s1.k;
import w00.i;
import x12.m;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/ScanSerialFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScanSerialFragment extends Fragment {
    public h d;
    public k30.d e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f13706f;

    /* renamed from: g  reason: collision with root package name */
    public k f13707g;

    /* renamed from: h  reason: collision with root package name */
    public s1.d f13708h;

    /* renamed from: i  reason: collision with root package name */
    public i f13709i;

    /* renamed from: j  reason: collision with root package name */
    public k30.a f13710j;

    /* renamed from: k  reason: collision with root package name */
    public l f13711k;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13712a;

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
            f13712a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements Function1<com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a, f0> {
        public b(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.d.class, "handleEvent", "handleEvent(Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/ScanSerialEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a aVar) {
            com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a aVar2 = aVar;
            aVar2.getClass();
            ((com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.d) this.receiver).S(aVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements m9.p, m {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof m9.p) && (obj instanceof m)) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13713f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f13713f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13713f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13714f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar) {
            super(0);
            this.f13714f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13714f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f13715f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h12.l lVar) {
            super(0);
            this.f13715f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13715f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13716f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f13717g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, h12.l lVar) {
            super(0);
            this.f13716f = aVar;
            this.f13717g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13716f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13717g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public ScanSerialFragment() {
        j jVar = new j(this, 0);
        h12.l a13 = h12.m.a(n.NONE, new e(new d(this)));
        this.f13706f = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.d.class), new f(a13), jVar, new g(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        i c13 = i.c(requireContext());
        c13.getClass();
        this.f13709i = c13;
        c13.e.O(this);
        this.f13708h = new s1.d(requireContext());
        this.f13707g = new k(requireContext());
        int i13 = requireActivity().getResources().getDisplayMetrics().heightPixels;
        int i14 = requireActivity().getResources().getDisplayMetrics().widthPixels;
        int a13 = zs0.k.a(400);
        int b13 = (int) (zs0.k.b(i14) * 0.2d);
        int b14 = (int) (zs0.k.b(i13) * 0.6d);
        int i15 = ((i13 - a13) / 2) - (b14 / 2);
        Rect rect = new Rect(b13, i15, (i14 - (b13 * 2)) + b13, b14 + i15);
        this.f13711k = new l(this);
        s1.d dVar = this.f13708h;
        if (dVar == null) {
            r.i("cameraController");
            throw null;
        }
        Executor h13 = c7.a.h(requireContext());
        h13.getClass();
        l lVar = this.f13711k;
        lVar.getClass();
        this.f13710j = new k30.a(dVar, h13, lVar, new l30.b(), rect);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(-1814084584, true, new k30.k(this, rect, 0)));
        s().f13734i.observe(getViewLifecycleOwner(), new c(new jg0.a(this, 9)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        k30.a aVar = this.f13710j;
        if (aVar != null) {
            ((zq1.a) aVar.f46763f.getValue()).close();
        }
        this.f13710j = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s().S(a.g.f13726a);
        k30.a aVar = this.f13710j;
        if (aVar != null) {
            aVar.f46764g = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.e == null) {
            r.i("onScanTrigger");
            throw null;
        }
        k30.a aVar = this.f13710j;
        if (aVar != null) {
            aVar.a();
        }
        s().T();
        int i13 = z2.f57808a;
        y9.w.t("connection_journey.ocr.scan_serial_number", null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.d s13 = s();
        s13.f13736k = false;
        CountDownTimer countDownTimer = s13.f13737l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        s13.f13737l = null;
        if (this.e == null) {
            r.i("onScanTrigger");
            throw null;
        }
        s1.d dVar = this.f13708h;
        if (dVar == null) {
            r.i("cameraController");
            throw null;
        }
        u.a();
        dVar.G = null;
        dVar.f74571n = null;
        s1.n nVar = dVar.f74572o;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.d s() {
        return (com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.d) this.f13706f.getValue();
    }
}
