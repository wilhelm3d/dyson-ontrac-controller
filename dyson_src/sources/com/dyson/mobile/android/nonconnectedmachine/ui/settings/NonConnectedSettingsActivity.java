package com.dyson.mobile.android.nonconnectedmachine.ui.settings;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import cd.b;
import com.dyson.mobile.android.R;
import do0.a;
import fm1.o0;
import h12.p;
import in0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pl0.c;
import pl0.e;
import rf0.i0;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/nonconnectedmachine/ui/settings/NonConnectedSettingsActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-non-connected-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NonConnectedSettingsActivity extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final a f15582w = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public pf0.c f15583s;

    /* renamed from: t  reason: collision with root package name */
    public e f15584t;

    /* renamed from: u  reason: collision with root package name */
    public String f15585u;

    /* renamed from: v  reason: collision with root package name */
    public String f15586v = "";

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (b.J(this)) {
            super.onCreate(null);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method to create NonConnectedSettingsActivity";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f15585u = y13;
        sn0.b.f76619l.getClass();
        in0.a.e.getClass();
        sn0.b bVar = (sn0.b) a.C1330a.a(y13);
        if (bVar == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        pf0.c cVar = new pf0.e(bVar.f76622i.f82309a.f84677a).f64085a;
        cVar.getClass();
        this.f15583s = cVar;
        super.onCreate(bundle);
        pf0.c cVar2 = this.f15583s;
        if (cVar2 == null) {
            r.i("localisationManager");
            throw null;
        }
        this.f15586v = cVar2.d(i0.f71842s8);
        e eVar = new e();
        this.f15584t = eVar;
        String str = this.f15586v;
        eVar.f64437f = R.drawable.ic_machine_settings;
        eVar.f64438g = str;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.f4309o.add(new bt0.e(supportFragmentManager, 1));
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            a.C0837a c0837a = do0.a.f24556l;
            String str = this.f15585u;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            c0837a.getClass();
            do0.a aVar = new do0.a();
            aVar.setArguments(k7.c.a(new p("COORDINATOR_ID", str)));
            s1(aVar, this.f15586v, false);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // pl0.c, bt0.f
    /* renamed from: r1 */
    public final e i1() {
        e eVar = this.f15584t;
        if (eVar != null) {
            return eVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/nonconnectedmachine/ui/settings/NonConnectedSettingsActivity$a;", "", "<init>", "()V", "mod-non-connected-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
