package hp;

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
import rz1.k0;
import rz1.y;
import rz1.y0;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhp/f;", "Lhp/c;", "Lf60/i;", "authenticatedBleConnector", "Lgi0/f;", "messageAttributeValueController", "Lvj/c;", "audioCapabilitySupport", "<init>", "(Lf60/i;Lgi0/f;Lvj/c;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f implements hp.c {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.f f39460a;

    /* renamed from: b  reason: collision with root package name */
    public final vj.c f39461b;

    /* renamed from: c  reason: collision with root package name */
    public final r<d> f39462c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Function1<Throwable, u<? extends d>> {
        public static final a d = new a();

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends d> invoke(Throwable th2) {
            Throwable th3 = th2;
            th3.getClass();
            Logger.b("CALIBRATION_STATUS observerAttribute FAILED!", th3);
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
    public static final class c implements Function1<z, u<? extends d>> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final u<? extends d> invoke(z zVar) {
            z zVar2 = zVar;
            zVar2.getClass();
            if (zVar2 instanceof z.a) {
                gi0.f fVar = f.this.f39460a;
                on.b.f60566a.getClass();
                r a13 = fVar.a(on.b.f60578o, new hp.a());
                b bVar = new b(a.d);
                b.a aVar = kz1.b.f50218a;
                return new y0(a13, bVar, false);
            }
            return y.d;
        }
    }

    public f(i iVar, gi0.f fVar, vj.c cVar) {
        r<d> D;
        iVar.getClass();
        fVar.getClass();
        cVar.getClass();
        this.f39460a = fVar;
        this.f39461b = cVar;
        if (a()) {
            k0 k0Var = iVar.f29963o;
            final c cVar2 = new c();
            r<R> T = k0Var.T(new l(cVar2) { // from class: hp.g
                public final /* synthetic */ Function1 d;

                {
                    cVar2.getClass();
                    this.d = cVar2;
                }

                @Override // iz1.l
                /* renamed from: apply */
                public final /* synthetic */ Object mo7apply(Object obj) {
                    return this.d.invoke(obj);
                }
            });
            T.getClass();
            D = c4.C(T, kz1.a.f50213a, 1);
        } else {
            D = r.D(d.CAPSENSE_CALIBRATION_NOT_SUPPORTED);
        }
        this.f39462c = D;
    }

    @Override // hp.c
    public final boolean a() {
        return this.f39461b.a("WornDetectionCalibration");
    }

    @Override // hp.c
    public final r<d> b() {
        return this.f39462c;
    }

    @Override // hp.c
    public final dz1.b c() {
        hp.b bVar = hp.b.CAPSENSE_CALIBRATION_RESET;
        if (a()) {
            return this.f39460a.b(new e(bVar));
        }
        return dz1.b.p(new IllegalStateException("Calibration not supported"));
    }

    @Override // hp.c
    public final dz1.b d() {
        hp.b bVar = hp.b.CAPSENSE_CALIBRATION_START;
        if (a()) {
            return this.f39460a.b(new e(bVar));
        }
        return dz1.b.p(new IllegalStateException("Calibration not supported"));
    }
}
