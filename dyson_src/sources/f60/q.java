package f60;

import com.dyson.mobile.android.logging.Logger;
import kotlin.jvm.functions.Function1;
import x12.n0;
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ n0 e;

    public /* synthetic */ q(n0 n0Var, int i13) {
        this.d = i13;
        this.e = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.d;
        n0 n0Var = this.e;
        switch (i13) {
            case 0:
                d60.b bVar = (d60.b) obj;
                int i14 = s.f29996f;
                long j8 = n0Var.d;
                int i15 = se1.n0.f76055a;
                long currentTimeMillis = System.currentTimeMillis() - j8;
                Logger.a("Received Payload C response in " + currentTimeMillis + " ms");
                return h12.f0.f36844a;
            case 1:
                gz1.c cVar = (gz1.c) obj;
                int i16 = s.f29996f;
                n0Var.d = System.currentTimeMillis();
                return h12.f0.f36844a;
            case 2:
                gz1.c cVar2 = (gz1.c) obj;
                int i17 = s.f29996f;
                n0Var.d = System.currentTimeMillis();
                return h12.f0.f36844a;
            default:
                gz1.c cVar3 = (gz1.c) obj;
                int i18 = s.f29996f;
                n0Var.d = System.currentTimeMillis();
                return h12.f0.f36844a;
        }
    }
}
