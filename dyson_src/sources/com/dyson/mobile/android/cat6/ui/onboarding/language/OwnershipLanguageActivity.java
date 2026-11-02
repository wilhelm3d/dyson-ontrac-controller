package com.dyson.mobile.android.cat6.ui.onboarding.language;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import bt0.g;
import com.dyson.mobile.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq.d;
import pf0.c;
import qq.h3;
import rf0.i0;
import vx0.f;
import we1.a;
import x12.r;
import y9.q0;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/OwnershipLanguageActivity;", "Lbt0/g;", "<init>", "()V", "a", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipLanguageActivity extends g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f12893l = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public c f12894k;

    public final c d1() {
        c cVar = this.f12894k;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the getInstance method";
        a13.a("COORDINATOR_ID");
        String stringExtra = getIntent().getStringExtra("COORDINATOR_ID");
        if (stringExtra == null) {
            pa.c.p("Required value was null.");
            return;
        }
        d.f52535n.getClass();
        d a14 = d.a.a(stringExtra);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12894k = h3.b(a14.f52538i.f64576a);
        mq.a aVar = (mq.a) q8.g.d(this, R.layout.activity_ownership_language_screen);
        aVar.d.x(this);
        Fragment D = getSupportFragmentManager().D(R.id.nav_host_fragment);
        D.getClass();
        q0 s13 = ((NavHostFragment) D).s();
        ys.d dVar = new ys.d(stringExtra);
        Bundle bundle2 = new Bundle();
        bundle2.putString("coordinatorId", dVar.f90421a);
        s13.p(R.navigation.nav_graph_ownership_language, bundle2);
        s13.a(new bi.a(2, aVar, this));
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        e.a a13 = new e(this).a();
        a13.f93107a = d1().d(i0.N9);
        a13.f93108b = d1().d(i0.O9);
        a13.f93110f = true;
        a13.c(d1().d(i0.P8), new f(this, 10));
        a13.b(d1().d(i0.Q8), null);
        a13.a().show();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/OwnershipLanguageActivity$a;", "", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
