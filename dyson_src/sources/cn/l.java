package cn;

import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcn/l;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "CALL", "ISOLATION", "CONVERSATION", "TRANSPARENCY", "OFF", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final a Companion;
    public static final l CALL = new l("CALL", 0);
    public static final l ISOLATION = new l("ISOLATION", 1);
    public static final l CONVERSATION = new l("CONVERSATION", 2);
    public static final l TRANSPARENCY = new l("TRANSPARENCY", 3);
    public static final l OFF = new l("OFF", 4);

    private static final /* synthetic */ l[] $values() {
        return new l[]{CALL, ISOLATION, CONVERSATION, TRANSPARENCY, OFF};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private l(String str, int i13) {
    }

    public static o12.a<l> getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcn/l$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: cn.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class C0314a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f11822a;

            static {
                int[] iArr = new int[yo.a.values().length];
                try {
                    iArr[yo.a.ISOLATION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yo.a.MEDIUM_QUIET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yo.a.CONVERSATION.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[yo.a.MEDIUM_LOUD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[yo.a.TRANSPARENCY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[yo.a.OFF.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f11822a = iArr;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
