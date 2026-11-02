package f60;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lf60/n;", "", "<init>", "(Ljava/lang/String;I)V", "PERFORM_BLE_SCAN", "DO_NOT_PERFORM_BLE_SCAN", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n PERFORM_BLE_SCAN = new n("PERFORM_BLE_SCAN", 0);
    public static final n DO_NOT_PERFORM_BLE_SCAN = new n("DO_NOT_PERFORM_BLE_SCAN", 1);

    private static final /* synthetic */ n[] $values() {
        return new n[]{PERFORM_BLE_SCAN, DO_NOT_PERFORM_BLE_SCAN};
    }

    static {
        n[] $values = $values();
        $VALUES = $values;
        $ENTRIES = hx.v.l($values);
    }

    private n(String str, int i13) {
    }

    public static o12.a<n> getEntries() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
