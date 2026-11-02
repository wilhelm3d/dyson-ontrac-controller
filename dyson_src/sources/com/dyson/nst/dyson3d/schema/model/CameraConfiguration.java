package com.dyson.nst.dyson3d.schema.model;

import b0.y1;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/CameraConfiguration;", "", "defaultCamera", "", "cameras", "", "Lcom/dyson/nst/dyson3d/schema/model/Camera;", "(Ljava/lang/String;Ljava/util/List;)V", "getCameras", "()Ljava/util/List;", "getDefaultCamera", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraConfiguration {
    public static final int $stable = 8;
    private final List<Camera> cameras;
    private final String defaultCamera;

    public CameraConfiguration(String str, List<Camera> list) {
        str.getClass();
        list.getClass();
        this.defaultCamera = str;
        this.cameras = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CameraConfiguration copy$default(CameraConfiguration cameraConfiguration, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cameraConfiguration.defaultCamera;
        }
        if ((i13 & 2) != 0) {
            list = cameraConfiguration.cameras;
        }
        return cameraConfiguration.copy(str, list);
    }

    public final String component1() {
        return this.defaultCamera;
    }

    public final List<Camera> component2() {
        return this.cameras;
    }

    public final CameraConfiguration copy(String str, List<Camera> list) {
        str.getClass();
        list.getClass();
        return new CameraConfiguration(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CameraConfiguration) {
            CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
            return r.c(this.defaultCamera, cameraConfiguration.defaultCamera) && r.c(this.cameras, cameraConfiguration.cameras);
        }
        return false;
    }

    public final List<Camera> getCameras() {
        return this.cameras;
    }

    public final String getDefaultCamera() {
        return this.defaultCamera;
    }

    public int hashCode() {
        return this.cameras.hashCode() + (this.defaultCamera.hashCode() * 31);
    }

    public String toString() {
        return y1.k("CameraConfiguration(defaultCamera=", this.defaultCamera, ", cameras=", ")", this.cameras);
    }
}
