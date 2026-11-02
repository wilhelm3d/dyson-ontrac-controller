package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.util.AttributeSet;
import s.q;
import zs0.g;
/* loaded from: classes3.dex */
public class DysonRadioButton extends q {
    public DysonRadioButton(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
    }

    public DysonRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public DysonRadioButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context, attributeSet);
    }
}
