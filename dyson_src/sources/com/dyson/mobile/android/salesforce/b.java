package com.dyson.mobile.android.salesforce;

import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.salesforce.a;
import kotlin.Metadata;
import mj.m;
import no0.g;
import yi0.f;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/salesforce/b;", "", "Lh80/c;", "dynamicContentDeeplinkParser", "Lyi0/f;", "machineManager", "<init>", "(Lh80/c;Lyi0/f;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final h80.c f16687a;

    /* renamed from: b  reason: collision with root package name */
    public final f f16688b;

    public b(h80.c cVar, f fVar) {
        cVar.getClass();
        fVar.getClass();
        this.f16687a = cVar;
        this.f16688b = fVar;
    }

    public final a a(String str) {
        str.getClass();
        g.f58807a.getClass();
        String a13 = g.a(str);
        DynamicContentDeepLink a14 = this.f16687a.a(str);
        boolean z13 = a14 instanceof DynamicContentDeepLink.f0;
        f fVar = this.f16688b;
        if (z13) {
            DynamicContentDeepLink.f0 f0Var = (DynamicContentDeepLink.f0) a14;
            String str2 = f0Var.f14034a;
            MachineDefinition b13 = fVar.b(new MachineSerial(str2));
            return b13 != null ? new a.l(b13, f0Var.f14035b) : new a.b(str2);
        } else if (a14 instanceof DynamicContentDeepLink.w) {
            String str3 = ((DynamicContentDeepLink.w) a14).f14064a;
            MachineDefinition b14 = fVar.b(new MachineSerial(str3));
            return b14 != null ? new a.c(b14) : new a.b(str3);
        } else if (a14 instanceof DynamicContentDeepLink.d0) {
            return a.d.f16668a;
        } else {
            if (a14 instanceof DynamicContentDeepLink.k0) {
                return new a.o(((DynamicContentDeepLink.k0) a14).f14043a);
            }
            if (a14 instanceof DynamicContentDeepLink.r) {
                DynamicContentDeepLink.r rVar = (DynamicContentDeepLink.r) a14;
                String str4 = rVar.f14057a;
                MachineDefinition b15 = fVar.b(new MachineSerial(str4));
                return b15 != null ? new a.j(b15, rVar.f14058b, rVar.f14059c) : new a.b(str4);
            } else if (a14 instanceof DynamicContentDeepLink.q) {
                DynamicContentDeepLink.q qVar = (DynamicContentDeepLink.q) a14;
                String str5 = qVar.f14055a;
                MachineDefinition b16 = fVar.b(new MachineSerial(str5));
                return b16 != null ? new a.j(b16, qVar.f14056b, null) : new a.b(str5);
            } else if (a14 instanceof DynamicContentDeepLink.i) {
                return new a.f(((DynamicContentDeepLink.i) a14).f14039a);
            } else {
                if (a14 instanceof DynamicContentDeepLink.m) {
                    String str6 = ((DynamicContentDeepLink.m) a14).f14046a;
                    MachineDefinition b17 = fVar.b(new MachineSerial(str6));
                    return b17 != null ? new a.h(b17) : new a.b(str6);
                } else if (a14 instanceof DynamicContentDeepLink.j) {
                    String str7 = ((DynamicContentDeepLink.j) a14).f14040a;
                    MachineDefinition b18 = fVar.b(new MachineSerial(str7));
                    return b18 != null ? new a.g(b18) : new a.b(str7);
                } else if (a14 instanceof DynamicContentDeepLink.o) {
                    String str8 = ((DynamicContentDeepLink.o) a14).f14051a;
                    MachineDefinition b19 = fVar.b(new MachineSerial(str8));
                    return b19 != null ? new a.i(b19) : new a.b(str8);
                } else if (a14 instanceof DynamicContentDeepLink.h0) {
                    return new a.n(((DynamicContentDeepLink.h0) a14).f14038a, lp0.a.FILTER, lp0.c.TRACKER_SUFFIX_DEEP_LINK, new ExternalLinkTracking("parts_and_accessories", m.a.DEEP_LINK, null, null, 12, null));
                } else {
                    if (a14 instanceof DynamicContentDeepLink.i0) {
                        return a.e.f16669a;
                    }
                    if (a14 instanceof DynamicContentDeepLink.j0) {
                        return new a.k(((DynamicContentDeepLink.j0) a14).f14041a, lp0.a.SPARE_AND_ACCESSORIES, lp0.c.TRACKER_SUFFIX_DEEP_LINK, new ExternalLinkTracking("parts_and_accessories", m.a.DEEP_LINK, null, null, 12, null));
                    }
                    if (a14 instanceof DynamicContentDeepLink.g0) {
                        return a.m.f16682a;
                    }
                    if (a13 != null) {
                        MachineDefinition b23 = fVar.b(new MachineSerial(a13));
                        return b23 != null ? new a.l(b23, null, 2, null) : new a.b(a13);
                    }
                    Logger.a("Failed to handle url: ".concat(str));
                    return a.C0598a.f16665a;
                }
            }
        }
    }
}
