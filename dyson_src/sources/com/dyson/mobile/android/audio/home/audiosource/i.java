package com.dyson.mobile.android.audio.home.audiosource;

import android.annotation.SuppressLint;
import android.content.pm.ShortcutManager;
import c42.f2;
import c42.g2;
import c42.l1;
import c42.p;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.audio.home.audiosource.b;
import com.dyson.mobile.android.audio.home.audiosource.c;
import com.dyson.mobile.android.audio.home.audiosource.e;
import com.dyson.mobile.android.audio.home.audiosource.g;
import com.dyson.mobile.android.audio.home.audiosource.h;
import com.dyson.mobile.android.audio.home.audiosource.j;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import cp.a;
import d42.q;
import h12.f0;
import h12.r;
import hj.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import nj.ce;
import se1.h0;
import vk.o;
import vk.t;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.m1;
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/i;", "Lm9/u;", "Lcom/dyson/mobile/android/audio/home/audiosource/m;", "observeAudioSourcesUseCase", "Lap/b;", "bluetoothClassicConnectionController", "Lhj/e;", "trackingManager", "Lcom/dyson/mobile/android/audio/home/audiosource/k;", "audioSourcesViewStateFactory", "Lcom/dyson/mobile/android/audio/home/audiosource/d;", "audioSourcesScreenAlertFactory", "Lcom/dyson/mobile/android/audio/home/audiosource/a;", "audioSourcesAnalyticsScreenFactory", "Lvj/b;", "dataStore", "Lyl/a;", "audioShortcutManager", "Lxk0/e;", "machineDefinitionProvider", "<init>", "(Lcom/dyson/mobile/android/audio/home/audiosource/m;Lap/b;Lhj/e;Lcom/dyson/mobile/android/audio/home/audiosource/k;Lcom/dyson/mobile/android/audio/home/audiosource/d;Lcom/dyson/mobile/android/audio/home/audiosource/a;Lvj/b;Lyl/a;Lxk0/e;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"TimeUnitsSuffix"})
/* loaded from: classes2.dex */
public final class i extends u {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f12410x = 0;
    public final ap.b d;
    public final hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public final k f12411f;

    /* renamed from: g  reason: collision with root package name */
    public final com.dyson.mobile.android.audio.home.audiosource.d f12412g;

    /* renamed from: h  reason: collision with root package name */
    public final com.dyson.mobile.android.audio.home.audiosource.a f12413h;

    /* renamed from: i  reason: collision with root package name */
    public final vj.b f12414i;

    /* renamed from: j  reason: collision with root package name */
    public final yl.a f12415j;

    /* renamed from: k  reason: collision with root package name */
    public final xk0.e f12416k;

    /* renamed from: l  reason: collision with root package name */
    public String f12417l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f12418m;

    /* renamed from: n  reason: collision with root package name */
    public d2 f12419n;

    /* renamed from: o  reason: collision with root package name */
    public int f12420o;

    /* renamed from: p  reason: collision with root package name */
    public final r1 f12421p;

    /* renamed from: q  reason: collision with root package name */
    public final f2 f12422q;

    /* renamed from: r  reason: collision with root package name */
    public final r1 f12423r;

    /* renamed from: s  reason: collision with root package name */
    public final u1 f12424s;

    /* renamed from: t  reason: collision with root package name */
    public final r1 f12425t;

    /* renamed from: u  reason: collision with root package name */
    public final b42.c f12426u;

    /* renamed from: v  reason: collision with root package name */
    public final c42.e f12427v;

