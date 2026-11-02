package bk;

import b0.y1;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lbk/a;", "", "", "finishId", "accessoryId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    @SerializedName("finishId")

    /* renamed from: a  reason: collision with root package name */
    private final String f7873a;
    @SerializedName("accessoryId")

    /* renamed from: b  reason: collision with root package name */
    private final String f7874b;

    static {
        new C0231a(null);
    }

    public a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7873a = str;
        this.f7874b = str2;
    }

    public final String a() {
        return this.f7874b;
    }

    public final String b() {
        return this.f7873a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return x12.r.c(this.f7873a, aVar.f7873a) && x12.r.c(this.f7874b, aVar.f7874b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7874b.hashCode() + (this.f7873a.hashCode() * 31);
    }

    public final String toString() {
        return y1.j("AccessoryFinish(finishId=", this.f7873a, ", accessoryId=", this.f7874b, ")");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lbk/a$a;", "", "<init>", "()V", "", "CUSHION_LEFT", "Ljava/lang/String;", "CUSHION_RIGHT", "CAP_LEFT", "CAP_RIGHT", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: bk.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0231a {
        public /* synthetic */ C0231a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0231a() {
        }
    }
}
