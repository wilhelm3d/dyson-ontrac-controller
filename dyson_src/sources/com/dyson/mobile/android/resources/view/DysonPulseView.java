package com.dyson.mobile.android.resources.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import ao1.i;
import ks0.n;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
/* loaded from: classes3.dex */
public class DysonPulseView extends View {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f15720o = 0;
    public final int d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15721f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f15722g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15723h;

    /* renamed from: i  reason: collision with root package name */
    public final a[] f15724i;

    /* renamed from: j  reason: collision with root package name */
    public int f15725j;

    /* renamed from: k  reason: collision with root package name */
    public int f15726k;

    /* renamed from: l  reason: collision with root package name */
    public int f15727l;

    /* renamed from: m  reason: collision with root package name */
    public final ValueAnimator f15728m;

    /* renamed from: n  reason: collision with root package name */
    public final i f15729n;

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final Paint f15730a;

        /* renamed from: b  reason: collision with root package name */
        public int f15731b;

        /* renamed from: c  reason: collision with root package name */
        public final float f15732c;

        public a(DysonPulseView dysonPulseView, Paint paint, int i13, float f13) {
            this.f15730a = paint;
            this.f15731b = i13;
            this.f15732c = f13;
        }
    }

    public DysonPulseView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f15729n = new i(this, 1);
        int i14 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f50090p, 0, 0);
        this.d = 3;
        this.e = DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT;
        this.f15721f = -1;
        this.f15723h = -65536;
        this.f15722g = false;
        try {
            this.d = obtainStyledAttributes.getInteger(2, 3);
            this.e = obtainStyledAttributes.getInteger(3, DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT);
            this.f15721f = obtainStyledAttributes.getInteger(4, -1);
            this.f15723h = obtainStyledAttributes.getColor(1, -65536);
            this.f15722g = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            this.f15724i = new a[this.d];
            while (true) {
                int i15 = this.d;
                if (i14 >= i15) {
                    break;
                }
                float f13 = i14 / i15;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(this.f15723h);
                paint.setAlpha((int) (255.0f * f13));
                this.f15724i[i14] = new a(this, paint, (int) (this.f15727l * f13), f13);
                i14++;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15728m = valueAnimator;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            this.f15728m.setInterpolator(new LinearInterpolator());
            this.f15728m.setDuration(this.e);
            this.f15728m.setRepeatCount(this.f15721f);
            this.f15728m.addUpdateListener(this.f15729n);
            if (this.f15722g) {
                this.f15728m.start();
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a[] aVarArr;
        for (a aVar : this.f15724i) {
            canvas.drawCircle(this.f15725j, this.f15726k, aVar.f15731b, aVar.f15730a);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        int i17 = i13 / 2;
        this.f15725j = i17;
        int i18 = i14 / 2;
        this.f15726k = i18;
        this.f15727l = Math.min(i17, i18);
    }

    public DysonPulseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DysonPulseView(Context context) {
        this(context, null, 0);
    }
}
