package lp;

import dz1.x;
import hl.f0;
import kotlin.Metadata;
import kz1.b;
import lf0.m0;
import x50.l0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llp/g;", "Llp/b;", "Lf60/i;", "authenticatedBleConnector", "Lx50/l0;", "bleClient", "<init>", "(Lf60/i;Lx50/l0;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f60.i f52512a;

    /* renamed from: b  reason: collision with root package name */
    public final l0 f52513b;

    public g(f60.i iVar, l0 l0Var) {
        iVar.getClass();
        l0Var.getClass();
        this.f52512a = iVar;
        this.f52513b = l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // lp.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lp.a r6, n12.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lp.f
            if (r0 == 0) goto L13
            r0 = r7
            lp.f r0 = (lp.f) r0
            int r1 = r0.f52511f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52511f = r1
            goto L18
        L13:
            lp.f r0 = new lp.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f52511f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            h12.r.b(r7)
            goto L50
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r5)
            return r3
        L2e:
            h12.r.b(r7)
            r0.f52511f = r4
            f60.i r7 = r5.f52512a
            boolean r7 = r7.f()
            if (r7 != 0) goto L3d
            r7 = r3
            goto L4d
        L3d:
            lp.e r7 = new lp.e
            r7.<init>(r6)
            x50.l0 r5 = r5.f52513b
            dz1.x r5 = r5.a(r7)
            java.lang.Object r5 = g42.b.b(r5, r0)
            r7 = r5
        L4d:
            if (r7 != r1) goto L50
            return r1
        L50:
            x50.m0 r5 = x50.m0.SUCCESS
            if (r7 != r5) goto L55
            goto L56
        L55:
            r4 = 0
        L56:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.g.a(lp.a, n12.c):java.lang.Object");
    }

    @Override // lp.b
    public final Object b(f0 f0Var) {
        if (this.f52512a.f()) {
            x f13 = this.f52513b.f(new d(), new c());
            m0 m0Var = new m0(new lm0.a(3), 6);
            b.a aVar = kz1.b.f50218a;
            return g42.b.b(new sz1.x(f13, m0Var), f0Var);
        }
        return null;
    }
}
