package com.dyson.mobile.android.connectionjourney.bleconnection;

import android.app.Service;
import android.content.Intent;
import b0.e2;
import com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionJourney;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.connectionjourney.task.CloudPollingTimeoutException;
import com.dyson.mobile.android.connectionjourney.task.MachineBannedException;
import com.dyson.mobile.android.connectivity.ble.BleScanningRecord;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import d50.p;
import j90.k;
import java.util.concurrent.TimeUnit;
import ji1.h;
import kz1.b;
import lb.s;
import mj.g;
import nz1.o;
import nz1.w;
import oz1.l0;
import q62.n;
import q70.a0;
import q70.g;
import q70.i0;
import q70.l;
import q70.q;
import q70.x;
import q70.z;
import q70.z0;
import sz1.i;
import sz1.m;
import sz1.v;
import x50.f0;
import y40.j;
/* loaded from: classes2.dex */
public class a extends q8.a {
    public final GattConnectionJourney d;
    public final ConnectionJourneyDataStore e;

    /* renamed from: f  reason: collision with root package name */
    public final h40.d f13317f;

    /* renamed from: g  reason: collision with root package name */
    public final r60.a f13318g;

    /* renamed from: h  reason: collision with root package name */
    public final l10.a f13319h;

    /* renamed from: i  reason: collision with root package name */
    public final j f13320i;

    /* renamed from: j  reason: collision with root package name */
    public final c10.c f13321j;

    /* renamed from: k  reason: collision with root package name */
    public final w40.a f13322k;

    /* renamed from: l  reason: collision with root package name */
    public Service f13323l;

    /* renamed from: m  reason: collision with root package name */
    public t70.d f13324m;

    /* renamed from: o  reason: collision with root package name */
    public mz1.e f13326o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f13328q;

    /* renamed from: n  reason: collision with root package name */
    public final gz1.b f13325n = new gz1.b();

    /* renamed from: p  reason: collision with root package name */
    public final gz1.b f13327p = new gz1.b();

    public a(GattConnectionJourney gattConnectionJourney, h40.d dVar, ConnectionJourneyDataStore connectionJourneyDataStore, r60.a aVar, l10.a aVar2, j jVar, w40.a aVar3, c10.c cVar) {
        this.d = gattConnectionJourney;
        this.e = connectionJourneyDataStore;
        this.f13317f = dVar;
        this.f13318g = aVar;
        this.f13319h = aVar2;
        this.f13320i = jVar;
        this.f13322k = aVar3;
        this.f13321j = cVar;
    }

    public final void E() {
        Logger.a("BLE Diagnostic Message - Setup listener");
        x xVar = this.d.f13279a;
        xVar.a();
        sz1.c a13 = new q(xVar.f66189a).a();
        s sVar = new s(19);
        b.a aVar = kz1.b.f50218a;
        this.f13325n.a(new i(new sz1.j(a13, sVar), new m10.b(this, 11)).p(new m10.b(this, 13), kz1.a.e));
    }

    public final void G() {
        Logger.a("Listening out for the connection journey to be cancelled by action");
        this.f13325n.a(new o(this.d.e("cancel-connection-journey-action")).w(new m10.a(this, 0)));
    }

    public final void H() {
        Logger.a("Listening out for the connection journey request to stop proximity steps");
        this.f13325n.a(new o(this.d.e("stop-proximity-steps-action")).x(new m10.b(this, 14), new m10.a(this, 15)));
    }

    public final void J() {
        Logger.a("Listening out for the connection journey to be stopped by action");
        o oVar = new o(this.d.e("stop-connection-journey-action"));
        m10.b bVar = new m10.b(this, 4);
        b.a aVar = kz1.b.f50218a;
        this.f13325n.a(oVar.g(new nz1.f(bVar)).v());
    }

    public final void K(String str) {
        ConnectionJourneyDataStore connectionJourneyDataStore = this.e;
        String e = connectionJourneyDataStore.e();
        if (str.equals(e)) {
            n.n("status has already been updated: ", e, null);
            return;
        }
        Logger.a("status updating: ".concat(str));
        connectionJourneyDataStore.q(str);
        Intent intent = new Intent();
        intent.setAction("status-updated");
        this.f13324m.a(intent);
    }

