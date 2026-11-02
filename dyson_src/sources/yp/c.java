package yp;

import b50.p;
import com.dyson.mobile.android.logging.Logger;
import dz1.r;
import dz1.u;
import em1.c4;
import f60.i;
import f60.z;
import iz1.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.d0;
import rz1.k0;
import rz1.t;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyp/c;", "Lyp/f;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.f f90371a;

    /* renamed from: b  reason: collision with root package name */
    public final d02.d<g> f90372b;

    /* renamed from: c  reason: collision with root package name */
    public final r<g> f90373c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements l {
        public final /* synthetic */ Function1 d;

        public a(Function1 function1) {
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
    public static final class b implements Function1<z, u<? extends g>> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends g> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                c cVar = c.this;
                gi0.f fVar = cVar.f90371a;
                on.b.f60566a.getClass();
                r a13 = fVar.a(on.b.f60571h, new e());
                a aVar = new a(C2735c.d);
                b.a aVar2 = kz1.b.f50218a;
                u F = new y0(a13, aVar, false).F(cVar.f90372b);
                F.getClass();
                return F;
            }
            return y.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: yp.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C2735c implements Function1<Throwable, u<? extends g>> {
        public static final C2735c d = new C2735c();

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends g> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("VOLUME_LIMITER observerAttribute FAILED!", th3);
            return y.d;
        }
    }

    public c(i iVar, gi0.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f90371a = fVar;
        this.f90372b = new d02.d<>();
        k0 k0Var = iVar.f29963o;
        final b bVar = new b();
        r<R> T = k0Var.T(new l(bVar) { // from class: yp.b
            public final /* synthetic */ Function1 d;

            {
                bVar.getClass();
                this.d = bVar;
            }

            @Override // iz1.l
            /* renamed from: apply */
            public final /* synthetic */ Object mo7apply(Object obj) {
                return this.d.invoke(obj);
            }
        });
        T.getClass();
        this.f90373c = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // yp.f
    public final d0 a(g gVar) {
        gVar.getClass();
        t p13 = this.f90373c.U(1L).p(new p(22, this, gVar));
        ym0.e eVar = new ym0.e(new yp.a(0, gVar, this), 5);
        b.a aVar = kz1.b.f50218a;
        return new d0(p13, eVar, false);
    }

    @Override // yp.f
    public final r<g> b() {
        return this.f90373c;
    }
}
