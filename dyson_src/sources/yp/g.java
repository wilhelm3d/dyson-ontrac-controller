package yp;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lyp/g;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "DISABLED", "ENABLED", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g DISABLED = new g("DISABLED", 0, 0);
    public static final g ENABLED = new g("ENABLED", 1, 1);
    private final int value;

    private static final /* synthetic */ g[] $values() {
        return new g[]{DISABLED, ENABLED};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private g(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
