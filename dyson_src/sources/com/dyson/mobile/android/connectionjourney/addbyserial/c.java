package com.dyson.mobile.android.connectionjourney.addbyserial;

import com.dyson.mobile.android.connectionjourney.addbyserial.b;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import x00.f;
/* loaded from: classes2.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final f f13264a;

    public c(f fVar) {
        this.f13264a = fVar;
    }

    @Override // com.dyson.mobile.android.connectionjourney.addbyserial.b.a
    public final b a(MachineCategory machineCategory, MachineDescriptor machineDescriptor) {
        f fVar = this.f13264a;
        return new b(fVar.f86629a.get(), fVar.f86630b.get(), machineCategory, machineDescriptor);
    }
}
