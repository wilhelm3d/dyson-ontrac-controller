package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import androidx.databinding.ObservableBoolean;
import at0.f;
import com.dyson.mobile.android.R;
import h12.f0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import q8.k;
import q8.n;
import zs0.j;
/* loaded from: classes3.dex */
public class DysonSeekArc extends uy1.a {
    private static final int GRADUATION_LETTER_SPACING = 6;
    private static final int HORIZONTAL_GRADUATION_ANGLE = 270;
    private static final int INVALID_PROGRESS_VALUE = -1;
    private static final String TAG = "com.dyson.mobile.android.resources.view.DysonSeekArc";
    public final n<com.dyson.mobile.android.resources.view.a> arcMark;
    final Function1<Canvas, f0> doDrawArc;
    final Function1<Canvas, f0> doDrawGrades;
    final Function1<Canvas, f0> doDrawThumb;
    private final k.a doInvalidate;
    public final ObservableBoolean hasGraduations;
    final ArrayList<Function1<Canvas, f0>> mDrawRoutines;
    Paint mMarkNotchPaint;
    TextPaint mMarkTextPaint;
    SparseArray<CharSequence> mOptions;
    int mOverflowDirection;
    int mRadiusExtendNotchPx;
    int mRadiusExtendTextPx;
    final Resources rsrc;

    /* loaded from: classes3.dex */
    public class a extends k.a {
        public a() {
        }

        @Override // q8.k.a
        public final void e(int i13, k kVar) {
            DysonSeekArc.this.invalidate();
        }
    }

    public DysonSeekArc(Context context) {
        super(context);
        this.mOverflowDirection = 0;
        this.arcMark = new n<>();
        this.hasGraduations = new ObservableBoolean();
        this.doInvalidate = new a();
        this.rsrc = getResources();
        this.mOptions = null;
        this.mDrawRoutines = new ArrayList<>();
        this.doDrawArc = new f(this, 1);
        this.doDrawThumb = new f(this, 2);
        this.doDrawGrades = new f(this, 3);
        init(null, 0);
    }

    private int getProgressForAngle(double d) {
        Object a13 = j.a(r1.getClass(), this, "mMax");
        int intValue = ((Integer) (a13 != null ? a13 : 0)).intValue();
        int round = (int) Math.round(valuePerDegree() * d);
        if (round < 0) {
            if (this.mOverflowDirection == 0) {
                this.mOverflowDirection = -1;
            }
            return -1;
        }
        int i13 = this.mOverflowDirection;
        if (round > intValue) {
            if (i13 == 0) {
                this.mOverflowDirection = 1;
            }
            return -1;
        } else if (i13 == 1) {
            if (round < intValue) {
                return -1;
            }
            this.mOverflowDirection = 0;
            return round;
        } else {
            if (i13 == -1) {
                if (round > 0) {
                    return -1;
                }
                this.mOverflowDirection = 0;
            }
            return round;
        }
    }

