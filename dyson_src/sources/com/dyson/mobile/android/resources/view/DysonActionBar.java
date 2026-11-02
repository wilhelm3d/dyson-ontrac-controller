package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.dyson.mobile.android.R;
import ks0.n;
/* loaded from: classes3.dex */
public class DysonActionBar extends Toolbar {

    /* renamed from: a0  reason: collision with root package name */
    public DysonTextView f15696a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f15697b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f15698c0;

    public DysonActionBar(Context context) {
        super(context);
        w(context, null);
    }

    private DysonTextView getTitleTextView() {
        if (this.f15696a0 == null) {
            DysonTextView dysonTextView = new DysonTextView(getContext(), null, 2132083227);
            this.f15696a0 = dysonTextView;
            dysonTextView.setId(R.id.title);
            int i13 = this.f15698c0;
            if (i13 != -1) {
                this.f15696a0.setTextColor(i13);
            }
            Toolbar.g gVar = new Toolbar.g(-2, -2);
            gVar.f1772a = 17;
            this.f15696a0.setLayoutParams(gVar);
            addView(this.f15696a0);
        }
        return this.f15696a0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public CharSequence getTitle() {
        return getTitleTextView().getText().toString();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        getTitleTextView().setText(charSequence);
    }

    public void setTypeface(Typeface typeface) {
        getTitleTextView().setTypeface(typeface);
    }

    public void setUpIndicator(Integer num) {
        this.f15697b0 = num.intValue();
    }

    public final void w(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f15697b0 = 0;
            this.f15698c0 = -1;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.e);
        this.f15697b0 = obtainStyledAttributes.getResourceId(1, 0);
        this.f15698c0 = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
    }

    public final void x(l.b bVar) {
        bVar.setSupportActionBar(this);
        ActionBar supportActionBar = bVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p();
            if (this.f15697b0 != 0) {
                supportActionBar.n(true);
                supportActionBar.o(true);
                supportActionBar.r(this.f15697b0);
            }
        }
    }

    public DysonActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w(context, attributeSet);
    }

    public DysonActionBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        w(context, attributeSet);
    }
}
