package com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.schedule.LightScheduleSettings;
import com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.schedule.response.Event;
import com.dyson.mobile.android.schedule.response.Schedule;
import f.j;
import f.x;
import fm1.o0;
import go1.m;
import go1.n2;
import go1.s0;
import h12.e;
import je0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lb.u;
import le0.j0;
import le0.n1;
import le0.y0;
import og0.d;
import q8.g;
import q8.t;
import rf0.i0;
import se1.q0;
import we1.a;
import x12.r;
import xy1.h;
import yd0.c;
import zs0.i;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/WakeUpScheduleMultipleEventActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WakeUpScheduleMultipleEventActivity extends l.b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f14975q = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public og0.a f14976j;

    /* renamed from: k  reason: collision with root package name */
    public com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a f14977k;

    /* renamed from: l  reason: collision with root package name */
    public q f14978l;

    /* renamed from: m  reason: collision with root package name */
    public androidx.constraintlayout.widget.c f14979m;

    /* renamed from: n  reason: collision with root package name */
    public androidx.constraintlayout.widget.c f14980n;

    /* renamed from: o  reason: collision with root package name */
    public yd0.c f14981o;

    /* renamed from: p  reason: collision with root package name */
    public final c f14982p = new c();

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14983a;

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
            f14983a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/WakeUpScheduleMultipleEventActivity$c", "Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/a$b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements a.b {
        public c() {
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a.b
        public final void c(boolean z13) {
            androidx.constraintlayout.widget.c cVar;
            WakeUpScheduleMultipleEventActivity wakeUpScheduleMultipleEventActivity = WakeUpScheduleMultipleEventActivity.this;
            q qVar = wakeUpScheduleMultipleEventActivity.f14978l;
            if (qVar == null) {
                r.i("binding");
                throw null;
            }
            ConstraintLayout constraintLayout = qVar.f44781i;
            constraintLayout.getClass();
            u.a(null, constraintLayout);
            if (z13) {
                cVar = wakeUpScheduleMultipleEventActivity.f14980n;
                if (cVar == null) {
                    r.i("timePickerConstraintSet");
                    throw null;
                }
            } else {
                cVar = wakeUpScheduleMultipleEventActivity.f14979m;
                if (cVar == null) {
                    r.i("overviewConstraintSet");
                    throw null;
                }
            }
            cVar.b(constraintLayout);
            q qVar2 = wakeUpScheduleMultipleEventActivity.f14978l;
            if (qVar2 != null) {
                qVar2.invalidateAll();
            } else {
                r.i("binding");
                throw null;
            }
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a.b
        public final void e() {
            WakeUpScheduleMultipleEventActivity.this.onBackPressed();
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a.b
        public final void f() {
            WakeUpScheduleMultipleEventActivity wakeUpScheduleMultipleEventActivity = WakeUpScheduleMultipleEventActivity.this;
            og0.a aVar = wakeUpScheduleMultipleEventActivity.f14976j;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b13 = aVar.b(d.light_scheduleDeleteDialogHeader);
            og0.a aVar2 = wakeUpScheduleMultipleEventActivity.f14976j;
            if (aVar2 == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b14 = aVar2.b(d.light_scheduleDeleteDialogDescription);
            wakeUpScheduleMultipleEventActivity.getSupportFragmentManager().j0("WakeUpScheduleMultipleEventActivity", wakeUpScheduleMultipleEventActivity, new ef0.a(wakeUpScheduleMultipleEventActivity, 0));
            if (wakeUpScheduleMultipleEventActivity.f14981o != null) {
                yd0.c.p(wakeUpScheduleMultipleEventActivity, b13, b14, i0.E8, i0.M8, R.drawable.ic_scheduling_icon, "WakeUpScheduleMultipleEventActivity");
            } else {
                r.i("coordinator");
                throw null;
            }
        }

        @Override // com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a.b
        public final void g() {
            WakeUpScheduleMultipleEventActivity wakeUpScheduleMultipleEventActivity = WakeUpScheduleMultipleEventActivity.this;
            og0.a aVar = wakeUpScheduleMultipleEventActivity.f14976j;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b13 = aVar.b(d.light_scheduleUpdateDialogHeader);
            og0.a aVar2 = wakeUpScheduleMultipleEventActivity.f14976j;
            if (aVar2 == null) {
                r.i("machineDataObject");
                throw null;
            }
            LocalisationKey b14 = aVar2.b(d.light_scheduleUpdateDialogDescription);
            wakeUpScheduleMultipleEventActivity.getSupportFragmentManager().j0("WakeUpScheduleMultipleEventActivity", wakeUpScheduleMultipleEventActivity, new ef0.a(wakeUpScheduleMultipleEventActivity, 1));
            if (wakeUpScheduleMultipleEventActivity.f14981o != null) {
                yd0.c.p(wakeUpScheduleMultipleEventActivity, b13, b14, i0.E8, i0.M8, R.drawable.ic_scheduling_icon, "WakeUpScheduleMultipleEventActivity");
            } else {
                r.i("coordinator");
                throw null;
            }
        }
    }

    public final com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a c1() {
        com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a aVar = this.f14977k;
        if (aVar != null) {
            return aVar;
        }
        r.i("viewModel");
        throw null;
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
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID", "EXTRA_EVENT_DAYS", "EXTRA_GROUP_ID", "EXTRA_START_TIME"));
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14981o = a14;
        ke0.d dVar = a14.f89779j;
        this.f14976j = dVar.c();
        le0.a aVar2 = dVar.f47424b;
        j0.a(aVar2);
        n1 n1Var = dVar.f47425c;
        og0.a c13 = dVar.c();
        LightScheduleSettings lightScheduleSettings = new LightScheduleSettings(0, 1, null);
        r51.r a15 = y0.a(aVar2);
        r51.b bVar = r51.b.f70437a;
        h.b(bVar);
        pf0.c a16 = j0.a(aVar2);
        n1Var.getClass();
        this.f14977k = new com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a(c13, lightScheduleSettings, n1Var.f51675b.f89772b, a15, bVar, a16);
        t d = g.d(this, R.layout.activity_wake_up_schedule_multiple_event);
        d.getClass();
        q qVar = (q) d;
        this.f14978l = qVar;
        qVar.f44783k.x(this);
        q qVar2 = this.f14978l;
        if (qVar2 == null) {
            r.i("binding");
            throw null;
        }
        qVar2.f44780h.f81377h.setIs24HourView(Boolean.TRUE);
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        q qVar3 = this.f14978l;
        if (qVar3 == null) {
            r.i("binding");
            throw null;
        }
        qVar3.l(c1());
        com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a c14 = c1();
        c14.f15006w.setValue(c14, com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a.f14985z[0], this.f14982p);
        Intent intent2 = getIntent();
        intent2.getClass();
        Bundle I = cd.b.I(intent2);
        int i14 = I.getInt("EXTRA_GROUP_ID");
        boolean z13 = i14 != -1;
        String y14 = o0.y("EXTRA_START_TIME", I);
        int[] intArray = I.getIntArray("EXTRA_EVENT_DAYS");
        if (intArray == null) {
            fo1.a.o("EXTRA_EVENT_DAYS".concat(" was null"));
            return;
        }
        com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a c15 = c1();
        q61.d dVar2 = c15.f15007x;
        c15.f14998o = z13;
        c15.f14997n = i14;
        c15.f14994k.m(z13 ? c15.f14991h : c15.f14990g);
        c15.f14995l.m(z13 ? c15.f14993j : c15.f14992i);
        if (z13) {
            dVar2.getClass();
            for (int i15 : intArray) {
                dVar2.f65907a.f(i15);
                dVar2.f65909c.put(Integer.valueOf(i15), Boolean.TRUE);
                dVar2.f65908b.m(dVar2.a() ? i0.f71900w6 : i0.W5);
            }
        }
        c15.f15008y.f65917g.m(y14);
        c15.e();
        c15.f15000q.m(z13);
        Schedule a17 = c15.d.a(c15.f14988c);
        if (a17 != null) {
            c15.f14996m = a17;
        } else {
            Logger.e("Schedule retrieved is null", null);
        }
        Schedule schedule = c15.f14996m;
        if (schedule == null) {
            r.i("schedule");
            throw null;
        }
        c15.e();
        m t13 = m.t();
        n2 n2Var = Event.f16733k;
        n2Var.getClass();
        s0.b listIterator = n2Var.listIterator(0);
        while (listIterator.hasNext()) {
            Integer num = (Integer) listIterator.next();
            num.getClass();
            t13.j(num, schedule.m(num.intValue()).o());
            dVar2.d.put(num, Boolean.valueOf(!schedule.m(num.intValue()).o().isEmpty()));
        }
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        this.f14979m = cVar;
        q qVar4 = this.f14978l;
        if (qVar4 == null) {
            r.i("binding");
            throw null;
        }
        cVar.e(qVar4.f44781i);
        androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
        this.f14980n = cVar2;
        cVar2.d(this, R.layout.activity_wake_up_schedule_timepicker);
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/WakeUpScheduleMultipleEventActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_EVENT_DAYS", "EXTRA_GROUP_ID", "EXTRA_START_TIME", "", "DEFAULT_SCHEDULE_EVENT_GROUP_ID", "I", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, int[] iArr, int i13, String str2) {
            context.getClass();
            str.getClass();
            str2.getClass();
            Intent putExtra = new Intent(context, WakeUpScheduleMultipleEventActivity.class).putExtra("COORDINATOR_ID", str);
            if (iArr == null) {
                iArr = new int[0];
            }
            Intent putExtra2 = putExtra.putExtra("EXTRA_EVENT_DAYS", iArr).putExtra("EXTRA_GROUP_ID", i13).putExtra("EXTRA_START_TIME", str2);
            putExtra2.getClass();
            return putExtra2;
        }

        private a() {
        }
    }
}
