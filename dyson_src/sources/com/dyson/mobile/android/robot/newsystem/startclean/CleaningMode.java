package com.dyson.mobile.android.robot.newsystem.startclean;

import androidx.annotation.Keep;
import com.dyson.mobile.android.R;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/startclean/CleaningMode;", "", "displayNameKey", "", "<init>", "(Ljava/lang/String;II)V", "getDisplayNameKey", "()I", "ALL_AREAS_CLEAN", "ROOM_CLEAN", "TARGET_CLEAN", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleaningMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CleaningMode[] $VALUES;
    public static final CleaningMode ALL_AREAS_CLEAN = new CleaningMode("ALL_AREAS_CLEAN", 0, R.string.common_all);
    public static final CleaningMode ROOM_CLEAN = new CleaningMode("ROOM_CLEAN", 1, R.string.machine804a_setUpClean_room);
    public static final CleaningMode TARGET_CLEAN = new CleaningMode("TARGET_CLEAN", 2, R.string.machine804a_setUpClean_spot);
    private final int displayNameKey;

    private static final /* synthetic */ CleaningMode[] $values() {
        return new CleaningMode[]{ALL_AREAS_CLEAN, ROOM_CLEAN, TARGET_CLEAN};
    }

    static {
        CleaningMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private CleaningMode(String str, int i13, int i14) {
        this.displayNameKey = i14;
    }

    public static a<CleaningMode> getEntries() {
        return $ENTRIES;
    }

    public static CleaningMode valueOf(String str) {
        return (CleaningMode) Enum.valueOf(CleaningMode.class, str);
    }

    public static CleaningMode[] values() {
        return (CleaningMode[]) $VALUES.clone();
    }

    public final int getDisplayNameKey() {
        return this.displayNameKey;
    }
}
