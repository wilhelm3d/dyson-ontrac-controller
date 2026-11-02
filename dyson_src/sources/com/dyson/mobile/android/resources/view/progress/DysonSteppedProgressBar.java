package com.dyson.mobile.android.resources.view.progress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.dyson.mobile.android.R;
import gf1.b;
import gm1.am;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import se1.q0;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001/B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010$\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u0014\u0010.\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00060"}, d2 = {"Lcom/dyson/mobile/android/resources/view/progress/DysonSteppedProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "d", "I", "getNumberOfSteps", "()I", "setNumberOfSteps", "(I)V", "numberOfSteps", "e", "getCurrentStep", "setCurrentStep", "currentStep", "", "f", "Z", "isStepFailed", "()Z", "setStepFailed", "(Z)V", "", "g", "F", "getLineThickness", "()F", "setLineThickness", "(F)V", "lineThickness", "h", "getLineLength", "setLineLength", "lineLength", "i", "getCircleDiameter", "setCircleDiameter", "circleDiameter", "getCircleRadius", "circleRadius", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonSteppedProgressBar extends View {
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15845f;

    /* renamed from: g  reason: collision with root package name */
    public float f15846g;

    /* renamed from: h  reason: collision with root package name */
    public float f15847h;

    /* renamed from: i  reason: collision with root package name */
    public float f15848i;

    /* renamed from: j  reason: collision with root package name */
    public final int f15849j;

    /* renamed from: k  reason: collision with root package name */
    public final int f15850k;

    /* renamed from: l  reason: collision with root package name */
    public final int f15851l;

    /* renamed from: m  reason: collision with root package name */
    public final Drawable f15852m;

    /* renamed from: n  reason: collision with root package name */
    public final Drawable f15853n;

    /* renamed from: o  reason: collision with root package name */
    public long f15854o;

    /* renamed from: p  reason: collision with root package name */
    public float f15855p;

    /* renamed from: q  reason: collision with root package name */
    public final DecelerateInterpolator f15856q;

    /* renamed from: r  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f15857r;

    /* renamed from: s  reason: collision with root package name */
    public float f15858s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f15859t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f15860u;

    /* renamed from: v  reason: collision with root package name */
    public final Paint f15861v;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonSteppedProgressBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        attributeSet.getClass();
        this.d = 2;
        this.f15846g = TypedValue.applyDimension(1, 2.5f, getResources().getDisplayMetrics());
        this.f15847h = TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
        this.f15848i = TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics());
        this.f15849j = c7.a.c(context, R.color.bodyCopyGrey);
        this.f15850k = c7.a.c(context, R.color.lightPurple);
        this.f15851l = c7.a.c(context, R.color.errorStateRed);
        Drawable drawable = context.getResources().getDrawable(R.drawable.ic_checkmark_small, null);
        drawable.getClass();
        this.f15852m = drawable;
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.ic_exclamation_mark, null);
        drawable2.getClass();
        this.f15853n = drawable2;
        this.f15856q = new DecelerateInterpolator();
        this.f15857r = new AccelerateDecelerateInterpolator();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f15859t = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f15846g);
        this.f15860u = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(c7.a.c(context, R.color.white));
        paint3.setStyle(style);
        this.f15861v = paint3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50093s, i13, 0);
        obtainStyledAttributes.getClass();
        setNumberOfSteps(obtainStyledAttributes.getInt(4, this.d));
        setCurrentStep(obtainStyledAttributes.getInt(1, this.e));
        setStepFailed(obtainStyledAttributes.getBoolean(5, this.f15845f));
        setLineThickness(obtainStyledAttributes.getDimension(3, this.f15846g));
        setLineLength(obtainStyledAttributes.getDimension(2, this.f15847h));
        setCircleDiameter(obtainStyledAttributes.getDimension(0, this.f15848i));
        obtainStyledAttributes.recycle();
    }

    private final float getCircleRadius() {
        return this.f15848i / 2.0f;
    }

    public final float getCircleDiameter() {
        return this.f15848i;
    }

    public final int getCurrentStep() {
        return this.e;
    }

    public final float getLineLength() {
        return this.f15847h;
    }

    public final float getLineThickness() {
        return this.f15846g;
    }

    public final int getNumberOfSteps() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i13;
        float f13;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator;
        float f14;
        float f15;
        int i14;
        canvas.getClass();
        super.onDraw(canvas);
        float min = Math.min(((float) (System.currentTimeMillis() - this.f15854o)) / 1000.0f, 0.25f);
        this.f15854o = System.currentTimeMillis();
        float f16 = this.e;
        float f17 = this.f15858s;
        if (f16 > f17) {
            this.f15858s = Math.min((min / 0.4f) + f17, f16);
            invalidate();
        } else if (f16 < f17) {
            this.f15858s = Math.max(f17 - (min / 0.4f), f16);
            invalidate();
        }
        float f18 = this.f15848i;
        int i15 = this.d;
        float f19 = this.f15847h;
        int i16 = 1;
        float f23 = f18 + f19;
        float f24 = 2.0f;
        float width = ((((getWidth() - getPaddingLeft()) - getPaddingRight()) - (((i15 - 1) * f19) + (i15 * f18))) / 2.0f) + getPaddingLeft();
        int i17 = this.d;
        int i18 = 0;
        while (i18 < i17) {
            float f25 = i18;
            float circleRadius = getCircleRadius() + (f25 * f23) + width;
            float height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) / f24) + getPaddingTop();
            int i19 = this.d - i16;
            int i23 = this.f15849j;
            AccelerateDecelerateInterpolator accelerateDecelerateInterpolator2 = this.f15857r;
            int i24 = this.f15850k;
            if (i18 < i19) {
                float f26 = this.f15848i + this.f15847h;
                float f27 = this.f15858s - f25;
                Float valueOf = Float.valueOf(f27);
                if (f27 <= 0.0f || f27 >= 1.0f) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    f27 = accelerateDecelerateInterpolator2.getInterpolation(valueOf.floatValue());
                }
                float f28 = f27 / (this.f15847h / f26);
                int i25 = (f28 <= 0.0f || f28 >= 1.0f) ? 0 : i16;
                int i26 = f28 < 1.0f ? i23 : i24;
                Paint paint = this.f15860u;
                paint.setColor(i26);
                i13 = i24;
                f13 = f24;
                accelerateDecelerateInterpolator = accelerateDecelerateInterpolator2;
                canvas.drawLine(circleRadius, height, circleRadius + f26, height, paint);
                if (i25 != 0) {
                    paint.setColor(i13);
                    canvas2 = canvas;
                    canvas2.drawLine(circleRadius, height, (f28 * f26) + circleRadius, height, paint);
                } else {
                    canvas2 = canvas;
                }
            } else {
                canvas2 = canvas;
                i13 = i24;
                f13 = f24;
                accelerateDecelerateInterpolator = accelerateDecelerateInterpolator2;
            }
            float f29 = this.f15848i + this.f15847h;
            float f33 = (this.f15858s - f25) + 1.0f;
            if (f33 > 0.0f && f33 < 1.0f) {
                f33 = accelerateDecelerateInterpolator.getInterpolation(f33);
            }
            float m13 = am.m((f33 - (this.f15847h / f29)) / (this.f15848i / f29));
            boolean z13 = m13 > 0.0f && m13 < 1.0f;
            int i27 = this.e;
            int i28 = this.f15851l;
            if (i27 == i18 && this.f15845f && !z13) {
                i23 = i28;
            } else if (m13 >= 1.0f) {
                i23 = i13;
            }
            Paint paint2 = this.f15859t;
            paint2.setColor(i23);
            canvas2.drawCircle(circleRadius, height, getCircleRadius(), paint2);
            if (z13) {
                paint2.setColor(this.f15845f ? i28 : i13);
                f14 = circleRadius;
                i14 = i18;
                f15 = height;
                canvas2.drawArc(circleRadius - getCircleRadius(), height - getCircleRadius(), getCircleRadius() + circleRadius, getCircleRadius() + height, (m13 * 180.0f) + 180.0f, m13 * (-360.0f), false, paint2);
            } else {
                f14 = circleRadius;
                f15 = height;
                i14 = i18;
            }
            int i29 = this.e;
            Drawable drawable = (i14 == i29 && this.f15845f) ? this.f15853n : i14 < i29 ? this.f15852m : null;
            if (drawable != null) {
                b.a(drawable, (int) (f14 - (getCircleRadius() * 0.46f)), (int) (f15 - (getCircleRadius() * 0.46f)), (int) ((getCircleRadius() * 0.46f) + f14), (int) ((getCircleRadius() * 0.46f) + f15));
            }
            if (drawable != null) {
                drawable.draw(canvas2);
            }
            if (i14 == this.e && !this.f15845f) {
                this.f15855p = ((min / f13) + this.f15855p) % 1.0f;
                Paint paint3 = this.f15861v;
                paint3.setStrokeWidth(this.f15848i * 0.048f);
                float f34 = this.f15855p;
                canvas2.drawArc(f14 - (getCircleRadius() * 0.65f), f15 - (getCircleRadius() * 0.65f), (getCircleRadius() * 0.65f) + f14, (getCircleRadius() * 0.65f) + f15, (this.f15856q.getInterpolation(f34) * 360.0f) + (f34 * 360.0f), ((float) Math.sin(this.f15855p * 3.141592653589793d)) * (-180.0f), false, paint3);
                invalidate();
            }
            i18 = i14 + 1;
            f24 = f13;
            i16 = 1;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        float f13 = this.f15848i;
        int i15 = this.d;
        float f14 = f13 * i15;
        setMeasuredDimension(q0.b(getPaddingRight() + getPaddingLeft() + ((int) Math.ceil((this.f15847h * (i15 - 1)) + f14)), i13), q0.b(getPaddingBottom() + getPaddingTop() + ((int) Math.ceil(Math.max(this.f15848i, this.f15846g))), i14));
    }

    public final void setCircleDiameter(float f13) {
        this.f15848i = f13;
        requestLayout();
        invalidate();
    }

    public final void setCurrentStep(int i13) {
        this.e = i13;
        invalidate();
    }

    public final void setLineLength(float f13) {
        this.f15847h = f13;
        requestLayout();
        invalidate();
    }

    public final void setLineThickness(float f13) {
        this.f15846g = f13;
        this.f15860u.setStrokeWidth(f13);
        requestLayout();
        invalidate();
    }

    public final void setNumberOfSteps(int i13) {
        this.d = i13;
        requestLayout();
        invalidate();
    }

    public final void setStepFailed(boolean z13) {
        this.f15845f = z13;
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/resources/view/progress/DysonSteppedProgressBar$a;", "", "<init>", "()V", "", "LOADING_SPINNER_MAXIMUM_ANGLE", "I", "", "SPINNING_ANIMATION_DURATION_SECONDS", "F", "ICON_SIZE_RELATIVE_TO_CIRCLE", "SPINNER_SIZE_RELATIVE_TO_CIRCLE", "SPINNER_THICKNESS_RELATIVE_TO_CIRCLE", "STEP_CHANGE_ANIMATION_DURATION_SECONDS", "DEFAULT_NUMBER_OF_STEPS", "DEFAULT_CURRENT_STEP", "DEFAULT_LINE_THICKNESS", "DEFAULT_LINE_LENGTH", "DEFAULT_CIRCLE_DIAMETER", "MAX_SECONDS_ELAPSED_BETWEEN_FRAMES", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonSteppedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
        attributeSet.getClass();
    }

    public /* synthetic */ DysonSteppedProgressBar(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
