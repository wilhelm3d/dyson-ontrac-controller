package c60;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import m60.f;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc60/b;", "", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    public static f a(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(bArr2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return new f(byteArray);
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = {0, 0};
        byte[] a13 = u60.c.a(bArr, bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bArr3 != null) {
            byteArrayOutputStream.write(bArr3);
        }
        byteArrayOutputStream.write(bArr4);
        byteArrayOutputStream.write(a13);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }
}
