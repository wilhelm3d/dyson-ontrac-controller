package yo;

import c42.a2;
import c42.q1;
import c42.u1;
import c42.w1;
import f60.z;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyo/f;", "Lyo/c;", "Lf60/f0;", "authenticatedBleConnector", "Lgi0/a;", "messageAttributeValueController", "Lz32/c0;", "coroutineScope", "Laf1/i;", "dispatcherProvider", "<init>", "(Lf60/f0;Lgi0/a;Lz32/c0;Laf1/i;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.a f90301a;

    /* renamed from: b  reason: collision with root package name */
    public final af1.i f90302b;

    /* renamed from: c  reason: collision with root package name */
    public final u1 f90303c;
    public final q1 d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lc42/j;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.traits.anc.DefaultAncModeController$special$$inlined$flatMapConnected$1", f = "DefaultAncModeController.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function3<c42.j<? super yo.a>, z, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ c42.j e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f90304f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f f90305g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l12.d dVar, f fVar) {
            super(3, dVar);
            this.f90305g = fVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(c42.j<? super yo.a> jVar, z zVar, l12.d<? super f0> dVar) {
            a aVar = new a(dVar, this.f90305g);
            aVar.e = jVar;
            aVar.f90304f = zVar;
            return aVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            c42.i iVar;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                c42.j jVar = this.e;
                if (((z) this.f90304f) instanceof z.a) {
                    f fVar = this.f90305g;
                    gi0.a aVar2 = fVar.f90301a;
                    on.b.f60566a.getClass();
                    iVar = c42.r.A(aVar2.a(on.b.e, new b()), fVar.f90303c);
                } else {
                    iVar = c42.h.d;
                }
                this.e = null;
                this.f90304f = null;
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

    public f(f60.f0 f0Var, gi0.a aVar, c0 c0Var, af1.i iVar) {
        f0Var.getClass();
        aVar.getClass();
        c0Var.getClass();
        iVar.getClass();
        this.f90301a = aVar;
        this.f90302b = iVar;
        this.f90303c = w1.b(0, 0, null, 7);
        c42.i n13 = c42.r.n(c42.r.E(f0Var.f29944b, new a(null, this)));
        a2.f10222a.getClass();
        this.d = c42.r.C(n13, c0Var, a2.a.f10225c, 1);
    }

    @Override // yo.c
    public final q1 a() {
        return this.d;
    }

    @Override // yo.c
    public final Object b(yo.a aVar, n12.i iVar) {
        Object v13 = g0.v(this.f90302b.c(), new e(this, aVar, null), iVar);
        return v13 == m12.a.COROUTINE_SUSPENDED ? v13 : f0.f36844a;
    }
}
