package bk;

import android.content.Context;
/* loaded from: classes2.dex */
public final class g implements xy1.d<f> {

    /* renamed from: a  reason: collision with root package name */
    public final xy1.i<Context> f7885a;

    private g(xy1.i<Context> iVar) {
        this.f7885a = iVar;
    }

    public static g a(xy1.i<Context> iVar) {
        return new g(iVar);
    }

    @Override // w02.a
    public final Object get() {
        return new f(this.f7885a.get());
    }
}
