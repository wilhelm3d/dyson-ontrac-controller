package fp;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lfp/b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "FULL", "NORMAL", "LOW", "INSUFFICIENT", "CRITICAL", "SHUTDOWN", "INVALID", "LOCKUP", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    private final int value;
    public static final b FULL = new b("FULL", 0, 0);
    public static final b NORMAL = new b("NORMAL", 1, 1);
    public static final b LOW = new b("LOW", 2, 2);
    public static final b INSUFFICIENT = new b("INSUFFICIENT", 3, 3);
    public static final b CRITICAL = new b("CRITICAL", 4, 4);
    public static final b SHUTDOWN = new b("SHUTDOWN", 5, 5);
    public static final b INVALID = new b("INVALID", 6, -1);
    public static final b LOCKUP = new b("LOCKUP", 7, -2);

    private static final /* synthetic */ b[] $values() {
        return new b[]{FULL, NORMAL, LOW, INSUFFICIENT, CRITICAL, SHUTDOWN, INVALID, LOCKUP};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private b(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
