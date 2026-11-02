package fp;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lfp/e;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_CHARGING", "PRE_CHARGING", "FAST_CHARGING", "TERMINATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e NOT_CHARGING = new e("NOT_CHARGING", 0);
    public static final e PRE_CHARGING = new e("PRE_CHARGING", 1);
    public static final e FAST_CHARGING = new e("FAST_CHARGING", 2);
    public static final e TERMINATION = new e("TERMINATION", 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{NOT_CHARGING, PRE_CHARGING, FAST_CHARGING, TERMINATION};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private e(String str, int i13) {
    }

    public static o12.a<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
