package com.dyson.mobile.android.connectionjourney.bleconnection;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$a;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "Lb10/b;", "alert", "", "isConfirmButton", "<init>", "(Lb10/b;Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final b10.b f13329a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13330b;

        public a(b10.b bVar, boolean z13) {
            bVar.getClass();
            this.f13329a = bVar;
            this.f13330b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f13329a == aVar.f13329a && this.f13330b == aVar.f13330b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13330b) + (this.f13329a.hashCode() * 31);
        }

        public final String toString() {
            return "AlertButtonPressed(alert=" + this.f13329a + ", isConfirmButton=" + this.f13330b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$b;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.bleconnection.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0408b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0408b f13331a = new C0408b();

        private C0408b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0408b);
        }

        public final int hashCode() {
            return -1680153439;
        }

        public final String toString() {
            return "BackPressed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$c;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13332a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -152402844;
        }

        public final String toString() {
            return "ClosePressed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$d;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13333a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 717994514;
        }

        public final String toString() {
            return "LocateCodeCompleted";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$e;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13334a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -180156627;
        }

        public final String toString() {
            return "ManualPairClicked";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$f;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f13335a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1411698708;
        }

        public final String toString() {
            return "ManualPairCodeSubmitted";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$g;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "", "isSubsequentJourney", "<init>", "(Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13336a;

        public g(boolean z13) {
            this.f13336a = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f13336a == ((g) obj).f13336a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13336a);
        }

        public final String toString() {
            return d72.a.j("PairingCompleteContinuePressed(isSubsequentJourney=", ")", this.f13336a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$h;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final h f13337a = new h();

        private h() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 200114320;
        }

        public final String toString() {
            return "ReenterNetworkPasswordRequested";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/b$i;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/b;", "", "isWifiConnection", "<init>", "(Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13338a;

        public i(boolean z13) {
            this.f13338a = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f13338a == ((i) obj).f13338a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13338a);
        }

        public final String toString() {
            return d72.a.j("TroubleshootClicked(isWifiConnection=", ")", this.f13338a);
        }
    }
}
