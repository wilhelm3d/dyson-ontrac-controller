package sn;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsn/b;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f76617a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f76618b;

    static {
        op.a[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (op.a aVar : op.a.values()) {
            linkedHashMap.put(Integer.valueOf(aVar.getFaultPosition128Bit()), aVar);
        }
        f76618b = linkedHashMap;
    }

    private b() {
    }

    public static ArrayList a(byte[] bArr) {
        bArr.getClass();
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            byte b13 = bArr[i13];
            int i15 = i14 + 1;
            for (int i16 = 0; i16 < 8; i16++) {
                if (((byte) (((byte) Math.pow(2.0d, i16)) & b13)) != 0) {
                    op.a aVar = (op.a) f76618b.get(Integer.valueOf((i14 * 8) + i16));
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
            }
            i13++;
            i14 = i15;
        }
        return arrayList;
    }
}
