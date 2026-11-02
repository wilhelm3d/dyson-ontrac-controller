package com.dyson.nst.dyson3d.schema.model;

import b0.y1;
import kotlin.Metadata;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/DecodableNodeManipulator;", "", "node", "", "minScale", "", "maxScale", "(Ljava/lang/String;FF)V", "getMaxScale", "()F", "getMinScale", "getNode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodableNodeManipulator {
    public static final int $stable = 0;
    private final float maxScale;
    private final float minScale;
    private final String node;

    public DecodableNodeManipulator(String str, float f13, float f14) {
        str.getClass();
        this.node = str;
        this.minScale = f13;
        this.maxScale = f14;
    }

    public static /* synthetic */ DecodableNodeManipulator copy$default(DecodableNodeManipulator decodableNodeManipulator, String str, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = decodableNodeManipulator.node;
        }
        if ((i13 & 2) != 0) {
            f13 = decodableNodeManipulator.minScale;
        }
        if ((i13 & 4) != 0) {
            f14 = decodableNodeManipulator.maxScale;
        }
        return decodableNodeManipulator.copy(str, f13, f14);
    }

    public final String component1() {
        return this.node;
    }

    public final float component2() {
        return this.minScale;
    }

    public final float component3() {
        return this.maxScale;
    }

    public final DecodableNodeManipulator copy(String str, float f13, float f14) {
        str.getClass();
        return new DecodableNodeManipulator(str, f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecodableNodeManipulator) {
            DecodableNodeManipulator decodableNodeManipulator = (DecodableNodeManipulator) obj;
            return r.c(this.node, decodableNodeManipulator.node) && Float.compare(this.minScale, decodableNodeManipulator.minScale) == 0 && Float.compare(this.maxScale, decodableNodeManipulator.maxScale) == 0;
        }
        return false;
    }

    public final float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return this.minScale;
    }

    public final String getNode() {
        return this.node;
    }

    public int hashCode() {
        return Float.hashCode(this.maxScale) + w.a(this.minScale, this.node.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.node;
        float f13 = this.minScale;
        float f14 = this.maxScale;
        StringBuilder sb2 = new StringBuilder("DecodableNodeManipulator(node=");
        sb2.append(str);
        sb2.append(", minScale=");
        sb2.append(f13);
        sb2.append(", maxScale=");
        return y1.f(f14, ")", sb2);
    }
}
