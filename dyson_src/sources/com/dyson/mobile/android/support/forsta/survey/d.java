package com.dyson.mobile.android.support.forsta.survey;

import b42.m;
import b42.n;
import bv1.f;
import c42.f2;
import c42.g2;
import c42.r;
import c42.r1;
import com.dyson.mobile.android.support.forsta.ForstaSurveyConfig;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.util.List;
import kotlin.Metadata;
import m9.u;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d;", "Lm9/u;", "Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;", "surveyConfig", "", "", "machineTypeNames", "Lx71/d;", "forstaSurveyUrlBuilder", "<init>", "(Lcom/dyson/mobile/android/support/forsta/ForstaSurveyConfig;Ljava/util/List;Lx71/d;)V", "b", "c", "d", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u {
    public final ForstaSurveyConfig d;
    public final List<String> e;

    /* renamed from: f  reason: collision with root package name */
    public final x71.d f16835f;

    /* renamed from: g  reason: collision with root package name */
    public final f2 f16836g;

    /* renamed from: h  reason: collision with root package name */
    public final r1 f16837h;

    /* renamed from: i  reason: collision with root package name */
    public final b42.c f16838i;

    /* renamed from: j  reason: collision with root package name */
    public final c42.e f16839j;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        d a(ForstaSurveyConfig forstaSurveyConfig, List<String> list);
    }

    /* loaded from: classes3.dex */
    public interface b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$b$a;", "Lcom/dyson/mobile/android/support/forsta/survey/d$b;", "", "surveySubmitted", "<init>", "(Z)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f16840a;

            public a(boolean z13) {
                this.f16840a = z13;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f16840a == ((a) obj).f16840a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f16840a);
            }

            public final String toString() {
                return d72.a.j("NavigateBack(surveySubmitted=", ")", this.f16840a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$c$a;", "Lcom/dyson/mobile/android/support/forsta/survey/d$c;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16841a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1014683978;
            }

            public final String toString() {
                return "CloseButtonClick";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$c$b;", "Lcom/dyson/mobile/android/support/forsta/survey/d$c;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f16842a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 275103913;
            }

            public final String toString() {
                return "RefreshSurvey";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$c$c;", "Lcom/dyson/mobile/android/support/forsta/survey/d$c;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.forsta.survey.d$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0608c implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0608c f16843a = new C0608c();

            private C0608c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0608c);
            }

            public final int hashCode() {
                return -94417829;
            }

            public final String toString() {
                return "WebViewError";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$c$d;", "Lcom/dyson/mobile/android/support/forsta/survey/d$c;", "", "url", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.forsta.survey.d$c$d  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0609d implements c {

            /* renamed from: a  reason: collision with root package name */
            public final String f16844a;

            public C0609d(String str) {
                str.getClass();
                this.f16844a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0609d) && this.f16844a.equals(((C0609d) obj).f16844a);
            }

            public final int hashCode() {
                return this.f16844a.hashCode();
            }

            public final String toString() {
                return f.e("WebViewUrlChanged(url=", this.f16844a, ")");
            }
        }
    }

    /* renamed from: com.dyson.mobile.android.support.forsta.survey.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0610d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$d$a;", "Lcom/dyson/mobile/android/support/forsta/survey/d$d;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.forsta.survey.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC0610d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16845a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1059376467;
            }

            public final String toString() {
                return EventsNameKt.GENERIC_ERROR_MESSAGE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$d$b;", "Lcom/dyson/mobile/android/support/forsta/survey/d$d;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.forsta.survey.d$d$b */
        /* loaded from: classes3.dex */
        public static final class b implements InterfaceC0610d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f16846a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1969173959;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$d$c;", "Lcom/dyson/mobile/android/support/forsta/survey/d$d;", "", "surveyUrl", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.forsta.survey.d$d$c */
        /* loaded from: classes3.dex */
        public static final class c implements InterfaceC0610d {

            /* renamed from: a  reason: collision with root package name */
            public final String f16847a;

            public c(String str) {
                str.getClass();
                this.f16847a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f16847a.equals(((c) obj).f16847a);
            }

            public final int hashCode() {
                return this.f16847a.hashCode();
            }

            public final String toString() {
                return f.e("Ready(surveyUrl=", this.f16847a, ")");
            }
        }
    }

    public d(ForstaSurveyConfig forstaSurveyConfig, List<String> list, x71.d dVar) {
        forstaSurveyConfig.getClass();
        list.getClass();
        dVar.getClass();
        this.d = forstaSurveyConfig;
        this.e = list;
        this.f16835f = dVar;
        f2 a13 = g2.a(InterfaceC0610d.b.f16846a);
        this.f16836g = a13;
        this.f16837h = r.d(a13);
        b42.c b13 = m.b(0, null, null, 7);
        this.f16838i = b13;
        this.f16839j = r.B(b13);
    }

    public final void S(c cVar) {
        Object value;
        Object value2;
        Object value3;
        cVar.getClass();
        boolean equals = cVar.equals(c.a.f16841a);
        b42.c cVar2 = this.f16838i;
        if (equals) {
            n.a(cVar2.h(new b.a(false)));
            return;
        }
        boolean equals2 = cVar.equals(c.C0608c.f16843a);
        f2 f2Var = this.f16836g;
        if (equals2) {
            do {
                value3 = f2Var.getValue();
                InterfaceC0610d interfaceC0610d = (InterfaceC0610d) value3;
            } while (!f2Var.f(value3, InterfaceC0610d.a.f16845a));
            return;
        }
        boolean equals3 = cVar.equals(c.b.f16842a);
        ForstaSurveyConfig forstaSurveyConfig = this.d;
        if (!equals3) {
            if (!(cVar instanceof c.C0609d)) {
                ma.e.o();
                return;
            } else if (((c.C0609d) cVar).f16844a.equals(forstaSurveyConfig.getEndOfSurveyUrl())) {
                cVar2.h(new b.a(true));
                return;
            } else {
                return;
            }
        }
        do {
            value = f2Var.getValue();
            InterfaceC0610d interfaceC0610d2 = (InterfaceC0610d) value;
        } while (!f2Var.f(value, InterfaceC0610d.b.f16846a));
        String a13 = this.f16835f.a(forstaSurveyConfig, this.e);
        do {
            value2 = f2Var.getValue();
            InterfaceC0610d interfaceC0610d3 = (InterfaceC0610d) value2;
        } while (!f2Var.f(value2, new InterfaceC0610d.c(a13)));
    }
}
