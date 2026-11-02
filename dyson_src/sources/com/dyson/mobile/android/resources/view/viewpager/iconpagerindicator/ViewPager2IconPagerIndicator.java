package com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/ViewPager2IconPagerIndicator;", "Lcom/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", AbstractEvent.INDEX, "Lh12/f0;", "setViewPagerCurrentItem", "(I)V", "Lcu0/a;", "getIconPagerAdapter", "()Lcu0/a;", "Landroidx/viewpager2/widget/ViewPager2;", "view", "setViewPager2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewPager2IconPagerIndicator extends com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a {

    /* renamed from: r  reason: collision with root package name */
    public ViewPager2 f15887r;

    /* renamed from: s  reason: collision with root package name */
    public final a f15888s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/viewpager/iconpagerindicator/ViewPager2IconPagerIndicator$a", "Landroidx/viewpager2/widget/ViewPager2$h;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends ViewPager2.h {
        public a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void a(int i13) {
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
            ViewPager2IconPagerIndicator viewPager2IconPagerIndicator = ViewPager2IconPagerIndicator.this;
            viewPager2IconPagerIndicator.getClass();
            bVar.getClass();
            if (bVar != a.b.IDLE) {
                viewPager2IconPagerIndicator.f15902p = true;
                return;
            }
            viewPager2IconPagerIndicator.setCurrentItem(viewPager2IconPagerIndicator.f15896j);
            viewPager2IconPagerIndicator.f15899m = a.EnumC0547a.NONE;
            viewPager2IconPagerIndicator.f15897k = 0.0f;
            viewPager2IconPagerIndicator.f15900n = null;
            viewPager2IconPagerIndicator.f15901o = null;
            viewPager2IconPagerIndicator.f15902p = false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void b(float f13, int i13, int i14) {
            ViewPager2IconPagerIndicator.this.b(f13, i13);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void c(int i13) {
            ViewPager2IconPagerIndicator.this.f15896j = i13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2IconPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f15888s = new a();
    }

    @Override // com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a
    public cu0.a getIconPagerAdapter() {
        ViewPager2 viewPager2 = this.f15887r;
        if (viewPager2 == null) {
            r.i("viewPager2");
            throw null;
        }
        RecyclerView.h adapter = viewPager2.getAdapter();
        adapter.getClass();
        return (cu0.a) adapter;
    }

    public final void setViewPager2(ViewPager2 viewPager2) {
        viewPager2.getClass();
        this.f15887r = viewPager2;
        viewPager2.b(this.f15888s);
        a();
    }

    @Override // com.dyson.mobile.android.resources.view.viewpager.iconpagerindicator.a
    public void setViewPagerCurrentItem(int i13) {
        ViewPager2 viewPager2 = this.f15887r;
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(i13);
        } else {
            r.i("viewPager2");
            throw null;
        }
    }

    public /* synthetic */ ViewPager2IconPagerIndicator(Context context, AttributeSet attributeSet, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet);
    }
}
