package com.dyson.mobile.android.connectedhome.voicecontrol;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.VoiceControlActivity;
import com.dyson.mobile.android.connectedhome.voicecontrol.a;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import da.h;
import f.g;
import f.j;
import f.x;
import fa.c;
import i00.a;
import i12.q;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz.a;
import m9.p;
import ma.e;
import mh.b;
import se1.q0;
import x12.p0;
import x12.r;
import x12.t;
import y9.c0;
import y9.k0;
import y9.n0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/VoiceControlActivity;", "Ll/b;", "Li00/b;", "<init>", "()V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VoiceControlActivity extends l.b implements i00.b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f12992q = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public a.C0380a f12994k;

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f12995l;

    /* renamed from: m  reason: collision with root package name */
    public fa.c f12996m;

    /* renamed from: n  reason: collision with root package name */
    public Menu f12997n;

    /* renamed from: j  reason: collision with root package name */
    public final i00.a f12993j = new i00.a(new b());

    /* renamed from: o  reason: collision with root package name */
    public final Set<Integer> f12998o = q.e0(new Integer[]{Integer.valueOf((int) R.id.alexaLinkingFragment), Integer.valueOf((int) R.id.alexaSuccessFragment), Integer.valueOf((int) R.id.alexaFailureFragment)});

    /* renamed from: p  reason: collision with root package name */
    public final d0 f12999p = new d0(p0.f86717a.b(com.dyson.mobile.android.connectedhome.voicecontrol.a.class), new c(this), new wr.a(this, 4), new d(null, this));

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/VoiceControlActivity$b", "Li00/a$a;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a.InterfaceC1247a {
        public b() {
        }

        @Override // i00.a.InterfaceC1247a
        public final boolean a() {
            a aVar = VoiceControlActivity.f12992q;
            VoiceControlActivity voiceControlActivity = VoiceControlActivity.this;
            c0 c13 = voiceControlActivity.c1();
            fa.c cVar = voiceControlActivity.f12996m;
            if (cVar != null) {
                return fa.d.a(c13, cVar);
            }
            r.i("appBarConfiguration");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f13001f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f13001f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13001f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13002f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f13003g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f13002f = aVar;
            this.f13003g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13002f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13003g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // i00.b
    public final i00.a B0() {
        return this.f12993j;
    }

    public final c0 c1() {
        Fragment D = getSupportFragmentManager().D(R.id.nav_host_fragment);
        D.getClass();
        return androidx.navigation.fragment.a.a((NavHostFragment) D);
    }

    public final void d1(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        com.dyson.mobile.android.connectedhome.voicecontrol.a aVar = (com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f12999p.getValue();
        aVar.d.getClass();
        AlexaAuthResult a13 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a.a(data);
        if (a13 instanceof AlexaAuthResult.AlexaAuthArgs) {
            aVar.f13005g.setValue(a13);
        } else if (!(a13 instanceof AlexaAuthResult.a)) {
            e.o();
        } else {
            AlexaAuthResult.a aVar2 = (AlexaAuthResult.a) a13;
            aVar.f13006h.setValue(new AlexaError.AuthorizeError(aVar2.d, aVar2.e));
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        kz.a.f50192c.getClass();
        mz.d dVar = a.C1547a.a(this).f50194b;
        dVar.f55379a.getClass();
        this.f12994k = new a.C0380a(new com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a());
        this.f12995l = dVar.f55380b.get();
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        setSupportActionBar(((nh.a) q8.g.d(this, R.layout.activity_voice_control)).e);
        c.a aVar2 = new c.a(this.f12998o);
        this.f12996m = new fa.c(aVar2.f30403a, null, new wm.b(this, 21), null);
        String stringExtra = getIntent().getStringExtra("EXTRA_STARTING_SCREEN");
        n0 b13 = c1().d().b(R.navigation.nav_graph_voice_control);
        if (r.c(stringExtra, "SCREEN_ALEXA")) {
            b13.w(R.id.alexaLandingScreenFragment);
        } else if (r.c(stringExtra, "SCREEN_GOOGLE")) {
            b13.w(R.id.googleHomeLandingScreenFragment);
        } else {
            b13.w(R.id.voiceControlOptionScreenFragment);
        }
        c0 c13 = c1();
        c13.getClass();
        h hVar = c13.f89416b;
        hVar.getClass();
        hVar.v(b13, null);
        c0 c14 = c1();
        fa.c cVar = this.f12996m;
        if (cVar == null) {
            r.i("appBarConfiguration");
            throw null;
        }
        c14.getClass();
        int i14 = fa.d.f30404a;
        c14.a(new fa.b(this, cVar));
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f12999p.getValue()).f13004f.observe(this, new p(this) { // from class: wz.b
            public final /* synthetic */ VoiceControlActivity e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                MenuItem findItem;
                int i15 = r2;
                VoiceControlActivity voiceControlActivity = this.e;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        Menu menu = voiceControlActivity.f12997n;
                        if (menu == null || (findItem = menu.findItem(R.id.action_close)) == null) {
                            return;
                        }
                        bool.getClass();
                        findItem.setVisible(bool.booleanValue());
                        return;
                    case 1:
                        AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = (AlexaAuthResult.AlexaAuthArgs) obj;
                        VoiceControlActivity.a aVar3 = VoiceControlActivity.f12992q;
                        alexaAuthArgs.getClass();
                        mh.b.f54129a.getClass();
                        voiceControlActivity.c1().i(new b.C1663b(alexaAuthArgs));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        VoiceControlActivity.a aVar4 = VoiceControlActivity.f12992q;
                        alexaError.getClass();
                        if (!r.c(alexaError.getError(), "access_denied")) {
                            mh.b.f54129a.getClass();
                            voiceControlActivity.c1().i(new b.a(alexaError, false));
                            return;
                        }
                        k0 i16 = voiceControlActivity.c1().f89416b.i();
                        if (i16 == null || i16.e.e != R.id.alexaLandingScreenFragment) {
                            h hVar2 = voiceControlActivity.c1().f89416b;
                            if (hVar2.p(R.id.alexaLandingScreenFragment, false, false) && hVar2.b()) {
                                return;
                            }
                            voiceControlActivity.c1().f(R.id.alexaLandingScreenFragment, null);
                            return;
                        }
                        return;
                }
            }
        });
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f12999p.getValue()).f13005g.observe(this, new p(this) { // from class: wz.b
            public final /* synthetic */ VoiceControlActivity e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                MenuItem findItem;
                int i15 = r2;
                VoiceControlActivity voiceControlActivity = this.e;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        Menu menu = voiceControlActivity.f12997n;
                        if (menu == null || (findItem = menu.findItem(R.id.action_close)) == null) {
                            return;
                        }
                        bool.getClass();
                        findItem.setVisible(bool.booleanValue());
                        return;
                    case 1:
                        AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = (AlexaAuthResult.AlexaAuthArgs) obj;
                        VoiceControlActivity.a aVar3 = VoiceControlActivity.f12992q;
                        alexaAuthArgs.getClass();
                        mh.b.f54129a.getClass();
                        voiceControlActivity.c1().i(new b.C1663b(alexaAuthArgs));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        VoiceControlActivity.a aVar4 = VoiceControlActivity.f12992q;
                        alexaError.getClass();
                        if (!r.c(alexaError.getError(), "access_denied")) {
                            mh.b.f54129a.getClass();
                            voiceControlActivity.c1().i(new b.a(alexaError, false));
                            return;
                        }
                        k0 i16 = voiceControlActivity.c1().f89416b.i();
                        if (i16 == null || i16.e.e != R.id.alexaLandingScreenFragment) {
                            h hVar2 = voiceControlActivity.c1().f89416b;
                            if (hVar2.p(R.id.alexaLandingScreenFragment, false, false) && hVar2.b()) {
                                return;
                            }
                            voiceControlActivity.c1().f(R.id.alexaLandingScreenFragment, null);
                            return;
                        }
                        return;
                }
            }
        });
        ((com.dyson.mobile.android.connectedhome.voicecontrol.a) this.f12999p.getValue()).f13006h.observe(this, new p(this) { // from class: wz.b
            public final /* synthetic */ VoiceControlActivity e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                MenuItem findItem;
                int i15 = r2;
                VoiceControlActivity voiceControlActivity = this.e;
                switch (i15) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        Menu menu = voiceControlActivity.f12997n;
                        if (menu == null || (findItem = menu.findItem(R.id.action_close)) == null) {
                            return;
                        }
                        bool.getClass();
                        findItem.setVisible(bool.booleanValue());
                        return;
                    case 1:
                        AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = (AlexaAuthResult.AlexaAuthArgs) obj;
                        VoiceControlActivity.a aVar3 = VoiceControlActivity.f12992q;
                        alexaAuthArgs.getClass();
                        mh.b.f54129a.getClass();
                        voiceControlActivity.c1().i(new b.C1663b(alexaAuthArgs));
                        return;
                    default:
                        AlexaError alexaError = (AlexaError) obj;
                        VoiceControlActivity.a aVar4 = VoiceControlActivity.f12992q;
                        alexaError.getClass();
                        if (!r.c(alexaError.getError(), "access_denied")) {
                            mh.b.f54129a.getClass();
                            voiceControlActivity.c1().i(new b.a(alexaError, false));
                            return;
                        }
                        k0 i16 = voiceControlActivity.c1().f89416b.i();
                        if (i16 == null || i16.e.e != R.id.alexaLandingScreenFragment) {
                            h hVar2 = voiceControlActivity.c1().f89416b;
                            if (hVar2.p(R.id.alexaLandingScreenFragment, false, false) && hVar2.b()) {
                                return;
                            }
                            voiceControlActivity.c1().f(R.id.alexaLandingScreenFragment, null);
                            return;
                        }
                        return;
                }
            }
        });
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            c0 c15 = c1();
            Set<Integer> set = this.f12998o;
            c15.getClass();
            set.getClass();
            c15.a(new bi.a(1, set, supportActionBar));
        }
        d1(getIntent());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem findItem;
        this.f12997n = menu;
        getMenuInflater().inflate(R.menu.alexa_voice_control_menu, menu);
        if (menu != null && (findItem = menu.findItem(R.id.action_close)) != null) {
            pf0.c cVar = this.f12995l;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            findItem.setTitle(cVar.c(R.string.accessibilityButton_close));
            findItem.setOnMenuItemClickListener(new d3.d0(this, 1));
        }
        return true;
    }

    @Override // f.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        d1(intent);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        boolean a13;
        i00.a aVar = this.f12993j;
        Iterator it = aVar.f39870b.iterator();
        while (true) {
            if (!it.hasNext()) {
                a13 = aVar.f39869a.a();
                break;
            } else if (((a.InterfaceC1247a) it.next()).a()) {
                a13 = true;
                break;
            }
        }
        return a13 || super.onSupportNavigateUp();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/VoiceControlActivity$a;", "", "<init>", "()V", "", "EXTRA_STARTING_SCREEN", "Ljava/lang/String;", "SCREEN_ALEXA", "SCREEN_GOOGLE", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
