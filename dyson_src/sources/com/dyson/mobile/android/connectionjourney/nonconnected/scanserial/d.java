package com.dyson.mobile.android.connectionjourney.nonconnected.scanserial;

import af1.i;
import android.os.CountDownTimer;
import b30.h;
import com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import hj.e;
import k30.f;
import k30.g;
import k30.q;
import kotlin.Metadata;
import m9.u;
import u3.k1;
import u3.y2;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/d;", "Lm9/u;", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "dataStore", "Lb30/h;", "serialNumberValidator", "Lk30/g;", "scanCountdownTimerProvider", "Lhj/e;", "trackingManager", "Laf1/i;", "dispatcherProvider", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lb30/h;Lk30/g;Lhj/e;Laf1/i;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends u {
    public final ConnectionJourneyDataStore d;
    public final h e;

    /* renamed from: f  reason: collision with root package name */
    public final g f13731f;

    /* renamed from: g  reason: collision with root package name */
    public final e f13732g;

    /* renamed from: h  reason: collision with root package name */
    public final i f13733h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a<a> f13734i;

    /* renamed from: j  reason: collision with root package name */
    public final k1<ScannedSerialError> f13735j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f13736k;

    /* renamed from: l  reason: collision with root package name */
    public CountDownTimer f13737l;

    public d(ConnectionJourneyDataStore connectionJourneyDataStore, h hVar, g gVar, e eVar, i iVar) {
        connectionJourneyDataStore.getClass();
        hVar.getClass();
        gVar.getClass();
        eVar.getClass();
        iVar.getClass();
        this.d = connectionJourneyDataStore;
        this.e = hVar;
        this.f13731f = gVar;
        this.f13732g = eVar;
        this.f13733h = iVar;
        this.f13734i = new xf1.a<>();
        this.f13735j = androidx.compose.runtime.d.j(null);
    }

    public final void S(a aVar) {
        aVar.getClass();
        if (aVar.equals(a.g.f13726a)) {
            ((y2) this.f13735j).setValue(null);
        }
        this.f13734i.setValue(aVar);
    }

    public final void T() {
        if (this.f13736k) {
            return;
        }
        this.f13736k = true;
        q qVar = new q(this, 0);
        int i13 = g.f46768a;
        this.f13737l = this.f13731f.a(new f(0), qVar).start();
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.f13736k = false;
        CountDownTimer countDownTimer = this.f13737l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f13737l = null;
    }
}
