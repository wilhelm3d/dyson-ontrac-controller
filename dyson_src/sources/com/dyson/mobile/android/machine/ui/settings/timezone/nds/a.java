package com.dyson.mobile.android.machine.ui.settings.timezone.nds;

import c42.a1;
import c42.a2;
import c42.f2;
import c42.g2;
import c42.j;
import c42.l1;
import c42.r1;
import c42.u1;
import c42.w1;
import com.brightcove.player.event.AbstractEvent;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import i12.e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.i;
import nl0.h;
import se1.k0;
import uf0.o;
import v32.y;
import vm0.l;
import w12.p;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/a;", "Lm9/u;", "", "serialNumber", "Lfg0/b;", "machineApiRepository", "Luf0/o;", "machineTimeZoneProvider", "Lse1/k0;", "timeZoneUtils", "Lhj/e;", "trackingManager", "<init>", "(Ljava/lang/String;Lfg0/b;Luf0/o;Lse1/k0;Lhj/e;)V", "c", "b", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {
    public final String d;
    public final fg0.b e;

    /* renamed from: f  reason: collision with root package name */
    public final o f15530f;

    /* renamed from: g  reason: collision with root package name */
    public final k0 f15531g;

    /* renamed from: h  reason: collision with root package name */
    public final hj.e f15532h;

    /* renamed from: i  reason: collision with root package name */
    public final f2 f15533i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f15534j;

    /* renamed from: k  reason: collision with root package name */
    public final f2 f15535k;

    /* renamed from: l  reason: collision with root package name */
    public final r1 f15536l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f15537m;

    /* renamed from: n  reason: collision with root package name */
    public final f2 f15538n;

    /* renamed from: o  reason: collision with root package name */
    public final f2 f15539o;

    /* renamed from: p  reason: collision with root package name */
    public final u1 f15540p;

    /* renamed from: q  reason: collision with root package name */
    public final u1 f15541q;

    /* renamed from: r  reason: collision with root package name */
    public final r1 f15542r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneViewModel$1", f = "ChangeTimeZoneViewModel.kt", l = {123, 124}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0535a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public f2 d;
        public int e;

        public C0535a(l12.d<? super C0535a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0535a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0535a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
            if (r11 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
            if (h12.f0.f36844a == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
            return r0;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                m12.a r0 = m12.a.COROUTINE_SUSPENDED
                int r1 = r10.e
                r2 = 0
                com.dyson.mobile.android.machine.ui.settings.timezone.nds.a r3 = com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.this
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L20
                if (r1 == r5) goto L1a
                if (r1 != r4) goto L14
                h12.r.b(r11)
                goto L98
            L14:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r10)
                return r2
            L1a:
                c42.f2 r1 = r10.d
                h12.r.b(r11)
                goto L30
            L20:
                h12.r.b(r11)
                c42.f2 r1 = r3.f15535k
                r10.d = r1
                r10.e = r5
                java.lang.Object r11 = com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.S(r3, r10)
                if (r11 != r0) goto L30
                goto L97
            L30:
                r1.setValue(r11)
                r10.d = r2
                r10.e = r4
                se1.k0 r10 = r3.f15531g
                uf0.o r11 = r3.f15530f
                h12.t r11 = r11.f81982b
                java.lang.Object r11 = r11.getValue()
                java.util.List r11 = (java.util.List) r11
                java.util.ArrayList r1 = new java.util.ArrayList
                r4 = 10
                int r4 = i12.u.o(r11, r4)
                r1.<init>(r4)
                java.util.Iterator r11 = r11.iterator()
            L52:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto L89
                java.lang.Object r4 = r11.next()
                java.util.TimeZone r4 = (java.util.TimeZone) r4
                vm0.l r5 = new vm0.l
                java.lang.String r6 = r4.getID()
                r6.getClass()
                se1.k0$b r7 = se1.k0.b.SHORT
                r10.getClass()
                java.lang.String r7 = se1.k0.a(r4, r7)
                java.lang.String r8 = se1.k0.b(r4)
                c42.f2 r9 = r3.f15535k
                java.lang.Object r9 = r9.getValue()
                java.lang.String r4 = r4.getID()
                boolean r4 = x12.r.c(r9, r4)
                r5.<init>(r6, r7, r8, r4)
                r1.add(r5)
                goto L52
            L89:
                c42.f2 r10 = r3.f15533i
                nl0.h$c r11 = new nl0.h$c
                r11.<init>(r1)
                r10.l(r2, r11)
                h12.f0 r10 = h12.f0.f36844a
                if (r10 != r0) goto L98
            L97:
                return r0
            L98:
                h12.f0 r10 = h12.f0.f36844a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.C0535a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @wy1.a
    /* loaded from: classes3.dex */
    public interface c {
        a a(String str);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lvm0/l;", AbstractEvent.LIST, "", "query", "<anonymous>", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneViewModel$filteredTimeZones$1", f = "ChangeTimeZoneViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class d extends i implements Function3<List<? extends l>, String, l12.d<? super List<? extends l>>, Object> {
        public /* synthetic */ List d;
        public /* synthetic */ String e;

        public d(l12.d<? super d> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(List<? extends l> list, String str, l12.d<? super List<? extends l>> dVar) {
            d dVar2 = new d(dVar);
            dVar2.d = list;
            dVar2.e = str;
            return dVar2.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            List list = this.d;
            String str = this.e;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (str.length() == 0) {
                return list;
            }
            String f13 = new v32.l("[\\s_-]").f(str, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (y.r(new v32.l("[\\s_-]").f(((l) obj2).f84647b, ""), f13, true)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneViewModel$saveTimeZone$1$1", f = "ChangeTimeZoneViewModel.kt", l = {165, 173}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public Object d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f15544f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a f15545g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar, a aVar, l12.d<? super e> dVar) {
            super(2, dVar);
            this.f15544f = lVar;
            this.f15545g = aVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(this.f15544f, this.f15545g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
            if (r13 == r1) goto L29;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r0 = r13.e
                vm0.l r2 = r13.f15544f
                r3 = 1
                com.dyson.mobile.android.machine.ui.settings.timezone.nds.a r4 = r13.f15545g
                r5 = 2
                r6 = 0
                if (r0 == 0) goto L27
                if (r0 == r3) goto L1c
                if (r0 != r5) goto L16
                h12.r.b(r14)
                goto Lc1
            L16:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r13)
                return r6
            L1c:
                java.lang.Object r0 = r13.d
                l12.d r0 = (l12.d) r0
                h12.r.b(r14)     // Catch: java.lang.Throwable -> L24
                goto L54
            L24:
                r0 = move-exception
                r14 = r0
                goto L59
            L27:
                h12.r.b(r14)
                java.lang.String r14 = r2.f84646a
                java.util.TimeZone r14 = java.util.TimeZone.getTimeZone(r14)
                int r0 = h12.q.e     // Catch: java.lang.Throwable -> L24
                fg0.b r0 = r4.e     // Catch: java.lang.Throwable -> L24
                java.lang.String r7 = r4.d     // Catch: java.lang.Throwable -> L24
                java.lang.String r14 = r14.getID()     // Catch: java.lang.Throwable -> L24
                r14.getClass()     // Catch: java.lang.Throwable -> L24
                r13.d = r6     // Catch: java.lang.Throwable -> L24
                r13.e = r3     // Catch: java.lang.Throwable -> L24
                gg0.b r0 = r0.f31533a     // Catch: java.lang.Throwable -> L24
                gg0.e r3 = new gg0.e     // Catch: java.lang.Throwable -> L24
                r3.<init>(r14)     // Catch: java.lang.Throwable -> L24
                java.lang.Object r14 = r0.b(r7, r3, r13)     // Catch: java.lang.Throwable -> L24
                if (r14 != r1) goto L4f
                goto L51
            L4f:
                h12.f0 r14 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L24
            L51:
                if (r14 != r1) goto L54
                goto Lc0
            L54:
                h12.f0 r14 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L24
                int r0 = h12.q.e     // Catch: java.lang.Throwable -> L24
                goto L61
            L59:
                int r0 = h12.q.e
                h12.q$b r0 = new h12.q$b
                r0.<init>(r14)
                r14 = r0
            L61:
                java.lang.Throwable r0 = h12.q.b(r14)
                if (r0 == 0) goto L6d
                boolean r3 = r0 instanceof java.util.concurrent.CancellationException
                if (r3 != 0) goto L6c
                goto L6d
            L6c:
                throw r0
            L6d:
                java.lang.Throwable r0 = h12.q.b(r14)
                if (r0 == 0) goto L84
                c42.f2 r3 = r4.f15537m
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r3.l(r6, r7)
                c42.f2 r3 = r4.f15534j
                nl0.h$a r7 = new nl0.h$a
                r7.<init>(r0)
                r3.l(r6, r7)
            L84:
                boolean r0 = r14 instanceof h12.q.b
                if (r0 != 0) goto Lc1
                r0 = r14
                h12.f0 r0 = (h12.f0) r0
                r13.d = r14
                r13.e = r5
                hj.e r14 = r4.f15532h
                mj.u r7 = new mj.u
                mj.u$a r8 = mj.u.a.TIME_ZONE
                java.lang.String r10 = r2.f84646a
                r11 = 2
                r12 = 0
                r9 = 0
                r7.<init>(r8, r9, r10, r11, r12)
                ij.f r0 = r7.a()
                hj.e$a r3 = hj.e.f38312g
                r14.g(r0, r6)
                c42.f2 r14 = r4.f15535k
                java.lang.String r0 = r2.f84646a
                r14.l(r6, r0)
                c42.u1 r14 = r4.f15540p
                vm0.e r0 = vm0.e.a(r0)
                java.lang.Object r13 = r14.emit(r0, r13)
                m12.a r14 = m12.a.COROUTINE_SUSPENDED
                if (r13 != r14) goto Lbc
                goto Lbe
            Lbc:
                h12.f0 r13 = h12.f0.f36844a
            Lbe:
                if (r13 != r1) goto Lc1
            Lc0:
                return r1
            Lc1:
                h12.f0 r13 = h12.f0.f36844a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements c42.i<String> {
        public final /* synthetic */ c42.i d;
        public final /* synthetic */ a e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0536a<T> implements j {
            public final /* synthetic */ j d;
            public final /* synthetic */ a e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneViewModel$special$$inlined$mapNotNull$1$2", f = "ChangeTimeZoneViewModel.kt", l = {BR.isDustMapLayerVisible}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0537a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0537a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0536a.this.emit(null, this);
                }
            }

            public C0536a(j jVar, a aVar) {
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
                    boolean r0 = r6 instanceof com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.f.C0536a.C0537a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.machine.ui.settings.timezone.nds.a$f$a$a r0 = (com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.f.C0536a.C0537a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.machine.ui.settings.timezone.nds.a$f$a$a r0 = new com.dyson.mobile.android.machine.ui.settings.timezone.nds.a$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L50
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    com.dyson.mobile.android.machine.ui.settings.timezone.nds.a r6 = r4.e
                    se1.k0 r6 = r6.f15531g
                    java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r5)
                    r5.getClass()
                    r6.getClass()
                    java.lang.String r5 = se1.k0.c(r5)
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L50
                    return r1
                L50:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.f.C0536a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public f(c42.i iVar, a aVar) {
            this.d = iVar;
            this.e = aVar;
        }

        @Override // c42.i
        public final Object collect(j<? super String> jVar, l12.d dVar) {
            Object collect = this.d.collect(new C0536a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnl0/h;", "", "Lvm0/l;", "available", "selected", "<anonymous>", "(Lnl0/h;Lvm0/l;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneViewModel$timeZonesWithSelection$1", f = "ChangeTimeZoneViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class g extends i implements Function3<nl0.h<? extends List<? extends l>>, l, l12.d<? super List<? extends l>>, Object> {
        public /* synthetic */ nl0.h d;
        public /* synthetic */ l e;

        public g(l12.d<? super g> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(nl0.h<? extends List<? extends l>> hVar, l lVar, l12.d<? super List<? extends l>> dVar) {
            g gVar = new g(dVar);
            gVar.d = hVar;
            gVar.e = lVar;
            return gVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            nl0.h hVar = this.d;
            l lVar = this.e;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (hVar instanceof h.c) {
                String str = lVar != null ? lVar.f84646a : (String) a.this.f15535k.getValue();
                Iterable<l> iterable = (Iterable) ((h.c) hVar).f57898a;
                ArrayList arrayList = new ArrayList(i12.u.o(iterable, 10));
                for (l lVar2 : iterable) {
                    arrayList.add(new l(lVar2.f84646a, lVar2.f84647b, lVar2.f84648c, lVar2.f84646a.equals(str)));
                }
                return arrayList;
            }
            return e0.d;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lnl0/h;", "", "Lvm0/l;", "availableState", "filteredList", "", "isSaving", "Lnl0/h$a;", "errorState", "Lvm0/h;", "<anonymous>", "(Lnl0/h;Ljava/util/List;ZLnl0/h$a;)Lnl0/h;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneViewModel$viewState$1", f = "ChangeTimeZoneViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class h extends i implements p<nl0.h<? extends List<? extends l>>, List<? extends l>, Boolean, h.a, l12.d<? super nl0.h<? extends vm0.h>>, Object> {
        public /* synthetic */ nl0.h d;
        public /* synthetic */ List e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ boolean f15548f;

        /* renamed from: g  reason: collision with root package name */
        public /* synthetic */ h.a f15549g;

        public h(l12.d<? super h> dVar) {
            super(5, dVar);
        }

        @Override // w12.p
        public final Object invoke(nl0.h<? extends List<? extends l>> hVar, List<? extends l> list, Boolean bool, h.a aVar, l12.d<? super nl0.h<? extends vm0.h>> dVar) {
            boolean booleanValue = bool.booleanValue();
            h hVar2 = new h(dVar);
            hVar2.d = hVar;
            hVar2.e = list;
            hVar2.f15548f = booleanValue;
            hVar2.f15549g = aVar;
            return hVar2.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            nl0.h hVar = this.d;
            List list = this.e;
            boolean z13 = this.f15548f;
            h.a aVar = this.f15549g;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (aVar != null) {
                return new h.a(aVar.f57896a);
            }
            if (hVar instanceof h.a) {
                return new h.a(((h.a) hVar).f57896a);
            }
            if ((hVar instanceof h.b) || x12.r.c(hVar, h.d.f57899a)) {
                return h.b.f57897a;
            }
            if (!(hVar instanceof h.c)) {
                ma.e.o();
                return null;
            }
            a aVar3 = a.this;
            String str = (String) aVar3.f15535k.getValue();
            l lVar = (l) aVar3.f15538n.getValue();
            String str2 = lVar != null ? lVar.f84646a : null;
            return new h.c(new vm0.h(list, z13 ? vm0.a.LOADING : (str2 == null || str2.equals(str)) ? vm0.a.DISABLED : vm0.a.ENABLED));
        }
    }

    static {
        new b(null);
    }

    public a(String str, fg0.b bVar, o oVar, k0 k0Var, hj.e eVar) {
        str.getClass();
        bVar.getClass();
        oVar.getClass();
        k0Var.getClass();
        eVar.getClass();
        this.d = str;
        this.e = bVar;
        this.f15530f = oVar;
        this.f15531g = k0Var;
        this.f15532h = eVar;
        h.b bVar2 = h.b.f57897a;
        f2 a13 = g2.a(bVar2);
        this.f15533i = a13;
        f2 a14 = g2.a(null);
        this.f15534j = a14;
        f2 a15 = g2.a(null);
        this.f15535k = a15;
        f fVar = new f(new a1(a15), this);
        s9.a a16 = v.a(this);
        a2.a aVar = a2.f10222a;
        this.f15536l = c42.r.D(fVar, a16, a2.a.a(aVar, 0L, 3), "- -");
        f2 a17 = g2.a(Boolean.FALSE);
        this.f15537m = a17;
        f2 a18 = g2.a(null);
        this.f15538n = a18;
        f2 a19 = g2.a("");
        this.f15539o = a19;
        u1 b13 = w1.b(0, 0, null, 7);
        this.f15540p = b13;
        this.f15541q = b13;
        this.f15542r = c42.r.D(c42.r.k(a13, new l1(new l1(a13, a18, new g(null)), a19, new d(null)), a17, a14, new h(null)), v.a(this), a2.a.a(aVar, 0L, 3), bVar2);
        g0.r(v.a(this), null, null, new C0535a(null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(7:5|6|7|(1:(1:10)(2:34|35))(3:36|37|(1:39))|11|12|(4:18|(1:20)|21|(3:23|(1:31)|(2:28|29)(1:30))(1:32))(1:16)))|42|6|7|(0)(0)|11|12|(1:14)|18|(0)|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        r0 = h12.q.e;
        r6 = new h12.q.b(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.machine.ui.settings.timezone.nds.a r5, n12.c r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof vm0.f
            if (r0 == 0) goto L16
            r0 = r6
            vm0.f r0 = (vm0.f) r0
            int r1 = r0.f84634f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f84634f = r1
            goto L1b
        L16:
            vm0.f r0 = new vm0.f
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f84634f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2d
            h12.r.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L45
        L2b:
            r6 = move-exception
            goto L48
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            return r4
        L33:
            h12.r.b(r6)
            int r6 = h12.q.e     // Catch: java.lang.Throwable -> L2b
            fg0.b r6 = r5.e     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r5.d     // Catch: java.lang.Throwable -> L2b
            r0.f84634f = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L45
            return r1
        L45:
            int r0 = h12.q.e     // Catch: java.lang.Throwable -> L2b
            goto L50
        L48:
            int r0 = h12.q.e
            h12.q$b r0 = new h12.q$b
            r0.<init>(r6)
            r6 = r0
        L50:
            java.lang.Throwable r0 = h12.q.b(r6)
            if (r0 == 0) goto L5c
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            throw r0
        L5c:
            boolean r0 = r6 instanceof h12.q.b
            if (r0 == 0) goto L61
            r6 = r4
        L61:
            fg0.c r6 = (fg0.c) r6
            uf0.o r5 = r5.f15530f
            h12.t r5 = r5.f81983c
            java.lang.Object r5 = r5.getValue()
            java.util.Set r5 = (java.util.Set) r5
            if (r6 == 0) goto L83
            java.lang.String r0 = r6.f31536a
            int r1 = r0.length()
            if (r1 <= 0) goto L7e
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L7e
            goto L7f
        L7e:
            r6 = r4
        L7f:
            if (r6 == 0) goto L83
            java.lang.String r4 = r6.f31536a
        L83:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.S(com.dyson.mobile.android.machine.ui.settings.timezone.nds.a, n12.c):java.lang.Object");
    }

    public final void T() {
        l lVar = (l) this.f15538n.getValue();
        if (lVar != null) {
            this.f15537m.l(null, Boolean.TRUE);
            g0.r(v.a(this), null, null, new e(lVar, this, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/a$b;", "", "<init>", "()V", "", "DEFAULT_TIME_ZONE_VALUE", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
