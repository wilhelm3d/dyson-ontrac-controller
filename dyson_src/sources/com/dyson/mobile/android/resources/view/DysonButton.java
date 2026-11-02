package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import at0.d;
import dz1.w;
import java.util.concurrent.TimeUnit;
import ks0.n;
import kz1.b;
import mz1.j;
import rz1.l;
import rz1.t;
import rz1.x1;
import zs0.g;
/* loaded from: classes3.dex */
public class DysonButton extends AppCompatButton {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f15699j = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f15700g;

    /* renamed from: h  reason: collision with root package name */
    public j f15701h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f15702i;

    public DysonButton(Context context) {
        super(context);
        this.f15700g = true;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        setTypeface(g.a(context, attributeSet).getTypeface(context.getAssets()));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f50080f);
            this.f15700g = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.f15700g) {
            return;
        }
        ue1.a.f81859a.getClass();
        d dVar = new d(this);
        b.a aVar = kz1.b.f50218a;
        t t13 = new l(dVar).t(new b0.g(15));
        w wVar = c02.a.f10003b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        kz1.b.a(timeUnit, "unit is null");
        kz1.b.a(wVar, "scheduler is null");
        this.f15701h = (j) new x1(t13, 1000L, timeUnit, wVar).r(new b0.g(16)).O(new d(this));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f15701h;
        if (jVar == null || jVar.b()) {
            return;
        }
        j jVar2 = this.f15701h;
        jVar2.getClass();
        jz1.d.dispose(jVar2);
    }

    public void setIsClickThrottleEnabled(boolean z13) {
        this.f15700g = z13;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15702i = onClickListener;
        if (this.f15700g) {
            return;
        }
        super.setOnClickListener(onClickListener);
    }

    public DysonButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15700g = true;
        b(context, attributeSet);
    }

    public DysonButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f15700g = true;
        b(context, attributeSet);
    }
}
