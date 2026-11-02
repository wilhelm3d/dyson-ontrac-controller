package k60;

import java.util.UUID;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk60/c;", "Lin0/b;", "Lk60/h;", "gattMessage", "<init>", "(Lk60/h;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends in0.b {

    /* renamed from: b  reason: collision with root package name */
    public final h f47004b;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47005a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.READ.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.SUBSCRIBE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.UNSUBSCRIBE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f47005a = iArr;
        }
    }

    public c(h hVar) {
        hVar.getClass();
        this.f47004b = hVar;
    }

    @Override // in0.b
    public final UUID a() {
        return this.f47004b.a();
    }

    @Override // in0.b
    public final byte[] b() {
        return this.f47004b.b();
    }

    @Override // in0.b
    public final byte c() {
        return this.f47004b.d();
    }

    @Override // in0.b
    public final int d() {
        int i13 = a.f47005a[this.f47004b.e().ordinal()];
        int i14 = 1;
        if (i13 != 1) {
            i14 = 2;
            if (i13 != 2) {
                i14 = 3;
                if (i13 != 3) {
                    i14 = 4;
                    if (i13 != 4) {
                        if (i13 == 5) {
                            return 5;
                        }
                        ma.e.o();
                        return 0;
                    }
                }
            }
        }
        return i14;
    }

    @Override // in0.b
    public final UUID e() {
        return this.f47004b.f();
    }
}
