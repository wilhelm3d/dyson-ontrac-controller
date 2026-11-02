package com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent;

import androidx.databinding.ObservableBoolean;
import com.dyson.mobile.android.light.schedule.LightScheduleSettings;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.schedule.response.Event;
import com.dyson.mobile.android.schedule.response.Schedule;
import e22.m;
import ea0.e;
import go1.f0;
import go1.t1;
import i12.u;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q61.g;
import q61.h;
import q8.n;
import r51.p;
import r51.r;
import rf0.i0;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/a;", "", "Log0/a;", "machineDataObject", "Lcom/dyson/mobile/android/light/schedule/LightScheduleSettings;", "lightScheduleSettings", "", "serialNumber", "Lr51/r;", "dataStore", "Lr51/d;", "eventGroupIdGenerator", "Lpf0/c;", "localisationManager", "<init>", "(Log0/a;Lcom/dyson/mobile/android/light/schedule/LightScheduleSettings;Ljava/lang/String;Lr51/r;Lr51/d;Lpf0/c;)V", "b", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f14985z = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/WakeUpScheduleMultipleEventViewModel$Navigator;", 0))};

    /* renamed from: a  reason: collision with root package name */
    public final og0.a f14986a;

    /* renamed from: b  reason: collision with root package name */
    public final LightScheduleSettings f14987b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14988c;
    public final r d;
    public final r51.d e;

    /* renamed from: f  reason: collision with root package name */
    public final pf0.c f14989f;

    /* renamed from: g  reason: collision with root package name */
    public final LocalisationKey f14990g;

    /* renamed from: h  reason: collision with root package name */
    public final LocalisationKey f14991h;

    /* renamed from: i  reason: collision with root package name */
    public final LocalisationKey f14992i;

    /* renamed from: j  reason: collision with root package name */
    public final LocalisationKey f14993j;

    /* renamed from: k  reason: collision with root package name */
    public final n<LocalisationKey> f14994k;

    /* renamed from: l  reason: collision with root package name */
    public final n<LocalisationKey> f14995l;

    /* renamed from: m  reason: collision with root package name */
    public Schedule f14996m;

    /* renamed from: n  reason: collision with root package name */
    public int f14997n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f14998o;

    /* renamed from: p  reason: collision with root package name */
    public final n<String> f14999p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableBoolean f15000q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableBoolean f15001r;

    /* renamed from: s  reason: collision with root package name */
    public final ObservableBoolean f15002s;

    /* renamed from: t  reason: collision with root package name */
    public final String f15003t;

    /* renamed from: u  reason: collision with root package name */
    public final e2.a<Integer, Boolean> f15004u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f15005v;

    /* renamed from: w  reason: collision with root package name */
    public final tf1.a f15006w;

    /* renamed from: x  reason: collision with root package name */
    public final q61.d f15007x;

    /* renamed from: y  reason: collision with root package name */
    public final h f15008y;

    /* loaded from: classes2.dex */
    public interface b {
        void c(boolean z13);

        void e();

        void f();

        void g();
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/a$c", "Lq61/c;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements q61.c {
        public c() {
        }

        @Override // q61.c
        public final void f(int i13) {
            a.this.f15004u.put(Integer.valueOf(i13), Boolean.TRUE);
        }

        @Override // q61.c
        public final void h(boolean z13) {
            a aVar = a.this;
            aVar.f15002s.m(a.a(aVar) && z13);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/a$d", "Lq61/g;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements g {
        public d() {
        }

        @Override // q61.g
        public final void a() {
            a aVar = a.this;
            b c13 = aVar.c();
            if (c13 != null) {
                c13.c(false);
            }
            aVar.f15005v = true;
            aVar.f15001r.m(true);
            aVar.f15000q.m(aVar.f14998o);
        }

        @Override // q61.g
        public final void b() {
            m<Object>[] mVarArr = a.f14985z;
            a aVar = a.this;
            aVar.e();
            aVar.f15002s.m(a.a(aVar) && aVar.f15007x.a());
        }

        @Override // q61.g
        public final void d() {
            a aVar = a.this;
            if (aVar.f15005v) {
                b c13 = aVar.c();
                if (c13 != null) {
                    c13.c(true);
                }
                aVar.f15005v = false;
                aVar.f15001r.m(false);
                aVar.f15000q.m(false);
            }
        }
    }

    static {
        new C0502a(null);
    }

    public a(og0.a aVar, LightScheduleSettings lightScheduleSettings, String str, r rVar, r51.d dVar, pf0.c cVar) {
        aVar.getClass();
        lightScheduleSettings.getClass();
        str.getClass();
        rVar.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f14986a = aVar;
        this.f14987b = lightScheduleSettings;
        this.f14988c = str;
        this.d = rVar;
        this.e = dVar;
        this.f14989f = cVar;
        LocalisationKey localisationKey = i0.f71825r6;
        this.f14990g = localisationKey;
        this.f14991h = i0.f71840s6;
        LocalisationKey b13 = aVar.b(og0.d.light_wakeUpScheduleDescription);
        this.f14992i = b13;
        this.f14993j = aVar.b(og0.d.light_wakeUpScheduleEditDescription);
        LocalisationKey b14 = aVar.b(og0.d.light_wakeUpScheduleWakeUpTimeLabel);
        this.f14994k = new n<>(localisationKey);
        this.f14995l = new n<>(b13);
        this.f14999p = new n<>("05:30");
        this.f15000q = new ObservableBoolean(false);
        this.f15001r = new ObservableBoolean(true);
        this.f15002s = new ObservableBoolean(false);
        this.f15003t = "06:00";
        this.f15004u = new e2.a<>();
        this.f15005v = true;
        this.f15006w = new tf1.a(null, 1, null);
        this.f15007x = new q61.d(new c());
        h hVar = new h(cVar.d(b14), cVar, new d());
        this.f15008y = hVar;
        hVar.f65916f.m(false);
    }

    public static final boolean a(a aVar) {
        return (t1.c(aVar.f15004u, aVar.f15007x.f65909c).e() && x12.r.c(aVar.f15008y.f65917g.d, aVar.f15003t)) ? false : true;
    }

    public final void b() {
        f0<Map.Entry> b13 = f0.l(this.f15007x.f65909c.entrySet()).b(new ef0.b(new e(21), 0));
        ArrayList arrayList = new ArrayList(u.o(b13, 10));
        for (Map.Entry entry : b13) {
            arrayList.add(Integer.valueOf(((Number) entry.getKey()).intValue()));
        }
        Event event = new Event();
        event.E(true);
        event.J(this.f15008y.f65917g.d);
        event.u(arrayList);
        event.F(this.f14997n);
        event.H(this.f14987b);
        boolean z13 = this.f14998o;
        Schedule schedule = this.f14996m;
        r51.d dVar = this.e;
        if (z13) {
            if (schedule == null) {
                x12.r.i("schedule");
                throw null;
            }
            p.b(schedule, event.j());
            p.c(schedule, event, false);
            p.d(schedule, event, null, true, dVar);
        } else if (schedule == null) {
            x12.r.i("schedule");
            throw null;
        } else {
            p.c(schedule, event, false);
            p.d(schedule, event, null, true, dVar);
        }
        d();
    }

    public final b c() {
        return (b) this.f15006w.getValue(this, f14985z[0]);
    }

    public final void d() {
        Schedule schedule = this.f14996m;
        if (schedule == null) {
            x12.r.i("schedule");
            throw null;
        }
        schedule.u(true);
        Schedule schedule2 = this.f14996m;
        if (schedule2 == null) {
            x12.r.i("schedule");
            throw null;
        }
        this.d.c(this.f14988c, schedule2);
        b c13 = c();
        if (c13 != null) {
            c13.e();
        }
    }

    public final void e() {
        h hVar = this.f15008y;
        int b13 = r61.d.b(hVar.f65917g.d);
        int i13 = b13 - 30;
        if (i13 < 0) {
            i13 = b13 + 1410;
        }
        String a13 = r61.d.a(i13);
        n<String> nVar = this.f14999p;
        nVar.m(a13);
        String d13 = this.f14989f.d(this.f14986a.b(og0.d.light_wakeUpScheduleStartTimeLabel));
        n<String> nVar2 = hVar.d;
        String str = nVar.d;
        nVar2.m(d13 + " " + ((Object) str));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/schedule/multipleevent/a$a;", "", "<init>", "()V", "", "CUSTOM_TIME", "Ljava/lang/String;", "", "PRIOR_TIME_INTERVAL_IN_MINUTES", "I", "SCHEDULE_START_TIME", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.multipleevent.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0502a {
        public /* synthetic */ C0502a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0502a() {
        }
    }
}
