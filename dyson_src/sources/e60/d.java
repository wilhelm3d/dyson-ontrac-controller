package e60;

import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Le60/d;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "", "toSoftwareMessageCode", "()Ljava/lang/String;", "I", "getValue", "()I", "Companion", "a", "PACKAGE_DOWNLOAD_SUCCESSFULLY", "DOWNLOAD_FAILED_PACKAGE_SIGNATURE_CHECK_FAILED", "DOWNLOAD_FAILED_RECOVERY_PACKAGE_INVALID", "DOWNLOAD_FAILED_SW_VERSION_IS_LOWER_THAN_SECURITY_VERSION", "DOWNLOAD_FAILED_PROJECT_ID_NOT_MATCHING_PRODUCT_PROJECT_ID", "DOWNLOAD_FAILED_VARIANT_ID_NOT_MATCHING_PRODUCT_VARIANT_ID", "OTA_FAILED_INSUFFICIENT_SOC", "OTA_FAILED_POWER_ADAPTER_UNPLUGGED", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final d PACKAGE_DOWNLOAD_SUCCESSFULLY = new d("PACKAGE_DOWNLOAD_SUCCESSFULLY", 0, 0);
    public static final d DOWNLOAD_FAILED_PACKAGE_SIGNATURE_CHECK_FAILED = new d("DOWNLOAD_FAILED_PACKAGE_SIGNATURE_CHECK_FAILED", 1, 1);
    public static final d DOWNLOAD_FAILED_RECOVERY_PACKAGE_INVALID = new d("DOWNLOAD_FAILED_RECOVERY_PACKAGE_INVALID", 2, 2);
    public static final d DOWNLOAD_FAILED_SW_VERSION_IS_LOWER_THAN_SECURITY_VERSION = new d("DOWNLOAD_FAILED_SW_VERSION_IS_LOWER_THAN_SECURITY_VERSION", 3, 3);
    public static final d DOWNLOAD_FAILED_PROJECT_ID_NOT_MATCHING_PRODUCT_PROJECT_ID = new d("DOWNLOAD_FAILED_PROJECT_ID_NOT_MATCHING_PRODUCT_PROJECT_ID", 4, 4);
    public static final d DOWNLOAD_FAILED_VARIANT_ID_NOT_MATCHING_PRODUCT_VARIANT_ID = new d("DOWNLOAD_FAILED_VARIANT_ID_NOT_MATCHING_PRODUCT_VARIANT_ID", 5, 5);
    public static final d OTA_FAILED_INSUFFICIENT_SOC = new d("OTA_FAILED_INSUFFICIENT_SOC", 6, 6);
    public static final d OTA_FAILED_POWER_ADAPTER_UNPLUGGED = new d("OTA_FAILED_POWER_ADAPTER_UNPLUGGED", 7, 7);

    private static final /* synthetic */ d[] $values() {
        return new d[]{PACKAGE_DOWNLOAD_SUCCESSFULLY, DOWNLOAD_FAILED_PACKAGE_SIGNATURE_CHECK_FAILED, DOWNLOAD_FAILED_RECOVERY_PACKAGE_INVALID, DOWNLOAD_FAILED_SW_VERSION_IS_LOWER_THAN_SECURITY_VERSION, DOWNLOAD_FAILED_PROJECT_ID_NOT_MATCHING_PRODUCT_PROJECT_ID, DOWNLOAD_FAILED_VARIANT_ID_NOT_MATCHING_PRODUCT_VARIANT_ID, OTA_FAILED_INSUFFICIENT_SOC, OTA_FAILED_POWER_ADAPTER_UNPLUGGED};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private d(String str, int i13, int i14) {
        this.value = i14;
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

    public final int getValue() {
        return this.value;
    }

    public final String toSoftwareMessageCode() {
        return String.valueOf(this.value);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Le60/d$a;", "", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
