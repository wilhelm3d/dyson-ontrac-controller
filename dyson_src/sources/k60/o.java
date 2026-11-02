package k60;

import e60.a;
import java.util.UUID;
import k60.h;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk60/o;", "Lk60/h;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class o extends h {
    public final UUID d;
    public final UUID e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f47025f;

    /* renamed from: g  reason: collision with root package name */
    public final byte f47026g;

    /* renamed from: h  reason: collision with root package name */
    public final m f47027h;

    public o() {
        UUID uuid = e60.a.f26064b;
        uuid.getClass();
        this.d = uuid;
        UUID uuid2 = a.C0902a.f26067b;
        uuid2.getClass();
        this.e = uuid2;
        h.a aVar = h.f47014a;
        aVar.getClass();
        this.f47025f = h.f47015b;
        aVar.getClass();
        this.f47026g = h.f47016c;
        this.f47027h = m.READ;
    }

    @Override // k60.h
    public final UUID a() {
        return this.e;
    }

    @Override // k60.h
    public final byte[] b() {
        return this.f47025f;
    }

    @Override // k60.h
    public final byte d() {
        return this.f47026g;
    }

    @Override // k60.h
    public final m e() {
        return this.f47027h;
    }

    @Override // k60.h
    public final UUID f() {
        return this.d;
    }
}
