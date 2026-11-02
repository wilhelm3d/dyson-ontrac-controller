package com.dyson.mobile.android.interactableec.home.help.internal;

import a01.k;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.dyson.mobile.android.R;
import fm1.o0;
import im1.zb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.a;
import na0.m;
import pa0.f5;
import pa0.t0;
import pd0.a;
import rz1.m1;
import uf0.l;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import za0.f;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/internal/InternalHelpActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InternalHelpActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f14483o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14484j;

    /* renamed from: k  reason: collision with root package name */
    public cb0.b f14485k;

    /* renamed from: m  reason: collision with root package name */
    public g f14487m;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14486l = new d0(p0.f86717a.b(cb0.g.class), new d(this), new k(this, 29), new e(null, this));

    /* renamed from: n  reason: collision with root package name */
    public final b f14488n = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/home/help/internal/InternalHelpActivity$b", "Lcb0/c;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements cb0.c {
        public b() {
        }

        @Override // cb0.c
        public final void a() {
            InternalHelpActivity internalHelpActivity = InternalHelpActivity.this;
            if (internalHelpActivity.f14487m == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            internalHelpActivity.onBackPressed();
        }

        @Override // cb0.c
        public final void b(a.b bVar) {
            cb0.b bVar2 = InternalHelpActivity.this.f14485k;
            if (bVar2 == null) {
                r.i("adapter");
                throw null;
            }
            bVar2.f10880g = bVar;
            bVar2.notifyDataSetChanged();
        }

        @Override // cb0.c
        public final void c(List<? extends wa0.c> list) {
            list.getClass();
            cb0.b bVar = InternalHelpActivity.this.f14485k;
            if (bVar == null) {
                r.i("adapter");
                throw null;
            }
            bVar.f10879f = list;
            bVar.notifyDataSetChanged();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/home/help/internal/InternalHelpActivity$c", "Landroidx/viewpager2/widget/ViewPager2$h;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends ViewPager2.h {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void c(int i13) {
            a aVar = InternalHelpActivity.f14483o;
            ((cb0.g) InternalHelpActivity.this.f14486l.getValue()).f10908k.onNext(Integer.valueOf(i13));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14491f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f14491f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14491f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14492f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14493g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f14492f = aVar;
            this.f14493g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14492f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14493g.getDefaultViewModelCreationExtras() : creationExtras;
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
        a13.f85710b = "Please use newIntent method to create a InternalHelpActivity Intent";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRA_INTERNAL_HELP_SECTION");
        String y13 = o0.y("COORDINATOR_ID", a14);
        g.f85506o.getClass();
        g a15 = g.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14487m = a15;
        oa0.b bVar = a15.f85510j;
        zf1.b a16 = bVar.a();
        pa0.a aVar = bVar.f59825a;
        this.f14484j = a16;
        t0.b(aVar);
        cb0.e eVar = bVar.f59904q0.get();
        za0.a aVar2 = bVar.f59919t0.get();
        f fVar = bVar.f59912r3.get();
        pf0.c b13 = t0.b(aVar);
        f5 f5Var = bVar.f59830b;
        bk0.f i13 = new l(aVar.f63154a).i();
        f5Var.getClass();
        xk0.e eVar2 = new xk0.e(f5Var.f63338b.d, i13);
        in0.e eVar3 = aVar.f63155b;
        sb0.c cVar = new sb0.c(new w90.d(eVar3.a(), eVar3.b(), eVar2));
        aVar.getClass();
        eVar.getClass();
        aVar2.getClass();
        fVar.getClass();
        this.f14485k = new cb0.b(eVar, aVar2, fVar, b13, cVar);
        d0 d0Var = this.f14486l;
        cb0.g gVar = (cb0.g) d0Var.getValue();
        String string = a14.getString("EXTRA_INTERNAL_HELP_SECTION");
        if (string == null) {
            pa.c.p("Required value was null.");
            return;
        }
        wa0.c valueOf = wa0.c.valueOf(string);
        valueOf.getClass();
        gVar.f10903f = valueOf;
        m mVar = (m) q8.g.d(this, R.layout.activity_internal_help);
        cb0.g gVar2 = (cb0.g) d0Var.getValue();
        gVar2.f10904g.setValue(gVar2, cb0.g.f10902m[0], this.f14488n);
        gz1.b bVar2 = gVar2.f10909l;
        cb0.e eVar4 = gVar2.d;
        m1 m1Var = eVar4.f10896j;
        ca0.e eVar5 = new ca0.e(new cb0.f(gVar2, 1), 9);
        m1Var.getClass();
        a.x xVar = kz1.a.e;
        zb.z(bVar2, m1Var.p(eVar5, xVar));
        m1 m1Var2 = eVar4.f10897k;
        ca0.e eVar6 = new ca0.e(new cb0.f(gVar2, 2), 10);
        m1Var2.getClass();
        bVar2.a(m1Var2.p(eVar6, xVar));
        mVar.l(gVar2);
        ViewPager2 viewPager2 = mVar.f56444h;
        cb0.b bVar3 = this.f14485k;
        if (bVar3 == null) {
            r.i("adapter");
            throw null;
        }
        viewPager2.setAdapter(bVar3);
        new zn1.g(mVar.f56442f, viewPager2, new bv1.f(10)).a();
        viewPager2.b(new c());
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/internal/InternalHelpActivity$a;", "", "<init>", "()V", "", "EXTRA_INTERNAL_HELP_SECTION", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
