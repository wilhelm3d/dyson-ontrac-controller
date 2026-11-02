package com.dyson.mobile.android.resources.view.tooltip;

import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/resources/view/tooltip/a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "LEFT", "RIGHT", "CENTER", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0546a Companion;
    public static final a LEFT = new a("LEFT", 0);
    public static final a RIGHT = new a("RIGHT", 1);
    public static final a CENTER = new a("CENTER", 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{LEFT, RIGHT, CENTER};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new C0546a(null);
    }

    private a(String str, int i13) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/resources/view/tooltip/a$a;", "", "<init>", "()V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.resources.view.tooltip.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0546a {
        public /* synthetic */ C0546a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0546a() {
        }
    }
}
