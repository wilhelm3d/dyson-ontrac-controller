package com.dyson.mobile.android.light.location;

import android.content.Intent;
import android.os.Bundle;
import bt0.f;
import com.dyson.mobile.android.light.location.c;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import rf0.i0;
import we1.a;
import x12.r;
import yd0.c;
import zs0.e;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/location/LightLocationStartActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightLocationStartActivity extends f<bt0.c> {

    /* renamed from: t  reason: collision with root package name */
    public static final a f14892t = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public og0.a f14893p;

    /* renamed from: q  reason: collision with root package name */
    public pf0.c f14894q;

    /* renamed from: r  reason: collision with root package name */
    public String f14895r;

    /* renamed from: s  reason: collision with root package name */
    public yd0.c f14896s;

    @Override // androidx.core.app.ComponentActivity
    public final void R0() {
        e.a a13 = new e(this).a();
        pf0.c q13 = q1();
        og0.a aVar = this.f14893p;
        if (aVar == null) {
            r.i("machineDataObject");
            throw null;
        }
        a13.f93107a = q13.d(aVar.b(og0.d.light_exitConfiguration_alertTitle));
        pf0.c q14 = q1();
        og0.a aVar2 = this.f14893p;
        if (aVar2 == null) {
            r.i("machineDataObject");
            throw null;
        }
        a13.f93108b = q14.d(aVar2.b(og0.d.light_exitConfiguration_alertMessage));
        a13.c(q1().d(i0.M8), new a20.a(this, 19));
        a13.b(q1().d(i0.E8), null);
        a13.a().show();
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b(null, 1, null);
    }

    @Override // bt0.f, f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        R0();
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f14895r = y13;
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        a14.getClass();
        this.f14896s = a14;
        ke0.d dVar = a14.f89779j;
        this.f14893p = dVar.c();
        this.f14894q = j0.a(dVar.f47424b);
        this.f8415o = true;
        p1();
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            c.a aVar = c.f14908i;
            String str = this.f14895r;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar.getClass();
            c cVar = new c();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            cVar.setArguments(bundle2);
            pf0.c q13 = q1();
            og0.a aVar2 = this.f14893p;
            if (aVar2 != null) {
                o1(cVar, q13.d(aVar2.b(og0.d.light_configuration)), null, null);
            } else {
                r.i("machineDataObject");
                throw null;
            }
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        R0();
        return true;
    }

    public final pf0.c q1() {
        pf0.c cVar = this.f14894q;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/location/LightLocationStartActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
