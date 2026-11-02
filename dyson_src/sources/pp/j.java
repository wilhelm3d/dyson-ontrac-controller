package pp;

import com.dyson.mobile.android.logging.Logger;
import em1.c4;
import f60.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.k0;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpp/j;", "Lpp/u;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j implements u {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.f f64541a;

    /* renamed from: b  reason: collision with root package name */
    public final dz1.r<s> f64542b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, dz1.u<? extends s>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends s> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("FILTER_PRESENCE observerAttribute FAILED!", th3);
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
    public static final class c implements Function1<z, dz1.u<? extends s>> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final dz1.u<? extends s> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                gi0.f fVar = j.this.f64541a;
                on.b.f60566a.getClass();
                dz1.r a13 = fVar.a(on.b.f60567b, new t());
                b bVar = new b(a.d);
                b.a aVar = kz1.b.f50218a;
                return new y0(a13, bVar, false);
            }
            return y.d;
        }
    }

    public j(f60.i iVar, gi0.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f64541a = fVar;
        k0 k0Var = iVar.f29963o;
        final c cVar = new c();
        dz1.r<R> T = k0Var.T(new iz1.l(cVar) { // from class: pp.k
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
        this.f64542b = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // pp.u
    public final dz1.r<s> a() {
        return this.f64542b;
    }
}
