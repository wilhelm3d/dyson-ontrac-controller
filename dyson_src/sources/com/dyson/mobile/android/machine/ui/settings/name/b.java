package com.dyson.mobile.android.machine.ui.settings.name;

import android.os.Bundle;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg0.v1;
import vk0.n;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/b;", "Lcom/dyson/mobile/android/machine/ui/settings/name/i;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends i {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15436k = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public j f15437i;

    /* renamed from: j  reason: collision with root package name */
    public pf0.c f15438j;

    @Override // pt0.b, gu0.f
    public final void c() {
        uf0.g a13 = uf0.g.a(getActivity());
        androidx.fragment.app.e activity = getActivity();
        he0.e eVar = new he0.e(this, 17);
        a13.getClass();
        ConnectivityIssueActivity.f1(activity, eVar, null);
    }

    @Override // pt0.b
    public final j t() {
        j jVar = this.f15437i;
        if (jVar != null) {
            return jVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.name.i, pt0.b
    public final void v(Bundle bundle) {
        sg0.b bVar = uf0.g.a(getActivity()).f81922a;
        v1 v1Var = bVar.f76086a;
        n nVar = bVar.f76116q.get();
        kz.b bVar2 = bVar.f76113o0.get();
        pf0.c c13 = bVar.c();
        bk0.f fVar = bVar.C.get();
        v1Var.getClass();
        nVar.getClass();
        bVar2.getClass();
        fVar.getClass();
        this.f15437i = new j(nVar, bVar2, c13, fVar, null, null);
        this.f15438j = bVar.c();
        super.v(bundle);
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.name.i
    public final pf0.c w() {
        pf0.c cVar = this.f15438j;
        if (cVar != null) {
            return cVar;
        }
        r.i("_localisationManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/b$a;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
