package com.dyson.mobile.android.backgroundexecution;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.logging.Logger;
import cq.d;
import e80.c;
import f80.f;
import f80.p1;
import ji1.k;
import jq.a;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/DeviceBootBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceBootBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        d.f22090a.getClass();
        c d = pa.c.d(b.A);
        d.a aVar = d.f22091b;
        e80.b bVar = (e80.b) d;
        f fVar = bVar.f26210a;
        yi0.f f13 = bVar.f();
        fVar.getClass();
        jq.b bVar2 = new jq.b(bVar.e.get().getApplicationContext());
        bVar.f26214c.getClass();
        a aVar2 = new a(f13, bVar2, new p1());
        aVar.getClass();
        Logger.a("Updating scheduled background tasks");
        aVar2.f45553a.f90155b.i().w().f(new k(new jg0.a(aVar2, 3), 9)).d(new k(new jm0.b(1), 10)).h(kz1.a.d, kz1.a.e, kz1.a.f50215c);
    }
}
