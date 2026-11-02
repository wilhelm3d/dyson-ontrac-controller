package com.dyson.mobile.android.robot.traits.consumables;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/robot/traits/consumables/ConsumableType;", "", "value", "", "isResettable", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "()Z", "BRUSH", "MOP", "MOP_PAD", "SIDE_BRUSH", "ROBOT_FILTER", "DOCK_FILTER", "IONISER_CARTRIDGE", "DETERGENT", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsumableType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConsumableType[] $VALUES;
    private final boolean isResettable;
    private final String value;
    public static final ConsumableType BRUSH = new ConsumableType("BRUSH", 0, "brushBar", true);
    public static final ConsumableType MOP = new ConsumableType("MOP", 1, "mopRoller", true);
    public static final ConsumableType MOP_PAD = new ConsumableType("MOP_PAD", 2, "mopPad", true);
    public static final ConsumableType SIDE_BRUSH = new ConsumableType("SIDE_BRUSH", 3, "sideBrushes", true);
    public static final ConsumableType ROBOT_FILTER = new ConsumableType("ROBOT_FILTER", 4, "robotFilter", true);
    public static final ConsumableType DOCK_FILTER = new ConsumableType("DOCK_FILTER", 5, "dockFilter", true);
    public static final ConsumableType IONISER_CARTRIDGE = new ConsumableType("IONISER_CARTRIDGE", 6, "ioniserCartridge", true);
    public static final ConsumableType DETERGENT = new ConsumableType("DETERGENT", 7, "cleaningSolution", false);

    private static final /* synthetic */ ConsumableType[] $values() {
        return new ConsumableType[]{BRUSH, MOP, MOP_PAD, SIDE_BRUSH, ROBOT_FILTER, DOCK_FILTER, IONISER_CARTRIDGE, DETERGENT};
    }

    static {
        ConsumableType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private ConsumableType(String str, int i13, String str2, boolean z13) {
        this.value = str2;
        this.isResettable = z13;
    }

    public static a<ConsumableType> getEntries() {
        return $ENTRIES;
    }

    public static ConsumableType valueOf(String str) {
        return (ConsumableType) Enum.valueOf(ConsumableType.class, str);
    }

    public static ConsumableType[] values() {
        return (ConsumableType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isResettable() {
        return this.isResettable;
    }
}
