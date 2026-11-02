package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.bypass;

import com.dyson.mobile.android.connectionjourney.nonconnected.ownership.bypass.a;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import h30.f;
/* loaded from: classes2.dex */
public final class b implements a.c {

    /* renamed from: a  reason: collision with root package name */
    public final f f13655a;

    public b(f fVar) {
        this.f13655a = fVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.nonconnected.ownership.bypass.a.c
    public final a a(String str, MachineDescriptor machineDescriptor) {
        f fVar = this.f13655a;
        return new a(fVar.f37497a.get(), fVar.f37498b.get(), fVar.f37499c.get(), machineDescriptor, str, fVar.d.get(), fVar.e.get());
    }
}
