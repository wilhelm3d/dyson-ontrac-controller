package com.dyson.mobile.android.support.aichatbot;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/g$a;", "Lcom/dyson/mobile/android/support/aichatbot/g;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16772a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -69904078;
        }

        public final String toString() {
            return EventsNameKt.GENERIC_ERROR_MESSAGE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/g$b;", "Lcom/dyson/mobile/android/support/aichatbot/g;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16773a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -937671194;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/g$c;", "Lcom/dyson/mobile/android/support/aichatbot/g;", "", "redirectUrl", "<init>", "(Ljava/lang/String;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public final String f16774a;

        public c(String str) {
            str.getClass();
            this.f16774a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16774a.equals(((c) obj).f16774a);
        }

        public final int hashCode() {
            return this.f16774a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("Success(redirectUrl=", this.f16774a, ")");
        }
    }
}
