package com.dyson.mobile.android.connectionjourney.nonconnected.locateserial;

import com.dyson.mobile.android.connectionjourney.nonconnected.locateserial.b;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import e30.f;
/* loaded from: classes2.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final f f13635a;

    public c(f fVar) {
        this.f13635a = fVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.nonconnected.locateserial.b.a
    public final b a(MachineCategory machineCategory, MachineDescriptor machineDescriptor) {
        f fVar = this.f13635a;
        return new b(fVar.f25806a.get(), fVar.f25807b.get(), fVar.f25808c.get(), machineCategory, machineDescriptor);
    }
}
