package com.dyson.nst.dyson3d.schema.model;

import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/MaterialPropertyType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BASE_COLOR", "NORMAL", "METALLIC", "ROUGHNESS", "AMBIENT_OCCLUSION", "ANISOTROPY_ANGLE", "ANISOTROPY_LEVEL", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaterialPropertyType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MaterialPropertyType[] $VALUES;
    private final String value;
    public static final MaterialPropertyType BASE_COLOR = new MaterialPropertyType("BASE_COLOR", 0, "baseColorMap");
    public static final MaterialPropertyType NORMAL = new MaterialPropertyType("NORMAL", 1, "normalMap");
    public static final MaterialPropertyType METALLIC = new MaterialPropertyType("METALLIC", 2, "metallicMap");
    public static final MaterialPropertyType ROUGHNESS = new MaterialPropertyType("ROUGHNESS", 3, "roughnessMap");
    public static final MaterialPropertyType AMBIENT_OCCLUSION = new MaterialPropertyType("AMBIENT_OCCLUSION", 4, "ambientOcclusionMap");
    public static final MaterialPropertyType ANISOTROPY_ANGLE = new MaterialPropertyType("ANISOTROPY_ANGLE", 5, "anisotropyAngle");
    public static final MaterialPropertyType ANISOTROPY_LEVEL = new MaterialPropertyType("ANISOTROPY_LEVEL", 6, "anisotropyLevel");

    private static final /* synthetic */ MaterialPropertyType[] $values() {
        return new MaterialPropertyType[]{BASE_COLOR, NORMAL, METALLIC, ROUGHNESS, AMBIENT_OCCLUSION, ANISOTROPY_ANGLE, ANISOTROPY_LEVEL};
    }

    static {
        MaterialPropertyType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private MaterialPropertyType(String str, int i13, String str2) {
        this.value = str2;
    }

    public static a<MaterialPropertyType> getEntries() {
        return $ENTRIES;
    }

    public static MaterialPropertyType valueOf(String str) {
        return (MaterialPropertyType) Enum.valueOf(MaterialPropertyType.class, str);
    }

    public static MaterialPropertyType[] values() {
        return (MaterialPropertyType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
