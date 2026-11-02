package f60;

import kotlin.jvm.functions.Function1;
import l70.a;
/* loaded from: classes2.dex */
public final /* synthetic */ class v implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ y e;

    public /* synthetic */ v(y yVar, int i13) {
        this.d = i13;
        this.e = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.d;
        y yVar = this.e;
        switch (i13) {
            case 0:
                String str = (String) obj;
                int i14 = y.f30005j;
                yVar.a(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_PAYLOAD_ONE));
                return h12.f0.f36844a;
            case 1:
                m60.h hVar = (m60.h) obj;
                int i15 = y.f30005j;
                yVar.a(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_PAYLOAD_TWO));
                return h12.f0.f36844a;
            case 2:
                m60.q qVar = (m60.q) obj;
                int i16 = y.f30005j;
                yVar.a(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_PAYLOAD_THREE));
                return h12.f0.f36844a;
            default:
                d60.b bVar = (d60.b) obj;
                int i17 = y.f30005j;
                yVar.a(new a.InterfaceC1576a.c(a.InterfaceC1576a.d.RECEIVED_CONNECTION_ESTABLISHED));
                return h12.f0.f36844a;
        }
    }
}
