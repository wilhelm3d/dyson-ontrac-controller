package com.dyson.mobile.android.connectionjourney.nonconnected;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import b30.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.locateserial.LocateMachineSerialFragment;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f.j;
import f.x;
import f20.c1;
import h12.e;
import h12.f0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.g;
import w00.i;
import we1.a;
import x12.p;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/SerialNumberBasedMachineRegistrationActivity;", "Ll/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SerialNumberBasedMachineRegistrationActivity extends l.b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f13602j = new a(null);

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, SerialNumberBasedMachineRegistrationActivity.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((SerialNumberBasedMachineRegistrationActivity) this.receiver).onBackPressed();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends x12.a implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, SerialNumberBasedMachineRegistrationActivity.class, "onSupportNavigateUp", "onSupportNavigateUp()Z", 8);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((SerialNumberBasedMachineRegistrationActivity) this.d).onSupportNavigateUp();
            return f0.f36844a;
        }
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        Fragment D = getSupportFragmentManager().D(R.id.serial_number_based_registration_nav_host);
        if (D != null) {
            if (D instanceof LocateMachineSerialFragment) {
                finish();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        i.c(this).e.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle extras = getIntent().getExtras();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(extras);
        b13.f85710b = "Activity cannot be started without machine type and variant";
        Bundle a13 = b13.a("machineDescriptor");
        Serializable c13 = k7.b.c(a13, "machineCategory", MachineCategory.class);
        if (c13 == null) {
            pa.c.w("machineCategory was null");
            return;
        }
        Serializable c14 = k7.b.c(a13, "machineDescriptor", MachineDescriptor.class);
        ((c1) g.d(this, R.layout.activity_serial_number_based_machine_registration)).e.setContent(new c4.c(1293652076, true, new f(this, 0)));
        Fragment D = getSupportFragmentManager().D(R.id.serial_number_based_registration_nav_host);
        D.getClass();
        androidx.navigation.fragment.a.a((NavHostFragment) D).p(R.navigation.nav_graph_serial_number_based_registration, k7.c.a(new h12.p("machineCategory", (MachineCategory) c13), new h12.p("machineDescriptor", (MachineDescriptor) c14)));
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/SerialNumberBasedMachineRegistrationActivity$a;", "", "<init>", "()V", "", "EXTRA_MACHINE_CATEGORY", "Ljava/lang/String;", "EXTRA_MACHINE_DESCRIPTOR", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
