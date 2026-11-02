package com.dyson.nst.dyson3d.schema.model;

import com.salesforce.marketingcloud.messages.inbox.b;
import hx.v;
import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o12.a;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\u0010\nR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/View;", "", b.f21448j, "Lcom/dyson/nst/dyson3d/schema/model/View$Type;", "visibleNodes", "", "", "hiddenNodes", "states", "Lcom/dyson/nst/dyson3d/schema/model/AnimationState;", "(Lcom/dyson/nst/dyson3d/schema/model/View$Type;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getHiddenNodes", "()Ljava/util/List;", "getStates", "getType", "()Lcom/dyson/nst/dyson3d/schema/model/View$Type;", "getVisibleNodes", "Type", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class View {
    public static final int $stable = 8;
    private final List<String> hiddenNodes;
    private final List<AnimationState> states;
    private final Type type;
    private final List<String> visibleNodes;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/View$Type;", "", "(Ljava/lang/String;I)V", "STANDARD", "ADJUSTMENT", "DETAIL", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type STANDARD = new Type("STANDARD", 0);
        public static final Type ADJUSTMENT = new Type("ADJUSTMENT", 1);
        public static final Type DETAIL = new Type("DETAIL", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{STANDARD, ADJUSTMENT, DETAIL};
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

    public View(Type type, List<String> list, List<String> list2, List<AnimationState> list3) {
        type.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.type = type;
        this.visibleNodes = list;
        this.hiddenNodes = list2;
        this.states = list3;
    }

    public final List<String> getHiddenNodes() {
        return this.hiddenNodes;
    }

    public final List<AnimationState> getStates() {
        return this.states;
    }

    public final Type getType() {
        return this.type;
    }

    public final List<String> getVisibleNodes() {
        return this.visibleNodes;
    }

    public View(Type type, List list, List list2, List list3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, (i13 & 2) != 0 ? e0.d : list, (i13 & 4) != 0 ? e0.d : list2, list3);
    }
}
