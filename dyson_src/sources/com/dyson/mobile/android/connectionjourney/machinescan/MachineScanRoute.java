package com.dyson.mobile.android.connectionjourney.machinescan;

import androidx.annotation.Keep;
import h12.l;
import h12.m;
import h12.n;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import t42.g;
import x42.g1;
/* loaded from: classes2.dex */
public interface MachineScanRoute {

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanRoute$EnableBluetooth;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class EnableBluetooth implements MachineScanRoute {
        public static final int $stable = 0;
        public static final EnableBluetooth INSTANCE = new EnableBluetooth();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(10));

        private EnableBluetooth() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.machinescan.MachineScanRoute.EnableBluetooth", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnableBluetooth);
        }

        public int hashCode() {
            return -9238171;
        }

        public final t42.b<EnableBluetooth> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "EnableBluetooth";
        }
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanRoute$Scan;", "Lcom/dyson/mobile/android/connectionjourney/machinescan/MachineScanRoute;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class Scan implements MachineScanRoute {
        public static final int $stable = 0;
        public static final Scan INSTANCE = new Scan();
        private static final /* synthetic */ l<t42.b<Object>> $cachedSerializer$delegate = m.a(n.PUBLICATION, new si0.d(11));

        private Scan() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ t42.b _init_$_anonymous_() {
            return new g1("com.dyson.mobile.android.connectionjourney.machinescan.MachineScanRoute.Scan", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ t42.b get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Scan);
        }

        public int hashCode() {
            return 2087507395;
        }

        public final t42.b<Scan> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "Scan";
        }
    }
}
