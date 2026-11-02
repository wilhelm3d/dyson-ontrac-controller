package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import zs0.g;
/* loaded from: classes3.dex */
class DysonTextInputEditText extends TextInputEditText {
    public DysonTextInputEditText(Context context) {
        super(context);
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
    }

    public DysonTextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public DysonTextInputEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        b(context, attributeSet);
    }
}
