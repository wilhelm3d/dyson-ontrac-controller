package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import hx.v;
import i12.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import ma.e;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonCropImageView;", "Lcom/dyson/mobile/android/resources/view/DysonImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/dyson/mobile/android/resources/view/DysonCropImageView$b;", "f", "Lcom/dyson/mobile/android/resources/view/DysonCropImageView$b;", "getFitType", "()Lcom/dyson/mobile/android/resources/view/DysonCropImageView$b;", "fitType", "Lcom/dyson/mobile/android/resources/view/DysonCropImageView$a;", "g", "Lcom/dyson/mobile/android/resources/view/DysonCropImageView$a;", "getAnchor", "()Lcom/dyson/mobile/android/resources/view/DysonCropImageView$a;", "anchor", "b", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class DysonCropImageView extends DysonImageView {

    /* renamed from: f  reason: collision with root package name */
    public final b f15705f;

    /* renamed from: g  reason: collision with root package name */
    public final a f15706g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonCropImageView$a;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a TOP = new a("TOP", 0);
        public static final a BOTTOM = new a("BOTTOM", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{TOP, BOTTOM};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private a(String str, int i13) {
        }

        public static o12.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonCropImageView$b;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "WIDTH", "HEIGHT", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b NONE = new b("NONE", 0);
        public static final b WIDTH = new b("WIDTH", 1);
        public static final b HEIGHT = new b("HEIGHT", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{NONE, WIDTH, HEIGHT};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private b(String str, int i13) {
        }

        public static o12.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15707a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f15708b;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.WIDTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.HEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f15707a = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f15708b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonCropImageView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        setScaleType(ImageView.ScaleType.MATRIX);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50083i, i13, 0);
        b bVar = b.NONE;
        b bVar2 = (b) q.G(obtainStyledAttributes.getInt(1, bVar.ordinal()), b.values());
        this.f15705f = bVar2 != null ? bVar2 : bVar;
        a aVar = a.TOP;
        a aVar2 = (a) q.G(obtainStyledAttributes.getInt(0, aVar.ordinal()), a.values());
        this.f15706g = aVar2 != null ? aVar2 : aVar;
        obtainStyledAttributes.recycle();
    }

    public final void c() {
        float f13;
        float width;
        float width2;
        if (getDrawable() == null) {
            return;
        }
        RectF rectF = new RectF(getDrawable().copyBounds());
        int i13 = c.f15707a[this.f15705f.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                width = getWidth();
                width2 = rectF.width();
            } else if (i13 != 3) {
                e.o();
                return;
            } else {
                width = getHeight();
                width2 = rectF.height();
            }
            f13 = width / width2;
        } else {
            f13 = 1.0f;
        }
        rectF.set(rectF.left * f13, rectF.top * f13, rectF.right * f13, rectF.bottom * f13);
        Matrix matrix = getMatrix();
        matrix.setScale(f13, f13, 0.0f, 0.0f);
        float width3 = (getWidth() - rectF.width()) / 2.0f;
        int i14 = c.f15708b[this.f15706g.ordinal()];
        if (i14 == 1) {
            matrix.postTranslate(width3, 0.0f);
        } else if (i14 != 2) {
            e.o();
            return;
        } else {
            matrix.postTranslate(width3, getHeight() - rectF.height());
        }
        setImageMatrix(matrix);
    }

    public final a getAnchor() {
        return this.f15706g;
    }

    public final b getFitType() {
        return this.f15705f;
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        c();
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i13, int i14, int i15, int i16) {
        c();
        return super.setFrame(i13, i14, i15, i16);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonCropImageView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonCropImageView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
