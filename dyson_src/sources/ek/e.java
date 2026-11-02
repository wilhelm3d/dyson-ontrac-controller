package ek;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lek/e;", "", "<init>", "(Ljava/lang/String;I)V", "PRE_CALIBRATION_EAR_CUSHIONS", "CALIBRATE", "BLE_BONDING", "HOW_TO_RESTART", "HOW_TO_SWITCH_ON", "ANC_ISOLATION", "ANC_TRANSPARENCY", "ANC_OFF", "ANC_CONVERSATION", "ANC_ON_CALL", "ANC_NOT_CONNECTED", "ANC_CONTROL_ISOLATION_ICON", "ANC_CONTROL_TRANSPARENCY_ICON", "ANC_CONTROL_OFF_ICON", "EQ_GRAPH_ENHANCED", "EQ_GRAPH_BASS_BOOST", "EQ_GRAPH_NEUTRAL", "EQ_CONTROL_ENHANCED_ICON", "EQ_CONTROL_BASS_BOOST_ICON", "EQ_CONTROL_NEUTRAL_ICON", "RESET", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e PRE_CALIBRATION_EAR_CUSHIONS = new e("PRE_CALIBRATION_EAR_CUSHIONS", 0);
    public static final e CALIBRATE = new e("CALIBRATE", 1);
    public static final e BLE_BONDING = new e("BLE_BONDING", 2);
    public static final e HOW_TO_RESTART = new e("HOW_TO_RESTART", 3);
    public static final e HOW_TO_SWITCH_ON = new e("HOW_TO_SWITCH_ON", 4);
    public static final e ANC_ISOLATION = new e("ANC_ISOLATION", 5);
    public static final e ANC_TRANSPARENCY = new e("ANC_TRANSPARENCY", 6);
    public static final e ANC_OFF = new e("ANC_OFF", 7);
    public static final e ANC_CONVERSATION = new e("ANC_CONVERSATION", 8);
    public static final e ANC_ON_CALL = new e("ANC_ON_CALL", 9);
    public static final e ANC_NOT_CONNECTED = new e("ANC_NOT_CONNECTED", 10);
    public static final e ANC_CONTROL_ISOLATION_ICON = new e("ANC_CONTROL_ISOLATION_ICON", 11);
    public static final e ANC_CONTROL_TRANSPARENCY_ICON = new e("ANC_CONTROL_TRANSPARENCY_ICON", 12);
    public static final e ANC_CONTROL_OFF_ICON = new e("ANC_CONTROL_OFF_ICON", 13);
    public static final e EQ_GRAPH_ENHANCED = new e("EQ_GRAPH_ENHANCED", 14);
    public static final e EQ_GRAPH_BASS_BOOST = new e("EQ_GRAPH_BASS_BOOST", 15);
    public static final e EQ_GRAPH_NEUTRAL = new e("EQ_GRAPH_NEUTRAL", 16);
    public static final e EQ_CONTROL_ENHANCED_ICON = new e("EQ_CONTROL_ENHANCED_ICON", 17);
    public static final e EQ_CONTROL_BASS_BOOST_ICON = new e("EQ_CONTROL_BASS_BOOST_ICON", 18);
    public static final e EQ_CONTROL_NEUTRAL_ICON = new e("EQ_CONTROL_NEUTRAL_ICON", 19);
    public static final e RESET = new e("RESET", 20);

    private static final /* synthetic */ e[] $values() {
        return new e[]{PRE_CALIBRATION_EAR_CUSHIONS, CALIBRATE, BLE_BONDING, HOW_TO_RESTART, HOW_TO_SWITCH_ON, ANC_ISOLATION, ANC_TRANSPARENCY, ANC_OFF, ANC_CONVERSATION, ANC_ON_CALL, ANC_NOT_CONNECTED, ANC_CONTROL_ISOLATION_ICON, ANC_CONTROL_TRANSPARENCY_ICON, ANC_CONTROL_OFF_ICON, EQ_GRAPH_ENHANCED, EQ_GRAPH_BASS_BOOST, EQ_GRAPH_NEUTRAL, EQ_CONTROL_ENHANCED_ICON, EQ_CONTROL_BASS_BOOST_ICON, EQ_CONTROL_NEUTRAL_ICON, RESET};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private e(String str, int i13) {
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
}
