package com.dyson.mobile.android.light.configuration.custombaseline;

import a20.h;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.configuration.custombaseline.a;
import f.j;
import f.x;
import fm1.o0;
import h12.e;
import in0.g;
import java.util.concurrent.TimeUnit;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import le0.i1;
import le0.j0;
import le0.n1;
import se1.q0;
import sz1.n;
import we1.a;
import x12.r;
import yd0.c;
import zs0.i;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/configuration/custombaseline/CustomBaselineActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomBaselineActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14746m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.light.configuration.custombaseline.a f14747j;

    /* renamed from: k  reason: collision with root package name */
    public final gz1.b f14748k = new gz1.b();

    /* renamed from: l  reason: collision with root package name */
    public final b f14749l = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/configuration/custombaseline/CustomBaselineActivity$b", "Lcom/dyson/mobile/android/light/configuration/custombaseline/a$b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a.b {
        public b() {
        }

        @Override // com.dyson.mobile.android.light.configuration.custombaseline.a.b
        public final void a() {
            CustomBaselineActivity.this.onBackPressed();
        }
    }

    public static void c1(CustomBaselineActivity customBaselineActivity) {
        super.onBackPressed();
        customBaselineActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
    }

    public final com.dyson.mobile.android.light.configuration.custombaseline.a d1() {
        com.dyson.mobile.android.light.configuration.custombaseline.a aVar = this.f14747j;
        if (aVar != null) {
            return aVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        com.dyson.mobile.android.light.configuration.custombaseline.a d13 = d1();
        lf0.a aVar = d13.d;
        this.f14748k.a((!d13.f14762q ? aVar.J(false) : d13.f14765t ? aVar.G() : aVar.M(d13.f14763r).k(300L, TimeUnit.MILLISECONDS).l(new ce0.b(d13, 2))).z(c02.a.f10004c).r(fz1.a.a()).l(new h(this, 6)).v());
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        c.f89775o.getClass();
        c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a14.f89779j;
        le0.a aVar2 = dVar.f47424b;
        j0.a(aVar2);
        n1 n1Var = dVar.f47425c;
        lf0.a aVar3 = dVar.Q.get();
        og0.a c13 = dVar.c();
        pf0.c a15 = j0.a(aVar2);
        g a16 = i1.a(dVar.f47423a);
        hj.e eVar = dVar.d.get();
        n1Var.getClass();
        aVar3.getClass();
        eVar.getClass();
        this.f14747j = new com.dyson.mobile.android.light.configuration.custombaseline.a(aVar3, c13, a15, a16, eVar);
        super.onCreate(bundle);
        je0.a aVar4 = (je0.a) q8.g.d(this, R.layout.activity_custom_baseline);
        aVar4.f44498p.x(this);
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        aVar4.l(d1());
        com.dyson.mobile.android.light.configuration.custombaseline.a d13 = d1();
        d13.A.setValue(d13, com.dyson.mobile.android.light.configuration.custombaseline.a.B[0], this.f14749l);
        com.dyson.mobile.android.light.configuration.custombaseline.a d14 = d1();
        lf0.a aVar5 = d14.d;
        sz1.c Z = aVar5.Z();
        ca0.e eVar2 = new ca0.e(new ce0.c(d14, 2), 13);
        b.a aVar6 = kz1.b.f50218a;
        n nVar = new n(Z, eVar2);
        n nVar2 = new n(aVar5.O(), new ca0.e(new ce0.c(d14, 3), 14));
        n nVar3 = new n(aVar5.m(), new ca0.e(new ce0.c(d14, 4), 15));
        n nVar4 = new n(aVar5.r(), new ca0.e(new ce0.c(d14, 5), 16));
        gz1.b bVar = d14.f14771z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.a(nVar4.k(300L, timeUnit).g(nVar).k(300L, timeUnit).g(nVar2).k(300L, timeUnit).g(nVar3).k(300L, timeUnit).g(new ce0.a(d14, 2)).v());
        getLifecycle().a(d1());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        menu.clear();
        i.a(menu);
        return true;
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(d1());
        this.f14748k.e();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/configuration/custombaseline/CustomBaselineActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
