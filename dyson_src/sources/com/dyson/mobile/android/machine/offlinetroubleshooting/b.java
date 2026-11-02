package com.dyson.mobile.android.machine.offlinetroubleshooting;

import com.dyson.mobile.android.machine.offlinetroubleshooting.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/offlinetroubleshooting/b;", "", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingData;", "data", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/a;", "sheetState", "<init>", "(Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingData;Lcom/dyson/mobile/android/machine/offlinetroubleshooting/a;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final OfflineTroubleshootingData f15292a;

    /* renamed from: b  reason: collision with root package name */
    public final a f15293b;

    public b(OfflineTroubleshootingData offlineTroubleshootingData, a aVar) {
        offlineTroubleshootingData.getClass();
        aVar.getClass();
        this.f15292a = offlineTroubleshootingData;
        this.f15293b = aVar;
    }

    public static b a(b bVar, a aVar) {
        OfflineTroubleshootingData offlineTroubleshootingData = bVar.f15292a;
        bVar.getClass();
        offlineTroubleshootingData.getClass();
        aVar.getClass();
        return new b(offlineTroubleshootingData, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return r.c(this.f15292a, bVar.f15292a) && r.c(this.f15293b, bVar.f15293b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15293b.hashCode() + (this.f15292a.hashCode() * 31);
    }

    public final String toString() {
        return "OfflineTroubleshootingState(data=" + this.f15292a + ", sheetState=" + this.f15293b + ")";
    }

    public /* synthetic */ b(OfflineTroubleshootingData offlineTroubleshootingData, a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(offlineTroubleshootingData, (i13 & 2) != 0 ? a.C0520a.f15290a : aVar);
    }
}
