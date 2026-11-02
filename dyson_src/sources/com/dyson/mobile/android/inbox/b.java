package com.dyson.mobile.android.inbox;

import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/inbox/b;", "", "<init>", "()V", "b", "a", "Lcom/dyson/mobile/android/inbox/b$a;", "Lcom/dyson/mobile/android/inbox/b$b;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/inbox/b$a;", "Lcom/dyson/mobile/android/inbox/b;", "", "trackingId", "url", com.salesforce.marketingcloud.messages.inbox.b.f21448j, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final String f14264a;

        /* renamed from: b  reason: collision with root package name */
        public final String f14265b;

        /* renamed from: c  reason: collision with root package name */
        public final String f14266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(null);
            d72.a.v(str, str2, str3);
            this.f14264a = str;
            this.f14265b = str2;
            this.f14266c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return r.c(this.f14264a, aVar.f14264a) && r.c(this.f14265b, aVar.f14265b) && r.c(this.f14266c, aVar.f14266c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f14266c.hashCode() + y.c(this.f14264a.hashCode() * 31, 31, this.f14265b);
        }

        public final String toString() {
            return ie.a.h(ma.e.m("CloudPageWebUrl(trackingId=", this.f14264a, ", url=", this.f14265b, ", type="), this.f14266c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/inbox/b$b;", "Lcom/dyson/mobile/android/inbox/b;", "Lcom/dyson/mobile/android/salesforce/a;", "salesForceDeepLinkEvent", "<init>", "(Lcom/dyson/mobile/android/salesforce/a;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.inbox.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0464b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final com.dyson.mobile.android.salesforce.a f14267a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0464b(com.dyson.mobile.android.salesforce.a aVar) {
            super(null);
            aVar.getClass();
            this.f14267a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0464b) && r.c(this.f14267a, ((C0464b) obj).f14267a);
        }

        public final int hashCode() {
            return this.f14267a.hashCode();
        }

        public final String toString() {
            return "InAppDeepLinkEvent(salesForceDeepLinkEvent=" + this.f14267a + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
