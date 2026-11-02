package com.dyson.mobile.android.account.legacy.passwordandotpcapture;

import a20.h;
import android.annotation.SuppressLint;
import android.content.Context;
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
import com.dyson.mobile.android.account.legacy.passwordandotpcapture.a;
import com.dyson.mobile.android.account.legacy.resetpassword.host.PasswordResetType;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import ew0.k;
import gm1.am;
import h12.m;
import h12.t;
import kotlin.Metadata;
import qh.j;
import qh.j0;
import qh.x;
import th.u;
import x1.i;
import x12.p0;
import x12.q0;
import x12.r;
import y9.c0;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/passwordandotpcapture/PasswordAndOtpCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class PasswordAndOtpCaptureFragment extends Fragment {
    public fi.f d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12183f;

    /* renamed from: g  reason: collision with root package name */
    public final t f12184g;

    /* renamed from: h  reason: collision with root package name */
    public final a f12185h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/passwordandotpcapture/PasswordAndOtpCaptureFragment$a", "Lfi/b;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements fi.b {
        public a() {
        }

        @Override // fi.b
        public final void a(boolean z13) {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            ((bi.b) passwordAndOtpCaptureFragment.e.getValue()).e.m(z13);
        }

        @Override // fi.b
        public final void b(ExternalLinkTracking externalLinkTracking) {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            j0.c(passwordAndOtpCaptureFragment.requireContext()).e(passwordAndOtpCaptureFragment.requireActivity(), externalLinkTracking);
        }

        @Override // fi.b
        public final void c() {
            c0 a13 = androidx.navigation.fragment.a.a(PasswordAndOtpCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.passwordandotpcapture.a.f12195a.getClass();
            a13.i(new y9.a(R.id.actionRestart));
        }

        @Override // fi.b
        public final void d() {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            c0 a13 = androidx.navigation.fragment.a.a(passwordAndOtpCaptureFragment);
            a.b bVar = com.dyson.mobile.android.account.legacy.passwordandotpcapture.a.f12195a;
            String S = ((qh.b) passwordAndOtpCaptureFragment.f12183f.getValue()).S();
            PasswordResetType passwordResetType = PasswordResetType.FORGOTTEN_PASSWORD;
            bVar.getClass();
            S.getClass();
            passwordResetType.getClass();
            a13.i(new a.C0330a(S, passwordResetType));
        }

        @Override // fi.b
        public final void e() {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            j0 c13 = j0.c(passwordAndOtpCaptureFragment.getContext());
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            c13.getClass();
            requireActivity.finish();
        }

        @Override // fi.b
        public final void f() {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            j0.c(passwordAndOtpCaptureFragment.requireContext()).d(passwordAndOtpCaptureFragment.requireActivity());
        }

        @Override // fi.b
        public final void g(String str, String str2, fi.e eVar) {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            ((zs0.e) passwordAndOtpCaptureFragment.f12184g.getValue()).c(str, str2, false, eVar != null ? new fi.a(eVar, 0) : null);
        }

        @Override // fi.b
        public final void h(String str, String str2, String str3, String str4, fi.e eVar) {
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            e.a a13 = ((zs0.e) passwordAndOtpCaptureFragment.f12184g.getValue()).a();
            a13.f93110f = true;
            a13.f93107a = str;
            a13.f93108b = str2;
            a13.c(str3, new a20.a(eVar, 9));
            a13.b(str4, null);
            a13.d();
        }

        @Override // fi.b
        public final void i() {
            c0 a13 = androidx.navigation.fragment.a.a(PasswordAndOtpCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.passwordandotpcapture.a.f12195a.getClass();
            a13.i(new y9.a(R.id.actionRestartSignIn));
        }

        @Override // fi.b
        public final void j(String str, fi.e eVar, fi.e eVar2) {
            str.getClass();
            PasswordAndOtpCaptureFragment passwordAndOtpCaptureFragment = PasswordAndOtpCaptureFragment.this;
            j0 c13 = j0.c(passwordAndOtpCaptureFragment.getContext());
            androidx.fragment.app.e requireActivity = passwordAndOtpCaptureFragment.requireActivity();
            h hVar = new h(eVar, 25);
            h hVar2 = new h(eVar2, 26);
            c13.getClass();
            j0.f(requireActivity, str, hVar, hVar2);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12187f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12187f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12187f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12188f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12189g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12188f = aVar;
            this.f12189g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12188f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12189g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12190f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12190f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12191f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f12191f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12191f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12192f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12193g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12192f = aVar;
            this.f12193g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12192f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12193g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12194f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f12194f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12194f);
        }
    }

    public PasswordAndOtpCaptureFragment() {
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(bi.b.class), new b(this), new d(this), new c(null, this));
        this.f12183f = new d0(q0Var.b(qh.b.class), new e(this), new g(this), new f(null, this));
        this.f12184g = m.b(new k(this, 10));
        this.f12185h = new a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(getActivity()).d;
        u uVar = bVar.f76151b;
        j jVar = bVar.f76163p.get();
        tj.a aVar = bVar.d.get();
        pf0.c cVar = bVar.f76165r.get();
        x xVar = bVar.f76161n.get();
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        jVar.getClass();
        aVar.getClass();
        cVar.getClass();
        xVar.getClass();
        eVar.getClass();
        this.d = new fi.f(jVar, aVar, cVar, xVar, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        getViewLifecycleOwner().getLifecycle().a(s());
        int i13 = rh.c0.f73068r;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        rh.c0 c0Var = (rh.c0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_password_and_otp_capture, viewGroup, false, null);
        c0Var.l(s());
        fi.f s13 = s();
        s13.f31618j.setValue(s13, fi.f.f31613w[0], this.f12185h);
        s().f31617i = (qh.b) this.f12183f.getValue();
        am.B(this, s().f31619k);
        View root = c0Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getViewLifecycleOwner().getLifecycle().c(s());
    }

    public final fi.f s() {
        fi.f fVar = this.d;
        if (fVar != null) {
            return fVar;
        }
        r.i("viewModel");
        throw null;
    }
}
