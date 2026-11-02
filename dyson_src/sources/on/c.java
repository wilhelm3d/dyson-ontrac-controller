package on;

import java.util.Arrays;
import java.util.UUID;
import k60.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.u0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lon/c;", "Lk60/h;", "<init>", "()V", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class c extends h {
    public static final UUID e;
    public final UUID d = e;

    static {
        new a(null);
        u0 u0Var = u0.f86723a;
        UUID fromString = UUID.fromString(String.format("2DD1%s-1C37-452D-8979-D1B4A787D0A4", Arrays.copyOf(new Object[]{"2000"}, 1)));
        fromString.getClass();
        e = fromString;
    }

    @Override // k60.h
    public final byte d() {
        return (byte) 0;
    }

    @Override // k60.h
    public final UUID f() {
        return this.d;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lon/c$a;", "", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
