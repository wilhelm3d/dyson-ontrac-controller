package com.dyson.mobile.android.audio.settings;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Bundle;
import com.dyson.mobile.android.machine.ui.settings.name.h;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import fm1.o0;
import hk.d6;
import hk.g5;
import hk.j;
import hk.q7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import pm0.e;
import u50.d;
import uf0.g;
import uf0.l;
import vj.f;
import vk0.n;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/a;", "Lpm0/e;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final C0356a f12709f = new C0356a(null);
    public h e;

    @Override // pt0.a, gu0.f
    public final void c() {
        g a13 = g.a(getActivity());
        androidx.fragment.app.e activity = getActivity();
        he0.e eVar = new he0.e(this, 8);
        a13.getClass();
        ConnectivityIssueActivity.f1(activity, eVar, null);
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
        f.f84306m.getClass();
        f a13 = f.a.a(y13);
        if (a13 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a13.f84312l;
        g5 g5Var = aVar.f34906a;
        j jVar = aVar.f34911b;
        l lVar = aVar.e.get();
        jVar.getClass();
        lVar.getClass();
        n j8 = lVar.j();
        Context context = aVar.d.get();
        context.getClass();
        MachineSerial machineSerial = jVar.f38548a.d;
        r60.a b13 = q7.b(aVar.f34916c);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        aVar.d.get().getClass();
        this.e = d6.a(g5Var, j8, new kz.c(context).a(), aVar.f35000t0.get(), new pm0.a(machineSerial, b13, defaultAdapter, new d().d(), new se1.e(), jVar.f38548a));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/a$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0356a {
        public /* synthetic */ C0356a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0356a() {
        }
    }
}
