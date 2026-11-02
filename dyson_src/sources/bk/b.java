package bk;

import b0.y1;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbk/b;", "", "", "nameKey", "", "Lbk/a;", "finishes", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getFinishes", "()Ljava/util/List;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    @SerializedName("name")

    /* renamed from: a  reason: collision with root package name */
    private final String f7875a;
    @SerializedName("accessoryFinishes")

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f7876b;

    public b(String str, List<a> list) {
        str.getClass();
        list.getClass();
        this.f7875a = str;
        this.f7876b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bk.a a() {
        /*
            r3 = this;
            java.util.List<bk.a> r3 = r3.f7876b
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            bk.a r0 = (bk.a) r0
            java.lang.String r1 = r0.a()
            java.lang.String r2 = "earcushion_finish_left"
            boolean r1 = x12.r.c(r1, r2)
            if (r1 != 0) goto L2a
            java.lang.String r1 = r0.a()
            java.lang.String r2 = "earcup_finish_left"
            boolean r1 = x12.r.c(r1, r2)
            if (r1 == 0) goto L6
        L2a:
            return r0
        L2b:
            java.lang.String r3 = "Collection contains no element matching the predicate."
            h12.y.p(r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.b.a():bk.a");
    }

    public final String b() {
        return a().b();
    }

    public final String c() {
        return this.f7875a;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bk.a d() {
        /*
            r3 = this;
            java.util.List<bk.a> r3 = r3.f7876b
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r3.next()
            bk.a r0 = (bk.a) r0
            java.lang.String r1 = r0.a()
            java.lang.String r2 = "earcushion_finish_right"
            boolean r1 = x12.r.c(r1, r2)
            if (r1 != 0) goto L2a
            java.lang.String r1 = r0.a()
            java.lang.String r2 = "earcup_finish_right"
            boolean r1 = x12.r.c(r1, r2)
            if (r1 == 0) goto L6
        L2a:
            return r0
        L2b:
            java.lang.String r3 = "Collection contains no element matching the predicate."
            h12.y.p(r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.b.d():bk.a");
    }

    public final String e() {
        return d().b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return x12.r.c(this.f7875a, bVar.f7875a) && x12.r.c(this.f7876b, bVar.f7876b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7876b.hashCode() + (this.f7875a.hashCode() * 31);
    }

    public final String toString() {
        return y1.k("AccessoryOption(nameKey=", this.f7875a, ", finishes=", ")", this.f7876b);
    }
}
