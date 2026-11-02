package com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/ViewPagerIconPagerIndicator;", "Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcu0/a;", "getIconPagerAdapter", "()Lcu0/a;", "", AbstractEvent.INDEX, "Lh12/f0;", "setViewPagerCurrentItem", "(I)V", "Landroidx/viewpager/widget/ViewPager;", "view", "setViewPager", "(Landroidx/viewpager/widget/ViewPager;)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewPagerIconPagerIndicator extends com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a {

    /* renamed from: r  reason: collision with root package name */
    public ViewPager f15890r;

    /* renamed from: s  reason: collision with root package name */
    public final a f15891s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/ViewPagerIconPagerIndicator$a", "Landroidx/viewpager/widget/ViewPager$j;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ViewPager.j {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void a(float f13, int i13, int i14) {
            ViewPagerIconPagerIndicator.this.b(f13, i13);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void b(int i13) {
            a.b bVar;
            if (i13 == 0) {
                bVar = a.b.IDLE;
            } else if (i13 == 1) {
                bVar = a.b.DRAGGING;
            } else if (i13 != 2) {
                return;
            } else {
                bVar = a.b.SETTLING;
            }
            ViewPagerIconPagerIndicator viewPagerIconPagerIndicator = ViewPagerIconPagerIndicator.this;
            viewPagerIconPagerIndicator.getClass();
            bVar.getClass();
            if (bVar != a.b.IDLE) {
                viewPagerIconPagerIndicator.f15902p = true;
                return;
            }
            viewPagerIconPagerIndicator.setCurrentItem(viewPagerIconPagerIndicator.f15896j);
            viewPagerIconPagerIndicator.f15899m = a.EnumC0547a.NONE;
            viewPagerIconPagerIndicator.f15897k = 0.0f;
            viewPagerIconPagerIndicator.f15900n = null;
            viewPagerIconPagerIndicator.f15901o = null;
            viewPagerIconPagerIndicator.f15902p = false;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void c(int i13) {
            ViewPagerIconPagerIndicator.this.f15896j = i13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerIconPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f15891s = new a();
    }

    @Override // com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a
    public cu0.a getIconPagerAdapter() {
        ViewPager viewPager = this.f15890r;
        if (viewPager == null) {
            r.i("viewPager");
            throw null;
        }
        ob.a adapter = viewPager.getAdapter();
        adapter.getClass();
        return (cu0.a) adapter;
    }

    public final void setViewPager(ViewPager viewPager) {
        viewPager.getClass();
        this.f15890r = viewPager;
        viewPager.b(this.f15891s);
        a();
    }

    @Override // com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a
    public void setViewPagerCurrentItem(int i13) {
        ViewPager viewPager = this.f15890r;
        if (viewPager != null) {
            viewPager.setCurrentItem(i13);
        } else {
            r.i("viewPager");
            throw null;
        }
    }

    public /* synthetic */ ViewPagerIconPagerIndicator(Context context, AttributeSet attributeSet, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet);
    }
}
