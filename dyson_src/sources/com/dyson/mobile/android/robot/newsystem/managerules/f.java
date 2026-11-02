package com.dyson.mobile.android.robot.newsystem.managerules;

import a11.n;
import a11.o;
import b42.m;
import c42.a2;
import c42.c2;
import c42.f2;
import c42.g2;
import c42.j;
import c42.r;
import c42.r1;
import com.dyson.mobile.android.robot.cloud.newsystem.common.Point;
import com.dyson.mobile.android.robot.cloud.newsystem.common.Restriction;
import com.dyson.mobile.android.robot.newsystem.managerules.RuleNavigationEvent;
import com.dyson.mobile.android.robot.newsystem.managerules.d;
import com.dyson.mobile.android.robot.newsystem.managerules.h;
import com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRulesEntryPoint;
import h12.f0;
import hj.e;
import i12.c0;
import i12.e0;
import i41.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import mj.r;
import nl0.h;
import rf0.w;
import v01.l;
import y01.k;
import z32.g0;
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019Ba\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/f;", "Lm9/u;", "", "mapId", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesEntryPoint;", "entryPoint", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Point;", "stuckFaultLocation", "Lh11/a;", "persistentMapLoader", "Lh41/d;", "updateMapTasks", "Lpf0/c;", "localisationManager", "Lv01/l;", "ruleValidator", "Ls21/d;", "uuidProvider", "Lhj/e;", "trackingManager", "Li41/q;", "ruleConstraints", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesEntryPoint;Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Point;Lh11/a;Lh41/d;Lpf0/c;Lv01/l;Ls21/d;Lhj/e;Li41/q;)V", "b", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends u {
    public static final /* synthetic */ int C = 0;
    public final r1 A;
    public final r1 B;
    public final String d;
    public final ManageRulesEntryPoint e;

    /* renamed from: f  reason: collision with root package name */
    public final Point f16407f;

    /* renamed from: g  reason: collision with root package name */
    public final h11.a f16408g;

    /* renamed from: h  reason: collision with root package name */
    public final h41.d f16409h;

    /* renamed from: i  reason: collision with root package name */
    public final pf0.c f16410i;

    /* renamed from: j  reason: collision with root package name */
    public final l f16411j;

    /* renamed from: k  reason: collision with root package name */
    public final s21.d f16412k;

    /* renamed from: l  reason: collision with root package name */
    public final hj.e f16413l;

    /* renamed from: m  reason: collision with root package name */
    public final b42.c f16414m;

    /* renamed from: n  reason: collision with root package name */
    public final c42.e f16415n;

    /* renamed from: o  reason: collision with root package name */
    public final f2 f16416o;

    /* renamed from: p  reason: collision with root package name */
    public final r1 f16417p;

    /* renamed from: q  reason: collision with root package name */
    public final f2 f16418q;

    /* renamed from: r  reason: collision with root package name */
    public final r1 f16419r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f16420s;

    /* renamed from: t  reason: collision with root package name */
    public final f2 f16421t;

    /* renamed from: u  reason: collision with root package name */
    public final r1 f16422u;

    /* renamed from: v  reason: collision with root package name */
    public k f16423v;

    /* renamed from: w  reason: collision with root package name */
    public o f16424w;

    /* renamed from: x  reason: collision with root package name */
    public final f2 f16425x;

    /* renamed from: y  reason: collision with root package name */
    public final r1 f16426y;

    /* renamed from: z  reason: collision with root package name */
    public k f16427z;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        f a(String str, ManageRulesEntryPoint manageRulesEntryPoint, Point point);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements c42.i<List<? extends y01.a>> {
        public final /* synthetic */ c42.i d;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* loaded from: classes3.dex */
        public static final class a<T> implements j {
            public final /* synthetic */ j d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.robot.newsystem.managerules.RobotManageRulesViewModel$special$$inlined$map$1$2", f = "RobotManageRulesViewModel.kt", l = {219}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.robot.newsystem.managerules.f$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0572a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0572a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(j jVar) {
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
                    boolean r0 = r6 instanceof com.dyson.mobile.android.robot.newsystem.managerules.f.c.a.C0572a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.robot.newsystem.managerules.f$c$a$a r0 = (com.dyson.mobile.android.robot.newsystem.managerules.f.c.a.C0572a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.robot.newsystem.managerules.f$c$a$a r0 = new com.dyson.mobile.android.robot.newsystem.managerules.f$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L5f
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    java.util.List r5 = (java.util.List) r5
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r2 = 10
                    int r2 = i12.u.o(r5, r2)
                    r6.<init>(r2)
                    java.util.Iterator r5 = r5.iterator()
                L42:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L54
                    java.lang.Object r2 = r5.next()
                    a21.a r2 = (a21.a) r2
                    y01.a r2 = r2.f238b
                    r6.add(r2)
                    goto L42
                L54:
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r6, r0)
                    if (r4 != r1) goto L5f
                    return r1
                L5f:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.managerules.f.c.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public c(c42.i iVar) {
            this.d = iVar;
        }

        @Override // c42.i
        public final Object collect(j<? super List<? extends y01.a>> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements c42.i<Boolean> {
        public final /* synthetic */ c42.i d;
        public final /* synthetic */ f e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* loaded from: classes3.dex */
        public static final class a<T> implements j {
            public final /* synthetic */ j d;
            public final /* synthetic */ f e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.robot.newsystem.managerules.RobotManageRulesViewModel$special$$inlined$map$2$2", f = "RobotManageRulesViewModel.kt", l = {219}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.robot.newsystem.managerules.f$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0573a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0573a(l12.d dVar) {
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

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[RETURN] */
            @Override // c42.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, l12.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.dyson.mobile.android.robot.newsystem.managerules.f.d.a.C0573a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.dyson.mobile.android.robot.newsystem.managerules.f$d$a$a r0 = (com.dyson.mobile.android.robot.newsystem.managerules.f.d.a.C0573a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.robot.newsystem.managerules.f$d$a$a r0 = new com.dyson.mobile.android.robot.newsystem.managerules.f$d$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r7)
                    goto L80
                L27:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r5)
                    r5 = 0
                    return r5
                L2e:
                    h12.r.b(r7)
                    java.util.List r6 = (java.util.List) r6
                    int r7 = com.dyson.mobile.android.robot.newsystem.managerules.f.C
                    com.dyson.mobile.android.robot.newsystem.managerules.f r7 = r5.e
                    r7.getClass()
                    int r2 = r6.size()
                    java.util.ArrayList r7 = r7.f16420s
                    int r4 = r7.size()
                    if (r2 != r4) goto L70
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = i12.u.o(r7, r4)
                    r2.<init>(r4)
                    java.util.Iterator r7 = r7.iterator()
                L55:
                    boolean r4 = r7.hasNext()
                    if (r4 == 0) goto L67
                    java.lang.Object r4 = r7.next()
                    a21.a r4 = (a21.a) r4
                    y01.a r4 = r4.f238b
                    r2.add(r4)
                    goto L55
                L67:
                    boolean r6 = r6.equals(r2)
                    if (r6 != 0) goto L6e
                    goto L70
                L6e:
                    r6 = 0
                    goto L71
                L70:
                    r6 = r3
                L71:
                    java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                    r0.e = r3
                    c42.j r5 = r5.d
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L80
                    return r1
                L80:
                    h12.f0 r5 = h12.f0.f36844a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.managerules.f.d.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public d(c42.i iVar, f fVar) {
            this.d = iVar;
            this.e = fVar;
        }

        @Override // c42.i
        public final Object collect(j<? super Boolean> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements c42.i<String> {
        public final /* synthetic */ c42.i d;
        public final /* synthetic */ f e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* loaded from: classes3.dex */
        public static final class a<T> implements j {
            public final /* synthetic */ j d;
            public final /* synthetic */ f e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.robot.newsystem.managerules.RobotManageRulesViewModel$special$$inlined$map$3$2", f = "RobotManageRulesViewModel.kt", l = {219}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.robot.newsystem.managerules.f$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0574a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0574a(l12.d dVar) {
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
            public final java.lang.Object emit(java.lang.Object r7, l12.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.dyson.mobile.android.robot.newsystem.managerules.f.e.a.C0574a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.dyson.mobile.android.robot.newsystem.managerules.f$e$a$a r0 = (com.dyson.mobile.android.robot.newsystem.managerules.f.e.a.C0574a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.robot.newsystem.managerules.f$e$a$a r0 = new com.dyson.mobile.android.robot.newsystem.managerules.f$e$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    r4 = 0
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L28
                    h12.r.b(r8)
                    goto L6d
                L28:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r6)
                    return r4
                L2e:
                    h12.r.b(r8)
                    java.util.List r7 = (java.util.List) r7
                    com.dyson.mobile.android.robot.newsystem.managerules.f r8 = r6.e
                    pf0.c r8 = r8.f16410i
                    java.util.Iterator r7 = r7.iterator()
                L3b:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L4d
                    java.lang.Object r2 = r7.next()
                    r5 = r2
                    a21.a r5 = (a21.a) r5
                    boolean r5 = r5.d
                    if (r5 == 0) goto L3b
                    r4 = r2
                L4d:
                    a21.a r4 = (a21.a) r4
                    if (r4 == 0) goto L5c
                    a21.c r7 = r4.f239c
                    if (r7 == 0) goto L5c
                    com.dyson.mobile.android.localisation.LocalisationKey r7 = r7.getLabel()
                    if (r7 == 0) goto L5c
                    goto L5e
                L5c:
                    com.dyson.mobile.android.localisation.LocalisationKey r7 = rf0.w.G0
                L5e:
                    java.lang.String r7 = r8.d(r7)
                    r0.e = r3
                    c42.j r6 = r6.d
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L6d
                    return r1
                L6d:
                    h12.f0 r6 = h12.f0.f36844a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.managerules.f.e.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public e(c42.i iVar, f fVar) {
            this.d = iVar;
            this.e = fVar;
        }

        @Override // c42.i
        public final Object collect(j<? super String> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    static {
        new a(null);
    }

    public f(String str, ManageRulesEntryPoint manageRulesEntryPoint, Point point, h11.a aVar, h41.d dVar, pf0.c cVar, l lVar, s21.d dVar2, hj.e eVar, q qVar) {
        str.getClass();
        manageRulesEntryPoint.getClass();
        aVar.getClass();
        dVar.getClass();
        cVar.getClass();
        lVar.getClass();
        dVar2.getClass();
        eVar.getClass();
        qVar.getClass();
        this.d = str;
        this.e = manageRulesEntryPoint;
        this.f16407f = point;
        this.f16408g = aVar;
        this.f16409h = dVar;
        this.f16410i = cVar;
        this.f16411j = lVar;
        this.f16412k = dVar2;
        this.f16413l = eVar;
        b42.c b13 = m.b(0, null, null, 7);
        this.f16414m = b13;
        this.f16415n = r.B(b13);
        f2 a13 = g2.a(new com.dyson.mobile.android.robot.newsystem.managerules.b(qVar, null, null, null, 14, null));
        this.f16416o = a13;
        this.f16417p = r.d(a13);
        f2 a14 = g2.a(h.d.f57899a);
        this.f16418q = a14;
        this.f16419r = r.d(a14);
        this.f16420s = new ArrayList();
        f2 a15 = g2.a(e0.d);
        this.f16421t = a15;
        this.f16422u = r.d(a15);
        f2 a16 = g2.a(null);
        this.f16425x = a16;
        this.f16426y = r.d(a16);
        d dVar3 = new d(new c(a15), this);
        s9.a a17 = v.a(this);
        a2.f10222a.getClass();
        c2 c2Var = a2.a.f10225c;
        this.A = r.D(dVar3, a17, c2Var, Boolean.FALSE);
        this.B = r.D(new e(a15, this), v.a(this), c2Var, cVar.d(w.G0));
        V();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:24|25))(7:26|27|(1:28)|30|31|(1:33)(1:36)|(1:35))|11|12|(1:14)|15|(4:(1:17)|19|20|21)(2:20|21)))|39|6|7|(0)(0)|11|12|(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        r1 = h12.q.e;
        r10 = new h12.q.b(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[LOOP:0: B:35:0x0094->B:36:0x00a9, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.robot.newsystem.managerules.f r9, n12.c r10) {
        /*
            c42.f2 r0 = r9.f16416o
            boolean r1 = r10 instanceof v01.j
            if (r1 == 0) goto L15
            r1 = r10
            v01.j r1 = (v01.j) r1
            int r2 = r1.f82937f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f82937f = r2
            goto L1a
        L15:
            v01.j r1 = new v01.j
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.d
            m12.a r2 = m12.a.COROUTINE_SUSPENDED
            int r3 = r1.f82937f
            r4 = 11
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2e
            h12.r.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L6f
        L2c:
            r10 = move-exception
            goto L74
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r9)
            return r6
        L34:
            h12.r.b(r10)
            h41.d r10 = r9.f16409h
            int r3 = h12.q.e     // Catch: java.lang.Throwable -> L2c
        L3b:
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Throwable -> L2c
            r7 = r3
            com.dyson.mobile.android.robot.newsystem.managerules.b r7 = (com.dyson.mobile.android.robot.newsystem.managerules.b) r7     // Catch: java.lang.Throwable -> L2c
            com.dyson.mobile.android.robot.newsystem.managerules.c$c r8 = com.dyson.mobile.android.robot.newsystem.managerules.c.C0570c.f16392a     // Catch: java.lang.Throwable -> L2c
            com.dyson.mobile.android.robot.newsystem.managerules.b r7 = com.dyson.mobile.android.robot.newsystem.managerules.b.a(r7, r6, r8, r6, r4)     // Catch: java.lang.Throwable -> L2c
            boolean r3 = r0.f(r3, r7)     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L3b
            java.lang.String r3 = r9.d     // Catch: java.lang.Throwable -> L2c
            java.util.List r7 = r9.U()     // Catch: java.lang.Throwable -> L2c
            r1.f82937f = r5     // Catch: java.lang.Throwable -> L2c
            af1.i r5 = r10.f37555c     // Catch: java.lang.Throwable -> L2c
            h42.b r5 = r5.c()     // Catch: java.lang.Throwable -> L2c
            h41.l r8 = new h41.l     // Catch: java.lang.Throwable -> L2c
            r8.<init>(r10, r3, r7, r6)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = z32.g0.v(r5, r8, r1)     // Catch: java.lang.Throwable -> L2c
            m12.a r1 = m12.a.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L2c
            if (r10 != r1) goto L6a
            goto L6c
        L6a:
            h12.f0 r10 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L2c
        L6c:
            if (r10 != r2) goto L6f
            return r2
        L6f:
            h12.f0 r10 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L2c
            int r1 = h12.q.e     // Catch: java.lang.Throwable -> L2c
            goto L7c
        L74:
            int r1 = h12.q.e
            h12.q$b r1 = new h12.q$b
            r1.<init>(r10)
            r10 = r1
        L7c:
            boolean r1 = r10 instanceof h12.q.b
            if (r1 != 0) goto L8e
            r1 = r10
            h12.f0 r1 = (h12.f0) r1
            b42.c r1 = r9.f16414m
            com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRulesEntryPoint r9 = r9.e
            com.dyson.mobile.android.robot.newsystem.managerules.RuleNavigationEvent r9 = r9.getRuleNavigationEvent()
            r1.h(r9)
        L8e:
            java.lang.Throwable r9 = h12.q.b(r10)
            if (r9 == 0) goto Lab
        L94:
            java.lang.Object r9 = r0.getValue()
            r10 = r9
            com.dyson.mobile.android.robot.newsystem.managerules.b r10 = (com.dyson.mobile.android.robot.newsystem.managerules.b) r10
            com.dyson.mobile.android.robot.newsystem.managerules.c$b r1 = new com.dyson.mobile.android.robot.newsystem.managerules.c$b
            r2 = 3
            r1.<init>(r6, r6, r2, r6)
            com.dyson.mobile.android.robot.newsystem.managerules.b r10 = com.dyson.mobile.android.robot.newsystem.managerules.b.a(r10, r6, r1, r6, r4)
            boolean r9 = r0.f(r9, r10)
            if (r9 == 0) goto L94
        Lab:
            h12.f0 r9 = h12.f0.f36844a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.managerules.f.S(com.dyson.mobile.android.robot.newsystem.managerules.f, n12.c):java.lang.Object");
    }

    public final void T(long j8, a21.c cVar) {
        f2 f2Var;
        Object value;
        f2 f2Var2;
        Object value2;
        k kVar = this.f16423v;
        kVar.getClass();
        a21.a aVar = new a21.a(this.f16412k.a(), a11.g.e(a11.g.c(1.2f, kVar.f88466g, j8)), cVar, true);
        do {
            f2Var = this.f16421t;
            value = f2Var.getValue();
            List list = (List) value;
        } while (!f2Var.f(value, c0.i0(aVar, (Collection) f2Var.getValue())));
        ij.f a13 = new mj.r(r.b.ADD_RULE, cVar.getInteractionType()).a();
        e.a aVar2 = hj.e.f38312g;
        this.f16413l.g(a13, null);
        do {
            f2Var2 = this.f16416o;
            value2 = f2Var2.getValue();
        } while (!f2Var2.f(value2, com.dyson.mobile.android.robot.newsystem.managerules.b.a((com.dyson.mobile.android.robot.newsystem.managerules.b) value2, h.b.f16435c, null, null, 13)));
    }

    public final List<Restriction> U() {
        Restriction.Behavior behavior;
        f2 f2Var = this.f16418q;
        if (!(f2Var.getValue() instanceof h.c) || this.f16423v == null) {
            return e0.d;
        }
        Iterable<a21.a> iterable = (Iterable) this.f16421t.getValue();
        ArrayList arrayList = new ArrayList(i12.u.o(iterable, 10));
        for (a21.a aVar : iterable) {
            Object value = f2Var.getValue();
            value.getClass();
            n nVar = n.f190a;
            k kVar = this.f16423v;
            kVar.getClass();
            y01.a aVar2 = kVar.f88462a;
            y01.a aVar3 = ((k) ((h.c) value).f57898a).f88462a;
            List<m4.c> a13 = a11.g.a(aVar.f238b.f88433f);
            k kVar2 = this.f16423v;
            kVar2.getClass();
            RotationAngleDegree rotationAngleDegree = kVar2.d;
            nVar.getClass();
            ArrayList p13 = n.p(aVar2, aVar3, a13, rotationAngleDegree);
            a21.c cVar = aVar.f239c;
            cVar.getClass();
            switch (a21.b.f241b[cVar.ordinal()]) {
                case 1:
                    behavior = Restriction.Behavior.KEEP_OUT;
                    break;
                case 2:
                    behavior = Restriction.Behavior.BRUSH_BAR_OFF;
                    break;
                case 3:
                    behavior = Restriction.Behavior.CLIMB_OBSTACLE;
                    break;
                case 4:
                    behavior = Restriction.Behavior.NO_MOP;
                    break;
                case 5:
                    behavior = Restriction.Behavior.NO_CLIMB;
                    break;
                case 6:
                    behavior = Restriction.Behavior.PET_DEEP_CLEAN;
                    break;
                default:
                    ma.e.o();
                    return null;
            }
            arrayList.add(new Restriction(aVar.f237a, p13, behavior));
        }
        return arrayList;
    }

    public final void V() {
        c42.r.y(c42.r.z(new v01.e(new c42.v(new c42.u(new v01.f(this, null), this.f16408g.d(this.d, this.e.getCacheLoadPolicy())), new v01.g(this, null))), new v01.h(this, null)), v.a(this));
    }

    public final void W(com.dyson.mobile.android.robot.newsystem.managerules.d dVar) {
        o oVar;
        y01.a aVar;
        boolean z13;
        char c13;
        y01.a aVar2;
        Object value;
        ArrayList arrayList;
        Object value2;
        Object value3;
        ArrayList arrayList2;
        Object obj;
        Object value4;
        ArrayList arrayList3;
        Object value5;
        Object value6;
        Object value7;
        ArrayList arrayList4;
        Object value8;
        dVar.getClass();
        boolean equals = dVar.equals(d.b.f16394a);
        b42.c cVar = this.f16414m;
        if (equals) {
            b42.n.a(cVar.h(RuleNavigationEvent.a.f16381a));
        } else if (dVar.equals(d.C0571d.f16396a)) {
            b42.n.a(cVar.h(RuleNavigationEvent.a.f16381a));
        } else {
            boolean equals2 = dVar.equals(d.c.f16395a);
            boolean z14 = false;
            char c14 = '\r';
            f2 f2Var = this.f16416o;
            f2 f2Var2 = this.f16421t;
            if (equals2) {
                do {
                    value7 = f2Var2.getValue();
                    List<a21.a> list = (List) value7;
                    arrayList4 = new ArrayList(i12.u.o(list, 10));
                    for (a21.a aVar3 : list) {
                        a21.a aVar4 = !aVar3.d ? aVar3 : null;
                        if (aVar4 == null) {
                            aVar4 = a21.a.a(aVar3, null, false, 7);
                        }
                        arrayList4.add(aVar4);
                    }
                } while (!f2Var2.f(value7, arrayList4));
                do {
                    value8 = f2Var.getValue();
                } while (!f2Var.f(value8, com.dyson.mobile.android.robot.newsystem.managerules.b.a((com.dyson.mobile.android.robot.newsystem.managerules.b) value8, h.a.f16434c, null, null, 13)));
            } else if (dVar.equals(d.e.f16397a)) {
                do {
                    value6 = f2Var.getValue();
                } while (!f2Var.f(value6, com.dyson.mobile.android.robot.newsystem.managerules.b.a((com.dyson.mobile.android.robot.newsystem.managerules.b) value6, null, null, null, 7)));
            } else if (dVar.equals(d.g.f16400a)) {
                Iterator it = ((Iterable) f2Var2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((a21.a) obj).d) {
                        break;
                    }
                }
                a21.a aVar5 = (a21.a) obj;
                if (aVar5 != null) {
                    ij.f a13 = new mj.r(r.b.REMOVE_RULE, aVar5.f239c.getInteractionType()).a();
                    e.a aVar6 = hj.e.f38312g;
                    this.f16413l.g(a13, null);
                }
                do {
                    value4 = f2Var2.getValue();
                    List list2 = (List) value4;
                    arrayList3 = new ArrayList();
                    for (Object obj2 : (Iterable) f2Var2.getValue()) {
                        if (!((a21.a) obj2).d) {
                            arrayList3.add(obj2);
                        }
                    }
                } while (!f2Var2.f(value4, arrayList3));
                do {
                    value5 = f2Var.getValue();
                } while (!f2Var.f(value5, com.dyson.mobile.android.robot.newsystem.managerules.b.a((com.dyson.mobile.android.robot.newsystem.managerules.b) value5, h.a.f16434c, null, null, 13)));
            } else if (dVar.equals(d.j.f16403a)) {
                g0.r(v.a(this), null, null, new v01.i(this, null), 3);
            } else if (dVar.equals(d.k.f16404a)) {
                g0.r(v.a(this), null, null, new v01.i(this, null), 3);
            } else if (dVar.equals(d.a.f16393a)) {
                b42.n.a(cVar.h(RuleNavigationEvent.e.f16385a));
            } else if (dVar instanceof d.h) {
                V();
            } else if (dVar instanceof d.i) {
                a21.a aVar7 = ((d.i) dVar).f16402a;
                do {
                    value3 = f2Var2.getValue();
                    List<a21.a> list3 = (List) value3;
                    arrayList2 = new ArrayList(i12.u.o(list3, 10));
                    for (a21.a aVar8 : list3) {
                        if (x12.r.c(aVar8.f237a, aVar7.f237a)) {
                            aVar8 = a21.a.a(aVar8, aVar7.f238b, false, 13);
                        }
                        arrayList2.add(aVar8);
                    }
                } while (!f2Var2.f(value3, arrayList2));
            } else if (dVar instanceof d.m) {
                a21.a aVar9 = ((d.m) dVar).f16406a;
                do {
                    value = f2Var2.getValue();
                    List<a21.a> list4 = (List) value;
                    arrayList = new ArrayList(i12.u.o(list4, 10));
                    for (a21.a aVar10 : list4) {
                        arrayList.add(a21.a.a(aVar10, null, x12.r.c(aVar10.f237a, aVar9.f237a), 7));
                    }
                } while (!f2Var2.f(value, arrayList));
                do {
                    value2 = f2Var.getValue();
                } while (!f2Var.f(value2, com.dyson.mobile.android.robot.newsystem.managerules.b.a((com.dyson.mobile.android.robot.newsystem.managerules.b) value2, h.b.f16435c, null, null, 13)));
            } else if (dVar instanceof d.l) {
                a21.c cVar2 = ((d.l) dVar).f16405a;
                if (this.f16423v == null && this.f16424w == null) {
                    return;
                }
                o oVar2 = this.f16424w;
                oVar2.getClass();
                T(m4.h.b(oVar2.f194a), cVar2);
            } else if (!(dVar instanceof d.f)) {
                ma.e.o();
            } else {
                d.f fVar = (d.f) dVar;
                o oVar3 = fVar.f16398a;
                k kVar = fVar.f16399b;
                List<a21.a> list5 = kVar.f88468i;
                y01.a aVar11 = kVar.f88462a;
                this.f16424w = oVar3;
                this.f16423v = kVar;
                Object value9 = f2Var2.getValue();
                ArrayList arrayList5 = this.f16420s;
                boolean c15 = x12.r.c(value9, arrayList5);
                k kVar2 = this.f16427z;
                if (!c15 && kVar2 != null) {
                    y01.a aVar12 = kVar2.f88462a;
                    if (!x12.r.c(aVar12, aVar11)) {
                        while (true) {
                            Object value10 = f2Var2.getValue();
                            List list6 = (List) value10;
                            List list7 = (List) f2Var2.getValue();
                            m4.d dVar2 = aVar12.f88433f;
                            m4.d dVar3 = aVar11.f88433f;
                            float f13 = dVar2.f53028c;
                            float f14 = dVar2.f53026a;
                            float f15 = f13 - f14;
                            float f16 = dVar2.d;
                            float f17 = dVar2.f53027b;
                            float f18 = f16 - f17;
                            if (f15 <= 0.0f || f18 <= 0.0f) {
                                oVar = oVar3;
                                aVar = aVar11;
                                z13 = z14;
                                c13 = c14;
                                aVar2 = aVar12;
                            } else {
                                float f19 = dVar3.f53028c;
                                float f23 = dVar3.f53027b;
                                float f24 = dVar3.f53026a;
                                float f25 = f19 - f24;
                                if (f25 > 0.0f) {
                                    float f26 = dVar3.d - f23;
                                    if (f26 > 0.0f) {
                                        float f27 = f25 / f15;
                                        float f28 = f26 / f18;
                                        aVar = aVar11;
                                        ArrayList arrayList6 = new ArrayList(i12.u.o(list7, 10));
                                        Iterator it2 = list7.iterator();
                                        while (it2.hasNext()) {
                                            a21.a aVar13 = (a21.a) it2.next();
                                            m4.d dVar4 = aVar13.f238b.f88433f;
                                            arrayList6.add(a21.a.a(aVar13, new y01.a(ma.e.c(dVar4.f53026a, f14, f27, f24), ma.e.c(dVar4.f53027b, f17, f28, f23), ma.e.c(dVar4.f53028c, f14, f27, f24), ma.e.c(dVar4.d, f17, f28, f23)), false, 13));
                                            it2 = it2;
                                            aVar12 = aVar12;
                                            oVar3 = oVar3;
                                        }
                                        oVar = oVar3;
                                        aVar2 = aVar12;
                                        z13 = false;
                                        c13 = '\r';
                                        list7 = arrayList6;
                                    }
                                }
                                oVar = oVar3;
                                aVar = aVar11;
                                aVar2 = aVar12;
                                z13 = false;
                                c13 = '\r';
                            }
                            if (f2Var2.f(value10, list7)) {
                                break;
                            }
                            z14 = z13;
                            c14 = c13;
                            aVar11 = aVar;
                            aVar12 = aVar2;
                            oVar3 = oVar;
                        }
                        this.f16427z = kVar;
                        nl0.i.a((nl0.h) this.f16419r.d.getValue(), new tv1.f(25, this, oVar));
                    }
                }
                oVar = oVar3;
                if (c15) {
                    arrayList5.clear();
                    arrayList5.addAll(list5);
                    f2Var2.setValue(list5);
                }
                this.f16427z = kVar;
                nl0.i.a((nl0.h) this.f16419r.d.getValue(), new tv1.f(25, this, oVar));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/f$a;", "", "<init>", "()V", "", "INITIAL_RESTRICTION_SIZE_IN_METERS", "F", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(String str, ManageRulesEntryPoint manageRulesEntryPoint, Point point, h11.a aVar, h41.d dVar, pf0.c cVar, l lVar, s21.d dVar2, hj.e eVar, q qVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, manageRulesEntryPoint, (i13 & 4) != 0 ? null : point, aVar, dVar, cVar, lVar, dVar2, eVar, qVar);
    }
}
