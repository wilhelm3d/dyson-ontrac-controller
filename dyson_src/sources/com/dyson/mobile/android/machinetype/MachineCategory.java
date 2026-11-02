package com.dyson.mobile.android.machinetype;

import androidx.annotation.Keep;
import hx.v;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineCategory;", "", "", "shortName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getShortName", "()Ljava/lang/String;", "Companion", "a", "EC", "ROBOT", "LIGHTING", "WEARABLE_EC", "HAIRCARE", "FLOORCARE", "FORMULATION", "ORALCARE", "CATEGORY5", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineCategory {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ MachineCategory[] $VALUES;
    public static final a Companion;
    private final String shortName;
    public static final MachineCategory EC = new MachineCategory("EC", 0, "ec");
    public static final MachineCategory ROBOT = new MachineCategory("ROBOT", 1, "robot");
    public static final MachineCategory LIGHTING = new MachineCategory("LIGHTING", 2, "light");
    public static final MachineCategory WEARABLE_EC = new MachineCategory("WEARABLE_EC", 3, "wearable");
    public static final MachineCategory HAIRCARE = new MachineCategory("HAIRCARE", 4, "hc");
    public static final MachineCategory FLOORCARE = new MachineCategory("FLOORCARE", 5, "flrc");
    public static final MachineCategory FORMULATION = new MachineCategory("FORMULATION", 6, "formulation");
    public static final MachineCategory ORALCARE = new MachineCategory("ORALCARE", 7, "oc");
    public static final MachineCategory CATEGORY5 = new MachineCategory("CATEGORY5", 8, "kc");

    private static final /* synthetic */ MachineCategory[] $values() {
        return new MachineCategory[]{EC, ROBOT, LIGHTING, WEARABLE_EC, HAIRCARE, FLOORCARE, FORMULATION, ORALCARE, CATEGORY5};
    }

    static {
        MachineCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private MachineCategory(String str, int i13, String str2) {
        this.shortName = str2;
    }

    public static final MachineCategory fromMachineCategory(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public static o12.a<MachineCategory> getEntries() {
        return $ENTRIES;
    }

    public static MachineCategory valueOf(String str) {
        return (MachineCategory) Enum.valueOf(MachineCategory.class, str);
    }

    public static MachineCategory[] values() {
        return (MachineCategory[]) $VALUES.clone();
    }

    public final String getShortName() {
        return this.shortName;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineCategory$a;", "", "<init>", "()V", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static MachineCategory a(String str) {
            Object obj;
            Iterator<E> it = MachineCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (r.c(((MachineCategory) obj).getShortName(), str)) {
                    break;
                }
            }
            return (MachineCategory) obj;
        }

        private a() {
        }
    }
}
