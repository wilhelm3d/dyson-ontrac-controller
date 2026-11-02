package com.dyson.mobile.android.interactableec.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.interactableec.settings.a;
import com.dyson.mobile.android.interactableec.settings.airQualityTarget.a;
import com.dyson.mobile.android.interactableec.settings.b;
import com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a;
import com.dyson.mobile.android.interactableec.settings.waterhardness.a;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.ui.help.WifiSignalStrengthHelpActivity;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machine.ui.settings.timezone.a;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import com.dyson.mobile.android.support.forsta.ForstaSurveyConfig;
import com.dyson.mobile.android.support.forsta.survey.ForstaSurveyActivity;
import fm1.o0;
import h12.p;
import h12.t;
import h12.y;
import i12.s;
import im1.zb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import m9.w;
import mj.m;
import pa0.t0;
import rf0.b0;
import rf0.i0;
import vc0.a;
import w90.g;
import wc0.a;
import we1.a;
import x12.p0;
import x12.r;
import yc0.f;
import yc0.q;
import ym0.f;
import z32.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "b", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f14642y = new a(null);
    public pf0.c d;
    public zf1.b e;

    /* renamed from: f  reason: collision with root package name */
    public rf1.c f14643f;

    /* renamed from: g  reason: collision with root package name */
    public rf1.e f14644g;

    /* renamed from: h  reason: collision with root package name */
    public se1.e f14645h;

    /* renamed from: i  reason: collision with root package name */
    public v60.b f14646i;

    /* renamed from: j  reason: collision with root package name */
    public String f14647j;

    /* renamed from: k  reason: collision with root package name */
    public w90.g f14648k;

    /* renamed from: l  reason: collision with root package name */
    public final t f14649l = h12.m.b(new w12.a(this) { // from class: qc0.a
        public final /* synthetic */ com.dyson.mobile.android.interactableec.settings.b e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            com.dyson.mobile.android.interactableec.settings.b bVar = this.e;
            switch (i13) {
                case 0:
                    b.a aVar = com.dyson.mobile.android.interactableec.settings.b.f14642y;
                    return new zs0.e(bVar.getContext());
                default:
                    zf1.b bVar2 = bVar.e;
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    r.i("viewModelFactory");
                    throw null;
            }
        }
    });

    /* renamed from: m  reason: collision with root package name */
    public final d0 f14650m;

    /* renamed from: n  reason: collision with root package name */
    public final f f14651n;

    /* renamed from: o  reason: collision with root package name */
    public final j f14652o;

    /* renamed from: p  reason: collision with root package name */
    public final g f14653p;

    /* renamed from: q  reason: collision with root package name */
    public final h f14654q;

    /* renamed from: r  reason: collision with root package name */
    public final k f14655r;

    /* renamed from: s  reason: collision with root package name */
    public final c f14656s;

    /* renamed from: t  reason: collision with root package name */
    public final e f14657t;

    /* renamed from: u  reason: collision with root package name */
    public final d f14658u;

    /* renamed from: v  reason: collision with root package name */
    public final by0.a f14659v;

    /* renamed from: w  reason: collision with root package name */
    public final by0.b f14660w;

    /* renamed from: x  reason: collision with root package name */
    public final i f14661x;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/b$b;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "permissionDescription", "settingsDescription", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.settings.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0485b {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f14662a;

        /* renamed from: b  reason: collision with root package name */
        public final LocalisationKey f14663b;

        /* renamed from: c  reason: collision with root package name */
        public final LocalisationKey f14664c;

        public C0485b(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3) {
            localisationKey.getClass();
            localisationKey2.getClass();
            localisationKey3.getClass();
            this.f14662a = localisationKey;
            this.f14663b = localisationKey2;
            this.f14664c = localisationKey3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0485b) {
                C0485b c0485b = (C0485b) obj;
                return this.f14662a.equals(c0485b.f14662a) && this.f14663b.equals(c0485b.f14663b) && this.f14664c.equals(c0485b.f14664c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f14664c.hashCode() + y.e(this.f14663b, this.f14662a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "PermissionDialogMessages(title=" + this.f14662a + ", permissionDescription=" + this.f14663b + ", settingsDescription=" + this.f14664c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$c", "Lyc0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements yc0.a {
        public c() {
        }

        @Override // yc0.a
        public final void a() {
            a.C0486a c0486a = com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a.f14683i;
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            c0486a.getClass();
            str.getClass();
            com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a aVar = new com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            bVar.t().q1(aVar, bVar.s().d(rf0.f.f71307q1));
        }

        @Override // yc0.a
        public final void b() {
            a.C0484a c0484a = com.dyson.mobile.android.interactableec.settings.airQualityTarget.a.f14634g;
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            c0484a.getClass();
            str.getClass();
            com.dyson.mobile.android.interactableec.settings.airQualityTarget.a aVar = new com.dyson.mobile.android.interactableec.settings.airQualityTarget.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            bVar.t().q1(aVar, bVar.s().d(rf0.f.f71275m5));
        }

        @Override // yc0.a
        public final void c() {
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = bVar.requireActivity();
            requireActivity.getClass();
            gVar.x(requireActivity, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_FILTER_MANAGEMENT, new ExternalLinkTracking("parts_and_accessories", m.a.MACHINE_SETTINGS, null, null, 12, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$d", "Lyc0/f$a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements f.a {
        public d() {
        }

        @Override // yc0.f.a
        public final void a() {
            a aVar = b.f14642y;
            qc0.h x13 = b.this.x();
            zb.z(x13.f66620s, x13.d.connect().v());
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$e", "Lyc0/g;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements yc0.g {
        public e() {
        }

        @Override // yc0.g
        public final void a() {
            a.C0490a c0490a = com.dyson.mobile.android.interactableec.settings.waterhardness.a.f14712h;
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            c0490a.getClass();
            str.getClass();
            com.dyson.mobile.android.interactableec.settings.waterhardness.a aVar = new com.dyson.mobile.android.interactableec.settings.waterhardness.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            bVar.t().q1(aVar, bVar.s().d(rf0.l.J));
        }

        @Override // yc0.g
        public final void b() {
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            androidx.fragment.app.e requireActivity = bVar.requireActivity();
            requireActivity.getClass();
            gVar.w(requireActivity, "Running a clean", new po.c(bVar, 13));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$f", "Lxm0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements xm0.a {
        public f() {
        }

        @Override // xm0.a
        public final void a(in0.e eVar) {
            NamingConfig namingConfig = new NamingConfig(null, null, new MachineNamingExtras.PersistName(eVar.e(), eVar.a().f15564l, eVar.a().i(), eVar.g(), eVar.b()), 3, null);
            a.C0483a c0483a = com.dyson.mobile.android.interactableec.settings.a.f14629k;
            b bVar = b.this;
            String str = bVar.f14647j;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0483a.getClass();
            com.dyson.mobile.android.interactableec.settings.a aVar = new com.dyson.mobile.android.interactableec.settings.a();
            aVar.setArguments(k7.c.a(new p("CONFIG", namingConfig), new p("COORDINATOR_ID", str)));
            bVar.t().q1(aVar, bVar.s().d(rf0.f.L0));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$g", "Lym0/b;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements ym0.b {
        public g() {
        }

        @Override // ym0.b
        public final void b(String str) {
            str.getClass();
            a aVar = b.f14642y;
            b bVar = b.this;
            bVar.getClass();
            bVar.t().q1(om0.b.s(str), bVar.s().d(rf0.f.T0));
        }

        @Override // ym0.b
        public final void c(String str, String str2) {
            str.getClass();
            com.dyson.mobile.android.machine.ui.settings.timezone.a.f15521f.getClass();
            com.dyson.mobile.android.machine.ui.settings.timezone.a a13 = a.C0534a.a(str, str2);
            a aVar = b.f14642y;
            b bVar = b.this;
            bVar.t().q1(a13, bVar.s().d(i0.W4));
        }

        @Override // ym0.b
        public final void d(wm0.a aVar) {
            a aVar2 = b.f14642y;
            b bVar = b.this;
            bVar.v();
            ConnectivityIssueActivity.f1(bVar.getActivity(), aVar, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$h", "Lyc0/q;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements q {
        public h() {
        }

        @Override // yc0.q
        public final void a() {
            a aVar = b.f14642y;
            b bVar = b.this;
            bVar.v();
            androidx.fragment.app.e activity = bVar.getActivity();
            List c13 = s.c(bVar.x().f66622u);
            ForstaSurveyConfig forstaSurveyConfig = ForstaSurveyConfig.EC_NDS_EXPERIENCE_FEEDBACK;
            ForstaSurveyActivity.a aVar2 = ForstaSurveyActivity.f16825k;
            ForstaSurveyActivity.Inputs inputs = new ForstaSurveyActivity.Inputs(c13, forstaSurveyConfig);
            aVar2.getClass();
            activity.startActivity(ForstaSurveyActivity.a.a(activity, inputs));
        }

        @Override // yc0.q
        public final void b() {
            a aVar = b.f14642y;
            b bVar = b.this;
            ((zs0.e) bVar.f14649l.getValue()).c(bVar.s().d(b0.B), bVar.s().d(b0.C), false, new by0.d(2));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$i", "Lan0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements an0.a {
        public i() {
        }

        @Override // an0.a
        public final void a() {
            d(true);
        }

        @Override // an0.a
        public final void b(String str, String str2, String str3, String str4, a20.a aVar) {
            a aVar2 = b.f14642y;
            b bVar = b.this;
            bVar.v();
            uf0.g.c(bVar.getContext(), str, str2, str3, str4, aVar);
        }

        @Override // an0.a
        public final void c() {
            d(false);
        }

        public final void d(boolean z13) {
            a.C2486a c2486a = vc0.a.f84073l;
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            c2486a.getClass();
            str.getClass();
            vc0.a aVar = new vc0.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putBoolean("ARG_USER_IS_OWNER", z13);
            aVar.setArguments(bundle);
            bVar.t().q1(aVar, bVar.s().d(i0.f71842s8));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$j", "Lcn0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class j implements cn0.a {
        public j() {
        }

        @Override // cn0.a
        public final void a() {
            a aVar = b.f14642y;
            qc0.h x13 = b.this.x();
            zb.z(x13.f66620s, x13.d.connect().v());
        }

        @Override // cn0.a
        public final void b() {
            a.C2544a c2544a = wc0.a.f85610f;
            b bVar = b.this;
            w90.g gVar = bVar.f14648k;
            if (gVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = gVar.f85509i;
            c2544a.getClass();
            str.getClass();
            wc0.a aVar = new wc0.a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle);
            bVar.t().q1(aVar, bVar.s().d(rf0.f.P0));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/settings/b$k", "Ldn0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class k implements dn0.a {
        public k() {
        }

        @Override // dn0.a
        public final void a(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            machineDescriptor.getClass();
            Logger.c("Settings change Wifi clicked");
            b bVar = b.this;
            if (bVar.w().c()) {
                Logger.c("Permission granted successfully");
                bVar.v().b(bVar.getActivity(), str, machineDescriptor);
                return;
            }
            Logger.c("Permissions not yet granted");
            se1.e eVar = bVar.f14645h;
            if (eVar == null) {
                r.i("buildVersionProvider");
                throw null;
            }
            C0485b c0485b = eVar.b() ? new C0485b(i0.f71691ib, i0.f71706jb, i0.f71721kb) : new C0485b(i0.f71682i2, i0.f71760n2, i0.f71698j2);
            ((zs0.e) bVar.f14649l.getValue()).c(bVar.s().d(c0485b.f14662a), bVar.s().d(c0485b.f14663b), true, new by0.e(bVar, str, machineDescriptor, c0485b, 1));
        }

        @Override // dn0.a
        public final void b(p70.b bVar) {
            bVar.getClass();
            a aVar = b.f14642y;
            b bVar2 = b.this;
            bVar2.v();
            androidx.fragment.app.e activity = bVar2.getActivity();
            WifiSignalStrengthHelpActivity.f15362l.getClass();
            activity.getClass();
            Intent putExtra = new Intent(activity, WifiSignalStrengthHelpActivity.class).putExtra("EXTRA_RSSI_STATE", bVar.name());
            putExtra.getClass();
            activity.startActivity(putExtra);
            activity.overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class l extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f14674f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f14674f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f14674f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class m extends x12.t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14675f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(w12.a aVar) {
            super(0);
            this.f14675f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f14675f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class n extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f14676f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(h12.l lVar) {
            super(0);
            this.f14676f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f14676f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class o extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14677f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f14678g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(w12.a aVar, h12.l lVar) {
            super(0);
            this.f14677f = aVar;
            this.f14678g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14677f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f14678g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public b() {
        w12.a aVar = new w12.a(this) { // from class: qc0.a
            public final /* synthetic */ com.dyson.mobile.android.interactableec.settings.b e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.interactableec.settings.b bVar = this.e;
                switch (i13) {
                    case 0:
                        b.a aVar2 = com.dyson.mobile.android.interactableec.settings.b.f14642y;
                        return new zs0.e(bVar.getContext());
                    default:
                        zf1.b bVar2 = bVar.e;
                        if (bVar2 != null) {
                            return bVar2;
                        }
                        r.i("viewModelFactory");
                        throw null;
                }
            }
        };
        h12.l a13 = h12.m.a(h12.n.NONE, new m(new l(this)));
        this.f14650m = new d0(p0.f86717a.b(qc0.h.class), new n(a13), aVar, new o(null, a13));
        this.f14651n = new f();
        this.f14652o = new j();
        this.f14653p = new g();
        this.f14654q = new h();
        this.f14655r = new k();
        this.f14656s = new c();
        this.f14657t = new e();
        this.f14658u = new d();
        this.f14659v = new by0.a(this, 2);
        this.f14660w = new by0.b(this, 2);
        this.f14661x = new i();
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
        if (string == null || v32.y.A(string)) {
            return;
        }
        int hashCode = string.hashCode();
        if (hashCode == -382517504) {
            if (string.equals("EXTRA_RESULT_CODE")) {
                String string2 = bundle.getString("EXTRA_MACHINE_LOCATION");
                if (string2 != null && !v32.y.A(string2)) {
                    qc0.h x13 = x();
                    x13.f66610i.f90270n.onNext(new f.a.c(string2, false));
                    g0.r(v.a(x13), null, null, new qc0.g(x13, null), 3);
                }
            }
            Logger.e("Unknown result code", null);
        } else if (hashCode != -110011485) {
            if (hashCode == 1650345926 && string.equals("MACHINE_TIME_ZONE")) {
                String string3 = bundle.getString("EXTRA_MACHINE_TIME_ZONE");
                if (string3 != null && !v32.y.A(string3)) {
                    x().f66610i.c(string3);
                }
            }
            Logger.e("Unknown result code", null);
        } else {
            if (string.equals("MACHINE_NAME")) {
                String string4 = bundle.getString("NEW_NAME");
                if (string4 != null && !v32.y.A(string4)) {
                    x().f66607f.b(string4);
                    w90.g gVar = this.f14648k;
                    if (gVar == null) {
                        r.i("coordinator");
                        throw null;
                    }
                    in0.f g13 = gVar.g();
                    if (g13 != null) {
                        g13.b(gVar.f85508h.e(), string4);
                    }
                }
            }
            Logger.e("Unknown result code", null);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            w90.g gVar2 = this.f14648k;
            if (gVar2 != null) {
                gVar2.h(activity);
            } else {
                r.i("coordinator");
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
        Throwable th2;
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create ECSettingsFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        this.f14647j = y13;
        w90.g.f85506o.getClass();
        w90.g a13 = g.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.f14648k = a13;
        oa0.b bVar = a13.f85510j;
        pa0.a aVar = bVar.f59825a;
        pa0.a aVar2 = bVar.f59825a;
        this.d = t0.b(aVar);
        this.e = bVar.a();
        aVar2.getClass();
        rf1.e eVar = new rf1.e(new se1.e());
        this.f14643f = new se1.e().b() ? new rf1.d(eVar) : new rf1.f(eVar);
        aVar2.getClass();
        this.f14644g = new rf1.e(new se1.e());
        this.f14645h = new se1.e();
        uf0.l lVar = bVar.f59875k1.get();
        aVar2.getClass();
        lVar.getClass();
        vy1.a<v60.b> aVar3 = lVar.f81973t;
        if (aVar3 == null) {
            r.i("lazyLocationServiceHelper");
            throw null;
        }
        v60.b bVar2 = aVar3.get();
        bVar2.getClass();
        this.f14646i = bVar2;
        if (!(getActivity() instanceof bt0.f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        ty1.l lVar2 = new ty1.l(this);
        rf1.g w13 = w();
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        rf1.e eVar2 = ((rf1.c) w13).f73036a;
        eVar2.f73038a = lVar2;
        eVar2.f73039b = requireActivity;
        rf1.e eVar3 = this.f14644g;
        if (eVar3 == null) {
            r.i("dysonPermissionManager");
            throw null;
        }
        androidx.fragment.app.e requireActivity2 = requireActivity();
        requireActivity2.getClass();
        eVar3.f73038a = lVar2;
        eVar3.f73039b = requireActivity2;
        getLifecycle().a(x());
        g0.r(i3.n.o(this), null, null, new qc0.d(this, null), 3);
        int i13 = na0.o0.f56521q;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        na0.o0 o0Var = (na0.o0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_interactable_ec_settings, viewGroup, false, null);
        qc0.h x13 = x();
        xm0.b bVar3 = x13.f66607f;
        an0.f fVar = x13.f66616o;
        bn0.d dVar = x13.f66615n;
        yc0.j jVar = x13.f66613l;
        yc0.e eVar4 = x13.f66612k;
        dn0.c cVar = x13.f66611j;
        ym0.f fVar2 = x13.f66610i;
        bVar3.f87788f.setValue(bVar3, xm0.b.f87784h[0], this.f14651n);
        yc0.r rVar = x13.f66608g;
        if (rVar != null) {
            th2 = null;
            rVar.f89768c.setValue(rVar, yc0.r.f89765f[0], this.f14654q);
        } else {
            th2 = null;
        }
        yc0.s sVar = x13.f66609h;
        if (sVar != null) {
            sVar.f11826c.setValue(sVar, cn0.c.f11823f[0], this.f14652o);
        }
        fVar2.f90280x.setValue(fVar2, ym0.f.f90261y[0], this.f14653p);
        if (cVar != null) {
            cVar.f24541c.setValue(cVar, dn0.c.f24538k[0], this.f14655r);
        }
        if (cVar != null) {
            cVar.f24544h = w();
        }
        yc0.k kVar = x13.f66617p;
        if (kVar != null) {
            rf1.e eVar5 = this.f14644g;
            if (eVar5 == null) {
                r.i("dysonPermissionManager");
                throw th2;
            }
            kVar.f89745h.setValue(kVar, yc0.k.f89739o[0], eVar5);
        }
        eVar4.f89704y.setValue(eVar4, yc0.e.A[0], this.f14656s);
        yc0.f fVar3 = eVar4.e;
        tf1.a aVar4 = fVar3.f89714c;
        e22.m<?>[] mVarArr = yc0.f.d;
        e22.m<?> mVar = mVarArr[0];
        d dVar2 = this.f14658u;
        aVar4.setValue(fVar3, mVar, dVar2);
        if (jVar != null) {
            jVar.f89721f.setValue(jVar, yc0.j.f89716t[0], this.f14657t);
        }
        if (jVar != null) {
            yc0.f fVar4 = jVar.f89720c;
            fVar4.f89714c.setValue(fVar4, mVarArr[0], dVar2);
        }
        zm0.b bVar4 = x13.f66614m;
        bVar4.f92880c.setValue(bVar4, zm0.b.d[0], this.f14659v);
        dVar.f8182o.setValue(dVar, bn0.d.f8169s[0], this.f14660w);
        fVar.f1606g.setValue(fVar, an0.f.f1601k[0], this.f14661x);
        zb.z(x13.f66620s, x13.d.a().O(new q70.g(new qc0.f(x13, 0), 15)));
        bVar3.a();
        fVar2.e(false);
        fVar2.d(false);
        dVar.e();
        fVar.c();
        o0Var.l(x13);
        View root = o0Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((rf1.c) w()).dispose();
        getLifecycle().c(x());
    }

    public final pf0.c s() {
        pf0.c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final pl0.c t() {
        androidx.fragment.app.e activity = getActivity();
        activity.getClass();
        return (pl0.c) activity;
    }

    public final uf0.g v() {
        uf0.g a13 = uf0.g.a(getActivity());
        a13.getClass();
        return a13;
    }

    public final rf1.g w() {
        rf1.c cVar = this.f14643f;
        if (cVar != null) {
            return cVar;
        }
        r.i("permissionHandler");
        throw null;
    }

    public final qc0.h x() {
        return (qc0.h) this.f14650m.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/b$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
