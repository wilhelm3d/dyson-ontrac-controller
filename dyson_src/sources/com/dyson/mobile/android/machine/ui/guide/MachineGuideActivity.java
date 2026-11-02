package com.dyson.mobile.android.machine.ui.guide;

import af1.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machine.ui.guide.MachineGuideActivity;
import com.dyson.mobile.android.machinetype.ConnectedConfiguration;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.resources.view.activities.connectivityissue.ConnectivityIssueActivity;
import com.dyson.mobile.android.support.common.Action;
import com.dyson.mobile.android.support.common.Step;
import com.dyson.mobile.android.support.guide.Diagnosis;
import com.dyson.mobile.android.support.guide.Section;
import com.dyson.mobile.android.support.guide.View;
import dz1.x;
import e71.n;
import en0.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import mz1.f;
import pl0.c;
import pl0.e;
import rf0.i0;
import rl0.b;
import rl0.d;
import sl0.a;
import sz1.t;
import t2.e1;
import t81.h;
import tg0.v1;
import uf0.g;
import w81.d;
import we1.a;
import x12.r;
import z32.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/guide/MachineGuideActivity;", "Lpl0/c;", "Lrl0/b;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineGuideActivity extends c implements b {

    /* renamed from: y  reason: collision with root package name */
    public static final a f15355y = new a(null);

    /* renamed from: s  reason: collision with root package name */
    public d f15356s;

    /* renamed from: t  reason: collision with root package name */
    public pf0.c f15357t;

    /* renamed from: u  reason: collision with root package name */
    public g f15358u;

    /* renamed from: v  reason: collision with root package name */
    public MachineDefinition f15359v;

    /* renamed from: w  reason: collision with root package name */
    public String f15360w;

    /* renamed from: x  reason: collision with root package name */
    public String f15361x;

    @Override // rl0.b
    public final void C0(Section section) {
        section.getClass();
        d.a aVar = w81.d.f85442h;
        LocalisationKey localisationKey = i0.f71839s5;
        aVar.getClass();
        q1(d.a.a(1, false, localisationKey), section.k());
    }

    @Override // rl0.b
    public final void J0(Section section) {
        section.getClass();
        List<View> m13 = section.m();
        if (m13 != null) {
            b.a aVar = en0.b.d;
            String str = t1().f73409k;
            aVar.getClass();
            q1(b.a.b(str, m13), section.k());
        }
    }

    @Override // rl0.b
    public final void S(List<Section> list) {
        list.getClass();
        sl0.a.e.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("SECTIONS", new ArrayList<>(list));
        sl0.a aVar = new sl0.a();
        aVar.setArguments(bundle);
        String str = this.f15360w;
        if (str != null) {
            s1(aVar, str, true);
        } else {
            r.i("guideTitle");
            throw null;
        }
    }

    @Override // rl0.b
    public final void Z(Diagnosis diagnosis) {
        diagnosis.getClass();
        a.C2221a c2221a = sl0.a.e;
        List<Action> i13 = diagnosis.i();
        c2221a.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("ACTIONS", new ArrayList<>(i13));
        sl0.a aVar = new sl0.a();
        aVar.setArguments(bundle);
        q1(aVar, diagnosis.j());
    }

    @Override // rl0.b
    public final void a0(Section section) {
        section.getClass();
        a.C2221a c2221a = sl0.a.e;
        List<Diagnosis> i13 = section.i();
        c2221a.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("DIAGNOSES", new ArrayList<>(i13));
        sl0.a aVar = new sl0.a();
        aVar.setArguments(bundle);
        q1(aVar, section.k());
    }

    @Override // rl0.b
    public final void c(Section section) {
        rl0.b m13;
        rl0.b m14;
        section.getClass();
        rl0.d t13 = t1();
        String l13 = section.l();
        if (l13 != null) {
            switch (l13.hashCode()) {
                case -1955236909:
                    if (l13.equals("DiagnosticContentSection") && (m13 = t13.m()) != null) {
                        m13.a0(section);
                        return;
                    }
                    return;
                case -1763538484:
                    if (!l13.equals("CarouselContentSection")) {
                        return;
                    }
                    break;
                case 136138478:
                    if (l13.equals("ContactDetailsContentSection") && (m14 = t13.m()) != null) {
                        m14.C0(section);
                        return;
                    }
                    return;
                case 1427748932:
                    if (!l13.equals("AnnotatedCarouselContentSection")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            rl0.b m15 = t13.m();
            if (m15 != null) {
                m15.J0(section);
            }
        }
    }

    @Override // rl0.b
    public final void d(Section section) {
        List<View> m13 = section.m();
        if (m13 != null) {
            b.a aVar = en0.b.d;
            String str = t1().f73409k;
            aVar.getClass();
            s1(b.a.b(str, m13), section.k(), false);
        }
    }

    @Override // rl0.b
    public final void e(Action action) {
        action.getClass();
        b.a aVar = en0.b.d;
        List<Step> j8 = action.j();
        String str = t1().f73409k;
        aVar.getClass();
        q1(b.a.a(str, j8), action.i());
    }

    @Override // pl0.c, bt0.f
    public final bt0.a i1() {
        return t1();
    }

    @Override // rl0.b
    public final void k() {
        if (this.f15358u != null) {
            ConnectivityIssueActivity.f1(this, new iz1.a(this) { // from class: rl0.a

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ MachineGuideActivity f73404b;

                {
                    this.f73404b = this;
                }

                @Override // iz1.a
                public final void run() {
                    int i13 = r2;
                    MachineGuideActivity machineGuideActivity = this.f73404b;
                    switch (i13) {
                        case 0:
                            MachineGuideActivity.a aVar = MachineGuideActivity.f15355y;
                            machineGuideActivity.u1();
                            return;
                        default:
                            if (machineGuideActivity.f15358u != null) {
                                machineGuideActivity.finish();
                                return;
                            } else {
                                r.i("machineCoordinator");
                                throw null;
                            }
                    }
                }
            }, new iz1.a(this) { // from class: rl0.a

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ MachineGuideActivity f73404b;

                {
                    this.f73404b = this;
                }

                @Override // iz1.a
                public final void run() {
                    int i13 = r2;
                    MachineGuideActivity machineGuideActivity = this.f73404b;
                    switch (i13) {
                        case 0:
                            MachineGuideActivity.a aVar = MachineGuideActivity.f15355y;
                            machineGuideActivity.u1();
                            return;
                        default:
                            if (machineGuideActivity.f15358u != null) {
                                machineGuideActivity.finish();
                                return;
                            } else {
                                r.i("machineCoordinator");
                                throw null;
                            }
                    }
                }
            });
        } else {
            r.i("machineCoordinator");
            throw null;
        }
    }

    @Override // pl0.c, bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        g a13 = g.a(this);
        a13.getClass();
        this.f15358u = a13;
        sg0.b bVar = a13.f81922a;
        v1 v1Var = bVar.f76086a;
        h hVar = bVar.f76107l0.get();
        bVar.f76088b.getClass();
        n.f26183r.getClass();
        g71.a a14 = n.a.a().a();
        tj.a aVar = bVar.f76098h.get();
        i iVar = bVar.f76114p.get();
        v1Var.getClass();
        hVar.getClass();
        aVar.getClass();
        iVar.getClass();
        this.f15356s = new rl0.d(hVar, a14, aVar.c(), iVar);
        this.f15357t = bVar.c();
        Bundle extras = getIntent().getExtras();
        we1.a.f85708c.getClass();
        we1.a b13 = a.C2547a.b(extras);
        b13.f85710b = "Machine Guide cannot be started without machine type";
        b13.a("MACHINE_DEFINITION");
        Intent intent = getIntent();
        intent.getClass();
        Object a15 = k7.b.a(cd.b.I(intent), "MACHINE_DEFINITION", MachineDefinition.class);
        if (a15 == null) {
            pa.c.w("MACHINE_DEFINITION was null");
            return;
        }
        this.f15359v = (MachineDefinition) ((Parcelable) a15);
        Object a16 = c7.c.a(getIntent(), "TITLE", LocalisationKey.class);
        pf0.c cVar = this.f15357t;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        this.f15360w = cVar.d((LocalisationKey) a16);
        this.f15361x = getIntent().getStringExtra("SECTION");
        rl0.d t13 = t1();
        t13.f73410l.setValue(t13, rl0.d.f73405o[0], this);
        getLifecycle().a(t1());
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f15356s != null) {
            getLifecycle().c(t1());
        }
    }

    @Override // pl0.c, bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            ut0.a s13 = ut0.a.s(1, null);
            String str = this.f15360w;
            if (str == null) {
                r.i("guideTitle");
                throw null;
            }
            s1(s13, str, false);
        }
        u1();
    }

    @Override // pl0.c
    public final e r1() {
        return t1();
    }

    public final rl0.d t1() {
        rl0.d dVar = this.f15356s;
        if (dVar != null) {
            return dVar;
        }
        r.i("machineGuideViewModel");
        throw null;
    }

    public final void u1() {
        String str;
        rl0.d t13 = t1();
        MachineDefinition machineDefinition = this.f15359v;
        if (machineDefinition == null) {
            r.i("machineDefinition");
            throw null;
        }
        String str2 = this.f15360w;
        if (str2 == null) {
            r.i("guideTitle");
            throw null;
        }
        String str3 = this.f15361x;
        e42.d dVar = t13.f73412n;
        t13.f64437f = R.drawable.ic_product_guide;
        t13.f64438g = str2;
        ConnectedConfiguration connectedConfiguration = machineDefinition.f15561i;
        yf1.b a13 = (connectedConfiguration == null || (str = connectedConfiguration.f15553g) == null) ? rl0.d.f73406p : ln0.d.a(str);
        h hVar = t13.f73407i;
        t81.d dVar2 = new t81.d(hVar.d.b("-"), hVar.f78851a, hVar.e);
        String str4 = machineDefinition.d.d;
        String str5 = a13.f89900j;
        str5.getClass();
        x<z52.i0> b13 = dVar2.f78840b.b(str4, dVar2.f78839a, str5);
        so0.e eVar = new so0.e(new e1(dVar2, 2), 18);
        b13.getClass();
        b.a aVar = kz1.b.f50218a;
        t13.f73411m = (f) new t(b13, eVar).r(c02.a.f10004c).j(fz1.a.a()).p(new rl0.c(new qv1.i(28, str3, t13), 0), new rl0.c(new qv1.i(29, t13, machineDefinition), 1));
        if (machineDefinition.n(MachineCategory.HAIRCARE)) {
            g0.r(dVar, null, null, new rl0.e(t13, null), 3);
        } else if (machineDefinition.n(MachineCategory.FLOORCARE)) {
            g0.r(dVar, null, null, new rl0.f(t13, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/guide/MachineGuideActivity$a;", "", "<init>", "()V", "", "ARG_MACHINE_DEFINITION", "Ljava/lang/String;", "ARG_TITLE", "ARG_SECTION", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, MachineDefinition machineDefinition, LocalisationKey localisationKey, String str) {
            context.getClass();
            machineDefinition.getClass();
            localisationKey.getClass();
            Intent intent = new Intent(context, MachineGuideActivity.class);
            intent.putExtra("MACHINE_DEFINITION", machineDefinition);
            intent.putExtra("TITLE", localisationKey);
            intent.putExtra("SECTION", str);
            return intent;
        }

        private a() {
        }
    }
}
