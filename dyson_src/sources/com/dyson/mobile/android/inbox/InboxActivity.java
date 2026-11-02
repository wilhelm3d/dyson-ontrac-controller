package com.dyson.mobile.android.inbox;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.inbox.InboxActivity;
import com.dyson.mobile.android.inbox.a;
import com.dyson.mobile.android.inbox.b;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.salesforce.SalesforceMarketingCloudWebViewActivity;
import com.dyson.mobile.android.salesforce.a;
import f.g;
import f.j;
import f.x;
import f80.f;
import g80.a;
import h12.f0;
import h12.h;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import nj.qb;
import no0.i;
import se1.q0;
import uf0.q;
import x12.m;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/inbox/InboxActivity;", "Ll/b;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InboxActivity extends l.b {

    /* renamed from: n  reason: collision with root package name */
    public static final a f14242n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public hj.e f14243j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0463a f14244k;

    /* renamed from: l  reason: collision with root package name */
    public com.dyson.mobile.android.b f14245l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f14246m = new d0(p0.f86717a.b(com.dyson.mobile.android.inbox.a.class), new c(this), new uk.a(this, 14), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements p, m {
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
            if ((obj instanceof p) && (obj instanceof m)) {
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
        public final /* synthetic */ g f14247f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f14247f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14247f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14248f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f14249g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f14248f = aVar;
            this.f14249g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14248f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14249g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        com.dyson.mobile.android.b.A.getClass();
        com.dyson.mobile.android.b a13 = b.a.a();
        this.f14245l = a13;
        e80.b bVar = (e80.b) a13.f();
        f fVar = bVar.f26210a;
        this.f14243j = bVar.f26218f.get();
        pf0.c e = bVar.e();
        i iVar = new i(bVar.c());
        fVar.getClass();
        fVar.getClass();
        g80.a.f33730c.getClass();
        h80.c cVar = a.C1057a.a().f33731a;
        xy1.h.b(cVar);
        this.f14244k = new a.C0463a(e, new v90.a(iVar), bVar.h(), bVar.f26218f.get(), new com.dyson.mobile.android.salesforce.b(cVar, bVar.f()), bVar.c());
        super.onCreate(bundle);
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        if (this.f14243j == null) {
            r.i("trackingManager");
            throw null;
        }
        hj.e.c(null);
        hj.e eVar = this.f14243j;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        ((q) eVar.a()).d();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        g.f.a(this, new c4.c(219853461, true, new v90.f(this, 0)));
        d0 d0Var = this.f14246m;
        ((com.dyson.mobile.android.inbox.a) d0Var.getValue()).f14254j.observe(this, new b(new Function1(this) { // from class: v90.g
            public final /* synthetic */ InboxActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        com.dyson.mobile.android.inbox.b bVar2 = (com.dyson.mobile.android.inbox.b) obj;
                        InboxActivity.a aVar2 = InboxActivity.f14242n;
                        bVar2.getClass();
                        boolean z13 = bVar2 instanceof b.C0464b;
                        InboxActivity inboxActivity = this.e;
                        if (z13) {
                            com.dyson.mobile.android.salesforce.a aVar3 = ((b.C0464b) bVar2).f14267a;
                            if (aVar3 instanceof a.c) {
                                com.dyson.mobile.android.b bVar3 = inboxActivity.f14245l;
                                if (bVar3 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar3.z(inboxActivity, ((a.c) aVar3).f16667a.d.d);
                            } else if (x12.r.c(aVar3, a.d.f16668a)) {
                                com.dyson.mobile.android.b bVar4 = inboxActivity.f14245l;
                                if (bVar4 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar4.y(inboxActivity, true, null);
                            } else if (aVar3 instanceof a.j) {
                                a.j jVar = (a.j) aVar3;
                                String str = jVar.f16675b;
                                MachineDefinition machineDefinition = jVar.f16674a;
                                String str2 = jVar.f16676c;
                                com.dyson.mobile.android.b bVar5 = inboxActivity.f14245l;
                                if (str2 != null) {
                                    if (bVar5 == null) {
                                        x12.r.i("coordinator");
                                        throw null;
                                    }
                                    com.dyson.mobile.android.b.l(inboxActivity, machineDefinition, str, str2);
                                } else if (bVar5 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                } else {
                                    com.dyson.mobile.android.b.k(inboxActivity, machineDefinition, str);
                                }
                            } else if (x12.r.c(aVar3, a.e.f16669a)) {
                                com.dyson.mobile.android.b bVar6 = inboxActivity.f14245l;
                                if (bVar6 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar6.n(inboxActivity);
                            } else if (aVar3 instanceof a.f) {
                                if (inboxActivity.f14245l == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                com.dyson.mobile.android.b.j(inboxActivity, ((a.f) aVar3).f16670a);
                            } else if (aVar3 instanceof a.g) {
                                com.dyson.mobile.android.b bVar7 = inboxActivity.f14245l;
                                if (bVar7 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                MachineDefinition machineDefinition2 = ((a.g) aVar3).f16671a;
                                b.a aVar4 = com.dyson.mobile.android.b.A;
                                bVar7.o(inboxActivity, machineDefinition2, null);
                            } else if (aVar3 instanceof a.h) {
                                com.dyson.mobile.android.b bVar8 = inboxActivity.f14245l;
                                if (bVar8 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                MachineDefinition machineDefinition3 = ((a.h) aVar3).f16672a;
                                b.a aVar5 = com.dyson.mobile.android.b.A;
                                bVar8.o(inboxActivity, machineDefinition3, null);
                            } else if (aVar3 instanceof a.i) {
                                com.dyson.mobile.android.b bVar9 = inboxActivity.f14245l;
                                if (bVar9 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                MachineDefinition machineDefinition4 = ((a.i) aVar3).f16673a;
                                b.a aVar6 = com.dyson.mobile.android.b.A;
                                bVar9.o(inboxActivity, machineDefinition4, null);
                            } else if (aVar3 instanceof a.k) {
                                com.dyson.mobile.android.b bVar10 = inboxActivity.f14245l;
                                if (bVar10 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar10.m(inboxActivity, ((a.k) aVar3).f16677a);
                            } else if (aVar3 instanceof a.l) {
                                com.dyson.mobile.android.b bVar11 = inboxActivity.f14245l;
                                if (bVar11 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                a.l lVar = (a.l) aVar3;
                                bVar11.o(inboxActivity, lVar.f16680a, lVar.f16681b);
                            } else if (x12.r.c(aVar3, a.m.f16682a)) {
                                if (inboxActivity.f14245l == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                            } else if (aVar3 instanceof a.n) {
                                com.dyson.mobile.android.b bVar12 = inboxActivity.f14245l;
                                if (bVar12 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                a.n nVar = (a.n) aVar3;
                                bVar12.q(inboxActivity, nVar.f16683a, nVar.f16684b, nVar.f16685c, nVar.d);
                            } else {
                                inboxActivity.finish();
                                inboxActivity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                            }
                        } else if (!(bVar2 instanceof b.a)) {
                            ma.e.o();
                            return null;
                        } else if (inboxActivity.f14245l == null) {
                            x12.r.i("coordinator");
                            throw null;
                        } else {
                            b.a aVar7 = (b.a) bVar2;
                            String str3 = aVar7.f14264a;
                            String str4 = aVar7.f14265b;
                            String str5 = aVar7.f14266c;
                            b.a aVar8 = com.dyson.mobile.android.b.A;
                            d72.a.v(str3, str4, str5);
                            SalesforceMarketingCloudWebViewActivity.f16663k.getClass();
                            inboxActivity.startActivity(SalesforceMarketingCloudWebViewActivity.a.a(inboxActivity, str3, str4, str5));
                        }
                        return f0.f36844a;
                    default:
                        f0 f0Var = (f0) obj;
                        InboxActivity.a aVar9 = InboxActivity.f14242n;
                        InboxActivity inboxActivity2 = this.e;
                        inboxActivity2.finish();
                        inboxActivity2.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        return f0.f36844a;
                }
            }
        }));
        ((com.dyson.mobile.android.inbox.a) d0Var.getValue()).f14255k.observe(this, new b(new Function1(this) { // from class: v90.g
            public final /* synthetic */ InboxActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (r2) {
                    case 0:
                        com.dyson.mobile.android.inbox.b bVar2 = (com.dyson.mobile.android.inbox.b) obj;
                        InboxActivity.a aVar2 = InboxActivity.f14242n;
                        bVar2.getClass();
                        boolean z13 = bVar2 instanceof b.C0464b;
                        InboxActivity inboxActivity = this.e;
                        if (z13) {
                            com.dyson.mobile.android.salesforce.a aVar3 = ((b.C0464b) bVar2).f14267a;
                            if (aVar3 instanceof a.c) {
                                com.dyson.mobile.android.b bVar3 = inboxActivity.f14245l;
                                if (bVar3 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar3.z(inboxActivity, ((a.c) aVar3).f16667a.d.d);
                            } else if (x12.r.c(aVar3, a.d.f16668a)) {
                                com.dyson.mobile.android.b bVar4 = inboxActivity.f14245l;
                                if (bVar4 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar4.y(inboxActivity, true, null);
                            } else if (aVar3 instanceof a.j) {
                                a.j jVar = (a.j) aVar3;
                                String str = jVar.f16675b;
                                MachineDefinition machineDefinition = jVar.f16674a;
                                String str2 = jVar.f16676c;
                                com.dyson.mobile.android.b bVar5 = inboxActivity.f14245l;
                                if (str2 != null) {
                                    if (bVar5 == null) {
                                        x12.r.i("coordinator");
                                        throw null;
                                    }
                                    com.dyson.mobile.android.b.l(inboxActivity, machineDefinition, str, str2);
                                } else if (bVar5 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                } else {
                                    com.dyson.mobile.android.b.k(inboxActivity, machineDefinition, str);
                                }
                            } else if (x12.r.c(aVar3, a.e.f16669a)) {
                                com.dyson.mobile.android.b bVar6 = inboxActivity.f14245l;
                                if (bVar6 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar6.n(inboxActivity);
                            } else if (aVar3 instanceof a.f) {
                                if (inboxActivity.f14245l == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                com.dyson.mobile.android.b.j(inboxActivity, ((a.f) aVar3).f16670a);
                            } else if (aVar3 instanceof a.g) {
                                com.dyson.mobile.android.b bVar7 = inboxActivity.f14245l;
                                if (bVar7 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                MachineDefinition machineDefinition2 = ((a.g) aVar3).f16671a;
                                b.a aVar4 = com.dyson.mobile.android.b.A;
                                bVar7.o(inboxActivity, machineDefinition2, null);
                            } else if (aVar3 instanceof a.h) {
                                com.dyson.mobile.android.b bVar8 = inboxActivity.f14245l;
                                if (bVar8 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                MachineDefinition machineDefinition3 = ((a.h) aVar3).f16672a;
                                b.a aVar5 = com.dyson.mobile.android.b.A;
                                bVar8.o(inboxActivity, machineDefinition3, null);
                            } else if (aVar3 instanceof a.i) {
                                com.dyson.mobile.android.b bVar9 = inboxActivity.f14245l;
                                if (bVar9 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                MachineDefinition machineDefinition4 = ((a.i) aVar3).f16673a;
                                b.a aVar6 = com.dyson.mobile.android.b.A;
                                bVar9.o(inboxActivity, machineDefinition4, null);
                            } else if (aVar3 instanceof a.k) {
                                com.dyson.mobile.android.b bVar10 = inboxActivity.f14245l;
                                if (bVar10 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                bVar10.m(inboxActivity, ((a.k) aVar3).f16677a);
                            } else if (aVar3 instanceof a.l) {
                                com.dyson.mobile.android.b bVar11 = inboxActivity.f14245l;
                                if (bVar11 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                a.l lVar = (a.l) aVar3;
                                bVar11.o(inboxActivity, lVar.f16680a, lVar.f16681b);
                            } else if (x12.r.c(aVar3, a.m.f16682a)) {
                                if (inboxActivity.f14245l == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                            } else if (aVar3 instanceof a.n) {
                                com.dyson.mobile.android.b bVar12 = inboxActivity.f14245l;
                                if (bVar12 == null) {
                                    x12.r.i("coordinator");
                                    throw null;
                                }
                                a.n nVar = (a.n) aVar3;
                                bVar12.q(inboxActivity, nVar.f16683a, nVar.f16684b, nVar.f16685c, nVar.d);
                            } else {
                                inboxActivity.finish();
                                inboxActivity.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                            }
                        } else if (!(bVar2 instanceof b.a)) {
                            ma.e.o();
                            return null;
                        } else if (inboxActivity.f14245l == null) {
                            x12.r.i("coordinator");
                            throw null;
                        } else {
                            b.a aVar7 = (b.a) bVar2;
                            String str3 = aVar7.f14264a;
                            String str4 = aVar7.f14265b;
                            String str5 = aVar7.f14266c;
                            b.a aVar8 = com.dyson.mobile.android.b.A;
                            d72.a.v(str3, str4, str5);
                            SalesforceMarketingCloudWebViewActivity.f16663k.getClass();
                            inboxActivity.startActivity(SalesforceMarketingCloudWebViewActivity.a.a(inboxActivity, str3, str4, str5));
                        }
                        return f0.f36844a;
                    default:
                        f0 f0Var = (f0) obj;
                        InboxActivity.a aVar9 = InboxActivity.f14242n;
                        InboxActivity inboxActivity2 = this.e;
                        inboxActivity2.finish();
                        inboxActivity2.overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        return f0.f36844a;
                }
            }
        }));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f14243j;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = qb.f57667a;
        ij.b bVar = new ij.b("user_management.my_account.inbox", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/inbox/InboxActivity$a;", "", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
