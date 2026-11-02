package c60;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes2.dex */
public class a extends in0.b {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f10431b;

    /* renamed from: c  reason: collision with root package name */
    public final UUID f10432c;
    public final byte d;
    public final byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10433f;

    /* renamed from: c60.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0281a {

        /* renamed from: a  reason: collision with root package name */
        public UUID f10434a;

        /* renamed from: b  reason: collision with root package name */
        public UUID f10435b;

        /* renamed from: c  reason: collision with root package name */
        public byte f10436c;
        public byte[] d;
        public int e;

        public final a a() {
            return new a(this.f10434a, this.f10435b, this.f10436c, this.d, this.e, 0);
        }
    }

    private a(UUID uuid, UUID uuid2, byte b13, byte[] bArr, int i13) {
        this.f10431b = uuid;
        this.f10432c = uuid2;
        this.d = b13;
        this.e = bArr;
        this.f10433f = i13;
    }

    @Override // in0.b
    public final UUID a() {
        return this.f10432c;
    }

    @Override // in0.b
    public final byte[] b() {
        return this.e;
    }

    @Override // in0.b
    public final byte c() {
        return this.d;
    }

    @Override // in0.b
    public final int d() {
        return this.f10433f;
    }

    @Override // in0.b
    public final UUID e() {
        return this.f10431b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.d == aVar.d && this.f10433f == aVar.f10433f && Objects.equals(this.f10431b, aVar.f10431b) && Objects.equals(this.f10432c, aVar.f10432c) && Objects.deepEquals(this.e, aVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10431b, this.f10432c, Byte.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(this.f10433f));
    }

    public /* synthetic */ a(UUID uuid, UUID uuid2, byte b13, byte[] bArr, int i13, int i14) {
        this(uuid, uuid2, b13, bArr, i13);
    }
}
