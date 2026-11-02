package com.dyson.mobile.android.resources.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import com.dyson.mobile.android.R;
import oi1.s;
import zs0.j;
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0541a f15748c = new C0541a(Integer.class, "position");
    public static final b d = new b(Integer.class, "alpha");

    /* renamed from: a  reason: collision with root package name */
    public final DysonSeekArc f15749a;

    /* renamed from: b  reason: collision with root package name */
    public int f15750b;

    /* renamed from: com.dyson.mobile.android.resources.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0541a extends Property<a, Integer> {
        public C0541a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Integer get(a aVar) {
            return Integer.valueOf(aVar.f15750b);
        }

        @Override // android.util.Property
        public final void set(a aVar, Integer num) {
            a aVar2 = aVar;
            aVar2.f15750b = num.intValue();
            aVar2.f15749a.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Property<a, Integer> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final Integer get(a aVar) {
            return Integer.valueOf(aVar.a());
        }

        @Override // android.util.Property
        public final void set(a aVar, Integer num) {
            a aVar2 = aVar;
            aVar2.c(num.intValue());
            aVar2.f15749a.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends a {

        /* renamed from: g  reason: collision with root package name */
        public static final C0542a f15751g = new C0542a(Integer.class, "sweep");
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public final Paint f15752f;

        /* renamed from: com.dyson.mobile.android.resources.view.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0542a extends Property<c, Integer> {
            public C0542a(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            public final Integer get(c cVar) {
                return Integer.valueOf(cVar.e);
            }

            @Override // android.util.Property
            public final void set(c cVar, Integer num) {
                c cVar2 = cVar;
                cVar2.e = num.intValue();
                cVar2.f15749a.invalidate();
            }
        }

        public c(DysonSeekArc dysonSeekArc, int i13) {
            super(dysonSeekArc, com.dyson.mobile.android.resources.view.b.d(dysonSeekArc.getProgress(), i13));
            this.e = i13;
            this.f15752f = new Paint(dysonSeekArc.mMarkNotchPaint);
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final int a() {
            return this.f15752f.getAlpha();
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void b(Canvas canvas) {
            Object rectF = new RectF();
            Object a13 = j.a(rectF.getClass(), this.f15749a, "mArcRect");
            if (a13 != null) {
                rectF = a13;
            }
            int i13 = this.f15750b;
            int i14 = this.e;
            canvas.drawArc((RectF) rectF, (i13 - (i14 / 2)) - 90, i14, true, this.f15752f);
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void c(int i13) {
            this.f15752f.setAlpha(i13);
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends a {
        public final CharSequence e;

        public e(DysonSeekArc dysonSeekArc, int i13, CharSequence charSequence) {
            super(dysonSeekArc, i13);
            this.e = TextUtils.isEmpty(charSequence) ? String.valueOf(i13) : charSequence;
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final int a() {
            return this.f15749a.mMarkTextPaint.getAlpha();
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void b(Canvas canvas) {
            DysonSeekArc dysonSeekArc = this.f15749a;
            Resources resources = dysonSeekArc.getResources();
            PointF xy2 = dysonSeekArc.getXY(this.f15750b, 0);
            PointF xy3 = dysonSeekArc.getXY(this.f15750b, dysonSeekArc.mRadiusExtendNotchPx);
            PointF xy4 = dysonSeekArc.getXY(this.f15750b, dysonSeekArc.mRadiusExtendTextPx);
            canvas.drawLine(xy2.x, xy2.y, xy3.x, xy3.y, dysonSeekArc.mMarkNotchPaint);
            dysonSeekArc.mMarkTextPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.dial_extension_numeric_text_size));
            CharSequence charSequence = this.e;
            String replaceAll = charSequence.toString().replaceAll("[^([0-9][0-9])|°]", "");
            String replaceAll2 = charSequence.toString().replaceAll("[^A-Za-z]", "");
            canvas.drawText(replaceAll, 0, replaceAll.length(), xy4.x, xy4.y, (Paint) dysonSeekArc.mMarkTextPaint);
            dysonSeekArc.mMarkTextPaint.setTextSize(resources.getDimensionPixelSize(R.dimen.dial_extension_char_text_size));
            canvas.drawText(replaceAll2, 0, replaceAll2.length(), xy4.x + ((int) dysonSeekArc.mMarkTextPaint.measureText(replaceAll)) + 6.0f, xy4.y, (Paint) dysonSeekArc.mMarkTextPaint);
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void c(int i13) {
            DysonSeekArc dysonSeekArc = this.f15749a;
            dysonSeekArc.mMarkNotchPaint.setAlpha(i13);
            dysonSeekArc.mMarkTextPaint.setAlpha(i13);
        }
    }

    public a(DysonSeekArc dysonSeekArc, int i13) {
        this.f15749a = dysonSeekArc;
        this.f15750b = i13;
    }

    public abstract int a();

    public abstract void b(Canvas canvas);

    public abstract void c(int i13);

    /* loaded from: classes3.dex */
    public static class d extends a {
        public final Drawable e;

        /* renamed from: f  reason: collision with root package name */
        public final int f15753f;

        public d(DysonSeekArc dysonSeekArc, int i13, Drawable drawable) {
            super(dysonSeekArc, i13);
            this.e = drawable;
            this.f15753f = Math.abs(this.f15749a.getArcCenter().y - ((int) this.f15749a.getXY(0.0f, 0).y));
        }

        public static Drawable d(Resources resources, int i13) {
            Drawable drawable = resources.getDrawable(i13);
            if (drawable != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                drawable.setBounds(-intrinsicWidth, -intrinsicHeight, intrinsicWidth, intrinsicHeight);
                return drawable;
            }
            throw new Resources.NotFoundException(s.c("no Drawable found for the ID ", resources.getResourceName(i13)));
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final int a() {
            return this.e.getAlpha();
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void b(Canvas canvas) {
            Drawable drawable = this.e;
            int height = (drawable.getBounds().height() / 2) - this.f15753f;
            PointF xy2 = this.f15749a.getXY(this.f15750b, height);
            canvas.save();
            canvas.translate(xy2.x, xy2.y);
            canvas.rotate(this.f15750b - 180);
            drawable.draw(canvas);
            canvas.restore();
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void c(int i13) {
            this.e.setAlpha(i13);
        }

        public d(DysonSeekArc dysonSeekArc, int i13, int i14) {
            this(dysonSeekArc, i13, d(dysonSeekArc.getResources(), i14));
        }

        public d(DysonSeekArc dysonSeekArc, int i13) {
            this(dysonSeekArc, dysonSeekArc.getProgress(), i13);
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends a {
        public final Paint e;

        /* renamed from: f  reason: collision with root package name */
        public final Path f15754f;

        public f(DysonSeekArc dysonSeekArc, int i13, Paint paint) {
            super(dysonSeekArc, i13);
            this.f15754f = new Path();
            if (paint != null) {
                this.e = paint;
                return;
            }
            Resources resources = dysonSeekArc.getResources();
            Paint paint2 = new Paint(1);
            this.e = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(resources.getColor(R.color.white));
            paint2.setStrokeWidth(resources.getDimensionPixelSize(R.dimen.xxsmall_margin));
            paint2.setPathEffect(new DashPathEffect(new float[]{resources.getDimensionPixelSize(R.dimen.xxxsmall_margin), resources.getDimensionPixelSize(R.dimen.xxsmall_margin)}, 0.0f));
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final int a() {
            return this.e.getAlpha();
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void b(Canvas canvas) {
            DysonSeekArc dysonSeekArc = this.f15749a;
            Point arcCenter = dysonSeekArc.getArcCenter();
            PointF xy2 = dysonSeekArc.getXY(this.f15750b, 0);
            Path path = this.f15754f;
            path.moveTo(arcCenter.x, arcCenter.y);
            path.lineTo(xy2.x, xy2.y);
            canvas.drawPath(path, this.e);
            path.reset();
        }

        @Override // com.dyson.mobile.android.resources.view.a
        public final void c(int i13) {
            this.e.setAlpha(i13);
        }

        public f(DysonSeekArc dysonSeekArc, Paint paint) {
            this(dysonSeekArc, dysonSeekArc.getProgress(), paint);
        }
    }
}
