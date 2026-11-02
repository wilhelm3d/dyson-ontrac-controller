package com.dyson.mobile.android.machine.ui.settings.name;

import c42.f2;
import c42.q1;
import c42.r1;
import c42.u1;
import com.dyson.mobile.android.machine.ui.name.CustomNameActivity;
import com.dyson.mobile.android.machine.ui.name.CustomNameType;
import com.dyson.mobile.android.machine.ui.settings.name.g;
import com.dyson.mobile.android.machinetype.MachineCategory;
import h12.f0;
import hj.e;
import i12.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import mj.c;
import mj.f;
import org.bouncycastle.asn1.BERTags;
import v32.y;
import vl0.r;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB3\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/c;", "Lvl0/g;", "Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$ActivityInput;", "activityInput", "Lpm0/h;", "validator", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Lvl0/r;", "saveMachineNameUseCase", "<init>", "(Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$ActivityInput;Lpm0/h;Lhj/e;Lpf0/c;Lvl0/r;)V", "b", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends vl0.g {

    /* renamed from: y  reason: collision with root package name */
    public static final Set<String> f15439y;

    /* renamed from: i  reason: collision with root package name */
    public final hj.e f15440i;

    /* renamed from: j  reason: collision with root package name */
    public final r f15441j;

    /* renamed from: k  reason: collision with root package name */
    public final u1 f15442k;

    /* renamed from: l  reason: collision with root package name */
    public final q1 f15443l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f15444m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f15445n;

    /* renamed from: o  reason: collision with root package name */
    public final f2 f15446o;

    /* renamed from: p  reason: collision with root package name */
    public final r1 f15447p;

    /* renamed from: q  reason: collision with root package name */
    public final f2 f15448q;

    /* renamed from: r  reason: collision with root package name */
    public final r1 f15449r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f15450s;

    /* renamed from: t  reason: collision with root package name */
    public final String f15451t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f15452u;

    /* renamed from: v  reason: collision with root package name */
    public final String f15453v;

    /* renamed from: w  reason: collision with root package name */
    public final CustomNameType f15454w;

    /* renamed from: x  reason: collision with root package name */
    public final vl0.c f15455x;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        c a(CustomNameActivity.ActivityInput activityInput);
    }

    /* renamed from: com.dyson.mobile.android.machine.ui.settings.name.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C0531c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15456a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15457b;

        static {
            int[] iArr = new int[CustomNameType.values().length];
            try {
                iArr[CustomNameType.ROBOT_MAP_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomNameType.ROBOT_ROOM_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomNameType.MACHINE_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomNameType.EC_ROOM_NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15456a = iArr;
            int[] iArr2 = new int[MachineCategory.values().length];
            try {
                iArr2[MachineCategory.EC.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f15457b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.name.MachineCustomNameNdsViewModel$onBackPressed$1", f = "MachineCustomNameNdsViewModel.kt", l = {BERTags.PRIVATE}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                u1 u1Var = c.this.f15442k;
                g.a aVar2 = g.a.f15460a;
                this.d = 1;
                if (u1Var.emit(aVar2, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.name.MachineCustomNameNdsViewModel$onDoneClicked$1", f = "MachineCustomNameNdsViewModel.kt", l = {143, 148, 160}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class e extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f15458f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, l12.d<? super e> dVar) {
            super(2, dVar);
            this.f15458f = str;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(this.f15458f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r2.emit(r4, r17) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
            if (r2.emit(r6, r17) != r1) goto L8;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r2 = r0.d
                java.lang.String r3 = r0.f15458f
                r4 = 3
                r5 = 0
                r6 = 1
                r7 = 2
                r8 = 0
                com.dyson.mobile.android.machine.ui.settings.name.c r9 = com.dyson.mobile.android.machine.ui.settings.name.c.this
                if (r2 == 0) goto L2a
                if (r2 == r6) goto L26
                if (r2 == r7) goto L22
                if (r2 != r4) goto L1c
                h12.r.b(r18)     // Catch: java.lang.Throwable -> L94
                goto L90
            L1c:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r0)
                return r8
            L22:
                h12.r.b(r18)     // Catch: java.lang.Throwable -> L94
                goto L67
            L26:
                h12.r.b(r18)
                goto L41
            L2a:
                h12.r.b(r18)
                boolean r2 = r9.f15450s
                if (r2 != 0) goto L44
                c42.u1 r2 = r9.f15442k
                com.dyson.mobile.android.machine.ui.settings.name.g$b r4 = new com.dyson.mobile.android.machine.ui.settings.name.g$b
                r4.<init>(r3)
                r0.d = r6
                java.lang.Object r0 = r2.emit(r4, r0)
                if (r0 != r1) goto L41
                goto L8f
            L41:
                h12.f0 r0 = h12.f0.f36844a
                return r0
            L44:
                r9.S(r6)
                vl0.r r11 = r9.f15441j     // Catch: java.lang.Throwable -> L94
                java.lang.String r13 = r0.f15458f     // Catch: java.lang.Throwable -> L94
                java.lang.String r12 = r9.f15451t     // Catch: java.lang.Throwable -> L94
                boolean r14 = r9.f15452u     // Catch: java.lang.Throwable -> L94
                java.lang.String r15 = r9.f15453v     // Catch: java.lang.Throwable -> L94
                r0.d = r7     // Catch: java.lang.Throwable -> L94
                af1.i r2 = r11.f84610c     // Catch: java.lang.Throwable -> L94
                h42.b r2 = r2.c()     // Catch: java.lang.Throwable -> L94
                vl0.q r10 = new vl0.q     // Catch: java.lang.Throwable -> L94
                r16 = 0
                r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L94
                java.lang.Object r2 = z32.g0.v(r2, r10, r0)     // Catch: java.lang.Throwable -> L94
                if (r2 != r1) goto L67
                goto L8f
            L67:
                c42.f2 r2 = r9.f15446o     // Catch: java.lang.Throwable -> L94
                java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L94
                r2.l(r8, r6)     // Catch: java.lang.Throwable -> L94
                hj.e r2 = r9.f15440i     // Catch: java.lang.Throwable -> L94
                mj.c r6 = new mj.c     // Catch: java.lang.Throwable -> L94
                mj.c$a r10 = mj.c.a.CUSTOM_NAME_UPDATED     // Catch: java.lang.Throwable -> L94
                r6.<init>(r10)     // Catch: java.lang.Throwable -> L94
                ij.f r6 = r6.a()     // Catch: java.lang.Throwable -> L94
                hj.e$a r10 = hj.e.f38312g     // Catch: java.lang.Throwable -> L94
                r2.g(r6, r8)     // Catch: java.lang.Throwable -> L94
                c42.u1 r2 = r9.f15442k     // Catch: java.lang.Throwable -> L94
                com.dyson.mobile.android.machine.ui.settings.name.g$b r6 = new com.dyson.mobile.android.machine.ui.settings.name.g$b     // Catch: java.lang.Throwable -> L94
                r6.<init>(r3)     // Catch: java.lang.Throwable -> L94
                r0.d = r4     // Catch: java.lang.Throwable -> L94
                java.lang.Object r0 = r2.emit(r6, r0)     // Catch: java.lang.Throwable -> L94
                if (r0 != r1) goto L90
            L8f:
                return r1
            L90:
                r9.S(r5)
                goto Lac
            L94:
                hj.e r0 = r9.f15440i     // Catch: java.lang.Throwable -> Laf
                int r1 = nj.a0.f57393a     // Catch: java.lang.Throwable -> Laf
                ij.b r1 = new ij.b     // Catch: java.lang.Throwable -> Laf
                java.lang.String r2 = "common.settings.custom_name_error"
                r1.<init>(r2, r8, r7, r8)     // Catch: java.lang.Throwable -> Laf
                hj.e$a r2 = hj.e.f38312g     // Catch: java.lang.Throwable -> Laf
                r0.h(r1, r8)     // Catch: java.lang.Throwable -> Laf
                c42.f2 r0 = r9.f15446o     // Catch: java.lang.Throwable -> Laf
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Laf
                r0.l(r8, r1)     // Catch: java.lang.Throwable -> Laf
                goto L90
            Lac:
                h12.f0 r0 = h12.f0.f36844a
                return r0
            Laf:
                r0 = move-exception
                r9.S(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.name.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
        f15439y = q.e0(new String[]{"571", "930", "938", "986"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.dyson.mobile.android.machine.ui.name.CustomNameActivity.ActivityInput r9, pm0.h r10, hj.e r11, pf0.c r12, vl0.r r13) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.name.c.<init>(com.dyson.mobile.android.machine.ui.name.CustomNameActivity$ActivityInput, pm0.h, hj.e, pf0.c, vl0.r):void");
    }

    public final int T() {
        int i13 = C0531c.f15456a[this.f15454w.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return 20;
        }
        if (i13 == 3 || i13 == 4) {
            return 42;
        }
        ma.e.o();
        return 0;
    }

    public final void U() {
        if (x12.r.c(y.U(this.f84568f).toString(), y.U(this.f15453v).toString())) {
            this.f15448q.l(null, Boolean.TRUE);
            g0.r(v.a(this), null, null, new d(null), 3);
            return;
        }
        ij.f a13 = new mj.c(c.a.CUSTOM_NAME_DISCARD).a();
        e.a aVar = hj.e.f38312g;
        this.f15440i.g(a13, null);
        this.f15444m.l(null, Boolean.TRUE);
    }

    public final void V() {
        ij.f a13 = new mj.f(f.c.CUSTOM_NAME_DONE, f.a.BUTTON_CLICK, f.b.SETTINGS_CUSTOM_NAME).a();
        e.a aVar = hj.e.f38312g;
        this.f15440i.g(a13, null);
        g0.r(v.a(this), null, null, new e(y.U(this.f84568f).toString(), null), 3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/c$a;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
