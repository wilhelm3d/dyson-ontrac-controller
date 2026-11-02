package com.dyson.mobile.android.machine.ui.permissions;

import com.dyson.mobile.android.machine.ui.permissions.a;
import em0.i;
/* loaded from: classes3.dex */
public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final i f15396a;

    public b(i iVar) {
        this.f15396a = iVar;
    }

    @Override // com.dyson.mobile.android.machine.ui.permissions.a.b
    public final a create() {
        i iVar = this.f15396a;
        return new a(iVar.f27359a.get(), iVar.f27360b.get(), iVar.f27361c.get(), iVar.d.get());
    }
}
