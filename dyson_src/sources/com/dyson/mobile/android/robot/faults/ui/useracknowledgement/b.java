package com.dyson.mobile.android.robot.faults.ui.useracknowledgement;

import com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a;
import com.dyson.mobile.android.robot.traits.faults.RobotFault;
import vv0.l;
/* loaded from: classes3.dex */
public final class b implements a.InterfaceC0550a {

    /* renamed from: a  reason: collision with root package name */
    public final l f16051a;

    public b(l lVar) {
        this.f16051a = lVar;
    }

    @Override // com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a.InterfaceC0550a
    public final a a(RobotFault robotFault) {
        return new a(this.f16051a.f84922a.get(), robotFault);
    }
}
