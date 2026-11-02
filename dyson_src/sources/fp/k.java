package fp;

import c42.a2;
import com.dyson.mobile.android.logging.Logger;
import dz1.u;
import f60.z;
import h12.f0;
import h12.r;
import iz1.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kz1.b;
import rz1.y;
import rz1.y0;
import x50.l0;
import z32.c0;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfp/k;", "Lfp/f;", "Lf60/f0;", "authenticatedBleConnector", "Lx50/l0;", "bleClient", "Lz32/c0;", "coroutineScope", "<init>", "(Lf60/f0;Lx50/l0;Lz32/c0;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f32099a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, u<? extends e>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends e> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("ChargingStateReadMessage FAILED!", th3);
            return y.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements l {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // iz1.l
        /* renamed from: apply */
        public final /* synthetic */ Object mo7apply(Object obj) {
            return this.d.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lc42/j;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.traits.battery.DefaultChargingStateProvider$special$$inlined$flatMapConnected$1", f = "DefaultChargingStateProvider.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function3<c42.j<? super e>, z, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ c42.j e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f32100f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ k f32101g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l12.d dVar, k kVar) {
            super(3, dVar);
            this.f32101g = kVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(c42.j<? super e> jVar, z zVar, l12.d<? super f0> dVar) {
            c cVar = new c(dVar, this.f32101g);
            cVar.e = jVar;
            cVar.f32100f = zVar;
            return cVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            c42.i iVar;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                c42.j jVar = this.e;
                if (((z) this.f32100f) instanceof z.a) {
                    dz1.r c13 = this.f32101g.f32099a.c(new vn.c(), new qn.d());
                    b bVar = new b(a.d);
                    b.a aVar2 = kz1.b.f50218a;
                    iVar = cd.b.o(new y0(c13, bVar, false));
                } else {
                    iVar = c42.h.d;
                }
                this.e = null;
                this.f32100f = null;
                this.d = 1;
                if (c42.r.q(jVar, iVar, this) == aVar) {
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

    public k(f60.f0 f0Var, l0 l0Var, c0 c0Var) {
        f0Var.getClass();
        l0Var.getClass();
        c0Var.getClass();
        this.f32099a = l0Var;
        c42.i n13 = c42.r.n(c42.r.E(f0Var.f29944b, new c(null, this)));
        a2.f10222a.getClass();
        c42.r.C(n13, c0Var, a2.a.f10225c, 1);
    }
}
