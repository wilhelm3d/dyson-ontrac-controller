package com.dyson.mobile.android.robot.home.robotimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.databinding.DataBinderMapperImpl;
import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lw0.b;
import q8.g;
import q8.t;
import x12.r;
import yu0.o4;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/robot/home/robotimage/RobotImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llw0/b;", "value", "i", "Llw0/b;", "getLayers", "()Llw0/b;", "setLayers", "(Llw0/b;)V", "layers", "getRobotImageIntrinsicHeight", "()I", "robotImageIntrinsicHeight", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotImageView extends FrameLayout {
    public final Paint d;
    public final Paint e;

    /* renamed from: f  reason: collision with root package name */
    public final us0.a f16059f;

    /* renamed from: g  reason: collision with root package name */
    public final us0.a f16060g;

    /* renamed from: h  reason: collision with root package name */
    public final us0.a f16061h;

    /* renamed from: i  reason: collision with root package name */
    public b f16062i;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.e = paint2;
        LayoutInflater from = LayoutInflater.from(context);
        int i14 = o4.f90840g;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        o4 o4Var = (o4) t.inflateInternal(from, R.layout.view_robot_image, this, true, null);
        o4Var.getClass();
        us0.a aVar = new us0.a();
        aVar.e = 1200L;
        aVar.f82576f = new DecelerateInterpolator();
        this.f16059f = aVar;
        us0.a aVar2 = new us0.a();
        aVar2.e = 1200L;
        aVar2.f82576f = new DecelerateInterpolator();
        aVar2.d = false;
        this.f16060g = aVar2;
        us0.a aVar3 = new us0.a();
        aVar3.e = 1200L;
        aVar3.f82576f = new DecelerateInterpolator();
        this.f16061h = aVar3;
        o4Var.f90841f.setImageDrawable(aVar);
        o4Var.d.setImageDrawable(aVar2);
        o4Var.e.setImageDrawable(aVar3);
    }

    public final BitmapDrawable a(int i13, Integer num) {
        Bitmap b13 = b(Integer.valueOf(i13));
        if (b13 == null) {
            return null;
        }
        Bitmap b14 = num != null ? b(num) : null;
        Canvas canvas = new Canvas(b13);
        canvas.drawBitmap(b13, 0.0f, 0.0f, this.d);
        if (b14 != null) {
            canvas.drawBitmap(b14, 0.0f, 0.0f, this.e);
        }
        if (b14 != null) {
            b14.recycle();
        }
        return new BitmapDrawable(getResources(), b13);
    }

    public final Bitmap b(Integer num) {
        Drawable c13 = c(num);
        if (c13 != null) {
            Bitmap createBitmap = Bitmap.createBitmap(c13.getIntrinsicWidth(), c13.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            Canvas canvas = new Canvas(createBitmap);
            c13.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            c13.draw(canvas);
            return createBitmap;
        }
        return null;
    }

    public final Drawable c(Integer num) {
        if (num != null) {
            Drawable e = c7.a.e(getContext(), num.intValue());
            if (e != null) {
                e.setAlpha(255);
                return e;
            }
        }
        return null;
    }

    public final b getLayers() {
        return this.f16062i;
    }

    public final int getRobotImageIntrinsicHeight() {
        return this.f16060g.getIntrinsicHeight();
    }

    public final void setLayers(b bVar) {
        us0.b bVar2;
        b bVar3 = this.f16062i;
        this.f16062i = bVar;
        if (bVar != null) {
            Integer num = bVar.d;
            boolean z13 = bVar.f52775c;
            Integer num2 = bVar.f52774b;
            int i13 = bVar.f52773a;
            us0.a aVar = this.f16061h;
            us0.a aVar2 = this.f16060g;
            us0.a aVar3 = this.f16059f;
            if (bVar3 == null) {
                aVar3.b(c(num2));
                aVar2.b(c(Integer.valueOf(i13)));
                if (z13) {
                    aVar.b(a(i13, num));
                    return;
                }
                return;
            }
            if (bVar3.f52773a != i13) {
                Drawable c13 = c(Integer.valueOf(i13));
                int i14 = us0.a.f82572g;
                bVar2 = aVar2.a(c13, null);
            } else {
                bVar2 = null;
            }
            if (!r.c(bVar3.d, num) || bVar3.f52775c != z13) {
                aVar.a(z13 ? a(i13, num) : null, bVar2);
            }
            if (r.c(bVar3.f52774b, num2)) {
                return;
            }
            aVar3.a(c(num2), bVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/home/robotimage/RobotImageView$a;", "", "<init>", "()V", "", "ANIMATION_DURATION", "J", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotImageView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RobotImageView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
