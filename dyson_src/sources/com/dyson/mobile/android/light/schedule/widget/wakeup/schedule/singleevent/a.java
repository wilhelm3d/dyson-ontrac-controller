package com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent;

import androidx.databinding.ObservableBoolean;
import com.dyson.mobile.android.light.schedule.LightScheduleSettings;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.schedule.response.Event;
import com.dyson.mobile.android.schedule.response.Schedule;
import e22.m;
import fe0.e;
import go1.t1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import q61.g;
import q61.h;
import q8.n;
import rf0.i0;
import rz1.s;
import rz1.u;
import sz1.j;
import x12.p0;
import x12.r;
import x12.y;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/a;", "", "Log0/a;", "machineDataObject", "Lp61/c;", "scheduleTaskFactory", "Lcom/dyson/mobile/android/light/schedule/LightScheduleSettings;", "scheduleSettings", "Lwe0/c;", "lightScheduleManager", "Lr51/d;", "eventGroupIdGenerator", "Lpf0/c;", "localisationManager", "<init>", "(Log0/a;Lp61/c;Lcom/dyson/mobile/android/light/schedule/LightScheduleSettings;Lwe0/c;Lr51/d;Lpf0/c;)V", "b", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ m<Object>[] A = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/WakeUpScheduleSingleEventViewModel$Navigator;", 0))};

    /* renamed from: a  reason: collision with root package name */
    public final p61.c f15019a;

    /* renamed from: b  reason: collision with root package name */
    public final LightScheduleSettings f15020b;

    /* renamed from: c  reason: collision with root package name */
    public final we0.c f15021c;
    public final r51.d d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final LocalisationKey f15022f;

    /* renamed from: g  reason: collision with root package name */
    public final LocalisationKey f15023g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15024h;

    /* renamed from: i  reason: collision with root package name */
    public final gz1.b f15025i;

    /* renamed from: j  reason: collision with root package name */
    public final go1.m<Integer, Event> f15026j;

    /* renamed from: k  reason: collision with root package name */
    public int f15027k;

    /* renamed from: l  reason: collision with root package name */
    public final q8.m<Integer, Boolean> f15028l;

    /* renamed from: m  reason: collision with root package name */
    public final n<String> f15029m;

    /* renamed from: n  reason: collision with root package name */
    public final n<String> f15030n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableBoolean f15031o;

    /* renamed from: p  reason: collision with root package name */
    public final ObservableBoolean f15032p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableBoolean f15033q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableBoolean f15034r;

    /* renamed from: s  reason: collision with root package name */
    public final ObservableBoolean f15035s;

    /* renamed from: t  reason: collision with root package name */
    public String f15036t;

    /* renamed from: u  reason: collision with root package name */
    public final e2.a<Integer, Boolean> f15037u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15038v;

    /* renamed from: w  reason: collision with root package name */
    public Schedule f15039w;

    /* renamed from: x  reason: collision with root package name */
    public final tf1.a f15040x;

    /* renamed from: y  reason: collision with root package name */
    public final q61.d f15041y;

    /* renamed from: z  reason: collision with root package name */
    public final h f15042z;

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();

        void c(boolean z13);

        void d(iz1.a aVar, iz1.a aVar2);

        void e();

        void f();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/a$c", "Lq61/c;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements q61.c {
        public c() {
        }

        @Override // q61.c
        public final void f(int i13) {
            a.this.f15037u.put(Integer.valueOf(i13), Boolean.TRUE);
        }

        @Override // q61.c
        public final void h(boolean z13) {
            a aVar = a.this;
            aVar.f15035s.m(a.a(aVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/a$d", "Lq61/g;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements g {
        public d() {
        }

        @Override // q61.g
        public final void a() {
            a aVar = a.this;
            b b13 = aVar.b();
            if (b13 != null) {
                b13.c(false);
            }
            aVar.f15038v = true;
            aVar.f15031o.m(true);
        }

        @Override // q61.g
        public final void b() {
            m<Object>[] mVarArr = a.A;
            a aVar = a.this;
            aVar.f();
            aVar.f15035s.m(a.a(aVar));
        }

        @Override // q61.g
        public final void d() {
            a aVar = a.this;
            if (aVar.f15038v) {
                b b13 = aVar.b();
                if (b13 != null) {
                    b13.c(true);
                }
                aVar.f15038v = false;
                aVar.f15031o.m(false);
            }
        }
    }

    static {
        new C0503a(null);
    }

    public a(og0.a aVar, p61.c cVar, LightScheduleSettings lightScheduleSettings, we0.c cVar2, r51.d dVar, pf0.c cVar3) {
        aVar.getClass();
        cVar.getClass();
        lightScheduleSettings.getClass();
        cVar2.getClass();
        dVar.getClass();
        cVar3.getClass();
        this.f15019a = cVar;
        this.f15020b = lightScheduleSettings;
        this.f15021c = cVar2;
        this.d = dVar;
        this.e = cVar3;
        this.f15022f = aVar.b(og0.d.light_scheduleWakeUpModeSchedule);
        LocalisationKey b13 = aVar.b(og0.d.light_wakeUpScheduleWakeUpTimeLabel);
        this.f15023g = aVar.b(og0.d.light_wakeUpScheduleDescription);
        this.f15024h = cVar3.d(aVar.b(og0.d.light_wakeUpScheduleStartTimeLabel));
        this.f15025i = new gz1.b();
        this.f15026j = go1.m.t();
        this.f15028l = new q8.m<>();
        this.f15029m = new n<>("05:30");
        this.f15030n = new n<>(cVar3.d(i0.A8));
        this.f15031o = new ObservableBoolean(true);
        this.f15032p = new ObservableBoolean(true);
        this.f15033q = new ObservableBoolean(false);
        this.f15034r = new ObservableBoolean(true);
        this.f15035s = new ObservableBoolean(false);
        this.f15036t = "06:00";
        e2.a<Integer, Boolean> aVar2 = new e2.a<>();
        this.f15037u = aVar2;
        this.f15038v = true;
        this.f15040x = new tf1.a(null, 1, null);
        q61.d dVar2 = new q61.d(new c());
        this.f15041y = dVar2;
        h hVar = new h(cVar3.d(b13), cVar3, new d());
        this.f15042z = hVar;
        q8.m<Integer, Boolean> mVar = dVar2.f65909c;
        mVar.getClass();
        aVar2.putAll((Map<? extends Integer, ? extends Boolean>) mVar);
        hVar.f65916f.m(false);
    }

    public static final boolean a(a aVar) {
        return (t1.c(aVar.f15037u, aVar.f15041y.f65909c).e() && r.c(aVar.f15042z.f65917g.d, aVar.f15036t)) ? false : true;
    }

    public final b b() {
        return (b) this.f15040x.getValue(this, A[0]);
    }

    public final void c() {
        u s13 = this.f15019a.b().t().S(c02.a.f10004c).H(fz1.a.a()).s(new e(new ff0.a(this, 0), 6), kz1.a.f50215c);
        ff0.b bVar = new ff0.b(this, 4);
        b.a aVar = kz1.b.f50218a;
        this.f15025i.a(new s(s13, bVar).W(10L, TimeUnit.SECONDS).P(new e(new ff0.a(this, 4), 7), new e(new ff0.a(this, 5), 8)));
    }

    public final void d(boolean z13) {
        this.f15030n.m(z13 ? "" : this.e.d(i0.A8));
        this.f15033q.m(z13);
        this.f15034r.m(!z13);
    }

    public final void e() {
        Schedule schedule = this.f15039w;
        if (schedule == null) {
            r.i("schedule");
            throw null;
        }
        schedule.u(true);
        Schedule schedule2 = this.f15039w;
        if (schedule2 == null) {
            r.i("schedule");
            throw null;
        }
        sz1.y c13 = this.f15019a.c(schedule2);
        e eVar = new e(new ff0.a(this, 6), 9);
        b.a aVar = kz1.b.f50218a;
        this.f15025i.a(new sz1.m(new j(c13, eVar), new e(new ff0.a(this, 7), 2)).r(c02.a.f10004c).j(fz1.a.a()).p(new e(new ff0.a(this, 1), 3), new e(new ff0.a(this, 2), 4)));
    }

    public final void f() {
        h hVar = this.f15042z;
        int b13 = r61.d.b(hVar.f65917g.d);
        int i13 = b13 - 30;
        if (i13 < 0) {
            i13 = b13 + 1410;
        }
        String a13 = r61.d.a(i13);
        n<String> nVar = this.f15029m;
        nVar.m(a13);
        n<String> nVar2 = hVar.d;
        String str = nVar.d;
        nVar2.m(this.f15024h + " " + ((Object) str));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/singleevent/a$a;", "", "<init>", "()V", "", "TIMEOUT_SECONDS", "J", "", "CUSTOM_TIME", "Ljava/lang/String;", "", "PRIOR_TIME_INTERVAL_IN_MINUTES", "I", "SCHEDULE_START_TIME", "EMPTY_BUTTON_TEXT", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0503a {
        public /* synthetic */ C0503a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0503a() {
        }
    }
}
