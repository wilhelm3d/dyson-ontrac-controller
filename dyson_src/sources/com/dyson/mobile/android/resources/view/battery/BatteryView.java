package com.dyson.mobile.android.resources.view.battery;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.dyson.mobile.android.R;
import et0.b;
import et0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R*\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/dyson/mobile/android/resources/view/battery/BatteryView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "l", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "m", "getInnerBatteryColor", "setInnerBatteryColor", "innerBatteryColor", "n", "getOuterBatteryColor", "setOuterBatteryColor", "outerBatteryColor", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatteryView extends View {
    public final float d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final float f15767f;

    /* renamed from: g  reason: collision with root package name */
    public final float f15768g;

    /* renamed from: h  reason: collision with root package name */
    public final et0.a f15769h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f15770i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f15771j;

    /* renamed from: k  reason: collision with root package name */
    public final Paint f15772k;

    /* renamed from: l  reason: collision with root package name */
    public int f15773l;

    /* renamed from: m  reason: collision with root package name */
    public int f15774m;

    /* renamed from: n  reason: collision with root package name */
    public int f15775n;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        attributeSet.getClass();
        float dimension = context.getResources().getDimension(R.dimen.battery_view_stroke_width);
        this.d = context.getResources().getDimension(R.dimen.battery_view_inner_padding);
        this.e = context.getResources().getDimension(R.dimen.battery_view_outer_padding);
        this.f15767f = context.getResources().getDimension(R.dimen.battery_view_cap_width);
        this.f15768g = context.getResources().getDimension(R.dimen.battery_view_cap_height);
        float dimension2 = context.getResources().getDimension(R.dimen.battery_view_corner_radius);
        this.f15769h = new et0.a();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new CornerPathEffect(dimension2));
        paint.setStrokeWidth(dimension);
        paint.setAntiAlias(true);
        this.f15770i = paint;
        Paint paint2 = new Paint();
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        paint2.setPathEffect(new CornerPathEffect(dimension2));
        paint2.setStrokeWidth(dimension);
        paint2.setAntiAlias(true);
        this.f15771j = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setPathEffect(new CornerPathEffect(dimension2));
        paint3.setStrokeWidth(dimension);
        paint3.setAntiAlias(true);
        this.f15772k = paint3;
        this.f15774m = -1;
        this.f15775n = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50077a, i13, 0);
        setProgress(obtainStyledAttributes.getInt(0, this.f15773l));
        setInnerBatteryColor(obtainStyledAttributes.getColor(1, this.f15774m));
        setOuterBatteryColor(obtainStyledAttributes.getColor(2, this.f15775n));
    }

    public final int getInnerBatteryColor() {
        return this.f15774m;
    }

    public final int getOuterBatteryColor() {
        return this.f15775n;
    }

    public final int getProgress() {
        return this.f15773l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int width = getWidth();
        int height = getHeight();
        this.f15769h.getClass();
        float f13 = this.e;
        float f14 = width - f13;
        float f15 = height - f13;
        float f16 = f14 - this.f15767f;
        b bVar = new b(f13, f13, f16, f15);
        float f17 = this.f15768g;
        c cVar = new c(bVar, new b(f16, f13 + f17, f14, f15 - f17));
        int i13 = this.f15773l;
        b bVar2 = cVar.f28301a;
        float f18 = bVar2.f28298a;
        float f19 = this.d;
        float f23 = f18 + f19;
        b bVar3 = new b(f23, bVar2.f28299b + f19, ((((bVar2.f28300c - f19) - f23) / 100.0f) * i13) + f23, bVar2.d - f19);
        if (this.f15773l != 0) {
            int i14 = this.f15774m;
            Paint paint = this.f15772k;
            paint.setColor(i14);
            canvas.drawRect(bVar3.f28298a, bVar3.f28299b, bVar3.f28300c, bVar3.d, paint);
        }
        int i15 = this.f15775n;
        Paint paint2 = this.f15770i;
        paint2.setColor(i15);
        int i16 = this.f15775n;
        Paint paint3 = this.f15771j;
        paint3.setColor(i16);
        canvas.drawRect(bVar2.f28298a, bVar2.f28299b, bVar2.f28300c, bVar2.d, paint2);
        b bVar4 = cVar.f28302b;
        canvas.drawRect(bVar4.f28298a, bVar4.f28299b, bVar4.f28300c, bVar4.d, paint3);
    }

    public final void setInnerBatteryColor(int i13) {
        this.f15774m = i13;
        invalidate();
    }

    public final void setOuterBatteryColor(int i13) {
        this.f15775n = i13;
        invalidate();
    }

    public final void setProgress(int i13) {
        if (i13 == this.f15773l) {
            return;
        }
        if (i13 < 0) {
            i13 = 0;
        }
        if (i13 > 100) {
            i13 = 100;
        }
        this.f15773l = i13;
        invalidate();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/resources/view/battery/BatteryView$a;", "", "<init>", "()V", "", "DEFAULT_PROGRESS", "I", "MINIMUM_PERCENTAGE", "MAXIMUM_PERCENTAGE", "DEFAULT_INNER_BATTERY_COLOUR", "DEFAULT_OUTER_BATTERY_COLOUR", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
        attributeSet.getClass();
    }

    public /* synthetic */ BatteryView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
