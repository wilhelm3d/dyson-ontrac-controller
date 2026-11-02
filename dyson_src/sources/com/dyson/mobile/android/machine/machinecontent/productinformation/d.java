package com.dyson.mobile.android.machine.machinecontent.productinformation;

import b42.m;
import c42.f2;
import c42.g2;
import c42.r1;
import c42.s1;
import com.dyson.mobile.android.machine.machinecontent.productinformation.g;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.q;
import h12.r;
import hj.e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.f;
import lj.a;
import m9.u;
import m9.v;
import nj.o7;
import vi0.i;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.m1;
import z32.z;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/d;", "Lm9/u;", "Lvi0/i;", "machineContentRepository", "Laf1/i;", "dispatcherProvider", "Lhj/e;", "trackingManager", "", "machineSerial", "itemId", "<init>", "(Lvi0/i;Laf1/i;Lhj/e;Ljava/lang/String;Ljava/lang/String;)V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u {
    public final i d;
    public final af1.i e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f15264f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15265g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15266h;

    /* renamed from: i  reason: collision with root package name */
    public final b42.c f15267i;

    /* renamed from: j  reason: collision with root package name */
    public final c42.e f15268j;

    /* renamed from: k  reason: collision with root package name */
    public final f2 f15269k;

    /* renamed from: l  reason: collision with root package name */
    public final r1 f15270l;

    /* renamed from: m  reason: collision with root package name */
    public d2 f15271m;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        d a(String str, String str2);
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/machine/machinecontent/productinformation/d$b", "Ll12/a;", "Lz32/z;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends l12.a implements z {
        public final /* synthetic */ d e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z.a aVar, d dVar) {
            super(aVar);
            this.e = dVar;
        }

        @Override // z32.z
        public final void i(Throwable th2, l12.f fVar) {
            this.e.f15269k.setValue(g.b.f15275a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationViewModel$fetchProductInformation$2", f = "ProductInformationViewModel.kt", l = {BR.targetKey}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class c extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh12/q;", "Lsi0/b;", "content", "Lh12/f0;", "<anonymous>", "(Lh12/q;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationViewModel$fetchProductInformation$2$1", f = "ProductInformationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* loaded from: classes3.dex */
        public static final class a extends n12.i implements Function2<q<? extends si0.b>, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ d e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, l12.d<? super a> dVar2) {
                super(2, dVar2);
                this.e = dVar;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                a aVar = new a(this.e, dVar);
                aVar.d = ((q) obj).d;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(q<? extends si0.b> qVar, l12.d<? super f0> dVar) {
                return ((a) create(q.a(qVar.d), dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.d;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                Throwable b13 = q.b(obj2);
                d dVar = this.e;
                if (b13 == null) {
                    si0.b bVar = (si0.b) obj2;
                    dVar.f15269k.l(null, new g.a(bVar));
                    hj.e eVar = dVar.f15264f;
                    String str = bVar.f76211a;
                    int i13 = o7.f57629a;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    a.p.f52178a.getClass();
                    ij.b e = ma.e.e(linkedHashMap, a.p.f52179b, str, "machine.product_information.item", linkedHashMap);
                    e.a aVar2 = hj.e.f38312g;
                    eVar.h(e, null);
                } else {
                    dVar.f15269k.setValue(g.b.f15275a);
                }
                return f0.f36844a;
            }
        }

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                d dVar = d.this;
                i iVar = dVar.d;
                String str = dVar.f15265g;
                String str2 = dVar.f15266h;
                iVar.getClass();
                str.getClass();
                str2.getClass();
                s1 c13 = i.c(iVar, new vi0.g(iVar, str, str2, null));
                a aVar2 = new a(dVar, null);
                this.d = 1;
                if (c42.r.i(c13, aVar2, this) == aVar) {
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

    public d(i iVar, af1.i iVar2, hj.e eVar, String str, String str2) {
        iVar.getClass();
        iVar2.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        this.d = iVar;
        this.e = iVar2;
        this.f15264f = eVar;
        this.f15265g = str;
        this.f15266h = str2;
        b42.c b13 = m.b(0, null, null, 7);
        this.f15267i = b13;
        this.f15268j = c42.r.B(b13);
        f2 a13 = g2.a(g.c.f15276a);
        this.f15269k = a13;
        this.f15270l = c42.r.d(a13);
        S();
    }

    public final void S() {
        this.f15269k.setValue(g.c.f15276a);
        d2 d2Var = this.f15271m;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        s9.a a13 = v.a(this);
        h42.b c13 = this.e.c();
        b bVar = new b(z.Z0, this);
        c13.getClass();
        this.f15271m = g0.r(a13, f.a.C1558a.d(bVar, c13), null, new c(null), 2);
    }
}
