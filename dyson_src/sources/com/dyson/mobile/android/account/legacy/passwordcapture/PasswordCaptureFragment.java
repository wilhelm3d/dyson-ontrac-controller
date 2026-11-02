package com.dyson.mobile.android.account.legacy.passwordcapture;

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
import com.dyson.mobile.android.account.legacy.passwordcapture.a;
import com.dyson.mobile.android.account.legacy.resetpassword.host.PasswordResetType;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import ew0.k;
import gm1.am;
import h12.m;
import h12.t;
import kotlin.Metadata;
import qh.j;
import qh.j0;
import rh.e0;
import th.u;
import x1.i;
import x12.p0;
import x12.q0;
import x12.r;
import y9.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/passwordcapture/PasswordCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class PasswordCaptureFragment extends Fragment {
    public gi.c d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12199f;

    /* renamed from: g  reason: collision with root package name */
    public final t f12200g;

    /* renamed from: h  reason: collision with root package name */
    public final a f12201h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/passwordcapture/PasswordCaptureFragment$a", "Lgi/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements gi.a {
        public a() {
        }

        @Override // gi.a
        public final void a(boolean z13) {
            PasswordCaptureFragment passwordCaptureFragment = PasswordCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            ((bi.b) passwordCaptureFragment.e.getValue()).e.m(z13);
        }

        @Override // gi.a
        public final void b(ExternalLinkTracking externalLinkTracking) {
            PasswordCaptureFragment passwordCaptureFragment = PasswordCaptureFragment.this;
            j0.c(passwordCaptureFragment.requireContext()).e(passwordCaptureFragment.requireActivity(), externalLinkTracking);
        }

        @Override // gi.a
        public final void c(String str, String str2) {
            PasswordCaptureFragment passwordCaptureFragment = PasswordCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            ((zs0.e) passwordCaptureFragment.f12200g.getValue()).b(str, str2);
        }

        @Override // gi.a
        public final void d() {
            PasswordCaptureFragment passwordCaptureFragment = PasswordCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            c0 a13 = androidx.navigation.fragment.a.a(passwordCaptureFragment);
            a.b bVar = com.dyson.mobile.android.account.legacy.passwordcapture.a.f12211a;
            String S = ((qh.b) passwordCaptureFragment.f12199f.getValue()).S();
            PasswordResetType passwordResetType = PasswordResetType.FORGOTTEN_PASSWORD;
            bVar.getClass();
            S.getClass();
            passwordResetType.getClass();
            a13.i(new a.C0331a(S, passwordResetType));
        }

        @Override // gi.a
        public final void f() {
            PasswordCaptureFragment passwordCaptureFragment = PasswordCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            j0.c(passwordCaptureFragment.requireContext()).d(passwordCaptureFragment.requireActivity());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12203f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12203f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12203f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12204f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12205g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12204f = aVar;
            this.f12205g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12204f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12205g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12206f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12206f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12206f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12207f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f12207f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12207f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12208f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12209g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12208f = aVar;
            this.f12209g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12208f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12209g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12210f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f12210f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12210f);
        }
    }

    public PasswordCaptureFragment() {
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(bi.b.class), new b(this), new d(this), new c(null, this));
        this.f12199f = new d0(q0Var.b(qh.b.class), new e(this), new g(this), new f(null, this));
        this.f12200g = m.b(new k(this, 22));
        this.f12201h = new a();
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
        this.d = new gi.c(jVar, aVar, cVar, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        e0 e0Var = (e0) q8.g.c(layoutInflater, R.layout.fragment_password_capture, viewGroup, false, null);
        e0Var.l(s());
        gi.c s13 = s();
        s13.f34808l.setValue(s13, gi.c.f34801o[0], this.f12201h);
        s().f34804h = (qh.b) this.f12199f.getValue();
        am.B(this, s().f34809m);
        View root = e0Var.getRoot();
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

    public final gi.c s() {
        gi.c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        r.i("viewModel");
        throw null;
    }
}
