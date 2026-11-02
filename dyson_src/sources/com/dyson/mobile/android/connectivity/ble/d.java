package com.dyson.mobile.android.connectivity.ble;

import com.dyson.mobile.android.connectivity.ble.a;
import com.dyson.mobile.android.connectivity.ble.f;
import com.dyson.mobile.android.logging.Logger;
import in0.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k60.k;
import u50.h;
import x50.b0;
import x50.f0;
/* loaded from: classes2.dex */
public class d implements f<GattMachineConnectionInfo, f0> {

    /* renamed from: a  reason: collision with root package name */
    public f.a f13990a = f.a.DISCONNECTED;

    /* renamed from: b  reason: collision with root package name */
    public f.e f13991b = f.e.UNSUBSCRIBED;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList f13992c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final h<f.b> f13993f = new h<>();

    /* renamed from: g  reason: collision with root package name */
    public final h<f.d> f13994g = new h<>();

    /* renamed from: h  reason: collision with root package name */
    public final h<f.c> f13995h = new h<>();

    /* renamed from: i  reason: collision with root package name */
    public final a.b f13996i;

    /* renamed from: j  reason: collision with root package name */
    public final k f13997j;

    /* renamed from: k  reason: collision with root package name */
    public GattMachineConnectionInfo f13998k;

    /* renamed from: l  reason: collision with root package name */
    public f0 f13999l;

    /* renamed from: m  reason: collision with root package name */
    public b0 f14000m;

    public d(a.b bVar, k kVar) {
        this.f13996i = bVar;
        this.f13997j = kVar;
    }

