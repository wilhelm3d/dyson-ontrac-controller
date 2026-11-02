package com.dyson.mobile.android.resources.view.edittext;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import ci.b;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import com.dyson.mobile.android.resources.view.edittext.DysonEditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import ks0.n;
import lt0.a;
import lt0.e;
import lt0.g;
import lt0.h;
import x12.r;
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0011J\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0011J\u0019\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010\u0005R\"\u0010-\u001a\u00020&8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010>\u001a\u0004\u0018\u00010!2\b\u0010>\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010$R(\u0010B\u001a\u0004\u0018\u00010!2\b\u0010B\u001a\u0004\u0018\u00010!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bC\u0010@\"\u0004\bD\u0010$¨\u0006E"}, d2 = {"Lcom/dyson/mobile/android/resources/view/edittext/DysonEditText;", "Llt0/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "height", "Lh12/f0;", "setHeight", "(I)V", "textColor", "setTextColor", "Landroid/content/res/ColorStateList;", "colorStateList", "(Landroid/content/res/ColorStateList;)V", "", "isErrorMode", "setIsErrorMode", "(Z)V", "enabled", "setEnabled", "background", "setHintBackground", "inputType", "setInputType", "", "contentDescription", "setEditTextContentDescription", "(Ljava/lang/String;)V", "setUpPasswordVisibilityToggle", "Lcom/google/android/material/textfield/TextInputLayout;", "o", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "setTextInputLayout", "(Lcom/google/android/material/textfield/TextInputLayout;)V", "textInputLayout", "Lcom/google/android/material/textfield/TextInputEditText;", TTMLParser.Tags.CAPTION, "Lcom/google/android/material/textfield/TextInputEditText;", "getEditText", "()Lcom/google/android/material/textfield/TextInputEditText;", "setEditText", "(Lcom/google/android/material/textfield/TextInputEditText;)V", "editText", "Lcom/dyson/mobile/android/resources/view/DysonTextView;", "q", "Lcom/dyson/mobile/android/resources/view/DysonTextView;", "getHintText", "()Lcom/dyson/mobile/android/resources/view/DysonTextView;", "setHintText", "(Lcom/dyson/mobile/android/resources/view/DysonTextView;)V", "hintText", "text", "getText", "()Ljava/lang/String;", "setText", "hint", "getHint", "setHint", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DysonEditText extends a {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f15795u = 0;

    /* renamed from: o  reason: collision with root package name */
    public TextInputLayout f15796o;

    /* renamed from: p  reason: collision with root package name */
    public TextInputEditText f15797p;

    /* renamed from: q  reason: collision with root package name */
    public DysonTextView f15798q;

    /* renamed from: r  reason: collision with root package name */
    public ConstraintLayout f15799r;

    /* renamed from: s  reason: collision with root package name */
    public int f15800s;

    /* renamed from: t  reason: collision with root package name */
    public h f15801t;

    public DysonEditText(Context context) {
        super(context);
    }

    private final void setEditTextContentDescription(String str) {
        getEditText().setContentDescription(str);
    }

    private final void setHintBackground(int i13) {
        getHintText().setBackgroundColor(i13);
    }

    private final void setInputType(int i13) {
        getEditText().setInputType(i13);
        getTextInputLayout().setEndIconMode(a.e(i13) ? 1 : 0);
    }

    private final void setUpPasswordVisibilityToggle(Context context) {
        getTextInputLayout().setEndIconTintList(c7.a.d(context, R.color.textedit_textcolor));
    }

    @Override // lt0.a
    public final void c(Context context, AttributeSet attributeSet, g gVar) {
        context.getClass();
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.edit_text, (ViewGroup) this, true);
        this.f52697l = (DysonTextView) findViewById(R.id.error_textview);
        View findViewById = findViewById(R.id.textinput_layout_left);
        findViewById.getClass();
        setTextInputLayout((TextInputLayout) findViewById);
        View findViewById2 = findViewById(R.id.textinput_left);
        findViewById2.getClass();
        setEditText((TextInputEditText) findViewById2);
        View findViewById3 = findViewById(R.id.hint_textview_left);
        findViewById3.getClass();
        setHintText((DysonTextView) findViewById3);
        View findViewById4 = findViewById(R.id.edit_text_container);
        findViewById4.getClass();
        this.f15799r = (ConstraintLayout) findViewById4;
        setUpPasswordVisibilityToggle(context);
        j(context, attributeSet, gVar);
        this.f15801t = new h(1, 1);
        if (!TextUtils.isEmpty(getText()) || getEditText().hasFocus()) {
            h hVar = this.f15801t;
            hVar.getClass();
            hVar.f52709b = 1;
            h(false, false, true, getHintText());
        } else {
            h hVar2 = this.f15801t;
            hVar2.getClass();
            hVar2.f52709b = 2;
            g(false, false, true, getHintText());
        }
        ConstraintLayout constraintLayout = this.f15799r;
        if (constraintLayout == null) {
            r.i("editTextContainer");
            throw null;
        }
        constraintLayout.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: lt0.d

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DysonEditText f52703b;

            {
                this.f52703b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                int i13 = r2;
                DysonEditText dysonEditText = this.f52703b;
                switch (i13) {
                    case 0:
                        int i14 = DysonEditText.f15795u;
                        if (z13) {
                            dysonEditText.getEditText().requestFocus();
                            return;
                        }
                        return;
                    default:
                        int i15 = DysonEditText.f15795u;
                        dysonEditText.i(dysonEditText.getHintText(), dysonEditText.f52698m, dysonEditText.getEditText().hasFocus());
                        dysonEditText.k();
                        return;
                }
            }
        });
        getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: lt0.d

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DysonEditText f52703b;

            {
                this.f52703b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                int i13 = r2;
                DysonEditText dysonEditText = this.f52703b;
                switch (i13) {
                    case 0:
                        int i14 = DysonEditText.f15795u;
                        if (z13) {
                            dysonEditText.getEditText().requestFocus();
                            return;
                        }
                        return;
                    default:
                        int i15 = DysonEditText.f15795u;
                        dysonEditText.i(dysonEditText.getHintText(), dysonEditText.f52698m, dysonEditText.getEditText().hasFocus());
                        dysonEditText.k();
                        return;
                }
            }
        });
        getEditText().addTextChangedListener(new e(this));
        setInputActionListeners(getEditText());
    }

    @Override // lt0.a
    public final void f() {
        getEditText().clearFocus();
    }

    public final TextInputEditText getEditText() {
        TextInputEditText textInputEditText = this.f15797p;
        if (textInputEditText != null) {
            return textInputEditText;
        }
        r.i("editText");
        throw null;
    }

    public final String getHint() {
        return getHintText().getText().toString();
    }

    public final DysonTextView getHintText() {
        DysonTextView dysonTextView = this.f15798q;
        if (dysonTextView != null) {
            return dysonTextView;
        }
        r.i("hintText");
        throw null;
    }

    public final String getText() {
        return String.valueOf(getEditText().getText());
    }

    public final TextInputLayout getTextInputLayout() {
        TextInputLayout textInputLayout = this.f15796o;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        r.i("textInputLayout");
        throw null;
    }

    public void j(Context context, AttributeSet attributeSet, g gVar) {
        context.getClass();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50085k);
            obtainStyledAttributes.getClass();
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(2);
            try {
                setTextColor(obtainStyledAttributes.getInteger(0, -1));
            } catch (UnsupportedOperationException unused) {
                setTextColor(obtainStyledAttributes.getColorStateList(0));
            }
            int integer = obtainStyledAttributes.getInteger(5, -16777216);
            String string3 = obtainStyledAttributes.getString(4);
            int integer2 = obtainStyledAttributes.getInteger(3, 0);
            obtainStyledAttributes.recycle();
            setText(string);
            setHint(string2);
            setHintBackground(integer);
            setEditTextContentDescription(string3);
            TextInputEditText editText = getEditText();
            if (integer2 > 0) {
                editText.setFilters(new InputFilter[]{new b(this, integer2)});
            }
        }
        setInputType(gVar.f52704a);
        setEnabled(gVar.f52705b);
        setError(gVar.d);
        setErrorVisibility(gVar.f52707f);
        getEditText().setNextFocusForwardId(gVar.f52706c);
        getEditText().setImeOptions(gVar.e);
    }

    public final void k() {
        if (!TextUtils.isEmpty(getText()) || getEditText().hasFocus()) {
            h hVar = this.f15801t;
            hVar.getClass();
            if (hVar.f52709b == 2) {
                h hVar2 = this.f15801t;
                hVar2.getClass();
                hVar2.f52709b = 1;
                h(true, true, true, getHintText());
                return;
            }
            return;
        }
        h hVar3 = this.f15801t;
        hVar3.getClass();
        if (hVar3.f52709b != 2) {
            h hVar4 = this.f15801t;
            hVar4.getClass();
            hVar4.f52709b = 2;
            g(true, true, true, getHintText());
        }
    }

    public final void setEditText(TextInputEditText textInputEditText) {
        textInputEditText.getClass();
        this.f15797p = textInputEditText;
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        getTextInputLayout().setEnabled(z13);
        getHintText().setEnabled(z13);
    }

    public final void setHeight(int i13) {
        this.f15800s = i13 / getEditText().getLineHeight();
        getEditText().setMaxLines(this.f15800s);
    }

    public final void setHint(String str) {
        getHintText().setText(str);
        getHintText().setLabelFor(R.id.textinput_left);
    }

    public final void setHintText(DysonTextView dysonTextView) {
        dysonTextView.getClass();
        this.f15798q = dysonTextView;
    }

    @Override // lt0.a
    public void setIsErrorMode(boolean z13) {
        super.setIsErrorMode(z13);
        if (z13) {
            getEditText().setBackground(c7.a.e(getContext(), R.drawable.textedit_error_background));
        } else {
            getEditText().setBackground(c7.a.e(getContext(), R.drawable.textedit_background));
        }
        i(getHintText(), this.f52698m, getEditText().hasFocus());
    }

    public final void setText(String str) {
        getEditText().setText(str);
    }

    public final void setTextColor(int i13) {
        getEditText().setTextColor(i13);
    }

    public final void setTextInputLayout(TextInputLayout textInputLayout) {
        textInputLayout.getClass();
        this.f15796o = textInputLayout;
    }

    public DysonEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DysonEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }

    public DysonEditText(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        getEditText().setTextColor(colorStateList);
    }
}
