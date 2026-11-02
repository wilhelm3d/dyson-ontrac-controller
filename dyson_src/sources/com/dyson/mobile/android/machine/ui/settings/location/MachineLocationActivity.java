package com.dyson.mobile.android.machine.ui.settings.location;

import android.content.Intent;
import android.os.Bundle;
import bt0.c;
import bt0.f;
import cd.b;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.e;
import uf0.g;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/location/MachineLocationActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineLocationActivity extends f<c> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f15413r = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public String f15414p;

    /* renamed from: q  reason: collision with root package name */
    public pf0.c f15415q;

    @Override // bt0.f
    public final bt0.a i1() {
        return new e();
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        this.f15414p = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f15415q = g.a(this).f81922a.c();
        e1();
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        String str = this.f15414p;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        om0.b s13 = om0.b.s(str);
        pf0.c cVar = this.f15415q;
        if (cVar != null) {
            o1(s13, cVar.d(rf0.f.T0), null, null);
        } else {
            r.i("localisationManager");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/location/MachineLocationActivity$a;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
