package com.dyson.nst.dyson3d.schema.model;

import com.salesforce.marketingcloud.messages.inbox.b;
import hx.v;
import java.util.Map;
import kotlin.Metadata;
import o12.a;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Capability;", "", b.f21448j, "Lcom/dyson/nst/dyson3d/schema/model/Capability$Type;", "settings", "", "", "node", "(Lcom/dyson/nst/dyson3d/schema/model/Capability$Type;Ljava/util/Map;Ljava/lang/String;)V", "getNode", "()Ljava/lang/String;", "getSettings", "()Ljava/util/Map;", "getType", "()Lcom/dyson/nst/dyson3d/schema/model/Capability$Type;", "Type", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Capability {
    public static final int $stable = 8;
    private final String node;
    private final Map<String, ?> settings;
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Capability$Type;", "", "(Ljava/lang/String;I)V", "OSCILLATION", "AIRFLOW", "CONNECTED", "AIRFLOW_TILT", "BREEZE_MODE", "AUTO_MODE", "NIGHT_MODE", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type OSCILLATION = new Type("OSCILLATION", 0);
        public static final Type AIRFLOW = new Type("AIRFLOW", 1);
        public static final Type CONNECTED = new Type("CONNECTED", 2);
        public static final Type AIRFLOW_TILT = new Type("AIRFLOW_TILT", 3);
        public static final Type BREEZE_MODE = new Type("BREEZE_MODE", 4);
        public static final Type AUTO_MODE = new Type("AUTO_MODE", 5);
        public static final Type NIGHT_MODE = new Type("NIGHT_MODE", 6);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{OSCILLATION, AIRFLOW, CONNECTED, AIRFLOW_TILT, BREEZE_MODE, AUTO_MODE, NIGHT_MODE};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private Type(String str, int i13) {
        }

        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public Capability(Type type, Map<String, ?> map, String str) {
        type.getClass();
        map.getClass();
        this.type = type;
        this.settings = map;
        this.node = str;
    }

    public final String getNode() {
        return this.node;
    }

    public final Map<String, ?> getSettings() {
        return this.settings;
    }

    public final Type getType() {
        return this.type;
    }
}
