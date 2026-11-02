package com.dyson.mobile.android.robot.menu.settings;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.menu.settings.b;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.c;
import pl0.e;
import rf0.g0;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/RobotSettingsActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotSettingsActivity extends c {

    /* renamed from: v  reason: collision with root package name */
    public static final a f16198v = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public String f16199s;

    /* renamed from: t  reason: collision with root package name */
    public String f16200t;

    /* renamed from: u  reason: collision with root package name */
    public final e f16201u = new e();

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return this.f16201u;
    }

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RobotSettingsActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID");
        Intent intent2 = getIntent();
        intent2.getClass();
        String y13 = o0.y("COORDINATOR_ID", cd.b.I(intent2));
        this.f16199s = y13;
        z.f42723r.getClass();
        z a14 = z.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        String d = a14.f42732o.f42663a.b().d(g0.f71511u1);
        this.f16200t = d;
        e eVar = this.f16201u;
        eVar.f64437f = R.drawable.ic_machine_settings;
        eVar.f64438g = d;
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            b.a aVar = b.f16203q;
            String str = this.f16199s;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar.getClass();
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            bVar.setArguments(bundle2);
            String str2 = this.f16200t;
            if (str2 != null) {
                s1(bVar, str2, true);
            } else {
                r.i("title");
                throw null;
            }
        }
    }

    @Override // pl0.c
    public final e r1() {
        return this.f16201u;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/RobotSettingsActivity$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
