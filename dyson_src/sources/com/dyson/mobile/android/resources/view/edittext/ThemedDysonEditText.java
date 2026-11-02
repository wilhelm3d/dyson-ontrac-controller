package com.dyson.mobile.android.resources.view.edittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import com.google.android.material.textfield.TextInputEditText;
import gf1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import lt0.g;
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/dyson/mobile/android/resources/view/edittext/ThemedDysonEditText;", "Lcom/dyson/mobile/android/resources/view/edittext/DysonEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/ColorStateList;", "colorStateList", "Lh12/f0;", "setUpPasswordVisibilityToggle", "(Landroid/content/res/ColorStateList;)V", "", "isErrorMode", "setIsErrorMode", "(Z)V", "", "Landroid/text/InputFilter;", "filters", "setFilters", "([Landroid/text/InputFilter;)V", "padding", "setCompoundDrawablePadding", "(I)V", "", "getTextSize", "()F", "textSize", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "typeface", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThemedDysonEditText extends DysonEditText {
    public /* synthetic */ ThemedDysonEditText(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    private final void setUpPasswordVisibilityToggle(ColorStateList colorStateList) {
        getTextInputLayout().setEndIconTintList(colorStateList);
    }

    public final float getTextSize() {
        return getEditText().getTextSize();
    }

    public final Typeface getTypeface() {
        Typeface typeface = getEditText().getTypeface();
        typeface.getClass();
        return typeface;
    }

    @Override // lt0.a
    public final void i(DysonTextView dysonTextView, boolean z13, boolean z14) {
        dysonTextView.getClass();
        if (z13) {
            dysonTextView.setTextColor(l(R.attr.errorStateTextColor));
        } else if (z14) {
            dysonTextView.setTextColor(l(R.attr.hintTextColorFocused));
        } else if (dysonTextView.isEnabled()) {
            dysonTextView.setTextColor(l(R.attr.hintTextColorEnabled));
        } else {
            dysonTextView.setTextColor(l(R.attr.hintTextColorDisabled));
        }
    }

    @Override // com.dyson.mobile.android.resources.view.edittext.DysonEditText
    @SuppressLint({"CustomViewStyleable"})
    public final void j(Context context, AttributeSet attributeSet, g gVar) {
        context.getClass();
        super.j(context, attributeSet, gVar);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50085k);
            obtainStyledAttributes.getClass();
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
            if (colorStateList != null) {
                setUpPasswordVisibilityToggle(colorStateList);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final int l(int i13) {
        Context context = getContext();
        context.getClass();
        return a.a(context, i13);
    }

    public final void setCompoundDrawablePadding(int i13) {
        getEditText().setCompoundDrawablePadding(i13);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        inputFilterArr.getClass();
        getEditText().setFilters(inputFilterArr);
    }

    @Override // com.dyson.mobile.android.resources.view.edittext.DysonEditText, lt0.a
    public void setIsErrorMode(boolean z13) {
        Drawable e;
        super.setIsErrorMode(z13);
        TextInputEditText editText = getEditText();
        if (z13) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.activityEditTextErrorBackground, typedValue, true);
            e = c7.a.e(getContext(), typedValue.resourceId);
        } else {
            TypedValue typedValue2 = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.activityEditTextBackground, typedValue2, true);
            e = c7.a.e(getContext(), typedValue2.resourceId);
        }
        editText.setBackground(e);
        i(getHintText(), this.f52698m, getEditText().hasFocus());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemedDysonEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemedDysonEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThemedDysonEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
