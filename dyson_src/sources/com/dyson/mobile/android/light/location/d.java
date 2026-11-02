package com.dyson.mobile.android.light.location;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import fm1.o0;
import je0.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.d1;
import le0.i1;
import le0.n1;
import qe0.f;
import re0.g;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/location/d;", "Lwt0/d;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends wt0.d {

    /* renamed from: i  reason: collision with root package name */
    public static final a f14913i = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public f f14914h;

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(y13);
        a13.getClass();
        ke0.d dVar = a13.f89779j;
        n1 n1Var = dVar.f47425c;
        lf0.a aVar = dVar.Q.get();
        og0.a c13 = dVar.c();
        d1 d1Var = dVar.f47423a;
        re0.a b14 = dVar.b();
        d1Var.getClass();
        MachineDefinition machineDefinition = d1Var.f51598b;
        g a14 = b14.a(machineDefinition.d, machineDefinition.f15569q, machineDefinition.k());
        in0.g a15 = i1.a(d1Var);
        n1Var.getClass();
        aVar.getClass();
        this.f14914h = new f(aVar, c13, a14, a15);
        this.e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        w wVar = (w) q8.g.c(layoutInflater, R.layout.dialog_light_set_location, viewGroup, false, null);
        f fVar = this.f14914h;
        if (fVar == null) {
            r.i("viewModel");
            throw null;
        }
        wVar.l(fVar);
        Lifecycle lifecycle = getLifecycle();
        f fVar2 = this.f14914h;
        if (fVar2 != null) {
            lifecycle.a(fVar2);
            return wVar.getRoot();
        }
        r.i("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle lifecycle = getLifecycle();
        f fVar = this.f14914h;
        if (fVar != null) {
            lifecycle.c(fVar);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        f fVar = this.f14914h;
        if (fVar == null) {
            r.i("viewModel");
            throw null;
        } else if (fVar.f66717l) {
            fVar.f66718m.a(fVar.d.h0(false).v());
        }
    }

    @Override // wt0.d
    public final int s() {
        return 2132083540;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/location/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
