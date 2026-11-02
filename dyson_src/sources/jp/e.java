package jp;

import b50.p;
import com.dyson.mobile.android.logging.Logger;
import dz1.r;
import dz1.u;
import em1.c4;
import f60.i;
import f60.z;
import iz1.l;
import ji1.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kz1.b;
import rz1.d0;
import rz1.k0;
import rz1.t;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljp/e;", "Ljp/c;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "<init>", "(Lf60/i;Lgi0/f;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e implements jp.c {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.f f45516a;

    /* renamed from: b  reason: collision with root package name */
    public final d02.d<jp.a> f45517b;

    /* renamed from: c  reason: collision with root package name */
    public final r<jp.a> f45518c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, u<? extends jp.a>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends jp.a> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("CONVERSATION_MODE observerAttribute FAILED!", th3);
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements Function1<z, u<? extends jp.a>> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends jp.a> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                e eVar = e.this;
                gi0.f fVar = eVar.f45516a;
                on.b.f60566a.getClass();
                r a13 = fVar.a(on.b.f60573j, new jp.b());
                b bVar = new b(a.d);
                b.a aVar = kz1.b.f50218a;
                u F = new y0(a13, bVar, false).F(eVar.f45517b);
                F.getClass();
                return F;
            }
            return y.d;
        }
    }

    public e(i iVar, gi0.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f45516a = fVar;
        this.f45517b = new d02.d<>();
        k0 k0Var = iVar.f29963o;
        final c cVar = new c();
        r<R> T = k0Var.T(new l(cVar) { // from class: jp.f
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
        this.f45518c = c4.C(T, kz1.a.f50213a, 1);
    }

    @Override // jp.c
    public final r<jp.a> a() {
        return this.f45518c;
    }

    @Override // jp.c
    public final d0 b(jp.a aVar) {
        aVar.getClass();
        t p13 = this.f45518c.U(1L).p(new p(11, this, aVar));
        k kVar = new k(new i81.d(17, aVar, this), 8);
        b.a aVar2 = kz1.b.f50218a;
        return new d0(p13, kVar, false);
    }
}
