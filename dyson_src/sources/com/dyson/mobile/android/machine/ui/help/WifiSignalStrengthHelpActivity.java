package com.dyson.mobile.android.machine.ui.help;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.R;
import f.j;
import f.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import mg0.i;
import nj.p7;
import nj.q7;
import pf0.c;
import q8.n;
import rf0.i0;
import se1.q0;
import tg0.v1;
import tl0.b;
import uf0.g;
import we1.a;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/help/WifiSignalStrengthHelpActivity;", "Ll/b;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WifiSignalStrengthHelpActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f15362l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public tl0.b f15363j;

    /* renamed from: k  reason: collision with root package name */
    public final b f15364k = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/ui/help/WifiSignalStrengthHelpActivity$b", "Ltl0/a;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements tl0.a {
        public b() {
        }

        @Override // tl0.a
        public final void a() {
            WifiSignalStrengthHelpActivity wifiSignalStrengthHelpActivity = WifiSignalStrengthHelpActivity.this;
            g.a(wifiSignalStrengthHelpActivity).getClass();
            ul0.a.e.getClass();
            new ul0.a().show(wifiSignalStrengthHelpActivity.getSupportFragmentManager(), "WifiSignalStrengthHelpDialog");
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "WifiSignalStrengthHelpActivity cannot be initialised without the required arguments, please use the newInstance method";
        a13.a("EXTRA_RSSI_STATE");
        sg0.b bVar = g.a(this).f81922a;
        v1 v1Var = bVar.f76086a;
        c c13 = bVar.c();
        v1Var.getClass();
        this.f15363j = new tl0.b(c13);
        i iVar = (i) q8.g.d(this, R.layout.activity_wifi_signal_strength_help);
        tl0.b bVar2 = this.f15363j;
        if (bVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        iVar.l(bVar2);
        iVar.f53933h.x(this);
        tl0.b bVar3 = this.f15363j;
        if (bVar3 == null) {
            r.i("viewModel");
            throw null;
        }
        bVar3.f79918b.setValue(bVar3, tl0.b.f79916f[0], this.f15364k);
        View findViewById = findViewById(R.id.signal_strength_help_screen);
        if (findViewById != null) {
            q0.a(519, findViewById);
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("EXTRA_RSSI_STATE");
        if (stringExtra == null) {
            pa.c.p("Required value was null.");
            return;
        }
        p70.b valueOf = p70.b.valueOf(stringExtra);
        tl0.b bVar = this.f15363j;
        if (bVar == null) {
            r.i("viewModel");
            throw null;
        }
        ObservableInt observableInt = bVar.e;
        n<String> nVar = bVar.d;
        n<String> nVar2 = bVar.f79919c;
        c cVar = bVar.f79917a;
        valueOf.getClass();
        int i13 = b.a.f79920a[valueOf.ordinal()];
        if (i13 == 1) {
            nVar2.m(cVar.d(i0.Eb));
            nVar.m(cVar.d(i0.Fb));
            observableInt.l(8);
        } else if (i13 == 2) {
            nVar2.m(cVar.d(i0.f71785ob));
            nVar.m(cVar.d(i0.f71800pb));
            observableInt.l(0);
            int i14 = q7.f57663a;
            w.t("machine.wifi_strength.wifi_strength_explanation_weak", null, 2, null);
        } else if (i13 != 3 && i13 != 4) {
            e.o();
        } else {
            nVar2.m(cVar.d(i0.f71875ub));
            nVar.m(cVar.d(i0.f71890vb));
            observableInt.l(8);
            int i15 = p7.f57646a;
            w.t("machine.wifi_strength.wifi_strength_explanation_good_or_fair", null, 2, null);
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/help/WifiSignalStrengthHelpActivity$a;", "", "<init>", "()V", "", "EXTRA_RSSI_STATE", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
