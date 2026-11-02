package rp;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lrp/e;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "AUTO", "ALWAYS_WORN", "ALWAYS_UNWORN", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final int value;
    public static final e AUTO = new e("AUTO", 0, 0);
    public static final e ALWAYS_WORN = new e("ALWAYS_WORN", 1, 1);
    public static final e ALWAYS_UNWORN = new e("ALWAYS_UNWORN", 2, 2);

    private static final /* synthetic */ e[] $values() {
        return new e[]{AUTO, ALWAYS_WORN, ALWAYS_UNWORN};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private e(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }
}
