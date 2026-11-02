package com.dyson.mobile.android.backgroundexecution.companiondeviceservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import he0.e;
import hq.b;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import nz1.i;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/companiondeviceservice/DeviceInRangeBackgroundService;", "Landroid/app/Service;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceInRangeBackgroundService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public static final a f12833f = new a(null);
    public final hq.a d = new b().a();
    public final gz1.b e = new gz1.b();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.e.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        intent.getClass();
        String stringExtra = intent.getStringExtra("BluetoothDevice");
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        nz1.b b13 = this.d.b(applicationContext, stringExtra, false);
        e eVar = new e(this, 1);
        b.a aVar = kz1.b.f50218a;
        zb.z(this.e, new i(b13, eVar).v());
        return 2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/companiondeviceservice/DeviceInRangeBackgroundService$a;", "", "<init>", "()V", "", "INTENT_EXTRA_DEVICE_MAC_ADDRESS", "Ljava/lang/String;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
