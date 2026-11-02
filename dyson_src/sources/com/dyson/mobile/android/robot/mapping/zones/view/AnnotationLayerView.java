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
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.dyson.mobile.android.R;
import fm1.o0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xw0.a;
import xw0.e;
import xw0.f;
import xw0.j;
import xw0.k0;
import xw0.o;
import xw0.p0;
import xw0.q;
import xw0.s;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView$b;", "l", "Lcom/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView$b;", "getListener", "()Lcom/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView$b;", "setListener", "(Lcom/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView$b;)V", "listener", "Lxw0/a;", "value", "m", "Lxw0/a;", "getAnnotationLayer", "()Lxw0/a;", "setAnnotationLayer", "(Lxw0/a;)V", "annotationLayer", "b", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnotationLayerView extends yw0.b {
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f16079f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f16080g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f16081h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f16082i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f16083j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f16084k;

    /* renamed from: l  reason: collision with root package name */
    public b f16085l;

    /* renamed from: m  reason: collision with root package name */
    public xw0.a f16086m;

    /* renamed from: n  reason: collision with root package name */
    public final Path f16087n;

    /* renamed from: o  reason: collision with root package name */
    public final DashPathEffect f16088o;

    /* renamed from: p  reason: collision with root package name */
    public final PathEffect f16089p;

    /* renamed from: q  reason: collision with root package name */
    public final GestureDetector f16090q;

    /* loaded from: classes3.dex */
    public interface b {
        default boolean a(int i13, int i14, int i15) {
            return false;
        }

        default boolean c() {
            return false;
        }

        void d(int i13, int i14, int i15);

        default boolean e(int i13, int i14, int i15) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView$c", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            motionEvent.getClass();
            return AnnotationLayerView.this.performClick();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f16079f = paint2;
        Paint paint3 = new Paint(1);
        this.f16080g = paint3;
        Paint paint4 = new Paint(1);
        this.f16081h = paint4;
        Paint paint5 = new Paint(1);
        this.f16082i = paint5;
        Paint paint6 = new Paint(1);
        this.f16083j = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(-1);
        paint7.setTextSize(context.getResources().getDimension(R.dimen.zone_marker_text_size));
        paint7.setTextAlign(Paint.Align.CENTER);
        this.f16084k = paint7;
        this.f16087n = new Path();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(getResources().getDimension(R.dimen.threshold_line_thickness));
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setColor(c7.a.c(context, R.color.white));
        paint3.setStyle(style2);
        paint3.setColor(c7.a.c(context, R.color.robot_map_threshold_shadow));
        paint4.setStyle(style);
        paint4.setStrokeWidth(getResources().getDimension(R.dimen.restriction_line_thickness));
        paint5.setStyle(style2);
        paint6.setStyle(style2);
        float dimension = getResources().getDimension(R.dimen.dash_path_interval);
        this.f16088o = new DashPathEffect(new float[]{dimension, dimension}, 0.0f);
        this.f16089p = new PathEffect();
        this.f16090q = new GestureDetector(context, new c());
    }

    public final xw0.a getAnnotationLayer() {
        return this.f16086m;
    }

    public final b getListener() {
        return this.f16085l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        PathEffect pathEffect;
        DashPathEffect dashPathEffect;
        Path path;
        int save;
        Drawable e;
        canvas.getClass();
        super.onDraw(canvas);
        xw0.a aVar = this.f16086m;
        if (aVar != null) {
            Iterator<T> it = aVar.f88069b.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                pathEffect = this.f16089p;
                dashPathEffect = this.f16088o;
                path = this.f16087n;
                if (!hasNext) {
                    break;
                }
                q qVar = (q) it.next();
                Integer circleShadowColor = qVar.d.getCircleShadowColor();
                if (circleShadowColor != null) {
                    int c13 = c7.a.c(getContext(), circleShadowColor.intValue());
                    Paint paint = this.f16080g;
                    paint.setColor(c13);
                    for (e eVar : qVar.f88160c) {
                        eVar.a(canvas, path, paint, getCanvasMatrix());
                    }
                }
                int c14 = c7.a.c(getContext(), qVar.d.getLineColor());
                Paint paint2 = this.e;
                paint2.setColor(c14);
                if (qVar.d.getPathEffect() == q.b.DASHED) {
                    pathEffect = dashPathEffect;
                }
                paint2.setPathEffect(pathEffect);
                qVar.f88158a.a(canvas, path, paint2, getCanvasMatrix());
                p0 p0Var = qVar.e;
                if (p0Var != null && (e = c7.a.e(getContext(), p0Var.f88156a)) != null) {
                    Matrix canvasMatrix = getCanvasMatrix();
                    Rect rect = p0Var.f88157b;
                    canvasMatrix.getClass();
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    PointF w13 = o0.w(canvasMatrix, exactCenterX, exactCenterY);
                    int b13 = z12.c.b(w13.x - (exactCenterX - rect.left));
                    int b14 = z12.c.b(w13.y - (exactCenterY - rect.top));
                    e.setBounds(new Rect(b13, b14, rect.width() + b13, rect.height() + b14));
                    e.draw(canvas);
                }
                Integer circleColor = qVar.d.getCircleColor();
                if (circleColor != null) {
                    int c15 = c7.a.c(getContext(), circleColor.intValue());
                    Paint paint3 = this.f16079f;
                    paint3.setColor(c15);
                    for (e eVar2 : qVar.f88159b) {
                        eVar2.a(canvas, path, paint3, getCanvasMatrix());
                    }
                }
            }
            for (s sVar : aVar.d) {
                Matrix E = o0.E(getCanvasMatrix(), sVar.f88169a);
                save = canvas.save();
                canvas.concat(E);
                try {
                    sVar.f88170b.draw(canvas);
                    Drawable drawable = sVar.f88171c;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    } else {
                        String str = sVar.d;
                        PointF pointF = sVar.e;
                        canvas.drawText(str, pointF.x, pointF.y, this.f16084k);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            f fVar = aVar.f88072g;
            if (fVar != null) {
                Context context = getContext();
                f.a aVar2 = fVar.f88100c;
                Rect rect2 = fVar.f88099b;
                Drawable e13 = c7.a.e(context, aVar2.getDrawable());
                if (e13 != null) {
                    e13.setBounds(rect2);
                    Matrix canvasMatrix2 = getCanvasMatrix();
                    rect2.getClass();
                    Matrix E2 = o0.E(canvasMatrix2, new PointF(rect2.exactCenterX(), rect2.exactCenterY()));
                    save = canvas.save();
                    canvas.concat(E2);
                    try {
                        e13.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
            }
            for (o oVar : aVar.f88070c) {
                o.c cVar = oVar.d;
                k0 k0Var = oVar.f88152c;
                DashPathEffect dashPathEffect2 = cVar.getPathEffect() == a.EnumC2652a.DASHED ? dashPathEffect : pathEffect;
                Paint paint4 = this.f16081h;
                paint4.setPathEffect(dashPathEffect2);
                paint4.setColor(c7.a.c(getContext(), cVar.getLineColor()));
                int c16 = c7.a.c(getContext(), cVar.getFillColor());
                Paint paint5 = this.f16083j;
                paint5.setColor(c16);
                k0Var.b(canvas, path, paint5, getCanvasMatrix());
                k0Var.b(canvas, path, paint4, getCanvasMatrix());
                Integer circleColor2 = cVar.getCircleColor();
                if (circleColor2 != null) {
                    int c17 = c7.a.c(getContext(), circleColor2.intValue());
                    Paint paint6 = this.f16082i;
                    paint6.setColor(c17);
                    for (e eVar3 : oVar.f88151b) {
                        eVar3.a(canvas, path, paint6, getCanvasMatrix());
                    }
                }
            }
            j jVar = aVar.f88073h;
            if (jVar != null) {
                Path path2 = jVar.f88120a;
                path2.transform(getCanvasMatrix());
                canvas.drawPath(path2, jVar.e);
                Matrix canvasMatrix3 = getCanvasMatrix();
                PointF pointF2 = jVar.f88121b;
                PointF w14 = o0.w(canvasMatrix3, pointF2.x, pointF2.y);
                canvas.drawText(jVar.f88122c, w14.x, w14.y, jVar.d);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r0 == true) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r9.getClass()
            android.view.GestureDetector r0 = r8.f16090q
            boolean r0 = r0.onTouchEvent(r9)
            r1 = 1
            if (r0 != 0) goto L6b
            com.dyson.mobile.android.robot.mapping.zones.view.AnnotationLayerView$b r0 = r8.f16085l
            r2 = 0
            if (r0 == 0) goto L63
            int r3 = r9.getActionMasked()
            int r4 = r9.getActionIndex()
            int r5 = r9.getPointerId(r4)
            android.graphics.Matrix r6 = r8.getCanvasMatrix()
            r6.getClass()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r6.invert(r7)
            float r6 = r9.getX(r4)
            float r4 = r9.getY(r4)
            android.graphics.PointF r4 = fm1.o0.w(r7, r6, r4)
            float r6 = r4.x
            int r6 = z12.c.b(r6)
            float r4 = r4.y
            int r4 = z12.c.b(r4)
            if (r3 == 0) goto L57
            if (r3 == r1) goto L52
            r7 = 2
            if (r3 == r7) goto L4d
            r0 = r2
            goto L5b
        L4d:
            boolean r0 = r0.a(r6, r4, r5)
            goto L5b
        L52:
            boolean r0 = r0.e(r6, r4, r5)
            goto L5b
        L57:
            r0.d(r6, r4, r5)
            r0 = r1
        L5b:
            if (r0 == 0) goto L60
            r8.invalidate()
        L60:
            if (r0 != r1) goto L63
            goto L6b
        L63:
            boolean r8 = super.onTouchEvent(r9)
            if (r8 == 0) goto L6a
            goto L6b
        L6a:
            return r2
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.mapping.zones.view.AnnotationLayerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        b bVar = this.f16085l;
        return bVar != null ? bVar.c() : super.performClick();
    }

    public final void setAnnotationLayer(xw0.a aVar) {
        this.f16086m = aVar;
        if (aVar != null) {
            invalidate();
        }
    }

    public final void setListener(b bVar) {
        this.f16085l = bVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/AnnotationLayerView$a;", "", "<init>", "()V", "", "DASH_PATH_PHASE", "F", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnnotationLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnnotationLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ AnnotationLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
