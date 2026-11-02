package com.dyson.mobile.android.light.home;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import d7.g;
import h12.f0;
import je0.i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import se1.d;
import yd0.s;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010!\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/dyson/mobile/android/light/home/LightHomeBackground;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "l", "I", "getBackgroundColorTint", "()I", "setBackgroundColorTint", "(I)V", "backgroundColorTint", "", "m", "F", "getAlphaValue", "()F", "setAlphaValue", "(F)V", "alphaValue", "", "n", "Z", "getLightGradient", "()Z", "setLightGradient", "(Z)V", "lightGradient", "Landroid/graphics/Point;", "getScreenSize", "()Landroid/graphics/Point;", "screenSize", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightHomeBackground extends ConstraintLayout {
    public final Bitmap d;
    public final Bitmap e;

    /* renamed from: f  reason: collision with root package name */
    public final Bitmap f14876f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap f14877g;

    /* renamed from: h  reason: collision with root package name */
    public final Bitmap f14878h;

    /* renamed from: i  reason: collision with root package name */
    public final int f14879i;

    /* renamed from: j  reason: collision with root package name */
    public final int f14880j;

    /* renamed from: k  reason: collision with root package name */
    public final i0 f14881k;

    /* renamed from: l  reason: collision with root package name */
    public int f14882l;

    /* renamed from: m  reason: collision with root package name */
    public float f14883m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14884n;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LightHomeBackground(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.f14881k = i0.a(LayoutInflater.from(context), this);
        this.f14882l = c7.a.c(context, R.color.color_daylight);
        this.f14883m = 100.0f;
        this.f14884n = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f89800a);
            obtainStyledAttributes.getClass();
            obtainStyledAttributes.getInt(0, 255);
            Resources resources = getResources();
            ThreadLocal<TypedValue> threadLocal = g.f23012a;
            obtainStyledAttributes.getColor(1, resources.getColor(R.color.color_daylight, null));
            obtainStyledAttributes.recycle();
        }
        this.f14879i = getScreenSize().x;
        int i14 = getScreenSize().y;
        this.f14880j = i14;
        int i15 = this.f14879i;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i15, i14, config);
        this.d = createBitmap;
        if (createBitmap != null) {
            Canvas canvas = new Canvas(createBitmap);
            Rect rect = new Rect(0, 0, this.f14879i, this.f14880j);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL);
            f0 f0Var = f0.f36844a;
            canvas.drawRect(rect, paint);
        } else {
            Logger.b("Failed to create the background bitmap", null);
        }
        d dVar = d.f76032a;
        Resources resources2 = getResources();
        resources2.getClass();
        int i16 = this.f14879i;
        int i17 = this.f14880j;
        dVar.getClass();
        Bitmap b13 = d.b(resources2, R.drawable.gradient_day, i16, i17);
        this.f14876f = b13;
        this.f14876f = Bitmap.createScaledBitmap(b13, this.f14879i, this.f14880j, false);
        Resources resources3 = getResources();
        resources3.getClass();
        Bitmap b14 = d.b(resources3, R.drawable.gradient_night, this.f14879i, this.f14880j);
        this.f14877g = b14;
        this.f14877g = Bitmap.createScaledBitmap(b14, this.f14879i, this.f14880j, false);
        Resources resources4 = getResources();
        resources4.getClass();
        Bitmap b15 = d.b(resources4, R.drawable.white_spot, this.f14879i, this.f14880j);
        this.e = b15;
        this.e = Bitmap.createScaledBitmap(b15, this.f14879i, this.f14880j, false);
        this.f14878h = Bitmap.createBitmap(this.f14879i, this.f14880j, config);
    }

    private final Point getScreenSize() {
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("window") : null;
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public final Bitmap b(float f13, int i13, boolean z13) {
        Bitmap bitmap = this.f14878h;
        bitmap.getClass();
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        Bitmap bitmap2 = this.d;
        bitmap2.getClass();
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
        Bitmap bitmap3 = z13 ? this.f14876f : this.f14877g;
        bitmap3.getClass();
        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.MULTIPLY));
        paint.setColor(i13);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(new Rect(0, 0, this.f14879i, this.f14880j), paint);
        paint.setXfermode(null);
        paint.setAlpha((int) (255.0f * f13));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        Bitmap bitmap4 = this.e;
        bitmap4.getClass();
        canvas.drawBitmap(bitmap4, 0.0f, 0.0f, paint);
        return bitmap;
    }

    public final float getAlphaValue() {
        return this.f14883m;
    }

    public final int getBackgroundColorTint() {
        return this.f14882l;
    }

    public final boolean getLightGradient() {
        return this.f14884n;
    }

    public final void setAlphaValue(float f13) {
        this.f14883m = f13;
        i0 i0Var = this.f14881k;
        i0Var.f44633a.setImageBitmap(null);
        Bitmap b13 = b(f13, this.f14882l, this.f14884n);
        i0Var.f44633a.setScaleType(ImageView.ScaleType.FIT_XY);
        i0Var.f44633a.setImageBitmap(b13);
    }

    public final void setBackgroundColorTint(int i13) {
        this.f14882l = i13;
        i0 i0Var = this.f14881k;
        i0Var.f44633a.setImageBitmap(null);
        Bitmap b13 = b(this.f14883m, i13, this.f14884n);
        i0Var.f44633a.setScaleType(ImageView.ScaleType.FIT_XY);
        i0Var.f44633a.setImageBitmap(b13);
    }

    public final void setLightGradient(boolean z13) {
        this.f14884n = z13;
        i0 i0Var = this.f14881k;
        i0Var.f44633a.setImageBitmap(null);
        Bitmap b13 = b(this.f14883m, this.f14882l, z13);
        i0Var.f44633a.setScaleType(ImageView.ScaleType.FIT_XY);
        i0Var.f44633a.setImageBitmap(b13);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/home/LightHomeBackground$a;", "", "<init>", "()V", "", "DEFAULT_ALPHA_VALUE", "I", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightHomeBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LightHomeBackground(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ LightHomeBackground(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
