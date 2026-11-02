package com.dyson.nst.dyson3d.schema.parsing;

import com.dyson.nst.dyson3d.schema.model.MaterialPropertyType;
import com.salesforce.marketingcloud.messages.inbox.b;
import kotlin.Metadata;
import ma.e;
import oy1.i0;
import oy1.p;
import tq1.a;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/MaterialPropertyTypeAdaptor;", "", "()V", "fromJson", "Lcom/dyson/nst/dyson3d/schema/model/MaterialPropertyType;", "string", "", "toJson", b.f21448j, "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaterialPropertyTypeAdaptor {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MaterialPropertyType.values().length];
            try {
                iArr[MaterialPropertyType.BASE_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MaterialPropertyType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MaterialPropertyType.METALLIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MaterialPropertyType.ROUGHNESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MaterialPropertyType.AMBIENT_OCCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MaterialPropertyType.ANISOTROPY_ANGLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MaterialPropertyType.ANISOTROPY_LEVEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @p
    public final MaterialPropertyType fromJson(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1842425070:
                if (str.equals("baseColor")) {
                    return MaterialPropertyType.BASE_COLOR;
                }
                break;
            case -1434232655:
                if (str.equals("anisotropyAngle")) {
                    return MaterialPropertyType.ANISOTROPY_ANGLE;
                }
                break;
            case -1424327838:
                if (str.equals("anisotropyLevel")) {
                    return MaterialPropertyType.ANISOTROPY_LEVEL;
                }
                break;
            case -1039745817:
                if (str.equals("normal")) {
                    return MaterialPropertyType.NORMAL;
                }
                break;
            case -618267179:
                if (str.equals("ambientOcclusion")) {
                    return MaterialPropertyType.AMBIENT_OCCLUSION;
                }
                break;
            case -449755617:
                if (str.equals("metallic")) {
                    return MaterialPropertyType.METALLIC;
                }
                break;
            case -200984944:
                if (str.equals("roughness")) {
                    return MaterialPropertyType.ROUGHNESS;
                }
                break;
        }
        a.k();
        return null;
    }

    @i0
    public final String toJson(MaterialPropertyType materialPropertyType) {
        materialPropertyType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[materialPropertyType.ordinal()]) {
            case 1:
                return "baseColor";
            case 2:
                return "normal";
            case 3:
                return "metallic";
            case 4:
                return "roughness";
            case 5:
                return "ambientOcclusion";
            case 6:
                return "anisotropyLevel";
            case 7:
                return "anisotropyAngle";
            default:
                e.o();
                return null;
        }
    }
}
