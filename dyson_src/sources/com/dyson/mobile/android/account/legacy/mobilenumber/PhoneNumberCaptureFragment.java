package com.dyson.mobile.android.account.legacy.mobilenumber;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import ci.d;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.account.legacy.mobilenumber.a;
import com.dyson.mobile.android.resources.view.edittext.ThemedDysonEditText;
import e22.m;
import gm1.am;
import java.util.Locale;
import kotlin.Metadata;
import q8.g;
import qh.j;
import qh.j0;
import qh.x;
import rf0.i0;
import rh.g0;
import th.u;
import v32.l;
import v32.w;
import v32.y;
import x1.i;
import x12.p0;
import x12.r;
import x12.t;
import y9.c0;
import zf1.c;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/mobilenumber/PhoneNumberCaptureFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FunctionCallWithoutNamedArguments"})
/* loaded from: classes2.dex */
public final class PhoneNumberCaptureFragment extends Fragment {
    public ci.d d;
    public final d0 e = new d0(p0.f86717a.b(qh.b.class), new b(this), new d(this), new c(null, this));

    /* renamed from: f  reason: collision with root package name */
    public final a f12152f = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/mobilenumber/PhoneNumberCaptureFragment$a", "Lci/c;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements ci.c {
        public a() {
        }

        @Override // ci.c
        public final void a(String str, String str2, String str3) {
            e.a a13 = new e(PhoneNumberCaptureFragment.this.getActivity()).a();
            a13.f93107a = str;
            a13.f93108b = str2;
            a13.c(str3, null);
            a13.d();
        }

        @Override // ci.c
        public final void b() {
            PhoneNumberCaptureFragment phoneNumberCaptureFragment = PhoneNumberCaptureFragment.this;
            d.a aVar = new d.a(phoneNumberCaptureFragment.requireActivity(), R.style.AlertDialogLightStyle);
            AlertController.b bVar = aVar.f1831a;
            bVar.d = bVar.f1797a.getText(R.string.developer_mode_dialog_title);
            bVar.f1800f = bVar.f1797a.getText(R.string.developer_mode_dialog_description);
            bVar.f1807m = false;
            rh.e eVar = (rh.e) g.c(LayoutInflater.from(phoneNumberCaptureFragment.requireActivity()), R.layout.dialog_developer_mode, null, false, null);
            eVar.l(phoneNumberCaptureFragment.s());
            d.a view = aVar.setView(eVar.getRoot());
            String string = phoneNumberCaptureFragment.getString(R.string.developer_mode_dialog_continue);
            ci.a aVar2 = new ci.a(phoneNumberCaptureFragment, 0);
            AlertController.b bVar2 = view.f1831a;
            bVar2.f1801g = string;
            bVar2.f1802h = aVar2;
            view.setNegativeButton(17039360, null).create().show();
        }

        @Override // ci.c
        public final void c(String str) {
            str.getClass();
            PhoneNumberCaptureFragment phoneNumberCaptureFragment = PhoneNumberCaptureFragment.this;
            androidx.fragment.app.e requireActivity = phoneNumberCaptureFragment.requireActivity();
            requireActivity.getClass();
            cd.b.B(requireActivity);
            c0 a13 = androidx.navigation.fragment.a.a(phoneNumberCaptureFragment);
            com.dyson.mobile.android.account.legacy.mobilenumber.a.f12158a.getClass();
            a13.i(new a.C0326a(str));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12154f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f12154f = fragment;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return i.b(this.f12154f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12155f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Fragment f12156g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, Fragment fragment) {
            super(0);
            this.f12155f = aVar;
            this.f12156g = fragment;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12155f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? i.c(this.f12156g) : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f12157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f12157f = fragment;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return i.a(this.f12157f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        sh.b bVar = j0.c(requireContext()).d;
        u uVar = bVar.f76151b;
        j jVar = bVar.f76163p.get();
        x xVar = bVar.f76161n.get();
        pf0.c cVar = bVar.f76165r.get();
        bf1.c cVar2 = bVar.f76160m.get();
        hj.e eVar = bVar.e.get();
        uVar.getClass();
        jVar.getClass();
        xVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        this.d = new ci.d(jVar, xVar, cVar, cVar2, eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String d13;
        layoutInflater.getClass();
        ci.d s13 = s();
        qh.b bVar = (qh.b) this.e.getValue();
        s13.f11214i = bVar;
        c.a aVar = bVar.f66840n;
        m<?>[] mVarArr = qh.b.f66831p;
        if (w.q((String) aVar.getValue(bVar, mVarArr[9]), "+86", false)) {
            String formatNumber = PhoneNumberUtils.formatNumber((String) aVar.getValue(bVar, mVarArr[9]), Locale.CHINA.getCountry());
            if (formatNumber == null) {
                formatNumber = "";
            }
            String obj = y.U(w.o(formatNumber, String.valueOf(s13.f11220o.d), "")).toString();
            obj.getClass();
            s13.f11223r = obj;
            s13.f11217l.m(new l("^\\d{11}$").e(new l("[^0-9]").f(obj, "")));
        }
        ci.d s14 = s();
        s14.f11213h.setValue(s14, ci.d.f11210t[0], this.f12152f);
        ci.d s15 = s();
        pf0.c cVar = s15.f11211f;
        qh.b bVar2 = s15.f11214i;
        if (bVar2 == null) {
            r.i("accountDataViewModel");
            throw null;
        }
        int i13 = d.b.f11225a[bVar2.T().ordinal()];
        if (i13 == 1) {
            d13 = cVar.d(i0.f71804q0);
        } else if (i13 != 2) {
            ma.e.o();
            return null;
        } else {
            d13 = cVar.d(i0.f71850t0);
        }
        am.B(this, d13);
        getLifecycle().a(s());
        int i14 = g0.f73111k;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        g0 g0Var = (g0) q8.t.inflateInternal(layoutInflater, R.layout.fragment_phone_number_capture, viewGroup, false, null);
        g0Var.l(s());
        ThemedDysonEditText themedDysonEditText = g0Var.f73112f;
        ci.d dVar = g0Var.f73116j;
        themedDysonEditText.getEditText().addTextChangedListener(new PhoneNumberFormattingTextWatcher(dVar != null ? dVar.f11222q : null));
        View root = g0Var.getRoot();
        root.getClass();
        return root;
    }

    public final ci.d s() {
        ci.d dVar = this.d;
        if (dVar != null) {
            return dVar;
        }
        r.i("viewModel");
        throw null;
    }
}
