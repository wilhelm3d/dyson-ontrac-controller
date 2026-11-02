package b60;

import java.util.Arrays;
import java.util.UUID;
/* loaded from: classes2.dex */
public class a extends in0.b {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f7098b;

    /* renamed from: c  reason: collision with root package name */
    public final byte f7099c;
    public final byte[] d;

    public a(UUID uuid, byte b13, byte[] bArr) {
        this.f7098b = uuid;
        this.f7099c = b13;
        this.d = bArr;
    }

    @Override // in0.b
    public final UUID a() {
        return this.f7098b;
    }

    @Override // in0.b
    public final byte[] b() {
        return this.d;
    }

    @Override // in0.b
    public final byte c() {
        return this.f7099c;
    }

    @Override // in0.b
    public final int d() {
        return 5;
    }

    @Override // in0.b
    public final UUID e() {
        return null;
    }

    public final String toString() {
        return "GattNotificationMessage{mCharacteristicUUID=" + this.f7098b + ", mMessageTypeId=" + ((int) this.f7099c) + ", mMessage=" + Arrays.toString(this.d) + '}';
    }
}
