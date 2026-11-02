package com.dyson.nst.dyson3d.schema.parsing;

import com.dyson.nst.dyson3d.schema.model.TransformComponent;
import kotlin.Metadata;
import ma.e;
import oy1.i0;
import oy1.p;
import tq1.a;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/TransformComponentTypeAdaptor;", "", "()V", "fromJson", "Lcom/dyson/nst/dyson3d/schema/model/TransformComponent$Type;", "string", "", "toJson", "vector", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformComponentTypeAdaptor {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransformComponent.Type.values().length];
            try {
                iArr[TransformComponent.Type.ABSOLUTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransformComponent.Type.RELATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @p
    public final TransformComponent.Type fromJson(String str) {
        str.getClass();
        if (str.equals("absolute")) {
            return TransformComponent.Type.ABSOLUTE;
        }
        if (str.equals("relative")) {
            return TransformComponent.Type.RELATIVE;
        }
        a.k();
        return null;
    }

    @i0
    public final String toJson(TransformComponent.Type type) {
        type.getClass();
        int i13 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return "relative";
            }
            e.o();
            return null;
        }
        return "absolute";
    }
}
