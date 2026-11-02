package com.dyson.mobile.android.connectionjourney.ownership;

import com.dyson.mobile.android.connectionjourney.ownership.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/k;", "", "Lcom/dyson/mobile/android/connectionjourney/ownership/g;", "alertViewState", "", "isNetworkCallInProgress", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/ownership/g;Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final g f13833a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13834b;

    public /* synthetic */ k(g gVar, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? g.a.f13787a : gVar, (i13 & 2) != 0 ? false : z13);
    }

    public static k a(k kVar, g gVar, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            gVar = kVar.f13833a;
        }
        if ((i13 & 2) != 0) {
            z13 = kVar.f13834b;
        }
        kVar.getClass();
        gVar.getClass();
        return new k(gVar, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return r.c(this.f13833a, kVar.f13833a) && this.f13834b == kVar.f13834b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13834b) + (this.f13833a.hashCode() * 31);
    }

    public final String toString() {
        return "OwnershipViewState(alertViewState=" + this.f13833a + ", isNetworkCallInProgress=" + this.f13834b + ")";
    }

    public k(g gVar, boolean z13) {
        gVar.getClass();
        this.f13833a = gVar;
        this.f13834b = z13;
    }

    public k() {
        this(null, false, 3, null);
    }
}
