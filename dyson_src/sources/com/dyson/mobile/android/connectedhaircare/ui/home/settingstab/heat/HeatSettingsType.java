package com.dyson.mobile.android.connectedhaircare.ui.home.settingstab.heat;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/settingstab/heat/HeatSettingsType;", "", "<init>", "(Ljava/lang/String;I)V", "HIGH_HEAT", "LOW_HEAT", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeatSettingsType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ HeatSettingsType[] $VALUES;
    public static final HeatSettingsType HIGH_HEAT = new HeatSettingsType("HIGH_HEAT", 0);
    public static final HeatSettingsType LOW_HEAT = new HeatSettingsType("LOW_HEAT", 1);

    private static final /* synthetic */ HeatSettingsType[] $values() {
        return new HeatSettingsType[]{HIGH_HEAT, LOW_HEAT};
    }

    static {
        HeatSettingsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private HeatSettingsType(String str, int i13) {
    }

    public static a<HeatSettingsType> getEntries() {
        return $ENTRIES;
    }

    public static HeatSettingsType valueOf(String str) {
        return (HeatSettingsType) Enum.valueOf(HeatSettingsType.class, str);
    }

    public static HeatSettingsType[] values() {
        return (HeatSettingsType[]) $VALUES.clone();
    }
}
