package com.dyson.mobile.android.backgroundexecution.backgroundscan.onfound;

import android.app.Service;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import b50.p;
import c7.c;
import com.dyson.mobile.android.logging.Logger;
import cq.c;
import dq.b;
import i12.c0;
import i60.k;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import nz1.i;
import uf0.a0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/backgroundscan/onfound/BluetoothAdvertFoundBackgroundService;", "Landroid/app/Service;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BluetoothAdvertFoundBackgroundService extends Service {
    public static final a e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final long f12832f = 1800000;
    public final dq.a d = new b().a();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        ScanResult scanResult;
        intent.getClass();
        Logger.a("Bluetooth Advert Found Background Service onStartCommand Called.");
        Object systemService = getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "MyDyson:BluetoothAdvertFound");
        newWakeLock.acquire(f12832f);
        c.f22087a.getClass();
        c.a.a(intent);
        ArrayList a13 = Build.VERSION.SDK_INT >= 34 ? c.a.a("ScanResults", intent) : intent.getParcelableArrayListExtra("ScanResults");
        Logger.a("Bluetooth Advert Background Service - parsed all arguments required");
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        dq.a aVar = this.d;
        aVar.getClass();
        k a14 = aVar.f24918b.a((a13 == null || (scanResult = (ScanResult) c0.Q(0, a13)) == null) ? null : scanResult.getScanRecord());
        nz1.b a15 = aVar.f24917a.a(applicationContext, new a0.a(a14 != null ? a14.f40955a : null));
        p pVar = new p(3, newWakeLock, this);
        b.a aVar2 = kz1.b.f50218a;
        new i(a15, pVar).v();
        return 2;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/backgroundscan/onfound/BluetoothAdvertFoundBackgroundService$a;", "", "<init>", "()V", "", "WAKELOCK_TIMEOUT_MS", "J", "", "WAKELOCK_TAG", "Ljava/lang/String;", "INTENT_EXTRA_SCAN_RESULTS", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
