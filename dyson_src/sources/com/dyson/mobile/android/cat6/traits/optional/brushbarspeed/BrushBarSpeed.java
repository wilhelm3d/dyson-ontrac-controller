package com.dyson.mobile.android.cat6.traits.optional.brushbarspeed;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/optional/brushbarspeed/BrushBarSpeed;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "a", "FIXED", "LOW", "HIGH", "AUTO", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrushBarSpeed {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ BrushBarSpeed[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final BrushBarSpeed FIXED = new BrushBarSpeed("FIXED", 0, Integer.MIN_VALUE);
    public static final BrushBarSpeed LOW = new BrushBarSpeed("LOW", 1, 0);
    public static final BrushBarSpeed HIGH = new BrushBarSpeed("HIGH", 2, 1);
    public static final BrushBarSpeed AUTO = new BrushBarSpeed("AUTO", 3, 2);

    private static final /* synthetic */ BrushBarSpeed[] $values() {
        return new BrushBarSpeed[]{FIXED, LOW, HIGH, AUTO};
    }

    static {
        BrushBarSpeed[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private BrushBarSpeed(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<BrushBarSpeed> getEntries() {
        return $ENTRIES;
    }

    public static BrushBarSpeed valueOf(String str) {
        return (BrushBarSpeed) Enum.valueOf(BrushBarSpeed.class, str);
    }

    public static BrushBarSpeed[] values() {
        return (BrushBarSpeed[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/optional/brushbarspeed/BrushBarSpeed$a;", "", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
