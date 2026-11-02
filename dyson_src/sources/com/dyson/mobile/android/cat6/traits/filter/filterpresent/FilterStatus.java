package com.dyson.mobile.android.cat6.traits.filter.filterpresent;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/filter/filterpresent/FilterStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FILTER_PRESENT", "FILTER_NOT_PRESENT", "UNKNOWN", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FilterStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FilterStatus[] $VALUES;
    private final int value;
    public static final FilterStatus FILTER_PRESENT = new FilterStatus("FILTER_PRESENT", 0, 0);
    public static final FilterStatus FILTER_NOT_PRESENT = new FilterStatus("FILTER_NOT_PRESENT", 1, 1);
    public static final FilterStatus UNKNOWN = new FilterStatus("UNKNOWN", 2, 2);

    private static final /* synthetic */ FilterStatus[] $values() {
        return new FilterStatus[]{FILTER_PRESENT, FILTER_NOT_PRESENT, UNKNOWN};
    }

    static {
        FilterStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private FilterStatus(String str, int i13, int i14) {
        this.value = i14;
    }

    public static a<FilterStatus> getEntries() {
        return $ENTRIES;
    }

    public static FilterStatus valueOf(String str) {
        return (FilterStatus) Enum.valueOf(FilterStatus.class, str);
    }

    public static FilterStatus[] values() {
        return (FilterStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
