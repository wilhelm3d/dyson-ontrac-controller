package com.dyson.mobile.android.machine.ui.settings.devicesharing;

import aa.f0;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.f;
import b31.j;
import com.dyson.mobile.android.machine.ui.settings.devicesharing.a;
import f.g;
import f.x;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import u3.p1;
import v32.y;
import y9.q0;
import y9.y0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/devicesharing/DeviceSharingActivity;", "Lf/g;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceSharingActivity extends g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15401k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public uf0.g f15402j;

    public final void Y0(String str, String str2, Composer composer, int i13) {
        androidx.compose.runtime.a aVar;
        Function1 jVar;
        q0 q0Var;
        androidx.compose.runtime.a k13 = composer.k(1072707757);
        int i14 = (k13.Q(str) ? 4 : 2) | i13 | (k13.Q(str2) ? 32 : 16) | (k13.D(this) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = b.f3172a;
            q0 A = zb.A(new y0[0], k13);
            Object obj = !y.A(str2) ? a.b.INSTANCE : a.d.INSTANCE;
            boolean D = ((i14 & 14) == 4) | k13.D(A) | ((i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) == 32) | k13.D(this);
            Object B = k13.B();
            if (!D) {
                Composer.f3140a.getClass();
                if (B != Composer.a.f3142b) {
                    jVar = B;
                    q0Var = A;
                    aVar = k13;
                    f0.a(q0Var, obj, null, null, null, null, null, null, null, jVar, aVar, 0);
                }
            }
            q0Var = A;
            jVar = new j(q0Var, str, str2, this, 15);
            k13.u(jVar);
            aVar = k13;
            f0.a(q0Var, obj, null, null, null, null, null, null, null, jVar, aVar, 0);
        } else {
            aVar = k13;
            aVar.J();
        }
        f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new hm0.a(this, str, str2, i13);
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        uf0.g a13 = uf0.g.a(this);
        if (a13 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        this.f15402j = a13;
        String stringExtra = getIntent().getStringExtra("MACHINE_SERIAL");
        String stringExtra2 = getIntent().getStringExtra("INVITATION_ID");
        if ((stringExtra == null || y.A(stringExtra)) && (stringExtra2 == null || y.A(stringExtra2))) {
            c.p("DeviceSharingActivity requires MACHINE_SERIAL or INVITATION_ID");
        } else if (cd.b.J(this)) {
            super.onCreate(null);
        } else {
            super.onCreate(bundle);
            x.e.getClass();
            f.j.a(this, x.a.a(0), x.a.a(0));
            g.f.a(this, new c4.c(404555325, true, new hm0.a(this, stringExtra, stringExtra2, 0, (byte) 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/devicesharing/DeviceSharingActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL", "Ljava/lang/String;", "INVITATION_ID", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
