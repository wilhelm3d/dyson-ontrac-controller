package com.dyson.mobile.android.robot.mapping.zones.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import c7.a;
import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow0.i;
import xw0.e0;
import xw0.f0;
import xw0.g0;
import xw0.l;
import yw0.b;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/MapLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxw0/g0;", "g", "Lxw0/g0;", "getListener", "()Lxw0/g0;", "setListener", "(Lxw0/g0;)V", "listener", "Lxw0/e0;", "value", "h", "Lxw0/e0;", "getMapLayer", "()Lxw0/e0;", "setMapLayer", "(Lxw0/e0;)V", "mapLayer", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapLayerView extends b {
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f16098f;

    /* renamed from: g  reason: collision with root package name */
    public g0 f16099g;

    /* renamed from: h  reason: collision with root package name */
    public e0 f16100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(context.getResources().getDimension(R.dimen.map_border_thickness));
        this.f16098f = paint2;
    }

    public final void b(Canvas canvas, l lVar) {
        Path path = lVar.f88133b;
        Context context = getContext();
        l.a aVar = lVar.f88132a;
        int c13 = a.c(context, aVar.getColor(lVar.f88134c));
        int c14 = a.c(getContext(), aVar.getColor(lVar.d));
        Paint paint = this.e;
        paint.setColor(c13);
        Paint paint2 = this.f16098f;
        paint2.setColor(c14);
        path.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paint2);
    }

    public final g0 getListener() {
        return this.f16099g;
    }

    public final e0 getMapLayer() {
        return this.f16100h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        e0 e0Var = this.f16100h;
        if (e0Var != null) {
            canvas.save();
            canvas.concat(getCanvasMatrix());
            i iVar = e0Var.f88096b;
            if (iVar.b()) {
                canvas.translate(iVar.f61692a, iVar.f61693b);
            }
            if (iVar.a()) {
                canvas.rotate(iVar.f61694c, 0.0f, iVar.d);
            }
            b(canvas, e0Var.f88095a);
            l lVar = e0Var.f88097c;
            if (lVar != null) {
                b(canvas, lVar);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        g0 g0Var = this.f16099g;
        if (g0Var != null) {
            i17 = i13;
            i18 = i14;
            g0Var.b(new f0(i17, i18, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()));
        } else {
            i17 = i13;
            i18 = i14;
        }
        super.onSizeChanged(i17, i18, i15, i16);
    }

    public final void setListener(g0 g0Var) {
        this.f16099g = g0Var;
    }

    public final void setMapLayer(e0 e0Var) {
        this.f16100h = e0Var;
        if (e0Var != null) {
            invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ MapLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
