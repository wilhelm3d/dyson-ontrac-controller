package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c42.q1;
import com.brightcove.player.C;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.CacheLoadPolicy;
import com.dyson.mobile.android.robot.newsystem.home.tabs.maps.ManageMapsTabApiError;
import com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a;
import com.dyson.mobile.android.robot.newsystem.home.tabs.maps.b;
import e6.f;
import h12.f0;
import h12.r;
import i12.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l91.k;
import m9.v;
import n12.i;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import q11.a;
import q11.d;
import u3.h;
import u3.p1;
import x12.p;
import y01.j;
import z32.c0;
import z32.g0;
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final float f16347a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsTabKt$RobotManageMapsTabContent$2$1", f = "RobotManageMapsTab.kt", l = {118}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l91.g f16348f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ k f16349g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lh12/f0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsTabKt$RobotManageMapsTabContent$2$1$1", f = "RobotManageMapsTab.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0566a extends i implements Function2<String, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ l91.g e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ k f16350f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0566a(l91.g gVar, k kVar, l12.d<? super C0566a> dVar) {
                super(2, dVar);
                this.e = gVar;
                this.f16350f = kVar;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                C0566a c0566a = new C0566a(this.e, this.f16350f, dVar);
                c0566a.d = obj;
                return c0566a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, l12.d<? super f0> dVar) {
                return ((C0566a) create(str, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                k kVar = this.f16350f;
                l91.g.b(this.e, (String) this.d, kVar, 4);
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d dVar, l91.g gVar, k kVar, l12.d<? super a> dVar2) {
            super(2, dVar2);
            this.e = dVar;
            this.f16348f = gVar;
            this.f16349g = kVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(this.e, this.f16348f, this.f16349g, dVar);
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
                q1 q1Var = this.e.f16364r;
                C0566a c0566a = new C0566a(this.f16348f, this.f16349g, null);
                this.d = 1;
                if (c42.r.i(q1Var, c0566a, this) == aVar) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<com.dyson.mobile.android.robot.newsystem.home.tabs.maps.b, f0> {
        public b(Object obj) {
            super(1, obj, com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.class, "handleUiEvent", "handleUiEvent(Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsUiEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.robot.newsystem.home.tabs.maps.b bVar) {
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.b bVar2 = bVar;
            bVar2.getClass();
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d dVar = (com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d) this.receiver;
            q11.c cVar = dVar.e;
            if (bVar2.equals(b.d.f16340a)) {
                cVar.e.b(new d.b(false));
            } else if (bVar2.equals(b.a.f16337a)) {
                dVar.U(dVar.f16358l.size() >= 5 ? g01.a.CREATE_MAPS_LIMIT_REACHED : g01.a.CREATE_NEW_MAP);
            } else if (bVar2.equals(b.C0565b.f16338a)) {
                dVar.U(dVar.f16358l.size() > 1 ? g01.a.DELETE_MAP : g01.a.CANT_DELETE_MAP);
            } else if (bVar2 instanceof b.h) {
                int i13 = ((b.h) bVar2).f16345a;
                if (i13 != ((g01.d) dVar.f16360n.d.getValue()).f32620b && i13 >= 0 && i13 <= t.g(dVar.f16358l)) {
                    dVar.f16362p = i13;
                    dVar.U(g01.a.CHANGE_CURRENT_MAP);
                }
            } else if (bVar2 instanceof b.i) {
                ManageMapsTabApiError manageMapsTabApiError = ((b.i) bVar2).f16346a;
                if (manageMapsTabApiError == null) {
                    dVar.S(CacheLoadPolicy.CACHE_OR_REMOTE);
                } else if (manageMapsTabApiError instanceof ManageMapsTabApiError.PersistentMapApiError) {
                    dVar.S(CacheLoadPolicy.CACHE_OR_REMOTE);
                } else if (manageMapsTabApiError instanceof ManageMapsTabApiError.SetAsCurrentMapApiError) {
                    g0.r(v.a(dVar), null, null, new com.dyson.mobile.android.robot.newsystem.home.tabs.maps.e(dVar, null), 3);
                } else if (!(manageMapsTabApiError instanceof ManageMapsTabApiError.MapMetadataApiError)) {
                    ma.e.o();
                    return null;
                } else {
                    dVar.T(CacheLoadPolicy.CACHE_OR_REMOTE);
                }
            } else if (bVar2 instanceof b.g) {
                b.g gVar = (b.g) bVar2;
                String str = gVar.f16343a;
                String str2 = gVar.f16344b;
                List<g01.b> list = dVar.f16358l;
                ArrayList arrayList = new ArrayList();
                for (g01.b bVar3 : list) {
                    String str3 = bVar3.f32614b;
                    if (str3.equals(dVar.f16365s)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        arrayList.add(str3);
                    }
                }
                cVar.a(new a.n(str, str2, arrayList));
            } else if (bVar2 instanceof b.e) {
                cVar.a(new a.k(((b.e) bVar2).f16341a));
            } else if (bVar2 instanceof b.f) {
                cVar.a(new a.l(((b.f) bVar2).f16342a));
            } else if (!(bVar2 instanceof b.c)) {
                ma.e.o();
                return null;
            } else {
                cVar.a(new a.j(((b.c) bVar2).f16339a));
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C0567c extends p implements Function1<j, f0> {
        public C0567c(Object obj) {
            super(1, obj, com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.class, "trackMapViewConfig", "trackMapViewConfig(Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/MapViewConfigTracker;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(j jVar) {
            j jVar2 = jVar;
            jVar2.getClass();
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d dVar = (com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d) this.receiver;
            dVar.getClass();
            dVar.d.a(jVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends p implements Function1<com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.class, "handleAlertUiEvent", "handleAlertUiEvent(Lcom/dyson/mobile/android/robot/newsystem/home/tabs/maps/ManageMapsAlertUiEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a aVar) {
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a aVar2 = aVar;
            aVar2.getClass();
            com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d dVar = (com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d) this.receiver;
            dVar.getClass();
            if (aVar2.equals(a.c.f16335a)) {
                d51.a aVar3 = dVar.f16354h.f40721k;
                if (aVar3 != null) {
                    h.f(aVar3.j(), v.a(dVar), dVar.f16356j.c());
                }
            } else if (aVar2.equals(a.d.f16336a)) {
                g0.r(v.a(dVar), null, null, new f(dVar, dVar.f16358l.get(((g01.d) dVar.f16360n.d.getValue()).f32620b).f32613a, (g01.d) dVar.f16359m.getValue(), null), 3);
            } else if (aVar2.equals(a.b.f16334a)) {
                g0.r(v.a(dVar), null, null, new com.dyson.mobile.android.robot.newsystem.home.tabs.maps.e(dVar, null), 3);
            } else if (!aVar2.equals(a.C0564a.f16333a)) {
                ma.e.o();
                return null;
            } else {
                dVar.U(null);
            }
            return f0.f36844a;
        }
    }

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16351a;

        static {
            int[] iArr = new int[g01.a.values().length];
            try {
                iArr[g01.a.CANT_DELETE_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g01.a.CREATE_MAPS_LIMIT_REACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g01.a.CREATE_NEW_MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g01.a.DELETE_MAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g01.a.CHANGE_CURRENT_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f16351a = iArr;
        }
    }

    static {
        f.a aVar = e6.f.e;
        f16347a = 40.0f;
    }

    public static final void a(int i13, Composer composer, w12.a aVar, boolean z13) {
        androidx.compose.runtime.a k13 = composer.k(-677509099);
        int i14 = (k13.c(z13) ? 4 : 2) | i13 | (k13.D(aVar) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.a.a(null, null, null, null, null, null, c4.d.c(1458367717, new cc1.b(z13, aVar, 1), k13), k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new bv.b(z13, aVar, i13, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e2, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final g01.c.b r20, int r21, final i41.d r22, final g01.a r23, final kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.robot.newsystem.home.tabs.maps.b, h12.f0> r24, final kotlin.jvm.functions.Function1<? super y01.j, h12.f0> r25, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a, h12.f0> r26, final com.dyson.mobile.android.localisation.LocalisationKey r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.c.b(g01.c$b, int, i41.d, g01.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, com.dyson.mobile.android.localisation.LocalisationKey, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(g01.d dVar, p11.a aVar, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, LocalisationKey localisationKey, Composer composer, int i13) {
        int i14;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Modifier.a aVar2;
        androidx.compose.runtime.a k13 = composer.k(-1307243272);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? k13.Q(dVar) : k13.D(dVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            obj = aVar;
            i14 |= k13.Q(obj) ? 32 : 16;
        } else {
            obj = aVar;
        }
        int i15 = i14 | MLKEMEngine.KyberPolyBytes;
        if ((i13 & 3072) == 0) {
            obj2 = function1;
            i15 |= k13.D(obj2) ? 2048 : 1024;
        } else {
            obj2 = function1;
        }
        if ((i13 & 24576) == 0) {
            obj3 = function12;
            i15 |= k13.D(obj3) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        } else {
            obj3 = function12;
        }
        if ((196608 & i13) == 0) {
            obj4 = function13;
            i15 |= k13.D(obj4) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG;
        } else {
            obj4 = function13;
        }
        if ((1572864 & i13) == 0) {
            i15 |= (2097152 & i13) == 0 ? k13.Q(localisationKey) : k13.D(localisationKey) ? 1048576 : 524288;
        }
        if (k13.t(i15 & 1, (599187 & i15) != 599186)) {
            Modifier.a aVar3 = Modifier.f3231b;
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.j.a(androidx.compose.ui.platform.j.a(aVar3, "ManageMapsTab"), 0.0f, 0.0f, false, null, c4.d.c(-805255048, new f01.f(dVar, obj, obj2, obj3, obj4, localisationKey, 0), k13), k13, 196608, 30);
            aVar2 = aVar3;
        } else {
            k13.J();
            aVar2 = modifier;
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new bx1.d(dVar, aVar, aVar2, function1, function12, function13, localisationKey, i13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ea, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0107, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L41;
     */
    @android.annotation.SuppressLint({"ComposePreview"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(androidx.lifecycle.ViewModelProvider.Factory r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.c.d(androidx.lifecycle.ViewModelProvider$Factory, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(g01.a r18, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.robot.newsystem.home.tabs.maps.a, h12.f0> r19, androidx.compose.runtime.Composer r20, int r21) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.home.tabs.maps.c.e(g01.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
