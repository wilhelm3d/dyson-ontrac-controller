package com.dyson.mobile.android.light.schedule;

import android.content.Intent;
import android.os.Bundle;
import cd.b;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.schedule.a;
import fm1.o0;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import pl0.c;
import pl0.e;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/LightScheduleActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightScheduleActivity extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final a f14930w = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public og0.a f14931s;

    /* renamed from: u  reason: collision with root package name */
    public String f14933u;

    /* renamed from: t  reason: collision with root package name */
    public e f14932t = new e();

    /* renamed from: v  reason: collision with root package name */
    public String f14934v = "";

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return this.f14932t;
    }

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
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
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f14933u = y13;
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a14.f89779j;
        this.f14931s = dVar.c();
        pf0.c a15 = j0.a(dVar.f47424b);
        og0.a aVar = this.f14931s;
        if (aVar == null) {
            r.i("machineDataObject");
            throw null;
        }
        this.f14934v = a15.d(aVar.b(og0.d.light_scheduling));
        e eVar = new e();
        this.f14932t = eVar;
        String str = this.f14934v;
        eVar.f64437f = R.drawable.ic_schedule;
        eVar.f64438g = str;
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            a.C0499a c0499a = com.dyson.mobile.android.light.schedule.a.f14935i;
            String str = this.f14933u;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0499a.getClass();
            com.dyson.mobile.android.light.schedule.a aVar = new com.dyson.mobile.android.light.schedule.a();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            aVar.setArguments(bundle2);
            s1(aVar, this.f14934v, true);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // pl0.c
    public final e r1() {
        return this.f14932t;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/LightScheduleActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
