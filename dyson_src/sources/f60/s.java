package f60;

import com.dyson.mobile.android.machinetype.MachineSerial;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import x12.n0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lf60/s;", "", "Lc60/b;", "gattMessageBuilder", "Lj60/d;", "httpReverifyResponseTask", "Lqh/a;", "accountDataStore", "Ln70/b;", "connectionEstablishedParser", "Ln70/g;", "payloadAResponseParser", "Lf60/j0;", "longTermKeyRetriever", "<init>", "(Lc60/b;Lj60/d;Lqh/a;Ln70/b;Ln70/g;Lf60/j0;)V", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f29996f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final j60.d f29997a;

    /* renamed from: b  reason: collision with root package name */
    public final qh.a f29998b;

    /* renamed from: c  reason: collision with root package name */
    public final n70.b f29999c;
    public final n70.g d;
    public final j0 e;

    static {
        new a(null);
    }

    public s(c60.b bVar, j60.d dVar, qh.a aVar, n70.b bVar2, n70.g gVar, j0 j0Var) {
        bVar.getClass();
        dVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        gVar.getClass();
        j0Var.getClass();
        this.f29997a = dVar;
        this.f29998b = aVar;
        this.f29999c = bVar2;
        this.d = gVar;
        this.e = j0Var;
    }

    public final sz1.m a(MachineSerial machineSerial, com.dyson.mobile.android.connectivity.ble.b bVar, h0 h0Var, m60.i iVar, byte[] bArr) {
        n0 n0Var = new n0();
        sz1.z s13 = bVar.v(iVar, this.d).s(7000L, TimeUnit.MILLISECONDS);
        h hVar = new h(new q(n0Var, 2), 12);
        b.a aVar = kz1.b.f50218a;
        return new sz1.m(new sz1.x(new sz1.j(s13, hVar), new h(new e(20), 13)), new h(new r(n0Var, this, bVar, h0Var, machineSerial, bArr, 0), 14));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf60/s$a;", "", "<init>", "()V", "", "AUTHORIZER_TIMEOUT_MILLIS", "J", "", "PAYLOAD_A_CHALLENGE_LENGTH", "I", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
