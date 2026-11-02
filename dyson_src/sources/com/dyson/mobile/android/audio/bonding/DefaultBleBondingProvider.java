package com.dyson.mobile.android.audio.bonding;

import bh1.f;
import com.dyson.mobile.android.audio.bonding.DefaultBleBondingProvider;
import com.dyson.mobile.android.audio.bonding.c;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import d02.d;
import dz1.b0;
import dz1.r;
import ep.l;
import f60.i;
import f60.z;
import ga0.c0;
import i60.d;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import nz1.j;
import nz1.o;
import nz1.w;
import nz1.x;
import rz1.a0;
import rz1.m0;
import rz1.n;
import rz1.p1;
import rz1.s0;
import rz1.t;
import rz1.v1;
import software.amazon.awssdk.crt.http.Http2StreamManagerOptions;
import vj.e0;
import vj.h;
import x42.m1;
import xj.f;
import xj.g;
import xj.k;
import xj.m;
import xj.p;
import xj.q;
import z50.e;
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001c\u001dBg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/DefaultBleBondingProvider;", "Lxj/g;", "", "macAddress", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "Lf60/i;", "authenticatedBleConnector", "Lxj/i;", "classicBluetoothScanner", "Lz50/a;", "bleBondChecker", "Lz50/e;", "bluetoothBondManager", "Le70/e;", "systemGattConnectionChecker", "Li60/d;", "bleScanLockout", "Lxj/k;", "corruptedBondDuringBondingFlowChecker", "Lvj/e0;", "suppressAudioPairingIssueDetectionWhileInAppBondingFlowInProgressSingleton", "Lep/l;", "lineInProvider", "Lvj/h;", "machineDataStore", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineSerial;Lf60/i;Lxj/i;Lz50/a;Lz50/e;Le70/e;Li60/d;Lxj/k;Lvj/e0;Lep/l;Lvj/h;)V", "BondingFailedException", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultBleBondingProvider implements g {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f12324q = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f12325a;

    /* renamed from: b  reason: collision with root package name */
    public final MachineSerial f12326b;

    /* renamed from: c  reason: collision with root package name */
    public final i f12327c;
    public final xj.i d;
    public final z50.a e;

    /* renamed from: f  reason: collision with root package name */
    public final e f12328f;

    /* renamed from: g  reason: collision with root package name */
    public final e70.e f12329g;

    /* renamed from: h  reason: collision with root package name */
    public final k f12330h;

    /* renamed from: i  reason: collision with root package name */
    public final l f12331i;

    /* renamed from: j  reason: collision with root package name */
    public final d02.a<Boolean> f12332j;

    /* renamed from: k  reason: collision with root package name */
    public final r<c> f12333k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12334l;

    /* renamed from: m  reason: collision with root package name */
    public final r<c> f12335m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12336n;

    /* renamed from: o  reason: collision with root package name */
    public final r<c> f12337o;

    /* renamed from: p  reason: collision with root package name */
    public final d<c> f12338p;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12339a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.CORRUPT_AND_WILL_NOT_AUTO_RESOLVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.CORRUPT_AND_EXPECTED_TO_AUTO_RESOLVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.NOT_CORRUPT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12339a = iArr;
        }
    }

    static {
        new a(null);
    }

    public DefaultBleBondingProvider(String str, MachineSerial machineSerial, i iVar, xj.i iVar2, z50.a aVar, e eVar, e70.e eVar2, i60.d dVar, k kVar, e0 e0Var, l lVar, h hVar) {
        str.getClass();
        machineSerial.getClass();
        iVar.getClass();
        iVar2.getClass();
        aVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        kVar.getClass();
        e0Var.getClass();
        lVar.getClass();
        hVar.getClass();
        this.f12325a = str;
        this.f12326b = machineSerial;
        this.f12327c = iVar;
        this.d = iVar2;
        this.e = aVar;
        this.f12328f = eVar;
        this.f12329g = eVar2;
        this.f12330h = kVar;
        this.f12331i = lVar;
        this.f12332j = new d02.a<>(Boolean.FALSE);
        xj.l lVar2 = new xj.l(this, 0);
        b.a aVar2 = kz1.b.f50218a;
        this.f12333k = new s0(new n(lVar2), new xh0.d(new xh0.c(25), 27)).y(new xj.n(new m(this, 2), 0), Http2StreamManagerOptions.DEFAULT_MAX);
        rz1.l lVar3 = hVar.f84330c;
        va0.d dVar2 = new va0.d(new m(this, 0), 21);
        lVar3.getClass();
        this.f12335m = new s0(new a0(new p1(lVar3, dVar2).t(new xh0.d(new xh0.c(26), 28)), new va0.d(new m(this, 1), 22)).t(new xh0.d(new xh0.c(27), 29)), new xj.n(new xh0.c(28), 6)).y(new xj.n(new m(this, 2), 0), Http2StreamManagerOptions.DEFAULT_MAX);
        this.f12337o = new s0(new a0(new p1(lVar3, new va0.d(new m(this, 7), 26)), new va0.d(new m(this, 8), 27)), new xj.n(new p(6), 9)).y(new xj.n(new m(this, 2), 0), Http2StreamManagerOptions.DEFAULT_MAX);
        this.f12338p = new d<>();
    }

    @Override // xj.g
    public final r<c> a() {
        r<c> rVar = this.f12333k;
        kz1.b.a(rVar, "source1 is null");
        d<c> dVar = this.f12338p;
        kz1.b.a(dVar, "source2 is null");
        r<c> rVar2 = this.f12335m;
        kz1.b.a(rVar2, "source3 is null");
        r<c> rVar3 = this.f12337o;
        kz1.b.a(rVar3, "source4 is null");
        r<c> y13 = r.z(rVar, dVar, rVar2, rVar3).y(kz1.a.f50213a, 4);
        y13.getClass();
        return y13;
    }

    @Override // xj.g
    public final w b() {
        w i13;
        w i14;
        w i15;
        t j8;
        w i16;
        w i17;
        e eVar = this.f12328f;
        String str = this.f12325a;
        z50.c cVar = new z50.c(eVar, str, 0);
        b.a aVar = kz1.b.f50218a;
        nz1.g gVar = new nz1.g(cVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        w o13 = gVar.A(20000L, timeUnit).o(new xj.n(new m(this, 3), 1));
        i13 = cd.b.i(new x(this.f12327c.a(this.f12326b), new xj.n(new p(0), 5)), "BleBondingProvider - Connecting to product", new c0(7), new ga0.a0(5));
        nz1.b g13 = o13.g(i13);
        sz1.n nVar = new sz1.n(this.f12331i.a().x(), new xj.n(new p(4), 8));
        j jVar = j.d;
        kz1.b.a(jVar, "other is null");
        dz1.w wVar = c02.a.f10003b;
        kz1.b.a(timeUnit, "unit is null");
        kz1.b.a(wVar, "scheduler is null");
        i14 = cd.b.i(new nz1.a0(nVar, NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION, timeUnit, wVar, jVar), "BleBondingProvider - Checking LineIn", new c0(7), new ga0.a0(5));
        nz1.b g14 = g13.g(i14);
        i15 = cd.b.i(new nz1.g(new xj.l(this, 2)), "BleBondingProvider - send discoverable message", new c0(7), new ga0.a0(5));
        w l13 = g14.g(i15).l(new iz1.a(this) { // from class: xj.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DefaultBleBondingProvider f87682b;

            {
                this.f87682b = this;
            }

            @Override // iz1.a
            public final void run() {
                int i18 = r2;
                DefaultBleBondingProvider defaultBleBondingProvider = this.f87682b;
                switch (i18) {
                    case 0:
                        int i19 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Disconnecting from BLE and locking connection");
                        f60.i iVar = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection disconnected and locked");
                        iVar.f29970v = true;
                        iVar.f29962n.onNext(new z.c(f60.a0.DISCONNECTED_BY_APP));
                        iVar.e.disconnect();
                        Logger.a("Locking BLE scanning to prevent bond attempt failing");
                        i60.d dVar = i60.d.f40940a;
                        Logger.a("BLE scan lock is locked");
                        mz1.e eVar2 = i60.d.f40942c;
                        if (eVar2 != null) {
                            jz1.d.dispose(eVar2);
                        }
                        i60.d.f40941b.onNext(d.a.LOCKED);
                        i60.d.f40942c = nz1.j.d.k(90000L, TimeUnit.MILLISECONDS).w(new b50.j(10));
                        e0.f84305b = true;
                        return;
                    case 1:
                        int i23 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Unlocking BLE scanning");
                        Logger.a("BLE scan lock is unlocked");
                        mz1.e eVar3 = i60.d.f40942c;
                        if (eVar3 != null) {
                            jz1.d.dispose(eVar3);
                        }
                        i60.d.f40941b.onNext(d.a.UNLOCKED);
                        Logger.a("Unlocking BLE connection");
                        f60.i iVar2 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection unlocked");
                        iVar2.f29970v = false;
                        return;
                    case 2:
                        defaultBleBondingProvider.f12332j.onNext(Boolean.FALSE);
                        e0.f84305b = false;
                        return;
                    default:
                        defaultBleBondingProvider.f12338p.onNext(c.a.f12365a);
                        return;
                }
            }
        });
        j8 = cd.b.j(new v1(new s0(r.B(400L, 400L, timeUnit, wVar), new e10.f(new dy1.d(3, this.f12329g, str), 11)), new va0.d(new p(1), 23)), "BleBondingProvider - Waiting until system connection disconnected", new p(2), new c0(10), new ga0.a0(6));
        nz1.b g15 = l13.g(new m0(j8).g(jVar.k(NetworkRetryInterceptor.DEFAULT_RETRY_DELAY, timeUnit)).A(15000L, timeUnit).s());
        xj.i iVar = this.d;
        sz1.z s13 = new a0(iVar.f87673b == null ? r.u(new Exception("Device needs to support Bluetooth")) : new rz1.l(new xh0.d(iVar, 22)), new va0.d(new m(this, 6), 24)).x().s(25000L, timeUnit);
        f.b a13 = bh1.f.a(TimeoutException.class, NoSuchElementException.class);
        a13.b(5000L, timeUnit);
        a13.c(1);
        nz1.b g16 = g15.g(new o(cd.b.m(s13.m(a13.a()), "BleBondingProvider - classic bluetooth scan", null, null, null, 14)));
        i16 = cd.b.i(new x(new nz1.g(new z50.c(eVar, str, 1)).A(60000L, timeUnit), new xj.n(new p(3), 7)), "BleBondingProvider - creating bond and waiting for result", new c0(7), new ga0.a0(5));
        nz1.i iVar2 = new nz1.i(g16.g(i16.o(new xj.n(new m(this, 4), 2))), new iz1.a(this) { // from class: xj.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DefaultBleBondingProvider f87682b;

            {
                this.f87682b = this;
            }

            @Override // iz1.a
            public final void run() {
                int i18 = r2;
                DefaultBleBondingProvider defaultBleBondingProvider = this.f87682b;
                switch (i18) {
                    case 0:
                        int i19 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Disconnecting from BLE and locking connection");
                        f60.i iVar3 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection disconnected and locked");
                        iVar3.f29970v = true;
                        iVar3.f29962n.onNext(new z.c(f60.a0.DISCONNECTED_BY_APP));
                        iVar3.e.disconnect();
                        Logger.a("Locking BLE scanning to prevent bond attempt failing");
                        i60.d dVar = i60.d.f40940a;
                        Logger.a("BLE scan lock is locked");
                        mz1.e eVar2 = i60.d.f40942c;
                        if (eVar2 != null) {
                            jz1.d.dispose(eVar2);
                        }
                        i60.d.f40941b.onNext(d.a.LOCKED);
                        i60.d.f40942c = nz1.j.d.k(90000L, TimeUnit.MILLISECONDS).w(new b50.j(10));
                        e0.f84305b = true;
                        return;
                    case 1:
                        int i23 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Unlocking BLE scanning");
                        Logger.a("BLE scan lock is unlocked");
                        mz1.e eVar3 = i60.d.f40942c;
                        if (eVar3 != null) {
                            jz1.d.dispose(eVar3);
                        }
                        i60.d.f40941b.onNext(d.a.UNLOCKED);
                        Logger.a("Unlocking BLE connection");
                        f60.i iVar22 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection unlocked");
                        iVar22.f29970v = false;
                        return;
                    case 2:
                        defaultBleBondingProvider.f12332j.onNext(Boolean.FALSE);
                        e0.f84305b = false;
                        return;
                    default:
                        defaultBleBondingProvider.f12338p.onNext(c.a.f12365a);
                        return;
                }
            }
        });
        k kVar = this.f12330h;
        i17 = cd.b.i(new x(new nz1.i(iVar2.g(new sz1.n(new sz1.k(new sz1.a(new b0[]{new sz1.d(new xj.j(kVar, 0)), new sz1.d(new xj.j(kVar, 2))}, null), new xh0.d(new m1(kVar, 11), 24)), new xj.n(new xh0.c(29), 4))), new iz1.a(this) { // from class: xj.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DefaultBleBondingProvider f87682b;

            {
                this.f87682b = this;
            }

            @Override // iz1.a
            public final void run() {
                int i18 = r2;
                DefaultBleBondingProvider defaultBleBondingProvider = this.f87682b;
                switch (i18) {
                    case 0:
                        int i19 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Disconnecting from BLE and locking connection");
                        f60.i iVar3 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection disconnected and locked");
                        iVar3.f29970v = true;
                        iVar3.f29962n.onNext(new z.c(f60.a0.DISCONNECTED_BY_APP));
                        iVar3.e.disconnect();
                        Logger.a("Locking BLE scanning to prevent bond attempt failing");
                        i60.d dVar = i60.d.f40940a;
                        Logger.a("BLE scan lock is locked");
                        mz1.e eVar2 = i60.d.f40942c;
                        if (eVar2 != null) {
                            jz1.d.dispose(eVar2);
                        }
                        i60.d.f40941b.onNext(d.a.LOCKED);
                        i60.d.f40942c = nz1.j.d.k(90000L, TimeUnit.MILLISECONDS).w(new b50.j(10));
                        e0.f84305b = true;
                        return;
                    case 1:
                        int i23 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Unlocking BLE scanning");
                        Logger.a("BLE scan lock is unlocked");
                        mz1.e eVar3 = i60.d.f40942c;
                        if (eVar3 != null) {
                            jz1.d.dispose(eVar3);
                        }
                        i60.d.f40941b.onNext(d.a.UNLOCKED);
                        Logger.a("Unlocking BLE connection");
                        f60.i iVar22 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection unlocked");
                        iVar22.f29970v = false;
                        return;
                    case 2:
                        defaultBleBondingProvider.f12332j.onNext(Boolean.FALSE);
                        e0.f84305b = false;
                        return;
                    default:
                        defaultBleBondingProvider.f12338p.onNext(c.a.f12365a);
                        return;
                }
            }
        }).l(new iz1.a(this) { // from class: xj.o

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DefaultBleBondingProvider f87682b;

            {
                this.f87682b = this;
            }

            @Override // iz1.a
            public final void run() {
                int i18 = r2;
                DefaultBleBondingProvider defaultBleBondingProvider = this.f87682b;
                switch (i18) {
                    case 0:
                        int i19 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Disconnecting from BLE and locking connection");
                        f60.i iVar3 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection disconnected and locked");
                        iVar3.f29970v = true;
                        iVar3.f29962n.onNext(new z.c(f60.a0.DISCONNECTED_BY_APP));
                        iVar3.e.disconnect();
                        Logger.a("Locking BLE scanning to prevent bond attempt failing");
                        i60.d dVar = i60.d.f40940a;
                        Logger.a("BLE scan lock is locked");
                        mz1.e eVar2 = i60.d.f40942c;
                        if (eVar2 != null) {
                            jz1.d.dispose(eVar2);
                        }
                        i60.d.f40941b.onNext(d.a.LOCKED);
                        i60.d.f40942c = nz1.j.d.k(90000L, TimeUnit.MILLISECONDS).w(new b50.j(10));
                        e0.f84305b = true;
                        return;
                    case 1:
                        int i23 = DefaultBleBondingProvider.f12324q;
                        Logger.a("Unlocking BLE scanning");
                        Logger.a("BLE scan lock is unlocked");
                        mz1.e eVar3 = i60.d.f40942c;
                        if (eVar3 != null) {
                            jz1.d.dispose(eVar3);
                        }
                        i60.d.f40941b.onNext(d.a.UNLOCKED);
                        Logger.a("Unlocking BLE connection");
                        f60.i iVar22 = defaultBleBondingProvider.f12327c;
                        Logger.a("Connection unlocked");
                        iVar22.f29970v = false;
                        return;
                    case 2:
                        defaultBleBondingProvider.f12332j.onNext(Boolean.FALSE);
                        e0.f84305b = false;
                        return;
                    default:
                        defaultBleBondingProvider.f12338p.onNext(c.a.f12365a);
                        return;
                }
            }
        }), new xj.n(new m(this, 5), 3)), "BleBondingProvider - overall attempt to bond", new c0(7), new ga0.a0(5));
        return i17;
    }

    @Override // xj.g
    public final sz1.d c() {
        xj.l lVar = new xj.l(this, 1);
        b.a aVar = kz1.b.f50218a;
        return new sz1.d(lVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/DefaultBleBondingProvider$a;", "", "<init>", "()V", "", "TIMEOUT_SEND_DISCOVERABLE_MS", "J", "TIMEOUT_CHECK_LINE_IN_MS", "", "RETRIES_SEND_DISCOVERABLE", "I", "REMOVE_BOND_TIMEOUT_MS", "POLL_DISCONNECTED_EVERY_MS", "DELAY_AFTER_DISCONNECT_MS", "TIMEOUT_DISCONNECT_MS", "TIMEOUT_CLASSIC_BLUETOOTH_SCAN_MS", "RETRIES_CLASSIC_BLUETOOTH_SCAN", "DELAY_CLASSIC_BLUETOOTH_SCAN_RETRY_MS", "WAIT_FOR_BOND_TIMEOUT_MS", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/DefaultBleBondingProvider$BondingFailedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lxj/q;", "reason", "", "e", "<init>", "(Lxj/q;Ljava/lang/Throwable;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class BondingFailedException extends RuntimeException {
        public final q d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BondingFailedException(q qVar, Throwable th2) {
            super("Could not create bond", th2);
            qVar.getClass();
            this.d = qVar;
        }

        public /* synthetic */ BondingFailedException(q qVar, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(qVar, (i13 & 2) != 0 ? null : th2);
        }
    }
}
