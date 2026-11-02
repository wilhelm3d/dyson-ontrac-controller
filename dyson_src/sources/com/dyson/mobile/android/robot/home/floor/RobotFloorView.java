package com.dyson.mobile.android.robot.home.floor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.home.robotimage.RobotImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import se1.d;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/robot/home/floor/RobotFloorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/dyson/mobile/android/robot/home/robotimage/RobotImageView;", "d", "Lcom/dyson/mobile/android/robot/home/robotimage/RobotImageView;", "getScaleToView", "()Lcom/dyson/mobile/android/robot/home/robotimage/RobotImageView;", "setScaleToView", "(Lcom/dyson/mobile/android/robot/home/robotimage/RobotImageView;)V", "scaleToView", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotFloorView extends ConstraintLayout {

    /* renamed from: g  reason: collision with root package name */
    public static Bitmap f16056g;
    public RobotImageView d;
    public double e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16057f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/home/floor/RobotFloorView$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            RobotFloorView robotFloorView = RobotFloorView.this;
            if (robotFloorView.f16057f.getHeight() <= 0 || robotFloorView.f16057f.getWidth() <= 0) {
                return;
            }
            robotFloorView.f16057f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            RobotImageView robotImageView = robotFloorView.d;
            if (robotImageView == null) {
                robotFloorView.b();
                return;
            }
            robotFloorView.e = robotImageView.getHeight() / robotImageView.getRobotImageIntrinsicHeight();
            robotFloorView.b();
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotFloorView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.e = 1.0d;
        Object systemService = context.getSystemService("layout_inflater");
        systemService.getClass();
        ((LayoutInflater) systemService).inflate(R.layout.layout_robot_floor, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.floor);
        findViewById.getClass();
        ImageView imageView = (ImageView) findViewById;
        this.f16057f = imageView;
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public final void b() {
        Bitmap bitmap = f16056g;
        ImageView imageView = this.f16057f;
        if (bitmap == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(getResources(), 2131231698, options);
            int ceil = (int) Math.ceil(options.outWidth * this.e);
            int ceil2 = (int) Math.ceil(options.outHeight * this.e);
            d.f76032a.getClass();
            options.inSampleSize = d.a(options, ceil, ceil2);
            options.inJustDecodeBounds = false;
            Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), 2131231698, options);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, ceil, ceil2, false);
            createScaledBitmap.getClass();
            if (!createScaledBitmap.equals(decodeResource)) {
                decodeResource.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            Canvas canvas = new Canvas(createBitmap);
            double width = (imageView.getWidth() / 2.0d) - (createScaledBitmap.getWidth() / 2.0d);
            double height = (imageView.getHeight() / 2.0d) - (createScaledBitmap.getHeight() / 2.0d);
            while (width > 0.0d) {
                width -= createScaledBitmap.getWidth();
            }
            while (height > 0.0d) {
                height -= createScaledBitmap.getHeight();
            }
            loop2: while (true) {
                for (double d = width; d < imageView.getWidth() && height < imageView.getHeight(); d += createScaledBitmap.getWidth()) {
                    canvas.drawBitmap(createScaledBitmap, (float) d, (float) height, (Paint) null);
                    if (createScaledBitmap.getWidth() + d >= imageView.getWidth()) {
                        break;
                    }
                }
                height += createScaledBitmap.getHeight();
            }
            imageView.setImageDrawable(new BitmapDrawable(getResources(), createBitmap));
            createScaledBitmap.recycle();
            f16056g = createBitmap;
        }
        imageView.setImageDrawable(new BitmapDrawable(getResources(), f16056g));
    }

    public final RobotImageView getScaleToView() {
        return this.d;
    }

    public final void setScaleToView(RobotImageView robotImageView) {
        this.d = robotImageView;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/home/floor/RobotFloorView$b;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "floorBitmap", "Landroid/graphics/Bitmap;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotFloorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RobotFloorView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ RobotFloorView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
