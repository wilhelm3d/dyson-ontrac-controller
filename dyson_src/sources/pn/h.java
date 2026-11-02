package pn;

import java.util.UUID;
import kotlin.Metadata;
import mp.k;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn/h;", "Lx50/g0;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h implements g0<Integer> {
    @Override // x50.g0
    public final Integer a(k60.h hVar) {
        hVar.getClass();
        UUID a13 = hVar.a();
        on.a.f60555a.getClass();
        if (!r.c(a13, on.a.f60557c)) {
            hVar = null;
        }
        Integer valueOf = hVar != null ? Integer.valueOf(hVar.b()[0]) : null;
        k.f54482a.getClass();
        d22.k kVar = k.a.f54484b;
        if (valueOf == null || !kVar.o(valueOf.intValue())) {
            return null;
        }
        return valueOf;
    }
}
