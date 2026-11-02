package com.dyson.mobile.android.connectionjourney.changewifijourney;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.ble.BleUserGuidanceStepsActivity;
import com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds.TroubleshootNdsGuidanceActivity;
import com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds.navigation.destination.TroubleshootNdsDestination$TroubleshootNdsGuidance;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.support.wifi.WifiCompatibilityCheckActivity;
import i20.m;
import i20.t3;
import i20.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u50.j;
import x12.r;
import xy1.h;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/a;", "Lw00/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements w00.b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0413a f13401c = new C0413a(null);
    public static a d;

    /* renamed from: a  reason: collision with root package name */
    public h20.e f13402a;

    /* renamed from: b  reason: collision with root package name */
    public MachineDescriptor f13403b;

    public static void f(Activity activity, String str, ActivityResultLauncher activityResultLauncher) {
        activity.getClass();
        WifiCompatibilityCheckActivity.f16897m.getClass();
        Intent intent = new Intent(activity, WifiCompatibilityCheckActivity.class);
        if (str != null) {
            intent.putExtra("machineSerial", str);
        }
        if (activityResultLauncher != null) {
            activityResultLauncher.a(intent);
        } else {
            activity.startActivity(intent);
        }
    }

    @Override // w00.b
    public final void a(BleUserGuidanceStepsActivity bleUserGuidanceStepsActivity) {
        c(bleUserGuidanceStepsActivity, "");
    }

    public final MachineDescriptor b() {
        MachineDescriptor machineDescriptor = this.f13403b;
        if (machineDescriptor != null) {
            return machineDescriptor;
        }
        r.i("machineDescriptor");
        throw null;
    }

    public final void c(Activity activity, String str) {
        if (b().getMachineCategory() != MachineCategory.EC && b().getMachineCategory() != MachineCategory.CATEGORY5 && (b().getMachineCategory() != MachineCategory.FLOORCARE || !j.f(b()))) {
            ChangeWifiActivity.f13383m.getClass();
            activity.getClass();
            activity.startActivity(new Intent(activity, ChangeWifiActivity.class));
            return;
        }
        ChangeWifiNdsActivity.f13387r.getClass();
        activity.getClass();
        str.getClass();
        Intent intent = new Intent(activity, ChangeWifiNdsActivity.class);
        intent.putExtra("machineSerial", str);
        Intent addFlags = intent.addFlags(67108864);
        addFlags.getClass();
        activity.startActivity(addFlags);
    }

    public final void d(Activity activity, String str, ActivityResultLauncher<Intent> activityResultLauncher) {
        activity.getClass();
        if (b().getMachineCategory() != MachineCategory.CATEGORY5 || activityResultLauncher == null) {
            BleUserGuidanceStepsActivity.a aVar = BleUserGuidanceStepsActivity.f13919r;
            MachineDescriptor b13 = b();
            h20.b bVar = h20.b.CHANGE_WIFI;
            aVar.getClass();
            activity.startActivity(BleUserGuidanceStepsActivity.a.a(activity, b13, bVar, str, 2132083504, false));
            return;
        }
        TroubleshootNdsGuidanceActivity.a aVar2 = TroubleshootNdsGuidanceActivity.f13935k;
        TroubleshootNdsDestination$TroubleshootNdsGuidance troubleshootNdsDestination$TroubleshootNdsGuidance = TroubleshootNdsDestination$TroubleshootNdsGuidance.INSTANCE;
        aVar2.getClass();
        troubleshootNdsDestination$TroubleshootNdsGuidance.getClass();
        Intent intent = new Intent(activity, TroubleshootNdsGuidanceActivity.class);
        intent.putExtra("NAVIGATION_DESTINATION", troubleshootNdsDestination$TroubleshootNdsGuidance);
        activityResultLauncher.a(intent);
    }

    public final void e(Activity activity, String str, MachineDescriptor machineDescriptor) {
        activity.getClass();
        str.getClass();
        machineDescriptor.getClass();
        h20.d dVar = new h20.d(0);
        Context applicationContext = activity.getApplicationContext();
        applicationContext.getClass();
        dVar.f37168a = new m(applicationContext, true);
        Context applicationContext2 = activity.getApplicationContext();
        applicationContext2.getClass();
        dVar.d = new u30.a(applicationContext2);
        dVar.f37169b = new i20.f(str, machineDescriptor);
        h.a(m.class, dVar.f37168a);
        h.a(i20.f.class, dVar.f37169b);
        if (dVar.f37170c == null) {
            dVar.f37170c = new t3();
        }
        h.a(u30.a.class, dVar.d);
        h20.e eVar = new h20.e(dVar.f37168a, dVar.f37169b, dVar.f37170c, dVar.d);
        m mVar = eVar.f37171a;
        Context context = mVar.f40321a;
        h.b(context);
        u0.b(mVar, context);
        this.f13402a = eVar;
        this.f13403b = machineDescriptor;
        c(activity, str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/a$a;", "", "<init>", "()V", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/a;", "instance", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/a;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.changewifijourney.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0413a {
        public /* synthetic */ C0413a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a() {
            a aVar = a.d;
            if (aVar == null) {
                a aVar2 = new a();
                a.d = aVar2;
                return aVar2;
            }
            return aVar;
        }

        private C0413a() {
        }
    }
}
