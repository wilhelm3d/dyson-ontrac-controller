package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import s.t;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u000eR\"\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u0011R*\u0010!\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u0011¨\u0006\""}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonVerticalSeekbar552;", "Ls/t;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "listener", "Lh12/f0;", "setOnSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "progress", "setProgress", "(I)V", "e", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setListener", "f", "I", "getThumbTint", "()I", "setThumbTint", "thumbTint", "value", "g", "getThumbColour", "setThumbColour", "thumbColour", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonVerticalSeekbar552 extends t {
    public SeekBar.OnSeekBarChangeListener e;

    /* renamed from: f  reason: collision with root package name */
    public int f15742f;

    /* renamed from: g  reason: collision with root package name */
    public int f15743g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonVerticalSeekbar552(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        int parseColor = Color.parseColor("#ffffff");
        this.f15742f = parseColor;
        this.f15743g = parseColor;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50098x, i13, 0);
            obtainStyledAttributes.getClass();
            if (obtainStyledAttributes.hasValue(0)) {
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                drawable.getClass();
                setThumb((GradientDrawable) drawable);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f15742f);
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(com.salesforce.marketingcloud.analytics.stats.b.f20726n, com.salesforce.marketingcloud.analytics.stats.b.f20726n);
                setThumb(gradientDrawable);
            }
            setThumbColour(obtainStyledAttributes.getColor(1, Color.parseColor("#FFCA77")));
            obtainStyledAttributes.recycle();
        }
    }

    public final SeekBar.OnSeekBarChangeListener getListener() {
        return this.e;
    }

    public final int getThumbColour() {
        return this.f15743g;
    }

    public final int getThumbTint() {
        return this.f15742f;
    }

    @Override // s.t, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        canvas.rotate(-90.0f);
        canvas.translate(-getHeight(), 0.0f);
        super.onDraw(canvas);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i13, int i14) {
        super.onMeasure(i14, i13);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i14, i13, i16, i15);
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (isEnabled()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.e;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(this);
                }
            } else if (action == 1) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.e;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(this);
                }
            } else if (action == 2) {
                performClick();
                setProgress(getMax() - ((int) ((motionEvent.getY() * getMax()) / getHeight())));
                super.onSizeChanged(getHeight(), getWidth(), 0, 0);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener3 = this.e;
                if (onSeekBarChangeListener3 != null) {
                    onSeekBarChangeListener3.onProgressChanged(this, getProgress(), true);
                }
            }
            return true;
        }
        return false;
    }

    public final void setListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.e = onSeekBarChangeListener;
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        onSeekBarChangeListener.getClass();
        this.e = onSeekBarChangeListener;
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i13) {
        super.setProgress(i13);
        super.onSizeChanged(getHeight(), getWidth(), 0, 0);
    }

    public final void setThumbColour(int i13) {
        this.f15743g = i13;
        getThumb().mutate();
        getThumb().setColorFilter(i13, PorterDuff.Mode.MULTIPLY);
    }

    public final void setThumbTint(int i13) {
        this.f15742f = i13;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonVerticalSeekbar552(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonVerticalSeekbar552(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonVerticalSeekbar552(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
