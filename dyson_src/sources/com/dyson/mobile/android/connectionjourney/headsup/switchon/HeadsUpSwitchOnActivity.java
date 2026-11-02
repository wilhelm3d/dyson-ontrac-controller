package com.dyson.mobile.android.connectionjourney.headsup.switchon;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.headsup.locatewifi.HeadsUpLocateWifiActivity;
import com.dyson.mobile.android.connectionjourney.headsup.switchon.HeadsUpSwitchOnActivity;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f.x;
import f20.s;
import f20.u;
import f20.w;
import f20.y;
import g.f;
import h12.f0;
import hj.e;
import java.util.List;
import kotlin.Metadata;
import l.b;
import nj.b2;
import o20.d;
import o20.e;
import pf0.c;
import q8.g;
import q8.t;
import u50.j;
import uf0.q;
import w00.i;
import x12.p;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/headsup/switchon/HeadsUpSwitchOnActivity;", "Ll/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HeadsUpSwitchOnActivity extends b {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f13501n = 0;

    /* renamed from: j  reason: collision with root package name */
    public c f13502j;

    /* renamed from: k  reason: collision with root package name */
    public e f13503k;

    /* renamed from: l  reason: collision with root package name */
    public i f13504l;

    /* renamed from: m  reason: collision with root package name */
    public final o20.b f13505m = new d() { // from class: o20.b
        @Override // o20.d
        public final void a() {
            int i13 = HeadsUpSwitchOnActivity.f13501n;
            HeadsUpSwitchOnActivity headsUpSwitchOnActivity = HeadsUpSwitchOnActivity.this;
            List<MachineDescriptor> b13 = j.b(headsUpSwitchOnActivity.c1().e);
            int i14 = i.a.f85129a[j.a(i.c(headsUpSwitchOnActivity).f85124a.j()).ordinal()];
            if (i14 == 1 || i14 == 2) {
                i.w(headsUpSwitchOnActivity, com.dyson.mobile.android.connectionjourney.machinescan.a.a(b13));
            } else {
                headsUpSwitchOnActivity.startActivity(new Intent(headsUpSwitchOnActivity, HeadsUpLocateWifiActivity.class));
            }
        }
    };

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends p implements w12.a<f0> {
        public a(Object obj) {
            super(0, obj, e.class, "onNextButtonClicked", "onNextButtonClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((e) this.receiver).l();
            return f0.f36844a;
        }
    }

    public final e c1() {
        e eVar = this.f13503k;
        if (eVar != null) {
            return eVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        i c13 = i.c(this);
        c13.getClass();
        this.f13504l = c13;
        c13.e.C(this);
        super.onCreate(bundle);
        e c14 = c1();
        c14.d.setValue(c14, e.f59441l[0], this.f13505m);
        if (c1().e.getMachineCategory() == MachineCategory.ROBOT) {
            t d = g.d(this, R.layout.activity_headsup_switch_on_screen_robot);
            d.getClass();
            y yVar = (y) d;
            yVar.l(c1());
            yVar.f29465j.x(this);
        } else if (j.g(c1().e)) {
            t d13 = g.d(this, R.layout.activity_headsup_switch_on_screen_cat6);
            d13.getClass();
            u uVar = (u) d13;
            uVar.l(c1());
            uVar.f29361i.x(this);
        } else if (c1().e.getMachineCategory() == MachineCategory.HAIRCARE) {
            t d14 = g.d(this, R.layout.activity_headsup_switch_on_screen_connected_haircare);
            d14.getClass();
            w wVar = (w) d14;
            wVar.l(c1());
            wVar.f29411j.x(this);
        } else if (c1().e.getMachineCategory() == MachineCategory.ORALCARE) {
            f.a(this, new c4.c(398128857, true, new o20.c(this, 0)));
        } else {
            t d15 = g.d(this, R.layout.activity_headsup_switch_on_screen);
            d15.getClass();
            s sVar = (s) d15;
            sVar.l(c1());
            sVar.f29312i.x(this);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e.f38312g.getClass();
        ((q) e.a.a().a()).d();
        int i13 = b2.f57411a;
        new ij.b("connection_journey.get_started.plug_in_switch_on", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
