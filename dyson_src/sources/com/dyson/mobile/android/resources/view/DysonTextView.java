package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.dyson.mobile.android.R;
import ks0.n;
import zs0.g;
/* loaded from: classes3.dex */
public class DysonTextView extends AppCompatTextView {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f15738f = {R.attr.state_warning};
    public boolean d;
    public boolean e;

    public DysonTextView(Context context) {
        super(context);
        d(context, null);
    }

    public final void d(Context context, AttributeSet attributeSet) {
        if (isInEditMode() || attributeSet == null) {
            return;
        }
        setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50096v);
        this.e = obtainStyledAttributes.getBoolean(1, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setLineHeight(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        if (this.d) {
            View.mergeDrawableStates(onCreateDrawableState, f15738f);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        if (this.e) {
            setEllipsize(null);
            setEllipsize(TextUtils.TruncateAt.END);
            setMaxLines(((i14 - getPaddingTop()) - getPaddingBottom()) / getLineHeight());
        }
    }

    public final void setWarningState(boolean z13) {
        this.d = z13;
        refreshDrawableState();
    }

    public DysonTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    public DysonTextView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        d(context, attributeSet);
    }
}
