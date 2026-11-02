package np;

import hk.l;
import xy1.i;
/* loaded from: classes2.dex */
public final class e implements xy1.d<d> {

    /* renamed from: a  reason: collision with root package name */
    public final i<a> f58840a;

    private e(i<a> iVar) {
        this.f58840a = iVar;
    }

    public static e a(l lVar) {
        return new e(lVar);
    }

    @Override // w02.a
    public final Object get() {
        return new d(this.f58840a.get());
    }
}
