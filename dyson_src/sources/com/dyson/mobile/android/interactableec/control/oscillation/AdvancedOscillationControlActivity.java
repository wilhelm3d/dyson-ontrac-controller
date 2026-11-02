package com.dyson.mobile.android.interactableec.control.oscillation;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.interactableec.control.oscillation.a;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.resources.view.DysonDial;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import eh0.f;
import fm1.o0;
import h12.y;
import hd0.h;
import hj.e;
import i12.q;
import ia0.i;
import im1.zb;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.a;
import kz1.b;
import md0.b0;
import nj.v4;
import pa0.p2;
import rz1.a0;
import rz1.s0;
import se1.e0;
import vd0.k;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import zc0.k0;
import zc0.w;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdvancedOscillationControlActivity extends l.b {

    /* renamed from: p  reason: collision with root package name */
    public static final a f14333p = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public vd0.b<AdvancedOscillationControlViewModel> f14334j;

    /* renamed from: k  reason: collision with root package name */
    public e f14335k;

    /* renamed from: m  reason: collision with root package name */
    public String f14337m;

    /* renamed from: n  reason: collision with root package name */
    public g f14338n;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14336l = new d0(p0.f86717a.b(AdvancedOscillationControlViewModel.class), new c(this), new ia0.a(this, 0), new d(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final b f14339o = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlActivity$b", "Lia0/i;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements i {
        public b() {
        }

        @Override // ia0.i
        public final void a() {
            AdvancedOscillationControlActivity advancedOscillationControlActivity = AdvancedOscillationControlActivity.this;
            if (advancedOscillationControlActivity.f14338n == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            advancedOscillationControlActivity.onBackPressed();
        }

        @Override // ia0.i
        public final void b(int i13) {
            a.C0469a c0469a = com.dyson.mobile.android.interactableec.control.oscillation.a.f14378g;
            AdvancedOscillationControlActivity advancedOscillationControlActivity = AdvancedOscillationControlActivity.this;
            String str = advancedOscillationControlActivity.f14337m;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0469a.getClass();
            com.dyson.mobile.android.interactableec.control.oscillation.a aVar = new com.dyson.mobile.android.interactableec.control.oscillation.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putInt("OSC_IDLE_STATE", i13);
            aVar.setArguments(bundle);
            FragmentManager supportFragmentManager = advancedOscillationControlActivity.getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            f13.g(R.id.fragment_container, aVar, null, 1);
            f13.f();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14341f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f14341f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14341f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14342f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14343g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f14342f = aVar;
            this.f14343g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14342f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14343g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        dz1.r<Boolean> D;
        Integer valueOf;
        dz1.r<k0.b> rVar;
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            super.onCreate(bundle);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to create a AdvancedOscillationControlActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f14337m = y13;
        g.f85506o.getClass();
        g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14338n = a14;
        oa0.b bVar = a14.f85510j;
        p2 p2Var = bVar.f59835c;
        f<w> fVar = bVar.F.get();
        md0.f fVar2 = bVar.f59926u2.get();
        pa0.a aVar = bVar.f59825a;
        f<w> fVar3 = bVar.F.get();
        se1.y yVar = new se1.y(aVar.f63154a);
        fVar3.getClass();
        MachineType b13 = fVar3.b();
        String packageName = aVar.f63154a.getPackageName();
        packageName.getClass();
        k kVar = new k(b13, yVar, packageName);
        p2Var.getClass();
        fVar.getClass();
        fVar2.getClass();
        this.f14334j = new vd0.b<>(new bx1.y(25, fVar, fVar2, kVar));
        this.f14335k = bVar.e.get();
        super.onCreate(bundle);
        AdvancedOscillationControlViewModel advancedOscillationControlViewModel = (AdvancedOscillationControlViewModel) this.f14336l.getValue();
        advancedOscillationControlViewModel.f14349j.setValue(advancedOscillationControlViewModel, AdvancedOscillationControlViewModel.f14344z[0], this.f14339o);
        md0.f fVar4 = advancedOscillationControlViewModel.f14347h;
        gz1.b bVar2 = advancedOscillationControlViewModel.f14363x;
        zb.z(bVar2, advancedOscillationControlViewModel.d.O(new i60.g(new ia0.b(advancedOscillationControlViewModel, 4), 13)));
        x12.k0 k0Var = new x12.k0();
        k0 k0Var2 = advancedOscillationControlViewModel.f14346g;
        if (k0Var2 != null && (rVar = k0Var2.f92413m) != null) {
            bVar2.a(rVar.O(new i60.g(new ia0.c(k0Var, 0), 6)));
        }
        ed0.b bVar3 = advancedOscillationControlViewModel.f14345f;
        if (bVar3 == null || (D = bVar3.n()) == null) {
            D = dz1.r.D(Boolean.FALSE);
        }
        dz1.r<b0> rVar2 = fVar4.f53719p;
        hd0.c cVar = new hd0.c(new h(23), 6);
        rVar2.getClass();
        b.a aVar2 = kz1.b.f50218a;
        a0 a0Var = new a0(rVar2, cVar);
        a.r rVar3 = kz1.a.f50213a;
        bVar2.a(a0Var.o(rVar3).a0(D, new i60.g(new h2.o0(k0Var, 8), 7)).O(new i60.g(new ia0.b(advancedOscillationControlViewModel, 1), 8)));
        e0 e0Var = e0.f76037a;
        dz1.r<Integer> rVar4 = fVar4.f53721r;
        hd0.c cVar2 = new hd0.c(new h(25), 8);
        rVar4.getClass();
        a0 a0Var2 = new a0(rVar4, cVar2);
        dz1.r<Integer> rVar5 = advancedOscillationControlViewModel.f14364y;
        h61.a aVar3 = new h61.a(24);
        e0Var.getClass();
        bVar2.a(e0.e(a0Var2, rVar5, aVar3).W(30L, TimeUnit.SECONDS).P(new i60.g(new ia0.b(advancedOscillationControlViewModel, 6), 4), new i60.g(new ia0.b(advancedOscillationControlViewModel, 0), 5)));
        bVar2.a(new a0(new rz1.r(fVar4.f53719p.a0(advancedOscillationControlViewModel.e.n(), new i60.g(new h61.a(21), 9)), rVar3, new i60.g(new h61.a(22), 10)), new hd0.c(new ia0.b(advancedOscillationControlViewModel, 2), 7)).O(new i60.g(new ia0.b(advancedOscillationControlViewModel, 3), 11)));
        d02.d<Boolean> dVar = advancedOscillationControlViewModel.f14361v;
        bVar2.a(dz1.r.E(dVar, new s0(dVar.n(NetworkRetryInterceptor.DEFAULT_RETRY_DELAY, TimeUnit.MILLISECONDS), new i60.g(new h(24), 12))).O(new i60.g(new ia0.b(advancedOscillationControlViewModel, 5), 14)));
        na0.a aVar4 = (na0.a) q8.g.d(this, R.layout.activity_advanced_oscillation);
        DysonDial dysonDial = aVar4.f56128k;
        dysonDial.getClass();
        com.dyson.mobile.android.resources.view.b.e(dysonDial, q.N(com.dyson.mobile.android.resources.view.b.f15766c));
        dysonDial.setLayoutResource(advancedOscillationControlViewModel.f14350k);
        int T = advancedOscillationControlViewModel.T();
        if (advancedOscillationControlViewModel.f14347h.f53712i) {
            valueOf = null;
        } else {
            com.dyson.mobile.android.resources.view.b bVar4 = com.dyson.mobile.android.resources.view.b.f15764a;
            d22.k kVar2 = com.dyson.mobile.android.resources.view.b.f15765b;
            bVar4.getClass();
            valueOf = Integer.valueOf(com.dyson.mobile.android.resources.view.b.c(kVar2));
        }
        com.dyson.mobile.android.resources.view.b.g(dysonDial, T, valueOf, null);
        aVar4.l(dysonDial);
        aVar4.m(advancedOscillationControlViewModel);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        e eVar = this.f14335k;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = v4.f57745a;
        ij.b bVar = new ij.b("ec.instant_control.advanced_oscillation", null, 2, null);
        e.a aVar = e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
