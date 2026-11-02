package com.dyson.mobile.android.resources.view.lineindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.View;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.lineindicator.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import rt0.b;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001-B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010$\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R*\u0010,\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#¨\u0006."}, d2 = {"Lcom/dyson/mobile/android/resources/view/lineindicator/DysonLineIndicatorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "h", "I", "getOrientation", "()I", "setOrientation", "(I)V", "orientation", "i", "getLineColor", "setLineColor", "lineColor", "", "j", "Z", "isDashed", "()Z", "setDashed", "(Z)V", "", "k", "F", "getDashGap", "()F", "setDashGap", "(F)V", "dashGap", "l", "getDashLength", "setDashLength", "dashLength", "m", "getDashThickness", "setDashThickness", "dashThickness", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonLineIndicatorView extends View {

    /* renamed from: n  reason: collision with root package name */
    public static final int f15831n;
    public final b d;
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final PathEffect f15832f;

    /* renamed from: g  reason: collision with root package name */
    public final DashPathEffect f15833g;

    /* renamed from: h  reason: collision with root package name */
    public int f15834h;

    /* renamed from: i  reason: collision with root package name */
    public int f15835i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15836j;

    /* renamed from: k  reason: collision with root package name */
    public float f15837k;

    /* renamed from: l  reason: collision with root package name */
    public float f15838l;

    /* renamed from: m  reason: collision with root package name */
    public float f15839m;

    static {
        new a(null);
        f15831n = com.dyson.mobile.android.resources.view.lineindicator.a.HORIZONTAL.ordinal();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonLineIndicatorView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        attributeSet.getClass();
        float dimension = context.getResources().getDimension(R.dimen.line_indicator_dash_gap);
        float dimension2 = context.getResources().getDimension(R.dimen.line_indicator_dash_length);
        float dimension3 = context.getResources().getDimension(R.dimen.line_indicator_dash_thickness);
        int c13 = c7.a.c(context, R.color.white);
        this.d = new b();
        this.e = new Paint(1);
        this.f15832f = new PathEffect();
        int i14 = f15831n;
        this.f15834h = i14;
        this.f15835i = c13;
        this.f15837k = dimension;
        this.f15838l = dimension2;
        this.f15839m = dimension3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50087m, i13, 0);
        setDashGap(obtainStyledAttributes.getDimension(0, dimension));
        setDashLength(obtainStyledAttributes.getDimension(1, dimension2));
        setDashThickness(obtainStyledAttributes.getDimension(2, dimension3));
        setOrientation(obtainStyledAttributes.getInt(5, i14));
        setLineColor(obtainStyledAttributes.getColor(4, c13));
        setDashed(obtainStyledAttributes.getBoolean(3, false));
        this.f15833g = new DashPathEffect(new float[]{this.f15838l, this.f15837k}, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final float getDashGap() {
        return this.f15837k;
    }

    public final float getDashLength() {
        return this.f15838l;
    }

    public final float getDashThickness() {
        return this.f15839m;
    }

    public final int getLineColor() {
        return this.f15835i;
    }

    public final int getOrientation() {
        return this.f15834h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int i13 = this.f15835i;
        Paint paint = this.e;
        paint.setColor(i13);
        paint.setStrokeWidth(this.f15839m);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setPathEffect(this.f15836j ? this.f15833g : this.f15832f);
        a.C0544a c0544a = com.dyson.mobile.android.resources.view.lineindicator.a.Companion;
        int i14 = this.f15834h;
        c0544a.getClass();
        com.dyson.mobile.android.resources.view.lineindicator.a[] values = com.dyson.mobile.android.resources.view.lineindicator.a.values();
        com.dyson.mobile.android.resources.view.lineindicator.a aVar = (i14 < 0 || i14 >= values.length) ? com.dyson.mobile.android.resources.view.lineindicator.a.HORIZONTAL : values[i14];
        float height = getHeight();
        float width = getWidth();
        b bVar = this.d;
        bVar.getClass();
        aVar.getClass();
        com.dyson.mobile.android.resources.view.lineindicator.a aVar2 = com.dyson.mobile.android.resources.view.lineindicator.a.HORIZONTAL;
        rt0.a aVar3 = bVar.f73645a;
        if (aVar == aVar2) {
            float f13 = height * 0.5f;
            aVar3.f73642a = 0.0f;
            aVar3.f73643b = f13;
            aVar3.f73644c = width;
            aVar3.d = f13;
        } else {
            float f14 = width * 0.5f;
            aVar3.f73642a = f14;
            aVar3.f73643b = 0.0f;
            aVar3.f73644c = f14;
            aVar3.d = height;
        }
        canvas.drawLine(aVar3.f73642a, aVar3.f73643b, aVar3.f73644c, aVar3.d, paint);
    }

    public final void setDashGap(float f13) {
        this.f15837k = f13;
        invalidate();
    }

    public final void setDashLength(float f13) {
        this.f15838l = f13;
        invalidate();
    }

    public final void setDashThickness(float f13) {
        this.f15839m = f13;
        invalidate();
    }

    public final void setDashed(boolean z13) {
        this.f15836j = z13;
        invalidate();
    }

    public final void setLineColor(int i13) {
        this.f15835i = i13;
        invalidate();
    }

    public final void setOrientation(int i13) {
        this.f15834h = i13;
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/resources/view/lineindicator/DysonLineIndicatorView$a;", "", "<init>", "()V", "", "DEFAULT_IS_DASHED", "Z", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonLineIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
        attributeSet.getClass();
    }

    public /* synthetic */ DysonLineIndicatorView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
