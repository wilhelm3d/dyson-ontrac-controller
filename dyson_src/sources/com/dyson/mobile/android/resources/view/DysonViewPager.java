package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.brightcove.player.Constants;
import ks0.n;
/* loaded from: classes3.dex */
public class DysonViewPager extends ViewPager {

    /* renamed from: e1  reason: collision with root package name */
    public boolean f15744e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f15745f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f15746g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f15747h1;

    public DysonViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15744e1 = false;
        this.f15745f1 = true;
        this.f15746g1 = 0;
        this.f15747h1 = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50099y);
            this.f15744e1 = obtainStyledAttributes.getBoolean(0, false);
            this.f15747h1 = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f15744e1) {
            return;
        }
        this.f15745f1 = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f15747h1 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onMeasure(int i13, int i14) {
        if (getLayoutParams().height == -2) {
            if (this.f15745f1) {
                int i15 = 0;
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    childAt.measure(i13, View.MeasureSpec.makeMeasureSpec(0, 0));
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > i15) {
                        i15 = measuredHeight;
                    }
                }
                this.f15746g1 = i15;
            }
            i14 = View.MeasureSpec.makeMeasureSpec(this.f15746g1, Constants.ENCODING_PCM_32BIT);
        }
        super.onMeasure(i13, i14);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f15747h1 && super.onTouchEvent(motionEvent);
    }

    public void setCanResize(boolean z13) {
        this.f15745f1 = z13;
        this.f15744e1 = z13;
    }

    public void setIsSwipeEnabled(boolean z13) {
        this.f15747h1 = z13;
    }

    public DysonViewPager(Context context) {
        super(context);
        this.f15744e1 = false;
        this.f15745f1 = true;
        this.f15746g1 = 0;
        this.f15747h1 = true;
    }
}
