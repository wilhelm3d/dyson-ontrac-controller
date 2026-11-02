package com.dyson.nst.dyson3d.schema.model;

import com.salesforce.marketingcloud.messages.inbox.b;
import hx.v;
import kotlin.Metadata;
import o12.a;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;", "", "Lyy1/b;", "vector", "Lcom/dyson/nst/dyson3d/schema/model/TransformComponent$Type;", b.f21448j, "<init>", "(Lyy1/b;Lcom/dyson/nst/dyson3d/schema/model/TransformComponent$Type;)V", "Lyy1/b;", "getVector", "()Lyy1/b;", "Lcom/dyson/nst/dyson3d/schema/model/TransformComponent$Type;", "getType", "()Lcom/dyson/nst/dyson3d/schema/model/TransformComponent$Type;", "Type", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformComponent {
    public static final int $stable = 8;
    private final Type type;
    private final yy1.b vector;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/TransformComponent$Type;", "", "(Ljava/lang/String;I)V", "ABSOLUTE", "RELATIVE", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ABSOLUTE = new Type("ABSOLUTE", 0);
        public static final Type RELATIVE = new Type("RELATIVE", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ABSOLUTE, RELATIVE};
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

    public TransformComponent(yy1.b bVar, Type type) {
        bVar.getClass();
        type.getClass();
        this.vector = bVar;
        this.type = type;
    }

    public final Type getType() {
        return this.type;
    }

    public final yy1.b getVector() {
        return this.vector;
    }
}
