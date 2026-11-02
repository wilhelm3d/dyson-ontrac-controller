package com.dyson.mobile.android.connectionjourney.preflightchecks;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a$a;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.preflightchecks.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0444a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0444a f13865a = new C0444a();

        private C0444a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0444a);
        }

        public final int hashCode() {
            return -1572059324;
        }

        public final String toString() {
            return "CancelAndExitConnectionJourney";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a$b;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13866a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -668319878;
        }

        public final String toString() {
            return "CancelAndRetryConnectionJourney";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a$c;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13867a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 85659710;
        }

        public final String toString() {
            return "ContinueConnectionJourney";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a$d;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/a;", "Lcom/dyson/mobile/android/connectionjourney/preflightchecks/b;", "route", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/preflightchecks/b;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final com.dyson.mobile.android.connectionjourney.preflightchecks.b f13868a;

        public d(com.dyson.mobile.android.connectionjourney.preflightchecks.b bVar) {
            bVar.getClass();
            this.f13868a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f13868a.equals(((d) obj).f13868a);
        }

        public final int hashCode() {
            return this.f13868a.hashCode();
        }

        public final String toString() {
            return "Routing(route=" + this.f13868a + ")";
        }
    }
}
