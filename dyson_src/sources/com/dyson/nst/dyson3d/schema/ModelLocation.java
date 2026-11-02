package com.dyson.nst.dyson3d.schema;

import com.salesforce.marketingcloud.config.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/ModelLocation;", "", a.f20857j, "", "inAppBundle", "", "(Ljava/lang/String;Z)V", "getInAppBundle", "()Z", "getPath", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModelLocation {
    public static final int $stable = 0;
    private final boolean inAppBundle;
    private final String path;

    public /* synthetic */ ModelLocation(String str, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z13);
    }

    public static /* synthetic */ ModelLocation copy$default(ModelLocation modelLocation, String str, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = modelLocation.path;
        }
        if ((i13 & 2) != 0) {
            z13 = modelLocation.inAppBundle;
        }
        return modelLocation.copy(str, z13);
    }

    public final String component1() {
        return this.path;
    }

    public final boolean component2() {
        return this.inAppBundle;
    }

    public final ModelLocation copy(String str, boolean z13) {
        str.getClass();
        return new ModelLocation(str, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModelLocation) {
            ModelLocation modelLocation = (ModelLocation) obj;
            return r.c(this.path, modelLocation.path) && this.inAppBundle == modelLocation.inAppBundle;
        }
        return false;
    }

    public final boolean getInAppBundle() {
        return this.inAppBundle;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return Boolean.hashCode(this.inAppBundle) + (this.path.hashCode() * 31);
    }

    public String toString() {
        return o1.a.e("ModelLocation(path=", this.path, ", inAppBundle=", this.inAppBundle, ")");
    }

    public ModelLocation(String str, boolean z13) {
        str.getClass();
        this.path = str;
        this.inAppBundle = z13;
    }

    public ModelLocation() {
        this(null, false, 3, null);
    }
}
