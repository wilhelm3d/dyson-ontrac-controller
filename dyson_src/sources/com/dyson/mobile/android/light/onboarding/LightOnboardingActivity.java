package com.dyson.mobile.android.light.onboarding;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import at0.k;
import com.dyson.mobile.android.R;
import d22.p;
import f.j;
import f.x;
import fm1.o0;
import in0.f;
import je0.g;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.n1;
import q8.t;
import ue0.e;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/onboarding/LightOnboardingActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightOnboardingActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f14915o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public e f14916j;

    /* renamed from: k  reason: collision with root package name */
    public c f14917k;

    /* renamed from: l  reason: collision with root package name */
    public g f14918l;

    /* renamed from: m  reason: collision with root package name */
    public int f14919m;

    /* renamed from: n  reason: collision with root package name */
    public final b f14920n = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/onboarding/LightOnboardingActivity$b", "Lue0/b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ue0.b {
        public b() {
        }

        @Override // ue0.b
        public final void a() {
            LightOnboardingActivity lightOnboardingActivity = LightOnboardingActivity.this;
            lightOnboardingActivity.f14919m = 1;
            g gVar = lightOnboardingActivity.f14918l;
            if (gVar != null) {
                gVar.f44606g.scrollToPosition(1);
            } else {
                r.i("binding");
                throw null;
            }
        }

        @Override // ue0.b
        public final void b() {
            LightOnboardingActivity lightOnboardingActivity = LightOnboardingActivity.this;
            int i13 = lightOnboardingActivity.f14919m + 1;
            lightOnboardingActivity.f14919m = i13;
            d(i13);
        }

        @Override // ue0.b
        public final void c() {
            LightOnboardingActivity lightOnboardingActivity = LightOnboardingActivity.this;
            int i13 = lightOnboardingActivity.f14919m - 1;
            lightOnboardingActivity.f14919m = i13;
            d(i13);
        }

        public final void d(int i13) {
            LightOnboardingActivity lightOnboardingActivity = LightOnboardingActivity.this;
            g gVar = lightOnboardingActivity.f14918l;
            if (gVar == null) {
                r.i("binding");
                throw null;
            }
            gVar.f44606g.scrollToPosition(i13);
            lightOnboardingActivity.c1().a(p.e(i13, 0, 1));
        }

        @Override // ue0.b
        public final void n() {
            LightOnboardingActivity lightOnboardingActivity = LightOnboardingActivity.this;
            c cVar = lightOnboardingActivity.f14917k;
            if (cVar == null) {
                r.i("coordinator");
                throw null;
            }
            f g13 = cVar.g();
            if (g13 != null) {
                g13.d(lightOnboardingActivity, cVar.f89777h);
            }
        }
    }

    public final e c1() {
        e eVar = this.f14916j;
        if (eVar != null) {
            return eVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        c.f89775o.getClass();
        c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14917k = a14;
        d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        og0.a c13 = dVar.c();
        n1Var.getClass();
        this.f14916j = new e(c13);
        super.onCreate(bundle);
        t d = q8.g.d(this, R.layout.activity_light_onboarding);
        d.getClass();
        g gVar = (g) d;
        this.f14918l = gVar;
        gVar.l(c1());
        e c14 = c1();
        c14.f81853g.setValue(c14, e.f81851m[0], this.f14920n);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        g gVar2 = this.f14918l;
        if (gVar2 == null) {
            r.i("binding");
            throw null;
        }
        RecyclerView recyclerView = gVar2.f44606g;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c1().f81852f);
        recyclerView.addItemDecoration(new k());
        s sVar = new s();
        g gVar3 = this.f14918l;
        if (gVar3 == null) {
            r.i("binding");
            throw null;
        }
        sVar.b(gVar3.f44606g);
        g gVar4 = this.f14918l;
        if (gVar4 != null) {
            gVar4.f44606g.addOnScrollListener(new ue0.a(sVar, linearLayoutManager, this));
        } else {
            r.i("binding");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/onboarding/LightOnboardingActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
