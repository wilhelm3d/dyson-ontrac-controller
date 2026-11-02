package com.dyson.mobile.android.light.configuration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import be0.b;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.configuration.custombaseline.CustomBaselineActivity;
import com.dyson.mobile.android.light.location.LightLocationActivity;
import de0.b;
import e60.g;
import fm1.o0;
import hd0.g;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import le0.j0;
import le0.n1;
import le0.p1;
import le0.q0;
import le0.x;
import qh.l0;
import qh.w;
import sz1.n;
import we1.a;
import x12.r;
import x50.e0;
import x50.f0;
import yd0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/configuration/a;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment implements f.a {

    /* renamed from: l  reason: collision with root package name */
    public static final C0491a f14735l = new C0491a(null);
    public ae0.a d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public og0.a f14736f;

    /* renamed from: g  reason: collision with root package name */
    public String f14737g;

    /* renamed from: h  reason: collision with root package name */
    public final d f14738h = new d();

    /* renamed from: i  reason: collision with root package name */
    public final c f14739i = new c();

    /* renamed from: j  reason: collision with root package name */
    public final b f14740j = new b();

    /* renamed from: k  reason: collision with root package name */
    public final e f14741k = new e();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/configuration/a$b", "Lee0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ee0.a {
        public b() {
        }

        @Override // ee0.a
        public final void a() {
            a aVar = a.this;
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            CustomBaselineActivity.a aVar2 = CustomBaselineActivity.f14746m;
            Context context = aVar.getContext();
            context.getClass();
            String str = aVar.f14737g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar2.getClass();
            Intent putExtra = new Intent(context, CustomBaselineActivity.class).putExtra("COORDINATOR_ID", str);
            putExtra.getClass();
            activity.startActivity(putExtra);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/configuration/a$c", "Lfe0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements fe0.a {
        public c() {
        }

        @Override // fe0.a
        public final void a() {
            he0.f fVar = a.this.s().e;
            lf0.a aVar = fVar.f38155b;
            sz1.c f13 = aVar.f();
            g gVar = new g(new he0.c(fVar, 0), 7);
            b.a aVar2 = kz1.b.f50218a;
            gz1.c v13 = new n(f13, gVar).k(300L, TimeUnit.MILLISECONDS).g(new he0.d(fVar, 0)).v();
            gz1.b bVar = fVar.f38162k;
            bVar.a(v13);
            e60.g.f26073a.getClass();
            UUID uuid = e60.g.f26074b;
            g.a.f26075a.getClass();
            bVar.a(aVar.S(new f0(new e0(uuid, g.a.f26078f), new e0(uuid, g.a.e))).w(new he0.e(fVar, 0)));
        }

        @Override // fe0.a
        public final ts0.d b(int i13, fe0.g gVar) {
            Context context = a.this.getContext();
            context.getClass();
            return new ts0.d(context, R.style.TimePickerTheme, gVar, i13);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/configuration/a$d", "Lge0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements ge0.a {
        public d() {
        }

        @Override // ge0.a
        public final void a() {
            a.this.s().f1127g.a();
        }

        @Override // ge0.a
        public final void b() {
            a aVar = a.this;
            String str = aVar.s().d.f34618m.f86119b.d;
            str.getClass();
            String str2 = str;
            LightLocationActivity.a aVar2 = LightLocationActivity.f14885v;
            Context context = aVar.getContext();
            context.getClass();
            String str3 = aVar.f14737g;
            if (str3 == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar2.getClass();
            aVar.startActivityForResult(LightLocationActivity.a.a(context, true, str3, str2), 300);
        }

        @Override // ge0.a
        public final ge0.f c(String str, af0.c cVar) {
            str.getClass();
            Context context = a.this.getContext();
            context.getClass();
            return new ge0.f(context, R.style.TimePickerTheme, cVar, r61.d.d(str).get(11), r61.d.d(str).get(12), false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/configuration/a$e", "Lhe0/a;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements he0.a {
        public e() {
        }

        @Override // he0.a
        public final void a(boolean z13) {
            a aVar = a.this;
            pf0.c cVar = aVar.e;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            og0.a aVar2 = aVar.f14736f;
            if (aVar2 == null) {
                r.i("machineDataObject");
                throw null;
            }
            String d = cVar.d(aVar2.b(og0.d.light_configurationMovementSensor));
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            pl0.c cVar2 = (pl0.c) activity;
            b.a aVar3 = de0.b.f23567f;
            String str = aVar.f14737g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar3.getClass();
            de0.b bVar = new de0.b();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putBoolean("EXTRA_SENSOR_STATE", z13);
            bVar.setArguments(bundle);
            cVar2.q1(bVar, d);
        }

        @Override // he0.a
        public final void b(boolean z13) {
            a aVar = a.this;
            pf0.c cVar = aVar.e;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            og0.a aVar2 = aVar.f14736f;
            if (aVar2 == null) {
                r.i("machineDataObject");
                throw null;
            }
            String d = cVar.d(aVar2.b(og0.d.light_configurationAutoBrightness));
            androidx.fragment.app.e activity = aVar.getActivity();
            activity.getClass();
            pl0.c cVar2 = (pl0.c) activity;
            b.a aVar3 = be0.b.f7649f;
            String str = aVar.f14737g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar3.getClass();
            be0.b bVar = new be0.b();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putBoolean("EXTRA_SENSOR_STATE", z13);
            bVar.setArguments(bundle);
            cVar2.q1(bVar, d);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @h12.e
    public final void onActivityResult(int i13, int i14, Intent intent) {
        if (i13 == 300) {
            if ((intent != null ? intent.getBundleExtra("ACTIVITY_RESULT") : null) != null) {
                intent.getClass();
                Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_RESULT");
                if (bundleExtra == null) {
                    pa.c.w("Intent extras was null");
                } else if (bundleExtra.getBoolean("EXTRA_IS_UPDATE_LOBBY_REQUIRED", false)) {
                    androidx.fragment.app.e activity = getActivity();
                    activity.getClass();
                    ((LightConfigurationActivity) activity).f14734w = true;
                    ge0.b bVar = new ge0.b(s().d, 0);
                    b.a aVar = kz1.b.f50218a;
                    new nz1.g(bVar);
                }
            }
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
        this.f14737g = y13;
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(y13);
        a13.getClass();
        ke0.d dVar = a13.f89779j;
        n1 n1Var = dVar.f47425c;
        le0.a aVar = dVar.f47424b;
        vk0.n a14 = q0.a(aVar);
        lf0.a aVar2 = dVar.Q.get();
        pf0.c a15 = j0.a(aVar);
        og0.a c13 = dVar.c();
        hj.e eVar = dVar.d.get();
        n1Var.getClass();
        yd0.b bVar = n1Var.f51675b;
        aVar2.getClass();
        eVar.getClass();
        ge0.e eVar2 = new ge0.e(bVar, a14, aVar2, a15, c13, eVar);
        n1 n1Var2 = dVar.f47425c;
        og0.a c14 = dVar.c();
        lf0.a aVar3 = dVar.Q.get();
        pf0.c a16 = j0.a(aVar);
        n1Var2.getClass();
        aVar3.getClass();
        he0.f fVar = new he0.f(c14, aVar3, a16);
        ee0.b bVar2 = new ee0.b(j0.a(aVar), dVar.c());
        n1 n1Var3 = dVar.f47425c;
        w a17 = new l0(aVar.f51576a).a();
        a17.getClass();
        fe0.f a18 = p1.a(n1Var3, a17, dVar.Q.get(), x.b(aVar), j0.a(aVar), dVar.c(), dVar.d.get());
        hj.e eVar3 = dVar.d.get();
        eVar3.getClass();
        this.d = new ae0.a(bVar, eVar2, fVar, bVar2, a18, eVar3);
        this.e = j0.a(aVar);
        this.f14736f = dVar.c();
        je0.j0 j0Var = (je0.j0) q8.g.c(layoutInflater, R.layout.fragment_light_configuration, viewGroup, false, null);
        getLifecycle().a(s());
        ae0.a s13 = s();
        ge0.e eVar4 = s13.d;
        eVar4.f34617l.setValue(eVar4, ge0.e.f34607s[0], this.f14738h);
        he0.f fVar2 = s13.e;
        fVar2.f38157f.setValue(fVar2, he0.f.f38153l[0], this.f14741k);
        ee0.b bVar3 = s13.f1126f;
        bVar3.f26801c.setValue(bVar3, ee0.b.e[0], this.f14740j);
        fe0.f fVar3 = s13.f1127g;
        fVar3.f30662t.setValue(fVar3, fe0.f.f30644w[0], this.f14739i);
        eVar4.b();
        j0Var.l(s13);
        return j0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(s());
    }

    public final ae0.a s() {
        ae0.a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/configuration/a$a;", "", "<init>", "()V", "", "SETTINGS_LOCATION_REQUEST_CODE", "I", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.configuration.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0491a {
        public /* synthetic */ C0491a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0491a() {
        }
    }
}
