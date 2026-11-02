package lp;

import i12.t;
import i12.u;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Llp/e;", "Lon/c;", "Llp/a;", "customEqualization", "<init>", "(Llp/a;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends on.c {

    /* renamed from: f  reason: collision with root package name */
    public final UUID f52508f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f52509g;

    /* renamed from: h  reason: collision with root package name */
    public final k60.m f52510h;

    public e(a aVar) {
        aVar.getClass();
        on.a.f60555a.getClass();
        this.f52508f = on.a.f60560h;
        List<Number> h13 = t.h(Integer.valueOf(aVar.f52502a), Integer.valueOf(aVar.f52503b), Integer.valueOf(aVar.f52504c), Integer.valueOf(aVar.d), Integer.valueOf(aVar.e));
        ArrayList<Number> arrayList = new ArrayList(u.o(h13, 10));
        for (Number number : h13) {
            arrayList.add(Byte.valueOf((byte) number.intValue()));
        }
        byte[] bArr = new byte[arrayList.size()];
        int i13 = 0;
        for (Number number2 : arrayList) {
            bArr[i13] = number2.byteValue();
            i13++;
        }
        this.f52509g = bArr;
        this.f52510h = k60.m.WRITE;
    }

    @Override // k60.h
    public final UUID a() {
        return this.f52508f;
    }

    @Override // k60.h
    public final byte[] b() {
        return this.f52509g;
    }

    @Override // k60.h
    public final k60.m e() {
        return this.f52510h;
    }
}
