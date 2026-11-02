package com.dyson.mobile.android.robot.faults.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import bt0.d;
import bv0.e8;
import bv0.j2;
import bv0.s0;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.robot.faults.RobotFaultResolutionStep;
import com.dyson.mobile.android.robot.traits.faults.FaultCode;
import com.dyson.mobile.android.robot.traits.faults.RobotFault;
import com.dyson.mobile.android.support.common.Step;
import en0.b;
import h12.p;
import i12.u;
import iu0.z;
import java.util.ArrayList;
import java.util.List;
import k7.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sv0.e;
import uf0.g;
import uv0.a;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/faults/ui/FaultDetailActivity;", "Lbt0/d;", "Luv0/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FaultDetailActivity extends d implements uv0.b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f16032q = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public tv0.b f16033l;

    /* renamed from: m  reason: collision with root package name */
    public z f16034m;

    /* renamed from: n  reason: collision with root package name */
    public g f16035n;

    /* renamed from: o  reason: collision with root package name */
    public String f16036o;

    /* renamed from: p  reason: collision with root package name */
    public final b f16037p = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/faults/ui/FaultDetailActivity$b", "Ltv0/a;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements tv0.a {
        public b() {
        }

        @Override // tv0.a
        public final void a() {
            FaultDetailActivity.this.finish();
        }

        @Override // tv0.a
        public final void b(String str, String str2, String str3) {
            str2.getClass();
            a.C2423a c2423a = uv0.a.e;
            FaultDetailActivity faultDetailActivity = FaultDetailActivity.this;
            String str4 = faultDetailActivity.f16036o;
            if (str4 == null) {
                r.i("coordinatorId");
                throw null;
            }
            c2423a.getClass();
            uv0.a aVar = new uv0.a();
            aVar.setArguments(c.a(new p("faultCode", str), new p("faultDescription", str2), new p("machineSerial", str3), new p("coordinatorId", str4)));
            faultDetailActivity.e1(aVar);
        }

        @Override // tv0.a
        public final void c(ArrayList arrayList) {
            b.a aVar = en0.b.d;
            FaultDetailActivity faultDetailActivity = FaultDetailActivity.this;
            tv0.b bVar = faultDetailActivity.f16033l;
            if (bVar == null) {
                r.i("faultDetailViewModel");
                throw null;
            }
            String str = bVar.f80186h;
            aVar.getClass();
            faultDetailActivity.e1(b.a.a(str, arrayList));
        }
    }

    @Override // uv0.b
    public final void G0(kj.b bVar) {
        z zVar = this.f16034m;
        if (zVar != null) {
            zVar.p(this, bVar.f47574a, bVar.f47575b);
        } else {
            r.i("robotCoordinator");
            throw null;
        }
    }

    @Override // bt0.d
    public final bt0.a d1() {
        tv0.b bVar = this.f16033l;
        if (bVar != null) {
            return bVar;
        }
        r.i("faultDetailViewModel");
        throw null;
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newIntent method";
        Bundle a14 = a13.a("COORDINATOR_ID", "ROBOT_FAULT", "IS_FATAL_FAULT");
        f16032q.getClass();
        String string = a14.getString("COORDINATOR_ID");
        if (string == null) {
            string = "";
        }
        this.f16036o = string;
        z.f42723r.getClass();
        z a15 = z.a.a(string);
        if (a15 == null) {
            pa.c.p("Required value was null.");
            return;
        }
        this.f16034m = a15;
        av0.d dVar = a15.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        iu0.p pVar = s0Var.f9016b;
        sv0.d g13 = dVar.g();
        tj.a b13 = j2.b(s0Var);
        e8Var.getClass();
        this.f16033l = new tv0.b(pVar, g13, b13.c());
        Object a16 = k7.b.a(a14, "ROBOT_FAULT", RobotFault.class);
        if (a16 == null) {
            pa.c.w("ROBOT_FAULT was null");
            return;
        }
        RobotFault robotFault = (RobotFault) ((Parcelable) a16);
        boolean z13 = a14.getBoolean("IS_FATAL_FAULT");
        g a17 = g.a(this);
        a17.getClass();
        this.f16035n = a17;
        tv0.b bVar = this.f16033l;
        if (bVar == null) {
            r.i("faultDetailViewModel");
            throw null;
        }
        bVar.f80187i.setValue(bVar, tv0.b.f80183j[0], this.f16037p);
        tv0.b bVar2 = this.f16033l;
        if (bVar2 == null) {
            r.i("faultDetailViewModel");
            throw null;
        }
        sv0.c b14 = bVar2.f80185g.b(robotFault);
        if (b14 == null) {
            Logger.b("Unable to locate fault data for code ".concat(robotFault.N().d), null);
            tv0.a m13 = bVar2.m();
            if (m13 != null) {
                m13.a();
                return;
            }
            return;
        }
        List<RobotFaultResolutionStep> list = b14.f77053c;
        e eVar = b14.f77052b;
        bVar2.l(eVar.c());
        boolean z14 = list != null ? !list.isEmpty() : false;
        if (z13) {
            FaultCode N = robotFault.N();
            tv0.a m14 = bVar2.m();
            if (m14 != null) {
                m14.b(N.d, eVar.a(), bVar2.f80184f.f42685b);
            }
        } else if (!z14) {
            Logger.b("Active fault is non recoverable", null);
            tv0.a m15 = bVar2.m();
            if (m15 != null) {
                m15.a();
            }
        } else if (list != null) {
            ArrayList arrayList = new ArrayList(u.o(list, 10));
            for (RobotFaultResolutionStep robotFaultResolutionStep : list) {
                Step step = new Step(null, null, null, 7, null);
                step.m(robotFaultResolutionStep.j());
                step.l(robotFaultResolutionStep.i());
                step.n(robotFaultResolutionStep.k());
                arrayList.add(step);
            }
            tv0.a m16 = bVar2.m();
            if (m16 != null) {
                m16.c(arrayList);
            }
        }
    }

    @Override // uv0.b
    public final void y0(String str) {
        str.getClass();
        if (this.f16035n == null) {
            r.i("machineCoordinator");
            throw null;
        }
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
            return;
        }
        Logger.b("Unable to open URL - no Activity available to handle the intent: " + intent, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/faults/ui/FaultDetailActivity$a;", "", "<init>", "()V", "", "ROBOT_FAULT_EXTRA", "Ljava/lang/String;", "IS_FATAL_FAULT_EXTRA", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
