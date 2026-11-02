package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import at0.m;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.logging.Logger;
import gm1.am;
import i12.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ks0.n;
import q7.j0;
import q7.t0;
import qv1.s;
import x12.r;
import zn1.e;
import zs0.g;
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001&B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonTabLayout;", "Lzn1/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lat0/m;", "tabProperties", "Lh12/f0;", "setTabs", "(Ljava/util/List;)V", AbstractEvent.INDEX, "setSelectedIndex", "(I)V", "", "value", "e0", "Z", "setCenterEdgeTabs", "(Z)V", "centerEdgeTabs", "Lat0/e;", "f0", "Lat0/e;", "getDysonOnTabSelectedListener", "()Lat0/e;", "setDysonOnTabSelectedListener", "(Lat0/e;)V", "dysonOnTabSelectedListener", "Landroid/view/ViewGroup;", "getTabStrip", "()Landroid/view/ViewGroup;", "tabStrip", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonTabLayout extends e {

    /* renamed from: d0  reason: collision with root package name */
    public final Typeface f15733d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f15734e0;

    /* renamed from: f0  reason: collision with root package name */
    public at0.e f15735f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f15736g0;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/DysonTabLayout$b", "Lzn1/e$d;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements e.d {
        public b() {
        }

        @Override // zn1.e.c
        public final void a(e.g gVar) {
            int i13 = gVar.d;
            Logger.a("On tab selected " + i13);
            DysonTabLayout dysonTabLayout = DysonTabLayout.this;
            if (dysonTabLayout.f15736g0) {
                int i14 = gVar.d;
                Logger.a("Ignoring tab selected event for tab " + i14);
                dysonTabLayout.f15736g0 = false;
                return;
            }
            at0.e dysonOnTabSelectedListener = dysonTabLayout.getDysonOnTabSelectedListener();
            if (dysonOnTabSelectedListener != null) {
                ((rk.b) dysonOnTabSelectedListener).f73335a.f(gVar.d);
            }
        }

        @Override // zn1.e.c
        public final void b(e.g gVar) {
            gVar.getClass();
        }

        @Override // zn1.e.c
        public final void c(e.g gVar) {
            gVar.getClass();
            int i13 = gVar.d;
            Logger.a("On tab reselected " + i13);
            DysonTabLayout dysonTabLayout = DysonTabLayout.this;
            if (dysonTabLayout.f15736g0) {
                int i14 = gVar.d;
                Logger.a("Ignoring tab reselected event for tab " + i14);
                dysonTabLayout.f15736g0 = false;
                return;
            }
            at0.e dysonOnTabSelectedListener = dysonTabLayout.getDysonOnTabSelectedListener();
            if (dysonOnTabSelectedListener != null) {
                ((rk.b) dysonOnTabSelectedListener).f73335a.f(gVar.d);
            }
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonTabLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        b bVar = new b();
        this.f15733d0 = attributeSet != null ? g.a(context, attributeSet).getTypeface(context.getAssets()) : null;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50095u, i13, 0);
        setCenterEdgeTabs(obtainStyledAttributes.getBoolean(0, this.f15734e0));
        obtainStyledAttributes.recycle();
        a(bVar);
    }

    private final ViewGroup getTabStrip() {
        View childAt = getChildAt(0);
        childAt.getClass();
        return (ViewGroup) childAt;
    }

    private final void setCenterEdgeTabs(boolean z13) {
        this.f15734e0 = z13;
        requestLayout();
    }

    public final at0.e getDysonOnTabSelectedListener() {
        return this.f15735f0;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        r();
    }

    public final void r() {
        if (this.f15734e0) {
            int width = getWidth();
            ViewGroup tabStrip = getTabStrip();
            View childAt = tabStrip.getChildAt(0);
            if (childAt == null) {
                return;
            }
            View childAt2 = tabStrip.getChildAt(tabStrip.getChildCount() - 1);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(makeMeasureSpec, makeMeasureSpec);
            childAt2.measure(makeMeasureSpec, makeMeasureSpec);
            int i13 = width / 2;
            int measuredWidth = i13 - (childAt.getMeasuredWidth() / 2);
            int measuredWidth2 = i13 - (childAt2.getMeasuredWidth() / 2);
            WeakHashMap<View, t0> weakHashMap = j0.f66049a;
            tabStrip.setPaddingRelative(measuredWidth, 0, measuredWidth2, 0);
        }
    }

    public final void s(int i13) {
        Typeface typeface;
        View childAt = getTabStrip().getChildAt(i13);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        Iterator it = am.t(viewGroup).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if ((view instanceof TextView) && (typeface = this.f15733d0) != null) {
                TextView textView = (TextView) view;
                if (!r.c(textView.getTypeface(), typeface)) {
                    textView.setTypeface(typeface, 0);
                }
            }
        }
    }

    public final void setDysonOnTabSelectedListener(at0.e eVar) {
        this.f15735f0 = eVar;
    }

    public final void setSelectedIndex(int i13) {
        e.g h13 = h(i13);
        if (h13 == null) {
            Logger.e(pa.c.f("invalid tab index ", i13, " for ", getTabCount(), " available tabs"), null);
            return;
        }
        e eVar = h13.f92952f;
        if (eVar == null) {
            pa.c.p("Tab not attached to a TabLayout");
            return;
        }
        int selectedTabPosition = eVar.getSelectedTabPosition();
        if (selectedTabPosition == -1 || selectedTabPosition != h13.d) {
            this.f15736g0 = true;
            m(h13, true);
        }
    }

    public final void setTabs(List<m> list) {
        ArrayList<e.g> arrayList;
        boolean z13;
        boolean z14;
        list.getClass();
        if (getTabCount() == 0 && !list.isEmpty()) {
            this.f15736g0 = true;
        }
        int tabCount = getTabCount() - list.size();
        if (tabCount < 0) {
            tabCount = 0;
        }
        StringBuilder k13 = s.k("setTabs called with ", list.size(), " tabs. There are currently ", getTabCount(), " tabs. ");
        k13.append(tabCount);
        k13.append(" tabs will be removed from the view.");
        Logger.c(k13.toString());
        int i13 = 0;
        while (true) {
            arrayList = this.e;
            int i14 = -1;
            if (i13 >= tabCount) {
                break;
            }
            int tabCount2 = getTabCount();
            int i15 = tabCount2 - 1;
            e.g gVar = this.f92923f;
            int i16 = gVar != null ? gVar.d : 0;
            l(i15);
            e.g remove = arrayList.remove(i15);
            if (remove != null) {
                remove.f92952f = null;
                remove.f92953g = null;
                remove.f92949a = null;
                remove.f92950b = null;
                remove.f92951c = null;
                remove.d = -1;
                remove.e = null;
                e.f92920c0.a(remove);
            }
            int size = arrayList.size();
            for (int i17 = i15; i17 < size; i17++) {
                if (arrayList.get(i17).d == this.d) {
                    i14 = i17;
                }
                arrayList.get(i17).d = i17;
            }
            this.d = i14;
            if (i16 == i15) {
                m(arrayList.isEmpty() ? null : arrayList.get(Math.max(0, tabCount2 - 2)), true);
            }
            i13++;
        }
        int i18 = 0;
        for (Object obj : list) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                t.n();
                throw null;
            }
            m mVar = (m) obj;
            e.g h13 = h(i18);
            if (h13 == null) {
                h13 = i();
            }
            CharSequence charSequence = mVar.f5468a;
            if (charSequence != null) {
                h13.a(charSequence);
            }
            Integer num = mVar.f5469b;
            if (num != null) {
                h13.f92949a = c7.a.e(getContext(), num.intValue());
                e eVar = h13.f92952f;
                if (eVar.C == 1 || eVar.F == 2) {
                    eVar.q(true);
                }
                e.i iVar = h13.f92953g;
                if (iVar != null) {
                    iVar.f();
                    e.g gVar2 = iVar.d;
                    if (gVar2 != null) {
                        e eVar2 = gVar2.f92952f;
                        if (eVar2 == null) {
                            pa.c.p("Tab not attached to a TabLayout");
                            return;
                        }
                        int selectedTabPosition = eVar2.getSelectedTabPosition();
                        if (selectedTabPosition != -1 && selectedTabPosition == gVar2.d) {
                            z14 = true;
                            iVar.setSelected(z14);
                        }
                    }
                    z14 = false;
                    iVar.setSelected(z14);
                }
            }
            CharSequence charSequence2 = mVar.f5470c;
            if (charSequence2 != null) {
                h13.f92951c = charSequence2;
                e.i iVar2 = h13.f92953g;
                if (iVar2 != null) {
                    iVar2.f();
                    e.g gVar3 = iVar2.d;
                    if (gVar3 != null) {
                        e eVar3 = gVar3.f92952f;
                        if (eVar3 == null) {
                            pa.c.p("Tab not attached to a TabLayout");
                            return;
                        }
                        int selectedTabPosition2 = eVar3.getSelectedTabPosition();
                        if (selectedTabPosition2 != -1 && selectedTabPosition2 == gVar3.d) {
                            z13 = true;
                            iVar2.setSelected(z13);
                        }
                    }
                    z13 = false;
                    iVar2.setSelected(z13);
                }
                h13.f92953g.setTooltipText(charSequence2);
            }
            if (i18 >= getTabCount()) {
                b(h13, arrayList.isEmpty());
            }
            s(i18);
            i18 = i19;
        }
        int childCount = getTabStrip().getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            s(i23);
        }
        r();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/resources/view/DysonTabLayout$a;", "", "<init>", "()V", "", "DASH_SIGN", "Ljava/lang/String;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonTabLayout(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonTabLayout(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
