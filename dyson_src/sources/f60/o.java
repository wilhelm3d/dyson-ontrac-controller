package f60;

import com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionJourney;
import com.dyson.mobile.android.connectionjourney.machineprefixcheck.a;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineConnectionCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.machinetype.MachineType;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import q70.z0;
import x12.u0;
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements iz1.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29986a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f29987b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f29988c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(yi0.f fVar, MachineSerial machineSerial, String str) {
        this.f29986a = 4;
        this.f29988c = fVar;
        this.f29987b = machineSerial;
        this.d = str;
    }

    @Override // iz1.a
    public final void run() {
        int i13 = this.f29986a;
        Object obj = this.d;
        Object obj2 = this.f29987b;
        Object obj3 = this.f29988c;
        switch (i13) {
            case 0:
                MachineSerial machineSerial = (MachineSerial) obj2;
                d60.a aVar = (d60.a) obj3;
                String str = machineSerial.d;
                Logger.a(str + " - Beacon UUID stored: " + aVar);
                ((p) obj).f29990b.e(machineSerial.d, aVar);
                return;
            case 1:
                fi0.a aVar2 = (fi0.a) obj2;
                int i14 = fi0.a.e;
                u0 u0Var = u0.f86723a;
                String format = String.format("config/%s/%s", Arrays.copyOf(new Object[]{aVar2.d.a().getValue(), (String) obj3}, 2));
                u70.g gVar = aVar2.f31633b;
                InputStream openStream = ((URL) obj).openStream();
                openStream.getClass();
                String a13 = gVar.a(format);
                se1.h.c(a13);
                s12.d.b(new File(a13, "img.bin"), hx.v.S(openStream));
                return;
            case 2:
                com.dyson.mobile.android.connectionjourney.bleconnection.a aVar3 = (com.dyson.mobile.android.connectionjourney.bleconnection.a) obj2;
                String str2 = (String) obj3;
                String str3 = (String) obj;
                aVar3.f13327p.dispose();
                if (aVar3.f13326o.b()) {
                    return;
                }
                Logger.a("Proximity timer - stopped");
                GattConnectionJourney gattConnectionJourney = aVar3.d;
                q70.x xVar = gattConnectionJourney.f13279a;
                xVar.a();
                nz1.o oVar = new nz1.o(new z0(xVar.f66189a).a());
                byte[] bytes = str3.getBytes();
                bytes.getClass();
                q70.x xVar2 = gattConnectionJourney.f13279a;
                xVar2.a();
                aVar3.f13325n.a(new q70.i0(xVar2.f66189a, c60.c.b(Ascii.SO, bytes)).a().m(new m10.f(new lm0.a(19), 5)).l(new m10.e(gattConnectionJourney, 3)).g(oVar).x(new m10.b(aVar3, 3), new b50.p(13, aVar3, str2)));
                return;
            case 3:
                com.dyson.mobile.android.machinetype.b bVar = (com.dyson.mobile.android.machinetype.b) obj2;
                com.dyson.mobile.android.connectionjourney.machineprefixcheck.a aVar4 = (com.dyson.mobile.android.connectionjourney.machineprefixcheck.a) obj3;
                String str4 = (String) obj;
                MachineType.a aVar5 = MachineType.Companion;
                String e = bVar != null ? bVar.e() : null;
                if (e == null) {
                    e = "";
                }
                aVar5.getClass();
                String typeName = MachineType.a.a(e).getTypeName();
                String a14 = bVar != null ? bVar.a() : null;
                if (a14 == null) {
                    a14 = "";
                }
                MachineConnectionCategory machineConnectionCategory = MachineConnectionCategory.LEC_ONLY;
                MachineCategory.a aVar6 = MachineCategory.Companion;
                String b13 = bVar != null ? bVar.b() : null;
                aVar6.getClass();
                MachineCategory a15 = MachineCategory.a.a(b13);
                if (a15 == null) {
                    a15 = MachineCategory.EC;
                }
                MachineDescriptor machineDescriptor = new MachineDescriptor(typeName, a14, null, machineConnectionCategory, a15, null, 36, null);
                aVar4.f13532i.setValue(new a.C0425a(str4, machineDescriptor));
                aVar4.d.t(machineDescriptor);
                return;
            default:
                ((yi0.f) obj3).f90156c.onNext(new h12.p<>((MachineSerial) obj2, (String) obj));
                return;
        }
    }

    public /* synthetic */ o(int i13, Object obj, Object obj2, Object obj3) {
        this.f29986a = i13;
        this.f29987b = obj;
        this.f29988c = obj2;
        this.d = obj3;
    }
}