    public final void M() {
        Logger.a("Waiting for a button press from user");
        x xVar = this.d.f13279a;
        xVar.a();
        this.f13325n.a(new o(new z0(xVar.f66189a).a()).x(new m10.b(this, 0), new m10.a(this, 3)));
    }

    public final void O() {
        Logger.a("Wait for Home Wifi password to be stored");
        GattConnectionJourney gattConnectionJourney = this.d;
        new o(gattConnectionJourney.e("cloud-polling-retry"));
        this.f13325n.a(new o(gattConnectionJourney.e("home-wifi-stored")).x(new m10.b(this, 14), new m10.a(this, 2)));
    }

    public final void Q() {
        Logger.a("Wait for Wifi re-scan to be started by action");
        this.f13325n.a(new o(this.d.e("re-scan-wifi-action")).x(new m10.b(this, 14), new m10.a(this, 10)));
    }

    public final void l() {
        K("CLOUD_POLLING_TIMEOUT");
        Logger.a("Wait for cloud polling to be restarted by action");
        this.f13325n.a(new o(this.d.e("cloud-polling-retry")).x(new m10.b(this, 14), new m10.a(this, 7)));
    }

    public final void m() {
        nz1.b g13;
        dz1.f m13;
        Logger.a("Starting authentication steps");
        GattConnectionJourney gattConnectionJourney = this.d;
        k kVar = gattConnectionJourney.f13281c;
        qh.j jVar = gattConnectionJourney.d;
        a60.a aVar = gattConnectionJourney.e;
        String str = gattConnectionJourney.f13297u;
        String str2 = gattConnectionJourney.f13299w;
        str2.getClass();
        p.a aVar2 = new p.a();
        x xVar = gattConnectionJourney.f13279a;
        aVar2.f22920a = xVar;
        aVar2.f22922c = kVar;
        aVar2.d = aVar;
        aVar2.f22921b = gattConnectionJourney.f13280b;
        p pVar = new p(aVar2.f22920a, aVar2.f22921b, aVar2.f22922c, aVar2.d, jVar.f66856c.b(), str2, str, gattConnectionJourney.f13290n, gattConnectionJourney.f13293q, 0);
        a1.i iVar = new a1.i(8, pVar, pVar.f22912a.b(pVar.f22915f));
        b.a aVar3 = kz1.b.f50218a;
        w m14 = new sz1.n(new sz1.c(iVar), new m10.f(new m10.d(gattConnectionJourney, 23), 18)).l(new b50.j(17)).m(new m10.f(new lm0.a(22), 19));
        xVar.a();
        sz1.j jVar2 = new sz1.j(new i(new sz1.k(new q70.p(xVar.f66189a).a(), new m10.f(new m10.d(gattConnectionJourney, 27), 20)), new m10.f(new m10.d(gattConnectionJourney, 28), 21)), new m10.f(new m10.d(gattConnectionJourney, 29), 14));
        d70.a aVar4 = gattConnectionJourney.f13292p;
        r60.a aVar5 = gattConnectionJourney.f13282f;
        String str3 = gattConnectionJourney.f13297u;
        String str4 = gattConnectionJourney.f13299w;
        Logger.a("Retrieve LTK from the cloud and Store");
        new a0.a().f66109a = aVar4;
        w l13 = new nz1.f(new g(new a0(xVar, aVar4, aVar5, str4, str3, 0), 3)).m(new m10.f(new m10.d(gattConnectionJourney, 24), 15)).l(new m10.e(gattConnectionJourney, 6));
        if (gattConnectionJourney.f13283g.o()) {
            z zVar = new z(gattConnectionJourney.f13297u, gattConnectionJourney.f13289m.f66160a);
            g13 = m14.g(new o(jVar2)).g(l13).g(new sz1.n(zVar.f66196b.a(new l(zVar.f66195a)).r(c02.a.f10004c), new m10.f(new m10.d(gattConnectionJourney, 25), 16)).l(new m10.e(gattConnectionJourney, 7)).m(new m10.f(new m10.d(gattConnectionJourney, 26), 17)));
        } else {
            g13 = m14.g(new o(jVar2)).g(l13);
        }
        if (this.e.j().getMachineType().equals(MachineType.MACHINE_552.getTypeName())) {
            nz1.f f13 = xVar.f(new f0(e60.e.a()));
            xVar.a();
            nz1.b g14 = f13.g(new i0(xVar.f66189a, c60.c.a((byte) 81)).a());
            xVar.a();
            m13 = new sz1.n(g14.i(new q70.n(xVar.f66189a).a()), new m10.b(this, 5)).m(new s(18));
        } else {
            m13 = nz1.j.d;
        }
        this.f13325n.a(g13.g(m13).x(new m10.b(this, 14), new m10.a(this, 5)));
    }

