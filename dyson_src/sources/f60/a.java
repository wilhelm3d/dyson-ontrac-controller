package f60;

import com.dyson.mobile.android.connectivity.ble.lec.ConnectionResultException;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import d60.h;
import e60.a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kz1.b;
import l70.a;
import rz1.k0;
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ i e;

    public /* synthetic */ a(i iVar, int i13) {
        this.d = i13;
        this.e = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nz1.w i13;
        nz1.w i14;
        nz1.w i15;
        int i16 = this.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i iVar = this.e;
        switch (i16) {
            case 0:
                Integer num = (Integer) obj;
                int i17 = i.f29950w;
                iVar.g(a.InterfaceC1576a.C1577a.f50966a);
                return h12.f0.f36844a;
            case 1:
                d60.g gVar = (d60.g) obj;
                int i18 = i.f29950w;
                gVar.getClass();
                l70.a aVar = iVar.f29960l;
                if (aVar != null) {
                    aVar.c(gVar.a());
                }
                iVar.g(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_PRODUCT_INFO));
                return h12.f0.f36844a;
            case 2:
                String str = (String) obj;
                int i19 = i.f29950w;
                iVar.g(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_BUTTON_PRESS));
                return h12.f0.f36844a;
            case 3:
                h.a aVar2 = (h.a) obj;
                int i23 = i.f29950w;
                iVar.g(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_UNIQUE_PRODUCT_CODE));
                return h12.f0.f36844a;
            case 4:
                iVar.f29969u = (d60.b) obj;
                return h12.f0.f36844a;
            case 5:
                d60.g gVar2 = (d60.g) obj;
                int i24 = i.f29950w;
                gVar2.getClass();
                l70.a aVar3 = iVar.f29960l;
                if (aVar3 != null) {
                    aVar3.c(gVar2.a());
                }
                iVar.g(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_PRODUCT_INFO));
                return h12.f0.f36844a;
            case 6:
                int i25 = i.f29950w;
                ((Integer) obj).getClass();
                return iVar.j();
            case 7:
                Integer num2 = (Integer) obj;
                int i26 = i.f29950w;
                iVar.g(new a.InterfaceC1576a.e(a.InterfaceC1576a.f.SENDING_INITIATE_PAIRING_COMMAND));
                return h12.f0.f36844a;
            case 8:
                Integer num3 = (Integer) obj;
                int i27 = i.f29950w;
                iVar.g(new a.InterfaceC1576a.e(a.InterfaceC1576a.f.SENDING_HELLO_MESSAGE));
                return h12.f0.f36844a;
            case 9:
                Integer num4 = (Integer) obj;
                int i28 = i.f29950w;
                iVar.g(new a.InterfaceC1576a.e(a.InterfaceC1576a.f.SENDING_HELLO_MESSAGE));
                return h12.f0.f36844a;
            case 10:
                d02.a<e0> aVar4 = iVar.f29964p;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof ConnectionResultException) {
                    int i29 = i.f29950w;
                    if (((ConnectionResultException) th2).d == a0.RSSI_OUT_OF_RANGE) {
                        aVar4.onNext(e0.PROXIMITY_FAILED);
                        return h12.f0.f36844a;
                    }
                }
                aVar4.onNext(e0.PAIRING_FAILED);
                return h12.f0.f36844a;
            case 11:
                d02.a<e0> aVar5 = iVar.f29964p;
                Throwable th3 = (Throwable) obj;
                int i33 = i.f29950w;
                boolean z13 = th3 instanceof ConnectionResultException;
                if (z13 && ((ConnectionResultException) th3).d == a0.RSSI_OUT_OF_RANGE) {
                    aVar5.onNext(e0.PROXIMITY_FAILED);
                } else if (z13 && ((ConnectionResultException) th3).d == a0.SOMEONE_ELSE_CONNECTED) {
                    aVar5.onNext(e0.PAIRING_SOMEONE_ELSE_CONNECTED);
                } else {
                    aVar5.onNext(e0.PAIRING_FAILED);
                }
                return h12.f0.f36844a;
            case 12:
                iVar.f29969u = (d60.b) obj;
                return h12.f0.f36844a;
            case 13:
                iVar.f29968t = (d60.g) obj;
                return h12.f0.f36844a;
            case 14:
                int i34 = i.f29950w;
                ((d60.b) obj).getClass();
                return iVar.l();
            case 15:
                int i35 = i.f29950w;
                ((Integer) obj).getClass();
                return iVar.l();
            case 16:
                int i36 = i.f29950w;
                ((Integer) obj).getClass();
                nz1.w h13 = iVar.h();
                b.a aVar6 = kz1.b.f50218a;
                return cd.b.m(new nz1.e0(h13, null, 0), "AuthenticatedBleConnector - request extended mtu", null, null, null, 14);
            case 17:
                int i37 = i.f29950w;
                ((Integer) obj).getClass();
                sz1.i j8 = iVar.j();
                b bVar = new b(new a(iVar, 5), 5);
                b.a aVar7 = kz1.b.f50218a;
                return cd.b.m(new sz1.k(j8, bVar), "AuthenticatedBleConnector - Retrieve product info", null, null, null, 14);
            case 18:
                int i38 = i.f29950w;
                ((Integer) obj).getClass();
                com.dyson.mobile.android.connectivity.ble.b bVar2 = iVar.e;
                i13 = cd.b.i(bVar2.x(i12.s.c(new x50.e0(e60.a.f26064b, a.C0902a.f26067b))), "AuthenticatedBleConnector - Unsubscribe To Rssi", new ga0.c0(7), new ga0.a0(5));
                sz1.z s13 = i13.i(cd.b.m(bVar2.v(m60.c.d, new n70.l()), "AuthenticatedBleConnector - Within Range", null, null, null, 14)).s(NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, timeUnit);
                b bVar3 = new b(new e(1), 18);
                b.a aVar8 = kz1.b.f50218a;
                return new sz1.k(new sz1.x(s13, bVar3), new b(new a(iVar, 3), 2));
            case 19:
                h.a aVar9 = (h.a) obj;
                int i39 = i.f29950w;
                aVar9.getClass();
                iVar.f29964p.onNext(e0.WAIT_BUTTON_PRESS);
                String d = in0.c.d(aVar9.f22971b);
                k0 k0Var = iVar.f29963o;
                b bVar4 = new b(new eo0.m(26), 13);
                k0Var.getClass();
                b.a aVar10 = kz1.b.f50218a;
                rz1.d0 d0Var = new rz1.d0(k0Var, bVar4, false);
                com.dyson.mobile.android.connectivity.ble.b bVar5 = iVar.e;
                byte[] bArr = aVar9.f22970a;
                bArr.getClass();
                dz1.b f13 = dz1.b.f(new nz1.o(bVar5.v(new m60.p(bArr), new n70.m()).s(240000L, timeUnit)), d0Var);
                b bVar6 = new b(new eo0.m(27), 14);
                f13.getClass();
                i14 = cd.b.i(new nz1.x(f13, bVar6), "Sending unique product code and waiting for user action or disconnection", new ga0.c0(7), new ga0.a0(5));
                return new sz1.k(new nz1.e0(i14, null, d), new b(new a(iVar, 2), 1));
            case 20:
                int i43 = i.f29950w;
                ((Integer) obj).getClass();
                return iVar.l();
            case 21:
                int i44 = i.f29950w;
                ((Integer) obj).getClass();
                nz1.w h14 = iVar.h();
                b.a aVar11 = kz1.b.f50218a;
                return cd.b.m(new nz1.e0(h14, null, 0), "AuthenticatedBleConnector - request extended mtu", null, null, null, 14);
            case 22:
                int i45 = i.f29950w;
                ((Integer) obj).getClass();
                sz1.i j13 = iVar.j();
                ev0.c cVar = new ev0.c(new a(iVar, 1), 29);
                b.a aVar12 = kz1.b.f50218a;
                return cd.b.m(new sz1.k(j13, cVar), "AuthenticatedBleConnector - Retrieve product info", null, null, null, 14);
            case 23:
                int i46 = i.f29950w;
                ((d60.g) obj).getClass();
                com.dyson.mobile.android.connectivity.ble.b bVar7 = iVar.e;
                dz1.b s14 = bVar7.s(m60.e.d);
                dz1.b q13 = bVar7.q(i12.s.c(new x50.e0(e60.a.f26064b, a.C0902a.f26067b)));
                dz1.r u8 = bVar7.u(new n70.k());
                i15 = cd.b.i(q13, "AuthenticatedBleConnector - Subscribe To Rssi", new ga0.c0(7), new ga0.a0(5));
                qz1.a h15 = i15.g(s14).h(u8);
                ac0.c cVar2 = new ac0.c(new eo0.m(28), 20);
                b.a aVar13 = kz1.b.f50218a;
                return cd.b.m(new sz1.k(new nz1.e0(new nz1.x(new nz1.o(new rz1.a0(h15, cVar2).x().s(30000L, timeUnit)), new b(new eo0.m(29), 15)), null, 0), new b(new a(iVar, 7), 7)), "AuthenticatedBleConnector - Check distance to machine", null, null, null, 14);
            case 24:
                int i47 = i.f29950w;
                ((Integer) obj).getClass();
                nz1.w h16 = iVar.h();
                b.a aVar14 = kz1.b.f50218a;
                return new nz1.e0(h16, null, 0);
            default:
                fp.b bVar8 = (fp.b) obj;
                MachineSerial p13 = iVar.e.p();
                String str2 = p13 != null ? p13.d : null;
                Logger.a("Machine " + str2 + " battery status changed to " + bVar8);
                return h12.f0.f36844a;
        }
    }
}
