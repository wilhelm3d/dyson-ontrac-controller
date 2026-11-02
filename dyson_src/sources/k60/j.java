package k60;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final ByteArrayOutputStream f47017a;

    /* renamed from: b  reason: collision with root package name */
    public int f47018b;

    /* renamed from: c  reason: collision with root package name */
    public int f47019c;
    public byte d;

    public j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f47017a = byteArrayOutputStream;
        byteArrayOutputStream.reset();
        this.d = (byte) 0;
        this.f47018b = 0;
        this.f47019c = 0;
    }

    public final void a(byte[] bArr) {
        byte b13 = bArr[0];
        int i13 = b13 & Byte.MIN_VALUE;
        ByteArrayOutputStream byteArrayOutputStream = this.f47017a;
        if (i13 != -128) {
            this.f47019c = (b13 & Ascii.DEL) + 1;
            byteArrayOutputStream.write(bArr, 1, bArr.length - 1);
            return;
        }
        this.f47018b = (b13 & Ascii.DEL) + 1;
        this.d = bArr[1];
        this.f47019c = 1;
        byteArrayOutputStream.write(bArr, 2, bArr.length - 2);
    }

    public final boolean b() {
        int i13 = this.f47018b;
        return i13 == this.f47019c && i13 != 0;
    }
}
