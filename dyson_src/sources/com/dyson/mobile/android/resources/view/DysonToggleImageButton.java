package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import ks0.n;
/* loaded from: classes3.dex */
public class DysonToggleImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: g  reason: collision with root package name */
    public a f15739g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(DysonToggleImageButton dysonToggleImageButton, boolean z13);
    }

    public DysonToggleImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChecked(attributeSet);
    }

    private void setChecked(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.f50097w);
        setChecked(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    public a getOnCheckedChangeListener() {
        return this.f15739g;
    }

    @Override // android.view.View
    public final boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f15739g = aVar;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isSelected());
    }

    public DysonToggleImageButton(Context context) {
        super(context);
    }

    public DysonToggleImageButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setChecked(attributeSet);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z13) {
        setSelected(z13);
        a aVar = this.f15739g;
        if (aVar != null) {
            aVar.a(this, z13);
        }
    }
}
