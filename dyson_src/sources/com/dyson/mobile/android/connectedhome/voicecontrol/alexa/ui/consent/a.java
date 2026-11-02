package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/a$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/a;", "", "redirectUriString", "<init>", "(Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0382a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13016a;

        public C0382a(String str) {
            str.getClass();
            this.f13016a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0382a) && this.f13016a.equals(((C0382a) obj).f13016a);
        }

        public final int hashCode() {
            return this.f13016a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("RedirectToAlexaApp(redirectUriString=", this.f13016a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/a$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/consent/a;", "", "privacyPolicyUrl", "<init>", "(Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13017a;

        public b(String str) {
            str.getClass();
            this.f13017a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f13017a.equals(((b) obj).f13017a);
        }

        public final int hashCode() {
            return this.f13017a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ShowPrivacyPolicy(privacyPolicyUrl=", this.f13017a, ")");
        }
    }
}
