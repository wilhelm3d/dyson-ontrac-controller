package com.dyson.mobile.android.resources.view.tooltip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.R;
import ft0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import se1.j0;
import se1.q0;
import zs0.f;
import zs0.l;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b(\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R*\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R*\u0010)\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR*\u0010-\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001cR*\u00101\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010\u001c¨\u00062"}, d2 = {"Lcom/dyson/mobile/android/resources/view/tooltip/TooltipView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "i", "F", "getTooltipArrowSize", "()F", "setTooltipArrowSize", "(F)V", "tooltipArrowSize", "j", "getTooltipPadding", "setTooltipPadding", "tooltipPadding", "k", "I", "getArrowPosition", "()I", "setArrowPosition", "(I)V", "arrowPosition", "l", "getLeftOffset", "setLeftOffset", "leftOffset", "m", "getRightOffset", "setRightOffset", "rightOffset", "n", "getTooltipBias", "setTooltipBias", "tooltipBias", "o", "getTooltipColor", "setTooltipColor", "tooltipColor", TTMLParser.Tags.CAPTION, "getTooltipTextColor", "setTooltipTextColor", "tooltipTextColor", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TooltipView extends AppCompatTextView {
    public final float d;
    public final au0.a e;

    /* renamed from: f  reason: collision with root package name */
    public RectF f15865f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f15866g;

    /* renamed from: h  reason: collision with root package name */
    public final TextPaint f15867h;

    /* renamed from: i  reason: collision with root package name */
    public float f15868i;

    /* renamed from: j  reason: collision with root package name */
    public float f15869j;

    /* renamed from: k  reason: collision with root package name */
    public int f15870k;

    /* renamed from: l  reason: collision with root package name */
    public float f15871l;

    /* renamed from: m  reason: collision with root package name */
    public float f15872m;

    /* renamed from: n  reason: collision with root package name */
    public int f15873n;

    /* renamed from: o  reason: collision with root package name */
    public int f15874o;

    /* renamed from: p  reason: collision with root package name */
    public int f15875p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        attributeSet.getClass();
        float dimension = context.getResources().getDimension(R.dimen.tooltip_view_arrow_size);
        float dimension2 = context.getResources().getDimension(R.dimen.tooltip_view_padding);
        this.d = context.getResources().getDimension(R.dimen.tooltip_view_ellipsis_width);
        int c13 = c7.a.c(context, R.color.inactiveGrey1);
        int c14 = c7.a.c(context, R.color.white);
        this.e = new au0.a(new l(), new jf1.a(), j0.f76050a);
        this.f15865f = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
        this.f15866g = paint;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(context.getResources().getDimension(R.dimen.tooltip_view_text_size));
        textPaint.setTypeface(f.FUTURA_BOOK.getTypeface(context.getAssets()));
        textPaint.setTextAlign(Paint.Align.LEFT);
        this.f15867h = textPaint;
        this.f15868i = dimension;
        this.f15869j = dimension2;
        a aVar = a.LEFT;
        this.f15873n = aVar.ordinal();
        this.f15874o = c13;
        this.f15875p = c14;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.C, i13, 0);
        setArrowPosition(obtainStyledAttributes.getInt(0, 0));
        setTooltipArrowSize(obtainStyledAttributes.getDimension(1, dimension));
        setTooltipPadding(obtainStyledAttributes.getDimension(5, dimension2));
        setTooltipBias(obtainStyledAttributes.getInt(2, aVar.ordinal()));
        setLeftOffset(obtainStyledAttributes.getDimension(4, 0.0f));
        setRightOffset(obtainStyledAttributes.getDimension(6, 0.0f));
        setTooltipColor(obtainStyledAttributes.getColor(3, c13));
        setTooltipTextColor(obtainStyledAttributes.getColor(8, c14));
        paint.setColor(this.f15874o);
        textPaint.setColor(this.f15875p);
        obtainStyledAttributes.recycle();
    }

    public final int getArrowPosition() {
        return this.f15870k;
    }

    public final float getLeftOffset() {
        return this.f15871l;
    }

    public final float getRightOffset() {
        return this.f15872m;
    }

    public final float getTooltipArrowSize() {
        return this.f15868i;
    }

    public final int getTooltipBias() {
        return this.f15873n;
    }

    public final int getTooltipColor() {
        return this.f15874o;
    }

    public final float getTooltipPadding() {
        return this.f15869j;
    }

    public final int getTooltipTextColor() {
        return this.f15875p;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b0  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.resources.view.tooltip.TooltipView.onDraw(android.graphics.Canvas):void");
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        String obj = getText().toString();
        this.e.getClass();
        obj.getClass();
        TextPaint textPaint = this.f15867h;
        textPaint.getClass();
        StaticLayout a13 = l.a(obj, textPaint, (int) textPaint.measureText(obj));
        float width = (this.f15869j * 2.0f) + a13.getWidth();
        float height = (2.0f * this.f15869j) + a13.getHeight();
        a.C1003a c1003a = ft0.a.Companion;
        int i15 = this.f15870k;
        c1003a.getClass();
        ft0.a[] values = ft0.a.values();
        ft0.a aVar = (i15 < 0 || i15 >= values.length) ? ft0.a.LEFT : values[i15];
        if (aVar == ft0.a.TOP || aVar == ft0.a.BOTTOM) {
            height += this.f15868i;
        } else {
            width += this.f15868i;
        }
        setMeasuredDimension(q0.b(getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(width)), i13), q0.b(getPaddingBottom() + getPaddingTop() + ((int) Math.ceil(height)), i14));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
        super.onTextChanged(charSequence, i13, i14, i15);
        invalidate();
    }

    public final void setArrowPosition(int i13) {
        this.f15870k = i13;
        invalidate();
    }

    public final void setLeftOffset(float f13) {
        this.f15871l = f13;
        invalidate();
    }

    public final void setRightOffset(float f13) {
        this.f15872m = f13;
        invalidate();
    }

    public final void setTooltipArrowSize(float f13) {
        this.f15868i = f13;
        invalidate();
    }

    public final void setTooltipBias(int i13) {
        this.f15873n = i13;
        invalidate();
    }

    public final void setTooltipColor(int i13) {
        this.f15874o = i13;
        invalidate();
    }

    public final void setTooltipPadding(float f13) {
        this.f15869j = f13;
        invalidate();
    }

    public final void setTooltipTextColor(int i13) {
        this.f15875p = i13;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TooltipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
        attributeSet.getClass();
    }

    public /* synthetic */ TooltipView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
