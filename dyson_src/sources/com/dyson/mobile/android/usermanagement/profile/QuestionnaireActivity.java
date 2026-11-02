package com.dyson.mobile.android.usermanagement.profile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.usermanagement.profile.a;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireActivityPayload;
import com.dyson.mobile.android.usermanagement.profile.model.QuizAnswers;
import ee1.e;
import f.j;
import f.x;
import h12.f0;
import he1.h;
import hj.e;
import i3.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import m9.v;
import mj.a;
import mj.b;
import ne1.b;
import nj.f9;
import nj.g9;
import u3.k1;
import u3.y2;
import we1.a;
import x12.m;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import z32.g0;
import z32.z;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/QuestionnaireActivity;", "Lf/g;", "<init>", "()V", "a", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionnaireActivity extends f.g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f16965o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public a.b f16966j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f16967k = new d0(p0.f86717a.b(com.dyson.mobile.android.usermanagement.profile.a.class), new f(this), new e(d.d, this, new he1.b(this, 0)), new g(null, this));

    /* renamed from: l  reason: collision with root package name */
    public ee1.e f16968l;

    /* renamed from: m  reason: collision with root package name */
    public String f16969m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f16970n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<a.c, f0> {
        public b(Object obj) {
            super(1, obj, com.dyson.mobile.android.usermanagement.profile.a.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/usermanagement/profile/QuestionnaireViewModel$QuestionnaireViewModelEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(a.c cVar) {
            List<je1.e> list;
            je1.g gVar;
            a.c cVar2 = cVar;
            cVar2.getClass();
            com.dyson.mobile.android.usermanagement.profile.a aVar = (com.dyson.mobile.android.usermanagement.profile.a) this.receiver;
            le1.a aVar2 = aVar.e;
            k1 k1Var = aVar.f16981k;
            hj.e eVar = aVar.f16976f;
            Object obj = null;
            if (cVar2 instanceof a.c.C0621c) {
                if (aVar.f16984n != null) {
                    qe1.a aVar3 = qe1.a.HAIR_PROFILE_QUESTIONNAIRE_ABANDONED;
                    aVar2.getClass();
                    aVar3.getClass();
                    aVar2.f51760a.b(aVar3.getId(), "confirmation_content_id");
                }
                ij.f a13 = new mj.a(a.b.QUESTIONNAIRE_CANCEL, (a.EnumC1668a) null, (String) null, 6, (DefaultConstructorMarker) null).a();
                e.a aVar4 = hj.e.f38312g;
                eVar.g(a13, null);
                aVar.f16982l.setValue(f0.f36844a);
            } else if (cVar2 instanceof a.c.e) {
                ij.f a14 = new mj.b(b.a.QUESTIONNAIRE_CANCEL).a();
                e.a aVar5 = hj.e.f38312g;
                eVar.g(a14, null);
            } else if (cVar2 instanceof a.c.j) {
                String str = aVar.f16985o;
                int i13 = f9.f57481a;
                str.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                a.f.f52149a.getClass();
                linkedHashMap.put(a.f.f52150b, str);
                a.g.f52151a.getClass();
                ij.b e = ma.e.e(linkedHashMap, a.g.f52152b, "", "profile.questionnaire.start_page", linkedHashMap);
                e.a aVar6 = hj.e.f38312g;
                eVar.h(e, null);
            } else if (cVar2 instanceof a.c.h) {
                int i14 = g9.f57498a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                a.f.f52149a.getClass();
                linkedHashMap2.put(a.f.f52150b, "UNKNOWN_CATEGORY");
                a.g.f52151a.getClass();
                ij.b e13 = ma.e.e(linkedHashMap2, a.g.f52152b, "questionnaire_unavailable", "profile.questionnaire.unavailable", linkedHashMap2);
                e.a aVar7 = hj.e.f38312g;
                eVar.h(e13, null);
            } else if (cVar2 instanceof a.c.b) {
                ne1.b bVar = (ne1.b) ((y2) k1Var).getValue();
                if (bVar instanceof b.C1733b) {
                    aVar.T(aVar.f16984n, ((b.C1733b) bVar).f57002c - 1);
                } else if ((bVar instanceof b.c) && (gVar = aVar.f16984n) != null) {
                    aVar.T(gVar, gVar.d.size() - 1);
                }
            } else if (cVar2 instanceof a.c.k) {
                a.c.k kVar = (a.c.k) cVar2;
                Function1<String, f0> function1 = kVar.f16998a;
                w12.a<f0> aVar8 = kVar.f16999b;
                g0.i(v.a(aVar).d);
                g0.r(v.a(aVar), new he1.e(z.Z0, aVar, function1, aVar8), null, new he1.f(aVar, function1, null), 2);
            } else if (cVar2 instanceof a.c.C0620a) {
                QuizAnswers quizAnswers = ((a.c.C0620a) cVar2).f16986a;
                String str2 = quizAnswers.d;
                List<String> list2 = quizAnswers.e;
                je1.g gVar2 = aVar.f16984n;
                if (gVar2 != null) {
                    Iterator<T> it = gVar2.d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (r.c(((je1.d) next).f44930a, str2)) {
                            obj = next;
                            break;
                        }
                    }
                    je1.d dVar = (je1.d) obj;
                    if (dVar != null && (list = dVar.f44932c) != null) {
                        for (je1.e eVar2 : list) {
                            eVar2.f44940g = list2.contains(eVar2.f44936a);
                        }
                    }
                    String str3 = gVar2.f44945b;
                    ArrayList E = n.E(gVar2);
                    aVar2.getClass();
                    y70.a aVar9 = aVar2.f51760a;
                    aVar9.putString("saved_questionnaire_version", str3);
                    aVar9.putString("questionnaire_answers", aVar2.f51761b.toJson(E));
                }
            } else if (cVar2 instanceof a.c.d) {
                a.c.d dVar2 = (a.c.d) cVar2;
                aVar.T(aVar.f16984n, dVar2.f16989a);
                aVar.S(dVar2.f16990b);
            } else if (cVar2 instanceof a.c.g) {
                je1.g gVar3 = aVar.f16984n;
                if (gVar3 != null) {
                    ((y2) k1Var).setValue(new b.c(gVar3.d));
                }
                aVar.S(((a.c.g) cVar2).f16993a);
            } else if (cVar2 instanceof a.c.f) {
                aVar.T(aVar.f16984n, ((a.c.f) cVar2).f16992a);
            } else if (!(cVar2 instanceof a.c.i)) {
                ma.e.o();
                return null;
            } else {
                w12.a<f0> aVar10 = ((a.c.i) cVar2).f16996a;
                g0.i(v.a(aVar).d);
                g0.r(v.a(aVar), new he1.g(z.Z0, aVar, aVar10), null, new h(aVar, null), 2);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements m9.p, m {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements w12.a<Bundle> {
        public static final d d = new d();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f16971f;

        public e(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f16971f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f16971f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.g gVar) {
            super(0);
            this.f16972f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16972f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16973f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16974g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, f.g gVar) {
            super(0);
            this.f16973f = aVar;
            this.f16974g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16973f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16974g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.usermanagement.profile.a Y0() {
        return (com.dyson.mobile.android.usermanagement.profile.a) this.f16967k.getValue();
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Missing argument, please use the newInstance method";
        Bundle a14 = a13.a("PAYLOAD");
        Object a15 = k7.b.a(a14, "PAYLOAD", QuestionnaireActivityPayload.class);
        if (a15 == null) {
            pa.c.w("PAYLOAD was null");
            return;
        }
        this.f16969m = ((QuestionnaireActivityPayload) ((Parcelable) a15)).d;
        this.f16970n = a14.getBoolean("FINISH_ACTIVITY_ON_RESULT", false);
        fe1.a aVar = new fe1.a(0);
        aVar.f30666a = new ge1.a(this);
        this.f16966j = (a.b) new fe1.b(aVar.f30666a).f30675k.f88315a;
        ee1.e.f26806c.getClass();
        this.f16968l = e.a.a(this);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(276499010, true, new he1.a(this, 0)));
        Y0().f16982l.observe(this, new c(new he1.b(this, 1)));
        Y0().f16983m.observe(this, new c(new he1.b(this, 2)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/QuestionnaireActivity$a;", "", "<init>", "()V", "", "PAYLOAD", "Ljava/lang/String;", "FINISH_ACTIVITY_ON_RESULT", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
