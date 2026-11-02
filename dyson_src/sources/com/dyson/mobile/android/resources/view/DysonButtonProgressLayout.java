package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonButtonProgressLayout;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonButtonProgressLayout extends RelativeLayout {
    public final LottieAnimationView d;
    public Button e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15703f;

    /* renamed from: g  reason: collision with root package name */
    public int f15704g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonButtonProgressLayout(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        context.getClass();
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.d = lottieAnimationView;
        this.f15704g = -1;
        lottieAnimationView.setRepeatCount(-1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f50081g, 0, 0);
        if (obtainStyledAttributes != null) {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                lottieAnimationView.setAnimation(string);
            }
            this.f15703f = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(boolean z13) {
        LottieAnimationView lottieAnimationView = this.d;
        if (z13) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.f();
            Button button = this.e;
            if (button != null) {
                button.setTextColor(0);
                button.setClickable(false);
                return;
            }
            return;
        }
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.c();
        Button button2 = this.e;
        if (button2 != null) {
            button2.setTextColor(this.f15704g);
            button2.setClickable(true);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        View view = this.d;
        view.setClickable(false);
        view.setFocusable(false);
        addView(view, layoutParams);
        a(this.f15703f);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        view.getClass();
        super.onViewAdded(view);
        if (view instanceof Button) {
            Button button = (Button) view;
            this.e = button;
            this.f15704g = button.getCurrentTextColor();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonButtonProgressLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonButtonProgressLayout(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonButtonProgressLayout(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ DysonButtonProgressLayout(Context context, AttributeSet attributeSet, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
    }
}
