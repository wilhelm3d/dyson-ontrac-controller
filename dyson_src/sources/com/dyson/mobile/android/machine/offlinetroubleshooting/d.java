package com.dyson.mobile.android.machine.offlinetroubleshooting;

import androidx.lifecycle.LifecycleOwner;
import c42.f2;
import c42.g2;
import c42.r;
import c42.r1;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import hj.e;
import kotlin.Metadata;
import m9.u;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB-\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/offlinetroubleshooting/d;", "Lm9/u;", "Lm9/c;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingData;", "data", "Lhj/e;", "trackingManager", "Lej0/c;", "offlineTroubleShootingProvider", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingData;Lhj/e;Lej0/c;)V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u implements m9.c {
    public final hj.e d;
    public final ej0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final f2 f15294f;

    /* renamed from: g  reason: collision with root package name */
    public final r1 f15295g;

    /* renamed from: h  reason: collision with root package name */
    public final MachineDescriptor f15296h;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        d a(MachineDefinition machineDefinition, OfflineTroubleshootingData offlineTroubleshootingData);
    }

    public d(MachineDefinition machineDefinition, OfflineTroubleshootingData offlineTroubleshootingData, hj.e eVar, ej0.c cVar) {
        machineDefinition.getClass();
        offlineTroubleshootingData.getClass();
        eVar.getClass();
        cVar.getClass();
        this.d = eVar;
        this.e = cVar;
        f2 a13 = g2.a(new b(offlineTroubleshootingData, null, 2, null));
        this.f15294f = a13;
        this.f15295g = r.d(a13);
        this.f15296h = machineDefinition.f15569q;
    }

    @Override // m9.c
    public final void onResume(LifecycleOwner lifecycleOwner) {
        int i13 = nj.d.f57440a;
        ij.b bVar = new ij.b("common.faults_and_alerts.offline_troubleshooting", null, 2, null);
        e.a aVar = hj.e.f38312g;
        this.d.h(bVar, null);
    }
}
