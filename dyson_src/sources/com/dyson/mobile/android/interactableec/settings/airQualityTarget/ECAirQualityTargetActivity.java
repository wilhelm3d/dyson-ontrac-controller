package com.dyson.mobile.android.interactableec.settings.airQualityTarget;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.interactableec.settings.airQualityTarget.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na0.g;
import pa.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/airQualityTarget/ECAirQualityTargetActivity;", "Landroidx/fragment/app/e;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECAirQualityTargetActivity extends e {

    /* renamed from: k  reason: collision with root package name */
    public static final a f14632k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public String f14633j;

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        this.f14633j = extras != null ? extras.getString("COORDINATOR_ID") : null;
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            setTheme(extras2.getInt("theme"));
        }
        g gVar = (g) q8.g.d(this, R.layout.activity_ec_air_target);
        a.C0484a c0484a = com.dyson.mobile.android.interactableec.settings.airQualityTarget.a.f14634g;
        String str = this.f14633j;
        if (str == null) {
            c.p("Required value was null.");
            return;
        }
        c0484a.getClass();
        com.dyson.mobile.android.interactableec.settings.airQualityTarget.a aVar = new com.dyson.mobile.android.interactableec.settings.airQualityTarget.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar.setArguments(bundle2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.g(R.id.fragment_container, aVar, null, 1);
        aVar2.f();
        gVar.d.setOnClickListener(new ao1.a(this, 26));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/airQualityTarget/ECAirQualityTargetActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
