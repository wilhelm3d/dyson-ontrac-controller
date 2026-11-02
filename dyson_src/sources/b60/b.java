package b60;

import e60.a;
import e60.e;
import java.util.UUID;
/* loaded from: classes2.dex */
public class b extends in0.b {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f7100b;

    /* renamed from: c  reason: collision with root package name */
    public final UUID f7101c;
    public final byte d;
    public final byte[] e;

    public b(in0.b bVar, byte[] bArr) {
        this.f7100b = bVar.e();
        UUID a13 = bVar.a();
        this.f7101c = a13;
        if (!a.C0902a.f26066a.equals(a13) && !e.a.f26072a.equals(a13)) {
            this.d = (byte) 0;
            this.e = bArr;
            return;
        }
        byte b13 = bArr[0];
        this.d = (b13 & Byte.MIN_VALUE) == -128 ? bArr[1] : (byte) 0;
        int i13 = (b13 & Byte.MIN_VALUE) == -128 ? 2 : 1;
        int length = bArr.length - i13;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        this.e = bArr2;
    }

    @Override // in0.b
    public final UUID a() {
        return this.f7101c;
    }

    @Override // in0.b
    public final byte[] b() {
        return this.e;
    }

    @Override // in0.b
    public final byte c() {
        return this.d;
    }

    @Override // in0.b
    public final int d() {
        return 1;
    }

    @Override // in0.b
    public final UUID e() {
        return this.f7100b;
    }
}
