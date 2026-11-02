package pn;

import com.dyson.mobile.android.logging.Logger;
import java.util.UUID;
import kotlin.Metadata;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn/i;", "Lx50/g0;", "Lxp/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i implements g0<xp.c> {
    @Override // x50.g0
    public final xp.c a(k60.h hVar) {
        hVar.getClass();
        UUID a13 = hVar.a();
        on.a.f60555a.getClass();
        if (!r.c(a13, on.a.f60559g)) {
            hVar = null;
        }
        if (hVar != null) {
            byte b13 = hVar.b()[0];
            if (b13 != 0) {
                if (b13 != 1) {
                    if (b13 != 2) {
                        if (b13 != 3) {
                            Logger.b("Unsupported message received for characteristics UUID " + hVar.a(), null);
                            return null;
                        }
                        return xp.c.INVALID;
                    }
                    return xp.c.DIPPED;
                }
                return xp.c.IN_POSITION;
            }
            return xp.c.NOT_ATTACHED;
        }
        return null;
    }
}
