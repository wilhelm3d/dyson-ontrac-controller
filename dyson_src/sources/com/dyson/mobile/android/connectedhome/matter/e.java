package com.dyson.mobile.android.connectedhome.matter;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import b42.m;
import c42.f2;
import c42.g2;
import c42.j;
import c42.r1;
import com.dyson.mobile.android.connectedhome.matter.a;
import com.dyson.mobile.android.connectedhome.matter.d;
import com.dyson.mobile.android.connectedhome.matter.f;
import com.dyson.mobile.android.logging.Logger;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.q;
import hj.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.i;
import n4.j0;
import nj.bb;
import nj.cb;
import rz.r;
import rz.s;
import se1.n;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.m1;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/e;", "Lm9/u;", "Lm9/c;", "Lcom/dyson/mobile/android/connectedhome/matter/g;", "viewStateFactory", "Lrz/s;", "matterController", "Lve1/a;", "qrCodeGenerator", "Lye1/a;", "clipboardHelper", "Lhj/e;", "trackingManager", "Lqz/a;", "analyticsEventFactory", "<init>", "(Lcom/dyson/mobile/android/connectedhome/matter/g;Lrz/s;Lve1/a;Lye1/a;Lhj/e;Lqz/a;)V", "c", "b", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends u implements m9.c {
    public final g d;
    public final s e;

    /* renamed from: f  reason: collision with root package name */
    public final ve1.a f12972f;

    /* renamed from: g  reason: collision with root package name */
    public final ye1.a f12973g;

    /* renamed from: h  reason: collision with root package name */
    public final hj.e f12974h;

    /* renamed from: i  reason: collision with root package name */
    public final qz.a f12975i;

    /* renamed from: j  reason: collision with root package name */
    public final b42.c f12976j;

    /* renamed from: k  reason: collision with root package name */
    public final c42.e f12977k;

    /* renamed from: l  reason: collision with root package name */
    public final f2 f12978l;

    /* renamed from: m  reason: collision with root package name */
    public final r1 f12979m;

    /* renamed from: n  reason: collision with root package name */
    public final f2 f12980n;

    /* renamed from: o  reason: collision with root package name */
    public final r1 f12981o;

    /* renamed from: p  reason: collision with root package name */
    public d2 f12982p;

    /* renamed from: q  reason: collision with root package name */
    public d2 f12983q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.matter.SmartHomeControlViewModel$1", f = "SmartHomeControlViewModel.kt", l = {BR.isDustMapLayerVisible}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.matter.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0379a<T> implements j {
            public final /* synthetic */ e d;

            public C0379a(e eVar) {
                this.d = eVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // c42.j
            public final Object emit(Object obj, l12.d dVar) {
                Object value;
                Object value2;
                Object value3;
                r rVar = (r) obj;
                boolean z13 = rVar instanceof r.c;
                e eVar = this.d;
                if (z13) {
                    f2 f2Var = eVar.f12980n;
                    do {
                        value3 = f2Var.getValue();
                        com.dyson.mobile.android.connectedhome.matter.a aVar = (com.dyson.mobile.android.connectedhome.matter.a) value3;
                    } while (!f2Var.f(value3, a.C0377a.f12953a));
                } else if (rVar instanceof r.b) {
                    pa.c.s("Matter commissioning failed: ", ((r.b) rVar).f73921a);
                    f2 f2Var2 = eVar.f12980n;
                    do {
                        value2 = f2Var2.getValue();
                        com.dyson.mobile.android.connectedhome.matter.a aVar2 = (com.dyson.mobile.android.connectedhome.matter.a) value2;
                    } while (!f2Var2.f(value2, a.C0377a.f12953a));
                } else if (x12.r.c(rVar, r.d.f73923a)) {
                    Logger.a("Matter commissioning successful");
                    f2 f2Var3 = eVar.f12980n;
                    do {
                        value = f2Var3.getValue();
                        com.dyson.mobile.android.connectedhome.matter.a aVar3 = (com.dyson.mobile.android.connectedhome.matter.a) value;
                    } while (!f2Var3.f(value, a.C0377a.f12953a));
                    d2 d2Var = eVar.f12983q;
                    if (d2Var != null) {
                        m1.a aVar4 = m1.f91486a1;
                        d2Var.c(null);
                    }
                    eVar.f12983q = g0.r(v.a(eVar), null, null, new oz.e(eVar, null), 3);
                }
                return f0.f36844a;
            }
        }

        public a(l12.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                e eVar = e.this;
                r1 e = eVar.e.e();
                C0379a c0379a = new C0379a(eVar);
                this.d = 1;
                if (e.d.collect(c0379a, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/e$c;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/dyson/mobile/android/connectedhome/matter/g;", "viewStateFactory", "Lrz/s;", "matterController", "Lve1/a;", "qrCodeGenerator", "Lye1/a;", "clipboardHelper", "Lhj/e;", "trackingManager", "Lqz/a;", "analyticsEventFactory", "<init>", "(Lcom/dyson/mobile/android/connectedhome/matter/g;Lrz/s;Lve1/a;Lye1/a;Lhj/e;Lqz/a;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final g f12984a;

        /* renamed from: b  reason: collision with root package name */
        public final s f12985b;

        /* renamed from: c  reason: collision with root package name */
        public final ve1.a f12986c;
        public final ye1.a d;
        public final hj.e e;

        /* renamed from: f  reason: collision with root package name */
        public final qz.a f12987f;

        public c(g gVar, s sVar, ve1.a aVar, ye1.a aVar2, hj.e eVar, qz.a aVar3) {
            gVar.getClass();
            sVar.getClass();
            aVar.getClass();
            aVar2.getClass();
            eVar.getClass();
            aVar3.getClass();
            this.f12984a = gVar;
            this.f12985b = sVar;
            this.f12986c = aVar;
            this.d = aVar2;
            this.e = eVar;
            this.f12987f = aVar3;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new e(this.f12984a, this.f12985b, this.f12986c, this.d, this.e, this.f12987f);
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12988a;

        static {
            int[] iArr = new int[oz.d.values().length];
            try {
                iArr[oz.d.GOOGLE_HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz.d.SHARE_MATTER_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12988a = iArr;
        }
    }

    static {
        new b(null);
    }

    public e(g gVar, s sVar, ve1.a aVar, ye1.a aVar2, hj.e eVar, qz.a aVar3) {
        gVar.getClass();
        sVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        aVar3.getClass();
        this.d = gVar;
        this.e = sVar;
        this.f12972f = aVar;
        this.f12973g = aVar2;
        this.f12974h = eVar;
        this.f12975i = aVar3;
        b42.c b13 = m.b(0, null, null, 7);
        this.f12976j = b13;
        this.f12977k = c42.r.B(b13);
        f2 a13 = g2.a(f.a.f12989a);
        this.f12978l = a13;
        this.f12979m = c42.r.d(a13);
        f2 a14 = g2.a(a.C0377a.f12953a);
        this.f12980n = a14;
        this.f12981o = c42.r.d(a14);
        g0.r(v.a(this), null, null, new a(null), 3);
        int i13 = cb.f57435a;
        eVar.h(new ij.b("smart_home_control.matter.smart_home_control", null, 2, null), null);
    }

    public static final void S(e eVar, oz.d dVar, rz.u uVar) {
        Object bVar;
        Object value;
        String str;
        eVar.getClass();
        int i13 = d.f12988a[dVar.ordinal()];
        if (i13 == 1) {
            g0.r(v.a(eVar), null, null, new oz.f(eVar, new d.b(uVar.f73927a), null), 3);
        } else if (i13 != 2) {
        } else {
            try {
                int i14 = q.e;
                bVar = new n4.d(ve1.a.a(eVar.f12972f, uVar.f73927a));
            } catch (Throwable th2) {
                int i15 = q.e;
                bVar = new q.b(th2);
            }
            if (bVar instanceof q.b) {
                bVar = null;
            }
            j0 j0Var = (j0) bVar;
            if (j0Var == null) {
                Logger.b("Error generating QR code from Matter onboarding data", null);
                return;
            }
            f2 f2Var = eVar.f12980n;
            do {
                value = f2Var.getValue();
                com.dyson.mobile.android.connectedhome.matter.a aVar = (com.dyson.mobile.android.connectedhome.matter.a) value;
                str = uVar.f73929c;
                if (str.length() == 11) {
                    str = jy1.a.c(str.substring(0, 4), "-", str.substring(4, 7), "-", str.substring(7, 11));
                }
            } while (!f2Var.f(value, new a.b(str, j0Var)));
            hj.e eVar2 = eVar.f12974h;
            int i16 = bb.f57420a;
            ij.b bVar2 = new ij.b("smart_home_control.matter.bottom_sheet_share_matter_code", null, 2, null);
            e.a aVar2 = hj.e.f38312g;
            eVar2.h(bVar2, null);
        }
    }

    public static final void T(e eVar) {
        Object value;
        f fVar;
        f2 f2Var = eVar.f12978l;
        do {
            value = f2Var.getValue();
            fVar = (f) value;
            eVar.d.getClass();
            fVar.getClass();
            if (fVar instanceof f.b) {
                n<com.dyson.mobile.android.connectedhome.matter.c> nVar = ((f.b) fVar).f12990a;
                ArrayList arrayList = new ArrayList(i12.u.o(nVar, 10));
                Iterator it = nVar.d.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.dyson.mobile.android.connectedhome.matter.c) it.next()).d());
                }
                fVar = new f.b(new n(arrayList));
            }
        } while (!f2Var.f(value, fVar));
    }

    @Override // m9.c
    public final void onResume(LifecycleOwner lifecycleOwner) {
        d2 d2Var = this.f12983q;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        this.f12983q = g0.r(v.a(this), null, null, new oz.e(this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/e$b;", "", "<init>", "()V", "", "MANUAL_ENTRY_CODE_SEPERATOR", "Ljava/lang/String;", "", "MATTER_REQUEST_STATE_TIMEOUT_MS", "J", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
