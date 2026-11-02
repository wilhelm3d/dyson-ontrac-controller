package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate;

import com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import j30.f;
/* loaded from: classes2.dex */
public final class b implements a.c {

    /* renamed from: a  reason: collision with root package name */
    public final f f13705a;

    public b(f fVar) {
        this.f13705a = fVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a.c
    public final a a(String str, MachineDescriptor machineDescriptor) {
        f fVar = this.f13705a;
        return new a(fVar.f43857a.get(), fVar.f43858b.get(), fVar.f43859c.get(), fVar.d.get(), fVar.e.get(), str, machineDescriptor, fVar.f43860f.get(), fVar.f43861g.get());
    }
}
