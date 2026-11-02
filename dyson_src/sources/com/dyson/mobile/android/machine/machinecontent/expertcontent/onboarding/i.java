package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.g;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/i;", "", "", "title", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g;", "loadingState", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/g;)V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f15249a;

    /* renamed from: b  reason: collision with root package name */
    public final g f15250b;

    static {
        new a(null);
        new i("Loading", g.b.f15246a);
        new i(EventsNameKt.GENERIC_ERROR_MESSAGE, new g.a(new Exception()));
    }

    public i(String str, g gVar) {
        str.getClass();
        gVar.getClass();
        this.f15249a = str;
        this.f15250b = gVar;
    }

    public static i a(i iVar, g gVar) {
        String str = iVar.f15249a;
        iVar.getClass();
        str.getClass();
        gVar.getClass();
        return new i(str, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return r.c(this.f15249a, iVar.f15249a) && r.c(this.f15250b, iVar.f15250b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15250b.hashCode() + (this.f15249a.hashCode() * 31);
    }

    public final String toString() {
        return "UiState(title=" + this.f15249a + ", loadingState=" + this.f15250b + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/i$a;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ i(String str, g gVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, gVar);
    }
}
