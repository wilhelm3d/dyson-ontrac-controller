package f60;

import androidx.lifecycle.Lifecycle;
import bh1.f;
import com.dyson.mobile.android.connectivity.ble.BleScanningRecord;
import com.dyson.mobile.android.connectivity.ble.lec.ConnectionResultException;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import r60.a;
import rz1.z1;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lf60/u;", "", "Li60/e;", "bleScanner", "Landroidx/lifecycle/Lifecycle;", "applicationLifecycle", "Lr60/a;", "connectivityDataStore", "Lse1/e;", "buildVersionProvider", "<init>", "(Li60/e;Landroidx/lifecycle/Lifecycle;Lr60/a;Lse1/e;)V", "c", "b", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class u {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final i60.e f30000a;

    /* renamed from: b  reason: collision with root package name */
    public final Lifecycle f30001b;

    /* renamed from: c  reason: collision with root package name */
    public final r60.a f30002c;
    public final se1.e d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf60/u$b;", "", "", "macAddress", "", "isConnectable", "<init>", "(Ljava/lang/String;Z)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f30003a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30004b;

        public b(String str, boolean z13) {
            str.getClass();
            this.f30003a = str;
            this.f30004b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f30003a.equals(bVar.f30003a) && this.f30004b == bVar.f30004b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f30004b) + (this.f30003a.hashCode() * 31);
        }

        public final String toString() {
            return o1.a.e("FoundBleDevice(macAddress=", this.f30003a, ", isConnectable=", this.f30004b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf60/u$c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/dyson/mobile/android/connectivity/ble/BleScanningRecord;", "bleScanningRecord", "<init>", "(Lcom/dyson/mobile/android/connectivity/ble/BleScanningRecord;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends Exception {
        public final BleScanningRecord d;

        public c(BleScanningRecord bleScanningRecord) {
            bleScanningRecord.getClass();
            this.d = bleScanningRecord;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && x12.r.c(this.d, ((c) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InternalNotConnectableException(bleScanningRecord=" + this.d + ")";
        }
    }

    static {
        new a(null);
    }

    public u(i60.e eVar, Lifecycle lifecycle, r60.a aVar, se1.e eVar2) {
        eVar.getClass();
        lifecycle.getClass();
        aVar.getClass();
        eVar2.getClass();
        this.f30000a = eVar;
        this.f30001b = lifecycle;
        this.f30002c = aVar;
        this.d = eVar2;
    }

    public final sz1.k a(MachineSerial machineSerial, c0 c0Var) {
        dz1.b0 tVar;
        c0Var.getClass();
        boolean z13 = c0Var.f29940a == n.DO_NOT_PERFORM_BLE_SCAN && this.d.f76036a < 31;
        if (this.f30001b.b().isAtLeast(Lifecycle.State.STARTED) || !z13) {
            d0 d0Var = c0Var.f29941b;
            dz1.r<BleScanningRecord> b13 = this.f30000a.b();
            long timeoutMs = d0Var.getTimeoutMs();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            z1 W = b13.W(timeoutMs, timeUnit);
            ac0.c cVar = new ac0.c(new bk0.d(machineSerial, 2), 22);
            b.a aVar = kz1.b.f50218a;
            sz1.m mVar = new sz1.m(new rz1.a0(W, cVar).x(), new h(new e(24), 21));
            f.b a13 = bh1.f.a(c.class);
            a13.c(1);
            a13.b(Long.valueOf((long) NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION), timeUnit);
            a13.f7759g = new h(new em0.c(this, 6), 16);
            tVar = new sz1.t(cd.b.m(new sz1.x(new sz1.x(mVar.m(a13.a()), new h(new e(22), 17)), new h(new e(23), 20)), "Ble scan", null, null, null, 14), new h(new e(21), 18));
        } else {
            try {
                a.b c13 = this.f30002c.c(machineSerial);
                if (c13 == null) {
                    throw new ConnectionResultException(a0.MAC_ADDRESS_REQUIRED_BUT_UNKNOWN, null, 2, null);
                }
                tVar = dz1.x.i(new b(c13.f70497b, true));
            } catch (Exception e13) {
                tVar = dz1.x.g(e13);
            }
        }
        h hVar = new h(new dy1.d(14, this, machineSerial), 19);
        b.a aVar2 = kz1.b.f50218a;
        return new sz1.k(tVar, hVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf60/u$a;", "", "<init>", "()V", "", "DELAY_BEFORE_RESCAN_IF_SOMEONE_ELSE_CONNECTED_MILLIS", "J", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
