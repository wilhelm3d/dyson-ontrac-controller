package f60;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lf60/e0;", "", "<init>", "(Ljava/lang/String;I)V", "PLEASE_STAY_CLOSE", "WAIT_BUTTON_PRESS", "PAIRING_PURIFICATION", "PAIRING_COMPLETE", "PROXIMITY_FAILED", "PAIRING_FAILED", "PAIRING_SOMEONE_ELSE_CONNECTED", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e0 {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 PLEASE_STAY_CLOSE = new e0("PLEASE_STAY_CLOSE", 0);
    public static final e0 WAIT_BUTTON_PRESS = new e0("WAIT_BUTTON_PRESS", 1);
    public static final e0 PAIRING_PURIFICATION = new e0("PAIRING_PURIFICATION", 2);
    public static final e0 PAIRING_COMPLETE = new e0("PAIRING_COMPLETE", 3);
    public static final e0 PROXIMITY_FAILED = new e0("PROXIMITY_FAILED", 4);
    public static final e0 PAIRING_FAILED = new e0("PAIRING_FAILED", 5);
    public static final e0 PAIRING_SOMEONE_ELSE_CONNECTED = new e0("PAIRING_SOMEONE_ELSE_CONNECTED", 6);

    private static final /* synthetic */ e0[] $values() {
        return new e0[]{PLEASE_STAY_CLOSE, WAIT_BUTTON_PRESS, PAIRING_PURIFICATION, PAIRING_COMPLETE, PROXIMITY_FAILED, PAIRING_FAILED, PAIRING_SOMEONE_ELSE_CONNECTED};
    }

    static {
        e0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = hx.v.l($values);
    }

    private e0(String str, int i13) {
    }

    public static o12.a<e0> getEntries() {
        return $ENTRIES;
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
