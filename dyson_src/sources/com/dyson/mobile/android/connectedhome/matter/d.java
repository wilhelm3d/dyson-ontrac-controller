package com.dyson.mobile.android.connectedhome.matter;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/d$a;", "Lcom/dyson/mobile/android/connectedhome/matter/d;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12970a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 286946664;
        }

        public final String toString() {
            return "OnAmazonAlexaClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/d$b;", "Lcom/dyson/mobile/android/connectedhome/matter/d;", "", "payload", "<init>", "(Ljava/lang/String;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f12971a;

        public b(String str) {
            str.getClass();
            this.f12971a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12971a.equals(((b) obj).f12971a);
        }

        public final int hashCode() {
            return this.f12971a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("OnGoogleHomeClicked(payload=", this.f12971a, ")");
        }
    }
}
