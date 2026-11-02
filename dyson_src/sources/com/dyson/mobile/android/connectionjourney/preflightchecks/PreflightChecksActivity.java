package com.dyson.mobile.android.connectionjourney.preflightchecks;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import b40.e;
import com.dyson.mobile.android.connectionjourney.bleconnection.bleclientconnectionjourney.BleConnectionJourneyActivity;
import com.dyson.mobile.android.connectionjourney.machinescan.webregisteredmachines.addmachine.AddWebRegisteredMachineActivity;
import com.dyson.mobile.android.connectionjourney.preflightchecks.a;
import com.dyson.mobile.android.connectionjourney.preflightchecks.d;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.subsequent.SubsequentUserGuidanceActivity;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import f.x;
import h12.f0;
import h12.r;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n12.i;
import u50.j;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
import y9.q0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/PreflightChecksActivity;", "Ll/b;", "<init>", "()V", "a", "Lb10/a;", "alertViewState", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PreflightChecksActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f13856m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public d.c f13857j;

    /* renamed from: k  reason: collision with root package name */
    public e.b f13858k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f13859l = new d0(p0.f86717a.b(com.dyson.mobile.android.connectionjourney.preflightchecks.d.class), new g(this), new f(e.d, this, new p40.f(this, 0)), new h(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.preflightchecks.PreflightChecksActivity$onCreate$1$1$1$1", f = "PreflightChecksActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends i implements Function2<com.dyson.mobile.android.connectionjourney.preflightchecks.a, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ PreflightChecksActivity f13860f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, PreflightChecksActivity preflightChecksActivity, l12.d<? super b> dVar) {
            super(2, dVar);
            this.e = q0Var;
            this.f13860f = preflightChecksActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(this.e, this.f13860f, dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.connectionjourney.preflightchecks.a aVar, l12.d<? super f0> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.connectionjourney.preflightchecks.a aVar = (com.dyson.mobile.android.connectionjourney.preflightchecks.a) this.d;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (aVar instanceof a.d) {
                r50.b bVar = r50.b.f70435a;
                com.dyson.mobile.android.connectionjourney.preflightchecks.b bVar2 = ((a.d) aVar).f13868a;
                bVar.getClass();
                q0 q0Var = this.e;
                q0Var.getClass();
                q0Var.g(bVar2, new a90.h(q0Var, 6));
            } else {
                boolean c13 = x12.r.c(aVar, a.C0444a.f13865a);
                PreflightChecksActivity preflightChecksActivity = this.f13860f;
                if (c13) {
                    a aVar3 = PreflightChecksActivity.f13856m;
                    preflightChecksActivity.getClass();
                    w00.i.c(preflightChecksActivity).j(preflightChecksActivity);
                } else if (x12.r.c(aVar, a.b.f13866a)) {
                    a aVar4 = PreflightChecksActivity.f13856m;
                    preflightChecksActivity.getClass();
                    w00.i.c(preflightChecksActivity).o(preflightChecksActivity);
                } else if (!x12.r.c(aVar, a.c.f13867a)) {
                    ma.e.o();
                    return null;
                } else {
                    a aVar5 = PreflightChecksActivity.f13856m;
                    preflightChecksActivity.getClass();
                    w00.i c14 = w00.i.c(preflightChecksActivity);
                    int intExtra = preflightChecksActivity.getIntent().getIntExtra("MACHINE_SCAN_TYPE", -1);
                    MachineDescriptor c15 = preflightChecksActivity.c1();
                    c14.getClass();
                    if (intExtra == 0) {
                        preflightChecksActivity.startActivity(new Intent(preflightChecksActivity, AddWebRegisteredMachineActivity.class));
                        preflightChecksActivity.finish();
                    } else if (intExtra == 1) {
                        preflightChecksActivity.finish();
                        if (x12.r.c(c15.getMachineType(), MachineType.MACHINE_571.getTypeName()) || j.g(c15) || j.i(c15)) {
                            BleConnectionJourneyActivity.f13339m.getClass();
                            Intent intent = new Intent(preflightChecksActivity, BleConnectionJourneyActivity.class);
                            intent.putExtra("extraTheme", 2132083507);
                            preflightChecksActivity.startActivity(intent);
                        } else if (j.h(c15) || j.f(c15) || j.e(c15)) {
                            c14.r(preflightChecksActivity, 2132083507);
                        } else {
                            c14.r(preflightChecksActivity, 2132083509);
                        }
                    } else if (intExtra == 2) {
                        Logger.a("onMachineClickedFromMdnsResult");
                        MachineDescriptor j8 = c14.f85124a.j();
                        SubsequentUserGuidanceActivity.f13933p.getClass();
                        Intent putExtra = new Intent(preflightChecksActivity, SubsequentUserGuidanceActivity.class).putExtra("extra-machine-descriptor", j8);
                        putExtra.getClass();
                        preflightChecksActivity.startActivity(putExtra);
                    }
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements Function1<com.dyson.mobile.android.connectionjourney.preflightchecks.c, f0> {
        public c(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectionjourney.preflightchecks.d.class, "onUserAction", "onUserAction(Lcom/dyson/mobile/android/connectionjourney/preflightchecks/PreflightChecksUserAction;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.connectionjourney.preflightchecks.c cVar) {
            com.dyson.mobile.android.connectionjourney.preflightchecks.c cVar2 = cVar;
            cVar2.getClass();
            ((com.dyson.mobile.android.connectionjourney.preflightchecks.d) this.receiver).T(cVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d extends p implements Function1<com.dyson.mobile.android.connectionjourney.preflightchecks.c, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectionjourney.preflightchecks.d.class, "onUserAction", "onUserAction(Lcom/dyson/mobile/android/connectionjourney/preflightchecks/PreflightChecksUserAction;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.connectionjourney.preflightchecks.c cVar) {
            com.dyson.mobile.android.connectionjourney.preflightchecks.c cVar2 = cVar;
            cVar2.getClass();
            ((com.dyson.mobile.android.connectionjourney.preflightchecks.d) this.receiver).T(cVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements w12.a<Bundle> {
        public static final e d = new e();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f13861f;

        public f(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f13861f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f13861f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f13862f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f.g gVar) {
            super(0);
            this.f13862f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13862f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13863f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f13864g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, f.g gVar) {
            super(0);
            this.f13863f = aVar;
            this.f13864g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13863f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13864g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final MachineDescriptor c1() {
        Intent intent = getIntent();
        intent.getClass();
        Serializable c13 = k7.b.c(cd.b.I(intent), "MACHINE_DESCRIPTOR", MachineDescriptor.class);
        if (c13 != null) {
            return (MachineDescriptor) c13;
        }
        fo1.a.o("MACHINE_DESCRIPTOR was null");
        return null;
    }

    public final com.dyson.mobile.android.connectionjourney.preflightchecks.d d1() {
        return (com.dyson.mobile.android.connectionjourney.preflightchecks.d) this.f13859l.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Intent extras not present in PreflightChecksActivity";
        a13.a("MACHINE_SERIAL", "MACHINE_DESCRIPTOR", "MACHINE_SCAN_TYPE");
        w00.i.c(this).e.U(this);
        g.f.a(this, new c4.c(-679695727, true, new p40.g(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/PreflightChecksActivity$a;", "", "<init>", "()V", "", "MACHINE_SCAN_TYPE", "Ljava/lang/String;", "MACHINE_SERIAL", "MACHINE_DESCRIPTOR", "", "DEFAULT_MACHINE_SCAN_TYPE", "I", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
