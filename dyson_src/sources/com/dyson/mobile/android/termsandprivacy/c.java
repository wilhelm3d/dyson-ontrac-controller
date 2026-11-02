package com.dyson.mobile.android.termsandprivacy;

import androidx.lifecycle.ViewModelProvider;
import b42.m;
import c42.f2;
import c42.g2;
import c42.r;
import com.dyson.mobile.android.termsandprivacy.a;
import e91.f;
import e91.s;
import e91.t;
import h12.p;
import i12.c0;
import i12.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c;", "Lm9/u;", "Ltj/a;", "marketManager", "Lmi/a;", "marketNameHelper", "Loj/c;", "appConfigOptions", "Ln81/b;", "marketInformationRepository", "<init>", "(Ltj/a;Lmi/a;Loj/c;Ln81/b;)V", "c", "b", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends u {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16947k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final Map<String, String> f16948l = q0.f(new p("<TOU>", "TERMS_OF_USE"), new p("<PP>", "PRIVACY_POLICY"), new p("<DGPP>", "DYSON_GLOBAL_PRIVACY_POLICY"), new p("<LA>", "LOCAL_ADDENDUM"));
    public final tj.a d;
    public final mi.a e;

    /* renamed from: f  reason: collision with root package name */
    public final n81.b f16949f;

    /* renamed from: g  reason: collision with root package name */
    public final f2 f16950g;

    /* renamed from: h  reason: collision with root package name */
    public final b42.c f16951h;

    /* renamed from: i  reason: collision with root package name */
    public final c42.e f16952i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16953j;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ltj/a;", "marketManager", "Lmi/a;", "marketNameHelper", "Loj/c;", "appConfigOptions", "Ln81/b;", "marketInformationRepository", "<init>", "(Ltj/a;Lmi/a;Loj/c;Ln81/b;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final tj.a f16954a;

        /* renamed from: b  reason: collision with root package name */
        public final mi.a f16955b;

        /* renamed from: c  reason: collision with root package name */
        public final oj.c f16956c;
        public final n81.b d;

        public b(tj.a aVar, mi.a aVar2, oj.c cVar, n81.b bVar) {
            aVar.getClass();
            aVar2.getClass();
            cVar.getClass();
            bVar.getClass();
            this.f16954a = aVar;
            this.f16955b = aVar2;
            this.f16956c = cVar;
            this.d = bVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new c(this.f16954a, this.f16955b, this.f16956c, this.d);
        }
    }

    /* renamed from: com.dyson.mobile.android.termsandprivacy.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0617c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c$c$a;", "Lcom/dyson/mobile/android/termsandprivacy/c$c;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.termsandprivacy.c$c$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC0617c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16957a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1295887980;
            }

            public final String toString() {
                return "ExitApp";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c$c$b;", "Lcom/dyson/mobile/android/termsandprivacy/c$c;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.termsandprivacy.c$c$b */
        /* loaded from: classes3.dex */
        public static final class b implements InterfaceC0617c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f16958a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -310549692;
            }

            public final String toString() {
                return "NavigateToBrowseDysonScreen";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c$c$c;", "Lcom/dyson/mobile/android/termsandprivacy/c$c;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.termsandprivacy.c$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0618c implements InterfaceC0617c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0618c f16959a = new C0618c();

            private C0618c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0618c);
            }

            public final int hashCode() {
                return 1626510426;
            }

            public final String toString() {
                return "NavigateToNextScreen";
            }
        }
    }

    public c(tj.a aVar, mi.a aVar2, oj.c cVar, n81.b bVar) {
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        bVar.getClass();
        this.d = aVar;
        this.e = aVar2;
        this.f16949f = bVar;
        this.f16950g = g2.a(a.b.f16945a);
        b42.c b13 = m.b(0, null, null, 7);
        this.f16951h = b13;
        this.f16952i = r.B(b13);
        sj.a aVar3 = oj.e.f60351a;
        boolean c13 = x12.r.c(null, Locale.CHINA.getCountry());
        this.f16953j = c13;
        if (c13) {
            T(null);
        } else {
            g0.r(v.a(this), null, null, new d(this, null), 3);
        }
    }

    public final boolean S(boolean z13, boolean z14, boolean z15) {
        String c13 = this.d.c();
        return c13.equals(Locale.CHINA.getCountry()) ? z13 && z14 : c13.equals(Locale.KOREA.getCountry()) ? z13 && z14 && z15 : z13;
    }

    public final void T(e91.e eVar) {
        e91.e eVar2;
        mi.a aVar = this.e;
        tj.a aVar2 = this.d;
        if (eVar == null) {
            String c13 = aVar2.c();
            eVar2 = new e91.e(aVar.a(c13), c13);
        } else {
            eVar2 = eVar;
        }
        List<String> list = aVar2.e;
        ArrayList arrayList = new ArrayList(i12.u.o(list, 10));
        for (String str : list) {
            arrayList.add(new e91.e(aVar.a(str), str));
        }
        List q03 = c0.q0(arrayList, new t());
        String str2 = eVar2.f26359b;
        s sVar = str2.equals(Locale.CHINA.getCountry()) ? e91.a.f26342a : str2.equals(Locale.KOREA.getCountry()) ? e91.d.f26353a : e91.b.f26347a;
        this.f16950g.l(null, new a.c(new f(this.f16953j, eVar2, q03, sVar.f(), sVar.b(), false, false, sVar.e(), sVar.a(), false, sVar.g(), S(false, false, false), sVar.d(), sVar.c())));
    }

    public final void U(boolean z13, boolean z14, boolean z15) {
        f2 f2Var;
        Object value;
        Object obj;
        do {
            f2Var = this.f16950g;
            value = f2Var.getValue();
            obj = (com.dyson.mobile.android.termsandprivacy.a) value;
            if (obj instanceof a.c) {
                f fVar = ((a.c) obj).f16946a;
                obj = new a.c(new f(fVar.f26360a, fVar.f26361b, fVar.f26362c, fVar.d, fVar.e, z13, z14, fVar.f26365h, fVar.f26366i, z15, fVar.f26368k, S(z13, z14, z15), fVar.f26370m, fVar.f26371n));
            }
        } while (!f2Var.f(value, obj));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c$a;", "", "<init>", "()V", "", "TOU_TAG", "Ljava/lang/String;", "PP_TAG", "LA_TAG", "DGPP_TAG", "TERMS_OF_USE", "PRIVACY_POLICY", "LOCAL_ADDENDUM", "DYSON_GLOBAL_PRIVACY_POLICY", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
