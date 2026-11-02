package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation;

import com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import i30.d;
/* loaded from: classes2.dex */
public final class c implements b.InterfaceC0436b {

    /* renamed from: a  reason: collision with root package name */
    public final d f13677a;

    public c(d dVar) {
        this.f13677a = dVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.b.InterfaceC0436b
    public final b a(String str, MachineDescriptor machineDescriptor) {
        d dVar = this.f13677a;
        return new b(dVar.f40625a.get(), dVar.f40626b.get(), str, machineDescriptor, dVar.f40627c.get());
    }
}
