package com.dyson.mobile.android.light.schedule.widget.wakeup.brightness;

import a20.h;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a;
import f.j;
import f.x;
import fm1.o0;
import h12.e;
import in0.g;
import java.util.concurrent.TimeUnit;
import je0.m;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/brightness/WakeUpBrightnessActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WakeUpBrightnessActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14942m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a f14943j;

    /* renamed from: k  reason: collision with root package name */
    public final gz1.b f14944k = new gz1.b();

    /* renamed from: l  reason: collision with root package name */
    public final b f14945l = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/brightness/WakeUpBrightnessActivity$b", "Lcom/dyson/mobile/android/light/schedule/widget/wakeup/brightness/a$b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a.b {
        public b() {
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a.b
        public final void a() {
            Intent intent = new Intent();
            WakeUpBrightnessActivity wakeUpBrightnessActivity = WakeUpBrightnessActivity.this;
            intent.putExtra("EXTRA_WAKE_UP_BRIGHTNESS", wakeUpBrightnessActivity.d1().f14957o.d);
            wakeUpBrightnessActivity.setResult(-1, intent);
            wakeUpBrightnessActivity.onBackPressed();
        }
    }

    public static void c1(WakeUpBrightnessActivity wakeUpBrightnessActivity) {
        super.onBackPressed();
        wakeUpBrightnessActivity.overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
    }

    public final com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a d1() {
        com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a aVar = this.f14943j;
        if (aVar != null) {
            return aVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a d13 = d1();
        lf0.a aVar = d13.d;
        this.f14944k.a((!d13.f14954l ? aVar.J(false) : d13.f14956n ? aVar.G() : aVar.M(d13.f14955m)).z(c02.a.f10004c).r(fz1.a.a()).l(new h(this, 7)).v());
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID", "EXTRA_WAKE_UP_BRIGHTNESS"));
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
        n1Var.getClass();
        aVar3.getClass();
        this.f14943j = new com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a(aVar3, c13, a15, a16);
        m mVar = (m) q8.g.d(this, R.layout.activity_wake_up_brightness);
        mVar.f44698l.x(this);
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        mVar.l(d1());
        com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a d13 = d1();
        d13.f14962t.setValue(d13, com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a.f14947u[0], this.f14945l);
        com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a d14 = d1();
        Intent intent2 = getIntent();
        intent2.getClass();
        int i14 = cd.b.I(intent2).getInt("EXTRA_WAKE_UP_BRIGHTNESS");
        int i15 = d14.f14958p;
        if (i14 > i15) {
            i14 = i15;
        }
        d14.f14957o.m(String.valueOf(i14));
        ObservableInt observableInt = d14.f14952j;
        nf0.c.f57219a.getClass();
        observableInt.l(nf0.c.f(i14));
        lf0.a aVar4 = d14.d;
        sz1.c O = aVar4.O();
        ca0.e eVar = new ca0.e(new cf0.a(d14, 0), 17);
        b.a aVar5 = kz1.b.f50218a;
        n nVar = new n(O, eVar);
        n nVar2 = new n(aVar4.Z(), new ca0.e(new cf0.a(d14, 1), 18));
        n nVar3 = new n(aVar4.r(), new ca0.e(new cf0.a(d14, 2), 19));
        gz1.b bVar = d14.f14961s;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.a(nVar.k(300L, timeUnit).g(nVar2).k(300L, timeUnit).g(nVar3).v());
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
        this.f14944k.e();
        getLifecycle().c(d1());
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/brightness/WakeUpBrightnessActivity$a;", "", "<init>", "()V", "", "EXTRA_WAKE_UP_BRIGHTNESS", "Ljava/lang/String;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
