package com.dyson.mobile.android.cat6.ui.home.settingtab.remove;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.u1;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.paypal.android.platform.authsdk.BR;
import com.salesforce.marketingcloud.push.g;
import ef1.h;
import fm1.o0;
import h12.f0;
import h12.r;
import hj.e;
import i3.n;
import in0.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq.d;
import m9.v;
import n12.i;
import nj.c1;
import qq.h3;
import rf0.i0;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
import z32.c0;
import z32.g0;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/ConnectedFloorcareRemoveMachineActivity;", "Ll/b;", "<init>", "()V", "a", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectedFloorcareRemoveMachineActivity extends l.b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f12874q = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public h f12875j;

    /* renamed from: k  reason: collision with root package name */
    public hj.e f12876k;

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f12877l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f12878m = new d0(p0.f86717a.b(com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a.class), new d(this), new xs.b(this, 0), new e(null, this));

    /* renamed from: n  reason: collision with root package name */
    public lq.d f12879n;

    /* renamed from: o  reason: collision with root package name */
    public androidx.appcompat.app.d f12880o;

    /* renamed from: p  reason: collision with root package name */
    public androidx.appcompat.app.d f12881p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a.class, "onRemoveButtonClicked", "onRemoveButtonClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a aVar = (com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a) this.receiver;
            aVar.getClass();
            g0.r(v.a(aVar), null, null, new com.dyson.mobile.android.cat6.ui.home.settingtab.remove.b(aVar, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.cat6.ui.home.settingtab.remove.ConnectedFloorcareRemoveMachineActivity$onCreate$3", f = "ConnectedFloorcareRemoveMachineActivity.kt", l = {BR.sessionTimeRange}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;", g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.cat6.ui.home.settingtab.remove.ConnectedFloorcareRemoveMachineActivity$onCreate$3$1", f = "ConnectedFloorcareRemoveMachineActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        /* loaded from: classes2.dex */
        public static final class a extends i implements Function2<a.b, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ ConnectedFloorcareRemoveMachineActivity e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ConnectedFloorcareRemoveMachineActivity connectedFloorcareRemoveMachineActivity, l12.d<? super a> dVar) {
                super(2, dVar);
                this.e = connectedFloorcareRemoveMachineActivity;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                a aVar = new a(this.e, dVar);
                aVar.d = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(a.b bVar, l12.d<? super f0> dVar) {
                return ((a) create(bVar, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                a.b bVar = (a.b) this.d;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                a aVar2 = ConnectedFloorcareRemoveMachineActivity.f12874q;
                ConnectedFloorcareRemoveMachineActivity connectedFloorcareRemoveMachineActivity = this.e;
                connectedFloorcareRemoveMachineActivity.getClass();
                if (bVar instanceof a.b.C0369a) {
                    e.b bVar2 = ((a.b.C0369a) bVar).f12889a;
                    e.a a13 = new zs0.e(connectedFloorcareRemoveMachineActivity).a();
                    a13.f93108b = connectedFloorcareRemoveMachineActivity.c1().d(i0.f71887v8);
                    a13.f93110f = true;
                    a13.c(connectedFloorcareRemoveMachineActivity.c1().d(i0.V8), bVar2);
                    a13.b(connectedFloorcareRemoveMachineActivity.c1().d(i0.E8), null);
                    androidx.appcompat.app.d a14 = a13.a();
                    connectedFloorcareRemoveMachineActivity.f12880o = a14;
                    if (a14 != null) {
                        a14.show();
                    }
                } else if (bVar instanceof a.b.C0370b) {
                    d.a aVar3 = new d.a(new ContextThemeWrapper(connectedFloorcareRemoveMachineActivity, (int) R.style.AlertDialogStyle));
                    String d = connectedFloorcareRemoveMachineActivity.c1().d(i0.f71931y8);
                    AlertController.b bVar3 = aVar3.f1831a;
                    bVar3.f1800f = d;
                    bVar3.f1813s = null;
                    bVar3.f1812r = R.layout.connected_floorcare_progress_bar;
                    bVar3.f1807m = false;
                    androidx.appcompat.app.d create = aVar3.create();
                    connectedFloorcareRemoveMachineActivity.f12881p = create;
                    if (create != null) {
                        create.show();
                    }
                } else if (bVar instanceof a.b.d) {
                    lq.d dVar = connectedFloorcareRemoveMachineActivity.f12879n;
                    if (dVar == null) {
                        x12.r.i("coordinator");
                        throw null;
                    }
                    f g13 = dVar.g();
                    if (g13 != null) {
                        g13.j(connectedFloorcareRemoveMachineActivity, dVar.f52536g.f52526b, false);
                    }
                    androidx.appcompat.app.d dVar2 = connectedFloorcareRemoveMachineActivity.f12880o;
                    if (dVar2 != null) {
                        dVar2.dismiss();
                    }
                    androidx.appcompat.app.d dVar3 = connectedFloorcareRemoveMachineActivity.f12881p;
                    if (dVar3 != null) {
                        dVar3.dismiss();
                    }
                    e.a a15 = new zs0.e(connectedFloorcareRemoveMachineActivity).a();
                    a15.f93108b = connectedFloorcareRemoveMachineActivity.c1().d(i0.f71946z8);
                    a15.f93110f = false;
                    a15.c(connectedFloorcareRemoveMachineActivity.c1().d(i0.L8), new vx0.f(connectedFloorcareRemoveMachineActivity, 4));
                    androidx.appcompat.app.d a16 = a15.a();
                    if (a16 != null) {
                        a16.show();
                    }
                } else if (!(bVar instanceof a.b.c)) {
                    ma.e.o();
                    return null;
                } else {
                    w12.a<f0> aVar4 = ((a.b.c) bVar).f12891a;
                    androidx.appcompat.app.d dVar4 = connectedFloorcareRemoveMachineActivity.f12880o;
                    if (dVar4 != null) {
                        dVar4.dismiss();
                    }
                    androidx.appcompat.app.d dVar5 = connectedFloorcareRemoveMachineActivity.f12881p;
                    if (dVar5 != null) {
                        dVar5.dismiss();
                    }
                    uf0.g a17 = uf0.g.a(connectedFloorcareRemoveMachineActivity);
                    wm0.a aVar5 = new wm0.a(aVar4, 2);
                    a17.getClass();
                    ConnectivityIssueActivity.f1(connectedFloorcareRemoveMachineActivity, aVar5, null);
                }
                return f0.f36844a;
            }
        }

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                a aVar2 = ConnectedFloorcareRemoveMachineActivity.f12874q;
                ConnectedFloorcareRemoveMachineActivity connectedFloorcareRemoveMachineActivity = ConnectedFloorcareRemoveMachineActivity.this;
                u1 u1Var = ((com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a) connectedFloorcareRemoveMachineActivity.f12878m.getValue()).f12886f;
                a aVar3 = new a(connectedFloorcareRemoveMachineActivity, null);
                this.d = 1;
                if (c42.r.i(u1Var, aVar3, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12882f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f12882f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12882f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12883f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12884g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f12883f = aVar;
            this.f12884g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12883f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12884g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final pf0.c c1() {
        pf0.c cVar = this.f12877l;
        if (cVar != null) {
            return cVar;
        }
        x12.r.i("localisationManager");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method to create ConnectedFloorcareRemoveMachineActivity";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        lq.d.f52535n.getClass();
        lq.d a14 = d.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12879n = a14;
        pq.b bVar = a14.f52538i;
        this.f12875j = bVar.a();
        this.f12876k = bVar.f64582c.get();
        this.f12877l = h3.b(bVar.f64576a);
        g.f.a(this, new c4.c(1829640707, true, new xs.c(this, 0)));
        g0.r(n.o(this), null, null, new c(null), 3);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f12880o = null;
        this.f12881p = null;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f12876k;
        if (eVar == null) {
            x12.r.i("trackingManager");
            throw null;
        }
        ij.b a13 = c1.a();
        e.a aVar = hj.e.f38312g;
        eVar.h(a13, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/ConnectedFloorcareRemoveMachineActivity$a;", "", "<init>", "()V", "", "REMOVE_MACHINE_SCREEN_TAG", "Ljava/lang/String;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
