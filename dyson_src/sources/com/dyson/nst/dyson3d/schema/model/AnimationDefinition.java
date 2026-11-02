package com.dyson.nst.dyson3d.schema.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "", "()V", "Concurrent", "Named", "Property", "Sequence", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Concurrent;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Named;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Property;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Sequence;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class AnimationDefinition {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Concurrent;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "animations", "", "(Ljava/util/List;)V", "getAnimations", "()Ljava/util/List;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Concurrent extends AnimationDefinition {
        public static final int $stable = 8;
        private final List<AnimationDefinition> animations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Concurrent(List<? extends AnimationDefinition> list) {
            super(null);
            list.getClass();
            this.animations = list;
        }

        public final List<AnimationDefinition> getAnimations() {
            return this.animations;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Sequence;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "animations", "", "(Ljava/util/List;)V", "getAnimations", "()Ljava/util/List;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Sequence extends AnimationDefinition {
        public static final int $stable = 8;
        private final List<AnimationDefinition> animations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Sequence(List<? extends AnimationDefinition> list) {
            super(null);
            list.getClass();
            this.animations = list;
        }

        public final List<AnimationDefinition> getAnimations() {
            return this.animations;
        }
    }

    public /* synthetic */ AnimationDefinition(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AnimationDefinition() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Named;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "name", "", "properties", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;", "(Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;)V", "getName", "()Ljava/lang/String;", "getProperties", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Named extends AnimationDefinition {
        public static final int $stable = 0;
        private final String name;
        private final DecodableAnimationProperties properties;

        public /* synthetic */ Named(String str, DecodableAnimationProperties decodableAnimationProperties, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? new DecodableAnimationProperties(0.0f, null, 0.0f, 7, null) : decodableAnimationProperties);
        }

        public final String getName() {
            return this.name;
        }

        public final DecodableAnimationProperties getProperties() {
            return this.properties;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Named(String str, DecodableAnimationProperties decodableAnimationProperties) {
            super(null);
            str.getClass();
            decodableAnimationProperties.getClass();
            this.name = str;
            this.properties = decodableAnimationProperties;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition$Property;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "node", "", "animation", "Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;", "properties", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;", "(Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;)V", "getAnimation", "()Lcom/dyson/nst/dyson3d/schema/model/PropertyAnimation;", "getNode", "()Ljava/lang/String;", "getProperties", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Property extends AnimationDefinition {
        public static final int $stable = 0;
        private final PropertyAnimation animation;
        private final String node;
        private final DecodableAnimationProperties properties;

        public /* synthetic */ Property(String str, PropertyAnimation propertyAnimation, DecodableAnimationProperties decodableAnimationProperties, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, propertyAnimation, (i13 & 4) != 0 ? new DecodableAnimationProperties(0.0f, null, 0.0f, 7, null) : decodableAnimationProperties);
        }

        public final PropertyAnimation getAnimation() {
            return this.animation;
        }

        public final String getNode() {
            return this.node;
        }

        public final DecodableAnimationProperties getProperties() {
            return this.properties;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Property(String str, PropertyAnimation propertyAnimation, DecodableAnimationProperties decodableAnimationProperties) {
            super(null);
            propertyAnimation.getClass();
            decodableAnimationProperties.getClass();
            this.node = str;
            this.animation = propertyAnimation;
            this.properties = decodableAnimationProperties;
        }
    }
}
