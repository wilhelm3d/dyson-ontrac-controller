package com.dyson.mobile.android.backgroundexecution.deviceconnected;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import b7.l;
import bo.d;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.launch.LaunchActivity;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import cq.c;
import he0.e;
import iq.b;
import iq.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import mz1.i;
import nz1.w;
import r60.a;
import uf0.a0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/deviceconnected/BluetoothConnectedForegroundService;", "Landroid/app/Service;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BluetoothConnectedForegroundService extends Service {

    /* renamed from: g  reason: collision with root package name */
    public static final a f12835g = new a(null);
    public final b d = new c().a();
    public i e;

    /* renamed from: f  reason: collision with root package name */
    public PowerManager.WakeLock f12836f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        Object obj;
        Object obj2;
        Object obj3;
        intent.getClass();
        Logger.a("Bluetooth Sync Foreground Service onStartCommand Called.");
        Object systemService = getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "DysonLink:ForegroundWakeLock");
        this.f12836f = newWakeLock;
        if (newWakeLock != null) {
            newWakeLock.acquire(600000L);
        }
        cq.c.f22087a.getClass();
        c.a.a(intent);
        BluetoothDevice bluetoothDevice = (BluetoothDevice) c7.c.a(intent, "BluetoothDevice", BluetoothDevice.class);
        int notificationId = ao.a.BACKGROUND_SYNC.getNotificationId();
        b bVar = this.d;
        d dVar = bVar.f42452f;
        r60.a aVar = bVar.e;
        int i15 = d.f8222b;
        dVar.b(false);
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, LaunchActivity.class), 67108864);
        l lVar = new l(this, bo.a.BACKGROUND_SYNC.getChannelId());
        lVar.e = l.c(bVar.f42455i);
        String address = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        List<a.b> a13 = aVar.a();
        Iterator<T> it = bVar.f42449a.f90155b.j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            MachineDefinition machineDefinition = (MachineDefinition) obj;
            Iterator<T> it2 = a13.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (((a.b) obj3).f70496a.equals(machineDefinition.d)) {
                    break;
                }
            }
            a.b bVar2 = (a.b) obj3;
            if (bVar2 != null ? bVar2.f70497b.equals(address) : false) {
                break;
            }
        }
        MachineDefinition machineDefinition2 = (MachineDefinition) obj;
        lVar.f7193f = l.c(machineDefinition2 != null ? machineDefinition2.j() : null);
        lVar.f7195h = activity;
        lVar.P.icon = R.drawable.ic_dyson_d_circle;
        lVar.f7200m = -1;
        Notification a14 = lVar.a();
        a14.getClass();
        startForeground(notificationId, a14);
        Logger.a("Bluetooth Sync Foreground Service Started");
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        String address2 = bluetoothDevice != null ? bluetoothDevice.getAddress() : null;
        Iterator<T> it3 = aVar.a().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (((a.b) obj2).f70497b.equals(address2)) {
                break;
            }
        }
        a.b bVar3 = (a.b) obj2;
        w o13 = bVar.f42453g.a(applicationContext, new a0.b(bVar3 != null ? bVar3.f70496a : null)).o(new io.a(new iq.a(bVar, 1), 13));
        e eVar = new e(this, 4);
        b.a aVar2 = kz1.b.f50218a;
        this.e = (i) new nz1.i(o13, eVar).v();
        return 2;
    }

    public final void onTimeout(int i13, int i14) {
        super.onTimeout(i13, i14);
        PowerManager.WakeLock wakeLock = this.f12836f;
        if (wakeLock != null) {
            wakeLock.release();
        }
        i iVar = this.e;
        if (iVar != null) {
            jz1.d.dispose(iVar);
        }
        stopSelf();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/deviceconnected/BluetoothConnectedForegroundService$a;", "", "<init>", "()V", "", "WAKELOCK_TIMEOUT_MS", "J", "", "WAKELOCK_TAG", "Ljava/lang/String;", "INTENT_EXTRA_BLUETOOTH_DEVICE", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
