package com.dyson.mobile.android.interactableec.control.oscillation;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.resources.view.DysonDial;
import d22.k;
import dz1.r;
import hd0.h;
import i12.c0;
import i12.o0;
import i12.q;
import i12.q0;
import i12.t;
import im1.zb;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import md0.a0;
import md0.f;
import md0.h;
import nd0.i;
import q8.n;
import se1.e0;
import ss0.m;
import x12.p0;
import x12.u0;
import x12.y;
import z60.b0;
import zc0.k0;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0013BA\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlViewModel;", "Lm9/u;", "Lss0/m$a;", "Lss0/m$b;", "Ldz1/r;", "Lo60/a;", "connectionState", "Lnd0/i;", "powerController", "Led0/b;", "autoController", "Lzc0/k0;", "heatModeController", "Lmd0/f;", "advancedOscillationController", "Lvd0/k;", "machineIconSelector", "<init>", "(Ldz1/r;Lnd0/i;Led0/b;Lzc0/k0;Lmd0/f;Lvd0/k;)V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdvancedOscillationControlViewModel extends u implements m.a, m.b {
    public static final List<a0> A;
    public static final Map<a0, Integer> B;

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ e22.m<Object>[] f14344z = {p0.f86717a.f(new y(AdvancedOscillationControlViewModel.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/interactableec/control/oscillation/OscillationNavigator;", 0))};
    public final r<o60.a> d;
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final ed0.b f14345f;

    /* renamed from: g  reason: collision with root package name */
    public final k0 f14346g;

    /* renamed from: h  reason: collision with root package name */
    public final f f14347h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f14348i;

    /* renamed from: j  reason: collision with root package name */
    public final tf1.a f14349j;

    /* renamed from: k  reason: collision with root package name */
    public final int f14350k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14351l;

    /* renamed from: m  reason: collision with root package name */
    public final n<LocalisationKey> f14352m;

    /* renamed from: n  reason: collision with root package name */
    public final ObservableBoolean f14353n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableInt f14354o;

    /* renamed from: p  reason: collision with root package name */
    public final AdvancedOscillationControlViewModel$angleOscillationIndex$1 f14355p;

    /* renamed from: q  reason: collision with root package name */
    public final c f14356q;

    /* renamed from: r  reason: collision with root package name */
    public final d f14357r;

    /* renamed from: s  reason: collision with root package name */
    public int f14358s;

    /* renamed from: t  reason: collision with root package name */
    public int f14359t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14360u;

    /* renamed from: v  reason: collision with root package name */
    public final d02.d<Boolean> f14361v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14362w;

    /* renamed from: x  reason: collision with root package name */
    public final gz1.b f14363x;

    /* renamed from: y  reason: collision with root package name */
    public final r<Integer> f14364y;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14365a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.UPGRADING_SOFTWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14365a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlViewModel$c", "Lq8/n;", "Ld22/k;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends n<k> {
        public c(q8.k[] kVarArr) {
            super(kVarArr);
        }

        @Override // q8.n
        public final k l() {
            AdvancedOscillationControlViewModel advancedOscillationControlViewModel = AdvancedOscillationControlViewModel.this;
            int S = advancedOscillationControlViewModel.S(advancedOscillationControlViewModel.f14354o.d);
            int T = advancedOscillationControlViewModel.T();
            int i13 = T / 2;
            return new k(S - i13, S + (T - i13));
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlViewModel$d", "Lq8/n;", "", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends n<String> {
        public d(q8.k[] kVarArr) {
            super(kVarArr);
        }

        @Override // q8.n
        public final String l() {
            u0 u0Var = u0.f86723a;
            AdvancedOscillationControlViewModel advancedOscillationControlViewModel = AdvancedOscillationControlViewModel.this;
            return String.format("pos : %1$03d%nval : %2$d°%nosc : %3$s°", Arrays.copyOf(new Object[]{Integer.valueOf(advancedOscillationControlViewModel.f14354o.d), Integer.valueOf(advancedOscillationControlViewModel.f14358s), advancedOscillationControlViewModel.f14356q.l()}, 3));
        }
    }

    static {
        new a(null);
        List<a0> h13 = t.h(a0.PRESET_ANGLE_45, a0.PRESET_ANGLE_90, a0.PRESET_ANGLE_180, a0.PRESET_ANGLE_350);
        A = h13;
        B = o0.a(q0.k(c0.I0(h13, new k(1, h13.size()))), new h(22));
    }

    public AdvancedOscillationControlViewModel(r<o60.a> rVar, i iVar, ed0.b bVar, k0 k0Var, f fVar, vd0.k kVar) {
        rVar.getClass();
        iVar.getClass();
        fVar.getClass();
        kVar.getClass();
        this.d = rVar;
        this.e = iVar;
        this.f14345f = bVar;
        this.f14346g = k0Var;
        this.f14347h = fVar;
        boolean z13 = fVar.f53712i;
        this.f14348i = z13;
        this.f14349j = new tf1.a(null, 1, null);
        this.f14350k = kVar.a(2131231870, "ic_adv_osc_", true);
        this.f14351l = !z13;
        this.f14352m = new n<>(rf0.f.L6);
        this.f14353n = new ObservableBoolean(this.f14351l);
        com.dyson.mobile.android.resources.view.b bVar2 = com.dyson.mobile.android.resources.view.b.f15764a;
        k kVar2 = com.dyson.mobile.android.resources.view.b.f15765b;
        bVar2.getClass();
        ObservableInt observableInt = new ObservableInt(com.dyson.mobile.android.resources.view.b.c(kVar2) - kVar2.d);
        this.f14354o = observableInt;
        AdvancedOscillationControlViewModel$angleOscillationIndex$1 advancedOscillationControlViewModel$angleOscillationIndex$1 = new AdvancedOscillationControlViewModel$angleOscillationIndex$1(this, q.I(0, com.dyson.mobile.android.resources.view.b.f15766c));
        this.f14355p = advancedOscillationControlViewModel$angleOscillationIndex$1;
        this.f14356q = new c(new q8.k[]{advancedOscillationControlViewModel$angleOscillationIndex$1, observableInt});
        this.f14357r = new d(new q8.k[]{advancedOscillationControlViewModel$angleOscillationIndex$1, observableInt});
        this.f14358s = com.dyson.mobile.android.resources.view.b.d(observableInt.d, T());
        this.f14361v = new d02.d<>();
        this.f14363x = new gz1.b();
        e0 e0Var = e0.f76037a;
        r<md0.b0> rVar2 = fVar.f53719p;
        r<a0> rVar3 = fVar.f53720q;
        h61.a aVar = new h61.a(23);
        e0Var.getClass();
        this.f14364y = e0.e(rVar2, rVar3, aVar);
    }

    @Override // ss0.m.a
    public final void O(DysonDial dysonDial, int i13) {
        dysonDial.getClass();
        int S = S(i13);
        if (!this.f14348i && T() <= 0) {
            com.dyson.mobile.android.resources.view.b.h(dysonDial, S);
        }
        com.dyson.mobile.android.resources.view.b.b(dysonDial, S, 17694721);
    }

    public final int S(int i13) {
        boolean z13 = this.f14348i;
        if (z13 || T() <= 0) {
            return (z13 || T() > 0) ? com.dyson.mobile.android.resources.view.b.d(i13, T()) : this.f14358s;
        }
        com.dyson.mobile.android.resources.view.b bVar = com.dyson.mobile.android.resources.view.b.f15764a;
        k kVar = com.dyson.mobile.android.resources.view.b.f15765b;
        bVar.getClass();
        return com.dyson.mobile.android.resources.view.b.c(kVar);
    }

    public final int T() {
        return com.dyson.mobile.android.resources.view.b.f15766c[this.f14355p.d];
    }

    public final void U(boolean z13) {
        this.f14351l = z13;
        if (!z13) {
            this.f14352m.m(rf0.f.L6);
        }
        this.f14353n.m(z13 && !this.f14360u);
    }

    @Override // ss0.m.b
    public final void e(DysonDial dysonDial) {
        dysonDial.getClass();
        boolean z13 = this.f14348i;
        if (!z13 && T() > 0) {
            com.dyson.mobile.android.resources.view.b bVar = com.dyson.mobile.android.resources.view.b.f15764a;
            k kVar = com.dyson.mobile.android.resources.view.b.f15765b;
            bVar.getClass();
            this.f14358s = com.dyson.mobile.android.resources.view.b.c(kVar);
        } else if (z13) {
            this.f14358s = com.dyson.mobile.android.resources.view.b.d(this.f14354o.d, T());
        }
        if (this.f14351l && z13) {
            this.f14361v.onNext(Boolean.TRUE);
            int i13 = this.f14355p.d;
            f fVar = this.f14347h;
            gz1.b bVar2 = this.f14363x;
            if (i13 == 0) {
                zb.z(bVar2, fVar.o(new h.a(this.f14358s)).v());
                return;
            }
            zb.z(bVar2, fVar.o(new h.c(A.get(i13 - 1), Integer.valueOf(this.f14358s))).v());
        }
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.f14363x.e();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlViewModel$a;", "", "<init>", "()V", "", "DIAL_IMAGE_PREFIX", "Ljava/lang/String;", "", "LOCATING_TIMEOUT_SECONDS", "J", "", "OSCILLATION_PRESET_OFF_INDEX", "I", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
