package pp;

import com.dyson.mobile.android.logging.Logger;
import em1.c4;
import f60.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import pp.l;
import rz1.a0;
import rz1.k0;
import rz1.y;
import rz1.y0;
import x50.l0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpp/f;", "Lpp/l;", "Lf60/i;", "authenticatedBleConnector", "Lx50/l0;", "bleClient", "<init>", "(Lf60/i;Lx50/l0;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f implements l {

    /* renamed from: b  reason: collision with root package name */
    public final l0 f64536b;

    /* renamed from: c  reason: collision with root package name */
    public final dz1.r<Integer> f64537c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, dz1.u<? extends Integer>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends Integer> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("FilterLifeRemainingReadMessage FAILED!", th3);
            return y.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements Function1<Integer, Boolean> {
        public static final b d = new b();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            Integer num2 = num;
            num2.getClass();
            l.f64543a.getClass();
            d22.k kVar = l.a.f64545b;
            boolean o13 = kVar.o(num2.intValue());
            Boolean valueOf = Boolean.valueOf(o13);
            if (!o13) {
                Logger.b("User Filter Life Remaining value " + num2 + " outside valid bounds " + kVar + " will be dropped", null);
            }
            return valueOf;
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
    /* loaded from: classes2.dex */
    public static final class e implements Function1<z, dz1.u<? extends Integer>> {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends Integer> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                dz1.r c13 = f.this.f64536b.c(new wn.a(), new tn.a());
                c cVar = new c(a.d);
                b.a aVar = kz1.b.f50218a;
                return new a0(new y0(c13, cVar, false), new d(b.d));
            }
            return y.d;
        }
    }

    public f(f60.i iVar, l0 l0Var) {
        iVar.getClass();
        l0Var.getClass();
        this.f64536b = l0Var;
        k0 k0Var = iVar.f29963o;
        final e eVar = new e();
        dz1.r<R> T = k0Var.T(new iz1.l(eVar) { // from class: pp.g
            public final /* synthetic */ Function1 d;

            {
                eVar.getClass();
                this.d = eVar;
            }

            @Override // iz1.l
            /* renamed from: apply */
            public final /* synthetic */ Object mo7apply(Object obj) {
                return this.d.invoke(obj);
            }
        });
        T.getClass();
        this.f64537c = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // pp.l
    public final dz1.r<Integer> a() {
        return this.f64537c;
    }
}
