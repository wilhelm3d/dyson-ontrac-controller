package com.dyson.mobile.android.machine.offlinetroubleshooting;

import com.dyson.mobile.android.machine.offlinetroubleshooting.d;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import ej0.k;
/* loaded from: classes3.dex */
public final class e implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final k f15297a;

    public e(k kVar) {
        this.f15297a = kVar;
    }

    @Override // com.dyson.mobile.android.machine.offlinetroubleshooting.d.a
    public final d a(MachineDefinition machineDefinition, OfflineTroubleshootingData offlineTroubleshootingData) {
        k kVar = this.f15297a;
        return new d(machineDefinition, offlineTroubleshootingData, kVar.f26964a.get(), kVar.f26965b.get());
    }
}
