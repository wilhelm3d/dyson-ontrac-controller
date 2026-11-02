package com.dyson.mobile.android.interactableec.home.n829.settingstab.location;

import af1.i;
import c42.a2;
import c42.c2;
import c42.f2;
import c42.g2;
import c42.j;
import c42.q1;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e22.m;
import h12.f0;
import h12.r;
import i12.s;
import i12.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import pj0.n;
import rf0.i0;
import se1.f0;
import x12.p0;
import x12.y;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0019\u001a\u001b\u001cBg\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a;", "Lm9/u;", "", "initialLocation", "", "isManuallySet", "machineSerialNumber", "Lw60/e;", "prioritisedCurrentLocationRetriever", "Lv60/b;", "locationServicesHelper", "Lwd0/d;", "geocodeServiceHelper", "Lmc0/a;", "ecEnvironmentApi", "Lpj0/n;", "locationChangeUpdater", "Lhj/e;", "trackingManager", "Laf1/i;", "dispatcherProvider", "Lpf0/c;", "localisationManager", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lw60/e;Lv60/b;Lwd0/d;Lmc0/a;Lpj0/n;Lhj/e;Laf1/i;Lpf0/c;)V", "c", "d", "b", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f14554x = {p0.f86717a.f(new y(a.class, "dysonPermissionManager", "getDysonPermissionManager$mod_interactable_ec()Lcom/dyson/mobile/android/utilities/permissions/DysonPermissionManager;", 0))};
    public final String d;
    public final w60.e e;

    /* renamed from: f  reason: collision with root package name */
    public final v60.b f14555f;

    /* renamed from: g  reason: collision with root package name */
    public final wd0.d f14556g;

    /* renamed from: h  reason: collision with root package name */
    public final mc0.a f14557h;

    /* renamed from: i  reason: collision with root package name */
    public final n f14558i;

    /* renamed from: j  reason: collision with root package name */
    public final hj.e f14559j;

    /* renamed from: k  reason: collision with root package name */
    public final i f14560k;

    /* renamed from: l  reason: collision with root package name */
    public final tf1.a f14561l;

    /* renamed from: m  reason: collision with root package name */
    public final u1 f14562m;

    /* renamed from: n  reason: collision with root package name */
    public final q1 f14563n;

    /* renamed from: o  reason: collision with root package name */
    public final f2 f14564o;

    /* renamed from: p  reason: collision with root package name */
    public final String f14565p;

    /* renamed from: q  reason: collision with root package name */
    public final r1 f14566q;

    /* renamed from: r  reason: collision with root package name */
    public final LocalisationKey f14567r;

    /* renamed from: s  reason: collision with root package name */
    public final r1 f14568s;

    /* renamed from: t  reason: collision with root package name */
    public final f2 f14569t;

    /* renamed from: u  reason: collision with root package name */
    public final r1 f14570u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f14571v;

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f14572w;

    /* loaded from: classes2.dex */
    public interface b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$b$a;", "Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$b;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0476a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0476a f14573a = new C0476a();

            private C0476a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0476a);
            }

            public final int hashCode() {
                return -1834645747;
            }

            public final String toString() {
                return "DisplayEnableLocationUiEvent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$b$b;", "Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$b;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0477b implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0477b f14574a = new C0477b();

            private C0477b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0477b);
            }

            public final int hashCode() {
                return 702558947;
            }

            public final String toString() {
                return "OnHowWeUseYourLocationClickEvent";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$b$c;", "Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$b;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            public final String f14575a;

            public c(String str) {
                str.getClass();
                this.f14575a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f14575a.equals(((c) obj).f14575a);
            }

            public final int hashCode() {
                return this.f14575a.hashCode();
            }

            public final String toString() {
                return bv1.f.e("OnManualLocationClickEvent(machineSerial=", this.f14575a, ")");
            }
        }
    }

    @wy1.a
    /* loaded from: classes2.dex */
    public interface c {
        a a(String str, boolean z13);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.interactableec.home.n829.settingstab.location.N829ECSettingsLocationViewModel$emitEvent$1", f = "N829ECSettingsLocationViewModel.kt", l = {252}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f14578f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, l12.d<? super e> dVar) {
            super(2, dVar);
            this.f14578f = bVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(this.f14578f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                u1 u1Var = a.this.f14562m;
                this.d = 1;
                if (u1Var.emit(this.f14578f, this) == aVar) {
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
    public static final class f implements c42.i<String> {
        public final /* synthetic */ c42.i d;
        public final /* synthetic */ a e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0479a<T> implements j {
            public final /* synthetic */ j d;
            public final /* synthetic */ a e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.interactableec.home.n829.settingstab.location.N829ECSettingsLocationViewModel$special$$inlined$map$1$2", f = "N829ECSettingsLocationViewModel.kt", l = {219}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0480a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0480a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0479a.this.emit(null, this);
                }
            }

            public C0479a(j jVar, a aVar) {
                this.d = jVar;
                this.e = aVar;
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
                    boolean r0 = r6 instanceof com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.f.C0479a.C0480a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$f$a$a r0 = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.f.C0479a.C0480a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$f$a$a r0 = new com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L46
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d r5 = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.d) r5
                    java.lang.String r5 = r5.f14576a
                    if (r5 != 0) goto L3b
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a r5 = r4.e
                    java.lang.String r5 = r5.f14565p
                L3b:
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L46
                    return r1
                L46:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.f.C0479a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public f(c42.i iVar, a aVar) {
            this.d = iVar;
            this.e = aVar;
        }

        @Override // c42.i
        public final Object collect(j<? super String> jVar, l12.d dVar) {
            Object collect = this.d.collect(new C0479a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements c42.i<LocalisationKey> {
        public final /* synthetic */ c42.i d;
        public final /* synthetic */ a e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0481a<T> implements j {
            public final /* synthetic */ j d;
            public final /* synthetic */ a e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.interactableec.home.n829.settingstab.location.N829ECSettingsLocationViewModel$special$$inlined$map$2$2", f = "N829ECSettingsLocationViewModel.kt", l = {219}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0482a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0482a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0481a.this.emit(null, this);
                }
            }

            public C0481a(j jVar, a aVar) {
                this.d = jVar;
                this.e = aVar;
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
                    boolean r0 = r6 instanceof com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.g.C0481a.C0482a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$g$a$a r0 = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.g.C0481a.C0482a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$g$a$a r0 = new com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L55
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d r5 = (com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.d) r5
                    java.lang.String r6 = r5.f14576a
                    boolean r5 = r5.f14577b
                    e22.m<java.lang.Object>[] r2 = com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.f14554x
                    com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a r2 = r4.e
                    if (r6 != 0) goto L40
                    com.dyson.mobile.android.localisation.LocalisationKey r5 = r2.f14567r
                    goto L4a
                L40:
                    r2.getClass()
                    if (r5 == 0) goto L48
                    com.dyson.mobile.android.localisation.LocalisationKey r5 = rf0.i0.f71608d5
                    goto L4a
                L48:
                    com.dyson.mobile.android.localisation.LocalisationKey r5 = rf0.i0.f71623e5
                L4a:
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L55
                    return r1
                L55:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.g.C0481a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public g(c42.i iVar, a aVar) {
            this.d = iVar;
            this.e = aVar;
        }

        @Override // c42.i
        public final Object collect(j<? super LocalisationKey> jVar, l12.d dVar) {
            Object collect = this.d.collect(new C0481a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    static {
        new C0475a(null);
    }

    public a(String str, boolean z13, String str2, w60.e eVar, v60.b bVar, wd0.d dVar, mc0.a aVar, n nVar, hj.e eVar2, i iVar, pf0.c cVar) {
        str2.getClass();
        eVar.getClass();
        bVar.getClass();
        dVar.getClass();
        aVar.getClass();
        nVar.getClass();
        eVar2.getClass();
        iVar.getClass();
        cVar.getClass();
        this.d = str2;
        this.e = eVar;
        this.f14555f = bVar;
        this.f14556g = dVar;
        this.f14557h = aVar;
        this.f14558i = nVar;
        this.f14559j = eVar2;
        this.f14560k = iVar;
        this.f14561l = new tf1.a(null, 1, null);
        u1 b13 = w1.b(0, 0, null, 7);
        this.f14562m = b13;
        this.f14563n = c42.r.c(b13);
        f2 a13 = g2.a(new d(str, z13));
        this.f14564o = a13;
        String d13 = cVar.d(i0.f71561a5);
        this.f14565p = d13;
        f fVar = new f(a13, this);
        s9.a a14 = v.a(this);
        d13 = str != null ? str : d13;
        a2.f10222a.getClass();
        c2 c2Var = a2.a.f10225c;
        this.f14566q = c42.r.D(fVar, a14, c2Var, d13);
        LocalisationKey localisationKey = i0.f71577b5;
        this.f14567r = localisationKey;
        this.f14568s = c42.r.D(new g(a13, this), v.a(this), c2Var, str != null ? z13 ? i0.f71608d5 : i0.f71623e5 : localisationKey);
        f2 a15 = g2.a(Boolean.FALSE);
        this.f14569t = a15;
        this.f14570u = c42.r.d(a15);
        se1.f0.f76041a.getClass();
        this.f14571v = !f0.a.a(str2, s.c("KR"));
        this.f14572w = t.h("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    public static final boolean S(a aVar, rf1.e eVar) {
        aVar.getClass();
        return eVar.b() || eVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r5.V(r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a r5, n12.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof fc0.j
            if (r0 == 0) goto L16
            r0 = r6
            fc0.j r0 = (fc0.j) r0
            int r1 = r0.f30572f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f30572f = r1
            goto L1b
        L16:
            fc0.j r0 = new fc0.j
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f30572f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            h12.r.b(r6)
            goto L61
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            r5 = 0
            return r5
        L34:
            h12.r.b(r6)
            goto L4e
        L38:
            h12.r.b(r6)
            v60.b r6 = r5.f14555f
            c42.b r6 = r6.b()
            c42.a0 r6 = c42.r.p(r6, r4)
            r0.f30572f = r4
            java.lang.Object r6 = c42.r.t(r6, r0)
            if (r6 != r1) goto L4e
            goto L60
        L4e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L61
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L61
            r0.f30572f = r3
            java.lang.Object r5 = r5.V(r0)
            if (r5 != r1) goto L61
        L60:
            return r1
        L61:
            h12.f0 r5 = h12.f0.f36844a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.T(com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a, n12.c):java.lang.Object");
    }

    public final void U(b bVar) {
        g0.r(v.a(this), null, null, new e(bVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (h12.f0.f36844a == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (z32.g0.v(r9, r2, r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (h12.f0.f36844a == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(n12.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof fc0.k
            if (r0 == 0) goto L13
            r0 = r9
            fc0.k r0 = (fc0.k) r0
            int r1 = r0.f30573f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30573f = r1
            goto L18
        L13:
            fc0.k r0 = new fc0.k
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f30573f
            c42.f2 r3 = r8.f14569t
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3e
            if (r2 == r7) goto L3a
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            h12.r.b(r9)
            goto L6d
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r8)
            return r4
        L36:
            h12.r.b(r9)
            goto L61
        L3a:
            h12.r.b(r9)
            goto L4d
        L3e:
            h12.r.b(r9)
            r0.f30573f = r7
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r3.l(r4, r9)
            h12.f0 r9 = h12.f0.f36844a
            if (r9 != r1) goto L4d
            goto L6c
        L4d:
            af1.i r9 = r8.f14560k
            h42.b r9 = r9.c()
            fc0.l r2 = new fc0.l
            r2.<init>(r8, r4)
            r0.f30573f = r6
            java.lang.Object r8 = z32.g0.v(r9, r2, r0)
            if (r8 != r1) goto L61
            goto L6c
        L61:
            r0.f30573f = r5
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3.l(r4, r8)
            h12.f0 r8 = h12.f0.f36844a
            if (r8 != r1) goto L6d
        L6c:
            return r1
        L6d:
            h12.f0 r8 = h12.f0.f36844a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a.V(n12.c):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$d;", "", "", "name", "", "isManuallySet", "<init>", "(Ljava/lang/String;Z)V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f14576a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14577b;

        static {
            new C0478a(null);
            new d(null, false);
        }

        public d(String str, boolean z13) {
            this.f14576a = str;
            this.f14577b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return x12.r.c(this.f14576a, dVar.f14576a) && this.f14577b == dVar.f14577b;
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f14576a;
            return Boolean.hashCode(this.f14577b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return o1.a.e("LocationState(name=", this.f14576a, ", isManuallySet=", this.f14577b, ")");
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$d$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0478a {
            public /* synthetic */ C0478a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0478a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/settingstab/location/a$a;", "", "<init>", "()V", "", "PRECISE_LOCATION", "Ljava/lang/String;", "APPROXIMATE_LOCATION", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0475a {
        public /* synthetic */ C0475a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0475a() {
        }
    }
}
