package yo;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyo/n;", "", "Lyo/q;", "transparencyMode", "Lyo/p;", "isolationMode", "<init>", "(Lyo/q;Lyo/p;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final q f90321a;

    /* renamed from: b  reason: collision with root package name */
    public final p f90322b;

    public n(q qVar, p pVar) {
        this.f90321a = qVar;
        this.f90322b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f90321a == nVar.f90321a && this.f90322b == nVar.f90322b;
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.f90321a;
        int hashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        p pVar = this.f90322b;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "UserAncModes(transparencyMode=" + this.f90321a + ", isolationMode=" + this.f90322b + ")";
    }
}
