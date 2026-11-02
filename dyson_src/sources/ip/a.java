package ip;

import hx.v;
import java.util.Arrays;
import kotlin.Metadata;
import l60.g;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lip/a;", "Ll60/a;", "Lip/c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements l60.a<c> {
    @Override // l60.a
    public final c a(l60.b bVar) {
        byte[] bArr;
        byte[] bArr2 = bVar.f50882a;
        on.b.f60566a.getClass();
        if (!Arrays.equals(bArr2, on.b.f60579p) || (bArr = bVar.f50884c) == null) {
            return null;
        }
        return v.Y(bArr);
    }

    @Override // l60.a
    public final c b(g gVar) {
        byte[] bArr;
        byte[] bArr2 = gVar.f50896a;
        on.b.f60566a.getClass();
        if (!Arrays.equals(bArr2, on.b.f60579p) || (bArr = gVar.d) == null) {
            return null;
        }
        return v.Y(bArr);
    }
}
