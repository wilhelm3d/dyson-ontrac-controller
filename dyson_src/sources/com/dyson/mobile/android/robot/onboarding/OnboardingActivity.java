package com.dyson.mobile.android.robot.onboarding;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.onboarding.a;
import fm1.o0;
import iu0.z;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we1.a;
import x12.r;
import y31.j;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/OnboardingActivity;", "Lbt0/d;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingActivity extends bt0.d {

    /* renamed from: m  reason: collision with root package name */
    public static final a f16543m = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f16544l;

    @Override // bt0.d
    public final bt0.a d1() {
        bt0.b bVar = new bt0.b(null, 1, null);
        pf0.c cVar = this.f16544l;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        Intent intent = getIntent();
        intent.getClass();
        Object a13 = k7.b.a(cd.b.I(intent), "TOOLBAR_TITLE", LocalisationKey.class);
        if (a13 == null) {
            pa.c.w("TOOLBAR_TITLE was null");
            return null;
        }
        bVar.d.m(cVar.d((LocalisationKey) ((Parcelable) a13)));
        return bVar;
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "ONBOARDING_TYPE_KEY", "TOOLBAR_TITLE");
        z.a aVar = z.f42723r;
        String y13 = o0.y("COORDINATOR_ID", a14);
        aVar.getClass();
        z a15 = z.a.a(y13);
        if (a15 != null) {
            this.f16544l = a15.f42732o.f42663a.b();
        } else {
            pa.c.w("Could not initialise the coordinator");
        }
    }

    @Override // bt0.d, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            intent.getClass();
            Bundle I = cd.b.I(intent);
            a.C0587a c0587a = com.dyson.mobile.android.robot.onboarding.a.f16553g;
            String y13 = o0.y("COORDINATOR_ID", I);
            Serializable c13 = k7.b.c(I, "ONBOARDING_TYPE_KEY", j.class);
            if (c13 == null) {
                pa.c.w("ONBOARDING_TYPE_KEY was null");
                return;
            }
            c0587a.getClass();
            com.dyson.mobile.android.robot.onboarding.a aVar = new com.dyson.mobile.android.robot.onboarding.a();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", y13);
            bundle2.putSerializable("ONBOARDING_TYPE_KEY", (j) c13);
            aVar.setArguments(bundle2);
            e1(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/OnboardingActivity$a;", "", "<init>", "()V", "", "ONBOARDING_TYPE_KEY", "Ljava/lang/String;", "TOOLBAR_TITLE_KEY", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
