package com.dyson.mobile.android.audio.home571.soundcontrol;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ObservableInt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import cc0.z;
import cn.h;
import cn.j;
import cn.m;
import com.dyson.mobile.android.R;
import dk.q0;
import fm1.o0;
import h12.l;
import h12.n;
import hk.g5;
import hk.k5;
import hk.x;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import vj.f;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import zn1.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/soundcontrol/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: l  reason: collision with root package name */
    public static final C0354a f12673l = new C0354a(null);
    public fk.d d;
    public cn.b e;

    /* renamed from: f  reason: collision with root package name */
    public j f12674f;

    /* renamed from: g  reason: collision with root package name */
    public m f12675g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f12676h;

    /* renamed from: i  reason: collision with root package name */
    public cn.g f12677i;

    /* renamed from: j  reason: collision with root package name */
    public final c f12678j;

    /* renamed from: k  reason: collision with root package name */
    public final b f12679k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home571/soundcontrol/a$b", "Lcn/f;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements cn.f {
        public b() {
        }

        @Override // cn.f
        public final void w() {
            cn.g gVar = a.this.f12677i;
            if (gVar != null) {
                gVar.w();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home571/soundcontrol/a$c", "Lzn1/e$d;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements e.d {
        public c() {
        }

        @Override // zn1.e.c
        public final void a(e.g gVar) {
            C0354a c0354a = a.f12673l;
            h hVar = (h) a.this.f12676h.getValue();
            int i13 = gVar.d;
            ObservableInt observableInt = hVar.f11790g;
            if (i13 != observableInt.d) {
                hVar.S(i13);
            }
            observableInt.l(i13);
        }

        @Override // zn1.e.c
        public final void b(e.g gVar) {
            gVar.getClass();
        }

        @Override // zn1.e.c
        public final void c(e.g gVar) {
            gVar.getClass();
            C0354a c0354a = a.f12673l;
            h hVar = (h) a.this.f12676h.getValue();
            int i13 = gVar.d;
            ObservableInt observableInt = hVar.f11790g;
            if (i13 != observableInt.d) {
                hVar.S(i13);
            }
            observableInt.l(i13);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12682f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12682f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12682f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12683f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar) {
            super(0);
            this.f12683f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f12683f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12684f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l lVar) {
            super(0);
            this.f12684f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f12684f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12685f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12686g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, l lVar) {
            super(0);
            this.f12685f = aVar;
            this.f12686g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12685f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f12686g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        z zVar = new z(this, 3);
        l a13 = h12.m.a(n.NONE, new e(new d(this)));
        this.f12676h = new d0(p0.f86717a.b(h.class), new f(a13), zVar, new g(null, a13));
        this.f12678j = new c();
        this.f12679k = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        cn.g gVar = context instanceof cn.g ? (cn.g) context : null;
        if (gVar != null) {
            this.f12677i = gVar;
        } else {
            pa.c.p("Activity must implement AudioSoundControlNavigator");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create AudioSoundControlFragment";
        Bundle a13 = b13.a("COORDINATOR_ID", "TAB_TO_SELECT");
        String y13 = o0.y("COORDINATOR_ID", a13);
        vj.f.f84306m.getClass();
        vj.f a14 = f.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a14.f84312l;
        fk.d d13 = aVar.d();
        hk.j jVar = aVar.f34911b;
        this.d = d13;
        g5 g5Var = aVar.f34906a;
        eh0.e<xo.a> eVar = aVar.f35000t0.get();
        vj.h a15 = aVar.a();
        wj.a aVar2 = new wj.a();
        hj.e eVar2 = aVar.f35005u0.get();
        eh0.e<xo.a> eVar3 = aVar.f35000t0.get();
        jVar.getClass();
        eVar3.getClass();
        this.e = k5.a(g5Var, eVar, a15, aVar2, eVar2, new np.d(eVar3.d().f87812m), aVar.D0.get(), x.b(jVar));
        this.f12674f = aVar.e();
        Serializable c13 = k7.b.c(a13, "TAB_TO_SELECT", m.class);
        if (c13 != null) {
            this.f12675g = (m) c13;
        } else {
            pa.c.w("TAB_TO_SELECT was null");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Lifecycle lifecycle = getLifecycle();
        cn.b bVar = this.e;
        if (bVar == null) {
            r.i("ancViewModel");
            throw null;
        }
        lifecycle.a(bVar);
        Lifecycle lifecycle2 = getLifecycle();
        j jVar = this.f12674f;
        if (jVar == null) {
            r.i("equalizerViewModel");
            throw null;
        }
        lifecycle2.a(jVar);
        int i13 = q0.f24128h;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        q0 q0Var = (q0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_audio_sound_control, viewGroup, false, null);
        q0Var.getClass();
        d0 d0Var = this.f12676h;
        q0Var.l((h) d0Var.getValue());
        ViewPager viewPager = q0Var.f24129f;
        cn.b bVar2 = this.e;
        if (bVar2 == null) {
            r.i("ancViewModel");
            throw null;
        }
        tf1.a aVar = bVar2.f11763o;
        e22.m<?> mVar = cn.b.f11753w[0];
        b bVar3 = this.f12679k;
        aVar.setValue(bVar2, mVar, bVar3);
        j jVar2 = this.f12674f;
        if (jVar2 == null) {
            r.i("equalizerViewModel");
            throw null;
        }
        jVar2.f11803n.setValue(jVar2, j.f11793u[0], bVar3);
        cn.b bVar4 = this.e;
        if (bVar4 == null) {
            r.i("ancViewModel");
            throw null;
        }
        j jVar3 = this.f12674f;
        if (jVar3 == null) {
            r.i("equalizerViewModel");
            throw null;
        }
        viewPager.setAdapter(new cn.e(bVar4, jVar3));
        m mVar2 = this.f12675g;
        if (mVar2 == null) {
            r.i("tabToSelect");
            throw null;
        }
        viewPager.setCurrentItem(mVar2.getTabPosition());
        q0Var.e.a(this.f12678j);
        h hVar = (h) d0Var.getValue();
        m mVar3 = this.f12675g;
        if (mVar3 == null) {
            r.i("tabToSelect");
            throw null;
        }
        int tabPosition = mVar3.getTabPosition();
        ObservableInt observableInt = hVar.f11790g;
        q8.l<at0.m> lVar = hVar.f11789f;
        lVar.clear();
        m[] values = m.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (m mVar4 : values) {
            arrayList.add(new at0.m(hVar.d.d(mVar4.getTitle()), null, null, 6, null));
        }
        lVar.addAll(arrayList);
        observableInt.l(tabPosition);
        hVar.S(observableInt.d);
        View root = q0Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Lifecycle lifecycle = getLifecycle();
        cn.b bVar = this.e;
        if (bVar == null) {
            r.i("ancViewModel");
            throw null;
        }
        lifecycle.c(bVar);
        Lifecycle lifecycle2 = getLifecycle();
        j jVar = this.f12674f;
        if (jVar != null) {
            lifecycle2.c(jVar);
        } else {
            r.i("equalizerViewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/soundcontrol/a$a;", "", "<init>", "()V", "", "TAB_TO_SELECT", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home571.soundcontrol.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0354a {
        public /* synthetic */ C0354a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0354a() {
        }
    }
}
