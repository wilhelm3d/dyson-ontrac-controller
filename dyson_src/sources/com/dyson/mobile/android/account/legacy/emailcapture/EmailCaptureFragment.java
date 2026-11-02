package com.dyson.mobile.android.account.legacy.emailcapture;

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
import com.dyson.mobile.android.account.legacy.emailcapture.a;
import com.dyson.mobile.android.account.legacy.resetpassword.host.PasswordResetType;
import gm1.am;
import h12.m;
import h12.t;
import kotlin.Metadata;
import qh.j;
import qh.j0;
import qh.m0;
import rf0.i0;
import rh.s;
import th.u;
import x1.i;
import x12.p0;
import x12.q0;
import x12.r;
import y9.c0;
import zh.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/emailcapture/EmailCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class EmailCaptureFragment extends Fragment {
    public zh.c d;
    public final d0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12118f;

    /* renamed from: g  reason: collision with root package name */
    public final t f12119g;

    /* renamed from: h  reason: collision with root package name */
    public final a f12120h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/emailcapture/EmailCaptureFragment$a", "Lzh/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements zh.a {
        public a() {
        }

        @Override // zh.a
        public final void a(boolean z13) {
            EmailCaptureFragment emailCaptureFragment = EmailCaptureFragment.this;
            androidx.fragment.app.e requireActivity = emailCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            ((bi.b) emailCaptureFragment.e.getValue()).e.m(z13);
        }

        @Override // zh.a
        public final void b(String str, String str2) {
            EmailCaptureFragment emailCaptureFragment = EmailCaptureFragment.this;
            androidx.fragment.app.e requireActivity = emailCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            ((zs0.e) emailCaptureFragment.f12119g.getValue()).b(str, str2);
        }

        @Override // zh.a
        public final void c() {
            c0 a13 = androidx.navigation.fragment.a.a(EmailCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a.getClass();
            a13.i(new y9.a(R.id.actionRestart));
        }

        @Override // zh.a
        public final void d(String str, zh.b bVar, zh.b bVar2) {
            str.getClass();
            EmailCaptureFragment emailCaptureFragment = EmailCaptureFragment.this;
            j0 c13 = j0.c(emailCaptureFragment.getContext());
            androidx.fragment.app.e requireActivity = emailCaptureFragment.requireActivity();
            yx0.c cVar = new yx0.c(bVar, 2);
            yx0.c cVar2 = new yx0.c(bVar2, 3);
            c13.getClass();
            j0.f(requireActivity, str, cVar, cVar2);
        }

        @Override // zh.a
        public final void e() {
            EmailCaptureFragment emailCaptureFragment = EmailCaptureFragment.this;
            j0 c13 = j0.c(emailCaptureFragment.getContext());
            androidx.fragment.app.e activity = emailCaptureFragment.getActivity();
            c13.getClass();
            activity.finish();
        }

        @Override // zh.a
        public final void f() {
            c0 a13 = androidx.navigation.fragment.a.a(EmailCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a.getClass();
            a13.i(new y9.a(R.id.actionNextNewUser));
        }

        @Override // zh.a
        public final void g() {
            c0 a13 = androidx.navigation.fragment.a.a(EmailCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a.getClass();
            a13.i(new y9.a(R.id.actionNextExistingUser));
        }

        @Override // zh.a
        public final void h() {
            c0 a13 = androidx.navigation.fragment.a.a(EmailCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a.getClass();
            a13.i(new y9.a(R.id.actionNextNewUserEmailRecognised));
        }

        @Override // zh.a
        public final void i() {
            c0 a13 = androidx.navigation.fragment.a.a(EmailCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a.getClass();
            a13.i(new y9.a(R.id.actionNextExistingUserEmailNotRecognised));
        }

        @Override // zh.a
        public final void j() {
            c0 a13 = androidx.navigation.fragment.a.a(EmailCaptureFragment.this);
            com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a.getClass();
            a13.i(new y9.a(R.id.actionNextExistingUser2FA));
        }

        @Override // zh.a
        public final void k() {
            EmailCaptureFragment emailCaptureFragment = EmailCaptureFragment.this;
            c0 a13 = androidx.navigation.fragment.a.a(emailCaptureFragment);
            a.b bVar = com.dyson.mobile.android.account.legacy.emailcapture.a.f12130a;
            String S = ((qh.b) emailCaptureFragment.f12118f.getValue()).S();
            PasswordResetType passwordResetType = PasswordResetType.ACTIVATE_ACCOUNT;
            bVar.getClass();
            S.getClass();
            passwordResetType.getClass();
            a13.i(new a.C0324a(S, passwordResetType));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12122f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12122f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12122f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12123f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12124g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12123f = aVar;
            this.f12124g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12123f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12124g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12125f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12125f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12125f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12126f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f12126f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12126f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12127f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12128g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12127f = aVar;
            this.f12128g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12127f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12128g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f12129f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12129f);
        }
    }

    public EmailCaptureFragment() {
        q0 q0Var = p0.f86717a;
        this.e = new d0(q0Var.b(bi.b.class), new b(this), new d(this), new c(null, this));
        this.f12118f = new d0(q0Var.b(qh.b.class), new e(this), new g(this), new f(null, this));
        this.f12119g = m.b(new z41.a(this, 4));
        this.f12120h = new a();
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
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        jVar.getClass();
        aVar.getClass();
        cVar.getClass();
        eVar.getClass();
        this.d = new zh.c(jVar, aVar, cVar, eVar);
        zh.c s13 = s();
        qh.b bVar2 = (qh.b) this.f12118f.getValue();
        s13.f92695h = bVar2;
        String S = bVar2.S();
        S.getClass();
        s13.f92700m = S;
        s13.f92698k.m(m0.a(S));
        s13.f92699l.m(null);
        zh.c s14 = s();
        s14.f92697j.setValue(s14, zh.c.f92692n[0], this.f12120h);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        getViewLifecycleOwner().getLifecycle().a(s());
        int i13 = s.f73180j;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        s sVar = (s) q8.t.inflateInternal(layoutInflater, R.layout.fragment_email_capture, viewGroup, false, null);
        sVar.l(s());
        zh.c s13 = s();
        qh.b bVar = s13.f92695h;
        if (bVar == null) {
            r.i("accountDataViewModel");
            throw null;
        }
        int i14 = c.b.f92701a[bVar.T().ordinal()];
        pf0.c cVar = s13.f92693f;
        am.B(this, i14 == 1 ? cVar.d(i0.f71850t0) : cVar.d(i0.f71804q0));
        View root = sVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getViewLifecycleOwner().getLifecycle().c(s());
    }

    public final zh.c s() {
        zh.c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        r.i("viewModel");
        throw null;
    }
}
