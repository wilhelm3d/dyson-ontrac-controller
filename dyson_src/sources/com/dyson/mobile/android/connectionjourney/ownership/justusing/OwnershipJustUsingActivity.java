package com.dyson.mobile.android.connectionjourney.ownership.justusing;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import bt0.g;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import f20.s0;
import i20.m;
import i20.x1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p30.c;
import p30.z;
import w30.b;
import x12.r;
import yi0.f;
import yi0.h;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/justusing/OwnershipJustUsingActivity;", "Lbt0/g;", "Lw30/a;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipJustUsingActivity extends g implements w30.a {

    /* renamed from: l  reason: collision with root package name */
    public static final a f13831l = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public b f13832k;

    @Override // w30.a
    public final void n() {
        z.d(this).c(this);
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        t30.b bVar = z.d(this).f62827c;
        u30.j jVar = bVar.f78103c;
        h40.a a13 = bVar.a();
        c b13 = bVar.b();
        m mVar = bVar.f78102b;
        f fVar = new h(mVar.f40321a).f90159a;
        fVar.getClass();
        pf0.c b14 = x1.b(mVar);
        jVar.getClass();
        b bVar2 = new b(a13, b13, fVar, bVar.f78117s.get(), b14);
        this.f13832k = bVar2;
        bVar2.f85214o.setValue(bVar2, b.f85208q[0], this);
        s0 s0Var = (s0) q8.g.d(this, R.layout.activity_ownership_just_using);
        b bVar3 = this.f13832k;
        if (bVar3 == null) {
            r.i("ownershipJustUsingViewModel");
            throw null;
        }
        s0Var.l(bVar3);
        s0Var.f29318j.x(this);
        Lifecycle lifecycle = getLifecycle();
        b bVar4 = this.f13832k;
        if (bVar4 != null) {
            lifecycle.a(bVar4);
        } else {
            r.i("ownershipJustUsingViewModel");
            throw null;
        }
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle lifecycle = getLifecycle();
        b bVar = this.f13832k;
        if (bVar != null) {
            lifecycle.c(bVar);
        } else {
            r.i("ownershipJustUsingViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        z.d(this).e(this);
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/justusing/OwnershipJustUsingActivity$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
