package bk;

import android.content.Context;
import hk.j4;
/* loaded from: classes2.dex */
public final class e implements xy1.d<d> {

    /* renamed from: a  reason: collision with root package name */
    public final xy1.i<Context> f7879a;

    /* renamed from: b  reason: collision with root package name */
    public final xy1.i<af1.i> f7880b;

    private e(xy1.i<Context> iVar, xy1.i<af1.i> iVar2) {
        this.f7879a = iVar;
        this.f7880b = iVar2;
    }

    public static e a(xy1.i iVar, j4 j4Var) {
        return new e(iVar, j4Var);
    }

    @Override // w02.a
    public final Object get() {
        return new d(this.f7879a.get(), this.f7880b.get());
    }
}
