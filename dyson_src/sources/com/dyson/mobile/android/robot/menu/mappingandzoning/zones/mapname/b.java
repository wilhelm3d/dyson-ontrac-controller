package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname;

import a01.k;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.f;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import com.dyson.mobile.android.robot.menu.mappingandzoning.maps.maplist.mapitem.mapname.MapNameChoiceExtras;
import fm1.o0;
import h12.h;
import h12.l;
import h12.n;
import hj.e;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import m9.w;
import nj.ya;
import v32.y;
import we1.a;
import x12.m;
import x12.p0;
import x12.r;
import x12.t;
import zs0.i;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/mapname/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f16187i = new a(null);
    public zf1.b d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f16188f;

    /* renamed from: g  reason: collision with root package name */
    public NamingConfig<MapNameChoiceExtras> f16189g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f16190h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0556b implements p, m {
        public final /* synthetic */ Function1 d;

        public C0556b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof m)) {
                return r.c(d(), ((m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16191f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f16191f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16191f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16192f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f16192f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f16192f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f16193f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f16193f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f16193f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16194f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f16195g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f16194f = aVar;
            this.f16195g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16194f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f16195g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public b() {
        k kVar = new k(this, 8);
        l a13 = h12.m.a(n.NONE, new d(new c(this)));
        this.f16190h = new d0(p0.f86717a.b(com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.c.class), new e(a13), kVar, new f(null, a13));
    }

    @Override // bt0.f.a
    public final void f(Bundle bundle) {
        NamingConfig<MapNameChoiceExtras> namingConfig = null;
        String string = bundle != null ? bundle.getString("NEW_NAME") : null;
        if (string == null || y.A(string)) {
            return;
        }
        NamingConfig<MapNameChoiceExtras> namingConfig2 = this.f16189g;
        if (namingConfig2 != null) {
            String[] strArr = namingConfig2.e;
            MapNameChoiceExtras mapNameChoiceExtras = namingConfig2.f15910f;
            strArr.getClass();
            mapNameChoiceExtras.getClass();
            namingConfig = new NamingConfig<>(string, strArr, mapNameChoiceExtras);
        }
        this.f16189g = namingConfig;
        ((com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.c) this.f16190h.getValue()).S(string);
    }

    @Override // bt0.f.a
    public final void i() {
        hj.e eVar = this.f16188f;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = ya.f57800a;
        ij.b bVar = new ij.b("robot.zoning.name_your_map", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
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
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("COORDINATOR_ID", "EXTRA_MAP_NAME_CONFIG");
        Object a14 = k7.b.a(a13, "EXTRA_MAP_NAME_CONFIG", NamingConfig.class);
        if (a14 == null) {
            pa.c.w("EXTRA_MAP_NAME_CONFIG was null");
            return null;
        }
        this.f16189g = (NamingConfig) ((Parcelable) a14);
        z.a aVar = z.f42723r;
        String y13 = o0.y("COORDINATOR_ID", a13);
        aVar.getClass();
        z a15 = z.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        av0.d dVar = a15.f42732o.f42663a;
        this.d = dVar.a();
        this.e = dVar.b();
        this.f16188f = dVar.V.get();
        setHasOptionsMenu(true);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(-2006341952, true, new ay0.a(this, 0)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f16188f;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = ya.f57800a;
        ij.b bVar = new ij.b("robot.zoning.name_your_map", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        d0 d0Var = this.f16190h;
        com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.c cVar = (com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.c) d0Var.getValue();
        NamingConfig<MapNameChoiceExtras> namingConfig = this.f16189g;
        cVar.S(namingConfig != null ? namingConfig.d : null);
        ((com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.c) d0Var.getValue()).f16196f.observe(getViewLifecycleOwner(), new C0556b(new a01.l(this, 19)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/mapname/b$a;", "", "<init>", "()V", "", "EXTRA_MAP_NAME_CONFIG", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
