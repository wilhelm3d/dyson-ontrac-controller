package com.dyson.mobile.android.connectionjourney.bleconnection;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b50.j;
import kz1.b;
import w00.i;
/* loaded from: classes2.dex */
public class GattConnectionJourneyService extends Service {
    public static final /* synthetic */ int e = 0;
    public a d;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i.c(this).e.x(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        hp1.b bVar = new hp1.b(this, intent.getExtras().getBoolean("stopServiceOnProximityTimeout", false), intent.getExtras().getString("AUTHCODE"), intent.getExtras().getString("RANDOMNUMBER"));
        b.a aVar = kz1.b.f50218a;
        new nz1.f(bVar).z(c02.a.f10004c).r(fz1.a.a()).l(new j(20)).v();
        return 2;
    }
}
