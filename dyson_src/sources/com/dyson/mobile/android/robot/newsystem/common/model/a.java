package com.dyson.mobile.android.robot.newsystem.common.model;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.w;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/a;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "labelKey", "", "icon", "", "iconTestTag", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;ILjava/lang/String;)V", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getLabelKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "I", "getIcon", "()I", "Ljava/lang/String;", "getIconTestTag", "()Ljava/lang/String;", "Companion", "a", "ONE", "TWO", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0563a Companion;
    private static final a DEFAULT;
    private static final LocalisationKey MOP_SUB_TITLE;
    private static final LocalisationKey MOP_TITLE;
    public static final a ONE;
    public static final a TWO;
    private static final LocalisationKey VACUUM_MOP_SUB_TITLE;
    private static final LocalisationKey VACUUM_MOP_TITLE;
    private static final LocalisationKey VACUUM_SUB_TITLE;
    private static final LocalisationKey VACUUM_TITLE;
    private final int icon;
    private final String iconTestTag;
    private final LocalisationKey labelKey;

    private static final /* synthetic */ a[] $values() {
        return new a[]{ONE, TWO};
    }

    static {
        a aVar = new a("ONE", 0, w.H, R.drawable.ic_clean_pass_1, "CleanPassIcon.One");
        ONE = aVar;
        TWO = new a("TWO", 1, w.I, R.drawable.ic_clean_pass_2, "CleanPassIcon.Two");
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new C0563a(null);
        MOP_TITLE = w.G;
        MOP_SUB_TITLE = w.f72968t6;
        VACUUM_TITLE = w.f72952r6;
        VACUUM_SUB_TITLE = w.f72960s6;
        VACUUM_MOP_TITLE = w.f72976u6;
        VACUUM_MOP_SUB_TITLE = w.f72984v6;
        DEFAULT = aVar;
    }

    private a(String str, int i13, LocalisationKey localisationKey, int i14, String str2) {
        this.labelKey = localisationKey;
        this.icon = i14;
        this.iconTestTag = str2;
    }

    public static final /* synthetic */ a access$getDEFAULT$cp() {
        return DEFAULT;
    }

    public static o12.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getIconTestTag() {
        return this.iconTestTag;
    }

    public final LocalisationKey getLabelKey() {
        return this.labelKey;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/a$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.common.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0563a {
        public /* synthetic */ C0563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0563a() {
        }
    }
}
