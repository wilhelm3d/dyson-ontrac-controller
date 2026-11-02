package com.dyson.mobile.android.interactableec.control;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import cc0.z;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.interactableec.control.oscillation.AdvancedOscillationControlActivity;
import com.dyson.mobile.android.interactableec.control.oscillation.BarrelOscillationControlActivity;
import com.dyson.mobile.android.interactableec.control.sleeptimer.SleepTimerControlActivity;
import da0.k;
import fm1.o0;
import h12.y;
import hj.e;
import i12.g0;
import im1.zb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ka0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la0.a;
import la0.c;
import la0.e;
import la0.g;
import la0.h;
import la0.i;
import la0.j;
import la0.l;
import la0.n;
import la0.o;
import la0.p;
import nj.z4;
import rz1.s0;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import x90.m;
import zc0.w;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/ECControlActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECControlActivity extends l.b {

    /* renamed from: r  reason: collision with root package name */
    public static final a f14301r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f14302s = R.id.slider_indicator_container;

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14303j;

    /* renamed from: k  reason: collision with root package name */
    public o f14304k;

    /* renamed from: l  reason: collision with root package name */
    public hj.e f14305l;

    /* renamed from: n  reason: collision with root package name */
    public g f14307n;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f14306m = new d0(p0.f86717a.b(da0.o.class), new d(this), new z(this, 11), new e(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final c f14308o = new c();

    /* renamed from: p  reason: collision with root package name */
    public final b f14309p = new b();

    /* renamed from: q  reason: collision with root package name */
    public final f f14310q = new f();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/ECControlActivity$b", "Lea0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ea0.a {
        public b() {
        }

        @Override // ea0.a
        public final void b(String str) {
            ECControlActivity eCControlActivity = ECControlActivity.this;
            g gVar = eCControlActivity.f14307n;
            if (gVar != null) {
                gVar.w(eCControlActivity, str, new c91.c(eCControlActivity, 13));
            } else {
                r.i("coordinator");
                throw null;
            }
        }

        @Override // ea0.a
        public final void c() {
            ECControlActivity eCControlActivity = ECControlActivity.this;
            g gVar = eCControlActivity.f14307n;
            if (gVar != null) {
                gVar.D(eCControlActivity);
            } else {
                r.i("coordinator");
                throw null;
            }
        }

        @Override // ea0.a
        public final void i() {
            w81.c.f85438h.getClass();
            new w81.c().showNow(ECControlActivity.this.getSupportFragmentManager(), "ContactDysonDialog");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/ECControlActivity$c", "Lda0/k;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements k {

        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14313a;

            static {
                int[] iArr = new int[n.values().length];
                try {
                    iArr[n.FAN_SPEED_DIGITAL_DISPLAY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n.HEAT_MODE_DIGITAL_DISPLAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n.FAN_SPEED_DISPLAY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n.HEAT_MODE_DISPLAY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[n.HUMIDIFICATION_DISPLAY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[n.TILT_ANGLE_DISPLAY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f14313a = iArr;
            }
        }

        public c() {
        }

        @Override // da0.k
        public final void a() {
            ECControlActivity eCControlActivity = ECControlActivity.this;
            if (eCControlActivity.f14307n == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            eCControlActivity.onBackPressed();
        }

        @Override // da0.k
        public final void b(m.b bVar) {
            bVar.getClass();
            a aVar = ECControlActivity.f14301r;
            m mVar = ECControlActivity.this.c1().f23220g;
            if (mVar != null) {
                mVar.a(bVar);
            }
        }

        @Override // da0.k
        public final p c(i iVar) {
            iVar.getClass();
            ECControlActivity eCControlActivity = ECControlActivity.this;
            o oVar = eCControlActivity.f14304k;
            if (oVar == null) {
                r.i("sliderIndicatorTypeSelector");
                throw null;
            }
            switch (a.f14313a[oVar.a(iVar).ordinal()]) {
                case 1:
                    a.C1582a c1582a = la0.a.f51052f;
                    g gVar = eCControlActivity.f14307n;
                    if (gVar == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str = gVar.f85509i;
                    c1582a.getClass();
                    str.getClass();
                    la0.a aVar = new la0.a();
                    Bundle bundle = new Bundle();
                    bundle.putString("COORDINATOR_ID", str);
                    aVar.setArguments(bundle);
                    FragmentManager supportFragmentManager = eCControlActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.i(ECControlActivity.f14302s, aVar, null);
                    aVar2.n(true, true);
                    return (p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(la0.b.class));
                case 2:
                    e.a aVar3 = la0.e.f51070f;
                    g gVar2 = eCControlActivity.f14307n;
                    if (gVar2 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str2 = gVar2.f85509i;
                    aVar3.getClass();
                    str2.getClass();
                    la0.e eVar = new la0.e();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("COORDINATOR_ID", str2);
                    eVar.setArguments(bundle2);
                    FragmentManager supportFragmentManager2 = eCControlActivity.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager2);
                    aVar4.i(ECControlActivity.f14302s, eVar, null);
                    aVar4.n(true, true);
                    p pVar = (p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(la0.f.class));
                    la0.f fVar = (la0.f) pVar;
                    if (eCControlActivity.c1().f23221h.e != null) {
                        return pVar;
                    }
                    return null;
                case 3:
                    c.a aVar5 = la0.c.f51062f;
                    g gVar3 = eCControlActivity.f14307n;
                    if (gVar3 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str3 = gVar3.f85509i;
                    aVar5.getClass();
                    str3.getClass();
                    la0.c cVar = new la0.c();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("COORDINATOR_ID", str3);
                    cVar.setArguments(bundle3);
                    FragmentManager supportFragmentManager3 = eCControlActivity.getSupportFragmentManager();
                    supportFragmentManager3.getClass();
                    androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager3);
                    aVar6.i(ECControlActivity.f14302s, cVar, null);
                    aVar6.n(true, true);
                    return (p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(la0.d.class));
                case 4:
                    g.a aVar7 = la0.g.f51082f;
                    w90.g gVar4 = eCControlActivity.f14307n;
                    if (gVar4 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str4 = gVar4.f85509i;
                    aVar7.getClass();
                    str4.getClass();
                    la0.g gVar5 = new la0.g();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("COORDINATOR_ID", str4);
                    gVar5.setArguments(bundle4);
                    FragmentManager supportFragmentManager4 = eCControlActivity.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(supportFragmentManager4);
                    aVar8.i(ECControlActivity.f14302s, gVar5, null);
                    aVar8.n(true, true);
                    p pVar2 = (p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(h.class));
                    h hVar = (h) pVar2;
                    if (eCControlActivity.c1().f23221h.e != null) {
                        return pVar2;
                    }
                    return null;
                case 5:
                    i.a aVar9 = la0.i.f51095f;
                    w90.g gVar6 = eCControlActivity.f14307n;
                    if (gVar6 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str5 = gVar6.f85509i;
                    aVar9.getClass();
                    str5.getClass();
                    la0.i iVar2 = new la0.i();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("COORDINATOR_ID", str5);
                    iVar2.setArguments(bundle5);
                    FragmentManager supportFragmentManager5 = eCControlActivity.getSupportFragmentManager();
                    supportFragmentManager5.getClass();
                    androidx.fragment.app.a aVar10 = new androidx.fragment.app.a(supportFragmentManager5);
                    aVar10.i(ECControlActivity.f14302s, iVar2, null);
                    aVar10.n(true, true);
                    return (p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(la0.k.class));
                case 6:
                    l.a aVar11 = l.f51117f;
                    w90.g gVar7 = eCControlActivity.f14307n;
                    if (gVar7 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str6 = gVar7.f85509i;
                    aVar11.getClass();
                    str6.getClass();
                    l lVar = new l();
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("COORDINATOR_ID", str6);
                    bundle6.putBoolean("IS_OPENED_FROM_SCHEDULE_CONTROL", false);
                    lVar.setArguments(bundle6);
                    FragmentManager supportFragmentManager6 = eCControlActivity.getSupportFragmentManager();
                    androidx.fragment.app.a f13 = y.f(supportFragmentManager6, supportFragmentManager6);
                    f13.i(ECControlActivity.f14302s, lVar, null);
                    f13.n(true, true);
                    return (p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(la0.m.class));
                default:
                    ma.e.o();
                    return null;
            }
        }

        @Override // da0.k
        public final void d() {
            dz1.r<Integer> rVar;
            dz1.r<Boolean> rVar2;
            a aVar = ECControlActivity.f14301r;
            ECControlActivity eCControlActivity = ECControlActivity.this;
            da0.o c13 = eCControlActivity.c1();
            zb.z(c13.f23235v, dz1.b.B(100L, TimeUnit.MILLISECONDS).o(new cl0.h(new da0.n(c13, 4), 23)).l(new a20.h(c13, 12)).v());
            i.a aVar2 = la0.i.f51095f;
            w90.g gVar = eCControlActivity.f14307n;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            aVar2.getClass();
            str.getClass();
            la0.i iVar = new la0.i();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            iVar.setArguments(bundle);
            FragmentManager supportFragmentManager = eCControlActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            aVar3.i(ECControlActivity.f14302s, iVar, null);
            aVar3.n(true, true);
            la0.k kVar = (la0.k) ((p) new ViewModelProvider(eCControlActivity, eCControlActivity.d1()).a(p0.f86717a.b(la0.k.class)));
            kVar.f51106g.f63972f.U(1L).O(new ki0.g(new j(kVar, 2), 18));
            ld0.a aVar4 = kVar.e;
            if (aVar4 != null && (rVar2 = aVar4.f51503f) != null) {
                rVar2.U(1L).P(new ki0.g(new j(kVar, 0), 14), new ki0.g(new l2.e(14), 15));
            }
            ld0.k kVar2 = kVar.f51105f;
            if (kVar2 == null || (rVar = kVar2.f51516h) == null) {
                return;
            }
            rVar.U(1L).P(new ki0.g(new j(kVar, 1), 16), new ki0.g(new l2.e(15), 17));
        }

        @Override // da0.k
        public final void e() {
            ECControlActivity eCControlActivity = ECControlActivity.this;
            w90.g gVar = eCControlActivity.f14307n;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            eCControlActivity.getClass();
            AdvancedOscillationControlActivity.a aVar = AdvancedOscillationControlActivity.f14333p;
            String str = gVar.f85509i;
            aVar.getClass();
            str.getClass();
            Intent putExtra = new Intent(eCControlActivity, AdvancedOscillationControlActivity.class).putExtra("COORDINATOR_ID", str);
            putExtra.getClass();
            eCControlActivity.startActivity(putExtra);
        }

        @Override // da0.k
        public final void g() {
            ECControlActivity eCControlActivity = ECControlActivity.this;
            w90.g gVar = eCControlActivity.f14307n;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            eCControlActivity.getClass();
            SleepTimerControlActivity.a aVar = SleepTimerControlActivity.f14386o;
            String str = gVar.f85509i;
            aVar.getClass();
            str.getClass();
            Intent intent = new Intent(eCControlActivity, SleepTimerControlActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            eCControlActivity.startActivity(intent);
        }

        @Override // da0.k
        public final void h() {
            ECControlActivity eCControlActivity = ECControlActivity.this;
            w90.g gVar = eCControlActivity.f14307n;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            eCControlActivity.getClass();
            BarrelOscillationControlActivity.a aVar = BarrelOscillationControlActivity.f14366p;
            String str = gVar.f85509i;
            aVar.getClass();
            str.getClass();
            Intent putExtra = new Intent(eCControlActivity, BarrelOscillationControlActivity.class).putExtra("COORDINATOR_ID", str);
            putExtra.getClass();
            eCControlActivity.startActivity(putExtra);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14314f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f14314f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14314f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14315f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14316g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f14315f = aVar;
            this.f14316g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14315f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14316g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/ECControlActivity$f", "Lma0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements ma0.a {
        public f() {
        }

        @Override // ma0.a
        public final void a(m.b bVar) {
            bVar.getClass();
            a aVar = ECControlActivity.f14301r;
            m mVar = ECControlActivity.this.c1().f23220g;
            if (mVar != null) {
                mVar.a(bVar);
            }
        }
    }

    public final da0.o c1() {
        return (da0.o) this.f14306m.getValue();
    }

    public final ViewModelProvider.Factory d1() {
        zf1.b bVar = this.f14303j;
        if (bVar != null) {
            return bVar;
        }
        r.i("viewModelFactory");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            super.onCreate(null);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to create a ECControlActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14307n = a14;
        oa0.b bVar = a14.f85510j;
        this.f14303j = bVar.a();
        pa0.a aVar = bVar.f59825a;
        eh0.f<w> fVar = bVar.F.get();
        aVar.getClass();
        fVar.getClass();
        this.f14304k = new o(fVar.b());
        this.f14305l = bVar.e.get();
        super.onCreate(bundle);
        na0.i iVar = (na0.i) q8.g.d(this, R.layout.activity_ec_control);
        da0.o c13 = c1();
        int i13 = 0;
        c13.f23233t.setValue(c13, da0.o.f23218x[0], this.f14308o);
        Iterator it = c13.d.f23206b.iterator();
        while (it.hasNext()) {
            ((da0.i) it.next()).e(this.f14308o);
        }
        ma0.b bVar2 = c13.f23219f;
        if (bVar2 != null) {
            bVar2.f53395m.setValue(bVar2, ma0.b.f53384o[0], this.f14310q);
        }
        ea0.i iVar2 = c13.e;
        iVar2.f26458i.setValue(iVar2, ea0.i.f26451j[0], this.f14309p);
        DisplayMetrics displayMetrics = c13.f23223j.f76070a.getResources().getDisplayMetrics();
        se1.g gVar = new se1.g(displayMetrics.heightPixels, displayMetrics.density);
        if ((gVar.f76043a / gVar.f76044b) * 0.187d < 100.0d) {
            i13 = 8;
        } else {
            gz1.b bVar3 = c13.f23235v;
            vd0.d dVar = c13.f23222i;
            int i14 = vd0.d.f84137f;
            g0 g0Var = g0.d;
            dVar.getClass();
            g0Var.getClass();
            ArrayList arrayList = dVar.f84138a.f84143a;
            va0.w wVar = new va0.w(new vc1.d(3), 7);
            int i15 = dz1.h.d;
            kz1.b.a(arrayList, "sources is null");
            kz1.b.b(i15, "bufferSize");
            zb.z(bVar3, new s0(new rz1.j(null, arrayList, wVar, i15 << 1, false), new va0.w(new vd0.c(g0Var, dVar), 4)).O(new cl0.h(new da0.n(c13, 0), 19)));
        }
        c13.f23226m.l(i13);
        iVar.l(c13);
        se1.a.a(this, (r3 & 1) == 0, false);
        overridePendingTransition(R.anim.slide_in_up, R.anim.stay);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f14305l;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = z4.f57809a;
        ij.b bVar = new ij.b("ec.instant_control.home", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/ECControlActivity$a;", "", "<init>", "()V", "", "SLIDER_INDICATOR_CONTAINER_ID", "I", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
