package com.dyson.mobile.android.backgroundexecution.companiondeviceservice;

import android.companion.CompanionDeviceService;
import android.content.Context;
import android.content.Intent;
import b50.j;
import com.dyson.mobile.android.logging.Logger;
import h12.e;
import hq.a;
import hq.b;
import jz1.d;
import kotlin.Metadata;
import kz1.b;
import mz1.i;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/companiondeviceservice/DeviceInRangeCompanionDeviceService;", "Landroid/companion/CompanionDeviceService;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceInRangeCompanionDeviceService extends CompanionDeviceService {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f12834f = 0;
    public final a d = new b().a();
    public i e;

    @e
    public final void onDeviceAppeared(String str) {
        str.getClass();
        Logger.a("Companion device with address " + str + " appeared");
        a aVar = this.d;
        if (aVar.a()) {
            if (aVar.d.f76036a < 33) {
                Logger.a("Running on Android 12, so launching separate background service to sync");
                DeviceInRangeBackgroundService.f12833f.getClass();
                Intent intent = new Intent(this, DeviceInRangeBackgroundService.class);
                intent.putExtra("BluetoothDevice", str);
                startService(intent);
                return;
            }
            Logger.a("Running on Android 13, so launching sync within companion service");
            i iVar = this.e;
            if (iVar != null) {
                d.dispose(iVar);
            }
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            nz1.b b13 = aVar.b(applicationContext, str, true);
            j jVar = new j(9);
            b.a aVar2 = kz1.b.f50218a;
            this.e = (i) new nz1.i(b13, jVar).v();
        }
    }

    @e
    public final void onDeviceDisappeared(String str) {
        str.getClass();
        Logger.a("Companion device with address " + str + " disappeared");
        i iVar = this.e;
        if (iVar != null) {
            d.dispose(iVar);
        }
        a aVar = this.d;
        aVar.getClass();
        aVar.e.b(str);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        boolean onUnbind = super.onUnbind(intent);
        Logger.a("Companion device service unbound - " + onUnbind + " returned");
        return onUnbind;
    }
}
