package ip;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lip/c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "NOT_SUPPORTED", "NORMAL", "LOW", "INSUFFICIENT", "NONE", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    private final Integer value;
    public static final c NOT_SUPPORTED = new c("NOT_SUPPORTED", 0, null);
    public static final c NORMAL = new c("NORMAL", 1, 0);
    public static final c LOW = new c("LOW", 2, 1);
    public static final c INSUFFICIENT = new c("INSUFFICIENT", 3, 2);
    public static final c NONE = new c("NONE", 4, 3);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NOT_SUPPORTED, NORMAL, LOW, INSUFFICIENT, NONE};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private c(String str, int i13, Integer num) {
        this.value = num;
    }

    public static o12.a<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final Integer getValue() {
        return this.value;
    }
}
