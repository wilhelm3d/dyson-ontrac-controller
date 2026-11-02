package k60;

import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lk60/h;", "", "<init>", "()V", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f47014a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f47015b = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    public static final byte f47016c = -1;

    public abstract UUID a();

    public abstract byte[] b();

    public long c() {
        return 500L;
    }

    public abstract byte d();

    public abstract m e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj != null ? obj.getClass() : null) && (obj instanceof h)) {
            h hVar = (h) obj;
            return r.c(f(), hVar.f()) && r.c(a(), hVar.a()) && Arrays.equals(b(), hVar.b()) && e() == hVar.e();
        }
        return false;
    }

    public abstract UUID f();

    public boolean g() {
        return true;
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    public String toString() {
        UUID f13 = f();
        UUID a13 = a();
        byte d = d();
        String arrays = Arrays.toString(b());
        arrays.getClass();
        m e = e();
        StringBuilder sb2 = new StringBuilder("UUID:");
        sb2.append(f13);
        sb2.append(", cUUID:");
        sb2.append(a13);
        sb2.append(", messageTypeId:");
        fo1.a.u(sb2, d, ", message:[", arrays, "], operationMode:");
        sb2.append(e);
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk60/h$a;", "", "<init>", "()V", "", "MESSAGE_RESPONSE_WAITING_TIME_MILLISECONDS", "J", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
