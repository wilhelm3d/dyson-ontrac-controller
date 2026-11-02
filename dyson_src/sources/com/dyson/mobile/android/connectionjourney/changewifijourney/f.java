package com.dyson.mobile.android.connectionjourney.changewifijourney;

import af1.g;
import af1.i;
import b42.m;
import c42.r;
import com.dyson.mobile.android.connectionjourney.changewifijourney.ChangeWifiRoute;
import com.dyson.mobile.android.connectionjourney.changewifijourney.b;
import com.dyson.mobile.android.connectionjourney.changewifijourney.c;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import h12.t;
import kotlin.Metadata;
import m9.u;
import m9.v;
import v10.o;
import z32.g0;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/f;", "Lm9/u;", "Laf1/i;", "dispatcherProvider", "Lv10/o;", "changeWifiProvider", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "connectionJourneyDataStore", "Lqh/a;", "accountDataStore", "Lx50/c;", "bleManager", "<init>", "(Laf1/i;Lv10/o;Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lqh/a;Lx50/c;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends u {
    public final i d;
    public final o e;

    /* renamed from: f  reason: collision with root package name */
    public final qh.a f13417f;

    /* renamed from: g  reason: collision with root package name */
    public final x50.c f13418g;

    /* renamed from: h  reason: collision with root package name */
    public final b42.c f13419h;

    /* renamed from: i  reason: collision with root package name */
    public final c42.e f13420i;

    /* renamed from: j  reason: collision with root package name */
    public final b42.c f13421j;

    /* renamed from: k  reason: collision with root package name */
    public final c42.e f13422k;

    /* renamed from: l  reason: collision with root package name */
    public final b42.c f13423l;

    /* renamed from: m  reason: collision with root package name */
    public final c42.e f13424m;

    /* renamed from: n  reason: collision with root package name */
    public final t f13425n;

    public f(i iVar, o oVar, ConnectionJourneyDataStore connectionJourneyDataStore, qh.a aVar, x50.c cVar) {
        iVar.getClass();
        oVar.getClass();
        connectionJourneyDataStore.getClass();
        aVar.getClass();
        cVar.getClass();
        this.d = iVar;
        this.e = oVar;
        this.f13417f = aVar;
        this.f13418g = cVar;
        b42.c b13 = m.b(0, null, null, 7);
        this.f13419h = b13;
        this.f13420i = r.B(b13);
        b42.c b14 = m.b(0, null, null, 7);
        this.f13421j = b14;
        this.f13422k = r.B(b14);
        b42.c b15 = m.b(0, null, null, 7);
        this.f13423l = b15;
        this.f13424m = r.B(b15);
        connectionJourneyDataStore.b();
        this.f13425n = h12.m.b(new uk.a(this, 8));
    }

    public final void S() {
        g0.r(v.a(this), this.d.c(), null, new e(this, null), 2);
    }

    public final void T(b bVar) {
        bVar.getClass();
        if (bVar.equals(b.C0414b.f13405a)) {
            U(ChangeWifiRoute.Proximity.INSTANCE);
        } else if (bVar.equals(b.a.f13404a)) {
            S();
        } else if (bVar.equals(b.c.f13406a)) {
            S();
        } else if (bVar.equals(b.e.f13408a)) {
            U(new ChangeWifiRoute.NetworkSelection(true));
        } else if (bVar.equals(b.f.f13409a)) {
            U(ChangeWifiRoute.ProximityError.INSTANCE);
        } else if (bVar.equals(b.g.f13410a)) {
            U(ChangeWifiRoute.Proximity.INSTANCE);
        } else if (bVar.equals(b.h.f13411a)) {
            g.a(this.f13421j, v.a(this), c.C0415c.f13416a);
        } else if (bVar.equals(b.d.f13407a)) {
            S();
        } else if (bVar.equals(b.i.f13412a)) {
            U(new ChangeWifiRoute.EnterNetworkPassword(true));
        } else if (bVar.equals(b.j.f13413a)) {
            U(ChangeWifiRoute.Troubleshoot.INSTANCE);
        } else {
            ma.e.o();
        }
    }

    public final void U(ChangeWifiRoute changeWifiRoute) {
        g.a(this.f13419h, v.a(this), changeWifiRoute);
    }
}
