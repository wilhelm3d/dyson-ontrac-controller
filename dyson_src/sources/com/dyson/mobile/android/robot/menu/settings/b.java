package com.dyson.mobile.android.robot.menu.settings;

import a01.k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import bt0.f;
import bv0.a2;
import bv0.b2;
import bv0.e8;
import bv0.q9;
import bv0.s0;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machine.ui.settings.timezone.a;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import com.dyson.mobile.android.robot.menu.settings.a;
import ey0.a;
import fm1.o0;
import h12.m;
import h12.t;
import h12.y;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.g0;
import rf0.i0;
import se1.k0;
import ty1.l;
import uf0.g;
import we1.a;
import x12.r;
import yu0.g1;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "b", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f16203q = new a(null);
    public by0.f d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public rf1.c f16204f;

    /* renamed from: g  reason: collision with root package name */
    public se1.e f16205g;

    /* renamed from: h  reason: collision with root package name */
    public z f16206h;

    /* renamed from: i  reason: collision with root package name */
    public String f16207i;

    /* renamed from: j  reason: collision with root package name */
    public final t f16208j = m.b(new k(this, 22));

    /* renamed from: k  reason: collision with root package name */
    public final c f16209k = new c();

    /* renamed from: l  reason: collision with root package name */
    public final d f16210l = new d();

    /* renamed from: m  reason: collision with root package name */
    public final f f16211m = new f();

    /* renamed from: n  reason: collision with root package name */
    public final by0.a f16212n = new by0.a(this, 0);

    /* renamed from: o  reason: collision with root package name */
    public final by0.b f16213o = new by0.b(this, 0);

    /* renamed from: p  reason: collision with root package name */
    public final e f16214p = new e();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/b$b;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "permissionDescription", "settingsDescription", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.menu.settings.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0558b {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f16215a;

        /* renamed from: b  reason: collision with root package name */
        public final LocalisationKey f16216b;

        /* renamed from: c  reason: collision with root package name */
        public final LocalisationKey f16217c;

        public C0558b(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3) {
            localisationKey.getClass();
            localisationKey2.getClass();
            localisationKey3.getClass();
            this.f16215a = localisationKey;
            this.f16216b = localisationKey2;
            this.f16217c = localisationKey3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0558b) {
                C0558b c0558b = (C0558b) obj;
                return this.f16215a.equals(c0558b.f16215a) && this.f16216b.equals(c0558b.f16216b) && this.f16217c.equals(c0558b.f16217c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16217c.hashCode() + y.e(this.f16216b, this.f16215a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "PermissionDialogMessages(title=" + this.f16215a + ", permissionDescription=" + this.f16216b + ", settingsDescription=" + this.f16217c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/settings/b$c", "Lxm0/a;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements xm0.a {
        public c() {
        }

        @Override // xm0.a
        public final void a(in0.e eVar) {
            NamingConfig namingConfig = new NamingConfig(null, null, new MachineNamingExtras.PersistName(eVar.e(), eVar.a().f15564l, eVar.a().i(), eVar.g(), eVar.b()), 3, null);
            a.C0557a c0557a = com.dyson.mobile.android.robot.menu.settings.a.f16202f;
            b bVar = b.this;
            String str = bVar.f16207i;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0557a.getClass();
            com.dyson.mobile.android.robot.menu.settings.a aVar = new com.dyson.mobile.android.robot.menu.settings.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("CONFIG", namingConfig);
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            ((pl0.c) activity).q1(aVar, bVar.s().d(g0.f71492p2));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/settings/b$d", "Lym0/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements ym0.b {
        public d() {
        }

        @Override // ym0.b
        public final void c(String str, String str2) {
            str.getClass();
            a aVar = b.f16203q;
            b bVar = b.this;
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            com.dyson.mobile.android.machine.ui.settings.timezone.a.f15521f.getClass();
            ((pl0.c) activity).q1(a.C0534a.a(str, str2), bVar.s().d(i0.W4));
        }

        @Override // ym0.b
        public final void d(wm0.a aVar) {
            b bVar = b.this;
            g a13 = g.a(bVar.getActivity());
            androidx.fragment.app.e activity = bVar.getActivity();
            a13.getClass();
            ConnectivityIssueActivity.f1(activity, aVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/settings/b$e", "Lan0/a;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements an0.a {
        public e() {
        }

        @Override // an0.a
        public final void a() {
            d(true);
        }

        @Override // an0.a
        public final void b(String str, String str2, String str3, String str4, a20.a aVar) {
            b bVar = b.this;
            g a13 = g.a(bVar.getActivity());
            Context context = bVar.getContext();
            a13.getClass();
            g.c(context, str, str2, str3, str4, aVar);
        }

        @Override // an0.a
        public final void c() {
            d(false);
        }

        public final void d(boolean z13) {
            a aVar = b.f16203q;
            b bVar = b.this;
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            pl0.c cVar = (pl0.c) activity;
            a.C0965a c0965a = ey0.a.f28714g;
            String str = bVar.f16207i;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0965a.getClass();
            ey0.a aVar2 = new ey0.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putBoolean("ARG_IS_ROBOT_OWNER", z13);
            aVar2.setArguments(bundle);
            cVar.q1(aVar2, bVar.s().d(g0.f71515v1));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/settings/b$f", "Ldn0/a;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements dn0.a {
        public f() {
        }

        @Override // dn0.a
        public final void a(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            machineDescriptor.getClass();
            Logger.c("Settings change Wifi clicked");
            b bVar = b.this;
            if (bVar.t().c()) {
                Logger.c("Permission granted successfully");
                g.a(bVar.getActivity()).b(bVar.getActivity(), str, machineDescriptor);
                return;
            }
            Logger.c("Permissions not yet granted");
            se1.e eVar = bVar.f16205g;
            if (eVar == null) {
                r.i("buildVersionProvider");
                throw null;
            }
            C0558b c0558b = eVar.b() ? new C0558b(i0.f71691ib, i0.f71706jb, i0.f71721kb) : new C0558b(i0.f71682i2, i0.f71760n2, i0.f71698j2);
            ((zs0.e) bVar.f16208j.getValue()).c(bVar.s().d(c0558b.f16215a), bVar.s().d(c0558b.f16216b), true, new by0.e(bVar, str, machineDescriptor, c0558b, 0));
        }
    }

    @Override // bt0.f.a
    public final void b() {
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(4);
        }
    }

    @Override // bt0.f.a
    public final void f(Bundle bundle) {
        bundle.getClass();
        Logger.a("Result: " + bundle);
        String string = bundle.getString("RESULT_CODE");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (r.c(string, "CUSTOM_NAME")) {
            String string2 = bundle.getString("NEW_NAME");
            if (string2 != null && !TextUtils.isEmpty(string2)) {
                v().d.b(string2);
                z zVar = this.f16206h;
                if (zVar == null) {
                    r.i("robotCoordinator");
                    throw null;
                }
                in0.f g13 = zVar.g();
                if (g13 != null) {
                    g13.b(zVar.f42725h.f42685b, string2);
                }
            }
        } else if (r.c(string, "MACHINE_TIME_ZONE")) {
            String string3 = bundle.getString("EXTRA_MACHINE_TIME_ZONE");
            if (!TextUtils.isEmpty(string3)) {
                v().f9921f.c(string3);
            }
        } else {
            Logger.e("Unknown result code", null);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            z zVar2 = this.f16206h;
            if (zVar2 != null) {
                zVar2.h(activity);
            } else {
                r.i("robotCoordinator");
                throw null;
            }
        }
    }

    @Override // bt0.f.a
    public final void i() {
        View view = getView();
        if (view != null) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "RobotSettingsFragment cannot be initialised without a coordinator";
        b13.a("COORDINATOR_ID");
        if (!(getActivity() instanceof bt0.f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        String y13 = o0.y("COORDINATOR_ID", requireArguments);
        this.f16207i = y13;
        z.f42723r.getClass();
        z a13 = z.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        av0.d dVar = a13.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        kl0.b bVar = dVar.f5523d3.get();
        cy0.a aVar = new cy0.a(new iu0.r(s0Var.f9016b.f42684a));
        dVar.f5515c.getClass();
        this.d = q9.a(e8Var, s0Var.f9016b, s0Var.f9015a, a2.b(s0Var), dVar.b(), b2.b(s0Var), dVar.f5624y0.get(), dVar.f5514b3.get(), dVar.f5519c3.get(), bVar, aVar, new k0());
        this.e = dVar.b();
        rf1.e eVar = new rf1.e(new se1.e());
        this.f16204f = new se1.e().b() ? new rf1.d(eVar) : new rf1.f(eVar);
        this.f16205g = new se1.e();
        this.f16206h = a13;
        l lVar = new l(this);
        rf1.g t13 = t();
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        rf1.e eVar2 = ((rf1.c) t13).f73036a;
        eVar2.f73038a = lVar;
        eVar2.f73039b = requireActivity;
        dn0.c cVar = v().f9922g;
        rf1.g t14 = t();
        cVar.getClass();
        cVar.f24544h = t14;
        int i13 = g1.f90705l;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        g1 g1Var = (g1) q8.t.inflateInternal(layoutInflater, R.layout.fragment_robot_settings, viewGroup, false, null);
        g1Var.getClass();
        by0.f v13 = v();
        an0.f fVar = v13.f9924i;
        bn0.d dVar2 = v13.e;
        ym0.f fVar2 = v13.f9921f;
        xm0.b bVar2 = v13.d;
        c cVar2 = this.f16209k;
        cVar2.getClass();
        bVar2.f87788f.setValue(bVar2, xm0.b.f87784h[0], cVar2);
        d dVar3 = this.f16210l;
        dVar3.getClass();
        fVar2.f90280x.setValue(fVar2, ym0.f.f90261y[0], dVar3);
        f fVar3 = this.f16211m;
        fVar3.getClass();
        dn0.c cVar3 = v13.f9922g;
        cVar3.f24541c.setValue(cVar3, dn0.c.f24538k[0], fVar3);
        by0.b bVar3 = this.f16213o;
        bVar3.getClass();
        dVar2.f8182o.setValue(dVar2, bn0.d.f8169s[0], bVar3);
        by0.a aVar2 = this.f16212n;
        aVar2.getClass();
        zm0.b bVar4 = v13.f9923h;
        bVar4.f92880c.setValue(bVar4, zm0.b.d[0], aVar2);
        e eVar3 = this.f16214p;
        eVar3.getClass();
        fVar.f1606g.setValue(fVar, an0.f.f1601k[0], eVar3);
        bVar2.a();
        dVar2.e();
        fVar2.e(false);
        fVar2.d(false);
        fVar.c();
        g1Var.l(v13);
        getLifecycle().a(v13);
        View root = g1Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getLifecycle().c(v());
        ((rf1.c) t()).dispose();
    }

    public final pf0.c s() {
        pf0.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final rf1.g t() {
        rf1.c cVar = this.f16204f;
        if (cVar != null) {
            return cVar;
        }
        r.i("permissionHandler");
        throw null;
    }

    public final by0.f v() {
        by0.f fVar = this.d;
        if (fVar != null) {
            return fVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/b$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