    /* renamed from: w  reason: collision with root package name */
    public ij.b f12428w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesViewModel$onEvent$1", f = "AudioSourcesViewModel.kt", l = {108}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public b(l12.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                u1 u1Var = i.this.f12424s;
                c.b bVar = c.b.f12395a;
                this.d = 1;
                if (u1Var.emit(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements c42.i<g> {
        public final /* synthetic */ c42.i d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ c42.j d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesViewModel$special$$inlined$map$1$2", f = "AudioSourcesViewModel.kt", l = {50}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.audio.home.audiosource.i$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0343a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0343a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(c42.j jVar) {
                this.d = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
            @Override // c42.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, l12.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dyson.mobile.android.audio.home.audiosource.i.c.a.C0343a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.audio.home.audiosource.i$c$a$a r0 = (com.dyson.mobile.android.audio.home.audiosource.i.c.a.C0343a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.audio.home.audiosource.i$c$a$a r0 = new com.dyson.mobile.android.audio.home.audiosource.i$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L40
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    se1.l r5 = (se1.l) r5
                    T r5 = r5.f76054b
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L40
                    return r1
                L40:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.audiosource.i.c.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public c(c42.i iVar) {
            this.d = iVar;
        }

        @Override // c42.i
        public final Object collect(c42.j<? super g> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/g;", "deviceUpdate", "", "localConnectingMacAddress", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "<anonymous>", "(Lcom/dyson/mobile/android/audio/home/audiosource/g;Ljava/lang/String;)Lcom/dyson/mobile/android/audio/home/audiosource/j;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesViewModel$viewState$1", f = "AudioSourcesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends n12.i implements Function3<g, String, l12.d<? super j>, Object> {
        public /* synthetic */ g d;
        public /* synthetic */ String e;

        public d(l12.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(g gVar, String str, l12.d<? super j> dVar) {
            d dVar2 = new d(dVar);
            dVar2.d = gVar;
            dVar2.e = str;
            return dVar2.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            g gVar = this.d;
            String str = this.e;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            i.this.f12411f.getClass();
            gVar.getClass();
            if (!(gVar instanceof g.c)) {
                return gVar.equals(g.a.f12403a) ? j.a.f12431a : gVar.equals(g.e.f12407a) ? j.f.f12436a : gVar.equals(g.d.f12406a) ? j.d.f12434a : j.c.f12433a;
            }
            ArrayList a13 = o.a(((g.c) gVar).f12405a);
            if (a13.isEmpty()) {
                return j.d.f12434a;
            }
            ArrayList arrayList = new ArrayList(i12.u.o(a13, 10));
            Iterator it = a13.iterator();
            while (it.hasNext()) {
                cp.a aVar2 = (cp.a) it.next();
                String str2 = aVar2.f22031b;
                a.EnumC0733a enumC0733a = aVar2.f22030a;
                boolean z13 = false;
                boolean z14 = str2.equals(str) && enumC0733a != a.EnumC0733a.CONNECTED;
                if (str != null && enumC0733a != a.EnumC0733a.CONNECTED) {
                    z13 = true;
                }
                if (z14) {
                    enumC0733a = a.EnumC0733a.CONNECTING;
                } else if (z13) {
                    enumC0733a = a.EnumC0733a.NOT_CONNECTED;
                }
                arrayList.add(new vk.m(aVar2.d, enumC0733a, aVar2.f22031b));
            }
            return new j.e(arrayList);
        }
    }

    static {
        new a(null);
    }

    public i(m mVar, ap.b bVar, hj.e eVar, k kVar, com.dyson.mobile.android.audio.home.audiosource.d dVar, com.dyson.mobile.android.audio.home.audiosource.a aVar, vj.b bVar2, yl.a aVar2, xk0.e eVar2) {
        mVar.getClass();
        bVar.getClass();
        eVar.getClass();
        kVar.getClass();
        dVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        y70.a aVar3 = bVar2.f84297a;
        aVar2.getClass();
        eVar2.getClass();
        this.d = bVar;
        this.e = eVar;
        this.f12411f = kVar;
        this.f12412g = dVar;
        this.f12413h = aVar;
        this.f12414i = bVar2;
        this.f12415j = aVar2;
        this.f12416k = eVar2;
        f2 a13 = g2.a(null);
        this.f12418m = a13;
        l1 l1Var = new l1(new c(new q(new p(new vc1.d(28), h0.f(mVar.e == null ? new c42.l(g.e.f12407a) : c42.r.w(c42.r.E(mVar.f12442b.f27321a, new t(null, mVar)), mVar.f12441a.c())), null))), a13, new d(null));
        s9.a a14 = v.a(this);
        c42.d2 d2Var = aq.f.f5345a;
        this.f12421p = c42.r.D(l1Var, a14, d2Var, j.b.f12432a);
        f2 a15 = g2.a(Boolean.FALSE);
        this.f12422q = a15;
        this.f12423r = c42.r.d(a15);
        u1 b13 = w1.b(0, 0, null, 7);
        this.f12424s = b13;
        this.f12425t = c42.r.D(c42.r.n(b13), v.a(this), d2Var, c.b.f12395a);
        b42.c b14 = b42.m.b(0, null, null, 7);
        this.f12426u = b14;
        this.f12427v = c42.r.B(b14);
        aVar3.b(aVar3.getInt("audio_source_selection_opened", 0) + 1, "audio_source_selection_opened");
    }

    public final void S(e eVar) {
        ij.b bVar;
        eVar.getClass();
        if (eVar instanceof e.C0342e) {
            com.dyson.mobile.android.audio.home.audiosource.b bVar2 = ((e.C0342e) eVar).f12402a;
            j jVar = (j) this.f12421p.d.getValue();
            this.f12413h.getClass();
            jVar.getClass();
            if (bVar2.equals(b.C0341b.INSTANCE)) {
                if (jVar instanceof j.e) {
                    bVar = com.dyson.mobile.android.audio.home.audiosource.a.a(null);
                } else if (jVar instanceof j.c) {
                    bVar = com.dyson.mobile.android.audio.home.audiosource.a.a("disconnected");
                } else if (jVar instanceof j.d) {
                    bVar = com.dyson.mobile.android.audio.home.audiosource.a.a("no_audio_source");
                } else if (jVar instanceof j.a) {
                    bVar = com.dyson.mobile.android.audio.home.audiosource.a.a("cable_connected");
                } else if (jVar instanceof j.f) {
                    bVar = com.dyson.mobile.android.audio.home.audiosource.a.a("headphones_require_update");
                } else if (!jVar.equals(j.b.f12432a)) {
                    ma.e.o();
                    return;
                } else {
                    bVar = null;
                }
            } else if (!bVar2.equals(b.a.INSTANCE)) {
                ma.e.o();
                return;
            } else {
                int i13 = ce.f57438a;
                bVar = new ij.b("wearable_ec.help.how_to_add_device", null, 2, null);
            }
            if (bVar == null || bVar.equals(this.f12428w)) {
                return;
            }
            this.f12428w = bVar;
            e.a aVar = hj.e.f38312g;
            this.e.h(bVar, null);
        } else if (eVar instanceof e.c) {
            String str = ((e.c) eVar).f12400a;
            if (x12.r.c(this.f12418m.getValue(), str)) {
                return;
            }
            d2 d2Var = this.f12419n;
            if (d2Var != null) {
                m1.a aVar2 = m1.f91486a1;
                d2Var.c(null);
            }
            this.f12419n = g0.r(v.a(this), null, null, new vk.j(this, str, null), 3);
        } else if (eVar instanceof e.d) {
            aq.f.b(this.f12426u, v.a(this), h.b.f12409a);
        } else if (eVar instanceof e.b) {
            g0.r(v.a(this), null, null, new b(null), 3);
        } else if (!(eVar instanceof e.a)) {
            ma.e.o();
        } else {
            MachineDefinition a13 = this.f12416k.a();
            if (a13 != null) {
                yl.a aVar3 = this.f12415j;
                aVar3.getClass();
                ShortcutManager shortcutManager = aVar3.e;
                if (shortcutManager.isRequestPinShortcutSupported()) {
                    shortcutManager.requestPinShortcut(aVar3.a(a13), null);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/i$a;", "", "<init>", "()V", "", "ATTEMPTS_WITHOUT_INCREASING_DELAY", "I", "", "CONNECT_ATTEMPT_DELAY_MS", "J", "CONNECT_ATTEMPT_MAX_DELAY_MS", "INITIAL_DISCONNECT_DELAY_MS", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
