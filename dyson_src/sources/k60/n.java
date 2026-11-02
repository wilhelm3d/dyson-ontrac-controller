package k60;

import e60.e;
import java.util.UUID;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk60/n;", "Lk60/h;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n extends h {
    public final UUID d;
    public final UUID e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f47022f;

    /* renamed from: g  reason: collision with root package name */
    public final byte f47023g;

    /* renamed from: h  reason: collision with root package name */
    public final m f47024h;

    public n() {
        UUID uuid = e60.e.f26071a;
        uuid.getClass();
        this.d = uuid;
        UUID uuid2 = e.a.f26072a;
        uuid2.getClass();
        this.e = uuid2;
        h.f47014a.getClass();
        this.f47022f = h.f47015b;
        this.f47023g = (byte) 81;
        this.f47024h = m.WRITE;
    }

    @Override // k60.h
    public final UUID a() {
        return this.e;
    }

    @Override // k60.h
    public final byte[] b() {
        return this.f47022f;
    }

    @Override // k60.h
    public final byte d() {
        return this.f47023g;
    }

    @Override // k60.h
    public final m e() {
        return this.f47024h;
    }

    @Override // k60.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return n.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // k60.h
    public final UUID f() {
        return this.d;
    }

    @Override // k60.h
    public final int hashCode() {
        return n.class.hashCode();
    }
}
