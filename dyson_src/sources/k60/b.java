package k60;

import e60.e;
import java.util.UUID;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk60/b;", "Lk60/h;", "Lk60/a;", "activeStatus", "<init>", "(Lk60/a;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends h {
    public final a d;
    public final UUID e;

    /* renamed from: f  reason: collision with root package name */
    public final UUID f47000f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f47001g;

    /* renamed from: h  reason: collision with root package name */
    public final byte f47002h;

    /* renamed from: i  reason: collision with root package name */
    public final m f47003i;

    public b(a aVar) {
        aVar.getClass();
        this.d = aVar;
        UUID uuid = e60.e.f26071a;
        uuid.getClass();
        this.e = uuid;
        UUID uuid2 = e.a.f26072a;
        uuid2.getClass();
        this.f47000f = uuid2;
        this.f47001g = aVar.getState();
        this.f47002h = (byte) 48;
        this.f47003i = m.WRITE;
    }

    @Override // k60.h
    public final UUID a() {
        return this.f47000f;
    }

    @Override // k60.h
    public final byte[] b() {
        return this.f47001g;
    }

    @Override // k60.h
    public final byte d() {
        return this.f47002h;
    }

    @Override // k60.h
    public final m e() {
        return this.f47003i;
    }

    @Override // k60.h
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.d == ((b) obj).d;
    }

    @Override // k60.h
    public final UUID f() {
        return this.e;
    }

    @Override // k60.h
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // k60.h
    public final String toString() {
        return "AppActiveStatusMessage(activeStatus=" + this.d + ")";
    }
}
