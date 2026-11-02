package cn;

import cn.b;
import h12.f0;
import java.util.Optional;
import o60.a;
import u2.d0;
import va0.c;
import va0.p;
import w12.q;
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements q {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i13) {
        this.d = i13;
        this.e = obj;
    }

    @Override // w12.q
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b.a c0311b;
        int i13 = this.d;
        Object obj7 = this.e;
        switch (i13) {
            case 0:
                b bVar = (b) obj7;
                o60.a aVar = (o60.a) obj;
                l lVar = (l) obj2;
                tp.c cVar = (tp.c) obj3;
                boolean booleanValue = ((Boolean) obj4).booleanValue();
                boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                fp.b bVar2 = (fp.b) obj6;
                e22.m<Object>[] mVarArr = b.f11753w;
                aVar.getClass();
                lVar.getClass();
                cVar.getClass();
                ek.c cVar2 = bVar.d;
                at0.l lVar2 = lVar == l.OFF ? at0.l.SELECTED : cVar == tp.c.ON ? at0.l.DISABLED : at0.l.DESELECTED;
                aq.c.f5338a.getClass();
                boolean a13 = aq.c.a(bVar2);
                if (!aVar.equals(a.C1796a.f59684a) || booleanValue || booleanValue2 || !a13) {
                    c0311b = new b.a.C0311b(cVar2.c(ek.e.ANC_NOT_CONNECTED));
                } else {
                    int i14 = b.C0312b.f11785a[lVar.ordinal()];
                    if (i14 == 1) {
                        c0311b = new b.a.e(cVar2.c(ek.e.ANC_ON_CALL));
                    } else if (i14 == 2) {
                        c0311b = new b.a.c(cVar2.c(ek.e.ANC_ISOLATION), lVar2);
                    } else if (i14 == 3) {
                        c0311b = new b.a.C0310a(cVar2.c(ek.e.ANC_CONVERSATION));
                    } else if (i14 == 4) {
                        c0311b = new b.a.f(cVar2.c(ek.e.ANC_TRANSPARENCY), lVar2);
                    } else if (i14 != 5) {
                        ma.e.o();
                        return null;
                    } else {
                        c0311b = new b.a.d(cVar2.c(ek.e.ANC_OFF), cVar2.a(ek.f.SOUND_CONTROL_NOISE_CANCELLATION_OFF_MODE_DESCRIPTION));
                    }
                }
                bVar.f11769u.m(c0311b);
                return f0.f36844a;
            case 1:
                ka0.g gVar = (ka0.g) obj7;
                Optional optional = (Optional) obj;
                hd0.m mVar = (hd0.m) obj2;
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                ld0.g gVar2 = (ld0.g) obj4;
                Boolean bool = (Boolean) obj5;
                bool.getClass();
                int intValue = ((Integer) obj6).intValue();
                d22.k kVar = ka0.g.B;
                optional.getClass();
                gVar2.getClass();
                x90.i iVar = (x90.i) optional.orElse(null);
                gVar.f47202t = iVar;
                return gVar.t(booleanValue3, gVar2, gVar.f47195m != null ? bool : null, intValue, iVar != null, mVar.f38141a == hd0.b.TANK_EMPTY);
            default:
                p pVar = (p) obj7;
                Optional<x90.i> optional2 = (Optional) obj2;
                Boolean bool2 = (Boolean) obj3;
                ld0.g gVar3 = (ld0.g) obj4;
                Boolean bool3 = (Boolean) obj5;
                Integer num = (Integer) obj6;
                d22.k kVar2 = p.f83856m;
                bool2.getClass();
                boolean booleanValue4 = bool2.booleanValue();
                gVar3.getClass();
                bool3.getClass();
                boolean booleanValue5 = bool3.booleanValue();
                int intValue2 = num.intValue();
                optional2.getClass();
                pVar.f83864j = pVar.h(booleanValue4, gVar3, booleanValue5, intValue2, optional2);
                if (((Boolean) obj).booleanValue()) {
                    c.C2479c c2479c = pVar.g() ? new c.C2479c(kVar2.d) : null;
                    return c2479c != null ? c2479c : new c.b(kVar2.d, null, false, false, false, false, 62, null);
                } else if (pVar.g()) {
                    return new c.e(kVar2.d);
                } else {
                    if (d0.n(pVar.f83864j.f83869f, x90.i.TANK_EMPTY)) {
                        return new c.h(kVar2.d, false, 2, null);
                    }
                    if (bool2.booleanValue() && gVar3 != ld0.g.OFF && p.f83855l.o(num.intValue())) {
                        if (pVar.f83859c == null || !bool3.booleanValue()) {
                            p.b bVar3 = pVar.f83864j;
                            return new c.g(bVar3.d, bVar3.e, false, false, 12, null);
                        }
                        return new c.a(20, pVar.f83864j.e, true);
                    }
                    return new c.f(kVar2.d);
                }
        }
    }
}
