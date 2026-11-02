package np;

import com.dyson.mobile.android.logging.Logger;
import dz1.r;
import dz1.u;
import em1.c4;
import f60.i;
import f60.z;
import gi0.f;
import iz1.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.k0;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnp/b;", "Lnp/a;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b implements np.a {

    /* renamed from: a  reason: collision with root package name */
    public final f f58837a;

    /* renamed from: b  reason: collision with root package name */
    public final r<List<op.a>> f58838b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, u<? extends List<? extends op.a>>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends List<? extends op.a>> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("CURRENT_ALARM observerAttribute FAILED!", th3);
            return y.d;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: np.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1754b implements l {
        public final /* synthetic */ Function1 d;

        public C1754b(Function1 function1) {
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
    public static final class c implements Function1<z, u<? extends List<? extends op.a>>> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends List<? extends op.a>> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                f fVar = b.this.f58837a;
                on.b.f60566a.getClass();
                r a13 = fVar.a(on.b.f60574k, new sn.a());
                C1754b c1754b = new C1754b(a.d);
                b.a aVar = kz1.b.f50218a;
                return new y0(a13, c1754b, false);
            }
            return y.d;
        }
    }

    public b(i iVar, f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f58837a = fVar;
        k0 k0Var = iVar.f29963o;
        final c cVar = new c();
        r<R> T = k0Var.T(new l(cVar) { // from class: np.c
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
        this.f58838b = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // np.a
    public final r<List<op.a>> a() {
        return this.f58838b;
    }
}
