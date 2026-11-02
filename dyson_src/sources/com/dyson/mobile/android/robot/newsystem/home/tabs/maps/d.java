package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import c42.a2;
import c42.f2;
import c42.g2;
import c42.l1;
import c42.q1;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.CacheLoadPolicy;
import com.dyson.mobile.android.robot.newsystem.home.tabs.maps.ManageMapsTabApiError;
import g01.c;
import h12.f0;
import h12.r;
import hx.v;
import i12.e0;
import i41.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import nl0.h;
import rf0.j;
import rf0.w;
import w12.o;
import y01.k;
import z32.c0;
import z32.g0;
import z32.n1;
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bBa\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/d;", "Lm9/u;", "Li11/a;", "mapViewTrackingController", "Lq11/c;", "robotNavigationController", "Ll51/b;", "mapUploadStatusProvider", "Lh41/d;", "updateMapTasks", "Li41/i;", "robotMachineTraits", "Lpf0/c;", "localisationManager", "Laf1/i;", "dispatcherProvider", "Lj51/a;", "machineStatusProvider", "Lp11/b;", "midTabsBannerProvider", "Liu0/r;", "robotCapabilitiesSupport", "Luf0/k;", "machineOptions", "<init>", "(Li11/a;Lq11/c;Ll51/b;Lh41/d;Li41/i;Lpf0/c;Laf1/i;Lj51/a;Lp11/b;Liu0/r;Luf0/k;)V", "c", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u {
    public final i11.a d;
    public final q11.c e;

    /* renamed from: f  reason: collision with root package name */
    public final l51.b f16352f;

    /* renamed from: g  reason: collision with root package name */
    public final h41.d f16353g;

    /* renamed from: h  reason: collision with root package name */
    public final i f16354h;

    /* renamed from: i  reason: collision with root package name */
    public final pf0.c f16355i;

    /* renamed from: j  reason: collision with root package name */
    public final af1.i f16356j;

    /* renamed from: k  reason: collision with root package name */
    public final j51.a f16357k;

    /* renamed from: l  reason: collision with root package name */
    public List<g01.b> f16358l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f16359m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f16360n;

    /* renamed from: o  reason: collision with root package name */
    public final r1 f16361o;

    /* renamed from: p  reason: collision with root package name */
    public int f16362p;

    /* renamed from: q  reason: collision with root package name */
    public final u1 f16363q;

    /* renamed from: r  reason: collision with root package name */
    public final q1 f16364r;

    /* renamed from: s  reason: collision with root package name */
    public final String f16365s;

    /* renamed from: t  reason: collision with root package name */
    public n1 f16366t;

    /* renamed from: u  reason: collision with root package name */
    public final LocalisationKey f16367u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$1", f = "RobotManageMapsViewModel.kt", l = {100}, m = "invokeSuspend", v = 2)
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
                r.b(obj);
                this.d = 1;
                d dVar = d.this;
                Object i14 = c42.r.i(dVar.f16352f.d, new com.dyson.mobile.android.robot.newsystem.home.tabs.maps.g(dVar, null), this);
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
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/d$c;", "", "<init>", "(Ljava/lang/String;I)V", "RENAME_MAP", "DELETE_MAP", "RULES_UPDATED", "FURNITURE_UPDATED", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c RENAME_MAP = new c("RENAME_MAP", 0);
        public static final c DELETE_MAP = new c("DELETE_MAP", 1);
        public static final c RULES_UPDATED = new c("RULES_UPDATED", 2);
        public static final c FURNITURE_UPDATED = new c("FURNITURE_UPDATED", 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{RENAME_MAP, DELETE_MAP, RULES_UPDATED, FURNITURE_UPDATED};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private c(String str, int i13) {
        }

        public static o12.a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$loadCurrentMap$1", f = "RobotManageMapsViewModel.kt", l = {172}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0568d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isRobotReady", "createNewMapEnabled", "Lh12/f0;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$loadCurrentMap$1$1", f = "RobotManageMapsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends n12.i implements Function3<Boolean, Boolean, l12.d<? super f0>, Object> {
            public /* synthetic */ boolean d;
            public /* synthetic */ boolean e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ d f16368f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, l12.d<? super a> dVar2) {
                super(3, dVar2);
                this.f16368f = dVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Boolean bool, Boolean bool2, l12.d<? super f0> dVar) {
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                a aVar = new a(this.f16368f, dVar);
                aVar.d = booleanValue;
                aVar.e = booleanValue2;
                return aVar.invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                boolean z13 = this.d;
                boolean z14 = this.e;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                f2 f2Var = this.f16368f.f16359m;
                do {
                    value = f2Var.getValue();
                } while (!f2Var.f(value, g01.d.a((g01.d) value, new h.c(new c.a(z13 && z14)), 0, null, 6)));
                return f0.f36844a;
            }
        }

        public C0568d(l12.d<? super C0568d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0568d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0568d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                d dVar = d.this;
                j51.a aVar2 = dVar.f16357k;
                l1 l1Var = new l1(aVar2.d, aVar2.e, new a(dVar, null));
                this.d = 1;
                if (c42.r.h(l1Var, this) == aVar) {
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
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$loadCurrentMap$2", f = "RobotManageMapsViewModel.kt", l = {184, 217}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class e extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f16369f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ CacheLoadPolicy f16370g;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnl0/h;", "Ly01/k;", "currentMap", "", "isRobotReady", "createNewMapEnabled", "Lh12/f0;", "<anonymous>", "(Lnl0/h;ZZ)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$loadCurrentMap$2$2", f = "RobotManageMapsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* loaded from: classes3.dex */
        public static final class a extends n12.i implements o<h<? extends k>, Boolean, Boolean, l12.d<? super f0>, Object> {
            public /* synthetic */ h d;
            public /* synthetic */ boolean e;

            /* renamed from: f  reason: collision with root package name */
            public /* synthetic */ boolean f16371f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ d f16372g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, l12.d<? super a> dVar2) {
                super(4, dVar2);
                this.f16372g = dVar;
            }

            @Override // w12.o
            public final Object invoke(h<? extends k> hVar, Boolean bool, Boolean bool2, l12.d<? super f0> dVar) {
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                a aVar = new a(this.f16372g, dVar);
                aVar.d = hVar;
                aVar.e = booleanValue;
                aVar.f16371f = booleanValue2;
                return aVar.invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object value2;
                h hVar = this.d;
                boolean z13 = this.e;
                boolean z14 = this.f16371f;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                boolean z15 = hVar instanceof h.c;
                d dVar = this.f16372g;
                if (z15) {
                    f2 f2Var = dVar.f16359m;
                    do {
                        value2 = f2Var.getValue();
                    } while (!f2Var.f(value2, g01.d.a((g01.d) value2, new h.c(new c.b(dVar.f16358l, (k) ((h.c) hVar).f57898a, z13, z13 && z14, dVar.f16354h.f40732v.f46849c)), 0, null, 6)));
                } else if (hVar instanceof h.a) {
                    f2 f2Var2 = dVar.f16359m;
                    do {
                        value = f2Var2.getValue();
                    } while (!f2Var2.f(value, g01.d.a((g01.d) value, new h.a(ManageMapsTabApiError.PersistentMapApiError.d), 0, null, 6)));
                }
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, CacheLoadPolicy cacheLoadPolicy, l12.d<? super e> dVar) {
            super(2, dVar);
            this.f16369f = str;
            this.f16370g = cacheLoadPolicy;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(this.f16369f, this.f16370g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
            if (r11.d(r10.f16369f, r10.f16370g, r10) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
            if (c42.r.h(r11, r10) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
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
                int r1 = r10.d
                r2 = 0
                r3 = 2
                r4 = 1
                com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d r5 = com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.this
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                h12.r.b(r11)
                goto L62
            L13:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r10)
                return r2
            L19:
                h12.r.b(r11)
                goto L46
            L1d:
                h12.r.b(r11)
                c42.f2 r11 = r5.f16359m
            L22:
                java.lang.Object r1 = r11.getValue()
                r6 = r1
                g01.d r6 = (g01.d) r6
                nl0.h$b r7 = nl0.h.b.f57897a
                r8 = 0
                r9 = 6
                g01.d r6 = g01.d.a(r6, r7, r8, r2, r9)
                boolean r1 = r11.f(r1, r6)
                if (r1 == 0) goto L22
                l51.b r11 = r5.f16352f
                r10.d = r4
                java.lang.String r1 = r10.f16369f
                com.dyson.mobile.android.robot.CacheLoadPolicy r4 = r10.f16370g
                java.lang.Object r11 = r11.d(r1, r4, r10)
                if (r11 != r0) goto L46
                goto L61
            L46:
                l51.b r11 = r5.f16352f
                c42.r1 r11 = r11.f50768f
                j51.a r1 = r5.f16357k
                c42.i<java.lang.Boolean> r4 = r1.d
                c42.i<java.lang.Boolean> r1 = r1.e
                com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d$e$a r6 = new com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d$e$a
                r6.<init>(r5, r2)
                c42.i1 r11 = c42.r.j(r11, r4, r1, r6)
                r10.d = r3
                java.lang.Object r10 = c42.r.h(r11, r10)
                if (r10 != r0) goto L62
            L61:
                return r0
            L62:
                h12.f0 r10 = h12.f0.f36844a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$loadMaps$1", f = "RobotManageMapsViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class f extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ CacheLoadPolicy f16373f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CacheLoadPolicy cacheLoadPolicy, l12.d<? super f> dVar) {
            super(2, dVar);
            this.f16373f = cacheLoadPolicy;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new f(this.f16373f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((f) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                l51.b bVar = d.this.f16352f;
                this.d = 1;
                if (bVar.c(this.f16373f, this) == aVar) {
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
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$showPopover$1", f = "RobotManageMapsViewModel.kt", l = {393, 396, 399, 402}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class g extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ c e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f16374f;

        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f16375a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.DELETE_MAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.RENAME_MAP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.RULES_UPDATED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.FURNITURE_UPDATED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f16375a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c cVar, d dVar, l12.d<? super g> dVar2) {
            super(2, dVar2);
            this.e = cVar;
            this.f16374f = dVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new g(this.e, this.f16374f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((g) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
            if (r8.emit(r1, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
            if (r8.emit(r1, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
            if (r8.emit(r1, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
            if (r8.emit(r1, r7) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
            return r0;
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
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L1d
                if (r1 == r6) goto L13
                if (r1 == r5) goto L13
                if (r1 == r4) goto L13
                if (r1 != r3) goto L17
            L13:
                h12.r.b(r8)
                goto L84
            L17:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r7)
                return r2
            L1d:
                h12.r.b(r8)
                int[] r8 = com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.g.a.f16375a
                com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d$c r1 = r7.e
                int r1 = r1.ordinal()
                r8 = r8[r1]
                com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d r1 = r7.f16374f
                if (r8 == r6) goto L71
                if (r8 == r5) goto L5e
                if (r8 == r4) goto L4b
                if (r8 != r3) goto L47
                c42.u1 r8 = r1.f16363q
                pf0.c r1 = r1.f16355i
                com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.w.H4
                java.lang.String r1 = r1.d(r2)
                r7.d = r3
                java.lang.Object r7 = r8.emit(r1, r7)
                if (r7 != r0) goto L84
                goto L83
            L47:
                ma.e.o()
                return r2
            L4b:
                c42.u1 r8 = r1.f16363q
                pf0.c r1 = r1.f16355i
                com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.w.D2
                java.lang.String r1 = r1.d(r2)
                r7.d = r4
                java.lang.Object r7 = r8.emit(r1, r7)
                if (r7 != r0) goto L84
                goto L83
            L5e:
                c42.u1 r8 = r1.f16363q
                pf0.c r1 = r1.f16355i
                com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.w.O0
                java.lang.String r1 = r1.d(r2)
                r7.d = r5
                java.lang.Object r7 = r8.emit(r1, r7)
                if (r7 != r0) goto L84
                goto L83
            L71:
                c42.u1 r8 = r1.f16363q
                pf0.c r1 = r1.f16355i
                com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.w.J0
                java.lang.String r1 = r1.d(r2)
                r7.d = r6
                java.lang.Object r7 = r8.emit(r1, r7)
                if (r7 != r0) goto L84
            L83:
                return r0
            L84:
                h12.f0 r7 = h12.f0.f36844a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new b(null);
    }

    public d(i11.a aVar, q11.c cVar, l51.b bVar, h41.d dVar, i iVar, pf0.c cVar2, af1.i iVar2, j51.a aVar2, p11.b bVar2, iu0.r rVar, uf0.k kVar) {
        aVar.getClass();
        cVar.getClass();
        bVar.getClass();
        dVar.getClass();
        iVar.getClass();
        cVar2.getClass();
        iVar2.getClass();
        aVar2.getClass();
        bVar2.getClass();
        rVar.getClass();
        kVar.getClass();
        this.d = aVar;
        this.e = cVar;
        this.f16352f = bVar;
        this.f16353g = dVar;
        this.f16354h = iVar;
        this.f16355i = cVar2;
        this.f16356j = iVar2;
        this.f16357k = aVar2;
        this.f16358l = e0.d;
        f2 a13 = g2.a(new g01.d(h.b.f57897a, 0, null));
        this.f16359m = a13;
        this.f16360n = c42.r.d(a13);
        c42.i<p11.a> iVar3 = bVar2.f62602a;
        s9.a a14 = m9.v.a(this);
        a2.f10222a.getClass();
        this.f16361o = c42.r.D(iVar3, a14, a2.a.f10225c, null);
        this.f16362p = ((g01.d) a13.getValue()).f32620b;
        u1 b13 = w1.b(0, 0, null, 7);
        this.f16363q = b13;
        this.f16364r = c42.r.c(b13);
        this.f16365s = cVar2.d(j.f72016n0);
        this.f16366t = g0.c();
        g0.r(m9.v.a(this), null, null, new a(null), 3);
        this.f16367u = (rVar.b() || kVar.b()) ? w.P : w.O;
    }

    public final void S(CacheLoadPolicy cacheLoadPolicy) {
        if (this.f16358l.isEmpty()) {
            g0.r(m9.v.a(this), null, null, new C0568d(null), 3);
            return;
        }
        g0.r(m9.v.a(this), null, null, new e(this.f16358l.get(((g01.d) this.f16359m.getValue()).f32620b).f32613a, cacheLoadPolicy, null), 3);
    }

    public final void T(CacheLoadPolicy cacheLoadPolicy) {
        cacheLoadPolicy.getClass();
        if (this.f16366t.isCancelled()) {
            this.f16366t = g0.c();
        }
        this.f16366t.c(null);
        s9.a a13 = m9.v.a(this);
        if (this.f16366t.isCancelled()) {
            this.f16366t = g0.c();
        }
        g0.r(a13, this.f16366t, null, new f(cacheLoadPolicy, null), 2);
    }

    public final void U(g01.a aVar) {
        f2 f2Var;
        Object value;
        do {
            f2Var = this.f16359m;
            value = f2Var.getValue();
        } while (!f2Var.f(value, g01.d.a((g01.d) value, null, 0, aVar, 3)));
    }

    public final void V(c cVar) {
        g0.r(m9.v.a(this), null, null, new g(cVar, this, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/d$b;", "", "<init>", "()V", "", "MAX_MAP_COUNT", "I", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
