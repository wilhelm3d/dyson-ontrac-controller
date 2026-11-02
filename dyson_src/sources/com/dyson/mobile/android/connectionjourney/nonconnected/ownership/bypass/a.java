package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.bypass;

import androidx.databinding.ObservableBoolean;
import b30.d;
import c42.r1;
import cg0.j;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import e22.m;
import h12.f0;
import h12.r;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.e;
import n12.i;
import x12.p0;
import x12.y;
import yi0.f;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0011\u0012BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/bypass/a;", "Lm9/u;", "Lyi0/f;", "machineManager", "Ltj/a;", "marketManager", "", "_accessToken", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "serialNumber", "Lcg0/j;", "machineAssetStateProvider", "Lb30/d;", "putNonConnectedRegistrationTask", "<init>", "(Lyi0/f;Ltj/a;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Ljava/lang/String;Lcg0/j;Lb30/d;)V", "c", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f13644p = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/bypass/NonConnectedOwnershipBypassNavigator;", 0))};
    public final f d;
    public final MachineDescriptor e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13645f;

    /* renamed from: g  reason: collision with root package name */
    public final j f13646g;

    /* renamed from: h  reason: collision with root package name */
    public final d f13647h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13648i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f13649j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableBoolean f13650k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableBoolean f13651l;

    /* renamed from: m  reason: collision with root package name */
    public final tf1.a f13652m;

    /* renamed from: n  reason: collision with root package name */
    public final gz1.b f13653n;

    /* renamed from: o  reason: collision with root package name */
    public final String f13654o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.connectionjourney.nonconnected.ownership.bypass.NonConnectedOwnershipBypassViewModel$1", f = "NonConnectedOwnershipBypassViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.ownership.bypass.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0434a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public C0434a(l12.d<? super C0434a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0434a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0434a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                j jVar = aVar2.f13646g;
                MachineDescriptor machineDescriptor = aVar2.e;
                ag0.b bVar = new ag0.b(new MachineSerial(aVar2.f13645f), machineDescriptor.getMachineType(), machineDescriptor.getMachineVariant(), null, 8, null);
                this.d = 1;
                if (jVar.d(bVar, this) == aVar) {
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
    /* loaded from: classes2.dex */
    public interface c {
        a a(String str, MachineDescriptor machineDescriptor);
    }

    static {
        new b(null);
    }

    public a(f fVar, tj.a aVar, String str, MachineDescriptor machineDescriptor, String str2, j jVar, d dVar) {
        fVar.getClass();
        aVar.getClass();
        str.getClass();
        machineDescriptor.getClass();
        str2.getClass();
        jVar.getClass();
        dVar.getClass();
        this.d = fVar;
        this.e = machineDescriptor;
        this.f13645f = str2;
        this.f13646g = jVar;
        this.f13647h = dVar;
        this.f13648i = str;
        this.f13649j = jVar.d;
        this.f13650k = new ObservableBoolean(false);
        this.f13651l = new ObservableBoolean(false);
        this.f13652m = new tf1.a(null, 1, null);
        this.f13653n = new gz1.b();
        this.f13654o = aVar.c();
        g0.r(v.a(this), null, null, new C0434a(null), 3);
    }

    public final void S() {
        String machineType = this.e.getMachineType();
        d dVar = this.f13647h;
        dVar.getClass();
        String str = this.f13645f;
        str.getClass();
        machineType.getClass();
        String str2 = this.f13654o;
        str2.getClass();
        zb.z(this.f13653n, dVar.f6492a.a(new f30.b(machineType, str, "", str2, null)).z(c02.a.f10004c).r(fz1.a.a()).o(new gw0.b(new h30.d(this, 0), 9)).g(this.d.f90155b.a().t(5L)).x(new gw0.b(new h30.d(this, 1), 10), new h30.e(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/bypass/a$b;", "", "<init>", "()V", "", "COMPLETION_VIEW_DISPLAY_TIME", "J", "MANIFEST_FETCH_RETRIES", "", "EMPTY_DATE", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
