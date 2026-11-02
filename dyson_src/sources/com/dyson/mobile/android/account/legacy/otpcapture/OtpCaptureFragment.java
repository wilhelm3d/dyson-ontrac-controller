package com.dyson.mobile.android.account.legacy.otpcapture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import cc0.z;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.edittext.DysonPinEditText;
import ei.c;
import fm1.o0;
import gm1.am;
import h12.m;
import h12.t;
import kotlin.Metadata;
import q8.g;
import qh.j;
import qh.j0;
import qh.x;
import rf0.i0;
import rh.a0;
import th.u;
import x1.i;
import x12.p0;
import x12.r;
import y9.c0;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/otpcapture/OtpCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class OtpCaptureFragment extends Fragment {
    public ei.c e;

    /* renamed from: g  reason: collision with root package name */
    public a0 f12173g;
    public final t d = m.b(new z(this, 27));

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12172f = new d0(p0.f86717a.b(qh.b.class), new b(this), new d(this), new c(null, this));

    /* renamed from: h  reason: collision with root package name */
    public final a f12174h = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/otpcapture/OtpCaptureFragment$a", "Lei/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements ei.a {
        public a() {
        }

        @Override // ei.a
        public final void a(String str, String str2, String str3) {
            e.a a13 = new e(OtpCaptureFragment.this.getActivity()).a();
            a13.f93107a = str;
            a13.f93108b = str2;
            a13.c(str3, null);
            a13.d();
        }

        @Override // ei.a
        public final void b() {
            OtpCaptureFragment otpCaptureFragment = OtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = otpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            j0.c(otpCaptureFragment.getContext()).d(otpCaptureFragment.getActivity());
        }

        @Override // ei.a
        public final void c(String str, String str2, String str3, String str4) {
            OtpCaptureFragment otpCaptureFragment = OtpCaptureFragment.this;
            e.a a13 = new e(otpCaptureFragment.requireContext()).a();
            a13.f93107a = str;
            a13.f93108b = str2;
            a13.b(str3, null);
            a13.c(str4, new a20.a(otpCaptureFragment, 5));
            a13.d();
        }

        @Override // ei.a
        public final void d(String str, String str2, String str3) {
            e.a a13 = new e(OtpCaptureFragment.this.requireContext()).a();
            a13.f93107a = str;
            a13.f93108b = str2;
            a13.c(str3, null);
            a13.d();
        }

        @Override // ei.a
        public final void e() {
            OtpCaptureFragment otpCaptureFragment = OtpCaptureFragment.this;
            androidx.fragment.app.e requireActivity = otpCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            c0 a13 = androidx.navigation.fragment.a.a(otpCaptureFragment);
            com.dyson.mobile.android.account.legacy.otpcapture.b.f12182a.getClass();
            a13.i(new y9.a(R.id.actionNext));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12176f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12176f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12176f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12177f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12178g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12177f = aVar;
            this.f12178g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12177f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12178g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12179f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12179f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12179f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(getActivity()).d;
        bVar.f76165r.get();
        u uVar = bVar.f76151b;
        j jVar = bVar.f76163p.get();
        x xVar = bVar.f76161n.get();
        pf0.c cVar = bVar.f76165r.get();
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        jVar.getClass();
        xVar.getClass();
        cVar.getClass();
        eVar.getClass();
        this.e = new ei.c(jVar, xVar, cVar, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String d13;
        layoutInflater.getClass();
        ei.c cVar = this.e;
        if (cVar == null) {
            r.i("viewModel");
            throw null;
        }
        cVar.f26913j.setValue(cVar, ei.c.f26908v[0], this.f12174h);
        cVar.f26911h = (qh.b) this.f12172f.getValue();
        cVar.f26912i = ((com.dyson.mobile.android.account.legacy.otpcapture.a) this.d.getValue()).f12181a;
        pf0.c cVar2 = cVar.f26909f;
        qh.b bVar = cVar.f26911h;
        if (bVar == null) {
            r.i("accountDataViewModel");
            throw null;
        }
        int i13 = c.a.f26925a[bVar.T().ordinal()];
        if (i13 == 1) {
            d13 = cVar2.d(i0.f71804q0);
        } else if (i13 != 2) {
            ma.e.o();
            return null;
        } else {
            d13 = cVar2.d(i0.f71850t0);
        }
        am.B(this, d13);
        Lifecycle lifecycle = getLifecycle();
        ei.c cVar3 = this.e;
        if (cVar3 == null) {
            r.i("viewModel");
            throw null;
        }
        lifecycle.a(cVar3);
        int i14 = a0.f73048p;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        a0 a0Var = (a0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_otp_capture, viewGroup, false, null);
        a0Var.getClass();
        ei.c cVar4 = this.e;
        if (cVar4 == null) {
            r.i("viewModel");
            throw null;
        }
        a0Var.l(cVar4);
        this.f12173g = a0Var;
        View root = a0Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a0 a0Var = this.f12173g;
        if (a0Var == null) {
            r.i("binding");
            throw null;
        }
        DysonPinEditText dysonPinEditText = a0Var.f73057n;
        dysonPinEditText.getClass();
        o0.x(dysonPinEditText);
    }
}
