package com.dyson.mobile.android.connectivity.ble;

import in0.j;
import in0.m;
import u50.i;
import u50.l;
/* loaded from: classes2.dex */
public interface f<T extends i, E extends l> {

    /* loaded from: classes2.dex */
    public enum a {
        CONNECTED,
        CONNECTING,
        DISCONNECTED,
        DISCONNECTING,
        CLOSED,
        INVALID
    }

    @FunctionalInterface
    /* loaded from: classes2.dex */
    public interface b {
        void a(a aVar, e eVar);
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(j jVar);

        void b(j jVar);
    }

    /* loaded from: classes2.dex */
    public interface d {
        void b(m mVar);

        void c(j jVar);
    }

    /* loaded from: classes2.dex */
    public enum e {
        SUBSCRIBED,
        SUBSCRIBING,
        UNSUBSCRIBED
    }

    void b(j jVar);

    void c(d dVar);

    void d(b bVar);

    void e(c cVar);

    void f(c cVar);

    void g(GattMachineConnectionInfo gattMachineConnectionInfo);

    void h(b bVar);

    void i(E e13);

    void j(in0.b bVar);

    void k(E e13);

    void l(d dVar);
}
