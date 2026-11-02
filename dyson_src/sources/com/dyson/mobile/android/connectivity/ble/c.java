package com.dyson.mobile.android.connectivity.ble;

import com.dyson.mobile.android.connectivity.ble.f;
import com.dyson.mobile.android.logging.Logger;
import in0.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import x50.b0;
import x50.f0;
/* loaded from: classes2.dex */
public class c implements x50.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f13988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f13989b;

    public c(d dVar, boolean z13) {
        this.f13989b = dVar;
        this.f13988a = z13;
    }

    @Override // x50.a
    public final void A(String str) {
        pa.c.t("[", str, "] onDisconnecting");
        this.f13989b.n(f.a.DISCONNECTING);
    }

    @Override // x50.a
    public final void B(String str) {
        pa.c.t("[", str, "] MTU request successful.");
        this.f13989b.o(f.e.SUBSCRIBED);
    }

    @Override // x50.a
    public final void C(String str) {
        pa.c.t("[", str, "] ble connected - starting startDiscovery");
        this.f13989b.f14000m.d();
    }

    @Override // x50.a
    public final void b(String str) {
        pa.c.t("[", str, "] Unsubscribing from a characteristic successful.");
        this.f13989b.o(f.e.UNSUBSCRIBED);
    }

    @Override // x50.a
    public final void d(String str, in0.b bVar) {
        d dVar = this.f13989b;
        dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.e;
        if (new ArrayList(copyOnWriteArrayList).size() == 0) {
            Logger.e("onDataWritten - no listeners - nothing has been notified", null);
        }
        Iterator it = new ArrayList(copyOnWriteArrayList).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            dVar.f13995h.getClass();
            Object obj = weakReference.get();
            if (obj == null) {
                weakReference.clear();
            } else {
                try {
                    ((f.c) obj).b(bVar);
                } catch (Exception e) {
                    Logger.b("Exception during consuming action: ", e);
                }
            }
        }
    }

    @Override // x50.a
    public final void e(String str) {
        pa.c.t("[", str, "] MTU request failed.");
    }

    @Override // x50.a
    public final void g(String str) {
        pa.c.t("[", str, "] onServiceDiscoveryComplete - connected");
        f.a aVar = f.a.CONNECTED;
        d dVar = this.f13989b;
        dVar.n(aVar);
        f0 f0Var = dVar.f13999l;
        if (f0Var != null) {
            dVar.i(f0Var);
        }
    }

    @Override // x50.a
    public final void h(String str) {
        pa.c.t("[", str, "] Subscribing to a characteristic successful.");
        boolean z13 = this.f13988a;
        d dVar = this.f13989b;
        if (!z13) {
            dVar.o(f.e.SUBSCRIBED);
            return;
        }
        b0 b0Var = dVar.f14000m;
        if (b0Var != null) {
            b0Var.r();
        }
    }

    @Override // x50.a
    public final void i(String str) {
        pa.c.t("[", str, "] Subscribing to a characteristic failed.");
    }

    @Override // x50.a
    public final void j(String str) {
        pa.c.t("[", str, "] connecting");
        this.f13989b.n(f.a.CONNECTING);
    }

    @Override // x50.a
    public final void k(String str, in0.b bVar) {
        d dVar = this.f13989b;
        dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = dVar.e;
        if (new ArrayList(copyOnWriteArrayList).size() == 0) {
            Logger.e("onDataWriteFailed - no listeners - nothing has been notified", null);
        }
        Iterator it = new ArrayList(copyOnWriteArrayList).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            dVar.f13995h.getClass();
            Object obj = weakReference.get();
            if (obj == null) {
                weakReference.clear();
            } else {
                try {
                    ((f.c) obj).a(bVar);
                } catch (Exception e) {
                    Logger.b("Exception during consuming action: ", e);
                }
            }
        }
    }

    @Override // x50.a
    public final void l(String str, b60.a aVar) {
        d dVar = this.f13989b;
        if (d.a(dVar).size() == 0) {
            Logger.e("onNotificationReceived - no listeners - nothing has been notified", null);
        }
        Logger.a("Gatt: OnNotificationReceived on characteristic: " + aVar.f7098b.toString() + ", message: " + in0.c.b(aVar.d));
        Iterator it = d.a(dVar).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            dVar.f13994g.getClass();
            Object obj = weakReference.get();
            if (obj == null) {
                weakReference.clear();
            } else {
                try {
                    ((f.d) obj).b(new m(aVar));
                } catch (Exception e) {
                    Logger.b("Exception during consuming action: ", e);
                }
            }
        }
    }

    @Override // x50.a
    public final void m(String str) {
        pa.c.t("[", str, "] onDisconnected");
        this.f13989b.n(f.a.DISCONNECTED);
    }

    @Override // x50.a
    public final void o(String str, in0.b bVar) {
        d dVar = this.f13989b;
        if (d.a(dVar).size() == 0) {
            Logger.e("onDataReadFailed - no listeners - nothing has been notified", null);
        }
        Iterator it = d.a(dVar).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            dVar.f13994g.getClass();
            Object obj = weakReference.get();
            if (obj == null) {
                weakReference.clear();
            } else {
                try {
                    ((f.d) obj).c(bVar);
                } catch (Exception e) {
                    Logger.b("Exception during consuming action: ", e);
                }
            }
        }
    }

    @Override // x50.a
    public final void z(String str, in0.b bVar, byte[] bArr) {
        d dVar = this.f13989b;
        if (d.a(dVar).size() == 0) {
            Logger.e("onDataRead - no listeners - nothing has been notified", null);
        }
        b60.b bVar2 = new b60.b(bVar, bArr);
        Iterator it = d.a(dVar).iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            dVar.f13994g.getClass();
            Object obj = weakReference.get();
            if (obj == null) {
                weakReference.clear();
            } else {
                try {
                    ((f.d) obj).b(new m(bVar2));
                } catch (Exception e) {
                    Logger.b("Exception during consuming action: ", e);
                }
            }
        }
    }
}
