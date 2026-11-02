package com.dyson.mobile.android.connectivity.ble;

import android.annotation.SuppressLint;
import com.dyson.mobile.android.connectivity.ble.b;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import dz1.r;
import f60.i;
import h12.f0;
import java.util.List;
import k60.h;
import k60.k;
import kotlin.Metadata;
import kz1.b;
import nz1.o;
import rz1.a0;
import rz1.k0;
import rz1.s0;
import x50.e0;
import x50.g0;
import x50.i0;
import x50.l0;
import x50.m0;
import x50.u;
import x50.v;
import x50.w;
import x50.x;
import x50.z;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/e;", "Lx50/l0;", "Lx50/u;", "bleConnectionProvider", "Lk60/k;", "messageFragmentSizeResolver", "Lse1/e;", "buildVersionProvider", "<init>", "(Lx50/u;Lk60/k;Lse1/e;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e implements l0 {

    /* renamed from: a  reason: collision with root package name */
    public final u f14001a;

    /* renamed from: b  reason: collision with root package name */
    public final k f14002b;

    /* renamed from: c  reason: collision with root package name */
    public MachineSerial f14003c;
    public final i0 d;
    public final gz1.b e;

    /* renamed from: f  reason: collision with root package name */
    public v f14004f;

    /* renamed from: g  reason: collision with root package name */
    public x f14005g;

    /* renamed from: h  reason: collision with root package name */
    public w12.a<f0> f14006h;

    public e(u uVar, k kVar, se1.e eVar) {
        uVar.getClass();
        kVar.getClass();
        eVar.getClass();
        this.f14001a = uVar;
        this.f14002b = kVar;
        this.d = new i0(eVar);
        this.e = new gz1.b();
        this.f14006h = new x30.a(5);
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @h12.e
    public final <T> r<T> D(h hVar, b.a<T> aVar) {
        return c(hVar, new g(aVar));
    }

    @Override // x50.l0
    public final dz1.x<m0> a(h hVar) {
        hVar.getClass();
        x xVar = this.f14005g;
        return xVar != null ? xVar.d(hVar) : dz1.x.g(new NotConnectedException());
    }

    @Override // x50.l0
    public final <T> r<T> c(h hVar, g0<T> g0Var) {
        hVar.getClass();
        x xVar = this.f14005g;
        return xVar != null ? xVar.e(hVar, g0Var) : r.u(new NotConnectedException());
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @SuppressLint({"MissingPermission"})
    public final void close() {
        Logger.a("CLOSE called on ble client");
        v vVar = this.f14004f;
        if (vVar != null) {
            Logger.a("close() called on BluetoothGatt instance");
            vVar.f87024c.close();
        } else {
            Logger.a("Couldn't close - device is null ");
        }
        x xVar = this.f14005g;
        if (xVar != null) {
            xVar.f87026a.f86980f.e();
        }
        this.e.e();
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @SuppressLint({"MissingPermission"})
    public final void disconnect() {
        Logger.a("DISCONNECT called on ble client");
        v vVar = this.f14004f;
        if (vVar != null) {
            Logger.a("disconnect() called on BluetoothGatt instance");
            vVar.f87024c.disconnect();
        } else {
            Logger.a("Couldn't disconnect - device is null ");
        }
        this.f14006h.invoke();
    }

    @Override // x50.l0
    public final <T> dz1.x<T> f(h hVar, g0<T> g0Var) {
        hVar.getClass();
        g0Var.getClass();
        x xVar = this.f14005g;
        return xVar != null ? xVar.e(hVar, g0Var).x() : dz1.x.g(new NotConnectedException());
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @SuppressLint({"MissingPermission"})
    public final boolean isConnected() {
        v vVar = this.f14004f;
        return vVar != null && vVar.d.getConnectionState(vVar.f87023b, 7) == 2;
    }

    @Override // x50.l0
    public final <T> r<T> n(g0<T> g0Var) {
        x xVar = this.f14005g;
        return xVar != null ? xVar.b(g0Var) : r.u(new NotConnectedException());
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final MachineSerial p() {
        return this.f14003c;
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b q(List<? extends e0> list) {
        rz1.i0 A = r.A(list);
        x50.g gVar = new x50.g(new w(6), 27);
        b.a aVar = kz1.b.f50218a;
        s0 s0Var = new s0(A, gVar);
        x50.g gVar2 = new x50.g(new z(this, 4), 28);
        kz1.b.b(2, "prefetch");
        return new rz1.m0(new qz1.d(s0Var, gVar2, xz1.e.IMMEDIATE, 2));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @SuppressLint({"MissingPermission"})
    public final dz1.b r() {
        k0 k0Var = this.d.f86995h;
        x50.g gVar = new x50.g(new z(this, 5), 21);
        k0Var.getClass();
        return new o(k0Var.s(gVar, kz1.a.f50215c).t(new x50.g(new z(this, 0), 22)).x());
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @h12.e
    public final dz1.b s(h hVar) {
        hVar.getClass();
        return new o(a(hVar));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final void t(i.a aVar) {
        this.f14006h = aVar;
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @h12.e
    public final <T> r<T> u(b.a<T> aVar) {
        return n(new g(aVar));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    @h12.e
    public final <T> dz1.x<T> v(h hVar, b.a<T> aVar) {
        hVar.getClass();
        aVar.getClass();
        return f(hVar, new g(aVar));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b w(MachineSerial machineSerial, String str) {
        this.f14003c = machineSerial;
        i0 i0Var = this.d;
        i0Var.f86991b = machineSerial;
        d02.d<m0> dVar = i0Var.f86992c;
        dVar.getClass();
        rz1.u s13 = new k0(dVar).s(new x50.g(new x1.f(2, this, machineSerial, str), 29), kz1.a.f50215c);
        va0.d dVar2 = new va0.d(new w(8), 14);
        b.a aVar = kz1.b.f50218a;
        return new o(new a0(s13, dVar2).x());
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final dz1.b x(List<? extends e0> list) {
        rz1.i0 A = r.A(list);
        x50.g gVar = new x50.g(new w(7), 25);
        b.a aVar = kz1.b.f50218a;
        s0 s0Var = new s0(A, gVar);
        x50.g gVar2 = new x50.g(new z(this, 3), 26);
        kz1.b.b(2, "prefetch");
        return new rz1.m0(new qz1.d(s0Var, gVar2, xz1.e.IMMEDIATE, 2));
    }

    @Override // com.dyson.mobile.android.connectivity.ble.b
    public final f<GattMachineConnectionInfo, x50.f0> y() {
        return null;
    }
}
