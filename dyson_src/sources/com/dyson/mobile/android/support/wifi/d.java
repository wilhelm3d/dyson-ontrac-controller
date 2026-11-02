package com.dyson.mobile.android.support.wifi;

import c42.f2;
import c42.g2;
import c42.q1;
import c42.r;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.support.wifi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B=\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/d;", "Lm9/u;", "", "machineSerial", "Lcom/dyson/mobile/android/support/deeplink/c;", "supportDeeplinkNavigator", "Lhj/e;", "trackingManager", "Lk81/a;", "supportService", "Lnf1/c;", "locationServicesHelper", "Lag1/c;", "wifiNetworkMonitor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/support/deeplink/c;Lhj/e;Lk81/a;Lnf1/c;Lag1/c;)V", "b", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u {
    public final String d;
    public final com.dyson.mobile.android.support.deeplink.c e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f16912f;

    /* renamed from: g  reason: collision with root package name */
    public final k81.a f16913g;

    /* renamed from: h  reason: collision with root package name */
    public final nf1.c f16914h;

    /* renamed from: i  reason: collision with root package name */
    public final ag1.c f16915i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f16916j;

    /* renamed from: k  reason: collision with root package name */
    public final r1 f16917k;

    /* renamed from: l  reason: collision with root package name */
    public final u1 f16918l;

    /* renamed from: m  reason: collision with root package name */
    public final q1 f16919m;

    /* renamed from: n  reason: collision with root package name */
    public final String[] f16920n;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        d a(String str);
    }

    static {
        new a(null);
    }

    public d(String str, com.dyson.mobile.android.support.deeplink.c cVar, hj.e eVar, k81.a aVar, nf1.c cVar2, ag1.c cVar3) {
        cVar.getClass();
        eVar.getClass();
        aVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        this.d = str;
        this.e = cVar;
        this.f16912f = eVar;
        this.f16913g = aVar;
        this.f16914h = cVar2;
        this.f16915i = cVar3;
        f2 a13 = g2.a(new g.b(false, false, 3, null));
        this.f16916j = a13;
        this.f16917k = r.d(a13);
        u1 b13 = w1.b(0, 0, null, 7);
        this.f16918l = b13;
        this.f16919m = r.c(b13);
        this.f16920n = new String[]{"android.permission.ACCESS_WIFI_STATE", "android.permission.ACCESS_FINE_LOCATION"};
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/d$a;", "", "<init>", "()V", "", "COMPATIBILITY_WIFI", "Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
