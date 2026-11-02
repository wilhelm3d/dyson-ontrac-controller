package f60;

import com.dyson.mobile.android.connectivity.ble.BleScanningRecord;
import com.dyson.mobile.android.connectivity.ble.lec.BeaconUUIDUpdateException;
import com.dyson.mobile.android.connectivity.ble.lec.ConnectionResultException;
import com.dyson.mobile.android.connectivity.ble.lec.LecProvisionExchangeException;
import com.dyson.mobile.android.connectivity.ble.lec.PairingDetailsExchangeException;
import com.dyson.mobile.android.connectivity.ble.lec.Payload1RetrievalException;
import com.dyson.mobile.android.connectivity.ble.lec.Payload2RetrievalException;
import com.dyson.mobile.android.connectivity.ble.lec.Payload3RetrievalException;
import com.dyson.mobile.android.connectivity.ble.lec.PayloadAExchangeException;
import com.dyson.mobile.android.connectivity.ble.lec.PayloadCExchangeException;
import com.dyson.mobile.android.connectivity.ble.lec.scan.BleScanningLockedException;
import com.dyson.mobile.android.logging.Logger;
import f60.u;
import f60.z;
import kotlin.jvm.functions.Function1;
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ e(int i13) {
        this.d = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Throwable th2 = (Throwable) obj;
                int i13 = i.f29950w;
                th2.getClass();
                return dz1.b.p(new ConnectionResultException(a0.FAILED_TO_CONNECT_TO_BROKER, th2));
            case 1:
                Throwable th3 = (Throwable) obj;
                int i14 = i.f29950w;
                th3.getClass();
                return dz1.x.g(new ConnectionResultException(a0.UNABLE_TO_READ_LOW_POWER_MESSAGE, th3));
            case 2:
                Throwable th4 = (Throwable) obj;
                int i15 = i.f29950w;
                th4.getClass();
                return dz1.b.p(new ConnectionResultException(a0.FAILED_TO_SUBSCRIBE, th4));
            case 3:
                Throwable th5 = (Throwable) obj;
                int i16 = i.f29950w;
                th5.getClass();
                return dz1.b.p(new ConnectionResultException(a0.FAILED_TO_REQUEST_MTU, th5));
            case 4:
                Throwable th6 = (Throwable) obj;
                int i17 = i.f29950w;
                th6.getClass();
                return !(th6 instanceof ConnectionResultException) ? dz1.x.g(new ConnectionResultException(a0.UNKNOWN_ERROR, null, 2, null)) : dz1.x.g(th6);
            case 5:
                Throwable th7 = (Throwable) obj;
                int i18 = i.f29950w;
                th7.getClass();
                return dz1.b.p(new ConnectionResultException(a0.FAILED_TO_CONNECT, th7));
            case 6:
                Throwable th8 = (Throwable) obj;
                int i19 = i.f29950w;
                th8.getClass();
                return dz1.x.g(new ConnectionResultException(a0.FAILED_TO_AUTHENTICATE, th8));
            case 7:
                z zVar = (z) obj;
                int i23 = i.f29950w;
                zVar.getClass();
                return Boolean.valueOf(zVar instanceof z.a);
            case 8:
                z zVar2 = (z) obj;
                int i24 = i.f29950w;
                zVar2.getClass();
                return zVar2 instanceof z.c ? dz1.b.p(new ConnectionResultException(((z.c) zVar2).f30015a, null, 2, null)) : nz1.j.d;
            case 9:
                Throwable th9 = (Throwable) obj;
                int i25 = i.f29950w;
                th9.getClass();
                return dz1.x.g(new ConnectionResultException(a0.FAILED_TO_RETRIEVE_PRODUCT_INFO, th9));
            case 10:
                Throwable th10 = (Throwable) obj;
                int i26 = i.f29950w;
                th10.getClass();
                return dz1.x.g(new ConnectionResultException(a0.FAILED_TO_FETCH_LTK, th10));
            case 11:
                int i27 = i.f29950w;
                Logger.a("Retrieved longTermKey " + ((h0) obj));
                return h12.f0.f36844a;
            case 12:
                gz1.c cVar = (gz1.c) obj;
                int i28 = i.f29950w;
                Logger.a("Attempting to read RSSI for bonding purposes");
                return h12.f0.f36844a;
            case 13:
                Throwable th11 = (Throwable) obj;
                int i29 = i.f29950w;
                th11.getClass();
                return dz1.b.p(new ConnectionResultException(a0.FAILED_TO_READ_RSSI_AND_WAIT_FOR_BOND, th11));
            case 14:
                Throwable th12 = (Throwable) obj;
                int i33 = i.f29950w;
                th12.getClass();
                return dz1.x.g(new ConnectionResultException(a0.FAILED_TO_FETCH_OWNERSHIP, th12));
            case 15:
                gz1.c cVar2 = (gz1.c) obj;
                Logger.a("BeaconUUIDUpdater started");
                return h12.f0.f36844a;
            case 16:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                Logger.b("Exception sending RequestBeaconUUIDs message: " + th13, null);
                return dz1.x.g(new BeaconUUIDUpdateException(th13));
            case 17:
                Throwable th14 = (Throwable) obj;
                int i34 = s.f29996f;
                th14.getClass();
                Logger.b("Failed to send Pairing Details with Response " + th14, null);
                return dz1.x.g(new PairingDetailsExchangeException(th14));
            case 18:
                Throwable th15 = (Throwable) obj;
                int i35 = s.f29996f;
                th15.getClass();
                Logger.b("Failed to send Payload C with Response " + th15, null);
                return dz1.x.g(new PayloadCExchangeException(th15));
            case 19:
                Throwable th16 = (Throwable) obj;
                int i36 = s.f29996f;
                th16.getClass();
                Logger.b("Failed to retrieve Payload 3 from cloud " + th16, null);
                return dz1.x.g(new Payload3RetrievalException(th16));
            case 20:
                Throwable th17 = (Throwable) obj;
                int i37 = s.f29996f;
                th17.getClass();
                Logger.b("Failed to send Payload A with Response " + th17, null);
                return dz1.x.g(new PayloadAExchangeException(th17));
            case 21:
                BleScanningRecord bleScanningRecord = (BleScanningRecord) obj;
                int i38 = u.e;
                bleScanningRecord.getClass();
                return new u.b(bleScanningRecord.r(), bleScanningRecord.E());
            case 22:
                Throwable th18 = (Throwable) obj;
                int i39 = u.e;
                th18.getClass();
                return th18 instanceof u.c ? dz1.x.i(((u.c) th18).d) : dz1.x.g(th18);
            case 23:
                Throwable th19 = (Throwable) obj;
                int i43 = u.e;
                th19.getClass();
                return dz1.x.g(new ConnectionResultException(th19 instanceof BleScanningLockedException ? a0.SCANNING_LOCKED : a0.MACHINE_NOT_FOUND, th19));
            case 24:
                BleScanningRecord bleScanningRecord2 = (BleScanningRecord) obj;
                int i44 = u.e;
                bleScanningRecord2.getClass();
                return !bleScanningRecord2.E() ? dz1.x.g(new u.c(bleScanningRecord2)) : dz1.x.i(bleScanningRecord2);
            case 25:
                Throwable th20 = (Throwable) obj;
                int i45 = y.f30005j;
                th20.getClass();
                return dz1.x.g(new LecProvisionExchangeException(th20));
            case 26:
                Throwable th21 = (Throwable) obj;
                int i46 = y.f30005j;
                th21.getClass();
                return dz1.x.g(new Payload1RetrievalException(th21));
            case 27:
                Throwable th22 = (Throwable) obj;
                int i47 = y.f30005j;
                th22.getClass();
                return dz1.x.g(new Payload2RetrievalException(th22));
            case 28:
                Throwable th23 = (Throwable) obj;
                int i48 = y.f30005j;
                th23.getClass();
                return dz1.x.g(new Payload3RetrievalException(th23));
            default:
                Throwable th24 = (Throwable) obj;
                int i49 = y.f30005j;
                th24.getClass();
                return dz1.x.g(new PairingDetailsExchangeException(th24));
        }
    }
}
