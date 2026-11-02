package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.dyson.mobile.android.resources.view.BlurringView;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/resources/view/BlurringView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BlurringView extends View {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f15680u = 0;
    public final Object d;
    public final RenderScript e;

    /* renamed from: f  reason: collision with root package name */
    public final ScriptIntrinsicBlur f15681f;

    /* renamed from: g  reason: collision with root package name */
    public Allocation f15682g;

    /* renamed from: h  reason: collision with root package name */
    public Allocation f15683h;

    /* renamed from: i  reason: collision with root package name */
    public int f15684i;

    /* renamed from: j  reason: collision with root package name */
    public int f15685j;

    /* renamed from: k  reason: collision with root package name */
    public View f15686k;

    /* renamed from: l  reason: collision with root package name */
    public int f15687l;

    /* renamed from: m  reason: collision with root package name */
    public int f15688m;

    /* renamed from: n  reason: collision with root package name */
    public Bitmap f15689n;

    /* renamed from: o  reason: collision with root package name */
    public Canvas f15690o;

    /* renamed from: p  reason: collision with root package name */
    public final int f15691p;

    /* renamed from: q  reason: collision with root package name */
    public final int f15692q;

    /* renamed from: r  reason: collision with root package name */
    public final int f15693r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f15694s;

    /* renamed from: t  reason: collision with root package name */
    public final at0.a f15695t;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [at0.a] */
    public BlurringView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.d = new Object();
        this.f15695t = new ViewTreeObserver.OnPreDrawListener() { // from class: at0.a
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int i14 = BlurringView.f15680u;
                BlurringView blurringView = BlurringView.this;
                if (blurringView.isDirty()) {
                    return true;
                }
                View view = blurringView.f15686k;
                view.getClass();
                if (view.isDirty() && blurringView.isShown()) {
                    blurringView.invalidate();
                    return true;
                }
                return true;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50078b);
        obtainStyledAttributes.getClass();
        this.f15691p = obtainStyledAttributes.getInt(2, 0);
        this.f15692q = obtainStyledAttributes.getInt(0, 10);
        this.f15693r = obtainStyledAttributes.getInt(1, 4);
        obtainStyledAttributes.recycle();
        RenderScript create = RenderScript.create(context);
        create.getClass();
        this.e = create;
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.getClass();
        this.f15681f = create2;
    }

    public final void a(View view) {
        view.getClass();
        View view2 = this.f15686k;
        at0.a aVar = this.f15695t;
        if (view2 != null && !view2.equals(view)) {
            View view3 = this.f15686k;
            view3.getClass();
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                View view4 = this.f15686k;
                view4.getClass();
                view4.getViewTreeObserver().removeOnPreDrawListener(aVar);
            }
        }
        this.f15686k = view;
        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
        if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
            return;
        }
        View view5 = this.f15686k;
        view5.getClass();
        view5.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f15686k;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            View view2 = this.f15686k;
            view2.getClass();
            view2.getViewTreeObserver().removeOnPreDrawListener(this.f15695t);
        }
        synchronized (this.d) {
            this.e.destroy();
            this.f15681f.destroy();
            Allocation allocation = this.f15682g;
            if (allocation != null) {
                allocation.destroy();
            }
            Allocation allocation2 = this.f15683h;
            if (allocation2 != null) {
                allocation2.destroy();
            }
            f0 f0Var = f0.f36844a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.resources.view.BlurringView.onDraw(android.graphics.Canvas):void");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/resources/view/BlurringView$a;", "", "<init>", "()V", "", "DEFAULT_BLUR_RADIUS", "I", "DEFAULT_DOWN_SCALE_FACTOR", "DEFAULT_OVERLAY_COLOR", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurringView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlurringView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ BlurringView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
