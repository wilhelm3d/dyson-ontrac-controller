package com.dyson.mobile.android.account.legacy.emailnotrecognised;

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
import hj.e;
import kotlin.Metadata;
import q8.g;
import qh.i0;
import qh.j0;
import th.u;
import x1.i;
import x12.p0;
import x12.r;
import x12.t;
import y9.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/emailnotrecognised/EmailNotRecognisedFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class EmailNotRecognisedFragment extends Fragment {
    public ai.b d;
    public final d0 e = new d0(p0.f86717a.b(qh.b.class), new b(this), new d(this), new c(null, this));

    /* renamed from: f  reason: collision with root package name */
    public final a f12134f = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/emailnotrecognised/EmailNotRecognisedFragment$a", "Lai/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements ai.a {
        public a() {
        }

        @Override // ai.a
        public final void a() {
            EmailNotRecognisedFragment emailNotRecognisedFragment = EmailNotRecognisedFragment.this;
            qh.b bVar = emailNotRecognisedFragment.s().e;
            if (bVar == null) {
                r.i("accountDataViewModel");
                throw null;
            }
            bVar.U(i0.NEW_USER);
            c0 a13 = androidx.navigation.fragment.a.a(emailNotRecognisedFragment);
            com.dyson.mobile.android.account.legacy.emailnotrecognised.a.f12140a.getClass();
            a13.i(new y9.a(R.id.actionNextNewUser));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12136f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12136f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12136f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12137f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12138g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12137f = aVar;
            this.f12138g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12137f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12138g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12139f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12139f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12139f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(requireContext()).d;
        u uVar = bVar.f76151b;
        tj.a aVar = bVar.d.get();
        pf0.c cVar = bVar.f76165r.get();
        e eVar = bVar.e.get();
        uVar.getClass();
        aVar.getClass();
        cVar.getClass();
        eVar.getClass();
        this.d = new ai.b(aVar, cVar, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreate(bundle);
        rh.u uVar = (rh.u) g.c(layoutInflater, R.layout.fragment_email_not_recognised, viewGroup, false, null);
        uVar.l(s());
        ai.b s13 = s();
        s13.f1244f.setValue(s13, ai.b.f1243h[0], this.f12134f);
        s().e = (qh.b) this.e.getValue();
        View root = uVar.getRoot();
        root.getClass();
        am.B(this, s().f1245g);
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

    public final ai.b s() {
        ai.b bVar = this.d;
        if (bVar != null) {
            return bVar;
        }
        r.i("viewModel");
        throw null;
    }
}
