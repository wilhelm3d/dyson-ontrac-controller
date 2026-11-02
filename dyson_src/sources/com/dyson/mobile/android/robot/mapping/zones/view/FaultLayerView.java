package com.dyson.mobile.android.robot.mapping.zones.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xw0.h;
import xw0.w;
import yw0.b;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/FaultLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxw0/w;", "value", "e", "Lxw0/w;", "getFaultLayer", "()Lxw0/w;", "setFaultLayer", "(Lxw0/w;)V", "faultLayer", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FaultLayerView extends b {
    public w e;

    public /* synthetic */ FaultLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    public final w getFaultLayer() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        w wVar = this.e;
        if (wVar != null) {
            for (h hVar : wVar.f88180a) {
                Matrix E = o0.E(getCanvasMatrix(), hVar.f88107a);
                int save = canvas.save();
                canvas.concat(E);
                try {
                    hVar.f88109c.draw(canvas);
                    hVar.f88108b.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }
    }

    public final void setFaultLayer(w wVar) {
        this.e = wVar;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaultLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FaultLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
