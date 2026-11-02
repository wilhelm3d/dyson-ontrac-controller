package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ap.h;
import com.dyson.mobile.android.R;
import d22.k;
import i12.c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import oh1.f;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fRF\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RF\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R$\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010&\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R$\u0010)\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R$\u0010,\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"¨\u0006-"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonLabelledProgressBar;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ld22/k;", "value", "j", "Ld22/k;", "setLevelBounds", "(Ld22/k;)V", "levelBounds", "Lkotlin/Function1;", "", "newFormat", "k", "Lkotlin/jvm/functions/Function1;", "getLabel1Format", "()Lkotlin/jvm/functions/Function1;", "setLabel1Format", "(Lkotlin/jvm/functions/Function1;)V", "label1Format", "l", "getLabel2Format", "setLabel2Format", "label2Format", "getMin", "()I", "setMin", "(I)V", "min", "getMax", "setMax", "max", "getLevel1", "setLevel1", "level1", "getLevel2", "setLevel2", "level2", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonLabelledProgressBar extends RelativeLayout {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f15712m = 0;
    public final ProgressBar d;
    public final View e;

    /* renamed from: f  reason: collision with root package name */
    public final View f15713f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f15714g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f15715h;

    /* renamed from: i  reason: collision with root package name */
    public final View f15716i;

    /* renamed from: j  reason: collision with root package name */
    public k f15717j;

    /* renamed from: k  reason: collision with root package name */
    public Function1<? super Integer, ? extends CharSequence> f15718k;

    /* renamed from: l  reason: collision with root package name */
    public Function1<? super Integer, ? extends CharSequence> f15719l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonLabelledProgressBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.f15717j = new k(0, 100);
        this.f15718k = new h(1);
        this.f15719l = new h(2);
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.labelled_progress, this);
        View findViewById = findViewById(R.id.slider_level);
        findViewById.getClass();
        ProgressBar progressBar = (ProgressBar) findViewById;
        this.d = progressBar;
        View findViewById2 = findViewById(R.id.slider_ruler_1);
        findViewById2.getClass();
        this.e = findViewById2;
        View findViewById3 = findViewById(R.id.slider_ruler_2);
        findViewById3.getClass();
        this.f15713f = findViewById3;
        View findViewById4 = findViewById(R.id.level_value_1_text);
        findViewById4.getClass();
        TextView textView = (TextView) findViewById4;
        this.f15714g = textView;
        View findViewById5 = findViewById(R.id.level_value_2_text);
        findViewById5.getClass();
        TextView textView2 = (TextView) findViewById5;
        this.f15715h = textView2;
        View findViewById6 = findViewById(R.id.slider_level_padding);
        findViewById6.getClass();
        this.f15716i = findViewById6;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.f50086l, i13, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                progressBar.setProgressDrawable(drawable);
            }
            setLevelBounds(new k(obtainStyledAttributes.getInt(6, 0), obtainStyledAttributes.getInt(11, 100)));
            progressBar.getLayoutParams().height = (int) obtainStyledAttributes.getDimension(10, obtainStyledAttributes.getResources().getDimension(R.dimen.product_width_small));
            Drawable drawable2 = obtainStyledAttributes.getDrawable(9);
            progressBar.setBackground(drawable2 == null ? c7.a.e(getContext(), R.color.backgroundGreyDark) : drawable2);
            Drawable drawable3 = obtainStyledAttributes.getDrawable(3);
            findViewById6.setBackground(drawable3 == null ? c7.a.e(getContext(), R.color.backgroundGreyDark) : drawable3);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(7);
            progressBar.setProgressTintList(colorStateList == null ? c7.a.d(getContext(), R.color.progress_gray) : colorStateList);
            Drawable drawable4 = obtainStyledAttributes.getDrawable(1);
            findViewById2.setBackground(drawable4 == null ? c7.a.e(getContext(), R.color.progress_gray) : drawable4);
            textView.setTextColor(obtainStyledAttributes.getColor(1, c7.a.c(getContext(), R.color.progress_gray)));
            setLevel1(obtainStyledAttributes.getInt(4, this.f15717j.d));
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(8);
            progressBar.setSecondaryProgressTintList(colorStateList2 == null ? c7.a.d(getContext(), R.color.progress_gray_dark) : colorStateList2);
            Drawable drawable5 = obtainStyledAttributes.getDrawable(2);
            findViewById3.setBackground(drawable5 == null ? c7.a.e(getContext(), R.color.progress_gray_dark) : drawable5);
            textView2.setTextColor(obtainStyledAttributes.getColor(2, c7.a.c(getContext(), R.color.progress_gray_dark)));
            setLevel2(obtainStyledAttributes.getInt(5, this.f15717j.d));
            obtainStyledAttributes.recycle();
        }
        int max = Math.max(f.a(textView.getPaint(), "0123456789"), f.a(textView2.getPaint(), "0123456789"));
        ViewGroup.LayoutParams layoutParams = findViewById6.getLayoutParams();
        layoutParams.getClass();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = max;
        requestLayout();
    }

    private final void setLevelBounds(k kVar) {
        int level1 = getLevel1();
        int level2 = getLevel2();
        this.d.setMax(c0.G(kVar));
        this.f15717j = kVar;
        setLevel1(level1);
        setLevel2(level2);
    }

    public final Function1<Integer, CharSequence> getLabel1Format() {
        return this.f15718k;
    }

    public final Function1<Integer, CharSequence> getLabel2Format() {
        return this.f15719l;
    }

    public final int getLevel1() {
        return this.d.getProgress() + this.f15717j.d;
    }

    public final int getLevel2() {
        return this.d.getSecondaryProgress() + this.f15717j.d;
    }

    public final int getMax() {
        return this.f15717j.e;
    }

    public final int getMin() {
        return this.f15717j.d;
    }

    public final void setLabel1Format(Function1<? super Integer, ? extends CharSequence> function1) {
        this.f15718k = function1;
        if (function1 != null) {
            this.f15714g.setText(function1.invoke(Integer.valueOf(getLevel1())));
        }
    }

    public final void setLabel2Format(Function1<? super Integer, ? extends CharSequence> function1) {
        this.f15719l = function1;
        if (function1 != null) {
            this.f15715h.setText(function1.invoke(Integer.valueOf(getLevel2())));
        }
    }

    public final void setLevel1(int i13) {
        ProgressBar progressBar = this.d;
        progressBar.setProgress(i13 - this.f15717j.d);
        Function1<? super Integer, ? extends CharSequence> function1 = this.f15718k;
        TextView textView = this.f15714g;
        if (function1 != null) {
            textView.setText(function1.invoke(Integer.valueOf(i13)));
        }
        float f13 = -((progressBar.getProgress() * progressBar.getLayoutParams().height) / progressBar.getMax());
        this.e.setTranslationY(f13);
        textView.setTranslationY(f13);
    }

    public final void setLevel2(int i13) {
        ProgressBar progressBar = this.d;
        progressBar.setSecondaryProgress(i13 - this.f15717j.d);
        Function1<? super Integer, ? extends CharSequence> function1 = this.f15719l;
        TextView textView = this.f15715h;
        if (function1 != null) {
            textView.setText(function1.invoke(Integer.valueOf(i13)));
        }
        float f13 = -((progressBar.getSecondaryProgress() * progressBar.getLayoutParams().height) / progressBar.getMax());
        this.f15713f.setTranslationY(f13);
        textView.setTranslationY(f13);
    }

    public final void setMax(int i13) {
        setLevelBounds(new k(this.f15717j.d, i13));
    }

    public final void setMin(int i13) {
        setLevelBounds(new k(i13, this.f15717j.e));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonLabelledProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonLabelledProgressBar(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonLabelledProgressBar(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
