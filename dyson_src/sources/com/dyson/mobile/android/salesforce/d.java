package com.dyson.mobile.android.salesforce;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.salesforce.a;
import com.dyson.mobile.android.salesforce.d;
import com.dyson.mobile.android.salesforce.e;
import com.dyson.mobile.android.usermanagement.profile.QuestionnaireActivity;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireActivityPayload;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireStartInfo;
import ee1.e;
import ee1.j;
import fm1.o0;
import g80.a;
import h12.f0;
import h12.l;
import h12.n;
import hj.e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import m9.v;
import m9.w;
import mj.f0;
import uf0.k;
import v32.y;
import we1.a;
import x12.m;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import x70.i;
import z32.g0;
import z32.z;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/salesforce/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends Fragment {

    /* renamed from: m  reason: collision with root package name */
    public static final a f16689m = new a(null);
    public hu0.d d;
    public hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public e.a f16690f;

    /* renamed from: g  reason: collision with root package name */
    public String f16691g;

    /* renamed from: h  reason: collision with root package name */
    public String f16692h;

    /* renamed from: i  reason: collision with root package name */
    public String f16693i;

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.b f16694j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16695k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f16696l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<String, f0> {
        public b(Object obj) {
            super(1, obj, d.class, "setActionBarTitle", "setActionBarTitle(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(String str) {
            ActionBar supportActionBar;
            String str2 = str;
            d dVar = (d) this.receiver;
            a aVar = d.f16689m;
            dVar.getClass();
            if (str2 != null && !y.r(str2, "https://", false)) {
                androidx.fragment.app.e activity = dVar.getActivity();
                l.b bVar = activity instanceof l.b ? (l.b) activity : null;
                if (bVar != null && (supportActionBar = bVar.getSupportActionBar()) != null) {
                    supportActionBar.u(str2);
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements Function3<Integer, String, Uri, f0> {
        public c(Object obj) {
            super(3, obj, d.class, "errorCallback", "errorCallback(Ljava/lang/Integer;Ljava/lang/String;Landroid/net/Uri;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public final f0 invoke(Integer num, String str, Uri uri) {
            a aVar = d.f16689m;
            ((d) this.receiver).getClass();
            Logger.b("Error loading sfmc uri: ErrorCode:" + num + ", description:" + str + ", Uri:" + uri, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.salesforce.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0599d implements m9.p, m {
        public final /* synthetic */ Function1 d;

        public C0599d(Function1 function1) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f16697f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f16697f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f16697f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16698f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar) {
            super(0);
            this.f16698f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f16698f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f16699f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l lVar) {
            super(0);
            this.f16699f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f16699f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class h extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16700f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f16701g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(w12.a aVar, l lVar) {
            super(0);
            this.f16700f = aVar;
            this.f16701g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16700f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f16701g.getValue();
                androidx.lifecycle.g gVar = wVar instanceof androidx.lifecycle.g ? (androidx.lifecycle.g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public d() {
        q3.a aVar = new q3.a(this, 1);
        l a13 = h12.m.a(n.NONE, new f(new e(this)));
        this.f16696l = new d0(p0.f86717a.b(com.dyson.mobile.android.salesforce.e.class), new g(a13), aVar, new h(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        com.dyson.mobile.android.b.A.getClass();
        com.dyson.mobile.android.b a13 = b.a.a();
        this.f16694j = a13;
        e80.b bVar = (e80.b) a13.f();
        f80.f fVar = bVar.f26210a;
        fVar.getClass();
        this.d = new hu0.d();
        this.e = bVar.f26218f.get();
        fVar.getClass();
        new k(new y70.f(bVar.e.get().getApplicationContext(), "machineOptions"));
        bVar.f();
        eo0.b c13 = bVar.c();
        fVar.getClass();
        j jVar = new ee1.f(bVar.e.get().getApplicationContext()).f26809a;
        if (jVar == null) {
            r.i("userProfileManager");
            throw null;
        }
        fVar.getClass();
        g80.a.f33730c.getClass();
        h80.c cVar = a.C1057a.a().f33731a;
        xy1.h.b(cVar);
        this.f16690f = new e.a(c13, jVar, new com.dyson.mobile.android.salesforce.b(cVar, bVar.f()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("salesforce_marketing_cloud_notification_url", "salesforce_marketing_cloud_notification_type");
        this.f16691g = o0.y("salesforce_marketing_cloud_tracking_id", a13);
        this.f16692h = o0.y("salesforce_marketing_cloud_notification_url", a13);
        this.f16693i = o0.y("salesforce_marketing_cloud_notification_type", a13);
        d0 d0Var = this.f16696l;
        ((com.dyson.mobile.android.salesforce.e) d0Var.getValue()).f16703g.observe(getViewLifecycleOwner(), new C0599d(new Function1(this) { // from class: q51.b
            public final /* synthetic */ com.dyson.mobile.android.salesforce.d e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                androidx.fragment.app.e activity;
                int i13 = r2;
                boolean z13 = true;
                com.dyson.mobile.android.salesforce.d dVar = this.e;
                switch (i13) {
                    case 0:
                        com.dyson.mobile.android.salesforce.a aVar = (com.dyson.mobile.android.salesforce.a) obj;
                        d.a aVar2 = com.dyson.mobile.android.salesforce.d.f16689m;
                        aVar.getClass();
                        androidx.fragment.app.e activity2 = dVar.getActivity();
                        if (activity2 != null) {
                            if (aVar instanceof a.c) {
                                com.dyson.mobile.android.b bVar = dVar.f16694j;
                                if (bVar == null) {
                                    r.i("coordinator");
                                    throw null;
                                }
                                bVar.z(activity2, ((a.c) aVar).f16667a.d.d);
                            } else {
                                if (aVar.equals(a.d.f16668a)) {
                                    com.dyson.mobile.android.b bVar2 = dVar.f16694j;
                                    if (bVar2 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar2.y(activity2, true, null);
                                } else if (aVar instanceof a.j) {
                                    a.j jVar = (a.j) aVar;
                                    String str = jVar.f16675b;
                                    MachineDefinition machineDefinition = jVar.f16674a;
                                    String str2 = jVar.f16676c;
                                    com.dyson.mobile.android.b bVar3 = dVar.f16694j;
                                    if (str2 != null) {
                                        if (bVar3 == null) {
                                            r.i("coordinator");
                                            throw null;
                                        }
                                        com.dyson.mobile.android.b.l(activity2, machineDefinition, str, str2);
                                    } else if (bVar3 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    } else {
                                        com.dyson.mobile.android.b.k(activity2, machineDefinition, str);
                                    }
                                } else if (aVar.equals(a.e.f16669a)) {
                                    com.dyson.mobile.android.b bVar4 = dVar.f16694j;
                                    if (bVar4 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar4.n(activity2);
                                } else if (aVar instanceof a.f) {
                                    if (dVar.f16694j == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    com.dyson.mobile.android.b.j(activity2, ((a.f) aVar).f16670a);
                                } else if (aVar instanceof a.g) {
                                    com.dyson.mobile.android.b bVar5 = dVar.f16694j;
                                    if (bVar5 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition2 = ((a.g) aVar).f16671a;
                                    b.a aVar3 = com.dyson.mobile.android.b.A;
                                    bVar5.o(activity2, machineDefinition2, null);
                                } else if (aVar instanceof a.h) {
                                    com.dyson.mobile.android.b bVar6 = dVar.f16694j;
                                    if (bVar6 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition3 = ((a.h) aVar).f16672a;
                                    b.a aVar4 = com.dyson.mobile.android.b.A;
                                    bVar6.o(activity2, machineDefinition3, null);
                                } else if (aVar instanceof a.i) {
                                    com.dyson.mobile.android.b bVar7 = dVar.f16694j;
                                    if (bVar7 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition4 = ((a.i) aVar).f16673a;
                                    b.a aVar5 = com.dyson.mobile.android.b.A;
                                    bVar7.o(activity2, machineDefinition4, null);
                                } else if (aVar instanceof a.k) {
                                    com.dyson.mobile.android.b bVar8 = dVar.f16694j;
                                    if (bVar8 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar8.m(activity2, ((a.k) aVar).f16677a);
                                } else if (aVar instanceof a.l) {
                                    com.dyson.mobile.android.b bVar9 = dVar.f16694j;
                                    if (bVar9 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    a.l lVar = (a.l) aVar;
                                    bVar9.o(activity2, lVar.f16680a, lVar.f16681b);
                                } else if (aVar.equals(a.m.f16682a)) {
                                    if (dVar.f16694j == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                } else if (aVar instanceof a.n) {
                                    com.dyson.mobile.android.b bVar10 = dVar.f16694j;
                                    if (bVar10 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    a.n nVar = (a.n) aVar;
                                    bVar10.q(activity2, nVar.f16683a, nVar.f16684b, nVar.f16685c, nVar.d);
                                } else if (aVar instanceof a.o) {
                                    e eVar = (e) dVar.f16696l.getValue();
                                    String str3 = ((a.o) aVar).f16686a;
                                    g0.i(v.a(eVar).d);
                                    g0.r(v.a(eVar), new c(z.Z0, eVar), null, new d(eVar, str3, null), 2);
                                }
                                z13 = false;
                            }
                            if (!dVar.f16695k && !z13) {
                                activity2.finish();
                            }
                        }
                        return f0.f36844a;
                    case 1:
                        QuestionnaireStartInfo questionnaireStartInfo = (QuestionnaireStartInfo) obj;
                        d.a aVar6 = com.dyson.mobile.android.salesforce.d.f16689m;
                        androidx.fragment.app.e activity3 = dVar.getActivity();
                        if (activity3 != null) {
                            if (dVar.f16694j == null) {
                                r.i("coordinator");
                                throw null;
                            }
                            questionnaireStartInfo.getClass();
                            b.a aVar7 = com.dyson.mobile.android.b.A;
                            ee1.e.f26806c.getClass();
                            e.a.a(activity3);
                            QuestionnaireActivity.a aVar8 = QuestionnaireActivity.f16965o;
                            QuestionnaireActivityPayload questionnaireActivityPayload = new QuestionnaireActivityPayload(null, questionnaireStartInfo, 1, null);
                            aVar8.getClass();
                            Intent intent = new Intent(activity3, QuestionnaireActivity.class);
                            intent.putExtra("PAYLOAD", questionnaireActivityPayload);
                            intent.putExtra("FINISH_ACTIVITY_ON_RESULT", true);
                            activity3.startActivity(intent);
                        }
                        return f0.f36844a;
                    default:
                        Uri uri = (Uri) obj;
                        d.a aVar9 = com.dyson.mobile.android.salesforce.d.f16689m;
                        uri.getClass();
                        if (!dVar.s(uri) && (activity = dVar.getActivity()) != null) {
                            cd.b.E(uri, activity);
                        }
                        return Boolean.TRUE;
                }
            }
        }));
        ((com.dyson.mobile.android.salesforce.e) d0Var.getValue()).f16704h.observe(getViewLifecycleOwner(), new C0599d(new Function1(this) { // from class: q51.b
            public final /* synthetic */ com.dyson.mobile.android.salesforce.d e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                androidx.fragment.app.e activity;
                int i13 = r2;
                boolean z13 = true;
                com.dyson.mobile.android.salesforce.d dVar = this.e;
                switch (i13) {
                    case 0:
                        com.dyson.mobile.android.salesforce.a aVar = (com.dyson.mobile.android.salesforce.a) obj;
                        d.a aVar2 = com.dyson.mobile.android.salesforce.d.f16689m;
                        aVar.getClass();
                        androidx.fragment.app.e activity2 = dVar.getActivity();
                        if (activity2 != null) {
                            if (aVar instanceof a.c) {
                                com.dyson.mobile.android.b bVar = dVar.f16694j;
                                if (bVar == null) {
                                    r.i("coordinator");
                                    throw null;
                                }
                                bVar.z(activity2, ((a.c) aVar).f16667a.d.d);
                            } else {
                                if (aVar.equals(a.d.f16668a)) {
                                    com.dyson.mobile.android.b bVar2 = dVar.f16694j;
                                    if (bVar2 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar2.y(activity2, true, null);
                                } else if (aVar instanceof a.j) {
                                    a.j jVar = (a.j) aVar;
                                    String str = jVar.f16675b;
                                    MachineDefinition machineDefinition = jVar.f16674a;
                                    String str2 = jVar.f16676c;
                                    com.dyson.mobile.android.b bVar3 = dVar.f16694j;
                                    if (str2 != null) {
                                        if (bVar3 == null) {
                                            r.i("coordinator");
                                            throw null;
                                        }
                                        com.dyson.mobile.android.b.l(activity2, machineDefinition, str, str2);
                                    } else if (bVar3 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    } else {
                                        com.dyson.mobile.android.b.k(activity2, machineDefinition, str);
                                    }
                                } else if (aVar.equals(a.e.f16669a)) {
                                    com.dyson.mobile.android.b bVar4 = dVar.f16694j;
                                    if (bVar4 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar4.n(activity2);
                                } else if (aVar instanceof a.f) {
                                    if (dVar.f16694j == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    com.dyson.mobile.android.b.j(activity2, ((a.f) aVar).f16670a);
                                } else if (aVar instanceof a.g) {
                                    com.dyson.mobile.android.b bVar5 = dVar.f16694j;
                                    if (bVar5 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition2 = ((a.g) aVar).f16671a;
                                    b.a aVar3 = com.dyson.mobile.android.b.A;
                                    bVar5.o(activity2, machineDefinition2, null);
                                } else if (aVar instanceof a.h) {
                                    com.dyson.mobile.android.b bVar6 = dVar.f16694j;
                                    if (bVar6 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition3 = ((a.h) aVar).f16672a;
                                    b.a aVar4 = com.dyson.mobile.android.b.A;
                                    bVar6.o(activity2, machineDefinition3, null);
                                } else if (aVar instanceof a.i) {
                                    com.dyson.mobile.android.b bVar7 = dVar.f16694j;
                                    if (bVar7 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition4 = ((a.i) aVar).f16673a;
                                    b.a aVar5 = com.dyson.mobile.android.b.A;
                                    bVar7.o(activity2, machineDefinition4, null);
                                } else if (aVar instanceof a.k) {
                                    com.dyson.mobile.android.b bVar8 = dVar.f16694j;
                                    if (bVar8 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar8.m(activity2, ((a.k) aVar).f16677a);
                                } else if (aVar instanceof a.l) {
                                    com.dyson.mobile.android.b bVar9 = dVar.f16694j;
                                    if (bVar9 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    a.l lVar = (a.l) aVar;
                                    bVar9.o(activity2, lVar.f16680a, lVar.f16681b);
                                } else if (aVar.equals(a.m.f16682a)) {
                                    if (dVar.f16694j == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                } else if (aVar instanceof a.n) {
                                    com.dyson.mobile.android.b bVar10 = dVar.f16694j;
                                    if (bVar10 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    a.n nVar = (a.n) aVar;
                                    bVar10.q(activity2, nVar.f16683a, nVar.f16684b, nVar.f16685c, nVar.d);
                                } else if (aVar instanceof a.o) {
                                    com.dyson.mobile.android.salesforce.e eVar = (com.dyson.mobile.android.salesforce.e) dVar.f16696l.getValue();
                                    String str3 = ((a.o) aVar).f16686a;
                                    g0.i(v.a(eVar).d);
                                    g0.r(v.a(eVar), new c(z.Z0, eVar), null, new d(eVar, str3, null), 2);
                                }
                                z13 = false;
                            }
                            if (!dVar.f16695k && !z13) {
                                activity2.finish();
                            }
                        }
                        return f0.f36844a;
                    case 1:
                        QuestionnaireStartInfo questionnaireStartInfo = (QuestionnaireStartInfo) obj;
                        d.a aVar6 = com.dyson.mobile.android.salesforce.d.f16689m;
                        androidx.fragment.app.e activity3 = dVar.getActivity();
                        if (activity3 != null) {
                            if (dVar.f16694j == null) {
                                r.i("coordinator");
                                throw null;
                            }
                            questionnaireStartInfo.getClass();
                            b.a aVar7 = com.dyson.mobile.android.b.A;
                            ee1.e.f26806c.getClass();
                            e.a.a(activity3);
                            QuestionnaireActivity.a aVar8 = QuestionnaireActivity.f16965o;
                            QuestionnaireActivityPayload questionnaireActivityPayload = new QuestionnaireActivityPayload(null, questionnaireStartInfo, 1, null);
                            aVar8.getClass();
                            Intent intent = new Intent(activity3, QuestionnaireActivity.class);
                            intent.putExtra("PAYLOAD", questionnaireActivityPayload);
                            intent.putExtra("FINISH_ACTIVITY_ON_RESULT", true);
                            activity3.startActivity(intent);
                        }
                        return f0.f36844a;
                    default:
                        Uri uri = (Uri) obj;
                        d.a aVar9 = com.dyson.mobile.android.salesforce.d.f16689m;
                        uri.getClass();
                        if (!dVar.s(uri) && (activity = dVar.getActivity()) != null) {
                            cd.b.E(uri, activity);
                        }
                        return Boolean.TRUE;
                }
            }
        }));
        int i13 = i.f87137g;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        i iVar = (i) q8.t.inflateInternal(layoutInflater, R.layout.fragment_salesforce_marketing_cloud_webview, viewGroup, false, null);
        hu0.d dVar = this.d;
        if (dVar == null) {
            r.i("embeddedWebViewProvider");
            throw null;
        }
        WebView webView = iVar.e;
        webView.getClass();
        ProgressBar progressBar = iVar.d;
        b bVar = new b(this);
        hu0.e.b(dVar, webView, progressBar, null, null, new Function1(this) { // from class: q51.b
            public final /* synthetic */ com.dyson.mobile.android.salesforce.d e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                androidx.fragment.app.e activity;
                int i132 = r2;
                boolean z13 = true;
                com.dyson.mobile.android.salesforce.d dVar2 = this.e;
                switch (i132) {
                    case 0:
                        com.dyson.mobile.android.salesforce.a aVar = (com.dyson.mobile.android.salesforce.a) obj;
                        d.a aVar2 = com.dyson.mobile.android.salesforce.d.f16689m;
                        aVar.getClass();
                        androidx.fragment.app.e activity2 = dVar2.getActivity();
                        if (activity2 != null) {
                            if (aVar instanceof a.c) {
                                com.dyson.mobile.android.b bVar2 = dVar2.f16694j;
                                if (bVar2 == null) {
                                    r.i("coordinator");
                                    throw null;
                                }
                                bVar2.z(activity2, ((a.c) aVar).f16667a.d.d);
                            } else {
                                if (aVar.equals(a.d.f16668a)) {
                                    com.dyson.mobile.android.b bVar22 = dVar2.f16694j;
                                    if (bVar22 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar22.y(activity2, true, null);
                                } else if (aVar instanceof a.j) {
                                    a.j jVar = (a.j) aVar;
                                    String str = jVar.f16675b;
                                    MachineDefinition machineDefinition = jVar.f16674a;
                                    String str2 = jVar.f16676c;
                                    com.dyson.mobile.android.b bVar3 = dVar2.f16694j;
                                    if (str2 != null) {
                                        if (bVar3 == null) {
                                            r.i("coordinator");
                                            throw null;
                                        }
                                        com.dyson.mobile.android.b.l(activity2, machineDefinition, str, str2);
                                    } else if (bVar3 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    } else {
                                        com.dyson.mobile.android.b.k(activity2, machineDefinition, str);
                                    }
                                } else if (aVar.equals(a.e.f16669a)) {
                                    com.dyson.mobile.android.b bVar4 = dVar2.f16694j;
                                    if (bVar4 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar4.n(activity2);
                                } else if (aVar instanceof a.f) {
                                    if (dVar2.f16694j == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    com.dyson.mobile.android.b.j(activity2, ((a.f) aVar).f16670a);
                                } else if (aVar instanceof a.g) {
                                    com.dyson.mobile.android.b bVar5 = dVar2.f16694j;
                                    if (bVar5 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition2 = ((a.g) aVar).f16671a;
                                    b.a aVar3 = com.dyson.mobile.android.b.A;
                                    bVar5.o(activity2, machineDefinition2, null);
                                } else if (aVar instanceof a.h) {
                                    com.dyson.mobile.android.b bVar6 = dVar2.f16694j;
                                    if (bVar6 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition3 = ((a.h) aVar).f16672a;
                                    b.a aVar4 = com.dyson.mobile.android.b.A;
                                    bVar6.o(activity2, machineDefinition3, null);
                                } else if (aVar instanceof a.i) {
                                    com.dyson.mobile.android.b bVar7 = dVar2.f16694j;
                                    if (bVar7 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    MachineDefinition machineDefinition4 = ((a.i) aVar).f16673a;
                                    b.a aVar5 = com.dyson.mobile.android.b.A;
                                    bVar7.o(activity2, machineDefinition4, null);
                                } else if (aVar instanceof a.k) {
                                    com.dyson.mobile.android.b bVar8 = dVar2.f16694j;
                                    if (bVar8 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    bVar8.m(activity2, ((a.k) aVar).f16677a);
                                } else if (aVar instanceof a.l) {
                                    com.dyson.mobile.android.b bVar9 = dVar2.f16694j;
                                    if (bVar9 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    a.l lVar = (a.l) aVar;
                                    bVar9.o(activity2, lVar.f16680a, lVar.f16681b);
                                } else if (aVar.equals(a.m.f16682a)) {
                                    if (dVar2.f16694j == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                } else if (aVar instanceof a.n) {
                                    com.dyson.mobile.android.b bVar10 = dVar2.f16694j;
                                    if (bVar10 == null) {
                                        r.i("coordinator");
                                        throw null;
                                    }
                                    a.n nVar = (a.n) aVar;
                                    bVar10.q(activity2, nVar.f16683a, nVar.f16684b, nVar.f16685c, nVar.d);
                                } else if (aVar instanceof a.o) {
                                    com.dyson.mobile.android.salesforce.e eVar = (com.dyson.mobile.android.salesforce.e) dVar2.f16696l.getValue();
                                    String str3 = ((a.o) aVar).f16686a;
                                    g0.i(v.a(eVar).d);
                                    g0.r(v.a(eVar), new c(z.Z0, eVar), null, new d(eVar, str3, null), 2);
                                }
                                z13 = false;
                            }
                            if (!dVar2.f16695k && !z13) {
                                activity2.finish();
                            }
                        }
                        return f0.f36844a;
                    case 1:
                        QuestionnaireStartInfo questionnaireStartInfo = (QuestionnaireStartInfo) obj;
                        d.a aVar6 = com.dyson.mobile.android.salesforce.d.f16689m;
                        androidx.fragment.app.e activity3 = dVar2.getActivity();
                        if (activity3 != null) {
                            if (dVar2.f16694j == null) {
                                r.i("coordinator");
                                throw null;
                            }
                            questionnaireStartInfo.getClass();
                            b.a aVar7 = com.dyson.mobile.android.b.A;
                            ee1.e.f26806c.getClass();
                            e.a.a(activity3);
                            QuestionnaireActivity.a aVar8 = QuestionnaireActivity.f16965o;
                            QuestionnaireActivityPayload questionnaireActivityPayload = new QuestionnaireActivityPayload(null, questionnaireStartInfo, 1, null);
                            aVar8.getClass();
                            Intent intent = new Intent(activity3, QuestionnaireActivity.class);
                            intent.putExtra("PAYLOAD", questionnaireActivityPayload);
                            intent.putExtra("FINISH_ACTIVITY_ON_RESULT", true);
                            activity3.startActivity(intent);
                        }
                        return f0.f36844a;
                    default:
                        Uri uri = (Uri) obj;
                        d.a aVar9 = com.dyson.mobile.android.salesforce.d.f16689m;
                        uri.getClass();
                        if (!dVar2.s(uri) && (activity = dVar2.getActivity()) != null) {
                            cd.b.E(uri, activity);
                        }
                        return Boolean.TRUE;
                }
            }
        }, new c(this), null, bVar, null, null, 844);
        String str = this.f16692h;
        if (str != null && !s(Uri.parse(str))) {
            dVar.c(Uri.parse(str));
            this.f16695k = true;
        }
        View root = iVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String str = this.f16693i;
        if (str != null) {
            hj.e eVar = this.e;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            int i13 = nj.p.f57638a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a.k.f52163a.getClass();
            ij.b e13 = ma.e.e(linkedHashMap, a.k.d, str, "common.messaging.notification_web_view", linkedHashMap);
            e.a aVar = hj.e.f38312g;
            eVar.h(e13, null);
        }
    }

    public final boolean s(Uri uri) {
        hj.e eVar = this.e;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        mj.f0 f0Var = new mj.f0(this.f16691g, this.f16693i, f0.a.NOTIFICATION_WEB_VIEW);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(i12.p0.c(new h12.p("web_view_name", f0Var.f54203c.getValue())));
        String str = f0Var.f54201a;
        if (str != null && !y.A(str)) {
            linkedHashMap.put("notification_tracking_id", str);
        }
        String str2 = f0Var.f54202b;
        if (str2 != null && !y.A(str2)) {
            linkedHashMap.put("notification_type", str2);
        }
        ij.f fVar = new ij.f("web_view_click", linkedHashMap);
        e.a aVar = hj.e.f38312g;
        eVar.g(fVar, null);
        com.dyson.mobile.android.salesforce.e eVar2 = (com.dyson.mobile.android.salesforce.e) this.f16696l.getValue();
        eo0.b bVar = eVar2.d;
        uri.getClass();
        com.dyson.mobile.android.salesforce.b bVar2 = eVar2.f16702f;
        String uri2 = uri.toString();
        uri2.getClass();
        com.dyson.mobile.android.salesforce.a a13 = bVar2.a(uri2);
        if (a13 instanceof a.g) {
            String a14 = com.dyson.mobile.android.salesforce.c.a(a13);
            if (a14 != null) {
                bVar.a(new kc0.a(a14, 0, 2, null));
            }
        } else if (a13 instanceof a.h) {
            String a15 = com.dyson.mobile.android.salesforce.c.a(a13);
            if (a15 != null) {
                bVar.a(new kc0.b(a15, 0, 2, null));
            }
        } else if (a13 instanceof a.i) {
            String a16 = com.dyson.mobile.android.salesforce.c.a(a13);
            if (a16 != null) {
                bVar.a(new kc0.c(0, a16, 1, null));
            }
        } else if (r.c(a13, a.C0598a.f16665a) || (a13 instanceof a.b)) {
            return false;
        }
        eVar2.f16703g.setValue(a13);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/salesforce/d$a;", "", "<init>", "()V", "", "SALESFORCE_MARKETING_CLOUD_TRACKING_ID", "Ljava/lang/String;", "SALESFORCE_MARKETING_CLOUD_NOTIFICATION_URL", "SALESFORCE_MARKETING_CLOUD_NOTIFICATION_TYPE", "PROTOCOL", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
