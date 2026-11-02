package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import android.net.Uri;
import c42.f2;
import c42.g2;
import c42.q1;
import c42.r;
import c42.r1;
import c42.u1;
import c42.w1;
import cc0.z;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import h12.m;
import h12.q;
import h12.t;
import kotlin.Metadata;
import m9.u;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/e;", "Lm9/u;", "Landroid/net/Uri;", "appLinkUriData", "Lyz/c;", "alexaInitiatedAppLinkRequestRepository", "Lu81/a;", "privacyPolicyProvider", "Lpf0/c;", "localisationManager", "Lhj/e;", "trackingManager", "Ld00/h;", "paramsMapper", "<init>", "(Landroid/net/Uri;Lyz/c;Lu81/a;Lpf0/c;Lhj/e;Ld00/h;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends u {
    public final yz.c d;
    public final u81.a e;

    /* renamed from: f  reason: collision with root package name */
    public final pf0.c f13031f;

    /* renamed from: g  reason: collision with root package name */
    public final hj.e f13032g;

    /* renamed from: h  reason: collision with root package name */
    public final yz.g f13033h;

    /* renamed from: i  reason: collision with root package name */
    public final b.a.C0383a f13034i;

    /* renamed from: j  reason: collision with root package name */
    public final t f13035j;

    /* renamed from: k  reason: collision with root package name */
    public final f2 f13036k;

    /* renamed from: l  reason: collision with root package name */
    public final f2 f13037l;

    /* renamed from: m  reason: collision with root package name */
    public final r1 f13038m;

    /* renamed from: n  reason: collision with root package name */
    public final u1 f13039n;

    /* renamed from: o  reason: collision with root package name */
    public final q1 f13040o;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        e a(Uri uri);
    }

    public e(Uri uri, yz.c cVar, u81.a aVar, pf0.c cVar2, hj.e eVar, d00.h hVar) {
        Object bVar;
        yz.g gVar;
        String queryParameter;
        cVar.getClass();
        aVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        hVar.getClass();
        this.d = cVar;
        this.e = aVar;
        this.f13031f = cVar2;
        this.f13032g = eVar;
        if (uri == null) {
            gVar = null;
        } else {
            try {
                int i13 = q.e;
                queryParameter = uri.getQueryParameter("response_type");
            } catch (Throwable th2) {
                int i14 = q.e;
                bVar = new q.b(th2);
            }
            if (queryParameter == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String queryParameter2 = uri.getQueryParameter("client_id");
            if (queryParameter2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String queryParameter3 = uri.getQueryParameter("scope");
            if (queryParameter3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String queryParameter4 = uri.getQueryParameter(PayPalNewShippingAddressReviewViewKt.STATE);
            if (queryParameter4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String queryParameter5 = uri.getQueryParameter("redirect_uri");
            if (queryParameter5 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar = new yz.g(queryParameter, queryParameter2, queryParameter3, queryParameter4, queryParameter5, uri.getQueryParameter("code_challenge"), uri.getQueryParameter("code_challenge_method"));
            gVar = (yz.g) (bVar instanceof q.b ? null : bVar);
        }
        this.f13033h = gVar;
        b.a.C0383a c0383a = new b.a.C0383a(false, true);
        this.f13034i = c0383a;
        this.f13035j = m.b(new z(this, 5));
        this.f13036k = g2.a(null);
        f2 a13 = g2.a(new b.a(this.f13031f.c(R.string.voiceControl_alexa_consentScreenDescription), c0383a, c0383a));
        this.f13037l = a13;
        this.f13038m = r.d(a13);
        u1 b13 = w1.b(0, 0, null, 7);
        this.f13039n = b13;
        this.f13040o = r.c(b13);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(7:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:37|38|(2:40|41))|19|20|(4:25|(2:27|(2:29|(2:31|(1:33))(1:34))(1:35))|12|13)(1:24)))|44|6|7|(0)(0)|19|20|(1:22)|25|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r4 = h12.q.e;
        r10 = new h12.q.b(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e r8, boolean r9, n12.c r10) {
        /*
            c42.f2 r0 = r8.f13037l
            h12.t r1 = r8.f13035j
            boolean r2 = r10 instanceof d00.f
            if (r2 == 0) goto L17
            r2 = r10
            d00.f r2 = (d00.f) r2
            int r3 = r2.f22460h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f22460h = r3
            goto L1c
        L17:
            d00.f r2 = new d00.f
            r2.<init>(r8, r10)
        L1c:
            java.lang.Object r10 = r2.f22458f
            m12.a r3 = m12.a.COROUTINE_SUSPENDED
            int r4 = r2.f22460h
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L42
            if (r4 == r7) goto L36
            if (r4 != r6) goto L30
            h12.r.b(r10)
            goto Lab
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r8)
            return r5
        L36:
            boolean r9 = r2.d
            java.lang.Object r4 = r2.e
            l12.d r4 = (l12.d) r4
            h12.r.b(r10)     // Catch: java.lang.Throwable -> L40
            goto L58
        L40:
            r10 = move-exception
            goto L5b
        L42:
            h12.r.b(r10)
            int r10 = h12.q.e     // Catch: java.lang.Throwable -> L40
            yz.c r10 = r8.d     // Catch: java.lang.Throwable -> L40
            yz.g r4 = r8.f13033h     // Catch: java.lang.Throwable -> L40
            r2.e = r5     // Catch: java.lang.Throwable -> L40
            r2.d = r9     // Catch: java.lang.Throwable -> L40
            r2.f22460h = r7     // Catch: java.lang.Throwable -> L40
            java.lang.Object r10 = r10.a(r9, r4, r2)     // Catch: java.lang.Throwable -> L40
            if (r10 != r3) goto L58
            goto Lad
        L58:
            int r4 = h12.q.e     // Catch: java.lang.Throwable -> L40
            goto L63
        L5b:
            int r4 = h12.q.e
            h12.q$b r4 = new h12.q$b
            r4.<init>(r10)
            r10 = r4
        L63:
            java.lang.Throwable r4 = h12.q.b(r10)
            if (r4 == 0) goto L6f
            boolean r5 = r4 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L6e
            goto L6f
        L6e:
            throw r4
        L6f:
            boolean r4 = r10 instanceof h12.q.b
            if (r4 != 0) goto Lab
            r4 = r10
            yz.f r4 = (yz.f) r4
            boolean r5 = r4 instanceof yz.f.b
            if (r5 == 0) goto La2
            yz.f$b r4 = (yz.f.b) r4
            java.lang.String r4 = r4.f91191a
            boolean r5 = v32.y.A(r4)
            if (r5 != 0) goto L98
            c42.u1 r8 = r8.f13039n
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a$a r0 = new com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a$a
            r0.<init>(r4)
            r2.e = r10
            r2.d = r9
            r2.f22460h = r6
            java.lang.Object r8 = r8.emit(r0, r2)
            if (r8 != r3) goto Lab
            goto Lad
        L98:
            java.lang.Object r8 = r1.getValue()
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$b r8 = (com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b.C0384b) r8
            r0.setValue(r8)
            goto Lab
        La2:
            java.lang.Object r8 = r1.getValue()
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$b r8 = (com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b.C0384b) r8
            r0.setValue(r8)
        Lab:
            h12.f0 r3 = h12.f0.f36844a
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e.S(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e, boolean, n12.c):java.lang.Object");
    }

    public static final void T(e eVar, b.a.C0383a c0383a, b.a.C0383a c0383a2) {
        Object value;
        b bVar;
        f2 f2Var = eVar.f13037l;
        do {
            value = f2Var.getValue();
            bVar = (b) value;
            if (bVar instanceof b.a) {
                String str = ((b.a) bVar).f13018a;
                c0383a.getClass();
                c0383a2.getClass();
                bVar = new b.a(str, c0383a, c0383a2);
            }
        } while (!f2Var.f(value, bVar));
    }

    public static final void U(e eVar, boolean z13) {
        Object value;
        b bVar;
        f2 f2Var = eVar.f13037l;
        do {
            value = f2Var.getValue();
            bVar = (b) value;
            if (bVar instanceof b.C0384b) {
                b.C0384b c0384b = (b.C0384b) bVar;
                bVar = new b.C0384b(c0384b.f13023a, c0384b.f13024b, c0384b.f13025c, z13);
            }
        } while (!f2Var.f(value, bVar));
    }
}
