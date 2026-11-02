package com.dyson.mobile.android.support.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import bt0.a;
import bt0.b;
import bt0.d;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e71.j;
import e71.n;
import pf0.c;
import rf0.i0;
import vx0.f;
import w81.d;
import we1.a;
import zs0.e;
/* loaded from: classes3.dex */
public class ContactDysonActivity extends d {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f16858p = 0;

    /* renamed from: l  reason: collision with root package name */
    public LocalisationKey f16859l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f16860m;

    /* renamed from: n  reason: collision with root package name */
    public b f16861n;

    /* renamed from: o  reason: collision with root package name */
    public c f16862o;

    public static Intent f1(e eVar, int i13, boolean z13, LocalisationKey localisationKey, LocalisationKey localisationKey2, boolean z14) {
        Intent intent = new Intent(eVar, ContactDysonActivity.class);
        intent.putExtra("extraTheme", i13);
        intent.putExtra("showNetwork", z13);
        intent.putExtra("bodyCopyKey", localisationKey);
        intent.putExtra("mTitleKey", localisationKey2);
        intent.putExtra("EXTRA_IS_SHOW_DIALOG", z14);
        return intent;
    }

    @Override // bt0.d
    public final a d1() {
        return this.f16861n;
    }

    @Override // bt0.d, f.g, android.app.Activity
    public final void onBackPressed() {
        if (this.f16860m) {
            setResult(-1);
        }
        finish();
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16862o = n.f26184s.a();
        Intent intent = getIntent();
        we1.a.f85708c.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Use the newInstance method";
        a13.a("extraTheme", "showNetwork", "bodyCopyKey", "mTitleKey", "EXTRA_IS_SHOW_DIALOG");
        if (bundle == null) {
            int i13 = intent.getIntExtra("extraTheme", 2132083505) == 2132083505 ? 0 : 1;
            this.f16859l = (LocalisationKey) c7.c.a(intent, "mTitleKey", LocalisationKey.class);
            this.f16860m = intent.getBooleanExtra("EXTRA_IS_SHOW_DIALOG", false);
            w81.d.f85442h.getClass();
            e1(d.a.a(i13, intent.getBooleanExtra("showNetwork", false), (LocalisationKey) c7.c.a(intent, "bodyCopyKey", LocalisationKey.class)));
        }
        b bVar = new b();
        this.f16861n = bVar;
        bVar.l(this.f16862o.d(this.f16859l));
    }

    @Override // bt0.d, l.b
    public final boolean onSupportNavigateUp() {
        if (!this.f16860m) {
            onBackPressed();
            return true;
        }
        new j();
        c cVar = this.f16862o;
        f fVar = new f(this, 2);
        cVar.getClass();
        e.a a13 = new zs0.e(this).a();
        a13.f93107a = cVar.d(i0.V1);
        a13.f93108b = cVar.d(i0.W1);
        a13.f93110f = true;
        a13.c(cVar.d(i0.P8), fVar);
        a13.b(cVar.d(i0.Q8), null);
        a13.d();
        return true;
    }
}
