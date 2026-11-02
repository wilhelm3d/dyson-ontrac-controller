package com.dyson.mobile.android.home;

import android.net.Uri;
import androidx.lifecycle.ViewModelProvider;
import b0.y1;
import c42.f2;
import c42.g2;
import c42.r1;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.support.forsta.ForstaSurveyConfig;
import eo0.r;
import h12.f0;
import h12.p;
import h12.y;
import hj.e;
import i12.q0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l12.f;
import lj.a;
import m9.u;
import m9.v;
import mj.c;
import n30.q;
import n30.s;
import w80.j0;
import y9.w;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.z;
import z80.b;
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003&'(B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/dyson/mobile/android/home/i;", "Lm9/u;", "Lhj/e;", "trackingManager", "Leo0/b;", "deepLinkIntentBroadcaster", "Lno0/h;", "salesforceMarketingCloudProvider", "Lq51/a;", "salesforceMarketingCloudSupportChecker", "Lle1/a;", "questionnaireDataStore", "Lon0/a;", "hasUnreadMessagesUseCase", "Lxd0/c;", "launchConditionChecker", "Lph/e;", "dysonLinkOptions", "Lg71/a;", "appFeedbackManager", "Ld91/b;", "systemManager", "Laf1/i;", "dispatcherProvider", "Lyi0/f;", "machineManager", "Ln30/s;", "nonSerialRegistrationHandler", "Lcom/dyson/mobile/android/support/deeplink/c;", "supportDeeplinkNavigator", "Lw71/a;", "featureSupportRepository", "Lh80/c;", "dynamicContentDeeplinkParser", "Leo0/n;", "notificationRegistrationManager", "<init>", "(Lhj/e;Leo0/b;Lno0/h;Lq51/a;Lle1/a;Lon0/a;Lxd0/c;Lph/e;Lg71/a;Ld91/b;Laf1/i;Lyi0/f;Ln30/s;Lcom/dyson/mobile/android/support/deeplink/c;Lw71/a;Lh80/c;Leo0/n;)V", "c", "a", "b", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i extends u {
    public final f2 A;
    public final r1 B;
    public d2 C;
    public final e D;
    public final hj.e d;
    public final eo0.b e;

    /* renamed from: f  reason: collision with root package name */
    public final no0.h f14181f;

    /* renamed from: g  reason: collision with root package name */
    public final le1.a f14182g;

    /* renamed from: h  reason: collision with root package name */
    public final on0.a f14183h;

    /* renamed from: i  reason: collision with root package name */
    public final xd0.c f14184i;

    /* renamed from: j  reason: collision with root package name */
    public final ph.e f14185j;

    /* renamed from: k  reason: collision with root package name */
    public final g71.a f14186k;

    /* renamed from: l  reason: collision with root package name */
    public final d91.b f14187l;

    /* renamed from: m  reason: collision with root package name */
    public final af1.i f14188m;

    /* renamed from: n  reason: collision with root package name */
    public final yi0.f f14189n;

    /* renamed from: o  reason: collision with root package name */
    public final s f14190o;

    /* renamed from: p  reason: collision with root package name */
    public final com.dyson.mobile.android.support.deeplink.c f14191p;

    /* renamed from: q  reason: collision with root package name */
    public final w71.a f14192q;

    /* renamed from: r  reason: collision with root package name */
    public final h80.c f14193r;

    /* renamed from: s  reason: collision with root package name */
    public final f2 f14194s;

    /* renamed from: t  reason: collision with root package name */
    public final r1 f14195t;

    /* renamed from: u  reason: collision with root package name */
    public final b42.c f14196u;

    /* renamed from: v  reason: collision with root package name */
    public final c42.e f14197v;

    /* renamed from: w  reason: collision with root package name */
    public final f2 f14198w;

    /* renamed from: x  reason: collision with root package name */
    public final r1 f14199x;

    /* renamed from: y  reason: collision with root package name */
    public final f2 f14200y;

    /* renamed from: z  reason: collision with root package name */
    public final r1 f14201z;

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0091\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/dyson/mobile/android/home/i$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lhj/e;", "trackingManager", "Leo0/b;", "deepLinkIntentBroadcaster", "Lno0/h;", "salesforceMarketingCloudProvider", "Lq51/a;", "salesforceMarketingCloudSupportChecker", "Lle1/a;", "questionnaireDataStore", "Lxd0/c;", "launchConditionChecker", "Lon0/a;", "hasUnreadMessagesUseCase", "Lph/e;", "dysonLinkOptions", "Lg71/a;", "appFeedbackManager", "Ld91/b;", "systemManager", "Laf1/i;", "dispatcherProvider", "Lyi0/f;", "machineManager", "Ln30/s;", "nonSerialRegistrationHandler", "Leo0/n;", "notificationRegistrationManager", "Lcom/dyson/mobile/android/support/deeplink/c;", "supportDeeplinkNavigator", "Lw71/a;", "featureSupportRepository", "Lh80/c;", "dynamicContentDeeplinkParser", "<init>", "(Lhj/e;Leo0/b;Lno0/h;Lq51/a;Lle1/a;Lxd0/c;Lon0/a;Lph/e;Lg71/a;Ld91/b;Laf1/i;Lyi0/f;Ln30/s;Leo0/n;Lcom/dyson/mobile/android/support/deeplink/c;Lw71/a;Lh80/c;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final hj.e f14212a;

        /* renamed from: b  reason: collision with root package name */
        public final eo0.b f14213b;

        /* renamed from: c  reason: collision with root package name */
        public final no0.h f14214c;
        public final q51.a d;
        public final le1.a e;

        /* renamed from: f  reason: collision with root package name */
        public final xd0.c f14215f;

        /* renamed from: g  reason: collision with root package name */
        public final on0.a f14216g;

        /* renamed from: h  reason: collision with root package name */
        public final ph.e f14217h;

        /* renamed from: i  reason: collision with root package name */
        public final g71.a f14218i;

        /* renamed from: j  reason: collision with root package name */
        public final d91.b f14219j;

        /* renamed from: k  reason: collision with root package name */
        public final af1.i f14220k;

        /* renamed from: l  reason: collision with root package name */
        public final yi0.f f14221l;

        /* renamed from: m  reason: collision with root package name */
        public final s f14222m;

        /* renamed from: n  reason: collision with root package name */
        public final eo0.n f14223n;

        /* renamed from: o  reason: collision with root package name */
        public final com.dyson.mobile.android.support.deeplink.c f14224o;

        /* renamed from: p  reason: collision with root package name */
        public final w71.a f14225p;

        /* renamed from: q  reason: collision with root package name */
        public final h80.c f14226q;

        public b(hj.e eVar, eo0.b bVar, no0.h hVar, q51.a aVar, le1.a aVar2, xd0.c cVar, on0.a aVar3, ph.e eVar2, g71.a aVar4, d91.b bVar2, af1.i iVar, yi0.f fVar, s sVar, eo0.n nVar, com.dyson.mobile.android.support.deeplink.c cVar2, w71.a aVar5, h80.c cVar3) {
            eVar.getClass();
            bVar.getClass();
            hVar.getClass();
            aVar.getClass();
            aVar2.getClass();
            cVar.getClass();
            aVar3.getClass();
            eVar2.getClass();
            aVar4.getClass();
            bVar2.getClass();
            iVar.getClass();
            fVar.getClass();
            sVar.getClass();
            nVar.getClass();
            cVar2.getClass();
            aVar5.getClass();
            cVar3.getClass();
            this.f14212a = eVar;
            this.f14213b = bVar;
            this.f14214c = hVar;
            this.d = aVar;
            this.e = aVar2;
            this.f14215f = cVar;
            this.f14216g = aVar3;
            this.f14217h = eVar2;
            this.f14218i = aVar4;
            this.f14219j = bVar2;
            this.f14220k = iVar;
            this.f14221l = fVar;
            this.f14222m = sVar;
            this.f14223n = nVar;
            this.f14224o = cVar2;
            this.f14225p = aVar5;
            this.f14226q = cVar3;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new i(this.f14212a, this.f14213b, this.f14214c, this.d, this.e, this.f14216g, this.f14215f, this.f14217h, this.f14218i, this.f14219j, this.f14220k, this.f14221l, this.f14222m, this.f14224o, this.f14225p, this.f14226q, this.f14223n);
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14233a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.ALREADY_ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.REGISTER_SUCCESSFUL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14233a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/home/i$e", "Leo0/c;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements eo0.c {
        public e() {
        }

        @Override // eo0.c
        public final boolean a(eo0.a aVar) {
            String str;
            aVar.getClass();
            if (aVar instanceof r) {
                r rVar = (r) aVar;
                i iVar = i.this;
                iVar.getClass();
                if (rVar.f28221j == null) {
                    String str2 = rVar.f28217f;
                    if (str2 == null || (str = rVar.f28218g) == null) {
                        return true;
                    }
                    iVar.T(new a.g(rVar.e, str2, str));
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeViewModel$emitEvent$1", f = "HomeViewModel.kt", l = {548}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class f extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f14235f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar, l12.d<? super f> dVar) {
            super(2, dVar);
            this.f14235f = aVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new f(this.f14235f, dVar);
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
                h12.r.b(obj);
                b42.c cVar = i.this.f14196u;
                this.d = 1;
                if (cVar.b(this.f14235f, this) == aVar) {
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

    public i(hj.e eVar, eo0.b bVar, no0.h hVar, q51.a aVar, le1.a aVar2, on0.a aVar3, xd0.c cVar, ph.e eVar2, g71.a aVar4, d91.b bVar2, af1.i iVar, yi0.f fVar, s sVar, com.dyson.mobile.android.support.deeplink.c cVar2, w71.a aVar5, h80.c cVar3, eo0.n nVar) {
        eVar.getClass();
        bVar.getClass();
        hVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        cVar.getClass();
        no0.f fVar2 = cVar.f87399b;
        eVar2.getClass();
        aVar4.getClass();
        bVar2.getClass();
        iVar.getClass();
        fVar.getClass();
        sVar.getClass();
        cVar2.getClass();
        aVar5.getClass();
        cVar3.getClass();
        nVar.getClass();
        this.d = eVar;
        this.e = bVar;
        this.f14181f = hVar;
        this.f14182g = aVar2;
        this.f14183h = aVar3;
        this.f14184i = cVar;
        this.f14185j = eVar2;
        this.f14186k = aVar4;
        this.f14187l = bVar2;
        this.f14188m = iVar;
        this.f14189n = fVar;
        this.f14190o = sVar;
        this.f14191p = cVar2;
        this.f14192q = aVar5;
        this.f14193r = cVar3;
        f2 a13 = g2.a(new c(null, new v90.i(aVar3.f60582a, false, 2, null), null, null, null, 29, null));
        this.f14194s = a13;
        this.f14195t = c42.r.d(a13);
        b42.c b13 = b42.m.b(-2, null, null, 6);
        this.f14196u = b13;
        this.f14197v = c42.r.B(b13);
        Boolean bool = Boolean.FALSE;
        f2 a14 = g2.a(bool);
        this.f14198w = a14;
        this.f14199x = c42.r.d(a14);
        f2 a15 = g2.a(bool);
        this.f14200y = a15;
        this.f14201z = c42.r.d(a15);
        f2 a16 = g2.a(bool);
        this.A = a16;
        this.B = c42.r.d(a16);
        if (aVar.a()) {
            if (hVar.e()) {
                hVar.a().m(new w60.d(new vk0.e(22), 5)).l(new re0.c(5)).z(c02.a.f10004c).r(fz1.a.a()).v();
            }
            if (cVar.d.f76036a < 33 || os0.d.a(cVar.f87398a, "android.permission.POST_NOTIFICATIONS") || fVar2.h() || fVar2.g() != null) {
                if (fVar2.b() == null) {
                    o81.a c13 = cVar.f87400c.c();
                    c13.getClass();
                    if (c13.b().b()) {
                        T(a.e.f14207a);
                    }
                }
                V();
            } else {
                T(a.f.f14208a);
            }
        } else {
            V();
        }
        s9.a a17 = v.a(this);
        h42.b c14 = iVar.c();
        j0 j0Var = new j0(z.Z0);
        c14.getClass();
        g0.r(a17, f.a.C1558a.d(j0Var, c14), null, new l(this, null), 2);
        nVar.a();
        this.D = new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.home.i r4, java.lang.String r5, n12.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof w80.k0
            if (r0 == 0) goto L16
            r0 = r6
            w80.k0 r0 = (w80.k0) r0
            int r1 = r0.f85391f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f85391f = r1
            goto L1b
        L16:
            w80.k0 r0 = new w80.k0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f85391f
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            h12.r.b(r6)
            goto L3f
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r4)
            r4 = 0
            return r4
        L31:
            h12.r.b(r6)
            yi0.f r6 = r4.f14189n
            r0.f85391f = r3
            java.lang.Object r5 = r6.e(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r5 = 0
            r4.X(r3, r5, r5)
            h12.f0 r4 = h12.f0.f36844a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.i.S(com.dyson.mobile.android.home.i, java.lang.String, n12.c):java.lang.Object");
    }

    public static Map U(String str) {
        a.j.f52159a.getClass();
        return q0.f(new p(a.j.f52162f.f41702a, str), new p(a.j.f52160b.f41702a, MachineCategory.FORMULATION.getShortName()));
    }

    public final void T(a aVar) {
        g0.r(v.a(this), null, null, new f(aVar, null), 3);
    }

    public final void V() {
        T(new a.d(null, null, 3, null));
        g0.r(v.a(this), this.f14188m.c(), null, new j(this, null), 2);
        g0.r(v.a(this), null, null, new n(this, null), 3);
        g0.r(v.a(this), null, null, new m(this, null), 3);
    }

    public final void W(qe1.a aVar) {
        if (aVar != qe1.a.EMPTY) {
            ij.f a13 = new mj.c(c.a.QUESTIONNAIRE_BANNER).a();
            e.a aVar2 = hj.e.f38312g;
            this.d.g(a13, null);
        }
        while (true) {
            f2 f2Var = this.f14194s;
            Object value = f2Var.getValue();
            qe1.a aVar3 = aVar;
            if (f2Var.f(value, c.a((c) value, aVar3, null, null, null, null, 30))) {
                return;
            }
            aVar = aVar3;
        }
    }

    public final void X(boolean z13, boolean z14, boolean z15) {
        this.f14198w.l(null, Boolean.valueOf(z13));
        this.f14200y.l(null, Boolean.valueOf(z14));
        f2 f2Var = this.A;
        if (z15 && !((Boolean) f2Var.getValue()).booleanValue()) {
            ij.f a13 = new mj.c(c.a.PRODUCT_ADDED).a();
            e.a aVar = hj.e.f38312g;
            this.d.g(a13, null);
        }
        f2Var.l(null, Boolean.valueOf(z15));
    }

    public final void Z(z80.b bVar) {
        while (true) {
            f2 f2Var = this.f14194s;
            Object value = f2Var.getValue();
            z80.b bVar2 = bVar;
            if (f2Var.f(value, c.a((c) value, null, null, null, bVar2, null, 23))) {
                return;
            }
            bVar = bVar2;
        }
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.e.b(this.D);
    }

    /* loaded from: classes2.dex */
    public interface a {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$a;", "Lcom/dyson/mobile/android/home/i$a;", "Landroid/net/Uri;", "deepLinkUri", "<init>", "(Landroid/net/Uri;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.home.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0461a implements a {

            /* renamed from: a  reason: collision with root package name */
            public final Uri f14202a;

            public C0461a(Uri uri) {
                uri.getClass();
                this.f14202a = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0461a) && this.f14202a.equals(((C0461a) obj).f14202a);
            }

            public final int hashCode() {
                return this.f14202a.hashCode();
            }

            public final String toString() {
                return "AppLinkReceived(deepLinkUri=" + this.f14202a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$b;", "Lcom/dyson/mobile/android/home/i$a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f14203a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -479489123;
            }

            public final String toString() {
                return "ForceAppUpdateRequired";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$c;", "Lcom/dyson/mobile/android/home/i$a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f14204a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -276839451;
            }

            public final String toString() {
                return "ShowAppReviewDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$e;", "Lcom/dyson/mobile/android/home/i$a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class e implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f14207a = new e();

            private e() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -631804996;
            }

            public final String toString() {
                return "ShowMarketingConsentScreen";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$f;", "Lcom/dyson/mobile/android/home/i$a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class f implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f14208a = new f();

            private f() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 619979103;
            }

            public final String toString() {
                return "ShowNotificationConsentScreen";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$g;", "Lcom/dyson/mobile/android/home/i$a;", "", "trackingId", "webUrl", "notificationType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class g implements a {

            /* renamed from: a  reason: collision with root package name */
            public final String f14209a;

            /* renamed from: b  reason: collision with root package name */
            public final String f14210b;

            /* renamed from: c  reason: collision with root package name */
            public final String f14211c;

            public g(String str, String str2, String str3) {
                d72.a.v(str, str2, str3);
                this.f14209a = str;
                this.f14210b = str2;
                this.f14211c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    return this.f14209a.equals(gVar.f14209a) && this.f14210b.equals(gVar.f14210b) && this.f14211c.equals(gVar.f14211c);
                }
                return false;
            }

            public final int hashCode() {
                return this.f14211c.hashCode() + y.c(this.f14209a.hashCode() * 31, 31, this.f14210b);
            }

            public final String toString() {
                return ie.a.h(ma.e.m("ShowSalesforceNotificationWebView(trackingId=", this.f14209a, ", webUrl=", this.f14210b, ", notificationType="), this.f14211c, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/home/i$a$d;", "Lcom/dyson/mobile/android/home/i$a;", "", "serialNumber", "selectedTab", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            public final String f14205a;

            /* renamed from: b  reason: collision with root package name */
            public final String f14206b;

            public /* synthetic */ d(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return x12.r.c(this.f14205a, dVar.f14205a) && x12.r.c(this.f14206b, dVar.f14206b);
                }
                return false;
            }

            public final int hashCode() {
                String str = this.f14205a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f14206b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return y1.j("ShowHomeScreen(serialNumber=", this.f14205a, ", selectedTab=", this.f14206b, ")");
            }

            public d(String str, String str2) {
                this.f14205a = str;
                this.f14206b = str2;
            }

            public d() {
                this(null, null, 3, null);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/home/i$c;", "", "Lqe1/a;", "questionnaireConfirmation", "Lv90/i;", "inboxState", "Ldj/b;", "aiAssistantState", "Lz80/b;", "nonSerialRegistrationState", "Lcom/dyson/mobile/android/home/i$c$a;", "feedbackSurveyInvitationDialogState", "<init>", "(Lqe1/a;Lv90/i;Ldj/b;Lz80/b;Lcom/dyson/mobile/android/home/i$c$a;)V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final qe1.a f14227a;

        /* renamed from: b  reason: collision with root package name */
        public final v90.i f14228b;

        /* renamed from: c  reason: collision with root package name */
        public final dj.b f14229c;
        public final z80.b d;
        public final a e;

        /* loaded from: classes2.dex */
        public interface a {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/home/i$c$a$a;", "Lcom/dyson/mobile/android/home/i$c$a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.dyson.mobile.android.home.i$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0462a implements a {

                /* renamed from: a  reason: collision with root package name */
                public static final C0462a f14230a = new C0462a();

                private C0462a() {
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0462a);
                }

                public final int hashCode() {
                    return 1369270084;
                }

                public final String toString() {
                    return "Dismissed";
                }
            }

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/home/i$c$a$b;", "Lcom/dyson/mobile/android/home/i$c$a;", "", "", "machineTypeNames", "Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;", "surveyConfig", "<init>", "(Ljava/util/List;Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class b implements a {

                /* renamed from: a  reason: collision with root package name */
                public final List<String> f14231a;

                /* renamed from: b  reason: collision with root package name */
                public final ForstaSurveyConfig f14232b;

                public b(List<String> list, ForstaSurveyConfig forstaSurveyConfig) {
                    list.getClass();
                    forstaSurveyConfig.getClass();
                    this.f14231a = list;
                    this.f14232b = forstaSurveyConfig;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof b) {
                        b bVar = (b) obj;
                        return this.f14231a.equals(bVar.f14231a) && this.f14232b == bVar.f14232b;
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f14232b.hashCode() + (this.f14231a.hashCode() * 31);
                }

                public final String toString() {
                    return "ShowDialog(machineTypeNames=" + this.f14231a + ", surveyConfig=" + this.f14232b + ")";
                }
            }
        }

        public /* synthetic */ c(qe1.a aVar, v90.i iVar, dj.b bVar, z80.b bVar2, a aVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? qe1.a.EMPTY : aVar, (i13 & 2) != 0 ? new v90.i(false, false, 3, null) : iVar, (i13 & 4) != 0 ? new dj.b(false, 1, null) : bVar, (i13 & 8) != 0 ? b.c.f92133a : bVar2, (i13 & 16) != 0 ? a.C0462a.f14230a : aVar2);
        }

        public static c a(c cVar, qe1.a aVar, v90.i iVar, dj.b bVar, z80.b bVar2, a aVar2, int i13) {
            if ((i13 & 1) != 0) {
                aVar = cVar.f14227a;
            }
            qe1.a aVar3 = aVar;
            if ((i13 & 2) != 0) {
                iVar = cVar.f14228b;
            }
            v90.i iVar2 = iVar;
            if ((i13 & 4) != 0) {
                bVar = cVar.f14229c;
            }
            dj.b bVar3 = bVar;
            if ((i13 & 8) != 0) {
                bVar2 = cVar.d;
            }
            z80.b bVar4 = bVar2;
            if ((i13 & 16) != 0) {
                aVar2 = cVar.e;
            }
            a aVar4 = aVar2;
            cVar.getClass();
            aVar3.getClass();
            iVar2.getClass();
            bVar3.getClass();
            bVar4.getClass();
            aVar4.getClass();
            return new c(aVar3, iVar2, bVar3, bVar4, aVar4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f14227a == cVar.f14227a && x12.r.c(this.f14228b, cVar.f14228b) && x12.r.c(this.f14229c, cVar.f14229c) && x12.r.c(this.d, cVar.d) && x12.r.c(this.e, cVar.e);
            }
            return false;
        }

        public final int hashCode() {
            int c13 = w.c((this.f14228b.hashCode() + (this.f14227a.hashCode() * 31)) * 31, 31, this.f14229c.f23818a);
            return this.e.hashCode() + ((this.d.hashCode() + c13) * 31);
        }

        public final String toString() {
            return "State(questionnaireConfirmation=" + this.f14227a + ", inboxState=" + this.f14228b + ", aiAssistantState=" + this.f14229c + ", nonSerialRegistrationState=" + this.d + ", feedbackSurveyInvitationDialogState=" + this.e + ")";
        }

        public c(qe1.a aVar, v90.i iVar, dj.b bVar, z80.b bVar2, a aVar2) {
            aVar.getClass();
            iVar.getClass();
            bVar.getClass();
            bVar2.getClass();
            aVar2.getClass();
            this.f14227a = aVar;
            this.f14228b = iVar;
            this.f14229c = bVar;
            this.d = bVar2;
            this.e = aVar2;
        }

        public c() {
            this(null, null, null, null, null, 31, null);
        }
    }
}
