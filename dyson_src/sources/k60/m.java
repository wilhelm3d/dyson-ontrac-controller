package k60;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lk60/m;", "", "<init>", "(Ljava/lang/String;I)V", "READ", "WRITE", "SUBSCRIBE", "UNSUBSCRIBE", "NOTIFICATION", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m READ = new m("READ", 0);
    public static final m WRITE = new m("WRITE", 1);
    public static final m SUBSCRIBE = new m("SUBSCRIBE", 2);
    public static final m UNSUBSCRIBE = new m("UNSUBSCRIBE", 3);
    public static final m NOTIFICATION = new m("NOTIFICATION", 4);

    private static final /* synthetic */ m[] $values() {
        return new m[]{READ, WRITE, SUBSCRIBE, UNSUBSCRIBE, NOTIFICATION};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private m(String str, int i13) {
    }

    public static o12.a<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
