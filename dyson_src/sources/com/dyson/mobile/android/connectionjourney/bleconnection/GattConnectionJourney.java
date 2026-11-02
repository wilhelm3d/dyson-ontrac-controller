package com.dyson.mobile.android.connectionjourney.bleconnection;

import bh1.f;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.connectivity.ble.f;
import com.dyson.mobile.android.logging.Logger;
import d50.l;
import d60.g;
import e60.a;
import f60.m;
import j60.h;
import j90.k;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import lf0.m0;
import nz1.w;
import p30.a0;
import q70.a1;
import q70.i0;
import q70.n0;
import q70.o;
import q70.p0;
import q70.x;
import q70.y;
import qh.j;
import sz1.i;
import sz1.n;
import x50.c0;
import x50.e0;
import x50.f0;
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004./01B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-¨\u00062"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionJourney;", "Lcom/dyson/mobile/android/connectivity/ble/f$b;", "Lq70/x;", "gattTaskFactory", "Lcom/dyson/mobile/android/connectivity/ble/d;", "connectionHandler", "Lj90/k;", "httpRequestFactory", "Lqh/j;", "accountManager", "La60/a;", "bleAuthConfig", "Lr60/a;", "connectivityDataStore", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "connectionJourneyDataStore", "Lx50/c0;", "gattConnectionInfoFactory", "Lp30/a0;", "ownershipTaskFactory", "Lt70/a;", "broadcastReceiverWrapper", "Ld50/l;", "gattMqttTaskFactory", "Lh40/d;", "ownershipDataStore", "Lyi0/f;", "machineManager", "Lq70/o;", "brokerDetailsTaskFactory", "Ly40/j;", "connectionJourneyLogTracker", "Lj60/h;", "lecProvisionTask", "Ld70/a;", "lecCloudService", "Lc10/c;", "connectionProcessEventsTracker", "Lq70/p0;", "regionIndexResolver", "Lz50/e;", "bluetoothBondManager", "Lf60/m;", "awsIotMqttConnectionFactory", "<init>", "(Lq70/x;Lcom/dyson/mobile/android/connectivity/ble/d;Lj90/k;Lqh/j;La60/a;Lr60/a;Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lx50/c0;Lp30/a0;Lt70/a;Ld50/l;Lh40/d;Lyi0/f;Lq70/o;Ly40/j;Lj60/h;Ld70/a;Lc10/c;Lq70/p0;Lz50/e;Lf60/m;)V", "WifiConnectionException", "BleConnectionException", "ConnectionJourneyCancellationException", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GattConnectionJourney implements f.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a  reason: collision with root package name */
    public final x f13279a;

    /* renamed from: b  reason: collision with root package name */
    public final com.dyson.mobile.android.connectivity.ble.d f13280b;

    /* renamed from: c  reason: collision with root package name */
    public final k f13281c;
    public final j d;
    public final a60.a e;

    /* renamed from: f  reason: collision with root package name */
    public final r60.a f13282f;

    /* renamed from: g  reason: collision with root package name */
    public final ConnectionJourneyDataStore f13283g;

    /* renamed from: h  reason: collision with root package name */
    public final a0 f13284h;

    /* renamed from: i  reason: collision with root package name */
    public final t70.a f13285i;

    /* renamed from: j  reason: collision with root package name */
    public final l f13286j;

    /* renamed from: k  reason: collision with root package name */
    public final h40.d f13287k;

    /* renamed from: l  reason: collision with root package name */
    public final yi0.f f13288l;

    /* renamed from: m  reason: collision with root package name */
    public final o f13289m;

    /* renamed from: n  reason: collision with root package name */
    public final y40.j f13290n;

    /* renamed from: o  reason: collision with root package name */
    public final h f13291o;

    /* renamed from: p  reason: collision with root package name */
    public final d70.a f13292p;

    /* renamed from: q  reason: collision with root package name */
    public final c10.c f13293q;

    /* renamed from: r  reason: collision with root package name */
    public final p0 f13294r;

    /* renamed from: s  reason: collision with root package name */
    public final z50.e f13295s;

    /* renamed from: t  reason: collision with root package name */
    public com.dyson.mobile.android.connectionjourney.bleconnection.a f13296t;

    /* renamed from: u  reason: collision with root package name */
    public String f13297u;

    /* renamed from: v  reason: collision with root package name */
    public String f13298v;

    /* renamed from: w  reason: collision with root package name */
    public String f13299w;

    /* renamed from: x  reason: collision with root package name */
    public g f13300x;

    /* renamed from: y  reason: collision with root package name */
    public d60.b f13301y;

    /* renamed from: z  reason: collision with root package name */
    public z60.e f13302z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionJourney$BleConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BleConnectionException extends Exception {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionJourney$ConnectionJourneyCancellationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ConnectionJourneyCancellationException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConnectionJourneyCancellationException(String str) {
            super(str);
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionJourney$WifiConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "", "reason", "<init>", "(Ljava/lang/String;I)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class WifiConnectionException extends Exception {
        public final int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WifiConnectionException(String str, int i13) {
            super(str);
            str.getClass();
            this.d = i13;
        }
    }

    static {
        new a(null);
    }

    public GattConnectionJourney(x xVar, com.dyson.mobile.android.connectivity.ble.d dVar, k kVar, j jVar, a60.a aVar, r60.a aVar2, ConnectionJourneyDataStore connectionJourneyDataStore, c0 c0Var, a0 a0Var, t70.a aVar3, l lVar, h40.d dVar2, yi0.f fVar, o oVar, y40.j jVar2, h hVar, d70.a aVar4, c10.c cVar, p0 p0Var, z50.e eVar, m mVar) {
        xVar.getClass();
        dVar.getClass();
        kVar.getClass();
        jVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        connectionJourneyDataStore.getClass();
        c0Var.getClass();
        a0Var.getClass();
        aVar3.getClass();
        lVar.getClass();
        dVar2.getClass();
        fVar.getClass();
        oVar.getClass();
        jVar2.getClass();
        hVar.getClass();
        aVar4.getClass();
        cVar.getClass();
        p0Var.getClass();
        eVar.getClass();
        mVar.getClass();
        this.f13279a = xVar;
        this.f13280b = dVar;
        this.f13281c = kVar;
        this.d = jVar;
        this.e = aVar;
        this.f13282f = aVar2;
        this.f13283g = connectionJourneyDataStore;
        this.f13284h = a0Var;
        this.f13285i = aVar3;
        this.f13286j = lVar;
        this.f13287k = dVar2;
        this.f13288l = fVar;
        this.f13289m = oVar;
        this.f13290n = jVar2;
        this.f13291o = hVar;
        this.f13292p = aVar4;
        this.f13293q = cVar;
        this.f13294r = p0Var;
        this.f13295s = eVar;
        this.f13297u = "";
        this.f13298v = "";
        this.f13299w = "";
    }

    @Override // com.dyson.mobile.android.connectivity.ble.f.b
    public final void a(f.a aVar, f.e eVar) {
        aVar.getClass();
        eVar.getClass();
        com.dyson.mobile.android.connectionjourney.bleconnection.a aVar2 = this.f13296t;
        if (aVar == f.a.DISCONNECTED && aVar2 != null) {
            Logger.a("onDisconnect");
            aVar2.r(new BleConnectionException());
        } else if (aVar == f.a.CONNECTED) {
            com.dyson.mobile.android.connectivity.ble.d dVar = this.f13280b;
            if (dVar.f14000m != null) {
                Logger.c("Requesting to set Gatt connection priority to 1");
                dVar.f14000m.c();
            }
        }
    }

    public final n b() {
        x xVar = this.f13279a;
        xVar.a();
        sz1.c a13 = new q70.j(xVar.f66189a).a();
        m0 m0Var = new m0(new m10.d(this, 0), 12);
        b.a aVar = kz1.b.f50218a;
        return new n(new sz1.m(a13, m0Var), new m0(new m10.d(this, 1), 13));
    }

    public final nz1.b c() {
        dz1.f oVar;
        UUID uuid = e60.a.f26064b;
        f0 f0Var = new f0(new e0(uuid, a.C0902a.f26066a), new e0(uuid, a.C0902a.f26067b));
        x xVar = this.f13279a;
        w l13 = xVar.f(f0Var).o(new m10.f(new m10.d(this, 14), 0)).m(new m10.f(new m10.d(this, 15), 2)).l(new m10.e(this, 1));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nz1.a0 A2 = l13.k(2L, timeUnit).A(10L, timeUnit);
        f.b a13 = bh1.f.a(TimeoutException.class);
        a13.c(3);
        nz1.m u8 = A2.u(a13.a());
        xVar.a();
        nz1.o oVar2 = new nz1.o(new n0(xVar.f66189a).a().G(xVar.d()).s(new m0(new lm0.a(17), 27), kz1.a.f50215c).x());
        m0 m0Var = new m0(new m10.d(this, 13), 28);
        b.a aVar = kz1.b.f50218a;
        nz1.b g13 = u8.g(new nz1.x(new nz1.x(oVar2, m0Var).t(1L), new m0(new lm0.a(18), 29)));
        xVar.a();
        nz1.a0 A3 = new nz1.o(new sz1.k(new i(new sz1.j(new q70.m0(xVar.f66189a).a(), new m0(new lm0.a(15), 21)), new m0(new m10.d(this, 8), 22)), new m0(new m10.d(this, 9), 23))).A(10L, timeUnit);
        f.b a14 = bh1.f.a(TimeoutException.class);
        a14.c(2);
        nz1.m u13 = A3.u(a14.a());
        xVar.a();
        nz1.f a15 = new i0(xVar.f66189a, c60.c.a((byte) 10)).a();
        kz1.b.a(a15, "other is null");
        dz1.b q13 = dz1.b.q(u13, a15);
        q13.getClass();
        if (this.f13283g.o()) {
            Logger.a("Skipping WiFi details for GATT-only protocol");
            oVar = nz1.j.d;
            oVar.getClass();
        } else {
            xVar.a();
            oVar = new nz1.o(new sz1.k(new i(new sz1.j(new a1(xVar.f66189a).a(), new m0(new lm0.a(16), 24)), new m0(new m10.d(this, 10), 25)), new m0(new m10.d(this, 11), 26)));
        }
        return g13.g(dz1.b.q(q13, oVar));
    }

    public final w d() {
        f0 f0Var = new f0(new e0(e60.a.f26064b, a.C0902a.f26067b));
        x xVar = this.f13279a;
        xVar.a();
        y yVar = new y(xVar.f66189a, f0Var);
        q70.g gVar = new q70.g(yVar, 2);
        b.a aVar = kz1.b.f50218a;
        return new nz1.f(gVar).A(yVar.f66193c, TimeUnit.SECONDS).l(new b50.j(14));
    }

    public final sz1.c e(String str) {
        ji1.h hVar = new ji1.h(9, str, this);
        b.a aVar = kz1.b.f50218a;
        return new sz1.c(hVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionJourney$a;", "", "<init>", "()V", "", "SUBSCRIPTION_TIMEOUT_SECS", "J", "", "SUBSCRIPTION_RETRIES", "I", "SUBSCRIPTION_DELAY_SECS", "INITIAL_COMMUNICATION_TIMEOUT_SECS", "INITIAL_COMMUNICATION_RETRIES", "WIFI_LIST_TIMEOUT_SECS", "WIFI_LIST_RETRIES", "WAIT_FOR_BOND_TIMEOUT_SECS", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
