package com.dyson.mobile.android.audio.home571.soundcontrol;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import cc0.z;
import cn.g;
import cn.m;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.home571.soundcontrol.a;
import com.dyson.mobile.android.audio.home571.soundcontrol.b;
import dk.i;
import dn.b;
import f.j;
import f.x;
import fk.d;
import fm1.o0;
import h12.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.q;
import vj.f;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/soundcontrol/AudioSoundControlActivity;", "Ll/b;", "Lcn/g;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioSoundControlActivity extends l.b implements g {

    /* renamed from: n  reason: collision with root package name */
    public static final a f12662n = new a(null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f12663o = R.anim.slide_in_up;

    /* renamed from: p  reason: collision with root package name */
    public static final int f12664p = R.anim.stay;

    /* renamed from: q  reason: collision with root package name */
    public static final int f12665q = R.anim.slide_out_down;

    /* renamed from: j  reason: collision with root package name */
    public String f12666j;

    /* renamed from: k  reason: collision with root package name */
    public m f12667k;

    /* renamed from: l  reason: collision with root package name */
    public d f12668l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f12669m = new d0(p0.f86717a.b(cn.d.class), new b(this), new z(this, 2), new c(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12670f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.g gVar) {
            super(0);
            this.f12670f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12670f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12671f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12672g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, f.g gVar) {
            super(0);
            this.f12671f = aVar;
            this.f12672g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12671f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12672g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(f12664p, f12665q);
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        gk.a aVar;
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
        Bundle a14 = a13.a("COORDINATOR_ID", "TAB_TO_SELECT");
        this.f12666j = o0.y("COORDINATOR_ID", a14);
        Serializable c13 = k7.b.c(a14, "TAB_TO_SELECT", m.class);
        if (c13 == null) {
            pa.c.w("TAB_TO_SELECT was null");
            return;
        }
        this.f12667k = (m) c13;
        f.a aVar2 = f.f84306m;
        String str = this.f12666j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar2.getClass();
        f a15 = f.a.a(str);
        if (a15 != null && (aVar = a15.f84312l) != null) {
            this.f12668l = aVar.d();
        }
        d0 d0Var = this.f12669m;
        if (u50.j.c(((cn.d) d0Var.getValue()).d.f15569q)) {
            b.a aVar3 = com.dyson.mobile.android.audio.home571.soundcontrol.b.f12687g;
            String str2 = this.f12666j;
            if (str2 == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar3.getClass();
            fragment = new com.dyson.mobile.android.audio.home571.soundcontrol.b();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str2);
            fragment.setArguments(bundle2);
        } else {
            a.C0354a c0354a = com.dyson.mobile.android.audio.home571.soundcontrol.a.f12673l;
            String str3 = this.f12666j;
            if (str3 == null) {
                r.i("coordinatorId");
                throw null;
            }
            m mVar = this.f12667k;
            if (mVar == null) {
                r.i("tabToSelect");
                throw null;
            }
            c0354a.getClass();
            com.dyson.mobile.android.audio.home571.soundcontrol.a aVar4 = new com.dyson.mobile.android.audio.home571.soundcontrol.a();
            Bundle bundle3 = new Bundle();
            bundle3.putString("COORDINATOR_ID", str3);
            bundle3.putSerializable("TAB_TO_SELECT", mVar);
            aVar4.setArguments(bundle3);
            fragment = aVar4;
        }
        i iVar = (i) q8.g.d(this, R.layout.activity_audio_sound_control);
        cn.d dVar = (cn.d) d0Var.getValue();
        iVar.l(dVar.e.d(u50.j.c(dVar.d.f15569q) ? q.f72482t2 : q.f72355d2));
        iVar.f24000f.x(this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager);
        aVar5.g(R.id.fragment_container, fragment, null, 1);
        aVar5.f();
        overridePendingTransition(f12663o, f12664p);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Override // cn.g
    public final void w() {
        b.a aVar = dn.b.f24525h;
        String str = this.f12666j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        dn.b bVar = new dn.b();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        bVar.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.i(R.id.fragment_container, bVar, null);
        aVar2.e(null);
        aVar2.f();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/soundcontrol/AudioSoundControlActivity$a;", "", "<init>", "()V", "", "TAB_TO_SELECT", "Ljava/lang/String;", "", "ACTIVITY_ENTER_ANIMATION", "I", "ACTIVITY_STAY_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