    public static ArrayList a(d dVar) {
        dVar.getClass();
        return new ArrayList(dVar.d);
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void b(j jVar) {
        if (this.f13998k == null) {
            Logger.b("'setMachineConnectionInfo' should be called before send.", null);
            pa.c.w("'setMachineConnectionInfo' should be called before send.");
        } else if (jVar == null) {
            Logger.b("Cannot send a BLE message because it's null.", null);
        } else if (jVar instanceof in0.b) {
            in0.b bVar = (in0.b) jVar;
            if (bVar.d() == 1) {
                this.f14000m.e(bVar);
            } else if (bVar.d() == 2) {
                this.f14000m.f(bVar, true);
            }
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void c(f.d dVar) {
        Logger.a("addMessageReceivedListener");
        this.d.add(new WeakReference(dVar));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void d(f.b bVar) {
        Logger.a("addConnectionStateListener");
        this.f13992c.add(new WeakReference(bVar));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void e(f.c cVar) {
        Logger.a("removeMessageDeliveredListener");
        CopyOnWriteArrayList copyOnWriteArrayList = this.e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            f.c cVar2 = (f.c) weakReference.get();
            if (cVar2 == null) {
                Logger.b("MessageDelivered listener removal error: listener is null.", null);
            } else if (cVar.equals(cVar2)) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void f(f.c cVar) {
        Logger.a("addMessageDeliveredListener");
        this.e.add(new WeakReference(cVar));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void g(GattMachineConnectionInfo gattMachineConnectionInfo) {
        this.f13998k = gattMachineConnectionInfo;
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void h(f.b bVar) {
        Logger.a("removeConnectionStateListener");
        CopyOnWriteArrayList copyOnWriteArrayList = this.f13992c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            f.b bVar2 = (f.b) weakReference.get();
            if (bVar2 == null) {
                Logger.b("ConnectionState listener removal error: listener is null.", null);
            } else if (bVar.equals(bVar2)) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void j(in0.b bVar) {
        if (this.f13998k == null) {
            Logger.b("'setMachineConnectionInfo' should be called before send.", null);
            pa.c.w("'setMachineConnectionInfo' should be called before send.");
        } else if (bVar.d() == 1) {
            this.f14000m.e(bVar);
        } else if (bVar.d() == 2) {
            this.f14000m.f(bVar, false);
        }
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void k(f0 f0Var) {
        f0 f0Var2 = f0Var;
        if (this.f13998k == null) {
            Logger.b("'setMachineConnectionInfo' should be called before unSubscribe.", null);
            pa.c.w("'setMachineConnectionInfo' should be called before unSubscribe.");
            return;
        }
        b0 b0Var = this.f14000m;
        f0Var2.getClass();
        b0Var.b(new ArrayList(f0Var2.f86975a));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f
    public final void l(f.d dVar) {
        Logger.a("removeMessageReceivedListener");
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            f.d dVar2 = (f.d) weakReference.get();
            if (dVar2 == null) {
                Logger.b("MessageReceived listener removal error: listener is null.", null);
            } else if (dVar.equals(dVar2)) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void m() {
        Iterator it = new ArrayList(this.f13992c).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            this.f13993f.getClass();
            Object obj = weakReference.get();
            if (obj == null) {
                weakReference.clear();
            } else {
                try {
                    ((f.b) obj).a(this.f13990a, this.f13991b);
                } catch (Exception e) {
                    Logger.b("Exception during consuming action: ", e);
                }
            }
        }
    }

    public final void n(f.a aVar) {
        if (f.a.DISCONNECTED == aVar) {
            o(f.e.UNSUBSCRIBED);
        }
        if (this.f13990a != aVar) {
            this.f13990a = aVar;
            m();
        }
    }

    public final void o(f.e eVar) {
        if (this.f13991b != eVar) {
            this.f13991b = eVar;
            m();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r10 == com.dyson.mobile.android.connectivity.ble.f.a.CONNECTED) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r9.f13990a == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r9.f13998k == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
        r9.f14000m.disconnect();
        n(com.dyson.mobile.android.connectivity.ble.f.a.DISCONNECTED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        com.dyson.mobile.android.logging.Logger.b("'setMachineConnectionInfo' should be called before disconnect.", null);
        pa.c.w("'setMachineConnectionInfo' should be called before disconnect.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        r5 = new com.dyson.mobile.android.connectivity.ble.c(r9, true);
        r10 = r9.f13996i;
        r10.f13987c = r5;
        r4 = r9.f13998k;
        r10.f13986b = r4;
        r7 = r9.f13997j;
        r10.e = r7;
        r9.f14000m = new com.dyson.mobile.android.connectivity.ble.a(r10.f13985a, r4, r5, r10.d, r7, 0);
        n(r0);
        r9.f14000m.connect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        return;
     */
    @Override // com.dyson.mobile.android.connectivity.ble.f
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(x50.f0 r10) {
        /*
            r9 = this;
            com.dyson.mobile.android.connectivity.ble.GattMachineConnectionInfo r0 = r9.f13998k
            r1 = 0
            if (r0 == 0) goto L81
            r9.f13999l = r10
            java.lang.String r2 = "'setMachineConnectionInfo' should be called before isConnected."
            if (r0 != 0) goto Lf
            com.dyson.mobile.android.logging.Logger.e(r2, r1)
            goto L2a
        Lf:
            com.dyson.mobile.android.connectivity.ble.f$a r0 = r9.f13990a
            com.dyson.mobile.android.connectivity.ble.f$a r3 = com.dyson.mobile.android.connectivity.ble.f.a.CONNECTED
            if (r0 != r3) goto L2a
            com.dyson.mobile.android.connectivity.ble.f$e r0 = com.dyson.mobile.android.connectivity.ble.f.e.SUBSCRIBING
            r9.o(r0)
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.LinkedHashSet r10 = r10.f86975a
            r0.<init>(r10)
            x50.b0 r9 = r9.f14000m
            r9.q(r0)
            return
        L2a:
            com.dyson.mobile.android.connectivity.ble.f$a r10 = r9.f13990a
            com.dyson.mobile.android.connectivity.ble.f$a r0 = com.dyson.mobile.android.connectivity.ble.f.a.CONNECTING
            if (r10 != r0) goto L31
            return
        L31:
            com.dyson.mobile.android.connectivity.ble.GattMachineConnectionInfo r3 = r9.f13998k
            if (r3 != 0) goto L39
            com.dyson.mobile.android.logging.Logger.e(r2, r1)
            goto L3e
        L39:
            com.dyson.mobile.android.connectivity.ble.f$a r2 = com.dyson.mobile.android.connectivity.ble.f.a.CONNECTED
            if (r10 != r2) goto L3e
            goto L42
        L3e:
            com.dyson.mobile.android.connectivity.ble.f$a r10 = r9.f13990a
            if (r10 != r0) goto L5a
        L42:
            com.dyson.mobile.android.connectivity.ble.GattMachineConnectionInfo r10 = r9.f13998k
            if (r10 == 0) goto L51
            x50.b0 r10 = r9.f14000m
            r10.disconnect()
            com.dyson.mobile.android.connectivity.ble.f$a r10 = com.dyson.mobile.android.connectivity.ble.f.a.DISCONNECTED
            r9.n(r10)
            goto L5a
        L51:
            java.lang.String r9 = "'setMachineConnectionInfo' should be called before disconnect."
            com.dyson.mobile.android.logging.Logger.b(r9, r1)
            pa.c.w(r9)
            return
        L5a:
            com.dyson.mobile.android.connectivity.ble.c r5 = new com.dyson.mobile.android.connectivity.ble.c
            r10 = 1
            r5.<init>(r9, r10)
            com.dyson.mobile.android.connectivity.ble.a$b r10 = r9.f13996i
            r10.f13987c = r5
            com.dyson.mobile.android.connectivity.ble.GattMachineConnectionInfo r4 = r9.f13998k
            r10.f13986b = r4
            k60.k r7 = r9.f13997j
            r10.e = r7
            com.dyson.mobile.android.connectivity.ble.a r2 = new com.dyson.mobile.android.connectivity.ble.a
            android.content.Context r3 = r10.f13985a
            android.bluetooth.BluetoothManager r6 = r10.d
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.f14000m = r2
            r9.n(r0)
            x50.b0 r9 = r9.f14000m
            r9.connect()
            return
        L81:
            java.lang.String r9 = "'setMachineConnectionInfo' should be called before subscribe."
            com.dyson.mobile.android.logging.Logger.b(r9, r1)
            pa.c.w(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectivity.ble.d.i(x50.f0):void");
    }
}
