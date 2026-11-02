package com.dyson.nst.dyson3d.schema.model;

import b0.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.w;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AxisLimitation;", "", "allowTravel", "", "minorDirectionTravelLimit", "", "majorDirectionTravelLimit", "(ZFF)V", "getAllowTravel", "()Z", "getMajorDirectionTravelLimit", "()F", "getMinorDirectionTravelLimit", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AxisLimitation {
    public static final int $stable = 0;
    private final boolean allowTravel;
    private final float majorDirectionTravelLimit;
    private final float minorDirectionTravelLimit;

    public /* synthetic */ AxisLimitation(boolean z13, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, (i13 & 2) != 0 ? 3.1415927f : f13, (i13 & 4) != 0 ? 3.1415927f : f14);
    }

    public static /* synthetic */ AxisLimitation copy$default(AxisLimitation axisLimitation, boolean z13, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = axisLimitation.allowTravel;
        }
        if ((i13 & 2) != 0) {
            f13 = axisLimitation.minorDirectionTravelLimit;
        }
        if ((i13 & 4) != 0) {
            f14 = axisLimitation.majorDirectionTravelLimit;
        }
        return axisLimitation.copy(z13, f13, f14);
    }

    public final boolean component1() {
        return this.allowTravel;
    }

    public final float component2() {
        return this.minorDirectionTravelLimit;
    }

    public final float component3() {
        return this.majorDirectionTravelLimit;
    }

    public final AxisLimitation copy(boolean z13, float f13, float f14) {
        return new AxisLimitation(z13, f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AxisLimitation) {
            AxisLimitation axisLimitation = (AxisLimitation) obj;
            return this.allowTravel == axisLimitation.allowTravel && Float.compare(this.minorDirectionTravelLimit, axisLimitation.minorDirectionTravelLimit) == 0 && Float.compare(this.majorDirectionTravelLimit, axisLimitation.majorDirectionTravelLimit) == 0;
        }
        return false;
    }

    public final boolean getAllowTravel() {
        return this.allowTravel;
    }

    public final float getMajorDirectionTravelLimit() {
        return this.majorDirectionTravelLimit;
    }

    public final float getMinorDirectionTravelLimit() {
        return this.minorDirectionTravelLimit;
    }

    public int hashCode() {
        return Float.hashCode(this.majorDirectionTravelLimit) + w.a(this.minorDirectionTravelLimit, Boolean.hashCode(this.allowTravel) * 31, 31);
    }

    public String toString() {
        boolean z13 = this.allowTravel;
        float f13 = this.minorDirectionTravelLimit;
        float f14 = this.majorDirectionTravelLimit;
        StringBuilder sb2 = new StringBuilder("AxisLimitation(allowTravel=");
        sb2.append(z13);
        sb2.append(", minorDirectionTravelLimit=");
        sb2.append(f13);
        sb2.append(", majorDirectionTravelLimit=");
        return y1.f(f14, ")", sb2);
    }

    public AxisLimitation(boolean z13, float f13, float f14) {
        this.allowTravel = z13;
        this.minorDirectionTravelLimit = f13;
        this.majorDirectionTravelLimit = f14;
    }
}
