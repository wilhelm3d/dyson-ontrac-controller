package com.dyson.mobile.android.resources.view.motionlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.view.motionlayout.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t6.r;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/resources/view/motionlayout/VerticalSwipeStealingMotionLayout;", "Lt6/r;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalSwipeStealingMotionLayout extends r {

    /* renamed from: f1  reason: collision with root package name */
    public final float f15840f1;

    /* renamed from: g1  reason: collision with root package name */
    public final a f15841g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSwipeStealingMotionLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.f15840f1 = context.getResources().getDimension(R.dimen.vertical_swipe_motion_layout_decision_distance);
        this.f15841g1 = new a();
    }

    @Override // t6.r, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        super.onInterceptTouchEvent(motionEvent);
        a aVar = this.f15841g1;
        aVar.getClass();
        if (motionEvent.getAction() == 0) {
            aVar.f15842a = Float.valueOf(motionEvent.getX());
            aVar.f15843b = Float.valueOf(motionEvent.getY());
            aVar.f15844c = null;
        }
        a.EnumC0545a enumC0545a = aVar.f15844c;
        if (enumC0545a == null) {
            float x13 = motionEvent.getX();
            Float f13 = aVar.f15842a;
            float floatValue = x13 - (f13 != null ? f13.floatValue() : motionEvent.getX());
            float y13 = motionEvent.getY();
            Float f14 = aVar.f15843b;
            float floatValue2 = y13 - (f14 != null ? f14.floatValue() : motionEvent.getY());
            boolean z13 = ((float) Math.hypot((double) floatValue, (double) floatValue2)) > this.f15840f1;
            boolean z14 = Math.abs(floatValue2) > Math.abs(floatValue);
            if (!z13) {
                enumC0545a = a.EnumC0545a.SHARE_EVENT_WITH_CHILD;
            } else if (z14) {
                Logger.c("Stealing touch event from child");
                enumC0545a = a.EnumC0545a.STEAL_EVENT_FROM_CHILD;
                aVar.f15844c = enumC0545a;
            } else {
                Logger.c("Giving touch event to child");
                aVar.f15844c = a.EnumC0545a.PASS_EVENT_TO_CHILD;
                enumC0545a = a.EnumC0545a.PASS_EVENT_TO_CHILD_AND_CANCEL_EVENT_FOR_THIS_VIEW;
            }
            if (motionEvent.getAction() == 1) {
                aVar.f15842a = null;
                aVar.f15843b = null;
                aVar.f15844c = null;
            }
        }
        if (enumC0545a == a.EnumC0545a.SHARE_EVENT_WITH_CHILD) {
            onTouchEvent(motionEvent);
        }
        if (enumC0545a == a.EnumC0545a.PASS_EVENT_TO_CHILD_AND_CANCEL_EVENT_FOR_THIS_VIEW) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(1);
            onTouchEvent(obtain);
            obtain.recycle();
        }
        return enumC0545a == a.EnumC0545a.STEAL_EVENT_FROM_CHILD;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z13) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSwipeStealingMotionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalSwipeStealingMotionLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ VerticalSwipeStealingMotionLayout(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
