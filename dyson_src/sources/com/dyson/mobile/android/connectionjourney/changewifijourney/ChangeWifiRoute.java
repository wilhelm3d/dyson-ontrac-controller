package com.dyson.mobile.android.connectionjourney.changewifijourney;

import androidx.annotation.Keep;
import h12.l;
import h12.m;
import h12.n;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s50.i0;
import t42.g;
import x42.e0;
import x42.g1;
import x42.l1;
import x42.o1;
import x42.w1;
/* loaded from: classes2.dex */
public interface ChangeWifiRoute {

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$CameraPermissionRationale;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "Ls50/a;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class CameraPermissionRationale implements ChangeWifiRoute, s50.a {
        public static final int $stable = 0;
        public static final CameraPermissionRationale INSTANCE = new CameraPermissionRationale();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(21));

        private CameraPermissionRationale() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.CameraPermissionRationale", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraPermissionRationale);
        }

        public int hashCode() {
            return 1771976973;
        }

        public final t42.b<CameraPermissionRationale> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "CameraPermissionRationale";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$Connection;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class Connection implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final Connection INSTANCE = new Connection();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(22));

        private Connection() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.Connection", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connection);
        }

        public int hashCode() {
            return -492444780;
        }

        public final t42.b<Connection> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Connection";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnableBluetooth;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class EnableBluetooth implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final EnableBluetooth INSTANCE = new EnableBluetooth();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(23));

        private EnableBluetooth() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.EnableBluetooth", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableBluetooth);
        }

        public int hashCode() {
            return 531979637;
        }

        public final t42.b<EnableBluetooth> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "EnableBluetooth";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$Proximity;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class Proximity implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final Proximity INSTANCE = new Proximity();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(24));

        private Proximity() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.Proximity", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Proximity);
        }

        public int hashCode() {
            return 1181662473;
        }

        public final t42.b<Proximity> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Proximity";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$ProximityError;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class ProximityError implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final ProximityError INSTANCE = new ProximityError();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(25));

        private ProximityError() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.ProximityError", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ProximityError);
        }

        public int hashCode() {
            return 631038591;
        }

        public final t42.b<ProximityError> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "ProximityError";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$Troubleshoot;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class Troubleshoot implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final Troubleshoot INSTANCE = new Troubleshoot();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(26));

        private Troubleshoot() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.Troubleshoot", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Troubleshoot);
        }

        public int hashCode() {
            return -1614575682;
        }

        public final t42.b<Troubleshoot> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Troubleshoot";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$WifiQrScan;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "Ls50/i0;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class WifiQrScan implements ChangeWifiRoute, i0 {
        public static final int $stable = 0;
        public static final WifiQrScan INSTANCE = new WifiQrScan();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(27));

        private WifiQrScan() {
        }

        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.WifiQrScan", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WifiQrScan);
        }

        public int hashCode() {
            return 367193193;
        }

        public final t42.b<WifiQrScan> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "WifiQrScan";
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\u0003\u0010\u0015¨\u0006%"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnterNetworkPassword;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "", "isRetry", "<init>", "(Z)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(IZLx42/w1;)V", "self", "Lw42/d;", "output", "Lv42/e;", "serialDesc", "Lh12/f0;", "write$Self$mod_connection_journey", "(Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnterNetworkPassword;Lw42/d;Lv42/e;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnterNetworkPassword;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Companion", "a", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class EnterNetworkPassword implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final boolean isRetry;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute.EnterNetworkPassword.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnterNetworkPassword;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @h12.e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<EnterNetworkPassword> {

            /* renamed from: a */
            public static final a f13399a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f13399a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.EnterNetworkPassword", aVar, 1);
                o1Var.i("isRetry", false);
                descriptor = o1Var;
            }

            private a() {
            }

            @Override // t42.h, t42.a
            public final v42.e a() {
                return descriptor;
            }

            @Override // t42.a
            public final Object b(w42.e eVar) {
                v42.e eVar2 = descriptor;
                w42.c c13 = eVar.c(eVar2);
                boolean z13 = true;
                int i13 = 0;
                boolean z14 = false;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        z14 = c13.v(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new EnterNetworkPassword(i13, z14, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{x42.g.f86854a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                EnterNetworkPassword enterNetworkPassword = (EnterNetworkPassword) obj;
                enterNetworkPassword.getClass();
                v42.e eVar = descriptor;
                w42.d c13 = bVar.c(eVar);
                EnterNetworkPassword.write$Self$mod_connection_journey(enterNetworkPassword, c13, eVar);
                c13.a(eVar);
            }
        }

        public /* synthetic */ EnterNetworkPassword(int i13, boolean z13, w1 w1Var) {
            if (1 == (i13 & 1)) {
                this.isRetry = z13;
            } else {
                l1.g(i13, 1, a.f13399a.a());
                throw null;
            }
        }

        public static /* synthetic */ EnterNetworkPassword copy$default(EnterNetworkPassword enterNetworkPassword, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = enterNetworkPassword.isRetry;
            }
            return enterNetworkPassword.copy(z13);
        }

        public static final /* synthetic */ void write$Self$mod_connection_journey(EnterNetworkPassword enterNetworkPassword, w42.d dVar, v42.e eVar) {
            dVar.n(eVar, 0, enterNetworkPassword.isRetry);
        }

        public final boolean component1() {
            return this.isRetry;
        }

        public final EnterNetworkPassword copy(boolean z13) {
            return new EnterNetworkPassword(z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EnterNetworkPassword) && this.isRetry == ((EnterNetworkPassword) obj).isRetry;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRetry);
        }

        public final boolean isRetry() {
            return this.isRetry;
        }

        public String toString() {
            return d72.a.j("EnterNetworkPassword(isRetry=", ")", this.isRetry);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnterNetworkPassword$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$EnterNetworkPassword;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<EnterNetworkPassword> serializer() {
                return a.f13399a;
            }

            private b() {
            }
        }

        public EnterNetworkPassword(boolean z13) {
            this.isRetry = z13;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$NetworkSelection;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute;", "", "shouldAutoSelectNetwork", "<init>", "(Z)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(IZLx42/w1;)V", "self", "Lw42/d;", "output", "Lv42/e;", "serialDesc", "Lh12/f0;", "write$Self$mod_connection_journey", "(Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$NetworkSelection;Lw42/d;Lv42/e;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$NetworkSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getShouldAutoSelectNetwork", "Companion", "a", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class NetworkSelection implements ChangeWifiRoute {
        public static final int $stable = 0;
        public static final b Companion = new b(null);
        private final boolean shouldAutoSelectNetwork;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute.NetworkSelection.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$NetworkSelection;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @h12.e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<NetworkSelection> {

            /* renamed from: a */
            public static final a f13400a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f13400a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute.NetworkSelection", aVar, 1);
                o1Var.i("shouldAutoSelectNetwork", false);
                descriptor = o1Var;
            }

            private a() {
            }

            @Override // t42.h, t42.a
            public final v42.e a() {
                return descriptor;
            }

            @Override // t42.a
            public final Object b(w42.e eVar) {
                v42.e eVar2 = descriptor;
                w42.c c13 = eVar.c(eVar2);
                boolean z13 = true;
                int i13 = 0;
                boolean z14 = false;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        z14 = c13.v(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new NetworkSelection(i13, z14, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{x42.g.f86854a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                NetworkSelection networkSelection = (NetworkSelection) obj;
                networkSelection.getClass();
                v42.e eVar = descriptor;
                w42.d c13 = bVar.c(eVar);
                NetworkSelection.write$Self$mod_connection_journey(networkSelection, c13, eVar);
                c13.a(eVar);
            }
        }

        public /* synthetic */ NetworkSelection(int i13, boolean z13, w1 w1Var) {
            if (1 == (i13 & 1)) {
                this.shouldAutoSelectNetwork = z13;
            } else {
                l1.g(i13, 1, a.f13400a.a());
                throw null;
            }
        }

        public static /* synthetic */ NetworkSelection copy$default(NetworkSelection networkSelection, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z13 = networkSelection.shouldAutoSelectNetwork;
            }
            return networkSelection.copy(z13);
        }

        public static final /* synthetic */ void write$Self$mod_connection_journey(NetworkSelection networkSelection, w42.d dVar, v42.e eVar) {
            dVar.n(eVar, 0, networkSelection.shouldAutoSelectNetwork);
        }

        public final boolean component1() {
            return this.shouldAutoSelectNetwork;
        }

        public final NetworkSelection copy(boolean z13) {
            return new NetworkSelection(z13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkSelection) && this.shouldAutoSelectNetwork == ((NetworkSelection) obj).shouldAutoSelectNetwork;
        }

        public final boolean getShouldAutoSelectNetwork() {
            return this.shouldAutoSelectNetwork;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldAutoSelectNetwork);
        }

        public String toString() {
            return d72.a.j("NetworkSelection(shouldAutoSelectNetwork=", ")", this.shouldAutoSelectNetwork);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$NetworkSelection$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectionjourney/changewifijourney/ChangeWifiRoute$NetworkSelection;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<NetworkSelection> serializer() {
                return a.f13400a;
            }

            private b() {
            }
        }

        public NetworkSelection(boolean z13) {
            this.shouldAutoSelectNetwork = z13;
        }
    }
}
