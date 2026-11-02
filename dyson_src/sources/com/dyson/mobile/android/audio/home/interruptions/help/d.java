package com.dyson.mobile.android.audio.home.interruptions.help;

import androidx.lifecycle.w;
import com.dyson.mobile.android.audio.home.interruptions.help.a;
import com.dyson.mobile.android.audio.home.interruptions.help.c;
import ea.j;
import ea.m;
import hj.e;
import i12.a1;
import i12.f0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import m9.u;
import m9.v;
import mj.m;
import n71.i;
import nj.ke;
import nj.le;
import pl.f;
import pl.g;
import rf0.i0;
import x12.p0;
import y9.r;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/audio/home/interruptions/help/d;", "Lm9/u;", "Lhj/e;", "trackingManager", "Lpl/g;", "viewStateFactory", "Landroidx/lifecycle/w;", "savedStateHandle", "<init>", "(Lhj/e;Lpl/g;Landroidx/lifecycle/w;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends u {
    public final hj.e d;
    public final pl.a e;

    /* renamed from: f  reason: collision with root package name */
    public final f f12539f;

    /* renamed from: g  reason: collision with root package name */
    public final b42.c f12540g;

    /* renamed from: h  reason: collision with root package name */
    public final c42.e f12541h;

    /* renamed from: i  reason: collision with root package name */
    public final b42.c f12542i;

    /* renamed from: j  reason: collision with root package name */
    public final c42.e f12543j;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        d a(w wVar);
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12544a;

        static {
            int[] iArr = new int[AudioHelpType.values().length];
            try {
                iArr[AudioHelpType.RECONNECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioHelpType.RESTART.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12544a = iArr;
        }
    }

    public d(hj.e eVar, g gVar, w wVar) {
        f fVar;
        eVar.getClass();
        gVar.getClass();
        wVar.getClass();
        this.d = eVar;
        f0 f0Var = f0.d;
        f0Var.getClass();
        e22.d b13 = p0.f86717a.b(pl.a.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        t42.b O = a1.O(b13);
        Iterator it = m.c(O, f0Var).iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            linkedHashMap.put(rVar.f89486a, rVar.f89487b.f89546a);
        }
        pl.a aVar = (pl.a) O.b(new j(wVar, linkedHashMap));
        this.e = aVar;
        AudioHelpType audioHelpType = aVar.f64419a;
        ek.c cVar = gVar.f64428a;
        pf0.c cVar2 = gVar.f64429b;
        audioHelpType.getClass();
        int i13 = g.a.f64430a[audioHelpType.ordinal()];
        if (i13 == 1) {
            fVar = new f(cVar2.d(rf0.r.f72573u), cVar.c(ek.e.HOW_TO_SWITCH_ON), cVar2.d(rf0.r.f72567r), cVar2.d(rf0.r.f72569s), cVar2.d(i0.I8), cVar2.d(rf0.r.f72559n));
        } else if (i13 != 2) {
            ma.e.o();
            throw null;
        } else {
            fVar = new f(cVar2.d(rf0.r.f72571t), cVar.c(ek.e.HOW_TO_RESTART), cVar2.d(rf0.r.f72563p), cVar2.d(rf0.r.f72565q), cVar2.d(i0.I8), cVar2.d(i0.f71870u5));
        }
        this.f12539f = fVar;
        b42.c b14 = b42.m.b(0, null, null, 7);
        this.f12540g = b14;
        this.f12541h = c42.r.B(b14);
        b42.c b15 = b42.m.b(0, null, null, 7);
        this.f12542i = b15;
        this.f12543j = c42.r.B(b15);
    }

    public final void S(com.dyson.mobile.android.audio.home.interruptions.help.a aVar) {
        aVar.getClass();
        boolean equals = aVar.equals(a.c.f12536a);
        pl.a aVar2 = this.e;
        if (equals) {
            int i13 = b.f12544a[aVar2.f64419a.ordinal()];
            hj.e eVar = this.d;
            if (i13 == 1) {
                int i14 = le.f57586a;
                ij.b bVar = new ij.b("wearable_ec.help.show_me_turn_on_machine", null, 2, null);
                e.a aVar3 = hj.e.f38312g;
                eVar.h(bVar, null);
                return;
            } else if (i13 != 2) {
                ma.e.o();
                return;
            } else {
                int i15 = ke.f57569a;
                ij.b bVar2 = new ij.b("wearable_ec.help.show_me_restart_machine", null, 2, null);
                e.a aVar4 = hj.e.f38312g;
                eVar.h(bVar2, null);
                return;
            }
        }
        boolean equals2 = aVar.equals(a.C0350a.f12534a);
        b42.c cVar = this.f12540g;
        if (equals2) {
            af1.g.a(cVar, v.a(this), c.a.f12537a);
        } else if (!aVar.equals(a.b.f12535a)) {
            ma.e.o();
        } else {
            int i16 = b.f12544a[aVar2.f64419a.ordinal()];
            if (i16 == 1) {
                af1.g.a(cVar, v.a(this), c.b.f12538a);
            } else if (i16 != 2) {
                ma.e.o();
            } else {
                af1.g.a(this.f12542i, v.a(this), new i(m.a.MACHINE_HOME));
            }
        }
    }
}
