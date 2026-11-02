package com.dyson.mobile.android.machine.ui.settings.name;

import android.os.Bundle;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg0.v1;
import vk0.n;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/a;", "Lpm0/e;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends pm0.e {

    /* renamed from: f  reason: collision with root package name */
    public static final C0530a f15435f = new C0530a(null);
    public h e;

    @Override // pt0.a, gu0.f
    public final void c() {
        uf0.g a13 = uf0.g.a(getActivity());
        androidx.fragment.app.e activity = getActivity();
        he0.e eVar = new he0.e(this, 16);
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
        sg0.b bVar = uf0.g.a(getActivity()).f81922a;
        v1 v1Var = bVar.f76086a;
        n nVar = bVar.f76116q.get();
        kz.b bVar2 = bVar.f76113o0.get();
        v1Var.getClass();
        nVar.getClass();
        bVar2.getClass();
        this.e = new h(nVar, bVar2, null, null, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/a$a;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.ui.settings.name.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0530a {
        public /* synthetic */ C0530a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0530a() {
        }
    }
}
