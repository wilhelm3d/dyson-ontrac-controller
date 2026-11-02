package com.dyson.mobile.android.light.settings;

import a20.h;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import bk0.f;
import com.dyson.mobile.android.machine.ui.settings.name.i;
import com.dyson.mobile.android.machine.ui.settings.name.j;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import fm1.o0;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import le0.n1;
import le0.q0;
import pf0.c;
import uf0.g;
import uf0.l;
import vk0.n;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/settings/a;", "Lcom/dyson/mobile/android/machine/ui/settings/name/i;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends i {

    /* renamed from: k  reason: collision with root package name */
    public static final C0504a f15049k = new C0504a(null);

    /* renamed from: i  reason: collision with root package name */
    public j f15050i;

    /* renamed from: j  reason: collision with root package name */
    public c f15051j;

    @Override // pt0.b, gu0.f
    public final void c() {
        g a13 = g.a(getActivity());
        e activity = getActivity();
        h hVar = new h(this, 28);
        a13.getClass();
        ConnectivityIssueActivity.f1(activity, hVar, null);
    }

    @Override // pt0.b
    public final j t() {
        j jVar = this.f15050i;
        if (jVar != null) {
            return jVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.name.i, pt0.b
    public final void v(Bundle bundle) {
        String y13 = o0.y("COORDINATOR_ID", bundle);
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a13.f89779j;
        n1 n1Var = dVar.f47425c;
        le0.a aVar = dVar.f47424b;
        n a14 = q0.a(aVar);
        Context context = aVar.f51576a;
        kz.b a15 = new kz.c(context).a();
        pf0.c a16 = j0.a(aVar);
        f i13 = new l(context).i();
        hl0.b bVar = dVar.T.get();
        jl0.c cVar = dVar.U.get();
        n1Var.getClass();
        bVar.getClass();
        cVar.getClass();
        this.f15050i = new j(a14, a15, a16, i13, bVar, cVar);
        this.f15051j = j0.a(aVar);
        super.v(bundle);
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.name.i
    public final pf0.c w() {
        pf0.c cVar = this.f15051j;
        if (cVar != null) {
            return cVar;
        }
        r.i("_localisationManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/settings/a$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0504a {
        public /* synthetic */ C0504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0504a() {
        }
    }
}
