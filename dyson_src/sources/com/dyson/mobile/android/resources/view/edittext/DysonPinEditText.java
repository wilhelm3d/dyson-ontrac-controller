package com.dyson.mobile.android.resources.view.edittext;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.edittext.DysonPinEditText;
import ks0.n;
import rh.b0;
import s.i;
import zs0.g;
/* loaded from: classes3.dex */
public class DysonPinEditText extends i {

    /* renamed from: x  reason: collision with root package name */
    public static final c f15802x = c.ALPHANUMERIC_LOWERCASE;

    /* renamed from: i  reason: collision with root package name */
    public int f15803i;

    /* renamed from: j  reason: collision with root package name */
    public int f15804j;

    /* renamed from: k  reason: collision with root package name */
    public float f15805k;

    /* renamed from: l  reason: collision with root package name */
    public float f15806l;

    /* renamed from: m  reason: collision with root package name */
    public c f15807m;

    /* renamed from: n  reason: collision with root package name */
    public int f15808n;

    /* renamed from: o  reason: collision with root package name */
    public int f15809o;

    /* renamed from: p  reason: collision with root package name */
    public float f15810p;

    /* renamed from: q  reason: collision with root package name */
    public float f15811q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f15812r;

    /* renamed from: s  reason: collision with root package name */
    public float f15813s;

    /* renamed from: t  reason: collision with root package name */
    public Paint f15814t;

    /* renamed from: u  reason: collision with root package name */
    public Paint f15815u;

    /* renamed from: v  reason: collision with root package name */
    public View.OnClickListener f15816v;

    /* renamed from: w  reason: collision with root package name */
    public b f15817w;

    /* loaded from: classes3.dex */
    public class a implements ActionMode.Callback {
        public a(DysonPinEditText dysonPinEditText) {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public enum c {
        ALPHANUMERIC_LOWERCASE(0),
        ALPHANUMERIC_UPPERCASE(1),
        NUMERIC_ONLY(2);
        

        /* renamed from: id  reason: collision with root package name */
        int f15818id;

        c(int i13) {
            this.f15818id = i13;
        }

        public static c fromId(int i13) {
            c[] values;
            c cVar = ALPHANUMERIC_LOWERCASE;
            for (c cVar2 : values()) {
                if (cVar2.f15818id == i13) {
                    return cVar2;
                }
            }
            return cVar;
        }
    }

    public DysonPinEditText(Context context) {
        super(context);
        this.f15808n = -1;
        this.f15809o = -1;
        c(context, null);
    }

    public final void b(int i13, int i14, Canvas canvas) {
        canvas.drawText("-", i13, i14 - ((int) (((this.f15814t.ascent() + this.f15814t.descent()) / 2.0f) + 0.5f)), this.f15814t);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        if (!isInEditMode()) {
            setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
        }
        c cVar = f15802x;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50088n, 0, 0);
            try {
                if (obtainStyledAttributes.hasValue(1)) {
                    this.f15812r = obtainStyledAttributes.getDrawable(1);
                } else {
                    this.f15812r = context.getDrawable(R.drawable.ic_filled_circle);
                }
                this.f15813s = obtainStyledAttributes.getDimension(4, Math.max(this.f15812r.getIntrinsicWidth(), this.f15812r.getIntrinsicHeight()));
                this.f15803i = obtainStyledAttributes.getInt(2, 8);
                this.f15808n = obtainStyledAttributes.getInteger(0, -1);
                this.f15809o = obtainStyledAttributes.getInteger(6, -1);
                if (obtainStyledAttributes.hasValue(5)) {
                    setPinTint(obtainStyledAttributes.getColor(5, -1));
                }
                this.f15807m = c.fromId(obtainStyledAttributes.getInt(3, cVar.f15818id));
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f15812r = context.getDrawable(R.drawable.ic_filled_circle);
            this.f15813s = Math.max(drawable.getIntrinsicWidth(), this.f15812r.getIntrinsicHeight());
            this.f15803i = 8;
            this.f15807m = cVar;
        }
        Paint paint = new Paint(getPaint());
        this.f15814t = paint;
        paint.setColor(getTextColors().getDefaultColor());
        this.f15814t.setTextAlign(Paint.Align.CENTER);
        this.f15815u = new Paint(this.f15814t);
        int i13 = this.f15803i;
        this.f15804j = i13;
        int i14 = this.f15808n;
        if (i14 > -1) {
            this.f15804j = i13 + 1;
        }
        if (this.f15809o > i14 && i14 > -1) {
            this.f15804j++;
        }
        setBackground(null);
        setTextAlignment(4);
        setCursorVisible(false);
        setMaxLines(1);
        setPinMode(this.f15807m);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f15803i), new InputFilter() { // from class: lt0.f
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i15, int i16, Spanned spanned, int i17, int i18) {
                DysonPinEditText.c cVar2 = DysonPinEditText.this.f15807m;
                String charSequence2 = charSequence.toString();
                int ordinal = cVar2.ordinal();
                String replaceAll = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? null : charSequence2.replaceAll("[^0-9]", "") : charSequence2.toUpperCase().replaceAll("[^A-Z0-9]", "") : charSequence2.toLowerCase().replaceAll("[^a-z^0-9]", "");
                if (TextUtils.equals(replaceAll, charSequence2)) {
                    return null;
                }
                return replaceAll;
            }
        }});
        setTextIsSelectable(false);
        super.setCustomSelectionActionModeCallback(new a(this));
        super.setOnClickListener(new ao1.a(this, 19));
        setLongClickable(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.resources.view.edittext.DysonPinEditText.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f15810p = (getWidth() - getPaddingStart()) - getPaddingEnd();
        this.f15811q = (int) (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f);
        float f13 = this.f15810p;
        this.f15806l = f13 / this.f15804j;
        this.f15805k = f13 % this.f15803i;
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        b bVar;
        super.onTextChanged(charSequence, i13, i14, i15);
        if (i13 + i15 == this.f15803i && (bVar = this.f15817w) != null) {
            getText().toString();
            ei.c cVar = ((b0) ((uh.c) bVar).f82024a).f73058o;
            if (cVar != null && cVar.f26916m.d) {
                cVar.c();
            }
        }
        if (!isAttachedToWindow() || i15 <= i14) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f15814t.getTextSize());
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ao1.i(this, 5));
        ofFloat.start();
    }

    public void setDashPosition(int i13) {
        this.f15808n = i13;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15816v = onClickListener;
    }

    public void setOnPinEnteredListener(b bVar) {
        this.f15817w = bVar;
    }

    public void setPinMode(c cVar) {
        this.f15807m = cVar;
        setRawInputType((cVar == c.ALPHANUMERIC_LOWERCASE || cVar == c.ALPHANUMERIC_UPPERCASE) ? 144 : 2);
    }

    public void setPinTint(int i13) {
        this.f15812r.setColorFilter(i13, PorterDuff.Mode.SRC_ATOP);
    }

    public DysonPinEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15808n = -1;
        this.f15809o = -1;
        c(context, attributeSet);
    }

    public DysonPinEditText(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f15808n = -1;
        this.f15809o = -1;
        c(context, attributeSet);
    }
}
