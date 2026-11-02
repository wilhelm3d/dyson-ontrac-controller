package com.dyson.mobile.android.account.legacy.accountcreated;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import f.q;
import kotlin.Metadata;
import mb.d;
import q8.g;
import qh.j0;
import rh.i;
import th.u;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/accountcreated/AccountCreatedFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class AccountCreatedFragment extends Fragment {
    public wh.b d;
    public final a e = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/accountcreated/AccountCreatedFragment$a", "Lwh/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements wh.a {
        public a() {
        }

        @Override // wh.a
        public final void a() {
            AccountCreatedFragment accountCreatedFragment = AccountCreatedFragment.this;
            j0 c13 = j0.c(accountCreatedFragment.requireContext());
            e requireActivity = accountCreatedFragment.requireActivity();
            c13.getClass();
            requireActivity.finish();
            j0.a aVar = c13.e.get();
            if (aVar != null) {
                aVar.c(requireActivity);
            } else {
                Logger.b("ConnectAccountListener has not been initialised.", null);
            }
        }

        @Override // wh.a
        public final void b() {
            AccountCreatedFragment accountCreatedFragment = AccountCreatedFragment.this;
            j0 c13 = j0.c(accountCreatedFragment.requireContext());
            e requireActivity = accountCreatedFragment.requireActivity();
            c13.getClass();
            requireActivity.finish();
            j0.a aVar = c13.e.get();
            if (aVar != null) {
                aVar.b(requireActivity);
            } else {
                Logger.b("ConnectAccountListener has not been initialised.", null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/accountcreated/AccountCreatedFragment$b", "Lf/q;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends q {
        public b() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            AccountCreatedFragment.this.e.a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(requireContext()).d;
        u uVar = bVar.f76151b;
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        eVar.getClass();
        this.d = new wh.b(eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        wh.b bVar = this.d;
        if (bVar == null) {
            r.i("viewModel");
            throw null;
        }
        bVar.e.setValue(bVar, wh.b.f85784f[0], this.e);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.a(viewLifecycleOwner, new b());
        i iVar = (i) g.c(layoutInflater, R.layout.fragment_account_created, viewGroup, false, null);
        wh.b bVar2 = this.d;
        if (bVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        iVar.l(bVar2);
        d a13 = d.a(requireContext(), R.drawable.animated_circle_tick);
        iVar.f73128i.setImageDrawable(a13);
        a13.start();
        View root = iVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Lifecycle lifecycle = getLifecycle();
        wh.b bVar = this.d;
        if (bVar != null) {
            lifecycle.c(bVar);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Lifecycle lifecycle = getLifecycle();
        wh.b bVar = this.d;
        if (bVar != null) {
            lifecycle.a(bVar);
        } else {
            r.i("viewModel");
            throw null;
        }
    }
}
