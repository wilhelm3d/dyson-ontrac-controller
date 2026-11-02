package bk;
/* loaded from: classes2.dex */
public final class t implements xy1.d<s> {

    /* renamed from: a  reason: collision with root package name */
    public final xy1.i<f> f7920a;

    private t(xy1.i<f> iVar) {
        this.f7920a = iVar;
    }

    public static t a(g gVar) {
        return new t(gVar);
    }

    @Override // w02.a
    public final Object get() {
        return new s(this.f7920a.get());
    }
}
