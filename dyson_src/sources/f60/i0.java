package f60;

import com.dyson.mobile.android.machinetype.MachineSerial;
import kotlin.jvm.functions.Function1;
/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ j0 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MachineSerial f29971f;

    public /* synthetic */ i0(j0 j0Var, MachineSerial machineSerial, int i13) {
        this.d = i13;
        this.e = j0Var;
        this.f29971f = machineSerial;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.d;
        MachineSerial machineSerial = this.f29971f;
        j0 j0Var = this.e;
        h0 h0Var = (h0) obj;
        switch (i13) {
            case 0:
                byte[] bArr = j0.f29980c;
                h0Var.getClass();
                j0Var.c(machineSerial, h0Var);
                return nz1.j.d;
            default:
                byte[] bArr2 = j0.f29980c;
                h0Var.getClass();
                j0Var.c(machineSerial, h0Var);
                return h12.f0.f36844a;
        }
    }
}
