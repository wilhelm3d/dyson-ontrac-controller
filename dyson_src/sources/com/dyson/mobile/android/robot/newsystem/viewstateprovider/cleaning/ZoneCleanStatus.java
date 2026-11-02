package com.dyson.mobile.android.robot.newsystem.viewstateprovider.cleaning;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/viewstateprovider/cleaning/ZoneCleanStatus;", "", "value", "", "sortOrder", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getSortOrder", "()I", "CLEAN_COMPLETE", "CANT_CLEAN", "CLEAN_IN_PROGRESS", "CLEAN_PENDING", "CLEAN_NOT_REQUESTED", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoneCleanStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ZoneCleanStatus[] $VALUES;
    private final int sortOrder;
    private final String value;
    public static final ZoneCleanStatus CLEAN_COMPLETE = new ZoneCleanStatus("CLEAN_COMPLETE", 0, "CLEAN_COMPLETE", 1);
    public static final ZoneCleanStatus CANT_CLEAN = new ZoneCleanStatus("CANT_CLEAN", 1, "CANT_CLEAN", 2);
    public static final ZoneCleanStatus CLEAN_IN_PROGRESS = new ZoneCleanStatus("CLEAN_IN_PROGRESS", 2, "CLEAN_IN_PROGRESS", 3);
    public static final ZoneCleanStatus CLEAN_PENDING = new ZoneCleanStatus("CLEAN_PENDING", 3, "CLEAN_PENDING", 4);
    public static final ZoneCleanStatus CLEAN_NOT_REQUESTED = new ZoneCleanStatus("CLEAN_NOT_REQUESTED", 4, "CLEAN_NOT_REQUESTED", 5);

    private static final /* synthetic */ ZoneCleanStatus[] $values() {
        return new ZoneCleanStatus[]{CLEAN_COMPLETE, CANT_CLEAN, CLEAN_IN_PROGRESS, CLEAN_PENDING, CLEAN_NOT_REQUESTED};
    }

    static {
        ZoneCleanStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private ZoneCleanStatus(String str, int i13, String str2, int i14) {
        this.value = str2;
        this.sortOrder = i14;
    }

    public static a<ZoneCleanStatus> getEntries() {
        return $ENTRIES;
    }

    public static ZoneCleanStatus valueOf(String str) {
        return (ZoneCleanStatus) Enum.valueOf(ZoneCleanStatus.class, str);
    }

    public static ZoneCleanStatus[] values() {
        return (ZoneCleanStatus[]) $VALUES.clone();
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final String getValue() {
        return this.value;
    }
}
