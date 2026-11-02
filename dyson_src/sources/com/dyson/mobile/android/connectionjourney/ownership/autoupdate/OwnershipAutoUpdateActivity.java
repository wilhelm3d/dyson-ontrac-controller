package com.dyson.mobile.android.connectionjourney.ownership.autoupdate;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.ownership.retry.OwnershipFailureActivity;
import f.j;
import f.x;
import f20.m0;
import i20.m;
import i20.x1;
import java.lang.ref.WeakReference;
import l.b;
import nj.e3;
import p30.c;
import p30.z;
import r30.e;
import r30.g;
import yi0.f;
import yi0.h;
/* loaded from: classes2.dex */
public class OwnershipAutoUpdateActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public g f13782j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13783k = new a();

    /* loaded from: classes2.dex */
    public class a implements e {
        public a() {
        }

        @Override // r30.e
        public final void a() {
            OwnershipAutoUpdateActivity ownershipAutoUpdateActivity = OwnershipAutoUpdateActivity.this;
            z.d(ownershipAutoUpdateActivity).getClass();
            ownershipAutoUpdateActivity.startActivity(new Intent(ownershipAutoUpdateActivity, OwnershipFailureActivity.class));
        }

        @Override // r30.e
        public final void b() {
            OwnershipAutoUpdateActivity ownershipAutoUpdateActivity = OwnershipAutoUpdateActivity.this;
            z.d(ownershipAutoUpdateActivity).f(ownershipAutoUpdateActivity);
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        t30.b bVar = z.d(this).f62827c;
        u30.j jVar = bVar.f78103c;
        h40.a a13 = bVar.a();
        c b13 = bVar.b();
        m mVar = bVar.f78102b;
        pf0.c b14 = x1.b(mVar);
        f fVar = new h(mVar.f40321a).f90159a;
        fVar.getClass();
        jVar.getClass();
        g gVar = new g(a13, b13, b14, fVar, bVar.f78117s.get());
        this.f13782j = gVar;
        gVar.f70209j = new WeakReference<>(this.f13783k);
        m0 m0Var = (m0) q8.g.d(this, R.layout.activity_ownership_auto_update_screen);
        m0Var.l(this.f13782j);
        m0Var.f29182j.x(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = e3.f57460a;
        new ij.b("connection_journey.ownership.machine_auto_update", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        if (this.f13782j.f70216q.d) {
            return false;
        }
        z.d(this).e(this);
        return true;
    }
}
