package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation;

import c42.r1;
import cg0.j;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.android.platform.authsdk.BR;
import e22.m;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import m9.u;
import m9.v;
import n12.e;
import n12.i;
import rf0.i0;
import x12.p0;
import x12.y;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/b;", "Lm9/u;", "Lpf0/c;", "localisationManager", "", "_accessToken", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "Lcg0/j;", "machineAssetStateProvider", "<init>", "(Lpf0/c;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Lcg0/j;)V", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f13670l = {p0.f86717a.f(new y(b.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/NonConnectedOwnershipConfirmationNavigator;", 0))};
    public final String d;
    public final MachineDescriptor e;

    /* renamed from: f  reason: collision with root package name */
    public final j f13671f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13672g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13673h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13674i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f13675j;

    /* renamed from: k  reason: collision with root package name */
    public final tf1.a f13676k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.NonConnectedOwnershipConfirmationViewModel$1", f = "NonConnectedOwnershipConfirmationViewModel.kt", l = {BR.header}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends i implements Function2<c0, d<? super f0>, Object> {
        public int d;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                b bVar = b.this;
                j jVar = bVar.f13671f;
                MachineDescriptor machineDescriptor = bVar.e;
                ag0.b bVar2 = new ag0.b(new MachineSerial(bVar.d), machineDescriptor.getMachineType(), machineDescriptor.getMachineVariant(), null, 8, null);
                this.d = 1;
                if (jVar.d(bVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @wy1.a
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0436b {
        b a(String str, MachineDescriptor machineDescriptor);
    }

    public b(pf0.c cVar, String str, String str2, MachineDescriptor machineDescriptor, j jVar) {
        cVar.getClass();
        str.getClass();
        str2.getClass();
        machineDescriptor.getClass();
        jVar.getClass();
        this.d = str2;
        this.e = machineDescriptor;
        this.f13671f = jVar;
        this.f13672g = str2;
        this.f13673h = cVar.d(i0.f71828r9);
        this.f13674i = str;
        this.f13675j = jVar.d;
        this.f13676k = new tf1.a(null, 1, null);
        g0.r(v.a(this), null, null, new a(null), 3);
    }
}
