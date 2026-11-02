package lp;

import java.util.UUID;
import kotlin.Metadata;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Llp/c;", "Lx50/g0;", "Llp/a;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements g0<a> {
    @Override // x50.g0
    public final a a(k60.h hVar) {
        hVar.getClass();
        UUID a13 = hVar.a();
        on.a.f60555a.getClass();
        if (((!r.c(a13, on.a.f60560h) || hVar.b().length == 0) ? null : hVar) != null) {
            byte[] b13 = hVar.b();
            byte b14 = b13.length > 0 ? b13[0] : (byte) 0;
            byte[] b15 = hVar.b();
            byte b16 = 1 < b15.length ? b15[1] : (byte) 0;
            byte[] b17 = hVar.b();
            byte b18 = 2 < b17.length ? b17[2] : (byte) 0;
            byte[] b19 = hVar.b();
            byte b23 = 3 < b19.length ? b19[3] : (byte) 0;
            byte[] b24 = hVar.b();
            return new a(b14, b16, b18, b23, 4 < b24.length ? b24[4] : (byte) 0);
        }
        return null;
    }
}
