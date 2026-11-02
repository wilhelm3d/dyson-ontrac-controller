package com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a;
import gm1.am;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kz.a;
import m9.w;
import nh.o;
import x1.i;
import x12.p0;
import x12.q0;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/googleassistant/GoogleHomeLandingScreenFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoogleHomeLandingScreenFragment extends Fragment {
    public a.C0398a d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f13180f;

    /* renamed from: g  reason: collision with root package name */
    public final a f13181g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/googleassistant/GoogleHomeLandingScreenFragment$a", "Lk00/a;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements k00.a {
        public a() {
        }

        @Override // k00.a
        public final void a() {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://home.google.com/home-app/?deeplink=setup%2Fha_linking%3Fagent_id%3Dproduction-7ea3b"));
            intent.addFlags(268435456);
            GoogleHomeLandingScreenFragment.this.startActivity(intent);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13183f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f13183f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f13183f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13184f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f13185g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f13184f = aVar;
            this.f13185g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13184f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f13185g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13186f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f13186f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f13186f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13187f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f13187f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13187f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13188f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar) {
            super(0);
            this.f13188f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13188f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13189f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar) {
            super(0);
            this.f13189f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13189f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13190f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13191g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, l lVar) {
            super(0);
            this.f13190f = aVar;
            this.f13191g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13190f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13191g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public GoogleHomeLandingScreenFragment() {
        ia0.a aVar = new ia0.a(this, 26);
        l a13 = m.a(n.NONE, new f(new e(this)));
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a.class), new g(a13), aVar, new h(null, a13));
        this.f13180f = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.a.class), new b(this), new d(this), new c(null, this));
        this.f13181g = new a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        kz.a.f50192c.getClass();
        mz.d dVar = a.C1547a.a(context).f50194b;
        nz.h hVar = dVar.f55379a;
        pf0.c cVar = dVar.f55380b.get();
        hVar.getClass();
        cVar.getClass();
        this.d = new a.C0398a(cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f13180f.getValue()).S(true);
        d0 d0Var = this.e;
        am.B(this, ((com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a) d0Var.getValue()).d);
        int i13 = o.f57272h;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        o oVar = (o) q8.t.inflateInternal(layoutInflater, R.layout.fragment_google_home_landing_screen, viewGroup, false, null);
        com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a aVar = (com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a) d0Var.getValue();
        aVar.e.setValue(aVar, com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a.f13192f[0], this.f13181g);
        oVar.l(aVar);
        View root = oVar.getRoot();
        root.getClass();
        return root;
    }
}
