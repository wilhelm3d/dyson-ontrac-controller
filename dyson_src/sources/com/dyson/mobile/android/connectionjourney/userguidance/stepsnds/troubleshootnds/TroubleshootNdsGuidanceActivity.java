package com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.connectionjourney.changewifijourney.a;
import com.dyson.mobile.android.connectionjourney.userguidance.stepsnds.troubleshootnds.navigation.destination.TroubleshootNdsGuidanceDestination;
import ef1.h;
import g.f;
import h20.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import pa.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/stepsnds/troubleshootnds/TroubleshootNdsGuidanceActivity;", "Ll/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TroubleshootNdsGuidanceActivity extends b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f13935k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public h f13936j;

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SerializationBestPractices"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        com.dyson.mobile.android.connectionjourney.changewifijourney.a.f13401c.getClass();
        e eVar = a.C0413a.a().f13402a;
        if (eVar == null) {
            c.p("Change wifi coordinator doesn't have component");
            return;
        }
        this.f13936j = eVar.Y();
        Intent intent = getIntent();
        intent.getClass();
        Object a13 = k7.b.a(cd.b.I(intent), "NAVIGATION_DESTINATION", TroubleshootNdsGuidanceDestination.class);
        if (a13 != null) {
            f.a(this, new c4.c(-918586275, true, new n50.b(this, (TroubleshootNdsGuidanceDestination) ((Parcelable) a13), 0)));
        } else {
            c.w("NAVIGATION_DESTINATION was null");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/stepsnds/troubleshootnds/TroubleshootNdsGuidanceActivity$a;", "", "<init>", "()V", "", "NAVIGATION_DESTINATION", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
