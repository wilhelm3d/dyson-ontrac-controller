package com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.brightcove.player.Constants;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.CameraPermissionSettingsFragment;
import com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a;
import com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c;
import com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.LaunchState;
import h12.f0;
import h12.h;
import h12.l;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m9.w;
import nj.t2;
import x12.m;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import y9.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/camerapermissionsettings/CameraPermissionSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraPermissionSettingsFragment extends Fragment {
    public final d0 d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends p implements Function1<c.a, f0> {
        public a(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/connectionjourney/nonconnected/camerapermissionsettings/CameraPermissionSettingsViewModel$CameraPermissionSettingsEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(c.a aVar) {
            c.a aVar2 = aVar;
            aVar2.getClass();
            ((com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c) this.receiver).S(aVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements m9.p, m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof m9.p) && (obj instanceof m)) {
                return r.c(d(), ((m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13603f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f13603f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13603f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13604f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar) {
            super(0);
            this.f13604f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13604f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13605f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar) {
            super(0);
            this.f13605f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13605f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13606f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13607g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, l lVar) {
            super(0);
            this.f13606f = aVar;
            this.f13607g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13606f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13607g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13608f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13609g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment, l lVar) {
            super(0);
            this.f13608f = fragment;
            this.f13609g = lVar;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            w wVar = (w) this.f13609g.getValue();
            androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
            return (gVar == null || (defaultViewModelProviderFactory = gVar.getDefaultViewModelProviderFactory()) == null) ? this.f13608f.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CameraPermissionSettingsFragment() {
        l a13 = h12.m.a(n.NONE, new d(new c(this)));
        this.d = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c.class), new e(a13), new g(this, a13), new f(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(-1749625998, true, new c30.a(this, 0)));
        d0 d0Var = this.d;
        ((com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c) d0Var.getValue()).d.observe(getViewLifecycleOwner(), new b(new Function1(this) { // from class: c30.b
            public final /* synthetic */ CameraPermissionSettingsFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                CameraPermissionSettingsFragment cameraPermissionSettingsFragment = this.e;
                f0 f0Var = (f0) obj;
                switch (i13) {
                    case 0:
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", cameraPermissionSettingsFragment.requireContext().getPackageName(), null));
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.addFlags(268435456);
                        intent.addFlags(Constants.ENCODING_PCM_32BIT);
                        intent.addFlags(8388608);
                        cameraPermissionSettingsFragment.startActivity(intent);
                        return f0.f36844a;
                    case 1:
                        c0 a13 = androidx.navigation.fragment.a.a(cameraPermissionSettingsFragment);
                        a.b bVar = com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a.f13610a;
                        LaunchState launchState = LaunchState.ENTER_SN;
                        bVar.getClass();
                        launchState.getClass();
                        a13.i(new a.C0430a(launchState));
                        return f0.f36844a;
                    default:
                        c0 a14 = androidx.navigation.fragment.a.a(cameraPermissionSettingsFragment);
                        da.h hVar = a14.f89416b;
                        if (hVar.p(R.id.cameraPermissionSettingsFragment, true, false)) {
                            hVar.b();
                        }
                        com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a.f13610a.getClass();
                        a14.i(new y9.a(R.id.actionToScanSerialFragment));
                        return f0.f36844a;
                }
            }
        }));
        ((com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c) d0Var.getValue()).e.observe(getViewLifecycleOwner(), new b(new Function1(this) { // from class: c30.b
            public final /* synthetic */ CameraPermissionSettingsFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                CameraPermissionSettingsFragment cameraPermissionSettingsFragment = this.e;
                f0 f0Var = (f0) obj;
                switch (i13) {
                    case 0:
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", cameraPermissionSettingsFragment.requireContext().getPackageName(), null));
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.addFlags(268435456);
                        intent.addFlags(Constants.ENCODING_PCM_32BIT);
                        intent.addFlags(8388608);
                        cameraPermissionSettingsFragment.startActivity(intent);
                        return f0.f36844a;
                    case 1:
                        c0 a13 = androidx.navigation.fragment.a.a(cameraPermissionSettingsFragment);
                        a.b bVar = com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a.f13610a;
                        LaunchState launchState = LaunchState.ENTER_SN;
                        bVar.getClass();
                        launchState.getClass();
                        a13.i(new a.C0430a(launchState));
                        return f0.f36844a;
                    default:
                        c0 a14 = androidx.navigation.fragment.a.a(cameraPermissionSettingsFragment);
                        da.h hVar = a14.f89416b;
                        if (hVar.p(R.id.cameraPermissionSettingsFragment, true, false)) {
                            hVar.b();
                        }
                        com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a.f13610a.getClass();
                        a14.i(new y9.a(R.id.actionToScanSerialFragment));
                        return f0.f36844a;
                }
            }
        }));
        ((com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c) d0Var.getValue()).f13612f.observe(getViewLifecycleOwner(), new b(new Function1(this) { // from class: c30.b
            public final /* synthetic */ CameraPermissionSettingsFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                CameraPermissionSettingsFragment cameraPermissionSettingsFragment = this.e;
                f0 f0Var = (f0) obj;
                switch (i13) {
                    case 0:
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", cameraPermissionSettingsFragment.requireContext().getPackageName(), null));
                        intent.addCategory("android.intent.category.DEFAULT");
                        intent.addFlags(268435456);
                        intent.addFlags(Constants.ENCODING_PCM_32BIT);
                        intent.addFlags(8388608);
                        cameraPermissionSettingsFragment.startActivity(intent);
                        return f0.f36844a;
                    case 1:
                        c0 a13 = androidx.navigation.fragment.a.a(cameraPermissionSettingsFragment);
                        a.b bVar = com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a.f13610a;
                        LaunchState launchState = LaunchState.ENTER_SN;
                        bVar.getClass();
                        launchState.getClass();
                        a13.i(new a.C0430a(launchState));
                        return f0.f36844a;
                    default:
                        c0 a14 = androidx.navigation.fragment.a.a(cameraPermissionSettingsFragment);
                        da.h hVar = a14.f89416b;
                        if (hVar.p(R.id.cameraPermissionSettingsFragment, true, false)) {
                            hVar.b();
                        }
                        com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.a.f13610a.getClass();
                        a14.i(new y9.a(R.id.actionToScanSerialFragment));
                        return f0.f36844a;
                }
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (c7.a.a(requireContext(), "android.permission.CAMERA") == 0) {
            ((com.dyson.mobile.android.connectionjourney.nonconnected.camerapermissionsettings.c) this.d.getValue()).S(c.a.b.f13614a);
        }
        int i13 = t2.f57709a;
        y9.w.t("connection_journey.ocr.allow_access_to_camera", null, 2, null);
    }
}
