package com.dyson.mobile.android.robot.mapping.zones.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow0.i;
import xw0.f0;
import xw0.g0;
import xw0.h0;
import xw0.n;
import yw0.b;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/PathLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxw0/g0;", "f", "Lxw0/g0;", "getListener", "()Lxw0/g0;", "setListener", "(Lxw0/g0;)V", "listener", "Lxw0/h0;", "value", "g", "Lxw0/h0;", "getPathLayer", "()Lxw0/h0;", "setPathLayer", "(Lxw0/h0;)V", "pathLayer", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PathLayerView extends b {
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public g0 f16101f;

    /* renamed from: g  reason: collision with root package name */
    public h0 f16102g;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.e = new Paint(1);
    }

    public final g0 getListener() {
        return this.f16101f;
    }

    public final h0 getPathLayer() {
        return this.f16102g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        h0 h0Var = this.f16102g;
        if (h0Var != null) {
            canvas.save();
            canvas.concat(getCanvasMatrix());
            i iVar = h0Var.f88110a;
            if (iVar.b()) {
                canvas.translate(iVar.f61692a, iVar.f61693b);
            }
            if (iVar.a()) {
                canvas.rotate(iVar.f61694c, 0.0f, iVar.d);
            }
            for (n nVar : h0Var.f88111b) {
                Paint.Style style = nVar.f88144c;
                Paint paint = this.e;
                paint.setStyle(style);
                paint.setColor(c7.a.c(getContext(), nVar.f88143b));
                if (nVar instanceof n.b) {
                    n.b bVar = (n.b) nVar;
                    paint.setPathEffect(bVar.e);
                    paint.setStrokeWidth(getContext().getResources().getDimension(bVar.d));
                } else {
                    paint.setPathEffect(new PathEffect());
                    paint.setStrokeWidth(0.0f);
                }
                canvas.drawPath(nVar.f88142a, paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        g0 g0Var = this.f16101f;
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
        this.f16101f = g0Var;
    }

    public final void setPathLayer(h0 h0Var) {
        this.f16102g = h0Var;
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/PathLayerView$a;", "", "<init>", "()V", "", "NO_STROKE", "F", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PathLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PathLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PathLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
