package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa;

import android.net.Uri;
import c42.f2;
import c42.g2;
import c42.r1;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import nj.lc;
import qv1.s;
import rf0.j0;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b;", "Lm9/u;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;", "alexaAuthResultParser", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Landroid/net/Uri;", "loginWithAmazonUri", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;Lhj/e;Lpf0/c;Landroid/net/Uri;)V", "c", "e", "a", "d", "b", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a d;
    public final Uri e;

    /* renamed from: f  reason: collision with root package name */
    public final xf1.a<AlexaAuthResult.AlexaAuthArgs> f13150f;

    /* renamed from: g  reason: collision with root package name */
    public final xf1.a<AlexaError> f13151g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13152h;

    /* renamed from: i  reason: collision with root package name */
    public final f2 f13153i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f13154j;

    /* renamed from: k  reason: collision with root package name */
    public final f2 f13155k;

    /* renamed from: l  reason: collision with root package name */
    public final r1 f13156l;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface c {
        b a(Uri uri);
    }

    /* loaded from: classes2.dex */
    public interface d {

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$d$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$d;", "", AbstractEvent.ERROR_CODE, "", "description", "Landroid/net/Uri;", "uri", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Landroid/net/Uri;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            public final Integer f13159a;

            /* renamed from: b  reason: collision with root package name */
            public final String f13160b;

            /* renamed from: c  reason: collision with root package name */
            public final Uri f13161c;

            public a(Integer num, String str, Uri uri) {
                this.f13159a = num;
                this.f13160b = str;
                this.f13161c = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return r.c(this.f13159a, aVar.f13159a) && r.c(this.f13160b, aVar.f13160b) && r.c(this.f13161c, aVar.f13161c);
                }
                return false;
            }

            public final int hashCode() {
                Integer num = this.f13159a;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f13160b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Uri uri = this.f13161c;
                return hashCode2 + (uri != null ? uri.hashCode() : 0);
            }

            public final String toString() {
                return "Error(errorCode=" + this.f13159a + ", description=" + this.f13160b + ", uri=" + this.f13161c + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$d$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$d;", "", "isLoading", "<init>", "(Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b$d$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0396b implements d {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f13162a;

            public C0396b(boolean z13) {
                this.f13162a = z13;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0396b) && this.f13162a == ((C0396b) obj).f13162a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f13162a);
            }

            public final String toString() {
                return d72.a.j("Loading(isLoading=", ")", this.f13162a);
            }
        }
    }

    static {
        new C0395b(null);
    }

    public b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a aVar, hj.e eVar, pf0.c cVar, Uri uri) {
        aVar.getClass();
        eVar.getClass();
        cVar.getClass();
        uri.getClass();
        this.d = aVar;
        this.e = uri;
        this.f13150f = new xf1.a<>();
        xf1.a<AlexaError> aVar2 = new xf1.a<>();
        this.f13151g = aVar2;
        this.f13152h = cVar.d(j0.f72081f);
        f2 a13 = g2.a(new e.a(true));
        this.f13153i = a13;
        this.f13154j = c42.r.d(a13);
        f2 a14 = g2.a(null);
        this.f13155k = a14;
        this.f13156l = c42.r.d(a14);
        int i13 = lc.f57584a;
        eVar.h(new ij.b("voice_control.alexa.login_with_amazon", null, 2, null), null);
        String queryParameter = uri.getQueryParameter("redirect_uri");
        if ((queryParameter != null ? Uri.parse(queryParameter) : null) == null) {
            Logger.b("Redirect Uri is missing from the Lwa Uri: " + uri, null);
            aVar2.setValue(new AlexaError.AuthorizeError("invalid_parameters", s.g(uri, "The redirect_uri parameter could not be found in ")));
        }
    }

    public final void S(Integer num, String str) {
        String valueOf = num != null ? String.valueOf(num.intValue()) : null;
        if (valueOf == null) {
            valueOf = "";
        }
        if (str == null) {
            str = "";
        }
        this.f13151g.setValue(new AlexaError.AuthorizeError(valueOf, str));
    }

    public final boolean T(Uri uri) {
        Object value;
        Object value2;
        uri.getClass();
        String queryParameter = this.e.getQueryParameter("redirect_uri");
        Uri parse = queryParameter != null ? Uri.parse(queryParameter) : null;
        if (parse == null || !r.c(uri.getHost(), parse.getHost()) || !r.c(uri.getPath(), parse.getPath())) {
            uri = null;
        }
        if (uri != null) {
            this.d.getClass();
            AlexaAuthResult a13 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a.a(uri);
            boolean z13 = a13 instanceof AlexaAuthResult.AlexaAuthArgs;
            f2 f2Var = this.f13155k;
            if (z13) {
                this.f13150f.setValue(a13);
                do {
                    value2 = f2Var.getValue();
                    a aVar = (a) value2;
                } while (!f2Var.f(value2, new a.C0394b((AlexaAuthResult.AlexaAuthArgs) a13)));
                return true;
            } else if (a13 instanceof AlexaAuthResult.a) {
                AlexaAuthResult.a aVar2 = (AlexaAuthResult.a) a13;
                String str = aVar2.e;
                String str2 = aVar2.d;
                this.f13151g.setValue(new AlexaError.AuthorizeError(str2, str));
                do {
                    value = f2Var.getValue();
                    a aVar3 = (a) value;
                } while (!f2Var.f(value, new a.C0393a(new AlexaError.AuthorizeError(str2, str))));
                return true;
            } else {
                ma.e.o();
            }
        }
        return false;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a;", "", "<init>", "()V", "b", "a", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a$b;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class a {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$AuthorizeError;", "authorizeError", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError$AuthorizeError;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0393a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final AlexaError.AuthorizeError f13157a;

            public C0393a(AlexaError.AuthorizeError authorizeError) {
                super(null);
                this.f13157a = authorizeError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0393a) && r.c(this.f13157a, ((C0393a) obj).f13157a);
            }

            public final int hashCode() {
                AlexaError.AuthorizeError authorizeError = this.f13157a;
                if (authorizeError == null) {
                    return 0;
                }
                return authorizeError.hashCode();
            }

            public final String toString() {
                return "Failure(authorizeError=" + this.f13157a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "alexaAuthArgs", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0394b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final AlexaAuthResult.AlexaAuthArgs f13158a;

            public C0394b(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs) {
                super(null);
                this.f13158a = alexaAuthArgs;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0394b) && r.c(this.f13158a, ((C0394b) obj).f13158a);
            }

            public final int hashCode() {
                AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = this.f13158a;
                if (alexaAuthArgs == null) {
                    return 0;
                }
                return alexaAuthArgs.hashCode();
            }

            public final String toString() {
                return "Success(alexaAuthArgs=" + this.f13158a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$b;", "", "<init>", "()V", "", "REDIRECT_URI_PARAMETER", "Ljava/lang/String;", "INVALID_PARAMETERS_ERROR", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0395b {
        public /* synthetic */ C0395b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0395b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$e;", "", "<init>", "()V", "a", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$e$a;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class e {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$e$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/lwa/b$e;", "", "isLoading", "<init>", "(Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a extends e {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f13163a;

            public a(boolean z13) {
                super(null);
                this.f13163a = z13;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f13163a == ((a) obj).f13163a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f13163a);
            }

            public final String toString() {
                return d72.a.j("Loading(isLoading=", ")", this.f13163a);
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }
}
