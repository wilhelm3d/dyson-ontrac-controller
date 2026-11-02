package com.dyson.mobile.android.cat6.traits.language;

import af1.i;
import c42.a2;
import c42.b2;
import c42.j;
import c42.q1;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.cat6.traits.language.ProductUILanguage;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import i12.e0;
import i12.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import l12.d;
import mm0.k;
import n12.e;
import org.json.JSONArray;
import org.json.JSONObject;
import pr.a;
import rz1.d0;
import rz1.l;
import rz1.t1;
import rz1.y;
import software.amazon.awssdk.crt.http.Http2StreamManagerOptions;
import ys.f;
import z32.c0;
import z32.g0;
import z60.u;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/b;", "Lds/c;", "Lz60/u;", "mqttMachine", "", "mqttRootTopicLevel", "serial", "Laf1/i;", "dispatcherProvider", "Lz32/c0;", "coroutineScope", "Lmm0/k;", "languageItemListFactory", "<init>", "(Lz60/u;Ljava/lang/String;Ljava/lang/String;Laf1/i;Lz32/c0;Lmm0/k;)V", "b", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b implements ds.c {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f12851l = 0;

    /* renamed from: a  reason: collision with root package name */
    public final u f12852a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12853b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12854c;
    public final i d;
    public final c0 e;

    /* renamed from: f  reason: collision with root package name */
    public final k f12855f;

    /* renamed from: g  reason: collision with root package name */
    public final ProductUILanguage.Mqtt f12856g;

    /* renamed from: h  reason: collision with root package name */
    public final u1 f12857h;

    /* renamed from: i  reason: collision with root package name */
    public final q1 f12858i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f12859j;

    /* renamed from: k  reason: collision with root package name */
    public final l f12860k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.cat6.traits.language.MqttLanguageSelectionController$1", f = "MqttLanguageSelectionController.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<c0, d<? super f0>, Object> {
        public int d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.cat6.traits.language.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0365a<T> implements j {
            public final /* synthetic */ b d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @e(c = "com.dyson.mobile.android.cat6.traits.language.MqttLanguageSelectionController$1$1", f = "MqttLanguageSelectionController.kt", l = {BR.isHelpClickable}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.cat6.traits.language.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0366a extends n12.c {
                public /* synthetic */ Object d;
                public final /* synthetic */ C0365a<T> e;

                /* renamed from: f  reason: collision with root package name */
                public int f12861f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0366a(C0365a<? super T> c0365a, d<? super C0366a> dVar) {
                    super(dVar);
                    this.e = c0365a;
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f12861f |= Integer.MIN_VALUE;
                    return this.e.emit(null, this);
                }
            }

            public C0365a(b bVar) {
                this.d = bVar;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(7:5|6|7|(1:(1:10)(2:21|22))(2:23|(3:25|26|(1:28))(2:29|30))|11|12|(2:18|19)(1:16)))|33|6|7|(0)(0)|11|12|(1:14)|18|19) */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
                r5 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
                r6 = h12.q.e;
                r5 = new h12.q.b(r5);
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
            @Override // c42.j
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(z60.z r6, l12.d<? super h12.f0> r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "Requesting supported UI languages via REQUEST-INFO [serial="
                    boolean r1 = r7 instanceof com.dyson.mobile.android.cat6.traits.language.b.a.C0365a.C0366a
                    if (r1 == 0) goto L15
                    r1 = r7
                    com.dyson.mobile.android.cat6.traits.language.b$a$a$a r1 = (com.dyson.mobile.android.cat6.traits.language.b.a.C0365a.C0366a) r1
                    int r2 = r1.f12861f
                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                    r4 = r2 & r3
                    if (r4 == 0) goto L15
                    int r2 = r2 - r3
                    r1.f12861f = r2
                    goto L1a
                L15:
                    com.dyson.mobile.android.cat6.traits.language.b$a$a$a r1 = new com.dyson.mobile.android.cat6.traits.language.b$a$a$a
                    r1.<init>(r5, r7)
                L1a:
                    java.lang.Object r7 = r1.d
                    m12.a r2 = m12.a.COROUTINE_SUSPENDED
                    int r3 = r1.f12861f
                    r4 = 1
                    if (r3 == 0) goto L30
                    if (r3 != r4) goto L29
                    h12.r.b(r7)     // Catch: java.lang.Throwable -> L6e
                    goto L69
                L29:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r5)
                    r5 = 0
                    return r5
                L30:
                    h12.r.b(r7)
                    z60.z r7 = z60.z.CONNECTED
                    if (r6 != r7) goto L86
                    com.dyson.mobile.android.cat6.traits.language.b r5 = r5.d
                    int r6 = h12.q.e     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r6 = r5.f12854c     // Catch: java.lang.Throwable -> L6e
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
                    r7.<init>(r0)     // Catch: java.lang.Throwable -> L6e
                    r7.append(r6)     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r6 = "]"
                    r7.append(r6)     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L6e
                    com.dyson.mobile.android.logging.Logger.a(r6)     // Catch: java.lang.Throwable -> L6e
                    z60.u r6 = r5.f12852a     // Catch: java.lang.Throwable -> L6e
                    ds.b r7 = new ds.b     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r0 = r5.f12853b     // Catch: java.lang.Throwable -> L6e
                    java.lang.String r5 = r5.f12854c     // Catch: java.lang.Throwable -> L6e
                    r7.<init>(r0, r5)     // Catch: java.lang.Throwable -> L6e
                    dz1.b r5 = r6.b(r7)     // Catch: java.lang.Throwable -> L6e
                    r1.f12861f = r4     // Catch: java.lang.Throwable -> L6e
                    java.lang.Object r5 = g42.b.a(r5, r1)     // Catch: java.lang.Throwable -> L6e
                    if (r5 != r2) goto L69
                    return r2
                L69:
                    h12.f0 r5 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L6e
                    int r6 = h12.q.e     // Catch: java.lang.Throwable -> L6e
                    goto L77
                L6e:
                    r5 = move-exception
                    int r6 = h12.q.e
                    h12.q$b r6 = new h12.q$b
                    r6.<init>(r5)
                    r5 = r6
                L77:
                    java.lang.Throwable r5 = h12.q.b(r5)
                    if (r5 == 0) goto L83
                    boolean r6 = r5 instanceof java.util.concurrent.CancellationException
                    if (r6 != 0) goto L82
                    goto L83
                L82:
                    throw r5
                L83:
                    h12.f0 r5 = h12.f0.f36844a
                    return r5
                L86:
                    h12.f0 r5 = h12.f0.f36844a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.cat6.traits.language.b.a.C0365a.emit(z60.z, l12.d):java.lang.Object");
            }
        }

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                b bVar = b.this;
                c42.i n13 = c42.r.n(cd.b.o(bVar.f12852a.a()));
                C0365a c0365a = new C0365a(bVar);
                this.d = 1;
                if (n13.collect(c0365a, this) == aVar) {
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
    /* loaded from: classes2.dex */
    public static final class c implements Function1<JSONObject, dz1.u<? extends List<? extends ProductUILanguage>>> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends List<? extends ProductUILanguage>> invoke(JSONObject jSONObject) {
            j12.b bVar;
            JSONArray optJSONArray;
            jSONObject.getClass();
            JSONObject jSONObject2 = jSONObject;
            pr.k.f64751a.getClass();
            a.C1954a c1954a = pr.a.f64654b;
            List<String> list = pr.k.f64752b;
            c1954a.getClass();
            list.getClass();
            ArrayList arrayList = null;
            if (!list.isEmpty()) {
                for (String str : list) {
                    pr.a.f64654b.getClass();
                    if (x12.r.c(jSONObject2.optString("msg"), str)) {
                        break;
                    }
                }
            }
            jSONObject2 = null;
            pr.a aVar = jSONObject2 != null ? new pr.a(jSONObject2, null) : null;
            if (aVar == null || (optJSONArray = aVar.f64655a.optJSONArray("supported-ui-lang")) == null) {
                bVar = null;
            } else {
                j12.b bVar2 = new j12.b(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i13 = 0; i13 < length; i13++) {
                    String optString = optJSONArray.optString(i13);
                    if (optString != null && optString.length() != 0) {
                        bVar2.add(optString);
                    }
                }
                bVar = s.a(bVar2);
            }
            if (bVar != null) {
                ArrayList a13 = b.this.f12855f.a(bVar);
                arrayList = new ArrayList(i12.u.o(a13, 10));
                Iterator it = a13.iterator();
                while (it.hasNext()) {
                    mm0.j jVar = (mm0.j) it.next();
                    arrayList.add(new ProductUILanguage.Mqtt(jVar.f54419a, jVar.f54421c));
                }
            }
            return arrayList != null ? dz1.r.D(arrayList) : y.d;
        }
    }

    static {
        new C0367b(null);
    }

    public b(u uVar, String str, String str2, i iVar, c0 c0Var, k kVar) {
        uVar.getClass();
        str.getClass();
        str2.getClass();
        iVar.getClass();
        c0Var.getClass();
        kVar.getClass();
        this.f12852a = uVar;
        this.f12853b = str;
        this.f12854c = str2;
        this.d = iVar;
        this.e = c0Var;
        this.f12855f = kVar;
        this.f12856g = new ProductUILanguage.Mqtt("en-gb", kVar.f54422a.a("en-gb").f57925b);
        u1 b13 = w1.b(0, 0, null, 7);
        this.f12857h = b13;
        g0.r(c0Var, iVar.c(), null, new a(null), 2);
        dz1.r<JSONObject> messages = uVar.getMessages();
        final c cVar = new c();
        dz1.r y13 = messages.y(new iz1.l(cVar) { // from class: ds.e
            public final /* synthetic */ Function1 d;

            {
                cVar.getClass();
                this.d = cVar;
            }

            @Override // iz1.l
            /* renamed from: apply */
            public final /* synthetic */ Object mo7apply(Object obj) {
                return this.d.invoke(obj);
            }
        }, Http2StreamManagerOptions.DEFAULT_MAX);
        y13.getClass();
        c42.b o13 = cd.b.o(y13);
        a2.f10222a.getClass();
        b2 b2Var = a2.a.f10224b;
        q1 C = c42.r.C(o13, c0Var, b2Var, 1);
        this.f12858i = C;
        this.f12859j = c42.r.D(C, c0Var, b2Var, e0.d);
        this.f12860k = cd.b.p(pr.l.b(uVar, iVar.c(), c0Var, b13, new c91.c(this, 17)));
    }

    @Override // ds.c
    public final void a(ProductUILanguage productUILanguage, f fVar) {
        productUILanguage.getClass();
        g0.r(this.e, this.d.c(), null, new com.dyson.mobile.android.cat6.traits.language.c(this, productUILanguage, fVar, null), 2);
    }

    @Override // ds.c
    public final r1 b(String str) {
        ds.d dVar = new ds.d(this.f12858i, this, str);
        a2.f10222a.getClass();
        return c42.r.D(dVar, this.e, a2.a.f10224b, this.f12856g);
    }

    @Override // ds.c
    public final d0 c(ProductUILanguage productUILanguage) {
        t1 U = this.f12860k.U(1L);
        df0.d dVar = new df0.d(new a42.b(27, productUILanguage, this), 23);
        b.a aVar = kz1.b.f50218a;
        return new d0(U, dVar, false);
    }

    @Override // ds.c
    public final dz1.r<xk0.f<ProductUILanguage>> d() {
        return this.f12860k;
    }

    @Override // ds.c
    public final r1 e() {
        return this.f12859j;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/b$b;", "", "<init>", "()V", "", "MACHINE_CURRENT_LANGUAGE", "Ljava/lang/String;", "DEFAULT_ONBOARDING_LANGUAGE_CODE", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.cat6.traits.language.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0367b {
        public /* synthetic */ C0367b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0367b() {
        }
    }
}
