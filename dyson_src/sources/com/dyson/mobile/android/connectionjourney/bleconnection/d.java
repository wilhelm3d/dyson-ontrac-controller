package com.dyson.mobile.android.connectionjourney.bleconnection;

import af1.g;
import b42.m;
import c42.c1;
import c42.f2;
import c42.g2;
import c42.r1;
import com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionRoute;
import com.dyson.mobile.android.connectionjourney.bleconnection.b;
import com.dyson.mobile.android.connectionjourney.bleconnection.c;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import h12.f0;
import h12.r;
import h12.t;
import k30.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import m10.l;
import m9.u;
import m9.v;
import n12.i;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/d;", "Lm9/u;", "Lm10/l;", "gattConnectionManager", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "connectionJourneyDataStore", "Lng0/b;", "cjDataObjectManager", "Lqh/a;", "accountDataStore", "Lb10/c;", "alertViewStateFactory", "Lc10/a;", "analyticsTracker", "<init>", "(Lm10/l;Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lng0/b;Lqh/a;Lb10/c;Lc10/a;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends u {
    public final l d;
    public final ConnectionJourneyDataStore e;

    /* renamed from: f  reason: collision with root package name */
    public final qh.a f13351f;

    /* renamed from: g  reason: collision with root package name */
    public final b10.c f13352g;

    /* renamed from: h  reason: collision with root package name */
    public final c10.a f13353h;

    /* renamed from: i  reason: collision with root package name */
    public final b42.c f13354i;

    /* renamed from: j  reason: collision with root package name */
    public final c42.e f13355j;

    /* renamed from: k  reason: collision with root package name */
    public final b42.c f13356k;

    /* renamed from: l  reason: collision with root package name */
    public final c42.e f13357l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f13358m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f13359n;

    /* renamed from: o  reason: collision with root package name */
    public final t f13360o;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm10/r1;", "previous", "current", "<anonymous>", "(Lm10/r1;Lm10/r1;)Lm10/r1;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.bleconnection.GattConnectionNdsViewModel$1", f = "GattConnectionNdsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends i implements Function3<m10.r1, m10.r1, l12.d<? super m10.r1>, Object> {
        public /* synthetic */ m10.r1 d;
        public /* synthetic */ m10.r1 e;

        public a(l12.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(m10.r1 r1Var, m10.r1 r1Var2, l12.d<? super m10.r1> dVar) {
            a aVar = new a(dVar);
            aVar.d = r1Var;
            aVar.e = r1Var2;
            return aVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m10.r1 r1Var = this.d;
            m10.r1 r1Var2 = this.e;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            d dVar = d.this;
            dVar.getClass();
            int[] iArr = b.f13362a;
            int i13 = iArr[r1Var2.ordinal()];
            if (i13 == 1) {
                dVar.U(GattConnectionRoute.Proximity.INSTANCE);
                return r1Var2;
            } else if (i13 == 2) {
                dVar.U(GattConnectionRoute.Pairing.INSTANCE);
                return r1Var2;
            } else if (i13 == 3) {
                dVar.U(GattConnectionRoute.Connection.INSTANCE);
                return r1Var2;
            } else if (i13 == 4) {
                g.a(dVar.f13356k, v.a(dVar), new c.g(dVar.e.d().j(), 1));
                return r1Var2;
            } else {
                if (i13 == 5) {
                    int i14 = r1Var == null ? -1 : iArr[r1Var.ordinal()];
                    if (i14 != 1 && i14 != 2) {
                        switch (i14) {
                            case 6:
                            case 7:
                                dVar.U(GattConnectionRoute.NetworkSelectionError.INSTANCE);
                                return r1Var2;
                        }
                    }
                    dVar.U(GattConnectionRoute.PairingError.INSTANCE);
                    return r1Var2;
                }
                return r1Var2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13362a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f13363b;

        static {
            int[] iArr = new int[m10.r1.values().length];
            try {
                iArr[m10.r1.PROXIMITY_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m10.r1.USER_ACTION_PERFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m10.r1.HOME_WIFI_PASSWORD_STORED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m10.r1.MACHINE_BANNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m10.r1.CONNECTION_JOURNEY_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m10.r1.ON_WIFI_LIST_RETRIEVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[m10.r1.ON_WIFI_LIST_RESCANNING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[m10.r1.PROXIMITY_STEPS_FINISHED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[m10.r1.PROXIMITY_TIMEOUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f13362a = iArr;
            int[] iArr2 = new int[b10.b.values().length];
            try {
                iArr2[b10.b.CONFIRM_CANCEL_CONNECTION_JOURNEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[b10.b.CONFIRM_RETRY_CONNECTION_JOURNEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f13363b = iArr2;
        }
    }

    public d(l lVar, ConnectionJourneyDataStore connectionJourneyDataStore, ng0.b bVar, qh.a aVar, b10.c cVar, c10.a aVar2) {
        lVar.getClass();
        connectionJourneyDataStore.getClass();
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        aVar2.getClass();
        this.d = lVar;
        this.e = connectionJourneyDataStore;
        this.f13351f = aVar;
        this.f13352g = cVar;
        this.f13353h = aVar2;
        b42.c b13 = m.b(0, null, null, 7);
        this.f13354i = b13;
        this.f13355j = c42.r.B(b13);
        b42.c b14 = m.b(0, null, null, 7);
        this.f13356k = b14;
        this.f13357l = c42.r.B(b14);
        f2 a13 = g2.a(null);
        this.f13358m = a13;
        this.f13359n = c42.r.d(a13);
        this.f13360o = h12.m.b(new j(this, 28));
        y70.a aVar3 = connectionJourneyDataStore.f13891c;
        aVar3.remove("ConnectionJourneyServiceStatus-key");
        aVar3.remove("CONNECTION_JOURNEY_PROGRESS");
        connectionJourneyDataStore.b();
        c42.r.y(new c1(null, lVar.f52861i, new a(null)), v.a(this));
    }

    public final void S(com.dyson.mobile.android.connectionjourney.bleconnection.b bVar) {
        f2 f2Var;
        Object value;
        bVar.getClass();
        if (bVar.equals(b.c.f13332a)) {
            T(b10.b.CONFIRM_CANCEL_CONNECTION_JOURNEY);
        } else if (bVar.equals(b.C0408b.f13331a)) {
            T(b10.b.CONFIRM_RETRY_CONNECTION_JOURNEY);
        } else if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            b10.b bVar2 = aVar.f13329a;
            boolean z13 = aVar.f13330b;
            c10.a aVar2 = this.f13353h;
            if (z13) {
                aVar2.a(bVar2);
            } else {
                aVar2.b(bVar2);
            }
            do {
                f2Var = this.f13358m;
                value = f2Var.getValue();
                b10.a aVar3 = (b10.a) value;
            } while (!f2Var.f(value, null));
            int i13 = b.f13363b[bVar2.ordinal()];
            b42.c cVar = this.f13356k;
            if (i13 == 1) {
                if (z13) {
                    g.a(cVar, v.a(this), c.a.f13342a);
                }
            } else if (i13 == 2 && z13) {
                g.a(cVar, v.a(this), c.b.f13343a);
            }
        } else {
            boolean z14 = bVar instanceof b.g;
            l lVar = this.d;
            if (z14) {
                if (!((b.g) bVar).f13336a) {
                    U(new GattConnectionRoute.NetworkSelection(true));
                    return;
                }
                U(GattConnectionRoute.Connection.INSTANCE);
                lVar.m("continue-subsequent-journey-action");
            } else if (bVar.equals(b.h.f13337a)) {
                U(new GattConnectionRoute.EnterNetworkPassword(true));
            } else if (bVar instanceof b.i) {
                U(new GattConnectionRoute.Troubleshoot(((b.i) bVar).f13338a));
            } else if (bVar.equals(b.e.f13334a)) {
                U(GattConnectionRoute.LocatePairingCode.INSTANCE);
            } else if (bVar.equals(b.d.f13333a)) {
                U(GattConnectionRoute.ManualCodeEntry.INSTANCE);
            } else if (!bVar.equals(b.f.f13335a)) {
                ma.e.o();
            } else {
                lVar.m("start-manual-steps-action");
                U(GattConnectionRoute.Proximity.INSTANCE);
            }
        }
    }

    public final void T(b10.b bVar) {
        f2 f2Var;
        Object value;
        this.f13353h.c(bVar);
        do {
            f2Var = this.f13358m;
            value = f2Var.getValue();
            b10.a aVar = (b10.a) value;
        } while (!f2Var.f(value, this.f13352g.a(bVar)));
    }

    public final void U(GattConnectionRoute gattConnectionRoute) {
        g.a(this.f13354i, v.a(this), gattConnectionRoute);
    }
}
