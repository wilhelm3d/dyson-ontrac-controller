package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import com.brightcove.player.captioning.TTMLParser;
import h12.y;
import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b;", "", TTMLParser.Tags.BODY, "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b$a$a;", "authoriseCtaState", "denyCtaState", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b$a$a;Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b$a$a;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13018a;

        /* renamed from: b  reason: collision with root package name */
        public final C0383a f13019b;

        /* renamed from: c  reason: collision with root package name */
        public final C0383a f13020c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b$a$a;", "", "", "isLoading", "isEnabled", "<init>", "(ZZ)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0383a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f13021a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f13022b;

            public C0383a(boolean z13, boolean z14) {
                this.f13021a = z13;
                this.f13022b = z14;
            }

            public static C0383a a(C0383a c0383a, int i13) {
                boolean z13 = (i13 & 1) != 0 ? c0383a.f13021a : true;
                boolean z14 = (i13 & 2) != 0 ? c0383a.f13022b : false;
                c0383a.getClass();
                return new C0383a(z13, z14);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0383a) {
                    C0383a c0383a = (C0383a) obj;
                    return this.f13021a == c0383a.f13021a && this.f13022b == c0383a.f13022b;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f13022b) + (Boolean.hashCode(this.f13021a) * 31);
            }

            public final String toString() {
                return "CtaState(isLoading=" + this.f13021a + ", isEnabled=" + this.f13022b + ")";
            }
        }

        public a(String str, C0383a c0383a, C0383a c0383a2) {
            str.getClass();
            c0383a.getClass();
            c0383a2.getClass();
            this.f13018a = str;
            this.f13019b = c0383a;
            this.f13020c = c0383a2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f13018a.equals(aVar.f13018a) && this.f13019b.equals(aVar.f13019b) && this.f13020c.equals(aVar.f13020c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f13019b.hashCode();
            return this.f13020c.hashCode() + ((hashCode + (this.f13018a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Content(body=" + this.f13018a + ", authoriseCtaState=" + this.f13019b + ", denyCtaState=" + this.f13020c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/b;", "", "title", "subtitle", "cta", "", "isRetryInProgress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0384b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13023a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13024b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13025c;
        public final boolean d;

        public C0384b(String str, String str2, String str3, boolean z13) {
            d72.a.v(str, str2, str3);
            this.f13023a = str;
            this.f13024b = str2;
            this.f13025c = str3;
            this.d = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0384b) {
                C0384b c0384b = (C0384b) obj;
                return this.f13023a.equals(c0384b.f13023a) && this.f13024b.equals(c0384b.f13024b) && this.f13025c.equals(c0384b.f13025c) && this.d == c0384b.d;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + y.c(y.c(this.f13023a.hashCode() * 31, 31, this.f13024b), 31, this.f13025c);
        }

        public final String toString() {
            return v80.c.d(ma.e.m("Error(title=", this.f13023a, ", subtitle=", this.f13024b, ", cta="), this.f13025c, ", isRetryInProgress=", this.d, ")");
        }
    }
}
