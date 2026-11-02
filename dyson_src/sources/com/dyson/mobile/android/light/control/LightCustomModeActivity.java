package com.dyson.mobile.android.light.control;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.light.control.b;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.j0;
import rf0.i0;
import we1.a;
import x12.r;
import yd0.c;
import zs0.e;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightCustomModeActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightCustomModeActivity extends bt0.f<bt0.c> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f14775u = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public String f14776p;

    /* renamed from: q  reason: collision with root package name */
    public int f14777q;

    /* renamed from: r  reason: collision with root package name */
    public int f14778r;

    /* renamed from: s  reason: collision with root package name */
    public og0.a f14779s;

    /* renamed from: t  reason: collision with root package name */
    public pf0.c f14780t;

    @Override // androidx.core.app.ComponentActivity
    public final void R0() {
        r1();
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b(null, 1, null);
    }

    @Override // bt0.f, f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.I() == 0) {
            r1();
        } else {
            supportFragmentManager.V();
        }
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRA_COLOUR_TEMPERATURE_VALUE", "EXTRA_BRIGHTNESS_VALUE");
        String y13 = o0.y("COORDINATOR_ID", a14);
        this.f14776p = y13;
        yd0.c.f89775o.getClass();
        yd0.c a15 = c.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        ke0.d dVar = a15.f89779j;
        this.f14779s = dVar.c();
        this.f14780t = j0.a(dVar.f47424b);
        this.f14777q = a14.getInt("EXTRA_COLOUR_TEMPERATURE_VALUE");
        this.f14778r = a14.getInt("EXTRA_BRIGHTNESS_VALUE");
        e1();
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            pf0.c q13 = q1();
            og0.a aVar = this.f14779s;
            if (aVar == null) {
                r.i("machineDataObject");
                throw null;
            }
            String d = q13.d(aVar.b(og0.d.light_custom_mode));
            b.a aVar2 = b.f14800k;
            String str = this.f14776p;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            int i13 = this.f14777q;
            int i14 = this.f14778r;
            aVar2.getClass();
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            bundle2.putInt("EXTRA_COLOUR_TEMPERATURE_VALUE", i13);
            bundle2.putInt("EXTRA_BRIGHTNESS_VALUE", i14);
            bVar.setArguments(bundle2);
            o1(bVar, d, null, null);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public final pf0.c q1() {
        pf0.c cVar = this.f14780t;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final void r1() {
        e.a a13 = new zs0.e(this).a();
        pf0.c q13 = q1();
        og0.a aVar = this.f14779s;
        if (aVar == null) {
            r.i("machineDataObject");
            throw null;
        }
        a13.f93107a = q13.d(aVar.b(og0.d.light_closeCustomModes_alertTitle));
        pf0.c q14 = q1();
        og0.a aVar2 = this.f14779s;
        if (aVar2 == null) {
            r.i("machineDataObject");
            throw null;
        }
        a13.f93108b = q14.d(aVar2.b(og0.d.light_closeCustomModes_alertMessage));
        a13.c(q1().d(i0.P8), new a20.a(this, 13));
        a13.b(q1().d(i0.Q8), null);
        a13.a().show();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightCustomModeActivity$a;", "", "<init>", "()V", "", "EXTRA_COLOUR_TEMPERATURE_VALUE", "Ljava/lang/String;", "EXTRA_BRIGHTNESS_VALUE", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
