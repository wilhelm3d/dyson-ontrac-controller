package com.dyson.mobile.android.resources.view.motionlayout;

import hx.v;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/resources/view/motionlayout/a;", "", "<init>", "()V", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Float f15842a;

    /* renamed from: b  reason: collision with root package name */
    public Float f15843b;

    /* renamed from: c  reason: collision with root package name */
    public EnumC0545a f15844c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/resources/view/motionlayout/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "STEAL_EVENT_FROM_CHILD", "SHARE_EVENT_WITH_CHILD", "PASS_EVENT_TO_CHILD", "PASS_EVENT_TO_CHILD_AND_CANCEL_EVENT_FOR_THIS_VIEW", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.resources.view.motionlayout.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class EnumC0545a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ EnumC0545a[] $VALUES;
        public static final EnumC0545a STEAL_EVENT_FROM_CHILD = new EnumC0545a("STEAL_EVENT_FROM_CHILD", 0);
        public static final EnumC0545a SHARE_EVENT_WITH_CHILD = new EnumC0545a("SHARE_EVENT_WITH_CHILD", 1);
        public static final EnumC0545a PASS_EVENT_TO_CHILD = new EnumC0545a("PASS_EVENT_TO_CHILD", 2);
        public static final EnumC0545a PASS_EVENT_TO_CHILD_AND_CANCEL_EVENT_FOR_THIS_VIEW = new EnumC0545a("PASS_EVENT_TO_CHILD_AND_CANCEL_EVENT_FOR_THIS_VIEW", 3);

        private static final /* synthetic */ EnumC0545a[] $values() {
            return new EnumC0545a[]{STEAL_EVENT_FROM_CHILD, SHARE_EVENT_WITH_CHILD, PASS_EVENT_TO_CHILD, PASS_EVENT_TO_CHILD_AND_CANCEL_EVENT_FOR_THIS_VIEW};
        }

        static {
            EnumC0545a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private EnumC0545a(String str, int i13) {
        }

        public static o12.a<EnumC0545a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0545a valueOf(String str) {
            return (EnumC0545a) Enum.valueOf(EnumC0545a.class, str);
        }

        public static EnumC0545a[] values() {
            return (EnumC0545a[]) $VALUES.clone();
        }
    }
}
