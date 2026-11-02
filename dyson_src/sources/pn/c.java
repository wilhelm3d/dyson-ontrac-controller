package pn;

import e60.e;
import gm1.am;
import gp.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpn/c;", "Lx50/g0;", "", "Lgp/a;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements g0<List<? extends gp.a>> {
    @Override // x50.g0
    public final List<? extends gp.a> a(k60.h hVar) {
        gp.a[] values;
        hVar.getClass();
        hVar = (r.c(hVar.a(), e.a.f26072a) && hVar.d() == 83) ? null : null;
        if (hVar != null) {
            a.C1138a c1138a = gp.a.Companion;
            short o13 = am.o(hVar.b());
            c1138a.getClass();
            ArrayList arrayList = new ArrayList();
            for (gp.a aVar : gp.a.values()) {
                if (((short) (aVar.getValue() & o13)) != 0) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
        return null;
    }
}
