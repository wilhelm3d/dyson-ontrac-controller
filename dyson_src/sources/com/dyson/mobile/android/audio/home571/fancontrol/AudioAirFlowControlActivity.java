package com.dyson.mobile.android.audio.home571.fancontrol;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.home571.fancontrol.a;
import com.dyson.mobile.android.audio.settings.accessories.earcushions.AudioEarCushionActivity;
import f.j;
import f.x;
import fm1.o0;
import h12.e;
import h12.y;
import im.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import q8.g;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/fancontrol/AudioAirFlowControlActivity;", "Ll/b;", "Lhm/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioAirFlowControlActivity extends b implements hm.b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f12610k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f12611l = R.anim.slide_in_up;

    /* renamed from: m  reason: collision with root package name */
    public static final int f12612m = R.anim.stay;

    /* renamed from: n  reason: collision with root package name */
    public static final int f12613n = R.anim.slide_out_down;

    /* renamed from: j  reason: collision with root package name */
    public String f12614j;

    @Override // hm.b
    public final void o() {
        f.a aVar = f.f84306m;
        String str = this.f12614j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        f a13 = f.a.a(str);
        if (a13 != null) {
            a13.u(this, hn.b.ATTACH_VISOR);
        }
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(f12612m, f12613n);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
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
        a13.f85710b = "Please use the newInstance method";
        this.f12614j = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        ((dk.a) g.d(this, R.layout.activity_audio_air_flow_control)).d.x(this);
        a.C0353a c0353a = com.dyson.mobile.android.audio.home571.fancontrol.a.f12615k;
        String str = this.f12614j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        c0353a.getClass();
        com.dyson.mobile.android.audio.home571.fancontrol.a aVar = new com.dyson.mobile.android.audio.home571.fancontrol.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.g(R.id.fragment_container, aVar, null, 1);
        aVar2.f();
        overridePendingTransition(f12611l, f12612m);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // hm.b
    public final void q() {
        AudioEarCushionActivity.a aVar = AudioEarCushionActivity.f12710q;
        String str = this.f12614j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        AudioEarCushionActivity.a.b bVar = AudioEarCushionActivity.a.b.VERTICAL;
        AudioEarCushionActivity.a.EnumC0357a enumC0357a = AudioEarCushionActivity.a.EnumC0357a.EAR_CUSHIONS;
        aVar.getClass();
        startActivity(AudioEarCushionActivity.a.a(this, str, bVar, enumC0357a));
    }

    @Override // hm.b
    public final void x() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        b.a aVar = im.b.f41903h;
        String str = this.f12614j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        im.b bVar = new im.b();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        bVar.setArguments(bundle);
        f13.i(R.id.fragment_container, bVar, null);
        f13.e(null);
        f13.f();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/fancontrol/AudioAirFlowControlActivity$a;", "", "<init>", "()V", "", "ACTIVITY_ENTER_ANIMATION", "I", "ACTIVITY_STAY_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
