package lp;

import kotlin.Metadata;
import qv1.s;
import y9.w;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llp/a;", "", "", "frequency1", "frequency2", "frequency3", "frequency4", "frequency5", "<init>", "(IIIII)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f52502a;

    /* renamed from: b  reason: collision with root package name */
    public final int f52503b;

    /* renamed from: c  reason: collision with root package name */
    public final int f52504c;
    public final int d;
    public final int e;

    public a(int i13, int i14, int i15, int i16, int i17) {
        this.f52502a = i13;
        this.f52503b = i14;
        this.f52504c = i15;
        this.d = i16;
        this.e = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f52502a == aVar.f52502a && this.f52503b == aVar.f52503b && this.f52504c == aVar.f52504c && this.d == aVar.d && this.e == aVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + w.b(this.d, w.b(this.f52504c, w.b(this.f52503b, Integer.hashCode(this.f52502a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k13 = s.k("CustomEqualization(frequency1=", this.f52502a, ", frequency2=", this.f52503b, ", frequency3=");
        o1.a.k(this.f52504c, this.d, ", frequency4=", ", frequency5=", k13);
        return b0.g.i(this.e, ")", k13);
    }
}
