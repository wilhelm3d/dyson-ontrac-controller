package pp;

import com.dyson.mobile.android.logging.Logger;
import em1.c4;
import f60.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.d0;
import rz1.k0;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpp/h;", "Lpp/n;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h implements n {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.f f64538a;

    /* renamed from: b  reason: collision with root package name */
    public final d02.d<o> f64539b;

    /* renamed from: c  reason: collision with root package name */
    public final dz1.r<o> f64540c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, dz1.u<? extends o>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends o> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("RESET_FILTER_LIFE observerAttribute FAILED!", th3);
            return y.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements iz1.l {
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Function1<z, dz1.u<? extends o>> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends o> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                h hVar = h.this;
                gi0.f fVar = hVar.f64538a;
                on.b.f60566a.getClass();
                dz1.r a13 = fVar.a(on.b.f60568c, new m());
                b bVar = new b(a.d);
                b.a aVar = kz1.b.f50218a;
                dz1.u F = new y0(a13, bVar, false).F(hVar.f64539b);
                F.getClass();
                return F;
            }
            return y.d;
        }
    }

    public h(f60.i iVar, gi0.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f64538a = fVar;
        this.f64539b = new d02.d<>();
        k0 k0Var = iVar.f29963o;
        final c cVar = new c();
        dz1.r<R> T = k0Var.T(new iz1.l(cVar) { // from class: pp.i
            public final /* synthetic */ Function1 d;

            {
                cVar.getClass();
                this.d = cVar;
            }

            @Override // iz1.l
            /* renamed from: apply */
            public final /* synthetic */ Object mo7apply(Object obj) {
                return this.d.invoke(obj);
            }
        });
        T.getClass();
        this.f64540c = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // pp.n
    public final d0 a() {
        rz1.t p13 = this.f64540c.U(1L).p(new he0.e(this, 20));
        ph.b bVar = new ph.b(new po.c(this, 1), 17);
        b.a aVar = kz1.b.f50218a;
        return new d0(p13, bVar, false);
    }
}
