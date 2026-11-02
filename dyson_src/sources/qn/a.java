package qn;

import java.util.UUID;
import k60.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqn/a;", "Lx50/g0;", "", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements g0<Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final d22.d f67229a;

    static {
        new C2024a(null);
        f67229a = new d22.d(0.0d, 1.0d);
    }

    @Override // x50.g0
    public final Float a(h hVar) {
        hVar.getClass();
        UUID a13 = hVar.a();
        on.a.f60555a.getClass();
        if (!r.c(a13, on.a.f60563k) || hVar.b().length != 2) {
            hVar = null;
        }
        if (hVar != null) {
            float c13 = in0.c.c(hVar.b()) / 10000.0f;
            Float valueOf = Float.valueOf(c13);
            d22.d dVar = f67229a;
            dVar.getClass();
            if (dVar.l(Double.valueOf(c13))) {
                return valueOf;
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lqn/a$a;", "", "<init>", "()V", "", "BATTERY_CHARGE_LENGTH", "I", "BATTERY_CHARGE_MAX_VALUE", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: qn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C2024a {
        public /* synthetic */ C2024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2024a() {
        }
    }
}
