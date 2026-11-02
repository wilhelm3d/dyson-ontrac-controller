package com.dyson.mobile.android.audio.home571.external;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.home571.external.a;
import dk.k;
import f.j;
import f.x;
import fm1.o0;
import h12.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import q8.g;
import se1.q0;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/external/AutoUpdateExternalLocationPrerequisiteActivity;", "Ll/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoUpdateExternalLocationPrerequisiteActivity extends b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f12596k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f12597l = R.anim.slide_in_up;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12598m = R.anim.stay;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12599n = R.anim.slide_out_down;

    /* renamed from: j  reason: collision with root package name */
    public String f12600j;

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(f12598m, f12599n);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        this.f12600j = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        ((k) g.d(this, R.layout.activity_auto_update_external_location_prerequisite)).e.x(this);
        a.C0352a c0352a = com.dyson.mobile.android.audio.home571.external.a.f12601i;
        String str = this.f12600j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        c0352a.getClass();
        com.dyson.mobile.android.audio.home571.external.a aVar2 = new com.dyson.mobile.android.audio.home571.external.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar2.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
        aVar3.g(R.id.fragment_container, aVar2, null, 1);
        aVar3.f();
        overridePendingTransition(f12597l, f12598m);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/external/AutoUpdateExternalLocationPrerequisiteActivity$a;", "", "<init>", "()V", "", "ACTIVITY_ENTER_ANIMATION", "I", "ACTIVITY_STAY_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
