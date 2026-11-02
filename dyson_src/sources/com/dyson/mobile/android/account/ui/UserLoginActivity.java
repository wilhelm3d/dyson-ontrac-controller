package com.dyson.mobile.android.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import bj.g;
import com.dyson.mobile.android.account.navigation.destination.UserLoginDestination;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import f.j;
import f.x;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj.m;
import qh.j0;
import vi.f;
import we1.a;
import wi.f;
import x12.p;
import x12.r;
import xi.i;
import yi.i;
import zi.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/account/ui/UserLoginActivity;", "Ll/b;", "<init>", "()V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserLoginActivity extends l.b {

    /* renamed from: s  reason: collision with root package name */
    public static final a f12291s = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public u71.a f12292j;

    /* renamed from: k  reason: collision with root package name */
    public f.b f12293k;

    /* renamed from: l  reason: collision with root package name */
    public f.a f12294l;

    /* renamed from: m  reason: collision with root package name */
    public i.b f12295m;

    /* renamed from: n  reason: collision with root package name */
    public i.a f12296n;

    /* renamed from: o  reason: collision with root package name */
    public g.b f12297o;

    /* renamed from: p  reason: collision with root package name */
    public e.b f12298p;

    /* renamed from: q  reason: collision with root package name */
    public zf1.b f12299q;

    /* renamed from: r  reason: collision with root package name */
    public UserLoginDestination f12300r;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, UserLoginActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((UserLoginActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements Function1<String, f0> {
        public c(Object obj) {
            super(1, obj, UserLoginActivity.class, "openExternalLink", "openExternalLink(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(String str) {
            String str2 = str;
            UserLoginActivity userLoginActivity = (UserLoginActivity) this.receiver;
            a aVar = UserLoginActivity.f12291s;
            userLoginActivity.getClass();
            if (str2 != null) {
                ExternalLinkTracking externalLinkTracking = new ExternalLinkTracking("privacy_policy", m.a.USER_REGISTRATION, null, null, 12, null);
                u71.a aVar2 = userLoginActivity.f12292j;
                if (aVar2 == null) {
                    r.i("externalLinkOpener");
                    throw null;
                }
                aVar2.b(userLoginActivity, str2, externalLinkTracking);
            }
            return f0.f36844a;
        }
    }

    public static final Intent c1(androidx.fragment.app.e eVar, UserLoginDestination userLoginDestination) {
        f12291s.getClass();
        eVar.getClass();
        userLoginDestination.getClass();
        Intent intent = new Intent(eVar, UserLoginActivity.class);
        intent.putExtra("NAVIGATION_DESTINATION", userLoginDestination);
        return intent;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please provide the required arguments";
        Object a14 = k7.b.a(a13.a("NAVIGATION_DESTINATION"), "NAVIGATION_DESTINATION", UserLoginDestination.class);
        if (a14 == null) {
            pa.c.w("NAVIGATION_DESTINATION was null");
            return;
        }
        this.f12300r = (UserLoginDestination) ((Parcelable) a14);
        j0 c13 = j0.c(this);
        if (c13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        sh.b bVar = c13.d;
        this.f12292j = bVar.b();
        this.f12293k = (f.b) bVar.f76169v.f88315a;
        this.f12294l = (f.a) bVar.f76170w.f88315a;
        this.f12295m = (i.b) bVar.f76171x.f88315a;
        this.f12296n = (i.a) bVar.f76172y.f88315a;
        this.f12297o = (g.b) bVar.f76173z.f88315a;
        this.f12298p = (e.b) bVar.A.f88315a;
        this.f12299q = bVar.a();
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(-1490627186, true, new ui.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/account/ui/UserLoginActivity$a;", "", "<init>", "()V", "", "NAVIGATION_DESTINATION", "Ljava/lang/String;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
