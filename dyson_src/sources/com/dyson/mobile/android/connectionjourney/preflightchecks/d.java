package com.dyson.mobile.android.connectionjourney.preflightchecks;

import af1.g;
import af1.i;
import b42.m;
import c42.f2;
import c42.g2;
import c42.r1;
import com.dyson.mobile.android.connectionjourney.preflightchecks.a;
import com.dyson.mobile.android.connectionjourney.preflightchecks.b;
import com.dyson.mobile.android.connectionjourney.preflightchecks.c;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import p40.j;
import p40.k;
import p40.s;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/d;", "Lm9/u;", "Lp40/j;", "preflightChecksProvider", "Laf1/i;", "dispatcherProvider", "Lb10/c;", "alertViewStateFactory", "Lc10/a;", "analyticsTracker", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "<init>", "(Lp40/j;Laf1/i;Lb10/c;Lc10/a;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Lcom/dyson/mobile/android/machinetype/MachineSerial;)V", "c", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends u {
    public final j d;
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final b10.c f13879f;

    /* renamed from: g  reason: collision with root package name */
    public final c10.a f13880g;

    /* renamed from: h  reason: collision with root package name */
    public final MachineDescriptor f13881h;

    /* renamed from: i  reason: collision with root package name */
    public final MachineSerial f13882i;

    /* renamed from: j  reason: collision with root package name */
    public final b42.c f13883j;

    /* renamed from: k  reason: collision with root package name */
    public final c42.e f13884k;

    /* renamed from: l  reason: collision with root package name */
    public final f2 f13885l;

    /* renamed from: m  reason: collision with root package name */
    public final r1 f13886m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.preflightchecks.PreflightChecksViewModel$1", f = "PreflightChecksViewModel.kt", l = {BR.isDecreaseSensitivityVisible}, m = "invokeSuspend", v = 2)
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
                if (d.S(d.this, this) == aVar) {
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

    @wy1.a
    /* loaded from: classes2.dex */
    public interface c {
        d a(MachineDescriptor machineDescriptor, MachineSerial machineSerial);
    }

    /* renamed from: com.dyson.mobile.android.connectionjourney.preflightchecks.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class C0447d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13887a;

        static {
            int[] iArr = new int[b10.b.values().length];
            try {
                iArr[b10.b.CONFIRM_CANCEL_CONNECTION_JOURNEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b10.b.CONFIRM_RETRY_CONNECTION_JOURNEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13887a = iArr;
        }
    }

    static {
        new b(null);
    }

    public d(j jVar, i iVar, b10.c cVar, c10.a aVar, MachineDescriptor machineDescriptor, MachineSerial machineSerial) {
        jVar.getClass();
        iVar.getClass();
        cVar.getClass();
        aVar.getClass();
        machineDescriptor.getClass();
        machineSerial.getClass();
        this.d = jVar;
        this.e = iVar;
        this.f13879f = cVar;
        this.f13880g = aVar;
        this.f13881h = machineDescriptor;
        this.f13882i = machineSerial;
        b42.c b13 = m.b(0, null, null, 7);
        this.f13883j = b13;
        this.f13884k = c42.r.B(b13);
        f2 a13 = g2.a(null);
        this.f13885l = a13;
        this.f13886m = c42.r.d(a13);
        g0.r(v.a(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|29|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if ((r6 instanceof java.util.concurrent.CancellationException) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
        com.dyson.mobile.android.logging.Logger.b("Error making preflight checks", r6);
        r5.V(com.dyson.mobile.android.connectionjourney.preflightchecks.a.c.f13867a);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.connectionjourney.preflightchecks.d r5, n12.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof p40.q
            if (r0 == 0) goto L16
            r0 = r6
            p40.q r0 = (p40.q) r0
            int r1 = r0.f62878f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f62878f = r1
            goto L1b
        L16:
            p40.q r0 = new p40.q
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f62878f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            h12.r.b(r6)     // Catch: java.lang.Exception -> L2b
            goto L4a
        L2b:
            r6 = move-exception
            goto L53
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            return r3
        L33:
            h12.r.b(r6)
            af1.i r6 = r5.e     // Catch: java.lang.Exception -> L2b
            h42.b r6 = r6.c()     // Catch: java.lang.Exception -> L2b
            p40.r r2 = new p40.r     // Catch: java.lang.Exception -> L2b
            r2.<init>(r5, r3)     // Catch: java.lang.Exception -> L2b
            r0.f62878f = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = z32.g0.v(r6, r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r6 != r1) goto L4a
            return r1
        L4a:
            p40.k r6 = (p40.k) r6     // Catch: java.lang.Exception -> L2b
            r6.getClass()     // Catch: java.lang.Exception -> L2b
            r5.U(r6)     // Catch: java.lang.Exception -> L2b
            goto L67
        L53:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L5d
            boolean r0 = r6 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            throw r6
        L5d:
            java.lang.String r0 = "Error making preflight checks"
            com.dyson.mobile.android.logging.Logger.b(r0, r6)
            com.dyson.mobile.android.connectionjourney.preflightchecks.a$c r6 = com.dyson.mobile.android.connectionjourney.preflightchecks.a.c.f13867a
            r5.V(r6)
        L67:
            h12.f0 r5 = h12.f0.f36844a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.preflightchecks.d.S(com.dyson.mobile.android.connectionjourney.preflightchecks.d, n12.c):java.lang.Object");
    }

    public final void T(com.dyson.mobile.android.connectionjourney.preflightchecks.c cVar) {
        Object value;
        Object value2;
        Object value3;
        cVar.getClass();
        boolean equals = cVar.equals(c.b.f13875a);
        b10.c cVar2 = this.f13879f;
        f2 f2Var = this.f13885l;
        c10.a aVar = this.f13880g;
        if (equals) {
            b10.b bVar = b10.b.CONFIRM_RETRY_CONNECTION_JOURNEY;
            aVar.c(bVar);
            do {
                value3 = f2Var.getValue();
                b10.a aVar2 = (b10.a) value3;
            } while (!f2Var.f(value3, cVar2.a(bVar)));
        } else if (cVar.equals(c.C0446c.f13876a)) {
            b10.b bVar2 = b10.b.CONFIRM_CANCEL_CONNECTION_JOURNEY;
            aVar.c(bVar2);
            do {
                value2 = f2Var.getValue();
                b10.a aVar3 = (b10.a) value2;
            } while (!f2Var.f(value2, cVar2.a(bVar2)));
        } else if (!(cVar instanceof c.a)) {
            if (cVar.equals(c.d.f13877a)) {
                V(a.c.f13867a);
            } else if (!cVar.equals(c.e.f13878a)) {
                ma.e.o();
            } else {
                V(new a.d(b.C0445b.INSTANCE));
                g0.r(v.a(this), null, null, new s(this, null), 3);
            }
        } else {
            c.a aVar4 = (c.a) cVar;
            b10.b bVar3 = aVar4.f13873a;
            boolean z13 = aVar4.f13874b;
            if (z13) {
                aVar.a(bVar3);
            } else {
                aVar.b(bVar3);
            }
            do {
                value = f2Var.getValue();
                b10.a aVar5 = (b10.a) value;
            } while (!f2Var.f(value, null));
            int i13 = C0447d.f13887a[bVar3.ordinal()];
            if (i13 == 1) {
                if (z13) {
                    V(a.C0444a.f13865a);
                }
            } else if (i13 == 2 && z13) {
                V(a.b.f13866a);
            }
        }
    }

    public final void U(k kVar) {
        if (kVar.equals(p40.u.f62882a)) {
            V(a.c.f13867a);
        } else if (kVar.equals(p40.e.f62877a)) {
            V(new a.d(b.d.INSTANCE));
        } else if (kVar.equals(p40.d.f62876a)) {
            V(new a.d(b.a.INSTANCE));
        } else if (kVar.equals(p40.v.f62883a)) {
            V(new a.d(b.c.INSTANCE));
        } else {
            ma.e.o();
        }
    }

    public final void V(com.dyson.mobile.android.connectionjourney.preflightchecks.a aVar) {
        g.a(this.f13883j, v.a(this), aVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/d$b;", "", "<init>", "()V", "", "CONNECTION_TIMEOUT_MILLIS", "J", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
