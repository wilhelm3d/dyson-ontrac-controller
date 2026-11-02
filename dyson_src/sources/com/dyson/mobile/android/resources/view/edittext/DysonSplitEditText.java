package com.dyson.mobile.android.resources.view.edittext;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ao1.i;
import ci.b;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ks0.n;
import lt0.a;
import lt0.g;
import lt0.h;
/* loaded from: classes3.dex */
public class DysonSplitEditText extends a {
    public static final /* synthetic */ int D = 0;
    public h A;
    public KeyListener B;
    public KeyListener C;

    /* renamed from: o */
    public g f15819o;

    /* renamed from: p */
    public ConstraintLayout f15820p;

    /* renamed from: q */
    public Guideline f15821q;

    /* renamed from: r */
    public Guideline f15822r;

    /* renamed from: s */
    public View f15823s;

    /* renamed from: t */
    public TextInputLayout f15824t;

    /* renamed from: u */
    public TextInputEditText f15825u;

    /* renamed from: v */
    public DysonTextView f15826v;

    /* renamed from: w */
    public TextInputLayout f15827w;

    /* renamed from: x */
    public TextInputEditText f15828x;

    /* renamed from: y */
    public DysonTextView f15829y;

    /* renamed from: z */
    public h f15830z;

    public DysonSplitEditText(Context context) {
        super(context);
    }

    private float getCurrentGuidelinePosition() {
        return ((ConstraintLayout.b) this.f15821q.getLayoutParams()).f3810c;
    }

    private void setContentDescriptionLeft(String str) {
        this.f15825u.setContentDescription(str);
    }

    private void setContentDescriptionRight(String str) {
        this.f15828x.setContentDescription(str);
    }

