package com.dyson.mobile.android.schedule.config.time;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.FragmentManager;
import by0.d;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.view.DysonButton;
import com.dyson.mobile.android.resources.view.DysonCheckbox;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.robot.cloud.model.schedule.RobotScheduleSettings;
import com.dyson.mobile.android.schedule.response.Event;
import com.dyson.mobile.android.schedule.response.ScheduleSettings;
import com.google.gson.Gson;
import go1.f0;
import go1.s0;
import go1.t0;
import h12.y;
import j90.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import lb.u;
import pf0.c;
import r51.f;
import r51.q;
import r51.r;
import rf0.g0;
import rf0.i0;
import t51.g;
import zs0.e;
/* loaded from: classes3.dex */
public class ScheduleEditEventActivity extends l.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f16711v = 0;

    /* renamed from: j  reason: collision with root package name */
    public g f16712j;

    /* renamed from: k  reason: collision with root package name */
    public c f16713k;

    /* renamed from: l  reason: collision with root package name */
    public q f16714l;

    /* renamed from: m  reason: collision with root package name */
    public u51.a f16715m;

    /* renamed from: n  reason: collision with root package name */
    public int[] f16716n;

    /* renamed from: o  reason: collision with root package name */
    public int f16717o;

    /* renamed from: p  reason: collision with root package name */
    public String f16718p;

    /* renamed from: q  reason: collision with root package name */
    public String f16719q;

    /* renamed from: r  reason: collision with root package name */
    public e f16720r;

    /* renamed from: s  reason: collision with root package name */
    public androidx.constraintlayout.widget.c f16721s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.constraintlayout.widget.c f16722t;

    /* renamed from: u  reason: collision with root package name */
    public final a f16723u = new a();

    /* loaded from: classes3.dex */
    public class a implements t51.c {
        public a() {
        }

        @Override // t51.c
        public final void a() {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            scheduleEditEventActivity.setResult(-2);
            scheduleEditEventActivity.onBackPressed();
        }

        @Override // t51.c
        public final void b(boolean z13, ArrayList arrayList, Event event) {
            String d;
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            String str = r61.c.c(arrayList, scheduleEditEventActivity.f16713k).f70500a;
            int size = arrayList.size();
            c cVar = scheduleEditEventActivity.f16713k;
            String d13 = size > 1 ? cVar.d(i0.X6) : cVar.d(i0.U6);
            if (z13) {
                int size2 = arrayList.size();
                c cVar2 = scheduleEditEventActivity.f16713k;
                d = size2 > 1 ? cVar2.d(i0.Z6) : if1.g.a(cVar2.d(i0.W6), str);
            } else {
                int size3 = arrayList.size();
                c cVar3 = scheduleEditEventActivity.f16713k;
                d = size3 > 1 ? cVar3.d(i0.Y6) : if1.g.a(cVar3.d(i0.V6), str);
            }
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = d13;
            a13.f93108b = d;
            a13.f93110f = true;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.M8), new t51.a(this, event, 0));
            a13.b(scheduleEditEventActivity.f16713k.d(i0.E8), null);
            a13.d();
        }

        @Override // t51.c
        public final void c(boolean z13) {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            ConstraintLayout constraintLayout = scheduleEditEventActivity.f16715m.f81289k;
            u.a(null, constraintLayout);
            (z13 ? scheduleEditEventActivity.f16722t : scheduleEditEventActivity.f16721s).b(constraintLayout);
            scheduleEditEventActivity.f16715m.invalidateAll();
        }

        @Override // t51.c
        public final void d() {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = scheduleEditEventActivity.f16713k.d(i0.f71641f7);
            a13.f93108b = scheduleEditEventActivity.f16713k.d(i0.f71657g7);
            a13.f93110f = false;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.L8), null);
            a13.d();
        }

        @Override // t51.c
        public final void e(boolean z13) {
            int i13 = ScheduleEditEventActivity.f16711v;
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            scheduleEditEventActivity.getClass();
            LocalisationKey localisationKey = z13 ? i0.S6 : i0.Q6;
            LocalisationKey localisationKey2 = z13 ? i0.T6 : i0.R6;
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = scheduleEditEventActivity.f16713k.d(localisationKey);
            a13.f93108b = scheduleEditEventActivity.f16713k.d(localisationKey2);
            a13.f93110f = true;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.M8), new a20.a(scheduleEditEventActivity, 22));
            a13.b(scheduleEditEventActivity.f16713k.d(i0.E8), new d(3));
            a13.d();
        }

        @Override // t51.c
        public final void f() {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            scheduleEditEventActivity.f16714l.getClass();
            q.b(scheduleEditEventActivity);
        }

        @Override // t51.c
        public final void g(iz1.a aVar, iz1.a aVar2) {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            uf0.g.a(scheduleEditEventActivity).getClass();
            ConnectivityIssueActivity.f1(scheduleEditEventActivity, aVar, aVar2);
        }

        @Override // t51.c
        public final void h() {
            ScheduleEditEventActivity.this.onBackPressed();
        }

        @Override // t51.c
        public final void i(boolean z13) {
            int i13 = ScheduleEditEventActivity.f16711v;
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            if (z13) {
                scheduleEditEventActivity.e1(z13, 0.0f, 0.85f);
            } else {
                scheduleEditEventActivity.e1(z13, 0.85f, 0.0f);
            }
        }

        @Override // t51.c
        public final void j(boolean z13, ArrayList arrayList, Pair pair) {
            String d;
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            String str = r61.c.c(arrayList, scheduleEditEventActivity.f16713k).f70500a;
            if (z13) {
                int size = arrayList.size();
                c cVar = scheduleEditEventActivity.f16713k;
                d = size > 1 ? cVar.d(i0.f71625e7) : if1.g.a(cVar.d(i0.f71579b7), str);
            } else {
                int size2 = arrayList.size();
                c cVar2 = scheduleEditEventActivity.f16713k;
                d = size2 > 1 ? cVar2.d(i0.f71610d7) : if1.g.a(cVar2.d(i0.f71563a7), str);
            }
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = scheduleEditEventActivity.f16713k.d(i0.f71595c7);
            a13.f93108b = d;
            a13.f93110f = true;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.D8), new t51.b(this, pair, 0));
            a13.b(scheduleEditEventActivity.f16713k.d(i0.E8), null);
            a13.d();
        }

        @Override // t51.c
        public final void k(RobotScheduleSettings robotScheduleSettings) {
            g gVar = ScheduleEditEventActivity.this.f16712j;
            gVar.getClass();
            robotScheduleSettings.getClass();
            gVar.f78260f = robotScheduleSettings;
            gVar.r();
            gVar.p();
        }

        @Override // t51.c
        public final void l(Event event) {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = scheduleEditEventActivity.f16713k.d(g0.f71485o);
            a13.f93108b = scheduleEditEventActivity.f16713k.d(g0.f71489p);
            a13.f93110f = false;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.M8), new t51.a(this, event, 1));
            a13.b(scheduleEditEventActivity.f16713k.d(i0.E8), null);
            a13.d();
        }

        @Override // t51.c
        public final void m(Pair<Event, Event> pair) {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = scheduleEditEventActivity.f16713k.d(i0.f71672h7);
            a13.f93108b = scheduleEditEventActivity.f16713k.d(i0.f71687i7);
            a13.f93110f = false;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.D8), new t51.b(this, pair, 1));
            a13.b(scheduleEditEventActivity.f16713k.d(i0.W8), new a20.a(this, 23));
            a13.d();
        }

        @Override // t51.c
        public final void n() {
            ScheduleEditEventActivity scheduleEditEventActivity = ScheduleEditEventActivity.this;
            e.a a13 = scheduleEditEventActivity.f16720r.a();
            a13.f93107a = scheduleEditEventActivity.f16713k.d(i0.f71749m7);
            a13.f93108b = scheduleEditEventActivity.f16713k.d(i0.f71765n7);
            a13.f93110f = false;
            a13.c(scheduleEditEventActivity.f16713k.d(i0.L8), null);
            a13.d();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ boolean d;

        public b(boolean z13) {
            this.d = z13;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.d) {
                return;
            }
            ScheduleEditEventActivity.this.f16712j.f78272r.m(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.d) {
                ScheduleEditEventActivity.this.f16712j.f78272r.m(true);
            }
        }
    }

    public static Intent c1(Activity activity, int[] iArr, int i13, String str, String str2) {
        Intent intent = new Intent(activity, ScheduleEditEventActivity.class);
        if (iArr == null) {
            iArr = new int[0];
        }
        return intent.putExtra("SCHEDULE_EVENT_DAYS", iArr).putExtra("EXTRA_SCHEDULE_EVENT_GROUPID", i13).putExtra("SCHEDULE_PERIOD_START_TIME", str).putExtra("SCHEDULE_PERIOD_END_TIME", str2);
    }

    public final void d1() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        f13.i(R.id.settings_fragment_container, this.f16714l.f70441b.e(this.f16712j.f78260f, this.f16723u), null);
        f13.n(true, true);
    }

    public final void e1(boolean z13, float... fArr) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f16715m.f81284f, View.ALPHA, fArr);
        ofFloat.setRepeatCount(0);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat.addListener(new b(z13));
        ofFloat.start();
    }

    @Override // androidx.fragment.app.e, f.g, android.app.Activity
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        if (i13 == 0 && i14 == 1 && intent != null) {
            ScheduleSettings scheduleSettings = (ScheduleSettings) c7.c.a(intent, "SCHEDULE_SETTINGS", ScheduleSettings.class);
            g gVar = this.f16712j;
            gVar.getClass();
            scheduleSettings.getClass();
            gVar.f78260f = scheduleSettings;
            gVar.r();
            gVar.p();
            d1();
        }
    }

    @Override // f.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_down);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z13;
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        setTheme(2132083630);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f16716n = extras.getIntArray("SCHEDULE_EVENT_DAYS");
            this.f16717o = extras.getInt("EXTRA_SCHEDULE_EVENT_GROUPID", -1);
            this.f16718p = extras.getString("SCHEDULE_PERIOD_START_TIME");
            this.f16719q = extras.getString("SCHEDULE_PERIOD_END_TIME");
        }
        q qVar = q.f70439c;
        this.f16714l = qVar;
        if (qVar != null) {
            v51.b bVar = qVar.f70440a;
            w51.a aVar = bVar.f83281a;
            p61.d dVar = (p61.d) new h(aVar.f85260a).a(p61.d.class);
            xy1.h.b(dVar);
            Gson gson = aVar.f85262c;
            r51.g gVar = aVar.f85261b;
            p61.c cVar = new p61.c(gson, gVar.p(), gVar.h().getMachineType(), dVar);
            w51.a aVar2 = bVar.f83281a;
            ScheduleSettings f13 = aVar2.f85261b.f();
            xy1.h.b(f13);
            r a13 = w51.c.a(aVar2);
            r51.d dVar2 = bVar.f83282b.get();
            f<?> b13 = aVar2.f85261b.b();
            c a14 = w51.b.a(aVar2);
            hj.e eVar = bVar.f83283c.get();
            aVar.getClass();
            r51.g gVar2 = aVar.f85261b;
            this.f16712j = new g(gVar2.p(), gVar2.h().getMachineType(), f13, b13, dVar2, cVar, a13, a14, eVar);
            this.f16713k = w51.b.a(aVar2);
            u51.a aVar3 = (u51.a) q8.g.d(this, R.layout.activity_schedule_edit_event);
            this.f16715m = aVar3;
            aVar3.f81287i.f81377h.setIs24HourView(Boolean.TRUE);
            this.f16715m.l(this.f16712j);
            g gVar3 = this.f16712j;
            gVar3.getClass();
            gVar3.f78266l = new WeakReference<>(this.f16723u);
            boolean z14 = true;
            boolean z15 = this.f16717o != -1;
            this.f16715m.f81290l.setBackgroundResource(z15 ? R.drawable.button_secondary_background : R.drawable.button_primary_background);
            DysonButton dysonButton = this.f16715m.f81287i.f81376g;
            c cVar2 = this.f16713k;
            LocalisationKey localisationKey = i0.B8;
            zs0.b.d(dysonButton, cVar2.d(localisationKey));
            zs0.b.d(this.f16715m.f81287i.d, this.f16713k.d(localisationKey));
            zs0.b.d(this.f16715m.f81286h.d, this.f16713k.d(i0.I7));
            zs0.b.c(this.f16715m.f81285g.f81347f);
            zs0.b.c(this.f16715m.f81285g.f81355n);
            zs0.b.c(this.f16715m.f81285g.f81357p);
            zs0.b.c(this.f16715m.f81285g.f81353l);
            zs0.b.c(this.f16715m.f81285g.d);
            zs0.b.c(this.f16715m.f81285g.f81349h);
            zs0.b.c(this.f16715m.f81285g.f81351j);
            DysonCheckbox dysonCheckbox = this.f16715m.f81285g.f81347f;
            c cVar3 = this.f16713k;
            LocalisationKey localisationKey2 = i0.J7;
            zs0.b.d(dysonCheckbox, cVar3.d(localisationKey2));
            zs0.b.d(this.f16715m.f81285g.f81355n, this.f16713k.d(localisationKey2));
            zs0.b.d(this.f16715m.f81285g.f81357p, this.f16713k.d(localisationKey2));
            zs0.b.d(this.f16715m.f81285g.f81353l, this.f16713k.d(localisationKey2));
            zs0.b.d(this.f16715m.f81285g.d, this.f16713k.d(localisationKey2));
            zs0.b.d(this.f16715m.f81285g.f81349h, this.f16713k.d(localisationKey2));
            zs0.b.d(this.f16715m.f81285g.f81351j, this.f16713k.d(localisationKey2));
            g gVar4 = this.f16712j;
            int i13 = g.Q;
            gVar4.f78277w.m(z15);
            gVar4.f78276v.m(z15 ? i0.f71840s6 : i0.Q5);
            gVar4.f78278x.l(z15 ? i13 : g.P);
            gVar4.f78279y.m(z15 ? i0.f71735l9 : i0.T8);
            ObservableInt observableInt = gVar4.f78280z;
            if (z15) {
                i13 = g.R;
            }
            observableInt.l(i13);
            gVar4.A.l(z15 ? 4 : 0);
            gVar4.C.l(z15 ? g.T : g.S);
            gVar4.E.m(z15 ? i0.f71915x6 : i0.Q5);
            g gVar5 = this.f16712j;
            gVar5.G = this.f16717o;
            String str = this.f16718p;
            str.getClass();
            gVar5.K = str;
            gVar5.O.b(str);
            g gVar6 = this.f16712j;
            String str2 = this.f16719q;
            gVar6.L = str2;
            q61.h hVar = gVar6.O;
            hVar.f65916f.m(str2 != null);
            hVar.d.m(hVar.f65914b.c(hVar.f65916f.d ? R.string.schedulingAddEvent_startAndFinishTime : R.string.schedulingAddEvent_startTime));
            if (str2 != null) {
                hVar.a(str2);
            }
            q61.d dVar3 = this.f16712j.N;
            int[] iArr = this.f16716n;
            dVar3.getClass();
            iArr.getClass();
            for (int i14 : iArr) {
                dVar3.f65907a.f(i14);
                dVar3.f65909c.put(Integer.valueOf(i14), Boolean.TRUE);
                dVar3.f65908b.m(dVar3.a() ? i0.f71900w6 : i0.W5);
            }
            g gVar7 = this.f16712j;
            if (gVar7.f78277w.d) {
                g gVar8 = this.f16712j;
                ScheduleSettings k13 = ((Event) f0.l(gVar7.f78267m.p()).j(new ef0.b(this, 5)).get()).k();
                gVar8.getClass();
                k13.getClass();
                gVar8.M = k13;
                gVar8.f78260f = k13.clone();
            }
            androidx.constraintlayout.widget.c cVar4 = new androidx.constraintlayout.widget.c();
            this.f16721s = cVar4;
            cVar4.e(this.f16715m.f81289k);
            androidx.constraintlayout.widget.c cVar5 = new androidx.constraintlayout.widget.c();
            this.f16722t = cVar5;
            cVar5.d(this, R.layout.activity_schedule_edit_event_timepicker);
            g gVar9 = this.f16712j;
            ObservableBoolean observableBoolean = gVar9.f78271q;
            s0<Event> n13 = ((t0) gVar9.f78267m.l()).n(Integer.valueOf(gVar9.G));
            n13.getClass();
            if (!n13.isEmpty()) {
                for (Event event : n13) {
                    if (event.p()) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            gVar9.I = z13;
            observableBoolean.m(z13);
            gVar9.v();
            gVar9.s();
            gVar9.f78272r.m((observableBoolean.d || !gVar9.f78277w.d) ? false : false);
            gVar9.p();
            gVar9.q();
            d1();
            overridePendingTransition(R.anim.slide_in_up, R.anim.stay);
            this.f16720r = new e(this);
        } else {
            Logger.b("Failed to get ScheduleCoordinator - exiting ScheduleEditEventActivity", null);
            finish();
        }
        se1.a.b(this, 3);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f16712j;
        if (gVar != null) {
            gVar.f78265k.e();
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
