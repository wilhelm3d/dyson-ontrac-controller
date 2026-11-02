package com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.brightcove.player.captioning.TTMLParser;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.R;
import e7.c;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\fJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/a;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", AbstractEvent.INDEX, "Lh12/f0;", "setViewPagerCurrentItem", "(I)V", "Lcu0/a;", "getIconPagerAdapter", "()Lcu0/a;", "selectedIndex", "setCurrentItem", TTMLParser.Attributes.COLOR, "setActiveColor", "setInactiveColor", "b", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a extends HorizontalScrollView {
    public boolean d;
    public final LinearLayout e;

    /* renamed from: f  reason: collision with root package name */
    public int f15892f;

    /* renamed from: g  reason: collision with root package name */
    public int f15893g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15894h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f15895i;

    /* renamed from: j  reason: collision with root package name */
    public int f15896j;

    /* renamed from: k  reason: collision with root package name */
    public float f15897k;

    /* renamed from: l  reason: collision with root package name */
    public int f15898l;

    /* renamed from: m  reason: collision with root package name */
    public EnumC0547a f15899m;

    /* renamed from: n  reason: collision with root package name */
    public Integer f15900n;

    /* renamed from: o  reason: collision with root package name */
    public Integer f15901o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f15902p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15903q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "LEFT", "RIGHT", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class EnumC0547a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ EnumC0547a[] $VALUES;
        public static final EnumC0547a NONE = new EnumC0547a("NONE", 0);
        public static final EnumC0547a LEFT = new EnumC0547a("LEFT", 1);
        public static final EnumC0547a RIGHT = new EnumC0547a("RIGHT", 2);

        private static final /* synthetic */ EnumC0547a[] $values() {
            return new EnumC0547a[]{NONE, LEFT, RIGHT};
        }

        static {
            EnumC0547a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private EnumC0547a(String str, int i13) {
        }

        public static o12.a<EnumC0547a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0547a valueOf(String str) {
            return (EnumC0547a) Enum.valueOf(EnumC0547a.class, str);
        }

        public static EnumC0547a[] values() {
            return (EnumC0547a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "DRAGGING", "SETTLING", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b IDLE = new b("IDLE", 0);
        public static final b DRAGGING = new b("DRAGGING", 1);
        public static final b SETTLING = new b("SETTLING", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{IDLE, DRAGGING, SETTLING};
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LinearLayout linearLayout = new LinearLayout(context);
        this.e = linearLayout;
        this.f15899m = EnumC0547a.NONE;
        b bVar = b.IDLE;
        setHorizontalScrollBarEnabled(false);
        this.f15892f = getResources().getColor(R.color.black);
        this.f15893g = getResources().getColor(R.color.inactiveGrey2);
        this.f15894h = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50100z);
            this.f15892f = obtainStyledAttributes.getColor(0, this.f15892f);
            this.f15893g = obtainStyledAttributes.getColor(2, this.f15893g);
            this.f15894h = obtainStyledAttributes.getDimensionPixelSize(3, this.f15894h);
            this.f15895i = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
        addView(linearLayout, new FrameLayout.LayoutParams(-2, -1, 3));
    }

    public final void a() {
        if (getIconPagerAdapter().getCount() == 1 && this.f15895i) {
            return;
        }
        cu0.a iconPagerAdapter = getIconPagerAdapter();
        iconPagerAdapter.getClass();
        this.f15903q = false;
        LinearLayout linearLayout = this.e;
        linearLayout.removeAllViews();
        int count = iconPagerAdapter.getCount();
        for (int i13 = 0; i13 < count; i13++) {
            ImageView imageView = new ImageView(getContext());
            int i14 = this.f15894h;
            imageView.setPadding(i14, 0, i14, 0);
            imageView.setBaselineAlignBottom(true);
            imageView.setImageDrawable(iconPagerAdapter.b());
            linearLayout.addView(imageView);
        }
        setCurrentItem(this.f15896j);
    }

    public final void b(float f13, int i13) {
        if (i13 != this.f15898l) {
            this.f15898l = i13;
            this.f15899m = EnumC0547a.NONE;
            this.f15897k = 0.0f;
            this.f15900n = null;
            this.f15901o = null;
            this.f15902p = false;
        }
        float f14 = this.f15897k;
        if (f14 > 0.0f && f13 > 0.0f) {
            if (this.f15899m == EnumC0547a.NONE) {
                this.f15899m = f13 > f14 ? EnumC0547a.RIGHT : EnumC0547a.LEFT;
            }
            boolean z13 = this.f15899m == EnumC0547a.RIGHT;
            int i14 = z13 ? i13 : i13 + 1;
            if (z13) {
                i13++;
            }
            float f15 = z13 ? f13 : 1.0f - f13;
            if (i14 >= 0 && i13 >= 0) {
                LinearLayout linearLayout = this.e;
                View childAt = linearLayout.getChildAt(i14);
                childAt.getClass();
                ImageView imageView = (ImageView) childAt;
                View childAt2 = linearLayout.getChildAt(i13);
                childAt2.getClass();
                ImageView imageView2 = (ImageView) childAt2;
                int c13 = c.c(f15, this.f15892f, this.f15893g);
                int c14 = c.c(f15, this.f15893g, this.f15892f);
                imageView.setColorFilter(c13);
                imageView2.setColorFilter(c14);
                int childCount = linearLayout.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    if (i15 != i14 && i15 != i13) {
                        View childAt3 = linearLayout.getChildAt(i15);
                        childAt3.getClass();
                        ((ImageView) childAt3).setColorFilter(this.f15893g);
                    }
                }
                if (this.f15903q) {
                    ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                    layoutParams.getClass();
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    if (this.f15900n == null || this.f15901o == null) {
                        this.f15900n = Integer.valueOf((imageView.getWidth() / 2) + imageView.getLeft());
                        this.f15901o = Integer.valueOf((imageView2.getWidth() / 2) + imageView2.getLeft());
                    }
                    Integer num = this.f15901o;
                    num.getClass();
                    int intValue = num.intValue();
                    Integer num2 = this.f15900n;
                    num2.getClass();
                    int intValue2 = (int) ((intValue - num2.intValue()) * f15);
                    Integer num3 = this.f15900n;
                    num3.getClass();
                    layoutParams2.leftMargin = ((getWidth() / 2) - num3.intValue()) - intValue2;
                    requestLayout();
                }
            }
        }
        this.f15897k = f13;
    }

    public abstract cu0.a getIconPagerAdapter();

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (getWidth() == 0 || this.d) {
            return;
        }
        this.d = true;
        setCurrentItem(this.f15896j);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (motionEvent.getAction() == 2) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setActiveColor(int i13) {
        this.f15892f = i13;
        int i14 = this.f15896j;
        if (i14 >= 0) {
            View childAt = this.e.getChildAt(i14);
            childAt.getClass();
            ((ImageView) childAt).setColorFilter(this.f15892f);
        }
    }

    public final void setCurrentItem(int i13) {
        int width;
        int width2;
        if (getIconPagerAdapter().getCount() == 1 && this.f15895i) {
            return;
        }
        this.f15896j = i13;
        setViewPagerCurrentItem(i13);
        LinearLayout linearLayout = this.e;
        int childCount = linearLayout.getChildCount();
        ImageView imageView = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = linearLayout.getChildAt(i14);
            childAt.getClass();
            ImageView imageView2 = (ImageView) childAt;
            if (i13 == i14) {
                imageView2.setColorFilter(this.f15892f);
                imageView = imageView2;
            } else {
                imageView2.setColorFilter(this.f15893g);
            }
        }
        if (!this.f15902p && imageView != null) {
            if (this.f15903q) {
                width = (getWidth() / 2) - imageView.getLeft();
                width2 = imageView.getWidth() / 2;
            } else {
                width = getWidth() / 2;
                width2 = linearLayout.getWidth() / 2;
            }
            int i15 = width - width2;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.getClass();
            ((FrameLayout.LayoutParams) layoutParams).leftMargin = i15;
        }
        requestLayout();
    }

    public final void setInactiveColor(int i13) {
        this.f15893g = i13;
        int i14 = this.f15896j;
        if (i14 >= 0) {
            LinearLayout linearLayout = this.e;
            int childCount = linearLayout.getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                if (i15 != i14) {
                    View childAt = linearLayout.getChildAt(i15);
                    childAt.getClass();
                    ((ImageView) childAt).setColorFilter(this.f15893g);
                }
            }
        }
    }

    public abstract void setViewPagerCurrentItem(int i13);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        this(context, null, 2, null);
        context.getClass();
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet);
    }
}
