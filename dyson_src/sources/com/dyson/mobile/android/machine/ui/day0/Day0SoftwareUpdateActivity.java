package com.dyson.mobile.android.machine.ui.day0;

import android.os.Bundle;
import bt0.a;
import bt0.c;
import bt0.f;
import ql0.b;
import rf0.i0;
import uf0.g;
/* loaded from: classes3.dex */
public class Day0SoftwareUpdateActivity extends f<c> implements b {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f15332r = 0;

    /* renamed from: p  reason: collision with root package name */
    public pf0.c f15333p;

    /* renamed from: q  reason: collision with root package name */
    public bt0.b f15334q;

    @Override // bt0.f
    public final a i1() {
        return this.f15334q;
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        this.f15333p = g.a(this).f81922a.c();
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        this.f15334q = new bt0.b();
        this.f8415o = true;
        p1();
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        o1(new ql0.a(), this.f15333p.d(i0.N), null, null);
    }

    @Override // ql0.b
    public final void x0() {
        w81.c.f85438h.getClass();
        new w81.c().showNow(getSupportFragmentManager(), "ContactDysonDialog");
    }
}
