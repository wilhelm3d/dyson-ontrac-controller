package com.dyson.mobile.android.schedule.landing;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.schedule.config.time.ScheduleEditEventActivity;
import com.dyson.mobile.android.schedule.response.Event;
import com.dyson.mobile.android.schedule.response.Schedule;
import com.google.gson.Gson;
import h12.y;
import java.lang.ref.WeakReference;
import l.b;
import p61.c;
import r51.q;
import r51.r;
import r51.s;
import uf0.g;
import uf0.l;
import uf1.d;
import vk0.n;
import y51.e;
import y51.h;
import y51.i;
import y51.k;
/* loaded from: classes3.dex */
public class ScheduleLandingActivity extends b {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f16725o = 0;

    /* renamed from: j  reason: collision with root package name */
    public q f16726j;

    /* renamed from: k  reason: collision with root package name */
    public e f16727k;

    /* renamed from: m  reason: collision with root package name */
    public k f16729m;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16728l = true;

    /* renamed from: n  reason: collision with root package name */
    public final a f16730n = new a();

    /* loaded from: classes3.dex */
    public class a implements i {
        public a() {
        }

        @Override // y51.i
        public final void a() {
            ScheduleLandingActivity.this.onBackPressed();
            q.f70439c = null;
        }

        @Override // y51.i
        public final void b(Schedule schedule) {
            ScheduleLandingActivity scheduleLandingActivity = ScheduleLandingActivity.this;
            e eVar = scheduleLandingActivity.f16727k;
            if (eVar == null) {
                boolean z13 = scheduleLandingActivity.f16728l;
                e eVar2 = new e();
                Bundle bundle = new Bundle();
                bundle.putBoolean("EXTRA_SHOW_CURRENT_DAY", z13);
                bundle.putParcelable("EXTRA_SCHEDULE", schedule);
                eVar2.setArguments(bundle);
                scheduleLandingActivity.f16727k = eVar2;
                eVar2.f89291i = scheduleLandingActivity.f16730n;
            } else {
                h hVar = eVar.d;
                hVar.getClass();
                schedule.getClass();
                hVar.l(schedule);
                hVar.k();
                hVar.m(((Number) Event.f16733k.get(hVar.f89298i)).intValue());
            }
            FragmentManager supportFragmentManager = scheduleLandingActivity.getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            f13.i(R.id.schedule_landing_fragment_container, scheduleLandingActivity.f16727k, null);
            f13.n(true, true);
            scheduleLandingActivity.f16728l = true;
        }

        @Override // y51.i
        public final void c() {
            int i13 = ScheduleLandingActivity.f16725o;
            ScheduleLandingActivity.this.c1();
        }

        @Override // y51.i
        public final void d() {
            ScheduleLandingActivity scheduleLandingActivity = ScheduleLandingActivity.this;
            scheduleLandingActivity.f16728l = false;
            scheduleLandingActivity.f16727k = null;
            y51.a aVar = new y51.a();
            FragmentManager supportFragmentManager = scheduleLandingActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.i(R.id.schedule_landing_fragment_container, aVar, null);
            aVar2.n(true, true);
        }

        @Override // y51.i
        public final void e(boolean z13) {
            ScheduleLandingActivity.this.f16729m.f89323l.m(z13);
        }

        @Override // y51.i
        public final void f() {
            ScheduleLandingActivity scheduleLandingActivity = ScheduleLandingActivity.this;
            q qVar = scheduleLandingActivity.f16726j;
            xx0.e eVar = new xx0.e(this, 6);
            if (qVar.f70441b.a().f70438a) {
                s sVar = s.CUSTOM;
                d a13 = d.a(scheduleLandingActivity);
                int i13 = ScheduleEditEventActivity.f16711v;
                a13.b(ScheduleEditEventActivity.c1(scheduleLandingActivity, null, -1, sVar.getStartTime(), sVar.getEndTime())).p(eVar, new qv1.s(7));
                return;
            }
            s sVar2 = s.START_TIME_ONLY;
            d a14 = d.a(scheduleLandingActivity);
            int i14 = ScheduleEditEventActivity.f16711v;
            a14.b(ScheduleEditEventActivity.c1(scheduleLandingActivity, null, -1, sVar2.getStartTime(), sVar2.getEndTime())).p(eVar, new qv1.s(7));
        }

        @Override // y51.i
        public final void g(s70.b bVar) {
            ScheduleLandingActivity scheduleLandingActivity = ScheduleLandingActivity.this;
            g a13 = g.a(scheduleLandingActivity);
            s70.b bVar2 = new s70.b(this, 24);
            a13.getClass();
            ConnectivityIssueActivity.f1(scheduleLandingActivity, bVar, bVar2);
        }
    }

    public final void c1() {
        ut0.a s13 = ut0.a.s(2, null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        f13.g(R.id.schedule_landing_fragment_container, s13, null, 1);
        f13.n(true, true);
        this.f16729m.a();
    }

    @Override // f.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q qVar = q.f70439c;
        this.f16726j = qVar;
        if (qVar != null) {
            v51.b bVar = qVar.f70440a;
            w51.a aVar = bVar.f83281a;
            n j8 = new l(aVar.f85260a).j();
            w51.a aVar2 = bVar.f83281a;
            p61.d dVar = (p61.d) new j90.h(aVar2.f85260a).a(p61.d.class);
            xy1.h.b(dVar);
            Gson gson = aVar2.f85262c;
            r51.g gVar = aVar2.f85261b;
            c cVar = new c(gson, gVar.p(), gVar.h().getMachineType(), dVar);
            r a13 = w51.c.a(aVar);
            pf0.c a14 = w51.b.a(aVar);
            r51.g gVar2 = aVar.f85261b;
            gVar2.getClass();
            this.f16729m = new k(null, gVar2.g(), gVar2.p(), j8, cVar, a13, a14);
            ((u51.c) q8.g.d(this, R.layout.activity_schedule_landing)).l(this.f16729m);
            k kVar = this.f16729m;
            kVar.getClass();
            kVar.f89314a = new WeakReference<>(this.f16730n);
            overridePendingTransition(R.anim.slide_in_up, R.anim.stay);
            c1();
        } else {
            Logger.b("Failed to get ScheduleCoordinator - exiting ScheduleLandingActivity", null);
            finish();
        }
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f16729m;
        if (kVar != null) {
            kVar.f89315b.e();
        }
    }

    @Override // f.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f16729m != null) {
            c1();
        }
    }
}
