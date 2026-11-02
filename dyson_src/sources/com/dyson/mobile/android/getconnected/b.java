package com.dyson.mobile.android.getconnected;

import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB3\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/getconnected/b;", "", "", "title", "subtitle", "subtitleArgs", "button", "<init>", "(IILjava/lang/Integer;I)V", "a", "c", "b", "d", "Lcom/dyson/mobile/android/getconnected/b$a;", "Lcom/dyson/mobile/android/getconnected/b$b;", "Lcom/dyson/mobile/android/getconnected/b$c;", "Lcom/dyson/mobile/android/getconnected/b$d;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f14110a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14111b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f14112c;
    public final int d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/getconnected/b$a;", "Lcom/dyson/mobile/android/getconnected/b;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends b {
        public static final a e = new a();

        private a() {
            super(R.string.sso_alert_error_title, R.string.sso_alert_error_msg, null, R.string.button_ok, 4, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1828653594;
        }

        public final String toString() {
            return "GeneralError";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/getconnected/b$b;", "Lcom/dyson/mobile/android/getconnected/b;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.getconnected.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0454b extends b {
        public static final C0454b e = new C0454b();

        private C0454b() {
            super(R.string.sso_alert_cancel_title, R.string.sso_alert_cancel_description, null, R.string.button_ok, 4, null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0454b);
        }

        public final int hashCode() {
            return -1520233004;
        }

        public final String toString() {
            return "SocialAuthCanceled";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/getconnected/b$c;", "Lcom/dyson/mobile/android/getconnected/b;", "Lb71/e;", "provider", "<init>", "(Lb71/e;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends b {
        public final b71.e e;

        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f14113a;

            static {
                int[] iArr = new int[b71.e.values().length];
                try {
                    iArr[b71.e.GOOGLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b71.e.APPLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f14113a = iArr;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(b71.e r8) {
            /*
                r7 = this;
                if (r8 != 0) goto L7
                r0 = 2132024691(0x7f141d73, float:1.9687865E38)
            L5:
                r3 = r0
                goto Lb
            L7:
                r0 = 2132024696(0x7f141d78, float:1.9687875E38)
                goto L5
            Lb:
                if (r8 != 0) goto Lf
                r0 = -1
                goto L17
            Lf:
                int[] r0 = com.dyson.mobile.android.getconnected.b.c.a.f14113a
                int r1 = r8.ordinal()
                r0 = r0[r1]
            L17:
                r1 = 1
                if (r0 == r1) goto L28
                r1 = 2
                if (r0 == r1) goto L20
                r0 = 0
            L1e:
                r4 = r0
                goto L30
            L20:
                r0 = 2132024694(0x7f141d76, float:1.9687871E38)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L1e
            L28:
                r0 = 2132024698(0x7f141d7a, float:1.968788E38)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L1e
            L30:
                r5 = 2132017794(0x7f140282, float:1.9673876E38)
                r6 = 0
                r2 = 2132024692(0x7f141d74, float:1.9687867E38)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r1.e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.getconnected.b.c.<init>(b71.e):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.e == ((c) obj).e;
        }

        public final int hashCode() {
            b71.e eVar = this.e;
            if (eVar == null) {
                return 0;
            }
            return eVar.hashCode();
        }

        public final String toString() {
            return "SocialAuthFailed(provider=" + this.e + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/getconnected/b$d;", "Lcom/dyson/mobile/android/getconnected/b;", "Lb71/e;", "socialProvider", "<init>", "(Lb71/e;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends b {
        public final b71.e e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b71.e eVar) {
            super(R.string.sso_alert_error_title, R.string.sso_google_not_setup_error_description, null, R.string.button_ok, 4, null);
            eVar.getClass();
            this.e = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.e == ((d) obj).e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "SocialAuthNotAvailable(socialProvider=" + this.e + ")";
        }
    }

    public /* synthetic */ b(int i13, int i14, Integer num, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, (i16 & 4) != 0 ? null : num, i15, null);
    }

    private b(int i13, int i14, Integer num, int i15) {
        this.f14110a = i13;
        this.f14111b = i14;
        this.f14112c = num;
        this.d = i15;
    }

    public /* synthetic */ b(int i13, int i14, Integer num, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, num, i15);
    }
}
