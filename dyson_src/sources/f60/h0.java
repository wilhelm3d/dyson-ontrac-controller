package f60;

import b0.y1;
import java.util.Arrays;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf60/h0;", "", "", "value", "encryptionKey", "<init>", "([B[B)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f29948a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f29949b;

    public h0(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.f29948a = bArr;
        this.f29949b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (h0.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            h0 h0Var = (h0) obj;
            return Arrays.equals(this.f29948a, h0Var.f29948a) && Arrays.equals(this.f29949b, h0Var.f29949b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29949b) + (Arrays.hashCode(this.f29948a) * 31);
    }

    public final String toString() {
        return y1.j("LongTermKey(value=", Arrays.toString(this.f29948a), ", encryptionKey=", Arrays.toString(this.f29949b), ")");
    }
}
