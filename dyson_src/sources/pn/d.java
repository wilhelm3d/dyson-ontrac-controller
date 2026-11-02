package pn;

import i12.q;
import java.util.UUID;
import kotlin.Metadata;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn/d;", "Lx50/g0;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d implements g0<Boolean> {
    @Override // x50.g0
    public final Boolean a(k60.h hVar) {
        hVar.getClass();
        UUID a13 = hVar.a();
        on.a.f60555a.getClass();
        if (((!r.c(a13, on.a.f60558f) || hVar.b().length == 0) ? null : hVar) != null) {
            x50.i iVar = x50.i.f86989a;
            byte w13 = q.w(hVar.b());
            iVar.getClass();
            return Boolean.valueOf(x50.i.a(w13));
        }
        return null;
    }
}
