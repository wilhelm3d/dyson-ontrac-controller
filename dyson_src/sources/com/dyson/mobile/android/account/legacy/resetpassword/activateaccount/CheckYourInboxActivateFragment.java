package com.dyson.mobile.android.account.legacy.resetpassword.activateaccount;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import gm1.am;
import h12.m;
import h12.t;
import kotlin.Metadata;
import q8.g;
import qh.j;
import qh.j0;
import th.u;
import x1.i;
import x12.p0;
import x12.r;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/activateaccount/CheckYourInboxActivateFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class CheckYourInboxActivateFragment extends Fragment {
    public ii.b e;
    public final t d = m.b(new ia0.a(this, 7));

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12222f = new d0(p0.f86717a.b(ki.a.class), new b(this), new d(this), new c(null, this));

    /* renamed from: g  reason: collision with root package name */
    public final a f12223g = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/resetpassword/activateaccount/CheckYourInboxActivateFragment$a", "Lhi/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements hi.a {
        public a() {
        }

        @Override // hi.a
        public final void a(boolean z13) {
            ((ki.a) CheckYourInboxActivateFragment.this.f12222f.getValue()).d.m(z13);
        }

        @Override // hi.a
        public final void b() {
            CheckYourInboxActivateFragment.this.requireActivity().finish();
        }

        @Override // hi.a
        public final void c(String str, String str2) {
            new e(CheckYourInboxActivateFragment.this.requireContext()).b(str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12225f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12225f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12226f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12227g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12226f = aVar;
            this.f12227g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12226f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12227g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12228f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12228f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12228f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(requireContext()).d;
        u uVar = bVar.f76151b;
        j jVar = bVar.f76163p.get();
        tj.a aVar = bVar.d.get();
        pf0.c cVar = bVar.f76165r.get();
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        jVar.getClass();
        aVar.getClass();
        cVar.getClass();
        eVar.getClass();
        this.e = new ii.b(jVar, aVar, cVar, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        rh.m mVar = (rh.m) g.c(layoutInflater, R.layout.fragment_check_your_inbox_activate, viewGroup, false, null);
        ii.b s13 = s();
        s13.f38303g.setValue(s13, hi.b.f38301i[0], this.f12223g);
        s().f38304h = ((com.dyson.mobile.android.account.legacy.resetpassword.activateaccount.c) this.d.getValue()).f12234a;
        mVar.l(s());
        am.B(this, s().f41682k);
        View root = mVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getLifecycle().c(s());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getLifecycle().a(s());
    }

    public final ii.b s() {
        ii.b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        r.i("viewModel");
        throw null;
    }
}
