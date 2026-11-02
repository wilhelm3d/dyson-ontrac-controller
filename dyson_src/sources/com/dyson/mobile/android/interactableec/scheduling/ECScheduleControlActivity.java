package com.dyson.mobile.android.interactableec.scheduling;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import da0.k;
import fm1.o0;
import h12.y;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import ka0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la0.l;
import la0.m;
import la0.n;
import la0.o;
import la0.p;
import ny.a0;
import oc0.e;
import pc0.a;
import pc0.c;
import pc0.f;
import pc0.h;
import pc0.j;
import pc0.l;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import zc0.w;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/scheduling/ECScheduleControlActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECScheduleControlActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f14596o = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public static final int f14597p = R.id.slider_indicator_container;

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14598j;

    /* renamed from: k  reason: collision with root package name */
    public o f14599k;

    /* renamed from: m  reason: collision with root package name */
    public g f14601m;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14600l = new d0(p0.f86717a.b(e.class), new c(this), new a0(this, 4), new d(null, this));

    /* renamed from: n  reason: collision with root package name */
    public final b f14602n = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/scheduling/ECScheduleControlActivity$b", "Lda0/k;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements k {

        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14604a;

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
                f14604a = iArr;
            }
        }

        public b() {
        }

        @Override // da0.k
        public final void a() {
            ECScheduleControlActivity eCScheduleControlActivity = ECScheduleControlActivity.this;
            if (eCScheduleControlActivity.f14601m == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            eCScheduleControlActivity.onBackPressed();
        }

        @Override // da0.k
        public final p c(i iVar) {
            iVar.getClass();
            ECScheduleControlActivity eCScheduleControlActivity = ECScheduleControlActivity.this;
            o oVar = eCScheduleControlActivity.f14599k;
            if (oVar == null) {
                r.i("sliderIndicatorTypeSelector");
                throw null;
            }
            switch (a.f14604a[oVar.a(iVar).ordinal()]) {
                case 1:
                    a.C1920a c1920a = pc0.a.f63814f;
                    g gVar = eCScheduleControlActivity.f14601m;
                    if (gVar == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str = gVar.f85509i;
                    c1920a.getClass();
                    str.getClass();
                    pc0.a aVar = new pc0.a();
                    Bundle bundle = new Bundle();
                    bundle.putString("COORDINATOR_ID", str);
                    aVar.setArguments(bundle);
                    FragmentManager supportFragmentManager = eCScheduleControlActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                    aVar2.i(ECScheduleControlActivity.f14597p, aVar, null);
                    aVar2.n(true, true);
                    return (p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(pc0.b.class));
                case 2:
                    a aVar3 = ECScheduleControlActivity.f14596o;
                    if (((e) eCScheduleControlActivity.f14600l.getValue()).d.e != null) {
                        f.a aVar4 = f.f63828f;
                        g gVar2 = eCScheduleControlActivity.f14601m;
                        if (gVar2 == null) {
                            r.i("coordinator");
                            throw null;
                        }
                        String str2 = gVar2.f85509i;
                        aVar4.getClass();
                        str2.getClass();
                        f fVar = new f();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("COORDINATOR_ID", str2);
                        fVar.setArguments(bundle2);
                        FragmentManager supportFragmentManager2 = eCScheduleControlActivity.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager2);
                        aVar5.i(ECScheduleControlActivity.f14597p, fVar, null);
                        aVar5.n(true, true);
                        return (pc0.g) ((p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(pc0.g.class)));
                    }
                    return null;
                case 3:
                    c.a aVar6 = pc0.c.f63822f;
                    g gVar3 = eCScheduleControlActivity.f14601m;
                    if (gVar3 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str3 = gVar3.f85509i;
                    aVar6.getClass();
                    str3.getClass();
                    pc0.c cVar = new pc0.c();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("COORDINATOR_ID", str3);
                    cVar.setArguments(bundle3);
                    FragmentManager supportFragmentManager3 = eCScheduleControlActivity.getSupportFragmentManager();
                    supportFragmentManager3.getClass();
                    androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(supportFragmentManager3);
                    aVar7.i(ECScheduleControlActivity.f14597p, cVar, null);
                    aVar7.n(true, true);
                    return (p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(pc0.e.class));
                case 4:
                    h.a aVar8 = h.f63835f;
                    g gVar4 = eCScheduleControlActivity.f14601m;
                    if (gVar4 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str4 = gVar4.f85509i;
                    aVar8.getClass();
                    str4.getClass();
                    h hVar = new h();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("COORDINATOR_ID", str4);
                    hVar.setArguments(bundle4);
                    FragmentManager supportFragmentManager4 = eCScheduleControlActivity.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    androidx.fragment.app.a aVar9 = new androidx.fragment.app.a(supportFragmentManager4);
                    aVar9.i(ECScheduleControlActivity.f14597p, hVar, null);
                    aVar9.n(true, true);
                    return (p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(pc0.i.class));
                case 5:
                    j.a aVar10 = j.f63842f;
                    g gVar5 = eCScheduleControlActivity.f14601m;
                    if (gVar5 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str5 = gVar5.f85509i;
                    aVar10.getClass();
                    str5.getClass();
                    j jVar = new j();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("COORDINATOR_ID", str5);
                    jVar.setArguments(bundle5);
                    FragmentManager supportFragmentManager5 = eCScheduleControlActivity.getSupportFragmentManager();
                    supportFragmentManager5.getClass();
                    androidx.fragment.app.a aVar11 = new androidx.fragment.app.a(supportFragmentManager5);
                    aVar11.i(ECScheduleControlActivity.f14597p, jVar, null);
                    aVar11.n(true, true);
                    return (p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(l.class));
                case 6:
                    l.a aVar12 = la0.l.f51117f;
                    g gVar6 = eCScheduleControlActivity.f14601m;
                    if (gVar6 == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    String str6 = gVar6.f85509i;
                    aVar12.getClass();
                    str6.getClass();
                    la0.l lVar = new la0.l();
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("COORDINATOR_ID", str6);
                    bundle6.putBoolean("IS_OPENED_FROM_SCHEDULE_CONTROL", true);
                    lVar.setArguments(bundle6);
                    FragmentManager supportFragmentManager6 = eCScheduleControlActivity.getSupportFragmentManager();
                    androidx.fragment.app.a f13 = y.f(supportFragmentManager6, supportFragmentManager6);
                    f13.i(ECScheduleControlActivity.f14597p, lVar, null);
                    f13.n(true, true);
                    return (p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(m.class));
                default:
                    ma.e.o();
                    return null;
            }
        }

        @Override // da0.k
        public final void d() {
            dz1.r<Integer> rVar;
            dz1.r<Boolean> rVar2;
            a aVar = ECScheduleControlActivity.f14596o;
            ECScheduleControlActivity eCScheduleControlActivity = ECScheduleControlActivity.this;
            e eVar = (e) eCScheduleControlActivity.f14600l.getValue();
            eVar.f60032m = (mz1.i) dz1.b.B(100L, TimeUnit.MILLISECONDS).o(new oc0.d(new oc0.c(eVar, 0), 0)).l(new he0.e(eVar, 13)).v();
            j.a aVar2 = j.f63842f;
            g gVar = eCScheduleControlActivity.f14601m;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            aVar2.getClass();
            str.getClass();
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            jVar.setArguments(bundle);
            FragmentManager supportFragmentManager = eCScheduleControlActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            aVar3.i(ECScheduleControlActivity.f14597p, jVar, null);
            aVar3.n(true, true);
            pc0.l lVar = (pc0.l) ((p) new ViewModelProvider(eCScheduleControlActivity, eCScheduleControlActivity.c1()).a(p0.f86717a.b(pc0.l.class)));
            ld0.a aVar4 = lVar.e;
            if (aVar4 != null && (rVar2 = aVar4.f51503f) != null) {
                rVar2.U(1L).P(new pc0.d(new pc0.k(lVar, 0), 1), new pc0.d(new p40.b(4), 2));
            }
            ld0.k kVar = lVar.f63848f;
            if (kVar == null || (rVar = kVar.f51516h) == null) {
                return;
            }
            rVar.U(1L).P(new pc0.d(new pc0.k(lVar, 1), 3), new pc0.d(new p40.b(5), 4));
        }

        @Override // da0.k
        public final void f(ECScheduleSettings eCScheduleSettings) {
            eCScheduleSettings.getClass();
            Intent intent = new Intent();
            intent.putExtra("SCHEDULE_SETTINGS", eCScheduleSettings);
            ECScheduleControlActivity eCScheduleControlActivity = ECScheduleControlActivity.this;
            eCScheduleControlActivity.setResult(1, intent);
            eCScheduleControlActivity.finish();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14605f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f14605f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14605f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14606f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f14606f = aVar;
            this.f14607g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14606f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14607g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final ViewModelProvider.Factory c1() {
        zf1.b bVar = this.f14598j;
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
        overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
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
        a13.f85710b = "Please use newIntent method to create a ECScheduleControlActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14601m = a14;
        oa0.b bVar = a14.f85510j;
        this.f14598j = bVar.a();
        pa0.a aVar = bVar.f59825a;
        eh0.f<w> fVar = bVar.F.get();
        aVar.getClass();
        fVar.getClass();
        this.f14599k = new o(fVar.b());
        na0.o oVar = (na0.o) q8.g.d(this, R.layout.activity_schedule_ec_control);
        e eVar = (e) this.f14600l.getValue();
        tf1.a aVar2 = eVar.f60030k;
        e22.m<?> mVar = e.f60024n[0];
        b bVar2 = this.f14602n;
        aVar2.setValue(eVar, mVar, bVar2);
        Iterator it = eVar.e.f60017b.iterator();
        while (it.hasNext()) {
            ((da0.i) it.next()).e(bVar2);
        }
        oVar.l(eVar);
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/scheduling/ECScheduleControlActivity$a;", "", "<init>", "()V", "", "SLIDER_INDICATOR_CONTAINER_ID", "I", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
