package com.dyson.mobile.android.support.ui.contact.compose;

import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.support.ui.contact.compose.c;
import x81.n;
/* loaded from: classes3.dex */
public final class g implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final n f16895a;

    public g(n nVar) {
        this.f16895a = nVar;
    }

    @Override // com.dyson.mobile.android.support.ui.contact.compose.c.b
    public final c a(String str, MachineDescriptor machineDescriptor, String str2) {
        n nVar = this.f16895a;
        return new c(nVar.f87185a.get(), nVar.f87186b.get(), nVar.f87187c.get(), nVar.d.get(), nVar.e.get(), str, machineDescriptor, str2);
    }
}
