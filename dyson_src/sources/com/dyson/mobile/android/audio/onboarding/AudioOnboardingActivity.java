package com.dyson.mobile.android.audio.onboarding;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.home.customisation.CustomisationActivity;
import f.x;
import fm1.o0;
import gf1.j;
import go.h;
import go.l;
import h12.e;
import h12.y;
import ho.a;
import ho.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import vj.d;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/onboarding/AudioOnboardingActivity;", "Lbt0/g;", "Lgo/l;", "Lho/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioOnboardingActivity extends g implements l, b {

    /* renamed from: p  reason: collision with root package name */
    public static final a f12695p = new a(null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f12696q = R.anim.slide_in_up;

    /* renamed from: r  reason: collision with root package name */
    public static final int f12697r = R.anim.stay;

    /* renamed from: s  reason: collision with root package name */
    public static final int f12698s = R.anim.slide_out_down;

    /* renamed from: k  reason: collision with root package name */
    public f f12699k;

    /* renamed from: l  reason: collision with root package name */
    public String f12700l;

    /* renamed from: m  reason: collision with root package name */
    public go.f f12701m;

    /* renamed from: n  reason: collision with root package name */
    public dk.g f12702n;

    /* renamed from: o  reason: collision with root package name */
    public final ActivityResultLauncher<Intent> f12703o = registerForActivityResult(new j.a(), new j(this, 23));

    @Override // go.l
    public final void C() {
        f fVar = this.f12699k;
        if (fVar == null) {
            r.i("coordinator");
            throw null;
        }
        ActivityResultLauncher<Intent> activityResultLauncher = this.f12703o;
        activityResultLauncher.getClass();
        CustomisationActivity.a aVar = CustomisationActivity.f12446m;
        String str = fVar.f84308h;
        aVar.getClass();
        str.getClass();
        Intent intent = new Intent(this, CustomisationActivity.class);
        intent.putExtra("COORDINATOR_ID", str);
        intent.putExtra("OPENED_FROM_ONBOARDING", true);
        activityResultLauncher.a(intent);
    }

    @Override // go.l
    public final void M() {
        f fVar = this.f12699k;
        if (fVar == null) {
            r.i("coordinator");
            throw null;
        }
        in0.f g13 = fVar.g();
        if (g13 != null) {
            g13.d(this, fVar.f84308h);
        }
    }

    @Override // go.l
    public final void b(Integer num) {
        dk.g gVar = this.f12702n;
        if (gVar == null) {
            r.i("binding");
            throw null;
        }
        gVar.d.setAlpha(0.5f);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        a.C1222a c1222a = ho.a.f39427j;
        String str = this.f12700l;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        c1222a.getClass();
        ho.a aVar2 = new ho.a();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        bundle.putInt("OnboardingVideoCueIndex", num != null ? num.intValue() : 0);
        aVar2.setArguments(bundle);
        aVar.g(R.id.fragment_container, aVar2, "AudioOnboardingVideoFragment", 1);
        aVar.e(null);
        aVar.n(true, true);
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment E = supportFragmentManager.E("AudioOnboardingVideoFragment");
        if (E != null && E.isVisible()) {
            super.onBackPressed();
            return;
        }
        go.f fVar = this.f12701m;
        if (fVar != null) {
            fVar.t();
        } else {
            r.i("audioOnboardingFragment");
            throw null;
        }
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        go.f hVar;
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        this.f12700l = y13;
        f.f84306m.getClass();
        f a14 = f.a.a(y13);
        if (a14 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        this.f12699k = a14;
        dk.g gVar = (dk.g) q8.g.d(this, R.layout.activity_audio_onboarding);
        gVar.d.x(this);
        this.f12702n = gVar;
        f fVar = this.f12699k;
        if (fVar == null) {
            r.i("coordinator");
            throw null;
        }
        String str = fVar.f84308h;
        d dVar = fVar.f84310j;
        if (dVar == null) {
            r.i("configProvider");
            throw null;
        }
        if (u50.j.c(dVar.f84302a.f15569q)) {
            go.c.f35871j.getClass();
            str.getClass();
            hVar = new go.c();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            hVar.setArguments(bundle2);
        } else {
            h.f35885j.getClass();
            str.getClass();
            hVar = new h();
            Bundle bundle3 = new Bundle();
            bundle3.putString("COORDINATOR_ID", str);
            hVar.setArguments(bundle3);
        }
        this.f12701m = hVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        go.f fVar2 = this.f12701m;
        if (fVar2 == null) {
            r.i("audioOnboardingFragment");
            throw null;
        }
        f13.i(R.id.fragment_container, fVar2, "AudioOnboardingFragment");
        f13.n(true, true);
        overridePendingTransition(f12696q, f12697r);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment E = supportFragmentManager.E("AudioOnboardingVideoFragment");
        if (E != null && E.isVisible()) {
            t();
            return false;
        }
        f fVar = this.f12699k;
        if (fVar == null) {
            r.i("coordinator");
            throw null;
        }
        in0.f g13 = fVar.g();
        if (g13 != null) {
            g13.d(this, fVar.f84308h);
        }
        overridePendingTransition(f12697r, f12698s);
        return true;
    }

    @Override // ho.b
    public final void t() {
        dk.g gVar = this.f12702n;
        if (gVar == null) {
            r.i("binding");
            throw null;
        }
        gVar.d.setAlpha(1.0f);
        getSupportFragmentManager().V();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/audio/onboarding/AudioOnboardingActivity$a;", "", "<init>", "()V", "", "ACTIVITY_ENTER_ANIMATION", "I", "ACTIVITY_STAY_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "", "TOOLBAR_DISABLED_ALPHA", "F", "TOOLBAR_ENABLED_ALPHA", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
