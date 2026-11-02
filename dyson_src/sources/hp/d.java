package hp;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lhp/d;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "getValue", "()Ljava/lang/Integer;", "CAPSENSE_CALIBRATION_NOT_SUPPORTED", "CAPSENSE_CALIBRATION_READY", "CAPSENSE_CALIBRATION_NORMALISING", "CAPSENSE_CALIBRATION_CALCULATING", "CAPSENSE_CALIBRATION_SUCCESS", "CAPSENSE_CALIBRATION_FAILURE", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final Integer value;
    public static final d CAPSENSE_CALIBRATION_NOT_SUPPORTED = new d("CAPSENSE_CALIBRATION_NOT_SUPPORTED", 0, null);
    public static final d CAPSENSE_CALIBRATION_READY = new d("CAPSENSE_CALIBRATION_READY", 1, 0);
    public static final d CAPSENSE_CALIBRATION_NORMALISING = new d("CAPSENSE_CALIBRATION_NORMALISING", 2, 1);
    public static final d CAPSENSE_CALIBRATION_CALCULATING = new d("CAPSENSE_CALIBRATION_CALCULATING", 3, 2);
    public static final d CAPSENSE_CALIBRATION_SUCCESS = new d("CAPSENSE_CALIBRATION_SUCCESS", 4, 3);
    public static final d CAPSENSE_CALIBRATION_FAILURE = new d("CAPSENSE_CALIBRATION_FAILURE", 5, 4);

    private static final /* synthetic */ d[] $values() {
        return new d[]{CAPSENSE_CALIBRATION_NOT_SUPPORTED, CAPSENSE_CALIBRATION_READY, CAPSENSE_CALIBRATION_NORMALISING, CAPSENSE_CALIBRATION_CALCULATING, CAPSENSE_CALIBRATION_SUCCESS, CAPSENSE_CALIBRATION_FAILURE};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private d(String str, int i13, Integer num) {
        this.value = num;
    }

    public static o12.a<d> getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final Integer getValue() {
        return this.value;
    }
}
