package com.dyson.mobile.android.machine.ui.context;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import pl0.a;
import q7.j0;
import q7.m;
import q7.t0;
/* loaded from: classes3.dex */
public class LockedAppBarLayoutBehaviour extends AppBarLayout.Behavior {
    public LockedAppBarLayoutBehaviour() {
        this.f19473r = new a(this);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: m */
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i13, int i14, int[] iArr, int i15) {
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i13, i14, iArr, i15);
        q(i14, appBarLayout, view, i15);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i13, int i14, int i15, int i16, int i17) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        super.onNestedScroll(coordinatorLayout, appBarLayout, view2, i13, i14, i15, i16, i17);
        q(i16, appBarLayout, view2, i17);
    }

    public final void q(int i13, AppBarLayout appBarLayout, View view, int i14) {
        if (i14 == 1) {
            int a13 = a();
            if ((i13 >= 0 || a13 != 0) && (i13 <= 0 || a13 != (-appBarLayout.getTotalScrollRange()))) {
                return;
            }
            WeakHashMap<View, t0> weakHashMap = j0.f66049a;
            if (view instanceof m) {
                ((m) view).stopNestedScroll(1);
            }
        }
    }

    public LockedAppBarLayoutBehaviour(Context context, AttributeSet attributeSet) {
        this.f19473r = new a(this);
    }
}
