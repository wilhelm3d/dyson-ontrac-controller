package com.dyson.mobile.android.connectionjourney.ownership.claiminfo;

import android.content.Intent;
import android.os.Bundle;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.ownership.machinename.OwnershipMachineNameActivity;
import f.j;
import f.x;
import f20.o0;
import i20.m;
import i20.x1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p30.c;
import p30.z;
import s30.b;
import x12.r;
import yi0.f;
import yi0.h;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/claiminfo/OwnershipClaimInfoActivity;", "Lbt0/g;", "Ls30/a;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipClaimInfoActivity extends g implements s30.a {

    /* renamed from: l  reason: collision with root package name */
    public static final a f13785l = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public b f13786k;

    @Override // s30.a
    public final void n() {
        z d = z.d(this);
        int i13 = this.f8416j;
        String e = d.f62825a.f().e();
        d.f62825a.j();
        int i14 = z.a.f62828a[d.f62825a.f().a().getMachineCategory().ordinal()];
        if (i14 == 1 || i14 == 2) {
            z.g(this);
        } else if (i14 == 3) {
            d.f62826b.get().c(this, e);
            finish();
        } else {
            Intent intent = new Intent(this, OwnershipMachineNameActivity.class);
            intent.putExtra("extraTheme", i13);
            startActivity(intent);
        }
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
        this.f13786k = bVar2;
        bVar2.f75083l.setValue(bVar2, b.f75080o[0], this);
        o0 o0Var = (o0) q8.g.d(this, R.layout.activity_ownership_claim_info);
        b bVar3 = this.f13786k;
        if (bVar3 == null) {
            r.i("ownershipClaimInfoViewModel");
            throw null;
        }
        o0Var.l(bVar3);
        o0Var.f29219i.x(this);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/claiminfo/OwnershipClaimInfoActivity$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
