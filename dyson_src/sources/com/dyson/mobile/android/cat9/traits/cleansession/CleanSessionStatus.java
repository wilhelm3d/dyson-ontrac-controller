package com.dyson.mobile.android.cat9.traits.cleansession;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/cat9/traits/cleansession/CleanSessionStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "IDLE", "STARTED", "PAUSED", "RESUMED", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CleanSessionStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CleanSessionStatus[] $VALUES;
    private final int value;
    public static final CleanSessionStatus IDLE = new CleanSessionStatus("IDLE", 0, 0);
    public static final CleanSessionStatus STARTED = new CleanSessionStatus("STARTED", 1, 1);
    public static final CleanSessionStatus PAUSED = new CleanSessionStatus("PAUSED", 2, 2);
    public static final CleanSessionStatus RESUMED = new CleanSessionStatus("RESUMED", 3, 3);

    private static final /* synthetic */ CleanSessionStatus[] $values() {
        return new CleanSessionStatus[]{IDLE, STARTED, PAUSED, RESUMED};
    }

    static {
        CleanSessionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private CleanSessionStatus(String str, int i13, int i14) {
        this.value = i14;
    }

    public static a<CleanSessionStatus> getEntries() {
        return $ENTRIES;
    }

    public static CleanSessionStatus valueOf(String str) {
        return (CleanSessionStatus) Enum.valueOf(CleanSessionStatus.class, str);
    }

    public static CleanSessionStatus[] values() {
        return (CleanSessionStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
