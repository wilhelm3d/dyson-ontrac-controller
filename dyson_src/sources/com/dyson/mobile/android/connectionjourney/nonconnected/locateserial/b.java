package com.dyson.mobile.android.connectionjourney.nonconnected.locateserial;

import c42.g2;
import c42.r;
import c42.r1;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import e30.g;
import e30.h;
import e30.k;
import h12.f0;
import hj.e;
import i12.q;
import im1.zb;
import kotlin.Metadata;
import m9.u;
import ng0.d;
import w00.j;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/locateserial/b;", "Lm9/u;", "Lng0/b;", "cjDataObjectManager", "Lhj/e;", "trackingManager", "Lw00/j;", "connectionJourneyOptions", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Lng0/b;Lhj/e;Lw00/j;Lcom/dyson/mobile/android/machinetype/MachineCategory;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final e d;
    public final r1 e;

    /* renamed from: f  reason: collision with root package name */
    public final xf1.a<f0> f13627f;

    /* renamed from: g  reason: collision with root package name */
    public final xf1.a f13628g;

    /* renamed from: h  reason: collision with root package name */
    public final xf1.a<f0> f13629h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a f13630i;

    /* renamed from: j  reason: collision with root package name */
    public final xf1.a<f0> f13631j;

    /* renamed from: k  reason: collision with root package name */
    public final xf1.a f13632k;

    /* renamed from: l  reason: collision with root package name */
    public final xf1.a<f0> f13633l;

    /* renamed from: m  reason: collision with root package name */
    public final xf1.a f13634m;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        b a(MachineCategory machineCategory, MachineDescriptor machineDescriptor);
    }

    public b(ng0.b bVar, e eVar, j jVar, MachineCategory machineCategory, MachineDescriptor machineDescriptor) {
        ng0.a aVar;
        bVar.getClass();
        eVar.getClass();
        jVar.getClass();
        machineCategory.getClass();
        this.d = eVar;
        if (machineDescriptor != null) {
            aVar = bVar.d(machineDescriptor.getMachineType(), machineDescriptor.getMachineVariant());
        } else {
            ng0.a aVar2 = (ng0.a) bVar.f57233a.get(machineCategory.getShortName());
            aVar = aVar2 == null ? bVar.f57234b : aVar2;
        }
        d dVar = d.whereToFindSerial_image;
        int i13 = ng0.a.f57232a;
        int a13 = aVar.a(dVar, 0);
        LocalisationKey c13 = ng0.a.c(aVar, d.whereToFindSerial_description);
        LocalisationKey e = aVar.e(d.locateSerialCarousel_button);
        this.e = r.d(g2.a(new k(a13, c13, e != null ? new g(e, ng0.a.c(aVar, d.locateSerialCarousel_title), q.v(new h[]{zb.s(aVar, d.locateSerialCarousel_1_bottomText, d.locateSerialCarousel_1_image, d.locateSerialCarousel_1_title), zb.s(aVar, d.locateSerialCarousel_2_bottomText, d.locateSerialCarousel_2_image, d.locateSerialCarousel_2_title), zb.s(aVar, d.locateSerialCarousel_3_bottomText, d.locateSerialCarousel_3_image, d.locateSerialCarousel_3_title), zb.s(aVar, d.locateSerialCarousel_4_bottomText, d.locateSerialCarousel_4_image, d.locateSerialCarousel_4_title), zb.s(aVar, d.locateSerialCarousel_5_bottomText, d.locateSerialCarousel_5_image, d.locateSerialCarousel_5_title), zb.s(aVar, d.locateSerialCarousel_6_bottomText, d.locateSerialCarousel_6_image, d.locateSerialCarousel_6_title)})) : null, false, 8, null)));
        xf1.a<f0> aVar3 = new xf1.a<>();
        this.f13627f = aVar3;
        this.f13628g = aVar3;
        xf1.a<f0> aVar4 = new xf1.a<>();
        this.f13629h = aVar4;
        this.f13630i = aVar4;
        xf1.a<f0> aVar5 = new xf1.a<>();
        this.f13631j = aVar5;
        this.f13632k = aVar5;
        xf1.a<f0> aVar6 = new xf1.a<>();
        this.f13633l = aVar6;
        this.f13634m = aVar6;
    }
}
