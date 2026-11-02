package f60;

import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lf60/d0;", "", "", "timeoutMs", "<init>", "(Ljava/lang/String;IJ)V", "J", "getTimeoutMs", "()J", "STANDARD_TIMEOUT", "REDUCED_TIMEOUT", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d0 {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    private final long timeoutMs;
    public static final d0 STANDARD_TIMEOUT = new d0("STANDARD_TIMEOUT", 0, 30000);
    public static final d0 REDUCED_TIMEOUT = new d0("REDUCED_TIMEOUT", 1, NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION);

    private static final /* synthetic */ d0[] $values() {
        return new d0[]{STANDARD_TIMEOUT, REDUCED_TIMEOUT};
    }

    static {
        d0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = hx.v.l($values);
    }

    private d0(String str, int i13, long j8) {
        this.timeoutMs = j8;
    }

    public static o12.a<d0> getEntries() {
        return $ENTRIES;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }
}
