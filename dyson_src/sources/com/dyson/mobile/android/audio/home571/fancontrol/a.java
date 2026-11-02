package com.dyson.mobile.android.audio.home571.fancontrol;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.g;
import dk.s;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import nj.qe;
import rf0.q;
import vj.f;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/fancontrol/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: k  reason: collision with root package name */
    public static final C0353a f12615k = new C0353a(null);
    public fk.d d;
    public pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public hj.e f12616f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f12617g;

    /* renamed from: h  reason: collision with root package name */
    public s f12618h;

    /* renamed from: i  reason: collision with root package name */
    public hm.b f12619i;

    /* renamed from: j  reason: collision with root package name */
    public final b f12620j;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home571/fancontrol/a$b", "Lhm/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements hm.a {
        public b() {
        }

        @Override // hm.a
        public final void o() {
            hm.b bVar = a.this.f12619i;
            if (bVar != null) {
                bVar.o();
            }
        }

        @Override // hm.a
        public final void q() {
            hm.b bVar = a.this.f12619i;
            if (bVar != null) {
                bVar.q();
            }
        }

        @Override // hm.a
        public final void x() {
            hm.b bVar = a.this.f12619i;
            if (bVar != null) {
                bVar.x();
            }
        }

        @Override // hm.a
        public final void y() {
            a aVar = a.this;
            s sVar = aVar.f12618h;
            if (sVar == null) {
                r.i("binding");
                throw null;
            }
            ConstraintLayout constraintLayout = sVar.d;
            pf0.c cVar = aVar.e;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            Snackbar g13 = Snackbar.g(constraintLayout, cVar.d(q.f72500v4));
            TextView textView = (TextView) g13.f20031i.findViewById(R.id.snackbar_text);
            textView.setTypeface(zs0.f.BODY_FONT.getTypeface(textView.getResources().getAssets()));
            textView.setTextColor(textView.getResources().getColor(R.color.bodyCopyGrey, null));
            g b13 = g.b();
            boolean z13 = false;
            int recommendedTimeoutMillis = g13.f20057y.getRecommendedTimeoutMillis(0, 3);
            BaseTransientBottomBar.e eVar = g13.f20041s;
            synchronized (b13.f20061a) {
                try {
                    if (b13.c(eVar)) {
                        g.c cVar2 = b13.f20063c;
                        cVar2.f20065b = recommendedTimeoutMillis;
                        b13.f20062b.removeCallbacksAndMessages(cVar2);
                        b13.f(b13.f20063c);
                        return;
                    }
                    g.c cVar3 = b13.d;
                    if (cVar3 != null && eVar != null && cVar3.f20064a.get() == eVar) {
                        z13 = true;
                    }
                    if (z13) {
                        b13.d.f20065b = recommendedTimeoutMillis;
                    } else {
                        b13.d = new g.c(recommendedTimeoutMillis, eVar);
                    }
                    g.c cVar4 = b13.f20063c;
                    if (cVar4 == null || !b13.a(cVar4, 4)) {
                        b13.f20063c = null;
                        g.c cVar5 = b13.d;
                        if (cVar5 != null) {
                            b13.f20063c = cVar5;
                            b13.d = null;
                            g.b bVar = cVar5.f20064a.get();
                            if (bVar != null) {
                                bVar.show();
                            } else {
                                b13.f20063c = null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12622f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f12622f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12622f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12623f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f12623f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f12623f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12624f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f12624f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f12624f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12625f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12626g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f12625f = aVar;
            this.f12626g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12625f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f12626g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        gv.c cVar = new gv.c(this, 16);
        l a13 = m.a(n.NONE, new d(new c(this)));
        this.f12617g = new d0(p0.f86717a.b(hm.c.class), new e(a13), cVar, new f(null, a13));
        this.f12620j = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        hm.b bVar = context instanceof hm.b ? (hm.b) context : null;
        if (bVar != null) {
            this.f12619i = bVar;
        } else {
            pa.c.p("Activity must implement AudioAirFlowControlNavigator");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create AudioAirFlowControlFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        vj.f.f84306m.getClass();
        vj.f a13 = f.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a13.f84312l;
        this.d = aVar.d();
        this.e = aVar.f();
        this.f12616f = aVar.f35005u0.get();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Lifecycle lifecycle = getLifecycle();
        d0 d0Var = this.f12617g;
        lifecycle.a((hm.c) d0Var.getValue());
        int i13 = s.H;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        s sVar = (s) q8.t.inflateInternal(layoutInflater, R.layout.fragment_audio_air_flow_control, viewGroup, false, null);
        sVar.getClass();
        this.f12618h = sVar;
        hm.c cVar = (hm.c) d0Var.getValue();
        cVar.f39183n.setValue(cVar, hm.c.f39174p[0], this.f12620j);
        s sVar2 = this.f12618h;
        if (sVar2 == null) {
            r.i("binding");
            throw null;
        }
        sVar2.l((hm.c) d0Var.getValue());
        s sVar3 = this.f12618h;
        if (sVar3 == null) {
            r.i("binding");
            throw null;
        }
        View root = sVar3.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getLifecycle().c((hm.c) this.f12617g.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f12616f;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = qe.f57670a;
        ij.b bVar = new ij.b("wearable_ec.instant_control.fan_speed", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/fancontrol/a$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home571.fancontrol.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0353a {
        public /* synthetic */ C0353a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0353a() {
        }
    }
}
