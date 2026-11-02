package com.dyson.mobile.android.connectionjourney.ownership;

import c42.f2;
import c42.g2;
import c42.r1;
import cg0.r;
import com.dyson.mobile.android.connectionjourney.ownership.g;
import com.dyson.mobile.android.connectionjourney.ownership.i;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import h12.t;
import hj.e;
import i12.s;
import java.time.LocalDate;
import java.time.ZoneOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import mj.a;
import mj.f;
import nj.a3;
import nj.e3;
import nj.f3;
import nj.g3;
import nj.j3;
import nz1.m;
import p30.a0;
import p30.b0;
import y30.a;
import y30.b;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/j;", "Lm9/u;", "Laf1/i;", "dispatcherProvider", "Lh40/d;", "ownershipDataStore", "Lc40/g;", "ownershipPurchaseDateUseCase", "Lhj/e;", "trackingManager", "Lbg0/a;", "machineAssetRepository", "Lqh/a;", "accountDataStore", "Lcom/dyson/mobile/android/connectionjourney/ownership/h;", "ownershipAlertViewStateFactory", "Lp30/a0;", "ownershipTaskFactory", "Lw00/j;", "connectionJourneyOptions", "Lpf0/c;", "localisationManager", "<init>", "(Laf1/i;Lh40/d;Lc40/g;Lhj/e;Lbg0/a;Lqh/a;Lcom/dyson/mobile/android/connectionjourney/ownership/h;Lp30/a0;Lw00/j;Lpf0/c;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends u {
    public final af1.i d;
    public final h40.d e;

    /* renamed from: f  reason: collision with root package name */
    public final c40.g f13814f;

    /* renamed from: g  reason: collision with root package name */
    public final hj.e f13815g;

    /* renamed from: h  reason: collision with root package name */
    public final bg0.a f13816h;

    /* renamed from: i  reason: collision with root package name */
    public final qh.a f13817i;

    /* renamed from: j  reason: collision with root package name */
    public final h f13818j;

    /* renamed from: k  reason: collision with root package name */
    public final a0 f13819k;

    /* renamed from: l  reason: collision with root package name */
    public final w00.j f13820l;

    /* renamed from: m  reason: collision with root package name */
    public final pf0.c f13821m;

    /* renamed from: n  reason: collision with root package name */
    public final b42.c f13822n;

    /* renamed from: o  reason: collision with root package name */
    public final c42.e f13823o;

    /* renamed from: p  reason: collision with root package name */
    public final f2 f13824p;

    /* renamed from: q  reason: collision with root package name */
    public final r1 f13825q;

    /* renamed from: r  reason: collision with root package name */
    public final MachineDescriptor f13826r;

    /* renamed from: s  reason: collision with root package name */
    public final f2 f13827s;

    /* renamed from: t  reason: collision with root package name */
    public final r1 f13828t;

    /* renamed from: u  reason: collision with root package name */
    public final t f13829u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipViewModel$1", f = "OwnershipViewModel.kt", l = {BR.supportDomain}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

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
                r.b(obj);
                this.d = 1;
                if (j.S(j.this, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipViewModel$completeOwnership$3", f = "OwnershipViewModel.kt", l = {325, 328}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a<f0> f13830f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.connectionjourney.ownership.OwnershipViewModel$completeOwnership$3$1", f = "OwnershipViewModel.kt", l = {326}, m = "invokeSuspend", v = 2)
        /* loaded from: classes2.dex */
        public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
            public int d;
            public final /* synthetic */ j e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, l12.d<? super a> dVar) {
                super(2, dVar);
                this.e = jVar;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                return new a(this.e, dVar);
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
                    r.b(obj);
                    m a13 = this.e.f13819k.a();
                    this.d = 1;
                    if (g42.b.a(a13, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w12.a<f0> aVar, l12.d<? super b> dVar) {
            super(2, dVar);
            this.f13830f = aVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.f13830f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
            if (r8.b(r1, r7) == r0) goto L19;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                m12.a r0 = m12.a.COROUTINE_SUSPENDED
                int r1 = r7.d
                r2 = 0
                r3 = 2
                r4 = 1
                com.dyson.mobile.android.connectionjourney.ownership.j r5 = com.dyson.mobile.android.connectionjourney.ownership.j.this
                r6 = 0
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L18
                h12.r.b(r8)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                goto L46
            L14:
                r7 = move-exception
                goto L81
            L16:
                r8 = move-exception
                goto L5a
            L18:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r7)
                return r6
            L1e:
                h12.r.b(r8)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                goto L39
            L22:
                h12.r.b(r8)
                af1.i r8 = r5.d     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                h42.b r8 = r8.c()     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                com.dyson.mobile.android.connectionjourney.ownership.j$b$a r1 = new com.dyson.mobile.android.connectionjourney.ownership.j$b$a     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                r7.d = r4     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                java.lang.Object r8 = z32.g0.v(r8, r1, r7)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                if (r8 != r0) goto L39
                goto L45
            L39:
                b42.c r8 = r5.f13822n     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                y30.a$b r1 = y30.a.b.f89104a     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                r7.d = r3     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                java.lang.Object r7 = r8.b(r1, r7)     // Catch: java.lang.Throwable -> L14 java.lang.Exception -> L16
                if (r7 != r0) goto L46
            L45:
                return r0
            L46:
                c42.f2 r7 = r5.f13824p
            L48:
                java.lang.Object r8 = r7.getValue()
                r0 = r8
                com.dyson.mobile.android.connectionjourney.ownership.k r0 = (com.dyson.mobile.android.connectionjourney.ownership.k) r0
                com.dyson.mobile.android.connectionjourney.ownership.k r0 = com.dyson.mobile.android.connectionjourney.ownership.k.a(r0, r6, r2, r4)
                boolean r8 = r7.f(r8, r0)
                if (r8 == 0) goto L48
                goto L7d
            L5a:
                boolean r0 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L14
                if (r0 != 0) goto L80
                java.lang.String r8 = r8.getLocalizedMessage()     // Catch: java.lang.Throwable -> L14
                com.dyson.mobile.android.logging.Logger.b(r8, r6)     // Catch: java.lang.Throwable -> L14
                w12.a<h12.f0> r7 = r7.f13830f     // Catch: java.lang.Throwable -> L14
                r7.invoke()     // Catch: java.lang.Throwable -> L14
                c42.f2 r7 = r5.f13824p
            L6c:
                java.lang.Object r8 = r7.getValue()
                r0 = r8
                com.dyson.mobile.android.connectionjourney.ownership.k r0 = (com.dyson.mobile.android.connectionjourney.ownership.k) r0
                com.dyson.mobile.android.connectionjourney.ownership.k r0 = com.dyson.mobile.android.connectionjourney.ownership.k.a(r0, r6, r2, r4)
                boolean r8 = r7.f(r8, r0)
                if (r8 == 0) goto L6c
            L7d:
                h12.f0 r7 = h12.f0.f36844a
                return r7
            L80:
                throw r8     // Catch: java.lang.Throwable -> L14
            L81:
                c42.f2 r8 = r5.f13824p
            L83:
                java.lang.Object r0 = r8.getValue()
                r1 = r0
                com.dyson.mobile.android.connectionjourney.ownership.k r1 = (com.dyson.mobile.android.connectionjourney.ownership.k) r1
                com.dyson.mobile.android.connectionjourney.ownership.k r1 = com.dyson.mobile.android.connectionjourney.ownership.k.a(r1, r6, r2, r4)
                boolean r0 = r8.f(r0, r1)
                if (r0 != 0) goto L95
                goto L83
            L95:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.ownership.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(af1.i iVar, h40.d dVar, c40.g gVar, hj.e eVar, bg0.a aVar, qh.a aVar2, h hVar, a0 a0Var, w00.j jVar, pf0.c cVar) {
        Object obj;
        y30.b fVar;
        iVar.getClass();
        dVar.getClass();
        gVar.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        hVar.getClass();
        a0Var.getClass();
        jVar.getClass();
        cVar.getClass();
        this.d = iVar;
        this.e = dVar;
        this.f13814f = gVar;
        this.f13815g = eVar;
        this.f13816h = aVar;
        this.f13817i = aVar2;
        this.f13818j = hVar;
        this.f13819k = a0Var;
        this.f13820l = jVar;
        this.f13821m = cVar;
        b42.c b13 = b42.m.b(0, null, null, 7);
        this.f13822n = b13;
        this.f13823o = c42.r.B(b13);
        f2 a13 = g2.a(new k(null, false, 3, null));
        this.f13824p = a13;
        this.f13825q = c42.r.d(a13);
        MachineDescriptor a14 = dVar.f().a();
        this.f13826r = a14;
        r.c cVar2 = r.c.f11149a;
        String productName = a14.getProductName();
        String e = dVar.f().e();
        e.getClass();
        f2 a15 = g2.a(new b40.i(cVar2, productName, e));
        this.f13827s = a15;
        this.f13828t = c42.r.d(a15);
        si.d d = dVar.f().d();
        d.getClass();
        String a16 = d.a();
        if (a16 != null) {
            int hashCode = a16.hashCode();
            if (hashCode != -1993360092) {
                if (hashCode != -1233051405) {
                    if (hashCode == -187064374 && a16.equals("REGISTERED_TO_ANOTHER_ACCOUNT")) {
                        obj = new a.d(b.e.INSTANCE, false, 2, null);
                    }
                } else if (a16.equals("REGISTERED_TO_THIS_ACCOUNT")) {
                    obj = u50.j.h(a14) ? new a.d(new b.f(false), false, 2, null) : a.c.f89105a;
                }
            } else if (a16.equals("DEVICE_UNREGISTERED")) {
                a14.getClass();
                if (u50.j.j(a14) && ((Boolean) jVar.f85132a.getValue(jVar, w00.j.d[0])).booleanValue()) {
                    LocalDate localDate = gVar.f10174b;
                    localDate.getClass();
                    gVar.a(localDate.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
                    fVar = b.a.INSTANCE;
                } else {
                    fVar = (u50.j.e(a14) || u50.j.h(a14)) ? new b.f(false) : b.d.INSTANCE;
                }
                obj = new a.d(fVar, false, 2, null);
            }
            af1.g.a(b13, v.a(this), obj);
            g0.r(v.a(this), null, null, new a(null), 3);
            this.f13829u = h12.m.b(new b0(this, 0));
        }
        obj = a.c.f89105a;
        af1.g.a(b13, v.a(this), obj);
        g0.r(v.a(this), null, null, new a(null), 3);
        this.f13829u = h12.m.b(new b0(this, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|12|(1:13)|15|16|17))|29|6|7|(0)(0)|11|12|(1:13)|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        com.dyson.mobile.android.logging.Logger.b("Error getting product thumbnail", r0);
        r1 = cg0.r.b.f11148a;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.connectionjourney.ownership.j r12, n12.c r13) {
        /*
            h40.d r0 = r12.e
            boolean r1 = r13 instanceof p30.c0
            if (r1 == 0) goto L15
            r1 = r13
            p30.c0 r1 = (p30.c0) r1
            int r2 = r1.f62814f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f62814f = r2
            goto L1a
        L15:
            p30.c0 r1 = new p30.c0
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.d
            m12.a r2 = m12.a.COROUTINE_SUSPENDED
            int r3 = r1.f62814f
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2c
            h12.r.b(r13)     // Catch: java.lang.Exception -> L29
            goto L72
        L29:
            r0 = move-exception
            r13 = r0
            goto L8c
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r12)
            r12 = 0
            return r12
        L33:
            h12.r.b(r13)
            ag0.b r5 = new ag0.b     // Catch: java.lang.Exception -> L29
            com.dyson.mobile.android.machinetype.MachineSerial r6 = new com.dyson.mobile.android.machinetype.MachineSerial     // Catch: java.lang.Exception -> L29
            h40.b r13 = r0.f()     // Catch: java.lang.Exception -> L29
            java.lang.String r13 = r13.e()     // Catch: java.lang.Exception -> L29
            r13.getClass()     // Catch: java.lang.Exception -> L29
            r6.<init>(r13)     // Catch: java.lang.Exception -> L29
            h40.b r13 = r0.f()     // Catch: java.lang.Exception -> L29
            java.lang.String r7 = r13.b()     // Catch: java.lang.Exception -> L29
            r7.getClass()     // Catch: java.lang.Exception -> L29
            h40.b r13 = r0.f()     // Catch: java.lang.Exception -> L29
            java.lang.String r8 = r13.c()     // Catch: java.lang.Exception -> L29
            r8.getClass()     // Catch: java.lang.Exception -> L29
            r10 = 8
            r11 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L29
            bg0.a r13 = r12.f13816h     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = "thumbnail"
            r1.f62814f = r4     // Catch: java.lang.Exception -> L29
            java.lang.Object r13 = r13.a(r5, r3, r1)     // Catch: java.lang.Exception -> L29
            if (r13 != r2) goto L72
            return r2
        L72:
            ag0.a r13 = (ag0.a) r13     // Catch: java.lang.Exception -> L29
            cg0.r$a r1 = new cg0.r$a     // Catch: java.lang.Exception -> L29
            cg0.l$b r2 = new cg0.l$b     // Catch: java.lang.Exception -> L29
            h40.b r0 = r0.f()     // Catch: java.lang.Exception -> L29
            java.lang.String r0 = r0.e()     // Catch: java.lang.Exception -> L29
            r0.getClass()     // Catch: java.lang.Exception -> L29
            java.lang.String r13 = r13.d     // Catch: java.lang.Exception -> L29
            r2.<init>(r0, r13)     // Catch: java.lang.Exception -> L29
            r1.<init>(r2)     // Catch: java.lang.Exception -> L29
            goto L93
        L8c:
            java.lang.String r0 = "Error getting product thumbnail"
            com.dyson.mobile.android.logging.Logger.b(r0, r13)
            cg0.r$b r1 = cg0.r.b.f11148a
        L93:
            c42.f2 r12 = r12.f13827s
        L95:
            java.lang.Object r13 = r12.getValue()
            r0 = r13
            b40.i r0 = (b40.i) r0
            b40.i r0 = b40.i.a(r0, r1)
            boolean r13 = r12.f(r13, r0)
            if (r13 == 0) goto L95
            h12.f0 r12 = h12.f0.f36844a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.ownership.j.S(com.dyson.mobile.android.connectionjourney.ownership.j, n12.c):java.lang.Object");
    }

    public final void T() {
        f2 f2Var;
        Object value;
        do {
            f2Var = this.f13824p;
            value = f2Var.getValue();
        } while (!f2Var.f(value, k.a((k) value, g.a.f13787a, false, 2)));
    }

    public final void U(w12.a<f0> aVar) {
        f2 f2Var;
        Object value;
        do {
            f2Var = this.f13824p;
            value = f2Var.getValue();
        } while (!f2Var.f(value, k.a((k) value, null, true, 1)));
        g0.r(v.a(this), null, null, new b(aVar, null), 3);
    }

    public final void V(i iVar) {
        y30.b fVar;
        Object value;
        Object value2;
        Object value3;
        iVar.getClass();
        boolean equals = iVar.equals(i.d.f13800a);
        h hVar = this.f13818j;
        f2 f2Var = this.f13824p;
        b42.c cVar = this.f13822n;
        if (equals) {
            if (!((k) this.f13825q.d.getValue()).f13834b) {
                af1.g.a(cVar, v.a(this), a.C2692a.f89103a);
                return;
            }
            do {
                value3 = f2Var.getValue();
            } while (!f2Var.f(value3, k.a((k) value3, hVar.f13795a, false, 2)));
        } else if (iVar.equals(i.e.f13801a)) {
            do {
                value2 = f2Var.getValue();
            } while (!f2Var.f(value2, k.a((k) value2, hVar.f13795a, false, 2)));
        } else if (iVar.equals(i.m.f13809a)) {
            do {
                value = f2Var.getValue();
            } while (!f2Var.f(value, k.a((k) value, hVar.f13796b, false, 2)));
        } else if (iVar.equals(i.f.f13802a)) {
            af1.g.a(cVar, v.a(this), a.c.f89105a);
        } else if (iVar.equals(i.j.f13806a)) {
            af1.g.a(cVar, v.a(this), new a.d(new b.f(false, 1, (DefaultConstructorMarker) null), false));
        } else if (iVar.equals(i.k.f13807a)) {
            af1.g.a(cVar, v.a(this), new a.d(b.a.INSTANCE, false));
        } else if (iVar.equals(i.h.f13804a)) {
            af1.g.a(cVar, v.a(this), a.c.f89105a);
        } else if (iVar.equals(i.g.f13803a)) {
            T();
        } else {
            boolean equals2 = iVar.equals(i.C0443i.f13805a);
            MachineDescriptor machineDescriptor = this.f13826r;
            h40.d dVar = this.e;
            if (equals2) {
                h40.c h13 = dVar.h();
                if (h13 == null) {
                    h13 = new h40.c();
                }
                machineDescriptor.getClass();
                h13.d(!s.c(MachineType.MACHINE_873.getTypeName()).contains(machineDescriptor.getMachineType()));
                if (h13.b() == null) {
                    h13.f(dVar.f().a().getProductName());
                }
                dVar.g(h13);
                U(new b0(this, 1));
                return;
            }
            boolean equals3 = iVar.equals(i.o.f13811a);
            hj.e eVar = this.f13815g;
            if (equals3) {
                ij.f a13 = new mj.f(f.c.OWNERSHIP_RETRY, f.a.BUTTON_CLICK, f.b.CONNECTION_JOURNEY).a();
                e.a aVar = hj.e.f38312g;
                eVar.g(a13, null);
                U(new os0.b(16));
            } else if (iVar.equals(i.q.f13813a)) {
                ij.f a14 = new mj.f(f.c.OWNERSHIP_BYPASS, f.a.BUTTON_CLICK, f.b.CONNECTION_JOURNEY).a();
                e.a aVar2 = hj.e.f38312g;
                eVar.g(a14, null);
                af1.g.a(cVar, v.a(this), a.c.f89105a);
            } else if (iVar.equals(i.l.f13808a)) {
                T();
            } else if (iVar.equals(i.n.f13810a)) {
                dVar.j();
                T();
                s9.a a15 = v.a(this);
                machineDescriptor.getClass();
                if (u50.j.j(machineDescriptor)) {
                    w00.j jVar = this.f13820l;
                    if (((Boolean) jVar.f85132a.getValue(jVar, w00.j.d[0])).booleanValue()) {
                        c40.g gVar = this.f13814f;
                        LocalDate localDate = gVar.f10174b;
                        localDate.getClass();
                        gVar.a(localDate.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli());
                        fVar = b.a.INSTANCE;
                        af1.g.a(cVar, a15, new a.d(fVar, false, 2, null));
                    }
                }
                machineDescriptor.getClass();
                fVar = u50.j.e(machineDescriptor) ? new b.f(false) : b.d.INSTANCE;
                af1.g.a(cVar, a15, new a.d(fVar, false, 2, null));
            } else if (!(iVar instanceof i.p)) {
                if (iVar instanceof i.c) {
                    ij.f a16 = new mj.c(((i.c) iVar).f13799a).a();
                    e.a aVar3 = hj.e.f38312g;
                    eVar.g(a16, null);
                } else if (iVar instanceof i.a) {
                    ij.f a17 = new mj.a(((i.a) iVar).f13797a, (a.EnumC1668a) null, (String) null, 6, (DefaultConstructorMarker) null).a();
                    e.a aVar4 = hj.e.f38312g;
                    eVar.g(a17, null);
                } else if (!(iVar instanceof i.b)) {
                    ma.e.o();
                } else {
                    ij.f a18 = new mj.b(((i.b) iVar).f13798a).a();
                    e.a aVar5 = hj.e.f38312g;
                    eVar.g(a18, null);
                }
            } else {
                y30.b bVar = ((i.p) iVar).f13812a;
                if (bVar.equals(b.e.INSTANCE)) {
                    int i13 = j3.f57541a;
                    ij.b bVar2 = new ij.b("connection_journey.ownership.ownership_question", null, 2, null);
                    e.a aVar6 = hj.e.f38312g;
                    eVar.h(bVar2, null);
                } else if (bVar.equals(b.d.INSTANCE)) {
                    int i14 = f3.f57475a;
                    ij.b bVar3 = new ij.b("connection_journey.ownership.machine_name", null, 2, null);
                    e.a aVar7 = hj.e.f38312g;
                    eVar.h(bVar3, null);
                } else if (bVar instanceof b.f) {
                    int i15 = g3.f57492a;
                    ij.b bVar4 = new ij.b("connection_journey.ownership.machine_purchase_date", null, 2, null);
                    e.a aVar8 = hj.e.f38312g;
                    eVar.h(bVar4, null);
                } else if (bVar.equals(b.a.INSTANCE)) {
                    int i16 = e3.f57460a;
                    ij.b bVar5 = new ij.b("connection_journey.ownership.machine_auto_update", null, 2, null);
                    e.a aVar9 = hj.e.f38312g;
                    eVar.h(bVar5, null);
                } else if (bVar.equals(b.c.INSTANCE)) {
                    int i17 = a3.f57396a;
                    ij.b bVar6 = new ij.b("connection_journey.ownership.failure", null, 2, null);
                    e.a aVar10 = hj.e.f38312g;
                    eVar.h(bVar6, null);
                }
            }
        }
    }
}
