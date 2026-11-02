package com.dyson.mobile.android.robot.mapping.zones.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.dyson.mobile.android.R;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xw0.b0;
import xw0.e;
import xw0.p0;
import xw0.q;
import xw0.q0;
import yw0.b;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/ThresholdLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxw0/q0;", "value", "h", "Lxw0/q0;", "getThresholdLayer", "()Lxw0/q0;", "setThresholdLayer", "(Lxw0/q0;)V", "thresholdLayer", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThresholdLayerView extends b {
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f16103f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f16104g;

    /* renamed from: h  reason: collision with root package name */
    public q0 f16105h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f16106i;

    /* renamed from: j  reason: collision with root package name */
    public final PathEffect f16107j;

    /* renamed from: k  reason: collision with root package name */
    public final DashPathEffect f16108k;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThresholdLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimension(R.dimen.threshold_line_thickness));
        this.e = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(c7.a.c(context, R.color.white));
        this.f16103f = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(c7.a.c(context, R.color.robot_map_threshold_shadow));
        this.f16104g = paint3;
        this.f16106i = new Path();
        this.f16107j = new PathEffect();
        float dimension = getResources().getDimension(R.dimen.dash_path_interval);
        this.f16108k = new DashPathEffect(new float[]{dimension, dimension}, 0.0f);
    }

    public final q0 getThresholdLayer() {
        return this.f16105h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        q0 q0Var = this.f16105h;
        if (q0Var != null) {
            for (q qVar : q0Var.f88166a) {
                int c13 = c7.a.c(getContext(), qVar.d.getLineColor());
                Paint paint = this.e;
                paint.setColor(c13);
                paint.setPathEffect(qVar.d.getPathEffect() == q.b.DASHED ? this.f16108k : this.f16107j);
                b0 b0Var = qVar.f88158a;
                Matrix canvasMatrix = getCanvasMatrix();
                Path path = this.f16106i;
                b0Var.a(canvas, path, paint, canvasMatrix);
                Integer circleColor = qVar.d.getCircleColor();
                if (circleColor != null) {
                    int c14 = c7.a.c(getContext(), circleColor.intValue());
                    Paint paint2 = this.f16103f;
                    paint2.setColor(c14);
                    for (e eVar : qVar.f88159b) {
                        eVar.a(canvas, path, paint2, getCanvasMatrix());
                    }
                }
                Integer circleShadowColor = qVar.d.getCircleShadowColor();
                if (circleShadowColor != null) {
                    int c15 = c7.a.c(getContext(), circleShadowColor.intValue());
                    Paint paint3 = this.f16104g;
                    paint3.setColor(c15);
                    for (e eVar2 : qVar.f88160c) {
                        eVar2.a(canvas, path, paint3, getCanvasMatrix());
                    }
                }
                p0 p0Var = qVar.e;
                if (p0Var != null) {
                    Matrix canvasMatrix2 = getCanvasMatrix();
                    Rect rect = p0Var.f88157b;
                    Matrix E = o0.E(canvasMatrix2, new PointF(rect.exactCenterX(), rect.exactCenterY()));
                    int save = canvas.save();
                    canvas.concat(E);
                    try {
                        Drawable e = c7.a.e(getContext(), p0Var.f88156a);
                        if (e != null) {
                            e.draw(canvas);
                        }
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
            }
        }
    }

    public final void setThresholdLayer(q0 q0Var) {
        this.f16105h = q0Var;
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/ThresholdLayerView$a;", "", "<init>", "()V", "", "DASH_PATH_PHASE", "F", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThresholdLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThresholdLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ThresholdLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
