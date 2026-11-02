package com.dyson.mobile.android.resources.view.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ks0.n;
import lt0.a;
import lt0.b;
import lt0.c;
import lt0.g;
import lt0.h;
/* loaded from: classes3.dex */
public class DysonCounterEditText extends a {

    /* renamed from: o  reason: collision with root package name */
    public TextInputLayout f15789o;

    /* renamed from: p  reason: collision with root package name */
    public TextInputEditText f15790p;

    /* renamed from: q  reason: collision with root package name */
    public DysonTextView f15791q;

    /* renamed from: r  reason: collision with root package name */
    public DysonTextView f15792r;

    /* renamed from: s  reason: collision with root package name */
    public int f15793s;

    /* renamed from: t  reason: collision with root package name */
    public h f15794t;

    public DysonCounterEditText(Context context) {
        super(context);
    }

    private void setEditTextContentDescription(String str) {
        this.f15790p.setContentDescription(str);
    }

    private void setUpPasswordVisibilityToggle(Context context) {
        this.f15789o.setPasswordVisibilityToggleTintList(context.getResources().getColorStateList(R.color.textedit_textcolor));
    }

    @Override // lt0.a
    public final void c(Context context, AttributeSet attributeSet, g gVar) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.counter_edit_text, (ViewGroup) this, true);
        this.e = getResources().getDimensionPixelSize(R.dimen.counter_edit_text_hint_text_large_position);
        this.f52691f = getResources().getDimensionPixelSize(R.dimen.counter_edit_text_hint_text_small_position);
        this.f52697l = (DysonTextView) findViewById(R.id.error_textview);
        this.f15789o = (TextInputLayout) findViewById(R.id.textinput_layout_left);
        this.f15790p = (TextInputEditText) findViewById(R.id.textinput_left);
        this.f15791q = (DysonTextView) findViewById(R.id.hint_textview_left);
        this.f15792r = (DysonTextView) findViewById(R.id.counter_textview);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50082h);
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(2);
            int integer = obtainStyledAttributes.getInteger(0, -1);
            int integer2 = obtainStyledAttributes.getInteger(5, -16777216);
            String string3 = obtainStyledAttributes.getString(3);
            int integer3 = obtainStyledAttributes.getInteger(4, 0);
            obtainStyledAttributes.recycle();
            setText(string);
            setHint(string2);
            setTextColor(integer);
            setHintBackground(integer2);
            setEditTextContentDescription(string3);
            setCounterMaxLength(integer3);
        }
        setInputType(gVar.f52704a);
        setEnabled(gVar.f52705b);
        setError(gVar.d);
        setErrorVisibility(gVar.f52707f);
        this.f15790p.setNextFocusForwardId(gVar.f52706c);
        this.f15790p.setImeOptions(gVar.e);
        setUpPasswordVisibilityToggle(context);
        this.f15794t = new h(2, 2);
        j(false);
        this.f15790p.setOnFocusChangeListener(new b(this));
        this.f15790p.addTextChangedListener(new c(this));
        setInputActionListeners(this.f15790p);
    }

    @Override // lt0.a
    public final void f() {
        this.f15790p.clearFocus();
    }

    public String getHint() {
        return this.f15791q.getText().toString();
    }

    public String getText() {
        return this.f15790p.getText().toString();
    }

    public final void j(boolean z13) {
        if (!TextUtils.isEmpty(getText()) || this.f15790p.hasFocus()) {
            h hVar = this.f15794t;
            if (hVar.f52709b == 2) {
                hVar.f52709b = 1;
                h(z13, z13, false, this.f15791q);
                return;
            }
            return;
        }
        h hVar2 = this.f15794t;
        if (hVar2.f52709b != 2) {
            hVar2.f52709b = 2;
            g(z13, z13, false, this.f15791q);
        }
    }

    public void setCounterMaxLength(int i13) {
        if (i13 > 0) {
            this.f15790p.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i13)});
        }
        this.f15793s = i13;
        this.f15792r.setText(if1.g.a("%d/%d", 0, Integer.valueOf(i13)));
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        this.f15789o.setEnabled(z13);
        this.f15791q.setEnabled(z13);
    }

    public void setHint(String str) {
        this.f15791q.setText(str);
        this.f15791q.setLabelFor(R.id.textinput_left);
    }

    public void setHintBackground(int i13) {
        this.f15791q.setBackgroundColor(i13);
    }

    public void setInputType(int i13) {
        this.f15790p.setInputType(i13);
        this.f15789o.setPasswordVisibilityToggleEnabled(a.e(i13));
    }

    @Override // lt0.a
    public void setIsErrorMode(boolean z13) {
        super.setIsErrorMode(z13);
        TextInputEditText textInputEditText = this.f15790p;
        if (z13) {
            textInputEditText.setBackground(getResources().getDrawable(R.drawable.textedit_error_background));
        } else {
            textInputEditText.setBackground(getResources().getDrawable(R.drawable.textedit_background));
        }
        i(this.f15791q, this.f52698m, this.f15790p.hasFocus());
    }

    public void setText(String str) {
        this.f15790p.setText(str);
    }

    public void setTextColor(int i13) {
        this.f15790p.setTextColor(i13);
    }

    public DysonCounterEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DysonCounterEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }

    public DysonCounterEditText(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
    }
}
