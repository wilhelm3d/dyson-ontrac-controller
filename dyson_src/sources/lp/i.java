package lp;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Llp/i;", "Llp/l;", "Lf60/f0;", "authenticatedBleConnector", "Lgi0/a;", "messageAttributeValueController", "Lz32/c0;", "coroutineScope", "Laf1/i;", "dispatcherProvider", "<init>", "(Lf60/f0;Lgi0/a;Lz32/c0;Laf1/i;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.a f52516a;

    /* renamed from: b  reason: collision with root package name */
    public final af1.i f52517b;

    /* renamed from: c  reason: collision with root package name */
    public final u1 f52518c;
    public final q1 d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lc42/j;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.traits.equalization.DefaultEqualizationModeController$special$$inlined$flatMapConnected$1", f = "DefaultEqualizationModeController.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function3<c42.j<? super j>, z, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ c42.j e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f52519f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ i f52520g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l12.d dVar, i iVar) {
            super(3, dVar);
            this.f52520g = iVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(c42.j<? super j> jVar, z zVar, l12.d<? super f0> dVar) {
            a aVar = new a(dVar, this.f52520g);
            aVar.e = jVar;
            aVar.f52519f = zVar;
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
                if (((z) this.f52519f) instanceof z.a) {
                    i iVar2 = this.f52520g;
                    gi0.a aVar2 = iVar2.f52516a;
                    on.b.f60566a.getClass();
                    iVar = c42.r.A(aVar2.a(on.b.f60570g, new k()), iVar2.f52518c);
                } else {
                    iVar = c42.h.d;
                }
                this.e = null;
                this.f52519f = null;
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

    public i(f60.f0 f0Var, gi0.a aVar, c0 c0Var, af1.i iVar) {
        f0Var.getClass();
        aVar.getClass();
        c0Var.getClass();
        iVar.getClass();
        this.f52516a = aVar;
        this.f52517b = iVar;
        this.f52518c = w1.b(0, 0, null, 7);
        c42.i n13 = c42.r.n(c42.r.E(f0Var.f29944b, new a(null, this)));
        a2.f10222a.getClass();
        this.d = c42.r.C(n13, c0Var, a2.a.f10225c, 1);
    }

    @Override // lp.l
    public final q1 a() {
        return this.d;
    }

    @Override // lp.l
    public final Object b(j jVar, n12.i iVar) {
        Object v13 = g0.v(this.f52517b.c(), new h(this, jVar, null), iVar);
        return v13 == m12.a.COROUTINE_SUSPENDED ? v13 : f0.f36844a;
    }
}
