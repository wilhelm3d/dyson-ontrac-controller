package com.dyson.mobile.android.interactableec.settings;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.dyson.mobile.android.machine.ui.settings.name.i;
import com.dyson.mobile.android.machine.ui.settings.name.j;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa0.p2;
import pa0.p4;
import pa0.t0;
import pf0.c;
import uf0.g;
import uf0.l;
import w90.g;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/a;", "Lcom/dyson/mobile/android/machine/ui/settings/name/i;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends i {

    /* renamed from: k  reason: collision with root package name */
    public static final C0483a f14629k = new C0483a(null);

    /* renamed from: i  reason: collision with root package name */
    public j f14630i;

    /* renamed from: j  reason: collision with root package name */
    public c f14631j;

    @Override // pt0.b, gu0.f
    public final void c() {
        g a13 = g.a(getActivity());
        e activity = getActivity();
        he0.e eVar = new he0.e(this, 21);
        a13.getClass();
        ConnectivityIssueActivity.f1(activity, eVar, null);
    }

    @Override // pt0.b
    public final j t() {
        j jVar = this.f14630i;
        if (jVar != null) {
            return jVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.name.i, pt0.b
    public final void v(Bundle bundle) {
        String y13 = o0.y("COORDINATOR_ID", bundle);
        w90.g.f85506o.getClass();
        w90.g a13 = g.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        oa0.b bVar = a13.f85510j;
        p2 p2Var = bVar.f59835c;
        pa0.a aVar = bVar.f59825a;
        Context context = aVar.f63154a;
        Context context2 = aVar.f63154a;
        this.f14630i = p4.a(p2Var, new l(context).j(), new kz.c(context2).a(), t0.b(aVar), new l(context2).i(), bVar.F.get());
        this.f14631j = t0.b(aVar);
        super.v(bundle);
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.name.i
    public final c w() {
        c cVar = this.f14631j;
        if (cVar != null) {
            return cVar;
        }
        r.i("_localisationManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/a$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.settings.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0483a {
        public /* synthetic */ C0483a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0483a() {
        }
    }
}
