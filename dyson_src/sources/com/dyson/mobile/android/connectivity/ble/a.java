package com.dyson.mobile.android.connectivity.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.dyson.mobile.android.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import k60.j;
import k60.k;
import k60.l;
import x50.b0;
import x50.d0;
import x50.e0;
import x50.o;
/* loaded from: classes2.dex */
public class a implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13965a;

    /* renamed from: b  reason: collision with root package name */
    public final GattMachineConnectionInfo f13966b;

    /* renamed from: c  reason: collision with root package name */
    public final x50.a f13967c;
    public c d;
    public final LinkedBlockingQueue e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f13968f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13969g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13970h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13971i;

    /* renamed from: j  reason: collision with root package name */
    public final o f13972j;

    /* renamed from: k  reason: collision with root package name */
    public final j f13973k;

    /* renamed from: l  reason: collision with root package name */
    public BluetoothGatt f13974l;

    /* renamed from: m  reason: collision with root package name */
    public x50.d f13975m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f13976n;

    /* renamed from: o  reason: collision with root package name */
    public int f13977o;

    /* renamed from: p  reason: collision with root package name */
    public int f13978p;

    /* renamed from: q  reason: collision with root package name */
    public int f13979q;

    /* renamed from: r  reason: collision with root package name */
    public int f13980r;

    /* renamed from: s  reason: collision with root package name */
    public BluetoothManager f13981s;

    /* renamed from: t  reason: collision with root package name */
    public BluetoothDevice f13982t;

    /* renamed from: u  reason: collision with root package name */
    public final k f13983u;

    /* renamed from: com.dyson.mobile.android.connectivity.ble.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0451a implements d0 {
        public C0451a() {
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f13985a;

        /* renamed from: b  reason: collision with root package name */
        public GattMachineConnectionInfo f13986b;

        /* renamed from: c  reason: collision with root package name */
        public x50.a f13987c;
        public BluetoothManager d;
        public k e;

        public b(Context context) {
            this.f13985a = context;
        }
    }

    private a(Context context, GattMachineConnectionInfo gattMachineConnectionInfo, x50.a aVar, BluetoothManager bluetoothManager, k kVar) {
        this.f13976n = new ArrayList();
        this.f13977o = 0;
        this.f13978p = 0;
        this.f13979q = 0;
        this.f13980r = 20;
        C0451a c0451a = new C0451a();
        if (gattMachineConnectionInfo == null) {
            tq1.a.u("AndroidGattConnection.Builder should be set up with GattMachineConnectionInfo");
            throw null;
        }
        this.f13966b = gattMachineConnectionInfo;
        this.f13965a = context;
        this.e = new LinkedBlockingQueue();
        this.f13968f = new AtomicBoolean(false);
        String str = gattMachineConnectionInfo.d;
        this.f13969g = str;
        this.f13970h = gattMachineConnectionInfo.f13964f;
        this.f13971i = bv1.f.e("[", str, "] ");
        this.f13973k = new j();
        this.f13972j = new o(str, c0451a);
        this.f13967c = aVar;
        this.f13981s = bluetoothManager;
        this.f13983u = kVar;
    }

    public static void g(a aVar) {
        LinkedBlockingQueue linkedBlockingQueue = aVar.e;
        while (!linkedBlockingQueue.isEmpty() && ((x50.d) linkedBlockingQueue.peek()).f86970a.equals(aVar.f13975m.f86970a)) {
            linkedBlockingQueue.remove();
        }
    }

    @Override // x50.b0
    public final int a() {
        BluetoothDevice bluetoothDevice = this.f13982t;
        Context context = this.f13965a;
        if (bluetoothDevice == null) {
            if (this.f13981s == null) {
                this.f13981s = (BluetoothManager) context.getSystemService("bluetooth");
            }
            this.f13982t = this.f13981s.getAdapter().getRemoteDevice(this.f13966b.e);
        }
        BluetoothDevice bluetoothDevice2 = this.f13982t;
        if (this.f13981s == null) {
            this.f13981s = (BluetoothManager) context.getSystemService("bluetooth");
        }
        return this.f13981s.getConnectionState(bluetoothDevice2, 7);
    }

    @Override // x50.b0
    public final void b(ArrayList arrayList) {
        if (this.f13978p != 0) {
            Logger.b("UnSubscribe shouldn't have been called a subsequent time.", null);
        } else {
            this.f13978p = l(i(arrayList, true), false);
        }
    }

    @Override // x50.b0
    public final void c() {
        BluetoothGatt bluetoothGatt = this.f13974l;
        if (bluetoothGatt != null) {
            bluetoothGatt.requestConnectionPriority(1);
            Logger.c("Gatt connection priority successfully set to: 1");
        }
    }

    @Override // x50.b0
    public final void connect() {
        Logger.a(this.f13971i + "Attempting to connect...");
        BluetoothDevice bluetoothDevice = this.f13982t;
        Context context = this.f13965a;
        if (bluetoothDevice == null) {
            if (this.f13981s == null) {
                this.f13981s = (BluetoothManager) context.getSystemService("bluetooth");
            }
            this.f13982t = this.f13981s.getAdapter().getRemoteDevice(this.f13966b.e);
        }
        this.f13974l = this.f13982t.connectGatt(context, this.f13970h, this.f13972j, 2);
    }

    @Override // x50.b0
    public final void d() {
        Logger.a(this.f13971i + "discoverServices");
        this.f13974l.discoverServices();
    }

    @Override // x50.b0
    public final void disconnect() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f13971i;
        sb2.append(str);
        sb2.append("Attempting to disconnect...");
        Logger.a(sb2.toString());
        BluetoothGatt bluetoothGatt = this.f13974l;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
            Logger.a(str + "BluetoothGatt disconnected.");
        }
    }

    @Override // x50.b0
    public final void e(in0.b bVar) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f13974l;
        BluetoothGattCharacteristic characteristic = (bluetoothGatt == null || (service = bluetoothGatt.getService(bVar.e())) == null) ? null : service.getCharacteristic(bVar.a());
        if (characteristic == null) {
            Logger.b("Characteristic is null, canceling read.", null);
            return;
        }
        this.e.add(new x50.d(bVar, characteristic));
        if (this.f13968f.getAndSet(true)) {
            return;
        }
        j();
    }

    @Override // x50.b0
    public final void f(in0.b bVar, boolean z13) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f13974l;
        BluetoothGattCharacteristic characteristic = (bluetoothGatt == null || (service = bluetoothGatt.getService(bVar.e())) == null) ? null : service.getCharacteristic(bVar.a());
        if (characteristic == null) {
            Logger.b("Characteristic is null, canceling write.", null);
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.e;
        if (z13) {
            l lVar = new l(bVar.b(), bVar.c(), this.f13980r);
            while (lVar.hasNext()) {
                linkedBlockingQueue.add(new x50.d(bVar, characteristic, (byte[]) lVar.next()));
            }
        } else {
            linkedBlockingQueue.add(new x50.d(bVar, characteristic, bVar.b()));
        }
        if (this.f13968f.getAndSet(true)) {
            return;
        }
        j();
    }

    public final void h() {
        this.f13968f.set(false);
        this.f13977o = 0;
        this.f13978p = 0;
        this.f13979q = 0;
        this.f13976n.clear();
        BluetoothGatt bluetoothGatt = this.f13974l;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            this.f13974l = null;
            Logger.a(this.f13971i + "BluetoothGatt closed.");
        }
    }

    public final ArrayList i(List list, boolean z13) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            if (this.f13976n.contains(e0Var)) {
                arrayList.add(e0Var);
            } else {
                arrayList2.add(e0Var);
            }
        }
        return z13 ? arrayList : arrayList2;
    }

    public final void j() {
        LinkedBlockingQueue linkedBlockingQueue = this.e;
        boolean isEmpty = linkedBlockingQueue.isEmpty();
        AtomicBoolean atomicBoolean = this.f13968f;
        if (isEmpty) {
            atomicBoolean.set(false);
            return;
        }
        if (this.f13974l == null) {
            Logger.a(this.f13971i + "BluetoothGatt closed stopping queue.");
            atomicBoolean.set(false);
        }
        x50.d dVar = (x50.d) linkedBlockingQueue.poll();
        this.f13975m = dVar;
        int d = dVar.f86970a.d();
        if (d == 1) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f13975m.f86971b;
            if (this.f13974l.readCharacteristic(bluetoothGattCharacteristic)) {
                Logger.a("Reading a fragment from characteristics: " + bluetoothGattCharacteristic);
                return;
            }
            Logger.b("Error reading a fragment from characteristics: " + bluetoothGattCharacteristic, null);
        } else if (d != 2) {
            if (d == 3) {
                k(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            } else if (d == 4) {
                k(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
            } else if (d != 5) {
                Logger.b("Unknown operation.", null);
            } else {
                Logger.b("Notification not handled", null);
            }
        } else {
            x50.d dVar2 = this.f13975m;
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = dVar2.f86971b;
            byte[] bArr = dVar2.f86972c;
            bluetoothGattCharacteristic2.setValue(bArr);
            boolean writeCharacteristic = this.f13974l.writeCharacteristic(bluetoothGattCharacteristic2);
            byte c13 = this.f13975m.f86970a.c();
            if (!writeCharacteristic) {
                Logger.b("Error writing fragment to characteristics: " + bluetoothGattCharacteristic2.getUuid() + "message type id: " + ((int) c13) + " message block: " + Arrays.toString(bArr), null);
            } else if (bArr != null) {
                Logger.a("DysonBleClient Writing fragment to characteristics: " + bluetoothGattCharacteristic2.getUuid() + "message type id: " + ((int) c13) + " message block: " + u12.a.q(bArr));
            }
        }
    }

    public final void k(byte[] bArr) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f13975m.f86971b;
        UUID uuid = bluetoothGattCharacteristic.getUuid();
        boolean characteristicNotification = this.f13974l.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        String str = this.f13971i;
        if (!characteristicNotification) {
            Logger.b(str + "Unable to register for Notification using Characteristic UUID: " + uuid, null);
            return;
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(e60.a.f26063a);
        descriptor.setValue(bArr);
        BluetoothGattCharacteristic characteristic = descriptor.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(2);
        boolean writeDescriptor = this.f13974l.writeDescriptor(descriptor);
        characteristic.setWriteType(writeType);
        if (writeDescriptor) {
            Logger.a(str + "Notification enabled for Characteristic UUID: " + uuid);
            return;
        }
        Logger.b(str + "Unable to register for Notification using Characteristic UUID: " + uuid, null);
    }

    public final int l(ArrayList arrayList, boolean z13) {
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            UUID uuid = e0Var.f86973a;
            UUID uuid2 = e0Var.f86974b;
            BluetoothGattService service = this.f13974l.getService(uuid);
            String str = this.f13971i;
            if (service == null) {
                StringBuilder f13 = bv1.f.f(str, "Failed to subscribe to UUID: ");
                f13.append(uuid.toString());
                Logger.b(f13.toString(), null);
            } else {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
                if (characteristic == null) {
                    Logger.b("Characteristic is null, canceling subscribe.", null);
                    return 0;
                }
                Logger.a(str + "characteristic UUID: " + uuid2);
                this.e.add(new x50.d(z13 ? new b60.c(uuid, uuid2) : new b60.d(uuid, uuid2), characteristic));
                i13++;
            }
        }
        if (!arrayList.isEmpty() && !this.f13968f.getAndSet(true)) {
            j();
        }
        return i13;
    }

    @Override // x50.b0
    public final void q(List<e0> list) {
        if (this.f13977o != 0) {
            Logger.b("Subscribe shouldn't have been called a subsequent time.", null);
        } else {
            this.f13977o = l(i(list, false), true);
        }
    }

    @Override // x50.b0
    public final void r() {
        Logger.a(this.f13971i + "requestMtu: requested MTU value of 251");
        this.f13974l.requestMtu(251);
    }

    public /* synthetic */ a(Context context, GattMachineConnectionInfo gattMachineConnectionInfo, x50.a aVar, BluetoothManager bluetoothManager, k kVar, int i13) {
        this(context, gattMachineConnectionInfo, aVar, bluetoothManager, kVar);
    }
}
