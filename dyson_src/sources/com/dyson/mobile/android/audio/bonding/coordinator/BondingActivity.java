package com.dyson.mobile.android.audio.bonding.coordinator;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import dk.m;
import f.j;
import f.q;
import f.x;
import fm1.o0;
import in0.l;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf0.c;
import rf0.i0;
import uf0.g;
import vj.f;
import we1.a;
import x12.r;
import xj.a;
import zs0.e;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/coordinator/BondingActivity;", "Ll/b;", "Lxj/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BondingActivity extends l.b implements xj.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12369m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public c f12370j;

    /* renamed from: k  reason: collision with root package name */
    public l f12371k;

    /* renamed from: l  reason: collision with root package name */
    public f f12372l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/bonding/coordinator/BondingActivity$b", "Lf/q;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends q {
        public b() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            a aVar = BondingActivity.f12369m;
            BondingActivity.this.c1();
        }
    }

    @Override // xj.b
    public final void a(hn.b bVar) {
        bVar.getClass();
        f fVar = this.f12372l;
        if (fVar != null) {
            fVar.u(this, bVar);
        } else {
            r.i("coordinator");
            throw null;
        }
    }

    public final void c1() {
        e.a a13 = new e(this).a();
        c cVar = this.f12370j;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        a13.f93107a = cVar.d(rf0.q.Y3);
        c cVar2 = this.f12370j;
        if (cVar2 == null) {
            r.i("localisationManager");
            throw null;
        }
        a13.f93108b = cVar2.d(rf0.q.f72342b4);
        a13.f93110f = true;
        c cVar3 = this.f12370j;
        if (cVar3 == null) {
            r.i("localisationManager");
            throw null;
        }
        a13.c(cVar3.d(i0.P8), new vx0.f(this, 9));
        c cVar4 = this.f12370j;
        if (cVar4 == null) {
            r.i("localisationManager");
            throw null;
        }
        a13.b(cVar4.d(i0.Q8), null);
        a13.a().show();
    }

    public final void d1() {
        in0.f fVar;
        l lVar = this.f12371k;
        if (lVar == null) {
            r.i("pairAudioScreenType");
            throw null;
        }
        if (lVar == l.INITIAL_AUDIO_PAIRING && (fVar = g.a(this).f81923b.get()) != null) {
            fVar.c(this);
        }
        finish();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        DysonActionBar dysonActionBar;
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the getInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRA_PAIR_AUDIO_TYPE");
        Serializable c13 = k7.b.c(a14, "EXTRA_PAIR_AUDIO_TYPE", l.class);
        if (c13 == null) {
            pa.c.w("EXTRA_PAIR_AUDIO_TYPE was null");
            return;
        }
        this.f12371k = (l) c13;
        String y13 = o0.y("COORDINATOR_ID", a14);
        f.f84306m.getClass();
        f a15 = f.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12372l = a15;
        this.f12370j = a15.f84312l.f();
        m mVar = (m) q8.g.d(this, R.layout.activity_bonding);
        if (mVar != null && (dysonActionBar = mVar.d) != null) {
            dysonActionBar.x(this);
        }
        a.C2635a c2635a = xj.a.f87668g;
        f fVar = this.f12372l;
        if (fVar == null) {
            r.i("coordinator");
            throw null;
        }
        String str = fVar.f84308h;
        l lVar = this.f12371k;
        if (lVar == null) {
            r.i("pairAudioScreenType");
            throw null;
        }
        c2635a.getClass();
        str.getClass();
        xj.a aVar = new xj.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        bundle2.putSerializable("PAIR_AUDIO_TYPE", lVar);
        aVar.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.i(R.id.fragment_container, aVar, "BleBondingFragment");
        aVar2.n(true, true);
        getOnBackPressedDispatcher().a(this, new b());
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        c1();
        return false;
    }

    @Override // xj.b
    public final void p0() {
        d1();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/coordinator/BondingActivity$a;", "", "<init>", "()V", "", "EXTRA_PAIR_AUDIO_TYPE", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
