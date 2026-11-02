package com.dyson.mobile.android.connectionjourney.addbyserial;

import c42.g2;
import c42.r;
import c42.r1;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import hj.e;
import kotlin.Metadata;
import m9.u;
import nl0.h;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/b;", "Lm9/u;", "Lng0/b;", "cjDataObjectManager", "Lhj/e;", "trackingManager", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Lng0/b;Lhj/e;Lcom/dyson/mobile/android/machinetype/MachineCategory;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final e d;
    public final r1 e;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        b a(MachineCategory machineCategory, MachineDescriptor machineDescriptor);
    }

    public b(ng0.b bVar, e eVar, MachineCategory machineCategory, MachineDescriptor machineDescriptor) {
        ng0.a aVar;
        bVar.getClass();
        eVar.getClass();
        machineCategory.getClass();
        this.d = eVar;
        if ((machineDescriptor == null || (aVar = bVar.d(machineDescriptor.getMachineType(), machineDescriptor.getMachineVariant())) == null) && (aVar = (ng0.a) bVar.f57233a.get(machineCategory.getShortName())) == null) {
            aVar = bVar.f57234b;
        }
        h.c cVar = new h.c(aVar);
        x00.d dVar = x00.d.d;
        dVar.getClass();
        this.e = r.d(g2.a(new h.c(dVar.invoke(cVar.f57898a))));
    }
}
