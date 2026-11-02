package com.dyson.mobile.android.connectionjourney.ownership.retry;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.ownership.justusing.OwnershipJustUsingActivity;
import f.j;
import f.x;
import f20.q0;
import f40.a;
import f40.c;
import i20.m;
import i20.x1;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import l.b;
import p30.z;
import q8.g;
import x12.r;
import yi0.f;
import yi0.h;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/retry/OwnershipFailureActivity;", "Ll/b;", "Lf40/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipFailureActivity extends b implements a {

    /* renamed from: j  reason: collision with root package name */
    public c f13847j;

    @Override // f40.a
    public final void j() {
        z.d(this).getClass();
        OwnershipJustUsingActivity.f13831l.getClass();
        startActivity(new Intent(this, OwnershipJustUsingActivity.class));
    }

    @Override // f40.a
    public final void onComplete() {
        z.d(this).f(this);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        t30.b bVar = z.d(this).f62827c;
        u30.j jVar = bVar.f78103c;
        h40.a a13 = bVar.a();
        p30.c b13 = bVar.b();
        m mVar = bVar.f78102b;
        f fVar = new h(mVar.f40321a).f90159a;
        fVar.getClass();
        jVar.getClass();
        c cVar = new c(a13, b13, fVar, x1.b(mVar), bVar.f78117s.get());
        this.f13847j = cVar;
        cVar.f29568l = new WeakReference<>(this);
        q0 q0Var = (q0) g.d(this, R.layout.activity_ownership_failure);
        c cVar2 = this.f13847j;
        if (cVar2 == null) {
            r.i("ownershipFailureViewModel");
            throw null;
        }
        q0Var.l(cVar2);
        q0Var.f29268j.x(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }
}
