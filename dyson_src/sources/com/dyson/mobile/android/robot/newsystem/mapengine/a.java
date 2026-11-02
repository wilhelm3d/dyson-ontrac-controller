package com.dyson.mobile.android.robot.newsystem.mapengine;

import c42.f2;
import c42.g2;
import c42.j;
import c42.r1;
import com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderApiError;
import com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree;
import com.paypal.android.platform.authsdk.BR;
import com.salesforce.marketingcloud.push.g;
import h12.f0;
import h12.r;
import h41.d;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import m9.u;
import m9.v;
import n12.i;
import nl0.h;
import q62.n;
import y01.k;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/a;", "Lm9/u;", "Lh11/a;", "persistentMapLoader", "Lh41/d;", "updateMapTasks", "Lhj/e;", "trackingManager", "", "mapId", "Liu0/r;", "robotCapabilitiesSupport", "Luf0/k;", "machineOptions", "<init>", "(Lh11/a;Lh41/d;Lhj/e;Ljava/lang/String;Liu0/r;Luf0/k;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {
    public final h11.a d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final e f16442f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16443g;

    /* renamed from: h  reason: collision with root package name */
    public final f2 f16444h;

    /* renamed from: i  reason: collision with root package name */
    public final r1 f16445i;

    /* renamed from: j  reason: collision with root package name */
    public RotationAngleDegree f16446j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f16447k;

    @wy1.a
    /* renamed from: com.dyson.mobile.android.robot.newsystem.mapengine.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0576a {
        a a(String str);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderViewModel$fetchPersistentMap$1", f = "MapLoaderViewModel.kt", l = {50, BR.mainViewModel}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class b extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc42/j;", "Lnl0/h;", "Ly01/k;", "", "throwable", "Lh12/f0;", "<anonymous>", "(Lc42/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderViewModel$fetchPersistentMap$1$2", f = "MapLoaderViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.mapengine.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0577a extends i implements Function3<j<? super h<? extends k>>, Throwable, l12.d<? super f0>, Object> {
            public int d;
            public /* synthetic */ Throwable e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ a f16448f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0577a(a aVar, l12.d<? super C0577a> dVar) {
                super(3, dVar);
                this.f16448f = aVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(j<? super h<? extends k>> jVar, Throwable th2, l12.d<? super f0> dVar) {
                C0577a c0577a = new C0577a(this.f16448f, dVar);
                c0577a.e = th2;
                return c0577a.invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                Throwable th2 = this.e;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                int i13 = this.d;
                if (i13 == 0) {
                    r.b(obj);
                    a aVar2 = this.f16448f;
                    n.n("Failed to get PersistentMap for mapId ", aVar2.f16443g, th2);
                    f2 f2Var = aVar2.f16444h;
                    h.a aVar3 = new h.a(MapLoaderApiError.FetchMapApiError.d);
                    this.e = null;
                    this.d = 1;
                    f2Var.l(null, aVar3);
                    if (f0.f36844a == aVar) {
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

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lnl0/h;", "Ly01/k;", g.f21676h, "Lh12/f0;", "<anonymous>", "(Lnl0/h;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderViewModel$fetchPersistentMap$1$3", f = "MapLoaderViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.mapengine.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0578b extends i implements Function2<h<? extends k>, l12.d<? super f0>, Object> {
            public int d;
            public /* synthetic */ Object e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ a f16449f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0578b(a aVar, l12.d<? super C0578b> dVar) {
                super(2, dVar);
                this.f16449f = aVar;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                C0578b c0578b = new C0578b(this.f16449f, dVar);
                c0578b.e = obj;
                return c0578b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h<? extends k> hVar, l12.d<? super f0> dVar) {
                return ((C0578b) create(hVar, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                h hVar = (h) this.e;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                int i13 = this.d;
                if (i13 == 0) {
                    r.b(obj);
                    f2 f2Var = this.f16449f.f16444h;
                    this.e = null;
                    this.d = 1;
                    f2Var.setValue(hVar);
                    if (f0.f36844a == aVar) {
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
        /* loaded from: classes3.dex */
        public static final class c implements c42.i<h<? extends k>> {
            public final /* synthetic */ c42.i d;
            public final /* synthetic */ a e;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
            /* renamed from: com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0579a<T> implements j {
                public final /* synthetic */ j d;
                public final /* synthetic */ a e;

                @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapengine.MapLoaderViewModel$fetchPersistentMap$1$invokeSuspend$$inlined$map$1$2", f = "MapLoaderViewModel.kt", l = {219}, m = "emit", v = 2)
                /* renamed from: com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C0580a extends n12.c {
                    public /* synthetic */ Object d;
                    public int e;

                    public C0580a(l12.d dVar) {
                        super(dVar);
                    }

                    @Override // n12.a
                    public final Object invokeSuspend(Object obj) {
                        this.d = obj;
                        this.e |= Integer.MIN_VALUE;
                        return C0579a.this.emit(null, this);
                    }
                }

                public C0579a(j jVar, a aVar) {
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
                        boolean r0 = r6 instanceof com.dyson.mobile.android.robot.newsystem.mapengine.a.b.c.C0579a.C0580a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c$a$a r0 = (com.dyson.mobile.android.robot.newsystem.mapengine.a.b.c.C0579a.C0580a) r0
                        int r1 = r0.e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.e = r1
                        goto L18
                    L13:
                        com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c$a$a r0 = new com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.d
                        m12.a r1 = m12.a.COROUTINE_SUSPENDED
                        int r2 = r0.e
                        r3 = 1
                        if (r2 == 0) goto L2e
                        if (r2 != r3) goto L27
                        h12.r.b(r6)
                        goto L49
                    L27:
                        java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                        pa.c.w(r4)
                        r4 = 0
                        return r4
                    L2e:
                        h12.r.b(r6)
                        y01.k r5 = (y01.k) r5
                        com.dyson.mobile.android.robot.newsystem.mapengine.a r6 = r4.e
                        com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree r2 = r5.d
                        r6.f16446j = r2
                        nl0.h$c r6 = new nl0.h$c
                        r6.<init>(r5)
                        r0.e = r3
                        c42.j r4 = r4.d
                        java.lang.Object r4 = r4.emit(r6, r0)
                        if (r4 != r1) goto L49
                        return r1
                    L49:
                        h12.f0 r4 = h12.f0.f36844a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapengine.a.b.c.C0579a.emit(java.lang.Object, l12.d):java.lang.Object");
                }
            }

            public c(c42.i iVar, a aVar) {
                this.d = iVar;
                this.e = aVar;
            }

            @Override // c42.i
            public final Object collect(j<? super h<? extends k>> jVar, l12.d dVar) {
                Object collect = this.d.collect(new C0579a(jVar, this.e), dVar);
                return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
            }
        }

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

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            if (h12.f0.f36844a == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
            if (c42.r.i(r4, r7, r6) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
            return r0;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                m12.a r0 = m12.a.COROUTINE_SUSPENDED
                int r1 = r6.d
                r2 = 0
                r3 = 2
                r4 = 1
                com.dyson.mobile.android.robot.newsystem.mapengine.a r5 = com.dyson.mobile.android.robot.newsystem.mapengine.a.this
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                h12.r.b(r7)
                goto L55
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r6)
                return r2
            L19:
                h12.r.b(r7)
                goto L2e
            L1d:
                h12.r.b(r7)
                c42.f2 r7 = r5.f16444h
                nl0.h$b r1 = nl0.h.b.f57897a
                r6.d = r4
                r7.setValue(r1)
                h12.f0 r7 = h12.f0.f36844a
                if (r7 != r0) goto L2e
                goto L54
            L2e:
                h11.a r7 = r5.d
                java.lang.String r1 = r5.f16443g
                com.dyson.mobile.android.robot.CacheLoadPolicy r4 = com.dyson.mobile.android.robot.CacheLoadPolicy.REMOTE_ONLY
                c42.i r7 = r7.d(r1, r4)
                com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c r1 = new com.dyson.mobile.android.robot.newsystem.mapengine.a$b$c
                r1.<init>(r7, r5)
                com.dyson.mobile.android.robot.newsystem.mapengine.a$b$a r7 = new com.dyson.mobile.android.robot.newsystem.mapengine.a$b$a
                r7.<init>(r5, r2)
                c42.v r4 = new c42.v
                r4.<init>(r1, r7)
                com.dyson.mobile.android.robot.newsystem.mapengine.a$b$b r7 = new com.dyson.mobile.android.robot.newsystem.mapengine.a$b$b
                r7.<init>(r5, r2)
                r6.d = r3
                java.lang.Object r6 = c42.r.i(r4, r7, r6)
                if (r6 != r0) goto L55
            L54:
                return r0
            L55:
                h12.f0 r6 = h12.f0.f36844a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapengine.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(h11.a aVar, d dVar, e eVar, String str, iu0.r rVar, uf0.k kVar) {
        aVar.getClass();
        dVar.getClass();
        eVar.getClass();
        str.getClass();
        rVar.getClass();
        kVar.getClass();
        this.d = aVar;
        this.e = dVar;
        this.f16442f = eVar;
        this.f16443g = str;
        f2 a13 = g2.a(h.b.f57897a);
        this.f16444h = a13;
        this.f16445i = c42.r.d(a13);
        this.f16446j = RotationAngleDegree.ANGLE_0;
        this.f16447k = rVar.b() || kVar.b();
    }

    public final void S() {
        g0.r(v.a(this), null, null, new b(null), 3);
    }
}
