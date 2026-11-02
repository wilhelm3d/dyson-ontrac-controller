package yo;

import com.google.common.base.Ascii;
import java.util.Iterator;
/* loaded from: classes2.dex */
public final class l {
    public static final n a(byte[] bArr) {
        Object obj;
        bArr.getClass();
        Byte z13 = i12.q.z(bArr);
        Object obj2 = null;
        if (z13 != null) {
            byte byteValue = z13.byteValue();
            q.Companion.getClass();
            int i13 = (byteValue >> 4) & 15;
            Iterator<E> it = q.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((q) obj).getValue() == i13) {
                    break;
                }
            }
            q qVar = (q) obj;
            p.Companion.getClass();
            int i14 = byteValue & Ascii.SI;
            Iterator<E> it2 = p.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((p) next).getValue() == i14) {
                    obj2 = next;
                    break;
                }
            }
            return new n(qVar, (p) obj2);
        }
        return null;
    }
}
