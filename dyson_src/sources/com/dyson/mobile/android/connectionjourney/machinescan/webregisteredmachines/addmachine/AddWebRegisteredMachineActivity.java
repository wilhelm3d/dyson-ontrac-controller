package com.dyson.mobile.android.connectionjourney.machinescan.webregisteredmachines.addmachine;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectionjourney.machinescan.webregisteredmachines.addmachine.AddWebRegisteredMachineActivity;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import ef1.h;
import f.g;
import f.j;
import f.x;
import g.f;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import w00.i;
import w20.e;
import x12.m;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/webregisteredmachines/addmachine/AddWebRegisteredMachineActivity;", "Ll/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddWebRegisteredMachineActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f13589m = 0;

    /* renamed from: j  reason: collision with root package name */
    public h f13590j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f13591k = new d0(p0.f86717a.b(e.class), new c(this), new w20.a(this, 0), new d(null, this));

    /* renamed from: l  reason: collision with root package name */
    public i f13592l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends p implements Function1<com.dyson.mobile.android.connectionjourney.machinescan.webregisteredmachines.addmachine.a, f0> {
        public a(Object obj) {
            super(1, obj, e.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/connectionjourney/machinescan/webregisteredmachines/addmachine/AddWebRegisteredMachineViewModelEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.connectionjourney.machinescan.webregisteredmachines.addmachine.a aVar) {
            com.dyson.mobile.android.connectionjourney.machinescan.webregisteredmachines.addmachine.a aVar2 = aVar;
            aVar2.getClass();
            ((e) this.receiver).S(aVar2);
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
        public final h12.h<?> d() {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f13593f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f13593f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13593f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13594f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f13595g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f13594f = aVar;
            this.f13595g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13594f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13595g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final e c1() {
        return (e) this.f13591k.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        i c13 = i.c(this);
        c13.getClass();
        this.f13592l = c13;
        c13.e.r(this);
        f.a(this, new c4.c(131798049, true, new w20.b(this, 0)));
        getLifecycle().a(c1());
        c1().f85169m.observe(this, new b(new Function1(this) { // from class: w20.c
            public final /* synthetic */ AddWebRegisteredMachineActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                AddWebRegisteredMachineActivity addWebRegisteredMachineActivity = this.e;
                f0 f0Var = (f0) obj;
                switch (i13) {
                    case 0:
                        int i14 = AddWebRegisteredMachineActivity.f13589m;
                        addWebRegisteredMachineActivity.finish();
                        return f0.f36844a;
                    case 1:
                        w00.i iVar = addWebRegisteredMachineActivity.f13592l;
                        if (iVar != null) {
                            iVar.h(addWebRegisteredMachineActivity);
                            return f0.f36844a;
                        }
                        r.i("connectionJourneyCoordinator");
                        throw null;
                    default:
                        if (addWebRegisteredMachineActivity.f13592l != null) {
                            ConnectivityIssueActivity.f1(addWebRegisteredMachineActivity, new s70.b(addWebRegisteredMachineActivity, 12), null);
                            return f0.f36844a;
                        }
                        r.i("connectionJourneyCoordinator");
                        throw null;
                }
            }
        }));
        c1().f85167k.observe(this, new b(new Function1(this) { // from class: w20.c
            public final /* synthetic */ AddWebRegisteredMachineActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                AddWebRegisteredMachineActivity addWebRegisteredMachineActivity = this.e;
                f0 f0Var = (f0) obj;
                switch (i13) {
                    case 0:
                        int i14 = AddWebRegisteredMachineActivity.f13589m;
                        addWebRegisteredMachineActivity.finish();
                        return f0.f36844a;
                    case 1:
                        w00.i iVar = addWebRegisteredMachineActivity.f13592l;
                        if (iVar != null) {
                            iVar.h(addWebRegisteredMachineActivity);
                            return f0.f36844a;
                        }
                        r.i("connectionJourneyCoordinator");
                        throw null;
                    default:
                        if (addWebRegisteredMachineActivity.f13592l != null) {
                            ConnectivityIssueActivity.f1(addWebRegisteredMachineActivity, new s70.b(addWebRegisteredMachineActivity, 12), null);
                            return f0.f36844a;
                        }
                        r.i("connectionJourneyCoordinator");
                        throw null;
                }
            }
        }));
        c1().f85168l.observe(this, new b(new Function1(this) { // from class: w20.c
            public final /* synthetic */ AddWebRegisteredMachineActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                AddWebRegisteredMachineActivity addWebRegisteredMachineActivity = this.e;
                f0 f0Var = (f0) obj;
                switch (i13) {
                    case 0:
                        int i14 = AddWebRegisteredMachineActivity.f13589m;
                        addWebRegisteredMachineActivity.finish();
                        return f0.f36844a;
                    case 1:
                        w00.i iVar = addWebRegisteredMachineActivity.f13592l;
                        if (iVar != null) {
                            iVar.h(addWebRegisteredMachineActivity);
                            return f0.f36844a;
                        }
                        r.i("connectionJourneyCoordinator");
                        throw null;
                    default:
                        if (addWebRegisteredMachineActivity.f13592l != null) {
                            ConnectivityIssueActivity.f1(addWebRegisteredMachineActivity, new s70.b(addWebRegisteredMachineActivity, 12), null);
                            return f0.f36844a;
                        }
                        r.i("connectionJourneyCoordinator");
                        throw null;
                }
            }
        }));
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(c1());
    }
}
