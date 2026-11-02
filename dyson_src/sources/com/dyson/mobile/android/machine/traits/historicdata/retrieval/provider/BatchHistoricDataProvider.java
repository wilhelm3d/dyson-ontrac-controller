package com.dyson.mobile.android.machine.traits.historicdata.retrieval.provider;

import bq1.g;
import ca0.e;
import cl0.c;
import cl0.d;
import com.dyson.mobile.android.connectivity.ble.NotConnectedException;
import com.dyson.mobile.android.machinetype.MachineSerial;
import dz1.r;
import dz1.x;
import f60.i;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import rz1.a0;
import rz1.d0;
import rz1.k0;
import rz1.n;
import rz1.p;
import rz1.t0;
import sz1.z;
import x50.l0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/retrieval/provider/BatchHistoricDataProvider;", "Lcl0/d;", "Lf60/i;", "authenticatedBleConnector", "Lx50/l0;", "bleClient", "Lcl0/c;", "historicDataLogger", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "<init>", "(Lf60/i;Lx50/l0;Lcl0/c;Lcom/dyson/mobile/android/machinetype/MachineSerial;)V", "a", "ProductDidNotReturnAnyExpectedRecordsException", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatchHistoricDataProvider implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f15323f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final i f15324a;

    /* renamed from: b  reason: collision with root package name */
    public final l0 f15325b;

    /* renamed from: c  reason: collision with root package name */
    public final c f15326c;
    public final MachineSerial d;
    public final d0 e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/retrieval/provider/BatchHistoricDataProvider$ProductDidNotReturnAnyExpectedRecordsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ProductDidNotReturnAnyExpectedRecordsException extends RuntimeException {
    }

    static {
        new a(null);
    }

    public BatchHistoricDataProvider(i iVar, l0 l0Var, c cVar, MachineSerial machineSerial) {
        iVar.getClass();
        l0Var.getClass();
        cVar.getClass();
        machineSerial.getClass();
        this.f15324a = iVar;
        this.f15325b = l0Var;
        this.f15326c = cVar;
        this.d = machineSerial;
        k0 k0Var = iVar.f29963o;
        ac0.c cVar2 = new ac0.c(new bm.a(23), 4);
        k0Var.getClass();
        b.a aVar = b.f50218a;
        this.e = new d0(new a0(k0Var, cVar2), new e(new bm.a(27), 25), false);
    }

    @Override // cl0.d
    public final r<List<cl0.e>> a(bj0.b bVar) {
        bVar.getClass();
        cl0.i iVar = cl0.i.f11580a;
        cl0.b bVar2 = new cl0.b(this, 1);
        iVar.getClass();
        g gVar = new g(1, bVar, bVar2);
        b.a aVar = b.f50218a;
        n nVar = new n(gVar);
        if (this.f15324a.f()) {
            r E = r.E(new t0(nVar), new t0(this.e.D()));
            e eVar = new e(new bm.a(29), 27);
            E.getClass();
            return new p(E, eVar);
        }
        return r.u(new NotConnectedException());
    }

    @Override // cl0.d
    public final x<bj0.b> b() {
        z s13 = this.f15325b.f(new cj0.b(), new bj0.c()).s(10L, TimeUnit.SECONDS);
        if (this.f15324a.f()) {
            t0 t0Var = new t0(s13.t());
            t0 t0Var2 = new t0(this.e.D());
            b.a aVar = b.f50218a;
            r E = r.E(t0Var, t0Var2);
            e eVar = new e(new bm.a(28), 26);
            E.getClass();
            return new p(E, eVar).x();
        }
        return x.g(new NotConnectedException());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/retrieval/provider/BatchHistoricDataProvider$a;", "", "<init>", "()V", "", "DATA_FROM_PRODUCT_TIMEOUT_SECONDS", "J", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
