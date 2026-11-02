package com.dyson.mobile.android.applink;

import af1.i;
import android.annotation.SuppressLint;
import android.net.Uri;
import com.dyson.mobile.android.connectionjourney.applink.DevicePairingParameters;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import m9.u;
import qh.j;
import uj.g;
import yi0.f;
import z32.c0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/applink/a;", "Lm9/u;", "Lqh/j;", "accountManager", "Lte1/a;", "appInitCoordinator", "Laf1/i;", "dispatcherProvider", "Lhj/e;", "trackingManager", "Lyi0/f;", "machineManager", "Landroid/net/Uri;", "appLinkUri", "<init>", "(Lqh/j;Lte1/a;Laf1/i;Lhj/e;Lyi0/f;Landroid/net/Uri;)V", "b", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"NullSafeMutableLiveData"})
/* loaded from: classes2.dex */
public final class a extends u {
    public final i d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final f f12310f;

    /* renamed from: g  reason: collision with root package name */
    public final Uri f12311g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f12312h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a<f0> f12313i;

    /* renamed from: j  reason: collision with root package name */
    public final xf1.a<AppLinkIntent> f12314j;

    /* renamed from: k  reason: collision with root package name */
    public final xf1.a<Uri> f12315k;

    /* renamed from: l  reason: collision with root package name */
    public final xf1.a<String> f12316l;

    /* renamed from: m  reason: collision with root package name */
    public DevicePairingParameters f12317m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.applink.AppLinkEntryViewModel$1", f = "AppLinkEntryViewModel.kt", l = {BR.item}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.applink.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0337a extends n12.i implements Function2<c0, d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ j f12318f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ te1.a f12319g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0337a(j jVar, te1.a aVar, d<? super C0337a> dVar) {
            super(2, dVar);
            this.f12318f = jVar;
            this.f12319g = aVar;
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new C0337a(this.f12318f, this.f12319g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((C0337a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
            if (uj.g.e(r8) == true) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
            if (uj.g.c(r8) == true) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
            if (uj.g.a(r8) == true) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
            r8 = r7.e;
            r8 = com.dyson.mobile.android.applink.a.S(r8, r8.f12312h);
            r3 = r7.e.f12311g;
            com.dyson.mobile.android.logging.Logger.a("User is not logged in, queueing " + r8 + " app link for post-login handling: " + r3);
            r7.e.f12314j.setValue(new com.dyson.mobile.android.applink.AppLinkIntent(r7.e.f12312h, null, 2, null));
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x013e, code lost:
            if (uj.g.e(r8) == true) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0150, code lost:
            if (uj.g.c(r8) == true) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
            if (uj.g.a(r8) == true) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
            r8 = r7.e;
            r8 = com.dyson.mobile.android.applink.a.S(r8, r8.f12312h);
            r3 = r7.e.f12311g;
            com.dyson.mobile.android.logging.Logger.a("User is not logged in, queueing " + r8 + " app link for post-login handling: " + r3);
            r7.e.f12314j.setValue(new com.dyson.mobile.android.applink.AppLinkIntent(r7.e.f12312h, null, 2, null));
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 592
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.applink.a.C0337a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @wy1.a
    /* loaded from: classes2.dex */
    public interface b {
        a a(Uri uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (new v32.l("/callback/alexa/.+/link").a(r6) == true) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (uj.g.a(r8) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (new v32.l("/add/").a(r6) == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(qh.j r3, te1.a r4, af1.i r5, hj.e r6, yi0.f r7, android.net.Uri r8) {
        /*
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r2.<init>()
            r2.d = r5
            r2.e = r6
            r2.f12310f = r7
            r2.f12311g = r8
            r5 = 0
            if (r8 == 0) goto L76
            uj.g r6 = uj.g.f82158a
            r6.getClass()
            java.lang.String r6 = r8.getPath()
            r7 = 1
            if (r6 == 0) goto L37
            v32.l r0 = new v32.l
            java.lang.String r1 = "/add/"
            r0.<init>(r1)
            boolean r6 = r0.a(r6)
            if (r6 != r7) goto L37
            goto L77
        L37:
            java.lang.String r6 = r8.getPath()
            if (r6 == 0) goto L4b
            v32.l r0 = new v32.l
            java.lang.String r1 = "/callback/alexa/.+/link"
            r0.<init>(r1)
            boolean r6 = r0.a(r6)
            if (r6 != r7) goto L4b
            goto L77
        L4b:
            boolean r6 = uj.g.g(r8)
            if (r6 != 0) goto L77
            boolean r6 = uj.g.b(r8)
            if (r6 != 0) goto L77
            boolean r6 = uj.g.d(r8)
            if (r6 != 0) goto L77
            boolean r6 = uj.g.e(r8)
            if (r6 != 0) goto L77
            boolean r6 = uj.g.f(r8)
            if (r6 != 0) goto L77
            boolean r6 = uj.g.c(r8)
            if (r6 != 0) goto L77
            boolean r6 = uj.g.a(r8)
            if (r6 == 0) goto L76
            goto L77
        L76:
            r8 = r5
        L77:
            r2.f12312h = r8
            xf1.a r6 = new xf1.a
            r6.<init>()
            r2.f12313i = r6
            xf1.a r6 = new xf1.a
            r6.<init>()
            r2.f12314j = r6
            xf1.a r6 = new xf1.a
            r6.<init>()
            r2.f12315k = r6
            xf1.a r6 = new xf1.a
            r6.<init>()
            r2.f12316l = r6
            s9.a r6 = m9.v.a(r2)
            com.dyson.mobile.android.applink.a$a r7 = new com.dyson.mobile.android.applink.a$a
            r7.<init>(r3, r4, r5)
            r2 = 3
            z32.g0.r(r6, r5, r5, r7, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.applink.a.<init>(qh.j, te1.a, af1.i, hj.e, yi0.f, android.net.Uri):void");
    }

    public static final String S(a aVar, Uri uri) {
        aVar.getClass();
        g.f82158a.getClass();
        return g.e(uri) ? "recipe" : g.c(uri) ? "device invitation" : g.a(uri) ? "alexa initiated linking" : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
        if (r13 != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(com.dyson.mobile.android.applink.a r12, n12.c r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.applink.a.T(com.dyson.mobile.android.applink.a, n12.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(com.dyson.mobile.android.connectionjourney.applink.DevicePairingParameters r6, n12.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uj.b
            if (r0 == 0) goto L13
            r0 = r7
            uj.b r0 = (uj.b) r0
            int r1 = r0.f82150f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82150f = r1
            goto L18
        L13:
            uj.b r0 = new uj.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f82150f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            h12.r.b(r7)
            goto L47
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            return r4
        L2e:
            h12.r.b(r7)
            if (r6 == 0) goto L4e
            af1.i r7 = r5.d
            h42.b r7 = r7.c()
            uj.c r2 = new uj.c
            r2.<init>(r5, r6, r4)
            r0.f82150f = r3
            java.lang.Object r7 = z32.g0.v(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            goto L4f
        L4e:
            r5 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.applink.a.U(com.dyson.mobile.android.connectionjourney.applink.DevicePairingParameters, n12.c):java.lang.Object");
    }
}
