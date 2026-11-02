package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/MaterialProperty;", "", "property", "Lcom/dyson/nst/dyson3d/schema/model/MaterialPropertyType;", "texture", "", "(Lcom/dyson/nst/dyson3d/schema/model/MaterialPropertyType;Ljava/lang/String;)V", "getProperty", "()Lcom/dyson/nst/dyson3d/schema/model/MaterialPropertyType;", "getTexture", "()Ljava/lang/String;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaterialProperty {
    public static final int $stable = 0;
    private final MaterialPropertyType property;
    private final String texture;

    public MaterialProperty(MaterialPropertyType materialPropertyType, String str) {
        materialPropertyType.getClass();
        str.getClass();
        this.property = materialPropertyType;
        this.texture = str;
    }

    public final MaterialPropertyType getProperty() {
        return this.property;
    }

    public final String getTexture() {
        return this.texture;
    }
}
