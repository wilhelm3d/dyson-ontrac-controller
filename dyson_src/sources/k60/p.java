package k60;

import e60.e;
import java.util.UUID;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk60/p;", "Lk60/h;", "Ld60/a;", "beaconUUID", "<init>", "(Ld60/a;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class p extends h {
    public final UUID d;
    public final UUID e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f47028f;

    /* renamed from: g  reason: collision with root package name */
    public final byte f47029g;

    /* renamed from: h  reason: collision with root package name */
    public final m f47030h;

    public p(d60.a aVar) {
        aVar.getClass();
        UUID uuid = e60.e.f26071a;
        uuid.getClass();
        this.d = uuid;
        UUID uuid2 = e.a.f26072a;
        uuid2.getClass();
        this.e = uuid2;
        byte[] bArr = new byte[32];
        this.f47028f = bArr;
        this.f47029g = (byte) 80;
        this.f47030h = m.WRITE;
        System.arraycopy(aVar.b(), 0, bArr, 0, 16);
        System.arraycopy(aVar.a(), 0, bArr, 16, 16);
    }

    @Override // k60.h
    public final UUID a() {
        return this.e;
    }

    @Override // k60.h
    public final byte[] b() {
        return this.f47028f;
    }

    @Override // k60.h
    public final byte d() {
        return this.f47029g;
    }

    @Override // k60.h
    public final m e() {
        return this.f47030h;
    }

    @Override // k60.h
    public final UUID f() {
        return this.d;
    }
}
