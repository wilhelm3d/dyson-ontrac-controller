package com.dyson.mobile.android.robot.menu.settings;

import android.os.Bundle;
import av0.d;
import bv0.a2;
import bv0.e8;
import bv0.s0;
import com.dyson.mobile.android.machine.ui.settings.name.h;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import pm0.e;
import uf0.g;
import vk0.n;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/a;", "Lpm0/e;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final C0557a f16202f = new C0557a(null);
    public h e;

    @Override // pt0.a, gu0.f
    public final void c() {
        g a13 = g.a(getActivity());
        androidx.fragment.app.e activity = getActivity();
        a20.h hVar = new a20.h(this, 5);
        a13.getClass();
        ConnectivityIssueActivity.f1(activity, hVar, null);
    }

    @Override // pt0.a
    public final h s() {
        h hVar = this.e;
        if (hVar != null) {
            return hVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // pt0.a
    public final void t(Bundle bundle) {
        String y13 = o0.y("COORDINATOR_ID", bundle);
        z.f42723r.getClass();
        z a13 = z.a.a(y13);
        if (a13 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a13.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        n b13 = a2.b(s0Var);
        kz.b a14 = new kz.c(s0Var.f9015a).a();
        hl0.b bVar = dVar.f5624y0.get();
        jl0.c cVar = dVar.f5514b3.get();
        e8Var.getClass();
        bVar.getClass();
        cVar.getClass();
        this.e = new h(b13, a14, bVar, cVar, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/a$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.menu.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0557a {
        public /* synthetic */ C0557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0557a() {
        }
    }
}
