package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;", "", "()V", "Hidden", "Other", "Transform", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation$Hidden;", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation$Other;", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation$Transform;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class PropertyAnimation {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation$Hidden;", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;", "isHidden", "", "(Z)V", "()Z", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Hidden extends PropertyAnimation {
        public static final int $stable = 0;
        private final boolean isHidden;

        public Hidden(boolean z13) {
            super(null);
            this.isHidden = z13;
        }

        public final boolean isHidden() {
            return this.isHidden;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation$Other;", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;", "name", "", "value", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Other extends PropertyAnimation {
        public static final int $stable = 8;
        private final String name;
        private final Object value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(String str, Object obj) {
            super(null);
            str.getClass();
            this.name = str;
            this.value = obj;
        }

        public final String getName() {
            return this.name;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation$Transform;", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;", "transform", "Lcom/dyson/nst/dyson3d/schema/model/Transform;", "(Lcom/dyson/nst/dyson3d/schema/model/Transform;)V", "getTransform", "()Lcom/dyson/nst/dyson3d/schema/model/Transform;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Transform extends PropertyAnimation {
        public static final int $stable = 8;
        private final com.dyson.nst.dyson3d.schema.model.Transform transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transform(com.dyson.nst.dyson3d.schema.model.Transform transform) {
            super(null);
            transform.getClass();
            this.transform = transform;
        }

        public final com.dyson.nst.dyson3d.schema.model.Transform getTransform() {
            return this.transform;
        }
    }

    public /* synthetic */ PropertyAnimation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PropertyAnimation() {
    }
}
