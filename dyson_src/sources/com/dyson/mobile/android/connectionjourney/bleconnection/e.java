package com.dyson.mobile.android.connectionjourney.bleconnection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import b0.y1;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineType;
import h12.f0;
import h12.t;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m10.j0;
import m10.n;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/e;", "Lq8/a;", "Landroidx/lifecycle/m;", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "connectionJourneyDataStore", "Lng0/b;", "cjDataObjectManager", "Lt70/a;", "broadcastReceiverWrapper", "Lt70/b;", "broadcastWrapper", "Lw40/a;", "connectionJourneyReportSender", "Lpf0/c;", "localisationManager", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lng0/b;Lt70/a;Lt70/b;Lw40/a;Lpf0/c;)V", "b", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends q8.a implements m {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ e22.m<Object>[] f13364o = {p0.f86717a.f(new y(e.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionNavigator;", 0))};
    public final ConnectionJourneyDataStore d;
    public final ng0.b e;

    /* renamed from: f  reason: collision with root package name */
    public final t70.a f13365f;

    /* renamed from: g  reason: collision with root package name */
    public final t70.b f13366g;

    /* renamed from: h  reason: collision with root package name */
    public final w40.a f13367h;

    /* renamed from: i  reason: collision with root package name */
    public final pf0.c f13368i;

    /* renamed from: j  reason: collision with root package name */
    public final tf1.a f13369j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicBoolean f13370k;

    /* renamed from: l  reason: collision with root package name */
    public int f13371l;

    /* renamed from: m  reason: collision with root package name */
    public final d f13372m;

    /* renamed from: n  reason: collision with root package name */
    public final t f13373n;

    /* loaded from: classes2.dex */
    public interface b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/e$b$a;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/e$b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13374a = new a();

            private a() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/e$b$b;", "Lcom/dyson/mobile/android/connectionjourney/bleconnection/e$b;", "", "authCode", "randomNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.bleconnection.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0410b implements b {

            /* renamed from: a  reason: collision with root package name */
            public final String f13375a;

            /* renamed from: b  reason: collision with root package name */
            public final String f13376b;

            public C0410b(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.f13375a = str;
                this.f13376b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0410b) {
                    C0410b c0410b = (C0410b) obj;
                    return this.f13375a.equals(c0410b.f13375a) && this.f13376b.equals(c0410b.f13376b);
                }
                return false;
            }

            public final int hashCode() {
                return this.f13376b.hashCode() + (this.f13375a.hashCode() * 31);
            }

            public final String toString() {
                return y1.j("StartQRConnectionJourneyService(authCode=", this.f13375a, ", randomNumber=", this.f13376b, ")");
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13377a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13377a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/bleconnection/e$d", "Landroid/content/BroadcastReceiver;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            context.getClass();
            intent.getClass();
            Logger.a("Status Change Received");
            e22.m<Object>[] mVarArr = e.f13364o;
            e.this.m();
        }
    }

    static {
        new a(null);
    }

    public e(ConnectionJourneyDataStore connectionJourneyDataStore, ng0.b bVar, t70.a aVar, t70.b bVar2, w40.a aVar2, pf0.c cVar) {
        connectionJourneyDataStore.getClass();
        bVar.getClass();
        aVar.getClass();
        bVar2.getClass();
        aVar2.getClass();
        cVar.getClass();
        this.d = connectionJourneyDataStore;
        this.e = bVar;
        this.f13365f = aVar;
        this.f13366g = bVar2;
        this.f13367h = aVar2;
        this.f13368i = cVar;
        this.f13369j = new tf1.a(null, 1, null);
        this.f13370k = new AtomicBoolean(true);
        this.f13372m = new d();
        this.f13373n = h12.m.b(new j0(this, 2));
        y70.a aVar3 = connectionJourneyDataStore.f13891c;
        aVar3.remove("ConnectionJourneyServiceStatus-key");
        aVar3.remove("CONNECTION_JOURNEY_PROGRESS");
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = c.f13377a[aVar.ordinal()];
        d dVar = this.f13372m;
        t70.a aVar2 = this.f13365f;
        if (i13 == 1) {
            Logger.a("registerReceiver GattConnectionServiceReceiver");
            aVar2.a(dVar, new IntentFilter("status-updated"), 4);
            m();
        } else if (i13 == 2) {
            this.f13367h.a();
        } else if (i13 != 3) {
        } else {
            Logger.a("unregisterReceiver GattConnectionServiceReceiver");
            aVar2.b(dVar);
        }
    }

    public final n l() {
        return (n) this.f13369j.getValue(this, f13364o[0]);
    }

    public final void m() {
        ConnectionJourneyDataStore connectionJourneyDataStore = this.d;
        String e = connectionJourneyDataStore.e();
        pa.c.s("Status changed to ", e);
        if (e == null) {
            Logger.a("Status has not yet been set no need to navigate");
        } else if (l() == null) {
            Logger.b("Navigator is null - notifyStatusChange", null);
        } else {
            switch (e.hashCode()) {
                case -1950365699:
                    if (e.equals("HOME_WIFI_PASSWORD_STORED")) {
                        n l13 = l();
                        if (l13 != null) {
                            l13.r();
                            return;
                        }
                        return;
                    }
                    break;
                case -1745992575:
                    if (e.equals("PROXIMITY_STARTED")) {
                        n l14 = l();
                        if (l14 != null) {
                            l14.r0();
                            return;
                        }
                        return;
                    }
                    break;
                case -1422693848:
                    if (e.equals("PAIRING_PURIFICATION")) {
                        n l15 = l();
                        if (l15 != null) {
                            l15.s0();
                            return;
                        }
                        return;
                    }
                    break;
                case -1357742389:
                    if (e.equals("USER_ACTION_PERFORMED")) {
                        n l16 = l();
                        if (l16 != null) {
                            l16.s0();
                            return;
                        }
                        return;
                    }
                    break;
                case -1260462238:
                    if (e.equals("OWNERSHIP_FINISHED")) {
                        n l17 = l();
                        if (l17 != null) {
                            l17.Q();
                            return;
                        }
                        return;
                    }
                    break;
                case -1162718879:
                    if (e.equals("PROXIMITY_TIMEOUT")) {
                        if (!this.f13370k.getAndSet(false)) {
                            n l18 = l();
                            if (l18 != null) {
                                l18.Q0();
                                return;
                            }
                            return;
                        }
                        Logger.a("Stopping connection journey");
                        n("stop-connection-journey-action");
                        n l19 = l();
                        if (l19 != null) {
                            l19.g0();
                            return;
                        }
                        return;
                    }
                    break;
                case -418733430:
                    if (e.equals("PROXIMITY_STEPS_FINISHED")) {
                        n l23 = l();
                        if (l23 != null) {
                            l23.P0();
                            return;
                        }
                        return;
                    }
                    break;
                case 200121785:
                    if (e.equals("SUBSEQUENT_JOURNEY_PAIRING_COMPLETE")) {
                        n l24 = l();
                        if (l24 != null) {
                            l24.c0();
                            return;
                        }
                        return;
                    }
                    break;
                case 383160731:
                    if (e.equals("CLOUD_POLLING_STARTED")) {
                        n l25 = l();
                        if (l25 != null) {
                            l25.H0();
                            return;
                        }
                        return;
                    }
                    break;
                case 458717753:
                    if (e.equals("CONNECTION_JOURNEY_COMPLETE")) {
                        n l26 = l();
                        if (l26 != null) {
                            l26.N();
                            return;
                        }
                        return;
                    }
                    break;
                case 966434427:
                    if (e.equals("CLOUD_POLLING_TIMEOUT")) {
                        n l27 = l();
                        if (l27 != null) {
                            MachineType.a aVar = MachineType.Companion;
                            String machineType = connectionJourneyDataStore.j().getMachineType();
                            aVar.getClass();
                            l27.t0(MachineType.a.a(machineType).isGen1Machine());
                            return;
                        }
                        return;
                    }
                    break;
                case 1020797245:
                    if (e.equals("CONNECTION_JOURNEY_FAILED")) {
                        connectionJourneyDataStore.f13891c.remove("CONNECTION_JOURNEY_RESULT-key");
                        n l28 = l();
                        if (l28 != null) {
                            l28.A();
                            return;
                        }
                        return;
                    }
                    break;
                case 1297584760:
                    if (e.equals("CLOUD_POLLING_FINISHED")) {
                        n l29 = l();
                        if (l29 != null) {
                            l29.T();
                            return;
                        }
                        return;
                    }
                    break;
                case 1309636150:
                    if (e.equals("MACHINE_BANNED")) {
                        String j8 = connectionJourneyDataStore.d().j();
                        n l33 = l();
                        if (l33 != null) {
                            l33.s(j8, connectionJourneyDataStore.j());
                            return;
                        }
                        return;
                    }
                    break;
                case 1445166145:
                    if (e.equals("RECOVERABLE_WIFI_FAILURE")) {
                        if (this.f13371l < 2) {
                            n l34 = l();
                            if (l34 != null) {
                                l34.z();
                                this.f13371l++;
                                return;
                            }
                            return;
                        }
                        n l35 = l();
                        if (l35 != null) {
                            l35.W();
                            f0 f0Var = f0.f36844a;
                            return;
                        }
                        return;
                    }
                    break;
                case 1761911487:
                    if (e.equals("JOIN_NETWORK_COMPLETE")) {
                        n l36 = l();
                        if (l36 != null) {
                            l36.B();
                            return;
                        }
                        return;
                    }
                    break;
                case 1983502641:
                    if (e.equals("ON_WIFI_LIST_RETRIEVED")) {
                        n l37 = l();
                        if (l37 != null) {
                            l37.O();
                            return;
                        }
                        return;
                    }
                    break;
                case 2120838423:
                    if (e.equals("WRONG_HOME_WIFI_PASSWORD")) {
                        n l38 = l();
                        if (l38 != null) {
                            l38.F0();
                            return;
                        }
                        return;
                    }
                    break;
            }
            Logger.e("Not handling status: ".concat(e), null);
        }
    }

    public final void n(String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        this.f13366g.a(intent);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/e$a;", "", "<init>", "()V", "", "MAX_NUMBER_OF_CONNECTION_ISSUES_RETRIES", "I", "NUMBER_OF_INITIAL_CONNECTION_JOURNEY_STEPS", "NUMBER_OF_SUBSEQUENT_CONNECTION_JOURNEY_STEPS", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
