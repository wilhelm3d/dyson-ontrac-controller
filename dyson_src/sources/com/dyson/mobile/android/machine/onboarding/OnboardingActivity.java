package com.dyson.mobile.android.machine.onboarding;

import af1.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.machine.onboarding.navigation.OnboardingDestination;
import com.google.gson.Gson;
import f.g;
import fm1.o0;
import g.f;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import we1.a;
import x12.p;
import yf0.d;
import yf0.e;
import yf0.l;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/OnboardingActivity;", "Lf/g;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingActivity extends g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f15298k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public l f15299j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, OnboardingActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((OnboardingActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method to create MachineOnboardingActivity.";
        Bundle a14 = a13.a("COORDINATOR_ID");
        uf0.g a15 = uf0.g.a(this);
        if (a15 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        sg0.b bVar = a15.f81922a;
        bVar.getClass();
        tg0.c cVar = bVar.f76090c;
        e eVar = bVar.f76112o.get();
        i iVar = bVar.f76114p.get();
        Gson gson = bVar.G.get();
        cVar.getClass();
        eVar.getClass();
        iVar.getClass();
        gson.getClass();
        d dVar = new d(eVar, iVar, gson);
        Context context = bVar.d.get();
        context.getClass();
        this.f15299j = new l(dVar, new vf1.b(context), bVar.f76114p.get(), bVar.G.get());
        String y13 = o0.y("COORDINATOR_ID", a14);
        Object a16 = k7.b.a(a14, "NAVIGATION_DESTINATION", OnboardingDestination.class);
        if (a16 != null) {
            f.a(this, new c4.c(962725813, true, new fj0.i(this, y13, (OnboardingDestination) ((Parcelable) a16), 0)));
        } else {
            c.w("NAVIGATION_DESTINATION was null");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/OnboardingActivity$a;", "", "<init>", "()V", "", "NAVIGATION_DESTINATION", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, OnboardingDestination onboardingDestination) {
            context.getClass();
            str.getClass();
            onboardingDestination.getClass();
            Intent intent = new Intent(context, OnboardingActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("NAVIGATION_DESTINATION", onboardingDestination);
            return intent;
        }

        private a() {
        }
    }
}
