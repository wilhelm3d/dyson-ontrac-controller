package com.dyson.mobile.android.connectedhome.voicecontrol.newsystem;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b;
import com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlOptionsNdsActivity;
import com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b;
import f.g;
import f.x;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz.a;
import l00.i;
import l00.j;
import l00.n;
import m9.p;
import nj.e1;
import nz.h;
import x12.p0;
import x12.q0;
import x12.r;
import x12.t;
import y70.f;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/VoiceControlOptionsNdsActivity;", "Lf/g;", "<init>", "()V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VoiceControlOptionsNdsActivity extends g {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13194p = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public final d0 f13195j;

    /* renamed from: k  reason: collision with root package name */
    public b.C0388b f13196k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f13197l;

    /* renamed from: m  reason: collision with root package name */
    public tj.a f13198m;

    /* renamed from: n  reason: collision with root package name */
    public b.a f13199n;

    /* renamed from: o  reason: collision with root package name */
    public hj.e f13200o;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f13201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar) {
            super(0);
            this.f13201f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13201f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13202f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f13203g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar, g gVar) {
            super(0);
            this.f13202f = aVar;
            this.f13203g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13202f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13203g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f13204f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f13204f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f13204f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13205f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f13206g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, g gVar) {
            super(0);
            this.f13205f = aVar;
            this.f13206g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13205f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f13206g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public VoiceControlOptionsNdsActivity() {
        j jVar = new j(this, 0);
        q0 q0Var = p0.f86717a;
        this.f13195j = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.class), new b(this), jVar, new c(null, this));
        this.f13197l = new d0(q0Var.b(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b.class), new d(this), new j(this, 1), new e(null, this));
    }

    public final void Y0(Intent intent) {
        String stringExtra = intent.getStringExtra("EXTRA_STARTING_SCREEN");
        d0 d0Var = this.f13195j;
        if (stringExtra != null) {
            if (stringExtra.equals("SCREEN_ALEXA")) {
                ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) d0Var.getValue()).U(n.AMAZON_ALEXA);
                return;
            }
            return;
        }
        Uri data = intent.getData();
        if (data != null) {
            com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b bVar = (com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) d0Var.getValue();
            bVar.e.getClass();
            AlexaAuthResult a13 = com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a.a(data);
            if (a13 instanceof AlexaAuthResult.AlexaAuthArgs) {
                bVar.U(null);
                bVar.T(new b.InterfaceC0400b.d((AlexaAuthResult.AlexaAuthArgs) a13));
            } else if (!(a13 instanceof AlexaAuthResult.a)) {
                ma.e.o();
            } else if (r.c(((AlexaAuthResult.a) a13).d, "access_denied")) {
                bVar.T(b.InterfaceC0400b.a.f13226a);
                bVar.V(n.AMAZON_ALEXA);
            } else {
                bVar.U(null);
                bVar.T(b.InterfaceC0400b.C0401b.f13227a);
            }
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kz.a.f50192c.getClass();
        mz.d dVar = a.C1547a.a(this).f50194b;
        this.f13196k = dVar.a();
        h hVar = dVar.f55379a;
        this.f13198m = new oj.d(hVar.f59239a).a();
        pf0.c cVar = dVar.f55380b.get();
        xz.a aVar = new xz.a();
        Context context = hVar.f59239a;
        tj.a a13 = new oj.d(context).a();
        cVar.getClass();
        l00.c cVar2 = new l00.c(cVar, aVar, a13);
        com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a aVar2 = new com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a();
        e.a aVar3 = hj.e.f38312g;
        aVar3.getClass();
        hj.e a14 = e.a.a();
        Object a15 = new j90.h(hVar.f59239a).a(b00.a.class);
        a15.getClass();
        this.f13199n = new b.a(cVar2, aVar2, a14, new c00.d((b00.a) a15));
        aVar3.getClass();
        this.f13200o = e.a.a();
        new l00.d(new f(context, "voiceControlNdsOption"));
        super.onCreate(bundle);
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        d0 d0Var = this.f13197l;
        ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b) d0Var.getValue()).f13086k.observe(this, new p(this) { // from class: l00.k
            public final /* synthetic */ VoiceControlOptionsNdsActivity e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                VoiceControlOptionsNdsActivity voiceControlOptionsNdsActivity = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        VoiceControlOptionsNdsActivity.a aVar4 = VoiceControlOptionsNdsActivity.f13194p;
                        uri.getClass();
                        ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) voiceControlOptionsNdsActivity.f13195j.getValue()).T(new b.InterfaceC0400b.e(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        VoiceControlOptionsNdsActivity.a aVar5 = VoiceControlOptionsNdsActivity.f13194p;
                        uri2.getClass();
                        voiceControlOptionsNdsActivity.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    default:
                        VoiceControlOptionsNdsActivity.a aVar6 = VoiceControlOptionsNdsActivity.f13194p;
                        ((AlexaError) obj).getClass();
                        ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) voiceControlOptionsNdsActivity.f13195j.getValue()).T(b.InterfaceC0400b.C0401b.f13227a);
                        return;
                }
            }
        });
        ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b) d0Var.getValue()).f13087l.observe(this, new p(this) { // from class: l00.k
            public final /* synthetic */ VoiceControlOptionsNdsActivity e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                VoiceControlOptionsNdsActivity voiceControlOptionsNdsActivity = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        VoiceControlOptionsNdsActivity.a aVar4 = VoiceControlOptionsNdsActivity.f13194p;
                        uri.getClass();
                        ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) voiceControlOptionsNdsActivity.f13195j.getValue()).T(new b.InterfaceC0400b.e(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        VoiceControlOptionsNdsActivity.a aVar5 = VoiceControlOptionsNdsActivity.f13194p;
                        uri2.getClass();
                        voiceControlOptionsNdsActivity.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    default:
                        VoiceControlOptionsNdsActivity.a aVar6 = VoiceControlOptionsNdsActivity.f13194p;
                        ((AlexaError) obj).getClass();
                        ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) voiceControlOptionsNdsActivity.f13195j.getValue()).T(b.InterfaceC0400b.C0401b.f13227a);
                        return;
                }
            }
        });
        ((com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.landingscreen.b) d0Var.getValue()).f13088m.observe(this, new p(this) { // from class: l00.k
            public final /* synthetic */ VoiceControlOptionsNdsActivity e;

            {
                this.e = this;
            }

            @Override // m9.p
            public final void onChanged(Object obj) {
                int i13 = r2;
                VoiceControlOptionsNdsActivity voiceControlOptionsNdsActivity = this.e;
                switch (i13) {
                    case 0:
                        Uri uri = (Uri) obj;
                        VoiceControlOptionsNdsActivity.a aVar4 = VoiceControlOptionsNdsActivity.f13194p;
                        uri.getClass();
                        ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) voiceControlOptionsNdsActivity.f13195j.getValue()).T(new b.InterfaceC0400b.e(uri));
                        return;
                    case 1:
                        Uri uri2 = (Uri) obj;
                        VoiceControlOptionsNdsActivity.a aVar5 = VoiceControlOptionsNdsActivity.f13194p;
                        uri2.getClass();
                        voiceControlOptionsNdsActivity.startActivity(new Intent("android.intent.action.VIEW", uri2));
                        return;
                    default:
                        VoiceControlOptionsNdsActivity.a aVar6 = VoiceControlOptionsNdsActivity.f13194p;
                        ((AlexaError) obj).getClass();
                        ((com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b) voiceControlOptionsNdsActivity.f13195j.getValue()).T(b.InterfaceC0400b.C0401b.f13227a);
                        return;
                }
            }
        });
        g.f.a(this, new c4.c(1351330007, true, new i(this, 0)));
        Intent intent = getIntent();
        intent.getClass();
        Y0(intent);
    }

    @Override // f.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Y0(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        hj.e eVar = this.f13200o;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = e1.f57458a;
        ij.b bVar = new ij.b("common.settings.voice_control", null, 2, null);
        e.a aVar = hj.e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/VoiceControlOptionsNdsActivity$a;", "", "<init>", "()V", "", "EXTRA_STARTING_SCREEN", "Ljava/lang/String;", "SCREEN_ALEXA", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Activity activity, String str) {
            activity.getClass();
            Intent putExtra = new Intent(activity, VoiceControlOptionsNdsActivity.class).putExtra("EXTRA_STARTING_SCREEN", str);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
