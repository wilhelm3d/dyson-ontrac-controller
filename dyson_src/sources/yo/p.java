package yo;

import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lyo/p;", "Lyo/j;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "toAttributeValue", "()I", "I", "getValue", "Companion", "a", "MEDIUM_QUIET", "FULL_ISOLATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p implements j {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final p MEDIUM_QUIET = new p("MEDIUM_QUIET", 0, 1);
    public static final p FULL_ISOLATION = new p("FULL_ISOLATION", 1, 2);

    private static final /* synthetic */ p[] $values() {
        return new p[]{MEDIUM_QUIET, FULL_ISOLATION};
    }

    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private p(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<p> getEntries() {
        return $ENTRIES;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    @Override // yo.j
    public int toAttributeValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyo/p$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
