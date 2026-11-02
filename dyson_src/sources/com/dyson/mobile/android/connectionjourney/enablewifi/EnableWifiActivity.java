package com.dyson.mobile.android.connectionjourney.enablewifi;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import com.dyson.mobile.android.R;
import e22.m;
import f.j;
import f.x;
import kotlin.Metadata;
import l.b;
import nj.n3;
import q8.g;
import q8.t;
import rf0.i0;
import w00.i;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/enablewifi/EnableWifiActivity;", "Ll/b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EnableWifiActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public l20.b f13495j;

    /* renamed from: k  reason: collision with root package name */
    public final a f13496k = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/enablewifi/EnableWifiActivity$a", "Ll20/a;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements l20.a {
        public a() {
        }

        @Override // l20.a
        public final void a() {
            EnableWifiActivity enableWifiActivity = EnableWifiActivity.this;
            i.c(enableWifiActivity).getClass();
            i.t(enableWifiActivity);
            enableWifiActivity.finish();
        }
    }

    public final l20.b c1() {
        l20.b bVar = this.f13495j;
        if (bVar != null) {
            return bVar;
        }
        r.i("enableWifiViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        l20.a aVar;
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        i.c(this).e.i(this);
        l20.b c13 = c1();
        a aVar2 = this.f13496k;
        tf1.a aVar3 = c13.f50683f;
        m<?>[] mVarArr = l20.b.f50678n;
        aVar3.setValue(c13, mVarArr[0], aVar2);
        getLifecycle().a(c1());
        t d = g.d(this, R.layout.activity_enable_wifi);
        f20.m mVar = (f20.m) d;
        mVar.l(c1());
        mVar.f29174h.x(this);
        d.getClass();
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.small_to_original);
        loadAnimation.setInterpolator(new BounceInterpolator());
        l20.b c14 = c1();
        ImageView imageView = ((f20.m) d).f29173g;
        imageView.getClass();
        c14.f50688k = loadAnimation;
        c14.f50689l = imageView;
        c14.f50686i.l(c14.d.a() ? 0 : 8);
        c14.f50687j.m(i0.X1);
        if (!c14.e.b() || (aVar = (l20.a) c14.f50683f.getValue(c14, mVarArr[0])) == null) {
            return;
        }
        aVar.a();
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(c1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = n3.f57609a;
        new ij.b("connection_journey.prerequisites.wifi", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }
}
