package com.dyson.mobile.android.connectionjourney.ownership;

import android.annotation.SuppressLint;
import com.dyson.mobile.android.connectionjourney.ownership.g;
import com.dyson.mobile.android.connectionjourney.ownership.i;
import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import mj.a;
import mj.b;
import mj.c;
import rf0.i0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/ownership/h;", "", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"FactoryName"})
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final g.b f13795a;

    /* renamed from: b  reason: collision with root package name */
    public final g.b f13796b;

    public h(pf0.c cVar) {
        cVar.getClass();
        String d = cVar.d(i0.N9);
        String d13 = cVar.d(rf0.d.S);
        String d14 = cVar.d(i0.K8);
        LocalisationKey localisationKey = i0.E8;
        this.f13795a = new g.b(d, d13, cVar.d(localisationKey), d14, i.h.f13804a, i.g.f13803a, c.a.OWNERSHIP_EXIT_CONFIRM, a.b.OWNERSHIP_EXIT_CONFIRM, b.a.OWNERSHIP_EXIT_CONFIRM);
        String d15 = cVar.d(rf0.d.I);
        String d16 = cVar.d(rf0.d.J);
        String d17 = cVar.d(rf0.d.K);
        this.f13796b = new g.b(d15, d16, cVar.d(localisationKey), d17, i.n.f13810a, i.l.f13808a, c.a.OWNERSHIP_TAKE_CONFIRM, a.b.OWNERSHIP_TAKE_CONFIRM, b.a.OWNERSHIP_TAKE_CONFIRM);
    }
}
