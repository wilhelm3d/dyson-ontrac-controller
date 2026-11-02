package com.dyson.mobile.android.robot.faults.ui.useracknowledgement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bv0.e8;
import bv0.j2;
import com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a;
import com.dyson.mobile.android.robot.traits.faults.ActiveFault;
import com.dyson.mobile.android.robot.traits.faults.RobotFault;
import com.dyson.mobile.android.support.common.Step;
import en0.b;
import f.g;
import fm1.o0;
import gm1.am;
import hj.e;
import iu0.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.t9;
import u41.j;
import vv0.k;
import vv0.m;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/faults/ui/useracknowledgement/UserAcknowledgementFaultStepsActivity;", "Lbt0/d;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserAcknowledgementFaultStepsActivity extends bt0.d {

    /* renamed from: r  reason: collision with root package name */
    public static final a f16039r = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public hj.e f16040l;

    /* renamed from: m  reason: collision with root package name */
    public bt0.b f16041m;

    /* renamed from: n  reason: collision with root package name */
    public a.InterfaceC0550a f16042n;

    /* renamed from: o  reason: collision with root package name */
    public z f16043o;

    /* renamed from: p  reason: collision with root package name */
    public RobotFault f16044p;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f16045q = new d0(p0.f86717a.b(com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a.class), new d(this), new c(b.d, this, new k(this, 1)), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements w12.a<Bundle> {
        public static final b d = new b();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f16046f;

        public c(w12.a aVar, g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f16046f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f16046f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f16047f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f16047f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16047f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16048f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f16049g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, g gVar) {
            super(0);
            this.f16048f = aVar;
            this.f16049g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16048f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16049g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // bt0.d
    public final bt0.a d1() {
        bt0.b bVar = this.f16041m;
        if (bVar != null) {
            return bVar;
        }
        r.i("containerViewModel");
        throw null;
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newIntent method";
        Bundle a14 = a13.a("COORDINATOR_ID", "ROBOT_FAULT");
        z.a aVar = z.f42723r;
        String y13 = o0.y("COORDINATOR_ID", a14);
        aVar.getClass();
        z a15 = z.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16043o = a15;
        Object a16 = k7.b.a(a14, "ROBOT_FAULT", RobotFault.class);
        if (a16 == null) {
            pa.c.w("ROBOT_FAULT was null");
            return;
        }
        this.f16044p = (RobotFault) ((Parcelable) a16);
        z zVar = this.f16043o;
        if (zVar == null) {
            r.i("coordinator");
            throw null;
        }
        av0.d dVar = zVar.f42732o.f42663a;
        this.f16040l = dVar.V.get();
        e8 e8Var = dVar.f5515c;
        tj.a b13 = j2.b(dVar.f5510b);
        e8Var.getClass();
        this.f16041m = new bt0.b(b13.c());
        this.f16042n = (a.InterfaceC0550a) dVar.Q3.f88315a;
        List<Step> list = ((com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a) this.f16045q.getValue()).e;
        bt0.b bVar = this.f16041m;
        if (bVar == null) {
            r.i("containerViewModel");
            throw null;
        }
        bVar.l(((com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a) this.f16045q.getValue()).f16050f);
        bt0.b bVar2 = this.f16041m;
        if (bVar2 == null) {
            r.i("containerViewModel");
            throw null;
        }
        String str = bVar2.f8407f;
        if (str != null) {
            en0.b.d.getClass();
            e1(b.a.a(str, list));
        }
        m mVar = m.f84923a;
        RobotFault robotFault = this.f16044p;
        if (robotFault == null) {
            r.i("robotFault");
            throw null;
        }
        mVar.getClass();
        if ((robotFault instanceof ActiveFault) && ((ActiveFault) robotFault).e == j.USER_ACK) {
            am.l(getOnBackPressedDispatcher(), null, new k(this, 0), 3);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f16040l;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = t9.f57716a;
        ij.b bVar = new ij.b("robot.fault.fault_resolution", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/faults/ui/useracknowledgement/UserAcknowledgementFaultStepsActivity$a;", "", "<init>", "()V", "", "ROBOT_FAULT", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
