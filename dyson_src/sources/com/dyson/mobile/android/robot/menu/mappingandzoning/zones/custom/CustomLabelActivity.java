package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.custom;

import android.content.Intent;
import android.os.Bundle;
import cd.b;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.c;
import pl0.e;
import rf0.g0;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/custom/CustomLabelActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomLabelActivity extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final a f16140w = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public pf0.c f16141s;

    /* renamed from: t  reason: collision with root package name */
    public e f16142t;

    /* renamed from: u  reason: collision with root package name */
    public String f16143u;

    /* renamed from: v  reason: collision with root package name */
    public String f16144v;

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b.J(this)) {
            return;
        }
        setTheme(2132083504);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "CustomLabelActivity cannot be initialised without the required arguments";
        a13.a("COORDINATOR_ID", "CURRENT_CUSTOM_ZONE_NAME");
        Intent intent2 = getIntent();
        intent2.getClass();
        this.f16143u = o0.y("COORDINATOR_ID", b.I(intent2));
        Intent intent3 = getIntent();
        intent3.getClass();
        this.f16144v = o0.y("CURRENT_CUSTOM_ZONE_NAME", b.I(intent3));
        z.a aVar = z.f42723r;
        String str = this.f16143u;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        z a14 = z.a.a(str);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16141s = a14.f42732o.f42663a.b();
        e eVar = new e();
        this.f16142t = eVar;
        eVar.f64437f = 0;
        eVar.f64438g = "";
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            pf0.c cVar = this.f16141s;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            String d = cVar.d(g0.f71481n);
            String str = this.f16143u;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            CustomLabelExtras customLabelExtras = new CustomLabelExtras(str);
            String str2 = this.f16144v;
            if (str2 == null) {
                r.i("currentCustomZoneName");
                throw null;
            }
            NamingConfig namingConfig = new NamingConfig(str2, new String[0], customLabelExtras);
            com.dyson.mobile.android.robot.menu.mappingandzoning.zones.custom.a.f16145f.getClass();
            com.dyson.mobile.android.robot.menu.mappingandzoning.zones.custom.a aVar = new com.dyson.mobile.android.robot.menu.mappingandzoning.zones.custom.a();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("CONFIG", namingConfig);
            aVar.setArguments(bundle2);
            o1(aVar, d, null, null);
        }
    }

    @Override // pl0.c, bt0.f
    /* renamed from: r1 */
    public final e i1() {
        e eVar = this.f16142t;
        if (eVar != null) {
            return eVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/custom/CustomLabelActivity$a;", "", "<init>", "()V", "", "RESULT_CUSTOM_LABEL_CHANGED", "I", "", "EXTRA_CURRENT_CUSTOM_ZONE_NAME", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
