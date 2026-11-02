package com.dyson.mobile.android.machine.machinecontent.expertcontent.collection;

import com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a;
import com.dyson.mobile.android.machinetype.MachineSerial;
import li0.g;
/* loaded from: classes3.dex */
public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final g f15169a;

    public b(g gVar) {
        this.f15169a = gVar;
    }

    @Override // com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a.b
    public final a a(MachineSerial machineSerial, String str) {
        g gVar = this.f15169a;
        return new a(gVar.f52131a.get(), gVar.f52132b.get(), gVar.f52133c.get(), machineSerial, str);
    }
}
