package com.dyson.nst.dyson3d.schema.model;

import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Material;", "", "name", "", "opacityThreshold", "", "properties", "", "Lcom/dyson/nst/dyson3d/schema/model/MaterialProperty;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOpacityThreshold", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProperties", "()Ljava/util/List;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Material {
    public static final int $stable = 8;
    private final String name;
    private final Double opacityThreshold;
    private final List<MaterialProperty> properties;

    public Material(String str, Double d, List<MaterialProperty> list) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.opacityThreshold = d;
        this.properties = list;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getOpacityThreshold() {
        return this.opacityThreshold;
    }

    public final List<MaterialProperty> getProperties() {
        return this.properties;
    }

    public Material(String str, Double d, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, (i13 & 4) != 0 ? e0.d : list);
    }
}