    public final void n() {
        Logger.a("Fetching manifest");
        this.f13325n.a(this.d.f13288l.f90155b.a().t(5L).x(new m10.b(this, 9), new m10.a(this, 11)));
    }

    public final void q() {
        Logger.a("Starting ownership");
        ConnectionJourneyDataStore connectionJourneyDataStore = this.e;
        BleScanningRecord d = connectionJourneyDataStore.d();
        String j8 = d.j();
        String k13 = d.k();
        String k14 = connectionJourneyDataStore.k();
        MachineDescriptor i13 = d.i();
        if (MachineType.fromTypeName(k13).isSingleUserMachine()) {
            n();
            return;
        }
        GattConnectionJourney gattConnectionJourney = this.d;
        gattConnectionJourney.getClass();
        l0 b13 = gattConnectionJourney.f13284h.b(j8);
        e2 e2Var = new e2(this, j8, i13, k14, 8);
        b.a aVar = kz1.b.f50218a;
        this.f13325n.a(new m(new i(new sz1.k(b13, e2Var), new m10.b(this, 14)), new h(8, this, j8)).p(new m10.b(this, 7), new s(20)));
    }

    public final void r(Throwable th2) {
        Logger.e("BleConnection error: " + th2, null);
        if (th2 instanceof GattConnectionJourney.WifiConnectionException) {
            c10.c cVar = this.f13321j;
            cVar.getClass();
            c10.c.b(cVar, g.a.BLE_GENERIC, g.b.HOME_WI_FI, g.c.RECEIVED_WIFI_DETAILS_FAILURE);
            int i13 = ((GattConnectionJourney.WifiConnectionException) th2).d;
            if (i13 == 2) {
                K("WRONG_HOME_WIFI_PASSWORD");
                O();
                return;
            } else if (i13 == 3 || i13 == 1) {
                K("RECOVERABLE_WIFI_FAILURE");
                return;
            }
        } else if (th2 instanceof CloudPollingTimeoutException) {
            ConnectionJourneyDataStore connectionJourneyDataStore = this.e;
            MachineCategory h13 = connectionJourneyDataStore.h();
            String j8 = connectionJourneyDataStore.d().j();
            if (h13 == MachineCategory.LIGHTING) {
                l();
                return;
            }
            l10.a aVar = this.f13319h;
            aVar.getClass();
            v j13 = aVar.f50346a.d(j8).s(10L, TimeUnit.SECONDS).r(c02.a.f10004c).j(fz1.a.a());
            m10.b bVar = new m10.b(this, 1);
            b.a aVar2 = kz1.b.f50218a;
            this.f13325n.a(new i(new sz1.k(j13, bVar), new m10.b(this, 2)).n());
            return;
        } else if (th2 instanceof MachineBannedException) {
            K("MACHINE_BANNED");
            return;
        } else if (th2 instanceof GattConnectionJourney.BleConnectionException) {
            this.f13320i.g(y40.c.BLE_DISCONNECTED, j.b.FAIL, th2.getMessage());
        }
        m10.b bVar2 = new m10.b(this, 4);
        b.a aVar3 = kz1.b.f50218a;
        new nz1.f(bVar2).v();
        K("CONNECTION_JOURNEY_FAILED");
    }

    public final void s(y40.c cVar) {
        ConnectionJourneyDataStore connectionJourneyDataStore = this.e;
        String machineType = connectionJourneyDataStore.j().getMachineType();
        String j8 = connectionJourneyDataStore.d().j();
        j jVar = this.f13320i;
        jVar.f89187a.f(machineType);
        jVar.f89187a.e(j8);
        jVar.d = connectionJourneyDataStore.o();
        jVar.f(cVar, j.b.SUCCESS);
    }
}
