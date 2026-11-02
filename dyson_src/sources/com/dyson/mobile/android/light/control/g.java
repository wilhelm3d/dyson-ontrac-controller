package com.dyson.mobile.android.light.control;

import android.graphics.PorterDuff;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.control.e;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e60.g;
import hj.e;
import i12.c0;
import i12.t;
import ie0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.c7;
import q8.n;
import x12.p0;
import x12.r;
import x12.y;
import x50.e0;
import x50.f0;
import y70.a;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/dyson/mobile/android/light/control/g;", "Landroidx/lifecycle/m;", "", "serialNumber", "Llf0/a;", "bleTaskFactory", "Lmf0/a;", "colorBrightnessViewModel", "Lyd0/d;", "dataStore", "Lpf0/c;", "localisationManager", "Log0/a;", "machineDataObject", "Lhj/e;", "trackingManager", "Lin0/g;", "lightingMachineInfo", "<init>", "(Ljava/lang/String;Llf0/a;Lmf0/a;Lyd0/d;Lpf0/c;Log0/a;Lhj/e;Lin0/g;)V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g implements m {
    public static final /* synthetic */ e22.m<Object>[] H = {p0.f86717a.f(new y(g.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/control/LightModesNavigator;", 0))};
    public final ObservableInt A;
    public final ObservableBoolean B;
    public final f C;
    public final tf1.a D;
    public final gz1.b E;
    public final boolean F;
    public final c G;
    public final String d;
    public final lf0.a e;

    /* renamed from: f  reason: collision with root package name */
    public final mf0.a f14848f;

    /* renamed from: g  reason: collision with root package name */
    public final yd0.d f14849g;

    /* renamed from: h  reason: collision with root package name */
    public final pf0.c f14850h;

    /* renamed from: i  reason: collision with root package name */
    public final og0.a f14851i;

    /* renamed from: j  reason: collision with root package name */
    public final hj.e f14852j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14853k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14854l;

    /* renamed from: m  reason: collision with root package name */
    public final String f14855m;

    /* renamed from: n  reason: collision with root package name */
    public final String f14856n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableInt f14857o;

    /* renamed from: p  reason: collision with root package name */
    public final ObservableInt f14858p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableInt f14859q;

    /* renamed from: r  reason: collision with root package name */
    public final n<String> f14860r;

    /* renamed from: s  reason: collision with root package name */
    public final n<String> f14861s;

    /* renamed from: t  reason: collision with root package name */
    public final ObservableInt f14862t;

    /* renamed from: u  reason: collision with root package name */
    public final n<PorterDuff.Mode> f14863u;

    /* renamed from: v  reason: collision with root package name */
    public final ObservableInt f14864v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f14865w;

    /* renamed from: x  reason: collision with root package name */
    public int f14866x;

    /* renamed from: y  reason: collision with root package name */
    public int f14867y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f14868z;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14869a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14869a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/control/g$c", "Ly70/a$a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements a.InterfaceC2701a {
        public c() {
        }

        @Override // y70.a.InterfaceC2701a
        public final void a(String str) {
            g gVar = g.this;
            if (str.equals(gVar.d)) {
                f fVar = gVar.C;
                ArrayList<e> a13 = gVar.a();
                fVar.getClass();
                fVar.e = a13;
                fVar.notifyDataSetChanged();
                e.c cVar = (e.c) c0.Z(gVar.f14849g.b(gVar.d));
                if (cVar != null) {
                    gVar.e(cVar.c(), cVar.b());
                }
            }
        }
    }

    static {
        new a(null);
    }

    public g(String str, lf0.a aVar, mf0.a aVar2, yd0.d dVar, pf0.c cVar, og0.a aVar3, hj.e eVar, in0.g gVar) {
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        dVar.getClass();
        cVar.getClass();
        aVar3.getClass();
        eVar.getClass();
        gVar.getClass();
        this.d = str;
        this.e = aVar;
        this.f14848f = aVar2;
        this.f14849g = dVar;
        this.f14850h = cVar;
        this.f14851i = aVar3;
        this.f14852j = eVar;
        String d = cVar.d(aVar3.b(og0.d.light_modes_manual));
        this.f14853k = d;
        this.f14854l = cVar.d(aVar3.b(og0.d.light_modes_synchronised));
        String d13 = cVar.d(aVar3.b(og0.d.light_modes_manualDescription));
        this.f14855m = d13;
        this.f14856n = cVar.d(aVar3.b(og0.d.light_modes_off));
        ie0.f.f41557a.getClass();
        this.f14857o = new ObservableInt(ie0.f.f41560f);
        this.f14858p = new ObservableInt(0);
        this.f14859q = new ObservableInt(0);
        this.f14860r = new n<>(d);
        this.f14861s = new n<>(d13);
        this.f14862t = new ObservableInt();
        this.f14863u = new n<>(PorterDuff.Mode.SRC_ATOP);
        this.f14864v = new ObservableInt(8);
        this.f14865w = true;
        this.A = new ObservableInt(0);
        this.B = new ObservableBoolean(false);
        f fVar = new f(this, cVar, aVar3);
        this.C = fVar;
        this.D = new tf1.a(null, 1, null);
        this.E = new gz1.b();
        this.F = gVar.f42336b.equals(in0.i.VARIANT_552A.getValue());
        c cVar2 = new c();
        this.G = cVar2;
        aVar2.f53826c.l(R.color.accessibleGrey);
        aVar2.e().l(0);
        aVar2.g().l(4);
        fVar.e = a();
        fVar.notifyDataSetChanged();
        dVar.f89784a.d(cVar2);
    }

    public final ArrayList<e> a() {
        e.b.f14831a.getClass();
        ArrayList d = t.d(e.b.f14832b, e.b.f14833c, e.b.d, e.b.e);
        ArrayList<e.c> b13 = this.f14849g.b(this.d);
        this.f14868z = b13.size() >= 20;
        ArrayList<e> arrayList = new ArrayList<>();
        arrayList.addAll(d);
        arrayList.addAll(b13);
        arrayList.add(e.b.f14834f);
        return arrayList;
    }

    public final h b() {
        return (h) this.D.getValue(this, H[0]);
    }

    public final void c() {
        e60.g.f26073a.getClass();
        UUID uuid = e60.g.f26074b;
        g.a aVar = g.a.f26075a;
        aVar.getClass();
        e0 e0Var = new e0(uuid, g.a.f26076b);
        aVar.getClass();
        this.E.a(this.e.S(new f0(e0Var, new e0(uuid, g.a.f26077c))).l(new o(this, 2)).v());
    }

    public final void d(int i13) {
        if (this.F) {
            i13 = Math.min(i13, 850);
        }
        this.f14867y = i13;
        this.f14848f.h(i13);
    }

    public final void e(int i13, int i14) {
        ArrayList<e> a13 = a();
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = a13.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next instanceof e.c) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i15 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                t.n();
                throw null;
            }
            e.c cVar = (e.c) next2;
            if (i13 == cVar.c() && i14 == cVar.b()) {
                f fVar = this.C;
                fVar.d = i15 + 4;
                fVar.notifyDataSetChanged();
                int c13 = cVar.c();
                this.f14866x = c13;
                this.f14848f.i(c13);
                d(cVar.b());
                this.f14860r.m(cVar.e());
                this.f14861s.m(cVar.d());
                boolean z13 = this.F;
                ObservableInt observableInt = this.f14862t;
                if (z13) {
                    observableInt.l(0);
                    this.f14863u.m(PorterDuff.Mode.ADD);
                    boolean f13 = cVar.f();
                    ObservableInt observableInt2 = this.f14857o;
                    if (f13) {
                        ie0.f.f41557a.getClass();
                        observableInt2.l(ie0.f.f41562h);
                    } else {
                        ie0.f.f41557a.getClass();
                        observableInt2.l(ie0.f.f41561g);
                    }
                } else {
                    nf0.c cVar2 = nf0.c.f57219a;
                    int i17 = this.f14866x;
                    cVar2.getClass();
                    observableInt.l(nf0.c.g(i17));
                }
                this.A.l(0);
            }
            i15 = i16;
        }
    }

    public final void f(e.d dVar) {
        ArrayList<e> a13 = a();
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = a13.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next instanceof e.d) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            } else if (r.c((e.d) it2.next(), dVar)) {
                break;
            } else {
                i13++;
            }
        }
        f fVar = this.C;
        fVar.d = i13;
        fVar.notifyDataSetChanged();
        e.b.f14831a.getClass();
        boolean c13 = r.c(dVar, e.b.f14832b);
        n<PorterDuff.Mode> nVar = this.f14863u;
        ObservableInt observableInt = this.f14857o;
        if (c13 || !this.F) {
            nVar.m(PorterDuff.Mode.SRC_ATOP);
            ie0.f.f41557a.getClass();
            observableInt.l(ie0.f.f41560f);
        } else {
            this.f14862t.l(0);
            nVar.m(PorterDuff.Mode.ADD);
            if (r.c(dVar, e.b.d)) {
                ie0.f.f41557a.getClass();
                observableInt.l(ie0.f.f41561g);
            } else if (r.c(dVar, e.b.e) || r.c(dVar, e.b.f14833c)) {
                ie0.f.f41557a.getClass();
                observableInt.l(ie0.f.f41562h);
            }
        }
        og0.d d = dVar.d();
        og0.a aVar = this.f14851i;
        LocalisationKey b13 = aVar.b(d);
        pf0.c cVar = this.f14850h;
        this.f14860r.m(cVar.d(b13));
        og0.d c14 = dVar.c();
        c14.getClass();
        this.f14861s.m(cVar.d(aVar.b(c14)));
        nf0.c cVar2 = nf0.c.f57219a;
        int i14 = this.f14866x;
        cVar2.getClass();
        this.A.l(nf0.c.g(i14));
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = b.f14869a[aVar.ordinal()];
        if (i13 == 1) {
            int i14 = c7.f57431a;
            ij.b bVar = new ij.b("light.modes.home", null, 2, null);
            e.a aVar2 = hj.e.f38312g;
            this.f14852j.h(bVar, null);
        } else if (i13 == 2) {
            this.E.e();
        } else if (i13 != 3) {
        } else {
            c cVar = this.G;
            cVar.getClass();
            this.f14849g.f89784a.a(cVar);
        }
    }

    public final void h(int i13, int i14, boolean z13) {
        lf0.a aVar = this.e;
        this.E.a((z13 ? aVar.J(false) : aVar.B(i13).k(500L, TimeUnit.MILLISECONDS).g(aVar.M(i14))).v());
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/light/control/g$a;", "", "<init>", "()V", "", "WRITE_MODE_DELAY_MILLIS", "J", "", "MIN_SWATCH_SIZE", "I", "", "SWATCH_TO_SWATCH_CONTAINER_RATIO", "F", "BLACK_COLOR", "CUSTOM_MODES_LIMIT", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
