package com.dyson.mobile.android.robot.newsystem.activityhistory.data;

import androidx.annotation.Keep;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.w;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/activityhistory/data/ActivityHistoryMapType;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "displayName", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;)V", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getDisplayName", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "Companion", "a", "CLEAN_PATHS", "DUST_LEVELS", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityHistoryMapType {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ ActivityHistoryMapType[] $VALUES;
    public static final a Companion;
    private final LocalisationKey displayName;
    public static final ActivityHistoryMapType CLEAN_PATHS = new ActivityHistoryMapType("CLEAN_PATHS", 0, w.f72915n1);
    public static final ActivityHistoryMapType DUST_LEVELS = new ActivityHistoryMapType("DUST_LEVELS", 1, w.f72923o1);

    private static final /* synthetic */ ActivityHistoryMapType[] $values() {
        return new ActivityHistoryMapType[]{CLEAN_PATHS, DUST_LEVELS};
    }

    static {
        ActivityHistoryMapType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private ActivityHistoryMapType(String str, int i13, LocalisationKey localisationKey) {
        this.displayName = localisationKey;
    }

    public static o12.a<ActivityHistoryMapType> getEntries() {
        return $ENTRIES;
    }

    public static ActivityHistoryMapType valueOf(String str) {
        return (ActivityHistoryMapType) Enum.valueOf(ActivityHistoryMapType.class, str);
    }

    public static ActivityHistoryMapType[] values() {
        return (ActivityHistoryMapType[]) $VALUES.clone();
    }

    public final LocalisationKey getDisplayName() {
        return this.displayName;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/activityhistory/data/ActivityHistoryMapType$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
