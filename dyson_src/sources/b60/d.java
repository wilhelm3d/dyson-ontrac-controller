package b60;

import java.util.UUID;
/* loaded from: classes2.dex */
public class d extends in0.b {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f7104b;

    /* renamed from: c  reason: collision with root package name */
    public final UUID f7105c;

    public d(UUID uuid, UUID uuid2) {
        this.f7104b = uuid;
        this.f7105c = uuid2;
    }

    @Override // in0.b
    public final UUID a() {
        return this.f7105c;
    }

    @Override // in0.b
    public final byte[] b() {
        return new byte[0];
    }

    @Override // in0.b
    public final byte c() {
        return (byte) 0;
    }

    @Override // in0.b
    public final int d() {
        return 4;
    }

    @Override // in0.b
    public final UUID e() {
        return this.f7104b;
    }
}
