package com.dyson.mobile.android.light.location;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import fm1.o0;
import je0.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import q8.g;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/location/a;", "Lwt0/d;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends wt0.d {

    /* renamed from: j  reason: collision with root package name */
    public static final C0495a f14897j = new C0495a(null);

    /* renamed from: h  reason: collision with root package name */
    public pf0.c f14898h;

    /* renamed from: i  reason: collision with root package name */
    public og0.a f14899i;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(y13);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        ke0.d dVar = a13.f89779j;
        this.f14898h = j0.a(dVar.f47424b);
        this.f14899i = dVar.c();
        u uVar = (u) g.c(layoutInflater, R.layout.dialog_light_hours, viewGroup, false, null);
        DysonTextView dysonTextView = uVar.f44854g;
        pf0.c cVar = this.f14898h;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        og0.a aVar = this.f14899i;
        if (aVar == null) {
            r.i("dataObject");
            throw null;
        }
        dysonTextView.setText(cVar.d(aVar.b(og0.d.light_daylightHours)));
        DysonTextView dysonTextView2 = uVar.d;
        pf0.c cVar2 = this.f14898h;
        if (cVar2 == null) {
            r.i("localisationManager");
            throw null;
        }
        og0.a aVar2 = this.f14899i;
        if (aVar2 == null) {
            r.i("dataObject");
            throw null;
        }
        dysonTextView2.setText(cVar2.d(aVar2.b(og0.d.light_daylightHours_sync)));
        DysonTextView dysonTextView3 = uVar.e;
        pf0.c cVar3 = this.f14898h;
        if (cVar3 == null) {
            r.i("localisationManager");
            throw null;
        }
        og0.a aVar3 = this.f14899i;
        if (aVar3 != null) {
            dysonTextView3.setText(cVar3.d(aVar3.b(og0.d.light_daylightHours_adjust)));
            return uVar.getRoot();
        }
        r.i("dataObject");
        throw null;
    }

    @Override // wt0.d
    public final int s() {
        return 2132083540;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/location/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0495a {
        public /* synthetic */ C0495a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0495a() {
        }
    }
}
