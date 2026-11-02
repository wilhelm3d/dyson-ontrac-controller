package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Camera;", "", "node", "", "transform", "Lcom/dyson/nst/dyson3d/schema/model/Transform;", "(Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/Transform;)V", "getNode", "()Ljava/lang/String;", "setNode", "(Ljava/lang/String;)V", "getTransform", "()Lcom/dyson/nst/dyson3d/schema/model/Transform;", "setTransform", "(Lcom/dyson/nst/dyson3d/schema/model/Transform;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Camera {
    public static final int $stable = 8;
    private String node;
    private Transform transform;

    public Camera(String str, Transform transform) {
        str.getClass();
        this.node = str;
        this.transform = transform;
    }

    public static /* synthetic */ Camera copy$default(Camera camera, String str, Transform transform, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = camera.node;
        }
        if ((i13 & 2) != 0) {
            transform = camera.transform;
        }
        return camera.copy(str, transform);
    }

    public final String component1() {
        return this.node;
    }

    public final Transform component2() {
        return this.transform;
    }

    public final Camera copy(String str, Transform transform) {
        str.getClass();
        return new Camera(str, transform);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Camera) {
            Camera camera = (Camera) obj;
            return r.c(this.node, camera.node) && r.c(this.transform, camera.transform);
        }
        return false;
    }

    public final String getNode() {
        return this.node;
    }

    public final Transform getTransform() {
        return this.transform;
    }

    public int hashCode() {
        int hashCode = this.node.hashCode() * 31;
        Transform transform = this.transform;
        return hashCode + (transform == null ? 0 : transform.hashCode());
    }

    public final void setNode(String str) {
        str.getClass();
        this.node = str;
    }

    public final void setTransform(Transform transform) {
        this.transform = transform;
    }

    public String toString() {
        String str = this.node;
        Transform transform = this.transform;
        return "Camera(node=" + str + ", transform=" + transform + ")";
    }
}
