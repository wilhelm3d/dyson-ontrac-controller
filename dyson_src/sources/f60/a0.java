package f60;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lf60/a0;", "Lo60/b;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "UNAUTHORIZED_LOCATION", "UNAUTHORIZED_BLUETOOTH", "UNAUTHORIZED_NEARBY_DEVICES", "BLUETOOTH_NOT_SUPPORTED", "BLUETOOTH_DISABLED", "SCANNING_LOCKED", "CONNECTING_LOCKED", "DISCONNECTED_BY_APP", "DISCONNECTED_BY_MACHINE", "UNKNOWN_ERROR", "FAILED_TO_FETCH_LTK", "FAILED_TO_FETCH_OWNERSHIP", "MACHINE_NOT_FOUND", "FAILED_TO_CONNECT", "FAILED_TO_READ_RSSI_AND_WAIT_FOR_BOND", "FAILED_TO_SUBSCRIBE", "FAILED_TO_REQUEST_MTU", "FAILED_TO_RETRIEVE_PRODUCT_INFO", "FAILED_TO_AUTHENTICATE", "SOMEONE_ELSE_CONNECTED", "MAC_ADDRESS_REQUIRED_BUT_UNKNOWN", "RSSI_OUT_OF_RANGE", "UNABLE_TO_READ_LOW_POWER_MESSAGE", "NO_BUTTON_PRESS", "FAILED_TO_CONNECT_TO_BROKER", "RANDOM_NUMBER_ERROR", "FAILED_TO_LOCATE_MACHINE_FROM_QR_URL", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a0 implements o60.b {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 IDLE = new a0("IDLE", 0);
    public static final a0 UNAUTHORIZED_LOCATION = new a0("UNAUTHORIZED_LOCATION", 1);
    public static final a0 UNAUTHORIZED_BLUETOOTH = new a0("UNAUTHORIZED_BLUETOOTH", 2);
    public static final a0 UNAUTHORIZED_NEARBY_DEVICES = new a0("UNAUTHORIZED_NEARBY_DEVICES", 3);
    public static final a0 BLUETOOTH_NOT_SUPPORTED = new a0("BLUETOOTH_NOT_SUPPORTED", 4);
    public static final a0 BLUETOOTH_DISABLED = new a0("BLUETOOTH_DISABLED", 5);
    public static final a0 SCANNING_LOCKED = new a0("SCANNING_LOCKED", 6);
    public static final a0 CONNECTING_LOCKED = new a0("CONNECTING_LOCKED", 7);
    public static final a0 DISCONNECTED_BY_APP = new a0("DISCONNECTED_BY_APP", 8);
    public static final a0 DISCONNECTED_BY_MACHINE = new a0("DISCONNECTED_BY_MACHINE", 9);
    public static final a0 UNKNOWN_ERROR = new a0("UNKNOWN_ERROR", 10);
    public static final a0 FAILED_TO_FETCH_LTK = new a0("FAILED_TO_FETCH_LTK", 11);
    public static final a0 FAILED_TO_FETCH_OWNERSHIP = new a0("FAILED_TO_FETCH_OWNERSHIP", 12);
    public static final a0 MACHINE_NOT_FOUND = new a0("MACHINE_NOT_FOUND", 13);
    public static final a0 FAILED_TO_CONNECT = new a0("FAILED_TO_CONNECT", 14);
    public static final a0 FAILED_TO_READ_RSSI_AND_WAIT_FOR_BOND = new a0("FAILED_TO_READ_RSSI_AND_WAIT_FOR_BOND", 15);
    public static final a0 FAILED_TO_SUBSCRIBE = new a0("FAILED_TO_SUBSCRIBE", 16);
    public static final a0 FAILED_TO_REQUEST_MTU = new a0("FAILED_TO_REQUEST_MTU", 17);
    public static final a0 FAILED_TO_RETRIEVE_PRODUCT_INFO = new a0("FAILED_TO_RETRIEVE_PRODUCT_INFO", 18);
    public static final a0 FAILED_TO_AUTHENTICATE = new a0("FAILED_TO_AUTHENTICATE", 19);
    public static final a0 SOMEONE_ELSE_CONNECTED = new a0("SOMEONE_ELSE_CONNECTED", 20);
    public static final a0 MAC_ADDRESS_REQUIRED_BUT_UNKNOWN = new a0("MAC_ADDRESS_REQUIRED_BUT_UNKNOWN", 21);
    public static final a0 RSSI_OUT_OF_RANGE = new a0("RSSI_OUT_OF_RANGE", 22);
    public static final a0 UNABLE_TO_READ_LOW_POWER_MESSAGE = new a0("UNABLE_TO_READ_LOW_POWER_MESSAGE", 23);
    public static final a0 NO_BUTTON_PRESS = new a0("NO_BUTTON_PRESS", 24);
    public static final a0 FAILED_TO_CONNECT_TO_BROKER = new a0("FAILED_TO_CONNECT_TO_BROKER", 25);
    public static final a0 RANDOM_NUMBER_ERROR = new a0("RANDOM_NUMBER_ERROR", 26);
    public static final a0 FAILED_TO_LOCATE_MACHINE_FROM_QR_URL = new a0("FAILED_TO_LOCATE_MACHINE_FROM_QR_URL", 27);

    private static final /* synthetic */ a0[] $values() {
        return new a0[]{IDLE, UNAUTHORIZED_LOCATION, UNAUTHORIZED_BLUETOOTH, UNAUTHORIZED_NEARBY_DEVICES, BLUETOOTH_NOT_SUPPORTED, BLUETOOTH_DISABLED, SCANNING_LOCKED, CONNECTING_LOCKED, DISCONNECTED_BY_APP, DISCONNECTED_BY_MACHINE, UNKNOWN_ERROR, FAILED_TO_FETCH_LTK, FAILED_TO_FETCH_OWNERSHIP, MACHINE_NOT_FOUND, FAILED_TO_CONNECT, FAILED_TO_READ_RSSI_AND_WAIT_FOR_BOND, FAILED_TO_SUBSCRIBE, FAILED_TO_REQUEST_MTU, FAILED_TO_RETRIEVE_PRODUCT_INFO, FAILED_TO_AUTHENTICATE, SOMEONE_ELSE_CONNECTED, MAC_ADDRESS_REQUIRED_BUT_UNKNOWN, RSSI_OUT_OF_RANGE, UNABLE_TO_READ_LOW_POWER_MESSAGE, NO_BUTTON_PRESS, FAILED_TO_CONNECT_TO_BROKER, RANDOM_NUMBER_ERROR, FAILED_TO_LOCATE_MACHINE_FROM_QR_URL};
    }

    static {
        a0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = hx.v.l($values);
    }

    private a0(String str, int i13) {
    }

    public static o12.a<a0> getEntries() {
        return $ENTRIES;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
