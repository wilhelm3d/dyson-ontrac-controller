package com.dyson.mobile.android.resources.view.lists;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import at0.c;
import ks0.n;
/* loaded from: classes3.dex */
public class DividerRecyclerView extends RecyclerView {
    public DividerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.d);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
                int dimensionPixelSize2 = obtainStyledAttributes.hasValue(3) ? obtainStyledAttributes.getDimensionPixelSize(3, 0) : dimensionPixelSize;
                if (obtainStyledAttributes.hasValue(2)) {
                    dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                }
                addItemDecoration(new c(drawable, dimensionPixelSize2, dimensionPixelSize));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public DividerRecyclerView(Context context) {
        super(context);
    }

    public DividerRecyclerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        b(context, attributeSet);
    }
}
