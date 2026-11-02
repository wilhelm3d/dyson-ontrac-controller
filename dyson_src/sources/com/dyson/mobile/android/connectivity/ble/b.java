package com.dyson.mobile.android.connectivity.ble;

import com.dyson.mobile.android.machinetype.MachineSerial;
import dz1.r;
import dz1.x;
import f60.i;
import java.util.List;
import k60.h;
import x50.e0;
import x50.f0;
/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public interface a<T> {
        T a(in0.b bVar);
    }

    <T> r<T> D(h hVar, a<T> aVar);

    void close();

    void disconnect();

    boolean isConnected();

    MachineSerial p();

    dz1.b q(List<? extends e0> list);

    dz1.b r();

    dz1.b s(h hVar);

    void t(i.a aVar);

    <T> r<T> u(a<T> aVar);

    <T> x<T> v(h hVar, a<T> aVar);

    dz1.b w(MachineSerial machineSerial, String str);

    dz1.b x(List<? extends e0> list);

    f<GattMachineConnectionInfo, f0> y();
}
