package on;

import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import x12.u0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lon/a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60555a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f60556b = a("2022");

    /* renamed from: c  reason: collision with root package name */
    public static final UUID f60557c = a("2001");
    public static final UUID d = a("2002");
    public static final UUID e = a("2003");

    /* renamed from: f  reason: collision with root package name */
    public static final UUID f60558f = a("2004");

    /* renamed from: g  reason: collision with root package name */
    public static final UUID f60559g = a("2005");

    /* renamed from: h  reason: collision with root package name */
    public static final UUID f60560h = a("2007");

    /* renamed from: i  reason: collision with root package name */
    public static final UUID f60561i;

    /* renamed from: j  reason: collision with root package name */
    public static final UUID f60562j;

    /* renamed from: k  reason: collision with root package name */
    public static final UUID f60563k;

    /* renamed from: l  reason: collision with root package name */
    public static final UUID f60564l;

    /* renamed from: m  reason: collision with root package name */
    public static final UUID f60565m;

    static {
        a("2009");
        a("201A");
        a("2021");
        a("200A");
        f60561i = a("200B");
        f60562j = a("2016");
        f60563k = a("200C");
        f60564l = a("201D");
        f60565m = a("201E");
        a("201F");
        a("2020");
        a("2010");
        a("2015");
    }

    private a() {
    }

    public static UUID a(String str) {
        u0 u0Var = u0.f86723a;
        UUID fromString = UUID.fromString(String.format("2DD1%s-1C37-452D-8979-D1B4A787D0A4", Arrays.copyOf(new Object[]{str}, 1)));
        fromString.getClass();
        return fromString;
    }
}
