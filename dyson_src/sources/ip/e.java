package ip;

import ap1.w;
import dz1.r;
import dz1.u;
import f60.i;
import f60.z;
import gi0.f;
import iz1.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.d1;
import rz1.k0;
import rz1.n;
import rz1.y;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lip/e;", "Lip/b;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "Lvj/c;", "audioCapabilitySupport", "<init>", "(Lf60/i;Lgi0/f;Lvj/c;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final r<c> f42410a;

    /* renamed from: b  reason: collision with root package name */
    public final d1 f42411b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<z, u<? extends c>> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends c> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            return zVar2 instanceof z.a ? e.this.f42411b : y.d;
        }
    }

    public e(i iVar, f fVar, vj.c cVar) {
        r<c> D;
        iVar.getClass();
        fVar.getClass();
        cVar.getClass();
        if (cVar.a("ChargeRate")) {
            k0 k0Var = iVar.f29963o;
            final a aVar = new a();
            D = k0Var.T(new l(aVar) { // from class: ip.d
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
            D.getClass();
        } else {
            D = r.D(c.NOT_SUPPORTED);
        }
        this.f42410a = D;
        w wVar = new w(fVar, 8);
        b.a aVar2 = kz1.b.f50218a;
        this.f42411b = new n(wVar).o(kz1.a.f50213a).J().e0();
    }

    @Override // ip.b
    public final r<c> a() {
        return this.f42410a;
    }
}
