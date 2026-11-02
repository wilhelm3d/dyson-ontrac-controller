package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import s.d;
import zs0.g;
/* loaded from: classes3.dex */
public class DysonCheckbox extends d {
    public DysonCheckbox(Context context) {
        super(context);
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
    }

    @Override // android.widget.TextView
    public MovementMethod getDefaultMovementMethod() {
        return LinkMovementMethod.getInstance();
    }

    public DysonCheckbox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public DysonCheckbox(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        b(context, attributeSet);
    }
}
