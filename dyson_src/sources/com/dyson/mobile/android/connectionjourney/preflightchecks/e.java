package com.dyson.mobile.android.connectionjourney.preflightchecks;

import com.dyson.mobile.android.connectionjourney.preflightchecks.d;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import p40.t;
/* loaded from: classes2.dex */
public final class e implements d.c {

    /* renamed from: a  reason: collision with root package name */
    public final t f13888a;

    public e(t tVar) {
        this.f13888a = tVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.preflightchecks.d.c
    public final d a(MachineDescriptor machineDescriptor, MachineSerial machineSerial) {
        t tVar = this.f13888a;
        return new d(tVar.f62879a.get(), tVar.f62880b.get(), tVar.f62881c.get(), tVar.d.get(), machineDescriptor, machineSerial);
    }
}
