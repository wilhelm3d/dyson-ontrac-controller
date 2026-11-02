package com.dyson.mobile.android.resources.view.viewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import bu0.b;
import bu0.c;
import com.dyson.mobile.android.resources.view.viewpager.ViewPagerTabLayout;
import d22.p;
import i12.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q7.j0;
import q7.t0;
import zn1.e;
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/dyson/mobile/android/resources/view/viewpager/ViewPagerTabLayout;", "Lzn1/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lob/a;", "adapter", "Lh12/f0;", "setViewPagerAdapter", "(Lob/a;)V", "Landroidx/viewpager/widget/ViewPager;", "viewPager", "setupWithViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "", "value", "d0", "Z", "getAreTabsInteractive", "()Z", "setAreTabsInteractive", "(Z)V", "areTabsInteractive", "Landroid/view/ViewGroup;", "getTabStrip", "()Landroid/view/ViewGroup;", "tabStrip", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewPagerTabLayout extends e {

    /* renamed from: c1  reason: collision with root package name */
    public static final /* synthetic */ int f15878c1 = 0;

    /* renamed from: b1  reason: collision with root package name */
    public final a f15879b1;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f15880d0;

    /* renamed from: e0  reason: collision with root package name */
    public ViewPager f15881e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f15882f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f15883g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f15884h0;

    /* renamed from: t0  reason: collision with root package name */
    public final c f15885t0;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/viewpager/ViewPagerTabLayout$a", "Landroid/database/DataSetObserver;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPagerTabLayout viewPagerTabLayout = ViewPagerTabLayout.this;
            ViewPager viewPager = viewPagerTabLayout.f15881e0;
            ob.a adapter = viewPager != null ? viewPager.getAdapter() : null;
            b bVar = adapter instanceof b ? (b) adapter : null;
            if (bVar != null) {
                viewPagerTabLayout.s(bVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v3, types: [bu0.c] */
    public ViewPagerTabLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.f15880d0 = true;
        this.f15884h0 = -1;
        this.f15885t0 = new ViewPager.i() { // from class: bu0.c
            @Override // androidx.viewpager.widget.ViewPager.i
            public final void a(ViewPager viewPager, ob.a aVar, ob.a aVar2) {
                ViewPagerTabLayout.r(ViewPagerTabLayout.this, viewPager, aVar, aVar2);
            }
        };
        this.f15879b1 = new a();
    }

    private final ViewGroup getTabStrip() {
        View childAt = getChildAt(0);
        childAt.getClass();
        return (ViewGroup) childAt;
    }

    public static void r(ViewPagerTabLayout viewPagerTabLayout, ViewPager viewPager, ob.a aVar, ob.a aVar2) {
        if (aVar != null) {
            aVar.f59962a.unregisterObserver(viewPagerTabLayout.f15879b1);
        }
        viewPagerTabLayout.setViewPagerAdapter(aVar2);
    }

    private final void setViewPagerAdapter(ob.a aVar) {
        b bVar = aVar instanceof b ? (b) aVar : null;
        if (bVar != null) {
            aVar.f59962a.registerObserver(this.f15879b1);
            s(bVar);
        }
    }

    public final boolean getAreTabsInteractive() {
        return this.f15880d0;
    }

    @Override // zn1.e, android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (this.f15880d0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f15883g0 = motionEvent.getX();
                this.f15884h0 = motionEvent.getPointerId(0);
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f15883g0 = motionEvent.getX(actionIndex);
                this.f15884h0 = motionEvent.getPointerId(actionIndex);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        getWidth();
        if (getTabStrip().getChildCount() > 0) {
            int width = getWidth();
            ViewGroup tabStrip = getTabStrip();
            View childAt = tabStrip.getChildAt(0);
            if (childAt != null) {
                View childAt2 = tabStrip.getChildAt(tabStrip.getChildCount() - 1);
                int i17 = width / 2;
                int width2 = i17 - (childAt.getWidth() / 2);
                int width3 = i17 - (childAt2.getWidth() / 2);
                WeakHashMap<View, t0> weakHashMap = j0.f66049a;
                tabStrip.setPaddingRelative(width2, 0, width3, 0);
                this.f15882f0 = childAt.getWidth();
            }
            t();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        if (r1 != 3) goto L18;
     */
    @Override // zn1.e, android.widget.HorizontalScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r13.getClass()
            boolean r0 = r12.f15880d0
            if (r0 != 0) goto L9
            r12 = 0
            return r12
        L9:
            androidx.viewpager.widget.ViewPager r0 = r12.f15881e0
            if (r0 == 0) goto Lc6
            ob.a r1 = r0.getAdapter()
            r2 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.getCount()
            if (r1 <= 0) goto L1b
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto Lc6
            int r1 = r13.getActionMasked()
            r3 = 1
            if (r1 == r3) goto Lb9
            r4 = 2
            if (r1 == r4) goto L2d
            r12 = 3
            if (r1 == r12) goto Lb9
            goto Lc5
        L2d:
            int r1 = r12.f15884h0
            int r1 = r13.findPointerIndex(r1)
            r4 = -1
            if (r1 == r4) goto La0
            boolean r2 = r0.P
            if (r2 != 0) goto L73
            java.lang.String r2 = ">> beginFakeDrag"
            com.dyson.mobile.android.logging.Logger.a(r2)
            boolean r2 = r0.A
            if (r2 == 0) goto L44
            goto L73
        L44:
            r0.P = r3
            r0.setScrollState(r3)
            r2 = 0
            r0.F = r2
            r0.H = r2
            android.view.VelocityTracker r2 = r0.K
            if (r2 != 0) goto L59
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.K = r2
            goto L5c
        L59:
            r2.clear()
        L5c:
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r4
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            android.view.VelocityTracker r6 = r0.K
            r6.addMovement(r2)
            r2.recycle()
            r0.Q = r4
        L73:
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r4 = r12.f15882f0
            float r2 = r2 / r4
            float r13 = r13.getX(r1)
            float r1 = r12.f15883g0
            float r1 = r13 - r1
            r12.f15883g0 = r13
            float r2 = r2 * r1
            r0.j(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "-- fakeDragBy("
            r12.<init>(r13)
            r12.append(r1)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.dyson.mobile.android.logging.Logger.a(r12)
            return r3
        La0:
            int r12 = r12.f15884h0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid pointerId="
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = " in onTouchEvent"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.dyson.mobile.android.logging.Logger.e(r12, r2)
            return r3
        Lb9:
            boolean r12 = r0.P
            if (r12 == 0) goto Lc5
            r0.i()
            java.lang.String r12 = "<< endFakeDrag"
            com.dyson.mobile.android.logging.Logger.a(r12)
        Lc5:
            return r3
        Lc6:
            boolean r12 = super.onTouchEvent(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.resources.view.viewpager.ViewPagerTabLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r7 == r6.d) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(bu0.b r10) {
        /*
            r9 = this;
            r9.k()
            int r0 = r10.d()
            r1 = 0
            r2 = r1
        L9:
            r3 = 1
            if (r2 >= r0) goto L6b
            zn1.e$g r4 = r9.i()
            int r5 = r10.c()
            zn1.e$i r6 = r4.f92953g
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            zn1.e$i r7 = r4.f92953g
            android.view.View r5 = r6.inflate(r5, r7, r1)
            r4.e = r5
            zn1.e$i r5 = r4.f92953g
            if (r5 == 0) goto L4b
            r5.f()
            zn1.e$g r6 = r5.d
            if (r6 == 0) goto L47
            zn1.e r7 = r6.f92952f
            if (r7 == 0) goto L41
            int r7 = r7.getSelectedTabPosition()
            r8 = -1
            if (r7 == r8) goto L47
            int r6 = r6.d
            if (r7 != r6) goto L47
            goto L48
        L41:
            java.lang.String r9 = "Tab not attached to a TabLayout"
            pa.c.p(r9)
            return
        L47:
            r3 = r1
        L48:
            r5.setSelected(r3)
        L4b:
            android.view.View r3 = r4.e
            if (r3 == 0) goto L53
            r10.a(r2, r3)
            goto L65
        L53:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to inflate the custom tab view for tab "
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r5 = 0
            com.dyson.mobile.android.logging.Logger.b(r3, r5)
        L65:
            r9.b(r4, r1)
            int r2 = r2 + 1
            goto L9
        L6b:
            androidx.viewpager.widget.ViewPager r10 = r9.f15881e0
            if (r10 == 0) goto L8e
            int r0 = r10.getCurrentItem()
            int r1 = r9.getSelectedTabPosition()
            if (r0 == r1) goto L8e
            int r0 = r10.getCurrentItem()
            int r1 = r9.getTabCount()
            if (r0 >= r1) goto L8e
            int r10 = r10.getCurrentItem()
            zn1.e$g r10 = r9.h(r10)
            r9.m(r10, r3)
        L8e:
            android.view.ViewGroup r10 = r9.getTabStrip()
            af.b r0 = new af.b
            r0.<init>(r9, r3)
            r10.addOnLayoutChangeListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.resources.view.viewpager.ViewPagerTabLayout.s(bu0.b):void");
    }

    public final void setAreTabsInteractive(boolean z13) {
        this.f15880d0 = z13;
        t();
    }

    @Override // zn1.e
    public void setupWithViewPager(ViewPager viewPager) {
        ArrayList arrayList;
        p(viewPager, false, false);
        ViewPager viewPager2 = this.f15881e0;
        c cVar = this.f15885t0;
        if (viewPager2 != null && (arrayList = viewPager2.f5002b0) != null) {
            arrayList.remove(cVar);
        }
        this.f15881e0 = viewPager;
        if (viewPager != null) {
            if (viewPager.f5002b0 == null) {
                viewPager.f5002b0 = new ArrayList();
            }
            viewPager.f5002b0.add(cVar);
        }
        setViewPagerAdapter(viewPager != null ? viewPager.getAdapter() : null);
    }

    public final void t() {
        Iterator<Integer> it = p.n(0, getTabStrip().getChildCount()).iterator();
        while (it.hasNext()) {
            getTabStrip().getChildAt(((k0) it).nextInt()).setClickable(this.f15880d0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerTabLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ViewPagerTabLayout(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
