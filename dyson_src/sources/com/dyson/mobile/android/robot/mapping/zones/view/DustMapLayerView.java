package com.dyson.mobile.android.robot.mapping.zones.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import c02.a;
import com.dyson.mobile.android.robot.mapping.zones.view.DustMapLayerView;
import h12.f0;
import java.util.concurrent.Callable;
import jz1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import mz1.f;
import ow0.i;
import sz1.p;
import xw0.g;
import xw0.g0;
import xw0.u;
import ym0.e;
import yw0.b;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/dyson/mobile/android/robot/mapping/zones/view/DustMapLayerView;", "Lyw0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lxw0/g0;", "e", "Lxw0/g0;", "getListener", "()Lxw0/g0;", "setListener", "(Lxw0/g0;)V", "listener", "Lxw0/u;", "value", "g", "Lxw0/u;", "getDustMapLayer", "()Lxw0/u;", "setDustMapLayer", "(Lxw0/u;)V", "dustMapLayer", "Landroid/graphics/Bitmap;", "h", "Landroid/graphics/Bitmap;", "setDustMapBitmap", "(Landroid/graphics/Bitmap;)V", "dustMapBitmap", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DustMapLayerView extends b {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f16091i = 0;
    public g0 e;

    /* renamed from: f  reason: collision with root package name */
    public f f16092f;

    /* renamed from: g  reason: collision with root package name */
    public u f16093g;

    /* renamed from: h  reason: collision with root package name */
    public Bitmap f16094h;

    public /* synthetic */ DustMapLayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    public static f0 b(DustMapLayerView dustMapLayerView, Bitmap bitmap) {
        dustMapLayerView.setDustMapBitmap(bitmap);
        return f0.f36844a;
    }

    private final void setDustMapBitmap(Bitmap bitmap) {
        this.f16094h = bitmap;
        invalidate();
    }

    public final void c(final u uVar, final int i13, final int i14) {
        f fVar = this.f16092f;
        if (fVar != null) {
            d.dispose(fVar);
        }
        if (i13 == 0 || i14 == 0) {
            return;
        }
        Callable callable = new Callable(i13, i14, this, uVar) { // from class: yw0.a
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ u f91079f;

            {
                this.f91079f = uVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i15 = DustMapLayerView.f16091i;
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                Bitmap createBitmap = Bitmap.createBitmap(this.d, this.e, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                u uVar2 = this.f91079f;
                i iVar = uVar2.f88179b;
                if (iVar.b()) {
                    canvas.translate(iVar.f61692a, iVar.f61693b);
                }
                if (iVar.a()) {
                    canvas.rotate(iVar.f61694c, 0.0f, iVar.d);
                }
                for (g gVar : uVar2.f88178a) {
                    Rect rect = gVar.f88105a;
                    paint.setColor(gVar.f88106b);
                    f0 f0Var = f0.f36844a;
                    canvas.drawRect(rect, paint);
                }
                return createBitmap;
            }
        };
        b.a aVar = kz1.b.f50218a;
        this.f16092f = (f) new p(callable).r(a.f10004c).j(fz1.a.a()).p(new e(new yj0.f(this, 5), 8), new e(new y90.d(15), 9));
    }

    public final u getDustMapLayer() {
        return this.f16093g;
    }

    public final g0 getListener() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f16092f;
        if (fVar != null) {
            d.dispose(fVar);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        Bitmap bitmap = this.f16094h;
        if (bitmap != null) {
            Matrix canvasMatrix = getCanvasMatrix();
            int save = canvas.save();
            canvas.concat(canvasMatrix);
            try {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        g0 g0Var = this.e;
        if (g0Var != null) {
            i17 = i13;
            i18 = i14;
            g0Var.b(new xw0.f0(i17, i18, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom()));
        } else {
            i17 = i13;
            i18 = i14;
        }
        u uVar = this.f16093g;
        if (uVar != null) {
            c(uVar, i17, i18);
        }
        super.onSizeChanged(i17, i18, i15, i16);
    }

    public final void setDustMapLayer(u uVar) {
        this.f16093g = uVar;
        if (uVar != null) {
            c(uVar, getWidth(), getHeight());
        }
    }

    public final void setListener(g0 g0Var) {
        this.e = g0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DustMapLayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DustMapLayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DustMapLayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
