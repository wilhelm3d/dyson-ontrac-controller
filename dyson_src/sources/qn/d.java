package qn;

import fp.e;
import java.util.UUID;
import k60.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import x50.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lqn/d;", "Lx50/g0;", "Lfp/e;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d implements g0<e> {
    static {
        new a(null);
    }

    @Override // x50.g0
    public final e a(h hVar) {
        hVar.getClass();
        UUID a13 = hVar.a();
        on.a.f60555a.getClass();
        if (!r.c(a13, on.a.f60562j) || hVar.b().length != 1) {
            hVar = null;
        }
        if (hVar != null) {
            byte b13 = hVar.b()[0];
            if (b13 == 0) {
                return e.NOT_CHARGING;
            }
            if (b13 == 1) {
                return e.PRE_CHARGING;
            }
            if (b13 == 2) {
                return e.FAST_CHARGING;
            }
            if (b13 == 3) {
                return e.TERMINATION;
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqn/d$a;", "", "<init>", "()V", "", "CHARGING_STATE_LENGTH", "I", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
