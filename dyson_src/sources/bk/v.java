package bk;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbk/v;", "", "", "id", "titleKey", "", "Lbk/b;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class v {
    @SerializedName("id")

    /* renamed from: a  reason: collision with root package name */
    private final String f7923a;
    @SerializedName("title")

    /* renamed from: b  reason: collision with root package name */
    private final String f7924b;
    @SerializedName("options")

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f7925c;

    static {
        new a(null);
    }

    public v(String str, String str2, List<b> list) {
        d72.a.x(str, str2, list);
        this.f7923a = str;
        this.f7924b = str2;
        this.f7925c = list;
    }

    public final String a() {
        return this.f7923a;
    }

    public final List<b> b() {
        return this.f7925c;
    }

    public final String c() {
        return this.f7924b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return x12.r.c(this.f7923a, vVar.f7923a) && x12.r.c(this.f7924b, vVar.f7924b) && x12.r.c(this.f7925c, vVar.f7925c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7925c.hashCode() + h12.y.c(this.f7923a.hashCode() * 31, 31, this.f7924b);
    }

    public final String toString() {
        String str = this.f7923a;
        String str2 = this.f7924b;
        return b0.g.k(ma.e.m("OptionsSection(id=", str, ", titleKey=", str2, ", options="), this.f7925c, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lbk/v$a;", "", "<init>", "()V", "", "CAPS", "Ljava/lang/String;", "CUSHIONS", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
