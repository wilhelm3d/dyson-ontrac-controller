package yo;

import c42.a2;
import c42.c2;
import c42.q1;
import c42.u1;
import c42.w1;
import com.paypal.android.platform.authsdk.BR;
import f60.z;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyo/i;", "Lyo/k;", "Lf60/f0;", "authenticatedBleConnector", "Lgi0/a;", "messageAttributeValueController", "Lz32/c0;", "coroutineScope", "Laf1/i;", "dispatcherProvider", "<init>", "(Lf60/f0;Lgi0/a;Lz32/c0;Laf1/i;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.a f90310a;

    /* renamed from: b  reason: collision with root package name */
    public final af1.i f90311b;

    /* renamed from: c  reason: collision with root package name */
    public final u1 f90312c;
    public final u1 d;
    public final q1 e;

    /* renamed from: f  reason: collision with root package name */
    public final q1 f90313f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lc42/j;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.traits.anc.DefaultUserAncModeController$special$$inlined$flatMapConnected$1", f = "DefaultUserAncModeController.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function3<c42.j<? super n>, z, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ c42.j e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f90314f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i f90315g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l12.d dVar, i iVar) {
            super(3, dVar);
            this.f90315g = iVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(c42.j<? super n> jVar, z zVar, l12.d<? super f0> dVar) {
            a aVar = new a(dVar, this.f90315g);
            aVar.e = jVar;
            aVar.f90314f = zVar;
            return aVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            c42.i iVar;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                c42.j jVar = this.e;
                if (((z) this.f90314f) instanceof z.a) {
                    gi0.a aVar2 = this.f90315g.f90310a;
                    on.b.f60566a.getClass();
                    iVar = aVar2.a(on.b.f60569f, new o());
                } else {
                    iVar = c42.h.d;
                }
                this.e = null;
                this.f90314f = null;
                this.d = 1;
                if (c42.r.q(jVar, iVar, this) == aVar) {
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
    public static final class b implements c42.i<q> {
        public final /* synthetic */ c42.i d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ c42.j d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.audio.traits.anc.DefaultUserAncModeController$special$$inlined$mapNotNull$1$2", f = "DefaultUserAncModeController.kt", l = {BR.isDustMapLayerVisible}, m = "emit", v = 2)
            /* renamed from: yo.i$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C2733a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C2733a(l12.d dVar) {
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
                    boolean r0 = r6 instanceof yo.i.b.a.C2733a
                    if (r0 == 0) goto L13
                    r0 = r6
                    yo.i$b$a$a r0 = (yo.i.b.a.C2733a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    yo.i$b$a$a r0 = new yo.i$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L42
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    yo.n r5 = (yo.n) r5
                    yo.q r5 = r5.f90321a
                    if (r5 == 0) goto L42
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L42
                    return r1
                L42:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: yo.i.b.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public b(c42.i iVar) {
            this.d = iVar;
        }

        @Override // c42.i
        public final Object collect(c42.j<? super q> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements c42.i<p> {
        public final /* synthetic */ c42.i d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ c42.j d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.audio.traits.anc.DefaultUserAncModeController$special$$inlined$mapNotNull$2$2", f = "DefaultUserAncModeController.kt", l = {BR.isDustMapLayerVisible}, m = "emit", v = 2)
            /* renamed from: yo.i$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C2734a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C2734a(l12.d dVar) {
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
                    boolean r0 = r6 instanceof yo.i.c.a.C2734a
                    if (r0 == 0) goto L13
                    r0 = r6
                    yo.i$c$a$a r0 = (yo.i.c.a.C2734a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    yo.i$c$a$a r0 = new yo.i$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L42
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    yo.n r5 = (yo.n) r5
                    yo.p r5 = r5.f90322b
                    if (r5 == 0) goto L42
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L42
                    return r1
                L42:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: yo.i.c.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public c(c42.i iVar) {
            this.d = iVar;
        }

        @Override // c42.i
        public final Object collect(c42.j<? super p> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    public i(f60.f0 f0Var, gi0.a aVar, c0 c0Var, af1.i iVar) {
        f0Var.getClass();
        aVar.getClass();
        c0Var.getClass();
        iVar.getClass();
        this.f90310a = aVar;
        this.f90311b = iVar;
        u1 b13 = w1.b(0, 0, null, 7);
        this.f90312c = b13;
        u1 b14 = w1.b(0, 0, null, 7);
        this.d = b14;
        c42.i n13 = c42.r.n(c42.r.E(f0Var.f29944b, new a(null, this)));
        a2.f10222a.getClass();
        c2 c2Var = a2.a.f10225c;
        q1 C = c42.r.C(n13, c0Var, c2Var, 1);
        this.e = c42.r.C(c42.r.n(c42.r.A(new b(C), b13)), c0Var, c2Var, 1);
        this.f90313f = c42.r.C(c42.r.n(c42.r.A(new c(C), b14)), c0Var, c2Var, 1);
    }

    @Override // yo.k
    public final q1 a() {
        return this.e;
    }

    @Override // yo.k
    public final q1 b() {
        return this.f90313f;
    }

    @Override // yo.k
    public final Object c(q qVar, tk.o oVar) {
        Object v13 = g0.v(this.f90311b.c(), new h(this, qVar, null), oVar);
        return v13 == m12.a.COROUTINE_SUSPENDED ? v13 : f0.f36844a;
    }

    @Override // yo.k
    public final Object d(p pVar, tk.o oVar) {
        Object v13 = g0.v(this.f90311b.c(), new g(this, pVar, null), oVar);
        return v13 == m12.a.COROUTINE_SUSPENDED ? v13 : f0.f36844a;
    }
}
