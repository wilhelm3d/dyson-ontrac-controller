package com.dyson.mobile.android.connectionjourney.userguidance.steps.ble;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.ble.a;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import h20.b;
import i12.q;
import in0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.c;
import l50.d;
import l50.e;
import l50.f;
import l50.g;
import l50.h;
import l50.j;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ble/BleUserGuidanceStepsActivity;", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/a;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BleUserGuidanceStepsActivity extends com.dyson.mobile.android.connectionjourney.userguidance.steps.a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f13919r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f13920s = 2132083505;

    /* renamed from: p  reason: collision with root package name */
    public b f13921p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f13922q;

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final Fragment c1(UserGuidanceView userGuidanceView) {
        userGuidanceView.getClass();
        a.C0450a c0450a = com.dyson.mobile.android.connectionjourney.userguidance.steps.ble.a.f13923h;
        MachineDescriptor machineDescriptor = this.f13905k;
        if (machineDescriptor == null) {
            r.i("machineDescriptor");
            throw null;
        }
        b bVar = this.f13921p;
        if (bVar == null) {
            r.i("cjCoordinatorType");
            throw null;
        }
        c0450a.getClass();
        com.dyson.mobile.android.connectionjourney.userguidance.steps.ble.a aVar = new com.dyson.mobile.android.connectionjourney.userguidance.steps.ble.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ap-user-guidance-extra", userGuidanceView);
        bundle.putSerializable("machineDescriptor", machineDescriptor);
        bundle.putString("cjtype", bVar.name());
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final h50.a d1(MachineDescriptor machineDescriptor) {
        new l50.b();
        if (r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_683.getTypeName())) {
            return new h();
        }
        String machineType = machineDescriptor.getMachineType();
        MachineType machineType2 = MachineType.MACHINE_692;
        if (r.c(machineType, machineType2.getTypeName()) && r.c(machineDescriptor.getMachineVariant(), i.VARIANT_692B.getValue())) {
            return new l50.i();
        }
        if (r.c(machineDescriptor.getMachineType(), machineType2.getTypeName()) && r.c(machineDescriptor.getMachineVariant(), i.VARIANT_692D.getValue())) {
            return new j();
        }
        if (!r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_1038.getTypeName()) && !r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_1040.getTypeName()) && !r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_1042.getTypeName()) && !r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_915.getTypeName()) && !r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_914.getTypeName())) {
            if ((!r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_804.getTypeName()) || !q.e0(new String[]{i.VARIANT_804A.getValue(), i.VARIANT_804B.getValue(), i.VARIANT_804E.getValue(), i.VARIANT_804F.getValue()}).contains(machineDescriptor.getMachineVariant())) && !r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_277.getTypeName())) {
                if (r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_276.getTypeName())) {
                    return new f();
                }
                if (machineDescriptor.getMachineCategory() == MachineCategory.EC) {
                    return new d();
                }
                if (machineDescriptor.getMachineCategory() == MachineCategory.LIGHTING) {
                    return new e();
                }
                if (machineDescriptor.getMachineCategory() == MachineCategory.WEARABLE_EC) {
                    return new l50.a();
                }
                if (machineDescriptor.getMachineCategory() == MachineCategory.HAIRCARE) {
                    return new c();
                }
                String machineType3 = machineDescriptor.getMachineType();
                String machineVariant = machineDescriptor.getMachineVariant();
                throw new IllegalStateException(("Unsupported type: " + machineType3 + " " + machineVariant).toString());
            }
            return new g();
        }
        return new g();
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        if (getSupportFragmentManager().I() == 0 && this.f13922q) {
            w00.i.c(this).e(this);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final void onComplete() {
        b bVar = this.f13921p;
        if (bVar != null) {
            bVar.getBaseCjCoordinator(this).a(this);
        } else {
            r.i("cjCoordinatorType");
            throw null;
        }
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("coordinatorType", "theme", "shouldCancelCJOnBack");
        String stringExtra = getIntent().getStringExtra("coordinatorType");
        if (stringExtra == null) {
            pa.c.p("Required value was null.");
            return;
        }
        this.f13921p = b.valueOf(stringExtra);
        this.f13922q = getIntent().getBooleanExtra("shouldCancelCJOnBack", false);
        setTheme(getIntent().getIntExtra("theme", f13920s));
        String string = a14.getString("toolbarTitle");
        if (string != null) {
            this.f13908n = string;
        }
        super.onCreate(bundle);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ble/BleUserGuidanceStepsActivity$a;", "", "<init>", "()V", "", "EXTRA_TOOLBAR_TITLE", "Ljava/lang/String;", "EXTRA_CJ_COORDINATOR_TYPE", "EXTRA_SHOULD_CANCEL_CJ_ON_BACK", "EXTRA_THEME", "", "DEFAULT_THEME", "I", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Activity activity, MachineDescriptor machineDescriptor, b bVar, String str, int i13, boolean z13) {
            activity.getClass();
            bVar.getClass();
            Intent putExtra = new Intent(activity, BleUserGuidanceStepsActivity.class).putExtra("extra-machine-descriptor", machineDescriptor).putExtra("coordinatorType", bVar.name()).putExtra("theme", i13).putExtra("shouldCancelCJOnBack", z13);
            putExtra.getClass();
            if (str != null) {
                putExtra.putExtra("toolbarTitle", str);
            }
            return putExtra;
        }

        private a() {
        }
    }
}
