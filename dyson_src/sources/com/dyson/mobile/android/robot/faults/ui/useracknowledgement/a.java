package com.dyson.mobile.android.robot.faults.ui.useracknowledgement;

import com.dyson.mobile.android.robot.faults.RobotFaultResolutionStep;
import com.dyson.mobile.android.robot.traits.faults.RobotFault;
import com.dyson.mobile.android.support.common.Step;
import i12.e0;
import i22.n;
import java.util.List;
import kotlin.Metadata;
import m9.u;
import sv0.c;
import sv0.d;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/faults/ui/useracknowledgement/a;", "Lm9/u;", "Lsv0/d;", "robotFaultContentProvider", "Lcom/dyson/mobile/android/robot/traits/faults/RobotFault;", "robotFault", "<init>", "(Lsv0/d;Lcom/dyson/mobile/android/robot/traits/faults/RobotFault;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {
    public final RobotFault d;
    public final List<Step> e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16050f;

    @wy1.a
    /* renamed from: com.dyson.mobile.android.robot.faults.ui.useracknowledgement.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0550a {
        a a(RobotFault robotFault);
    }

    public a(d dVar, RobotFault robotFault) {
        List<RobotFaultResolutionStep> list;
        dVar.getClass();
        robotFault.getClass();
        this.d = robotFault;
        c b13 = dVar.b(robotFault);
        this.e = (b13 == null || (list = b13.f77053c) == null) ? e0.d : n.Q(list);
        this.f16050f = b13 != null ? b13.f77052b.c() : null;
    }
}
