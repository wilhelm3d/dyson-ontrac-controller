package com.dyson.mobile.android.cat6.traits.filter.filterwash;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/filter/filterwash/FilterWashStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FILTER_OK", "FILTER_NEEDS_CLEANING", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FilterWashStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FilterWashStatus[] $VALUES;
    private final int value;
    public static final FilterWashStatus FILTER_OK = new FilterWashStatus("FILTER_OK", 0, 0);
    public static final FilterWashStatus FILTER_NEEDS_CLEANING = new FilterWashStatus("FILTER_NEEDS_CLEANING", 1, 1);

    private static final /* synthetic */ FilterWashStatus[] $values() {
        return new FilterWashStatus[]{FILTER_OK, FILTER_NEEDS_CLEANING};
    }

    static {
        FilterWashStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private FilterWashStatus(String str, int i13, int i14) {
        this.value = i14;
    }

    public static a<FilterWashStatus> getEntries() {
        return $ENTRIES;
    }

    public static FilterWashStatus valueOf(String str) {
        return (FilterWashStatus) Enum.valueOf(FilterWashStatus.class, str);
    }

    public static FilterWashStatus[] values() {
        return (FilterWashStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
