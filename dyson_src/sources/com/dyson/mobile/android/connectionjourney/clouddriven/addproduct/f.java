package com.dyson.mobile.android.connectionjourney.clouddriven.addproduct;

import b20.b0;
import b20.l;
import b42.m;
import c42.f2;
import c42.g2;
import c42.i;
import c42.j;
import c42.r1;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import nl0.h;
import uf0.q;
import z32.g0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/f;", "Lm9/u;", "Lb20/f;", "addProductContentRepository", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/a;", "addProductDeepLinkParser", "Lhj/e;", "trackingManager", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "connectionJourneyDataStore", "Lb20/l;", "analyticsScreenFactory", "", "productGroupIdentifier", "<init>", "(Lb20/f;Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/a;Lhj/e;Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lb20/l;Ljava/lang/String;)V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends u {
    public final b20.f d;
    public final com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.a e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f13444f;

    /* renamed from: g  reason: collision with root package name */
    public final ConnectionJourneyDataStore f13445g;

    /* renamed from: h  reason: collision with root package name */
    public final l f13446h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13447i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f13448j;

    /* renamed from: k  reason: collision with root package name */
    public final r1 f13449k;

    /* renamed from: l  reason: collision with root package name */
    public final b42.c f13450l;

    /* renamed from: m  reason: collision with root package name */
    public final c42.e f13451m;

    /* renamed from: n  reason: collision with root package name */
    public final b42.c f13452n;

    /* renamed from: o  reason: collision with root package name */
    public final c42.e f13453o;

    /* renamed from: p  reason: collision with root package name */
    public final i<ij.b> f13454p;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        f a(String str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc42/j;", "Lij/b;", "Lh12/f0;", "<anonymous>", "(Lc42/j;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.ProductGroupViewModel$analyticsScreen$2", f = "ProductGroupViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<j<? super ij.b>, l12.d<? super f0>, Object> {
        public b(l12.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j<? super ij.b> jVar, l12.d<? super f0> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            ((q) f.this.f13444f.a()).d();
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements i<ij.b> {
        public final /* synthetic */ i d;
        public final /* synthetic */ f e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a<T> implements j {
            public final /* synthetic */ j d;
            public final /* synthetic */ f e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.ProductGroupViewModel$special$$inlined$map$1$2", f = "ProductGroupViewModel.kt", l = {50}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0421a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0421a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar, f fVar) {
                this.d = jVar;
                this.e = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
            @Override // c42.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, l12.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f.c.a.C0421a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f$c$a$a r0 = (com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f.c.a.C0421a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f$c$a$a r0 = new com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f$c$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L28
                    h12.r.b(r7)
                    goto L72
                L28:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r5)
                    return r4
                L2e:
                    h12.r.b(r7)
                    nl0.h r6 = (nl0.h) r6
                    com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f r7 = r5.e
                    b20.l r2 = r7.f13446h
                    java.lang.String r7 = r7.f13447i
                    r2.getClass()
                    r6.getClass()
                    nl0.h$d r2 = nl0.h.d.f57899a
                    boolean r2 = r6.equals(r2)
                    if (r2 != 0) goto L63
                    nl0.h$b r2 = nl0.h.b.f57897a
                    boolean r2 = r6.equals(r2)
                    if (r2 != 0) goto L63
                    boolean r2 = r6 instanceof nl0.h.c
                    if (r2 == 0) goto L54
                    goto L63
                L54:
                    boolean r6 = r6 instanceof nl0.h.a
                    if (r6 == 0) goto L5f
                    java.lang.String r6 = "fetch_error"
                    ij.b r6 = b20.l.a(r7, r6)
                    goto L67
                L5f:
                    ma.e.o()
                    return r4
                L63:
                    ij.b r6 = b20.l.a(r7, r4)
                L67:
                    r0.e = r3
                    c42.j r5 = r5.d
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L72
                    return r1
                L72:
                    h12.f0 r5 = h12.f0.f36844a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f.c.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public c(i iVar, f fVar) {
            this.d = iVar;
            this.e = fVar;
        }

        @Override // c42.i
        public final Object collect(j<? super ij.b> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    public f(b20.f fVar, com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.a aVar, hj.e eVar, ConnectionJourneyDataStore connectionJourneyDataStore, l lVar, String str) {
        fVar.getClass();
        aVar.getClass();
        eVar.getClass();
        connectionJourneyDataStore.getClass();
        lVar.getClass();
        this.d = fVar;
        this.e = aVar;
        this.f13444f = eVar;
        this.f13445g = connectionJourneyDataStore;
        this.f13446h = lVar;
        this.f13447i = str;
        f2 a13 = g2.a(h.b.f57897a);
        this.f13448j = a13;
        r1 d = c42.r.d(a13);
        this.f13449k = d;
        b42.c b13 = m.b(0, null, null, 7);
        this.f13450l = b13;
        this.f13451m = c42.r.B(b13);
        b42.c b14 = m.b(0, null, null, 7);
        this.f13452n = b14;
        this.f13453o = c42.r.B(b14);
        this.f13454p = c42.r.n(new c42.u(new b(null), new c(d, this)));
        g0.r(v.a(this), null, null, new b0(this, null), 3);
    }

    public /* synthetic */ f(b20.f fVar, com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.a aVar, hj.e eVar, ConnectionJourneyDataStore connectionJourneyDataStore, l lVar, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, aVar, eVar, connectionJourneyDataStore, lVar, (i13 & 32) != 0 ? null : str);
    }
}
