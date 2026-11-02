package pp;

import java.util.Arrays;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpp/a;", "Ll60/a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements l60.a<Integer> {
    @Override // l60.a
    public final Integer a(l60.b bVar) {
        byte[] bArr;
        Byte z13;
        byte[] bArr2 = bVar.f50882a;
        on.b.f60566a.getClass();
        if (!Arrays.equals(bArr2, on.b.d) || (bArr = bVar.f50884c) == null || (z13 = i12.q.z(bArr)) == null) {
            return null;
        }
        return Integer.valueOf(z13.byteValue());
    }

    @Override // l60.a
    public final Integer b(l60.g gVar) {
        byte[] bArr;
        Byte z13;
        byte[] bArr2 = gVar.f50896a;
        on.b.f60566a.getClass();
        if (!Arrays.equals(bArr2, on.b.d) || (bArr = gVar.d) == null || (z13 = i12.q.z(bArr)) == null) {
            return null;
        }
        return Integer.valueOf(z13.byteValue());
    }
}
