package k60;

import b0.y1;
import com.dyson.mobile.android.logging.Logger;
import com.google.common.base.Ascii;
import h12.y;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class l implements Iterable<byte[]>, Iterator<byte[]> {
    public final byte[] d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public int f47020f;

    /* renamed from: g  reason: collision with root package name */
    public final int f47021g;

    public l(byte[] bArr, byte b13, int i13) {
        Logger.a("MTU: MessageFragmenter created with capacity " + i13);
        int i14 = i13 + (-1);
        this.f47021g = i14;
        int i15 = i14 * 128;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + 1);
        byteArrayOutputStream.write(b13);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.d = byteArray;
        if (byteArray.length > i15) {
            s72.a.w(y1.i(i15, "Message length over the maximal capacity. Maximum is ", " bytes"));
            throw null;
        }
        if (byteArray.length <= i14) {
            this.e = 0;
        } else {
            this.e = ((int) Math.ceil(byteArray.length / i14)) - 1;
        }
        this.f47020f = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47020f <= this.e;
    }

    @Override // java.lang.Iterable
    public final Iterator<byte[]> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public final byte[] next() {
        if (!hasNext()) {
            y.p("No more data available.");
            return null;
        }
        int i13 = this.f47020f;
        byte b13 = (byte) (i13 == 0 ? ((byte) this.e) | Byte.MIN_VALUE : ((byte) i13) & Ascii.DEL);
        int i14 = this.f47021g;
        int i15 = i13 * i14;
        int min = Math.min(i14 + i15, this.d.length) - i15;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(min + 1);
        byteArrayOutputStream.write(b13);
        byteArrayOutputStream.write(this.d, i15, min);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f47020f++;
        return byteArray;
    }
}
