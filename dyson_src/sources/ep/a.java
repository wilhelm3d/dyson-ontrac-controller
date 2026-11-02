package ep;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lep/a;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "NO_AUDIO", "PLAYING", "PAUSED", "CALL", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int value;
    public static final a NO_AUDIO = new a("NO_AUDIO", 0, 0);
    public static final a PLAYING = new a("PLAYING", 1, 1);
    public static final a PAUSED = new a("PAUSED", 2, 2);
    public static final a CALL = new a("CALL", 3, 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NO_AUDIO, PLAYING, PAUSED, CALL};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private a(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
