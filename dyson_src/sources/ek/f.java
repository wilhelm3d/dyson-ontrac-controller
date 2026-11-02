package ek;

import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lek/f;", "", "<init>", "(Ljava/lang/String;I)V", "SETTINGS_ACCESSORIES_TITLE", "SETTINGS_EAR_CUSHIONS_TITLE", "PRECALIBRATION_EAR_CUSHIONS_TITLE", "PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION", "PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION_EXTENDED", "PRECALIBRATION_EAR_CUSHIONS_ACTION_BUTTON", "RECALIBRATE_TITLE", "RECALIBRATE_HEADER", "RECALIBRATE_DESCRIPTION", "RECALIBRATE_DESCRIPTION_EXTENDED", "RECALIBRATE_BUTTON", "CALIBRATION_FAILURE_TITLE", "SOUND_CONTROL_NOISE_CANCELLATION_OFF_MODE_DESCRIPTION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f SETTINGS_ACCESSORIES_TITLE = new f("SETTINGS_ACCESSORIES_TITLE", 0);
    public static final f SETTINGS_EAR_CUSHIONS_TITLE = new f("SETTINGS_EAR_CUSHIONS_TITLE", 1);
    public static final f PRECALIBRATION_EAR_CUSHIONS_TITLE = new f("PRECALIBRATION_EAR_CUSHIONS_TITLE", 2);
    public static final f PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION = new f("PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION", 3);
    public static final f PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION_EXTENDED = new f("PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION_EXTENDED", 4);
    public static final f PRECALIBRATION_EAR_CUSHIONS_ACTION_BUTTON = new f("PRECALIBRATION_EAR_CUSHIONS_ACTION_BUTTON", 5);
    public static final f RECALIBRATE_TITLE = new f("RECALIBRATE_TITLE", 6);
    public static final f RECALIBRATE_HEADER = new f("RECALIBRATE_HEADER", 7);
    public static final f RECALIBRATE_DESCRIPTION = new f("RECALIBRATE_DESCRIPTION", 8);
    public static final f RECALIBRATE_DESCRIPTION_EXTENDED = new f("RECALIBRATE_DESCRIPTION_EXTENDED", 9);
    public static final f RECALIBRATE_BUTTON = new f("RECALIBRATE_BUTTON", 10);
    public static final f CALIBRATION_FAILURE_TITLE = new f("CALIBRATION_FAILURE_TITLE", 11);
    public static final f SOUND_CONTROL_NOISE_CANCELLATION_OFF_MODE_DESCRIPTION = new f("SOUND_CONTROL_NOISE_CANCELLATION_OFF_MODE_DESCRIPTION", 12);

    private static final /* synthetic */ f[] $values() {
        return new f[]{SETTINGS_ACCESSORIES_TITLE, SETTINGS_EAR_CUSHIONS_TITLE, PRECALIBRATION_EAR_CUSHIONS_TITLE, PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION, PRECALIBRATION_EAR_CUSHIONS_DESCRIPTION_EXTENDED, PRECALIBRATION_EAR_CUSHIONS_ACTION_BUTTON, RECALIBRATE_TITLE, RECALIBRATE_HEADER, RECALIBRATE_DESCRIPTION, RECALIBRATE_DESCRIPTION_EXTENDED, RECALIBRATE_BUTTON, CALIBRATION_FAILURE_TITLE, SOUND_CONTROL_NOISE_CANCELLATION_OFF_MODE_DESCRIPTION};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private f(String str, int i13) {
    }

    public static o12.a<f> getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
