package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SearchView;
import ks0.n;
import zs0.g;
/* loaded from: classes3.dex */
public class DysonSearchView extends SearchView {
    public DysonSearchView(Context context) {
        super(context);
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        EditText editText = (EditText) findViewById(getResources().getIdentifier("android:id/search_src_text", null, null));
        if (editText != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f50091q, 0, 0);
            if (obtainStyledAttributes != null) {
                try {
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                    if (dimensionPixelSize > 0) {
                        editText.setTextSize(0, dimensionPixelSize);
                    }
                    editText.setTextColor(obtainStyledAttributes.getColor(1, -16777216));
                    editText.setHintTextColor(obtainStyledAttributes.getColor(2, -12303292));
                    obtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    obtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            if (!isInEditMode()) {
                editText.setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
            }
        }
        ImageView imageView = (ImageView) findViewById(getResources().getIdentifier("android:id/search_mag_icon", null, null));
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.setMarginStart(0);
            imageView.setLayoutParams(marginLayoutParams);
        }
        ImageView imageView2 = (ImageView) findViewById(getResources().getIdentifier("android:id/search_close_btn", null, null));
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            marginLayoutParams2.setMarginEnd(0);
            imageView2.setLayoutParams(marginLayoutParams2);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(getResources().getIdentifier("android:id/search_edit_frame", null, null));
        if (linearLayout != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            marginLayoutParams3.setMarginStart(0);
            marginLayoutParams3.setMarginEnd(0);
            linearLayout.setLayoutParams(marginLayoutParams3);
        }
    }

    public DysonSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public DysonSearchView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context, attributeSet);
    }
}
