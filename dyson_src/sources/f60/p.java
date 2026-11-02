package f60;

import com.dyson.mobile.android.machinetype.MachineSerial;
import kotlin.Metadata;
import kz1.b;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf60/p;", "", "Ln70/a;", "beaconUUIDParser", "Lr60/a;", "connectivityDataStore", "<init>", "(Ln70/a;Lr60/a;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final n70.a f29989a;

    /* renamed from: b  reason: collision with root package name */
    public final r60.a f29990b;

    public p(n70.a aVar, r60.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f29989a = aVar;
        this.f29990b = aVar2;
    }

    public final sz1.n a(MachineSerial machineSerial, com.dyson.mobile.android.connectivity.ble.b bVar) {
        machineSerial.getClass();
        bVar.getClass();
        dz1.x v13 = bVar.v(new k60.n(), this.f29989a);
        h hVar = new h(new e(15), 2);
        b.a aVar = kz1.b.f50218a;
        return new sz1.n(new sz1.x(new sz1.j(v13, hVar), new h(new e(16), 3)), new h(new a01.g(27, this, machineSerial, bVar), 4));
    }
}
