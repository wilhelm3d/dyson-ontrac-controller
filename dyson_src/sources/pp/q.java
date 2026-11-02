package pp;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpp/q;", "", "", "filterLifeRemaining", "", "isWarningState", "<init>", "(IZ)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f64549a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f64550b;

    public q(int i13, boolean z13) {
        this.f64549a = i13;
        this.f64550b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f64549a == qVar.f64549a && this.f64550b == qVar.f64550b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f64550b) + (Integer.hashCode(this.f64549a) * 31);
    }

    public final String toString() {
        return "FilterLifeWarning(filterLifeRemaining=" + this.f64549a + ", isWarningState=" + this.f64550b + ")";
    }
}
