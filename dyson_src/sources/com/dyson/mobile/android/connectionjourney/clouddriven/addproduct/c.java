package com.dyson.mobile.android.connectionjourney.clouddriven.addproduct;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c$a;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13436a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1669156602;
        }

        public final String toString() {
            return "OnBackPressed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c$b;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13437a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 188499103;
        }

        public final String toString() {
            return "OnClosePressed";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c$c;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c;", "Lk80/b;", "contentEvent", "<init>", "(Lk80/b;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0419c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final k80.b f13438a;

        public C0419c(k80.b bVar) {
            bVar.getClass();
            this.f13438a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0419c) && this.f13438a.equals(((C0419c) obj).f13438a);
        }

        public final int hashCode() {
            return this.f13438a.hashCode();
        }

        public final String toString() {
            return "OnContentEvent(contentEvent=" + this.f13438a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c$d;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/c;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f13439a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 754953505;
        }

        public final String toString() {
            return "OnRefreshClicked";
        }
    }
}
