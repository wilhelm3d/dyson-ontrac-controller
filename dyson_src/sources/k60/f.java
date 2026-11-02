package k60;

import java.util.UUID;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk60/f;", "Lon/c;", "", "isDiscoverable", "<init>", "(Z)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends on.c {

    /* renamed from: f  reason: collision with root package name */
    public final UUID f47009f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f47010g;

    /* renamed from: h  reason: collision with root package name */
    public final m f47011h;

    public f(boolean z13) {
        e60.c.f26069a.getClass();
        this.f47009f = e60.c.f26070b;
        x50.i.f86989a.getClass();
        this.f47010g = new byte[]{z13 ? (byte) 1 : (byte) 0, 0};
        this.f47011h = m.WRITE;
    }

    @Override // k60.h
    public final UUID a() {
        return this.f47009f;
    }

    @Override // k60.h
    public final byte[] b() {
        return this.f47010g;
    }

    @Override // k60.h
    public final m e() {
        return this.f47011h;
    }
}
