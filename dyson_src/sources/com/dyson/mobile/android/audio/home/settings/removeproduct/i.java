package com.dyson.mobile.android.audio.home.settings.removeproduct;

import b42.m;
import c42.f2;
import c42.g2;
import c42.r;
import c42.r1;
import com.dyson.mobile.android.audio.home.settings.removeproduct.b;
import com.dyson.mobile.android.audio.home.settings.removeproduct.c;
import com.dyson.mobile.android.audio.home.settings.removeproduct.d;
import com.dyson.mobile.android.audio.home.settings.removeproduct.g;
import hj.e;
import kotlin.Metadata;
import m9.u;
import m9.v;
import nj.c1;
import nj.ee;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/audio/home/settings/removeproduct/i;", "Lm9/u;", "Lxl/i;", "removeProductUseCase", "Lhj/e;", "trackingManager", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/e;", "removeProductScreenAlertFactory", "Lcom/dyson/mobile/android/audio/home/settings/removeproduct/a;", "removeProductAnalyticsScreenFactory", "<init>", "(Lxl/i;Lhj/e;Lcom/dyson/mobile/android/audio/home/settings/removeproduct/e;Lcom/dyson/mobile/android/audio/home/settings/removeproduct/a;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class i extends u {
    public final xl.i d;
    public final hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public final e f12588f;

    /* renamed from: g  reason: collision with root package name */
    public final a f12589g;

    /* renamed from: h  reason: collision with root package name */
    public final f2 f12590h;

    /* renamed from: i  reason: collision with root package name */
    public final r1 f12591i;

    /* renamed from: j  reason: collision with root package name */
    public final b42.c f12592j;

    /* renamed from: k  reason: collision with root package name */
    public final c42.e f12593k;

    /* renamed from: l  reason: collision with root package name */
    public final f2 f12594l;

    /* renamed from: m  reason: collision with root package name */
    public final r1 f12595m;

    public i(xl.i iVar, hj.e eVar, e eVar2, a aVar) {
        iVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        aVar.getClass();
        this.d = iVar;
        this.e = eVar;
        this.f12588f = eVar2;
        this.f12589g = aVar;
        f2 a13 = g2.a(d.b.f12578a);
        this.f12590h = a13;
        this.f12591i = r.d(a13);
        b42.c b13 = m.b(0, null, null, 7);
        this.f12592j = b13;
        this.f12593k = r.B(b13);
        f2 a14 = g2.a(Boolean.FALSE);
        this.f12594l = a14;
        this.f12595m = r.d(a14);
    }

    public final void S(b bVar) {
        Object value;
        f2 f2Var;
        Object value2;
        Object value3;
        Object value4;
        ij.b bVar2;
        bVar.getClass();
        if (bVar instanceof b.h) {
            c cVar = ((b.h) bVar).f12572a;
            this.f12589g.getClass();
            if (cVar.equals(c.b.INSTANCE)) {
                bVar2 = c1.a();
            } else if (!cVar.equals(c.a.INSTANCE)) {
                ma.e.o();
                return;
            } else {
                int i13 = ee.f57470a;
                bVar2 = new ij.b("wearable_ec.help.how_to_clear_data", null, 2, null);
            }
            e.a aVar = hj.e.f38312g;
            this.e.h(bVar2, null);
            return;
        }
        boolean equals = bVar.equals(b.C0351b.f12566a);
        b42.c cVar2 = this.f12592j;
        if (equals) {
            aq.f.b(cVar2, v.a(this), g.b.f12586a);
            return;
        }
        boolean equals2 = bVar.equals(b.d.f12568a);
        f2 f2Var2 = this.f12590h;
        if (equals2) {
            do {
                value4 = f2Var2.getValue();
                d dVar = (d) value4;
            } while (!f2Var2.f(value4, this.f12588f.f12583a));
        } else if (bVar.equals(b.e.f12569a)) {
            do {
                value3 = f2Var2.getValue();
                d dVar2 = (d) value3;
            } while (!f2Var2.f(value3, d.b.f12578a));
        } else if (bVar.equals(b.g.f12571a) || bVar.equals(b.f.f12570a)) {
            do {
                value = f2Var2.getValue();
                d dVar3 = (d) value;
            } while (!f2Var2.f(value, d.b.f12578a));
            g0.r(v.a(this), null, null, new h(this, null), 3);
        } else if (bVar.equals(b.c.f12567a)) {
            aq.f.b(cVar2, v.a(this), g.a.f12585a);
        } else if (!bVar.equals(b.a.f12565a)) {
            ma.e.o();
        } else {
            do {
                f2Var = this.f12594l;
                value2 = f2Var.getValue();
                ((Boolean) value2).getClass();
            } while (!f2Var.f(value2, Boolean.FALSE));
        }
    }
}
