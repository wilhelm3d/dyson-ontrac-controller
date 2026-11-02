package com.dyson.mobile.android.machine.lec.manifestota.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineSerial;
import eh0.j;
import in0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh0.r;
import pf0.c;
import ph0.a;
import uf0.g;
import z32.d0;
import z32.d2;
import z32.g0;
import z32.m1;
import z32.t0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/lec/manifestota/service/ManifestOtaForegroundService;", "Landroid/app/Service;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ManifestOtaForegroundService extends Service {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15106k = new a(null);
    public final rg0.a d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public d2 f15107f;

    /* renamed from: g  reason: collision with root package name */
    public MachineDefinition f15108g;

    /* renamed from: h  reason: collision with root package name */
    public r f15109h;

    /* renamed from: i  reason: collision with root package name */
    public mh0.b f15110i;

    /* renamed from: j  reason: collision with root package name */
    public PowerManager.WakeLock f15111j;

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15112a;

        static {
            int[] iArr = new int[a.e.EnumC1934a.values().length];
            try {
                iArr[a.e.EnumC1934a.DOWNLOADING_AND_TRANSFERRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.EnumC1934a.READY_TO_INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15112a = iArr;
        }
    }

    public ManifestOtaForegroundService() {
        sg0.b bVar = g.a(this).f81922a;
        this.d = bVar.f76125u0.get();
        this.e = bVar.c();
    }

    public final void a() {
        PowerManager.WakeLock wakeLock = this.f15111j;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
        }
        d2 d2Var = this.f15107f;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        stopSelf();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i13, int i14) {
        intent.getClass();
        Logger.a("ManifestOta - Foreground service started");
        Object systemService = getSystemService("power");
        systemService.getClass();
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, "DysonLink:ManifestOtaForegroundWakeLock");
        this.f15111j = newWakeLock;
        if (newWakeLock != null) {
            newWakeLock.acquire(600000L);
        }
        MachineDefinition machineDefinition = (MachineDefinition) c7.c.a(intent, "MachineDefinition", MachineDefinition.class);
        if (machineDefinition != null) {
            this.f15108g = machineDefinition;
        }
        if (this.d == null) {
            x12.r.i("machineCoordinatorProvider");
            throw null;
        }
        MachineDefinition machineDefinition2 = this.f15108g;
        if (machineDefinition2 == null) {
            x12.r.i("machineDefinition");
            throw null;
        }
        MachineSerial machineSerial = machineDefinition2.d;
        a.C1330a c1330a = in0.a.e;
        String str = machineSerial.d;
        c1330a.getClass();
        in0.a a13 = a.C1330a.a(str);
        j jVar = a13 instanceof j ? (j) a13 : null;
        r a14 = jVar != null ? jVar.a() : null;
        if (a14 == null) {
            a();
            return 2;
        }
        this.f15109h = a14;
        MachineDefinition machineDefinition3 = this.f15108g;
        if (machineDefinition3 == null) {
            x12.r.i("machineDefinition");
            throw null;
        }
        c cVar = this.e;
        if (cVar == null) {
            x12.r.i("localisationManager");
            throw null;
        }
        mh0.b bVar = new mh0.b(this, machineDefinition3, cVar);
        startForeground(683001, bVar.b(null));
        this.f15110i = bVar;
        h42.c cVar2 = t0.f91519a;
        this.f15107f = g0.r(d0.a(h42.b.f37596f), null, null, new mh0.c(this, null), 3);
        return 2;
    }

    public final void onTimeout(int i13, int i14) {
        super.onTimeout(i13, i14);
        a();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/machine/lec/manifestota/service/ManifestOtaForegroundService$a;", "", "<init>", "()V", "", "MACHINE_DEFINITION", "Ljava/lang/String;", "", "WAKELOCK_TIMEOUT_MS", "J", "WAKELOCK_TAG", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
