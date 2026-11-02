package f60;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lf60/c0;", "", "Lf60/n;", "backgroundBehaviour", "Lf60/d0;", "bleScanTimeout", "<init>", "(Lf60/n;Lf60/d0;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final n f29940a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f29941b;

    public c0(n nVar, d0 d0Var) {
        nVar.getClass();
        d0Var.getClass();
        this.f29940a = nVar;
        this.f29941b = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f29940a == c0Var.f29940a && this.f29941b == c0Var.f29941b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f29941b.hashCode() + (this.f29940a.hashCode() * 31);
    }

    public final String toString() {
        return "BleScanConfiguration(backgroundBehaviour=" + this.f29940a + ", bleScanTimeout=" + this.f29941b + ")";
    }
}
