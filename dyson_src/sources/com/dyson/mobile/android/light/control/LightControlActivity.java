package com.dyson.mobile.android.light.control;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.control.a;
import com.dyson.mobile.android.light.control.i;
import f.j;
import f.x;
import fm1.o0;
import h12.f0;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightControlActivity;", "Ll/b;", "", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightControlActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14772l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public String f14773j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f14774k;

    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final void c1() {
        if (this.f14774k) {
            this.f14774k = false;
            getSupportFragmentManager().V();
            return;
        }
        this.f14774k = true;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        f13.j(R.animator.dialog_flip_right_in, R.animator.dialog_flip_right_out, R.animator.dialog_flip_left_in, R.animator.dialog_flip_left_out);
        i.a aVar = i.f14871i;
        String str = this.f14773j;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        i iVar = new i();
        iVar.setArguments(bundle);
        f13.i(R.id.fragment_container, iVar, null);
        f13.e(null);
        f13.f();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.fade_out, R.anim.fade_in);
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        if (this.f14774k) {
            c1();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        this.f14773j = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID", "EXTRA_COLOR_TEMPERATURE_VALUE", "EXTRA_BRIGHTNESS_VALUE", "EXTRA_PRODUCT_MODE"));
        setContentView(R.layout.activity_light_control);
        if (bundle == null) {
            Intent intent2 = getIntent();
            intent2.getClass();
            Bundle I = cd.b.I(intent2);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            a.C0493a c0493a = com.dyson.mobile.android.light.control.a.f14797g;
            String str = this.f14773j;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            boolean z13 = I.getBoolean("EXTRA_PRODUCT_MODE", false);
            int i13 = I.getInt("EXTRA_COLOR_TEMPERATURE_VALUE", 0);
            int i14 = I.getInt("EXTRA_BRIGHTNESS_VALUE", 0);
            c0493a.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            bundle2.putBoolean("ARGUMENT_PRODUCT_MODE", z13);
            bundle2.putInt("ARGUMENT_COLOR_TEMPERATURE_VALUE", i13);
            bundle2.putInt("ARGUMENT_BRIGHTNESS_VALUE", i14);
            com.dyson.mobile.android.light.control.a aVar = new com.dyson.mobile.android.light.control.a();
            aVar.setArguments(bundle2);
            aVar.e = this;
            f0 f0Var = f0.f36844a;
            f13.g(R.id.fragment_container, aVar, null, 1);
            f13.o();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightControlActivity$a;", "", "<init>", "()V", "", "EXTRA_PRODUCT_MODE", "Ljava/lang/String;", "EXTRA_COLOR_TEMPERATURE_VALUE", "EXTRA_BRIGHTNESS_VALUE", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
