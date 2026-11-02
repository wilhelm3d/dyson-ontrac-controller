package com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.schedule.LightScheduleSettings;
import com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import f.j;
import f.x;
import fm1.o0;
import h12.e;
import h12.y;
import j90.h;
import je0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.u;
import le0.d1;
import le0.j0;
import le0.n1;
import og0.d;
import q8.t;
import rf0.i0;
import se1.q0;
import uf0.g;
import we1.a;
import x12.r;
import yd0.c;
import zs0.i;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/WakeUpScheduleSingleEventActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WakeUpScheduleSingleEventActivity extends l.b {

    /* renamed from: r  reason: collision with root package name */
    public static final a f15009r = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public og0.a f15010j;

    /* renamed from: k  reason: collision with root package name */
    public com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a f15011k;

    /* renamed from: l  reason: collision with root package name */
    public s f15012l;

    /* renamed from: m  reason: collision with root package name */
    public c f15013m;

    /* renamed from: n  reason: collision with root package name */
    public c f15014n;

    /* renamed from: o  reason: collision with root package name */
    public yd0.c f15015o;

    /* renamed from: p  reason: collision with root package name */
    public final ut0.a f15016p = ut0.a.s(1, null);

    /* renamed from: q  reason: collision with root package name */
    public final b f15017q = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/WakeUpScheduleSingleEventActivity$b", "Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/a$b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a.b {
        public b() {
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.b
        public final void a() {
            WakeUpScheduleSingleEventActivity.this.f15016p.dismissAllowingStateLoss();
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.b
        public final void b() {
            WakeUpScheduleSingleEventActivity wakeUpScheduleSingleEventActivity = WakeUpScheduleSingleEventActivity.this;
            FragmentManager supportFragmentManager = wakeUpScheduleSingleEventActivity.getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            f13.g(R.id.schedule_landing_fragment_container, wakeUpScheduleSingleEventActivity.f15016p, null, 1);
            f13.n(true, true);
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.b
        public final void c(boolean z13) {
            c cVar;
            WakeUpScheduleSingleEventActivity wakeUpScheduleSingleEventActivity = WakeUpScheduleSingleEventActivity.this;
            s sVar = wakeUpScheduleSingleEventActivity.f15012l;
            if (sVar == null) {
                r.i("binding");
                throw null;
            }
            ConstraintLayout constraintLayout = sVar.f44821i;
            constraintLayout.getClass();
            u.a(null, constraintLayout);
            if (z13) {
                cVar = wakeUpScheduleSingleEventActivity.f15014n;
                if (cVar == null) {
                    r.i("timePickerConstraintSet");
                    throw null;
                }
            } else {
                cVar = wakeUpScheduleSingleEventActivity.f15013m;
                if (cVar == null) {
                    r.i("overviewConstraintSet");
                    throw null;
                }
            }
            cVar.b(constraintLayout);
            s sVar2 = wakeUpScheduleSingleEventActivity.f15012l;
            if (sVar2 != null) {
                sVar2.invalidateAll();
            } else {
                r.i("binding");
                throw null;
            }
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.b
        public final void d(iz1.a aVar, iz1.a aVar2) {
            WakeUpScheduleSingleEventActivity wakeUpScheduleSingleEventActivity = WakeUpScheduleSingleEventActivity.this;
            g.a(wakeUpScheduleSingleEventActivity).getClass();
            ConnectivityIssueActivity.f1(wakeUpScheduleSingleEventActivity, aVar, aVar2);
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.b
        public final void e() {
            WakeUpScheduleSingleEventActivity.this.onBackPressed();
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.b
        public final void f() {
            WakeUpScheduleSingleEventActivity wakeUpScheduleSingleEventActivity = WakeUpScheduleSingleEventActivity.this;
            og0.a aVar = wakeUpScheduleSingleEventActivity.f15010j;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b13 = aVar.b(d.light_connectionLost_header);
            og0.a aVar2 = wakeUpScheduleSingleEventActivity.f15010j;
            if (aVar2 == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b14 = aVar2.b(d.light_connectionLost_body);
            if (wakeUpScheduleSingleEventActivity.f15015o != null) {
                yd0.c.p(wakeUpScheduleSingleEventActivity, b13, b14, i0.L8, null, R.drawable.ic_warning, null);
            } else {
                r.i("coordinator");
                throw null;
            }
        }
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        setTheme(2132083631);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        a14.getClass();
        this.f15015o = a14;
        ke0.d dVar = a14.f89779j;
        this.f15010j = dVar.c();
        le0.a aVar2 = dVar.f47424b;
        j0.a(aVar2);
        n1 n1Var = dVar.f47425c;
        og0.a c13 = dVar.c();
        d1 d1Var = dVar.f47423a;
        Object a15 = new h(d1Var.f51597a).a(p61.d.class);
        a15.getClass();
        MachineDefinition machineDefinition = d1Var.f51598b;
        p61.c cVar = new p61.c(null, machineDefinition.d.d, machineDefinition.f15558f, (p61.d) a15, 1, null);
        LightScheduleSettings lightScheduleSettings = new LightScheduleSettings(0, 1, null);
        lf0.a aVar3 = dVar.Q.get();
        aVar2.getClass();
        aVar3.getClass();
        we0.c cVar2 = new we0.c(aVar3);
        r51.b bVar = r51.b.f70437a;
        xy1.h.b(bVar);
        pf0.c a16 = j0.a(aVar2);
        n1Var.getClass();
        this.f15011k = new com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a(c13, cVar, lightScheduleSettings, cVar2, bVar, a16);
        t d = q8.g.d(this, R.layout.activity_wake_up_schedule_single_event);
        d.getClass();
        s sVar = (s) d;
        this.f15012l = sVar;
        sVar.f44823k.x(this);
        s sVar2 = this.f15012l;
        if (sVar2 == null) {
            r.i("binding");
            throw null;
        }
        sVar2.f44819g.f81377h.setIs24HourView(Boolean.TRUE);
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        s sVar3 = this.f15012l;
        if (sVar3 == null) {
            r.i("binding");
            throw null;
        }
        com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a aVar4 = this.f15011k;
        if (aVar4 == null) {
            r.i("viewModel");
            throw null;
        }
        sVar3.l(aVar4);
        com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a aVar5 = this.f15011k;
        if (aVar5 == null) {
            r.i("viewModel");
            throw null;
        }
        aVar5.f15040x.setValue(aVar5, com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a.A[0], this.f15017q);
        com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a aVar6 = this.f15011k;
        if (aVar6 == null) {
            r.i("viewModel");
            throw null;
        }
        aVar6.c();
        androidx.constraintlayout.widget.c cVar3 = new androidx.constraintlayout.widget.c();
        this.f15013m = cVar3;
        s sVar4 = this.f15012l;
        if (sVar4 == null) {
            r.i("binding");
            throw null;
        }
        cVar3.e(sVar4.f44821i);
        androidx.constraintlayout.widget.c cVar4 = new androidx.constraintlayout.widget.c();
        this.f15014n = cVar4;
        cVar4.d(this, R.layout.activity_wake_up_schedule_timepicker);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        menu.clear();
        i.a(menu);
        return true;
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/WakeUpScheduleSingleEventActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
