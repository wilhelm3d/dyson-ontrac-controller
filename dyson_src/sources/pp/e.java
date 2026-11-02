package pp;

import com.dyson.mobile.android.logging.Logger;
import em1.c4;
import f60.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import pp.b;
import rz1.a0;
import rz1.d0;
import rz1.k0;
import rz1.t1;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpp/e;", "Lpp/b;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e implements pp.b {

    /* renamed from: b  reason: collision with root package name */
    public final gi0.f f64534b;

    /* renamed from: c  reason: collision with root package name */
    public final d02.d<Integer> f64535c;
    public final dz1.r<Integer> d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Integer, Boolean> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            Integer num2 = num;
            num2.getClass();
            pp.b.f64528a.getClass();
            d22.k kVar = b.a.f64530b;
            boolean o13 = kVar.o(num2.intValue());
            Boolean valueOf = Boolean.valueOf(o13);
            if (!o13) {
                Logger.b("Factor value " + num2 + " outside valid bounds " + kVar + " will be dropped", null);
            }
            return valueOf;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements Function1<Throwable, dz1.u<? extends Integer>> {
        public static final b d = new b();

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends Integer> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("MARKET_AQ_ADJUSTMENT_FACTOR observerAttribute FAILED!", th3);
            return y.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements iz1.l {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // iz1.l
        /* renamed from: apply */
        public final /* synthetic */ Object mo7apply(Object obj) {
            return this.d.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements iz1.n {
        public final /* synthetic */ Function1 d;

        public d(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // iz1.n
        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.d.invoke(obj)).booleanValue();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: pp.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1953e implements Function1<z, dz1.u<? extends Integer>> {
        public C1953e() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends Integer> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                e eVar = e.this;
                gi0.f fVar = eVar.f64534b;
                on.b.f60566a.getClass();
                dz1.r a13 = fVar.a(on.b.d, new pp.a());
                c cVar = new c(b.d);
                b.a aVar = kz1.b.f50218a;
                dz1.u F = new a0(new y0(a13, cVar, false), new d(a.d)).F(eVar.f64535c);
                F.getClass();
                return F;
            }
            return y.d;
        }
    }

    public e(f60.i iVar, gi0.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f64534b = fVar;
        this.f64535c = new d02.d<>();
        k0 k0Var = iVar.f29963o;
        final C1953e c1953e = new C1953e();
        dz1.r<R> T = k0Var.T(new iz1.l(c1953e) { // from class: pp.d
            public final /* synthetic */ Function1 d;

            {
                c1953e.getClass();
                this.d = c1953e;
            }

            @Override // iz1.l
            /* renamed from: apply */
            public final /* synthetic */ Object mo7apply(Object obj) {
                return this.d.invoke(obj);
            }
        });
        T.getClass();
        this.d = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // pp.b
    public final d0 a(int i13) {
        t1 U = this.d.U(1L);
        nd0.h hVar = new nd0.h(new bz0.b(i13, 18), 5);
        b.a aVar = kz1.b.f50218a;
        return new d0(new a0(U, hVar).p(new ld0.j(this, i13, 3)), new ph.b(new at0.g(i13, this, 6), 16), false);
    }
}
