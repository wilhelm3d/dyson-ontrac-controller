package com.dyson.mobile.android.robot.mapping.zones.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.dyson.mobile.android.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xw0.y;
import xw0.z;
import yw0.b;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/GridLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxw0/y;", "value", "f", "Lxw0/y;", "getGridLayer", "()Lxw0/y;", "setGridLayer", "(Lxw0/y;)V", "gridLayer", "", "Lxw0/z;", "g", "Ljava/util/List;", "getVerticalGridLines", "()Ljava/util/List;", "setVerticalGridLines", "(Ljava/util/List;)V", "verticalGridLines", "h", "getHorizontalGridLines", "setHorizontalGridLines", "horizontalGridLines", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GridLayerView extends b {
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public y f16095f;

    /* renamed from: g  reason: collision with root package name */
    public List<z> f16096g;

    /* renamed from: h  reason: collision with root package name */
    public List<z> f16097h;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(c7.a.c(context, R.color.robot_map_grid_colour));
    }

    public final y getGridLayer() {
        return this.f16095f;
    }

    public final List<z> getHorizontalGridLines() {
        return this.f16097h;
    }

    public final List<z> getVerticalGridLines() {
        return this.f16096g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        canvas.concat(getCanvasMatrix());
        if (this.f16095f != null) {
            List<z> list = this.f16096g;
            Paint paint = this.e;
            if (list != null) {
                for (z zVar : list) {
                    canvas.drawLine(zVar.f88185a, zVar.f88186b, zVar.f88187c, zVar.d, paint);
                }
            }
            List<z> list2 = this.f16097h;
            if (list2 != null) {
                for (z zVar2 : list2) {
                    canvas.drawLine(zVar2.f88185a, zVar2.f88186b, zVar2.f88187c, zVar2.d, paint);
                }
            }
        }
    }

    public final void setGridLayer(y yVar) {
        this.f16095f = yVar;
        if (yVar != null) {
            invalidate();
        }
    }

    public final void setHorizontalGridLines(List<z> list) {
        this.f16097h = list;
    }

    public final void setVerticalGridLines(List<z> list) {
        this.f16096g = list;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/GridLayerView$a;", "", "<init>", "()V", "", "GRID_SIZE", "I", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GridLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ GridLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
