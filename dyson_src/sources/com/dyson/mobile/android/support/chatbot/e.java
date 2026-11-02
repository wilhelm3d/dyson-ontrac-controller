package com.dyson.mobile.android.support.chatbot;

import com.dyson.mobile.android.support.chatbot.a;
import h12.f0;
import h12.m;
import h12.t;
import h12.y;
import hx.v;
import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import q62.n;
import u3.k1;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e;", "Lm9/u;", "Lk71/c;", "supportContactManager", "Lpf0/c;", "localisationManager", "<init>", "(Lk71/c;Lpf0/c;)V", "b", "d", "e", "a", "c", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends u {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f16792m = 0;
    public final k71.c d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final xf1.a<f0> f16793f;

    /* renamed from: g  reason: collision with root package name */
    public final xf1.a<f0> f16794g;

    /* renamed from: h  reason: collision with root package name */
    public final xf1.a<a.AbstractC0602a> f16795h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a<b> f16796i;

    /* renamed from: j  reason: collision with root package name */
    public final k1<List<com.dyson.mobile.android.support.chatbot.a>> f16797j;

    /* renamed from: k  reason: collision with root package name */
    public final t f16798k;

    /* renamed from: l  reason: collision with root package name */
    public final String f16799l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "GENESYS", "LEGACY_WITH_SURVEY", "LEGACY", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a GENESYS = new a("GENESYS", 0);
        public static final a LEGACY_WITH_SURVEY = new a("LEGACY_WITH_SURVEY", 1);
        public static final a LEGACY = new a("LEGACY", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{GENESYS, LEGACY_WITH_SURVEY, LEGACY};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private a(String str, int i13) {
        }

        public static o12.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$d;", "", "", "title", "message", "negativeButtonText", "positiveButtonText", "Lkotlin/Function0;", "Lh12/f0;", "positiveButtonAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw12/a;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f16805a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16806b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16807c;
        public final String d;
        public final w12.a<f0> e;

        public d(String str, String str2, String str3, String str4, w12.a<f0> aVar) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            aVar.getClass();
            this.f16805a = str;
            this.f16806b = str2;
            this.f16807c = str3;
            this.d = str4;
            this.e = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f16805a.equals(dVar.f16805a) && this.f16806b.equals(dVar.f16806b) && this.f16807c.equals(dVar.f16807c) && this.d.equals(dVar.d) && this.e.equals(dVar.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + y.c(y.c(y.c(this.f16805a.hashCode() * 31, 31, this.f16806b), 31, this.f16807c), 31, this.d);
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("DialogData(title=", this.f16805a, ", message=", this.f16806b, ", negativeButtonText=");
            n.o(m13, this.f16807c, ", positiveButtonText=", this.d, ", positiveButtonAction=");
            m13.append(this.e);
            m13.append(")");
            return m13.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$e;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "END_SESSION", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.support.chatbot.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class EnumC0606e {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ EnumC0606e[] $VALUES;
        public static final EnumC0606e ERROR = new EnumC0606e("ERROR", 0);
        public static final EnumC0606e END_SESSION = new EnumC0606e("END_SESSION", 1);

        private static final /* synthetic */ EnumC0606e[] $values() {
            return new EnumC0606e[]{ERROR, END_SESSION};
        }

        static {
            EnumC0606e[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private EnumC0606e(String str, int i13) {
        }

        public static o12.a<EnumC0606e> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0606e valueOf(String str) {
            return (EnumC0606e) Enum.valueOf(EnumC0606e.class, str);
        }

        public static EnumC0606e[] values() {
            return (EnumC0606e[]) $VALUES.clone();
        }
    }

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16808a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16809b;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.GENESYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.LEGACY_WITH_SURVEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16808a = iArr;
            int[] iArr2 = new int[EnumC0606e.values().length];
            try {
                iArr2[EnumC0606e.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC0606e.END_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f16809b = iArr2;
        }
    }

    static {
        new c(null);
    }

    public e(k71.c cVar, pf0.c cVar2) {
        cVar.getClass();
        cVar2.getClass();
        this.d = cVar;
        this.e = cVar2;
        this.f16793f = new xf1.a<>();
        this.f16794g = new xf1.a<>();
        this.f16795h = new xf1.a<>();
        this.f16796i = new xf1.a<>();
        this.f16797j = androidx.compose.runtime.d.j(e0.d);
        t b13 = m.b(new h71.m(this, 0));
        this.f16798k = b13;
        i71.a aVar = (i71.a) b13.getValue();
        String str = aVar != null ? aVar.f40992a : null;
        this.f16799l = str == null ? "" : str;
    }

    public final void S(b bVar) {
        bVar.getClass();
        this.f16796i.setValue(bVar);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$b;", "", "<init>", "()V", "b", "a", "e", "c", "d", "Lcom/dyson/mobile/android/support/chatbot/e$b$a;", "Lcom/dyson/mobile/android/support/chatbot/e$b$b;", "Lcom/dyson/mobile/android/support/chatbot/e$b$c;", "Lcom/dyson/mobile/android/support/chatbot/e$b$d;", "Lcom/dyson/mobile/android/support/chatbot/e$b$e;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$b$a;", "Lcom/dyson/mobile/android/support/chatbot/e$b;", "", "url", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final String f16800a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(null);
                str.getClass();
                this.f16800a = str;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$b$b;", "Lcom/dyson/mobile/android/support/chatbot/e$b;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.chatbot.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0604b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0604b f16801a = new C0604b();

            private C0604b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0604b);
            }

            public final int hashCode() {
                return 1168901625;
            }

            public final String toString() {
                return "FinishActivity";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$b$c;", "Lcom/dyson/mobile/android/support/chatbot/e$b;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f16802a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1710414179;
            }

            public final String toString() {
                return "OnEndSessionAndDeleteHistory";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$b$d;", "Lcom/dyson/mobile/android/support/chatbot/e$b;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f16803a = new d();

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -2084848109;
            }

            public final String toString() {
                return "OnErrorReceived";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$b$e;", "Lcom/dyson/mobile/android/support/chatbot/e$b;", "Lkj/b;", "urlWithTracking", "<init>", "(Lkj/b;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.support.chatbot.e$b$e  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0605e extends b {

            /* renamed from: a  reason: collision with root package name */
            public final kj.b f16804a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0605e(kj.b bVar) {
                super(null);
                bVar.getClass();
                this.f16804a = bVar;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/chatbot/e$c;", "", "<init>", "()V", "", "STATUS_ERROR", "Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
