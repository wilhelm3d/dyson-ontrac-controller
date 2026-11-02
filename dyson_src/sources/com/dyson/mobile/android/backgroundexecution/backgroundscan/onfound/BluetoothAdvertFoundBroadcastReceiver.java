package com.dyson.mobile.android.backgroundexecution.backgroundscan.onfound;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import c7.c;
import com.dyson.mobile.android.logging.Logger;
import cq.c;
import df0.d;
import dq.b;
import dz1.x;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import nz1.i;
import nz1.o;
import sz1.k;
import sz1.v;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/backgroundscan/onfound/BluetoothAdvertFoundBroadcastReceiver;", "Lcq/c;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BluetoothAdvertFoundBroadcastReceiver extends c {
    public static final a e = new a(null);
    public final dq.a d = new b().a();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (r.c(intent.getAction(), "com.dyson.mobile.android.backgroundexecution.backgroundscan.BLUETOOTH_ADVERT_FOUND")) {
            Logger logger = Logger.f15079a;
            ArrayList a13 = Build.VERSION.SDK_INT >= 34 ? c.a.a("android.bluetooth.le.extra.LIST_SCAN_RESULT", intent) : intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
            if ((a13 != null ? a13.size() : 0) > 0) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                this.d.getClass();
                v j8 = x.i(Boolean.valueOf(true ^ (a13 == null || a13.isEmpty()))).j(fz1.a.a());
                d dVar = new d(new a42.b(this, context, a13), 19);
                b.a aVar = kz1.b.f50218a;
                new i(new o(new k(j8, dVar)), new dq.c(goAsync, 0)).v();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/backgroundscan/onfound/BluetoothAdvertFoundBroadcastReceiver$a;", "", "<init>", "()V", "", "DYSON_MANUFACTURER_ID", "I", "PENDING_INTENT_REQUEST_CODE", "", "ACTION_ADVERT_FOUND", "Ljava/lang/String;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static PendingIntent a(Context context) {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 80, new Intent(context, BluetoothAdvertFoundBroadcastReceiver.class).setAction("com.dyson.mobile.android.backgroundexecution.backgroundscan.BLUETOOTH_ADVERT_FOUND"), Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
            broadcast.getClass();
            return broadcast;
        }

        private a() {
        }
    }
}
