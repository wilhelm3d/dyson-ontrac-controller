package com.dyson.mobile.android.robot.newsystem.mapengine.data;

import androidx.annotation.Keep;
import com.brightcove.player.video360.SphericalSceneRenderer;
import hx.v;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\tj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/RotationAngleDegree;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "rotateClockwise", "()Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/RotationAngleDegree;", "normalised", "()I", "I", "getValue", "Companion", "a", "ANGLE_0", "ANGLE_90", "ANGLE_180", "ANGLE_270", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RotationAngleDegree {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ RotationAngleDegree[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final RotationAngleDegree ANGLE_0 = new RotationAngleDegree("ANGLE_0", 0, 0);
    public static final RotationAngleDegree ANGLE_90 = new RotationAngleDegree("ANGLE_90", 1, 90);
    public static final RotationAngleDegree ANGLE_180 = new RotationAngleDegree("ANGLE_180", 2, SphericalSceneRenderer.SPHERE_SLICES);
    public static final RotationAngleDegree ANGLE_270 = new RotationAngleDegree("ANGLE_270", 3, 270);

    private static final /* synthetic */ RotationAngleDegree[] $values() {
        return new RotationAngleDegree[]{ANGLE_0, ANGLE_90, ANGLE_180, ANGLE_270};
    }

    static {
        RotationAngleDegree[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private RotationAngleDegree(String str, int i13, int i14) {
        this.value = i14;
    }

    public static o12.a<RotationAngleDegree> getEntries() {
        return $ENTRIES;
    }

    public static RotationAngleDegree valueOf(String str) {
        return (RotationAngleDegree) Enum.valueOf(RotationAngleDegree.class, str);
    }

    public static RotationAngleDegree[] values() {
        return (RotationAngleDegree[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final int normalised() {
        a aVar = Companion;
        int i13 = this.value;
        aVar.getClass();
        return a.a(i13);
    }

    public final RotationAngleDegree rotateClockwise() {
        return (RotationAngleDegree) getEntries().get((ordinal() + 1) % 4);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/RotationAngleDegree$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int a(int i13) {
            int i14 = i13 % 360;
            if (i14 == 0 || i14 == 90 || i14 == 180 || i14 == 270) {
                return i14;
            }
            return 0;
        }

        public static RotationAngleDegree b(int i13) {
            Object obj;
            Iterator<E> it = RotationAngleDegree.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((RotationAngleDegree) obj).getValue() == i13) {
                    break;
                }
            }
            RotationAngleDegree rotationAngleDegree = (RotationAngleDegree) obj;
            return rotationAngleDegree == null ? RotationAngleDegree.ANGLE_0 : rotationAngleDegree;
        }

        private a() {
        }
    }
}