    public void setGuidelinePosition(float f13) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) this.f15821q.getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f15822r.getLayoutParams();
        bVar.f3810c = f13;
        bVar2.f3810c = f13;
        this.f15821q.setLayoutParams(bVar);
        this.f15822r.setLayoutParams(bVar2);
    }

    private void setNextFocusForward(int i13) {
        this.f15825u.setNextFocusForwardId(R.id.textinput_right);
        this.f15828x.setNextFocusForwardId(i13);
    }

    @Override // lt0.a
    public final void c(Context context, AttributeSet attributeSet, g gVar) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.split_edit_text, (ViewGroup) this, true);
        this.f15830z = new h(2, 2);
        this.A = new h(2, 2);
        this.f52697l = (DysonTextView) findViewById(R.id.error_textview);
        this.f15820p = (ConstraintLayout) findViewById(R.id.split_edittext_fields);
        this.f15821q = (Guideline) findViewById(R.id.guidelineFields);
        this.f15822r = (Guideline) findViewById(R.id.guidelinePlaceholder);
        this.f15823s = findViewById(R.id.divider);
        this.f15824t = (TextInputLayout) findViewById(R.id.textinput_layout_left);
        this.f15825u = (TextInputEditText) findViewById(R.id.textinput_left);
        this.f15826v = (DysonTextView) findViewById(R.id.hint_textview_left);
        this.f15827w = (TextInputLayout) findViewById(R.id.textinput_layout_right);
        this.f15828x = (TextInputEditText) findViewById(R.id.textinput_right);
        this.f15829y = (DysonTextView) findViewById(R.id.hint_textview_right);
        this.f15819o = gVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50092r);
            String string = obtainStyledAttributes.getString(6);
            String string2 = obtainStyledAttributes.getString(2);
            String string3 = obtainStyledAttributes.getString(0);
            int integer = obtainStyledAttributes.getInteger(4, 0);
            String string4 = obtainStyledAttributes.getString(7);
            String string5 = obtainStyledAttributes.getString(3);
            String string6 = obtainStyledAttributes.getString(1);
            int integer2 = obtainStyledAttributes.getInteger(5, 0);
            obtainStyledAttributes.recycle();
            setTextLeft(string);
            setHintLeft(string2);
            setContentDescriptionLeft(string3);
            TextInputEditText textInputEditText = this.f15825u;
            if (integer > 0) {
                textInputEditText.setFilters(new InputFilter[]{new b(this, integer)});
            }
            setTextRight(string4);
            setHintRight(string5);
            setContentDescriptionRight(string6);
            TextInputEditText textInputEditText2 = this.f15828x;
            if (integer2 > 0) {
                textInputEditText2.setFilters(new InputFilter[]{new b(this, integer2)});
            }
        }
        setEnabled(gVar.f52705b);
        setInputType(gVar.f52704a);
        setImeOptions(gVar.e);
        setNextFocusForward(gVar.f52706c);
        setError(gVar.d);
        setErrorVisibility(gVar.f52707f);
        this.B = this.f15825u.getKeyListener();
        this.C = this.f15828x.getKeyListener();
        this.f15830z = n(false, this.f15826v, this.f15825u, this.B, this.f15830z);
        this.A = n(false, this.f15829y, this.f15828x, this.C, this.A);
        if (this.f15825u.hasFocus()) {
            setGuidelinePosition(0.66f);
        } else if (this.f15828x.hasFocus()) {
            setGuidelinePosition(0.33f);
        } else {
            setGuidelinePosition(0.5f);
        }
        ao1.b bVar = new ao1.b(this, 3);
        this.f15825u.setOnFocusChangeListener(bVar);
        this.f15828x.setOnFocusChangeListener(bVar);
        setInputActionListeners(this.f15828x);
    }

    @Override // lt0.a
    public final void f() {
        this.f15825u.clearFocus();
        this.f15828x.clearFocus();
    }

    public String getHintLeft() {
        return this.f15826v.getText().toString();
    }

    public String getHintRight() {
        return this.f15829y.getText().toString();
    }

    public String getTextLeft() {
        return this.f15825u.getText().toString();
    }

    public String getTextRight() {
        return this.f15828x.getText().toString();
    }

    public final void k(float f13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(getCurrentGuidelinePosition(), f13);
        ofFloat.setDuration(this.d);
        ofFloat.addUpdateListener(new i(this, 6));
        ofFloat.start();
    }

    public final boolean l() {
        return this.f15825u.hasFocus() || this.f15828x.hasFocus();
    }

    public final void m() {
        Resources resources = getResources();
        if (this.f52698m) {
            this.f15820p.setBackground(resources.getDrawable(R.drawable.textedit_error_background));
            this.f15823s.setBackgroundColor(resources.getColor(R.color.errorStateRed));
        } else if (!this.f15825u.isEnabled() && !this.f15828x.isEnabled()) {
            this.f15820p.setBackground(resources.getDrawable(R.drawable.splittextedit_background_disabled));
            this.f15823s.setBackgroundColor(resources.getColor(R.color.inactiveGrey1));
        } else if (this.f15825u.hasFocus() || this.f15828x.hasFocus()) {
            this.f15820p.setBackground(resources.getDrawable(R.drawable.splittextedit_background_selected));
            this.f15823s.setBackgroundColor(resources.getColor(R.color.inactiveGrey2));
        } else {
            this.f15820p.setBackground(resources.getDrawable(R.drawable.splittextedit_background));
            this.f15823s.setBackgroundColor(resources.getColor(R.color.inactiveGrey2));
        }
    }

    public final h n(boolean z13, DysonTextView dysonTextView, TextInputEditText textInputEditText, KeyListener keyListener, h hVar) {
        boolean isEmpty = TextUtils.isEmpty(textInputEditText.getText().toString());
        boolean hasFocus = textInputEditText.hasFocus();
        Resources resources = getResources();
        if (isEmpty || hasFocus) {
            int color = resources.getColor(R.color.textedit_textcolor);
            int i13 = this.f52692g;
            int i14 = this.f15819o.f52704a;
            textInputEditText.setTextSize(0, i13);
            textInputEditText.setTextColor(color);
            textInputEditText.setKeyListener(keyListener);
            if (keyListener != null) {
                textInputEditText.setInputType(i14);
            }
        } else {
            int color2 = l() ? resources.getColor(R.color.inactiveGrey1) : resources.getColor(R.color.textedit_textcolor);
            textInputEditText.setTextSize(0, l() ? this.f52693h : this.f52692g);
            textInputEditText.setTextColor(color2);
            textInputEditText.setKeyListener(null);
        }
        boolean isEmpty2 = TextUtils.isEmpty(textInputEditText.getText().toString());
        boolean hasFocus2 = textInputEditText.hasFocus();
        if (isEmpty2 || hasFocus2 || !l()) {
            dysonTextView.setVisibility(0);
        } else {
            dysonTextView.setVisibility(8);
        }
        boolean isEmpty3 = TextUtils.isEmpty(textInputEditText.getText().toString());
        boolean hasFocus3 = textInputEditText.hasFocus();
        if (!isEmpty3 || hasFocus3) {
            if (isEmpty3) {
                if (hVar.f52708a == 2) {
                    h(z13 && (hVar.f52709b == 2), z13, false, dysonTextView);
                    return new h(1, 1);
                }
                return hVar;
            } else if (!hasFocus3 && hVar.f52708a == 2) {
                h(z13, z13, false, dysonTextView);
                return new h(1, hVar.f52709b);
            } else if (hVar.f52709b == 2) {
                dysonTextView.setTextSize(0, this.f52693h);
                return new h(hVar.f52708a, 1);
            } else {
                return hVar;
            }
        }
        int i15 = hVar.f52708a;
        if (i15 != 2) {
            h hVar2 = new h(2, hVar.f52709b);
            if (l()) {
                a(this.f52691f, this.e, false, dysonTextView);
                return hVar2;
            }
            hVar2.f52709b = 2;
            g(z13, z13, false, dysonTextView);
            return hVar2;
        } else if (!l() && hVar.f52709b != 2) {
            b(this.f52693h, this.f52692g, dysonTextView);
            return new h(i15, 2);
        } else if (l() && hVar.f52709b == 2) {
            b(this.f52692g, this.f52693h, dysonTextView);
            return new h(i15, 1);
        } else {
            return hVar;
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        this.f15824t.setEnabled(z13);
        this.f15827w.setEnabled(z13);
        this.f15826v.setEnabled(z13);
        this.f15829y.setEnabled(z13);
    }

    public void setHintLeft(String str) {
        this.f15826v.setText(str);
        this.f15826v.setLabelFor(R.id.textinput_left);
    }

    public void setHintRight(String str) {
        this.f15829y.setText(str);
        this.f15829y.setLabelFor(R.id.textinput_right);
    }

    public void setImeOptions(int i13) {
        this.f15825u.setImeOptions(5);
        this.f15828x.setImeOptions(i13);
    }

    public void setInputType(int i13) {
        this.f15825u.setInputType(i13);
        this.f15828x.setInputType(i13);
        boolean e = a.e(i13);
        this.f15824t.setPasswordVisibilityToggleEnabled(e);
        this.f15827w.setPasswordVisibilityToggleEnabled(e);
    }

    @Override // lt0.a
    public void setIsErrorMode(boolean z13) {
        super.setIsErrorMode(z13);
        i(this.f15826v, this.f52698m, this.f15825u.hasFocus());
        i(this.f15829y, this.f52698m, this.f15828x.hasFocus());
        m();
    }

    public void setTextLeft(String str) {
        this.f15825u.setText(str);
        this.f15830z = n(false, this.f15826v, this.f15825u, this.B, this.f15830z);
    }

    public void setTextRight(String str) {
        this.f15828x.setText(str);
        this.A = n(false, this.f15829y, this.f15828x, this.C, this.A);
    }

    public DysonSplitEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DysonSplitEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }

    public DysonSplitEditText(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
    }
}
