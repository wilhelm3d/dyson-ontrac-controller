package e60;

import hx.v;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Le60/f;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "a", "UP_TO_DATE", "DOWNLOADING", "WAITING_AUTHORISATION", "WAITING_CONVENIENT_TIME", "INSTALLING_PENDING_FW", "INSTALLING_RECOVERY_FW", "AWAITING_STABLE", "PAUSED_DOWNLOAD", "INSTALLING_PENDING_FW_TO_SECONDARY_MCU", "RUNNING_FALLBACK", "INSUFFICIENT_BATTERY_STATE_OF_CHARGE", "POWER_ADAPTOR_UNPLUGGED", "UNDEFINED", "DOWNLOAD_FAILED", "PRIMARY_FW_LATEST_INSTALLED", "PRIMARY_FW_FALLBACK_INSTALLED", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final f UP_TO_DATE = new f("UP_TO_DATE", 0, 0);
    public static final f DOWNLOADING = new f("DOWNLOADING", 1, 1);
    public static final f WAITING_AUTHORISATION = new f("WAITING_AUTHORISATION", 2, 2);
    public static final f WAITING_CONVENIENT_TIME = new f("WAITING_CONVENIENT_TIME", 3, 3);
    public static final f INSTALLING_PENDING_FW = new f("INSTALLING_PENDING_FW", 4, 4);
    public static final f INSTALLING_RECOVERY_FW = new f("INSTALLING_RECOVERY_FW", 5, 5);
    public static final f AWAITING_STABLE = new f("AWAITING_STABLE", 6, 6);
    public static final f PAUSED_DOWNLOAD = new f("PAUSED_DOWNLOAD", 7, 7);
    public static final f INSTALLING_PENDING_FW_TO_SECONDARY_MCU = new f("INSTALLING_PENDING_FW_TO_SECONDARY_MCU", 8, 8);
    public static final f RUNNING_FALLBACK = new f("RUNNING_FALLBACK", 9, 9);
    public static final f INSUFFICIENT_BATTERY_STATE_OF_CHARGE = new f("INSUFFICIENT_BATTERY_STATE_OF_CHARGE", 10, 10);
    public static final f POWER_ADAPTOR_UNPLUGGED = new f("POWER_ADAPTOR_UNPLUGGED", 11, 11);
    public static final f UNDEFINED = new f("UNDEFINED", 12, 12);
    public static final f DOWNLOAD_FAILED = new f("DOWNLOAD_FAILED", 13, 13);
    public static final f PRIMARY_FW_LATEST_INSTALLED = new f("PRIMARY_FW_LATEST_INSTALLED", 14, 14);
    public static final f PRIMARY_FW_FALLBACK_INSTALLED = new f("PRIMARY_FW_FALLBACK_INSTALLED", 15, 15);

    private static final /* synthetic */ f[] $values() {
        return new f[]{UP_TO_DATE, DOWNLOADING, WAITING_AUTHORISATION, WAITING_CONVENIENT_TIME, INSTALLING_PENDING_FW, INSTALLING_RECOVERY_FW, AWAITING_STABLE, PAUSED_DOWNLOAD, INSTALLING_PENDING_FW_TO_SECONDARY_MCU, RUNNING_FALLBACK, INSUFFICIENT_BATTERY_STATE_OF_CHARGE, POWER_ADAPTOR_UNPLUGGED, UNDEFINED, DOWNLOAD_FAILED, PRIMARY_FW_LATEST_INSTALLED, PRIMARY_FW_FALLBACK_INSTALLED};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private f(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<f> getEntries() {
        return $ENTRIES;
    }

    public static final f toOtaStatusOrNull(int i13) {
        Companion.getClass();
        return a.a(i13);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le60/f$a;", "", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static f a(int i13) {
            Object obj;
            Iterator<E> it = f.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((f) obj).getValue() == i13) {
                    break;
                }
            }
            return (f) obj;
        }

        private a() {
        }
    }
}
