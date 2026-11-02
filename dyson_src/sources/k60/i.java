package k60;

import d60.g;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import x12.u0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk60/i;", "", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i {
    static {
        new i();
    }

    private i() {
    }

    public static final String a(d60.g gVar) {
        gVar.getClass();
        u0 u0Var = u0.f86723a;
        Locale locale = Locale.US;
        String str = gVar.f22966c;
        g.a aVar = gVar.f22965b;
        String f13 = in0.c.f(aVar.f22967a);
        String f14 = in0.c.f(aVar.f22968b);
        d60.d dVar = gVar.f22964a;
        return String.format(locale, "%s%s.%s.%02d.%03d.%04d", Arrays.copyOf(new Object[]{str, f13, f14, Integer.valueOf(dVar.f22955a), Integer.valueOf(dVar.f22956b), Integer.valueOf(dVar.f22957c)}, 6));
    }

    public static final String b(d60.g gVar, d60.b bVar) {
        gVar.getClass();
        bVar.getClass();
        u0 u0Var = u0.f86723a;
        Locale locale = Locale.US;
        String str = gVar.f22966c;
        g.a aVar = gVar.f22965b;
        String f13 = in0.c.f(aVar.f22967a);
        String f14 = in0.c.f(aVar.f22968b);
        d60.d dVar = bVar.f22953c;
        return String.format(locale, "%s%s.%s.%02d.%03d.%04d", Arrays.copyOf(new Object[]{str, f13, f14, Integer.valueOf(dVar.f22955a), Integer.valueOf(dVar.f22956b), Integer.valueOf(dVar.f22957c)}, 6));
    }
}
