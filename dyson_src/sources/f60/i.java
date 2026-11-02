package f60;

import com.dyson.mobile.android.connectivity.ble.lec.ConnectionResultException;
import com.dyson.mobile.android.connectivity.ble.message.AuthPayloadMessageUtils;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import e60.a;
import f60.u;
import f60.z;
import j3.p0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import l70.a;
import rz1.k0;
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eBu\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lf60/i;", "Lf60/t;", "Lqh/w;", "machineOwnershipManager", "Lf60/j0;", "longTermKeyRetriever", "Lf60/b0;", "blePreconditionsChecker", "Lf60/u;", "bleDeviceObtainer", "Lcom/dyson/mobile/android/connectivity/ble/b;", "bleClient", "Lh60/c;", "productInfoRetriever", "Lf60/s;", "bleAuthorizer", "Lz50/e;", "bluetoothBondManager", "Lf60/y;", "bleInitialConnectionAuthorizer", "Lf60/l;", "awsIotBrokerInitialSetupHandler", "Lf60/c0;", "bleScanConfiguration", "Ll70/a;", "connectivityLogTracker", "Lr60/a;", "connectivityDataStore", "<init>", "(Lqh/w;Lf60/j0;Lf60/b0;Lf60/u;Lcom/dyson/mobile/android/connectivity/ble/b;Lh60/c;Lf60/s;Lz50/e;Lf60/y;Lf60/l;Lf60/c0;Ll70/a;Lr60/a;)V", "b", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public class i implements t {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f29950w = 0;

    /* renamed from: a  reason: collision with root package name */
    public final qh.w f29951a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f29952b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f29953c;
    public final u d;
    public final com.dyson.mobile.android.connectivity.ble.b e;

    /* renamed from: f  reason: collision with root package name */
    public final h60.c f29954f;

    /* renamed from: g  reason: collision with root package name */
    public final s f29955g;

    /* renamed from: h  reason: collision with root package name */
    public final z50.e f29956h;

    /* renamed from: i  reason: collision with root package name */
    public final y f29957i;

    /* renamed from: j  reason: collision with root package name */
    public final l f29958j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f29959k;

    /* renamed from: l  reason: collision with root package name */
    public final l70.a f29960l;

    /* renamed from: m  reason: collision with root package name */
    public final r60.a f29961m;

    /* renamed from: n  reason: collision with root package name */
    public final d02.a<z> f29962n;

    /* renamed from: o  reason: collision with root package name */
    public final k0 f29963o;

    /* renamed from: p  reason: collision with root package name */
    public final d02.a<e0> f29964p;

    /* renamed from: q  reason: collision with root package name */
    public final k0 f29965q;

    /* renamed from: r  reason: collision with root package name */
    public final d02.a<si.d> f29966r;

    /* renamed from: s  reason: collision with root package name */
    public final k0 f29967s;

    /* renamed from: t  reason: collision with root package name */
    public d60.g f29968t;

    /* renamed from: u  reason: collision with root package name */
    public d60.b f29969u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f29970v;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends x12.p implements w12.a<h12.f0> {
        public a(Object obj) {
            super(0, obj, i.class, "onDisconnected", "onDisconnected()V", 0);
        }

        @Override // w12.a
        public final h12.f0 invoke() {
            d02.a<z> aVar = ((i) this.receiver).f29962n;
            if (aVar.c0() instanceof z.a) {
                aVar.onNext(new z.c(a0.DISCONNECTED_BY_MACHINE));
            }
            return h12.f0.f36844a;
        }
    }

    static {
        new b(null);
    }

    public i(qh.w wVar, j0 j0Var, b0 b0Var, u uVar, com.dyson.mobile.android.connectivity.ble.b bVar, h60.c cVar, s sVar, z50.e eVar, y yVar, l lVar, c0 c0Var, l70.a aVar, r60.a aVar2) {
        wVar.getClass();
        j0Var.getClass();
        b0Var.getClass();
        uVar.getClass();
        bVar.getClass();
        cVar.getClass();
        sVar.getClass();
        eVar.getClass();
        yVar.getClass();
        lVar.getClass();
        c0Var.getClass();
        aVar2.getClass();
        this.f29951a = wVar;
        this.f29952b = j0Var;
        this.f29953c = b0Var;
        this.d = uVar;
        this.e = bVar;
        this.f29954f = cVar;
        this.f29955g = sVar;
        this.f29956h = eVar;
        this.f29957i = yVar;
        this.f29958j = lVar;
        this.f29959k = c0Var;
        this.f29960l = aVar;
        this.f29961m = aVar2;
        bVar.t(new a(this));
        d02.a<z> aVar3 = new d02.a<>(new z.c(a0.IDLE));
        this.f29962n = aVar3;
        this.f29963o = new k0(aVar3);
        d02.a<e0> aVar4 = new d02.a<>();
        this.f29964p = aVar4;
        this.f29965q = new k0(aVar4);
        d02.a<si.d> aVar5 = new d02.a<>();
        this.f29966r = aVar5;
        this.f29967s = new k0(aVar5);
    }

    @Override // f60.t
    public final nz1.g a(MachineSerial machineSerial) {
        bq1.g gVar = new bq1.g(2, this, new ev1.e(2, this, machineSerial));
        b.a aVar = kz1.b.f50218a;
        return new nz1.g(gVar);
    }

    public final sz1.i b(MachineSerial machineSerial, String str) {
        str.getClass();
        y yVar = this.f29957i;
        yVar.getClass();
        com.dyson.mobile.android.connectivity.ble.b bVar = this.e;
        bVar.getClass();
        byte[] a13 = AuthPayloadMessageUtils.a(yVar.e.b());
        j60.a aVar = yVar.f30008c;
        String str2 = machineSerial.d;
        aVar.getClass();
        dz1.x<m60.a> b13 = aVar.f44005a.b(str2, str);
        iw0.l lVar = new iw0.l(new p0(4), 13);
        b13.getClass();
        b.a aVar2 = kz1.b.f50218a;
        return cd.b.m(new sz1.k(new sz1.x(new sz1.m(new sz1.m(new sz1.x(cd.b.m(new sz1.k(new sz1.t(b13, lVar).r(c02.a.f10004c), new h(new v(yVar, 0), 23)), "AuthenticatedBleConnector - Payload 1 received from cloud", null, null, null, 14), new h(new e(26), 24)), new h(new dy1.d(15, bVar, yVar), 25)), new h(new c90.b0(yVar, machineSerial, bVar, a13, str, 5), 26)), new f60.b(new eo0.m(23), 3)), new f60.b(new f60.a(this, 4), 4)), "Authorise client initial CJ", null, null, null, 14);
    }

    public final dz1.b c(MachineSerial machineSerial, u.b bVar) {
        nz1.w i13;
        bVar.getClass();
        if (!bVar.f30004b) {
            Logger.b("Unable to connect to client - someone else is connected", null);
            return dz1.b.p(new ConnectionResultException(a0.SOMEONE_ELSE_CONNECTED, null, 2, null));
        }
        nz1.a0 A = this.e.w(machineSerial, bVar.f30003a).A(30000L, TimeUnit.MILLISECONDS);
        f60.b bVar2 = new f60.b(new e(5), 28);
        b.a aVar = kz1.b.f50218a;
        i13 = cd.b.i(new nz1.x(A, bVar2), "Connect to client", new ga0.c0(7), new ga0.a0(5));
        return i13;
    }

    public final void d() {
        Logger.a("Connection disconnected by app");
        this.f29962n.onNext(new z.c(a0.DISCONNECTED_BY_APP));
        this.e.disconnect();
    }

    public final nz1.x e(d60.b bVar, MachineSerial machineSerial, String str) {
        bVar.getClass();
        String str2 = machineSerial.d;
        l lVar = this.f29958j;
        lVar.getClass();
        sz1.i m13 = cd.b.m(lVar.f29985a.f44007a.a(new q70.l(str2)).r(c02.a.f10004c), "AuthenticatedBleConnector - Get Iot Broker Details", null, null, null, 14);
        f60.b bVar2 = new f60.b(new b31.j(this, bVar, machineSerial, str, 8), 16);
        b.a aVar = kz1.b.f50218a;
        return new nz1.x(new sz1.n(m13, bVar2).A(15000L, TimeUnit.MILLISECONDS), new f60.b(new e(0), 17));
    }

    public final boolean f() {
        return this.f29962n.c0() instanceof z.a;
    }

    public final void g(a.InterfaceC1576a interfaceC1576a) {
        interfaceC1576a.getClass();
        l70.a aVar = this.f29960l;
        if (aVar != null) {
            aVar.d(interfaceC1576a);
            h12.f0 f0Var = h12.f0.f36844a;
        }
    }

    public final nz1.w h() {
        nz1.w i13;
        dz1.b r13 = this.e.r();
        f60.b bVar = new f60.b(new e(3), 21);
        b.a aVar = kz1.b.f50218a;
        i13 = cd.b.i(new nz1.x(r13, bVar), "Requesting MTU of 251", new ga0.c0(7), new ga0.a0(5));
        return i13;
    }

    public final sz1.k i(MachineSerial machineSerial) {
        sz1.z s13 = this.f29952b.a(machineSerial).s(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, TimeUnit.MILLISECONDS);
        f fVar = new f(new e(10), 5);
        b.a aVar = kz1.b.f50218a;
        return new sz1.k(new sz1.x(s13, fVar), new f(new e(11), 6));
    }

    public final sz1.i j() {
        sz1.z s13 = this.f29954f.a(this.e).s(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, TimeUnit.MILLISECONDS);
        f fVar = new f(new e(9), 3);
        b.a aVar = kz1.b.f50218a;
        return cd.b.m(new sz1.k(new sz1.x(s13, fVar), new f(new f60.a(this, 13), 4)), "Retrieve product info", null, null, null, 14);
    }

    public final nz1.w k() {
        nz1.w i13;
        nz1.a0 A = this.e.q(i12.s.c(new x50.e0(e60.a.f26064b, a.C0902a.f26066a))).A(7000L, TimeUnit.MILLISECONDS);
        f60.b bVar = new f60.b(new e(2), 20);
        b.a aVar = kz1.b.f50218a;
        i13 = cd.b.i(new nz1.x(A, bVar), "Subscribe to client", new ga0.c0(7), new ga0.a0(5));
        return i13;
    }

    public final sz1.i l() {
        nz1.v s13 = this.e.q(i12.s.c(e60.e.a())).A(7000L, TimeUnit.MILLISECONDS).s();
        b.a aVar = kz1.b.f50218a;
        return cd.b.m(new nz1.e0(s13, null, 0), "subscription to messaging characteristics", null, null, null, 14);
    }

    public final nz1.o m(sz1.m mVar, MachineSerial machineSerial) {
        machineSerial.getClass();
        f60.b bVar = new f60.b(new e(4), 24);
        b.a aVar = kz1.b.f50218a;
        return new nz1.o(new sz1.i(new sz1.k(new sz1.j(new sz1.x(mVar, bVar), new f60.b(new d(machineSerial, this, 2), 25)), new f60.b(new d(machineSerial, this, 4), 26)), new f60.b(new d(machineSerial, this, 5), 27)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lf60/i$b;", "", "<init>", "()V", "", "RETRIEVE_LONG_TERM_KEY_TIMEOUT_MILLIS", "J", "CONNECT_TO_CLIENT_TIMEOUT_MILLIS", "SUBSCRIPTION_TIMEOUT_MILLIS", "RETRIEVE_PRODUCT_INFO_TIMEOUT_MILLIS", "WAIT_FOR_BOND_TIMEOUT_MILLIS", "RSSI_IN_RANGE_TIMEOUT_MILLIS", "USER_PRESS_BUTTON_TIMEOUT_MILLIS", "BLE_MESSAGE_TIMEOUT_MS", "OBTAIN_BROKER_DETAILS_TIMEOUT_MS", "OWNERSHIP_TIMEOUT_SECONDS", "OWNERSHIP_RETRY_COUNT", "SEND_RANDOM_NUMBER_TIMEOUT_MILLIS", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(qh.w wVar, j0 j0Var, b0 b0Var, u uVar, com.dyson.mobile.android.connectivity.ble.b bVar, h60.c cVar, s sVar, z50.e eVar, y yVar, l lVar, l70.a aVar, r60.a aVar2) {
        this(wVar, j0Var, b0Var, uVar, bVar, cVar, sVar, eVar, yVar, lVar, null, aVar, aVar2, 1024, null);
        wVar.getClass();
        j0Var.getClass();
        b0Var.getClass();
        uVar.getClass();
        bVar.getClass();
        cVar.getClass();
        sVar.getClass();
        eVar.getClass();
        yVar.getClass();
        lVar.getClass();
        aVar2.getClass();
    }

    public /* synthetic */ i(qh.w wVar, j0 j0Var, b0 b0Var, u uVar, com.dyson.mobile.android.connectivity.ble.b bVar, h60.c cVar, s sVar, z50.e eVar, y yVar, l lVar, c0 c0Var, l70.a aVar, r60.a aVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(wVar, j0Var, b0Var, uVar, bVar, cVar, sVar, eVar, yVar, lVar, (i13 & 1024) != 0 ? new c0(n.PERFORM_BLE_SCAN, d0.STANDARD_TIMEOUT) : c0Var, aVar, aVar2);
    }
}
