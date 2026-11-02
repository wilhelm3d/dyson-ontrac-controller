package com.dyson.mobile.android.getconnected;

import a71.b;
import android.content.Context;
import b42.m;
import c42.f2;
import c42.g2;
import c42.r1;
import com.dyson.mobile.android.getconnected.b;
import com.dyson.mobile.android.getconnected.d;
import com.dyson.mobile.android.logging.Logger;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.q;
import h12.r;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.i;
import qh.j;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/getconnected/f;", "Lm9/u;", "Lhj/e;", "trackingManager", "Lph/e;", "dysonLinkOptions", "Ld91/b;", "systemManager", "Lz61/e;", "socialAuthRepository", "Lz61/c;", "socialAuthCallbackHandler", "Lqh/j;", "dysonAccountManager", "<init>", "(Lhj/e;Lph/e;Ld91/b;Lz61/e;Lz61/c;Lqh/j;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends u {
    public final hj.e d;
    public final ph.e e;

    /* renamed from: f  reason: collision with root package name */
    public final d91.b f14126f;

    /* renamed from: g  reason: collision with root package name */
    public final z61.e f14127g;

    /* renamed from: h  reason: collision with root package name */
    public final z61.c f14128h;

    /* renamed from: i  reason: collision with root package name */
    public final j f14129i;

    /* renamed from: j  reason: collision with root package name */
    public final b42.c f14130j;

    /* renamed from: k  reason: collision with root package name */
    public final c42.e f14131k;

    /* renamed from: l  reason: collision with root package name */
    public final af1.j f14132l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f14133m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f14134n;

    /* renamed from: o  reason: collision with root package name */
    public final f2 f14135o;

    /* renamed from: p  reason: collision with root package name */
    public final r1 f14136p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.getconnected.WelcomeScreenViewModel$1", f = "WelcomeScreenViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
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
            try {
                if (i13 == 0) {
                    r.b(obj);
                    f fVar = f.this;
                    int i14 = q.e;
                    z61.e eVar = fVar.f14127g;
                    this.d = 1;
                    obj = eVar.b(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    r.b(obj);
                }
                int i15 = q.e;
            } catch (Throwable th2) {
                int i16 = q.e;
                obj = new q.b(th2);
            }
            Throwable b13 = q.b(obj);
            if (b13 == null || !(b13 instanceof CancellationException)) {
                Throwable b14 = q.b(obj);
                if (b14 != null) {
                    Logger.b("Get social auth config failed", b14);
                }
                return f0.f36844a;
            }
            throw b13;
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14137a;

        static {
            int[] iArr = new int[a71.a.values().length];
            try {
                iArr[a71.a.STATE_MISMATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a71.a.NO_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a71.a.MISSING_SECURE_AUTH_PARAMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a71.a.INVALID_REDIRECT_URI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a71.a.AUTHORIZATION_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f14137a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.getconnected.WelcomeScreenViewModel$sendEvent$1", f = "WelcomeScreenViewModel.kt", l = {170}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ com.dyson.mobile.android.getconnected.d f14138f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.dyson.mobile.android.getconnected.d dVar, l12.d<? super c> dVar2) {
            super(2, dVar2);
            this.f14138f = dVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(this.f14138f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                b42.c cVar = f.this.f14130j;
                this.d = 1;
                if (cVar.b(this.f14138f, this) == aVar) {
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
    @n12.e(c = "com.dyson.mobile.android.getconnected.WelcomeScreenViewModel$startLoginJourney$1", f = "WelcomeScreenViewModel.kt", l = {BR.productName, BR.rangeAccessibility, BR.scanResult}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public Object d;
        public int e;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b71.e f14140g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Context f14141h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b71.e eVar, Context context, l12.d<? super d> dVar) {
            super(2, dVar);
            this.f14140g = eVar;
            this.f14141h = context;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(this.f14140g, this.f14141h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            if (r10 == r0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.getconnected.f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(hj.e eVar, ph.e eVar2, d91.b bVar, z61.e eVar3, z61.c cVar, j jVar) {
        eVar.getClass();
        bVar.getClass();
        eVar3.getClass();
        cVar.getClass();
        jVar.getClass();
        this.d = eVar;
        this.e = eVar2;
        this.f14126f = bVar;
        this.f14127g = eVar3;
        this.f14128h = cVar;
        this.f14129i = jVar;
        b42.c b13 = m.b(-2, null, null, 6);
        this.f14130j = b13;
        this.f14131k = c42.r.B(b13);
        this.f14132l = new af1.j(v.a(this));
        f2 a13 = g2.a(null);
        this.f14133m = a13;
        this.f14134n = c42.r.d(a13);
        f2 a14 = g2.a(null);
        this.f14135o = a14;
        this.f14136p = c42.r.d(a14);
        g0.r(v.a(this), null, null, new a(null), 3);
    }

    public final Object S(a71.b bVar, b71.e eVar, i iVar) {
        com.dyson.mobile.android.getconnected.b bVar2;
        f2 f2Var;
        Object value;
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            this.f14129i.j(new si.a(aVar.f413c, aVar.f411a, aVar.d), aVar.f412b);
            V(null);
            Object b13 = this.f14130j.b(d.C0455d.f14117a, iVar);
            return b13 == m12.a.COROUTINE_SUSPENDED ? b13 : f0.f36844a;
        }
        if (x12.r.c(bVar, b.C0015b.f414a)) {
            Logger.c("Social auth awaiting callback");
        } else if (!(bVar instanceof b.c)) {
            ma.e.o();
            return null;
        } else {
            V(null);
            int i13 = b.f14137a[((b.c) bVar).f415a.ordinal()];
            if (i13 == 1) {
                bVar2 = b.C0454b.e;
            } else if (i13 == 2 || i13 == 3) {
                bVar2 = eVar != null ? new b.d(eVar) : new b.c(eVar);
            } else if (i13 != 4 && i13 != 5) {
                ma.e.o();
                return null;
            } else {
                bVar2 = new b.c(eVar);
            }
            do {
                f2Var = this.f14135o;
                value = f2Var.getValue();
                com.dyson.mobile.android.getconnected.b bVar3 = (com.dyson.mobile.android.getconnected.b) value;
            } while (!f2Var.f(value, bVar2));
        }
        return f0.f36844a;
    }

    public final void T(com.dyson.mobile.android.getconnected.d dVar) {
        g0.r(v.a(this), null, null, new c(dVar, null), 3);
    }

    public final void U(b71.e eVar, Context context) {
        eVar.getClass();
        g0.r(v.a(this), null, null, new d(eVar, context, null), 3);
    }

    public final void V(b71.e eVar) {
        f2 f2Var;
        Object value;
        do {
            f2Var = this.f14133m;
            value = f2Var.getValue();
            b71.e eVar2 = (b71.e) value;
        } while (!f2Var.f(value, eVar));
    }

    @Override // m9.u
    public final void onCleared() {
        this.f14132l.a();
        super.onCleared();
    }

    public /* synthetic */ f(hj.e eVar, ph.e eVar2, d91.b bVar, z61.e eVar3, z61.c cVar, j jVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, (i13 & 2) != 0 ? null : eVar2, bVar, eVar3, cVar, jVar);
    }
}
