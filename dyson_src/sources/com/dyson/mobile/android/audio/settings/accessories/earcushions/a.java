package com.dyson.mobile.android.audio.settings.accessories.earcushions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.settings.accessories.earcushions.a;
import fm1.o0;
import h12.l;
import h12.m;
import h12.n;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import nj.w0;
import vj.f;
import we1.a;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/accessories/earcushions/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment {

    /* renamed from: j  reason: collision with root package name */
    public static final C0358a f12722j = new C0358a(null);
    public fk.d d;
    public hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public lo.b f12723f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f12724g;

    /* renamed from: h  reason: collision with root package name */
    public final d0 f12725h;

    /* renamed from: i  reason: collision with root package name */
    public final b f12726i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/accessories/earcushions/a$b", "Llo/f;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements lo.f {
        public b() {
        }

        @Override // lo.f
        public final void a() {
            lo.b bVar = a.this.f12723f;
            if (bVar != null) {
                bVar.a();
            } else {
                r.i("fragmentNavigator");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12728f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f12728f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12728f.requireActivity().getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12729f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12730g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12729f = aVar;
            this.f12730g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12729f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12730g.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12731f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f12731f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f12731f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12732f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar) {
            super(0);
            this.f12732f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f12732f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f12733f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar) {
            super(0);
            this.f12733f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f12733f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12734f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12735g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, l lVar) {
            super(0);
            this.f12734f = aVar;
            this.f12735g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12734f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f12735g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        w12.a aVar = new w12.a(this) { // from class: lo.e
            public final /* synthetic */ com.dyson.mobile.android.audio.settings.accessories.earcushions.a e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.audio.settings.accessories.earcushions.a aVar2 = this.e;
                switch (i13) {
                    case 0:
                        a.C0358a c0358a = com.dyson.mobile.android.audio.settings.accessories.earcushions.a.f12722j;
                        fk.d dVar = aVar2.d;
                        if (dVar != null) {
                            return dVar;
                        }
                        r.i("viewModelFactory");
                        throw null;
                    default:
                        a.C0358a c0358a2 = com.dyson.mobile.android.audio.settings.accessories.earcushions.a.f12722j;
                        fk.d dVar2 = aVar2.d;
                        if (dVar2 != null) {
                            return dVar2;
                        }
                        r.i("viewModelFactory");
                        throw null;
                }
            }
        };
        l a13 = m.a(n.NONE, new f(new e(this)));
        q0 q0Var = p0.f86717a;
        this.f12724g = new d0(q0Var.b(lo.g.class), new g(a13), aVar, new h(null, a13));
        this.f12725h = new d0(q0Var.b(lo.c.class), new c(this), new w12.a(this) { // from class: lo.e
            public final /* synthetic */ com.dyson.mobile.android.audio.settings.accessories.earcushions.a e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.audio.settings.accessories.earcushions.a aVar2 = this.e;
                switch (i13) {
                    case 0:
                        a.C0358a c0358a = com.dyson.mobile.android.audio.settings.accessories.earcushions.a.f12722j;
                        fk.d dVar = aVar2.d;
                        if (dVar != null) {
                            return dVar;
                        }
                        r.i("viewModelFactory");
                        throw null;
                    default:
                        a.C0358a c0358a2 = com.dyson.mobile.android.audio.settings.accessories.earcushions.a.f12722j;
                        fk.d dVar2 = aVar2.d;
                        if (dVar2 != null) {
                            return dVar2;
                        }
                        r.i("viewModelFactory");
                        throw null;
                }
            }
        }, new d(null, this));
        this.f12726i = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("COORDINATOR_ID");
        f.a aVar = vj.f.f84306m;
        String y13 = o0.y("COORDINATOR_ID", a13);
        aVar.getClass();
        vj.f a14 = f.a.a(y13);
        if (a14 != null) {
            gk.a aVar2 = a14.f84312l;
            this.d = aVar2.d();
            this.e = aVar2.f35005u0.get();
        }
        int i13 = dk.w.f24235j;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        dk.w wVar = (dk.w) q8.t.inflateInternal(layoutInflater, R.layout.fragment_audio_ear_cushions, viewGroup, false, null);
        wVar.getClass();
        d0 d0Var = this.f12724g;
        lo.g gVar = (lo.g) d0Var.getValue();
        gVar.f52420h.setValue(gVar, lo.g.f52417i[0], this.f12726i);
        wVar.l((lo.g) d0Var.getValue());
        ((lo.c) this.f12725h.getValue()).S(ek.f.PRECALIBRATION_EAR_CUSHIONS_TITLE);
        View root = wVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.e;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = w0.f57758a;
        ij.b bVar = new ij.b("common.settings.ear_cushion_replacement_instructions", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/accessories/earcushions/a$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.settings.accessories.earcushions.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0358a {
        public /* synthetic */ C0358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0358a() {
        }
    }
}
