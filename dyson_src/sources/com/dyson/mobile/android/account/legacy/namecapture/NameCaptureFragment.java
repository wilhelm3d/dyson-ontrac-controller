package com.dyson.mobile.android.account.legacy.namecapture;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import cc0.z;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.account.legacy.namecapture.b;
import gm1.am;
import h12.m;
import h12.t;
import java.util.Locale;
import kotlin.Metadata;
import q8.g;
import qh.j0;
import rf0.i0;
import rh.y;
import th.u;
import x1.i;
import x12.p0;
import x12.r;
import y9.m0;
import zf1.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/namecapture/NameCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class NameCaptureFragment extends Fragment {
    public di.b e;
    public final t d = m.b(new z(this, 13));

    /* renamed from: f  reason: collision with root package name */
    public final d0 f12160f = new d0(p0.f86717a.b(qh.b.class), new b(this), new d(this), new c(null, this));

    /* renamed from: g  reason: collision with root package name */
    public final a f12161g = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/namecapture/NameCaptureFragment$a", "Ldi/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements di.a {
        public a() {
        }

        @Override // di.a
        public final void a() {
            com.dyson.mobile.android.account.legacy.namecapture.b.f12169a.getClass();
            d(new y9.a(R.id.actionNext));
        }

        @Override // di.a
        public final void b() {
            com.dyson.mobile.android.account.legacy.namecapture.b.f12169a.getClass();
            d(new y9.a(R.id.actionNext));
        }

        @Override // di.a
        public final void c() {
            com.dyson.mobile.android.account.legacy.namecapture.b.f12169a.getClass();
            d(new b.a(true));
        }

        public final void d(m0 m0Var) {
            NameCaptureFragment nameCaptureFragment = NameCaptureFragment.this;
            e requireActivity = nameCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            androidx.navigation.fragment.a.a(nameCaptureFragment).i(m0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12163f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12163f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12163f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12164f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12165g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12164f = aVar;
            this.f12165g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12164f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12165g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12166f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12166f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12166f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(requireContext()).d;
        u uVar = bVar.f76151b;
        pf0.c cVar = bVar.f76165r.get();
        tj.a aVar = bVar.d.get();
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        cVar.getClass();
        aVar.getClass();
        eVar.getClass();
        this.e = new di.b(cVar, aVar, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        s().f23728m = ((com.dyson.mobile.android.account.legacy.namecapture.a) this.d.getValue()).f12168a;
        s().f23722g = (qh.b) this.f12160f.getValue();
        y yVar = (y) g.c(layoutInflater, R.layout.fragment_name_capture, viewGroup, false, null);
        yVar.l(s());
        di.b s13 = s();
        s13.f23723h.setValue(s13, di.b.f23720p[0], this.f12161g);
        di.b s14 = s();
        if (s14.f23728m) {
            pf0.c cVar = s14.d;
            s14.f23724i = cVar.d(i0.f71727l1);
            s14.f23725j = cVar.d(i0.f71711k1);
            qh.b a13 = s14.a();
            c.a aVar = a13.f66837k;
            e22.m<?>[] mVarArr = qh.b.f66831p;
            s14.c((String) aVar.getValue(a13, mVarArr[6]));
            qh.b a14 = s14.a();
            s14.d((String) a14.f66836j.getValue(a14, mVarArr[5]));
        } else if (s14.e.e(Locale.JAPAN.getCountry())) {
            s14.c(s14.a().getLastName());
            s14.d(s14.a().getFirstName());
        } else {
            s14.c(s14.a().getFirstName());
            s14.d(s14.a().getLastName());
        }
        View root = yVar.getRoot();
        root.getClass();
        am.B(this, s().f23726k);
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

    public final di.b s() {
        di.b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        r.i("viewModel");
        throw null;
    }
}
