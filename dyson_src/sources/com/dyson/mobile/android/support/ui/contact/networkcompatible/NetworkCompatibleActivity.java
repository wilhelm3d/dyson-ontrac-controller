package com.dyson.mobile.android.support.ui.contact.networkcompatible;

import android.os.Bundle;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import l.b;
import o71.a;
import q8.g;
import y9.w;
/* loaded from: classes3.dex */
public class NetworkCompatibleActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public a f16896j;

    @Override // f.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(-16777216), x.a.a(-16777216));
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        a aVar = (a) g.d(this, R.layout.activity_network_compatibility);
        this.f16896j = aVar;
        aVar.f59749g.x(this);
        overridePendingTransition(R.anim.slide_in_up, R.anim.stay);
        this.f16896j.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new y81.a(this));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = nj.j.f57537a;
        w.t("common.help.network_requirement", null, 2, null);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
        return true;
    }
}
