package com.dyson.mobile.android.interactableec.aqreport;

import androidx.compose.runtime.d;
import ba0.c;
import dz1.r;
import h12.f0;
import hj.e;
import im1.zb;
import java.util.List;
import jd0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import u3.k1;
import u3.y2;
import zc0.l;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a;", "Lm9/u;", "Ljd0/c;", "ecFilterStatusProvider", "Lad0/a;", "airQualityMonthlyReportProvider", "Ldz1/r;", "Lo60/a;", "interactableMachineState", "Laa0/c;", "reportToReportUIStateMapper", "Lhj/e;", "trackingManager", "Lzc0/l;", "continuousMonitoringController", "<init>", "(Ljd0/c;Lad0/a;Ldz1/r;Laa0/c;Lhj/e;Lzc0/l;)V", "a", "b", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f14285p = 0;
    public final c d;
    public final ad0.a e;

    /* renamed from: f  reason: collision with root package name */
    public final r<o60.a> f14286f;

    /* renamed from: g  reason: collision with root package name */
    public final aa0.c f14287g;

    /* renamed from: h  reason: collision with root package name */
    public final e f14288h;

    /* renamed from: i  reason: collision with root package name */
    public final l f14289i;

    /* renamed from: j  reason: collision with root package name */
    public final k1<ba0.c> f14290j;

    /* renamed from: k  reason: collision with root package name */
    public final xf1.a<f0> f14291k;

    /* renamed from: l  reason: collision with root package name */
    public final xf1.a<f0> f14292l;

    /* renamed from: m  reason: collision with root package name */
    public final xf1.a<f0> f14293m;

    /* renamed from: n  reason: collision with root package name */
    public final xf1.a<dd0.a> f14294n;

    /* renamed from: o  reason: collision with root package name */
    public final gz1.b f14295o;

    static {
        new C0466a(null);
    }

    public a(c cVar, ad0.a aVar, r<o60.a> rVar, aa0.c cVar2, e eVar, l lVar) {
        cVar.getClass();
        aVar.getClass();
        rVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        this.d = cVar;
        this.e = aVar;
        this.f14286f = rVar;
        this.f14287g = cVar2;
        this.f14288h = eVar;
        this.f14289i = lVar;
        this.f14290j = d.j(c.C0219c.f7449a);
        this.f14291k = new xf1.a<>();
        this.f14292l = new xf1.a<>();
        this.f14293m = new xf1.a<>();
        this.f14294n = new xf1.a<>();
        this.f14295o = new gz1.b();
    }

    public final void S(boolean z13) {
        r<Boolean> rVar;
        y2 y2Var = (y2) this.f14290j;
        if ((y2Var.getValue() instanceof c.d) && z13) {
            l lVar = this.f14289i;
            zb.z(this.f14295o, (lVar == null || (rVar = lVar.f92420g) == null) ? null : rVar.O(new xx0.e(new y90.c(this, 1), 20)));
        } else if ((y2Var.getValue() instanceof c.d) && !z13) {
            Object value = y2Var.getValue();
            value.getClass();
            y2Var.setValue(new c.d(((c.d) value).f7450a, false));
        } else if (y2Var.getValue() instanceof c.a) {
            Object value2 = y2Var.getValue();
            value2.getClass();
            c.a aVar = (c.a) value2;
            dd0.d dVar = aVar.f7443a;
            List<kd0.a> list = aVar.f7444b;
            ba0.a aVar2 = aVar.f7445c;
            ba0.b bVar = aVar.d;
            String str = aVar.e;
            boolean z14 = aVar.f7447g;
            dVar.getClass();
            list.getClass();
            aVar2.getClass();
            bVar.getClass();
            str.getClass();
            y2Var.setValue(new c.a(dVar, list, aVar2, bVar, str, z13, z14));
        }
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.f14295o.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$a;", "", "<init>", "()V", "", "AQ_DATA_SUCCESS", "Ljava/lang/String;", "AQ_NO_DATA", "AQ_DATA_ERROR", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.aqreport.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0466a {
        public /* synthetic */ C0466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0466a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$b;", "", "<init>", "()V", "b", "a", "d", "e", "c", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b$a;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b$b;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b$c;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b$d;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b$e;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$b$a;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.interactableec.aqreport.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0467a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0467a f14296a = new C0467a();

            private C0467a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$b$b;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.interactableec.aqreport.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0468b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0468b f14297a = new C0468b();

            private C0468b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$b$c;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b;", "", "isTurnedOn", "<init>", "(Z)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f14298a;

            public c(boolean z13) {
                super(null);
                this.f14298a = z13;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$b$d;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b;", "Ldd0/a;", "dominantPollutant", "<init>", "(Ldd0/a;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public final dd0.a f14299a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(dd0.a aVar) {
                super(null);
                aVar.getClass();
                this.f14299a = aVar;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/aqreport/a$b$e;", "Lcom/dyson/mobile/android/interactableec/aqreport/a$b;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class e extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final e f14300a = new e();

            private e() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
