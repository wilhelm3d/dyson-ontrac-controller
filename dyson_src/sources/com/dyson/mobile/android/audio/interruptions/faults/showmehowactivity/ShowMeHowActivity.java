package com.dyson.mobile.android.audio.interruptions.faults.showmehowactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.interruptions.faults.showmehowactivity.ShowMeHowActivity;
import dk.o;
import f.j;
import f.x;
import fm1.o0;
import hk.g5;
import hn.c;
import hn.d;
import hn.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import nj.ie;
import nj.je;
import nj.ke;
import q8.g;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/interruptions/faults/showmehowactivity/ShowMeHowActivity;", "Ll/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShowMeHowActivity extends b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f12690k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f12691l = R.anim.slide_in_up;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12692m = R.anim.stay;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12693n = R.anim.slide_out_down;

    /* renamed from: j  reason: collision with root package name */
    public e f12694j;

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(f12692m, f12693n);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        c aVar;
        ij.b bVar;
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method";
        Bundle a14 = a13.a("COORDINATOR_ID");
        String y13 = o0.y("COORDINATOR_ID", a14);
        f.f84306m.getClass();
        f a15 = f.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar2 = a15.f84312l;
        g5 g5Var = aVar2.f34906a;
        d dVar = new d(hk.x.b(aVar2.f34911b));
        pf0.c f13 = aVar2.f();
        hj.e eVar = aVar2.f35005u0.get();
        g5Var.getClass();
        eVar.getClass();
        this.f12694j = new e(dVar, f13, eVar);
        String name = hn.b.class.getName();
        Serializable c13 = k7.b.c(a14, name, hn.b.class);
        if (c13 == null) {
            fo1.a.o(name.concat(" was null"));
            return;
        }
        hn.b bVar2 = (hn.b) c13;
        e eVar2 = this.f12694j;
        if (eVar2 == null) {
            r.i("showMeHowViewModel");
            throw null;
        }
        pf0.c cVar = eVar2.f39376b;
        d dVar2 = eVar2.f39375a;
        int i13 = d.a.f39374a[bVar2.ordinal()];
        if (i13 == 1) {
            aVar = new c.a(bVar2.getTitleKey(), bVar2.getDescriptionKey(), "insert_filters_black_loop.json");
        } else if (i13 == 2) {
            aVar = dVar2.a(bVar2, ek.e.HOW_TO_RESTART);
        } else if (i13 == 3) {
            aVar = new c.a(bVar2.getTitleKey(), bVar2.getDescriptionKey(), "attach_visor_loop.json");
        } else if (i13 != 4) {
            ma.e.o();
            return;
        } else {
            aVar = dVar2.a(bVar2, ek.e.HOW_TO_SWITCH_ON);
        }
        if (aVar instanceof c.a) {
            eVar2.d.m(true);
            eVar2.e.m(((c.a) aVar).f39369c);
        } else if (!(aVar instanceof c.b)) {
            ma.e.o();
            return;
        } else {
            eVar2.f39379g.m(true);
            eVar2.f39378f.l(((c.b) aVar).f39372c);
        }
        eVar2.f39380h.m(cVar.d(aVar.b()));
        eVar2.f39381i.m(cVar.d(aVar.a()));
        int i14 = e.a.f39382a[bVar2.ordinal()];
        if (i14 == 1) {
            int i15 = je.f57552a;
            bVar = new ij.b("wearable_ec.help.show_me_insert_filter", null, 2, null);
        } else if (i14 == 2) {
            int i16 = ke.f57569a;
            bVar = new ij.b("wearable_ec.help.show_me_restart_machine", null, 2, null);
        } else if (i14 == 3) {
            int i17 = ie.f57536a;
            bVar = new ij.b("wearable_ec.help.show_me_attach_visor", null, 2, null);
        } else if (i14 != 4) {
            ma.e.o();
            return;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            eVar2.f39377c.h(bVar, null);
        }
        o oVar = (o) g.d(this, R.layout.activity_fault_show_me_how);
        oVar.f24094l.x(this);
        e eVar3 = this.f12694j;
        if (eVar3 == null) {
            r.i("showMeHowViewModel");
            throw null;
        }
        oVar.l(eVar3);
        oVar.e.setOnClickListener(new View.OnClickListener(this) { // from class: hn.a
            public final /* synthetic */ ShowMeHowActivity e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = r2;
                ShowMeHowActivity showMeHowActivity = this.e;
                switch (i18) {
                    case 0:
                        ShowMeHowActivity.a aVar3 = ShowMeHowActivity.f12690k;
                        w81.c.f85438h.getClass();
                        new w81.c().showNow(showMeHowActivity.getSupportFragmentManager(), "ContactDysonDialog");
                        return;
                    default:
                        ShowMeHowActivity.a aVar4 = ShowMeHowActivity.f12690k;
                        showMeHowActivity.getOnBackPressedDispatcher().d();
                        return;
                }
            }
        });
        oVar.f24091i.setOnClickListener(new View.OnClickListener(this) { // from class: hn.a
            public final /* synthetic */ ShowMeHowActivity e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i18 = r2;
                ShowMeHowActivity showMeHowActivity = this.e;
                switch (i18) {
                    case 0:
                        ShowMeHowActivity.a aVar3 = ShowMeHowActivity.f12690k;
                        w81.c.f85438h.getClass();
                        new w81.c().showNow(showMeHowActivity.getSupportFragmentManager(), "ContactDysonDialog");
                        return;
                    default:
                        ShowMeHowActivity.a aVar4 = ShowMeHowActivity.f12690k;
                        showMeHowActivity.getOnBackPressedDispatcher().d();
                        return;
                }
            }
        });
        overridePendingTransition(f12691l, f12692m);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/audio/interruptions/faults/showmehowactivity/ShowMeHowActivity$a;", "", "<init>", "()V", "", "ACTIVITY_ENTER_ANIMATION", "I", "ACTIVITY_STAY_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
