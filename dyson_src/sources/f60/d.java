package f60;

import com.dyson.mobile.android.connectivity.ble.lec.ConnectionResultException;
import com.dyson.mobile.android.connectivity.ble.message.AuthPayloadMessageUtils;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import f60.u;
import f60.z;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kz1.b;
import r60.a;
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ i e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MachineSerial f29942f;

    public /* synthetic */ d(MachineSerial machineSerial, i iVar, int i13) {
        this.d = i13;
        this.f29942f = machineSerial;
        this.e = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dz1.b0 g13;
        int i13 = this.d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        MachineSerial machineSerial = this.f29942f;
        i iVar = this.e;
        switch (i13) {
            case 0:
                int i14 = i.f29950w;
                ((d60.g) obj).getClass();
                return iVar.i(machineSerial);
            case 1:
                int i15 = i.f29950w;
                ((h0) obj).getClass();
                return iVar.d.a(machineSerial, iVar.f29959k);
            case 2:
                gz1.c cVar = (gz1.c) obj;
                int i16 = i.f29950w;
                Logger.a("Connecting to " + machineSerial);
                iVar.f29962n.onNext(z.b.f30014a);
                return h12.f0.f36844a;
            case 3:
                MachineSerial machineSerial2 = this.f29942f;
                h0 h0Var = (h0) obj;
                int i17 = i.f29950w;
                h0Var.getClass();
                s sVar = iVar.f29955g;
                com.dyson.mobile.android.connectivity.ble.b bVar = iVar.e;
                sVar.getClass();
                bVar.getClass();
                byte[] a13 = AuthPayloadMessageUtils.a(sVar.f29998b.b());
                try {
                    byte[] bArr = h0Var.f29949b;
                    a13.getClass();
                    byte[] bArr2 = new byte[16];
                    new SecureRandom().nextBytes(bArr2);
                    g13 = sVar.a(machineSerial2, bVar, h0Var, new m60.i(c60.b.b(bArr, bArr2, a13)), a13);
                } catch (Exception e) {
                    Logger.b("Failed to authorize: " + e, null);
                    g13 = dz1.x.g(new IllegalStateException());
                }
                b bVar2 = new b(new e(6), 29);
                b.a aVar = kz1.b.f50218a;
                return cd.b.m(new sz1.k(new sz1.x(g13, bVar2), new f(new a(iVar, 12), 1)), "Authorise client", null, null, null, 14);
            case 4:
                int i18 = i.f29950w;
                Logger.a("Connected to " + machineSerial);
                iVar.f29962n.onNext(z.a.f30013a);
                return h12.f0.f36844a;
            case 5:
                Throwable th2 = (Throwable) obj;
                int i19 = i.f29950w;
                Logger.b("Failed to Connect to " + machineSerial, th2);
                boolean z13 = th2 instanceof ConnectionResultException;
                d02.a<z> aVar2 = iVar.f29962n;
                if (z13) {
                    aVar2.onNext(new z.c(((ConnectionResultException) th2).d));
                } else {
                    aVar2.onNext(new z.c(a0.UNKNOWN_ERROR));
                }
                th2.getClass();
                l70.a aVar3 = iVar.f29960l;
                if (aVar3 != null) {
                    aVar3.b(th2);
                    h12.f0 f0Var = h12.f0.f36844a;
                }
                Logger.a("Called disconnect on bleClient due to failure connecting");
                iVar.e.disconnect();
                return h12.f0.f36844a;
            case 6:
                a.b bVar3 = (a.b) obj;
                int i23 = i.f29950w;
                bVar3.getClass();
                String str = bVar3.f70497b;
                dz1.b c13 = iVar.c(machineSerial, new u.b(str, bVar3.f70498c));
                bq1.g gVar = new bq1.g(3, iVar, str);
                b.a aVar4 = kz1.b.f50218a;
                return cd.b.m(new nz1.e0(c13.g(new nz1.g(gVar)).g(iVar.k()).l(new c(iVar, 0)), null, 0), "AuthenticatedBleConnector - Connect to client", null, null, null, 14);
            case 7:
                h12.p pVar = (h12.p) obj;
                int i24 = i.f29950w;
                pVar.getClass();
                iVar.f29966r.onNext(pVar.e);
                A a14 = pVar.d;
                a14.getClass();
                return iVar.b(machineSerial, (String) a14);
            case 8:
                String str2 = (String) obj;
                int i25 = i.f29950w;
                str2.getClass();
                dz1.x<si.d> b13 = iVar.f29951a.b(machineSerial.d);
                ev0.c cVar2 = new ev0.c(new e(14), 25);
                b13.getClass();
                b.a aVar5 = kz1.b.f50218a;
                return new sz1.t(new sz1.x(b13, cVar2).s(20L, timeUnit).l(3L), new ev0.c(new ay1.b(str2, 10), 26));
            case 9:
                gz1.c cVar3 = (gz1.c) obj;
                iVar.f29964p.onNext(e0.PLEASE_STAY_CLOSE);
                iVar.f29952b.f29981a.f(machineSerial.d);
                return h12.f0.f36844a;
            case 10:
                String str3 = (String) obj;
                int i26 = i.f29950w;
                str3.getClass();
                dz1.x<si.d> b14 = iVar.f29951a.b(machineSerial.d);
                b bVar4 = new b(new eo0.m(25), 8);
                b14.getClass();
                b.a aVar6 = kz1.b.f50218a;
                return new sz1.t(new sz1.x(b14, bVar4).s(20L, timeUnit).l(3L), new b(new ay1.b(str3, 11), 9));
            case 11:
                h12.p pVar2 = (h12.p) obj;
                int i27 = i.f29950w;
                pVar2.getClass();
                iVar.f29966r.onNext(pVar2.e);
                iVar.f29964p.onNext(e0.PAIRING_PURIFICATION);
                A a15 = pVar2.d;
                a15.getClass();
                return iVar.b(machineSerial, (String) a15);
            case 12:
                u.b bVar5 = (u.b) obj;
                int i28 = i.f29950w;
                bVar5.getClass();
                dz1.b c14 = iVar.c(machineSerial, bVar5);
                bq1.g gVar2 = new bq1.g(3, iVar, bVar5.f30003a);
                b.a aVar7 = kz1.b.f50218a;
                return new nz1.e0(c14.g(new nz1.g(gVar2)).g(iVar.k()), null, 0);
            default:
                u.b bVar6 = (u.b) obj;
                int i29 = i.f29950w;
                bVar6.getClass();
                dz1.b c15 = iVar.c(machineSerial, bVar6);
                bq1.g gVar3 = new bq1.g(3, iVar, bVar6.f30003a);
                b.a aVar8 = kz1.b.f50218a;
                return cd.b.m(new sz1.k(new nz1.e0(c15.g(new nz1.g(gVar3)).g(iVar.k()), null, 0), new ev0.c(new a(iVar, 0), 27)), "AuthenticatedBleConnector - Connect to client", null, null, null, 14);
        }
    }

    public /* synthetic */ d(i iVar, MachineSerial machineSerial, int i13) {
        this.d = i13;
        this.e = iVar;
        this.f29942f = machineSerial;
    }
}
