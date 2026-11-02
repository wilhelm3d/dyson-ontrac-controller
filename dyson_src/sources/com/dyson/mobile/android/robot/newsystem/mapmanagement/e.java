package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import b42.m;
import c42.a1;
import c42.a2;
import c42.f2;
import c42.g2;
import c42.l1;
import c42.r1;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import com.paypal.android.platform.authsdk.BR;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import h12.f0;
import i12.e0;
import i12.s;
import i12.t;
import iu0.r;
import j12.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m11.j;
import m9.u;
import m9.v;
import nl0.h;
import y01.k;
import z32.c0;
import z32.g0;
import z32.k0;
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/e;", "Lm9/u;", "Lk01/a;", "connectionStatusProvider", "Lj51/a;", "machineStatusProvider", "Ll51/b;", "mapUploadStatusProvider", "Lpf0/c;", "localisationManager", "Liu0/r;", "robotCapabilitiesSupport", "Lh41/d;", "updateMapTasks", "Ld51/a;", "mappingController", "Lhj/e;", "trackingManager", "Laf1/i;", "dispatcherProvider", "<init>", "(Lk01/a;Lj51/a;Ll51/b;Lpf0/c;Liu0/r;Lh41/d;Ld51/a;Lhj/e;Laf1/i;)V", "c", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends u {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f16467v = 0;
    public final k01.a d;
    public final j51.a e;

    /* renamed from: f  reason: collision with root package name */
    public final l51.b f16468f;

    /* renamed from: g  reason: collision with root package name */
    public final pf0.c f16469g;

    /* renamed from: h  reason: collision with root package name */
    public final r f16470h;

    /* renamed from: i  reason: collision with root package name */
    public final h41.d f16471i;

    /* renamed from: j  reason: collision with root package name */
    public final d51.a f16472j;

    /* renamed from: k  reason: collision with root package name */
    public final hj.e f16473k;

    /* renamed from: l  reason: collision with root package name */
    public final af1.i f16474l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f16475m;

    /* renamed from: n  reason: collision with root package name */
    public final f2 f16476n;

    /* renamed from: o  reason: collision with root package name */
    public final r1 f16477o;

    /* renamed from: p  reason: collision with root package name */
    public final b42.c f16478p;

    /* renamed from: q  reason: collision with root package name */
    public final c42.e f16479q;

    /* renamed from: r  reason: collision with root package name */
    public final b42.c f16480r;

    /* renamed from: s  reason: collision with root package name */
    public final c42.e f16481s;

    /* renamed from: t  reason: collision with root package name */
    public final r1 f16482t;

    /* renamed from: u  reason: collision with root package name */
    public int f16483u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$1", f = "RobotMapManagementViewModel.kt", l = {BR.title}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
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
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                this.d = 1;
                e eVar = e.this;
                l51.b bVar = eVar.f16468f;
                Object i14 = c42.r.i(new a1(new l1(bVar.d, bVar.f50768f, new h(eVar, null))), new m11.h(eVar, null), this);
                if (i14 != obj2) {
                    i14 = f0.f36844a;
                }
                if (i14 == obj2) {
                    return obj2;
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
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$2", f = "RobotMapManagementViewModel.kt", l = {BR.titleAccessibilityKey}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
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
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                this.d = 1;
                e eVar = e.this;
                c42.i<ol0.b> iVar = eVar.d.f46176c;
                j51.a aVar = eVar.e;
                Object i14 = c42.r.i(c42.r.n(c42.r.j(iVar, aVar.d, aVar.f43958c, new m11.i(null))), new j(eVar, null), this);
                if (i14 != obj2) {
                    i14 = f0.f36844a;
                }
                if (i14 == obj2) {
                    return obj2;
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

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16484a;

        static {
            int[] iArr = new int[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.values().length];
            try {
                iArr[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.SPLIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.MERGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.RENAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.RULES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.dyson.mobile.android.robot.newsystem.mapmanagement.a.FURNITURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f16484a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$loadMapMetadata$1", f = "RobotMapManagementViewModel.kt", l = {359, 361}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0584e extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public k0 d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f16485f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ boolean f16486g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ e f16487h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz32/c0;", "Lnl0/h;", "", "Lvu0/a;", "<anonymous>", "(Lz32/c0;)Lnl0/h;"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$loadMapMetadata$1$nextMetadataResult$1", f = "RobotMapManagementViewModel.kt", l = {356}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.e$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends n12.i implements Function2<c0, l12.d<? super nl0.h<? extends List<? extends vu0.a>>>, Object> {
            public int d;
            public final /* synthetic */ e e;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnl0/h;", "", "Lvu0/a;", PayPalNewShippingAddressReviewViewKt.STATE, "", "<anonymous>", "(Lnl0/h;)Z"}, k = 3, mv = {2, 3, 0})
            @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$loadMapMetadata$1$nextMetadataResult$1$1", f = "RobotMapManagementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.e$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0585a extends n12.i implements Function2<nl0.h<? extends List<? extends vu0.a>>, l12.d<? super Boolean>, Object> {
                public /* synthetic */ Object d;

                public C0585a(l12.d<? super C0585a> dVar) {
                    super(2, dVar);
                }

                @Override // n12.a
                public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                    C0585a c0585a = new C0585a(dVar);
                    c0585a.d = obj;
                    return c0585a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(nl0.h<? extends List<? extends vu0.a>> hVar, l12.d<? super Boolean> dVar) {
                    return ((C0585a) create(hVar, dVar)).invokeSuspend(f0.f36844a);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                    h12.r.b(obj);
                    return Boolean.valueOf(!(((nl0.h) this.d) instanceof h.b));
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnl0/h;", "", "Lvu0/a;", PayPalNewShippingAddressReviewViewKt.STATE, "", "<anonymous>", "(Lnl0/h;)Z"}, k = 3, mv = {2, 3, 0})
            @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$loadMapMetadata$1$nextMetadataResult$1$2", f = "RobotMapManagementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.e$e$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends n12.i implements Function2<nl0.h<? extends List<? extends vu0.a>>, l12.d<? super Boolean>, Object> {
                public /* synthetic */ Object d;

                public b(l12.d<? super b> dVar) {
                    super(2, dVar);
                }

                @Override // n12.a
                public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                    b bVar = new b(dVar);
                    bVar.d = obj;
                    return bVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(nl0.h<? extends List<? extends vu0.a>> hVar, l12.d<? super Boolean> dVar) {
                    return ((b) create(hVar, dVar)).invokeSuspend(f0.f36844a);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    nl0.h hVar = (nl0.h) this.d;
                    m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                    h12.r.b(obj);
                    return Boolean.valueOf((hVar instanceof h.c) || (hVar instanceof h.a));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, l12.d<? super a> dVar) {
                super(2, dVar);
                this.e = eVar;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                return new a(this.e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(c0 c0Var, l12.d<? super nl0.h<? extends List<? extends vu0.a>>> dVar) {
                return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                int i13 = this.d;
                if (i13 != 0) {
                    if (i13 == 1) {
                        h12.r.b(obj);
                        return obj;
                    }
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h12.r.b(obj);
                c42.c0 c0Var = new c42.c0(this.e.f16468f.d, new C0585a(null));
                b bVar = new b(null);
                this.d = 1;
                Object r13 = c42.r.r(c0Var, bVar, this);
                return r13 == aVar ? aVar : r13;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0584e(boolean z13, e eVar, l12.d<? super C0584e> dVar) {
            super(2, dVar);
            this.f16486g = z13;
            this.f16487h = eVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            C0584e c0584e = new C0584e(this.f16486g, this.f16487h, dVar);
            c0584e.f16485f = obj;
            return c0584e;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0584e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
            if (r14.c(r2, r13) != r1) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
            if (r14 == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
            return r1;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f16485f
                z32.c0 r0 = (z32.c0) r0
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r2 = r13.e
                r3 = 2
                r4 = 1
                r5 = 0
                com.dyson.mobile.android.robot.newsystem.mapmanagement.e r6 = r13.f16487h
                if (r2 == 0) goto L23
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L17
                h12.r.b(r14)
                goto L75
            L17:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r13)
                return r5
            L1d:
                z32.k0 r0 = r13.d
                h12.r.b(r14)
                goto L68
            L23:
                h12.r.b(r14)
                boolean r14 = r13.f16486g
                if (r14 == 0) goto L44
                c42.f2 r14 = r6.f16476n
            L2c:
                java.lang.Object r2 = r14.getValue()
                r7 = r2
                m11.c r7 = (m11.c) r7
                nl0.h$b r8 = nl0.h.b.f57897a
                r11 = 0
                r12 = 14
                r9 = 0
                r10 = 0
                m11.c r7 = m11.c.a(r7, r8, r9, r10, r11, r12)
                boolean r2 = r14.f(r2, r7)
                if (r2 == 0) goto L2c
            L44:
                l51.b r14 = r6.f16468f
                c42.f2 r14 = r14.e
                nl0.h$b r2 = nl0.h.b.f57897a
                r14.setValue(r2)
                com.dyson.mobile.android.robot.newsystem.mapmanagement.e$e$a r14 = new com.dyson.mobile.android.robot.newsystem.mapmanagement.e$e$a
                r14.<init>(r6, r5)
                r2 = 3
                z32.k0 r0 = z32.g0.e(r0, r5, r14, r2)
                l51.b r14 = r6.f16468f
                com.dyson.mobile.android.robot.CacheLoadPolicy r2 = com.dyson.mobile.android.robot.CacheLoadPolicy.REMOTE_ONLY
                r13.f16485f = r5
                r13.d = r0
                r13.e = r4
                java.lang.Object r14 = r14.c(r2, r13)
                if (r14 != r1) goto L68
                goto L74
            L68:
                r13.f16485f = r5
                r13.d = r5
                r13.e = r3
                java.lang.Object r14 = r0.M0(r13)
                if (r14 != r1) goto L75
            L74:
                return r1
            L75:
                nl0.h r14 = (nl0.h) r14
                boolean r13 = r14 instanceof nl0.h.c
                if (r13 == 0) goto L87
                nl0.h$c r14 = (nl0.h.c) r14
                T r13 = r14.f57898a
                java.util.List r13 = (java.util.List) r13
                com.dyson.mobile.android.robot.newsystem.mapmanagement.e.S(r6, r13)
                com.dyson.mobile.android.robot.newsystem.mapmanagement.e.W(r6)
            L87:
                h12.f0 r13 = h12.f0.f36844a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapmanagement.e.C0584e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$onRotateMapClicked$1", f = "RobotMapManagementViewModel.kt", l = {389, 391}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class f extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ k f16488f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k kVar, l12.d<? super f> dVar) {
            super(2, dVar);
            this.f16488f = kVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new f(this.f16488f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((f) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
            if (h12.f0.f36844a == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
            if (r0 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
            return r1;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r2 = r0.d
                r3 = 0
                y01.k r4 = r0.f16488f
                r5 = 2
                r6 = 1
                com.dyson.mobile.android.robot.newsystem.mapmanagement.e r7 = com.dyson.mobile.android.robot.newsystem.mapmanagement.e.this
                if (r2 == 0) goto L23
                if (r2 == r6) goto L1f
                if (r2 != r5) goto L19
                h12.r.b(r17)     // Catch: java.lang.Throwable -> L17
                goto L76
            L17:
                r0 = move-exception
                goto L7b
            L19:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r0)
                return r3
            L1f:
                h12.r.b(r17)
                goto L44
            L23:
                h12.r.b(r17)
                c42.f2 r2 = r7.f16476n
                java.lang.Object r8 = r2.getValue()
                r9 = r8
                m11.c r9 = (m11.c) r9
                nl0.h$b r10 = nl0.h.b.f57897a
                r13 = 0
                r14 = 14
                r11 = 0
                r12 = 0
                m11.c r8 = m11.c.a(r9, r10, r11, r12, r13, r14)
                r0.d = r6
                r2.l(r3, r8)
                h12.f0 r2 = h12.f0.f36844a
                if (r2 != r1) goto L44
                goto L75
            L44:
                int r2 = h12.q.e     // Catch: java.lang.Throwable -> L17
                h41.d r2 = r7.f16471i     // Catch: java.lang.Throwable -> L17
                java.lang.String r3 = r4.f88463b     // Catch: java.lang.Throwable -> L17
                com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree r6 = r4.d     // Catch: java.lang.Throwable -> L17
                com.dyson.mobile.android.robot.newsystem.mapengine.data.RotationAngleDegree r6 = r6.rotateClockwise()     // Catch: java.lang.Throwable -> L17
                int r6 = r6.getValue()     // Catch: java.lang.Throwable -> L17
                r0.d = r5     // Catch: java.lang.Throwable -> L17
                r2.getClass()     // Catch: java.lang.Throwable -> L17
                ou0.e r8 = new ou0.e     // Catch: java.lang.Throwable -> L17
                java.lang.Integer r11 = new java.lang.Integer     // Catch: java.lang.Throwable -> L17
                r11.<init>(r6)     // Catch: java.lang.Throwable -> L17
                r14 = 27
                r15 = 0
                r9 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L17
                java.lang.Object r0 = r2.d(r3, r8, r0)     // Catch: java.lang.Throwable -> L17
                if (r0 != r1) goto L71
                goto L73
            L71:
                h12.f0 r0 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L17
            L73:
                if (r0 != r1) goto L76
            L75:
                return r1
            L76:
                h12.f0 r0 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L17
                int r1 = h12.q.e     // Catch: java.lang.Throwable -> L17
                goto L83
            L7b:
                int r1 = h12.q.e
                h12.q$b r1 = new h12.q$b
                r1.<init>(r0)
                r0 = r1
            L83:
                java.lang.Throwable r1 = h12.q.b(r0)
                if (r1 == 0) goto L8f
                boolean r2 = r1 instanceof java.util.concurrent.CancellationException
                if (r2 != 0) goto L8e
                goto L8f
            L8e:
                throw r1
            L8f:
                boolean r1 = r0 instanceof h12.q.b
                if (r1 != 0) goto L99
                r1 = r0
                h12.f0 r1 = (h12.f0) r1
                com.dyson.mobile.android.robot.newsystem.mapmanagement.e.W(r7)
            L99:
                java.lang.Throwable r0 = h12.q.b(r0)
                if (r0 == 0) goto Lc8
                java.lang.String r1 = r4.f88463b
                java.lang.String r2 = "Failed to rotateMap for mapId "
                q62.n.n(r2, r1, r0)
                c42.f2 r0 = r7.f16476n
            La8:
                java.lang.Object r1 = r0.getValue()
                r2 = r1
                m11.c r2 = (m11.c) r2
                nl0.h$a r3 = new nl0.h$a
                com.dyson.mobile.android.robot.newsystem.mapmanagement.MapManagementApiError$RotateMapApiError r4 = new com.dyson.mobile.android.robot.newsystem.mapmanagement.MapManagementApiError$RotateMapApiError
                r4.<init>()
                r3.<init>(r4)
                r6 = 0
                r7 = 14
                r4 = 0
                r5 = 0
                m11.c r2 = m11.c.a(r2, r3, r4, r5, r6, r7)
                boolean r1 = r0.f(r1, r2)
                if (r1 == 0) goto La8
            Lc8:
                h12.f0 r0 = h12.f0.f36844a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapmanagement.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements c42.i<List<? extends oz0.c>> {
        public final /* synthetic */ c42.i d;
        public final /* synthetic */ e e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lh12/f0;", "emit", "(Ljava/lang/Object;Ll12/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
        /* loaded from: classes3.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ c42.j d;
            public final /* synthetic */ e e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$special$$inlined$map$1$2", f = "RobotMapManagementViewModel.kt", l = {219}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.e$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0586a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0586a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(c42.j jVar, e eVar) {
                this.d = jVar;
                this.e = eVar;
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
                    boolean r0 = r6 instanceof com.dyson.mobile.android.robot.newsystem.mapmanagement.e.g.a.C0586a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.robot.newsystem.mapmanagement.e$g$a$a r0 = (com.dyson.mobile.android.robot.newsystem.mapmanagement.e.g.a.C0586a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.robot.newsystem.mapmanagement.e$g$a$a r0 = new com.dyson.mobile.android.robot.newsystem.mapmanagement.e$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L4a
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    m11.c r5 = (m11.c) r5
                    nl0.h<m11.d> r5 = r5.f52901a
                    boolean r5 = r5 instanceof nl0.h.c
                    int r6 = com.dyson.mobile.android.robot.newsystem.mapmanagement.e.f16467v
                    com.dyson.mobile.android.robot.newsystem.mapmanagement.e r6 = r4.e
                    java.util.ArrayList r5 = r6.T(r5)
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L4a
                    return r1
                L4a:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.mapmanagement.e.g.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public g(c42.i iVar, e eVar) {
            this.d = iVar;
            this.e = eVar;
        }

        @Override // c42.i
        public final Object collect(c42.j<? super List<? extends oz0.c>> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar, this.e), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    static {
        new c(null);
    }

    public e(k01.a aVar, j51.a aVar2, l51.b bVar, pf0.c cVar, r rVar, h41.d dVar, d51.a aVar3, hj.e eVar, af1.i iVar) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        cVar.getClass();
        rVar.getClass();
        dVar.getClass();
        aVar3.getClass();
        eVar.getClass();
        iVar.getClass();
        this.d = aVar;
        this.e = aVar2;
        this.f16468f = bVar;
        this.f16469g = cVar;
        this.f16470h = rVar;
        this.f16471i = dVar;
        this.f16472j = aVar3;
        this.f16473k = eVar;
        this.f16474l = iVar;
        this.f16475m = g2.a(e0.d);
        f2 a13 = g2.a(new m11.c(null, false, 0, null, 15, null));
        this.f16476n = a13;
        r1 d13 = c42.r.d(a13);
        this.f16477o = d13;
        b42.c b13 = m.b(-2, null, null, 6);
        this.f16478p = b13;
        this.f16479q = c42.r.B(b13);
        b42.c b14 = m.b(-2, null, null, 6);
        this.f16480r = b14;
        this.f16481s = c42.r.B(b14);
        g gVar = new g(d13, this);
        s9.a a14 = v.a(this);
        a2.f10222a.getClass();
        this.f16482t = c42.r.D(gVar, a14, a2.a.f10225c, T(false));
        this.f16483u = ((m11.c) a13.getValue()).f52903c;
        g0.r(v.a(this), null, null, new a(null), 3);
        g0.r(v.a(this), null, null, new b(null), 3);
    }

    public static final void S(e eVar, List list) {
        Object value;
        m11.c cVar;
        Integer valueOf;
        f2 f2Var = eVar.f16475m;
        ArrayList arrayList = new ArrayList(i12.u.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vu0.a aVar = (vu0.a) it.next();
            String a13 = aVar.a();
            String c13 = aVar.c();
            if (c13 == null) {
                c13 = eVar.f16469g.c(R.string.machine276_createEditZones_unnamedMap);
            }
            arrayList.add(new m11.b(a13, c13));
        }
        f2Var.l(null, arrayList);
        Iterator it2 = list.iterator();
        int i13 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i13 = -1;
                break;
            } else if (((vu0.a) it2.next()).e()) {
                break;
            } else {
                i13++;
            }
        }
        f2 f2Var2 = eVar.f16476n;
        do {
            value = f2Var2.getValue();
            cVar = (m11.c) value;
            valueOf = Integer.valueOf(i13);
            if (i13 < 0 || i13 >= ((Collection) f2Var.getValue()).size()) {
                valueOf = null;
            }
        } while (!f2Var2.f(value, m11.c.a(cVar, null, false, valueOf != null ? valueOf.intValue() : 0, null, 11)));
    }

    public static void W(e eVar) {
        m11.b bVar = (m11.b) i12.c0.Q(((m11.c) eVar.f16477o.d.getValue()).f52903c, (List) eVar.f16475m.getValue());
        if (bVar == null) {
            Logger.b("selectedMap is null", null);
        } else {
            g0.r(v.a(eVar), null, null, new m11.g(false, eVar, bVar, null), 3);
        }
    }

    public final ArrayList T(boolean z13) {
        j12.b b13 = s.b();
        b13.addAll(t.h(com.dyson.mobile.android.robot.newsystem.mapmanagement.a.SPLIT, com.dyson.mobile.android.robot.newsystem.mapmanagement.a.MERGE));
        if (this.f16470h.b()) {
            b13.add(com.dyson.mobile.android.robot.newsystem.mapmanagement.a.DELETE);
        }
        b13.addAll(t.h(com.dyson.mobile.android.robot.newsystem.mapmanagement.a.RENAME, com.dyson.mobile.android.robot.newsystem.mapmanagement.a.RULES, com.dyson.mobile.android.robot.newsystem.mapmanagement.a.FURNITURE));
        j12.b a13 = s.a(b13);
        ArrayList arrayList = new ArrayList(i12.u.o(a13, 10));
        ListIterator listIterator = a13.listIterator(0);
        while (true) {
            b.c cVar = (b.c) listIterator;
            if (!cVar.hasNext()) {
                return arrayList;
            }
            com.dyson.mobile.android.robot.newsystem.mapmanagement.a aVar = (com.dyson.mobile.android.robot.newsystem.mapmanagement.a) cVar.next();
            arrayList.add(new oz0.c(aVar.getId(), aVar.getDrawableResId(), this.f16469g.c(aVar.getLabelResId()), z13, false, 16, null));
        }
    }

    public final void U() {
        f2 f2Var = this.f16475m;
        m11.b bVar = (m11.b) i12.c0.Q(this.f16483u, (List) f2Var.getValue());
        if (bVar != null) {
            g0.r(v.a(this), null, null, new com.dyson.mobile.android.robot.newsystem.mapmanagement.f(this, bVar.f52899a, null), 3);
            return;
        }
        int i13 = this.f16483u;
        d22.k f13 = t.f((Collection) f2Var.getValue());
        Logger.b("Unable to change current map: index " + i13 + " is outside map list bounds " + f13, null);
    }

    public final void V() {
        m11.b bVar = (m11.b) i12.c0.Q(((m11.c) this.f16477o.d.getValue()).f52903c, (List) this.f16475m.getValue());
        if (bVar == null) {
            Logger.b("selectedMap is null", null);
            return;
        }
        g0.r(v.a(this), null, null, new com.dyson.mobile.android.robot.newsystem.mapmanagement.g(this, bVar.f52899a, null), 3);
    }

    public final void X(boolean z13) {
        g0.r(v.a(this), null, null, new C0584e(z13, this, null), 3);
    }

    public final void Z() {
        m11.d dVar;
        nl0.h<m11.d> hVar = ((m11.c) this.f16476n.getValue()).f52901a;
        h.c cVar = hVar instanceof h.c ? (h.c) hVar : null;
        if (cVar == null || (dVar = (m11.d) cVar.f57898a) == null) {
            return;
        }
        g0.r(v.a(this), null, null, new f(dVar.f52905b, null), 3);
    }

    public final void a0(g01.a aVar) {
        while (true) {
            f2 f2Var = this.f16476n;
            Object value = f2Var.getValue();
            g01.a aVar2 = aVar;
            if (f2Var.f(value, m11.c.a((m11.c) value, null, false, 0, aVar2, 7))) {
                return;
            }
            aVar = aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/e$c;", "", "<init>", "()V", "", "MAX_MAP_COUNT", "I", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