    private double getTouchDegrees(float f13, float f14) {
        try {
            Class cls = Float.TYPE;
            Method declaredMethod = uy1.a.class.getDeclaredMethod("getTouchDegrees", cls, cls);
            declaredMethod.setAccessible(true);
            return ((Double) declaredMethod.invoke(this, Float.valueOf(f13), Float.valueOf(f14))).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    private boolean ignoreTouch(float f13, float f14) {
        try {
            Class cls = Float.TYPE;
            Method declaredMethod = uy1.a.class.getDeclaredMethod("ignoreTouch", cls, cls);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(this, Float.valueOf(f13), Float.valueOf(f14))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$init$0(Canvas canvas) {
        if (this.arcMark.l() != null) {
            this.arcMark.l().b(canvas);
        }
        return f0.f36844a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f0 lambda$new$1(Canvas canvas) {
        int arcRotation = getArcRotation() + (getStartAngle() - 90);
        int sweepAngle = getSweepAngle();
        Object rectF = new RectF();
        Object a13 = j.a(rectF.getClass(), this, "mArcRect");
        if (a13 != null) {
            rectF = a13;
        }
        RectF rectF2 = (RectF) rectF;
        Object paint = new Paint();
        Object a14 = j.a(paint.getClass(), this, "mArcPaint");
        if (a14 != null) {
            paint = a14;
        }
        Paint paint2 = (Paint) paint;
        Object paint3 = new Paint();
        Object a15 = j.a(paint3.getClass(), this, "mProgressPaint");
        if (a15 != null) {
            paint3 = a15;
        }
        Paint paint4 = (Paint) paint3;
        Object valueOf = Float.valueOf(0.0f);
        Object a16 = j.a(valueOf.getClass(), this, "mProgressSweep");
        if (a16 != null) {
            valueOf = a16;
        }
        float floatValue = ((Float) valueOf).floatValue();
        if (getProgress() == 0) {
            canvas.drawArc(rectF2, arcRotation, sweepAngle, false, paint2);
        } else {
            float f13 = arcRotation;
            canvas.drawArc(rectF2, f13, sweepAngle, false, paint2);
            canvas.drawArc(rectF2, f13, floatValue, false, paint4);
        }
        return f0.f36844a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f0 lambda$new$2(Canvas canvas) {
        Object obj = Boolean.FALSE;
        Object a13 = j.a(obj.getClass(), this, "mEnabled");
        if (a13 != null) {
            obj = a13;
        }
        if (((Boolean) obj).booleanValue()) {
            Object a14 = j.a(r0.getClass(), this, "mTranslateX");
            if (a14 == null) {
                a14 = r0;
            }
            float intValue = ((Integer) a14).intValue();
            Object a15 = j.a(r0.getClass(), this, "mTranslateY");
            if (a15 == null) {
                a15 = r0;
            }
            float intValue2 = ((Integer) a15).intValue();
            Object a16 = j.a(r0.getClass(), this, "mThumbXPos");
            if (a16 == null) {
                a16 = r0;
            }
            int intValue3 = ((Integer) a16).intValue();
            Object a17 = j.a(r0.getClass(), this, "mThumbYPos");
            int intValue4 = ((Integer) (a17 != null ? a17 : 0)).intValue();
            canvas.save();
            canvas.translate(intValue - intValue3, intValue2 - intValue4);
            Drawable drawable = (Drawable) j.a(Drawable.class, this, "mThumb");
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.restore();
        }
        return f0.f36844a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$new$3(Canvas canvas) {
        SparseArray<CharSequence> sparseArray;
        if (!this.hasGraduations.l() || (sparseArray = this.mOptions) == null || sparseArray.size() < 1) {
            return f0.f36844a;
        }
        for (int i13 = 0; i13 < this.mOptions.size(); i13++) {
            CharSequence valueAt = this.mOptions.valueAt(i13);
            String replaceAll = valueAt.toString().replaceAll("[^([0-9][0-9])|°]", "");
            String replaceAll2 = valueAt.toString().replaceAll("[^A-Za-z]", "");
            String replaceAll3 = valueAt.toString().replaceAll("[^%]", "");
            PointF xy2 = getXY(i13, this.mRadiusExtendTextPx);
            float measureText = xy2.x - (((((float) i13) / ((float) getMax())) * ((float) getSweepAngle())) + ((float) getStartAngle()) == 270.0f ? ((int) this.mMarkTextPaint.measureText(valueAt.toString())) / 3 : 0);
            TextPaint textPaint = this.mMarkTextPaint;
            Resources resources = this.rsrc;
            int i14 = R.dimen.dial_extension_numeric_text_size;
            textPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.dial_extension_numeric_text_size));
            canvas.drawText(replaceAll, 0, replaceAll.length(), measureText, xy2.y, (Paint) this.mMarkTextPaint);
            TextPaint textPaint2 = this.mMarkTextPaint;
            Resources resources2 = this.rsrc;
            if (i13 != 0) {
                i14 = R.dimen.dial_extension_char_text_size;
            }
            textPaint2.setTextSize(resources2.getDimensionPixelSize(i14));
            int measureText2 = (int) this.mMarkTextPaint.measureText(replaceAll);
            if (replaceAll2.equals("")) {
                canvas.drawText(replaceAll3, 0, replaceAll3.length(), measureText + measureText2 + 6.0f, xy2.y - (this.mMarkTextPaint.getTextSize() / 2.0f), (Paint) this.mMarkTextPaint);
            } else {
                canvas.drawText(replaceAll2, 0, replaceAll2.length(), measureText + measureText2 + 6.0f, xy2.y, (Paint) this.mMarkTextPaint);
            }
        }
        return f0.f36844a;
    }

    private void updateOnTouch(MotionEvent motionEvent) {
        if (ignoreTouch(motionEvent.getX(), motionEvent.getY())) {
            return;
        }
        setPressed(true);
        j.b(this, "onProgressRefresh", new Object[]{Integer.valueOf(getProgressForAngle(getTouchDegrees(motionEvent.getX(), motionEvent.getY()))), Boolean.TRUE}, new Class[]{Integer.TYPE, Boolean.TYPE});
    }

    private float valuePerDegree() {
        Object a13;
        Object a14 = j.a(r0.getClass(), this, "mMax");
        if (a14 == null) {
            a14 = r0;
        }
        return ((Integer) a14).intValue() / ((Integer) (j.a(r0.getClass(), this, "mSweepAngle") != null ? a13 : 0)).intValue();
    }

    public Point getArcCenter() {
        Object a13 = j.a(r0.getClass(), this, "mTranslateX");
        if (a13 == null) {
            a13 = r0;
        }
        int intValue = ((Integer) a13).intValue();
        Object a14 = j.a(r0.getClass(), this, "mTranslateY");
        return new Point(intValue, ((Integer) (a14 != null ? a14 : 0)).intValue());
    }

    public PointF getXY(float f13, int i13) {
        double radians = Math.toRadians(f13) - 1.5707963267948966d;
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        Object a13 = j.a(r7.getClass(), this, "mArcRadius");
        r7 = a13 != null ? a13 : 0;
        Point arcCenter = getArcCenter();
        float intValue = ((Integer) r7).intValue() + i13;
        return new PointF((((float) cos) * intValue) + arcCenter.x, (intValue * ((float) sin)) + arcCenter.y);
    }

    public void init(AttributeSet attributeSet, int i13) {
        this.mRadiusExtendNotchPx = this.rsrc.getDimensionPixelSize(R.dimen.dial_extension_notch);
        this.mRadiusExtendTextPx = this.rsrc.getDimensionPixelSize(R.dimen.dial_extension_text);
        Paint paint = new Paint();
        this.mMarkNotchPaint = paint;
        paint.setColor(getResources().getColor(R.color.bodyCopyGrey));
        this.mMarkNotchPaint.setAntiAlias(true);
        this.mMarkNotchPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mMarkNotchPaint.setStrokeWidth(getArcWidth());
        TextPaint textPaint = new TextPaint(this.mMarkNotchPaint);
        this.mMarkTextPaint = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.mMarkTextPaint.setStrokeWidth(0.0f);
        Context context = getContext();
        try {
            Method declaredMethod = uy1.a.class.getDeclaredMethod("init", Context.class, AttributeSet.class, Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, context, attributeSet, Integer.valueOf(i13));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ks0.n.f50084j, i13, 0);
            ObservableBoolean observableBoolean = this.hasGraduations;
            observableBoolean.m(obtainStyledAttributes.getBoolean(1, observableBoolean.l()));
            obtainStyledAttributes.recycle();
        }
        this.arcMark.addOnPropertyChangedCallback(this.doInvalidate);
        this.hasGraduations.addOnPropertyChangedCallback(this.doInvalidate);
        this.mDrawRoutines.addAll(Arrays.asList(this.doDrawArc, this.doDrawThumb, new f(this, 4), this.doDrawGrades));
    }

    @Override // uy1.a, android.view.View
    public void onDraw(Canvas canvas) {
        Iterator<Function1<Canvas, f0>> it = this.mDrawRoutines.iterator();
        while (it.hasNext()) {
            try {
                it.next().invoke(canvas);
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    @Override // uy1.a, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object obj = Boolean.FALSE;
        Object a13 = j.a(obj.getClass(), this, "mEnabled");
        if (a13 != null) {
            obj = a13;
        }
        if (((Boolean) obj).booleanValue()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            int action = motionEvent.getAction();
            if (action == 0) {
                j.b(this, "onStopTrackingTouch", null, null);
                updateOnTouch(motionEvent);
                return true;
            } else if (action == 1) {
                this.mOverflowDirection = 0;
                j.b(this, "onStopTrackingTouch", null, null);
                setPressed(false);
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            } else if (action == 2) {
                updateOnTouch(motionEvent);
                return true;
            } else if (action != 3) {
                return true;
            } else {
                this.mOverflowDirection = 0;
                j.b(this, "onStopTrackingTouch", null, null);
                setPressed(false);
                getParent().requestDisallowInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }

    public void setProgressSweep(float f13) {
        try {
            Field declaredField = uy1.a.class.getDeclaredField("mProgressSweep");
            declaredField.setAccessible(true);
            declaredField.set(this, Float.valueOf(f13));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.toString();
        }
    }

    public PointF getXY(int i13, int i14) {
        return getXY(getStartAngle() + ((i13 / getMax()) * getSweepAngle()) + getArcRotation(), i14);
    }

    public DysonSeekArc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOverflowDirection = 0;
        this.arcMark = new n<>();
        this.hasGraduations = new ObservableBoolean();
        this.doInvalidate = new a();
        this.rsrc = getResources();
        this.mOptions = null;
        this.mDrawRoutines = new ArrayList<>();
        this.doDrawArc = new f(this, 1);
        this.doDrawThumb = new f(this, 2);
        this.doDrawGrades = new f(this, 3);
        init(attributeSet, 0);
    }

    public DysonSeekArc(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.mOverflowDirection = 0;
        this.arcMark = new n<>();
        this.hasGraduations = new ObservableBoolean();
        this.doInvalidate = new a();
        this.rsrc = getResources();
        this.mOptions = null;
        this.mDrawRoutines = new ArrayList<>();
        this.doDrawArc = new f(this, 1);
        this.doDrawThumb = new f(this, 2);
        this.doDrawGrades = new f(this, 3);
        init(attributeSet, i13);
    }
}
