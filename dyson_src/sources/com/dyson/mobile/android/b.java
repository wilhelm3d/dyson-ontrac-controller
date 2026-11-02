package com.dyson.mobile.android;

import a90.b;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import b50.j;
import com.brightcove.player.analytics.Analytics;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.account.legacy.loginsignup.LoginSignUpActivity;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$EmailValidationDestination;
import com.dyson.mobile.android.account.navigation.destination.ExistingUserDestination$PhoneNumberCaptureValidationDestination;
import com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination$EmailValidationDestination;
import com.dyson.mobile.android.account.navigation.destination.NewOwnerDestination$PhoneCaptureValidationDestination;
import com.dyson.mobile.android.account.ui.UserLoginActivity;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.applink.AppLinkIntent;
import com.dyson.mobile.android.connectedhome.voicecontrol.VoiceControlActivity;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.AlexaInitiatedAppLinkConsentActivity;
import com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlOptionsNdsActivity;
import com.dyson.mobile.android.connectionjourney.applink.DevicePairingParameters;
import com.dyson.mobile.android.connectionjourney.bluetoothpermission.BluetoothPermissionActivity;
import com.dyson.mobile.android.connectionjourney.changewifijourney.a;
import com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.AddProductActivity;
import com.dyson.mobile.android.connectionjourney.enablebluetooth.EnableBluetoothActivity;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.getconnected.WelcomeActivity;
import com.dyson.mobile.android.interactableec.aqreport.ECAirQualityReportActivity;
import com.dyson.mobile.android.launch.LaunchActivity;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.ExpertContentActivity;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.ExpertContentCollectionActivity;
import com.dyson.mobile.android.machine.ui.settings.devicesharing.DeviceSharingActivity;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.purchasing.ui.screen.EntryPoint;
import com.dyson.mobile.android.purchasing.ui.screen.ProductPurchaseArguments;
import com.dyson.mobile.android.salesforce.SalesforceMarketingCloudWebViewActivity;
import com.dyson.mobile.android.support.chatbot.ChatBotActivity;
import com.dyson.mobile.android.support.ui.contact.ContactDysonActivity;
import com.dyson.mobile.android.termsandprivacy.TermsOfUseAndPrivacyActivity;
import com.dyson.mobile.android.updaterequired.UpdateRequiredActivity;
import ee1.e;
import f60.o;
import f80.j1;
import f80.q1;
import f80.s1;
import f80.t1;
import g90.a;
import g90.b;
import h12.f0;
import h90.a;
import hj.e;
import i12.y;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ji0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz.a;
import kz1.b;
import mj.m;
import nz1.b0;
import nz1.w;
import org.bouncycastle.asn1.BERTags;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p30.z;
import ph.r;
import qh.j;
import qh.j0;
import qh.t;
import rf0.i0;
import rz1.d0;
import sp0.a;
import uf0.k;
import uf0.l;
import uf0.q;
import w00.i;
import w80.c;
import w90.g;
import z32.d2;
import z32.m1;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/b;", "Landroidx/lifecycle/m;", "Le71/b;", "Lcom/dyson/mobile/android/DysonApplication;", Analytics.Fields.APPLICATION_ID, "<init>", "(Lcom/dyson/mobile/android/DysonApplication;)V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes2.dex */
public final class b implements m, e71.b {
    public static final a A = new a(null);
    public static b B;
    public final DysonApplication d;
    public final gz1.b e;

    /* renamed from: f  reason: collision with root package name */
    public final t f12804f;

    /* renamed from: g  reason: collision with root package name */
    public final com.dyson.mobile.android.c f12805g;

    /* renamed from: h  reason: collision with root package name */
    public final vy1.a<r> f12806h;

    /* renamed from: i  reason: collision with root package name */
    public final vy1.a<ph.h> f12807i;

    /* renamed from: j  reason: collision with root package name */
    public final vy1.a<u71.b> f12808j;

    /* renamed from: k  reason: collision with root package name */
    public final vy1.a<yi0.e> f12809k;

    /* renamed from: l  reason: collision with root package name */
    public final vy1.a<ph.f> f12810l;

    /* renamed from: m  reason: collision with root package name */
    public final vy1.a<uj.i> f12811m;

    /* renamed from: n  reason: collision with root package name */
    public final vy1.a<w80.b> f12812n;

    /* renamed from: o  reason: collision with root package name */
    public final j1 f12813o;

    /* renamed from: p  reason: collision with root package name */
    public final xy1.i f12814p;

    /* renamed from: q  reason: collision with root package name */
    public final l00.d f12815q;

    /* renamed from: r  reason: collision with root package name */
    public gj.h f12816r;

    /* renamed from: s  reason: collision with root package name */
    public final e80.b f12817s;

    /* renamed from: t  reason: collision with root package name */
    public final d f12818t;

