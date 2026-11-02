package ep;

import ap1.w;
import dz1.r;
import dz1.u;
import f60.z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.d1;
import rz1.k0;
import rz1.n;
import rz1.y;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lep/i;", "Lep/e;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.f f28224a;

    /* renamed from: b  reason: collision with root package name */
    public final r<d> f28225b;

    /* renamed from: c  reason: collision with root package name */
    public final d1 f28226c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<z, u<? extends d>> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends d> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            return zVar2 instanceof z.a ? i.this.f28226c : y.d;
        }
    }

    public i(f60.i iVar, gi0.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f28224a = fVar;
        k0 k0Var = iVar.f29963o;
        final a aVar = new a();
        r T = k0Var.T(new iz1.l(aVar) { // from class: ep.h
            public final /* synthetic */ Function1 d;

            {
                aVar.getClass();
                this.d = aVar;
            }

            @Override // iz1.l
            /* renamed from: apply */
            public final /* synthetic */ Object mo7apply(Object obj) {
                return this.d.invoke(obj);
            }
        });
        T.getClass();
        this.f28225b = T;
        w wVar = new w(this, 2);
        b.a aVar2 = kz1.b.f50218a;
        this.f28226c = new n(wVar).o(kz1.a.f50213a).J().e0();
    }

    @Override // ep.e
    public final r<d> a() {
        return this.f28225b;
    }
}
