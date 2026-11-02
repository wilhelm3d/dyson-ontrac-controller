package com.dyson.mobile.android.light.location;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.location.b;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import rf0.i0;
import we1.a;
import x12.r;
import yd0.c;
import zs0.e;
import zs0.i;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/location/LightLocationActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightLocationActivity extends f<bt0.c> {

    /* renamed from: v  reason: collision with root package name */
    public static final a f14885v = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public og0.a f14886p;

    /* renamed from: q  reason: collision with root package name */
    public pf0.c f14887q;

    /* renamed from: r  reason: collision with root package name */
    public yd0.c f14888r;

    /* renamed from: s  reason: collision with root package name */
    public String f14889s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14890t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f14891u;

    @Override // androidx.core.app.ComponentActivity
    public final void R0() {
        e.a a13 = new e(this).a();
        pf0.c q13 = q1();
        og0.a aVar = this.f14886p;
        if (aVar == null) {
            r.i("machineDataObject");
            throw null;
        }
        a13.f93107a = q13.d(aVar.b(og0.d.light_exitConfiguration_alertTitle));
        pf0.c q14 = q1();
        og0.a aVar2 = this.f14886p;
        if (aVar2 == null) {
            r.i("machineDataObject");
            throw null;
        }
        a13.f93108b = q14.d(aVar2.b(og0.d.light_exitConfiguration_alertMessage));
        a13.c(q1().d(i0.M8), new a20.a(this, 18));
        a13.b(q1().d(i0.E8), null);
        a13.f93110f = true;
        a13.a().show();
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b(null, 1, null);
    }

    @Override // bt0.f, f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_IS_UPDATE_LOBBY_REQUIRED", this.f14891u);
        j1(bundle);
        overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRA_LOCATION", "EXTRA_FROM_SETTINGS");
        String y13 = o0.y("COORDINATOR_ID", a14);
        yd0.c.f89775o.getClass();
        yd0.c a15 = c.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14888r = a15;
        ke0.d dVar = a15.f89779j;
        this.f14886p = dVar.c();
        this.f14887q = j0.a(dVar.f47424b);
        this.f14889s = o0.y("EXTRA_LOCATION", a14);
        this.f14890t = a14.getBoolean("EXTRA_FROM_SETTINGS");
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
        e1();
    }

    @Override // bt0.f, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        if (this.f14890t) {
            menu.clear();
            i.a(menu);
            return true;
        }
        return true;
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        String d;
        super.onPostCreate(bundle);
        if (bundle == null) {
            b.a aVar = b.f14900l;
            yd0.c cVar = this.f14888r;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            String str = cVar.f89777h;
            String str2 = this.f14889s;
            if (str2 == null) {
                r.i("location");
                throw null;
            }
            boolean z13 = this.f14890t;
            aVar.getClass();
            str.getClass();
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            bundle2.putString("EXTRA_LOCATION", str2);
            bundle2.putBoolean("EXTRA_FROM_SETTINGS", z13);
            bVar.setArguments(bundle2);
            if (this.f14890t) {
                pf0.c q13 = q1();
                og0.a aVar2 = this.f14886p;
                if (aVar2 == null) {
                    r.i("machineDataObject");
                    throw null;
                }
                d = q13.d(aVar2.b(og0.d.light_configurationSelectLocation));
            } else {
                pf0.c q14 = q1();
                og0.a aVar3 = this.f14886p;
                if (aVar3 == null) {
                    r.i("machineDataObject");
                    throw null;
                }
                d = q14.d(aVar3.b(og0.d.light_configuration));
            }
            o1(bVar, d, null, null);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public final pf0.c q1() {
        pf0.c cVar = this.f14887q;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/location/LightLocationActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, boolean z13, String str, String str2) {
            str.getClass();
            str2.getClass();
            Intent putExtra = new Intent(context, LightLocationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("EXTRA_LOCATION", str2).putExtra("EXTRA_FROM_SETTINGS", z13);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
