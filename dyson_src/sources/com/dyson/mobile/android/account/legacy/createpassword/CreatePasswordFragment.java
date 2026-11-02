package com.dyson.mobile.android.account.legacy.createpassword;

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
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import e71.n;
import h12.m;
import h12.t;
import kotlin.Metadata;
import q8.g;
import qh.j;
import qh.j0;
import rh.q;
import th.u;
import x1.i;
import x12.p0;
import x12.r;
import y9.c0;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/createpassword/CreatePasswordFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class CreatePasswordFragment extends Fragment {
    public CreatePasswordViewModel d;
    public final d0 e = new d0(p0.f86717a.b(qh.b.class), new b(this), new d(this), new c(null, this));

    /* renamed from: f  reason: collision with root package name */
    public final t f12097f = m.b(new wr.a(this, 24));

    /* renamed from: g  reason: collision with root package name */
    public final a f12098g = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/createpassword/CreatePasswordFragment$a", "Lyh/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements yh.a {
        public a() {
        }

        @Override // yh.a
        public final void a() {
            c0 a13 = androidx.navigation.fragment.a.a(CreatePasswordFragment.this);
            com.dyson.mobile.android.account.legacy.createpassword.a.f12117a.getClass();
            a13.i(new y9.a(R.id.actionNext));
        }

        @Override // yh.a
        public final void b(ExternalLinkTracking externalLinkTracking) {
            CreatePasswordFragment createPasswordFragment = CreatePasswordFragment.this;
            j0.c(createPasswordFragment.requireContext()).e(createPasswordFragment.requireActivity(), externalLinkTracking);
        }

        @Override // yh.a
        public final void c(String str, String str2) {
            str.getClass();
            str2.getClass();
            ((e) CreatePasswordFragment.this.f12097f.getValue()).b(str, str2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12100f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12100f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12100f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12101f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12102g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12101f = aVar;
            this.f12102g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12101f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12102g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12103f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12103f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12103f);
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
        bVar.f76150a.getClass();
        n.f26183r.getClass();
        n81.b bVar2 = n.a.a().f26190g;
        if (bVar2 == null) {
            r.i("marketInformationRepository");
            throw null;
        }
        uVar.getClass();
        jVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.d = new CreatePasswordViewModel(jVar, aVar, bVar2, cVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreate(bundle);
        q qVar = (q) g.c(layoutInflater, R.layout.fragment_create_password, viewGroup, false, null);
        qVar.l(s());
        CreatePasswordViewModel s13 = s();
        s13.f12106f.setValue(s13, CreatePasswordViewModel.f12104p[0], this.f12098g);
        s().f12114n = (qh.b) this.e.getValue();
        View root = qVar.getRoot();
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

    public final CreatePasswordViewModel s() {
        CreatePasswordViewModel createPasswordViewModel = this.d;
        if (createPasswordViewModel != null) {
            return createPasswordViewModel;
        }
        r.i("viewModel");
        throw null;
    }
}
