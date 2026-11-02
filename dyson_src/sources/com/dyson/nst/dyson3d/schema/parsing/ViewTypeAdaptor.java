package com.dyson.nst.dyson3d.schema.parsing;

import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.dyson.nst.dyson3d.schema.model.View;
import kotlin.Metadata;
import ma.e;
import oy1.i0;
import oy1.p;
import tq1.a;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/ViewTypeAdaptor;", "", "()V", "fromJson", "Lcom/dyson/nst/dyson3d/schema/model/View$Type;", "string", "", "toJson", "vector", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewTypeAdaptor {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[View.Type.values().length];
            try {
                iArr[View.Type.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[View.Type.ADJUSTMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[View.Type.DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @p
    public final View.Type fromJson(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1335224239) {
            if (hashCode != 1312628413) {
                if (hashCode == 1977085293 && str.equals("adjustment")) {
                    return View.Type.ADJUSTMENT;
                }
            } else if (str.equals(CaptionConstants.PREF_STANDARD)) {
                return View.Type.STANDARD;
            }
        } else if (str.equals("detail")) {
            return View.Type.DETAIL;
        }
        a.k();
        return null;
    }

    @i0
    public final String toJson(View.Type type) {
        type.getClass();
        int i13 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    return "detail";
                }
                e.o();
                return null;
            }
            return "adjustment";
        }
        return CaptionConstants.PREF_STANDARD;
    }
}
