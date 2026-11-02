package bk;

import b0.y1;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbk/k;", "", "", "Lbk/v;", "sections", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k {
    @SerializedName("sections")

    /* renamed from: a  reason: collision with root package name */
    private final List<v> f7890a;

    public k(List<v> list) {
        list.getClass();
        this.f7890a = list;
    }

    public final v a() {
        for (v vVar : this.f7890a) {
            if (x12.r.c(vVar.a(), "earcups")) {
                return vVar;
            }
        }
        h12.y.p("Collection contains no element matching the predicate.");
        return null;
    }

    public final v b() {
        for (v vVar : this.f7890a) {
            if (x12.r.c(vVar.a(), "earcushions")) {
                return vVar;
            }
        }
        h12.y.p("Collection contains no element matching the predicate.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && x12.r.c(this.f7890a, ((k) obj).f7890a);
    }

    public final int hashCode() {
        return this.f7890a.hashCode();
    }

    public final String toString() {
        return y1.l("CustomisationOptions(sections=", ")", this.f7890a);
    }
}
