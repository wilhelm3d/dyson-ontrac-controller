package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Transform;", "", "position", "Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;", "rotation", "scale", "(Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;)V", "getPosition", "()Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;", "getRotation", "getScale", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Transform {
    public static final int $stable = 8;
    private final TransformComponent position;
    private final TransformComponent rotation;
    private final TransformComponent scale;

    public Transform(TransformComponent transformComponent, TransformComponent transformComponent2, TransformComponent transformComponent3) {
        this.position = transformComponent;
        this.rotation = transformComponent2;
        this.scale = transformComponent3;
    }

    public final TransformComponent getPosition() {
        return this.position;
    }

    public final TransformComponent getRotation() {
        return this.rotation;
    }

    public final TransformComponent getScale() {
        return this.scale;
    }
}
