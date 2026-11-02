package com.dyson.mobile.android.resources.view.zoompan;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.dyson.mobile.android.resources.view.zoompan.ZoomPanLayout;
import d22.j;
import d22.k;
import d22.p;
import h12.m;
import h12.t;
import i12.c0;
import i12.k0;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xr1.f;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/resources/view/zoompan/ZoomPanLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "d", "F", "getMinimumScale", "()F", "setMinimumScale", "(F)V", "minimumScale", "e", "getMaximumScale", "setMaximumScale", "maximumScale", "", "getHasClickableChildren", "()Z", "hasClickableChildren", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoomPanLayout extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f15904j = 0;
    public final float d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public final f f15905f;

    /* renamed from: g  reason: collision with root package name */
    public final t f15906g;

    /* renamed from: h  reason: collision with root package name */
    public final t f15907h;

    /* renamed from: i  reason: collision with root package name */
    public final GestureDetector f15908i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/zoompan/ZoomPanLayout$b", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            motionEvent.getClass();
            ZoomPanLayout zoomPanLayout = ZoomPanLayout.this;
            f fVar = zoomPanLayout.f15905f;
            bs1.c cVar = fVar.f87957f;
            as1.b bVar = fVar.f87958g;
            if (bVar.e() / cVar.f8403c <= 1.0f) {
                float x13 = motionEvent.getX();
                float y13 = motionEvent.getY();
                float width = x13 / zoomPanLayout.getWidth();
                float height = y13 / zoomPanLayout.getHeight();
                fVar.c(1.5f, -((((zoomPanLayout.getWidth() * 1.5f) - zoomPanLayout.getWidth()) / 1.5f) * width), -((((zoomPanLayout.getHeight() * 1.5f) - zoomPanLayout.getHeight()) / 1.5f) * height));
                return true;
            }
            bs1.c cVar2 = fVar.f87957f;
            float d = p.d(1.0f, cVar2.d() / cVar2.f8403c, cVar2.c() / cVar2.f8403c);
            float f13 = cVar2.f8403c * d;
            fVar.c(d, -((bVar.f5416f.width() / 2.0f) - ((bVar.f5420j / f13) / 2.0f)), -((bVar.f5416f.height() / 2.0f) - ((bVar.f5421k / f13) / 2.0f)));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            motionEvent.getClass();
            return ZoomPanLayout.this.performClick();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/zoompan/ZoomPanLayout$c", "Lxr1/f$c;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements f.c {
        public c() {
        }

        @Override // xr1.f.c
        public final void a(f fVar) {
        }

        @Override // xr1.f.c
        public final void b(f fVar, Matrix matrix) {
            matrix.getClass();
            ZoomPanLayout zoomPanLayout = ZoomPanLayout.this;
            Iterator<Integer> it = p.n(0, zoomPanLayout.getChildCount()).iterator();
            while (((j) it).f22663f) {
                View childAt = zoomPanLayout.getChildAt(((k0) it).nextInt());
                du0.a aVar = childAt instanceof du0.a ? (du0.a) childAt : null;
                if (aVar != null) {
                    aVar.a(matrix);
                }
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.d = 1.0f;
        this.e = 2.5f;
        c cVar = new c();
        f fVar = new f(context, this);
        fVar.e(1.0f);
        fVar.d(2.5f);
        fVar.b(cVar);
        bs1.b bVar = fVar.e;
        bVar.f8393c = false;
        bVar.d = false;
        this.f15905f = fVar;
        this.f15906g = m.b(new w12.a(this) { // from class: du0.b
            public final /* synthetic */ ZoomPanLayout e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i14 = r2;
                ZoomPanLayout zoomPanLayout = this.e;
                switch (i14) {
                    case 0:
                        int i15 = ZoomPanLayout.f15904j;
                        k n13 = p.n(0, zoomPanLayout.getChildCount());
                        ArrayList arrayList = new ArrayList(u.o(n13, 10));
                        Iterator<Integer> it = n13.iterator();
                        while (((j) it).f22663f) {
                            arrayList.add(zoomPanLayout.getChildAt(((k0) it).nextInt()));
                        }
                        return arrayList;
                    default:
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : (List) zoomPanLayout.f15906g.getValue()) {
                            if (((View) obj).isClickable()) {
                                arrayList2.add(obj);
                            }
                        }
                        return arrayList2;
                }
            }
        });
        this.f15907h = m.b(new w12.a(this) { // from class: du0.b
            public final /* synthetic */ ZoomPanLayout e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i14 = r2;
                ZoomPanLayout zoomPanLayout = this.e;
                switch (i14) {
                    case 0:
                        int i15 = ZoomPanLayout.f15904j;
                        k n13 = p.n(0, zoomPanLayout.getChildCount());
                        ArrayList arrayList = new ArrayList(u.o(n13, 10));
                        Iterator<Integer> it = n13.iterator();
                        while (((j) it).f22663f) {
                            arrayList.add(zoomPanLayout.getChildAt(((k0) it).nextInt()));
                        }
                        return arrayList;
                    default:
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : (List) zoomPanLayout.f15906g.getValue()) {
                            if (((View) obj).isClickable()) {
                                arrayList2.add(obj);
                            }
                        }
                        return arrayList2;
                }
            }
        });
        this.f15908i = new GestureDetector(context, new b());
    }

    private final boolean getHasClickableChildren() {
        return !((List) this.f15907h.getValue()).isEmpty();
    }

    public final float getMaximumScale() {
        return this.e;
    }

    public final float getMinimumScale() {
        return this.d;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        f fVar = this.f15905f;
        fVar.getClass();
        yr1.a aVar = fVar.d;
        aVar.getClass();
        return aVar.a(motionEvent) > 1 || getHasClickableChildren() || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        float f13 = i13;
        float f14 = i14;
        as1.b bVar = this.f15905f.f87958g;
        RectF rectF = bVar.f5416f;
        if (f13 <= 0.0f || f14 <= 0.0f) {
            return;
        }
        if (rectF.width() == f13 && rectF.height() == f14) {
            return;
        }
        float e = bVar.e();
        rectF.set(0.0f, 0.0f, f13, f14);
        bVar.f(e);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction();
        f fVar = this.f15905f;
        if (action == 2) {
            if (fVar.f87958g.e() / fVar.f87957f.f8403c > 1.0f) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        View view = (View) c0.P((List) this.f15907h.getValue());
        if ((view == null || !view.onTouchEvent(motionEvent)) && !this.f15908i.onTouchEvent(motionEvent)) {
            fVar.getClass();
            yr1.a aVar = fVar.d;
            aVar.getClass();
            if (aVar.a(motionEvent) <= 0 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        View view = (View) c0.P((List) this.f15907h.getValue());
        return (view != null && view.performClick()) || super.performClick();
    }

    public final void setMaximumScale(float f13) {
        this.f15905f.d(f13);
    }

    public final void setMinimumScale(float f13) {
        this.f15905f.e(f13);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/resources/view/zoompan/ZoomPanLayout$a;", "", "<init>", "()V", "", "DOUBLE_TAP_ZOOM_FACTOR", "F", "NO_ZOOM_FACTOR", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomPanLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomPanLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ZoomPanLayout(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
