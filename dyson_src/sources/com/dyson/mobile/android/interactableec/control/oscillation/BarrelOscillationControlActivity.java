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
import d22.k;
import eh0.f;
import fm1.o0;
import h12.y;
import hd0.h;
import hj.e;
import ia0.e;
import ia0.i;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import md0.b0;
import md0.x;
import nj.v4;
import pa0.p2;
import rz1.a0;
import se1.e0;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import zc0.w;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/BarrelOscillationControlActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BarrelOscillationControlActivity extends l.b {

    /* renamed from: p  reason: collision with root package name */
    public static final a f14366p = new a(null);

    /* renamed from: q  reason: collision with root package name */
    public static final k f14367q = new k(135, 225);

    /* renamed from: j  reason: collision with root package name */
    public vd0.b<e> f14368j;

    /* renamed from: k  reason: collision with root package name */
    public hj.e f14369k;

    /* renamed from: m  reason: collision with root package name */
    public String f14371m;

    /* renamed from: n  reason: collision with root package name */
    public g f14372n;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14370l = new d0(p0.f86717a.b(e.class), new c(this), new ia0.a(this, 1), new d(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final b f14373o = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/oscillation/BarrelOscillationControlActivity$b", "Lia0/i;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements i {
        public b() {
        }

        @Override // ia0.i
        public final void a() {
            BarrelOscillationControlActivity barrelOscillationControlActivity = BarrelOscillationControlActivity.this;
            if (barrelOscillationControlActivity.f14372n == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            barrelOscillationControlActivity.onBackPressed();
        }

        @Override // ia0.i
        public final void b(int i13) {
            a.C0469a c0469a = com.dyson.mobile.android.interactableec.control.oscillation.a.f14378g;
            BarrelOscillationControlActivity barrelOscillationControlActivity = BarrelOscillationControlActivity.this;
            String str = barrelOscillationControlActivity.f14371m;
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
            FragmentManager supportFragmentManager = barrelOscillationControlActivity.getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            f13.g(R.id.fragment_container, aVar, null, 1);
            f13.f();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14375f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f14375f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14375f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14376f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14377g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f14376f = aVar;
            this.f14377g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14376f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14377g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to create a BarrelOscillationControlActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f14371m = y13;
        g.f85506o.getClass();
        g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14372n = a14;
        oa0.b bVar = a14.f85510j;
        p2 p2Var = bVar.f59835c;
        f<w> fVar = bVar.F.get();
        pa0.a aVar = bVar.f59825a;
        f<w> fVar2 = bVar.F.get();
        se1.y yVar = new se1.y(aVar.f63154a);
        fVar2.getClass();
        MachineType b13 = fVar2.b();
        String packageName = aVar.f63154a.getPackageName();
        packageName.getClass();
        vd0.k kVar = new vd0.k(b13, yVar, packageName);
        p2Var.getClass();
        fVar.getClass();
        this.f14368j = new vd0.b<>(new l91.d(27, fVar, kVar));
        this.f14369k = bVar.e.get();
        e eVar = (e) this.f14370l.getValue();
        eVar.f41274f.setValue(eVar, e.f41270k[0], this.f14373o);
        gz1.b bVar2 = eVar.f41278j;
        zb.z(bVar2, eVar.d.O(new i60.g(new ia0.d(eVar, 2), 17)));
        md0.k kVar2 = eVar.e;
        dz1.r<b0> rVar = kVar2.f53738j;
        hd0.c cVar = new hd0.c(new h(26), 9);
        rVar.getClass();
        b.a aVar2 = kz1.b.f50218a;
        bVar2.a(new a0(rVar, cVar).o(kz1.a.f50213a).O(new i60.g(new ia0.d(eVar, 0), 15)));
        e0 e0Var = e0.f76037a;
        dz1.r<b0> rVar2 = kVar2.f53738j;
        dz1.r<x> rVar3 = kVar2.f53739k;
        h61.a aVar3 = new h61.a(25);
        e0Var.getClass();
        bVar2.a(e0.e(rVar2, rVar3, aVar3).O(new i60.g(new ia0.d(eVar, 1), 16)));
        na0.c cVar2 = (na0.c) q8.g.d(this, R.layout.activity_barrel_oscillation);
        DysonDial dysonDial = cVar2.f56199j;
        dysonDial.getClass();
        com.dyson.mobile.android.resources.view.b.f15764a.getClass();
        k kVar3 = f14367q;
        kVar3.getClass();
        int i13 = kVar3.d;
        int i14 = kVar3.e;
        com.dyson.mobile.android.resources.view.b.e(dysonDial, i14 - i13);
        dysonDial.setLayoutResource(eVar.f41275g);
        com.dyson.mobile.android.resources.view.b.g(dysonDial, i14 - i13, Integer.valueOf(com.dyson.mobile.android.resources.view.b.c(kVar3)), null);
        com.dyson.mobile.android.resources.view.b.b(dysonDial, com.dyson.mobile.android.resources.view.b.c(kVar3), R.integer.duration_0000);
        cVar2.l(dysonDial);
        cVar2.m(eVar);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f14369k;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = v4.f57745a;
        ij.b bVar = new ij.b("ec.instant_control.advanced_oscillation", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/oscillation/BarrelOscillationControlActivity$a;", "", "<init>", "()V", "Ld22/k;", "ORIENTATION_LIMITS", "Ld22/k;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
