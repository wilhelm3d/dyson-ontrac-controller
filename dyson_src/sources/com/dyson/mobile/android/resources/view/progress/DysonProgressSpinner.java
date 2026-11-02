package com.dyson.mobile.android.resources.view.progress;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import d7.g;
import ks0.n;
/* loaded from: classes3.dex */
public class DysonProgressSpinner extends ConstraintLayout {
    public LottieAnimationView d;

    public DysonProgressSpinner(Context context) {
        super(context);
        init(context, null);
    }

    public final void init(Context context, AttributeSet attributeSet) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.progress_spinner, (ViewGroup) this, true);
        this.d = (LottieAnimationView) findViewById(R.id.spinner);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50089o);
            String string = obtainStyledAttributes.getString(2);
            int color = obtainStyledAttributes.getColor(3, -1);
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = g.f23012a;
            int color2 = obtainStyledAttributes.getColor(1, resources.getColor(R.color.black80Percent, null));
            String string2 = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
            setSpinnerText(string);
            setSpinnerTextColor(color);
            setSpinnerBackgroundColor(color2);
            if (string2 != null) {
                setSpinnerAnimation(string2);
            }
        }
    }

    public void setSpinnerAnimation(String str) {
        this.d.setAnimation(str);
        this.d.f();
    }

    public void setSpinnerBackgroundColor(int i13) {
        findViewById(R.id.spinner_container).setBackgroundColor(i13);
    }

    public void setSpinnerText(String str) {
        DysonTextView dysonTextView = (DysonTextView) findViewById(R.id.text);
        dysonTextView.setText(str);
        dysonTextView.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setSpinnerTextColor(int i13) {
        ((DysonTextView) findViewById(R.id.text)).setTextColor(i13);
    }

    @Override // android.view.View
    public void setVisibility(int i13) {
        super.setVisibility(i13);
        LottieAnimationView lottieAnimationView = this.d;
        if (lottieAnimationView != null) {
            if (i13 != 0) {
                lottieAnimationView.c();
            } else {
                lottieAnimationView.f();
            }
        }
    }

    public DysonProgressSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public DysonProgressSpinner(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        init(context, attributeSet);
    }
}
