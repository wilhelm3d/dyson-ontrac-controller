package f60;

import com.dyson.mobile.android.machinetype.MachineSerial;
import kotlin.jvm.functions.Function1;
import kz1.b;
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ i e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MachineSerial f29945f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f29946g;

    public /* synthetic */ g(i iVar, MachineSerial machineSerial, String str, int i13) {
        this.d = i13;
        this.e = iVar;
        this.f29945f = machineSerial;
        this.f29946g = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.d;
        String str = this.f29946g;
        MachineSerial machineSerial = this.f29945f;
        i iVar = this.e;
        d60.b bVar = (d60.b) obj;
        switch (i13) {
            case 0:
                int i14 = i.f29950w;
                bVar.getClass();
                nz1.x e = iVar.e(bVar, machineSerial, str);
                b.a aVar = kz1.b.f50218a;
                return new sz1.k(new nz1.e0(e, null, 0), new b(new a(iVar, 9), 12));
            default:
                int i15 = i.f29950w;
                bVar.getClass();
                nz1.x e13 = iVar.e(bVar, machineSerial, str);
                b.a aVar2 = kz1.b.f50218a;
                return new sz1.k(new nz1.e0(e13, null, 0), new b(new a(iVar, 8), 11));
        }
    }
}
