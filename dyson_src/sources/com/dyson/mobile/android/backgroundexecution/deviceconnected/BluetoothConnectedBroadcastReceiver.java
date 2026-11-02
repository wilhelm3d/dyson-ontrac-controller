package com.dyson.mobile.android.backgroundexecution.deviceconnected;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.logging.Logger;
import cq.c;
import dz1.b0;
import dz1.f;
import dz1.x;
import i81.d;
import io.a;
import iq.b;
import kotlin.Metadata;
import kz1.b;
import nz1.i;
import nz1.o;
import qv1.s;
import sz1.k;
import sz1.t;
import sz1.w;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/backgroundexecution/deviceconnected/BluetoothConnectedBroadcastReceiver;", "Lcq/c;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BluetoothConnectedBroadcastReceiver extends c {
    public static final /* synthetic */ int e = 0;
    public final b d = new iq.c().a();

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"MissingPermission"})
    public final void onReceive(Context context, Intent intent) {
        b0 tVar;
        char c13;
        char c14;
        b0 i13;
        boolean z13;
        int i14;
        context.getClass();
        intent.getClass();
        if (r.c(intent.getAction(), "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return;
            }
            BluetoothDevice bluetoothDevice = (BluetoothDevice) c7.c.a(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class);
            String name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
            StringBuilder k13 = s.k("Bluetooth device connection state changed - now ", intExtra, " - was ", intExtra2, " - ");
            k13.append(name);
            Logger.a(k13.toString());
            if (bluetoothDevice == null) {
                return;
            }
            b bVar = this.d;
            if (intExtra != 2) {
                if (intExtra != 0 || intExtra2 == 1) {
                    return;
                }
                BroadcastReceiver.PendingResult goAsync = goAsync();
                bVar.getClass();
                vj.s sVar = bVar.f42450b;
                if (((Boolean) sVar.f84360b.getValue(sVar, vj.s.d[1])).booleanValue()) {
                    w a13 = bVar.a(bluetoothDevice);
                    a aVar = new a(new io.b(8), 15);
                    b.a aVar2 = kz1.b.f50218a;
                    tVar = new t(a13, aVar);
                } else {
                    tVar = x.i(Boolean.FALSE);
                }
                a aVar3 = new a(new iq.a(bVar, 2), 14);
                b.a aVar4 = kz1.b.f50218a;
                new i(new o(new t(tVar, aVar3)), new dq.c(goAsync, 3)).v();
                return;
            }
            BroadcastReceiver.PendingResult goAsync2 = goAsync();
            bVar.getClass();
            w a14 = bVar.a(bluetoothDevice);
            a aVar5 = new a(new iq.a(bVar, 0), 12);
            b.a aVar6 = kz1.b.f50218a;
            o oVar = new o(new k(a14, aVar5));
            y70.a aVar7 = bVar.f42451c.f84297a;
            vj.s sVar2 = bVar.f42450b;
            if (((Boolean) sVar2.f84360b.getValue(sVar2, vj.s.d[1])).booleanValue()) {
                long j8 = aVar7.getLong("all_machine_sync_time_audio", -1L);
                Long valueOf = Long.valueOf(j8);
                if (j8 < 0) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    c14 = 0;
                    long currentTimeMillis = System.currentTimeMillis() - valueOf.longValue();
                    c13 = 1;
                    Logger.a("Device last synced " + currentTimeMillis + " ms ago");
                    z13 = !(0 <= currentTimeMillis && currentTimeMillis <= iq.b.f42446j);
                } else {
                    c13 = 1;
                    c14 = 0;
                    z13 = true;
                }
                if (z13) {
                    long j13 = aVar7.getLong("last_time_audio_disconnected", -1L);
                    Long valueOf2 = Long.valueOf(j13);
                    if (j13 < 0) {
                        valueOf2 = null;
                    }
                    if (valueOf2 != null) {
                        long currentTimeMillis2 = System.currentTimeMillis() - valueOf2.longValue();
                        Logger.a("Device last disconnected " + currentTimeMillis2 + " ms ago");
                        i14 = ((0 > currentTimeMillis2 || currentTimeMillis2 > iq.b.f42447k) ? c14 : c13) ^ 1;
                    } else {
                        i14 = c13;
                    }
                    if (i14 != 0) {
                        i13 = new t(bVar.a(bluetoothDevice), new a(new io.b(8), 15));
                        o oVar2 = new o(new k(i13, new a(new d(this, context, bluetoothDevice), 17)));
                        kz1.b.a(oVar2, "other is null");
                        f[] fVarArr = new f[2];
                        fVarArr[c14] = oVar;
                        fVarArr[c13] = oVar2;
                        dz1.b q13 = dz1.b.q(fVarArr);
                        dq.c cVar = new dq.c(goAsync2, 2);
                        q13.getClass();
                        new i(q13, cVar).v();
                    }
                }
            } else {
                c13 = 1;
                c14 = 0;
            }
            i13 = x.i(Boolean.FALSE);
            o oVar22 = new o(new k(i13, new a(new d(this, context, bluetoothDevice), 17)));
            kz1.b.a(oVar22, "other is null");
            f[] fVarArr2 = new f[2];
            fVarArr2[c14] = oVar;
            fVarArr2[c13] = oVar22;
            dz1.b q132 = dz1.b.q(fVarArr2);
            dq.c cVar2 = new dq.c(goAsync2, 2);
            q132.getClass();
            new i(q132, cVar2).v();
        }
    }
}