    /* renamed from: u  reason: collision with root package name */
    public final i f12819u;

    /* renamed from: v  reason: collision with root package name */
    public final c f12820v;

    /* renamed from: w  reason: collision with root package name */
    public final e f12821w;

    /* renamed from: x  reason: collision with root package name */
    public final g f12822x;

    /* renamed from: y  reason: collision with root package name */
    public final f f12823y;

    /* renamed from: z  reason: collision with root package name */
    public final h f12824z;

    /* renamed from: com.dyson.mobile.android.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class C0363b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12825a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12825a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$c", "Lin0/f;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements in0.f {
        public c() {
        }

        @Override // in0.f
        public final void a(Activity activity) {
            a aVar = b.A;
            b.this.A();
        }

        @Override // in0.f
        public final void b(String str, String str2) {
            str.getClass();
            str2.getClass();
            Logger.a("Machine name changed");
            MachineSerial machineSerial = new MachineSerial(str);
            b bVar = b.this;
            yi0.h hVar = new yi0.h(bVar.d);
            gz1.b bVar2 = bVar.e;
            yi0.f fVar = hVar.f90159a;
            fVar.getClass();
            bk0.f fVar2 = fVar.f90155b;
            w l13 = fVar2.f(machineSerial, str2).l(new o(fVar, machineSerial, str2));
            dz1.w wVar = c02.a.f10004c;
            bVar2.a(l13.z(wVar).r(wVar).g(fVar2.a()).x(new pe0.f(new pe0.h(16), 28), new j(26)));
        }

        @Override // in0.f
        public final void c(l.b bVar) {
            b.this.v(bVar);
            w00.i.c(bVar.getApplicationContext()).g(bVar);
        }

        @Override // in0.f
        public final void d(Activity activity, String str) {
            activity.getClass();
            Logger.a("Refresh lobby for machine serial: " + str);
            k(activity, str, false);
        }

        @Override // in0.f
        public final void e(androidx.fragment.app.e eVar) {
            Logger.a("Machine firmware updated");
            k(eVar, null, false);
        }

        @Override // in0.f
        public final void f(Activity activity) {
            b.this.v(activity);
            w00.i.c(activity.getApplicationContext()).h(activity);
        }

        @Override // in0.f
        public final void g(androidx.fragment.app.e eVar, String str, MachineDescriptor machineDescriptor) {
            eVar.getClass();
            str.getClass();
            machineDescriptor.getClass();
            b.this.v(eVar);
            try {
                com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
                a.C0413a.a().e(eVar, str, machineDescriptor);
            } catch (Exception e) {
                Logger.b("Failed to resolve MachineDescriptor for SerialNumber: ".concat(str), e);
            }
        }

        @Override // in0.f
        public final void h(Activity activity) {
            activity.getClass();
            b.this.v(activity);
            z.d(activity.getApplicationContext()).getClass();
            z.g(activity);
        }

        @Override // in0.f
        public final void i(Activity activity, String str) {
            pa.c.s("Refresh lobby with device-added banner for machine serial: ", str);
            k(activity, str, true);
        }

        @Override // in0.f
        public final void j(final Activity activity, final String str, final boolean z13) {
            activity.getClass();
            str.getClass();
            Logger.a("Machine removed");
            b bVar = b.this;
            yi0.h hVar = new yi0.h(bVar.d);
            gz1.b bVar2 = bVar.e;
            MachineSerial machineSerial = new MachineSerial(str);
            yi0.f fVar = hVar.f90159a;
            fVar.getClass();
            nz1.b d = fVar.f90155b.d(machineSerial);
            dz1.w wVar = c02.a.f10004c;
            bVar2.a(d.z(wVar).r(wVar).x(new pe0.f(new pe0.h(15), 27), new iz1.a() { // from class: ph.a
                @Override // iz1.a
                public final void run() {
                    if (z13) {
                        this.k(activity, str, false);
                    }
                }
            }));
        }

        public final void k(Activity activity, String str, boolean z13) {
            a aVar = b.A;
            b bVar = b.this;
            bVar.A();
            if (str == null) {
                bVar.e().get().getClass();
                ph.f.a(activity, 268468224, false, null, null, null, z13);
                return;
            }
            b.d.Companion.getClass();
            Uri a13 = b.d.C0019b.a(str, null);
            bVar.e().get().getClass();
            ph.f.a(activity, 268468224, false, null, null, a13, z13);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$d", "Lqh/j0$a;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d implements j0.a {
        public d() {
        }

        @Override // qh.j0.a
        public final void a(Activity activity) {
            activity.getClass();
            a aVar = b.A;
            b bVar = b.this;
            bVar.A();
            bVar.c().get().a();
            Intent a13 = b.a();
            bVar.e().get().getClass();
            ph.f.b(activity, 268468224, true, a13, null, null, 240);
        }

        @Override // qh.j0.a
        public final void b(androidx.fragment.app.e eVar) {
            Uri uri;
            b bVar = b.this;
            bVar.c().get().a();
            bVar.y(eVar, false, null);
            uj.h.f82161a.getClass();
            AtomicReference<AppLinkIntent> atomicReference = uj.h.f82162b;
            AppLinkIntent appLinkIntent = atomicReference.get();
            if (appLinkIntent == null || (uri = appLinkIntent.d) == null) {
                return;
            }
            uj.g.f82158a.getClass();
            if (uj.g.a(uri)) {
                atomicReference.getAndSet(null);
                bVar.i(uri, eVar);
            }
        }

        @Override // qh.j0.a
        public final void c(Activity activity) {
            activity.getClass();
            b bVar = b.this;
            bVar.c().get().a();
            Intent a13 = b.a();
            bVar.e().get().getClass();
            ph.f.b(activity, 268468224, true, a13, null, null, 240);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$e", "", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e {
        public e() {
        }

        public final void a(Activity activity) {
            activity.getClass();
            hj.e.f38312g.getClass();
            ((q) e.a.a().a()).d();
            b.this.e().get().getClass();
            ph.f.b(activity, 268468224, false, null, null, null, 252);
        }

        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final void b(androidx.fragment.app.e eVar, i.b bVar, boolean z13) {
            b.this.e.a(uf1.d.a(eVar).b(ContactDysonActivity.f1(eVar, 2132083508, z13, i0.D5, i0.T1, true)).p(new pe0.f(new om.d(5, bVar, this, eVar), 29), new ph.b(new pe0.h(17), 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$f", "Leo0/i;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements eo0.i {
        @Override // eo0.i
        @SuppressLint({"FunctionCallWithoutNamedArguments"})
        public final PendingIntent a(Context context, eo0.a aVar, int i13) {
            LaunchActivity.f14721m.getClass();
            Intent intent = new Intent(context, LaunchActivity.class);
            intent.setFlags(268468224);
            intent.putExtra("DEEP_LINK_INTENT", aVar);
            PendingIntent activity = PendingIntent.getActivity(context, i13, intent, 201326592);
            activity.getClass();
            return activity;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$g", "Lp30/z$b;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements z.b {
        public g() {
        }

        @Override // p30.z.b
        public final void a(Activity activity, String str) {
            activity.getClass();
            str.getClass();
            hj.e.f38312g.getClass();
            ((q) e.a.a().a()).d();
            a aVar = b.A;
            b.this.z(activity, str);
        }

        @Override // p30.z.b
        public final void b(Activity activity, String str) {
            activity.getClass();
            str.getClass();
            hj.e.f38312g.getClass();
            ((q) e.a.a().a()).d();
            a aVar = b.A;
            b.this.z(activity, str);
        }

        @Override // p30.z.b
        public final void c(Activity activity, String str) {
            activity.getClass();
            str.getClass();
            a aVar = b.A;
            b bVar = b.this;
            bVar.getClass();
            in0.e a13 = new yi0.h(activity.getApplicationContext()).f90159a.a(str);
            if (a13 != null) {
                in0.a f13 = a13.f(activity);
                f13.j(bVar.f12820v);
                f13.m(activity, str);
                return;
            }
            Logger.b("Machine was null on starting machine specific steps", null);
            in0.f fVar = uf0.g.a(activity.getApplicationContext()).f81923b.get();
            if (fVar != null) {
                fVar.h(activity);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$h", "Lsp0/a$b;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements a.b {
        public h() {
        }

        @Override // sp0.a.b
        public final void a(Activity activity) {
            b.this.e().get().getClass();
            ph.f.b(activity, 67108864, true, null, null, null, 248);
        }

        @Override // sp0.a.b
        public final void b(Activity activity, String str) {
            str.getClass();
            SalesforceMarketingCloudWebViewActivity.f16663k.getClass();
            activity.startActivity(SalesforceMarketingCloudWebViewActivity.a.a(activity, "", str, ""));
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/b$i", "Lee1/e$b;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements e.b {
        public i() {
        }

        @Override // ee1.e.b
        public final void a(Activity activity, String str, boolean z13, boolean z14, boolean z15) {
            b bVar = b.this;
            c cVar = bVar.f12820v;
            if (cVar != null) {
                if (z14) {
                    activity.setResult(z13 ? -1 : 0);
                    activity.finish();
                } else if (z15) {
                    activity.finish();
                } else {
                    cVar.d(activity, str);
                }
            } else if (z14) {
                activity.setResult(z13 ? -1 : 0);
                activity.finish();
            } else if (str == null) {
                bVar.e().get().getClass();
                ph.f.b(activity, 268468224, false, null, null, null, 252);
            } else {
                bVar.e().get().getClass();
                b.d.Companion.getClass();
                ph.f.b(activity, 268468224, false, null, null, b.d.C0019b.a(str, null), BERTags.PRIVATE);
            }
        }
    }

    private b(DysonApplication dysonApplication) {
        this.d = dysonApplication;
        this.e = new gz1.b();
        e80.a aVar = new e80.a(0);
        aVar.f26207c = new f80.c(dysonApplication);
        aVar.d = new f80.a(dysonApplication);
        if (aVar.f26205a == null) {
            aVar.f26205a = new t1();
        }
        if (aVar.f26206b == null) {
            aVar.f26206b = new f80.f();
        }
        xy1.h.a(f80.c.class, aVar.f26207c);
        xy1.h.a(f80.a.class, aVar.d);
        if (aVar.e == null) {
            aVar.e = new q1();
        }
        if (aVar.f26208f == null) {
            aVar.f26208f = new s1();
        }
        if (aVar.f26209g == null) {
            aVar.f26209g = new f80.e();
        }
        this.f12817s = new e80.b(aVar.f26205a, aVar.f26206b, aVar.f26207c, aVar.d, aVar.e, aVar.f26208f, aVar.f26209g);
        e80.b bVar = (e80.b) f();
        f80.f fVar = bVar.f26210a;
        fVar.getClass();
        new k(new y70.f(bVar.e.get().getApplicationContext(), "machineOptions"));
        bVar.d();
        fVar.getClass();
        this.f12804f = new t(new y70.f(bVar.e.get().getApplicationContext(), "login_sign_up"));
        this.f12805g = bVar.f26243t.get();
        this.f12806h = xy1.c.a(bVar.f26249z);
        this.f12807i = xy1.c.a(bVar.A);
        this.f12808j = xy1.c.a(bVar.B);
        this.f12809k = xy1.c.a(bVar.C);
        this.f12810l = xy1.c.a(bVar.D);
        this.f12811m = xy1.c.a(bVar.E);
        this.f12812n = xy1.c.a(c.a.f85364a);
        this.f12813o = bVar.I;
        this.f12814p = bVar.L;
        this.f12815q = new l00.d(new y70.f(bVar.e.get().getApplicationContext(), "voiceControlNdsOption"));
        androidx.lifecycle.r.f4543k.getClass();
        androidx.lifecycle.r.f4544l.f4548i.a(this);
        u9.a.a(dysonApplication).b(new IntentFilter("core-coordinator-intent-filter"), new com.dyson.mobile.android.a());
        t();
        this.f12818t = new d();
        this.f12819u = new i();
        this.f12820v = new c();
        this.f12821w = new e();
        this.f12822x = new g();
        this.f12823y = new f();
        this.f12824z = new h();
    }

    public static Intent a() {
        uj.h.f82161a.getClass();
        AppLinkIntent andSet = uj.h.f82162b.getAndSet(null);
        if (andSet == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("DEEP_LINK_INTENT", (Parcelable) andSet);
        return intent;
    }

    public static Intent h(Context context) {
        context.getClass();
        TermsOfUseAndPrivacyActivity.f16930n.getClass();
        Intent intent = new Intent(context, TermsOfUseAndPrivacyActivity.class);
        intent.addFlags(268468224);
        return intent;
    }

    public static void j(androidx.fragment.app.e eVar, String str) {
        w90.g.f85506o.getClass();
        w90.g a13 = g.a.a(str);
        if (a13 != null) {
            a13.p(eVar, ECAirQualityReportActivity.b.NOTIFICATION);
        } else {
            Logger.b("ECMachineCoordinator was not found for machine with serial number = ".concat(str), null);
        }
    }

    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public static void k(Context context, MachineDefinition machineDefinition, String str) {
        context.getClass();
        uf0.g a13 = uf0.g.a(context);
        String str2 = machineDefinition.d.d;
        a13.getClass();
        ExpertContentCollectionActivity.a aVar = ExpertContentCollectionActivity.f15150o;
        a.C1436a c1436a = new a.C1436a(str);
        aVar.getClass();
        context.startActivity(ExpertContentCollectionActivity.a.a(context, str2, c1436a));
    }

    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public static void l(Context context, MachineDefinition machineDefinition, String str, String str2) {
        context.getClass();
        uf0.g a13 = uf0.g.a(context);
        String str3 = machineDefinition.d.d;
        a13.getClass();
        ExpertContentActivity.f15115j.getClass();
        context.startActivity(ExpertContentActivity.a.a(context, str3, str, str2));
    }

    public static void r(Context context) {
        context.getClass();
        Intent intent = new Intent("android.intent.action.VIEW");
        String string = context.getString(R.string.playstore_link);
        string.getClass();
        intent.setData(Uri.parse(string));
        context.startActivity(intent);
    }

    public static void s(Context context, boolean z13) {
        context.getClass();
        if (z13) {
            return;
        }
        UpdateRequiredActivity.f16962l.getClass();
        Intent intent = new Intent(context, UpdateRequiredActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public final void A() {
        w a13 = new yi0.h(this.d).f90159a.f90155b.a();
        dz1.w wVar = c02.a.f10004c;
        this.e.a(a13.z(wVar).r(wVar).x(new pe0.f(new pe0.h(14), 26), new j(25)));
    }

    public final void b() {
        gj.h hVar = this.f12816r;
        if (hVar != null) {
            qh.j jVar = hVar.d;
            hVar.getClass();
            synchronized (jVar.f66864m) {
                try {
                    y.x(jVar.g(), new po.c(hVar, 16));
                    if (jVar.g().isEmpty()) {
                        qh.a aVar = jVar.f66856c;
                        j.k kVar = (j.k) jVar.f66867p.getValue();
                        kVar.getClass();
                        aVar.f66828a.f7313a.a(kVar);
                    }
                    f0 f0Var = f0.f36844a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            d2 d2Var = hVar.f34862g;
            if (d2Var != null) {
                m1.a aVar2 = m1.f91486a1;
                d2Var.c(null);
            }
            hVar.f34862g = null;
            d2 d2Var2 = hVar.f34863h;
            if (d2Var2 != null) {
                m1.a aVar3 = m1.f91486a1;
                d2Var2.c(null);
            }
            hVar.f34863h = null;
        }
        this.f12816r = null;
    }

    public final w02.a<s80.b> c() {
        xy1.i iVar = this.f12814p;
        if (iVar != null) {
            return iVar;
        }
        x12.r.i("firebaseInitializer");
        throw null;
    }

    @Override // e71.b
    public final void d(Activity activity) {
        activity.getClass();
        ChatBotActivity.f16775o.getClass();
        Intent intent = new Intent(activity, ChatBotActivity.class);
        intent.setFlags(536870912);
        activity.startActivity(intent);
    }

    public final vy1.a<ph.f> e() {
        vy1.a<ph.f> aVar = this.f12810l;
        if (aVar != null) {
            return aVar;
        }
        x12.r.i("homeActivityLauncher");
        throw null;
    }

    public final e80.c f() {
        e80.b bVar = this.f12817s;
        if (bVar != null) {
            return bVar;
        }
        x12.r.i("mainComponent");
        throw null;
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = C0363b.f12825a[aVar.ordinal()];
        DysonApplication dysonApplication = this.d;
        gz1.b bVar = this.e;
        if (i13 == 1) {
            Logger.a("onApplicationStart");
            d02.d<String> dVar = new oj.d(dysonApplication).a().d;
            pe0.f fVar = new pe0.f(new oc0.c(this, 20), 24);
            dVar.getClass();
            b.a aVar2 = kz1.b.f50218a;
            bVar.a(new d0(dVar, fVar, false).x(new pe0.f(new pe0.h(13), 25), new b50.j(24)));
            yi0.b bVar2 = new yi0.h(dysonApplication).f90161c;
            bVar2.getClass();
            Logger.a("Resuming connections");
            mz1.e eVar = bVar2.d;
            if (eVar != null) {
                jz1.d.dispose(eVar);
            }
            bVar2.f90149c.b();
        } else if (i13 != 2) {
        } else {
            Logger.a("onApplicationStop");
            bVar.e();
            yi0.b bVar3 = new yi0.h(dysonApplication).f90161c;
            bVar3.getClass();
            Logger.a("Connections will be suspended in 60 seconds");
            b0 B2 = dz1.b.B(60L, TimeUnit.SECONDS);
            dz1.w wVar = c02.a.f10003b;
            bVar3.d = B2.z(wVar).r(wVar).w(new s70.b(bVar3, 27));
            vy1.a<zg0.b> aVar3 = new l(dysonApplication).d;
            if (aVar3 == null) {
                x12.r.i("lazyFirmwareUpdateAvailableDialogHelper");
                throw null;
            }
            zg0.b bVar4 = aVar3.get();
            bVar4.getClass();
            bVar4.f92674b.clear();
        }
    }

    public final void i(Uri uri, Activity activity) {
        String str;
        String str2;
        Object obj;
        boolean z13;
        Object obj2;
        Object dVar;
        boolean z14;
        activity.getClass();
        uri.getClass();
        uj.g.f82158a.getClass();
        String path = uri.getPath();
        if (path != null && new v32.l("/callback/alexa/.+/link").a(path)) {
            l00.d dVar2 = this.f12815q;
            if (dVar2 == null) {
                x12.r.i("voiceControlNdsOption");
                throw null;
            } else if (dVar2.a()) {
                VoiceControlOptionsNdsActivity.f13194p.getClass();
                Intent a13 = VoiceControlOptionsNdsActivity.a.a(activity, null);
                a13.setData(uri);
                activity.startActivity(a13);
                activity.finish();
                return;
            } else {
                VoiceControlActivity.f12992q.getClass();
                Intent putExtra = new Intent(activity, VoiceControlActivity.class).putExtra("EXTRA_STARTING_SCREEN", (String) null);
                putExtra.getClass();
                putExtra.setData(uri);
                activity.startActivity(putExtra);
                activity.finish();
                return;
            }
        }
        String path2 = uri.getPath();
        if (path2 != null && new v32.l("/add/").a(path2)) {
            j10.a.f43249a.getClass();
            y(activity, false, j10.a.a(uri));
            return;
        }
        boolean g13 = uj.g.g(uri);
        vy1.a<yi0.e> aVar = this.f12809k;
        if (g13) {
            if (aVar == null) {
                x12.r.i("machineDeepLinkHandler");
                throw null;
            }
            yi0.e eVar = aVar.get();
            eVar.getClass();
            if (eVar.f90152a.k()) {
                Iterator<T> it = eVar.f90153b.f90155b.j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    MachineDefinition machineDefinition = (MachineDefinition) obj2;
                    String queryParameter = uri.getQueryParameter(TTMLParser.Tags.CAPTION);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    String queryParameter2 = uri.getQueryParameter("v");
                    String queryParameter3 = uri.getQueryParameter("m");
                    if (queryParameter3 == null) {
                        queryParameter3 = "";
                    }
                    String str3 = machineDefinition.f15558f;
                    String str4 = machineDefinition.f15560h;
                    if (str3.equalsIgnoreCase(queryParameter) && v32.w.j(machineDefinition.f15559g, queryParameter2, true)) {
                        if (v32.y.r(str4 == null ? "" : str4, queryParameter3, true)) {
                            break;
                        }
                    }
                    String queryParameter4 = uri.getQueryParameter("p_model");
                    if (queryParameter4 != null) {
                        if (str4 == null) {
                            str4 = "";
                        }
                        z14 = v32.y.r(str4, queryParameter4, true);
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        break;
                    }
                }
                MachineDefinition machineDefinition2 = (MachineDefinition) obj2;
                dVar = machineDefinition2 != null ? new yi0.d(machineDefinition2.d.d) : yi0.c.f90150a;
            } else {
                dVar = yi0.c.f90150a;
            }
            if (dVar instanceof yi0.c) {
                vy1.a<u71.b> aVar2 = this.f12808j;
                if (aVar2 != null) {
                    aVar2.get().a(activity, uri, new ExternalLinkTracking("support", m.a.DEEP_LINK, y9.w.e(), null));
                } else {
                    x12.r.i("externalLinkOpener");
                    throw null;
                }
            } else if (dVar instanceof yi0.d) {
                e().get().getClass();
                a.C1190a c1190a = h90.a.f37853a;
                String str5 = ((yi0.d) dVar).f90151a;
                c1190a.getClass();
                Uri parse = Uri.parse(h90.a.f37854b + MqttTopic.TOPIC_LEVEL_SEPARATOR + str5);
                parse.getClass();
                ph.f.b(activity, 268468224, false, null, null, parse, BERTags.PRIVATE);
            }
        } else if (uj.g.b(uri)) {
            e().get().getClass();
            b.d.C0019b c0019b = b.d.Companion;
            if (aVar == null) {
                x12.r.i("machineDeepLinkHandler");
                throw null;
            }
            yi0.e eVar2 = aVar.get();
            eVar2.getClass();
            Iterator<T> it2 = eVar2.f90153b.f90155b.j().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                MachineDefinition machineDefinition3 = (MachineDefinition) obj;
                String queryParameter5 = uri.getQueryParameter("p_model");
                if (queryParameter5 != null) {
                    String str6 = machineDefinition3.f15560h;
                    if (str6 == null) {
                        str6 = "";
                    }
                    z13 = v32.y.r(str6, queryParameter5, true);
                    continue;
                } else {
                    z13 = false;
                    continue;
                }
                if (z13) {
                    break;
                }
            }
            MachineDefinition machineDefinition4 = (MachineDefinition) obj;
            String str7 = machineDefinition4 != null ? machineDefinition4.d.d : null;
            String str8 = str7 != null ? str7 : "";
            c0019b.getClass();
            ph.f.b(activity, 268468224, false, null, null, b.d.C0019b.a(str8, null), BERTags.PRIVATE);
        } else if (uj.g.e(uri)) {
            String path3 = uri.getPath();
            if (path3 != null) {
                if (!uj.g.f82159b.e(path3)) {
                    path3 = null;
                }
                if (path3 != null) {
                    str2 = v32.y.P('/', path3, path3);
                    if (str2 != null || str2.length() == 0) {
                        Logger.e("Invalid recipe app link, recipe id missing: " + uri, null);
                    }
                    vy1.a<uj.i> aVar3 = this.f12811m;
                    if (aVar3 != null) {
                        aVar3.get().a(activity, uri, str2);
                        return;
                    } else {
                        x12.r.i("recipeDeepLinkLauncher");
                        throw null;
                    }
                }
            }
            str2 = null;
            if (str2 != null) {
            }
            Logger.e("Invalid recipe app link, recipe id missing: " + uri, null);
        } else if (!uj.g.c(uri)) {
            if (uj.g.d(uri)) {
                Intent intent = new Intent();
                intent.putExtra("DEEP_LINK_INTENT", (Parcelable) new AppLinkIntent(uri, null));
                e().get().getClass();
                ph.f.b(activity, 268468224, false, intent, null, null, 240);
            } else if (uj.g.f(uri)) {
                WelcomeActivity.f14097p.getClass();
                Intent intent2 = new Intent(activity, WelcomeActivity.class);
                intent2.putExtra("DEEP_LINK_INTENT", (Parcelable) new AppLinkIntent(uri, null));
                intent2.setFlags(268468224);
                activity.startActivity(intent2);
                activity.finish();
            } else if (uj.g.a(uri)) {
                kz.a.f50192c.getClass();
                a.C1547a.a(activity);
                AlexaInitiatedAppLinkConsentActivity.f13008l.getClass();
                Intent intent3 = new Intent(activity, AlexaInitiatedAppLinkConsentActivity.class);
                intent3.setData(uri);
                activity.startActivity(intent3);
            }
        } else {
            String path4 = uri.getPath();
            if (path4 != null) {
                if (!uj.g.f82160c.e(path4)) {
                    path4 = null;
                }
                if (path4 != null) {
                    str = v32.y.P('/', path4, path4);
                    if (str != null || str.length() == 0) {
                        Logger.e("Invalid device invitation app link, device invitation id is missing: " + uri, null);
                    }
                    vy1.a<w80.b> aVar4 = this.f12812n;
                    if (aVar4 == null) {
                        x12.r.i("deviceInvitationDeepLinkHandler");
                        throw null;
                    }
                    aVar4.get().getClass();
                    String host = uri.getHost();
                    if (host == null || (!host.equalsIgnoreCase("product.cp.dyson.com") && !host.equalsIgnoreCase("product.cpppe.dyson.com"))) {
                        Logger.e("Device invitation app link host is not recognised. Ignoring: " + uri, null);
                        return;
                    }
                    DeviceSharingActivity.f15401k.getClass();
                    Intent intent4 = new Intent(activity, DeviceSharingActivity.class);
                    intent4.putExtra("INVITATION_ID", str);
                    intent4.addFlags(67108864);
                    activity.startActivity(intent4);
                    return;
                }
            }
            str = null;
            if (str != null) {
            }
            Logger.e("Invalid device invitation app link, device invitation id is missing: " + uri, null);
        }
    }

    public final void m(androidx.fragment.app.e eVar, String str) {
        ProductPurchaseArguments productPurchaseArguments = new ProductPurchaseArguments(new EntryPoint.FinishedGoods(str));
        Intent intent = new Intent();
        intent.putExtra("PRODUCT_DETAILS_ARGS", productPurchaseArguments);
        e().get().getClass();
        ph.f.b(eVar, 268468224, false, intent, null, b.c.a(new a.b(str)), BERTags.PRIVATE);
    }

    public final void n(androidx.fragment.app.e eVar) {
        ProductPurchaseArguments productPurchaseArguments = new ProductPurchaseArguments(EntryPoint.Shop.d);
        Intent intent = new Intent();
        intent.putExtra("PRODUCT_DETAILS_ARGS", productPurchaseArguments);
        e().get().getClass();
        ph.f.b(eVar, 268468224, false, intent, null, b.c.a(a.C1058a.f33745b), BERTags.PRIVATE);
    }

    public final void o(androidx.fragment.app.e eVar, MachineDefinition machineDefinition, String str) {
        machineDefinition.getClass();
        String e13 = yi0.a.a(machineDefinition).e();
        e().get().getClass();
        b.d.Companion.getClass();
        ph.f.b(eVar, 268468224, false, null, null, b.d.C0019b.a(e13, str), BERTags.PRIVATE);
    }

    public final void q(androidx.fragment.app.e eVar, String str, lp0.a aVar, lp0.c cVar, ExternalLinkTracking externalLinkTracking) {
        ProductPurchaseArguments productPurchaseArguments = new ProductPurchaseArguments(new EntryPoint.EcFilters(str, aVar, cVar, externalLinkTracking));
        Intent intent = new Intent();
        intent.putExtra("PRODUCT_DETAILS_ARGS", productPurchaseArguments);
        e().get().getClass();
        ph.f.b(eVar, 268468224, false, intent, null, b.c.a(new a.c(str)), BERTags.PRIVATE);
    }

    public final void t() {
        Logger.a("Machine coordinator listeners registered");
        DysonApplication dysonApplication = this.d;
        eo0.h a13 = eo0.h.a(dysonApplication);
        a13.getClass();
        a13.f28203c = new WeakReference<>(this.f12823y);
        uf0.g a14 = uf0.g.a(dysonApplication);
        a14.getClass();
        a14.f81923b = new WeakReference<>(this.f12820v);
    }

    public final void v(Context context) {
        w00.i.c(context).f85127f = this.f12821w;
    }

    public final void w(androidx.fragment.app.e eVar) {
        j0 c13 = j0.c(eVar);
        c13.getClass();
        c13.e = new WeakReference<>(this.f12818t);
        if (c13.f66886b.a()) {
            tj.a aVar = c13.f66887c;
            aVar.getClass();
            if (aVar.e(Locale.CHINA.getCountry())) {
                eVar.startActivity(UserLoginActivity.c1(eVar, ExistingUserDestination$PhoneNumberCaptureValidationDestination.INSTANCE));
                return;
            } else {
                eVar.startActivity(UserLoginActivity.c1(eVar, new ExistingUserDestination$EmailValidationDestination()));
                return;
            }
        }
        qh.i0 i0Var = qh.i0.EXISTING_USER;
        LoginSignUpActivity.f12141n.getClass();
        eVar.getClass();
        i0Var.getClass();
        Intent intent = new Intent(eVar, LoginSignUpActivity.class);
        intent.putExtra("EXTRA_USER_ENTRY_TYPE", i0Var.name());
        eVar.startActivity(intent);
    }

    public final void x(androidx.fragment.app.e eVar) {
        j0 c13 = j0.c(eVar);
        c13.getClass();
        c13.e = new WeakReference<>(this.f12818t);
        if (c13.f66886b.a()) {
            tj.a aVar = c13.f66887c;
            aVar.getClass();
            if (aVar.e(Locale.CHINA.getCountry())) {
                eVar.startActivity(UserLoginActivity.c1(eVar, NewOwnerDestination$PhoneCaptureValidationDestination.INSTANCE));
                return;
            } else {
                eVar.startActivity(UserLoginActivity.c1(eVar, NewOwnerDestination$EmailValidationDestination.INSTANCE));
                return;
            }
        }
        qh.i0 i0Var = qh.i0.NEW_USER;
        LoginSignUpActivity.f12141n.getClass();
        eVar.getClass();
        i0Var.getClass();
        Intent intent = new Intent(eVar, LoginSignUpActivity.class);
        intent.putExtra("EXTRA_USER_ENTRY_TYPE", i0Var.name());
        eVar.startActivity(intent);
    }

    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final void y(Activity activity, boolean z13, DevicePairingParameters devicePairingParameters) {
        v(activity);
        w00.i c13 = w00.i.c(activity);
        c13.f85124a.f13891c.remove("CONNECTION_JOURNEY_RESULT-key");
        if (z13) {
            activity.startActivity(new Intent(activity, AddProductActivity.class));
        } else {
            if (devicePairingParameters != null) {
                ConnectionJourneyDataStore connectionJourneyDataStore = c13.f85124a;
                connectionJourneyDataStore.f13891c.putString("CONNECTION_JOURNEY_RESULT-key", connectionJourneyDataStore.f13890b.toJson(devicePairingParameters, DevicePairingParameters.class));
            }
            if (c13.f85126c.b()) {
                activity.startActivity(new Intent(activity, BluetoothPermissionActivity.class));
                activity.finish();
            } else {
                activity.startActivity(new Intent(activity, EnableBluetoothActivity.class));
                activity.finish();
            }
        }
        c13.f85124a.f13891c.remove("CONNECTION_JOURNEY_MACHINE_CATEGORY");
    }

    public final void z(Activity activity, String str) {
        in0.e a13 = new yi0.h(this.d).f90159a.a(str);
        c cVar = this.f12820v;
        if (a13 != null) {
            in0.a f13 = a13.f(activity);
            f13.j(cVar);
            f13.l(activity, str);
            return;
        }
        Logger.b("Machine was null after connection journey", null);
        gs0.b bVar = new gs0.b();
        bVar.d("AppRestart");
        bVar.c("CoreCoordinator - refresh lobby due to: Machine was null after connection journey");
        bVar.b(str);
        gs0.a.a(bVar);
        cVar.d(activity, str);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/b$a;", "", "<init>", "()V", "", "FLAGS_CLEAR_TASK_NEW_TASK", "I", "Lcom/dyson/mobile/android/b;", "sInstance", "Lcom/dyson/mobile/android/b;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static b a() {
            b bVar = b.B;
            if (bVar != null) {
                return bVar;
            }
            pa.c.w("CoreCoordinator must be initialised before use");
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ b(DysonApplication dysonApplication, DefaultConstructorMarker defaultConstructorMarker) {
        this(dysonApplication);
    }
}
