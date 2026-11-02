package com.dyson.mobile.android.machine.ui.settings.timezone;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import fm1.o0;
import java.lang.ref.WeakReference;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg0.y;
import nj.d1;
import pa.c;
import q8.t;
import se1.k0;
import tg0.v1;
import uf0.o;
import um0.e;
import um0.g;
import vk0.n;
import we1.a;
import x12.r;
import zs0.i;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/a;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends Fragment implements f.a {

    /* renamed from: f  reason: collision with root package name */
    public static final C0534a f15521f = new C0534a(null);
    public g d;
    public final b e = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/ui/settings/timezone/a$b", "Lum0/e;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements e {
        public b() {
        }

        @Override // um0.e
        public final void a() {
            ut0.a aVar = (ut0.a) a.this.getChildFragmentManager().E("IN_PROGRESS");
            if (aVar != null) {
                aVar.dismissAllowingStateLoss();
            }
        }

        @Override // um0.e
        public final void b() {
            ut0.a s13 = ut0.a.s(1, null);
            s13.setCancelable(false);
            s13.show(a.this.getChildFragmentManager(), "IN_PROGRESS");
        }

        @Override // um0.e
        public final void c() {
            a aVar = a.this;
            s70.b bVar = new s70.b(aVar, 4);
            uf0.g a13 = uf0.g.a(aVar.requireContext());
            androidx.fragment.app.e requireActivity = aVar.requireActivity();
            a13.getClass();
            ConnectivityIssueActivity.f1(requireActivity, bVar, null);
        }

        @Override // um0.e
        public final void d(String str) {
            Bundle bundle = new Bundle();
            bundle.putString("RESULT_CODE", "MACHINE_TIME_ZONE");
            bundle.putString("EXTRA_MACHINE_TIME_ZONE", str);
            androidx.fragment.app.e requireActivity = a.this.requireActivity();
            requireActivity.getClass();
            ((f) requireActivity).j1(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.clear();
        i.a(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        t c13 = q8.g.c(layoutInflater, R.layout.fragment_machine_time_zone, viewGroup, false, null);
        c13.getClass();
        y yVar = (y) c13;
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Missing arguments - please use newInstance when using MachineTimeZoneFragment";
        Bundle a13 = b13.a("EXTRA_MACHINE_SERIAL", "EXTRA_MACHINE_TIME_ZONE");
        if (!(requireActivity() instanceof f)) {
            c.w("Activity must extend NavigationStackActivity");
            return null;
        }
        setHasOptionsMenu(true);
        sg0.b bVar = uf0.g.a(requireActivity()).f81922a;
        v1 v1Var = bVar.f76086a;
        n nVar = bVar.f76116q.get();
        o oVar = bVar.f76097g0.get();
        hj.e eVar = bVar.f76111n0.get();
        v1Var.getClass();
        nVar.getClass();
        oVar.getClass();
        eVar.getClass();
        this.d = new g(nVar, eVar, oVar, new k0());
        getLifecycle().a(s());
        TimeZone timeZone = TimeZone.getTimeZone(o0.y("EXTRA_MACHINE_TIME_ZONE", a13));
        RecyclerView recyclerView = yVar.d;
        recyclerView.getClass();
        recyclerView.addItemDecoration(new at0.c(recyclerView.getContext(), R.drawable.divider_white, (int) TypedValue.applyDimension(1, 24.0f, getResources().getDisplayMetrics()), 0));
        recyclerView.setHasFixedSize(true);
        recyclerView.addOnScrollListener(new um0.c(this));
        recyclerView.scrollToPosition(s().f82256f.e.indexOf(timeZone));
        yVar.l(s());
        s().f82263m = new WeakReference<>(this.e);
        g s13 = s();
        s13.f82262l = o0.y("EXTRA_MACHINE_SERIAL", a13);
        s13.f82261k = timeZone;
        um0.b bVar2 = s13.f82256f;
        int indexOf = bVar2.e.indexOf(bVar2.f82250f);
        int indexOf2 = bVar2.e.indexOf(timeZone);
        bVar2.notifyItemChanged(indexOf);
        bVar2.notifyItemChanged(indexOf2);
        bVar2.f82250f = timeZone;
        bVar2.registerAdapterDataObserver(s13.f82264n);
        hj.e eVar2 = s13.e;
        int i13 = d1.f57442a;
        eVar2.h(new ij.b("common.settings.time_zone", null, 2, null), null);
        return yVar.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.d == null) {
            getLifecycle().c(s());
        }
    }

    public final g s() {
        g gVar = this.d;
        if (gVar != null) {
            return gVar;
        }
        r.i("machineTimeZoneViewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/a$a;", "", "<init>", "()V", "", "EXTRA_RESULT_CODE", "Ljava/lang/String;", "EXTRA_MACHINE_TIME_ZONE", "EXTRA_MACHINE_SERIAL", "TAG_PROGRESS_SPINNER", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.ui.settings.timezone.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0534a {
        public /* synthetic */ C0534a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(String str, String str2) {
            str.getClass();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_MACHINE_SERIAL", str);
            bundle.putString("EXTRA_MACHINE_TIME_ZONE", str2);
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0534a() {
        }
    }
}
