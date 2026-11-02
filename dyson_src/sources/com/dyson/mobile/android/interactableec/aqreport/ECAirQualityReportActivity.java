package com.dyson.mobile.android.interactableec.aqreport;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import ba0.c;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.interactableec.aqreport.ECAirQualityReportActivity;
import com.dyson.mobile.android.interactableec.aqreport.a;
import dz1.x;
import f.g;
import h12.f0;
import h12.h;
import hx.v;
import im1.zb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import mj.m;
import o60.a;
import u3.y2;
import w90.g;
import we1.a;
import x12.m;
import x12.o0;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import z60.b0;
import zc0.l;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/ECAirQualityReportActivity;", "Lf/g;", "<init>", "()V", "b", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECAirQualityReportActivity extends g {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14278m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14279j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f14280k = new d0(p0.f86717a.b(com.dyson.mobile.android.interactableec.aqreport.a.class), new e(this), new wr.a(this, 21), new f(null, this));

    /* renamed from: l  reason: collision with root package name */
    public w90.g f14281l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/ECAirQualityReportActivity$b;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "NOTIFICATION", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b STANDARD = new b("STANDARD", 0);
        public static final b NOTIFICATION = new b("NOTIFICATION", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{STANDARD, NOTIFICATION};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private b(String str, int i13) {
        }

        public static o12.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements Function1<a.b, f0> {
        public c(Object obj) {
            super(1, obj, com.dyson.mobile.android.interactableec.aqreport.a.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/interactableec/aqreport/ECAirQualityReportViewModel$ECAirQualityReportViewModelEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(a.b bVar) {
            a.b bVar2 = bVar;
            bVar2.getClass();
            com.dyson.mobile.android.interactableec.aqreport.a aVar = (com.dyson.mobile.android.interactableec.aqreport.a) this.receiver;
            aVar.getClass();
            if (bVar2 instanceof a.b.C0468b) {
                aVar.f14291k.setValue(f0.f36844a);
            } else if (bVar2 instanceof a.b.C0467a) {
                aVar.f14292l.setValue(f0.f36844a);
            } else if (bVar2 instanceof a.b.d) {
                aVar.f14294n.setValue(((a.b.d) bVar2).f14299a);
            } else if (bVar2 instanceof a.b.e) {
                aVar.f14293m.setValue(f0.f36844a);
            } else {
                mz1.e eVar = null;
                if (!(bVar2 instanceof a.b.c)) {
                    ma.e.o();
                    return null;
                }
                boolean z13 = ((a.b.c) bVar2).f14298a;
                gz1.b bVar3 = aVar.f14295o;
                l lVar = aVar.f14289i;
                if (lVar != null) {
                    eVar = lVar.m(z13).x(new xx0.e(new y90.d(0), 24), new ed0.a(aVar, z13, 13));
                }
                zb.z(bVar3, eVar);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements m9.p, m {
        public final /* synthetic */ Function1 d;

        public d(Function1 function1) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f14282f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g gVar) {
            super(0);
            this.f14282f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14282f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14283f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f14284g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, g gVar) {
            super(0);
            this.f14283f = aVar;
            this.f14284g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14283f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14284g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.interactableec.aqreport.a Y0() {
        return (com.dyson.mobile.android.interactableec.aqreport.a) this.f14280k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.dyson.mobile.android.interactableec.aqreport.ECAirQualityReportActivity$b, T] */
    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        o0 o0Var = new o0();
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to create a ECAirQualityReportActivity Intent";
        Bundle a14 = a13.a("COORDINATOR_ID");
        String y13 = fm1.o0.y("COORDINATOR_ID", a14);
        w90.g.f85506o.getClass();
        w90.g a15 = g.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14281l = a15;
        this.f14279j = a15.f85510j.a();
        String string = a14.getString("NAVIGATION_STATE");
        if (string == null) {
            pa.c.p("Required value was null.");
            return;
        }
        o0Var.d = b.valueOf(string);
        se1.a.a(this, true, true);
        g.f.a(this, new c4.c(503504619, true, new y90.a(this, o0Var, 0)));
        Y0().f14291k.observe(this, new d(new Function1(this) { // from class: y90.b
            public final /* synthetic */ ECAirQualityReportActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                ECAirQualityReportActivity eCAirQualityReportActivity = this.e;
                switch (i13) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        ECAirQualityReportActivity.a aVar = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        ECAirQualityReportActivity.a aVar2 = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 2:
                        ECAirQualityReportActivity.a aVar3 = ECAirQualityReportActivity.f14278m;
                        ((f0) obj).getClass();
                        w90.g gVar = eCAirQualityReportActivity.f14281l;
                        if (gVar != null) {
                            gVar.x(eCAirQualityReportActivity, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_FILTER_MANAGEMENT, new ExternalLinkTracking("parts_and_accessories", m.a.AQ_REPORT, null, null, 12, null));
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                    default:
                        dd0.a aVar4 = (dd0.a) obj;
                        ECAirQualityReportActivity.a aVar5 = ECAirQualityReportActivity.f14278m;
                        aVar4.getClass();
                        w90.g gVar2 = eCAirQualityReportActivity.f14281l;
                        if (gVar2 != null) {
                            gVar2.u(eCAirQualityReportActivity, aVar4.toEnvironmentHistoryGraphType());
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                }
            }
        }));
        Y0().f14292l.observe(this, new d(new Function1(this) { // from class: y90.b
            public final /* synthetic */ ECAirQualityReportActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                ECAirQualityReportActivity eCAirQualityReportActivity = this.e;
                switch (i13) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        ECAirQualityReportActivity.a aVar = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        ECAirQualityReportActivity.a aVar2 = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 2:
                        ECAirQualityReportActivity.a aVar3 = ECAirQualityReportActivity.f14278m;
                        ((f0) obj).getClass();
                        w90.g gVar = eCAirQualityReportActivity.f14281l;
                        if (gVar != null) {
                            gVar.x(eCAirQualityReportActivity, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_FILTER_MANAGEMENT, new ExternalLinkTracking("parts_and_accessories", m.a.AQ_REPORT, null, null, 12, null));
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                    default:
                        dd0.a aVar4 = (dd0.a) obj;
                        ECAirQualityReportActivity.a aVar5 = ECAirQualityReportActivity.f14278m;
                        aVar4.getClass();
                        w90.g gVar2 = eCAirQualityReportActivity.f14281l;
                        if (gVar2 != null) {
                            gVar2.u(eCAirQualityReportActivity, aVar4.toEnvironmentHistoryGraphType());
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                }
            }
        }));
        Y0().f14293m.observe(this, new d(new Function1(this) { // from class: y90.b
            public final /* synthetic */ ECAirQualityReportActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                ECAirQualityReportActivity eCAirQualityReportActivity = this.e;
                switch (i13) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        ECAirQualityReportActivity.a aVar = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        ECAirQualityReportActivity.a aVar2 = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 2:
                        ECAirQualityReportActivity.a aVar3 = ECAirQualityReportActivity.f14278m;
                        ((f0) obj).getClass();
                        w90.g gVar = eCAirQualityReportActivity.f14281l;
                        if (gVar != null) {
                            gVar.x(eCAirQualityReportActivity, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_FILTER_MANAGEMENT, new ExternalLinkTracking("parts_and_accessories", m.a.AQ_REPORT, null, null, 12, null));
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                    default:
                        dd0.a aVar4 = (dd0.a) obj;
                        ECAirQualityReportActivity.a aVar5 = ECAirQualityReportActivity.f14278m;
                        aVar4.getClass();
                        w90.g gVar2 = eCAirQualityReportActivity.f14281l;
                        if (gVar2 != null) {
                            gVar2.u(eCAirQualityReportActivity, aVar4.toEnvironmentHistoryGraphType());
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                }
            }
        }));
        Y0().f14294n.observe(this, new d(new Function1(this) { // from class: y90.b
            public final /* synthetic */ ECAirQualityReportActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                ECAirQualityReportActivity eCAirQualityReportActivity = this.e;
                switch (i13) {
                    case 0:
                        f0 f0Var = (f0) obj;
                        ECAirQualityReportActivity.a aVar = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 1:
                        f0 f0Var2 = (f0) obj;
                        ECAirQualityReportActivity.a aVar2 = ECAirQualityReportActivity.f14278m;
                        eCAirQualityReportActivity.getOnBackPressedDispatcher().d();
                        return f0.f36844a;
                    case 2:
                        ECAirQualityReportActivity.a aVar3 = ECAirQualityReportActivity.f14278m;
                        ((f0) obj).getClass();
                        w90.g gVar = eCAirQualityReportActivity.f14281l;
                        if (gVar != null) {
                            gVar.x(eCAirQualityReportActivity, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_FILTER_MANAGEMENT, new ExternalLinkTracking("parts_and_accessories", m.a.AQ_REPORT, null, null, 12, null));
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                    default:
                        dd0.a aVar4 = (dd0.a) obj;
                        ECAirQualityReportActivity.a aVar5 = ECAirQualityReportActivity.f14278m;
                        aVar4.getClass();
                        w90.g gVar2 = eCAirQualityReportActivity.f14281l;
                        if (gVar2 != null) {
                            gVar2.u(eCAirQualityReportActivity, aVar4.toEnvironmentHistoryGraphType());
                            return f0.f36844a;
                        }
                        r.i("coordinator");
                        throw null;
                }
            }
        }));
        com.dyson.mobile.android.interactableec.aqreport.a Y0 = Y0();
        ((y2) Y0.f14290j).setValue(c.C0219c.f7449a);
        gz1.b bVar = Y0.f14295o;
        x<List<kd0.a>> a16 = Y0.d.a();
        ad0.a aVar = Y0.e;
        sz1.t tVar = aVar.f1085a.f7613a;
        a20.g gVar = new a20.g(new a01.l(aVar, 16), 8);
        tVar.getClass();
        b.a aVar2 = kz1.b.f50218a;
        zb.z(bVar, new sz1.h(x.u(a16, new sz1.t(tVar, gVar), Y0.f14286f.x().k(new a.c(b0.CONNECTION_FAILURE)), new xx0.e(new x81.h(Y0, 4), 21)).r(c02.a.f10004c).j(fz1.a.a()), new s70.b(Y0, 26)).p(new xx0.e(new y90.c(Y0, 2), 22), new xx0.e(new y90.c(Y0, 3), 23)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/ECAirQualityReportActivity$a;", "", "<init>", "()V", "", "NAVIGATION_STATE", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
