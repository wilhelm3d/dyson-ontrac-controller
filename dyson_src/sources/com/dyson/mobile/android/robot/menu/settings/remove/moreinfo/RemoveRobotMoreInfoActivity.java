package com.dyson.mobile.android.robot.menu.settings.remove.moreinfo;

import android.content.Intent;
import android.os.Bundle;
import bt0.b;
import bt0.d;
import com.dyson.mobile.android.robot.menu.settings.remove.moreinfo.a;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import rf0.g0;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/remove/moreinfo/RemoveRobotMoreInfoActivity;", "Lbt0/d;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoveRobotMoreInfoActivity extends d {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16228n = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public String f16229l;

    /* renamed from: m  reason: collision with root package name */
    public final b f16230m = new b(null, 1, null);

    @Override // bt0.d
    public final bt0.a d1() {
        return this.f16230m;
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RemoveRobotMoreInfoActivity cannot be initialised without the required arguments, please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f16229l = y13;
        z.f42723r.getClass();
        z a14 = z.a.a(y13);
        if (a14 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        this.f16230m.l(a14.f42732o.f42663a.b().d(g0.F1));
    }

    @Override // bt0.d, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a.C0559a c0559a = com.dyson.mobile.android.robot.menu.settings.remove.moreinfo.a.e;
        String str = this.f16229l;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        c0559a.getClass();
        com.dyson.mobile.android.robot.menu.settings.remove.moreinfo.a aVar = new com.dyson.mobile.android.robot.menu.settings.remove.moreinfo.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar.setArguments(bundle2);
        e1(aVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/remove/moreinfo/RemoveRobotMoreInfoActivity$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
