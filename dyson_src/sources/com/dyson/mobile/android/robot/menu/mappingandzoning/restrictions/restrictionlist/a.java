package com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import bv0.e8;
import bv0.g9;
import bv0.s0;
import bv0.t2;
import bv0.v2;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.ManageRestrictionData;
import com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.ManageRestrictionsActivity;
import e22.m;
import fm1.o0;
import iu0.r;
import iu0.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.e;
import q8.g;
import se1.y;
import tw0.t;
import we1.a;
import xe1.f;
import yu0.u0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends Fragment {

    /* renamed from: j  reason: collision with root package name */
    public static final C0553a f16132j = new C0553a(null);
    public qx0.c d;
    public z e;

    /* renamed from: f  reason: collision with root package name */
    public String f16133f;

    /* renamed from: g  reason: collision with root package name */
    public final c f16134g = new c();

    /* renamed from: h  reason: collision with root package name */
    public final d f16135h = new d();

    /* renamed from: i  reason: collision with root package name */
    public final b f16136i = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/a$b", "Lbx0/a;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements bx0.a {
        public b() {
        }

        @Override // bx0.a
        public final void a() {
            C0553a c0553a = a.f16132j;
            a.this.s(null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/a$c", "Lqx0/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements qx0.b {
        public c() {
        }

        @Override // qx0.b
        public final void a() {
            ut0.a s13 = ut0.a.s(1, null);
            s13.setCancelable(false);
            s13.show(a.this.getChildFragmentManager(), "Progress");
        }

        @Override // qx0.b
        public final void b() {
            a aVar = a.this;
            FragmentManager childFragmentManager = aVar.getChildFragmentManager();
            childFragmentManager.z(true);
            childFragmentManager.G();
            Fragment E = aVar.getChildFragmentManager().E("Progress");
            E.getClass();
            ((ut0.a) E).dismissAllowingStateLoss();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/a$d", "Lsx0/a;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements sx0.a {
        public d() {
        }

        @Override // sx0.a
        public final void a(int i13) {
            Integer valueOf = Integer.valueOf(i13);
            C0553a c0553a = a.f16132j;
            a.this.s(valueOf);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "RestrictionListFragment cannot be initialised without a coordinator or map id";
        Bundle a13 = b13.a("COORDINATOR_ID", "MapId");
        z.a aVar = z.f42723r;
        f16132j.getClass();
        String y13 = o0.y("COORDINATOR_ID", a13);
        aVar.getClass();
        z a14 = z.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.e = a14;
        av0.d dVar = a14.f42732o.f42663a;
        dVar.b();
        s0 s0Var = dVar.f5510b;
        e8 e8Var = dVar.f5515c;
        pf0.c b14 = dVar.b();
        ow0.d d13 = dVar.d();
        e8Var.getClass();
        bx0.c cVar = new bx0.c();
        pf0.c b15 = dVar.b();
        ow0.b bVar = new ow0.b();
        y b16 = t2.b(s0Var);
        y b17 = t2.b(s0Var);
        e8Var.getClass();
        e eVar = new e(b17);
        t h13 = dVar.h();
        e8Var.getClass();
        cx0.a aVar2 = new cx0.a(b15, bVar, b16, eVar, h13);
        f<com.dyson.mobile.android.robot.cloud.model.a> fVar = dVar.E3.get();
        e8Var.getClass();
        fVar.getClass();
        xv0.f fVar2 = new xv0.f(fVar);
        r b18 = v2.b(s0Var);
        e8Var.getClass();
        this.d = g9.a(dVar.f5515c, dVar.V.get(), b14, d13, cVar, aVar2, fVar2, new mx0.c(b18));
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        this.f16133f = o0.y("MapId", requireArguments);
        qx0.c cVar2 = this.d;
        if (cVar2 == null) {
            x12.r.i("viewModel");
            throw null;
        }
        tf1.a aVar3 = cVar2.f68071l;
        m<?>[] mVarArr = qx0.c.f68064r;
        aVar3.setValue(cVar2, mVarArr[0], this.f16134g);
        cVar2.f68072m.setValue(cVar2, mVarArr[1], this.f16135h);
        cVar2.f68073n.setValue(cVar2, mVarArr[2], this.f16136i);
        String str = this.f16133f;
        if (str == null) {
            x12.r.i("persistentMapId");
            throw null;
        }
        cVar2.f68075p = str;
        qx0.a aVar4 = cVar2.f68070k;
        aVar4.f68061b = cVar2.f68066g;
        aVar4.f68062c = cVar2.f68067h;
        List<? extends mx0.b> list = (List) cVar2.f68068i.f55193a.getValue();
        list.getClass();
        aVar4.d = list;
        Lifecycle lifecycle = getLifecycle();
        qx0.c cVar3 = this.d;
        if (cVar3 == null) {
            x12.r.i("viewModel");
            throw null;
        }
        lifecycle.a(cVar3);
        int i13 = u0.f90931f;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        u0 u0Var = (u0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_restriction_list, viewGroup, false, null);
        qx0.c cVar4 = this.d;
        if (cVar4 == null) {
            x12.r.i("viewModel");
            throw null;
        }
        u0Var.l(cVar4);
        View root = u0Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle lifecycle = getLifecycle();
        qx0.c cVar = this.d;
        if (cVar != null) {
            lifecycle.c(cVar);
        } else {
            x12.r.i("viewModel");
            throw null;
        }
    }

    public final void s(Integer num) {
        mx0.d dVar;
        z zVar = this.e;
        if (zVar == null) {
            x12.r.i("robotCoordinator");
            throw null;
        }
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        String str = this.f16133f;
        if (str == null) {
            x12.r.i("persistentMapId");
            throw null;
        }
        ManageRestrictionsActivity.a aVar = ManageRestrictionsActivity.f16126r;
        String str2 = zVar.f42726i;
        aVar.getClass();
        str2.getClass();
        Intent intent = new Intent(requireActivity, ManageRestrictionsActivity.class);
        int intValue = num != null ? num.intValue() : -1;
        if (num == null || (dVar = mx0.d.UPDATE) == null) {
            dVar = mx0.d.CREATE;
        }
        intent.putExtra("ManageRestrictionData", new ManageRestrictionData(str2, str, intValue, dVar, null, false, 48, null));
        requireActivity.startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/a$a;", "", "<init>", "()V", "", "EXTRA_MAP_ID", "Ljava/lang/String;", "TAG_PROGRESS_SPINNER", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0553a {
        public /* synthetic */ C0553a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(String str, String str2) {
            str.getClass();
            str2.getClass();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putString("MapId", str2);
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0553a() {
        }
    }
}
