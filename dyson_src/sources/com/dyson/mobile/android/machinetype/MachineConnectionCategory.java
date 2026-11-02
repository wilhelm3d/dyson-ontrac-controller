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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "NON_CONNECTED", "WIFI_ONLY", "LEC_ONLY", "LEC_AND_WIFI", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineConnectionCategory {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ MachineConnectionCategory[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final MachineConnectionCategory NON_CONNECTED = new MachineConnectionCategory("NON_CONNECTED", 0, "nonConnected");
    public static final MachineConnectionCategory WIFI_ONLY = new MachineConnectionCategory("WIFI_ONLY", 1, "wifiOnly");
    public static final MachineConnectionCategory LEC_ONLY = new MachineConnectionCategory("LEC_ONLY", 2, "lecOnly");
    public static final MachineConnectionCategory LEC_AND_WIFI = new MachineConnectionCategory("LEC_AND_WIFI", 3, "lecAndWifi");

    private static final /* synthetic */ MachineConnectionCategory[] $values() {
        return new MachineConnectionCategory[]{NON_CONNECTED, WIFI_ONLY, LEC_ONLY, LEC_AND_WIFI};
    }

    static {
        MachineConnectionCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private MachineConnectionCategory(String str, int i13, String str2) {
        this.value = str2;
    }

    public static final MachineConnectionCategory fromConnectionCategory(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public static o12.a<MachineConnectionCategory> getEntries() {
        return $ENTRIES;
    }

    public static MachineConnectionCategory valueOf(String str) {
        return (MachineConnectionCategory) Enum.valueOf(MachineConnectionCategory.class, str);
    }

    public static MachineConnectionCategory[] values() {
        return (MachineConnectionCategory[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory$a;", "", "<init>", "()V", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static MachineConnectionCategory a(String str) {
            Object obj;
            Iterator<E> it = MachineConnectionCategory.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (r.c(((MachineConnectionCategory) obj).getValue(), str)) {
                    break;
                }
            }
            return (MachineConnectionCategory) obj;
        }

        private a() {
        }
    }
}
