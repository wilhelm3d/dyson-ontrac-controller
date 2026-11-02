package com.dyson.mobile.android.support.ui.contact.compose;

import h71.i;
import java.net.URL;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/b$a;", "Lcom/dyson/mobile/android/support/ui/contact/compose/b;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16871a;

        public a(String str) {
            str.getClass();
            this.f16871a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f16871a.equals(((a) obj).f16871a);
        }

        public final int hashCode() {
            return this.f16871a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("OnCallButtonClicked(phoneNumber=", this.f16871a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/b$b;", "Lcom/dyson/mobile/android/support/ui/contact/compose/b;", "Lh71/i;", "chatBotType", "<init>", "(Lh71/i;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.support.ui.contact.compose.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0613b implements b {

        /* renamed from: a  reason: collision with root package name */
        public final i f16872a;

        public C0613b(i iVar) {
            this.f16872a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0613b) && this.f16872a == ((C0613b) obj).f16872a;
        }

        public final int hashCode() {
            i iVar = this.f16872a;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public final String toString() {
            return "OnChatBotButtonClicked(chatBotType=" + this.f16872a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/b$c;", "Lcom/dyson/mobile/android/support/ui/contact/compose/b;", "", "emailAddress", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16873a;

        public c(String str) {
            str.getClass();
            this.f16873a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16873a.equals(((c) obj).f16873a);
        }

        public final int hashCode() {
            return this.f16873a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("OnEmailButtonClicked(emailAddress=", this.f16873a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/b$d;", "Lcom/dyson/mobile/android/support/ui/contact/compose/b;", "Lkj/b;", "urlWithTracking", "<init>", "(Lkj/b;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final kj.b f16874a;

        public d(kj.b bVar) {
            bVar.getClass();
            this.f16874a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f16874a.equals(((d) obj).f16874a);
        }

        public final int hashCode() {
            return this.f16874a.hashCode();
        }

        public final String toString() {
            return "OnSupportWebsiteUrlButtonClicked(urlWithTracking=" + this.f16874a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/b$e;", "Lcom/dyson/mobile/android/support/ui/contact/compose/b;", "Ljava/net/URL;", "url", "<init>", "(Ljava/net/URL;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public final URL f16875a;

        public e(URL url) {
            url.getClass();
            this.f16875a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f16875a.equals(((e) obj).f16875a);
        }

        public final int hashCode() {
            return this.f16875a.hashCode();
        }

        public final String toString() {
            return "OnUrlButtonClicked(url=" + this.f16875a + ")";
        }
    }
}
