package com.dyson.mobile.android.light.settings;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.settings.b;
import fm1.o0;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import pl0.c;
import pl0.e;
import rf0.o;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/settings/LightSettingsActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightSettingsActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f15043x = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public pf0.c f15044s;

    /* renamed from: u  reason: collision with root package name */
    public String f15046u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15048w;

    /* renamed from: t  reason: collision with root package name */
    public e f15045t = new e();

    /* renamed from: v  reason: collision with root package name */
    public String f15047v = "";

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return this.f15045t;
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
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRAS_IS_CONNECTED");
        String y13 = o0.y("COORDINATOR_ID", a14);
        this.f15046u = y13;
        yd0.c.f89775o.getClass();
        yd0.c a15 = c.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a15.f89779j;
        dVar.c();
        this.f15044s = j0.a(dVar.f47424b);
        this.f15048w = a14.getBoolean("EXTRAS_IS_CONNECTED");
        pf0.c cVar = this.f15044s;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        this.f15047v = cVar.d(o.B1);
        e eVar = new e();
        this.f15045t = eVar;
        String str = this.f15047v;
        eVar.f64437f = R.drawable.ic_machine_settings;
        eVar.f64438g = str;
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            b.a aVar = b.f15052l;
            String str = this.f15046u;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            boolean z13 = this.f15048w;
            aVar.getClass();
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            bundle2.putBoolean("EXTRAS_IS_CONNECTED", z13);
            bVar.setArguments(bundle2);
            s1(bVar, this.f15047v, true);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // pl0.c
    public final e r1() {
        return this.f15045t;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/settings/LightSettingsActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
