package bk;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/y;", "Lbk/r;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class y implements r {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7931c;

    /* renamed from: a  reason: collision with root package name */
    public static final y f7929a = new y();

    /* renamed from: b  reason: collision with root package name */
    public static final j42.c f7930b = j42.d.a();
    public static final h12.t d = h12.m.b(new bj.b(1));

    private y() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r7.a(r0) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (z32.g0.v(r3, r5, r0) == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:23:0x0051, B:25:0x0055), top: B:36:0x0051 }] */
    /* JADX WARN: Type inference failed for: r3v5, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r8v5, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r8v8, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // bk.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(n12.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof bk.w
            if (r0 == 0) goto L13
            r0 = r8
            bk.w r0 = (bk.w) r0
            int r1 = r0.f7928h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7928h = r1
            goto L18
        L13:
            bk.w r0 = new bk.w
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r7 = r0.f7926f
            m12.a r8 = m12.a.COROUTINE_SUSPENDED
            int r1 = r0.f7928h
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            j42.a r8 = r0.d
            h12.r.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L73
        L2d:
            r7 = move-exception
            goto L7b
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r7)
            return r4
        L35:
            int r1 = r0.e
            j42.a r3 = r0.d
            h12.r.b(r7)
            r7 = r3
            goto L51
        L3e:
            h12.r.b(r7)
            j42.c r7 = bk.y.f7930b
            r0.d = r7
            r1 = 0
            r0.e = r1
            r0.f7928h = r3
            java.lang.Object r3 = r7.a(r0)
            if (r3 != r8) goto L51
            goto L6c
        L51:
            boolean r3 = bk.y.f7931c     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto L72
            bk.y r3 = bk.y.f7929a     // Catch: java.lang.Throwable -> L6d
            z32.y r3 = r3.b()     // Catch: java.lang.Throwable -> L6d
            bk.x r5 = new bk.x     // Catch: java.lang.Throwable -> L6d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L6d
            r0.d = r7     // Catch: java.lang.Throwable -> L6d
            r0.e = r1     // Catch: java.lang.Throwable -> L6d
            r0.f7928h = r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = z32.g0.v(r3, r5, r0)     // Catch: java.lang.Throwable -> L6d
            if (r0 != r8) goto L72
        L6c:
            return r8
        L6d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L7b
        L72:
            r8 = r7
        L73:
            h12.f0 r7 = h12.f0.f36844a     // Catch: java.lang.Throwable -> L2d
            r8.c(r4)
            h12.f0 r7 = h12.f0.f36844a
            return r7
        L7b:
            r8.c(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.y.a(n12.c):java.lang.Object");
    }

    @Override // bk.r
    public final z32.y b() {
        return (z32.y) d.getValue();
    }
}
