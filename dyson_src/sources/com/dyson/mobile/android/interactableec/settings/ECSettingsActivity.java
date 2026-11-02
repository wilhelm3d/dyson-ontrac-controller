package com.dyson.mobile.android.interactableec.settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.interactableec.settings.SettingsDestination;
import com.dyson.mobile.android.interactableec.settings.b;
import com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotifications;
import fm1.o0;
import h12.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa0.t0;
import pl0.c;
import pl0.e;
import qm0.a;
import rf0.f;
import rf0.i0;
import vc0.a;
import w90.g;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/ECSettingsActivity;", "Lpl0/c;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECSettingsActivity extends c {

    /* renamed from: x  reason: collision with root package name */
    public static final a f14623x = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public pf0.c f14624s;

    /* renamed from: t  reason: collision with root package name */
    public g f14625t;

    /* renamed from: u  reason: collision with root package name */
    public final e f14626u = new e();

    /* renamed from: v  reason: collision with root package name */
    public String f14627v = "";

    /* renamed from: w  reason: collision with root package name */
    public boolean f14628w;

    @Override // pl0.c, androidx.core.app.ComponentActivity
    public final void R0() {
        super.R0();
        if (this.f14628w) {
            zs0.c.f93105a.getClass();
            zs0.c.c(this);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.f14628w) {
            zs0.c.f93105a.getClass();
            zs0.c.c(this);
        }
    }

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return this.f14626u;
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
        a13.f85710b = "Please use newIntent method to create a ECSettingsActivity Intent";
        Bundle a14 = a13.a("COORDINATOR_ID");
        String y13 = o0.y("COORDINATOR_ID", a14);
        g.f85506o.getClass();
        g a15 = g.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14625t = a15;
        this.f14624s = t0.b(a15.f85510j.f59825a);
        this.f14628w = a14.getBoolean("EXTRA_IS_FROM_829_SETTINGS", false);
        pf0.c cVar = this.f14624s;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        String d = cVar.d(i0.Y7);
        this.f14627v = d;
        e eVar = this.f14626u;
        eVar.f64437f = R.drawable.ic_machine_settings;
        eVar.f64438g = d;
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        u uVar;
        super.onPostCreate(bundle);
        if (bundle == null) {
            SettingsDestination settingsDestination = (SettingsDestination) c7.c.a(getIntent(), "EXTRA_SETTINGS_DESTINATION", SettingsDestination.class);
            if (settingsDestination == null) {
                b.a aVar = b.f14642y;
                g gVar = this.f14625t;
                if (gVar == null) {
                    r.i("coordinator");
                    throw null;
                }
                String str = gVar.f85509i;
                aVar.getClass();
                str.getClass();
                b bVar = new b();
                Bundle bundle2 = new Bundle();
                bundle2.putString("COORDINATOR_ID", str);
                bVar.setArguments(bundle2);
                uVar = new u(bVar, Boolean.TRUE, this.f14627v);
            } else if (settingsDestination instanceof SettingsDestination.ManageNotificationScreen) {
                a.C2023a c2023a = qm0.a.f67222h;
                MachineNotifications machineNotifications = ((SettingsDestination.ManageNotificationScreen) settingsDestination).d;
                c2023a.getClass();
                qm0.a a13 = a.C2023a.a(machineNotifications);
                Boolean bool = Boolean.FALSE;
                pf0.c cVar = this.f14624s;
                if (cVar == null) {
                    r.i("localisationManager");
                    throw null;
                }
                uVar = new u(a13, bool, cVar.d(i0.f71731l5));
            } else if (settingsDestination instanceof SettingsDestination.RemoveMachineScreen) {
                a.C2486a c2486a = vc0.a.f84073l;
                g gVar2 = this.f14625t;
                if (gVar2 == null) {
                    r.i("coordinator");
                    throw null;
                }
                String str2 = gVar2.f85509i;
                boolean z13 = ((SettingsDestination.RemoveMachineScreen) settingsDestination).d;
                c2486a.getClass();
                str2.getClass();
                vc0.a aVar2 = new vc0.a();
                Bundle bundle3 = new Bundle();
                bundle3.putString("COORDINATOR_ID", str2);
                bundle3.putBoolean("ARG_USER_IS_OWNER", z13);
                aVar2.setArguments(bundle3);
                Boolean bool2 = Boolean.FALSE;
                pf0.c cVar2 = this.f14624s;
                if (cVar2 == null) {
                    r.i("localisationManager");
                    throw null;
                }
                uVar = new u(aVar2, bool2, cVar2.d(i0.f71842s8));
            } else if (!(settingsDestination instanceof SettingsDestination.SetManualLocationScreen)) {
                ma.e.o();
                return;
            } else {
                om0.b s13 = om0.b.s(((SettingsDestination.SetManualLocationScreen) settingsDestination).d);
                Boolean bool3 = Boolean.FALSE;
                pf0.c cVar3 = this.f14624s;
                if (cVar3 == null) {
                    r.i("localisationManager");
                    throw null;
                }
                uVar = new u(s13, bool3, cVar3.d(f.T0));
            }
            s1((Fragment) uVar.d, (String) uVar.f36852f, ((Boolean) uVar.e).booleanValue());
        }
    }

    @Override // pl0.c
    public final e r1() {
        return this.f14626u;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/ECSettingsActivity$a;", "", "<init>", "()V", "", "EXTRA_SETTINGS_DESTINATION", "Ljava/lang/String;", "EXTRA_IS_FROM_829_SETTINGS", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Activity activity, String str, SettingsDestination settingsDestination, boolean z13) {
            activity.getClass();
            str.getClass();
            Intent putExtra = new Intent(activity, ECSettingsActivity.class).putExtra("COORDINATOR_ID", str).putExtra("EXTRA_IS_FROM_829_SETTINGS", z13);
            putExtra.getClass();
            if (settingsDestination != null) {
                putExtra.putExtra("EXTRA_SETTINGS_DESTINATION", settingsDestination);
            }
            return putExtra;
        }

        private a() {
        }
    }
}
