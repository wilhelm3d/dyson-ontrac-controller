package com.dyson.mobile.android.connectionjourney.preflightchecks;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c$a;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c;", "Lb10/b;", "alert", "", "isConfirmButton", "<init>", "(Lb10/b;Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final b10.b f13873a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13874b;

        public a(b10.b bVar, boolean z13) {
            bVar.getClass();
            this.f13873a = bVar;
            this.f13874b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f13873a == aVar.f13873a && this.f13874b == aVar.f13874b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13874b) + (this.f13873a.hashCode() * 31);
        }

        public final String toString() {
            return "AlertButtonPressed(alert=" + this.f13873a + ", isConfirmButton=" + this.f13874b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c$b;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13875a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1283277859;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c$c;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.preflightchecks.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0446c implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0446c f13876a = new C0446c();

        private C0446c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0446c);
        }

        public final int hashCode() {
            return 1519654178;
        }

        public final String toString() {
            return "ClosePressed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c$d;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13877a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 74686500;
        }

        public final String toString() {
            return "OwnershipContinuePressed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c$e;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13878a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2050512508;
        }

        public final String toString() {
            return "ReloadOwnershipPressed";
        }
    }
}
