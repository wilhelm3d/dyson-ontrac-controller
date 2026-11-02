package com.dyson.mobile.android.connectivity.ble;

import android.bluetooth.BluetoothManager;
import com.brightcove.player.event.EventType;
import com.dyson.mobile.android.connectivity.ble.a;
import com.dyson.mobile.android.connectivity.ble.b;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import dz1.r;
import f60.i;
import h12.o;
import hx.v;
import i12.s;
import java.util.List;
import k60.h;
import k60.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.a;
import kz1.b;
import nz1.f;
import nz1.j;
import rz1.a0;
import rz1.s0;
import rz1.t;
import rz1.u;
import rz1.x;
import software.amazon.awssdk.crt.http.Http2StreamManagerOptions;
import ss0.k;
import sz1.n;
import x1.i;
import x42.m1;
import x50.c0;
import x50.e0;
import x50.f0;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0006\r\u000e\u000f\u0010\u0011\u0012B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient;", "Lcom/dyson/mobile/android/connectivity/ble/b;", "Lx50/a;", "Lcom/dyson/mobile/android/connectivity/ble/a$b;", "androidGattConnectionBuilder", "Landroid/bluetooth/BluetoothManager;", "bluetoothManager", "Lcom/dyson/mobile/android/connectivity/ble/f;", "Lcom/dyson/mobile/android/connectivity/ble/GattMachineConnectionInfo;", "Lx50/f0;", "connectionHandler", "<init>", "(Lcom/dyson/mobile/android/connectivity/ble/a$b;Landroid/bluetooth/BluetoothManager;Lcom/dyson/mobile/android/connectivity/ble/f;)V", "c", "a", "b", "DataFailedToWriteException", "DataFailedToReadException", "e", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DysonBleClient implements com.dyson.mobile.android.connectivity.ble.b, x50.a {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f13948a;

    /* renamed from: b  reason: collision with root package name */
    public final BluetoothManager f13949b;

    /* renamed from: c  reason: collision with root package name */
    public f<GattMachineConnectionInfo, f0> f13950c;
    public MachineSerial d;
    public w12.a<h12.f0> e;

    /* renamed from: f  reason: collision with root package name */
    public com.dyson.mobile.android.connectivity.ble.a f13951f;

    /* renamed from: g  reason: collision with root package name */
    public f.a f13952g;

    /* renamed from: h  reason: collision with root package name */
    public f.a f13953h;

    /* renamed from: i  reason: collision with root package name */
    public final d02.d<c> f13954i;

    /* renamed from: j  reason: collision with root package name */
    public final d02.d<a> f13955j;

    /* renamed from: k  reason: collision with root package name */
    public final d02.d<in0.b> f13956k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$DataFailedToReadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DataFailedToReadException extends Exception {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$DataFailedToWriteException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DataFailedToWriteException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$b;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAILURE", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b SUCCESS = new b("SUCCESS", 0);
        public static final b FAILURE = new b("FAILURE", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{SUCCESS, FAILURE};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private b(String str, int i13) {
        }

        public static o12.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$c;", "", "Lin0/b;", "originalMessage", "Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$b;", "result", "<init>", "(Lin0/b;Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$b;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final in0.b f13960a;

        /* renamed from: b  reason: collision with root package name */
        public final b f13961b;

        public c(in0.b bVar, b bVar2) {
            bVar.getClass();
            bVar2.getClass();
            this.f13960a = bVar;
            this.f13961b = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f13960a.equals(cVar.f13960a) && this.f13961b == cVar.f13961b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f13961b.hashCode() + (this.f13960a.hashCode() * 31);
        }

        public final String toString() {
            return "DataWritten(originalMessage=" + this.f13960a + ", result=" + this.f13961b + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13962a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f13963b;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.WRITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.READ.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13962a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f13963b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$e;", "", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e {
    }

    public DysonBleClient(a.b bVar, BluetoothManager bluetoothManager, f<GattMachineConnectionInfo, f0> fVar) {
        bVar.getClass();
        bluetoothManager.getClass();
        this.f13948a = bVar;
        this.f13949b = bluetoothManager;
        this.f13950c = fVar;
        this.e = new x30.a(4);
        this.f13954i = new d02.d<>();
        this.f13955j = new d02.d<>();
        this.f13956k = new d02.d<>();
    }

    @Override // x50.a
    public final void A(String str) {
        str.getClass();
        Logger.a("[" + str + "] onDisconnecting");
    }

    @Override // x50.a
    public final void B(String str) {
        str.getClass();
    }

    @Override // x50.a
    public final void C(String str) {
        str.getClass();
        Logger.a("[" + str + "] ble connected - starting startDiscovery");
        com.dyson.mobile.android.connectivity.ble.a aVar = this.f13951f;
        if (aVar != null) {
            aVar.d();
        } else {
            Logger.b("onConnected but connection was null", null);
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final <T> r<T> D(h hVar, b.a<T> aVar) {
        com.dyson.mobile.android.connectivity.ble.a aVar2 = this.f13951f;
        if (aVar2 != null) {
            aVar2.q(s.c(new e0(hVar.f(), hVar.a())));
        }
        k60.c cVar = new k60.c(hVar);
        t t13 = this.f13955j.t(new x50.g(new wg0.f(24), 8));
        va0.d dVar = new va0.d(new x50.f(hVar, 2), 8);
        b.a aVar3 = kz1.b.f50218a;
        r i13 = r.i(new a0(t13, dVar).t(new x50.g(new wg0.f(25), 9)).U(1L).y(new x50.g(new wg0.f(26), 10), Http2StreamManagerOptions.DEFAULT_MAX), this.f13956k);
        x50.g gVar = new x50.g(new x50.r(this, cVar, 1), 11);
        i13.getClass();
        return new s0(new a0(new s0(i13.s(gVar, kz1.a.f50215c), new x50.g(new x50.t(aVar, 0), 7)), new b50.m(12)), new i(5));
    }

    public final x E(h hVar) {
        hVar.getClass();
        k60.c cVar = new k60.c(hVar);
        x50.g gVar = new x50.g(new x50.r(this, cVar, 0), 4);
        d02.d<c> dVar = this.f13954i;
        dVar.getClass();
        u s13 = dVar.s(gVar, kz1.a.f50215c);
        va0.d dVar2 = new va0.d(new m1(cVar, 2), 7);
        b.a aVar = kz1.b.f50218a;
        return (x) new s0(new a0(s13, dVar2), new x50.g(new wg0.f(23), 5)).x();
    }

    @Override // x50.a
    public final void b(String str) {
        str.getClass();
        Logger.a("[" + str + "] Unsubscribing from a characteristic successful.");
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final void close() {
        com.dyson.mobile.android.connectivity.ble.a aVar = this.f13951f;
        if (aVar != null) {
            aVar.h();
        }
        this.f13951f = null;
        this.f13950c = null;
        this.f13952g = null;
        this.f13953h = null;
    }

    @Override // x50.a
    public final void d(String str, in0.b bVar) {
        str.getClass();
        if (bVar != null) {
            String o13 = u12.a.o(bVar);
            Logger.a("[" + str + "] onDataWritten " + o13);
            this.f13954i.onNext(new c(bVar, b.SUCCESS));
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final void disconnect() {
        com.dyson.mobile.android.connectivity.ble.a aVar = this.f13951f;
        if (aVar != null) {
            aVar.disconnect();
        }
        this.e.invoke();
        if (aVar != null) {
            aVar.h();
        }
        this.f13951f = null;
        this.f13950c = null;
        this.f13952g = null;
        this.f13953h = null;
    }

    @Override // x50.a
    public final void e(String str) {
        str.getClass();
    }

    @Override // x50.a
    public final void g(String str) {
        str.getClass();
        Logger.a("[" + str + "] onServiceDiscoveryComplete - connected");
        f.a aVar = this.f13952g;
        if (aVar != null) {
            aVar.onComplete();
        } else {
            Logger.b("connectionCompletableEmitter was null", null);
        }
    }

    @Override // x50.a
    public final void h(String str) {
        str.getClass();
        Logger.a("[" + str + "] Subscribing to a characteristic successful.");
        f.a aVar = this.f13953h;
        if (aVar != null) {
            aVar.onComplete();
        } else {
            Logger.b("subscriptionCompletableEmitter was null", null);
        }
    }

    @Override // x50.a
    public final void i(String str) {
        str.getClass();
        Logger.a("[" + str + "] Subscribing to a characteristic failed.");
        f.a aVar = this.f13953h;
        if (aVar != null) {
            aVar.onError(new IllegalStateException("Failed to subscribe ".concat(str)));
        } else {
            Logger.b("subscriptionCompletableEmitter was null", null);
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final boolean isConnected() {
        com.dyson.mobile.android.connectivity.ble.a aVar = this.f13951f;
        return aVar != null && aVar.a() == 2;
    }

    @Override // x50.a
    public final void j(String str) {
        str.getClass();
        Logger.a("[" + str + "] connecting");
    }

    @Override // x50.a
    public final void k(String str, in0.b bVar) {
        str.getClass();
        if (bVar != null) {
            String o13 = u12.a.o(bVar);
            Logger.e("[" + str + "] onDataWriteFailed  " + o13, null);
            this.f13954i.onNext(new c(bVar, b.FAILURE));
        }
    }

    @Override // x50.a
    public final void l(String str, b60.a aVar) {
        str.getClass();
        String o13 = u12.a.o(aVar);
        Logger.a("[" + str + "] onNotificationReceived " + o13);
        this.f13956k.onNext(aVar);
    }

    @Override // x50.a
    public final void m(String str) {
        str.getClass();
        Logger.a("[" + str + "] onDisconnected");
        this.e.invoke();
    }

    @Override // x50.a
    public final void o(String str, in0.b bVar) {
        str.getClass();
        if (bVar != null) {
            String o13 = u12.a.o(bVar);
            Logger.e("[" + str + "] onDataReadFailed  " + o13, null);
            this.f13955j.onNext(new a(bVar, b.FAILURE, null, 4, null));
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final MachineSerial p() {
        return this.d;
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b q(List<? extends e0> list) {
        k kVar = new k(6, this, list);
        b.a aVar = kz1.b.f50218a;
        nz1.f fVar = new nz1.f(kVar);
        x50.s sVar = new x50.s(this, 1);
        a.l lVar = kz1.a.d;
        a.k kVar2 = kz1.a.f50215c;
        return fVar.n(lVar, lVar, kVar2, kVar2, kVar2, sVar);
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b r() {
        j jVar = j.d;
        jVar.getClass();
        return jVar;
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b s(h hVar) {
        hVar.getClass();
        int i13 = d.f13962a[hVar.e().ordinal()];
        if (i13 == 1) {
            x E = E(hVar);
            x50.g gVar = new x50.g(new wg0.f(22), 3);
            b.a aVar = kz1.b.f50218a;
            return new n(E, gVar);
        } else if (i13 != 2) {
            m e13 = hVar.e();
            return dz1.b.p(new IllegalStateException("Cannot send message with OperationMode " + e13));
        } else {
            return dz1.b.p(new IllegalStateException("ERROR: READ message " + hVar + " This message should not be sent using sendMessage this is for fire and forget messages"));
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final void t(i.a aVar) {
        this.e = aVar;
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final <T> r<T> u(b.a<T> aVar) {
        aVar.getClass();
        x50.g gVar = new x50.g(new x50.t(aVar, 1), 14);
        d02.d<in0.b> dVar = this.f13956k;
        dVar.getClass();
        b.a aVar2 = kz1.b.f50218a;
        return new s0(new a0(new s0(dVar, gVar), new b50.m(11)), new x1.i(4));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final <T> dz1.x<T> v(h hVar, b.a<T> aVar) {
        hVar.getClass();
        aVar.getClass();
        dz1.x<T> x13 = u(aVar).x();
        x50.g gVar = new x50.g(new wg0.f(27), 12);
        b.a aVar2 = kz1.b.f50218a;
        return dz1.x.v(new sz1.k(x13, gVar), new sz1.k(E(hVar), new x50.g(new wg0.f(28), 13)), new x1.i(6));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b w(MachineSerial machineSerial, String str) {
        this.d = machineSerial;
        GattMachineConnectionInfo gattMachineConnectionInfo = new GattMachineConnectionInfo();
        String str2 = machineSerial.d;
        gattMachineConnectionInfo.d = str2;
        gattMachineConnectionInfo.e = str;
        gattMachineConnectionInfo.f13964f = true;
        a.b bVar = this.f13948a;
        bVar.f13987c = this;
        bVar.d = this.f13949b;
        bVar.f13986b = gattMachineConnectionInfo;
        k60.d dVar = new k60.d();
        bVar.e = dVar;
        this.f13951f = new com.dyson.mobile.android.connectivity.ble.a(bVar.f13985a, bVar.f13986b, bVar.f13987c, bVar.d, dVar, 0);
        com.dyson.mobile.android.connectivity.ble.d dVar2 = new com.dyson.mobile.android.connectivity.ble.d(bVar, new k60.d());
        new c0();
        GattMachineConnectionInfo gattMachineConnectionInfo2 = new GattMachineConnectionInfo();
        gattMachineConnectionInfo2.d = str2;
        gattMachineConnectionInfo2.e = str;
        gattMachineConnectionInfo2.f13964f = true;
        dVar2.f13998k = gattMachineConnectionInfo2;
        com.dyson.mobile.android.connectivity.ble.a aVar = this.f13951f;
        dVar2.f14000m = aVar;
        aVar.d = new com.dyson.mobile.android.connectivity.ble.c(dVar2, false);
        this.f13950c = dVar2;
        x50.g gVar = new x50.g(this, 6);
        b.a aVar2 = kz1.b.f50218a;
        nz1.f fVar = new nz1.f(gVar);
        x50.s sVar = new x50.s(this, 0);
        a.l lVar = kz1.a.d;
        a.k kVar = kz1.a.f50215c;
        return fVar.n(lVar, lVar, kVar, kVar, kVar, sVar);
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b x(List<? extends e0> list) {
        throw new o("Unsubscribe has not been implemented as its has been implemented differently in the legacy ble client");
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final f<GattMachineConnectionInfo, f0> y() {
        return this.f13950c;
    }

    @Override // x50.a
    public final void z(String str, in0.b bVar, byte[] bArr) {
        str.getClass();
        if (bVar == null || bArr == null) {
            return;
        }
        String o13 = u12.a.o(bVar);
        String q13 = u12.a.q(bArr);
        StringBuilder m13 = ma.e.m("[", str, "] onDataRead  ", o13, "  READ: ");
        m13.append(q13);
        Logger.a(m13.toString());
        this.f13955j.onNext(new a(bVar, b.SUCCESS, new b60.b(bVar, bArr)));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$a;", "", "Lin0/b;", "originalMessage", "Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$b;", "result", EventType.RESPONSE, "<init>", "(Lin0/b;Lcom/dyson/mobile/android/connectivity/ble/DysonBleClient$b;Lin0/b;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final in0.b f13957a;

        /* renamed from: b  reason: collision with root package name */
        public final b f13958b;

        /* renamed from: c  reason: collision with root package name */
        public final in0.b f13959c;

        public a(in0.b bVar, b bVar2, in0.b bVar3) {
            bVar.getClass();
            bVar2.getClass();
            this.f13957a = bVar;
            this.f13958b = bVar2;
            this.f13959c = bVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return x12.r.c(this.f13957a, aVar.f13957a) && this.f13958b == aVar.f13958b && x12.r.c(this.f13959c, aVar.f13959c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f13958b.hashCode() + (this.f13957a.hashCode() * 31)) * 31;
            in0.b bVar = this.f13959c;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            return "DataRead(originalMessage=" + this.f13957a + ", result=" + this.f13958b + ", response=" + this.f13959c + ")";
        }

        public /* synthetic */ a(in0.b bVar, b bVar2, in0.b bVar3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, bVar2, (i13 & 4) != 0 ? null : bVar3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonBleClient(a.b bVar, BluetoothManager bluetoothManager) {
        this(bVar, bluetoothManager, null, 4, null);
        bVar.getClass();
        bluetoothManager.getClass();
    }

    public /* synthetic */ DysonBleClient(a.b bVar, BluetoothManager bluetoothManager, f fVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, bluetoothManager, (i13 & 4) != 0 ? null : fVar);
    }
}
