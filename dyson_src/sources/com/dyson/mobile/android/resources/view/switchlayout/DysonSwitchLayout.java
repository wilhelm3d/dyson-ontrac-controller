package com.dyson.mobile.android.resources.view.switchlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.brightcove.player.event.AbstractEvent;
import d22.j;
import d22.k;
import d22.p;
import i12.c0;
import i12.k0;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import te.c;
import x12.r;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/dyson/mobile/android/resources/view/switchlayout/DysonSwitchLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "selectedView", "Lh12/f0;", "setSelectedView", "(Landroid/view/View;)V", "", "items", "setViews", "(Ljava/util/List;)V", AbstractEvent.INDEX, "setSelectedViewIndex", "(I)V", "getSelectedViewIndex", "()I", "", "enabled", "setEnabled", "(Z)V", "b", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonSwitchLayout extends LinearLayout {
    public int d;
    public View e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f15862f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f15863g;

    /* renamed from: h  reason: collision with root package name */
    public final c f15864h;

    /* loaded from: classes3.dex */
    public interface b {
        void a(DysonSwitchLayout dysonSwitchLayout, int i13);
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonSwitchLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.d = -1;
        this.f15862f = new ArrayList();
        this.f15863g = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50094t);
            obtainStyledAttributes.getClass();
            this.d = obtainStyledAttributes.getInteger(1, -1);
            obtainStyledAttributes.recycle();
        }
        this.f15864h = new c(this, 11);
    }

    public static void a(DysonSwitchLayout dysonSwitchLayout, View view) {
        view.getClass();
        dysonSwitchLayout.setSelectedView(view);
    }

    private final void setSelectedView(View view) {
        if (r.c(this.e, view)) {
            return;
        }
        ArrayList arrayList = this.f15862f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            view2.setSelected(r.c(view2, view));
        }
        this.e = view;
        int S = c0.S(view, arrayList);
        Iterator it2 = this.f15863g.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).a(this, S);
        }
    }

    public final void b(b bVar) {
        bVar.getClass();
        this.f15863g.add(bVar);
    }

    public final int getSelectedViewIndex() {
        return c0.S(this.e, this.f15862f);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        ArrayList arrayList = this.f15862f;
        if (arrayList.isEmpty()) {
            k n13 = p.n(0, getChildCount());
            ArrayList arrayList2 = new ArrayList(u.o(n13, 10));
            Iterator<Integer> it = n13.iterator();
            while (((j) it).f22663f) {
                arrayList2.add(getChildAt(((k0) it).nextInt()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                View view = (View) it2.next();
                view.setOnClickListener(this.f15864h);
                arrayList.add(view);
            }
            setSelectedViewIndex(this.d);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        Iterator it = this.f15862f.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z13);
        }
    }

    public final void setSelectedViewIndex(int i13) {
        this.d = i13;
        if (i13 >= 0) {
            ArrayList arrayList = this.f15862f;
            if (i13 < arrayList.size()) {
                setSelectedView((View) arrayList.get(i13));
                return;
            }
        }
        setSelectedView(null);
    }

    public final void setViews(List<? extends View> list) {
        list.getClass();
        ArrayList arrayList = this.f15862f;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(null);
        }
        arrayList.clear();
        arrayList.addAll(list);
        removeAllViews();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            view.setOnClickListener(this.f15864h);
            addView(view);
        }
        setSelectedViewIndex(this.d);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/resources/view/switchlayout/DysonSwitchLayout$a;", "", "<init>", "()V", "", "NO_VIEW_SELECTED_INDEX", "I", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonSwitchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonSwitchLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonSwitchLayout(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
