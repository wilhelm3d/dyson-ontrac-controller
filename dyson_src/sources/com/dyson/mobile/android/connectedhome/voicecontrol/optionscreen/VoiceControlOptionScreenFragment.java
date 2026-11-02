package com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b;
import gm1.am;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kz.a;
import m9.w;
import nh.s;
import nz.h;
import x12.p0;
import x12.t;
import y9.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/optionscreen/VoiceControlOptionScreenFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VoiceControlOptionScreenFragment extends Fragment {
    public b.a d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final tt0.a f13241f;

    /* renamed from: g  reason: collision with root package name */
    public final a f13242g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/optionscreen/VoiceControlOptionScreenFragment$a", "Ls00/a;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements s00.a {
        public a() {
        }

        @Override // s00.a
        public final void a() {
            c0 a13 = androidx.navigation.fragment.a.a(VoiceControlOptionScreenFragment.this);
            com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.a.f13249a.getClass();
            a13.i(new y9.a(R.id.actionLinkGoogleHome));
        }

        @Override // s00.a
        public final void b() {
            c0 a13 = androidx.navigation.fragment.a.a(VoiceControlOptionScreenFragment.this);
            com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.a.f13249a.getClass();
            a13.i(new y9.a(R.id.actionLinkAlexa));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13244f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f13244f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13244f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13245f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar) {
            super(0);
            this.f13245f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13245f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(0);
            this.f13246f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13246f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13247f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13248g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, l lVar) {
            super(0);
            this.f13247f = aVar;
            this.f13248g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13247f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13248g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public VoiceControlOptionScreenFragment() {
        q3.a aVar = new q3.a(this, 28);
        l a13 = m.a(n.NONE, new c(new b(this)));
        this.e = new d0(p0.f86717a.b(com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b.class), new d(a13), aVar, new e(null, a13));
        this.f13241f = new tt0.a();
        this.f13242g = new a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        kz.a.f50192c.getClass();
        mz.d dVar = a.C1547a.a(context).f50194b;
        h hVar = dVar.f55379a;
        pf0.c cVar = dVar.f55380b.get();
        hVar.getClass();
        cVar.getClass();
        this.d = new b.a(cVar);
        d0 d0Var = this.e;
        com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b bVar = (com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b) d0Var.getValue();
        bVar.e.setValue(bVar, com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b.f13250h[0], this.f13242g);
        this.f13241f.f80141a = ((com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b) d0Var.getValue()).f13252g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        am.B(this, ((com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen.b) this.e.getValue()).f13251f);
        int i13 = s.f57283f;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        s sVar = (s) q8.t.inflateInternal(layoutInflater, R.layout.fragment_voice_control_option_screen, viewGroup, false, null);
        sVar.l(this.f13241f);
        View root = sVar.getRoot();
        root.getClass();
        return root;
    }
}
