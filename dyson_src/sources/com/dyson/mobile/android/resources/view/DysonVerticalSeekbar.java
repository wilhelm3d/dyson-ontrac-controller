package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s.t;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonVerticalSeekbar;", "Ls/t;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "listener", "Lh12/f0;", "setOnSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "progress", "setCurrentProgress", "(I)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonVerticalSeekbar extends t {
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public int f15740f;

    /* renamed from: g  reason: collision with root package name */
    public SeekBar.OnSeekBarChangeListener f15741g;

    public /* synthetic */ DysonVerticalSeekbar(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    @Override // s.t, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
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
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f15741g;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(this);
                }
                this.e = motionEvent.getRawY();
                this.f15740f = getProgress();
            } else if (action == 1) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = this.f15741g;
                if (onSeekBarChangeListener2 != null) {
                    onSeekBarChangeListener2.onStopTrackingTouch(this);
                }
            } else if (action == 2) {
                setProgress(this.f15740f - ((int) ((getMax() * (motionEvent.getRawY() - this.e)) / getHeight())));
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener3 = this.f15741g;
                if (onSeekBarChangeListener3 != null) {
                    onSeekBarChangeListener3.onProgressChanged(this, getProgress(), true);
                }
            }
            return true;
        }
        return false;
    }

    public final void setCurrentProgress(int i13) {
        this.f15740f = i13;
        setProgress(i13);
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f15741g;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(this, i13, false);
        }
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f15741g = onSeekBarChangeListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonVerticalSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonVerticalSeekbar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonVerticalSeekbar(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
