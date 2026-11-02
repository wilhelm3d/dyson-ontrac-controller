package com.dyson.mobile.android.robot.newsystem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bv0.f3;
import bv0.j2;
import c42.q1;
import c42.r1;
import com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneNdsActivity;
import com.dyson.mobile.android.machine.ui.settings.timezone.nds.a;
import com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.RobotDestination;
import gm0.c;
import hj.e;
import iu0.z;
import java.util.Stack;
import ji0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we1.a;
import z32.m1;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Lsm0/a$a;", "softwareUpdateState", "", "isDockCommissioningCompleted", "", "currentTimeZoneState", "Lt11/a;", "notificationType", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends Fragment {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f16243v = 0;
    public iu0.z d;
    public zf1.b e;

    /* renamed from: f  reason: collision with root package name */
    public a.c f16244f;

    /* renamed from: g  reason: collision with root package name */
    public com.dyson.mobile.android.machine.ui.settings.timezone.nds.a f16245g;

    /* renamed from: h  reason: collision with root package name */
    public pf0.c f16246h;

    /* renamed from: i  reason: collision with root package name */
    public t21.b f16247i;

    /* renamed from: j  reason: collision with root package name */
    public mj0.m f16248j;

    /* renamed from: k  reason: collision with root package name */
    public tj.a f16249k;

    /* renamed from: l  reason: collision with root package name */
    public final Stack<m1> f16250l = new Stack<>();

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16251m;

    /* renamed from: n  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16252n;

    /* renamed from: o  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16253o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16254p;

    /* renamed from: q  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16255q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16256r;

    /* renamed from: s  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16257s;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.lifecycle.d0 f16258t;

    /* renamed from: u  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f16259u;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class a0 extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16260f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(Fragment fragment) {
            super(0);
            this.f16260f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16260f;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends x12.p implements w12.a<h12.f0> {
        public b(Object obj) {
            super(0, obj, gm0.c.class, "dismissDialogs", "dismissDialogs()V", 0);
        }

        @Override // w12.a
        public final h12.f0 invoke() {
            ((gm0.c) this.receiver).S();
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class b0 extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16261f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(w12.a aVar) {
            super(0);
            this.f16261f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16261f.invoke();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends x12.p implements w12.a<h12.f0> {
        public c(Object obj) {
            super(0, obj, gm0.c.class, "onNearbyDevicePermissionDescriptionDialogConfirm", "onNearbyDevicePermissionDescriptionDialogConfirm()V", 0);
        }

        @Override // w12.a
        public final h12.f0 invoke() {
            ((gm0.c) this.receiver).U();
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class c0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16262f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(h12.l lVar) {
            super(0);
            this.f16262f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16262f.getValue()).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends x12.p implements w12.a<h12.f0> {
        public d(Object obj) {
            super(0, obj, gm0.c.class, "dismissDialogs", "dismissDialogs()V", 0);
        }

        @Override // w12.a
        public final h12.f0 invoke() {
            ((gm0.c) this.receiver).S();
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16263f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16264g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16263f = aVar;
            this.f16264g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16263f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16264g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e extends x12.p implements w12.a<h12.f0> {
        public e(Object obj) {
            super(0, obj, gm0.c.class, "onNearbyDevicePermissionRationDialogConfirm", "onNearbyDevicePermissionRationDialogConfirm()V", 0);
        }

        @Override // w12.a
        public final h12.f0 invoke() {
            gm0.c cVar = (gm0.c) this.receiver;
            cVar.S();
            cVar.d.d();
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e0 extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16265f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(Fragment fragment) {
            super(0);
            this.f16265f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16265f;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements Function1<u3.j0, u3.i0> {
        public final /* synthetic */ LifecycleOwner d;
        public final /* synthetic */ m9.i e;

        public f(LifecycleOwner lifecycleOwner, m9.i iVar) {
            this.d = lifecycleOwner;
            this.e = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final u3.i0 invoke(u3.j0 j0Var) {
            j0Var.getClass();
            LifecycleOwner lifecycleOwner = this.d;
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            m9.i iVar = this.e;
            lifecycle.a(iVar);
            return new sy0.n(lifecycleOwner, iVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f0 extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16266f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(w12.a aVar) {
            super(0);
            this.f16266f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16266f.invoke();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class g extends x12.p implements Function1<t11.a, h12.f0> {
        public g(Object obj) {
            super(1, obj, s11.e.class, "onBottomSheetAppeared", "onBottomSheetAppeared(Lcom/dyson/mobile/android/robot/newsystem/notification/model/RobotMachineNotificationType;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h12.f0 invoke(t11.a aVar) {
            t11.a aVar2 = aVar;
            aVar2.getClass();
            s11.e eVar = (s11.e) this.receiver;
            eVar.getClass();
            hj.e eVar2 = eVar.f74687f;
            ij.f d = aVar2.d();
            e.a aVar3 = hj.e.f38312g;
            eVar2.g(d, null);
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16267f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(h12.l lVar) {
            super(0);
            this.f16267f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16267f.getValue()).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class h extends x12.p implements Function1<t11.a, h12.f0> {
        public h(Object obj) {
            super(1, obj, s11.e.class, "onBottomSheetDismissed", "onBottomSheetDismissed(Lcom/dyson/mobile/android/robot/newsystem/notification/model/RobotMachineNotificationType;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h12.f0 invoke(t11.a aVar) {
            t11.a aVar2 = aVar;
            aVar2.getClass();
            s11.e eVar = (s11.e) this.receiver;
            eVar.getClass();
            hj.e eVar2 = eVar.f74687f;
            ij.f f13 = aVar2.f();
            e.a aVar3 = hj.e.f38312g;
            eVar2.g(f13, null);
            eVar.e.f74674a.f74685c.setValue(null);
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16268f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16269g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16268f = aVar;
            this.f16269g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16268f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16269g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class i extends x12.p implements Function1<kw0.a, h12.f0> {
        public i(Object obj) {
            super(1, obj, s11.e.class, "onActionButtonClicked", "onActionButtonClicked(Lcom/dyson/mobile/android/robot/home/notification/model/RobotAlertActionEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h12.f0 invoke(kw0.a aVar) {
            kw0.a aVar2 = aVar;
            aVar2.getClass();
            s11.e eVar = (s11.e) this.receiver;
            eVar.getClass();
            hj.e eVar2 = eVar.f74687f;
            ij.f a13 = aVar2.a();
            e.a aVar3 = hj.e.f38312g;
            eVar2.g(a13, null);
            eVar.e.f74674a.f74685c.setValue(null);
            q11.c cVar = eVar.d;
            cVar.getClass();
            cVar.f65474g.b(aVar2);
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class i0 extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16270f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(w12.a aVar) {
            super(0);
            this.f16270f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16270f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNewSystemFragment$onCreateView$2$1$1$1$1", f = "RobotNewSystemFragment.kt", l = {225}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class j extends n12.i implements Function2<z32.c0, l12.d<? super h12.f0>, Object> {
        public int d;

        public j(l12.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<h12.f0> create(Object obj, l12.d<?> dVar) {
            return new j(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super h12.f0> dVar) {
            return ((j) create(c0Var, dVar)).invokeSuspend(h12.f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                int i14 = a.f16243v;
                a aVar = a.this;
                q1 q1Var = aVar.w().f77178f;
                this.d = 1;
                Object i15 = c42.r.i(q1Var, new sy0.q(aVar, null), this);
                if (i15 != obj2) {
                    i15 = h12.f0.f36844a;
                }
                if (i15 == obj2) {
                    return obj2;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class j0 extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16271f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(Fragment fragment) {
            super(0);
            this.f16271f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16271f;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNewSystemFragment$onCreateView$2$1$1$1$2", f = "RobotNewSystemFragment.kt", l = {231}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class k extends n12.i implements Function2<z32.c0, l12.d<? super h12.f0>, Object> {
        public int d;

        public k(l12.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<h12.f0> create(Object obj, l12.d<?> dVar) {
            return new k(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super h12.f0> dVar) {
            return ((k) create(c0Var, dVar)).invokeSuspend(h12.f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                int i14 = a.f16243v;
                a aVar = a.this;
                r1 r1Var = aVar.w().f77179g;
                this.d = 1;
                Object i15 = c42.r.i(r1Var, new sy0.o(aVar, null), this);
                if (i15 != obj2) {
                    i15 = h12.f0.f36844a;
                }
                if (i15 == obj2) {
                    return obj2;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class k0 extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16272f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(w12.a aVar) {
            super(0);
            this.f16272f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16272f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNewSystemFragment$onCreateView$2$1$1$1$3", f = "RobotNewSystemFragment.kt", l = {235}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class l extends n12.i implements Function2<z32.c0, l12.d<? super h12.f0>, Object> {
        public int d;

        public l(l12.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<h12.f0> create(Object obj, l12.d<?> dVar) {
            return new l(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super h12.f0> dVar) {
            return ((l) create(c0Var, dVar)).invokeSuspend(h12.f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                int i14 = a.f16243v;
                a aVar = a.this;
                q1 q1Var = aVar.w().f77180h;
                this.d = 1;
                Object i15 = c42.r.i(q1Var, new sy0.p(aVar, null), this);
                if (i15 != obj2) {
                    i15 = h12.f0.f36844a;
                }
                if (i15 == obj2) {
                    return obj2;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class l0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(h12.l lVar) {
            super(0);
            this.f16273f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16273f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNewSystemFragment$onCreateView$2$1$4$1$1$1", f = "RobotNewSystemFragment.kt", l = {259}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class m extends n12.i implements Function2<z32.c0, l12.d<? super h12.f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l91.g f16274f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l91.k f16275g;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.a$m$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0561a<T> implements c42.j {
            public final /* synthetic */ l91.g d;
            public final /* synthetic */ l91.k e;

            public C0561a(l91.g gVar, l91.k kVar) {
                this.d = gVar;
                this.e = kVar;
            }

            @Override // c42.j
            public final Object emit(Object obj, l12.d dVar) {
                l91.k kVar = this.e;
                l91.g.b(this.d, (String) obj, kVar, 4);
                return h12.f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l91.g gVar, l91.k kVar, l12.d<? super m> dVar) {
            super(2, dVar);
            this.f16274f = gVar;
            this.f16275g = kVar;
        }

        @Override // n12.a
        public final l12.d<h12.f0> create(Object obj, l12.d<?> dVar) {
            return new m(this.f16274f, this.f16275g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super h12.f0> dVar) {
            return ((m) create(c0Var, dVar)).invokeSuspend(h12.f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                int i14 = a.f16243v;
                q1 q1Var = a.this.y().f33k;
                C0561a c0561a = new C0561a(this.f16274f, this.f16275g);
                this.d = 1;
                if (q1Var.d.collect(c0561a, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            y9.w.j();
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class m0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16276f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16277g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16276f = aVar;
            this.f16277g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16276f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16277g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgm0/c$b;", "event", "Lh12/f0;", "<anonymous>", "(Lgm0/c$b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNewSystemFragment$onCreateView$2$1$4$1$2$1$1", f = "RobotNewSystemFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class n extends n12.i implements Function2<c.b, l12.d<? super h12.f0>, Object> {
        public /* synthetic */ Object d;

        public n(l12.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<h12.f0> create(Object obj, l12.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.d = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c.b bVar, l12.d<? super h12.f0> dVar) {
            return ((n) create(bVar, dVar)).invokeSuspend(h12.f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            if (!x12.r.c((c.b) this.d, c.b.a.f35231a)) {
                ma.e.o();
                return null;
            }
            a aVar2 = a.this;
            uf0.g a13 = uf0.g.a(aVar2.requireActivity());
            androidx.fragment.app.e requireActivity = aVar2.requireActivity();
            iu0.z zVar = aVar2.d;
            if (zVar == null) {
                x12.r.i("coordinator");
                throw null;
            }
            iu0.p pVar = zVar.f42725h;
            a13.b(requireActivity, pVar.f42685b, pVar.f42684a.f15569q);
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class n0 extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16278f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(Fragment fragment) {
            super(0);
            this.f16278f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16278f;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lh12/f0;", com.salesforce.marketingcloud.push.g.f21676h, "<anonymous>", "(V)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNewSystemFragment$onCreateView$2$1$4$1$2$2$1", f = "RobotNewSystemFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class o extends n12.i implements Function2<h12.f0, l12.d<? super h12.f0>, Object> {
        public final /* synthetic */ g.j<ChangeTimeZoneNdsActivity.ActivityInput, String> d;
        public final /* synthetic */ a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(g.j<ChangeTimeZoneNdsActivity.ActivityInput, String> jVar, a aVar, l12.d<? super o> dVar) {
            super(2, dVar);
            this.d = jVar;
            this.e = aVar;
        }

        @Override // n12.a
        public final l12.d<h12.f0> create(Object obj, l12.d<?> dVar) {
            return new o(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(h12.f0 f0Var, l12.d<? super h12.f0> dVar) {
            return ((o) create(f0Var, dVar)).invokeSuspend(h12.f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            iu0.z zVar = this.e.d;
            if (zVar == null) {
                x12.r.i("coordinator");
                throw null;
            }
            this.d.a(new ChangeTimeZoneNdsActivity.ActivityInput(zVar.f42725h.f42685b));
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class o0 extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16279f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(w12.a aVar) {
            super(0);
            this.f16279f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16279f.invoke();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class p extends x12.p implements Function1<Boolean, h12.f0> {
        public p(Object obj) {
            super(1, obj, sm0.a.class, "updateAutoSoftwareUpdate", "updateAutoSoftwareUpdate(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final h12.f0 invoke(Boolean bool) {
            ((sm0.a) this.receiver).S(bool.booleanValue());
            return h12.f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class p0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16280f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(h12.l lVar) {
            super(0);
            this.f16280f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16280f.getValue()).getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class q implements m9.p, x12.m {
        public final /* synthetic */ Function1 d;

        public q(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof m9.p) && (obj instanceof x12.m)) {
                return x12.r.c(d(), ((x12.m) obj).d());
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class q0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16281f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16282g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16281f = aVar;
            this.f16282g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16281f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16282g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class r extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16283f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Fragment fragment) {
            super(0);
            this.f16283f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16283f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class r0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16284f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(h12.l lVar) {
            super(0);
            this.f16284f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16284f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class s extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16285f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(w12.a aVar) {
            super(0);
            this.f16285f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16285f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class s0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16286f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16287g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16286f = aVar;
            this.f16287g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16286f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16287g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class t extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16288f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(h12.l lVar) {
            super(0);
            this.f16288f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16288f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class t0 extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16289f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(Fragment fragment) {
            super(0);
            this.f16289f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16289f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class u extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16290f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16291g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16290f = aVar;
            this.f16291g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16290f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16291g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class u0 extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16292f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(w12.a aVar) {
            super(0);
            this.f16292f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16292f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class v extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16293f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(Fragment fragment) {
            super(0);
            this.f16293f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16293f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class v0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16294f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v0(h12.l lVar) {
            super(0);
            this.f16294f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16294f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class w extends x12.t implements w12.a<m9.w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16295f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(w12.a aVar) {
            super(0);
            this.f16295f = aVar;
        }

        @Override // w12.a
        public final m9.w invoke() {
            return (m9.w) this.f16295f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class w0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16296f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16297g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16296f = aVar;
            this.f16297g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16296f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16297g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class x extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ h12.l f16298f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(h12.l lVar) {
            super(0);
            this.f16298f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((m9.w) this.f16298f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class y extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16299f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ h12.l f16300g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(w12.a aVar, h12.l lVar) {
            super(0);
            this.f16299f = aVar;
            this.f16300g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16299f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                m9.w wVar = (m9.w) this.f16300g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class z extends x12.t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Fragment fragment) {
            super(0);
            this.f16301f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16301f;
        }
    }

    static {
        new C0560a(null);
    }

    public a() {
        sy0.j jVar = new sy0.j(this, 2);
        z zVar = new z(this);
        h12.n nVar = h12.n.NONE;
        h12.l a13 = h12.m.a(nVar, new i0(zVar));
        x12.q0 q0Var = x12.p0.f86717a;
        this.f16251m = new androidx.lifecycle.d0(q0Var.b(a01.m.class), new r0(a13), jVar, new s0(null, a13));
        sy0.j jVar2 = new sy0.j(this, 6);
        h12.l a14 = h12.m.a(nVar, new u0(new t0(this)));
        this.f16252n = new androidx.lifecycle.d0(q0Var.b(com.dyson.mobile.android.robot.newsystem.home.tabs.maps.d.class), new v0(a14), jVar2, new w0(null, a14));
        sy0.j jVar3 = new sy0.j(this, 8);
        h12.l a15 = h12.m.a(nVar, new s(new r(this)));
        this.f16253o = new androidx.lifecycle.d0(q0Var.b(c21.g0.class), new t(a15), jVar3, new u(null, a15));
        sy0.j jVar4 = new sy0.j(this, 9);
        h12.l a16 = h12.m.a(nVar, new w(new v(this)));
        this.f16254p = new androidx.lifecycle.d0(q0Var.b(n01.d.class), new x(a16), jVar4, new y(null, a16));
        sy0.j jVar5 = new sy0.j(this, 10);
        h12.l a17 = h12.m.a(nVar, new b0(new a0(this)));
        this.f16255q = new androidx.lifecycle.d0(q0Var.b(sy0.g.class), new c0(a17), jVar5, new d0(null, a17));
        sy0.j jVar6 = new sy0.j(this, 11);
        h12.l a18 = h12.m.a(nVar, new f0(new e0(this)));
        this.f16256r = new androidx.lifecycle.d0(q0Var.b(gm0.c.class), new g0(a18), jVar6, new h0(null, a18));
        sy0.j jVar7 = new sy0.j(this, 12);
        h12.l a19 = h12.m.a(nVar, new k0(new j0(this)));
        this.f16257s = new androidx.lifecycle.d0(q0Var.b(sm0.a.class), new l0(a19), jVar7, new m0(null, a19));
        sy0.j jVar8 = new sy0.j(this, 13);
        h12.l a23 = h12.m.a(nVar, new o0(new n0(this)));
        this.f16258t = new androidx.lifecycle.d0(q0Var.b(wi0.a.class), new p0(a23), jVar8, new q0(null, a23));
        ActivityResultLauncher<Intent> registerForActivityResult = registerForActivityResult(new j.a(), new sy0.m(this));
        registerForActivityResult.getClass();
        this.f16259u = registerForActivityResult;
    }

    public static final void v(a aVar, RobotDestination robotDestination) {
        androidx.fragment.app.e requireActivity = aVar.requireActivity();
        ActivityResultLauncher<Intent> activityResultLauncher = aVar.f16259u;
        RobotNavigationHostActivity.a aVar2 = RobotNavigationHostActivity.f16231r;
        requireActivity.getClass();
        iu0.z zVar = aVar.d;
        if (zVar == null) {
            x12.r.i("coordinator");
            throw null;
        }
        String str = zVar.f42726i;
        aVar2.getClass();
        str.getClass();
        robotDestination.getClass();
        Intent intent = new Intent(requireActivity, RobotNavigationHostActivity.class);
        intent.putExtra("COORDINATOR_ID", str);
        intent.putExtra("NAVIGATION_DESTINATION", robotDestination);
        activityResultLauncher.a(intent);
    }

    public final ViewModelProvider.Factory A() {
        zf1.b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        x12.r.i("viewModelFactory");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create RobotNewSystemFragment";
        String y13 = fm1.o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        iu0.z.f42723r.getClass();
        iu0.z a13 = z.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        this.d = a13;
        av0.d dVar = a13.f42732o.f42663a;
        this.e = dVar.a();
        this.f16244f = (a.c) dVar.R3.f88315a;
        this.f16246h = dVar.b();
        this.f16247i = dVar.S3.get();
        bv0.s0 s0Var = dVar.f5510b;
        f3.b(s0Var);
        this.f16248j = dVar.M1.get();
        this.f16249k = j2.b(s0Var);
        a.c cVar = this.f16244f;
        if (cVar == null) {
            x12.r.i("changeTimeZoneViewModelFactory");
            throw null;
        }
        iu0.z zVar = this.d;
        if (zVar == null) {
            x12.r.i("coordinator");
            throw null;
        }
        this.f16245g = cVar.a(zVar.f42725h.f42684a.d.d);
        rf1.g gVar = x().d;
        ty1.l lVar = new ty1.l(this);
        androidx.fragment.app.e requireActivity = requireActivity();
        requireActivity.getClass();
        gVar.e(lVar, requireActivity);
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("SELECTED_TAB", null) : null;
        wi0.a aVar = (wi0.a) this.f16258t.getValue();
        xf1.a<a.C1436a> aVar2 = aVar.f85811h;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar2.observe(viewLifecycleOwner, new q(new sy0.k(this, 0)));
        xf1.a<a.b> aVar3 = aVar.f85810g;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        aVar3.observe(viewLifecycleOwner2, new q(new sy0.k(this, 1)));
        xf1.a<kj.b> aVar4 = aVar.f85812i;
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        aVar4.observe(viewLifecycleOwner3, new q(new sy0.k(this, 2)));
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(968240196, true, new sy0.i(this, string, 0)));
        return composeView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r8 == androidx.compose.runtime.Composer.a.f3142b) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
        if (r9 == androidx.compose.runtime.Composer.a.f3142b) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if (r8 == androidx.compose.runtime.Composer.a.f3142b) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
        if (r10 == androidx.compose.runtime.Composer.a.f3142b) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(androidx.compose.runtime.Composer r17, int r18) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.a.s(androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(androidx.compose.runtime.Composer r9, int r10) {
        /*
            r8 = this;
            r0 = 409102554(0x186268da, float:2.9262752E-24)
            androidx.compose.runtime.a r5 = r9.k(r0)
            boolean r9 = r5.D(r8)
            r0 = 2
            if (r9 == 0) goto L10
            r9 = 4
            goto L11
        L10:
            r9 = r0
        L11:
            r9 = r9 | r10
            r1 = r9 & 3
            r7 = 1
            if (r1 == r0) goto L19
            r0 = r7
            goto L1a
        L19:
            r0 = 0
        L1a:
            r9 = r9 & r7
            boolean r9 = r5.t(r9, r0)
            if (r9 == 0) goto Ld3
            u3.p1 r9 = androidx.compose.runtime.b.f3172a
            androidx.lifecycle.ViewModelProvider$Factory r9 = r8.A()
            r9.a r0 = r9.a.f70754a
            r0.getClass()
            m9.w r0 = r9.a.a(r5)
            if (r0 == 0) goto Lcd
            boolean r1 = r0 instanceof androidx.lifecycle.g
            if (r1 == 0) goto L3e
            r1 = r0
            androidx.lifecycle.g r1 = (androidx.lifecycle.g) r1
            androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
            goto L40
        L3e:
            androidx.lifecycle.viewmodel.CreationExtras$b r1 = androidx.lifecycle.viewmodel.CreationExtras.b.f4572c
        L40:
            java.lang.Class<s11.e> r2 = s11.e.class
            x12.q0 r3 = x12.p0.f86717a
            e22.d r2 = r3.b(r2)
            m9.u r9 = r9.b.a(r2, r0, r9, r1, r5)
            s11.e r9 = (s11.e) r9
            androidx.compose.runtime.e r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r0 = r5.A(r0)
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            com.dyson.mobile.android.robot.newsystem.a$f r1 = new com.dyson.mobile.android.robot.newsystem.a$f
            r1.<init>(r0, r9)
            u3.m0.b(r0, r1, r5)
            c42.r1 r0 = r9.f74688g
            u3.k1 r0 = n9.b.c(r0, r5)
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            t11.a r1 = (t11.a) r1
            boolean r0 = r5.D(r9)
            java.lang.Object r2 = r5.B()
            androidx.compose.runtime.Composer$a r3 = androidx.compose.runtime.Composer.f3140a
            if (r0 != 0) goto L80
            r3.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r2 != r0) goto L88
        L80:
            com.dyson.mobile.android.robot.newsystem.a$g r2 = new com.dyson.mobile.android.robot.newsystem.a$g
            r2.<init>(r9)
            r5.u(r2)
        L88:
            e22.g r2 = (e22.g) r2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            boolean r0 = r5.D(r9)
            java.lang.Object r4 = r5.B()
            if (r0 != 0) goto L9d
            r3.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r4 != r0) goto La5
        L9d:
            com.dyson.mobile.android.robot.newsystem.a$h r4 = new com.dyson.mobile.android.robot.newsystem.a$h
            r4.<init>(r9)
            r5.u(r4)
        La5:
            e22.g r4 = (e22.g) r4
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            boolean r0 = r5.D(r9)
            java.lang.Object r6 = r5.B()
            if (r0 != 0) goto Lba
            r3.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r6 != r0) goto Lc2
        Lba:
            com.dyson.mobile.android.robot.newsystem.a$i r6 = new com.dyson.mobile.android.robot.newsystem.a$i
            r6.<init>(r9)
            r5.u(r6)
        Lc2:
            e22.g r6 = (e22.g) r6
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r3 = r4
            r4 = r6
            r6 = 0
            cz0.c.a(r1, r2, r3, r4, r5, r6)
            goto Ld6
        Lcd:
            java.lang.String r8 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            pa.c.w(r8)
            return
        Ld3:
            r5.J()
        Ld6:
            androidx.compose.runtime.f r9 = r5.c0()
            if (r9 == 0) goto Le3
            sy0.l r0 = new sy0.l
            r0.<init>(r8, r10, r7)
            r9.d = r0
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.a.t(androidx.compose.runtime.Composer, int):void");
    }

    public final sy0.g w() {
        return (sy0.g) this.f16255q.getValue();
    }

    public final gm0.c x() {
        return (gm0.c) this.f16256r.getValue();
    }

    public final a01.m y() {
        return (a01.m) this.f16251m.getValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/a$a;", "", "<init>", "()V", "", "ROBOT_NEW_SYSTEM_FRAGMENT", "Ljava/lang/String;", "", "ACTIVITY_RESULT_RENAME_COMPLETE", "I", "ACTIVITY_RESULT_MANAGE_RULES_SAVED", "ACTIVITY_RESULT_EDIT_FURNITURE_SUCCESS", "ACTIVITY_RESULT_SCHEDULE_CREATED", "ACTIVITY_RESULT_SCHEDULE_UPDATED", "ACTIVITY_RESULT_SCHEDULE_DELETED", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0560a {
        public /* synthetic */ C0560a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0560a() {
        }
    }
}
