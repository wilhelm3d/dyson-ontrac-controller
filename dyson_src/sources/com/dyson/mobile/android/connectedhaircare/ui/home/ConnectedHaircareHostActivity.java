package com.dyson.mobile.android.connectedhaircare.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.connectedhaircare.ui.home.navigation.ConnectedHaircareHomeDestination;
import ef1.h;
import f.g;
import f.j;
import f.x;
import fm1.o0;
import g.f;
import in0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ny.u;
import pa.c;
import sw.b;
import we1.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/ConnectedHaircareHostActivity;", "Lf/g;", "<init>", "()V", "a", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectedHaircareHostActivity extends g {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12940m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public ConnectedHaircareHomeDestination f12941j;

    /* renamed from: k  reason: collision with root package name */
    public b f12942k;

    /* renamed from: l  reason: collision with root package name */
    public h f12943l;

    public static final void Z0(ConnectedHaircareHostActivity connectedHaircareHostActivity, ny.a aVar) {
        connectedHaircareHostActivity.getClass();
        if (aVar == ny.a.RESULT_OK) {
            connectedHaircareHostActivity.setResult(-1, new Intent());
        }
        connectedHaircareHostActivity.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y0(androidx.compose.runtime.Composer r14, int r15) {
        /*
            r13 = this;
            r0 = 442274922(0x1a5c946a, float:4.5614822E-23)
            androidx.compose.runtime.a r11 = r14.k(r0)
            boolean r14 = r11.D(r13)
            r0 = 2
            if (r14 == 0) goto L10
            r14 = 4
            goto L11
        L10:
            r14 = r0
        L11:
            r14 = r14 | r15
            r1 = r14 & 3
            r2 = 1
            r3 = 0
            if (r1 == r0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r3
        L1b:
            r14 = r14 & r2
            boolean r14 = r11.t(r14, r0)
            if (r14 == 0) goto L66
            u3.p1 r14 = androidx.compose.runtime.b.f3172a
            y9.y0[] r14 = new y9.y0[r3]
            y9.q0 r1 = im1.zb.A(r14, r11)
            com.dyson.mobile.android.connectedhaircare.ui.home.navigation.ConnectedHaircareHomeDestination r2 = r13.f12941j
            if (r2 == 0) goto L5f
            boolean r14 = r11.D(r1)
            boolean r0 = r11.D(r13)
            r14 = r14 | r0
            java.lang.Object r0 = r11.B()
            if (r14 != 0) goto L46
            androidx.compose.runtime.Composer$a r14 = androidx.compose.runtime.Composer.f3140a
            r14.getClass()
            androidx.compose.runtime.Composer$a$a r14 = androidx.compose.runtime.Composer.a.f3142b
            if (r0 != r14) goto L50
        L46:
            l2.b r0 = new l2.b
            r14 = 19
            r0.<init>(r14, r1, r13)
            r11.u(r0)
        L50:
            r10 = r0
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r12 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            aa.f0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L69
        L5f:
            java.lang.String r13 = "destination"
            x12.r.i(r13)
            r13 = 0
            throw r13
        L66:
            r11.J()
        L69:
            androidx.compose.runtime.f r14 = r11.c0()
            if (r14 == 0) goto L76
            ny.u r0 = new ny.u
            r0.<init>(r13, r15)
            r14.d = r0
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhaircare.ui.home.ConnectedHaircareHostActivity.Y0(androidx.compose.runtime.Composer, int):void");
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method to create ConnectedHaircareHomeNavigationActivity";
        Bundle a14 = a13.a("COORDINATOR_ID", "DESTINATION");
        String y13 = o0.y("COORDINATOR_ID", a14);
        b.f77093r.getClass();
        in0.a.e.getClass();
        b bVar = (b) a.C1330a.a(y13);
        if (bVar == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        this.f12942k = bVar;
        this.f12943l = bVar.f77096i.a();
        Object a15 = k7.b.a(a14, "DESTINATION", ConnectedHaircareHomeDestination.class);
        if (a15 == null) {
            c.w("DESTINATION was null");
            return;
        }
        this.f12941j = (ConnectedHaircareHomeDestination) ((Parcelable) a15);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        f.a(this, new c4.c(158859546, true, new u(this, 0, (byte) 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/ConnectedHaircareHostActivity$a;", "", "<init>", "()V", "", "DESTINATION", "Ljava/lang/String;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, ConnectedHaircareHomeDestination connectedHaircareHomeDestination) {
            context.getClass();
            str.getClass();
            connectedHaircareHomeDestination.getClass();
            Intent putExtra = new Intent(context, ConnectedHaircareHostActivity.class).putExtra("COORDINATOR_ID", str).putExtra("DESTINATION", connectedHaircareHomeDestination);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
