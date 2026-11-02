package com.dyson.mobile.android.usermanagement.profile;

import androidx.compose.runtime.d;
import b0.y1;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireActivityPayload;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireStartInfo;
import com.dyson.mobile.android.usermanagement.profile.model.QuizAnswers;
import com.dyson.mobile.android.usermanagement.profile.model.StartPageContent;
import ee1.j;
import h12.f0;
import hj.e;
import i12.c0;
import java.util.List;
import je1.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import mj.x;
import ne1.b;
import nj.e9;
import pf0.f;
import rf0.i;
import rf0.i0;
import u3.k1;
import u3.y2;
import x12.r;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a;", "Lm9/u;", "Lee1/j;", "userProfileManager", "Lle1/a;", "questionnaireDataStore", "Lhj/e;", "trackingManager", "Lb81/a;", "hairProfileUpdateListenerManager", "Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireActivityPayload;", "questionnairePayload", "<init>", "(Lee1/j;Lle1/a;Lhj/e;Lb81/a;Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireActivityPayload;)V", "b", "c", "a", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f16975p = 0;
    public final j d;
    public final le1.a e;

    /* renamed from: f  reason: collision with root package name */
    public final e f16976f;

    /* renamed from: g  reason: collision with root package name */
    public final b81.a f16977g;

    /* renamed from: h  reason: collision with root package name */
    public final QuestionnaireActivityPayload f16978h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16979i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16980j;

    /* renamed from: k  reason: collision with root package name */
    public final k1 f16981k;

    /* renamed from: l  reason: collision with root package name */
    public final xf1.a<f0> f16982l;

    /* renamed from: m  reason: collision with root package name */
    public final xf1.a<f0> f16983m;

    /* renamed from: n  reason: collision with root package name */
    public g f16984n;

    /* renamed from: o  reason: collision with root package name */
    public final String f16985o;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        a a(QuestionnaireActivityPayload questionnaireActivityPayload);
    }

    static {
        new C0619a(null);
    }

    public a(j jVar, le1.a aVar, e eVar, b81.a aVar2, QuestionnaireActivityPayload questionnaireActivityPayload) {
        jVar.getClass();
        aVar.getClass();
        eVar.getClass();
        aVar2.getClass();
        questionnaireActivityPayload.getClass();
        this.d = jVar;
        this.e = aVar;
        this.f16976f = eVar;
        this.f16977g = aVar2;
        this.f16978h = questionnaireActivityPayload;
        QuestionnaireStartInfo questionnaireStartInfo = questionnaireActivityPayload.e;
        String str = questionnaireStartInfo.d;
        String str2 = questionnaireStartInfo.d;
        this.f16979i = !r.c(str, "UNKNOWN_CATEGORY");
        StartPageContent startPageContent = questionnaireStartInfo.e;
        this.f16980j = startPageContent != null;
        this.f16981k = d.j(r.c(str2, "UNKNOWN_CATEGORY") ? new b.a.c(false) : startPageContent != null ? new b.d(startPageContent.d, startPageContent.e, startPageContent.f17001f, startPageContent.f17002g) : new b.d(f.c(i.f71547a), f.c(i0.Wb), f.c(i0.Xb), f.c(i0.Yb)));
        this.f16982l = new xf1.a<>();
        this.f16983m = new xf1.a<>();
        this.f16985o = str2;
    }

    public final void S(QuizAnswers quizAnswers) {
        g gVar = this.f16984n;
        ij.f a13 = new x(gVar != null ? gVar.f44944a : "", quizAnswers.d, c0.W(quizAnswers.e, null, null, null, null, 63)).a();
        e.a aVar = e.f38312g;
        this.f16976f.g(a13, null);
    }

    public final void T(g gVar, int i13) {
        if (gVar != null) {
            List<je1.d> list = gVar.d;
            ij.b a13 = e9.a(jy1.a.c(this.f16985o, "_", gVar.f44944a, "_", list.get(i13).f44930a), "");
            e.a aVar = e.f38312g;
            this.f16976f.h(a13, null);
            ((y2) this.f16981k).setValue(new b.C1733b(gVar.f44946c, i13, list));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$a;", "", "<init>", "()V", "", "VERSION_MISMATCH_ERROR", "I", "", "SUCCESS", "Ljava/lang/String;", "NOT_SUBMITTED", "DATA_UNAVAILABLE", "QUESTIONNAIRE_UNAVAILABLE", "SEPARATOR", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.usermanagement.profile.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0619a {
        public /* synthetic */ C0619a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0619a() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "", "<init>", "()V", "c", "e", "j", "h", "b", "k", "a", "d", "g", "i", "f", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$a;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$b;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$c;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$d;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$e;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$f;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$g;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$h;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$i;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$j;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c$k;", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$a;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "Lcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;", "questionAnswers", "<init>", "(Lcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.usermanagement.profile.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0620a extends c {

            /* renamed from: a  reason: collision with root package name */
            public final QuizAnswers f16986a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0620a(QuizAnswers quizAnswers) {
                super(null);
                quizAnswers.getClass();
                this.f16986a = quizAnswers;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0620a) && r.c(this.f16986a, ((C0620a) obj).f16986a);
            }

            public final int hashCode() {
                return this.f16986a.hashCode();
            }

            public final String toString() {
                return "OnAnswersUpdated(questionAnswers=" + this.f16986a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$b;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "<init>", "()V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f16987a = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 616976119;
            }

            public final String toString() {
                return "OnBackClicked";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$c;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "<init>", "()V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.usermanagement.profile.a$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0621c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0621c f16988a = new C0621c();

            private C0621c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0621c);
            }

            public final int hashCode() {
                return 1335209016;
            }

            public final String toString() {
                return "OnCloseClicked";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$d;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "", "questionIndex", "Lcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;", "questionAnswers", "<init>", "(ILcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public final int f16989a;

            /* renamed from: b  reason: collision with root package name */
            public final QuizAnswers f16990b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(int i13, QuizAnswers quizAnswers) {
                super(null);
                quizAnswers.getClass();
                this.f16989a = i13;
                this.f16990b = quizAnswers;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return this.f16989a == dVar.f16989a && r.c(this.f16990b, dVar.f16990b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f16990b.hashCode() + (Integer.hashCode(this.f16989a) * 31);
            }

            public final String toString() {
                return "OnContinueClicked(questionIndex=" + this.f16989a + ", questionAnswers=" + this.f16990b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$e;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "<init>", "()V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class e extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final e f16991a = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 544232056;
            }

            public final String toString() {
                return "OnDialogDismissed";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$f;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "", "questionIndex", "<init>", "(I)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class f extends c {

            /* renamed from: a  reason: collision with root package name */
            public final int f16992a;

            public f(int i13) {
                super(null);
                this.f16992a = i13;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f16992a == ((f) obj).f16992a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f16992a);
            }

            public final String toString() {
                return y1.i(this.f16992a, "OnGoToQuestionClicked(questionIndex=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$g;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "Lcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;", "questionAnswers", "Lkotlin/Function0;", "Lh12/f0;", "onError", "<init>", "(Lcom/dyson/mobile/android/usermanagement/profile/model/QuizAnswers;Lw12/a;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class g extends c {

            /* renamed from: a  reason: collision with root package name */
            public final QuizAnswers f16993a;

            /* renamed from: b  reason: collision with root package name */
            public final w12.a<f0> f16994b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(QuizAnswers quizAnswers, w12.a<f0> aVar) {
                super(null);
                quizAnswers.getClass();
                aVar.getClass();
                this.f16993a = quizAnswers;
                this.f16994b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof g) {
                    g gVar = (g) obj;
                    return r.c(this.f16993a, gVar.f16993a) && r.c(this.f16994b, gVar.f16994b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f16994b.hashCode() + (this.f16993a.hashCode() * 31);
            }

            public final String toString() {
                return "OnGoToReviewClicked(questionAnswers=" + this.f16993a + ", onError=" + this.f16994b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$h;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "<init>", "()V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class h extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final h f16995a = new h();

            private h() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return 1876866993;
            }

            public final String toString() {
                return "OnHairProfileUnavailableForUserNavigated";
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$i;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "Lkotlin/Function0;", "Lh12/f0;", "onError", "<init>", "(Lw12/a;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class i extends c {

            /* renamed from: a  reason: collision with root package name */
            public final w12.a<f0> f16996a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(w12.a<f0> aVar) {
                super(null);
                aVar.getClass();
                this.f16996a = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && r.c(this.f16996a, ((i) obj).f16996a);
            }

            public final int hashCode() {
                return this.f16996a.hashCode();
            }

            public final String toString() {
                return "OnReviewSubmitClicked(onError=" + this.f16996a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$j;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "<init>", "()V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class j extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final j f16997a = new j();

            private j() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof j);
            }

            public final int hashCode() {
                return -1252542357;
            }

            public final String toString() {
                return "OnStartPageNavigated";
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/a$c$k;", "Lcom/dyson/mobile/android/usermanagement/profile/a$c;", "Lkotlin/Function1;", "", "Lh12/f0;", "onNext", "Lkotlin/Function0;", "onError", "<init>", "(Lkotlin/jvm/functions/Function1;Lw12/a;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class k extends c {

            /* renamed from: a  reason: collision with root package name */
            public final Function1<String, f0> f16998a;

            /* renamed from: b  reason: collision with root package name */
            public final w12.a<f0> f16999b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public k(Function1<? super String, f0> function1, w12.a<f0> aVar) {
                super(null);
                function1.getClass();
                aVar.getClass();
                this.f16998a = function1;
                this.f16999b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    return r.c(this.f16998a, kVar.f16998a) && r.c(this.f16999b, kVar.f16999b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f16999b.hashCode() + (this.f16998a.hashCode() * 31);
            }

            public final String toString() {
                return "OnStartQuestionnaireClicked(onNext=" + this.f16998a + ", onError=" + this.f16999b + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
