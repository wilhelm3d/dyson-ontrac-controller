package com.dyson.mobile.android.light.schedule.widget.wakeup.schedule;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import cl0.h;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.schedule.LightScheduleSettings;
import com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.a;
import com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.WakeUpScheduleMultipleEventActivity;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.schedule.response.Event;
import df0.e;
import f.j;
import f.x;
import fm1.o0;
import h12.y;
import java.util.Calendar;
import java.util.Date;
import je0.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.d1;
import le0.j0;
import le0.n1;
import le0.w1;
import le0.y0;
import og0.d;
import q8.t;
import rf0.i0;
import se1.q0;
import u51.i;
import uf0.g;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/WakeUpScheduleLandingActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WakeUpScheduleLandingActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f14963o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public og0.a f14964j;

    /* renamed from: k  reason: collision with root package name */
    public e f14965k;

    /* renamed from: l  reason: collision with root package name */
    public o f14966l;

    /* renamed from: m  reason: collision with root package name */
    public yd0.c f14967m;

    /* renamed from: n  reason: collision with root package name */
    public final c f14968n = new c();

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14969a;

        static {
            int[] iArr = new int[ot0.c.values().length];
            try {
                iArr[ot0.c.NEGATIVE_BUTTON_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ot0.c.POSITIVE_BUTTON_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14969a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/WakeUpScheduleLandingActivity$c", "Ldf0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements df0.a {

        /* renamed from: a  reason: collision with root package name */
        public final ut0.a f14970a = ut0.a.s(1, null);

        public c() {
        }

        @Override // df0.a
        public final void a() {
            this.f14970a.dismissAllowingStateLoss();
        }

        @Override // df0.a
        public final void b() {
            FragmentManager supportFragmentManager = WakeUpScheduleLandingActivity.this.getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            f13.g(R.id.schedule_landing_fragment_container, this.f14970a, null, 1);
            f13.n(true, true);
        }

        @Override // df0.a
        public final void c(int i13) {
            WakeUpScheduleLandingActivity wakeUpScheduleLandingActivity = WakeUpScheduleLandingActivity.this;
            o oVar = wakeUpScheduleLandingActivity.f14966l;
            if (oVar == null) {
                r.i("binding");
                throw null;
            }
            View childAt = oVar.d.e.getChildAt(i13);
            o oVar2 = wakeUpScheduleLandingActivity.f14966l;
            if (oVar2 == null) {
                r.i("binding");
                throw null;
            }
            View view = oVar2.d.d;
            view.getClass();
            view.setBackgroundResource(R.drawable.button_datepicker_item_light_background);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.X, view.getX(), childAt.getX()), PropertyValuesHolder.ofFloat(View.Y, view.getY(), childAt.getY()));
            ofPropertyValuesHolder.getClass();
            ofPropertyValuesHolder.setDuration(600L).setInterpolator(new DecelerateInterpolator(2.0f));
            if (view.getWidth() > 0 && view.getHeight() > 0) {
                view.setX(childAt.getX());
                view.setY(childAt.getY());
                ofPropertyValuesHolder.start();
                return;
            }
            view.setTop(childAt.getTop());
            view.setBottom(childAt.getBottom());
            view.setLeft(childAt.getLeft());
            view.setRight(childAt.getRight());
        }

        @Override // df0.a
        public final void d(iz1.a aVar, iz1.a aVar2) {
            WakeUpScheduleLandingActivity wakeUpScheduleLandingActivity = WakeUpScheduleLandingActivity.this;
            g.a(wakeUpScheduleLandingActivity).getClass();
            ConnectivityIssueActivity.f1(wakeUpScheduleLandingActivity, aVar, aVar2);
        }

        @Override // df0.a
        public final void e() {
            WakeUpScheduleLandingActivity.this.onBackPressed();
        }

        @Override // df0.a
        public final void f() {
            WakeUpScheduleLandingActivity wakeUpScheduleLandingActivity = WakeUpScheduleLandingActivity.this;
            og0.a aVar = wakeUpScheduleLandingActivity.f14964j;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b13 = aVar.b(d.light_connectionLost_header);
            og0.a aVar2 = wakeUpScheduleLandingActivity.f14964j;
            if (aVar2 == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b14 = aVar2.b(d.light_connectionLost_body);
            if (wakeUpScheduleLandingActivity.f14967m != null) {
                yd0.c.p(wakeUpScheduleLandingActivity, b13, b14, i0.L8, null, R.drawable.ic_warning, null);
            } else {
                r.i("coordinator");
                throw null;
            }
        }

        @Override // df0.a
        public final void g() {
            WakeUpScheduleLandingActivity wakeUpScheduleLandingActivity = WakeUpScheduleLandingActivity.this;
            yd0.c cVar = wakeUpScheduleLandingActivity.f14967m;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            WakeUpScheduleMultipleEventActivity.a aVar = WakeUpScheduleMultipleEventActivity.f14975q;
            String str = cVar.f89777h;
            aVar.getClass();
            str.getClass();
            wakeUpScheduleLandingActivity.startActivity(WakeUpScheduleMultipleEventActivity.a.a(wakeUpScheduleLandingActivity, str, null, -1, "06:00"));
        }

        @Override // df0.a
        public final void h() {
            a.C0501a c0501a = com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.a.f14972j;
            WakeUpScheduleLandingActivity wakeUpScheduleLandingActivity = WakeUpScheduleLandingActivity.this;
            yd0.c cVar = wakeUpScheduleLandingActivity.f14967m;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = cVar.f89777h;
            c0501a.getClass();
            str.getClass();
            com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.a aVar = new com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            aVar.show(wakeUpScheduleLandingActivity.getSupportFragmentManager(), "WakeUpModeDialog");
        }
    }

    public final e c1() {
        e eVar = this.f14965k;
        if (eVar != null) {
            return eVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        if (!c1().f23648z) {
            e c13 = c1();
            r51.r rVar = c13.f23632j;
            String str = c13.f23630h;
            b80.b bVar = rVar.f70443b;
            bVar.getClass();
            bVar.f7313a.remove(str);
            overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
            super.onBackPressed();
            return;
        }
        og0.a aVar = this.f14964j;
        if (aVar == null) {
            r.i("machineDataObject");
            throw null;
        }
        LocalisationKey b13 = aVar.b(d.light_scheduleExitDialogTitle);
        og0.a aVar2 = this.f14964j;
        if (aVar2 == null) {
            r.i("machineDataObject");
            throw null;
        }
        LocalisationKey b14 = aVar2.b(d.light_scheduleExitDialogDescription);
        getSupportFragmentManager().j0("WakeUpScheduleLandingActivity", this, new h(this, 25));
        if (this.f14967m != null) {
            yd0.c.p(this, b13, b14, i0.Q8, i0.P8, R.drawable.ic_scheduling_icon, "WakeUpScheduleLandingActivity");
        } else {
            r.i("coordinator");
            throw null;
        }
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
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14967m = a14;
        ke0.d dVar = a14.f89779j;
        og0.a c13 = dVar.c();
        le0.a aVar2 = dVar.f47424b;
        d1 d1Var = dVar.f47423a;
        this.f14964j = c13;
        n1 n1Var = dVar.f47425c;
        Object a15 = new j90.h(d1Var.f51597a).a(p61.d.class);
        a15.getClass();
        p61.d dVar2 = (p61.d) a15;
        MachineDefinition machineDefinition = d1Var.f51598b;
        p61.c cVar = new p61.c(null, machineDefinition.d.d, machineDefinition.f15558f, dVar2, 1, null);
        lf0.a aVar3 = dVar.Q.get();
        aVar2.getClass();
        aVar3.getClass();
        we0.c cVar2 = new we0.c(aVar3);
        aVar2.getClass();
        LightScheduleSettings lightScheduleSettings = new LightScheduleSettings(0, 1, null);
        pf0.c a16 = j0.a(aVar2);
        og0.a c14 = dVar.c();
        d1Var.getClass();
        we0.b bVar = new we0.b(c14);
        bVar.f89327a = d1Var.f51598b.d.d;
        bVar.f89328b = a16;
        this.f14965k = w1.a(n1Var, cVar, cVar2, lightScheduleSettings, bVar, j0.a(aVar2), dVar.c(), y0.a(aVar2));
        t d = q8.g.d(this, R.layout.activity_wake_up_schedule_landing);
        d.getClass();
        o oVar = (o) d;
        this.f14966l = oVar;
        e c15 = c1();
        c15.f23642t.setValue(c15, e.A[0], this.f14968n);
        Date date = new Date(System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        c15.f23638p = ((Integer) Event.f16732j.f36022k.get(Integer.valueOf(calendar.get(7)))).intValue();
        getLifecycle().a(c15);
        oVar.l(c15);
        o oVar2 = this.f14966l;
        if (oVar2 == null) {
            r.i("binding");
            throw null;
        }
        oVar2.f44739k.x(this);
        o oVar3 = this.f14966l;
        if (oVar3 == null) {
            r.i("binding");
            throw null;
        }
        RecyclerView recyclerView = oVar3.f44737i;
        recyclerView.setItemAnimator(y51.d.z(recyclerView.getContext()));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(c1().f23629g);
        o oVar4 = this.f14966l;
        if (oVar4 == null) {
            r.i("binding");
            throw null;
        }
        i iVar = oVar4.d;
        iVar.d.setBackgroundResource(R.drawable.button_datepicker_item_light_background);
        iVar.f81329h.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        iVar.f81337p.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        iVar.f81339r.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        iVar.f81335n.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        iVar.f81327f.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        iVar.f81331j.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        iVar.f81333l.setTextColor(c7.a.c(this, R.color.accessibleGrey));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        menu.clear();
        zs0.i.a(menu);
        return true;
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/WakeUpScheduleLandingActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ANIMATION_DURATION_MS", "J", "", "ANIMATION_FACTOR", "F", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
