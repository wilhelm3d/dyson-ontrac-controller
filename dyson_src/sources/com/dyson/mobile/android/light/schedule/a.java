package com.dyson.mobile.android.light.schedule;

import a20.g;
import a20.h;
import an0.e;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.WakeUpBrightnessActivity;
import com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.WakeUpScheduleLandingActivity;
import com.dyson.mobile.android.light.schedule.widget.wakeup.schedule.singleevent.WakeUpScheduleSingleEventActivity;
import fm1.o0;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import je0.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import le0.j0;
import le0.n1;
import nz1.i;
import sz1.n;
import we1.a;
import x12.r;
import yd0.c;
import zc0.k;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/a;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment implements f.a {

    /* renamed from: i  reason: collision with root package name */
    public static final C0499a f14935i = new C0499a(null);
    public we0.d d;
    public yd0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final b f14936f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final c f14937g = new c();

    /* renamed from: h  reason: collision with root package name */
    public final d f14938h = new d();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/a$b", "Lze0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ze0.a {
        public b() {
        }

        @Override // ze0.a
        public final void a() {
            bf0.d dVar = a.this.s().e;
            lf0.a aVar = dVar.d;
            if (!dVar.f7697l) {
                dVar.f7698m.m(true);
            }
            sz1.c K = aVar.K();
            e eVar = new e(new bf0.c(dVar, 0), 23);
            b.a aVar2 = kz1.b.f50218a;
            n nVar = new n(K, eVar);
            n nVar2 = new n(aVar.i(), new e(new bf0.c(dVar, 1), 24));
            gz1.b bVar = dVar.f7703r;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bVar.a(new i(nVar.k(300L, timeUnit).g(nVar2).k(300L, timeUnit), new h(dVar, 4)).v());
        }

        @Override // ze0.a
        public final void b(c40.e eVar, Calendar calendar) {
            calendar.getClass();
            new DatePickerDialog(a.this.requireContext(), R.style.DatePickerDialogStyle, eVar, calendar.get(1), calendar.get(2), calendar.get(5)).show();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/a$c", "Laf0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements af0.a {
        public c() {
        }

        @Override // af0.a
        public final TimePickerDialog c(String str, af0.c cVar) {
            str.getClass();
            return new TimePickerDialog(a.this.getContext(), R.style.TimePickerTheme, cVar, r61.d.d(str).get(11), r61.d.d(str).get(12), false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/schedule/a$d", "Lbf0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements bf0.a {
        public d() {
        }

        @Override // bf0.a
        public final void a() {
            af0.f fVar = a.this.s().f85705f;
            lf0.a aVar = fVar.f1178a;
            sz1.c a03 = aVar.a0();
            g gVar = new g(new af0.e(fVar, 0), 10);
            b.a aVar2 = kz1.b.f50218a;
            n nVar = new n(a03, gVar);
            n nVar2 = new n(aVar.z(), new g(new af0.e(fVar, 1), 11));
            n nVar3 = new n(aVar.g(), new g(new af0.e(fVar, 2), 12));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fVar.f1185j.a(nVar.k(300L, timeUnit).g(nVar2).k(300L, timeUnit).g(nVar3).v());
        }

        @Override // bf0.a
        public final void b(int i13) {
            a aVar = a.this;
            yd0.c cVar = aVar.e;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            v42.f fVar = new v42.f(aVar, 21);
            gz1.b bVar = cVar.f89783n;
            uf1.d a13 = uf1.d.a(activity);
            WakeUpBrightnessActivity.a aVar2 = WakeUpBrightnessActivity.f14942m;
            String str = cVar.f89777h;
            aVar2.getClass();
            str.getClass();
            Intent putExtra = new Intent(activity, WakeUpBrightnessActivity.class).putExtra("COORDINATOR_ID", str).putExtra("EXTRA_WAKE_UP_BRIGHTNESS", i13);
            putExtra.getClass();
            bVar.a(a13.b(new Intent(putExtra)).p(new yc0.d(fVar, 16), new yc0.d(new y90.d(10), 17)));
        }

        @Override // bf0.a
        public final void c(boolean z13) {
            Intent putExtra;
            a aVar = a.this;
            yd0.c cVar = aVar.e;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            String str = cVar.f89777h;
            if (z13) {
                WakeUpScheduleLandingActivity.f14963o.getClass();
                str.getClass();
                putExtra = new Intent(activity, WakeUpScheduleLandingActivity.class).putExtra("COORDINATOR_ID", str);
                putExtra.getClass();
            } else {
                WakeUpScheduleSingleEventActivity.f15009r.getClass();
                str.getClass();
                putExtra = new Intent(activity, WakeUpScheduleSingleEventActivity.class).putExtra("COORDINATOR_ID", str);
                putExtra.getClass();
            }
            activity.startActivity(putExtra);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (!(getActivity() instanceof f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.e = a13;
        ke0.d dVar = a13.f89779j;
        n1 n1Var = dVar.f47425c;
        lf0.a aVar = dVar.Q.get();
        le0.a aVar2 = dVar.f47424b;
        pf0.c a14 = j0.a(aVar2);
        og0.a c13 = dVar.c();
        hj.e eVar = dVar.d.get();
        n1Var.getClass();
        aVar.getClass();
        eVar.getClass();
        ze0.c cVar = new ze0.c(aVar, a14, c13, eVar);
        lf0.a aVar3 = dVar.Q.get();
        pf0.c a15 = j0.a(aVar2);
        og0.a c14 = dVar.c();
        hj.e eVar2 = dVar.d.get();
        aVar3.getClass();
        eVar2.getClass();
        bf0.d dVar2 = new bf0.d(aVar3, a15, c14, n1Var.f51675b, eVar2);
        lf0.a aVar4 = dVar.Q.get();
        pf0.c a16 = j0.a(aVar2);
        og0.a c15 = dVar.c();
        hj.e eVar3 = dVar.d.get();
        aVar4.getClass();
        eVar3.getClass();
        af0.f fVar = new af0.f(aVar4, a16, c15, eVar3);
        hj.e eVar4 = dVar.d.get();
        eVar4.getClass();
        this.d = new we0.d(cVar, dVar2, fVar, eVar4);
        j0.a(aVar2);
        x0 x0Var = (x0) q8.g.c(layoutInflater, R.layout.fragment_light_schedule, viewGroup, false, null);
        getLifecycle().a(s());
        we0.d s13 = s();
        ze0.c cVar2 = s13.d;
        cVar2.f92599f.setValue(cVar2, ze0.c.f92595n[0], this.f14936f);
        bf0.d dVar3 = s13.e;
        dVar3.f7702q.setValue(dVar3, bf0.d.f7690u[0], this.f14938h);
        af0.f fVar2 = s13.f85705f;
        fVar2.f1184i.setValue(fVar2, af0.f.f1177n[0], this.f14937g);
        lf0.a aVar5 = cVar2.f92596a;
        sz1.c A = aVar5.A();
        k kVar = new k(new ze0.b(cVar2, 0), 16);
        b.a aVar6 = kz1.b.f50218a;
        n nVar = new n(A, kVar);
        n nVar2 = new n(aVar5.E(), new k(new ze0.b(cVar2, 1), 17));
        gz1.b bVar = cVar2.f92600g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.a(new i(nVar.k(300L, timeUnit).g(nVar2).A(3000L, timeUnit), new yx0.c(cVar2, 1)).v());
        x0Var.l(s13);
        return x0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(s());
    }

    public final we0.d s() {
        we0.d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/a$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.schedule.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0499a {
        public /* synthetic */ C0499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0499a() {
        }
    }
}
