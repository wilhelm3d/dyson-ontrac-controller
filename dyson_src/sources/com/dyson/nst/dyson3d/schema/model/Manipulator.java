package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.i18n.ErrorBundle;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", "", "()V", "ArcBall", "Camera", "Node", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator$ArcBall;", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator$Camera;", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator$Node;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Manipulator {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Manipulator$ArcBall;", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", ErrorBundle.DETAIL_ENTRY, "Lcom/dyson/nst/dyson3d/schema/model/DecodableArcballManipulator;", "(Lcom/dyson/nst/dyson3d/schema/model/DecodableArcballManipulator;)V", "getDetails", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableArcballManipulator;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ArcBall extends Manipulator {
        public static final int $stable = 0;
        private final DecodableArcballManipulator details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArcBall(DecodableArcballManipulator decodableArcballManipulator) {
            super(null);
            decodableArcballManipulator.getClass();
            this.details = decodableArcballManipulator;
        }

        public final DecodableArcballManipulator getDetails() {
            return this.details;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Manipulator$Camera;", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", ErrorBundle.DETAIL_ENTRY, "Lcom/dyson/nst/dyson3d/schema/model/DecodableCameraManipulator;", "(Lcom/dyson/nst/dyson3d/schema/model/DecodableCameraManipulator;)V", "getDetails", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableCameraManipulator;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Camera extends Manipulator {
        public static final int $stable = 0;
        private final DecodableCameraManipulator details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Camera(DecodableCameraManipulator decodableCameraManipulator) {
            super(null);
            decodableCameraManipulator.getClass();
            this.details = decodableCameraManipulator;
        }

        public final DecodableCameraManipulator getDetails() {
            return this.details;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Manipulator$Node;", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", ErrorBundle.DETAIL_ENTRY, "Lcom/dyson/nst/dyson3d/schema/model/DecodableNodeManipulator;", "(Lcom/dyson/nst/dyson3d/schema/model/DecodableNodeManipulator;)V", "getDetails", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableNodeManipulator;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Node extends Manipulator {
        public static final int $stable = 0;
        private final DecodableNodeManipulator details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Node(DecodableNodeManipulator decodableNodeManipulator) {
            super(null);
            decodableNodeManipulator.getClass();
            this.details = decodableNodeManipulator;
        }

        public final DecodableNodeManipulator getDetails() {
            return this.details;
        }
    }

    public /* synthetic */ Manipulator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Manipulator() {
    }
}
