package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.b;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.j;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/mapname/RobotMapNameOverviewActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotMapNameOverviewActivity extends f<bt0.c> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f16182r = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public pf0.c f16183p;

    /* renamed from: q  reason: collision with root package name */
    public z f16184q;

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b(null, 1, null);
    }

    @Override // bt0.f, f.g, android.app.Activity
    public final void onBackPressed() {
        j1(null);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RobotMapNameOverviewActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID", "CONFIG");
        z.a aVar = z.f42723r;
        Intent intent2 = getIntent();
        intent2.getClass();
        String y13 = o0.y("COORDINATOR_ID", cd.b.I(intent2));
        aVar.getClass();
        z a14 = z.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16184q = a14;
        this.f16183p = a14.f42732o.f42663a.b();
        e1();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        pf0.c cVar = this.f16183p;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        String d = cVar.d(j.A0);
        b.a aVar = b.f16187i;
        z zVar = this.f16184q;
        if (zVar == null) {
            r.i("robotCoordinator");
            throw null;
        }
        String str = zVar.f42726i;
        Intent intent = getIntent();
        intent.getClass();
        Object a13 = k7.b.a(cd.b.I(intent), "CONFIG", NamingConfig.class);
        if (a13 == null) {
            pa.c.w("CONFIG was null");
            return;
        }
        aVar.getClass();
        str.getClass();
        b bVar = new b();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        bundle2.putParcelable("EXTRA_MAP_NAME_CONFIG", (NamingConfig) ((Parcelable) a13));
        bVar.setArguments(bundle2);
        o1(bVar, d, null, null);
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        j1(null);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return false;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/mapname/RobotMapNameOverviewActivity$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
