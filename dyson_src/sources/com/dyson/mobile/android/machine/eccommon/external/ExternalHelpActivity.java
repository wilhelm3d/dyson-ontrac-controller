package com.dyson.mobile.android.machine.eccommon.external;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import fm1.o0;
import im1.zb;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import q8.l;
import sz1.m;
import sz1.v;
import vk.i;
import vk0.e;
import we1.a;
import wg0.d;
import wg0.f;
import wg0.g;
import wg0.h;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/eccommon/external/ExternalHelpActivity;", "Ll/b;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExternalHelpActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f15093o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public wg0.b f15094j;

    /* renamed from: k  reason: collision with root package name */
    public g f15095k;

    /* renamed from: l  reason: collision with root package name */
    public String f15096l;

    /* renamed from: m  reason: collision with root package name */
    public uf0.g f15097m;

    /* renamed from: n  reason: collision with root package name */
    public final b f15098n = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/eccommon/external/ExternalHelpActivity$b", "Lwg0/c;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements wg0.c {
        public b() {
        }

        @Override // wg0.c
        public final void a() {
            ExternalHelpActivity externalHelpActivity = ExternalHelpActivity.this;
            if (externalHelpActivity.f15097m != null) {
                externalHelpActivity.onBackPressed();
            } else {
                r.i("machineCoordinator");
                throw null;
            }
        }

        @Override // wg0.c
        public final void b(h hVar) {
            wg0.b bVar = ExternalHelpActivity.this.f15094j;
            if (bVar != null) {
                bVar.f85752c = hVar;
            } else {
                r.i("adapter");
                throw null;
            }
        }

        @Override // wg0.c
        public final void c(ArrayList arrayList) {
            wg0.b bVar = ExternalHelpActivity.this.f15094j;
            if (bVar == null) {
                r.i("adapter");
                throw null;
            }
            wg0.a aVar = bVar.f85750a;
            aVar.getClass();
            aVar.f85748a = arrayList;
            aVar.notifyDataSetChanged();
        }

        @Override // wg0.c
        public final void d(ArrayList arrayList) {
            arrayList.getClass();
            wg0.b bVar = ExternalHelpActivity.this.f15094j;
            if (bVar == null) {
                r.i("adapter");
                throw null;
            }
            bVar.f85751b = arrayList;
            bVar.notifyDataSetChanged();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/eccommon/external/ExternalHelpActivity$c", "Landroidx/viewpager2/widget/ViewPager2$h;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends ViewPager2.h {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void c(int i13) {
            g gVar = ExternalHelpActivity.this.f15095k;
            if (gVar != null) {
                gVar.f85766m.onNext(Integer.valueOf(i13));
            } else {
                r.i("viewModel");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        uf0.g a13 = uf0.g.a(this);
        a13.getClass();
        this.f15097m = a13;
        a13.f81922a.b(this);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a14 = a.C2547a.a(intent);
        a14.f85710b = "Please use newIntent method to create a ExternalHelpActivity Intent";
        Bundle a15 = a14.a("COORDINATOR_ID");
        this.f15096l = o0.y("COORDINATOR_ID", a15);
        uf0.g a16 = uf0.g.a(this);
        if (a16 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f15097m = a16;
        a16.f81922a.b(this);
        g gVar = this.f15095k;
        if (gVar == null) {
            r.i("viewModel");
            throw null;
        }
        String string = a15.getString("EXTRA_SELECTED_HELP_SECTION");
        if (string == null) {
            pa.c.p("Required value was null.");
            return;
        }
        d valueOf = d.valueOf(string);
        valueOf.getClass();
        gVar.f85762i = valueOf;
        gVar.f85760g = (hk0.b) k7.b.c(a15, "EXTRA_EXTERNAL_ENVIRONMENT_DATA", hk0.b.class);
        gVar.f85761h = a15.getBoolean("EXTRA_IS_AUTO_LOCATION_ENABLED_PERMISSIONS_GRANTED");
        super.onCreate(bundle);
        mg0.c cVar = (mg0.c) q8.g.d(this, R.layout.activity_external_help);
        g gVar2 = this.f15095k;
        if (gVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        gVar2.f85763j.setValue(gVar2, g.f85757q[0], this.f15098n);
        String str = this.f15096l;
        if (str == null) {
            r.i("serialNumber");
            throw null;
        }
        boolean z13 = gVar2.f85761h;
        gz1.b bVar = gVar2.f85768o;
        if (z13) {
            dz1.x<Location> b13 = gVar2.f85769p.b();
            w60.d dVar = new w60.d(new i(11, gVar2, str), 18);
            b.a aVar = kz1.b.f50218a;
            zb.z(bVar, new sz1.i(new m(b13, dVar).r(c02.a.f10004c).j(fz1.a.a()), new w60.d(new e(29), 19)).p(new w60.d(new wg0.e(gVar2, 2), 20), kz1.a.e));
        } else {
            v j8 = gVar2.d.b(str).r(c02.a.f10004c).j(fz1.a.a());
            w60.d dVar2 = new w60.d(new f(0), 21);
            b.a aVar2 = kz1.b.f50218a;
            zb.z(bVar, new sz1.i(j8, dVar2).p(new w60.d(new wg0.e(gVar2, 1), 16), kz1.a.e));
        }
        pf0.c cVar2 = gVar2.e;
        ArrayList arrayList = gVar2.f85767n;
        arrayList.clear();
        l<at0.m> lVar = gVar2.f85764k;
        lVar.clear();
        gVar2.T();
        hk0.b bVar2 = gVar2.f85760g;
        if (bVar2 != null) {
            if (bVar2.o() != null) {
                arrayList.add(d.TEMPERATURE);
                lVar.add(new at0.m(null, Integer.valueOf((int) R.drawable.ic_home_help_temperature), cVar2.d(rf0.f.X1), 1, null));
            }
            if (bVar2.e() != null) {
                arrayList.add(d.HUMIDITY);
                lVar.add(new at0.m(null, Integer.valueOf((int) R.drawable.ic_home_help_humidity), cVar2.d(rf0.f.Y1), 1, null));
            }
            if (bVar2.c() != null) {
                arrayList.add(0, d.AQI);
                lVar.add(0, new at0.m(cVar2.d(rf0.f.f71355v4), null, cVar2.d(rf0.f.W1), 2, null));
            }
            hk0.d l13 = bVar2.l();
            if (l13 != null) {
                arrayList.add(d.POLLEN);
                lVar.add(new at0.m(null, Integer.valueOf((int) R.drawable.ic_home_help_pollen_tree), cVar2.d(rf0.f.H4), 1, null));
                wg0.c S = gVar2.S();
                if (S != null) {
                    S.b(new h(l13.d() != null, l13.e() != null, l13.f() != null));
                }
            }
            if (bVar2.k() != null) {
                arrayList.add(d.PM25);
                lVar.add(new at0.m(null, Integer.valueOf((int) R.drawable.ic_home_help_pm25), cVar2.d(rf0.f.f71175b2), 1, null));
            }
            if (bVar2.j() != null) {
                arrayList.add(d.PM10);
                lVar.add(new at0.m(null, Integer.valueOf((int) R.drawable.ic_home_help_pm10), cVar2.d(rf0.f.f71184c2), 1, null));
            }
            if (bVar2.i() != null) {
                arrayList.add(d.NO2);
                lVar.add(new at0.m(null, Integer.valueOf((int) R.drawable.ic_home_help_no2), cVar2.d(rf0.f.G3), 1, null));
            }
            gVar2.T();
        }
        zb.z(bVar, gVar2.f85766m.n(100L, TimeUnit.MILLISECONDS).O(new w60.d(new wg0.e(gVar2, 0), 17)));
        cVar.l(gVar2);
        ViewPager2 viewPager2 = cVar.f53868h;
        wg0.b bVar3 = this.f15094j;
        if (bVar3 == null) {
            r.i("adapter");
            throw null;
        }
        viewPager2.setAdapter(bVar3);
        new zn1.g(cVar.f53866f, viewPager2, new v80.c(25)).a();
        viewPager2.b(new c());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/eccommon/external/ExternalHelpActivity$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_HELP_SECTION", "Ljava/lang/String;", "EXTRA_EXTERNAL_ENVIRONMENT_DATA", "EXTRA_IS_AUTO_LOCATION_ENABLED_PERMISSIONS_GRANTED", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(androidx.fragment.app.e eVar, String str, d dVar, hk0.b bVar, boolean z13) {
            str.getClass();
            dVar.getClass();
            bVar.getClass();
            Intent intent = new Intent(eVar, ExternalHelpActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("EXTRA_SELECTED_HELP_SECTION", dVar.name());
            intent.putExtra("EXTRA_EXTERNAL_ENVIRONMENT_DATA", bVar);
            intent.putExtra("EXTRA_IS_AUTO_LOCATION_ENABLED_PERMISSIONS_GRANTED", z13);
            return intent;
        }

        private a() {
        }
    }
}
