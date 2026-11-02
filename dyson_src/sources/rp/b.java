package rp;

import c42.a2;
import c42.h;
import c42.i;
import c42.j;
import c42.u1;
import c42.w1;
import com.salesforce.marketingcloud.push.g;
import f60.z;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import z32.c0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrp/b;", "Lrp/d;", "Lf60/f0;", "authenticatedBleConnector", "Lgi0/a;", "messageAttributeValueController", "Lvj/c;", "audioCapabilitySupport", "Lz32/c0;", "coroutineScope", "<init>", "(Lf60/f0;Lgi0/a;Lvj/c;Lz32/c0;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final gi0.a f73494a;

    /* renamed from: b  reason: collision with root package name */
    public final vj.c f73495b;

    /* renamed from: c  reason: collision with root package name */
    public final u1 f73496c;
    public final i<e> d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lc42/j;", g.f21676h, "Lh12/f0;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.traits.headdetection.DefaultHeadDetectionToggleController$special$$inlined$flatMapConnected$1", f = "DefaultHeadDetectionToggleController.kt", l = {189}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function3<j<? super e>, z, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ j e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f73497f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ b f73498g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l12.d dVar, b bVar) {
            super(3, dVar);
            this.f73498g = bVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(j<? super e> jVar, z zVar, l12.d<? super f0> dVar) {
            a aVar = new a(dVar, this.f73498g);
            aVar.e = jVar;
            aVar.f73497f = zVar;
            return aVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            i iVar;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                j jVar = this.e;
                if (((z) this.f73497f) instanceof z.a) {
                    b bVar = this.f73498g;
                    gi0.a aVar2 = bVar.f73494a;
                    on.b.f60566a.getClass();
                    iVar = c42.r.A(aVar2.a(on.b.f60581r, new c()), bVar.f73496c);
                } else {
                    iVar = h.d;
                }
                this.e = null;
                this.f73497f = null;
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

    public b(f60.f0 f0Var, gi0.a aVar, vj.c cVar, c0 c0Var) {
        i<e> iVar;
        f0Var.getClass();
        aVar.getClass();
        cVar.getClass();
        c0Var.getClass();
        this.f73494a = aVar;
        this.f73495b = cVar;
        this.f73496c = w1.b(0, 0, null, 7);
        if (c()) {
            i n13 = c42.r.n(c42.r.E(f0Var.f29944b, new a(null, this)));
            a2.f10222a.getClass();
            iVar = c42.r.C(n13, c0Var, a2.a.f10225c, 1);
        } else {
            iVar = h.d;
        }
        this.d = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r9 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r9 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
        if (r7.f73496c.emit(r8, r0) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // rp.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(rp.e r8, n12.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rp.a
            if (r0 == 0) goto L13
            r0 = r9
            rp.a r0 = (rp.a) r0
            int r1 = r0.f73493g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73493g = r1
            goto L18
        L13:
            rp.a r0 = new rp.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f73493g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            h12.r.b(r9)
            goto L84
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r7)
            return r6
        L34:
            rp.e r8 = r0.d
            h12.r.b(r9)
            goto L77
        L3a:
            rp.e r8 = r0.d
            h12.r.b(r9)
            goto L50
        L40:
            h12.r.b(r9)
            r0.d = r8
            r0.f73493g = r5
            c42.i<rp.e> r9 = r7.d
            java.lang.Object r9 = c42.r.t(r9, r0)
            if (r9 != r1) goto L50
            goto L83
        L50:
            rp.e r9 = (rp.e) r9
            if (r8 == r9) goto L77
            r0.d = r8
            r0.f73493g = r4
            boolean r9 = r7.c()
            if (r9 == 0) goto L71
            rp.f r9 = new rp.f
            r9.<init>(r8)
            gi0.a r2 = r7.f73494a
            java.lang.Object r9 = r2.b(r9, r0)
            if (r9 != r1) goto L6c
            goto L6e
        L6c:
            h12.f0 r9 = h12.f0.f36844a
        L6e:
            if (r9 != r1) goto L77
            goto L83
        L71:
            java.lang.String r7 = "Head detection capability not supported"
            pa.c.w(r7)
            return r6
        L77:
            r0.d = r6
            r0.f73493g = r3
            c42.u1 r7 = r7.f73496c
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r1) goto L84
        L83:
            return r1
        L84:
            h12.f0 r7 = h12.f0.f36844a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rp.b.a(rp.e, n12.c):java.lang.Object");
    }

    @Override // rp.d
    public final i<e> b() {
        return this.d;
    }

    @Override // rp.d
    public final boolean c() {
        return this.f73495b.a("HeadDetectToggle");
    }
}
