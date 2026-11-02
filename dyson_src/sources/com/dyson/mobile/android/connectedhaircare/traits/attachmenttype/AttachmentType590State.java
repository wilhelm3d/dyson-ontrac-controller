package com.dyson.mobile.android.connectedhaircare.traits.attachmenttype;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u001a"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/traits/attachmenttype/AttachmentType590State;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_ATTACHMENT", "SMOOTHING_DRYER", "BARREL_20", "SMOOTHING_BRUSH", "ROUND_BRUSH", "AIR_SMOOTH", "BARREL_30", "BARREL_40", "RIDGE_TENSION_COMB", "AIR_BOWL", "PRE_STYLE_DRYER", "CONICAL_BARREL", "LARGE_ROUND_BRUSH", "AIRSTRAIT", "LONG_BARREL_40MM", "ATTACHMENT_NOT_RECOGNISE", "isBarrel", "", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AttachmentType590State {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ AttachmentType590State[] $VALUES;
    private final int value;
    public static final AttachmentType590State NO_ATTACHMENT = new AttachmentType590State("NO_ATTACHMENT", 0, 0);
    public static final AttachmentType590State SMOOTHING_DRYER = new AttachmentType590State("SMOOTHING_DRYER", 1, 1);
    public static final AttachmentType590State BARREL_20 = new AttachmentType590State("BARREL_20", 2, 2);
    public static final AttachmentType590State SMOOTHING_BRUSH = new AttachmentType590State("SMOOTHING_BRUSH", 3, 3);
    public static final AttachmentType590State ROUND_BRUSH = new AttachmentType590State("ROUND_BRUSH", 4, 4);
    public static final AttachmentType590State AIR_SMOOTH = new AttachmentType590State("AIR_SMOOTH", 5, 5);
    public static final AttachmentType590State BARREL_30 = new AttachmentType590State("BARREL_30", 6, 6);
    public static final AttachmentType590State BARREL_40 = new AttachmentType590State("BARREL_40", 7, 7);
    public static final AttachmentType590State RIDGE_TENSION_COMB = new AttachmentType590State("RIDGE_TENSION_COMB", 8, 8);
    public static final AttachmentType590State AIR_BOWL = new AttachmentType590State("AIR_BOWL", 9, 10);
    public static final AttachmentType590State PRE_STYLE_DRYER = new AttachmentType590State("PRE_STYLE_DRYER", 10, 11);
    public static final AttachmentType590State CONICAL_BARREL = new AttachmentType590State("CONICAL_BARREL", 11, 12);
    public static final AttachmentType590State LARGE_ROUND_BRUSH = new AttachmentType590State("LARGE_ROUND_BRUSH", 12, 13);
    public static final AttachmentType590State AIRSTRAIT = new AttachmentType590State("AIRSTRAIT", 13, 14);
    public static final AttachmentType590State LONG_BARREL_40MM = new AttachmentType590State("LONG_BARREL_40MM", 14, 15);
    public static final AttachmentType590State ATTACHMENT_NOT_RECOGNISE = new AttachmentType590State("ATTACHMENT_NOT_RECOGNISE", 15, -1);

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12934a;

        static {
            int[] iArr = new int[AttachmentType590State.values().length];
            try {
                iArr[AttachmentType590State.BARREL_20.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttachmentType590State.BARREL_30.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttachmentType590State.BARREL_40.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttachmentType590State.CONICAL_BARREL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AttachmentType590State.LONG_BARREL_40MM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f12934a = iArr;
        }
    }

    private static final /* synthetic */ AttachmentType590State[] $values() {
        return new AttachmentType590State[]{NO_ATTACHMENT, SMOOTHING_DRYER, BARREL_20, SMOOTHING_BRUSH, ROUND_BRUSH, AIR_SMOOTH, BARREL_30, BARREL_40, RIDGE_TENSION_COMB, AIR_BOWL, PRE_STYLE_DRYER, CONICAL_BARREL, LARGE_ROUND_BRUSH, AIRSTRAIT, LONG_BARREL_40MM, ATTACHMENT_NOT_RECOGNISE};
    }

    static {
        AttachmentType590State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private AttachmentType590State(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<AttachmentType590State> getEntries() {
        return $ENTRIES;
    }

    public static AttachmentType590State valueOf(String str) {
        return (AttachmentType590State) Enum.valueOf(AttachmentType590State.class, str);
    }

    public static AttachmentType590State[] values() {
        return (AttachmentType590State[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final boolean isBarrel() {
        int i13 = a.f12934a[ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4 || i13 == 5;
    }
}
