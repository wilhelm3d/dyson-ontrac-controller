package com.dyson.mobile.android.connectionjourney.ownership.otarequired;

import a40.a;
import a40.b;
import android.os.Bundle;
import bt0.g;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import f20.w0;
import i20.x1;
import kotlin.Metadata;
import p30.z;
import pf0.c;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/otarequired/OwnershipOtaRequiredActivity;", "Lbt0/g;", "La40/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipOtaRequiredActivity extends g implements a {

    /* renamed from: k  reason: collision with root package name */
    public b f13838k;

    @Override // a40.a
    public final void E0() {
        z.d(this).f(this);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        t30.b bVar = z.d(this).f62827c;
        u30.j jVar = bVar.f78103c;
        c b13 = x1.b(bVar.f78102b);
        jVar.getClass();
        b bVar2 = new b(bVar.a(), bVar.f78117s.get(), b13);
        this.f13838k = bVar2;
        bVar2.f296l.setValue(bVar2, b.f293m[0], this);
        w0 w0Var = (w0) q8.g.d(this, R.layout.activity_ownership_ota_required_screen);
        b bVar3 = this.f13838k;
        if (bVar3 == null) {
            r.i("ownershipOtaRequiredViewModel");
            throw null;
        }
        w0Var.l(bVar3);
        w0Var.f29416i.x(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }
}
